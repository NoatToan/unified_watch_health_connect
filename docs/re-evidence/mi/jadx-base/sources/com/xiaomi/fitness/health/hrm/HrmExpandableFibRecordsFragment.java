package com.xiaomi.fitness.health.hrm;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperHrmFibRecord;
import com.xiaomi.fitness.health.hrm.recycler.HrmExpandableFibRecordsAdapter;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.c0j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmExpandableFibRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lcom/xiaomi/fitness/data/model/WrapperHrmFibRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "<init>", "()V", "delayRequest", "", "getDelayRequest", "()Z", "setDelayRequest", "(Z)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", Constants.KEY_REQUEST_DATA, "endTimeSecond", "", "onAdapterItemClick", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", LifecycleConstantKt.ON_RESUME, "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmExpandableFibRecordsFragment extends Hilt_HrmExpandableFibRecordsFragment<HrmViewModel, WrapperHrmFibRecord, AbnormalFibItem> {

    @NotNull
    public static final String TAG = "HrmExpandableExtremeHighRecordsFragment";
    private boolean delayRequest = true;

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public boolean getDelayRequest() {
        return this.delayRequest;
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperHrmFibRecord, AbnormalFibItem> getMonthExpandableAdapter() {
        return new HrmExpandableFibRecordsAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperHrmFibRecord) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("record", ((WrapperHrmFibRecord) data).getAbnormalFibItem());
            bundle.putInt("hr_record_type", 3);
            BaseFragmentExKt.gotoPageForResult(this, (Class<?>) HrmRecordDetailFragment.class, bundle, 100);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BaseMonthExpandableAllRecordsFragment.requestGroupData$default(this, 0L, 1, null);
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AllRecordsPageUtilKt.setUpAllRecordsPageBasicUi(this, true);
        TextView description = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        AllRecordsPageUtilKt.setPageDescription(description, c0j.C8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void requestData(long endTimeSecond) {
        super.requestData(endTimeSecond);
        HrmViewModel.requestMonthFibGroupData$default((HrmViewModel) getMViewModel(), endTimeSecond, 0, 2, null);
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void setDelayRequest(boolean z) {
        this.delayRequest = z;
    }
}
