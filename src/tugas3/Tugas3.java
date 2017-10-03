package tugas3;

class NilaiMahasiswa {

    private String name;
    private int nim;
    private double quiz = 90, uts, uas, na;

    public void getNamePro() {
        System.out.println("\tNILAI MAHASISWA");
    }

    public void getSpace() {
        System.out.println();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void getName() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + " =  " + name);

        }
    }

    public void getNim() {
        for (int i = 8; i >= 1; i--) {
            System.out.println("Nim ke " + i + " = " + nim);
        }
    }

    public void setValue(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;

    }

    public void getValue() {
        System.out.println("Nilai QUIZ  =" + quiz);
        System.out.println("Nilai UTS   =" + uts);
        System.out.println("Nilai UAS   =" + uas);

    }

    public void getNilaina() {
        na = quiz * 0.2 + uts * 0.3 + uas * 0.5;
        System.out.println("Nilai Akhir =" + na);
    }

    public void getIndex() {
        if (na <= 100 && na >= 80) {
            System.out.println("index      =A");
            System.out.println("Keterangan =Sangat baik");
        }
        if (na <= 80 && na >= 68) {
            System.out.println("index       =B");
            System.out.println("Keterangan  =baik");
        }

        if (na <= 68 && na >= 56) {
            System.out.println("index       =c");
            System.out.println("Keterangan  =cukup");
        }

        if (na <= 56 && na >= 45) {
            System.out.println("index       =d");
            System.out.println("Keterangan  =kurang");
        }

        if (na <= 45 && na >= 0) {
            System.out.println("index       =E");
            System.out.println("Keterangan  =Sangat kurang");
        }

    }

}

public class Tugas3 {

    public static void main(String[] args) {
        NilaiMahasiswa NM = new NilaiMahasiswa();
        NM.getNamePro();
        NM.getSpace();
        NM.setName("Satria Ario P");
        NM.setNim(10116518);
        NM.setValue(85, 70, 73);
        NM.getName();
        NM.getNim();
        NM.getSpace();
        NM.getValue();
        NM.getSpace();
        NM.getNilaina();
        NM.getSpace();
        NM.getIndex();

    }

}
