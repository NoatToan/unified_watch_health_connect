package com.huami.snore.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.snore.core.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/snore/ui/adapter/FooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "", "showTopTip", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class FooterViewHolder extends RecyclerView.ViewHolder {
    public FooterViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.snore_list_footer_layout, viewGroup, false));
    }

    public final void bindTo(boolean showTopTip) {
        ((LinearLayout) this.itemView.findViewById(R.id.topTip)).setVisibility(showTopTip ? 0 : 8);
    }
}
