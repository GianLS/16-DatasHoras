package br.com.glandata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate dataAgora = LocalDate.now();

		DateTimeFormatter formataData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formataData.format(dataAgora));

		LocalDateTime dataHoraAgora = LocalDateTime.now();
		DateTimeFormatter formataDataHora = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy '?s' HH:mm:ss.ms");
		System.out.println(formataDataHora.format(dataHoraAgora));
	}
}
