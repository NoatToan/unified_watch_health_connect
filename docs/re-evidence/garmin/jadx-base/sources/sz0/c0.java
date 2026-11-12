package sz0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.NotificationsRepo", f = "NotificationsRepo.kt", l = {61, 69}, m = "getInboxNotifications", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f161359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f161360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f161361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f161362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f161361d = a0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f161360c = obj;
        this.f161362e |= Integer.MIN_VALUE;
        return this.f161361d.a(0, null, this);
    }
}
