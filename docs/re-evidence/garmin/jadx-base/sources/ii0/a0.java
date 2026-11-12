package ii0;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.d6;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;
import p3.p1;
import p3.p2;
import p3.x1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.MyFollowingListKt$MyFollowingList$1$1", f = "MyFollowingList.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e2.i0 f93550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f93553f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zc.d<li0.d0> dVar, e2.i0 i0Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f93549b = dVar;
            this.f93550c = i0Var;
            this.f93551d = p1Var;
            this.f93552e = p1Var2;
            this.f93553f = p1Var3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f93549b, this.f93550c, this.f93551d, this.f93552e, this.f93553f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0075  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93548a;
            p1<Boolean> p1Var = this.f93552e;
            zc.d<li0.d0> dVar = this.f93549b;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!p005kotlin.jvm.internal.s.g(dVar.d().f196385a, z0.b.f196664b)) {
                    this.f93551d.setValue(Boolean.FALSE);
                    if (p1Var.getF182175a().booleanValue()) {
                        this.f93548a = 1;
                        e2.i0.a aVar2 = e2.i0.f62432x;
                        if (this.f93550c.l(0, 0, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                z0 z0Var = dVar.d().f196385a;
                z0.b bVar = z0.b.f196664b;
                this.f93553f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            p1Var.setValue(Boolean.FALSE);
            z0 z0Var2 = dVar.d().f196385a;
            z0.b bVar2 = z0.b.f196664b;
            this.f93553f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var2, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar2)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.MyFollowingListKt$MyFollowingList$isQueryLoading$2$1", f = "MyFollowingList.kt", l = {68}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<k2<Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.d<li0.d0> f93556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zc.d<li0.d0> dVar, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f93556c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(this.f93556c, dVar);
            bVar.f93555b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(k2<Boolean> k2Var, t13.d<? super Unit> dVar) {
            return ((b) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            k2 k2Var = (k2) this.f93555b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93554a;
            zc.d<li0.d0> dVar = this.f93556c;
            if (i14 == 0) {
                o13.r.b(obj);
                if (dVar.d().f196390f) {
                    k2Var.setValue(Boolean.FALSE);
                } else {
                    this.f93555b = k2Var;
                    this.f93554a = 1;
                    if (o53.m0.b(500L, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k2Var.setValue(Boolean.valueOf(!dVar.d().f196390f));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x0336  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(zc.d<li0.d0> dVar, zc.d<li0.d0> dVar2, li0.f fVar, u2.h hVar, p003ji0.a aVar, e2.i0 i0Var, e2.i0 i0Var2, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        char c14;
        int i16;
        p1 p1Var;
        p1 p1Var2;
        Object obj;
        boolean z14;
        boolean z15;
        Object objQ;
        dVar2.getClass();
        fVar.getClass();
        hVar.getClass();
        aVar.getClass();
        i0Var.getClass();
        i0Var2.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-316116653);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(dVar2) : o0VarE.r(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(hVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(i0Var) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(i0Var2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarE.r(aVar2) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i15 & 1, (i15 & 4793491) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var5 = (p1) objQ4;
            boolean zB = o0VarE.B(hVar.b().f167839c);
            int i17 = i15;
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = hb.a.n(hVar.b().f167839c.length() == 0, o0VarE);
            }
            p1 p1Var6 = (p1) objQ5;
            z0 z0Var = dVar.d().f196385a;
            int i18 = i17 & 14;
            boolean z16 = (i18 == 4 || ((i17 & 8) != 0 && o0VarE.r(dVar))) | ((i17 & 458752) == 131072);
            Object objQ6 = o0VarE.q();
            if (z16 || objQ6 == c2565a) {
                c14 = 2048;
                i16 = i18;
                p1Var = p1Var4;
                a aVar3 = new a(dVar, i0Var, p1Var, p1Var5, p1Var3, null);
                p1Var2 = p1Var3;
                o0VarE.K(aVar3);
                objQ6 = aVar3;
            } else {
                p1Var2 = p1Var3;
                p1Var = p1Var4;
                c14 = 2048;
                i16 = i18;
            }
            p3.l0.e((e23.p) objQ6, z0Var, o0VarE);
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = Boolean.valueOf(dVar2.d().f196390f);
            CharSequence charSequence = hVar.b().f167839c;
            int i19 = i17 & 112;
            boolean z17 = i19 == 32 || ((i17 & 64) != 0 && o0VarE.r(dVar2));
            Object objQ7 = o0VarE.q();
            if (z17 || objQ7 == c2565a) {
                objQ7 = new b(dVar2, null);
                o0VarE.K(objQ7);
            }
            p1 p1Var7 = p1Var;
            p1 p1VarP = p3.p0.p(bool, boolValueOf, charSequence, (e23.p) objQ7, o0VarE, 6);
            if (((Boolean) p1Var2.getF182175a()).booleanValue() || dVar.b() != 0) {
                o0VarE.C(1434274428);
                e2.i0 i0Var3 = ((Boolean) p1Var6.getF182175a()).booleanValue() ? i0Var : i0Var2;
                boolean zBooleanValue = ((Boolean) p1Var7.getF182175a()).booleanValue();
                boolean zJ = d53.w.J(hVar.b().f167839c);
                boolean z18 = i16 == 4 || ((i17 & 8) != 0 && o0VarE.r(dVar));
                Object objQ8 = o0VarE.q();
                if (z18 || objQ8 == c2565a) {
                    objQ8 = new y(dVar, p1Var7, 0);
                    o0VarE.K(objQ8);
                }
                e23.a aVar4 = (e23.a) objQ8;
                boolean z19 = true;
                z3.e eVarC = z3.f.c(263330556, new w(hVar, 1), o0VarE);
                boolean zB2 = (i19 == 32 || ((i17 & 64) != 0 && o0VarE.r(dVar2))) | o0VarE.B(p1VarP) | ((i17 & 7168) == c14);
                if ((i17 & 896) != 256) {
                    obj = fVar;
                    if ((i17 & 512) == 0 || !o0VarE.r(obj)) {
                        z14 = false;
                    }
                    boolean zB3 = zB2 | z14 | o0VarE.B(p1Var6);
                    if (i16 != 4 && ((i17 & 8) == 0 || !o0VarE.r(dVar))) {
                        z19 = false;
                    }
                    z15 = zB3 | z19;
                    objQ = o0VarE.q();
                    if (!z15 || objQ == c2565a) {
                        Object obj2 = obj;
                        o0Var = o0VarE;
                        aa2.p pVar = new aa2.p(dVar2, hVar, obj2, p1VarP, p1Var6, dVar, 11);
                        o0Var.K(pVar);
                        objQ = pVar;
                    } else {
                        o0Var = o0VarE;
                    }
                    p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar4, eVarC, aVar, (e23.l) objQ, o0Var, ((i17 << 3) & 458752) | 24576);
                    o0Var.g0(false);
                } else {
                    obj = fVar;
                }
                z14 = true;
                boolean zB4 = zB2 | z14 | o0VarE.B(p1Var6);
                if (i16 != 4) {
                    z19 = false;
                }
                z15 = zB4 | z19;
                objQ = o0VarE.q();
                if (z15) {
                    Object obj3 = obj;
                    o0Var = o0VarE;
                    aa2.p pVar2 = new aa2.p(dVar2, hVar, obj3, p1VarP, p1Var6, dVar, 11);
                    o0Var.K(pVar2);
                    objQ = pVar2;
                } else {
                    Object obj4 = obj;
                    o0Var = o0VarE;
                    aa2.p pVar3 = new aa2.p(dVar2, hVar, obj4, p1VarP, p1Var6, dVar, 11);
                    o0Var.K(pVar3);
                    objQ = pVar3;
                }
                p003ji0.h.a(i0Var3, zBooleanValue, zJ, aVar4, eVarC, aVar, (e23.l) objQ, o0Var, ((i17 << 3) & 458752) | 24576);
                o0Var.g0(false);
            } else {
                o0VarE.C(1433575657);
                boolean zBooleanValue2 = ((Boolean) p1Var7.getF182175a()).booleanValue();
                boolean z24 = (i16 == 4 || ((i17 & 8) != 0 && o0VarE.r(dVar))) | (i19 == 32 || ((i17 & 64) != 0 && o0VarE.r(dVar2)));
                Object objQ9 = o0VarE.q();
                if (z24 || objQ9 == c2565a) {
                    objQ9 = new d6(dVar, 14, dVar2, p1Var7);
                    o0VarE.K(objQ9);
                }
                m3.l.b(zBooleanValue2, (e23.a) objQ9, null, null, null, null, z3.f.c(-1959996408, new ak0.p(aVar2, 10), o0VarE), o0VarE, 1572864, 60);
                o0VarE.g0(false);
                o0Var = o0VarE;
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.o(dVar, dVar2, fVar, hVar, aVar, i0Var, i0Var2, aVar2, i14, 5);
        }
    }
}
