package com.xiaomi.fitness.relative.ui.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.relative.ui.model.RecommendationLabelModel;
import com.xiaomi.fitness.relative.ui.recycler.RecommendationLabelAdapter;
import defpackage.aoi;
import defpackage.nuf;
import defpackage.qri;
import defpackage.vji;
import defpackage.xui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 !2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003!\"#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rJ\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u001c\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u000fJ\u001c\u0010\u001d\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u0006R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter$RecommendationLabelViewHolder;", "<init>", "()V", "selectedPosition", "", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mOnItemClickListener", "Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter$OnItemClickListener;", "mRecommendationLabelModel", "Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "setOnItemSelectedListener", "", "onItemClickListener", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "onBindViewHolder", "recommendationLabelViewHolder", "position", "refreshRecommendationLabelLayout", "recommendationLabelModel", "setSelectedStyle", "viewHolder", "isPositionAlreadySelected", "", "Companion", "OnItemClickListener", "RecommendationLabelViewHolder", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendationLabelAdapter extends RecyclerView.Adapter<RecommendationLabelViewHolder> {

    @NotNull
    public static final String TAG = "RecommendationLabelAdapter";

    @Nullable
    private OnItemClickListener mOnItemClickListener;

    @Nullable
    private RecommendationLabelModel mRecommendationLabelModel;

    @Nullable
    private Integer selectedPosition;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u00060\u0000R\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter$RecommendationLabelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter;", "recommendationLabelViewHolder", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter$RecommendationLabelViewHolder;I)V", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/relative/ui/recycler/RecommendationLabelAdapter;Landroid/view/View;)V", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RecommendationLabelViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView textView;
        final /* synthetic */ RecommendationLabelAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationLabelViewHolder(@NotNull RecommendationLabelAdapter recommendationLabelAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = recommendationLabelAdapter;
            View viewFindViewById = view.findViewById(qri.A);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.textView = (TextView) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(RecommendationLabelAdapter this$0, int i, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            OnItemClickListener onItemClickListener = this$0.mOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(i);
            }
        }

        public final void bindData(@NotNull RecommendationLabelViewHolder recommendationLabelViewHolder, final int position) {
            Intrinsics.checkNotNullParameter(recommendationLabelViewHolder, "recommendationLabelViewHolder");
            if (this.this$0.mRecommendationLabelModel == null) {
                return;
            }
            TextView textView = this.textView;
            RecommendationLabelModel recommendationLabelModel = this.this$0.mRecommendationLabelModel;
            Intrinsics.checkNotNull(recommendationLabelModel);
            textView.setText(recommendationLabelModel.getLabels().get(position));
            this.this$0.setSelectedStyle(recommendationLabelViewHolder, position);
            if (this.this$0.mOnItemClickListener != null) {
                nuf.f(this.textView);
                TextView textView2 = this.textView;
                final RecommendationLabelAdapter recommendationLabelAdapter = this.this$0;
                textView2.setOnClickListener(new View.OnClickListener() { // from class: njj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RecommendationLabelAdapter.RecommendationLabelViewHolder.bindData$lambda$0(recommendationLabelAdapter, position, view);
                    }
                });
            }
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedStyle(RecommendationLabelViewHolder viewHolder, int position) {
        Integer num = this.selectedPosition;
        if (num != null && position == num.intValue()) {
            viewHolder.itemView.setBackgroundResource(aoi.m);
            viewHolder.getTextView().setTextColor(ExtUtilsKt.getColor(vji.f36949a));
        } else {
            viewHolder.itemView.setBackgroundResource(aoi.n);
            viewHolder.getTextView().setTextColor(ExtUtilsKt.getColor(vji.c));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<String> labels;
        RecommendationLabelModel recommendationLabelModel = this.mRecommendationLabelModel;
        if (recommendationLabelModel == null || (labels = recommendationLabelModel.getLabels()) == null) {
            return 0;
        }
        return labels.size();
    }

    @Nullable
    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    public final boolean isPositionAlreadySelected(int position) {
        Integer num = this.selectedPosition;
        return num != null && num.intValue() == position;
    }

    public final void refreshRecommendationLabelLayout(@NotNull RecommendationLabelModel recommendationLabelModel) {
        Intrinsics.checkNotNullParameter(recommendationLabelModel, "recommendationLabelModel");
        this.mRecommendationLabelModel = recommendationLabelModel;
        notifyDataSetChanged();
    }

    public final void setOnItemSelectedListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.mOnItemClickListener = onItemClickListener;
    }

    public final void setSelectedPosition(@Nullable Integer num) {
        this.selectedPosition = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecommendationLabelViewHolder recommendationLabelViewHolder, int position) {
        Intrinsics.checkNotNullParameter(recommendationLabelViewHolder, "recommendationLabelViewHolder");
        recommendationLabelViewHolder.setIsRecyclable(false);
        recommendationLabelViewHolder.bindData(recommendationLabelViewHolder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecommendationLabelViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(xui.q, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new RecommendationLabelViewHolder(this, viewInflate);
    }
}
