//      Creeaza o aplicatie care sa simuleze o scoala
//        a. Creeaza o clasa Person, care sa fie abstracta.
//             i. atribute
//                1. firstName
//                2. lastName
//            ii. metode: introduce() (care sa fie metoda abstracta)
//        b. Creeaza o clasa Teacher, care sa extinda Person
//             i. atribute
//                1. department
//                2. subject (adica ce preda profesorul)
//            ii.  metode:
//                1. introduce()
//                2. implementeaza metoda abstracta din subclasa si afiseaza un mesaj.
//                      a. ex: “I am John Decker, I teach Math and I am a teacher”
//        c. Creeaza o clasa Student, care sa extinda Person
//             i. atribute
//                1. groupClass (adica clasa in care este studentul)
//            ii. metode:
//                1. introduce()
//                2. implementeaza metoda abstracta din subclasa si afiseaza un mesaj.
//                      a. ex: “I am Dave Brown, I am in 12A class and I am a student”

public class School {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("John", "Decker", "teacher", "Math");
        Student student = new Student("Dave", "Brown", "12A");

        teacher.introduce();
        student.introduce();
    }

}
