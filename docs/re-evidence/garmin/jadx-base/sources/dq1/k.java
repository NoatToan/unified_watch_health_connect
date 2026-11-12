package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {202, 147, 150, 151, 216}, m = "refreshConsents", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f60761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f60762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f60763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f60764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f60766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f60767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60768h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, t13.d<? super k> dVar2) {
        super(dVar2);
        this.f60767g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60766f = obj;
        this.f60768h |= Integer.MIN_VALUE;
        return d.a(this.f60767g, null, false, this);
    }
}
