package com.project.services;

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;


	@Controller
	//@RequestMapping("/profesor")
	public class ProfesorController {
		
		@Autowired
		private ProfesorService profesorService;
		
		@RequestMapping(value="/profesor/list", method = RequestMethod.GET)
		public String listado(Model model) {
			
			model.addAttribute("profesores", profesorService.getProfesores());
			return "list";
		}
		
		
		@RequestMapping(value="/profesor/detail/{idProf}", method = RequestMethod.GET)
		public String detalle(@PathVariable("idProf") int id, Model model) {
			
			model.addAttribute("profesor", profesorService.getById(id));
			
			return "detail";
		}
		

		@RequestMapping(value="/closed", method = RequestMethod.GET)
		public String closed( Model model) {
			
			
			return "hey";
		}

		public void setProfesorService(ProfesorService profesorService) {
			this.profesorService = profesorService;
		}
		

}
