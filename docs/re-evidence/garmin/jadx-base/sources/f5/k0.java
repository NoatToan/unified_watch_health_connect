package f5;

import i3.e5;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh5/e0;", "", "invoke", "(Lh5/e0;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<h5.e0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68994a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h5.e0 e0Var) {
            e0Var.I = true;
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4.r f68995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f68996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z0 f68997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f68998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f68999e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, z0 z0Var, int i14, int i15) {
            super(2);
            this.f68995a = rVar;
            this.f68996b = pVar;
            this.f68997c = z0Var;
            this.f68998d = i14;
            this.f68999e = i15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            num.intValue();
            k0.a(this.f68995a, this.f68996b, this.f68997c, mVar, p3.p0.t(this.f68998d | 1), this.f68999e);
            return Unit.INSTANCE;
        }
    }

    @o13.e
    public static final void a(h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, z0 z0Var, p3.m mVar, int i14, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(-1663319424);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(z0Var) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            p3.x1 x1Var = p3.n.f135158a;
            int iHashCode = Integer.hashCode(o0VarE.P());
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            p3.i2 i2VarA0 = o0VarE.a0();
            h5.e0.N0.getClass();
            h5.e0.a aVar = h5.e0.P0;
            int i18 = ((i16 << 3) & 896) | 6;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.V.getClass();
            b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            a aVar2 = a.f68994a;
            if (o0VarE.T) {
                o0VarE.apply(new b71.n(aVar2, 14, (byte) 0), Unit.INSTANCE);
            }
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
            e5.q((i18 >> 6) & 14, pVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar2, pVar, z0Var, i14, i15);
        }
    }

    public static final z3.e b(List list) {
        return new z3.e(1271844412, true, new l0(list));
    }

    public static final z3.e c(h4.r rVar) {
        return new z3.e(-511438721, true, new m0(rVar));
    }
}
