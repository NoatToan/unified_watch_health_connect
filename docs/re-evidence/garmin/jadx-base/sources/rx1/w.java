package rx1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.e9;
import i3.mc;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kx1.a f155033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<String> f155034b;

        public a(kx1.a aVar, p1<String> p1Var) {
            this.f155033a = aVar;
            this.f155034b = p1Var;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            String str = this.f155033a.f107116a;
            if (str == null) {
                str = "";
            }
            this.f155034b.setValue(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f155035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<String> f155036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f155037c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super String, Unit> lVar, p1<String> p1Var, p1<Boolean> p1Var2) {
            this.f155035a = lVar;
            this.f155036b = p1Var;
            this.f155037c = p1Var2;
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            String str2 = str;
            str2.getClass();
            this.f155036b.setValue(str2);
            this.f155035a.invoke(str2);
            this.f155037c.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f155038a = new c();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f155039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f155040b;

        public d(e23.l lVar, List list) {
            this.f155039a = lVar;
            this.f155040b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f155039a.invoke(this.f155040b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f155041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1 f155042b;

        public e(List list, p1 p1Var) {
            this.f155041a = list;
            this.f155042b = p1Var;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x007f  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                kx1.a aVar = (kx1.a) this.f155041a.get(iIntValue);
                mVar2.C(-1970127044);
                String str = aVar.f107118c;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                p1 p1Var = this.f155042b;
                boolean zG = p005kotlin.jvm.internal.s.g((String) p1Var.getF182175a(), aVar.f107116a);
                boolean zB = mVar2.B(p1Var) | mVar2.r(aVar);
                Object objQ = mVar2.q();
                if (zB) {
                    objQ = new a(aVar, p1Var);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new a(aVar, p1Var);
                        mVar2.K(objQ);
                    }
                }
                qx1.m.a(str2, zG, null, false, null, false, false, (e23.l) objQ, mVar2, 0, 124);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f155043a;

        public f(List list) {
            this.f155043a = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            this.f155043a.get(num.intValue());
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f155044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dy1.v f155045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p f155046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f155047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l f155048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1 f155049f;

        public g(List list, dy1.v vVar, e23.p pVar, p1 p1Var, e23.l lVar, p1 p1Var2) {
            this.f155044a = list;
            this.f155045b = vVar;
            this.f155046c = pVar;
            this.f155047d = p1Var;
            this.f155048e = lVar;
            this.f155049f = p1Var2;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0094  */
        @Override // e23.r
        public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
            int i14;
            e2.d dVar2 = dVar;
            int iIntValue = num.intValue();
            p3.m mVar2 = mVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
            } else {
                i14 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i14 |= mVar2.k(iIntValue) ? 32 : 16;
            }
            if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
                x1 x1Var = p3.n.f135158a;
                dy1.u uVar = (dy1.u) this.f155044a.get(iIntValue);
                mVar2.C(-1572581285);
                String strP = y.P(R.string.lbl_primary_lift_count, new Object[]{this.f155045b.f61642c.size() > 1 ? String.valueOf(iIntValue + 1) : ""}, mVar2);
                i53.c<dy1.h> cVar = uVar.f61639a;
                p1 p1Var = this.f155047d;
                boolean zB = mVar2.B(p1Var);
                e23.l lVar = this.f155048e;
                boolean zB2 = zB | mVar2.B(lVar);
                p1 p1Var2 = this.f155049f;
                boolean zB3 = zB2 | mVar2.B(p1Var2);
                Object objQ = mVar2.q();
                if (zB3) {
                    objQ = new b(lVar, p1Var, p1Var2);
                    mVar2.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new b(lVar, p1Var, p1Var2);
                        mVar2.K(objQ);
                    }
                }
                qx1.j.a(null, strP, cVar, this.f155046c, (e23.l) objQ, mVar2, 0, 1);
                mVar2.f();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.WorkoutStepsBottomSheetKt$WorkoutStepsBottomSheet$onDismissRequest$1$1$1", f = "WorkoutStepsBottomSheet.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f155051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc mcVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f155051b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f155051b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (r2.g(r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155050a;
            mc mcVar = this.f155051b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f155050a = 1;
                if (mcVar.d(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f155050a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.WorkoutStepsBottomSheetKt$WorkoutStepsBottomSheet$onDismissRequest$1$1$2", f = "WorkoutStepsBottomSheet.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f155053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mc mcVar, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f155053b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f155053b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155052a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f155052a = 1;
                if (this.f155053b.d(this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void a(int i14, dy1.v vVar, e23.a aVar, e23.a aVar2, e23.l lVar, e23.p pVar, e23.p pVar2, p3.m mVar) {
        int i15;
        e23.a aVar3;
        e23.p pVar3;
        e23.l lVar2;
        e23.a aVar4;
        ?? r14;
        p1 p1Var;
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        pVar2.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1476252106);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar3 = aVar;
            i15 |= o0VarE.r(aVar3) ? 32 : 16;
        } else {
            aVar3 = aVar;
        }
        if ((i14 & 384) == 0) {
            pVar3 = pVar;
            i15 |= o0VarE.r(pVar3) ? 256 : 128;
        } else {
            pVar3 = pVar;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            aVar4 = aVar2;
            i15 |= o0VarE.r(aVar4) ? 131072 : 65536;
        } else {
            aVar4 = aVar2;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new ro0.h(10);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = {(String) p1Var2.getF182175a()};
            boolean zB = o0VarE.B(p1Var2);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new rk0.w(p1Var2, 6);
                o0VarE.K(objQ2);
            }
            p1 p1Var3 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new ro0.h(11);
                o0VarE.K(objQ3);
            }
            p1 p1Var4 = (p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ4);
            }
            b0 b0Var = (b0) objQ4;
            boolean zB2 = ((i15 & 458752) == 131072) | o0VarE.B(p1Var4) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 112) == 32);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                r14 = 0;
                jv0.c cVar = new jv0.c(b0Var, aVar3, p1Var4, mcVarF, aVar4, 22);
                p1Var = p1Var4;
                o0VarE.K(cVar);
                objQ5 = cVar;
            } else {
                p1Var = p1Var4;
                r14 = 0;
            }
            e23.l lVar3 = (e23.l) objQ5;
            boolean zB3 = o0VarE.B(lVar3);
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == c2565a) {
                objQ6 = new me2.d(lVar3, 19);
                o0VarE.K(objQ6);
            }
            c.w.a(r14, 1, (e23.a) objQ6, o0VarE, r14);
            boolean zB4 = o0VarE.B(lVar3);
            Object objQ7 = o0VarE.q();
            if (zB4 || objQ7 == c2565a) {
                objQ7 = new me2.d(lVar3, 20);
                o0VarE.K(objQ7);
            }
            l.b(mcVarF, (e23.a) objQ7, null, null, null, z3.f.c(1796397056, new ak0.g(lVar3, p1Var, vVar, p1Var3, pVar2, p1Var2, pVar3, lVar2, 7), o0VarE), o0VarE, 196608);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.f(vVar, aVar, pVar, lVar, pVar2, aVar2, i14);
        }
    }
}
