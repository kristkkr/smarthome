package com.krossholm.smarthome

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun smarthome(model: Model): String {
        val title = "smarthome"
        model["title"] = "$title zzz"
        model["info"] = "Some useful info will appear here..."
        return title
    }

}