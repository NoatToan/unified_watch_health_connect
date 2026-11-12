package com.huami.sleep.daysleep.sleepstagechart.ui;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectItemInfoVo;
import com.huami.sleep.ext.ViewExKt;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/DataHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectItemInfoVo;", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DataHolder extends RecyclerView.ViewHolder {
    public DataHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sleep_data_overlay, viewGroup, false));
    }

    public final void bindTo(@Nullable SelectItemInfoVo item) {
        if (item == null) {
            return;
        }
        View view = this.itemView;
        int i = R.id.titleTv;
        ((TextView) view.findViewById(i)).setText(item.getTitle());
        if (item.getSelected()) {
            ((TextView) view.findViewById(i)).setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.slp_add_info_selected_bg));
            Drawable background = ((TextView) view.findViewById(i)).getBackground();
            Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ViewExKt.addAlpha((GradientDrawable) background, 0.1d, ContextCompat.getColor(view.getContext(), R.color.p3));
        } else {
            ((TextView) view.findViewById(i)).setBackground(ContextCompat.getDrawable(view.getContext(), R.drawable.slp_add_info_bg));
            Drawable background2 = ((TextView) view.findViewById(i)).getBackground();
            Objects.requireNonNull(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ViewExKt.addAlpha((GradientDrawable) background2, 0.1d, ContextCompat.getColor(view.getContext(), R.color.s3));
        }
        ViewExKt.setVisible((ImageView) view.findViewById(R.id.selectedIV), item.getSelected());
        Drawable drawable = ContextCompat.getDrawable(view.getContext(), item.getIcRes());
        if (drawable == null) {
            drawable = null;
        } else {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        ((TextView) view.findViewById(i)).setCompoundDrawablesRelative(drawable, null, null, null);
    }
}
