package bk;

/* JADX INFO: loaded from: classes7.dex */
public class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f18443e = l.CHANNEL_RESPONSE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ak.l f18446d;

    public i(byte[] bArr) {
        super(bArr);
        this.f18402a = bArr;
        this.f18444b = (int) ak.k.e(1, 1, bArr);
        int iE = (int) ak.k.e(2, 1, bArr);
        this.f18445c = iE;
        ak.l lVar = ak.l.UNKNOWN;
        int i14 = 0;
        while (true) {
            ak.l[] lVarArr = ak.l.f3560e;
            if (i14 >= lVarArr.length) {
                break;
            }
            ak.l lVar2 = lVarArr[i14];
            if (iE == lVar2.f3562a) {
                lVar = lVar2;
                break;
            }
            i14++;
        }
        this.f18446d = lVar;
    }

    @Override // bk.b
    public final l h() {
        return f18443e;
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  Response to=" + ak.k.a(this.f18444b) + "\n  code=" + this.f18446d + " (" + ak.k.a(this.f18445c) + ")";
    }

    public i(dk.a aVar) {
        this(b.g(f18443e, aVar));
    }
}
