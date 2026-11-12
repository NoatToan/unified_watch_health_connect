package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class ub4 {
    public static int a(int i) {
        if (i <= 20) {
            return 5;
        }
        if (i <= 40) {
            return 4;
        }
        if (i <= 60) {
            return 3;
        }
        return i <= 80 ? 2 : 1;
    }
}
