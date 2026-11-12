package lo1;

import android.view.View;
import android.widget.PopupMenu;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class h implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f114041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f114042b;

    public h(d dVar, ConversationCommentDTO conversationCommentDTO) {
        this.f114042b = dVar;
        this.f114041a = conversationCommentDTO;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view2) {
        c cVar = this.f114042b.f114021i;
        if (!cVar.f114012d) {
            cVar.f114012d = true;
            PopupMenu popupMenu = new PopupMenu(cVar.f114009a, view2);
            popupMenu.inflate(R.menu.comment_popup_menu);
            String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk());
            ConversationCommentDTO conversationCommentDTO = this.f114041a;
            if (!strValueOf.equals(conversationCommentDTO.f44558m) && !strValueOf.equals(cVar.f114010b)) {
                popupMenu.getMenu().findItem(R.id.menu_item_comment_delete).setVisible(false);
            }
            popupMenu.setOnMenuItemClickListener(new a(cVar, conversationCommentDTO));
            popupMenu.setOnDismissListener(new b(cVar));
            popupMenu.show();
        }
        return true;
    }
}
