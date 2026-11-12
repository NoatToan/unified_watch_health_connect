package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.VivoKidConversationViewModelDelegateImp$postVivoKidAdhocComment$1", f = "VivoKidConversationViewModelDelegateImp.kt", l = {53}, m = "invokeSuspend", v = 2)
public final class b2 extends v13.i implements e23.l<t13.d<? super v2<? extends ConversationCommentDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f72477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, String str, ConversationCommentDTO conversationCommentDTO, t13.d<? super b2> dVar) {
        super(1, dVar);
        this.f72477b = c2Var;
        this.f72478c = str;
        this.f72479d = conversationCommentDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b2(this.f72477b, this.f72478c, this.f72479d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ConversationCommentDTO>> dVar) {
        return ((b2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72476a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x1 x1Var = this.f72477b.f72493a;
        this.f72476a = 1;
        x1Var.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(x1Var, new w1(x1Var, this.f72478c, this.f72479d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
