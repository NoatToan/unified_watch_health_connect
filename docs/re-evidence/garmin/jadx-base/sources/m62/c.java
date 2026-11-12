package m62;

import androidx.lifecycle.t0;
import c22.j0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import e23.p;
import l52.b0;
import l52.z;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutScheduleDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeViewModel$addWorkoutToTrainingPlan$1", f = "ScheduleWorkoutTypeViewModel.kt", l = {36, 37, 39, 43}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<t0<g3<? extends WorkoutScheduleDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f116895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f116897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f116898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f116899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f116900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f116901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DateTime dateTime, d dVar, long j8, long j14, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f116898d = dateTime;
        this.f116899e = dVar;
        this.f116900f = j8;
        this.f116901g = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f116898d, this.f116899e, this.f116900f, this.f116901g, dVar);
        cVar.f116897c = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends WorkoutScheduleDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L28;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String strB;
        Object objJ;
        v2 v2Var;
        t0 t0Var = (t0) this.f116897c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116896b;
        if (i14 == 0) {
            r.b(obj);
            strB = j0.b(this.f116898d, "yyyy-MM-dd", null);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f116897c = t0Var;
            this.f116895a = strB;
            this.f116896b = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            strB = this.f116895a;
            r.b(obj);
        } else if (i14 == 2) {
            r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                g3.a aVar2 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                aVar2.getClass();
                g3 g3VarD = g3.a.d(t7);
                this.f116897c = null;
                this.f116895a = null;
                this.f116896b = 3;
            } else {
                g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f116897c = null;
                this.f116895a = null;
                this.f116896b = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
        String str = strB;
        z zVar = this.f116899e.f116902a;
        this.f116897c = t0Var;
        this.f116895a = null;
        this.f116896b = 2;
        zVar.getClass();
        objJ = f0.J(zVar, new b0(zVar, this.f116900f, this.f116901g, str, null), this);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                g3.a aVar3 = g3.f35298f;
                T t14 = ((v2.b) v2Var).f47386a;
                aVar3.getClass();
                g3 g3VarD2 = g3.a.d(t14);
                this.f116897c = null;
                this.f116895a = null;
                this.f116896b = 3;
            } else {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f116897c = null;
                this.f116895a = null;
                this.f116896b = 4;
            }
        }
        return aVar;
    }
}
