package com.xiaomi.fitness.electronic.scale.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordWeekAdapter;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import defpackage.bri;
import defpackage.gui;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0014\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter$ClaimRecordViewHolder;", "claimRecords", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "<init>", "(Ljava/util/List;)V", "getClaimRecords", "()Ljava/util/List;", "setClaimRecords", "checkedChangedListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter$OnCheckedChangedListener;", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "", "onBindViewHolder", "", "myViewHolder", "getItemCount", "updateData", "record", "setCheckChangedListener", "ClaimRecordViewHolder", "OnCheckedChangedListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClaimRecordWeekAdapter extends RecyclerView.Adapter<ClaimRecordViewHolder> {

    @Nullable
    private OnCheckedChangedListener checkedChangedListener;

    @NotNull
    private List<ClaimRecord> claimRecords;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter$ClaimRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "setTitleTv", "(Landroid/widget/TextView;)V", "subTitleTv", "getSubTitleTv", "setSubTitleTv", "Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/CheckBox;", "getCheckBox", "()Landroid/widget/CheckBox;", "setCheckBox", "(Landroid/widget/CheckBox;)V", "weightTv", "getWeightTv", "setWeightTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter;Landroid/view/View;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class ClaimRecordViewHolder extends RecyclerView.d0 {

        @NotNull
        private CheckBox checkBox;

        @NotNull
        private TextView subTitleTv;
        final /* synthetic */ ClaimRecordWeekAdapter this$0;

        @NotNull
        private TextView titleTv;

        @NotNull
        private TextView weightTv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClaimRecordViewHolder(@NotNull ClaimRecordWeekAdapter claimRecordWeekAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = claimRecordWeekAdapter;
            View viewFindViewById = itemView.findViewById(bri.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(bri.B);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.subTitleTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(bri.z);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.checkBox = (CheckBox) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(bri.D);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.weightTv = (TextView) viewFindViewById4;
        }

        @NotNull
        public final CheckBox getCheckBox() {
            return this.checkBox;
        }

        @NotNull
        public final TextView getSubTitleTv() {
            return this.subTitleTv;
        }

        @NotNull
        public final TextView getTitleTv() {
            return this.titleTv;
        }

        @NotNull
        public final TextView getWeightTv() {
            return this.weightTv;
        }

        public final void setCheckBox(@NotNull CheckBox checkBox) {
            Intrinsics.checkNotNullParameter(checkBox, "<set-?>");
            this.checkBox = checkBox;
        }

        public final void setSubTitleTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.subTitleTv = textView;
        }

        public final void setTitleTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.titleTv = textView;
        }

        public final void setWeightTv(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.weightTv = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordWeekAdapter$OnCheckedChangedListener;", "", "onCheckChanged", "", "isChecked", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCheckedChangedListener {
        void onCheckChanged(boolean isChecked);
    }

    public ClaimRecordWeekAdapter(@NotNull List<ClaimRecord> claimRecords) {
        Intrinsics.checkNotNullParameter(claimRecords, "claimRecords");
        this.claimRecords = claimRecords;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(ClaimRecordWeekAdapter this$0, int i, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.claimRecords.size() > i) {
            this$0.claimRecords.get(i).setChecked(z);
            OnCheckedChangedListener onCheckedChangedListener = this$0.checkedChangedListener;
            if (onCheckedChangedListener != null) {
                onCheckedChangedListener.onCheckChanged(z);
            }
        }
    }

    @NotNull
    public final List<ClaimRecord> getClaimRecords() {
        return this.claimRecords;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.claimRecords.size();
    }

    public final void setCheckChangedListener(@NotNull OnCheckedChangedListener checkedChangedListener) {
        Intrinsics.checkNotNullParameter(checkedChangedListener, "checkedChangedListener");
        this.checkedChangedListener = checkedChangedListener;
    }

    public final void setClaimRecords(@NotNull List<ClaimRecord> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.claimRecords = list;
    }

    public final void updateData(@NotNull List<ClaimRecord> record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.claimRecords = record;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull ClaimRecordViewHolder myViewHolder, final int i) {
        Intrinsics.checkNotNullParameter(myViewHolder, "myViewHolder");
        myViewHolder.getCheckBox().setChecked(this.claimRecords.get(i).getIsChecked());
        myViewHolder.getCheckBox().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: iy3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ClaimRecordWeekAdapter.onBindViewHolder$lambda$0(this.f22215a, i, compoundButton, z);
            }
        });
        myViewHolder.getTitleTv().setText(AppUtil.getApp().getText(zzi.S5));
        myViewHolder.getSubTitleTv().setText(TimeUtils.formatDate(TimeUtils.NEW_FORMAT, Long.valueOf(this.claimRecords.get(i).getCreateTime())));
        myViewHolder.getWeightTv().setText(this.claimRecords.get(i).getWeight() + " Kg");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ClaimRecordViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(gui.n0, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new ClaimRecordViewHolder(this, viewInflate);
    }
}
