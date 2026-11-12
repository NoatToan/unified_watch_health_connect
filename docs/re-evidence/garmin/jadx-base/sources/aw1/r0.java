package aw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$updateEventToPrimaryAndCreatePlan$1$1", f = "FBTPlanWizardViewModel.kt", l = {4701}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f13555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f13558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f13559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f13560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r0(fg0.k kVar, h hVar, e23.l<? super Boolean, Unit> lVar, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f13558d = kVar;
        this.f13559e = hVar;
        this.f13560f = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r0 r0Var = new r0(this.f13558d, this.f13559e, this.f13560f, dVar);
        r0Var.f13557c = obj;
        return r0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        fg0.k kVar;
        o53.b0 b0Var = (o53.b0) this.f13557c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13556b;
        if (i14 == 0) {
            o13.r.b(obj);
            new cg0.a(null, 1, null);
            fg0.k kVarA = cg0.a.a(this.f13558d, dg0.a.PRIMARY_EVENT, false);
            cg0.a aVar2 = new cg0.a(null, 1, null);
            this.f13557c = b0Var;
            this.f13555a = kVarA;
            this.f13556b = 1;
            objB = aVar2.b(kVarA, this);
            if (objB == aVar) {
                return aVar;
            }
            kVar = kVarA;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg0.k kVar2 = this.f13555a;
            o13.r.b(obj);
            kVar = kVar2;
            objB = obj;
        }
        v2 v2Var = (v2) objB;
        boolean z14 = v2Var instanceof v2.b;
        e23.l<Boolean, Unit> lVar = this.f13560f;
        if (z14) {
            int i15 = h.S1;
            h hVar = this.f13559e;
            jv1.s sVarI6 = hVar.i6();
            hVar.k8(sVarI6 != null ? jv1.s.a(sVarI6, null, null, kVar, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 511) : null);
            lVar.invoke(Boolean.TRUE);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "onCreatePlan: Error updating event priority to primary event ");
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
            lVar.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
