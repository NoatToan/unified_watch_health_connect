package zx;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.data.repository.CalendarDetailsRepository", f = "CalendarDetailsRepository.kt", l = {23, 26, 37}, m = "getMonthlyCalendarSummary", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f207303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f207304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f207306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f207307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f207308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f207307e = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207306d = obj;
        this.f207308f |= Integer.MIN_VALUE;
        return this.f207307e.a(null, false, this);
    }
}
