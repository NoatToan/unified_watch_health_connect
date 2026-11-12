package r52;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.WorkoutsPagingSource", f = "WorkoutsPagingSource.kt", l = {25}, m = "load", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f150510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f150511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f150512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f150513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f150513d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150512c = obj;
        this.f150514e |= Integer.MIN_VALUE;
        return this.f150513d.e(null, this);
    }
}
