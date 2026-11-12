package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ActivityRecordingDelegateImpl", f = "ActivityRecordingDelegateImpl.kt", l = {99}, m = "getMyWorkoutTypes", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f103985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f103985b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103984a = obj;
        this.f103986c |= Integer.MIN_VALUE;
        return this.f103985b.a(this);
    }
}
