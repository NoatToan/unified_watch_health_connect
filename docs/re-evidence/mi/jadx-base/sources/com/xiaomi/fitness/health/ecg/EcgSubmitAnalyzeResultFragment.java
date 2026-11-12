package com.xiaomi.fitness.health.ecg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.health.ecg.EcgSubmitAnalyzeResultFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.uub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgSubmitAnalyzeResultFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Luub;", "", "updateEcgReport", "()V", "initView", "jumpEcgItemDetail", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMedicalItemReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgSubmitAnalyzeResultFragment extends Hilt_EcgSubmitAnalyzeResultFragment<EcgViewModel, uub> {

    @Nullable
    private EcgMedicalItemReport ecgMedicalItemReport;

    public EcgSubmitAnalyzeResultFragment() {
        super(jui.B3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((uub) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ic7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgSubmitAnalyzeResultFragment.initView$lambda$0(this.f20993a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(EcgSubmitAnalyzeResultFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.jumpEcgItemDetail();
    }

    private final void jumpEcgItemDetail() {
        Intent intent = new Intent(requireActivity(), (Class<?>) EcgItemDetailActivity.class);
        intent.putExtra(EcgConstantsKt.PARAM_REPORT, this.ecgMedicalItemReport);
        startActivity(intent);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateEcgReport() {
        EcgMedicalItemReport ecgMedicalItemReport = this.ecgMedicalItemReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport);
        ecgMedicalItemReport.setInterpretStatus(1);
        EcgViewModel ecgViewModel = (EcgViewModel) getMViewModel();
        EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMedicalItemReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport2);
        ecgViewModel.updateEcgReport(ecgMedicalItemReport2);
        EcgViewModel ecgViewModel2 = (EcgViewModel) getMViewModel();
        EcgMedicalItemReport ecgMedicalItemReport3 = this.ecgMedicalItemReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport3);
        ecgViewModel2.updateAnalyzeStatusTime(ecgMedicalItemReport3.getMeasureTime());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        jumpEcgItemDetail();
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) (arguments != null ? arguments.getSerializable(EcgConstantsKt.PARAM_REPORT) : null);
        this.ecgMedicalItemReport = ecgMedicalItemReport;
        if (ecgMedicalItemReport == null) {
            finish();
            return;
        }
        setActionBarExpandState(0);
        setTitle(c0j.qa);
        initView();
        updateEcgReport();
    }
}
