package com.xiaomi.fitness.health.stress;

import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperStressRecord;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011H\u0016¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/stress/StressViewModel;", "Lcom/xiaomi/fitness/data/model/WrapperStressRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAdapterItemClick", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StressExpandableAllRecordsFragment extends Hilt_StressExpandableAllRecordsFragment<StressViewModel, WrapperStressRecord, StressItem> {

    @NotNull
    public static final String TAG = "StressExpandableAllRecordsFragment";

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperStressRecord, StressItem> getMonthExpandableAdapter() {
        return new StressExpandableAllRecordsAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperStressRecord) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("stress_record", ((WrapperStressRecord) data).getStressItem());
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) StressRecordDetailFragment.class, bundle, 100);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AllRecordsPageUtilKt.setUpAllRecordsPageBasicUi$default(this, false, 2, null);
    }
}
