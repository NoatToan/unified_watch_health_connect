package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class fpq {
    public static dpq a(byte[] bArr) {
        gpq gpqVar = new gpq();
        int iE = gpqVar.e(bArr);
        if (iE < 0) {
            jpe.a("VersionHandler", "parse version packet error.");
            return null;
        }
        if (((byte) iE) != 2) {
            jpe.a("VersionHandler", "invalid code");
            return null;
        }
        jpe.a("VersionHandler", "to process version response");
        dpq dpqVarB = gpqVar.b();
        jpe.a("VersionHandler", "version:0x" + Integer.toHexString(dpqVarB.d().b()) + " response:" + ((int) dpqVarB.b()));
        return dpqVarB;
    }
}
