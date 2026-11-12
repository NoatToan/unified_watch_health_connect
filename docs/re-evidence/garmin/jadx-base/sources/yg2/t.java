package yg2;

import c2.q1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.C;
import f5.z0;
import i3.d8;
import i3.h7;
import i3.mh;
import i3.p7;
import i3.t1;
import i3.v5;
import i3.ve;
import l72.v2;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;
import v62.e1;

/* JADX INFO: loaded from: classes11.dex */
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutCardKt$WorkoutCard$1$3$1$1$2$3$2$2$3$1$1", f = "WorkoutCard.kt", l = {212}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f197202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f197203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f197204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2.i0 i0Var, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f197203b = i0Var;
            this.f197204c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f197203b, this.f197204c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f197202a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f197202a = 1;
                if (e2.i0.f(this.f197203b, this.f197204c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(final long j8, final String str, final nt2.e eVar, final i53.c<nt2.e> cVar, final String str2, n nVar, boolean z14, boolean z15, boolean z16, final int i14, final e2.i0 i0Var, final o53.b0 b0Var, final int i15, final e23.l<? super Integer, Unit> lVar, final boolean z17, final e23.l<? super Integer, Unit> lVar2, final e23.l<? super Integer, Unit> lVar3, final e23.l<? super Integer, Unit> lVar4, final e23.l<? super Integer, Unit> lVar5, final boolean z18, p3.m mVar, final int i16, final int i17, final int i18) {
        String str3;
        boolean z19;
        int i19;
        int i24;
        p3.o0 o0Var;
        final n nVar2;
        final boolean z24;
        final boolean z25;
        final boolean z26;
        float f14;
        float f15;
        i0Var.getClass();
        b0Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        p3.o0 o0VarE = mVar.E(1155037799);
        int i25 = i16 | (o0VarE.l(j8) ? 4 : 2);
        if ((i16 & 48) == 0) {
            str3 = str;
            i25 |= o0VarE.B(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        int i26 = i25 | (o0VarE.B(eVar) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | (o0VarE.B(str2) ? 16384 : 8192);
        int i27 = i18 & 32;
        if (i27 != 0) {
            i26 |= 196608;
        } else if ((i16 & 196608) == 0) {
            i26 |= o0VarE.k(nVar == null ? -1 : nVar.ordinal()) ? 131072 : 65536;
        }
        int i28 = i18 & 64;
        if (i28 != 0) {
            i26 |= 1572864;
            z19 = z14;
        } else {
            z19 = z14;
            if ((i16 & 1572864) == 0) {
                i26 |= o0VarE.h(z19) ? 1048576 : 524288;
            }
        }
        int i29 = i18 & 128;
        if (i29 != 0) {
            i26 |= 12582912;
        } else if ((i16 & 12582912) == 0) {
            i26 |= o0VarE.h(z15) ? 8388608 : 4194304;
        }
        int i30 = i18 & 256;
        if (i30 != 0) {
            i19 = i26 | 100663296;
        } else {
            i19 = i26 | (o0VarE.h(z16) ? 67108864 : 33554432);
        }
        if ((i16 & C.ENCODING_PCM_32BIT) == 0) {
            i19 |= o0VarE.k(i14) ? 536870912 : 268435456;
        }
        if ((i17 & 6) == 0) {
            i24 = i17 | (o0VarE.B(i0Var) ? 4 : 2);
        } else {
            i24 = i17;
        }
        if ((i17 & 48) == 0) {
            i24 |= o0VarE.r(b0Var) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i24 |= o0VarE.k(i15) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i24 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i24 |= o0VarE.h(z17) ? 16384 : 8192;
        }
        if ((i17 & 196608) == 0) {
            i24 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((i17 & 1572864) == 0) {
            i24 |= o0VarE.r(lVar3) ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i24 |= o0VarE.r(lVar4) ? 8388608 : 4194304;
        }
        if ((i17 & 100663296) == 0) {
            i24 |= o0VarE.r(lVar5) ? 67108864 : 33554432;
        }
        if ((i17 & C.ENCODING_PCM_32BIT) == 0) {
            i24 |= o0VarE.h(z18) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i24 & 306783379) == 306783378) ? false : true)) {
            n nVar3 = i27 != 0 ? n.IDLE : nVar;
            if (i28 != 0) {
                z19 = false;
            }
            boolean z27 = i29 != 0 ? false : z15;
            boolean z28 = i30 != 0 ? false : z16;
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            if (z27) {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97917b;
            } else {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97916a;
            }
            final boolean z29 = z27;
            if (z27) {
                f15 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97918c;
            }
            h4.r rVarZ = c2.l.z(aVar, f15, f14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            final n nVar4 = nVar3;
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int i34 = i19;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarA = v2.a(v2.a(x2.f(aVar, 1.0f), z28, new xn.a(26), o0VarE, ((i34 >> 21) & 112) | 6), z17, new af1.l(lVar, i14, 10), o0VarE, (i24 >> 9) & 112);
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            final boolean z34 = z28;
            final String str4 = str3;
            final boolean z35 = z19;
            o0Var = o0VarE;
            ve.a(rVarA, k2.i.a(j92.b.f97900c.f97911c), jB, 0L, 0.0f, 0.0f, null, z3.f.c(-231199800, new e23.p() { // from class: yg2.r
                /* JADX WARN: Code duplicated, block: B:101:0x0348  */
                /* JADX WARN: Code duplicated, block: B:107:0x03a4  */
                /* JADX WARN: Code duplicated, block: B:109:0x03dd  */
                /* JADX WARN: Code duplicated, block: B:111:0x03e6  */
                /* JADX WARN: Code duplicated, block: B:112:0x03ea  */
                /* JADX WARN: Code duplicated, block: B:115:0x03ff  */
                /* JADX WARN: Code duplicated, block: B:117:0x040d  */
                /* JADX WARN: Code duplicated, block: B:119:0x045a  */
                /* JADX WARN: Code duplicated, block: B:121:0x045e A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:122:0x0460  */
                /* JADX WARN: Code duplicated, block: B:124:0x0471  */
                /* JADX WARN: Code duplicated, block: B:127:0x04b1  */
                /* JADX WARN: Code duplicated, block: B:129:0x04ba  */
                /* JADX WARN: Code duplicated, block: B:130:0x04be  */
                /* JADX WARN: Code duplicated, block: B:133:0x04d3  */
                /* JADX WARN: Code duplicated, block: B:135:0x04e1  */
                /* JADX WARN: Code duplicated, block: B:138:0x04f1  */
                /* JADX WARN: Code duplicated, block: B:140:0x054b  */
                /* JADX WARN: Code duplicated, block: B:142:0x0551  */
                /* JADX WARN: Code duplicated, block: B:145:0x0563  */
                /* JADX WARN: Code duplicated, block: B:149:0x05bb  */
                /* JADX WARN: Code duplicated, block: B:151:0x05cd  */
                /* JADX WARN: Code duplicated, block: B:153:0x05d2  */
                /* JADX WARN: Code duplicated, block: B:155:0x05d7  */
                /* JADX WARN: Code duplicated, block: B:23:0x00e1  */
                /* JADX WARN: Code duplicated, block: B:25:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
                /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
                /* JADX WARN: Code duplicated, block: B:32:0x0110  */
                /* JADX WARN: Code duplicated, block: B:36:0x0120  */
                /* JADX WARN: Code duplicated, block: B:39:0x0127  */
                /* JADX WARN: Code duplicated, block: B:42:0x012d A[ADDED_TO_REGION] */
                /* JADX WARN: Code duplicated, block: B:46:0x0134  */
                /* JADX WARN: Code duplicated, block: B:49:0x017b  */
                /* JADX WARN: Code duplicated, block: B:51:0x0184  */
                /* JADX WARN: Code duplicated, block: B:52:0x0188  */
                /* JADX WARN: Code duplicated, block: B:55:0x0197  */
                /* JADX WARN: Code duplicated, block: B:57:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:60:0x01d9  */
                /* JADX WARN: Code duplicated, block: B:62:0x01e2  */
                /* JADX WARN: Code duplicated, block: B:63:0x01e6  */
                /* JADX WARN: Code duplicated, block: B:66:0x01f5  */
                /* JADX WARN: Code duplicated, block: B:68:0x0203  */
                /* JADX WARN: Code duplicated, block: B:71:0x0214  */
                /* JADX WARN: Code duplicated, block: B:73:0x021a  */
                /* JADX WARN: Code duplicated, block: B:78:0x027a  */
                /* JADX WARN: Code duplicated, block: B:80:0x0282  */
                /* JADX WARN: Code duplicated, block: B:82:0x029d  */
                /* JADX WARN: Code duplicated, block: B:84:0x02a4  */
                /* JADX WARN: Code duplicated, block: B:86:0x02f2  */
                /* JADX WARN: Code duplicated, block: B:89:0x0303  */
                /* JADX WARN: Code duplicated, block: B:91:0x0309  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z36;
                    h5.g.a.f fVar;
                    u2 u2Var2;
                    j92.e eVar2;
                    h4.g.a aVar4;
                    c2.z zVarA;
                    int iHashCode2;
                    i2 i2VarX;
                    h4.r rVarC2;
                    h4.g.a aVar5;
                    n nVar5;
                    n nVar6;
                    boolean z37;
                    boolean z38;
                    boolean z39;
                    s2 s2VarA2;
                    int iHashCode3;
                    i2 i2VarX2;
                    h4.r rVarC3;
                    c2.z zVarA2;
                    int iHashCode4;
                    i2 i2VarX3;
                    h4.r rVarC4;
                    h4.r rVarA2;
                    String str5;
                    nt2.e eVar3;
                    p3.m.a aVar6;
                    h4.r rVar;
                    i53.c<nt2.e> cVar2;
                    boolean z44;
                    r rVar2;
                    Object objQ;
                    p3.m.a.C2565a c2565a;
                    p1 p1Var;
                    c2.z zVarA3;
                    int iHashCode5;
                    i2 i2VarX4;
                    h4.r rVarC5;
                    h5.e0.a aVar7;
                    h5.g.a.b bVar2;
                    Object objQ2;
                    String str6;
                    h4.r.a aVar8;
                    z0 z0VarD;
                    int iHashCode6;
                    i2 i2VarX5;
                    h4.r rVarC6;
                    h5.e0.a aVar9;
                    h5.g.a.b bVar3;
                    char c14;
                    String str7;
                    boolean zR;
                    Object objQ3;
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar10 = h4.r.S;
                        h4.r rVarO = c2.l.o(x2.f(aVar10, 1.0f), q1.Min);
                        c2.j.f22691a.getClass();
                        c2.j.g gVar = c2.j.f22698h;
                        h4.d.f81522a.getClass();
                        h4.g.b bVar4 = h4.d.a.f81534l;
                        s2 s2VarA3 = q2.a(gVar, bVar4, mVar2, 54);
                        int iHashCode7 = Long.hashCode(mVar2.getU());
                        i2 i2VarX6 = mVar2.x();
                        h4.r rVarC7 = h4.k.c(rVarO, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar4 = h5.g.a.f81810g;
                        b4.c(eVar4, s2VarA3, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX6, mVar2);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            z36 = true;
                        } else {
                            z36 = true;
                            if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode7))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC7, mVar2);
                            u2Var2 = u2.f22900a;
                            h4.r rVarC8 = x2.c(u1.n.e(aVar10, j8, m1.f128891a), 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            eVar2 = j92.b.f97899b;
                            c2.q.a(x2.u(rVarC8, eVar2.f97918c), mVar2, 0);
                            aVar4 = h4.d.a.f81536n;
                            zVarA = c2.y.a(gVar, aVar4, mVar2, 6);
                            iHashCode2 = Long.hashCode(mVar2.getU());
                            i2VarX = mVar2.x();
                            rVarC2 = h4.k.c(aVar10, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar4, zVarA, mVar2);
                            b4.c(c1623g, i2VarX, mVar2);
                            if (mVar2.getT()) {
                                aVar5 = aVar4;
                            } else {
                                aVar5 = aVar4;
                                if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                }
                                b4.c(fVar, rVarC2, mVar2);
                                c2.b0 b0Var2 = c2.b0.f22601a;
                                nVar5 = n.COMPLETED;
                                nVar6 = nVar4;
                                if (nVar6 == nVar5 || z29) {
                                    z37 = false;
                                } else {
                                    z37 = z36;
                                }
                                z38 = z35;
                                if (!z37 || z38) {
                                    z39 = z36;
                                } else {
                                    z39 = false;
                                }
                                h4.r rVarA3 = v2.a(c2.l.C(x2.f(aVar10, 1.0f), eVar2.f97920e, 0.0f, eVar2.f97917b, 0.0f, 10), !z39, new xn.a(27), mVar2, 0);
                                s2VarA2 = q2.a(gVar, bVar4, mVar2, 54);
                                iHashCode3 = Long.hashCode(mVar2.getU());
                                i2VarX2 = mVar2.x();
                                rVarC3 = h4.k.c(rVarA3, mVar2);
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar11);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar4, s2VarA2, mVar2);
                                b4.c(c1623g, i2VarX2, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                                    v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                                }
                                b4.c(fVar, rVarC3, mVar2);
                                boolean z45 = z36;
                                h4.r rVarA4 = u2Var2.a(c2.l.A(aVar10, 0.0f, eVar2.f97920e, z45 ? 1 : 0), 1.0f, z45);
                                zVarA2 = c2.y.a(c2.j.f22694d, aVar5, mVar2, 0);
                                iHashCode4 = Long.hashCode(mVar2.getU());
                                i2VarX3 = mVar2.x();
                                rVarC4 = h4.k.c(rVarA4, mVar2);
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar11);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar4, zVarA2, mVar2);
                                b4.c(c1623g, i2VarX3, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                                    v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                                }
                                b4.c(fVar, rVarC4, mVar2);
                                rVarA2 = c2.l.A(aVar10, 0.0f, eVar2.f97916a, 1);
                                str5 = str4;
                                if (str5 != null || d53.w.J(str5)) {
                                    mVar2.C(1268727846);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1268613518);
                                    d92.b.f58624b.getClass();
                                    mh.c(str5, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar2), mVar2, 0, 0, 131068);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                }
                                eVar3 = eVar;
                                aVar6 = p3.m.f135153a;
                                if (eVar3 != null) {
                                    str7 = eVar3.f127844a;
                                    if (d53.w.J(str7)) {
                                        rVar = rVarA2;
                                        mVar2.C(1269165318);
                                        mVar2.f();
                                    } else {
                                        mVar2.C(1268852063);
                                        d92.b.f58624b.getClass();
                                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                                        zR = mVar2.r(eVar3);
                                        objQ3 = mVar2.q();
                                        if (zR) {
                                            objQ3 = new lg2.n(eVar3, 5);
                                            mVar2.K(objQ3);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ3 == p3.m.a.f135155b) {
                                                objQ3 = new lg2.n(eVar3, 5);
                                                mVar2.K(objQ3);
                                            }
                                        }
                                        p3.m mVar3 = mVar2;
                                        rVar = rVarA2;
                                        mh.c(str7, p5.v.c((e23.l) objQ3, rVarA2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                                        mVar2 = mVar3;
                                        mVar2.f();
                                    }
                                } else {
                                    rVar = rVarA2;
                                    mVar2.C(1269165318);
                                    mVar2.f();
                                }
                                cVar2 = cVar;
                                if (cVar2 != null || cVar2.isEmpty()) {
                                    z44 = false;
                                    mVar2.C(1269685126);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1269240183);
                                    for (nt2.e eVar5 : cVar2) {
                                        String str8 = eVar5.f127844a;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58624b.getClass();
                                        x0 x0VarF = d92.c.f(j92.f.f97933j, mVar2);
                                        boolean zR2 = mVar2.r(eVar5);
                                        Object objQ4 = mVar2.q();
                                        if (zR2) {
                                            c14 = 6;
                                            objQ4 = new lg2.n(eVar5, 6);
                                            mVar2.K(objQ4);
                                        } else {
                                            aVar6.getClass();
                                            if (objQ4 == p3.m.a.f135155b) {
                                                c14 = 6;
                                                objQ4 = new lg2.n(eVar5, 6);
                                                mVar2.K(objQ4);
                                            } else {
                                                c14 = 6;
                                            }
                                        }
                                        h4.r rVar3 = rVar;
                                        p3.m mVar4 = mVar2;
                                        rVar = rVar3;
                                        mh.c(str8, p5.v.c((e23.l) objQ4, rVar3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar4, 0, 0, 131068);
                                        mVar2 = mVar4;
                                    }
                                    z44 = false;
                                    mVar2.f();
                                }
                                mVar2.y();
                                if (z37) {
                                    mVar2.C(1269191461);
                                    aVar8 = h4.r.S;
                                    f5.p pVar = p7.f89279a;
                                    d8 d8Var = d8.f87832a;
                                    aVar8.getClass();
                                    h4.d.f81522a.getClass();
                                    z0VarD = c2.q.d(h4.d.a.f81528f, z44);
                                    x1 x1Var3 = p3.n.f135158a;
                                    iHashCode6 = Long.hashCode(mVar2.getU());
                                    i2VarX5 = mVar2.x();
                                    rVarC6 = h4.k.c(d8Var, mVar2);
                                    h5.g.V.getClass();
                                    aVar9 = h5.g.a.f81805b;
                                    if (mVar2.F() != null) {
                                        p3.p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar9);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                                    b4.c(h5.g.a.f81809f, i2VarX5, mVar2);
                                    bVar3 = h5.g.a.f81813j;
                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode6))) {
                                        v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                                    c2.u uVar = c2.u.f22885a;
                                    u4.d dVarA = e1.a(t62.b.f162798a);
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    p3.m mVar5 = mVar2;
                                    y0.b(dVarA, "", x2.q(aVar8, j92.b.f97901d.f97904c), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar2).f().e()), mVar5, 48, 56);
                                    mVar2 = mVar5;
                                    mVar2.y();
                                    mVar2.f();
                                    rVar2 = this;
                                } else if (z38) {
                                    mVar2.C(1270070001);
                                    objQ = mVar2.q();
                                    aVar6.getClass();
                                    c2565a = p3.m.a.f135155b;
                                    if (objQ == c2565a) {
                                        objQ = p3.p0.n(Boolean.FALSE);
                                        mVar2.K(objQ);
                                    }
                                    p1Var = (p1) objQ;
                                    h4.r.a aVar12 = h4.r.S;
                                    h4.d.f81522a.getClass();
                                    h4.g.a aVar13 = h4.d.a.f81538p;
                                    c2.j.f22691a.getClass();
                                    zVarA3 = c2.y.a(c2.j.f22696f, aVar13, mVar2, 54);
                                    x1 x1Var4 = p3.n.f135158a;
                                    iHashCode5 = Long.hashCode(mVar2.getU());
                                    i2VarX4 = mVar2.x();
                                    rVarC5 = h4.k.c(aVar12, mVar2);
                                    h5.g.V.getClass();
                                    aVar7 = h5.g.a.f81805b;
                                    if (mVar2.F() != null) {
                                        p3.p0.l();
                                        throw null;
                                    }
                                    mVar2.z();
                                    if (mVar2.getT()) {
                                        mVar2.M(aVar7);
                                    } else {
                                        mVar2.c();
                                    }
                                    b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                                    b4.c(h5.g.a.f81809f, i2VarX4, mVar2);
                                    bVar2 = h5.g.a.f81813j;
                                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode5))) {
                                        v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                                    }
                                    b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                                    c2.b0 b0Var3 = c2.b0.f22601a;
                                    objQ2 = mVar2.q();
                                    if (objQ2 == c2565a) {
                                        objQ2 = new x91.d(p1Var, 28);
                                        mVar2.K(objQ2);
                                    }
                                    rVar2 = this;
                                    h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(-1057624290, new t1(i14, i15, i0Var, lVar2, lVar3, lVar4, lVar5, eVar3, b0Var, p1Var, nVar6, z18, z34), mVar2), mVar2, 1572870, 62);
                                    mVar2.y();
                                    mVar2.f();
                                } else {
                                    rVar2 = this;
                                    mVar2.C(1275984956);
                                    mVar2.f();
                                }
                                mVar2.y();
                                str6 = str2;
                                if (str6 != null || d53.w.J(str6)) {
                                    mVar2.C(1958680800);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1957765928);
                                    long jE = r1.q2.e(d92.b.f58623a, mVar2);
                                    h4.r.a aVar14 = h4.r.S;
                                    h4.r rVarF = x2.f(aVar14, 1.0f);
                                    d92.b.f58625c.getClass();
                                    j92.e eVar6 = j92.b.f97899b;
                                    v5.a(0.0f, 0, 2, jE, c2.l.A(rVarF, eVar6.f97920e, 0.0f, 2), mVar2);
                                    p3.m mVar6 = mVar2;
                                    h4.r rVarA5 = c2.l.A(aVar14, eVar6.f97920e, 0.0f, 2);
                                    float f16 = eVar6.f97918c;
                                    mg2.t.a(str6, c2.l.C(rVarA5, 0.0f, f16, 0.0f, f16, 5), 0, null, null, null, null, null, false, mVar6, 100663296, 252);
                                    mVar2 = mVar6;
                                    mVar2.f();
                                }
                                mVar2.y();
                                mVar2.y();
                                x1 x1Var5 = p3.n.f135158a;
                            }
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar5);
                            b4.c(fVar, rVarC2, mVar2);
                            c2.b0 b0Var4 = c2.b0.f22601a;
                            nVar5 = n.COMPLETED;
                            nVar6 = nVar4;
                            if (nVar6 == nVar5) {
                                z37 = false;
                            } else {
                                z37 = false;
                            }
                            z38 = z35;
                            if (z37) {
                                z39 = z36;
                            } else {
                                z39 = z36;
                            }
                            h4.r rVarA6 = v2.a(c2.l.C(x2.f(aVar10, 1.0f), eVar2.f97920e, 0.0f, eVar2.f97917b, 0.0f, 10), !z39, new xn.a(27), mVar2, 0);
                            s2VarA2 = q2.a(gVar, bVar4, mVar2, 54);
                            iHashCode3 = Long.hashCode(mVar2.getU());
                            i2VarX2 = mVar2.x();
                            rVarC3 = h4.k.c(rVarA6, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar4, s2VarA2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                            } else {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            boolean z46 = z36;
                            h4.r rVarA7 = u2Var2.a(c2.l.A(aVar10, 0.0f, eVar2.f97920e, z46 ? 1 : 0), 1.0f, z46);
                            zVarA2 = c2.y.a(c2.j.f22694d, aVar5, mVar2, 0);
                            iHashCode4 = Long.hashCode(mVar2.getU());
                            i2VarX3 = mVar2.x();
                            rVarC4 = h4.k.c(rVarA7, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar4, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX3, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                            } else {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                            }
                            b4.c(fVar, rVarC4, mVar2);
                            rVarA2 = c2.l.A(aVar10, 0.0f, eVar2.f97916a, 1);
                            str5 = str4;
                            if (str5 != null) {
                                mVar2.C(1268727846);
                                mVar2.f();
                            } else {
                                mVar2.C(1268727846);
                                mVar2.f();
                            }
                            eVar3 = eVar;
                            aVar6 = p3.m.f135153a;
                            if (eVar3 != null) {
                                str7 = eVar3.f127844a;
                                if (d53.w.J(str7)) {
                                    mVar2.C(1268852063);
                                    d92.b.f58624b.getClass();
                                    x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar2);
                                    zR = mVar2.r(eVar3);
                                    objQ3 = mVar2.q();
                                    if (zR) {
                                        aVar6.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new lg2.n(eVar3, 5);
                                            mVar2.K(objQ3);
                                        }
                                    } else {
                                        objQ3 = new lg2.n(eVar3, 5);
                                        mVar2.K(objQ3);
                                    }
                                    p3.m mVar7 = mVar2;
                                    rVar = rVarA2;
                                    mh.c(str7, p5.v.c((e23.l) objQ3, rVarA2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar7, 0, 0, 131068);
                                    mVar2 = mVar7;
                                    mVar2.f();
                                } else {
                                    rVar = rVarA2;
                                    mVar2.C(1269165318);
                                    mVar2.f();
                                }
                            } else {
                                rVar = rVarA2;
                                mVar2.C(1269165318);
                                mVar2.f();
                            }
                            cVar2 = cVar;
                            if (cVar2 != null) {
                                z44 = false;
                                mVar2.C(1269685126);
                                mVar2.f();
                            } else {
                                z44 = false;
                                mVar2.C(1269685126);
                                mVar2.f();
                            }
                            mVar2.y();
                            if (z37) {
                                mVar2.C(1269191461);
                                aVar8 = h4.r.S;
                                f5.p pVar2 = p7.f89279a;
                                d8 d8Var2 = d8.f87832a;
                                aVar8.getClass();
                                h4.d.f81522a.getClass();
                                z0VarD = c2.q.d(h4.d.a.f81528f, z44);
                                x1 x1Var6 = p3.n.f135158a;
                                iHashCode6 = Long.hashCode(mVar2.getU());
                                i2VarX5 = mVar2.x();
                                rVarC6 = h4.k.c(d8Var2, mVar2);
                                h5.g.V.getClass();
                                aVar9 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX5, mVar2);
                                bVar3 = h5.g.a.f81813j;
                                if (mVar2.getT()) {
                                    v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                                } else {
                                    v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                                }
                                b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                                c2.u uVar2 = c2.u.f22885a;
                                u4.d dVarA2 = e1.a(t62.b.f162798a);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                p3.m mVar8 = mVar2;
                                y0.b(dVarA2, "", x2.q(aVar8, j92.b.f97901d.f97904c), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar2).f().e()), mVar8, 48, 56);
                                mVar2 = mVar8;
                                mVar2.y();
                                mVar2.f();
                                rVar2 = this;
                            } else if (z38) {
                                mVar2.C(1270070001);
                                objQ = mVar2.q();
                                aVar6.getClass();
                                c2565a = p3.m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar2.K(objQ);
                                }
                                p1Var = (p1) objQ;
                                h4.r.a aVar15 = h4.r.S;
                                h4.d.f81522a.getClass();
                                h4.g.a aVar16 = h4.d.a.f81538p;
                                c2.j.f22691a.getClass();
                                zVarA3 = c2.y.a(c2.j.f22696f, aVar16, mVar2, 54);
                                x1 x1Var7 = p3.n.f135158a;
                                iHashCode5 = Long.hashCode(mVar2.getU());
                                i2VarX4 = mVar2.x();
                                rVarC5 = h4.k.c(aVar15, mVar2);
                                h5.g.V.getClass();
                                aVar7 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar7);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX4, mVar2);
                                bVar2 = h5.g.a.f81813j;
                                if (mVar2.getT()) {
                                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                                } else {
                                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                                }
                                b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                                c2.b0 b0Var5 = c2.b0.f22601a;
                                objQ2 = mVar2.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new x91.d(p1Var, 28);
                                    mVar2.K(objQ2);
                                }
                                rVar2 = this;
                                h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(-1057624290, new t1(i14, i15, i0Var, lVar2, lVar3, lVar4, lVar5, eVar3, b0Var, p1Var, nVar6, z18, z34), mVar2), mVar2, 1572870, 62);
                                mVar2.y();
                                mVar2.f();
                            } else {
                                rVar2 = this;
                                mVar2.C(1275984956);
                                mVar2.f();
                            }
                            mVar2.y();
                            str6 = str2;
                            if (str6 != null) {
                                mVar2.C(1958680800);
                                mVar2.f();
                            } else {
                                mVar2.C(1958680800);
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            x1 x1Var8 = p3.n.f135158a;
                        }
                        v.h.z(iHashCode7, mVar2, iHashCode7, bVar5);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar2);
                        u2Var2 = u2.f22900a;
                        h4.r rVarC9 = x2.c(u1.n.e(aVar10, j8, m1.f128891a), 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        eVar2 = j92.b.f97899b;
                        c2.q.a(x2.u(rVarC9, eVar2.f97918c), mVar2, 0);
                        aVar4 = h4.d.a.f81536n;
                        zVarA = c2.y.a(gVar, aVar4, mVar2, 6);
                        iHashCode2 = Long.hashCode(mVar2.getU());
                        i2VarX = mVar2.x();
                        rVarC2 = h4.k.c(aVar10, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar4, zVarA, mVar2);
                        b4.c(c1623g, i2VarX, mVar2);
                        if (mVar2.getT()) {
                            aVar5 = aVar4;
                            if (!p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            }
                            b4.c(fVar, rVarC2, mVar2);
                            c2.b0 b0Var6 = c2.b0.f22601a;
                            nVar5 = n.COMPLETED;
                            nVar6 = nVar4;
                            if (nVar6 == nVar5) {
                                z37 = false;
                            } else {
                                z37 = false;
                            }
                            z38 = z35;
                            if (z37) {
                                z39 = z36;
                            } else {
                                z39 = z36;
                            }
                            h4.r rVarA8 = v2.a(c2.l.C(x2.f(aVar10, 1.0f), eVar2.f97920e, 0.0f, eVar2.f97917b, 0.0f, 10), !z39, new xn.a(27), mVar2, 0);
                            s2VarA2 = q2.a(gVar, bVar4, mVar2, 54);
                            iHashCode3 = Long.hashCode(mVar2.getU());
                            i2VarX2 = mVar2.x();
                            rVarC3 = h4.k.c(rVarA8, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar4, s2VarA2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                            } else {
                                v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            boolean z47 = z36;
                            h4.r rVarA9 = u2Var2.a(c2.l.A(aVar10, 0.0f, eVar2.f97920e, z47 ? 1 : 0), 1.0f, z47);
                            zVarA2 = c2.y.a(c2.j.f22694d, aVar5, mVar2, 0);
                            iHashCode4 = Long.hashCode(mVar2.getU());
                            i2VarX3 = mVar2.x();
                            rVarC4 = h4.k.c(rVarA9, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar11);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar4, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX3, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                            } else {
                                v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                            }
                            b4.c(fVar, rVarC4, mVar2);
                            rVarA2 = c2.l.A(aVar10, 0.0f, eVar2.f97916a, 1);
                            str5 = str4;
                            if (str5 != null) {
                                mVar2.C(1268727846);
                                mVar2.f();
                            } else {
                                mVar2.C(1268727846);
                                mVar2.f();
                            }
                            eVar3 = eVar;
                            aVar6 = p3.m.f135153a;
                            if (eVar3 != null) {
                                str7 = eVar3.f127844a;
                                if (d53.w.J(str7)) {
                                    mVar2.C(1268852063);
                                    d92.b.f58624b.getClass();
                                    x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar2);
                                    zR = mVar2.r(eVar3);
                                    objQ3 = mVar2.q();
                                    if (zR) {
                                        aVar6.getClass();
                                        if (objQ3 == p3.m.a.f135155b) {
                                            objQ3 = new lg2.n(eVar3, 5);
                                            mVar2.K(objQ3);
                                        }
                                    } else {
                                        objQ3 = new lg2.n(eVar3, 5);
                                        mVar2.K(objQ3);
                                    }
                                    p3.m mVar9 = mVar2;
                                    rVar = rVarA2;
                                    mh.c(str7, p5.v.c((e23.l) objQ3, rVarA2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, mVar9, 0, 0, 131068);
                                    mVar2 = mVar9;
                                    mVar2.f();
                                } else {
                                    rVar = rVarA2;
                                    mVar2.C(1269165318);
                                    mVar2.f();
                                }
                            } else {
                                rVar = rVarA2;
                                mVar2.C(1269165318);
                                mVar2.f();
                            }
                            cVar2 = cVar;
                            if (cVar2 != null) {
                                z44 = false;
                                mVar2.C(1269685126);
                                mVar2.f();
                            } else {
                                z44 = false;
                                mVar2.C(1269685126);
                                mVar2.f();
                            }
                            mVar2.y();
                            if (z37) {
                                mVar2.C(1269191461);
                                aVar8 = h4.r.S;
                                f5.p pVar3 = p7.f89279a;
                                d8 d8Var3 = d8.f87832a;
                                aVar8.getClass();
                                h4.d.f81522a.getClass();
                                z0VarD = c2.q.d(h4.d.a.f81528f, z44);
                                x1 x1Var9 = p3.n.f135158a;
                                iHashCode6 = Long.hashCode(mVar2.getU());
                                i2VarX5 = mVar2.x();
                                rVarC6 = h4.k.c(d8Var3, mVar2);
                                h5.g.V.getClass();
                                aVar9 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX5, mVar2);
                                bVar3 = h5.g.a.f81813j;
                                if (mVar2.getT()) {
                                    v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                                } else {
                                    v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                                }
                                b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                                c2.u uVar3 = c2.u.f22885a;
                                u4.d dVarA3 = e1.a(t62.b.f162798a);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                p3.m mVar10 = mVar2;
                                y0.b(dVarA3, "", x2.q(aVar8, j92.b.f97901d.f97904c), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar2).f().e()), mVar10, 48, 56);
                                mVar2 = mVar10;
                                mVar2.y();
                                mVar2.f();
                                rVar2 = this;
                            } else if (z38) {
                                mVar2.C(1270070001);
                                objQ = mVar2.q();
                                aVar6.getClass();
                                c2565a = p3.m.a.f135155b;
                                if (objQ == c2565a) {
                                    objQ = p3.p0.n(Boolean.FALSE);
                                    mVar2.K(objQ);
                                }
                                p1Var = (p1) objQ;
                                h4.r.a aVar17 = h4.r.S;
                                h4.d.f81522a.getClass();
                                h4.g.a aVar18 = h4.d.a.f81538p;
                                c2.j.f22691a.getClass();
                                zVarA3 = c2.y.a(c2.j.f22696f, aVar18, mVar2, 54);
                                x1 x1Var10 = p3.n.f135158a;
                                iHashCode5 = Long.hashCode(mVar2.getU());
                                i2VarX4 = mVar2.x();
                                rVarC5 = h4.k.c(aVar17, mVar2);
                                h5.g.V.getClass();
                                aVar7 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar7);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX4, mVar2);
                                bVar2 = h5.g.a.f81813j;
                                if (mVar2.getT()) {
                                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                                } else {
                                    v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                                }
                                b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                                c2.b0 b0Var7 = c2.b0.f22601a;
                                objQ2 = mVar2.q();
                                if (objQ2 == c2565a) {
                                    objQ2 = new x91.d(p1Var, 28);
                                    mVar2.K(objQ2);
                                }
                                rVar2 = this;
                                h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(-1057624290, new t1(i14, i15, i0Var, lVar2, lVar3, lVar4, lVar5, eVar3, b0Var, p1Var, nVar6, z18, z34), mVar2), mVar2, 1572870, 62);
                                mVar2.y();
                                mVar2.f();
                            } else {
                                rVar2 = this;
                                mVar2.C(1275984956);
                                mVar2.f();
                            }
                            mVar2.y();
                            str6 = str2;
                            if (str6 != null) {
                                mVar2.C(1958680800);
                                mVar2.f();
                            } else {
                                mVar2.C(1958680800);
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            x1 x1Var11 = p3.n.f135158a;
                        } else {
                            aVar5 = aVar4;
                        }
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar5);
                        b4.c(fVar, rVarC2, mVar2);
                        c2.b0 b0Var8 = c2.b0.f22601a;
                        nVar5 = n.COMPLETED;
                        nVar6 = nVar4;
                        if (nVar6 == nVar5) {
                            z37 = false;
                        } else {
                            z37 = false;
                        }
                        z38 = z35;
                        if (z37) {
                            z39 = z36;
                        } else {
                            z39 = z36;
                        }
                        h4.r rVarA10 = v2.a(c2.l.C(x2.f(aVar10, 1.0f), eVar2.f97920e, 0.0f, eVar2.f97917b, 0.0f, 10), !z39, new xn.a(27), mVar2, 0);
                        s2VarA2 = q2.a(gVar, bVar4, mVar2, 54);
                        iHashCode3 = Long.hashCode(mVar2.getU());
                        i2VarX2 = mVar2.x();
                        rVarC3 = h4.k.c(rVarA10, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar4, s2VarA2, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                        } else {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar5);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        boolean z48 = z36;
                        h4.r rVarA11 = u2Var2.a(c2.l.A(aVar10, 0.0f, eVar2.f97920e, z48 ? 1 : 0), 1.0f, z48);
                        zVarA2 = c2.y.a(c2.j.f22694d, aVar5, mVar2, 0);
                        iHashCode4 = Long.hashCode(mVar2.getU());
                        i2VarX3 = mVar2.x();
                        rVarC4 = h4.k.c(rVarA11, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar11);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar4, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                        } else {
                            v.h.z(iHashCode4, mVar2, iHashCode4, bVar5);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        rVarA2 = c2.l.A(aVar10, 0.0f, eVar2.f97916a, 1);
                        str5 = str4;
                        if (str5 != null) {
                            mVar2.C(1268727846);
                            mVar2.f();
                        } else {
                            mVar2.C(1268727846);
                            mVar2.f();
                        }
                        eVar3 = eVar;
                        aVar6 = p3.m.f135153a;
                        if (eVar3 != null) {
                            str7 = eVar3.f127844a;
                            if (d53.w.J(str7)) {
                                mVar2.C(1268852063);
                                d92.b.f58624b.getClass();
                                x0 x0VarB4 = d92.c.b(j92.f.f97931h, mVar2);
                                zR = mVar2.r(eVar3);
                                objQ3 = mVar2.q();
                                if (zR) {
                                    aVar6.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        objQ3 = new lg2.n(eVar3, 5);
                                        mVar2.K(objQ3);
                                    }
                                } else {
                                    objQ3 = new lg2.n(eVar3, 5);
                                    mVar2.K(objQ3);
                                }
                                p3.m mVar11 = mVar2;
                                rVar = rVarA2;
                                mh.c(str7, p5.v.c((e23.l) objQ3, rVarA2, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, mVar11, 0, 0, 131068);
                                mVar2 = mVar11;
                                mVar2.f();
                            } else {
                                rVar = rVarA2;
                                mVar2.C(1269165318);
                                mVar2.f();
                            }
                        } else {
                            rVar = rVarA2;
                            mVar2.C(1269165318);
                            mVar2.f();
                        }
                        cVar2 = cVar;
                        if (cVar2 != null) {
                            z44 = false;
                            mVar2.C(1269685126);
                            mVar2.f();
                        } else {
                            z44 = false;
                            mVar2.C(1269685126);
                            mVar2.f();
                        }
                        mVar2.y();
                        if (z37) {
                            mVar2.C(1269191461);
                            aVar8 = h4.r.S;
                            f5.p pVar4 = p7.f89279a;
                            d8 d8Var4 = d8.f87832a;
                            aVar8.getClass();
                            h4.d.f81522a.getClass();
                            z0VarD = c2.q.d(h4.d.a.f81528f, z44);
                            x1 x1Var12 = p3.n.f135158a;
                            iHashCode6 = Long.hashCode(mVar2.getU());
                            i2VarX5 = mVar2.x();
                            rVarC6 = h4.k.c(d8Var4, mVar2);
                            h5.g.V.getClass();
                            aVar9 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX5, mVar2);
                            bVar3 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                            } else {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                            c2.u uVar4 = c2.u.f22885a;
                            u4.d dVarA4 = e1.a(t62.b.f162798a);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            p3.m mVar12 = mVar2;
                            y0.b(dVarA4, "", x2.q(aVar8, j92.b.f97901d.f97904c), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar2).f().e()), mVar12, 48, 56);
                            mVar2 = mVar12;
                            mVar2.y();
                            mVar2.f();
                            rVar2 = this;
                        } else if (z38) {
                            mVar2.C(1270070001);
                            objQ = mVar2.q();
                            aVar6.getClass();
                            c2565a = p3.m.a.f135155b;
                            if (objQ == c2565a) {
                                objQ = p3.p0.n(Boolean.FALSE);
                                mVar2.K(objQ);
                            }
                            p1Var = (p1) objQ;
                            h4.r.a aVar19 = h4.r.S;
                            h4.d.f81522a.getClass();
                            h4.g.a aVar110 = h4.d.a.f81538p;
                            c2.j.f22691a.getClass();
                            zVarA3 = c2.y.a(c2.j.f22696f, aVar110, mVar2, 54);
                            x1 x1Var13 = p3.n.f135158a;
                            iHashCode5 = Long.hashCode(mVar2.getU());
                            i2VarX4 = mVar2.x();
                            rVarC5 = h4.k.c(aVar19, mVar2);
                            h5.g.V.getClass();
                            aVar7 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA3, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX4, mVar2);
                            bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                            } else {
                                v.h.z(iHashCode5, mVar2, iHashCode5, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC5, mVar2);
                            c2.b0 b0Var9 = c2.b0.f22601a;
                            objQ2 = mVar2.q();
                            if (objQ2 == c2565a) {
                                objQ2 = new x91.d(p1Var, 28);
                                mVar2.K(objQ2);
                            }
                            rVar2 = this;
                            h7.a((e23.a) objQ2, null, false, null, null, z3.f.c(-1057624290, new t1(i14, i15, i0Var, lVar2, lVar3, lVar4, lVar5, eVar3, b0Var, p1Var, nVar6, z18, z34), mVar2), mVar2, 1572870, 62);
                            mVar2.y();
                            mVar2.f();
                        } else {
                            rVar2 = this;
                            mVar2.C(1275984956);
                            mVar2.f();
                        }
                        mVar2.y();
                        str6 = str2;
                        if (str6 != null) {
                            mVar2.C(1958680800);
                            mVar2.f();
                        } else {
                            mVar2.C(1958680800);
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        x1 x1Var14 = p3.n.f135158a;
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, 12582912, 120);
            o0Var.g0(true);
            z26 = z35;
            nVar2 = nVar4;
            z24 = z29;
            z25 = z34;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            nVar2 = nVar;
            z24 = z15;
            z25 = z16;
            z26 = z19;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: yg2.s
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    int iT2 = p3.p0.t(i17);
                    t.a(j8, str, eVar, cVar, str2, nVar2, z26, z24, z25, i14, i0Var, b0Var, i15, lVar, z17, lVar2, lVar3, lVar4, lVar5, z18, (p3.m) obj, iT, iT2, i18);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }
}
