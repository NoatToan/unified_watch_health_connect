package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "conversationCommentDTO", "Lcom/garmin/android/apps/connectmobile/v2;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$addGroupComment$2", f = "ConversationViewModel.kt", l = {1127}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<ConversationCommentDTO, t13.d<? super v2<? extends ConversationCommentDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f72757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f72758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(o0 o0Var, String str, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f72758c = o0Var;
        this.f72759d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s0 s0Var = new s0(this.f72758c, this.f72759d, dVar);
        s0Var.f72757b = obj;
        return s0Var;
    }

    @Override // e23.p
    public final Object invoke(ConversationCommentDTO conversationCommentDTO, t13.d<? super v2<? extends ConversationCommentDTO>> dVar) {
        return ((s0) create(conversationCommentDTO, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) this.f72757b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72756a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        this.f72757b = null;
        this.f72756a = 1;
        Object objA4 = o0.A4(this.f72758c, this.f72759d, conversationCommentDTO, this);
        return objA4 == aVar ? aVar : objA4;
    }
}
