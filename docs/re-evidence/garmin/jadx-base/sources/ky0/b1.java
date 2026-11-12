package ky0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {548}, m = "loadCourseData", v = 2)
public final class b1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107217c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(w0 w0Var, t13.d<? super b1> dVar) {
        super(dVar);
        this.f107216b = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107215a = obj;
        this.f107217c |= Integer.MIN_VALUE;
        return this.f107216b.D4(null, this);
    }
}
