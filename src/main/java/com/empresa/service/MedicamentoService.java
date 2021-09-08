package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract Medicamento insertaActualiza(Medicamento obj);
	public abstract List<Medicamento> listaMedicamento();
	public Optional<Medicamento> buscarPorId(int idMedicamento);
	public abstract void eliminarPorId(int idMedicamento);
	public abstract List<Medicamento> listaMedicamentoPorNombre(String nombre);
	public abstract List<Medicamento> listaMedicamentoPorStock(int stock);

}
