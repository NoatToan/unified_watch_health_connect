package rg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "getCachedManagedChild", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f152511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f152512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f152513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f152514d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152513c = obj;
        this.f152515e |= Integer.MIN_VALUE;
        return this.f152514d.C4(0L, this);
    }
}
