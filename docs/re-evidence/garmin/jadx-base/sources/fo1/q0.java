package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class q0 extends p005kotlin.jvm.internal.q implements e23.p<ConversationCommentDTO, t13.d<? super v2<? extends ConversationCommentDTO>>, Object> {
    public q0(Object obj) {
        super(2, obj, o0.class, "requestAddComment", "requestAddComment(Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // e23.p
    public final Object invoke(ConversationCommentDTO conversationCommentDTO, t13.d<? super v2<? extends ConversationCommentDTO>> dVar) {
        return o0.z4((o0) this.receiver, conversationCommentDTO, dVar);
    }
}
