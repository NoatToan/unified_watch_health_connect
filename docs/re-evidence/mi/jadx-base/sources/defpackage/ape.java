package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ape {
    public static String a(int i) {
        if (i == 2) {
            return "V";
        }
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i == 5) {
            return "W";
        }
        if (i == 6) {
            return "E";
        }
        if (i < 2) {
            return "V-" + (2 - i);
        }
        return "E+" + (i - 6);
    }
}
