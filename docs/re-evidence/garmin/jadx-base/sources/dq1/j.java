package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {78, 80, 81}, m = "onUserSignedIn", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f60757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f60759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, t13.d<? super j> dVar2) {
        super(dVar2);
        this.f60759c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60758b = obj;
        this.f60760d |= Integer.MIN_VALUE;
        return this.f60759c.f(this);
    }
}
