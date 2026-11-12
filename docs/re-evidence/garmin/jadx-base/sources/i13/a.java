package i13;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f87103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f87104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87105d;

    public a(int i14) {
        this.f87102a = i14;
        Object[] objArr = new Object[i14 + 1];
        this.f87103b = objArr;
        this.f87104c = objArr;
    }

    public final void a(T t7) {
        int i14 = this.f87105d;
        int i15 = this.f87102a;
        if (i14 == i15) {
            Object[] objArr = new Object[i15 + 1];
            this.f87104c[i15] = objArr;
            this.f87104c = objArr;
            i14 = 0;
        }
        this.f87104c[i14] = t7;
        this.f87105d = i14 + 1;
    }
}
