package pe.com.tss.runakuna.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import pe.com.tss.runakuna.view.model.*;
import pe.com.tss.runakuna.service.PermisoEmpleadoService;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/autocomplete")
public class AutocompleteController extends BaseController{
	
	@Autowired
	PermisoEmpleadoService permisoEmpleadoService;
	
    @RequestMapping(value = "/autocompleteEmpleado", method = RequestMethod.GET)
	public @ResponseBody List<PermisoEmpleadoFilterViewModel> autocompleteEmpleado(@RequestParam(name="search") String search){
		List<PermisoEmpleadoFilterViewModel> dto = permisoEmpleadoService.autocompleteEmpleado(search);
		return dto;
	}
    
    @RequestMapping(value = "/autocompleteEmpleadoConJefe", method = RequestMethod.GET)
	public @ResponseBody List<PermisoEmpleadoFilterViewModel> autocompleteEmpleadoConJefe(@RequestParam(name="search") String search, @RequestParam(name="idJefe") Long idJefe){
		List<PermisoEmpleadoFilterViewModel> dto = permisoEmpleadoService.autocompleteEmpleadoConJefe(search,idJefe	);
		return dto;
	}
    
    @RequestMapping(value = "/autocompleteJefe", method = RequestMethod.GET)
	public @ResponseBody List<PermisoEmpleadoFilterViewModel> autocompleteJefe(@RequestParam(name="search") String search){
		List<PermisoEmpleadoFilterViewModel> dto = permisoEmpleadoService.autocompleteJefe(search);
		return dto;
	}
    
}
