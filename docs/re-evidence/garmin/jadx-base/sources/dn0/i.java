package dn0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import e23.p;
import l52.z;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gsm.GSMRedirectViewModel$fetchWorkoutScheduleData$1", f = "GSMRedirectViewModel.kt", l = {28, 28}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f60514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<g3<WorkoutScheduleDTO>> f60515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j8, y0<g3<WorkoutScheduleDTO>> y0Var, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f60514b = j8;
        this.f60515c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f60514b, this.f60515c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r10 == r0) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60513a;
        y0<g3<WorkoutScheduleDTO>> y0Var = this.f60515c;
        try {
            if (i14 == 0) {
                r.b(obj);
                z.f110389c.getClass();
                z zVarB = z.a.b();
                String strValueOf = String.valueOf(this.f60514b);
                this.f60513a = 1;
                obj = zVarB.I(strValueOf);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            g3.f35298f.getClass();
            y0Var.j(g3.a.d((WorkoutScheduleDTO) obj));
            return Unit.INSTANCE;
            this.f60513a = 2;
            obj = ((i0) obj).await(this);
        } catch (Exception e4) {
            i2.a.c(i2.f36769a, k.class.getName(), "Error fetching workout schedule.");
            y0Var.j(g3.a.a(g3.f35298f, null, e4, null, null, 13));
        }
    }
}
