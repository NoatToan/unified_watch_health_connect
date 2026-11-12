package au0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.liveactivity.LiveActivityRepositoryWrapper", f = "LiveActivityRepositoryWrapper.kt", l = {229}, m = "saveAndEndActiveSession-IoAF18A", v = 2)
public final class f0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f12906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(z zVar, t13.d<? super f0> dVar) {
        super(dVar);
        this.f12906b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12905a = obj;
        this.f12907c |= Integer.MIN_VALUE;
        Object objA = this.f12906b.a(this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
