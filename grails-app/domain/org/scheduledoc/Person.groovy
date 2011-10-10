package org.scheduledoc

class Person {
	String lastName
	String firstName
	String email

    static constraints = {
		lastName(size:2..50, blank:false)
		firstName(size:2..50, blank:false)
		email(email:true, nullable:true)
    }
}
