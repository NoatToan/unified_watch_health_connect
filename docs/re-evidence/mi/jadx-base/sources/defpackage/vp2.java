package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class vp2 {

    public static class a implements ipf<c93> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u2d f37097a;

        public a(u2d u2dVar) {
            this.f37097a = u2dVar;
        }

        @Override // defpackage.ipf
        public void b() {
            this.f37097a.c();
        }

        @Override // defpackage.ipf
        public void c() {
            this.f37097a.i();
        }

        @Override // defpackage.ipf
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(c93 c93Var) {
            this.f37097a.j(c93Var);
        }
    }

    public static ecd<c93, u14> a(yl4<c93, u14> yl4Var, u2d u2dVar) {
        u2dVar.k(yl4Var);
        return new ecd<>(yl4Var, new a(u2dVar));
    }
}
