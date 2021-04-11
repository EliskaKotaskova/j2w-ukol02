package cz.czechitas.java2webapps.ukol2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class CitatAPozadiController {
    private final Random random;

    public CitatAPozadiController() {
        random = new Random();
    }

    @GetMapping("/")
    public ModelAndView novyCitat() {
        int nahodneCislo = random.nextInt(5) + 1;
        ModelAndView result = new ModelAndView("citat");
        List<String> seznamObrazku = Arrays.asList("https://source.unsplash.com/RFHFV7lVQBY/1600x900", "https://source.unsplash.com/-f0YLss50Bs/1600x900","https://source.unsplash.com/jFCViYFYcus/1600x900","https://source.unsplash.com/1Z2niiBPg5A/1600x900", "https://source.unsplash.com/mawU2PoJWfU/1600x900");
        String adresaObrazku = seznamObrazku.get(nahodneCislo-1);
        List<String> seznamCitatu= Arrays.asList("Debugging /de·bugh·ing/ (verb): The Classic Mystery Game where you are the detective, the victim, and the murderer.","A user interface is like a joke. If you have to explain it, it's not that good.","To replace programmers with robots, clients will have to accurately describe what they want. We're safe.","I have a joke on programming but it only works on my computer.", "Programmer (noun.): A machine that turns coffee into code.");
        int nahodneCisloDruhe = random.nextInt(5) + 1;
        String nahodnyCitat = seznamCitatu.get(nahodneCisloDruhe-1);
        result.addObject("nahodnyCitat", nahodnyCitat);
        result.addObject("adresaObrazku", adresaObrazku);
        return result;
    }
}
