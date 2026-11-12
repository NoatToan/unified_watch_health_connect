package bk;

/* JADX INFO: loaded from: classes7.dex */
public class j extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f18447d = l.CHANNEL_STATUS;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.d f18448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ak.c f18449c;

    public j(byte[] bArr) {
        super(bArr);
        int i14 = (this.f18402a[1] & (-16)) >> 4;
        ak.d dVar = ak.d.UNKNOWN;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            ak.d[] dVarArr = ak.d.f3511d;
            if (i16 >= dVarArr.length) {
                break;
            }
            ak.d dVar2 = dVarArr[i16];
            if (i14 == dVar2.f3513a) {
                dVar = dVar2;
                break;
            }
            i16++;
        }
        dVar.f3513a = i14;
        this.f18448b = dVar;
        int i17 = this.f18402a[1] & 3;
        ak.c cVar = ak.c.INVALID;
        while (true) {
            ak.c[] cVarArr = ak.c.f3506g;
            if (i15 >= cVarArr.length) {
                break;
            }
            ak.c cVar2 = cVarArr[i15];
            if (i17 == cVar2.f3508a) {
                cVar = cVar2;
                break;
            }
            i15++;
        }
        this.f18449c = cVar;
    }

    @Override // bk.b
    public final l h() {
        return f18447d;
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  Type=" + this.f18448b + "\n  State=" + this.f18449c;
    }

    public j(dk.a aVar) {
        this(b.g(f18447d, aVar));
    }
}
