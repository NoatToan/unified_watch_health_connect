package defpackage;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class zp2 implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpf<c93, u14> f41535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f93 f41536b;
    public final dbi<w14<u14>> c;

    public class a extends sy5<w14<u14>, w14<u14>> {
        public final /* synthetic */ c93 c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, c93 c93Var, boolean z) {
            super(cg4Var);
            this.c = c93Var;
            this.d = z;
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(w14<u14> w14Var, int i) {
            w14<u14> w14Var2;
            try {
                if (epa.d()) {
                    epa.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zD = e52.d(i);
                if (w14Var == null) {
                    if (zD) {
                        o().b(null, i);
                    }
                    if (epa.d()) {
                        epa.b();
                        return;
                    }
                    return;
                }
                if (!w14Var.n().c() && !e52.m(i, 8)) {
                    if (!zD && (w14Var2 = zp2.this.f41535a.get(this.c)) != null) {
                        try {
                            tfi tfiVarA = w14Var.n().a();
                            tfi tfiVarA2 = w14Var2.n().a();
                            if (tfiVarA2.a() || tfiVarA2.c() >= tfiVarA.c()) {
                                o().b(w14Var2, i);
                                w14.l(w14Var2);
                                if (epa.d()) {
                                    epa.b();
                                    return;
                                }
                                return;
                            }
                            w14.l(w14Var2);
                        } catch (Throwable th) {
                            w14.l(w14Var2);
                            throw th;
                        }
                    }
                    w14<u14> w14VarA = this.d ? zp2.this.f41535a.a(this.c, w14Var) : null;
                    if (zD) {
                        try {
                            o().c(1.0f);
                        } catch (Throwable th2) {
                            w14.l(w14VarA);
                            throw th2;
                        }
                    }
                    cg4<w14<u14>> cg4VarO = o();
                    if (w14VarA != null) {
                        w14Var = w14VarA;
                    }
                    cg4VarO.b(w14Var, i);
                    w14.l(w14VarA);
                    if (epa.d()) {
                        epa.b();
                        return;
                    }
                    return;
                }
                o().b(w14Var, i);
                if (epa.d()) {
                    epa.b();
                }
            } catch (Throwable th3) {
                if (epa.d()) {
                    epa.b();
                }
                throw th3;
            }
        }
    }

    public zp2(gpf<c93, u14> gpfVar, f93 f93Var, dbi<w14<u14>> dbiVar) {
        this.f41535a = gpfVar;
        this.f41536b = f93Var;
        this.c = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        boolean zD;
        try {
            if (epa.d()) {
                epa.a("BitmapMemoryCacheProducer#produceResults");
            }
            hbi hbiVarF = ebiVar.f();
            String id = ebiVar.getId();
            hbiVarF.a(id, d());
            c93 c93VarC = this.f41536b.c(ebiVar.b(), ebiVar.a());
            w14<u14> w14Var = this.f41535a.get(c93VarC);
            if (w14Var != null) {
                boolean zA = w14Var.n().a().a();
                if (zA) {
                    hbiVarF.g(id, d(), hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "true") : null);
                    hbiVarF.i(id, d(), true);
                    cg4Var.c(1.0f);
                }
                cg4Var.b(w14Var, e52.k(zA));
                w14Var.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (ebiVar.g().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                hbiVarF.g(id, d(), hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "false") : null);
                hbiVarF.i(id, d(), false);
                cg4Var.b(null, 1);
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            cg4<w14<u14>> cg4VarE = e(cg4Var, c93VarC, ebiVar.b().u());
            hbiVarF.g(id, d(), hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "false") : null);
            if (epa.d()) {
                epa.a("mInputProducer.produceResult");
            }
            this.c.a(cg4VarE, ebiVar);
            if (epa.d()) {
                epa.b();
            }
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public cg4<w14<u14>> e(cg4<w14<u14>> cg4Var, c93 c93Var, boolean z) {
        return new a(cg4Var, c93Var, z);
    }
}
