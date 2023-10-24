package br.com.aula.projetoestacionamento.PaginaWeb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class ClienteHome {
    @GetMapping("/imc/{peso}/{altura}")
    @ResponseBody
    public String imc(@PathVariable double peso, @PathVariable double altura) {
        double imc = peso / (altura * altura);
        return "Seu IMC é: " + String.format("%.2f", imc);
    }

    @GetMapping("/texto/{texto}")
    @ResponseBody
    public String texto(@PathVariable String texto) {
        return "O texto que você digitou é: " + texto;
    }

    @GetMapping("/nota/{nota1}/{nota2}")
    @ResponseBody
    public String nota(@PathVariable double nota1, @PathVariable double nota2) {
        double media = (nota1 + nota2) / 2;
        return "Sua média é: " + media;
    }
}
