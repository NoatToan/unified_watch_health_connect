package com.huami.bloodpressure_ui.history;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.ext.BloodPressureExKt;
import com.huami.bloodpressure_ui.history.BloodPressureDataAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B=\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014R-\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureDataAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "Lkotlin/Function1;", "Lcom/huami/bloodpressure_ui/history/OnDataLongClickListener;", "a", "Lkotlin/jvm/functions/Function1;", "getOnDataLongClickListener", "()Lkotlin/jvm/functions/Function1;", "onDataLongClickListener", "", "data", "", "layoutResId", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDataAdapter extends BaseQuickAdapter<BloodPressureHistoryEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Function1<BloodPressureHistoryEntity, Unit> onDataLongClickListener;

    public /* synthetic */ BloodPressureDataAdapter(List list, int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? R.layout.item_bp_data : i, (i2 & 4) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(BloodPressureDataAdapter bloodPressureDataAdapter, BloodPressureHistoryEntity bloodPressureHistoryEntity, View view) {
        Function1<BloodPressureHistoryEntity, Unit> onDataLongClickListener = bloodPressureDataAdapter.getOnDataLongClickListener();
        if (onDataLongClickListener == null) {
            return true;
        }
        onDataLongClickListener.invoke(bloodPressureHistoryEntity);
        return true;
    }

    @Nullable
    public final Function1<BloodPressureHistoryEntity, Unit> getOnDataLongClickListener() {
        return this.onDataLongClickListener;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @Nullable final BloodPressureHistoryEntity item) {
        if (item == null) {
            return;
        }
        helper.setText(R.id.tv_item_history_first, String.valueOf(item.getSbq()));
        int avgSbpStatus = BloodPressureExKt.getAvgSbpStatus(Integer.valueOf(item.getSbq()));
        if (avgSbpStatus == 0) {
            helper.setGone(R.id.tv_item_history_first_status, false);
        } else {
            int i = R.id.tv_item_history_first_status;
            helper.setGone(i, true);
            helper.setImageResource(i, avgSbpStatus > 0 ? R.drawable.ic_bp_high : R.drawable.ic_bp_low);
        }
        helper.setText(R.id.tv_item_history_second, String.valueOf(item.getDbq()));
        int avgDbpStatus = BloodPressureExKt.getAvgDbpStatus(Integer.valueOf(item.getDbq()));
        if (avgDbpStatus == 0) {
            helper.setGone(R.id.tv_item_history_second_status, false);
        } else {
            int i2 = R.id.tv_item_history_second_status;
            helper.setGone(i2, true);
            helper.setImageResource(i2, avgDbpStatus > 0 ? R.drawable.ic_bp_high : R.drawable.ic_bp_low);
        }
        helper.setImageResource(R.id.tv_item_history_device, item.isManual() ? R.drawable.ic_bp_device_edit : R.drawable.ic_bp_device_watch);
        helper.setText(R.id.tv_item_history_time, TimeFormatEx.INSTANCE.formatTimeHM(item.getMeasureTime()));
        ((ConstraintLayout) helper.getView(R.id.container_bp_data_item)).setOnLongClickListener(new View.OnLongClickListener() { // from class: l00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return BloodPressureDataAdapter.b(this.a, item, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureDataAdapter(@NotNull List<BloodPressureHistoryEntity> list, int i, @Nullable Function1<? super BloodPressureHistoryEntity, Unit> function1) {
        super(i, list);
        this.onDataLongClickListener = function1;
    }
}
