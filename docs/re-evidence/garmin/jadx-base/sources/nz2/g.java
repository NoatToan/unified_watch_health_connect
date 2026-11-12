package nz2;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f128425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f128426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f128427c;

    public final Object clone() {
        g gVar = (g) super.clone();
        byte[] bArr = gVar.f128425a;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            gVar.f128425a = bArr2;
        }
        byte[] bArr3 = gVar.f128426b;
        if (bArr3 != null) {
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            gVar.f128426b = bArr4;
        }
        byte[] bArr5 = gVar.f128427c;
        if (bArr5 != null) {
            int length3 = bArr5.length;
            byte[] bArr6 = new byte[length3];
            System.arraycopy(bArr5, 0, bArr6, 0, length3);
            gVar.f128427c = bArr6;
        }
        return gVar;
    }
}
