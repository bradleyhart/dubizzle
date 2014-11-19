package org.fazz.arithmetic

import geb.spock.GebSpec

class DubizzleShould extends GebSpec {

    def "get 2 bed apartments in marina"(){
        given:
        go "http://dubai.dubizzle.com/property-for-rent/residential/apartmentflat/"

        when:

        $("#search-widget-form").bedrooms__gte = 2
        $("#search-widget-form").places__id__in = 63
        $("#search-widget-form").find(type: "submit").click()

        $("#sort-form").sort_by = "Price Lowest to Highest"
        $("#sort-form").find(type: "submit").click()

        then:
        def apartments = $(".list-item-wrapper")
        apartments.size() > 1

        /**
         * This is all I can automate as I have no control over the data that in the database.
         *
         * Normally I would setup the data first in the test so that I can have clear an predictable expectations.
         *
         * Also the markup is not very testable, it is best for the testers, devs, and UI people all to work
         * together to ensure clean and testable markup.
         */
    }

}