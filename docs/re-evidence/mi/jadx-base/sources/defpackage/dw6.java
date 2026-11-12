package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class dw6 {
    public static aw6 a(ee eeVar) {
        if (eeVar.equals(hgg.c)) {
            return new h7l();
        }
        if (eeVar.equals(hgg.e)) {
            return new j7l();
        }
        if (eeVar.equals(hgg.m)) {
            return new l7l(128);
        }
        if (eeVar.equals(hgg.n)) {
            return new l7l(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + eeVar);
    }

    public static String b(ee eeVar) {
        if (eeVar.equals(hgg.c)) {
            return "SHA256";
        }
        if (eeVar.equals(hgg.e)) {
            return "SHA512";
        }
        if (eeVar.equals(hgg.m)) {
            return "SHAKE128";
        }
        if (eeVar.equals(hgg.n)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + eeVar);
    }
}
