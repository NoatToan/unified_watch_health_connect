package ey;

import androidx.lifecycle.t0;
import c22.j0;
import com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.CalendarSyncViewModel$getSendCalendarSummary$1", f = "CalendarSyncViewModel.kt", l = {29, 31, 33, 37}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<t0<g3<? extends WorkoutScheduleSummaryDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f67064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f67064c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f67064c, dVar);
        cVar.f67063b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends WorkoutScheduleSummaryDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((c) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        t0 t0Var = (t0) this.f67063b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67062a;
        if (i14 == 0) {
            o13.r.b(obj);
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f67063b = t0Var;
            this.f67062a = 1;
            if (t0Var.emit(g3VarC, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g3.a aVar2 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                aVar2.getClass();
                g3 g3VarD = g3.a.d(t7);
                this.f67063b = null;
                this.f67062a = 3;
            } else {
                g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f67063b = null;
                this.f67062a = 4;
            }
        } else {
            if (i14 != 3 && i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        String strB = j0.b(DateTime.now(), "yyyy-MM-dd", null);
        ky.a aVar3 = this.f67064c.f67069a;
        this.f67063b = t0Var;
        this.f67062a = 2;
        aVar3.getClass();
        obj = f0.J(aVar3, new ky.b(aVar3, strB, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                g3.a aVar4 = g3.f35298f;
                T t14 = ((v2.b) v2Var).f47386a;
                aVar4.getClass();
                g3 g3VarD2 = g3.a.d(t14);
                this.f67063b = null;
                this.f67062a = 3;
            } else {
                g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                this.f67063b = null;
                this.f67062a = 4;
            }
        }
        return aVar;
    }
}
