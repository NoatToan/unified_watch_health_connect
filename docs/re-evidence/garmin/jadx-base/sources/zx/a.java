package zx;

import c83.a0;
import com.garmin.android.apps.connectmobile.calendar.detail.model.CalendarDTO;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calendar/detail/model/CalendarDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarDetailsRepository$getGroupCalendarSummary$2", f = "CalendarDetailsRepository.kt", l = {45}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.l<t13.d<? super a0<CalendarDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f207299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f207300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, String str, int i14, int i15, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f207299b = eVar;
        this.f207300c = str;
        this.f207301d = i14;
        this.f207302e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f207299b, this.f207300c, this.f207301d, this.f207302e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<CalendarDTO>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207298a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<CalendarDTO>> i0VarB = this.f207299b.f207315a.b(this.f207300c, this.f207301d, this.f207302e);
        this.f207298a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
