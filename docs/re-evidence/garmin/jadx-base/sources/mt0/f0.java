package mt0;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f0 extends p005kotlin.jvm.internal.q implements e23.l<com.garmin.android.apps.connectmobile.g3<? extends ConversationCommentDTO>, Unit> {
    public f0(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.leaderboard.challenges.k.class, "handlePostComment", "handlePostComment(Lcom/garmin/android/apps/connectmobile/UIResource;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(com.garmin.android.apps.connectmobile.g3<? extends ConversationCommentDTO> g3Var) {
        com.garmin.android.apps.connectmobile.g3<? extends ConversationCommentDTO> g3Var2 = g3Var;
        g3Var2.getClass();
        ((com.garmin.android.apps.connectmobile.leaderboard.challenges.k) this.receiver).j7(g3Var2);
        return Unit.INSTANCE;
    }
}
