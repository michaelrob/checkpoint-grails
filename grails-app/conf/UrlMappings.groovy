class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

		"/validate" (controller: "xmlValidator", action: "index")
        "/recon" (controller: "recon", action: "index")
	}
}
