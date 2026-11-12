package ut1;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import q92.x;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.viewmodel.ActiveTrainingPlansViewModel$fetchAtpConsent$1", f = "ActiveTrainingPlansViewModel.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f172573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f172575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f172575c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f172575c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172574b;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var2 = this.f172575c.f172589h;
            o oVar = o.f136619a;
            x xVar = x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN;
            this.f172573a = p2Var2;
            this.f172574b = 1;
            Object objC = oVar.c(xVar, this);
            if (objC == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
            obj = objC;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f172573a;
            r.b(obj);
        }
        p2Var.setValue(obj);
        return Unit.INSTANCE;
    }
}
