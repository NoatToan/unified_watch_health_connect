package com.xiaomi.fitness.heartrate.ui.choice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter;
import com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder;
import defpackage.lui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceAdapter;", "Lcom/xiaomi/fitness/baseui/recyclerview/adapter/BaseAdapter;", "Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceItem;", "<init>", "()V", "createViewHolder", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "ChoiceItemViewHolder", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChoiceAdapter extends BaseAdapter<ChoiceItem> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceAdapter$ChoiceItemViewHolder;", "Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/BaseViewHolder;", "Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceItem;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChoiceItemViewHolder extends BaseViewHolder<ChoiceItem> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoiceItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        @Override // com.xiaomi.fitness.baseui.recyclerview.viewholder.BaseViewHolder
        public void bind(@NotNull ChoiceItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            View view = this.itemView;
            if (view instanceof CheckedTitleSubtitleView) {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.heartrate.ui.choice.CheckedTitleSubtitleView");
                ((CheckedTitleSubtitleView) view).setChecked(item.getChecked());
                View view2 = this.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.xiaomi.fitness.heartrate.ui.choice.CheckedTitleSubtitleView");
                ((CheckedTitleSubtitleView) view2).setTitle(item.getTitleId());
                View view3 = this.itemView;
                Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.xiaomi.fitness.heartrate.ui.choice.CheckedTitleSubtitleView");
                ((CheckedTitleSubtitleView) view3).setSummary(item.getSummaryId());
            }
        }
    }

    public ChoiceAdapter() {
        super(null, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.recyclerview.adapter.BaseAdapter
    @NotNull
    public BaseViewHolder<ChoiceItem> createViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = inflater.inflate(lui.h, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ChoiceItemViewHolder(viewInflate);
    }
}
