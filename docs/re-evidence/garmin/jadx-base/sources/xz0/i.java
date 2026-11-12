package xz0;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestPagingSource", f = "InboxRequestPagingSource.kt", l = {75, 78}, m = "getAccountSharingInvites", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f192776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f192777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f192778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f192779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f192778c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192777b = obj;
        this.f192779d |= Integer.MIN_VALUE;
        int i14 = h.f192769g;
        return this.f192778c.f(null, this);
    }
}
