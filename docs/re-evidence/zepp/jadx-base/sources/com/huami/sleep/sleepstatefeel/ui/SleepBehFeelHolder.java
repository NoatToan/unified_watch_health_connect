package com.huami.sleep.sleepstatefeel.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.sleepstatefeel.vo.SleepStateFeelVo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/SleepBehFeelHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/sleepstatefeel/vo/SleepStateFeelVo;", "item", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBehFeelHolder extends RecyclerView.ViewHolder {
    public SleepBehFeelHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sleep_beh_feel_layout, viewGroup, false));
    }

    public final void bindTo(@NotNull SleepStateFeelVo item) {
        View view = this.itemView;
        String type = item.getType();
        if (Intrinsics.areEqual(type, DataConstant.TYPE_SLEEP_STATE)) {
            ViewExKt.setVisible((ImageView) view.findViewById(R.id.iconFeeling), false);
            int i = R.id.iconState;
            ViewExKt.setVisible((ImageView) view.findViewById(i), true);
            ((ImageView) view.findViewById(i)).setImageResource(item.getResIconId());
        } else if (Intrinsics.areEqual(type, DataConstant.TYPE_SLEEP_FEEL)) {
            int i2 = R.id.iconFeeling;
            ViewExKt.setVisible((ImageView) view.findViewById(i2), true);
            ViewExKt.setVisible((ImageView) view.findViewById(R.id.iconState), false);
            ((ImageView) view.findViewById(i2)).setImageResource(item.getResIconId());
        }
        ((ImageView) view.findViewById(R.id.selectIv)).setVisibility(item.getSelected() ? 0 : 4);
        ((TextView) view.findViewById(R.id.titleTv)).setText(view.getContext().getString(item.getResTextId()));
    }
}
