package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Comparator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getRunningCyclingReviewScheduleInfo$1", f = "FBTPlanWizardViewModel.kt", l = {3890, 3897}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f13347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f13350d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((tw1.m) t14).o(), ((tw1.m) t7).o());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h hVar, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f13350d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f13350d, dVar);
        e0Var.f13349c = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        if (r1 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        v2 v2Var;
        Object objB;
        List listN0;
        o53.b0 b0Var = (o53.b0) this.f13349c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13348b;
        tw1.m mVar = null;
        Object obj2 = null;
        mVar = null;
        h hVar = this.f13350d;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            hVar.t6().j(g3.a.c(g3.f35298f));
            kv1.y yVarH6 = hVar.h6();
            this.f13349c = b0Var;
            this.f13348b = 1;
            objA = yVarH6.a(this);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objA = obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2.b bVar = this.f13347a;
            o13.r.b(obj);
            v2Var = bVar;
            objB = obj;
        }
        v2 v2Var2 = (v2) objB;
        if (v2Var2 instanceof v2.b) {
            List<tw1.m> listA = ((tw1.o) ((v2.b) v2Var2).f47386a).a();
            if (listA != null && (listN0 = p13.h0.N0(listA, new a())) != null) {
                for (Object obj3 : listN0) {
                    tw1.m mVar2 = (tw1.m) obj3;
                    if (mVar2.e0() && mVar2.h0()) {
                        tw1.n trainingPlanType = mVar2.getTrainingPlanType();
                        if ((trainingPlanType != null ? trainingPlanType.b() : null) != vt1.o.f180175f) {
                            tw1.n trainingPlanType2 = mVar2.getTrainingPlanType();
                            if ((trainingPlanType2 != null ? trainingPlanType2.b() : null) != vt1.o.f180176g) {
                                tw1.n trainingPlanType3 = mVar2.getTrainingPlanType();
                                if ((trainingPlanType3 != null ? trainingPlanType3.b() : null) == vt1.o.f180179j) {
                                }
                            }
                        }
                        obj2 = obj3;
                        break;
                    }
                }
                mVar = (tw1.m) obj2;
            }
            if (mVar != null) {
                jv1.z zVarY4 = h.Y4(hVar, (jv1.e0) ((v2.b) v2Var).f47386a, mVar);
                y0<g3<jv1.z>> y0VarT6 = hVar.t6();
                g3.f35298f.getClass();
                y0VarT6.j(g3.a.d(zVarY4));
                hVar.s6().j("FBTReviewScheduleFragment");
            } else {
                int i16 = h.S1;
                y0<g3<jv1.z>> y0VarT7 = hVar.t6();
                g3.a aVar2 = g3.f35298f;
                jv1.z zVar = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
                aVar2.getClass();
                y0VarT7.j(g3.a.d(zVar));
                hVar.y6();
            }
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error retrieving last completed FBT plan to show review schedule. Exception=");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
            int i17 = h.S1;
            y0<g3<jv1.z>> y0VarT8 = hVar.t6();
            g3.a aVar4 = g3.f35298f;
            jv1.z zVar2 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
            aVar4.getClass();
            y0VarT8.j(g3.a.d(zVar2));
            hVar.y6();
        }
        return Unit.INSTANCE;
        v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            int i18 = h.S1;
            jv1.s sVarI6 = hVar.i6();
            hVar.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, null, null, null, null, null, null, null, null, false, (jv1.e0) ((v2.b) v2Var).f47386a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 511) : null);
            if (!hVar.W6()) {
                v2.b bVar2 = (v2.b) v2Var;
                jv1.e0 e0Var = (jv1.e0) bVar2.f47386a;
                List<String> listB = e0Var.b();
                if (listB == null) {
                    listB = p13.j0.f134944a;
                }
                List<String> listD = e0Var.d();
                if (listD == null) {
                    listD = p13.j0.f134944a;
                }
                if (listB.size() > 4 && !listD.isEmpty()) {
                    uw1.b bVar3 = hVar.T;
                    this.f13349c = b0Var;
                    this.f13347a = bVar2;
                    this.f13348b = 2;
                    objB = bVar3.b(this);
                }
            }
            y0<g3<jv1.z>> y0VarT9 = hVar.t6();
            g3.a aVar5 = g3.f35298f;
            jv1.z zVar3 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
            aVar5.getClass();
            y0VarT9.j(g3.a.d(zVar3));
            hVar.y6();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving user settings to show review schedule. Exception=");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar6.getClass();
            i2.a.f(a2Var2, "FBTPlanWizardViewModel", strD2);
            int i19 = h.S1;
            y0<g3<jv1.z>> y0VarT10 = hVar.t6();
            g3.a aVar7 = g3.f35298f;
            jv1.z zVar4 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
            aVar7.getClass();
            y0VarT10.j(g3.a.d(zVar4));
            hVar.y6();
        }
        return Unit.INSTANCE;
    }
}
