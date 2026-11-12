package fy;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.calendar.presentation.detail.CalendarDetailsViewModel", f = "CalendarDetailsViewModel.kt", l = {141}, m = "getMonthlyCalendarData", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f73867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f73868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f73868b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73867a = obj;
        this.f73869c |= Integer.MIN_VALUE;
        return a.x4(this.f73868b, null, this);
    }
}
