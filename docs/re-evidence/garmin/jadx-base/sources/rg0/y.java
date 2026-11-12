package rg0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewersViewModel", f = "AuthorizedViewersViewModel.kt", l = {441}, m = "getCachedAdminGuardianMembers", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f152641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f152642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f152643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h f152644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.h hVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f152644d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152643c = obj;
        this.f152645e |= Integer.MIN_VALUE;
        return this.f152644d.z4(0L, this);
    }
}
