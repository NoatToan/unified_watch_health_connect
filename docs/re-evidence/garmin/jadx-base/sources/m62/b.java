package m62;

import androidx.lifecycle.t0;
import c22.j0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import e23.p;
import l52.z;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeViewModel$addWorkoutToCalendar$1", f = "ScheduleWorkoutTypeViewModel.kt", l = {18, 19, 21, 25}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<t0<g3<? extends WorkoutScheduleDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f116889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f116891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f116892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f116893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f116894f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DateTime dateTime, d dVar, long j8, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f116892d = dateTime;
        this.f116893e = dVar;
        this.f116894f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f116892d, this.f116893e, this.f116894f, dVar);
        bVar.f116891c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends WorkoutScheduleDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((b) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strB;
        v2 v2Var;
        t0 t0Var = (t0) this.f116891c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116890b;
        if (i14 == 0) {
            r.b(obj);
            strB = j0.b(this.f116892d, "\"yyyy-MM-dd\"", null);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f116891c = t0Var;
            this.f116889a = strB;
            this.f116890b = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            strB = this.f116889a;
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g3.a aVar2 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                aVar2.getClass();
                g3 g3VarD = g3.a.d(t7);
                this.f116891c = null;
                this.f116889a = null;
                this.f116890b = 3;
            } else {
                g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f116891c = null;
                this.f116889a = null;
                this.f116890b = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        if (strB != null) {
            z zVar = this.f116893e.f116902a;
            this.f116891c = t0Var;
            this.f116889a = null;
            this.f116890b = 2;
            obj = zVar.j(this.f116894f, strB, this);
        } else {
            v2Var = null;
            if (v2Var instanceof v2.b) {
                g3.a aVar3 = g3.f35298f;
                T t14 = ((v2.b) v2Var).f47386a;
                aVar3.getClass();
                g3 g3VarD2 = g3.a.d(t14);
                this.f116891c = null;
                this.f116889a = null;
                this.f116890b = 3;
            } else {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f116891c = null;
                this.f116889a = null;
                this.f116890b = 4;
            }
        }
        return aVar;
    }
}
