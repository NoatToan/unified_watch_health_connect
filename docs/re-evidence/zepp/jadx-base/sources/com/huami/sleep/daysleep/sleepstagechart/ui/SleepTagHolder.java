package com.huami.sleep.daysleep.sleepstagechart.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepTagHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagHolder extends RecyclerView.ViewHolder {
    public SleepTagHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sleep_tag_layout, viewGroup, false));
    }

    public final void bindTo(@Nullable SleepTagDataVo item) {
        int color;
        View view = this.itemView;
        int i = R.id.titleTv;
        ((TextView) view.findViewById(i)).setText(item == null ? null : item.getTag());
        TextView textView = (TextView) view.findViewById(i);
        if (item != null && item.getTagType() == SleepTagType.ADD.getValue()) {
            color = ContextCompat.getColor(view.getContext(), R.color.s3);
        } else {
            color = item != null && item.isSelect() ? ContextCompat.getColor(view.getContext(), R.color.s38) : ContextCompat.getColor(view.getContext(), R.color.s1);
        }
        textView.setTextColor(color);
        ((TextView) view.findViewById(i)).setBackground(item != null && item.isSelect() ? ContextCompat.getDrawable(view.getContext(), R.drawable.sleep_main_red_bg) : ContextCompat.getDrawable(view.getContext(), R.drawable.sleep_main_bg));
        ((TextView) view.findViewById(i)).setTextSize(item != null && item.getTagType() == SleepTagType.ADD.getValue() ? 18.0f : 13.0f);
    }
}
