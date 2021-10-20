package es.studium.rellenartabla3;

import java.util.Scanner;

public class rellenartabla3
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int tabla3[]=new int[4];
		for (int i=0;i<=3;i++)
		{
			tabla3[i]=0;
		}
		for (int i=0;i<=3;i++)
		{

			System.out.println("Indicar el valor de la tabla en la posición "+i);
			tabla3[i] = teclado.nextInt();
		}
		for (int i=3;i>=0;i--)
		{
			System.out.println(tabla3[i]);
		}
		teclado.close();
	}

}
