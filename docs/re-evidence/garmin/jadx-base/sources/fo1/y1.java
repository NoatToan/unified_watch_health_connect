package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.VivoKidConversationViewModelDelegateImp$deleteVivoKidAdhocComment$1", f = "VivoKidConversationViewModelDelegateImp.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f72874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(c2 c2Var, String str, String str2, ConversationCommentDTO conversationCommentDTO, t13.d<? super y1> dVar) {
        super(1, dVar);
        this.f72874b = c2Var;
        this.f72875c = str;
        this.f72876d = str2;
        this.f72877e = conversationCommentDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y1(this.f72874b, this.f72875c, this.f72876d, this.f72877e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((y1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72873a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x1 x1Var = this.f72874b.f72493a;
        this.f72873a = 1;
        x1Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(x1Var, new t1(x1Var, this.f72875c, this.f72876d, this.f72877e, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
