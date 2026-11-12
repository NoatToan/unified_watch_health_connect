package defpackage;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class q98 implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpf<c93, PooledByteBuffer> f31248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f93 f31249b;
    public final dbi<o98> c;

    public static class a extends sy5<o98, o98> {
        public final gpf<c93, PooledByteBuffer> c;
        public final c93 d;
        public final boolean e;

        public a(cg4<o98> cg4Var, gpf<c93, PooledByteBuffer> gpfVar, c93 c93Var, boolean z) {
            super(cg4Var);
            this.c = gpfVar;
            this.d = c93Var;
            this.e = z;
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            try {
                if (epa.d()) {
                    epa.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!e52.e(i) && o98Var != null && !e52.l(i, 10) && o98Var.s() != l4d.c) {
                    w14<PooledByteBuffer> w14VarL = o98Var.l();
                    if (w14VarL != null) {
                        try {
                            w14<PooledByteBuffer> w14VarA = this.e ? this.c.a(this.d, w14VarL) : null;
                            w14.l(w14VarL);
                            if (w14VarA != null) {
                                try {
                                    o98 o98Var2 = new o98(w14VarA);
                                    o98Var2.d(o98Var);
                                    w14.l(w14VarA);
                                    try {
                                        o().c(1.0f);
                                        o().b(o98Var2, i);
                                        o98.c(o98Var2);
                                        if (epa.d()) {
                                            epa.b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th) {
                                        o98.c(o98Var2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    w14.l(w14VarA);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            w14.l(w14VarL);
                            throw th3;
                        }
                    }
                    o().b(o98Var, i);
                    if (epa.d()) {
                        epa.b();
                        return;
                    }
                    return;
                }
                o().b(o98Var, i);
                if (epa.d()) {
                    epa.b();
                }
            } catch (Throwable th4) {
                if (epa.d()) {
                    epa.b();
                }
                throw th4;
            }
        }
    }

    public q98(gpf<c93, PooledByteBuffer> gpfVar, f93 f93Var, dbi<o98> dbiVar) {
        this.f31248a = gpfVar;
        this.f31249b = f93Var;
        this.c = dbiVar;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        try {
            if (epa.d()) {
                epa.a("EncodedMemoryCacheProducer#produceResults");
            }
            String id = ebiVar.getId();
            hbi hbiVarF = ebiVar.f();
            hbiVarF.a(id, "EncodedMemoryCacheProducer");
            c93 c93VarB = this.f31249b.b(ebiVar.b(), ebiVar.a());
            w14<PooledByteBuffer> w14Var = this.f31248a.get(c93VarB);
            try {
                if (w14Var != null) {
                    o98 o98Var = new o98(w14Var);
                    try {
                        hbiVarF.g(id, "EncodedMemoryCacheProducer", hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "true") : null);
                        hbiVarF.i(id, "EncodedMemoryCacheProducer", true);
                        cg4Var.c(1.0f);
                        cg4Var.b(o98Var, 1);
                        o98.c(o98Var);
                        w14.l(w14Var);
                        if (epa.d()) {
                            epa.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        o98.c(o98Var);
                        throw th;
                    }
                }
                if (ebiVar.g().getValue() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                    hbiVarF.g(id, "EncodedMemoryCacheProducer", hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "false") : null);
                    hbiVarF.i(id, "EncodedMemoryCacheProducer", false);
                    cg4Var.b(null, 1);
                    w14.l(w14Var);
                    if (epa.d()) {
                        epa.b();
                        return;
                    }
                    return;
                }
                a aVar = new a(cg4Var, this.f31248a, c93VarB, ebiVar.b().u());
                hbiVarF.g(id, "EncodedMemoryCacheProducer", hbiVarF.f(id) ? ImmutableMap.of("cached_value_found", "false") : null);
                this.c.a(aVar, ebiVar);
                w14.l(w14Var);
                if (epa.d()) {
                    epa.b();
                }
            } catch (Throwable th2) {
                w14.l(w14Var);
                throw th2;
            }
        } catch (Throwable th3) {
            if (epa.d()) {
                epa.b();
            }
            throw th3;
        }
    }
}
