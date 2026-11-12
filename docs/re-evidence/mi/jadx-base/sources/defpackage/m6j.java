package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class m6j extends qhh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k6j f25812b = null;

    public k6j b() {
        return this.f25812b;
    }

    public int c(byte[] bArr) {
        if (bArr == null) {
            voe.d("RCInputCtrlPacket", "Invalid packet");
            return -1;
        }
        int length = bArr.length - 3;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 3, bArr2, 0, length);
        k6j k6jVar = new k6j();
        this.f25812b = k6jVar;
        if (k6jVar.b(bArr2) < 0) {
            voe.b("RCInputCtrlPacket", "Parse Ir data failed.");
            return -1;
        }
        voe.a("RCInputCtrlPacket", "Parse Ir data success");
        return 0;
    }
}
