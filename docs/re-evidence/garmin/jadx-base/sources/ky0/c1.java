package ky0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {526}, m = "loadCoursesList", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(w0 w0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f107244b = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107243a = obj;
        this.f107245c |= Integer.MIN_VALUE;
        return this.f107244b.E4(this);
    }
}
