package com.huami.sleep.sleepstatefeel.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.R;
import com.huami.sleep.sleepstatefeel.vo.MonthSleepStateFeelInfo;
import com.huami.sleep.view.UnitTextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/ui/StateFeelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelInfo;", "itemInfo", "", "bindTo", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class StateFeelViewHolder extends RecyclerView.ViewHolder {
    public StateFeelViewHolder(@NotNull ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.slp_item_month_state_feel_layout, viewGroup, false));
    }

    public final void bindTo(@NotNull MonthSleepStateFeelInfo itemInfo) {
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.ratioTv)).setText(itemInfo.getText() + " " + (itemInfo.getRatio() / 10) + "." + (itemInfo.getRatio() % 10) + "%");
        int i = R.id.progress;
        ((ProgressBar) view.findViewById(i)).setMax(1000);
        ((ProgressBar) view.findViewById(i)).setProgress(itemInfo.getRatio());
        ((UnitTextView) view.findViewById(R.id.dayTv)).setValue(itemInfo.getDay(), view.getContext().getResources().getQuantityString(R.plurals.sleep_record_unit, itemInfo.getDay()));
    }
}
