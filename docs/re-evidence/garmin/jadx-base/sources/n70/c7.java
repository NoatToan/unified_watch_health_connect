package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.IsInboxUnreadBubbleRequiredUseCase", f = "IsInboxUnreadBubbleRequiredUseCase.kt", l = {39}, m = "checkInboxUnread", v = 2)
public final class c7 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b7 f124116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(b7 b7Var, t13.d<? super c7> dVar) {
        super(dVar);
        this.f124116b = b7Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124115a = obj;
        this.f124117c |= Integer.MIN_VALUE;
        return b7.a(this.f124116b, this);
    }
}
