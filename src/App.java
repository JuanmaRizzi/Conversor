import java.text.DecimalFormat;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) throws Exception {

		Object[] options = { "Convertir de Pesos a Otras Divisas", "Convertir Otras Divisas a Pesos", "Salir" };
		int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

		if (elige == 2) {
			JOptionPane.showMessageDialog(null, "Programa Cerrado");
			System.exit(0);
		}

		if (elige == 0) {
			DecimalFormat formatearDivisas = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Pesos a Euros", "Pesos a Dolares", "Pesos a Yen", "Pesos a Reales",
						"Pesos a Won" };
				String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opcion:", "Conversor de Monedas",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad de Pesos a Convertir:");
				double pesos = 0.00;
				try {
					pesos = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor No Valido");
				}

				if (cambio.equals("Pesos a Euros")) {
					double euros = pesos / 208.86;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(euros) + " Euros.");
				} else if (cambio.equals("Pesos a Dolares")) {
					double dolares = pesos / 196.8;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(dolares) + " Dolares.");
				} else if (cambio.equals("Pesos a Yen")) {
					double yenes = pesos / 1.44;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(yenes) + " Yens.");
				} else if (cambio.equals("Pesos a Reales")) {
					double reales = pesos / 37.84;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(reales) + " Reales.");
				} else if (cambio.equals("Pesos a Won")) {
					double wons = pesos / 0.15;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(wons) + " Wons.");
				}
				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando el software???", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		}

		if (elige == 1) {
			DecimalFormat formatearDivisas = new DecimalFormat("#.##");
			boolean continuarPrograma = true;
			while (continuarPrograma) {
				String[] opciones = { "Euros", "Dolares", "Yen", "Reales",
						" Won" };
				String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opcion:", "Conversor a Pesos",
						JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
				String input = JOptionPane.showInputDialog(null, "Ingrese la Cantidad de Pesos a Convertir:");
				double pesos = 0.00;
				try {
					pesos = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Valor No Valido");
				}

				if (cambio.equals("Pesos a Euros")) {
					double euros = pesos / 208.86;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(euros) + " Euros.");
				} else if (cambio.equals("Pesos a Dolares")) {
					double dolares = pesos / 196.8;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(dolares) + " Dolares.");
				} else if (cambio.equals("Pesos a Yen")) {
					double yenes = pesos / 1.44;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(yenes) + " Yens.");
				} else if (cambio.equals("Pesos a Reales")) {
					double reales = pesos / 37.84;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(reales) + " Reales.");
				} else if (cambio.equals("Pesos a Won")) {
					double wons = pesos / 0.15;
					JOptionPane.showMessageDialog(null,
							pesos + " pesos argentinos son: " + formatearDivisas.format(wons) + " Wons.");
				}
				int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando el software???", "confirmar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
					continuarPrograma = false;
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
			}
		}
	}

}
