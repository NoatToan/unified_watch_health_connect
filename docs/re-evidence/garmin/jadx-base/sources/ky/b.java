package ky;

import c83.a0;
import com.garmin.android.apps.connectmobile.calendar.model.WorkoutScheduleSummaryDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calendar/model/WorkoutScheduleSummaryDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.calendar.repo.CalendarRepo$getCalendarSummaryForDevice$2", f = "CalendarRepo.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<WorkoutScheduleSummaryDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f107161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f107162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f107163c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, d<? super b> dVar) {
        super(1, dVar);
        this.f107162b = aVar;
        this.f107163c = str;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f107162b, this.f107163c, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<WorkoutScheduleSummaryDTO>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107161a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<WorkoutScheduleSummaryDTO>> i0VarB = this.f107162b.f107160a.b(this.f107163c);
        this.f107161a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
