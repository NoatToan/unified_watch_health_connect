package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class l6j {
    public static int a(byte[] bArr) {
        m6j m6jVar = new m6j();
        if (m6jVar.c(bArr) < 0) {
            jpe.b("RCInputCtrlHandler", "Parse RC input control packet error.");
            return -1;
        }
        m6jVar.b();
        return 0;
    }
}
