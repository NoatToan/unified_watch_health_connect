package fo1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel", f = "ConversationViewModel.kt", l = {1163}, m = "requestAddGroupComment", v = 2)
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f72697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(o0 o0Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f72698b = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f72697a = obj;
        this.f72699c |= Integer.MIN_VALUE;
        return o0.A4(this.f72698b, null, null, this);
    }
}
