package bk;

/* JADX INFO: loaded from: classes7.dex */
public class g extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f18438d = l.CHANNEL_EVENT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ak.e f18440c;

    public g(byte[] bArr) {
        super(bArr);
        int iE = (int) ak.k.e(2, 1, this.f18402a);
        this.f18439b = iE;
        ak.e eVar = ak.e.UNKNOWN;
        int i14 = 0;
        while (true) {
            ak.e[] eVarArr = ak.e.f3525m;
            if (i14 >= eVarArr.length) {
                break;
            }
            ak.e eVar2 = eVarArr[i14];
            if (iE == eVar2.f3527a) {
                eVar = eVar2;
                break;
            }
            i14++;
        }
        this.f18440c = eVar;
    }

    @Override // bk.b
    public final l h() {
        return f18438d;
    }

    @Override // bk.b, ak.a
    public final String toString() {
        return i() + "\n  Event Code=" + this.f18440c + " (" + ak.k.a(this.f18439b) + ")";
    }

    public g(dk.a aVar) {
        this(b.g(f18438d, aVar));
    }
}
