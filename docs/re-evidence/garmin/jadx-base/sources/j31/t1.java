package j31;

import com.garmin.android.apps.connectmobile.a2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.feature.WiFiFeatureHandler", f = "WiFiFeatureHandler.kt", l = {29, 30}, m = "refreshOnboardingState", v = 2)
public final class t1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f96928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f96929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gn2.c f96930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a2 f96931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f96932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f96933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f96934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f96935h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(s1 s1Var, t13.d<? super t1> dVar) {
        super(dVar);
        this.f96934g = s1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96933f = obj;
        this.f96935h |= Integer.MIN_VALUE;
        return this.f96934g.c(0L, this);
    }
}
