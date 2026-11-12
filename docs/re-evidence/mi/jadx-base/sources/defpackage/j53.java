package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class j53 implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbi<o98> f22425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dbi<o98> f22426b;

    public class b extends sy5<o98, o98> {
        public ebi c;

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            j53.this.f22426b.a(o(), this.c);
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            ImageRequest imageRequestB = this.c.b();
            boolean zD = e52.d(i);
            boolean zC = bep.c(o98Var, imageRequestB.m());
            if (o98Var != null && (zC || imageRequestB.e())) {
                if (zD && zC) {
                    o().b(o98Var, i);
                } else {
                    o().b(o98Var, e52.n(i, 1));
                }
            }
            if (!zD || zC) {
                return;
            }
            o98.c(o98Var);
            j53.this.f22426b.a(o(), this.c);
        }

        public b(cg4<o98> cg4Var, ebi ebiVar) {
            super(cg4Var);
            this.c = ebiVar;
        }
    }

    public j53(dbi<o98> dbiVar, dbi<o98> dbiVar2) {
        this.f22425a = dbiVar;
        this.f22426b = dbiVar2;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        this.f22425a.a(new b(cg4Var, ebiVar), ebiVar);
    }
}
