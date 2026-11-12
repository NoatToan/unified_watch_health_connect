package h62;

import androidx.lifecycle.y0;
import java.util.List;
import l52.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$fetchWorkoutTypes$1", f = "WorkoutListViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f82273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f82273b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f82273b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82272a;
        m mVar = this.f82273b;
        try {
            if (i14 == 0) {
                r.b(obj);
                y yVar = mVar.f82249a;
                this.f82272a = 1;
                obj = yVar.a(this);
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
            List list = (List) obj;
            y0<l> y0Var = mVar.f82251c;
            l lVarD = y0Var.d();
            if (lVarD != null) {
                y0Var.m(l.a(lVarD, false, list, null, 5));
            }
        } catch (Throwable unused) {
            y0<l> y0Var2 = mVar.f82251c;
            l lVarD2 = y0Var2.d();
            if (lVarD2 != null) {
                y0Var2.m(l.a(lVarD2, false, j0.f134944a, null, 5));
            }
        }
        return Unit.INSTANCE;
    }
}
