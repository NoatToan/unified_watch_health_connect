package rg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "updateViewerData", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ue0.n f152550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f152551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f152552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f152553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f152554e = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152553d = obj;
        this.f152555f |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h.y4(this.f152554e, null, 0L, this);
    }
}
