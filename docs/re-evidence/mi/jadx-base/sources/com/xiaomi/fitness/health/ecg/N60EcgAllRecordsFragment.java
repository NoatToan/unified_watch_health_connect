package com.xiaomi.fitness.health.ecg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperEcgManualItem;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.recycler.EcgExpandableManualRecordsAdapter;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0016H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/N60EcgAllRecordsFragment;", "Lcom/xiaomi/fitness/common/recycer/BaseMonthExpandableAllRecordsFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Lcom/xiaomi/fitness/data/model/WrapperEcgManualItem;", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "<init>", "()V", N60EcgAllRecordsFragment.PARAM_POSITION, "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", Constants.KEY_REQUEST_DATA, "endTimeSecond", "", "onAdapterItemClick", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "getMonthExpandableAdapter", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", LifecycleConstantKt.ON_RESUME, "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class N60EcgAllRecordsFragment extends Hilt_N60EcgAllRecordsFragment<EcgViewModel, WrapperEcgManualItem, EcgMedicalItemReport> {
    public static final int AllRecordsData = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String PARAM_POSITION = "position";
    public static final int RESULT_CODE_REFRESH = 0;

    @NotNull
    public static final String TAG = "N60EcgAllRecordsFragment";
    public static final int interpretedRecordsData = 1;
    public static final int noInterpretedRecordsData = 2;
    private int position;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/N60EcgAllRecordsFragment$Companion;", "", "<init>", "()V", "RESULT_CODE_REFRESH", "", "TAG", "", "AllRecordsData", "interpretedRecordsData", "noInterpretedRecordsData", "PARAM_POSITION", "instance", "Lcom/xiaomi/fitness/health/ecg/N60EcgAllRecordsFragment;", "pos", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final N60EcgAllRecordsFragment instance(int pos) {
            N60EcgAllRecordsFragment n60EcgAllRecordsFragment = new N60EcgAllRecordsFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(N60EcgAllRecordsFragment.PARAM_POSITION, pos);
            n60EcgAllRecordsFragment.setArguments(bundle);
            return n60EcgAllRecordsFragment;
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    @NotNull
    public BaseMonthExpandableAdapter<WrapperEcgManualItem, EcgMedicalItemReport> getMonthExpandableAdapter() {
        return new EcgExpandableManualRecordsAdapter();
    }

    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void onAdapterItemClick(@NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperEcgManualItem) {
            Intent intent = new Intent(requireActivity(), (Class<?>) EcgItemDetailActivity.class);
            intent.putExtra(EcgConstantsKt.PARAM_REPORT, ((WrapperEcgManualItem) data).getEcgItem());
            startActivity(intent);
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
        Bundle arguments = getArguments();
        this.position = arguments != null ? arguments.getInt(PARAM_POSITION) : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.common.recycer.BaseMonthExpandableAllRecordsFragment
    public void requestData(long endTimeSecond) {
        super.requestData(endTimeSecond);
        int i = this.position;
        if (i == 0) {
            EcgViewModel.requestMonthAllGroupData$default((EcgViewModel) getMViewModel(), endTimeSecond, 0, 2, null);
        } else if (i == 1) {
            EcgViewModel.requestMonthInterpretedGroupData$default((EcgViewModel) getMViewModel(), endTimeSecond, 0, 2, null);
        } else {
            if (i != 2) {
                return;
            }
            EcgViewModel.requestMonthNotInterpretedGroupData$default((EcgViewModel) getMViewModel(), endTimeSecond, 0, 2, null);
        }
    }
}
