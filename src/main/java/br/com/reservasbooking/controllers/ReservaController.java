package br.com.reservasbooking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.reservasbooking.model.Reserva;

@Controller
public class ReservaController {
	
	@GetMapping("/novaReserva")
	public ModelAndView InsertReservas() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Reserva/novaReserva");
		mv.addObject("reserva", new Reserva());
		return mv;
	}
	
}




