package iz1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel$handleActivePlanRemovalAndUpdatePriority$1$1$1", f = "TrainingPriorityViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f95889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f95890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f95891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg0.k f95892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz1.a f95893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, fg0.k kVar, jz1.a aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f95891c = iVar;
        this.f95892d = kVar;
        this.f95893e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f95891c, this.f95892d, this.f95893e, dVar);
        jVar.f95890b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f95890b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f95889a;
        i iVar = this.f95891c;
        if (i14 == 0) {
            r.b(obj);
            this.f95890b = b0Var;
            this.f95889a = 1;
            obj = i.X4(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            cg0.a aVar2 = (cg0.a) iVar.f204401r.getValue();
            dg0.a aVar3 = this.f95893e.f101902a;
            aVar2.getClass();
            fg0.k kVarA = cg0.a.a(this.f95892d, aVar3, true);
            iVar.U4(kVarA);
            iVar.I = kVarA;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            int i15 = i.N0;
            iVar.O4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error while removing the training plan ");
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "TrainingPriorityViewModel", strD);
        }
        return Unit.INSTANCE;
    }
}
