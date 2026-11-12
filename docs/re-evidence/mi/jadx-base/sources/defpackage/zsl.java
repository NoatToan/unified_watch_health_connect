package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class zsl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f41633a = "SendKeyIDList";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int[] f41634b = new int[2];

    public static byte a(int i) {
        for (byte b2 = 0; b2 < 2; b2 = (byte) (b2 + 1)) {
            if (f41634b[b2] == i) {
                return (byte) (b2 + 1);
            }
        }
        return (byte) -1;
    }

    public static boolean b(byte b2, int i) {
        if (b2 > 2 || b2 <= 0) {
            voe.a(f41633a, "index out of range.");
            return false;
        }
        f41634b[b2 - 1] = i;
        return true;
    }
}
