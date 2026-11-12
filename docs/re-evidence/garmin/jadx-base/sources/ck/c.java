package ck;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f27762c = k.ASSIGN_CHANNEL;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.f f27764b;

    public c(byte[] bArr) {
        this.f27763a = (int) ak.k.e(1, 1, bArr);
        if (bArr.length > 3) {
            this.f27764b = new ak.f((int) ak.k.e(3, 1, bArr));
        } else {
            this.f27764b = new ak.f();
        }
    }

    @Override // ck.b
    public final byte[] f() {
        byte[] bArr = new byte[4];
        ak.k.g(0, 0, bArr);
        ak.k.g(this.f27763a, 1, bArr);
        ak.k.g(0, 2, bArr);
        ak.f fVar = this.f27764b;
        byte b14 = fVar.f3528a ? (byte) 1 : (byte) 0;
        if (fVar.f3529b) {
            b14 = (byte) (b14 + 4);
        }
        ak.k.g(b14, 3, bArr);
        return bArr;
    }

    @Override // ck.b
    public final k g() {
        return f27762c;
    }

    @Override // ck.b, ak.a
    public final String toString() {
        int i14;
        StringBuilder sb3 = new StringBuilder(h());
        sb3.append("\n  Channel Type=");
        ak.d dVar = ak.d.UNKNOWN;
        int i15 = 0;
        while (true) {
            ak.d[] dVarArr = ak.d.f3511d;
            int length = dVarArr.length;
            i14 = this.f27763a;
            if (i15 >= length) {
                break;
            }
            ak.d dVar2 = dVarArr[i15];
            if (i14 == dVar2.f3513a) {
                dVar = dVar2;
                break;
            }
            i15++;
        }
        dVar.f3513a = i14;
        sb3.append(dVar.toString());
        sb3.append(" (");
        sb3.append(i14);
        sb3.append(")\n  ");
        sb3.append(this.f27764b);
        return sb3.toString();
    }

    public c(ak.d dVar, ak.f fVar) {
        this.f27763a = dVar.f3513a;
        this.f27764b = fVar;
    }

    public c(ak.d dVar) {
        this(dVar, new ak.f());
    }
}
