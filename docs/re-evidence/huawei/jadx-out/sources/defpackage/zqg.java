package defpackage;

/* JADX INFO: loaded from: classes20.dex */
public class zqg {
    public static boolean a(byte b2, int i) {
        return (((long) b2) & (1 << i)) != 0;
    }

    public static byte c(byte b2, int i) {
        return (byte) (b2 & (~(1 << i)));
    }

    public static byte e(byte b2, int i) {
        return (byte) (b2 | (1 << i));
    }
}
