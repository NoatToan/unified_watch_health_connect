package ky0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {697}, m = "loadDailyNotes", v = 2)
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(w0 w0Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f107274b = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107273a = obj;
        this.f107275c |= Integer.MIN_VALUE;
        return this.f107274b.F4(this);
    }
}
