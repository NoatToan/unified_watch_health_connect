package com.xiaomi.fitness.health.ecg;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.health.ecg.EcgCheckingQualityFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.oub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\fJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/EcgCheckingQualityFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "Loub;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", LifecycleConstantKt.ON_DESTROY, "()V", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "ecgMedicalItemReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "timedFinishRunnable", "Ljava/lang/Runnable;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcgCheckingQualityFragment extends Hilt_EcgCheckingQualityFragment<EcgViewModel, oub> {

    @Nullable
    private EcgMedicalItemReport ecgMedicalItemReport;

    @NotNull
    private final Handler mHandler;

    @NotNull
    private final Runnable timedFinishRunnable;

    public EcgCheckingQualityFragment() {
        super(jui.y3);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.timedFinishRunnable = new Runnable() { // from class: qa7
            @Override // java.lang.Runnable
            public final void run() {
                EcgCheckingQualityFragment.timedFinishRunnable$lambda$0(this.f31272a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timedFinishRunnable$lambda$0(EcgCheckingQualityFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putSerializable(EcgConstantsKt.PARAM_REPORT, this$0.ecgMedicalItemReport);
        BaseFragmentExKt.gotoPage(this$0, EcgSubmitAnalyzeResultFragment.class, bundle);
        this$0.finish();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacks(this.timedFinishRunnable);
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
        this.mHandler.postDelayed(this.timedFinishRunnable, 3000L);
    }
}
