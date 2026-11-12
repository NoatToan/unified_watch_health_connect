package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k34 extends znf implements obm {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class[] f23375k;
    public String[] l;
    public Class[] m;

    public k34(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i, str, cls);
        this.f23375k = clsArr;
        this.l = strArr;
        this.m = clsArr2;
    }

    public Class[] m() {
        if (this.m == null) {
            this.m = f(5);
        }
        return this.m;
    }

    public Class[] n() {
        if (this.f23375k == null) {
            this.f23375k = f(3);
        }
        return this.f23375k;
    }
}
