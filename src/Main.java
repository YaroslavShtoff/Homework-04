public class Main {
            public static void main(String[] args) {

                // Задание 4.1

                int age = 10;
                if (age >= 18) {
                    System.out.println("Поздравляем с совершеннолетием!");
                } else {
                    System.out.println(" Возраст совершеннолетия ещё не наступил, и нужно немного подождать. ");
                }

                // Задание 4.2
                int Age1 = 25;
                boolean goToSchool = Age1 >= 7 && Age1 <= 18;
                if (goToSchool) {
                    System.out.println("Ты ходишь в школу");

                } else if (Age1 >= 18 && Age1 <= 24) {
                    System.out.println("Ты ходишь в университет");

                } else {
                    System.out.println(" Ты ходишь на работу ");
                }

                // Задание 4.3
                int totalCapacity = 102;
                int seatPlace = 60;
                int occupiedSeats = 60;
                if (occupiedSeats <= 60) {
                    System.out.println(" Есть сидячие места ");
                } else if (occupiedSeats > 60 && occupiedSeats <= 102) {
                    System.out.println(" Есть стоячие места ");
                } else {
                    System.out.println(" Вагон забит ");
                }


                // Задание 4.4
                int age1 = 15;
                if (age1 >= 2 && age1 <= 6) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
                } else if (age1 >= 7 && age1 < 18) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
                } else if (age >= 18 && age < 24) {
                    System.out.println("Если возраст человека равен " + age + " то его место в университете");
                } else {
                    System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
                }

                // Задание 4.5
                int childAge = 15;
                if (childAge < 5) {
                    System.out.println("Ребенку " + childAge + " лет. Он не может кататься на атракционе");
                } else if (childAge >= 5 && childAge < 14) {
                    System.out.println("Ребенку " + childAge + " лет. Он может кататься только в сопровождении взрослого. " +
                            "Если взрослого нет, то кататься нельзя");
                } else {
                    System.out.println("Ребенку " + childAge + " лет. Он может кататься без сопровождения взрослых");
                }

                // Задание 4.6
                int one = 1;
                int two = 2;
                int three = 3;
                if (one > two && one > three) {
                    System.out.println(one);
                } else if (two > one && two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);


                }
            }
        }

