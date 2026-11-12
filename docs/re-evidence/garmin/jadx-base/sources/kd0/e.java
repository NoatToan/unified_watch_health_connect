package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ActivityRecordingDelegateImpl", f = "ActivityRecordingDelegateImpl.kt", l = {77}, m = "saveFavoriteActivitiesToDevice-0E7RQCE", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f104037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104038c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f104037b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104036a = obj;
        this.f104038c |= Integer.MIN_VALUE;
        Object objB = this.f104037b.b(0L, null, this);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : o13.q.a(objB);
    }
}
