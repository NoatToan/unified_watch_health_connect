package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class jcr implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f22651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i f22652b;
    public final dbi<o98> c;

    public class a extends ddo<o98> {
        public final /* synthetic */ o98 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, hbi hbiVar, String str, String str2, o98 o98Var) {
            super(cg4Var, hbiVar, str, str2);
            this.f = o98Var;
        }

        @Override // defpackage.ddo, defpackage.edo
        public void d() {
            o98.c(this.f);
            super.d();
        }

        @Override // defpackage.ddo, defpackage.edo
        public void e(Exception exc) {
            o98.c(this.f);
            super.e(exc);
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(o98 o98Var) {
            o98.c(o98Var);
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public o98 c() throws Exception {
            p3i p3iVarB = jcr.this.f22652b.b();
            try {
                jcr.g(this.f, p3iVarB);
                w14 w14VarD = w14.D(p3iVarB.a());
                try {
                    o98 o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
                    o98Var.d(this.f);
                    w14.l(w14VarD);
                    p3iVarB.close();
                    return o98Var;
                } catch (Throwable th) {
                    w14.l(w14VarD);
                    throw th;
                }
            } catch (Throwable th2) {
                p3iVarB.close();
                throw th2;
            }
        }

        @Override // defpackage.ddo, defpackage.edo
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void f(o98 o98Var) {
            o98.c(this.f);
            super.f(o98Var);
        }
    }

    public class b extends sy5<o98, o98> {
        public final ebi c;
        public TriState d;

        public b(cg4<o98> cg4Var, ebi ebiVar) {
            super(cg4Var);
            this.c = ebiVar;
            this.d = TriState.UNSET;
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (this.d == TriState.UNSET && o98Var != null) {
                this.d = jcr.h(o98Var);
            }
            if (this.d == TriState.NO) {
                o().b(o98Var, i);
                return;
            }
            if (e52.d(i)) {
                if (this.d != TriState.YES || o98Var == null) {
                    o().b(o98Var, i);
                } else {
                    jcr.this.i(o98Var, o(), this.c);
                }
            }
        }
    }

    public jcr(Executor executor, n3i n3iVar, dbi<o98> dbiVar) {
        this.f22651a = (Executor) b6i.g(executor);
        this.f22652b = (n3i) b6i.g(n3iVar);
        this.c = (dbi) b6i.g(dbiVar);
    }

    public static void g(o98 o98Var, p3i p3iVar) throws Exception {
        InputStream inputStreamY = o98Var.y();
        l4d l4dVarC = m4d.c(inputStreamY);
        if (l4dVarC == pv5.f || l4dVarC == pv5.h) {
            lcr.a().a(inputStreamY, p3iVar, 80);
            o98Var.b0(pv5.f30818a);
        } else {
            if (l4dVarC != pv5.g && l4dVarC != pv5.i) {
                throw new IllegalArgumentException("Wrong image format");
            }
            lcr.a().b(inputStreamY, p3iVar);
            o98Var.b0(pv5.f30819b);
        }
    }

    public static TriState h(o98 o98Var) {
        b6i.g(o98Var);
        l4d l4dVarC = m4d.c(o98Var.y());
        if (!pv5.a(l4dVarC)) {
            return l4dVarC == l4d.c ? TriState.UNSET : TriState.NO;
        }
        kcr kcrVarA = lcr.a();
        return kcrVarA == null ? TriState.NO : TriState.valueOf(!kcrVarA.c(l4dVarC));
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        this.c.a(new b(cg4Var, ebiVar), ebiVar);
    }

    public final void i(o98 o98Var, cg4<o98> cg4Var, ebi ebiVar) {
        b6i.g(o98Var);
        this.f22651a.execute(new a(cg4Var, ebiVar.f(), "WebpTranscodeProducer", ebiVar.getId(), o98.b(o98Var)));
    }
}
