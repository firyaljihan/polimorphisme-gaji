package polimorphisme_gaji;

public class Direktur extends Pegawai {
    private static final int gajiDir=5000000;
    private static final int tunjangan=500000;
    
    @Override
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }

}
