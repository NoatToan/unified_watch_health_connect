package g60;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.DefaultCriticalSwimSpeedRepository", f = "CriticalSwimSpeedRepository.kt", l = {49}, m = "getLatestCriticalSwimSpeed", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f76041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f76041b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76040a = obj;
        this.f76042c |= Integer.MIN_VALUE;
        return this.f76041b.b(null, this);
    }
}
