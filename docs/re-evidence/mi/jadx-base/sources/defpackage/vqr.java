package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class vqr extends ft1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37145b;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;

    public <V extends a52> vqr(V v, int i, onq onqVar) {
        this(v, i);
        setValueFormatter(onqVar);
    }

    public static boolean a(int i, a52 a52Var) {
        return i != -1 && i % a52Var.V == 0;
    }

    public <V extends a52> vqr(V v, int i) {
        this.f37144a = i;
        setTextColor(v.Q);
        setTextSize(v.P);
        this.f37145b = v.R;
        this.c = v.S;
        this.d = v.T;
        this.e = v.U;
        this.f = v.E0;
        this.g = v.F0;
        this.h = v.J0;
    }
}
