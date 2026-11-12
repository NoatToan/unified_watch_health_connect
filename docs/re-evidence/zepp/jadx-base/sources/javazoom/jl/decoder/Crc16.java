package javazoom.jl.decoder;

/* JADX INFO: loaded from: classes23.dex */
public final class Crc16 {
    private static short b = -32763;
    private short a = -1;

    public void add_bits(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        do {
            short s = this.a;
            if (((Short.MIN_VALUE & s) == 0) ^ ((i & i3) == 0)) {
                short s2 = (short) (s << 1);
                this.a = s2;
                this.a = (short) (s2 ^ b);
            } else {
                this.a = (short) (s << 1);
            }
            i3 >>>= 1;
        } while (i3 != 0);
    }

    public short checksum() {
        short s = this.a;
        this.a = (short) -1;
        return s;
    }
}
