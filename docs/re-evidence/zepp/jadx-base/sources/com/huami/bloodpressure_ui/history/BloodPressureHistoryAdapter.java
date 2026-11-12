package com.huami.bloodpressure_ui.history;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.bloodpressure_ui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0010\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016R-\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryAdapter;", "Lcom/huami/bloodpressure_ui/history/BloodPressureTimeAdapter;", "Lcom/huami/bloodpressure_ui/history/BloodPressureHistoryEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "holder", "Lcom/huami/bloodpressure_ui/history/BloodPressureTimeEntity;", "item", "", "onDataList", "Lkotlin/Function1;", "Lcom/huami/bloodpressure_ui/history/OnDataLongClickListener;", "c", "Lkotlin/jvm/functions/Function1;", "getOnDataLongClickListener", "()Lkotlin/jvm/functions/Function1;", "onDataLongClickListener", "", "historyList", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureHistoryAdapter extends BloodPressureTimeAdapter<BloodPressureHistoryEntity> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function1<BloodPressureHistoryEntity, Unit> onDataLongClickListener;

    public /* synthetic */ BloodPressureHistoryAdapter(List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : function1);
    }

    @Nullable
    public final Function1<BloodPressureHistoryEntity, Unit> getOnDataLongClickListener() {
        return this.onDataLongClickListener;
    }

    @Override // com.huami.bloodpressure_ui.history.BloodPressureTimeAdapter
    public void onDataList(@NotNull BaseViewHolder holder, @Nullable BloodPressureTimeEntity<BloodPressureHistoryEntity> item) {
        RecyclerView recyclerView = (RecyclerView) holder.getView(R.id.item_bp_history_recycler_view);
        if (item == null) {
            return;
        }
        recyclerView.setAdapter(new BloodPressureDataAdapter(item.getMDayLabelData(), 0, getOnDataLongClickListener(), 2, null));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureHistoryAdapter(@NotNull List<BloodPressureTimeEntity<BloodPressureHistoryEntity>> list, @Nullable Function1<? super BloodPressureHistoryEntity, Unit> function1) {
        super(list);
        this.onDataLongClickListener = function1;
    }
}
