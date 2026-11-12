package ky0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {866, 868}, m = "setEpicPublic", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cy0.k f107489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f107490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f107491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(w0 w0Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f107491c = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107490b = obj;
        this.f107492d |= Integer.MIN_VALUE;
        return this.f107491c.P4(this);
    }
}
