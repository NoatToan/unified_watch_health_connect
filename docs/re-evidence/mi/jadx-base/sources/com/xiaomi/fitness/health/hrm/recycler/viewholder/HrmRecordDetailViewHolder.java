package com.xiaomi.fitness.health.hrm.recycler.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/recycler/viewholder/HrmRecordDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "commonItemViewHolder", "Lcom/xiaomi/fitness/health/hrm/recycler/viewholder/HrmRecordDetailViewHolder$commonItemViewHolder;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class HrmRecordDetailViewHolder extends RecyclerView.d0 {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/recycler/viewholder/HrmRecordDetailViewHolder$commonItemViewHolder;", "Lcom/xiaomi/fitness/health/hrm/recycler/viewholder/HrmRecordDetailViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class commonItemViewHolder extends HrmRecordDetailViewHolder {

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public commonItemViewHolder(@NotNull View view) {
            super(view, null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }
    }

    public /* synthetic */ HrmRecordDetailViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    private HrmRecordDetailViewHolder(View view) {
        super(view);
    }
}
