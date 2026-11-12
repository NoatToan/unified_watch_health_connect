package fo1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {867}, m = "fetchActivitySummaryAsync", v = 2)
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f72460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(o0 o0Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f72461b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72460a = obj;
        this.f72462c |= Integer.MIN_VALUE;
        int i14 = o0.H0;
        return this.f72461b.D4(0L, this);
    }
}
