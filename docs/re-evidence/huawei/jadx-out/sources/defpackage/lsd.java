package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lsd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40752a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private lrx f40753c;
    private int e;

    public lrx b() {
        return (lrx) lst.d(this.f40753c);
    }

    public void c(lrx lrxVar) {
        this.f40753c = (lrx) lst.d(lrxVar);
    }

    public int a() {
        return ((Integer) lst.d(Integer.valueOf(this.e))).intValue();
    }

    public void b(int i) {
        this.e = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.f40752a))).intValue();
    }

    public void c(int i) {
        this.f40752a = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }
}
