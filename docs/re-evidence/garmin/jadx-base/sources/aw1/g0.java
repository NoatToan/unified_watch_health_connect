package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getTriathlonReviewScheduleInfo$1", f = "FBTPlanWizardViewModel.kt", l = {4496, 4503}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f13363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f13366d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((tw1.m) t14).o(), ((tw1.m) t7).o());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h hVar, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f13366d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f13366d, dVar);
        g0Var.f13365c = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01be  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
    
        if (r1 == r2) goto L31;
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
        tw1.m mVar;
        boolean z14;
        String strName;
        ww1.w wVar;
        boolean zN;
        fg0.k kVar;
        List listN0;
        Object next;
        o53.b0 b0Var = (o53.b0) this.f13365c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13364b;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listB = null;
        h hVar = this.f13366d;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = h.S1;
            hVar.t6().j(g3.a.c(g3.f35298f));
            kv1.y yVarH6 = hVar.h6();
            this.f13365c = b0Var;
            this.f13364b = 1;
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
            v2.b bVar = this.f13363a;
            o13.r.b(obj);
            v2Var = bVar;
            objB = obj;
        }
        v2 v2Var2 = (v2) objB;
        if (v2Var2 instanceof v2.b) {
            List<tw1.m> listA = ((tw1.o) ((v2.b) v2Var2).f47386a).a();
            if (listA == null || (listN0 = p13.h0.N0(listA, new a())) == null) {
                mVar = null;
            } else {
                Iterator it = listN0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    tw1.m mVar2 = (tw1.m) next;
                    if (mVar2.e0() && mVar2.h0()) {
                        tw1.n trainingPlanType = mVar2.getTrainingPlanType();
                        if ((trainingPlanType != null ? trainingPlanType.b() : null) == vt1.o.f180178i) {
                            break;
                        }
                    }
                }
                mVar = (tw1.m) next;
            }
            int i16 = h.S1;
            hVar.getClass();
            if (mVar != null) {
                hv1.i.a aVar2 = hv1.i.f85867c;
                hv1.i swimAbility = mVar.getSwimAbility();
                if (swimAbility == null || (strName = swimAbility.name()) == null) {
                    strName = "";
                }
                aVar2.getClass();
                hv1.i iVarA = hv1.i.a.a(strName);
                List<String> listH = mVar.h();
                if (listH == null) {
                    listH = p13.j0.f134944a;
                }
                jv1.s sVarI6 = hVar.i6();
                if ((sVarI6 != null ? sVarI6.f101124c : null) != null) {
                    jv1.s sVarI7 = hVar.i6();
                    if (sVarI7 != null && (kVar = sVarI7.f101124c) != null) {
                        listB = kVar.h();
                    }
                } else {
                    jv1.s sVarI8 = hVar.i6();
                    if (sVarI8 != null && (wVar = sVarI8.G) != null) {
                        listB = wVar.b();
                    }
                }
                if (listB != null) {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list = hVar.f13389v1;
                    og0.a.f131967a.getClass();
                    zN = tu1.a.n(list, og0.a.D(listB));
                } else {
                    zN = false;
                }
                z14 = !listH.isEmpty() && (!zN ? iVarA != null : !(iVarA == null || iVarA == hv1.i.NOVICE));
            }
            if (z14) {
                jv1.z zVarY4 = h.Y4(hVar, (jv1.e0) ((v2.b) v2Var).f47386a, mVar);
                y0<g3<jv1.z>> y0VarT6 = hVar.t6();
                g3.f35298f.getClass();
                y0VarT6.j(g3.a.d(zVarY4));
                hVar.s6().j("FBTReviewScheduleFragment");
            } else {
                y0<g3<jv1.z>> y0VarT7 = hVar.t6();
                g3.a aVar3 = g3.f35298f;
                jv1.z zVar = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
                aVar3.getClass();
                y0VarT7.j(g3.a.d(zVar));
                hVar.f7();
            }
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Error retrieving last completed FBT plan to show review schedule. Exception=");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
            int i17 = h.S1;
            y0<g3<jv1.z>> y0VarT8 = hVar.t6();
            g3.a aVar5 = g3.f35298f;
            jv1.z zVar2 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
            aVar5.getClass();
            y0VarT8.j(g3.a.d(zVar2));
            hVar.f7();
        }
        return Unit.INSTANCE;
        v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            int i18 = h.S1;
            jv1.s sVarI9 = hVar.i6();
            hVar.k8(sVarI9 != null ? jv1.s.a(sVarI9, null, null, null, null, null, null, null, null, null, null, false, (jv1.e0) ((v2.b) v2Var).f47386a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 511) : null);
            v2.b bVar2 = (v2.b) v2Var;
            jv1.e0 e0Var = (jv1.e0) bVar2.f47386a;
            List<String> listB2 = e0Var.b();
            if (listB2 == null) {
                listB2 = p13.j0.f134944a;
            }
            List<String> listD = e0Var.d();
            if (listD == null) {
                listD = p13.j0.f134944a;
            }
            if (listB2.size() <= 5 || listD.isEmpty()) {
                y0<g3<jv1.z>> y0VarT9 = hVar.t6();
                g3.a aVar6 = g3.f35298f;
                jv1.z zVar3 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
                aVar6.getClass();
                y0VarT9.j(g3.a.d(zVar3));
                hVar.f7();
            } else {
                uw1.b bVar3 = hVar.T;
                this.f13365c = b0Var;
                this.f13363a = bVar2;
                this.f13364b = 2;
                objB = bVar3.b(this);
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving user settings to show review schedule. Exception=");
            i2.a aVar7 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar7.getClass();
            i2.a.f(a2Var2, "FBTPlanWizardViewModel", strD2);
            int i19 = h.S1;
            y0<g3<jv1.z>> y0VarT10 = hVar.t6();
            g3.a aVar8 = g3.f35298f;
            jv1.z zVar4 = new jv1.z(null, false, null, null, null, null, null, false, null, 511, null);
            aVar8.getClass();
            y0VarT10.j(g3.a.d(zVar4));
            hVar.f7();
        }
        return Unit.INSTANCE;
    }
}
