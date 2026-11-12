package mk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.thirdpartyapps.ThirdPartyAppsListViewModel", f = "ThirdPartyAppsListViewModel.kt", l = {50}, m = "getConnectedThirdPartyApps", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f119179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f119180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f119181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f119180b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119179a = obj;
        this.f119181c |= Integer.MIN_VALUE;
        return h.x4(this.f119180b, this);
    }
}
