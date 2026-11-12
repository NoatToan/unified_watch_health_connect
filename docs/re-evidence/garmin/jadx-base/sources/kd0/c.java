package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ActivityRecordingDelegateImpl", f = "ActivityRecordingDelegateImpl.kt", l = {104}, m = "hasGCPlusSubscription", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f104006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104007c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f104006b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104005a = obj;
        this.f104007c |= Integer.MIN_VALUE;
        return this.f104006b.d(this);
    }
}
