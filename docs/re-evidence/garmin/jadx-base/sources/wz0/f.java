package wz0;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.pagination.NotificationPagingSource", f = "NotificationPagingSource.kt", l = {245}, m = "handleAccountSharingInvitesUserProfileFrameInfo", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f188167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f188168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f188169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f188170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f188171e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f188170d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188169c = obj;
        this.f188171e |= Integer.MIN_VALUE;
        int i14 = b.f188136g;
        return this.f188170d.j(null, null, this);
    }
}
