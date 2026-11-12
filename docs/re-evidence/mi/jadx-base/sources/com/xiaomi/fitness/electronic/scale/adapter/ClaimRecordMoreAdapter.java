package com.xiaomi.fitness.electronic.scale.adapter;

import android.annotation.SuppressLint;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.electronic.scale.adapter.ClaimRecordMoreAdapter;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import defpackage.bri;
import defpackage.gui;
import defpackage.oie;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Loie;", "holder", "item", "", "convert", "(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;)V", "", "getCheckList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter$OnCheckedChangedListener;", "checkedChangeListener", "setCheckChangedListener", "(Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter$OnCheckedChangedListener;)V", "checkedChangedListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter$OnCheckedChangedListener;", "<init>", "()V", "OnCheckedChangedListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ClaimRecordMoreAdapter extends BaseQuickAdapter<ClaimRecord, BaseViewHolder> implements oie {

    @Nullable
    private OnCheckedChangedListener checkedChangedListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/ClaimRecordMoreAdapter$OnCheckedChangedListener;", "", "onCheckChanged", "", "isChecked", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCheckedChangedListener {
        void onCheckChanged(boolean isChecked);
    }

    public ClaimRecordMoreAdapter() {
        super(gui.n0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$1(ClaimRecordMoreAdapter this$0, ClaimRecord item, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(item, "$item");
        item.setChecked(z);
        OnCheckedChangedListener onCheckedChangedListener = this$0.checkedChangedListener;
        if (onCheckedChangedListener != null) {
            onCheckedChangedListener.onCheckChanged(item.getIsChecked());
        }
    }

    @NotNull
    public final List<ClaimRecord> getCheckList() {
        ArrayList arrayList = new ArrayList();
        for (ClaimRecord claimRecord : getData()) {
            if (claimRecord.getIsChecked()) {
                arrayList.add(claimRecord);
            }
        }
        return arrayList;
    }

    public final void setCheckChangedListener(@NotNull OnCheckedChangedListener checkedChangeListener) {
        Intrinsics.checkNotNullParameter(checkedChangeListener, "checkedChangeListener");
        this.checkedChangedListener = checkedChangeListener;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    public void convert(@NotNull BaseViewHolder holder, @NotNull final ClaimRecord item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        TextView textView = (TextView) holder.getView(bri.C);
        TextView textView2 = (TextView) holder.getView(bri.B);
        CheckBox checkBox = (CheckBox) holder.getView(bri.z);
        TextView textView3 = (TextView) holder.getView(bri.D);
        checkBox.setChecked(item.getIsChecked());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hy3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ClaimRecordMoreAdapter.convert$lambda$1(this.f20591a, item, compoundButton, z);
            }
        });
        textView.setText(getContext().getResources().getString(zzi.S5));
        textView2.setText(TimeUtils.formatDate(TimeUtils.NEW_FORMAT, Long.valueOf(item.getCreateTime())));
        textView3.setText(item.getWeight() + " Kg");
    }
}
