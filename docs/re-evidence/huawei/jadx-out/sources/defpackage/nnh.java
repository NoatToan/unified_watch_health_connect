package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class nnh {
    public static int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            nox.a("CloudSettings-Util", "paseInt error " + e.getClass().getSimpleName(), true);
            return -1;
        }
    }
}
