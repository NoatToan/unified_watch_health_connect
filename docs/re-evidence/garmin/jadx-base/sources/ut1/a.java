package ut1;

import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.viewmodel.ActiveTrainingPlansViewModel$fetchActiveTrainingPlans$1", f = "ActiveTrainingPlansViewModel.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f172572b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f172572b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f172572b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172571a;
        if (i14 == 0) {
            r.b(obj);
            st1.a aVar = this.f172572b.f172582a;
            this.f172571a = 1;
            aVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new st1.b(aVar, null), this);
            if (objE0 != obj2) {
                objE0 = Unit.INSTANCE;
            }
            if (objE0 == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
