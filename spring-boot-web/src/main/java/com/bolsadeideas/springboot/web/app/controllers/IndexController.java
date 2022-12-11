package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	
	@RequestMapping(value = {"/","/index","/home",""}, method = RequestMethod.GET)
	
	public String index(Model model) {
		model.addAttribute("titulo","Hola Spring Framework con Model");
				
		return "index";
	}
	
	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Carlos");
		usuario.setApellido("Ramos");
		usuario.setEmail("carlosramos@hotmail.com");
		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuarios ");
		//Esta es una forma de meter usuarios a lista la otra está abajo
		/*List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Luis","Garcia","luisgarcia@gmail"));
		usuarios.add(new Usuario("John","Sistiaga","jon@gmail.com"));
		usuarios.add(new Usuario("JIhn","Ramos","jIn@gmail.com"));
*/
		
		List<Usuario> usuarios = Arrays.asList(new Usuario("Luis","Garcia","luisgarcia@gmail"),
				new Usuario("John","Sistiaga","jon@gmail.com"),
				new Usuario("JIhn","Ramos","jIn@gmail.com"),
				new Usuario("Carlos","Ramos","crlo@mslsl.com"));
		//model.addAttribute("usuarios", usuarios);
		return "listar";
	}
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("john","Arechalde","joh@gmai.com"),
				new Usuario("Jcarlos","Rodriguez","jcarlos@gmai.com"));
		return usuarios;
		
	}
	
	
	
	

}
