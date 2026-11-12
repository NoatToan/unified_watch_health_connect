package lo1;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;

/* JADX INFO: loaded from: classes10.dex */
public class a implements PopupMenu.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f114006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f114007b;

    public a(c cVar, ConversationCommentDTO conversationCommentDTO) {
        this.f114007b = cVar;
        this.f114006a = conversationCommentDTO;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        ConversationCommentDTO conversationCommentDTO = this.f114006a;
        c cVar = this.f114007b;
        if (itemId == R.id.menu_item_comment_copy_text) {
            cVar.f114011c.b1(conversationCommentDTO.f44555j);
            return true;
        }
        if (menuItem.getItemId() != R.id.menu_item_comment_delete) {
            return false;
        }
        cVar.f114011c.k3(conversationCommentDTO);
        return true;
    }
}
