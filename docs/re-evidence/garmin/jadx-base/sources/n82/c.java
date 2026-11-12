package n82;

import as.q;
import b63.o;
import c22.e0;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r53.c2;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.patterns.pager.date.DatePagerKt$DatePager$2$1", f = "DatePager.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f124953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f124954b;

        /* JADX INFO: renamed from: n82.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2405a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f124955a;

            public C2405a(f fVar) {
                this.f124955a = fVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                ((Number) obj).intValue();
                f fVar = this.f124955a;
                o oVar = fVar.b().f130843a;
                o82.g gVarA = fVar.f124961b.a();
                oVar.getClass();
                gVarA.getClass();
                g gVar = fVar.f124962c;
                if (gVar != null) {
                    gVar.f124966a.put(gVarA, oVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f124954b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f124954b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f124953a;
            if (i14 == 0) {
                r.b(obj);
                f fVar = this.f124954b;
                c2 c2VarS = p0.s(new d52.p(fVar, 8));
                C2405a c2405a = new C2405a(fVar);
                this.f124953a = 1;
                if (c2VarS.collect(c2405a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, f fVar, int i14, boolean z14, e23.r<? super o82.g, ? super o82.a, ? super p3.m, ? super Integer, Unit> rVar2, p3.m mVar, int i15, int i16) {
        h4.r rVar3;
        int i17;
        int i18;
        int i19;
        boolean z15;
        int i24;
        int i25;
        boolean z16;
        e23.r<? super o82.g, ? super o82.a, ? super p3.m, ? super Integer, Unit> rVar4;
        h4.r rVar5;
        int i26;
        boolean z17;
        p2 p2VarI0;
        h4.r rVar6;
        boolean z18;
        h4.r rVar7;
        boolean z19;
        Object objQ;
        rVar2.getClass();
        o0 o0VarE = mVar.E(2011435959);
        int i27 = i16 & 1;
        int i28 = 4;
        if (i27 != 0) {
            i17 = i15 | 6;
            rVar3 = rVar;
        } else if ((i15 & 6) == 0) {
            rVar3 = rVar;
            i17 = (o0VarE.B(rVar3) ? 4 : 2) | i15;
        } else {
            rVar3 = rVar;
            i17 = i15;
        }
        int i29 = i17 | (o0VarE.B(fVar) ? 32 : 16);
        int i30 = i16 & 4;
        if (i30 == 0) {
            if ((i15 & 384) == 0) {
                i18 = i14;
                i29 |= o0VarE.k(i18) ? 256 : 128;
            }
            i19 = i16 & 8;
            if (i19 != 0) {
                i25 = i29 | 3072;
                z15 = z14;
            } else {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i25 = i29 | i24;
            }
            if ((i25 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    if (i27 != 0) {
                        rVar6 = h4.r.S;
                    } else {
                        rVar6 = rVar3;
                    }
                    if (i30 != 0) {
                        i18 = 0;
                    }
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    rVar7 = rVar6;
                } else {
                    o0VarE.e();
                    z18 = z15;
                    i18 = i18;
                    rVar7 = rVar3;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                rVar4 = rVar2;
                m82.e.a(rVar7, fVar.f124960a, i18, z18, z3.f.c(1109592260, new q(fVar, i18, rVar4, i28), o0VarE), o0VarE, (i25 & 14) | 24576 | (i25 & 896) | (i25 & 7168), 0);
                Boolean bool = Boolean.TRUE;
                z19 = (((i25 & 112) ^ 48) <= 32 && o0VarE.B(fVar)) || (i25 & 48) == 32;
                objQ = o0VarE.q();
                if (z19) {
                    objQ = new a(fVar, null);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(fVar, null);
                        o0VarE.K(objQ);
                    }
                }
                l0.e((p) objQ, bool, o0VarE);
                rVar5 = rVar7;
                i26 = i18;
                z17 = z18;
            } else {
                rVar4 = rVar2;
                o0VarE.e();
                rVar5 = rVar3;
                i26 = i18;
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e0(rVar5, fVar, i26, z17, rVar4, i15, i16, 3);
            }
        }
        i29 |= 384;
        i18 = i14;
        i19 = i16 & 8;
        if (i19 != 0) {
            i25 = i29 | 3072;
            z15 = z14;
        } else {
            z15 = z14;
            if (o0VarE.h(z15)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i25 = i29 | i24;
        }
        if ((i25 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i27 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i30 != 0) {
                    i18 = 0;
                }
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                rVar7 = rVar6;
            } else {
                if (i27 != 0) {
                    rVar6 = h4.r.S;
                } else {
                    rVar6 = rVar3;
                }
                if (i30 != 0) {
                    i18 = 0;
                }
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                rVar7 = rVar6;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            rVar4 = rVar2;
            m82.e.a(rVar7, fVar.f124960a, i18, z18, z3.f.c(1109592260, new q(fVar, i18, rVar4, i28), o0VarE), o0VarE, (i25 & 14) | 24576 | (i25 & 896) | (i25 & 7168), 0);
            Boolean bool2 = Boolean.TRUE;
            if (((i25 & 112) ^ 48) <= 32) {
            }
            objQ = o0VarE.q();
            if (z19) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(fVar, null);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new a(fVar, null);
                o0VarE.K(objQ);
            }
            l0.e((p) objQ, bool2, o0VarE);
            rVar5 = rVar7;
            i26 = i18;
            z17 = z18;
        } else {
            rVar4 = rVar2;
            o0VarE.e();
            rVar5 = rVar3;
            i26 = i18;
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(rVar5, fVar, i26, z17, rVar4, i15, i16, 3);
        }
    }
}
