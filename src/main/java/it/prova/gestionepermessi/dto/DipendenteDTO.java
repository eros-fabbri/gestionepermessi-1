package it.prova.gestionepermessi.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import it.prova.gestionepermessi.model.Dipendente;
import it.prova.gestionepermessi.model.Sesso;

public class DipendenteDTO {

	private Long id;

	@NotBlank
	@Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri")
	private String nome;
	@NotBlank
	@Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri")
	private String cognome;
	@NotBlank
	@Size(min = 16, max = 16, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri")
	private String codFis;
	@NotBlank(message = "{email.notblank}")
	private String email;
	@NotNull(message = "{dataNascita.notnull}")
	private Date dataNascita;
	@NotNull(message = "{dataAssunzione.notnull}")
	private Date dataAssunzione;

	private Date dataDimissioni;

	private Long[] richiestePermessiIds;

	@NotNull(message = "{dataAssunzione.notnull}")
	private Sesso sesso;
	@NotNull(message = "{utente.notnull}")
	private UtenteDTO utenteDTO;

	public DipendenteDTO() {
	}

	public DipendenteDTO(Long id) {
		super();
		this.id = id;
	}

	public DipendenteDTO(Long id,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String nome,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String cognome,
			@NotBlank @Size(min = 16, max = 16, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String codFis,
			@NotBlank(message = "{email.notblank}") String email,
			@NotNull(message = "{dataNascita.notnull}") Date dataNascita,
			@NotNull(message = "{dataAssunzione.notnull}") Date dataAssunzione, Date dataDimissioni,
			Long[] richiestePermessi, @NotNull(message = "{dataAssunzione.notnull}") Sesso sesso,
			@NotNull(message = "{utente.notnull}") UtenteDTO utenteDTO) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codFis = codFis;
		this.email = email;
		this.dataNascita = dataNascita;
		this.dataAssunzione = dataAssunzione;
		this.dataDimissioni = dataDimissioni;
		this.sesso = sesso;
		this.utenteDTO = utenteDTO;
	}

	public DipendenteDTO(
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String nome,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String cognome,
			@NotBlank @Size(min = 16, max = 16, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String codFis,
			@NotBlank(message = "{email.notblank}") String email,
			@NotNull(message = "{dataNascita.notnull}") Date dataNascita,
			@NotNull(message = "{dataAssunzione.notnull}") Sesso sesso) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codFis = codFis;
		this.email = email;
		this.dataNascita = dataNascita;
		this.sesso = sesso;
	}

	public DipendenteDTO(Long id,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String nome,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String cognome,
			@NotBlank @Size(min = 16, max = 16, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String codFis,
			@NotBlank(message = "{email.notblank}") String email,
			@NotNull(message = "{dataNascita.notnull}") Date dataNascita,
			@NotNull(message = "{dataAssunzione.notnull}") Date dataAssunzione, Date dataDimissioni,
			@NotNull(message = "{dataAssunzione.notnull}") Sesso sesso) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codFis = codFis;
		this.email = email;
		this.dataNascita = dataNascita;
		this.dataAssunzione = dataAssunzione;
		this.dataDimissioni = dataDimissioni;
		this.sesso = sesso;
	}

	public DipendenteDTO(Long id,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String nome,
			@NotBlank @Size(min = 2, max = 15, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String cognome,
			@NotBlank @Size(min = 16, max = 16, message = "Il valore inserito '${validatedValue}' deve essere lungo tra {min} e {max} caratteri") String codFis,
			@NotBlank(message = "{email.notblank}") String email,
			@NotNull(message = "{dataNascita.notnull}") Date dataNascita,
			@NotNull(message = "{dataAssunzione.notnull}") Date dataAssunzione, Date dataDimissioni,
			@NotNull(message = "{dataAssunzione.notnull}") Sesso sesso,
			@NotNull(message = "{utente.notnull}") UtenteDTO utenteDTO) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codFis = codFis;
		this.email = email;
		this.dataNascita = dataNascita;
		this.dataAssunzione = dataAssunzione;
		this.dataDimissioni = dataDimissioni;
		this.sesso = sesso;
		this.utenteDTO = utenteDTO;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodFis() {
		return codFis;
	}

	public void setCodFis(String codFis) {
		this.codFis = codFis;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

	public Date getDataDimissioni() {
		return dataDimissioni;
	}

	public void setDataDimissioni(Date dataDimissioni) {
		this.dataDimissioni = dataDimissioni;
	}

	public Long[] getRichiestePermessiIds() {
		return richiestePermessiIds;
	}

	public void setRichiestePermessiIds(Long[] richiestePermessiIds) {
		this.richiestePermessiIds = richiestePermessiIds;
	}

	public Sesso getSesso() {
		return sesso;
	}

	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}

	public UtenteDTO getUtenteDTO() {
		return utenteDTO;
	}

	public void setUtenteDTO(UtenteDTO utenteDTO) {
		this.utenteDTO = utenteDTO;
	}

	public Dipendente buildDipendenteModel() {
		return new Dipendente(this.id, this.nome, this.cognome, this.codFis, this.email, this.dataNascita,
				this.dataAssunzione, this.dataDimissioni, this.sesso);
	}

	public static DipendenteDTO buildDipendenteDTOFromModel(Dipendente dipendenteModel) {
		DipendenteDTO result = new DipendenteDTO(dipendenteModel.getId(), dipendenteModel.getNome(),
				dipendenteModel.getCognome(), dipendenteModel.getCodFis(), dipendenteModel.getEmail(),
				dipendenteModel.getDataNascita(), dipendenteModel.getDataAssunzione(),
				dipendenteModel.getDataDimissioni(), dipendenteModel.getSesso());

		if (!dipendenteModel.getRichiestePermessi().isEmpty())
			result.richiestePermessiIds = dipendenteModel.getRichiestePermessi().stream().map(r -> r.getId())
					.collect(Collectors.toList()).toArray(new Long[] {});

		return result;

	}

	public static List<DipendenteDTO> createDipendenteDTOListFromModelList(List<Dipendente> modelListInput) {
		return modelListInput.stream().map(dipendenteEntity -> {
			return DipendenteDTO.buildDipendenteDTOFromModel(dipendenteEntity);
		}).collect(Collectors.toList());
	}

}
