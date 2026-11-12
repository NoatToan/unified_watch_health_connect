package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class qq5 implements bfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq5 f31738a;

    public qq5(oq5 oq5Var) {
        this.f31738a = oq5Var;
    }

    public static bfd d(oq5 oq5Var) {
        if (oq5Var instanceof cfd) {
            return (bfd) oq5Var;
        }
        if (oq5Var == null) {
            return null;
        }
        return new qq5(oq5Var);
    }

    @Override // defpackage.bfd
    public int a() {
        return this.f31738a.a();
    }

    public oq5 b() {
        return this.f31738a;
    }

    @Override // defpackage.bfd
    public int c(pq5 pq5Var, CharSequence charSequence, int i) {
        return this.f31738a.b(pq5Var, charSequence.toString(), i);
    }
}
