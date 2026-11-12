package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class xrr extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f39401b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;
    public final byte[] f;

    public xrr(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f39400a = i;
        this.f39401b = vj1.e(bArr);
        this.c = vj1.e(bArr2);
        this.d = vj1.e(bArr3);
        this.e = vj1.e(bArr4);
        this.f = vj1.e(bArr5);
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        jdVar.a(new wd(0L));
        jd jdVar2 = new jd();
        jdVar2.a(new wd(this.f39400a));
        jdVar2.a(new qg5(this.f39401b));
        jdVar2.a(new qg5(this.c));
        jdVar2.a(new qg5(this.d));
        jdVar2.a(new qg5(this.e));
        jdVar.a(new yg5(jdVar2));
        jdVar.a(new ih5(true, 0, new qg5(this.f)));
        return new yg5(jdVar);
    }
}
