Ejercicios de Recursividad

Ejercicio 1:
Escriba una definición recursiva de una función que tiene un parámetro n de tipo entero
y que devuelve el n-ésimo número de Fibonacci. Los números de Fibonacci se definen
de la siguiente manera:
F0 = 1
F1 = 1
Fi+2 = Fi + Fi+1

Ejercicio 3
Escriba una función recursiva que ordene de menor a mayor un arreglo de enteros
basándose en la siguiente idea: coloque el elemento más pequeño en la primera
ubicación, y luego ordene el resto del arreglo con una llamada recursiva.

Ejercicio 4
Escribir una función recursiva que devuelva la suma de los primeros N enteros

Ejercicio 5
Escribir un programa que encuentre la suma de los enteros positivos pares desde N
hasta 2. Chequear que si N es impar se imprima un mensaje de error.

Ejercicio 6
Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros
positivos. Si M >= N una función recursiva para MCD es
MCD = M si N =0
MCD = MCD (N, M mod N) si N <> 0
El programa le debe permitir al usuario ingresar los valores para M y N desde la
consola. Una función recursiva es entonces llamada para calcular el MCD. El programa
entonces imprime el valor para el MCD. Si el usuario ingresa un valor para M que es <
que N el programa es responsable de switchear los valores.

Ejercicio 7
Programe un método recursivo que transforme un número entero positivo a notación
binaria.

Ejercicio 8
Programe un método recursivo que transforme un número expresado en notación binaria
a un número entero.

Ejercicio 9
Programe un método recursivo que calcule la suma de un arreglo de números enteros.

Ejercicio 10
Programe un método recursivo que invierta los números de un arreglo de enteros.

Ejercicio 11
Cuál es el resultado de esta función para distintos valores de X?
Static int f(int x)
{
if (x >100)
{
return (x-10);
}
else
{
return(f(f(x+11)));
}
}

Ejercicio 12
Implemente una función recursiva que nos diga si una cadena es palíndromo.

Ejercicio 13
Diseñe e implemente un algoritmo que imprima todas las posibles descomposiciones de
un número natural como suma de números menores que él.
1= 1
2 = 1+1
3= 2 + 1
3= 1+1+1
4= 3+1
4= 2+1+1
4 = 1+1+1+1
4=2+2
4=2+1+1
4=1+1+1+1
N = (n-1) +1
N = (n-2) + 2 = (n-2) + 1 + 1