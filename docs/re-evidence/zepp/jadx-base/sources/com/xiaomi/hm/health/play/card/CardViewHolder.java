package com.xiaomi.hm.health.play.card;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/xiaomi/hm/health/play/card/CardUiData;", "params", "", "bind", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardViewHolder extends RecyclerView.ViewHolder {
    public CardViewHolder(@NotNull Context context) {
        super(new DataCardView(context, null, 0, 6, null));
    }

    public final void bind(@NotNull CardUiData params) {
        ((DataCardView) this.itemView).setCardParams(params);
    }
}
