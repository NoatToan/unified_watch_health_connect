package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class i6j {
    public static atl a(byte[] bArr) {
        atl atlVar = new atl();
        try {
            int iF = atlVar.f(bArr);
            if (iF < 0) {
                jpe.a("RCHandler", "parse play control packet error.");
                return null;
            }
            byte b2 = (byte) iF;
            if (b2 == 1) {
                jpe.a("RCHandler", "does not support send");
                return null;
            }
            if (b2 != 2) {
                jpe.k("RCHandler", "invalid code");
                return null;
            }
            jpe.a("RCHandler", "to process response");
            return atlVar;
        } catch (RuntimeException e) {
            jpe.b("RCHandler", "exception:" + e);
            return null;
        }
    }
}
