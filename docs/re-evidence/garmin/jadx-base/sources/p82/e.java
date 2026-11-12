package p82;

import c2.j;
import c2.u;
import c2.x2;
import e2.f0;
import e2.i0;
import e2.k0;
import e23.l;
import e23.p;
import e23.q;
import f5.z0;
import g6.f;
import h2.j0;
import h4.g;
import h4.k;
import h5.e0;
import j23.t;
import o13.r;
import o4.d0;
import o4.r1;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f136426a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.indicator.HorizontalPagerIndicatorKt$HorizontalPagerIndicator$1$1", f = "HorizontalPagerIndicator.kt", l = {69, 71}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f136428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f136429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, i0 i0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f136428b = j0Var;
            this.f136429c = i0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f136428b, this.f136429c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (e2.i0.f(r1, r7 - 3, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        
            if (e2.i0.f(r1, r7, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136427a;
            if (i14 == 0) {
                r.b(obj);
                int iL = this.f136428b.l();
                i0 i0Var = this.f136429c;
                int iH = i0Var.h();
                if (iL > iH + 3) {
                    this.f136427a = 1;
                } else if (iL <= iH + 1) {
                    int i15 = iL - 1;
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    this.f136427a = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.indicator.HorizontalPagerIndicatorKt$HorizontalPagerIndicator$2$1", f = "HorizontalPagerIndicator.kt", l = {81}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f136431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f136432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, int i14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f136431b = j0Var;
            this.f136432c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f136431b, this.f136432c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136430a;
            if (i14 == 0) {
                r.b(obj);
                this.f136430a = 1;
                if (j0.w(this.f136431b, this.f136432c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        f.a aVar = f.f75994b;
        f136426a = 4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01db  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:110:0x0203  */
    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:114:0x020d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:0x0218  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:126:0x024f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0277  */
    /* JADX WARN: Code duplicated, block: B:131:0x027c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0280  */
    /* JADX WARN: Code duplicated, block: B:134:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x0288  */
    /* JADX WARN: Code duplicated, block: B:138:0x028b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0291  */
    /* JADX WARN: Code duplicated, block: B:142:0x0294  */
    /* JADX WARN: Code duplicated, block: B:145:0x029a  */
    /* JADX WARN: Code duplicated, block: B:146:0x029d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:154:0x0326  */
    /* JADX WARN: Code duplicated, block: B:157:0x033f  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final j0 j0Var, h4.r rVar, final int i14, int i15, long j8, long j14, float f14, float f15, float f16, r1 r1Var, m mVar, final int i16, final int i17) {
        int i18;
        h4.r rVar2;
        int i19;
        int i24;
        int i25;
        int i26;
        boolean z14;
        final long j15;
        final float f17;
        final r1 r1Var2;
        final h4.r rVar3;
        final int i27;
        o0 o0Var;
        final long j16;
        final float f18;
        final float f19;
        p2 p2VarI0;
        int i28;
        r1 r1Var3;
        long j17;
        float f22;
        h4.r rVar4;
        int i29;
        float f24;
        float f25;
        long j18;
        int i30;
        boolean z15;
        int i34;
        boolean z16;
        int i35;
        final float f26;
        boolean z17;
        boolean z18;
        Object objQ;
        m.a aVar;
        final float f27;
        int i36;
        boolean z19;
        boolean z24;
        Object objQ2;
        long j19;
        int i37;
        i0 i0VarA;
        int i38;
        final long j24;
        boolean z25;
        boolean zB;
        Object objQ3;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objQ4;
        Object objQ5;
        m.a.C2565a c2565a;
        final x3 x3Var;
        Object objQ6;
        final x3 x3Var2;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        final long j25;
        final r1 r1Var4;
        boolean zL;
        Object objQ7;
        i0 i0Var;
        float f28;
        float f29;
        float f34;
        long j26;
        long j27;
        int i39;
        j0Var.getClass();
        o0 o0VarE = mVar.E(222460985);
        if ((i16 & 6) == 0) {
            i18 = (o0VarE.B(j0Var) ? 4 : 2) | i16;
        } else {
            i18 = i16;
        }
        int i44 = i17 & 2;
        if (i44 == 0) {
            if ((i16 & 48) == 0) {
                rVar2 = rVar;
                i18 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            if ((i16 & 384) == 0) {
                if (o0VarE.k(i14)) {
                    i39 = 256;
                } else {
                    i39 = 128;
                }
                i18 |= i39;
            }
            i19 = i17 & 8;
            if (i19 != 0) {
                if ((i16 & 3072) == 0) {
                    i24 = i15;
                    if (o0VarE.k(i24)) {
                        i25 = 2048;
                    } else {
                        i25 = 1024;
                    }
                    i18 |= i25;
                }
                if ((i16 & 24576) == 0) {
                    i18 |= 8192;
                }
                if ((196608 & i16) == 0) {
                    i18 |= 65536;
                }
                i26 = 114819072 | i18;
                if ((805306368 & i16) == 0) {
                    i26 = 383254528 | i18;
                }
                if ((306783379 & i26) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i26 & 1, z14)) {
                    o0VarE.G0();
                    if ((i16 & 1) != 0 || o0VarE.o0()) {
                        if (i44 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if (i19 != 0) {
                            i24 = 0;
                        }
                        d92.b bVar = d92.b.f58623a;
                        bVar.getClass();
                        long jA = d92.b.a(o0VarE).b().a().a();
                        bVar.getClass();
                        int i45 = i24;
                        long j28 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                        f.a aVar2 = f.f75994b;
                        i28 = i26 & (-1879564289);
                        r1Var3 = k2.i.f102406a;
                        j17 = j28;
                        f22 = 8;
                        rVar4 = rVar2;
                        i29 = i45;
                        f24 = 4;
                        f25 = 6;
                        j18 = jA;
                    } else {
                        o0VarE.e();
                        f22 = f14;
                        f25 = f15;
                        f24 = f16;
                        r1Var3 = r1Var;
                        i28 = i26 & (-1879564289);
                        rVar4 = rVar2;
                        i29 = i24;
                        j18 = j8;
                        j17 = j14;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    i30 = i28 & 3670016;
                    if (i30 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i34 = i28 & 29360128;
                    if (i34 == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z38 = z15 | z16;
                    i35 = i28 & 234881024;
                    f26 = f22;
                    if (i35 == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z38 | z17;
                    objQ = o0VarE.q();
                    aVar = m.f135153a;
                    if (z18) {
                        objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                            o0VarE.K(objQ);
                        }
                    }
                    f27 = ((f) objQ).f75997a;
                    boolean zI = o0VarE.i(f27);
                    i36 = i28 & 896;
                    if (i36 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zI | z19;
                    objQ2 = o0VarE.q();
                    float f35 = f136426a;
                    if (z24) {
                        j19 = j17;
                    } else {
                        aVar.getClass();
                        j19 = j17;
                        if (objQ2 == m.a.f135155b) {
                        }
                        float f36 = ((f) objQ2).f75997a;
                        i0VarA = k0.a(0, 0, 3, o0VarE);
                        Integer numValueOf = Integer.valueOf(j0Var.l());
                        i38 = i28 & 14;
                        j24 = j18;
                        if (i38 == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zB = z25 | o0VarE.B(i0VarA);
                        objQ3 = o0VarE.q();
                        if (zB) {
                            objQ3 = new a(j0Var, i0VarA, null);
                            o0VarE.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new a(j0Var, i0VarA, null);
                                o0VarE.K(objQ3);
                            }
                        }
                        l0.e((p) objQ3, numValueOf, o0VarE);
                        Boolean bool = Boolean.TRUE;
                        if (i38 == 4) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if ((i28 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z26 | z27;
                        objQ4 = o0VarE.q();
                        if (z28) {
                            objQ4 = new b(j0Var, i29, null);
                            o0VarE.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new b(j0Var, i29, null);
                                o0VarE.K(objQ4);
                            }
                        }
                        l0.e((p) objQ4, bool, o0VarE);
                        objQ5 = o0VarE.q();
                        aVar.getClass();
                        c2565a = m.a.f135155b;
                        if (objQ5 == c2565a) {
                            objQ5 = p0.f(new ct1.c(i0VarA, 8));
                            o0VarE.K(objQ5);
                        }
                        x3Var = (x3) objQ5;
                        objQ6 = o0VarE.q();
                        if (objQ6 == c2565a) {
                            objQ6 = p0.f(new by1.h(x3Var, 11));
                            o0VarE.K(objQ6);
                        }
                        x3Var2 = (x3) objQ6;
                        h4.r rVarU = x2.u(rVar4, f36);
                        h4.d.f81522a.getClass();
                        g.b bVar2 = h4.d.a.f81534l;
                        j.f22691a.getClass();
                        j.i iVarI = j.i(f35);
                        if (i36 == 256) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        if (i35 == 67108864) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z39 = z34 | z29;
                        if (i38 == 4) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z44 = z35 | z39;
                        if (i30 == 1048576) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        boolean z45 = z36 | z44;
                        if (i34 == 8388608) {
                            z37 = true;
                        } else {
                            z37 = false;
                        }
                        boolean zI2 = z45 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                        h4.r rVar5 = rVar4;
                        j25 = j19;
                        r1Var4 = r1Var3;
                        zL = zI2 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                        objQ7 = o0VarE.q();
                        if (!zL || objQ7 == c2565a) {
                            final float f37 = f24;
                            i0Var = i0VarA;
                            final float f38 = f25;
                            l lVar = new l() { // from class: p82.a
                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    f0 f0Var = (f0) obj;
                                    f0Var.getClass();
                                    final int i46 = 0;
                                    while (true) {
                                        final int i47 = i14;
                                        if (i46 >= i47) {
                                            return Unit.INSTANCE;
                                        }
                                        Integer numValueOf2 = Integer.valueOf(i46);
                                        final float f39 = f37;
                                        final j0 j0Var2 = j0Var;
                                        final float f44 = f26;
                                        final float f45 = f38;
                                        final float f46 = f27;
                                        final long j29 = j24;
                                        final long j34 = j25;
                                        final r1 r1Var5 = r1Var4;
                                        final x3 x3Var3 = x3Var;
                                        final x3 x3Var4 = x3Var2;
                                        f0.b(f0Var, numValueOf2, new z3.e(1602812200, true, new q() { // from class: p82.c
                                            @Override // e23.q
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                float f47;
                                                m mVar2 = (m) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((e2.d) obj2).getClass();
                                                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    x1 x1Var2 = n.f135158a;
                                                    int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                    int i48 = i46;
                                                    j0 j0Var3 = j0Var2;
                                                    if ((i48 != iIntValue2 || i48 <= 0) && (i48 != ((Number) x3Var4.getF182175a()).intValue() || i48 >= i47 - 1)) {
                                                        f47 = i48 == j0Var3.l() ? f44 : f45;
                                                    } else {
                                                        f47 = f39;
                                                    }
                                                    e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i48 ? j29 : j34, r1Var5, mVar2, 0);
                                                } else {
                                                    mVar2.e();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }), 2);
                                        i46++;
                                    }
                                }
                            };
                            f28 = f37;
                            f29 = f26;
                            f34 = f38;
                            j26 = j24;
                            j27 = j25;
                            o0VarE.K(lVar);
                            objQ7 = lVar;
                        } else {
                            j27 = j25;
                            j26 = j24;
                            f34 = f25;
                            f28 = f24;
                            f29 = f26;
                            i0Var = i0VarA;
                        }
                        e2.c.c(rVarU, i0Var, null, iVarI, bVar2, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                        o0Var = o0VarE;
                        f18 = f29;
                        i27 = i29;
                        rVar3 = rVar5;
                        f19 = f34;
                        f17 = f28;
                        r1Var2 = r1Var4;
                        j16 = j26;
                        j15 = j27;
                    }
                    int iE = t.e(i14, 0, 5);
                    float f39 = iE * f27;
                    i37 = iE - 1;
                    if (i37 < 0) {
                        i37 = 0;
                    }
                    objQ2 = f.a((i37 * f35) + f39);
                    o0VarE.K(objQ2);
                    float f310 = ((f) objQ2).f75997a;
                    i0VarA = k0.a(0, 0, 3, o0VarE);
                    Integer numValueOf2 = Integer.valueOf(j0Var.l());
                    i38 = i28 & 14;
                    j24 = j18;
                    if (i38 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zB = z25 | o0VarE.B(i0VarA);
                    objQ3 = o0VarE.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new a(j0Var, i0VarA, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                    l0.e((p) objQ3, numValueOf2, o0VarE);
                    Boolean bool2 = Boolean.TRUE;
                    if (i38 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i28 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z26 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new b(j0Var, i29, null);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                    l0.e((p) objQ4, bool2, o0VarE);
                    objQ5 = o0VarE.q();
                    aVar.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = p0.f(new ct1.c(i0VarA, 8));
                        o0VarE.K(objQ5);
                    }
                    x3Var = (x3) objQ5;
                    objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = p0.f(new by1.h(x3Var, 11));
                        o0VarE.K(objQ6);
                    }
                    x3Var2 = (x3) objQ6;
                    h4.r rVarU2 = x2.u(rVar4, f310);
                    h4.d.f81522a.getClass();
                    g.b bVar3 = h4.d.a.f81534l;
                    j.f22691a.getClass();
                    j.i iVarI2 = j.i(f35);
                    if (i36 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i35 == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z310 = z34 | z29;
                    if (i38 == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z46 = z35 | z310;
                    if (i30 == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z47 = z36 | z46;
                    if (i34 == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean zI3 = z47 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                    h4.r rVar6 = rVar4;
                    j25 = j19;
                    r1Var4 = r1Var3;
                    zL = zI3 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                    objQ7 = o0VarE.q();
                    if (zL) {
                        final float f311 = f24;
                        i0Var = i0VarA;
                        final float f312 = f25;
                        l lVar2 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i46 = 0;
                                while (true) {
                                    final int i47 = i14;
                                    if (i46 >= i47) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i46);
                                    final float f313 = f311;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f312;
                                    final float f46 = f27;
                                    final long j29 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf3, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var2 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i48 = i46;
                                                j0 j0Var3 = j0Var2;
                                                if ((i48 != iIntValue2 || i48 <= 0) && (i48 != ((Number) x3Var4.getF182175a()).intValue() || i48 >= i47 - 1)) {
                                                    f47 = i48 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f313;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i48 ? j29 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i46++;
                                }
                            }
                        };
                        f28 = f311;
                        f29 = f26;
                        f34 = f312;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar2);
                        objQ7 = lVar2;
                    } else {
                        final float f313 = f24;
                        i0Var = i0VarA;
                        final float f314 = f25;
                        l lVar3 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i46 = 0;
                                while (true) {
                                    final int i47 = i14;
                                    if (i46 >= i47) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf3 = Integer.valueOf(i46);
                                    final float f315 = f313;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f314;
                                    final float f46 = f27;
                                    final long j29 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf3, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var2 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i48 = i46;
                                                j0 j0Var3 = j0Var2;
                                                if ((i48 != iIntValue2 || i48 <= 0) && (i48 != ((Number) x3Var4.getF182175a()).intValue() || i48 >= i47 - 1)) {
                                                    f47 = i48 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f315;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i48 ? j29 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i46++;
                                }
                            }
                        };
                        f28 = f313;
                        f29 = f26;
                        f34 = f314;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar3);
                        objQ7 = lVar3;
                    }
                    e2.c.c(rVarU2, i0Var, null, iVarI2, bVar3, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                    o0Var = o0VarE;
                    f18 = f29;
                    i27 = i29;
                    rVar3 = rVar6;
                    f19 = f34;
                    f17 = f28;
                    r1Var2 = r1Var4;
                    j16 = j26;
                    j15 = j27;
                } else {
                    o0VarE.e();
                    j15 = j14;
                    f17 = f16;
                    r1Var2 = r1Var;
                    rVar3 = rVar2;
                    i27 = i24;
                    o0Var = o0VarE;
                    j16 = j8;
                    f18 = f14;
                    f19 = f15;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new p() { // from class: p82.b
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i16 | 1);
                            e.a(j0Var, rVar3, i14, i27, j16, j15, f18, f19, f17, r1Var2, (m) obj, iT, i17);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i18 |= 3072;
            i24 = i15;
            if ((i16 & 24576) == 0) {
                i18 |= 8192;
            }
            if ((196608 & i16) == 0) {
                i18 |= 65536;
            }
            i26 = 114819072 | i18;
            if ((805306368 & i16) == 0) {
                i26 = 383254528 | i18;
            }
            if ((306783379 & i26) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i26 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i44 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i19 != 0) {
                        i24 = 0;
                    }
                    d92.b bVar4 = d92.b.f58623a;
                    bVar4.getClass();
                    long jA2 = d92.b.a(o0VarE).b().a().a();
                    bVar4.getClass();
                    int i46 = i24;
                    long j29 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                    f.a aVar3 = f.f75994b;
                    i28 = i26 & (-1879564289);
                    r1Var3 = k2.i.f102406a;
                    j17 = j29;
                    f22 = 8;
                    rVar4 = rVar2;
                    i29 = i46;
                    f24 = 4;
                    f25 = 6;
                    j18 = jA2;
                } else {
                    if (i44 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i19 != 0) {
                        i24 = 0;
                    }
                    d92.b bVar5 = d92.b.f58623a;
                    bVar5.getClass();
                    long jA3 = d92.b.a(o0VarE).b().a().a();
                    bVar5.getClass();
                    int i47 = i24;
                    long j210 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                    f.a aVar4 = f.f75994b;
                    i28 = i26 & (-1879564289);
                    r1Var3 = k2.i.f102406a;
                    j17 = j210;
                    f22 = 8;
                    rVar4 = rVar2;
                    i29 = i47;
                    f24 = 4;
                    f25 = 6;
                    j18 = jA3;
                }
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                i30 = i28 & 3670016;
                if (i30 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i34 = i28 & 29360128;
                if (i34 == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z311 = z15 | z16;
                i35 = i28 & 234881024;
                f26 = f22;
                if (i35 == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z311 | z17;
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (z18) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                    o0VarE.K(objQ);
                }
                f27 = ((f) objQ).f75997a;
                boolean zI4 = o0VarE.i(f27);
                i36 = i28 & 896;
                if (i36 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zI4 | z19;
                objQ2 = o0VarE.q();
                float f315 = f136426a;
                if (z24) {
                    aVar.getClass();
                    j19 = j17;
                    if (objQ2 == m.a.f135155b) {
                    }
                    float f316 = ((f) objQ2).f75997a;
                    i0VarA = k0.a(0, 0, 3, o0VarE);
                    Integer numValueOf3 = Integer.valueOf(j0Var.l());
                    i38 = i28 & 14;
                    j24 = j18;
                    if (i38 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zB = z25 | o0VarE.B(i0VarA);
                    objQ3 = o0VarE.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new a(j0Var, i0VarA, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                    l0.e((p) objQ3, numValueOf3, o0VarE);
                    Boolean bool3 = Boolean.TRUE;
                    if (i38 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i28 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z26 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new b(j0Var, i29, null);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                    l0.e((p) objQ4, bool3, o0VarE);
                    objQ5 = o0VarE.q();
                    aVar.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = p0.f(new ct1.c(i0VarA, 8));
                        o0VarE.K(objQ5);
                    }
                    x3Var = (x3) objQ5;
                    objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = p0.f(new by1.h(x3Var, 11));
                        o0VarE.K(objQ6);
                    }
                    x3Var2 = (x3) objQ6;
                    h4.r rVarU3 = x2.u(rVar4, f316);
                    h4.d.f81522a.getClass();
                    g.b bVar6 = h4.d.a.f81534l;
                    j.f22691a.getClass();
                    j.i iVarI3 = j.i(f315);
                    if (i36 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i35 == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z312 = z34 | z29;
                    if (i38 == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z48 = z35 | z312;
                    if (i30 == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z49 = z36 | z48;
                    if (i34 == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean zI5 = z49 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                    h4.r rVar7 = rVar4;
                    j25 = j19;
                    r1Var4 = r1Var3;
                    zL = zI5 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                    objQ7 = o0VarE.q();
                    if (zL) {
                        final float f317 = f24;
                        i0Var = i0VarA;
                        final float f318 = f25;
                        l lVar4 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i48 = 0;
                                while (true) {
                                    final int i49 = i14;
                                    if (i48 >= i49) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf4 = Integer.valueOf(i48);
                                    final float f319 = f317;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f318;
                                    final float f46 = f27;
                                    final long j211 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf4, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i410 = i48;
                                                j0 j0Var3 = j0Var2;
                                                if ((i410 != iIntValue2 || i410 <= 0) && (i410 != ((Number) x3Var4.getF182175a()).intValue() || i410 >= i49 - 1)) {
                                                    f47 = i410 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f319;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i410 ? j211 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i48++;
                                }
                            }
                        };
                        f28 = f317;
                        f29 = f26;
                        f34 = f318;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar4);
                        objQ7 = lVar4;
                    } else {
                        final float f319 = f24;
                        i0Var = i0VarA;
                        final float f3110 = f25;
                        l lVar5 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i48 = 0;
                                while (true) {
                                    final int i49 = i14;
                                    if (i48 >= i49) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf4 = Integer.valueOf(i48);
                                    final float f3111 = f319;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f3110;
                                    final float f46 = f27;
                                    final long j211 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf4, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var3 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i410 = i48;
                                                j0 j0Var3 = j0Var2;
                                                if ((i410 != iIntValue2 || i410 <= 0) && (i410 != ((Number) x3Var4.getF182175a()).intValue() || i410 >= i49 - 1)) {
                                                    f47 = i410 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f3111;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i410 ? j211 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i48++;
                                }
                            }
                        };
                        f28 = f319;
                        f29 = f26;
                        f34 = f3110;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar5);
                        objQ7 = lVar5;
                    }
                    e2.c.c(rVarU3, i0Var, null, iVarI3, bVar6, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                    o0Var = o0VarE;
                    f18 = f29;
                    i27 = i29;
                    rVar3 = rVar7;
                    f19 = f34;
                    f17 = f28;
                    r1Var2 = r1Var4;
                    j16 = j26;
                    j15 = j27;
                } else {
                    j19 = j17;
                }
                int iE2 = t.e(i14, 0, 5);
                float f320 = iE2 * f27;
                i37 = iE2 - 1;
                if (i37 < 0) {
                    i37 = 0;
                }
                objQ2 = f.a((i37 * f315) + f320);
                o0VarE.K(objQ2);
                float f3111 = ((f) objQ2).f75997a;
                i0VarA = k0.a(0, 0, 3, o0VarE);
                Integer numValueOf4 = Integer.valueOf(j0Var.l());
                i38 = i28 & 14;
                j24 = j18;
                if (i38 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zB = z25 | o0VarE.B(i0VarA);
                objQ3 = o0VarE.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new a(j0Var, i0VarA, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, numValueOf4, o0VarE);
                Boolean bool4 = Boolean.TRUE;
                if (i38 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i28 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z26 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new b(j0Var, i29, null);
                    o0VarE.K(objQ4);
                }
                l0.e((p) objQ4, bool4, o0VarE);
                objQ5 = o0VarE.q();
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ5 == c2565a) {
                    objQ5 = p0.f(new ct1.c(i0VarA, 8));
                    o0VarE.K(objQ5);
                }
                x3Var = (x3) objQ5;
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = p0.f(new by1.h(x3Var, 11));
                    o0VarE.K(objQ6);
                }
                x3Var2 = (x3) objQ6;
                h4.r rVarU4 = x2.u(rVar4, f3111);
                h4.d.f81522a.getClass();
                g.b bVar7 = h4.d.a.f81534l;
                j.f22691a.getClass();
                j.i iVarI4 = j.i(f315);
                if (i36 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i35 == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z313 = z34 | z29;
                if (i38 == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z410 = z35 | z313;
                if (i30 == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z411 = z36 | z410;
                if (i34 == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean zI6 = z411 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                h4.r rVar8 = rVar4;
                j25 = j19;
                r1Var4 = r1Var3;
                zL = zI6 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                objQ7 = o0VarE.q();
                if (zL) {
                    final float f3112 = f24;
                    i0Var = i0VarA;
                    final float f3113 = f25;
                    l lVar6 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i48 = 0;
                            while (true) {
                                final int i49 = i14;
                                if (i48 >= i49) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf5 = Integer.valueOf(i48);
                                final float f3114 = f3112;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f3113;
                                final float f46 = f27;
                                final long j211 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf5, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var3 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i410 = i48;
                                            j0 j0Var3 = j0Var2;
                                            if ((i410 != iIntValue2 || i410 <= 0) && (i410 != ((Number) x3Var4.getF182175a()).intValue() || i410 >= i49 - 1)) {
                                                f47 = i410 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f3114;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i410 ? j211 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i48++;
                            }
                        }
                    };
                    f28 = f3112;
                    f29 = f26;
                    f34 = f3113;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar6);
                    objQ7 = lVar6;
                } else {
                    final float f3114 = f24;
                    i0Var = i0VarA;
                    final float f3115 = f25;
                    l lVar7 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i48 = 0;
                            while (true) {
                                final int i49 = i14;
                                if (i48 >= i49) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf5 = Integer.valueOf(i48);
                                final float f3116 = f3114;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f3115;
                                final float f46 = f27;
                                final long j211 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf5, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var3 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i410 = i48;
                                            j0 j0Var3 = j0Var2;
                                            if ((i410 != iIntValue2 || i410 <= 0) && (i410 != ((Number) x3Var4.getF182175a()).intValue() || i410 >= i49 - 1)) {
                                                f47 = i410 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f3116;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i410 ? j211 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i48++;
                            }
                        }
                    };
                    f28 = f3114;
                    f29 = f26;
                    f34 = f3115;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar7);
                    objQ7 = lVar7;
                }
                e2.c.c(rVarU4, i0Var, null, iVarI4, bVar7, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                o0Var = o0VarE;
                f18 = f29;
                i27 = i29;
                rVar3 = rVar8;
                f19 = f34;
                f17 = f28;
                r1Var2 = r1Var4;
                j16 = j26;
                j15 = j27;
            } else {
                o0VarE.e();
                j15 = j14;
                f17 = f16;
                r1Var2 = r1Var;
                rVar3 = rVar2;
                i27 = i24;
                o0Var = o0VarE;
                j16 = j8;
                f18 = f14;
                f19 = f15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: p82.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i16 | 1);
                        e.a(j0Var, rVar3, i14, i27, j16, j15, f18, f19, f17, r1Var2, (m) obj, iT, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 48;
        rVar2 = rVar;
        if ((i16 & 384) == 0) {
            if (o0VarE.k(i14)) {
                i39 = 256;
            } else {
                i39 = 128;
            }
            i18 |= i39;
        }
        i19 = i17 & 8;
        if (i19 != 0) {
            if ((i16 & 3072) == 0) {
                i24 = i15;
                if (o0VarE.k(i24)) {
                    i25 = 2048;
                } else {
                    i25 = 1024;
                }
                i18 |= i25;
            }
            if ((i16 & 24576) == 0) {
                i18 |= 8192;
            }
            if ((196608 & i16) == 0) {
                i18 |= 65536;
            }
            i26 = 114819072 | i18;
            if ((805306368 & i16) == 0) {
                i26 = 383254528 | i18;
            }
            if ((306783379 & i26) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i26 & 1, z14)) {
                o0VarE.G0();
                if ((i16 & 1) != 0) {
                    if (i44 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i19 != 0) {
                        i24 = 0;
                    }
                    d92.b bVar8 = d92.b.f58623a;
                    bVar8.getClass();
                    long jA4 = d92.b.a(o0VarE).b().a().a();
                    bVar8.getClass();
                    int i48 = i24;
                    long j211 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                    f.a aVar5 = f.f75994b;
                    i28 = i26 & (-1879564289);
                    r1Var3 = k2.i.f102406a;
                    j17 = j211;
                    f22 = 8;
                    rVar4 = rVar2;
                    i29 = i48;
                    f24 = 4;
                    f25 = 6;
                    j18 = jA4;
                } else {
                    if (i44 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if (i19 != 0) {
                        i24 = 0;
                    }
                    d92.b bVar9 = d92.b.f58623a;
                    bVar9.getClass();
                    long jA5 = d92.b.a(o0VarE).b().a().a();
                    bVar9.getClass();
                    int i49 = i24;
                    long j212 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                    f.a aVar6 = f.f75994b;
                    i28 = i26 & (-1879564289);
                    r1Var3 = k2.i.f102406a;
                    j17 = j212;
                    f22 = 8;
                    rVar4 = rVar2;
                    i29 = i49;
                    f24 = 4;
                    f25 = 6;
                    j18 = jA5;
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                i30 = i28 & 3670016;
                if (i30 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i34 = i28 & 29360128;
                if (i34 == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z314 = z15 | z16;
                i35 = i28 & 234881024;
                f26 = f22;
                if (i35 == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z314 | z17;
                objQ = o0VarE.q();
                aVar = m.f135153a;
                if (z18) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                    o0VarE.K(objQ);
                }
                f27 = ((f) objQ).f75997a;
                boolean zI7 = o0VarE.i(f27);
                i36 = i28 & 896;
                if (i36 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zI7 | z19;
                objQ2 = o0VarE.q();
                float f3116 = f136426a;
                if (z24) {
                    aVar.getClass();
                    j19 = j17;
                    if (objQ2 == m.a.f135155b) {
                    }
                    float f3117 = ((f) objQ2).f75997a;
                    i0VarA = k0.a(0, 0, 3, o0VarE);
                    Integer numValueOf5 = Integer.valueOf(j0Var.l());
                    i38 = i28 & 14;
                    j24 = j18;
                    if (i38 == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zB = z25 | o0VarE.B(i0VarA);
                    objQ3 = o0VarE.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new a(j0Var, i0VarA, null);
                            o0VarE.K(objQ3);
                        }
                    } else {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                    l0.e((p) objQ3, numValueOf5, o0VarE);
                    Boolean bool5 = Boolean.TRUE;
                    if (i38 == 4) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i28 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z26 | z27;
                    objQ4 = o0VarE.q();
                    if (z28) {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new b(j0Var, i29, null);
                            o0VarE.K(objQ4);
                        }
                    } else {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                    l0.e((p) objQ4, bool5, o0VarE);
                    objQ5 = o0VarE.q();
                    aVar.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = p0.f(new ct1.c(i0VarA, 8));
                        o0VarE.K(objQ5);
                    }
                    x3Var = (x3) objQ5;
                    objQ6 = o0VarE.q();
                    if (objQ6 == c2565a) {
                        objQ6 = p0.f(new by1.h(x3Var, 11));
                        o0VarE.K(objQ6);
                    }
                    x3Var2 = (x3) objQ6;
                    h4.r rVarU5 = x2.u(rVar4, f3117);
                    h4.d.f81522a.getClass();
                    g.b bVar10 = h4.d.a.f81534l;
                    j.f22691a.getClass();
                    j.i iVarI5 = j.i(f3116);
                    if (i36 == 256) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i35 == 67108864) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z315 = z34 | z29;
                    if (i38 == 4) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    boolean z412 = z35 | z315;
                    if (i30 == 1048576) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    boolean z413 = z36 | z412;
                    if (i34 == 8388608) {
                        z37 = true;
                    } else {
                        z37 = false;
                    }
                    boolean zI8 = z413 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                    h4.r rVar9 = rVar4;
                    j25 = j19;
                    r1Var4 = r1Var3;
                    zL = zI8 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                    objQ7 = o0VarE.q();
                    if (zL) {
                        final float f3118 = f24;
                        i0Var = i0VarA;
                        final float f3119 = f25;
                        l lVar8 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i410 = 0;
                                while (true) {
                                    final int i411 = i14;
                                    if (i410 >= i411) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf6 = Integer.valueOf(i410);
                                    final float f31110 = f3118;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f3119;
                                    final float f46 = f27;
                                    final long j213 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf6, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var4 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i412 = i410;
                                                j0 j0Var3 = j0Var2;
                                                if ((i412 != iIntValue2 || i412 <= 0) && (i412 != ((Number) x3Var4.getF182175a()).intValue() || i412 >= i411 - 1)) {
                                                    f47 = i412 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f31110;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i412 ? j213 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i410++;
                                }
                            }
                        };
                        f28 = f3118;
                        f29 = f26;
                        f34 = f3119;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar8);
                        objQ7 = lVar8;
                    } else {
                        final float f31110 = f24;
                        i0Var = i0VarA;
                        final float f31111 = f25;
                        l lVar9 = new l() { // from class: p82.a
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f0 f0Var = (f0) obj;
                                f0Var.getClass();
                                final int i410 = 0;
                                while (true) {
                                    final int i411 = i14;
                                    if (i410 >= i411) {
                                        return Unit.INSTANCE;
                                    }
                                    Integer numValueOf6 = Integer.valueOf(i410);
                                    final float f31112 = f31110;
                                    final j0 j0Var2 = j0Var;
                                    final float f44 = f26;
                                    final float f45 = f31111;
                                    final float f46 = f27;
                                    final long j213 = j24;
                                    final long j34 = j25;
                                    final r1 r1Var5 = r1Var4;
                                    final x3 x3Var3 = x3Var;
                                    final x3 x3Var4 = x3Var2;
                                    f0.b(f0Var, numValueOf6, new z3.e(1602812200, true, new q() { // from class: p82.c
                                        @Override // e23.q
                                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                            float f47;
                                            m mVar2 = (m) obj3;
                                            int iIntValue = ((Integer) obj4).intValue();
                                            ((e2.d) obj2).getClass();
                                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                x1 x1Var4 = n.f135158a;
                                                int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                                int i412 = i410;
                                                j0 j0Var3 = j0Var2;
                                                if ((i412 != iIntValue2 || i412 <= 0) && (i412 != ((Number) x3Var4.getF182175a()).intValue() || i412 >= i411 - 1)) {
                                                    f47 = i412 == j0Var3.l() ? f44 : f45;
                                                } else {
                                                    f47 = f31112;
                                                }
                                                e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i412 ? j213 : j34, r1Var5, mVar2, 0);
                                            } else {
                                                mVar2.e();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }), 2);
                                    i410++;
                                }
                            }
                        };
                        f28 = f31110;
                        f29 = f26;
                        f34 = f31111;
                        j26 = j24;
                        j27 = j25;
                        o0VarE.K(lVar9);
                        objQ7 = lVar9;
                    }
                    e2.c.c(rVarU5, i0Var, null, iVarI5, bVar10, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                    o0Var = o0VarE;
                    f18 = f29;
                    i27 = i29;
                    rVar3 = rVar9;
                    f19 = f34;
                    f17 = f28;
                    r1Var2 = r1Var4;
                    j16 = j26;
                    j15 = j27;
                } else {
                    j19 = j17;
                }
                int iE3 = t.e(i14, 0, 5);
                float f321 = iE3 * f27;
                i37 = iE3 - 1;
                if (i37 < 0) {
                    i37 = 0;
                }
                objQ2 = f.a((i37 * f3116) + f321);
                o0VarE.K(objQ2);
                float f31112 = ((f) objQ2).f75997a;
                i0VarA = k0.a(0, 0, 3, o0VarE);
                Integer numValueOf6 = Integer.valueOf(j0Var.l());
                i38 = i28 & 14;
                j24 = j18;
                if (i38 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zB = z25 | o0VarE.B(i0VarA);
                objQ3 = o0VarE.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new a(j0Var, i0VarA, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, numValueOf6, o0VarE);
                Boolean bool6 = Boolean.TRUE;
                if (i38 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i28 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z26 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new b(j0Var, i29, null);
                    o0VarE.K(objQ4);
                }
                l0.e((p) objQ4, bool6, o0VarE);
                objQ5 = o0VarE.q();
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ5 == c2565a) {
                    objQ5 = p0.f(new ct1.c(i0VarA, 8));
                    o0VarE.K(objQ5);
                }
                x3Var = (x3) objQ5;
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = p0.f(new by1.h(x3Var, 11));
                    o0VarE.K(objQ6);
                }
                x3Var2 = (x3) objQ6;
                h4.r rVarU6 = x2.u(rVar4, f31112);
                h4.d.f81522a.getClass();
                g.b bVar11 = h4.d.a.f81534l;
                j.f22691a.getClass();
                j.i iVarI6 = j.i(f3116);
                if (i36 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i35 == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z316 = z34 | z29;
                if (i38 == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z414 = z35 | z316;
                if (i30 == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z415 = z36 | z414;
                if (i34 == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean zI9 = z415 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                h4.r rVar10 = rVar4;
                j25 = j19;
                r1Var4 = r1Var3;
                zL = zI9 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                objQ7 = o0VarE.q();
                if (zL) {
                    final float f31113 = f24;
                    i0Var = i0VarA;
                    final float f31114 = f25;
                    l lVar10 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i410 = 0;
                            while (true) {
                                final int i411 = i14;
                                if (i410 >= i411) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf7 = Integer.valueOf(i410);
                                final float f31115 = f31113;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f31114;
                                final float f46 = f27;
                                final long j213 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf7, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i412 = i410;
                                            j0 j0Var3 = j0Var2;
                                            if ((i412 != iIntValue2 || i412 <= 0) && (i412 != ((Number) x3Var4.getF182175a()).intValue() || i412 >= i411 - 1)) {
                                                f47 = i412 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f31115;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i412 ? j213 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i410++;
                            }
                        }
                    };
                    f28 = f31113;
                    f29 = f26;
                    f34 = f31114;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar10);
                    objQ7 = lVar10;
                } else {
                    final float f31115 = f24;
                    i0Var = i0VarA;
                    final float f31116 = f25;
                    l lVar11 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i410 = 0;
                            while (true) {
                                final int i411 = i14;
                                if (i410 >= i411) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf7 = Integer.valueOf(i410);
                                final float f31117 = f31115;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f31116;
                                final float f46 = f27;
                                final long j213 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf7, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var4 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i412 = i410;
                                            j0 j0Var3 = j0Var2;
                                            if ((i412 != iIntValue2 || i412 <= 0) && (i412 != ((Number) x3Var4.getF182175a()).intValue() || i412 >= i411 - 1)) {
                                                f47 = i412 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f31117;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i412 ? j213 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i410++;
                            }
                        }
                    };
                    f28 = f31115;
                    f29 = f26;
                    f34 = f31116;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar11);
                    objQ7 = lVar11;
                }
                e2.c.c(rVarU6, i0Var, null, iVarI6, bVar11, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                o0Var = o0VarE;
                f18 = f29;
                i27 = i29;
                rVar3 = rVar10;
                f19 = f34;
                f17 = f28;
                r1Var2 = r1Var4;
                j16 = j26;
                j15 = j27;
            } else {
                o0VarE.e();
                j15 = j14;
                f17 = f16;
                r1Var2 = r1Var;
                rVar3 = rVar2;
                i27 = i24;
                o0Var = o0VarE;
                j16 = j8;
                f18 = f14;
                f19 = f15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: p82.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i16 | 1);
                        e.a(j0Var, rVar3, i14, i27, j16, j15, f18, f19, f17, r1Var2, (m) obj, iT, i17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 3072;
        i24 = i15;
        if ((i16 & 24576) == 0) {
            i18 |= 8192;
        }
        if ((196608 & i16) == 0) {
            i18 |= 65536;
        }
        i26 = 114819072 | i18;
        if ((805306368 & i16) == 0) {
            i26 = 383254528 | i18;
        }
        if ((306783379 & i26) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i26 & 1, z14)) {
            o0VarE.G0();
            if ((i16 & 1) != 0) {
                if (i44 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i19 != 0) {
                    i24 = 0;
                }
                d92.b bVar12 = d92.b.f58623a;
                bVar12.getClass();
                long jA6 = d92.b.a(o0VarE).b().a().a();
                bVar12.getClass();
                int i410 = i24;
                long j213 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                f.a aVar7 = f.f75994b;
                i28 = i26 & (-1879564289);
                r1Var3 = k2.i.f102406a;
                j17 = j213;
                f22 = 8;
                rVar4 = rVar2;
                i29 = i410;
                f24 = 4;
                f25 = 6;
                j18 = jA6;
            } else {
                if (i44 != 0) {
                    rVar2 = h4.r.S;
                }
                if (i19 != 0) {
                    i24 = 0;
                }
                d92.b bVar13 = d92.b.f58623a;
                bVar13.getClass();
                long jA7 = d92.b.a(o0VarE).b().a().a();
                bVar13.getClass();
                int i411 = i24;
                long j214 = ((d0) d92.b.a(o0VarE).b().a().f70002b.getF182175a()).f128833a;
                f.a aVar8 = f.f75994b;
                i28 = i26 & (-1879564289);
                r1Var3 = k2.i.f102406a;
                j17 = j214;
                f22 = 8;
                rVar4 = rVar2;
                i29 = i411;
                f24 = 4;
                f25 = 6;
                j18 = jA7;
            }
            o0VarE.h0();
            x1 x1Var4 = n.f135158a;
            i30 = i28 & 3670016;
            if (i30 == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            i34 = i28 & 29360128;
            if (i34 == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z317 = z15 | z16;
            i35 = i28 & 234881024;
            f26 = f22;
            if (i35 == 67108864) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z317 | z17;
            objQ = o0VarE.q();
            aVar = m.f135153a;
            if (z18) {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = f.a(((f) r13.b.d(f.a(f26), r13.b.d(f.a(f25), f.a(f24)))).f75997a);
                o0VarE.K(objQ);
            }
            f27 = ((f) objQ).f75997a;
            boolean zI10 = o0VarE.i(f27);
            i36 = i28 & 896;
            if (i36 == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zI10 | z19;
            objQ2 = o0VarE.q();
            float f31117 = f136426a;
            if (z24) {
                aVar.getClass();
                j19 = j17;
                if (objQ2 == m.a.f135155b) {
                }
                float f31118 = ((f) objQ2).f75997a;
                i0VarA = k0.a(0, 0, 3, o0VarE);
                Integer numValueOf7 = Integer.valueOf(j0Var.l());
                i38 = i28 & 14;
                j24 = j18;
                if (i38 == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zB = z25 | o0VarE.B(i0VarA);
                objQ3 = o0VarE.q();
                if (zB) {
                    aVar.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new a(j0Var, i0VarA, null);
                        o0VarE.K(objQ3);
                    }
                } else {
                    objQ3 = new a(j0Var, i0VarA, null);
                    o0VarE.K(objQ3);
                }
                l0.e((p) objQ3, numValueOf7, o0VarE);
                Boolean bool7 = Boolean.TRUE;
                if (i38 == 4) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i28 & 7168) == 2048) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z26 | z27;
                objQ4 = o0VarE.q();
                if (z28) {
                    aVar.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new b(j0Var, i29, null);
                        o0VarE.K(objQ4);
                    }
                } else {
                    objQ4 = new b(j0Var, i29, null);
                    o0VarE.K(objQ4);
                }
                l0.e((p) objQ4, bool7, o0VarE);
                objQ5 = o0VarE.q();
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ5 == c2565a) {
                    objQ5 = p0.f(new ct1.c(i0VarA, 8));
                    o0VarE.K(objQ5);
                }
                x3Var = (x3) objQ5;
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = p0.f(new by1.h(x3Var, 11));
                    o0VarE.K(objQ6);
                }
                x3Var2 = (x3) objQ6;
                h4.r rVarU7 = x2.u(rVar4, f31118);
                h4.d.f81522a.getClass();
                g.b bVar14 = h4.d.a.f81534l;
                j.f22691a.getClass();
                j.i iVarI7 = j.i(f31117);
                if (i36 == 256) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i35 == 67108864) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z318 = z34 | z29;
                if (i38 == 4) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                boolean z416 = z35 | z318;
                if (i30 == 1048576) {
                    z36 = true;
                } else {
                    z36 = false;
                }
                boolean z417 = z36 | z416;
                if (i34 == 8388608) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                boolean zI11 = z417 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
                h4.r rVar11 = rVar4;
                j25 = j19;
                r1Var4 = r1Var3;
                zL = zI11 | o0VarE.l(j25) | o0VarE.B(r1Var4);
                objQ7 = o0VarE.q();
                if (zL) {
                    final float f31119 = f24;
                    i0Var = i0VarA;
                    final float f311110 = f25;
                    l lVar12 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i412 = 0;
                            while (true) {
                                final int i413 = i14;
                                if (i412 >= i413) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf8 = Integer.valueOf(i412);
                                final float f311111 = f31119;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f311110;
                                final float f46 = f27;
                                final long j215 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf8, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var5 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i414 = i412;
                                            j0 j0Var3 = j0Var2;
                                            if ((i414 != iIntValue2 || i414 <= 0) && (i414 != ((Number) x3Var4.getF182175a()).intValue() || i414 >= i413 - 1)) {
                                                f47 = i414 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f311111;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i414 ? j215 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i412++;
                            }
                        }
                    };
                    f28 = f31119;
                    f29 = f26;
                    f34 = f311110;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar12);
                    objQ7 = lVar12;
                } else {
                    final float f311111 = f24;
                    i0Var = i0VarA;
                    final float f311112 = f25;
                    l lVar13 = new l() { // from class: p82.a
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f0 f0Var = (f0) obj;
                            f0Var.getClass();
                            final int i412 = 0;
                            while (true) {
                                final int i413 = i14;
                                if (i412 >= i413) {
                                    return Unit.INSTANCE;
                                }
                                Integer numValueOf8 = Integer.valueOf(i412);
                                final float f311113 = f311111;
                                final j0 j0Var2 = j0Var;
                                final float f44 = f26;
                                final float f45 = f311112;
                                final float f46 = f27;
                                final long j215 = j24;
                                final long j34 = j25;
                                final r1 r1Var5 = r1Var4;
                                final x3 x3Var3 = x3Var;
                                final x3 x3Var4 = x3Var2;
                                f0.b(f0Var, numValueOf8, new z3.e(1602812200, true, new q() { // from class: p82.c
                                    @Override // e23.q
                                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                        float f47;
                                        m mVar2 = (m) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        ((e2.d) obj2).getClass();
                                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            x1 x1Var5 = n.f135158a;
                                            int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                            int i414 = i412;
                                            j0 j0Var3 = j0Var2;
                                            if ((i414 != iIntValue2 || i414 <= 0) && (i414 != ((Number) x3Var4.getF182175a()).intValue() || i414 >= i413 - 1)) {
                                                f47 = i414 == j0Var3.l() ? f44 : f45;
                                            } else {
                                                f47 = f311113;
                                            }
                                            e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i414 ? j215 : j34, r1Var5, mVar2, 0);
                                        } else {
                                            mVar2.e();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }), 2);
                                i412++;
                            }
                        }
                    };
                    f28 = f311111;
                    f29 = f26;
                    f34 = f311112;
                    j26 = j24;
                    j27 = j25;
                    o0VarE.K(lVar13);
                    objQ7 = lVar13;
                }
                e2.c.c(rVarU7, i0Var, null, iVarI7, bVar14, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
                o0Var = o0VarE;
                f18 = f29;
                i27 = i29;
                rVar3 = rVar11;
                f19 = f34;
                f17 = f28;
                r1Var2 = r1Var4;
                j16 = j26;
                j15 = j27;
            } else {
                j19 = j17;
            }
            int iE4 = t.e(i14, 0, 5);
            float f322 = iE4 * f27;
            i37 = iE4 - 1;
            if (i37 < 0) {
                i37 = 0;
            }
            objQ2 = f.a((i37 * f31117) + f322);
            o0VarE.K(objQ2);
            float f311113 = ((f) objQ2).f75997a;
            i0VarA = k0.a(0, 0, 3, o0VarE);
            Integer numValueOf8 = Integer.valueOf(j0Var.l());
            i38 = i28 & 14;
            j24 = j18;
            if (i38 == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            zB = z25 | o0VarE.B(i0VarA);
            objQ3 = o0VarE.q();
            if (zB) {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a(j0Var, i0VarA, null);
                    o0VarE.K(objQ3);
                }
            } else {
                objQ3 = new a(j0Var, i0VarA, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, numValueOf8, o0VarE);
            Boolean bool8 = Boolean.TRUE;
            if (i38 == 4) {
                z26 = true;
            } else {
                z26 = false;
            }
            if ((i28 & 7168) == 2048) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = z26 | z27;
            objQ4 = o0VarE.q();
            if (z28) {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new b(j0Var, i29, null);
                    o0VarE.K(objQ4);
                }
            } else {
                objQ4 = new b(j0Var, i29, null);
                o0VarE.K(objQ4);
            }
            l0.e((p) objQ4, bool8, o0VarE);
            objQ5 = o0VarE.q();
            aVar.getClass();
            c2565a = m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = p0.f(new ct1.c(i0VarA, 8));
                o0VarE.K(objQ5);
            }
            x3Var = (x3) objQ5;
            objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.f(new by1.h(x3Var, 11));
                o0VarE.K(objQ6);
            }
            x3Var2 = (x3) objQ6;
            h4.r rVarU8 = x2.u(rVar4, f311113);
            h4.d.f81522a.getClass();
            g.b bVar15 = h4.d.a.f81534l;
            j.f22691a.getClass();
            j.i iVarI8 = j.i(f31117);
            if (i36 == 256) {
                z29 = true;
            } else {
                z29 = false;
            }
            if (i35 == 67108864) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean z319 = z34 | z29;
            if (i38 == 4) {
                z35 = true;
            } else {
                z35 = false;
            }
            boolean z418 = z35 | z319;
            if (i30 == 1048576) {
                z36 = true;
            } else {
                z36 = false;
            }
            boolean z419 = z36 | z418;
            if (i34 == 8388608) {
                z37 = true;
            } else {
                z37 = false;
            }
            boolean zI12 = z419 | z37 | o0VarE.i(f27) | o0VarE.l(j24);
            h4.r rVar12 = rVar4;
            j25 = j19;
            r1Var4 = r1Var3;
            zL = zI12 | o0VarE.l(j25) | o0VarE.B(r1Var4);
            objQ7 = o0VarE.q();
            if (zL) {
                final float f311114 = f24;
                i0Var = i0VarA;
                final float f311115 = f25;
                l lVar14 = new l() { // from class: p82.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        final int i412 = 0;
                        while (true) {
                            final int i413 = i14;
                            if (i412 >= i413) {
                                return Unit.INSTANCE;
                            }
                            Integer numValueOf9 = Integer.valueOf(i412);
                            final float f311116 = f311114;
                            final j0 j0Var2 = j0Var;
                            final float f44 = f26;
                            final float f45 = f311115;
                            final float f46 = f27;
                            final long j215 = j24;
                            final long j34 = j25;
                            final r1 r1Var5 = r1Var4;
                            final x3 x3Var3 = x3Var;
                            final x3 x3Var4 = x3Var2;
                            f0.b(f0Var, numValueOf9, new z3.e(1602812200, true, new q() { // from class: p82.c
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    float f47;
                                    m mVar2 = (m) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((e2.d) obj2).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var5 = n.f135158a;
                                        int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                        int i414 = i412;
                                        j0 j0Var3 = j0Var2;
                                        if ((i414 != iIntValue2 || i414 <= 0) && (i414 != ((Number) x3Var4.getF182175a()).intValue() || i414 >= i413 - 1)) {
                                            f47 = i414 == j0Var3.l() ? f44 : f45;
                                        } else {
                                            f47 = f311116;
                                        }
                                        e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i414 ? j215 : j34, r1Var5, mVar2, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2);
                            i412++;
                        }
                    }
                };
                f28 = f311114;
                f29 = f26;
                f34 = f311115;
                j26 = j24;
                j27 = j25;
                o0VarE.K(lVar14);
                objQ7 = lVar14;
            } else {
                final float f311116 = f24;
                i0Var = i0VarA;
                final float f311117 = f25;
                l lVar15 = new l() { // from class: p82.a
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f0 f0Var = (f0) obj;
                        f0Var.getClass();
                        final int i412 = 0;
                        while (true) {
                            final int i413 = i14;
                            if (i412 >= i413) {
                                return Unit.INSTANCE;
                            }
                            Integer numValueOf9 = Integer.valueOf(i412);
                            final float f311118 = f311116;
                            final j0 j0Var2 = j0Var;
                            final float f44 = f26;
                            final float f45 = f311117;
                            final float f46 = f27;
                            final long j215 = j24;
                            final long j34 = j25;
                            final r1 r1Var5 = r1Var4;
                            final x3 x3Var3 = x3Var;
                            final x3 x3Var4 = x3Var2;
                            f0.b(f0Var, numValueOf9, new z3.e(1602812200, true, new q() { // from class: p82.c
                                @Override // e23.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    float f47;
                                    m mVar2 = (m) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((e2.d) obj2).getClass();
                                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        x1 x1Var5 = n.f135158a;
                                        int iIntValue2 = ((Number) x3Var3.getF182175a()).intValue();
                                        int i414 = i412;
                                        j0 j0Var3 = j0Var2;
                                        if ((i414 != iIntValue2 || i414 <= 0) && (i414 != ((Number) x3Var4.getF182175a()).intValue() || i414 >= i413 - 1)) {
                                            f47 = i414 == j0Var3.l() ? f44 : f45;
                                        } else {
                                            f47 = f311118;
                                        }
                                        e.b(f46, ((f) s1.f.a(f47, null, "", mVar2, 384, 10).getF182175a()).f75997a, j0Var3.l() == i414 ? j215 : j34, r1Var5, mVar2, 0);
                                    } else {
                                        mVar2.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }), 2);
                            i412++;
                        }
                    }
                };
                f28 = f311116;
                f29 = f26;
                f34 = f311117;
                j26 = j24;
                j27 = j25;
                o0VarE.K(lVar15);
                objQ7 = lVar15;
            }
            e2.c.c(rVarU8, i0Var, null, iVarI8, bVar15, null, false, null, (l) objQ7, o0VarE, 12804096, 332);
            o0Var = o0VarE;
            f18 = f29;
            i27 = i29;
            rVar3 = rVar12;
            f19 = f34;
            f17 = f28;
            r1Var2 = r1Var4;
            j16 = j26;
            j15 = j27;
        } else {
            o0VarE.e();
            j15 = j14;
            f17 = f16;
            r1Var2 = r1Var;
            rVar3 = rVar2;
            i27 = i24;
            o0Var = o0VarE;
            j16 = j8;
            f18 = f14;
            f19 = f15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: p82.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i16 | 1);
                    e.a(j0Var, rVar3, i14, i27, j16, j15, f18, f19, f17, r1Var2, (m) obj, iT, i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(float f14, float f15, long j8, r1 r1Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(431064188);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14 | (o0VarE.i(f15) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(r1Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarQ = x2.q(aVar, f14);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarQ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            c2.q.a(u1.n.e(x2.q(aVar, f15), j8, r1Var), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(f14, f15, j8, r1Var, i14, 0);
        }
    }
}
