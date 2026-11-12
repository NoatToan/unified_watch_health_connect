package oo;

import am.x0;
import am.z0;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import e23.p;
import java.util.Iterator;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Lam/l;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$checkPrivacyForNewActivityType$1", f = "ActivitiesEditViewModel.kt", l = {97, 113}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<t0<am.l>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f133068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.l f133069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f133070e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, am.l lVar, x0 x0Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f133068c = bVar;
        this.f133069d = lVar;
        this.f133070e = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f133068c, this.f133069d, this.f133070e, dVar);
        cVar.f133067b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<am.l> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r0.emit(r10, r9) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nj1.c subcategoryDetails;
        String accessRule;
        Object next;
        String privacySubcategoryType;
        x0 x0VarH;
        t0 t0Var = (t0) this.f133067b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133066a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        mj1.b bVar = this.f133068c.f133051a;
        this.f133067b = t0Var;
        this.f133066a = 1;
        bVar.getClass();
        obj = f0.J(bVar, new mj1.c(bVar, null), this);
        if (obj != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            Iterator<T> it = ((nj1.e) ((v2.b) v2Var).f47386a).getActivityPrivacySettings().d().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                privacySubcategoryType = ((nj1.d) next).getPrivacySubcategoryType();
                x0 x0Var = this.f133070e;
                x0VarH = z0.h(x0Var);
                if (u.q(privacySubcategoryType, x0Var.f4358a, true)) {
                    break;
                }
            } while (!u.q(privacySubcategoryType, x0VarH.f4358a, true));
            nj1.d dVar = (nj1.d) next;
            if (dVar != null) {
                subcategoryDetails = dVar.getSubcategoryDetails();
            }
            a2 a2Var = a2.ACTIVITIES;
            StringBuilder sb3 = new StringBuilder("checkPrivacy() -> currentPrivacyType=[");
            am.l lVar = this.f133069d;
            sb3.append(lVar);
            sb3.append("] newActivityTypePrivacy=[");
            sb3.append(subcategoryDetails);
            sb3.append("]");
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "ActivitiesEditViewModel", string);
            am.l.a aVar2 = am.l.f4047c;
            if (subcategoryDetails != null) {
                accessRule = subcategoryDetails.getAccessRule();
            } else {
                accessRule = null;
            }
            aVar2.getClass();
            am.l lVarA = am.l.a.a(accessRule, lVar);
            this.f133067b = null;
            this.f133066a = 2;
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        subcategoryDetails = null;
        a2 a2Var2 = a2.ACTIVITIES;
        StringBuilder sb4 = new StringBuilder("checkPrivacy() -> currentPrivacyType=[");
        am.l lVar2 = this.f133069d;
        sb4.append(lVar2);
        sb4.append("] newActivityTypePrivacy=[");
        sb4.append(subcategoryDetails);
        sb4.append("]");
        String string2 = sb4.toString();
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "ActivitiesEditViewModel", string2);
        am.l.a aVar3 = am.l.f4047c;
        if (subcategoryDetails != null) {
            accessRule = subcategoryDetails.getAccessRule();
        } else {
            accessRule = null;
        }
        aVar3.getClass();
        am.l lVarA2 = am.l.a.a(accessRule, lVar2);
        this.f133067b = null;
        this.f133066a = 2;
    }
}
