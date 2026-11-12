package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class bt0 implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<o98> f4579a;

    public static class b extends sy5<o98, o98> {
        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (o98Var == null) {
                o().b(null, i);
                return;
            }
            if (!o98.M(o98Var)) {
                o98Var.P();
            }
            o().b(o98Var, i);
        }

        public b(cg4<o98> cg4Var) {
            super(cg4Var);
        }
    }

    public bt0(dbi<o98> dbiVar) {
        this.f4579a = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        this.f4579a.a(new b(cg4Var), ebiVar);
    }
}
