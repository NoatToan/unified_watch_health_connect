package m6;

/* JADX INFO: loaded from: classes.dex */
public class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f116845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116846b;

    public f(int i14) {
        if (i14 > 0) {
            this.f116845a = new Object[i14];
        } else {
            vb.h.s("The max pool size must be > 0");
            throw null;
        }
    }

    public final void a(b bVar) {
        int i14 = this.f116846b;
        Object[] objArr = this.f116845a;
        if (i14 < objArr.length) {
            objArr[i14] = bVar;
            this.f116846b = i14 + 1;
        }
    }
}
