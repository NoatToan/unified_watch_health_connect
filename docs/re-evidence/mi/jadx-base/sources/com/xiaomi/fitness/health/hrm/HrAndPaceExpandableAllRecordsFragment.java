package com.xiaomi.fitness.health.hrm;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.data.model.WrapperHrAndPaceFibRecord;
import com.xiaomi.fitness.health.hrm.recycler.HrmAndPaceExpandableFibRecordsAdapter;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.c0j;
import defpackage.lp5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrAndPaceExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lcom/xiaomi/fitness/data/model/WrapperHrAndPaceFibRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "<init>", "()V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAdapterItemClick", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", Constants.KEY_REQUEST_DATA, "endTimeSecond", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrAndPaceExpandableAllRecordsFragment extends Hilt_HrAndPaceExpandableAllRecordsFragment<HrmViewModel, WrapperHrAndPaceFibRecord, LactateThresholdItem> {

    @NotNull
    public static final String BUNDLE_PARAMS_SPORT_REPORT = "sport_report";

    @NotNull
    public static final String BUNDLE_PARAMS_TIME_STAMP = "time_stamp";

    @NotNull
    public static final String PARAM_RECORD = "HrAndPace";

    @NotNull
    public static final String TAG = "HrAndPaceExpandableAllRecordsFragment";

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperHrAndPaceFibRecord, LactateThresholdItem> getMonthExpandableAdapter() {
        return new HrmAndPaceExpandableFibRecordsAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperHrAndPaceFibRecord) {
            Bundle bundle = new Bundle();
            LactateThresholdItem lactateThresholdItem = ((WrapperHrAndPaceFibRecord) data).getLactateThresholdItem();
            if (lactateThresholdItem.getSid() != null) {
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String sid = lactateThresholdItem.getSid();
                Intrinsics.checkNotNull(sid);
                Long dbTime = lactateThresholdItem.getDbTime();
                SportBasicReport theSportReport = fitnessDataExtKt.getTheSportReport(sid, 1, dbTime != null ? dbTime.longValue() : lactateThresholdItem.getTime());
                if (theSportReport == null) {
                    ToastUtil.showToast(requireContext().getString(c0j.J8));
                    return;
                }
                int iA = lp5.a(theSportReport);
                bundle.putLong("time_stamp", theSportReport.getTimeStamp());
                bundle.putSerializable("sport_report", theSportReport);
                bundle.putInt("sport_type", iA);
                SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                sportRecordApi.goSportDetail(contextRequireContext, bundle, (ActivityOptions) null, theSportReport);
            }
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AllRecordsPageUtilKt.setUpAllRecordsPageBasicUi$default(this, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void requestData(long endTimeSecond) {
        super.requestData(endTimeSecond);
        HrmViewModel.requestHrAndPaceGroupData$default((HrmViewModel) getMViewModel(), endTimeSecond, 0, 2, null);
    }
}
