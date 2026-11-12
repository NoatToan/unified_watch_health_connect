package n70;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetRemainingInReachSubscriptionsUseCase", f = "GetRemainingInReachSubscriptionsUseCase.kt", l = {86}, m = "cleanUpSubscriptionBanners", v = 2)
public final class e3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f124175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f124176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f124177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f124178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f124179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(d3 d3Var, t13.d<? super e3> dVar) {
        super(dVar);
        this.f124178d = d3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124177c = obj;
        this.f124179e |= Integer.MIN_VALUE;
        return d3.a(this.f124178d, this);
    }
}
