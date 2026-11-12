package bu0;

import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.domain.SaveAndEndLockedInLiveActivitySessionUseCase", f = "SaveAndEndLockedInLiveActivitySessionUseCase.kt", l = {12}, m = "invoke-IoAF18A", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f21215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f21215b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21214a = obj;
        this.f21216c |= Integer.MIN_VALUE;
        Object objA = this.f21215b.a(this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : q.a(objA);
    }
}
