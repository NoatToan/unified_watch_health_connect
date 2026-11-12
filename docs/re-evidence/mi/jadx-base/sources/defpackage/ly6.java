package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class ly6 implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53 f25546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z53 f25547b;
    public final f93 c;
    public final dbi<o98> d;

    public static class b extends sy5<o98, o98> {
        public final ebi c;
        public final z53 d;
        public final z53 e;
        public final f93 f;

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (e52.e(i) || o98Var == null || e52.l(i, 10) || o98Var.s() == l4d.c) {
                o().b(o98Var, i);
                return;
            }
            ImageRequest imageRequestB = this.c.b();
            c93 c93VarB = this.f.b(imageRequestB, this.c.a());
            if (imageRequestB.c() == ImageRequest.CacheChoice.SMALL) {
                this.e.o(c93VarB, o98Var);
            } else {
                this.d.o(c93VarB, o98Var);
            }
            o().b(o98Var, i);
        }

        public b(cg4<o98> cg4Var, ebi ebiVar, z53 z53Var, z53 z53Var2, f93 f93Var) {
            super(cg4Var);
            this.c = ebiVar;
            this.d = z53Var;
            this.e = z53Var2;
            this.f = f93Var;
        }
    }

    public ly6(z53 z53Var, z53 z53Var2, f93 f93Var, dbi<o98> dbiVar) {
        this.f25546a = z53Var;
        this.f25547b = z53Var2;
        this.c = f93Var;
        this.d = dbiVar;
    }

    private void c(cg4<o98> cg4Var, ebi ebiVar) {
        if (ebiVar.g().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            cg4Var.b(null, 1);
            return;
        }
        if (ebiVar.b().t()) {
            cg4Var = new b(cg4Var, ebiVar, this.f25546a, this.f25547b, this.c);
        }
        this.d.a(cg4Var, ebiVar);
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        c(cg4Var, ebiVar);
    }
}
