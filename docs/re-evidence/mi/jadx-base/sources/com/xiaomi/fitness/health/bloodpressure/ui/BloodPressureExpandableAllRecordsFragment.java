package com.xiaomi.fitness.health.bloodpressure.ui;

import android.os.Bundle;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\fH\u0016¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "Lcom/xiaomi/fitness/health/bloodpressure/ui/WrapperBloodPressureItem;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "<init>", "()V", "onAdapterItemClick", "", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodPressureExpandableAllRecordsFragment extends Hilt_BloodPressureExpandableAllRecordsFragment<BloodPressureViewModel, WrapperBloodPressureItem, BloodPressureItem> {
    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperBloodPressureItem, BloodPressureItem> getMonthExpandableAdapter() {
        return new BloodPressureExpandableAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperBloodPressureItem) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("record", ((WrapperBloodPressureItem) data).getBloodPressureItem());
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) BloodPressureRecordDetailFragment.class, bundle, 100);
        }
    }
}
