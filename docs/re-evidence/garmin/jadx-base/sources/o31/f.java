package o31;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager", f = "InAppUpdateManager.kt", l = {272}, m = "checkForAppUpdates", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.inappupdate.e f128785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f128787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f128787c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128786b = obj;
        this.f128788d |= Integer.MIN_VALUE;
        return d.a(this.f128787c, null, this);
    }
}
