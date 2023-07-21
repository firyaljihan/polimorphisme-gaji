package polimorphisme_gaji;

public class Staf extends Pegawai {
    private static final int gajiStaf=2000000;
    private static final int bonusStaf=200000;
    
    @Override
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }

}
