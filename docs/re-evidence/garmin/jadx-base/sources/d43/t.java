package d43;

import ch.qos.logback.core.CoreConstants;
import lc.u0;
import p43.g2;
import p43.k1;
import p43.n0;
import p43.q0;
import p43.v0;
import p43.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends g<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f57500b = new a(null);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(f fVar) {
        this(new b.C1229b(fVar));
        fVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d43.g
    public final n0 a(t23.c0 c0Var) {
        n0 n0VarC;
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = c0Var.e();
        dVarE.getClass();
        t23.e eVarJ = dVarE.j(kotlin.reflect.jvm.internal.impl.builtins.f.a.R.i());
        if (eVarJ == null) {
            p005kotlin.reflect.jvm.internal.impl.builtins.d.a(21);
            throw null;
        }
        T t7 = this.f57481a;
        b bVar = (b) t7;
        if (bVar instanceof b.a) {
            n0VarC = ((b.a) t7).f57501a;
        } else {
            if (!(bVar instanceof b.C1229b)) {
                u0.r();
                return null;
            }
            f fVar = ((b.C1229b) t7).f57502a;
            x33.b bVar2 = fVar.f57479a;
            int i14 = fVar.f57480b;
            t23.e eVarA = t23.u.a(c0Var, bVar2);
            if (eVarA == null) {
                n0VarC = r43.l.c(r43.k.f150365d, bVar2.toString(), String.valueOf(i14));
            } else {
                v0 v0VarP = eVarA.p();
                v0VarP.getClass();
                n0 n0VarY = o72.t.Y(v0VarP);
                for (int i15 = 0; i15 < i14; i15++) {
                    n0VarY = c0Var.e().h(g2.INVARIANT, n0VarY);
                }
                n0VarC = n0VarY;
            }
        }
        return q0.d(k1Var, eVarJ, p13.w.c(new v1(n0VarC)));
    }

    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final n0 f57501a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n0 n0Var) {
                super(null);
                n0Var.getClass();
                this.f57501a = n0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f57501a, ((a) obj).f57501a);
            }

            public final int hashCode() {
                return this.f57501a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f57501a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* JADX INFO: renamed from: d43.t$b$b, reason: collision with other inner class name */
        public static final class C1229b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final f f57502a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1229b(f fVar) {
                super(null);
                fVar.getClass();
                this.f57502a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1229b) && p005kotlin.jvm.internal.s.g(this.f57502a, ((C1229b) obj).f57502a);
            }

            public final int hashCode() {
                return this.f57502a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f57502a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b bVar) {
        super(bVar);
        bVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(x33.b bVar, int i14) {
        this(new f(bVar, i14));
        bVar.getClass();
    }
}
