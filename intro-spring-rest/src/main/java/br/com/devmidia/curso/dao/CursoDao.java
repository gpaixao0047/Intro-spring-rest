package br.com.devmidia.curso.dao;

import java.util.List;

import br.com.devmidia.curso.domain.Curso;

public interface CursoDao {
	void save(Curso curso);
	
	void update (Curso curso);
	
	void delete(Long id);
	
	Curso findById(Long id);
	
	List<Curso> findAll();
}
