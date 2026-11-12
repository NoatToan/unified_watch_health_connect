package aj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.notifications.NotificationsViewModel", f = "NotificationsViewModel.kt", l = {154, 164}, m = "getLoginToken", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f3450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f3450d = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f3449c = obj;
        this.f3451e |= Integer.MIN_VALUE;
        return this.f3450d.x4(null, this);
    }
}
