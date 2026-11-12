package nt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.WorkoutCardStringsDataSource", f = "WorkoutCardStringsDataSource.kt", l = {33, 33, 35, 36}, m = "getTitle")
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f127860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f127861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f127862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f127863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f127864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f127863d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f127862c = obj;
        this.f127864e |= Integer.MIN_VALUE;
        return this.f127863d.c(this);
    }
}
