package ky0;

import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailViewModel", f = "MultiDayActivitiesDetailViewModel.kt", l = {717, 718, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD}, m = "refreshMultiDayActivity", v = 2)
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f107448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f107449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(w0 w0Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f107449b = w0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f107448a = obj;
        this.f107450c |= Integer.MIN_VALUE;
        return this.f107449b.M4(this);
    }
}
