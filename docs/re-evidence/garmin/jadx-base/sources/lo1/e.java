package lo1;

import android.view.View;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.VivoKidChallengeConversationCommentDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f114035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f114036b;

    public e(d dVar, ConversationCommentDTO conversationCommentDTO) {
        this.f114036b = dVar;
        this.f114035a = conversationCommentDTO;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        bv.g gVar = (bv.g) KoinJavaComponent.get(bv.g.class);
        ConversationCommentDTO conversationCommentDTO = this.f114035a;
        boolean z14 = conversationCommentDTO instanceof VivoKidChallengeConversationCommentDTO;
        d dVar = this.f114036b;
        if (!z14) {
            gVar.b(dVar.f114017e, conversationCommentDTO.f44550e, conversationCommentDTO.f44551f);
        } else {
            if (((VivoKidChallengeConversationCommentDTO) conversationCommentDTO).f44563r != -1) {
                return;
            }
            gVar.b(dVar.f114017e, conversationCommentDTO.f44550e, conversationCommentDTO.f44551f);
        }
    }
}
