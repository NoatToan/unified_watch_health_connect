package f62;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditNotesViewModel$initialize$1", f = "WorkoutEditNotesViewModel.kt", l = {39, 40}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 f69288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f69289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f69290d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 h0Var, String str, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f69288b = h0Var;
        this.f69289c = str;
        this.f69290d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f69288b, this.f69289c, this.f69290d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f69287a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0 h0Var = this.f69288b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = h0Var.f48999a;
            this.f69287a = 1;
            p2Var.setValue(this.f69289c);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        p2 p2Var2 = h0Var.f49001c;
        this.f69287a = 2;
        p2Var2.setValue(this.f69290d);
    }
}
