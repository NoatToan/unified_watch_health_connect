package mw0;

import h2.j0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.reports.details.BehaviourSummaryDetailsKt$BehaviourSummaryDetails$4$1", f = "BehaviourSummaryDetails.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f121279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j0 j0Var, int i14, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f121279b = j0Var;
        this.f121280c = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f121279b, this.f121280c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121278a;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0Var = this.f121279b;
            int iIntValue = ((Number) j0Var.f80947w.getF182175a()).intValue();
            int i15 = this.f121280c;
            if (iIntValue != i15) {
                this.f121278a = 1;
                if (j0.w(j0Var, i15, this) == aVar) {
                    return aVar;
                }
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
