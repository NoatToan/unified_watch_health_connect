package xz0;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestPagingSource", f = "InboxRequestPagingSource.kt", l = {89}, m = "handleAccountSharingInvitesUserProfileFrameInfo", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f192780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f192781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f192782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f192783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f192784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f192783d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192782c = obj;
        this.f192784e |= Integer.MIN_VALUE;
        int i14 = h.f192769g;
        return this.f192783d.g(null, null, this);
    }
}
