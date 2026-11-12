package fo1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {1147}, m = "requestAddComment", v = 2)
public final class n1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f72644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(o0 o0Var, t13.d<? super n1> dVar) {
        super(dVar);
        this.f72645b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72644a = obj;
        this.f72646c |= Integer.MIN_VALUE;
        return o0.z4(this.f72645b, null, this);
    }
}
