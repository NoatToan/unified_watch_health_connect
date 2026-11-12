package mh1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.InviteConnectionsViewModel", f = "InviteConnectionsViewModel.kt", l = {97}, m = "getAllInvitedIndexUsers", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f118510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f118511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f118512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f118511b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f118510a = obj;
        this.f118512c |= Integer.MIN_VALUE;
        return w.x4(this.f118511b, 0L, this);
    }
}
