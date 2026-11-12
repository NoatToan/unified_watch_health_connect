package nz2;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f128456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f128459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f128460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f128461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f128462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f128463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f128464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f128465j;

    public k() {
        this(new a());
    }

    public final void a() {
        d dVar = this.f128464i;
        int i14 = dVar.f128392f;
        int i15 = this.f128462g;
        if (i14 > i15) {
            i14 = i15;
        }
        if (i14 == 0) {
            return;
        }
        byte[] bArr = dVar.f128389c;
        int length = bArr.length;
        int i16 = dVar.f128391e;
        if (length > i16) {
            int length2 = this.f128460e.length;
        }
        System.arraycopy(bArr, i16, this.f128460e, this.f128461f, i14);
        this.f128461f += i14;
        d dVar2 = this.f128464i;
        dVar2.f128391e += i14;
        this.f128462g -= i14;
        int i17 = dVar2.f128392f - i14;
        dVar2.f128392f = i17;
        if (i17 == 0) {
            dVar2.f128391e = 0;
        }
    }

    public k(c cVar) {
        this.f128465j = cVar;
    }
}
