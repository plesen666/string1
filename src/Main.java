//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( " Упражнение 1 .");
        String firstName = " Ivanov ";
        String middleName = " Ivan ";
        String lastName = " Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println(fullName );
        System.out.println( " Упражнение 2 .");
        System.out.println( " Данные Ф. И. О. сотрудника для заполнения отчета —" + fullName.toUpperCase());
        System.out.println( " Упражнение 3 .");
        String fullName2= " Иванов Семён Семёнович";
        fullName2=fullName2.replace( " ё" , " е");
        System.out.println(fullName2 );


        }
    }
