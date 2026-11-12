package rx1;

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
public final class n {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.l<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kx1.a f155002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<String> f155003b;

        public a(kx1.a aVar, p1<String> p1Var) {
            this.f155002a = aVar;
            this.f155003b = p1Var;
        }

        @Override // e23.l
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            String str = this.f155002a.f107116a;
            if (str == null) {
                str = "";
            }
            this.f155003b.setValue(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f155004a = new b();

        @Override // e23.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f155005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f155006b;

        public c(e23.l lVar, List list) {
            this.f155005a = lVar;
            this.f155006b = list;
        }

        @Override // e23.l
        public final Object invoke(Integer num) {
            return this.f155005a.invoke(this.f155006b.get(num.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f155007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1 f155008b;

        public d(List list, p1 p1Var) {
            this.f155007a = list;
            this.f155008b = p1Var;
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
                kx1.a aVar = (kx1.a) this.f155007a.get(iIntValue);
                mVar2.C(758515581);
                String str = aVar.f107118c;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                p1 p1Var = this.f155008b;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.composables.bottomsheet.SelectWorkoutStepsExerciseBottomSheetKt$SelectWorkoutStepsExerciseBottomSheet$onDismissRequest$1$1$1", f = "SelectWorkoutStepsExerciseBottomSheet.kt", l = {37}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f155010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f155010b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f155010b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155009a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f155009a = 1;
                if (this.f155010b.d(this) == aVar) {
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

    public static final void a(dy1.v vVar, String str, e23.p<? super String, ? super kx1.a, Unit> pVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        pVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1153736028);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | ((i15 & 7168) == 2048);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new eu.b(b0Var, mcVarF, aVar, 9);
                o0VarE.K(objQ2);
            }
            e23.a aVar2 = (e23.a) objQ2;
            l.b(mcVarF, aVar2, null, null, null, z3.f.c(-427831762, new mw0.h(14, str, aVar2, vVar, pVar), o0VarE), o0VarE, 196608);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(vVar, str, pVar, aVar, i14, 11);
        }
    }
}
