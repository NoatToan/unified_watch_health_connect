package com.xiaomi.fitness.training_plan.report;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.report.TrainPlanReportShareActivity;
import defpackage.jvi;
import defpackage.k1j;
import defpackage.ksp;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/training_plan/report/TrainPlanReportShareViewModel;", "Lksp;", "", "initParams", "()V", "initTabLayout", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "longPicBitmapUriStr", "Ljava/lang/String;", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "mCustomerSharePlanReport", "Lcom/xiaomi/fitness/training_plan/report/CustomerSharePlanReport;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrainPlanReportShareActivity extends Hilt_TrainPlanReportShareActivity<TrainPlanReportShareViewModel, ksp> {

    @NotNull
    public static final String TAG = "SportReportShareActivity";

    @Nullable
    private String longPicBitmapUriStr;

    @Nullable
    private CustomerSharePlanReport mCustomerSharePlanReport;

    private final void initParams() {
        this.longPicBitmapUriStr = getIntent().getStringExtra(TrainPlanReportShareActivityKt.BUNDLE_PARAM_URI);
        Serializable serializableExtra = getIntent().getSerializableExtra(TrainPlanReportShareActivityKt.BUNDLE_PARAM_REPORT_INFO);
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.report.CustomerSharePlanReport");
        this.mCustomerSharePlanReport = (CustomerSharePlanReport) serializableExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTabLayout() {
        TabLayout tabLayout = ((ksp) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        ViewPager2 viewPager = ((ksp) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        TextView editContentBtn = ((ksp) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(editContentBtn, "editContentBtn");
        TrainPlanReportShareViewModel trainPlanReportShareViewModel = (TrainPlanReportShareViewModel) getMViewModel();
        String str = this.longPicBitmapUriStr;
        CustomerSharePlanReport customerSharePlanReport = this.mCustomerSharePlanReport;
        View view = ((ksp) getMBinding()).C;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.View");
        new TrainPlanShareMethodTabHolder(this, tabLayout, viewPager, editContentBtn, trainPlanReportShareViewModel, str, customerSharePlanReport, view).initHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(TrainPlanReportShareActivity this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onBackPressed();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jvi.X;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.training_plan.report.Hilt_TrainPlanReportShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        ViewExtKt.clickWithTrigger$default(((ksp) getMBinding()).B, 0L, new Function1() { // from class: jsp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrainPlanReportShareActivity.onCreate$lambda$0(this.f23097a, (ImageView) obj);
            }
        }, 1, null);
        initParams();
        setTitle(k1j.J1);
        initTabLayout();
    }
}
