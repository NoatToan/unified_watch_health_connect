package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ActivityRecordingDelegateImpl", f = "ActivityRecordingDelegateImpl.kt", l = {63}, m = "getFavoriteActivitiesFromCloud-gIAlu-s", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f103959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f103959b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103958a = obj;
        this.f103960c |= Integer.MIN_VALUE;
        Object objI = this.f103959b.i(0L, this);
        return objI == u13.a.COROUTINE_SUSPENDED ? objI : o13.q.a(objI);
    }
}
