package rg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "getCachedIssuedInvite", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f152646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f152647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f152648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f152649d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152648c = obj;
        this.f152650e |= Integer.MIN_VALUE;
        return this.f152649d.A4(0L, this);
    }
}
