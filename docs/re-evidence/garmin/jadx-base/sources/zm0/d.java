package zm0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.group.service.GroupInvitationQuerySearchPagingSource", f = "GroupInvitationQuerySearchPagingSource.kt", l = {20}, m = "load", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f205290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f205290c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205289b = obj;
        this.f205291d |= Integer.MIN_VALUE;
        return this.f205290c.e(null, this);
    }
}
