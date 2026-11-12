package com.huami.message.ui.submessage.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.message.ui.R;
import com.huami.widget.typeface.TypefaceTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/message/ui/submessage/viewholder/GroupViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "type", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class GroupViewHolder extends RecyclerView.ViewHolder {
    public GroupViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mc_item_sub_message_group_label, viewGroup, false));
    }

    public final void bind(int type) {
        View view = this.itemView;
        if (type == 0) {
            ((TypefaceTextView) view.findViewById(R.id.tv_group_name)).setText(view.getContext().getText(R.string.mc_latest_news));
            return;
        }
        if (type == 1) {
            ((TypefaceTextView) view.findViewById(R.id.tv_group_name)).setText(view.getContext().getText(R.string.mc_history_news));
        } else if (type != 3) {
            ((TypefaceTextView) view.findViewById(R.id.tv_group_name)).setText(view.getContext().getText(R.string.mc_history_notification));
        } else {
            ((TypefaceTextView) view.findViewById(R.id.tv_group_name)).setText(view.getContext().getText(R.string.mc_latest_notification));
        }
    }
}
