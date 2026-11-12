package zx;

import c83.a0;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarDetailsRepository$getMonthlyCalendarSummary$2", f = "CalendarDetailsRepository.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super a0<CalendarDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f207310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f207311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, DateTime dateTime, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f207310b = eVar;
        this.f207311c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f207310b, this.f207311c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<CalendarDTO>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207309a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        yx.b bVar = this.f207310b.f207315a;
        DateTime dateTime = this.f207311c;
        i0<a0<CalendarDTO>> i0VarA = bVar.a(dateTime.getYear(), dateTime.getMonthOfYear() - 1);
        this.f207309a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
