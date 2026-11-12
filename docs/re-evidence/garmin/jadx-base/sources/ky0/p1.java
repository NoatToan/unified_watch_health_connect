package ky0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {829}, m = "saveEpicNotes", v = 2)
public final class p1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(w0 w0Var, t13.d<? super p1> dVar) {
        super(dVar);
        this.f107457b = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107456a = obj;
        this.f107458c |= Integer.MIN_VALUE;
        return this.f107457b.O4(null, this);
    }
}
