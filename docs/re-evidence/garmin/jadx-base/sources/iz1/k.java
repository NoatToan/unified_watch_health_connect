package iz1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.TrainingPriorityViewModel$onSaveClick$1", f = "TrainingPriorityViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f95894a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f95894a = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f95894a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fg0.k kVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        i iVar = this.f95894a;
        jz1.a aVar2 = iVar.I0;
        if (aVar2 != null && (kVar = iVar.I) != null) {
            cg0.a aVar3 = (cg0.a) iVar.f204401r.getValue();
            dg0.a aVar4 = aVar2.f101902a;
            aVar3.getClass();
            fg0.k kVarA = cg0.a.a(kVar, aVar4, true);
            iVar.U4(kVarA);
            iVar.I = kVarA;
        }
        return Unit.INSTANCE;
    }
}
