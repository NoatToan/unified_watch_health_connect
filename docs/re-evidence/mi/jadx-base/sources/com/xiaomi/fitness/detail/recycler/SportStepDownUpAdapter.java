package com.xiaomi.fitness.detail.recycler;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.data.StepDownUpData;
import com.xiaomi.fitness.detail.view.SportPaceSegmentView;
import defpackage.b0o;
import defpackage.bsi;
import defpackage.dki;
import defpackage.ivi;
import defpackage.m9f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "", "Lcom/xiaomi/fitness/detail/data/StepDownUpData;", "mStepDownUpData", "updateAllDataList", "(Ljava/util/List;)V", "", "mDataList", "Ljava/util/List;", "<init>", "()V", "DetailViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportStepDownUpAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final List<StepDownUpData> mDataList = new ArrayList();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter$DetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/detail/data/StepDownUpData;", "data", "", "position", "", "bindData", "(Lcom/xiaomi/fitness/detail/data/StepDownUpData;I)V", "Landroid/widget/TextView;", "speed", "Landroid/widget/TextView;", "Landroid/widget/RelativeLayout;", "relativeView", "Landroid/widget/RelativeLayout;", "Lcom/xiaomi/fitness/detail/view/SportPaceSegmentView;", "Lb0o;", "paceSegmentView", "Lcom/xiaomi/fitness/detail/view/SportPaceSegmentView;", "getPaceSegmentView", "()Lcom/xiaomi/fitness/detail/view/SportPaceSegmentView;", "setPaceSegmentView", "(Lcom/xiaomi/fitness/detail/view/SportPaceSegmentView;)V", "level", "time", "downUp", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DetailViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView downUp;

        @NotNull
        private final TextView level;

        @NotNull
        private SportPaceSegmentView<b0o> paceSegmentView;

        @NotNull
        private final RelativeLayout relativeView;

        @NotNull
        private final TextView speed;

        @NotNull
        private final TextView time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(bsi.A6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.speed = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(bsi.z5);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.relativeView = (RelativeLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(bsi.K1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.paceSegmentView = (SportPaceSegmentView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(bsi.F3);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.level = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(bsi.v7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.time = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(bsi.J1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.downUp = (TextView) viewFindViewById6;
        }

        @SuppressLint({"ResourceAsColor"})
        public final void bindData(@NotNull StepDownUpData data, int position) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (position == 0) {
                this.relativeView.setVisibility(8);
                this.downUp.setVisibility(0);
                this.speed.setTextColor(ExtUtilsKt.getColor(dki.J0));
                this.level.setTextColor(ExtUtilsKt.getColor(dki.J0));
                this.time.setTextColor(ExtUtilsKt.getColor(dki.J0));
                this.downUp.setTextColor(ExtUtilsKt.getColor(dki.J0));
                return;
            }
            b0o b0oVar = new b0o(1, data.getDownUpValue(), data.getDownUpValue(), data.getDownUp(), 0);
            if (data.getFastType()) {
                b0oVar.e = 1;
            }
            this.paceSegmentView.e(b0oVar, new m9f(100.0f, 0.0f), true, 4);
            this.speed.setText(data.getSpeed());
            this.level.setText(data.getLevel());
            this.time.setText(data.getTime());
        }

        @NotNull
        public final SportPaceSegmentView<b0o> getPaceSegmentView() {
            return this.paceSegmentView;
        }

        public final void setPaceSegmentView(@NotNull SportPaceSegmentView<b0o> sportPaceSegmentView) {
            Intrinsics.checkNotNullParameter(sportPaceSegmentView, "<set-?>");
            this.paceSegmentView = sportPaceSegmentView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.mDataList.isEmpty()) {
            return 0;
        }
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DetailViewHolder) {
            ((DetailViewHolder) holder).bindData(this.mDataList.get(position), position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.l0, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new DetailViewHolder(viewInflate);
    }

    public final void updateAllDataList(@NotNull List<StepDownUpData> mStepDownUpData) {
        Intrinsics.checkNotNullParameter(mStepDownUpData, "mStepDownUpData");
        this.mDataList.clear();
        this.mDataList.addAll(mStepDownUpData);
        notifyDataSetChanged();
    }
}
