package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.WorkoutDelegateImpl", f = "WorkoutDelegateImpl.kt", l = {199}, m = "getSTPScheduleData", v = 2)
public final class g7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c7 f104091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(c7 c7Var, t13.d<? super g7> dVar) {
        super(dVar);
        this.f104091b = c7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104090a = obj;
        this.f104092c |= Integer.MIN_VALUE;
        return this.f104091b.l(0L, this);
    }
}
