package defpackage;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class a5i implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpf<c93, u14> f644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f93 f645b;
    public final dbi<w14<u14>> c;

    public static class a extends sy5<w14<u14>, w14<u14>> {
        public final c93 c;
        public final boolean d;
        public final gpf<c93, u14> e;
        public final boolean f;

        public a(cg4<w14<u14>> cg4Var, c93 c93Var, boolean z, gpf<c93, u14> gpfVar, boolean z2) {
            super(cg4Var);
            this.c = c93Var;
            this.d = z;
            this.e = gpfVar;
            this.f = z2;
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            if (w14Var == null) {
                if (e52.d(i)) {
                    o().b(null, i);
                }
            } else if (!e52.e(i) || this.d) {
                w14<u14> w14VarA = this.f ? this.e.a(this.c, w14Var) : null;
                try {
                    o().c(1.0f);
                    cg4<w14<u14>> cg4VarO = o();
                    if (w14VarA != null) {
                        w14Var = w14VarA;
                    }
                    cg4VarO.b(w14Var, i);
                } finally {
                    w14.l(w14VarA);
                }
            }
        }
    }

    public a5i(gpf<c93, u14> gpfVar, f93 f93Var, dbi<w14<u14>> dbiVar) {
        this.f644a = gpfVar;
        this.f645b = f93Var;
        this.c = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        hbi hbiVarF = ebiVar.f();
        String id = ebiVar.getId();
        ImageRequest imageRequestB = ebiVar.b();
        Object objA = ebiVar.a();
        b5i b5iVarG = imageRequestB.g();
        if (b5iVarG == null || b5iVarG.b() == null) {
            this.c.a(cg4Var, ebiVar);
            return;
        }
        hbiVarF.a(id, c());
        c93 c93VarA = this.f645b.a(imageRequestB, objA);
        w14<u14> w14Var = this.f644a.get(c93VarA);
        if (w14Var == null) {
            a aVar = new a(cg4Var, c93VarA, b5iVarG instanceof xkk, this.f644a, ebiVar.b().u());
            hbiVarF.g(id, c(), hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "false") : null);
            this.c.a(aVar, ebiVar);
        } else {
            hbiVarF.g(id, c(), hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "true") : null);
            hbiVarF.i(id, "PostprocessedBitmapMemoryCacheProducer", true);
            cg4Var.c(1.0f);
            cg4Var.b(w14Var, 1);
            w14Var.close();
        }
    }

    public String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
