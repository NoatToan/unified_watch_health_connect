package lo1;

import android.view.View;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;

/* JADX INFO: loaded from: classes10.dex */
public class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f114037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f114038b;

    public f(d dVar, ConversationCommentDTO conversationCommentDTO) {
        this.f114038b = dVar;
        this.f114037a = conversationCommentDTO;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        d.InterfaceC2172d interfaceC2172d = this.f114038b.f114020h;
        if (interfaceC2172d != null) {
            interfaceC2172d.a0(this.f114037a);
        }
    }
}
