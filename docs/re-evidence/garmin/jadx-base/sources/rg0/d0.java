package rg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "getCachedReceivedInvites", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f152525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152528d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f152527c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152526b = obj;
        this.f152528d |= Integer.MIN_VALUE;
        return this.f152527c.E4(this);
    }
}
