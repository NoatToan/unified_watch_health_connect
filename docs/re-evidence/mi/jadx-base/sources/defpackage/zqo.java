package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class zqo<T> implements dbi<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<T> f41583a;

    public class a extends sy5<T, Void> {
        public a(cg4 cg4Var) {
            super(cg4Var);
        }

        @Override // defpackage.e52
        public void h(T t, int i) {
            if (e52.d(i)) {
                o().b(null, i);
            }
        }
    }

    public zqo(dbi<T> dbiVar) {
        this.f41583a = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<Void> cg4Var, ebi ebiVar) {
        this.f41583a.a(new a(cg4Var), ebiVar);
    }
}
