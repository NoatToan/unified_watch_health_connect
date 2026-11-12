package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68961a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f68962b = new Object();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/i2$a", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4.r f68963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<k2, g6.a, a1> f68964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f68965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f68966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h4.r rVar, e23.p<? super k2, ? super g6.a, ? extends a1> pVar, int i14, int i15) {
            super(2);
            this.f68963a = rVar;
            this.f68964b = pVar;
            this.f68965c = i14;
            this.f68966d = i15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            num.intValue();
            int iT = p3.p0.t(this.f68965c | 1);
            int i14 = this.f68966d;
            i2.b(this.f68963a, this.f68964b, mVar, iT, i14);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j2 f68967a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j2 j2Var) {
            super(0);
            this.f68967a = j2Var;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:7:0x0026->B:17:0x005c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:28:0x005f A[EDGE_INSN: B:28:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:7:0x0026->B:17:0x005c], SYNTHETIC] */
        @Override // e23.a
        public final Unit invoke() {
            q0 q0VarA = this.f68967a.a();
            h5.e0 e0Var = q0VarA.f69023a;
            if (q0VarA.f69036n != ((q3.c.a) e0Var.E()).f142359a.f142358c) {
                p1.t0<h5.e0, q0.b> t0Var = q0VarA.f69028f;
                Object[] objArr = t0Var.f134722c;
                long[] jArr = t0Var.f134720a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j8 = jArr[i14];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i14 != length) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((255 & j8) < 128) {
                                    ((q0.b) objArr[(i14 << 3) + i16]).f69044d = true;
                                }
                                j8 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                            if (i14 != length) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
                if (e0Var.f81767h != null) {
                    if (!e0Var.T.f81842e) {
                        h5.e0.h0(e0Var, false, 7);
                    }
                } else if (!e0Var.G()) {
                    h5.e0.j0(e0Var, false, 7);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j2 f68968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r f68969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<k2, g6.a, a1> f68970c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f68971d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f68972e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(j2 j2Var, h4.r rVar, e23.p<? super k2, ? super g6.a, ? extends a1> pVar, int i14, int i15) {
            super(2);
            this.f68968a = j2Var;
            this.f68969b = rVar;
            this.f68970c = pVar;
            this.f68971d = i14;
            this.f68972e = i15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            num.intValue();
            i2.a(this.f68968a, this.f68969b, this.f68970c, mVar, p3.p0.t(this.f68971d | 1), this.f68972e);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    public static final void a(j2 j2Var, h4.r rVar, e23.p<? super k2, ? super g6.a, ? extends a1> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(-511989831);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(j2Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            p3.x1 x1Var = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.o0.b bVarG = o0VarE.g();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            p3.i2 i2VarA0 = o0VarE.a0();
            h5.e0.N0.getClass();
            h5.e0.a aVar = h5.e0.P0;
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
            b4.c(j2Var.f68979c, j2Var, o0VarE);
            b4.c(j2Var.f68980d, bVarG, o0VarE);
            b4.c(j2Var.f68981e, pVar, o0VarE);
            h5.g.V.getClass();
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b4.c(h5.g.a.f81813j, Integer.valueOf(iHashCode), o0VarE);
            o0VarE.g0(true);
            if (o0VarE.b()) {
                o0VarE.C(-1259187287);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1259245908);
                boolean zR = o0VarE.r(j2Var);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new c(j2Var);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new c(j2Var);
                        o0VarE.K(objQ);
                    }
                }
                p3.l0.i((e23.a) objQ, o0VarE);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(j2Var, rVar2, pVar, i14, i15);
        }
    }

    public static final void b(h4.r rVar, e23.p<? super k2, ? super g6.a, ? extends a1> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p<? super k2, ? super g6.a, ? extends a1> pVar2;
        p3.o0 o0VarE = mVar.E(-1298353104);
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
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            h4.r rVar2 = rVar;
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new j2();
                o0VarE.K(objQ);
            }
            pVar2 = pVar;
            a((j2) objQ, rVar2, pVar2, o0VarE, (i16 << 3) & 1008, 0);
            rVar = rVar2;
        } else {
            pVar2 = pVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(rVar, pVar2, i14, i15);
        }
    }
}
