package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.ActivityRecordingDelegateImpl", f = "ActivityRecordingDelegateImpl.kt", l = {48}, m = "saveFavoriteActivitiesToCloud-BWLJW6A", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f104026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f104026b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104025a = obj;
        this.f104027c |= Integer.MIN_VALUE;
        Object objJ = this.f104026b.j(null, 0L, null, this);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : o13.q.a(objJ);
    }
}
