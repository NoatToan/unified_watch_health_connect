package com.xiaomi.fitness.health.sleep.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import com.example.statistics.export.ScrollViewEffectiveExposeBiz;
import com.xiaomi.fit.fitness.export.data.stat.AnimalInfo;
import com.xiaomi.fit.fitness.export.data.stat.SleepAnimalReport;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalReportActivity;
import com.xiaomi.fitness.health.sleep.ui.holder.ISleepInsight;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalCollectProgressHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalFloatingHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalImageHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalReportListHolder;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepAnimalScheduleSuggestHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.do0;
import defpackage.eyb;
import defpackage.gyb;
import defpackage.ili;
import defpackage.iyb;
import defpackage.jui;
import defpackage.kyb;
import defpackage.mpb;
import defpackage.myb;
import defpackage.qxi;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00019B\u0007¢\u0006\u0004\b8\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAnimalReportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Ldo0;", "", "requestAnimalReportIfNeed", "()V", "initViewAndHolder", "initUnderstandView", "showCollectDialogIfNeed", "initTopTitleBar", "initBundle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "latestAnimalReport", "Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "animalReport", "", "showCollectDialog", "Z", "", "origin", "Ljava/lang/String;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalCollectProgressHolder;", "collectProgressHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalCollectProgressHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalImageHolder;", "animalImageHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalImageHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalReportListHolder;", "animalReportListHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalReportListHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalScheduleSuggestHolder;", "scheduleSuggestHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalScheduleSuggestHolder;", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalFloatingHolder;", "floatingHolder", "Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepAnimalFloatingHolder;", "getHideHistory", "()Z", "hideHistory", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepAnimalReportActivity extends Hilt_SleepAnimalReportActivity<SleepViewModel, do0> {

    @NotNull
    public static final String PARAM_ANIMAL_REPORT = "report";

    @NotNull
    public static final String PARAM_LATEST_ANIMAL_REPORT = "latest_animal_report";

    @NotNull
    public static final String PARAM_ORIGIN = "origin";

    @NotNull
    public static final String PARAM_SHOW_COLLECT_DIALOG = "show_collect_dialog";

    @NotNull
    public static final String TAG = "SleepAnimalReportUI";
    private SleepAnimalImageHolder animalImageHolder;

    @Nullable
    private SleepAnimalReport animalReport;
    private SleepAnimalReportListHolder animalReportListHolder;
    private SleepAnimalCollectProgressHolder collectProgressHolder;
    private SleepAnimalFloatingHolder floatingHolder;

    @Nullable
    private SleepAnimalReport latestAnimalReport;

    @NotNull
    private String origin = "";
    private SleepAnimalScheduleSuggestHolder scheduleSuggestHolder;
    private boolean showCollectDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepViewModel access$getMViewModel(SleepAnimalReportActivity sleepAnimalReportActivity) {
        return (SleepViewModel) sleepAnimalReportActivity.getMViewModel();
    }

    private final boolean getHideHistory() {
        return Intrinsics.areEqual(this.origin, "history") || (Intrinsics.areEqual(this.origin, "sleep_day_entrance") && this.animalReport == null);
    }

    private final void initBundle() {
        String stringExtra;
        Intent intent = getIntent();
        this.latestAnimalReport = (SleepAnimalReport) (intent != null ? intent.getSerializableExtra("latest_animal_report") : null);
        Intent intent2 = getIntent();
        this.animalReport = (SleepAnimalReport) (intent2 != null ? intent2.getSerializableExtra("report") : null);
        Intent intent3 = getIntent();
        this.showCollectDialog = intent3 != null ? intent3.getBooleanExtra(PARAM_SHOW_COLLECT_DIALOG, false) : false;
        Intent intent4 = getIntent();
        if (intent4 == null || (stringExtra = intent4.getStringExtra("origin")) == null) {
            stringExtra = "";
        }
        this.origin = stringExtra;
        Logger.i(TAG, "origin " + stringExtra + " showCollectDialog " + this.showCollectDialog + ";thisReport " + this.animalReport + ";latestReport " + this.latestAnimalReport);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initTopTitleBar() {
        boolean z;
        mpb layoutTitle = ((do0) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(layoutTitle, "layoutTitle");
        layoutTitle.D.setText(getString(c0j.Xf));
        layoutTitle.A.setOnClickListener(new View.OnClickListener() { // from class: rgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalReportActivity.initTopTitleBar$lambda$3(this.f32526a, view);
            }
        });
        ImageView ivShare = layoutTitle.C;
        Intrinsics.checkNotNullExpressionValue(ivShare, "ivShare");
        ImageView ivHistory = layoutTitle.B;
        Intrinsics.checkNotNullExpressionValue(ivHistory, "ivHistory");
        SleepAnimalReport sleepAnimalReport = this.latestAnimalReport;
        if ((sleepAnimalReport != null ? sleepAnimalReport.getAnimal() : null) != null) {
            z = false;
        } else {
            SleepAnimalReport sleepAnimalReport2 = this.animalReport;
            if ((sleepAnimalReport2 != null ? sleepAnimalReport2.getAnimal() : null) == null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (getHideHistory()) {
            ViewExtKt.setVisible(ivHistory, false);
        } else {
            ViewExtKt.setVisible(ivHistory, true);
            ivHistory.setOnClickListener(new View.OnClickListener() { // from class: sgm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepAnimalReportActivity.initTopTitleBar$lambda$4(this.f33620a, view);
                }
            });
        }
        if (z) {
            ViewExtKt.setVisible(ivShare, false);
            return;
        }
        SleepAnimalReport sleepAnimalReport3 = this.animalReport;
        final SleepAnimalReport sleepAnimalReport4 = (sleepAnimalReport3 != null ? sleepAnimalReport3.getAnimal() : null) != null ? this.animalReport : this.latestAnimalReport;
        ViewExtKt.setVisible(ivShare, (sleepAnimalReport4 != null ? sleepAnimalReport4.getAnimal() : null) != null);
        ivShare.setOnClickListener(new View.OnClickListener() { // from class: tgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalReportActivity.initTopTitleBar$lambda$6(sleepAnimalReport4, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTopTitleBar$lambda$3(SleepAnimalReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTopTitleBar$lambda$4(SleepAnimalReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragmentExKt.gotoFragmentPage(this$0, SleepAnimalAllRecordsFragment.class, null, true);
        SleepTrackHelper.INSTANCE.trackSleepAnimalReportHistoryClick(this$0.animalReport);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTopTitleBar$lambda$6(SleepAnimalReport sleepAnimalReport, SleepAnimalReportActivity this$0, View view) {
        AnimalInfo animal;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sleepAnimalReport == null || (animal = sleepAnimalReport.getAnimal()) == null) {
            return;
        }
        SleepAnimalExtKt.gotoSleepAnimalShareActivity(this$0, animal.getType(), animal.getStartTime(), animal.getEndTime());
        SleepTrackHelper.INSTANCE.trackSleepAnimalReportShareClick();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initUnderstandView() {
        boolean z;
        SleepAnimalReport sleepAnimalReport = this.latestAnimalReport;
        if ((sleepAnimalReport != null ? sleepAnimalReport.getAnimal() : null) != null) {
            z = false;
        } else {
            SleepAnimalReport sleepAnimalReport2 = this.animalReport;
            if ((sleepAnimalReport2 != null ? sleepAnimalReport2.getAnimal() : null) == null) {
                z = true;
            } else {
                z = false;
            }
        }
        CardUnderstandView understandCard = ((do0) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(understandCard, "understandCard");
        ViewExtKt.setVisible(understandCard, !z);
        ((do0) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: qgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepAnimalReportActivity.initUnderstandView$lambda$2(this.f31507a, view);
            }
        });
        ((do0) getMBinding()).H.setTag(SleepTrackHelper.INSTANCE.buildSleepAnimalUnderstandDeviceExposeTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initUnderstandView$lambda$2(SleepAnimalReportActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WebViewUtilKt.startWebView$default(HealthUtil.INSTANCE.getUnderstandSleepUrlWithDevice(), this$0.getString(c0j.Ck), false, false, null, false, null, false, 252, null);
        SleepTrackHelper.INSTANCE.trackSleepAnimalUnderstandDeviceSleepClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViewAndHolder() {
        initTopTitleBar();
        initUnderstandView();
        eyb layoutCollectProgress = ((do0) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(layoutCollectProgress, "layoutCollectProgress");
        SleepAnimalCollectProgressHolder sleepAnimalCollectProgressHolder = new SleepAnimalCollectProgressHolder(layoutCollectProgress);
        this.collectProgressHolder = sleepAnimalCollectProgressHolder;
        sleepAnimalCollectProgressHolder.updateReport(this.animalReport, this.latestAnimalReport);
        iyb layoutAnimalImage = ((do0) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalImage, "layoutAnimalImage");
        SleepAnimalImageHolder sleepAnimalImageHolder = new SleepAnimalImageHolder(layoutAnimalImage);
        this.animalImageHolder = sleepAnimalImageHolder;
        sleepAnimalImageHolder.updateReport(this.animalReport, this.latestAnimalReport, this.origin);
        kyb layoutAnimalReportList = ((do0) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalReportList, "layoutAnimalReportList");
        this.animalReportListHolder = new SleepAnimalReportListHolder(layoutAnimalReportList, new ISleepInsight() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepAnimalReportActivity.initViewAndHolder.1
            @Override // com.xiaomi.fitness.health.sleep.ui.holder.ISleepInsight
            public void requestSleepPressureSwitch() {
                SleepAnimalReportActivity.access$getMViewModel(SleepAnimalReportActivity.this).loadPressureSwitch();
            }
        });
        myb layoutAnimalScheduleSuggest = ((do0) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(layoutAnimalScheduleSuggest, "layoutAnimalScheduleSuggest");
        SleepAnimalScheduleSuggestHolder sleepAnimalScheduleSuggestHolder = new SleepAnimalScheduleSuggestHolder(layoutAnimalScheduleSuggest);
        this.scheduleSuggestHolder = sleepAnimalScheduleSuggestHolder;
        sleepAnimalScheduleSuggestHolder.updateReport(this.animalReport, this.latestAnimalReport);
        gyb layoutFloating = ((do0) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(layoutFloating, "layoutFloating");
        SleepAnimalFloatingHolder sleepAnimalFloatingHolder = new SleepAnimalFloatingHolder(layoutFloating);
        this.floatingHolder = sleepAnimalFloatingHolder;
        sleepAnimalFloatingHolder.updateReport(this.animalReport, this.latestAnimalReport);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestAnimalReportIfNeed() {
        SleepAnimalReport sleepAnimalReport = this.animalReport;
        SleepAnimalReportListHolder sleepAnimalReportListHolder = null;
        AnimalInfo animal = sleepAnimalReport != null ? sleepAnimalReport.getAnimal() : null;
        SleepAnimalReport sleepAnimalReport2 = this.latestAnimalReport;
        AnimalInfo animal2 = sleepAnimalReport2 != null ? sleepAnimalReport2.getAnimal() : null;
        if (animal == null && animal2 == null) {
            SleepAnimalReportListHolder sleepAnimalReportListHolder2 = this.animalReportListHolder;
            if (sleepAnimalReportListHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("animalReportListHolder");
            } else {
                sleepAnimalReportListHolder = sleepAnimalReportListHolder2;
            }
            sleepAnimalReportListHolder.showExampleReportView();
            return;
        }
        SleepAnimalReport sleepAnimalReport3 = animal != null ? this.animalReport : this.latestAnimalReport;
        if (sleepAnimalReport3 == null) {
            return;
        }
        SleepAnimalReportListHolder sleepAnimalReportListHolder3 = this.animalReportListHolder;
        if (sleepAnimalReportListHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animalReportListHolder");
        } else {
            sleepAnimalReportListHolder = sleepAnimalReportListHolder3;
        }
        sleepAnimalReportListHolder.updateAnimalReport(sleepAnimalReport3);
        ((SleepViewModel) getMViewModel()).getPressureSwitchLiveData().observe(this, new SleepAnimalReportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ogm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalReportActivity.requestAnimalReportIfNeed$lambda$0(this.f29149a, (Boolean) obj);
            }
        }));
        ((SleepViewModel) getMViewModel()).querySleepAnimalInsightReportLiveData(sleepAnimalReport3).observe(this, new SleepAnimalReportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pgm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalReportActivity.requestAnimalReportIfNeed$lambda$1(this.f30380a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAnimalReportIfNeed$lambda$0(SleepAnimalReportActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepAnimalReportListHolder sleepAnimalReportListHolder = this$0.animalReportListHolder;
        if (sleepAnimalReportListHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animalReportListHolder");
            sleepAnimalReportListHolder = null;
        }
        sleepAnimalReportListHolder.updatePressureSwitchStatus(bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestAnimalReportIfNeed$lambda$1(SleepAnimalReportActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepAnimalReportListHolder sleepAnimalReportListHolder = this$0.animalReportListHolder;
        if (sleepAnimalReportListHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animalReportListHolder");
            sleepAnimalReportListHolder = null;
        }
        Intrinsics.checkNotNull(map);
        sleepAnimalReportListHolder.onUpdateAnimalInsightReport(map);
        return Unit.INSTANCE;
    }

    private final void showCollectDialogIfNeed() {
        List<Long> sampleDates;
        if (this.showCollectDialog) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            CommonDialog commonDialogCreate = (CommonDialog) supportFragmentManager.l0("collect_dialog");
            if (commonDialogCreate == null || !commonDialogCreate.isShowing()) {
                SleepAnimalReport sleepAnimalReport = this.animalReport;
                int size = 7 - ((sleepAnimalReport == null || (sampleDates = sleepAnimalReport.getSampleDates()) == null) ? 0 : sampleDates.size());
                SleepAnimalReport sleepAnimalReport2 = this.latestAnimalReport;
                String quantityString = ResourceExtKt.getQuantityString(this, (sleepAnimalReport2 != null ? sleepAnimalReport2.getAnimal() : null) != null ? qxi.t0 : qxi.s0, size, Integer.valueOf(size));
                if (commonDialogCreate == null) {
                    commonDialogCreate = new CommonDialog.c("collect_dialog").setDialogTitle(c0j.We).setDialogDescriptionString(new DialogParams.DialogDescriptionString(quantityString)).setDialogDescription(c0j.Xe).setPositiveText(c0j.I7).setCancelable(false).setCanceledOnBackPressed(false).setCanceledOnTouchOutside(false).create();
                    Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
                }
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.SleepAnimalReportActivity.showCollectDialogIfNeed.1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        super.onDialogClick(dialogName, dialog, which);
                        SleepTrackHelper.INSTANCE.trackSleepCollectDialogExposeOrClick(true);
                    }
                });
                commonDialogCreate.showIfNeed(supportFragmentManager);
                SleepTrackHelper.INSTANCE.trackSleepCollectDialogExposeOrClick(false);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ResourceExtKt.getDimen(this, ili.j);
        ViewGroup.LayoutParams layoutParams = ((do0) getMBinding()).G.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
        marginLayoutParams.setMarginStart(dimen);
        marginLayoutParams.setMarginEnd(dimen);
        ((do0) getMBinding()).G.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepAnimalReportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        initViewAndHolder();
        showCollectDialogIfNeed();
        requestAnimalReportIfNeed();
        SleepTrackHelper.INSTANCE.trackSleepAnimalReportPageExpose(this.animalReport);
        ScrollViewEffectiveExposeBiz scrollViewEffectiveExposeBiz = new ScrollViewEffectiveExposeBiz();
        NestedScrollView nestedScrollView = ((do0) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nestedScrollView");
        ScrollViewEffectiveExposeBiz.startTrackItemExpose$default(scrollViewEffectiveExposeBiz, nestedScrollView, new LinkedHashSet(), 0, 4, null);
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepAnimalReportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SleepAnimalImageHolder sleepAnimalImageHolder = this.animalImageHolder;
        if (sleepAnimalImageHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animalImageHolder");
            sleepAnimalImageHolder = null;
        }
        sleepAnimalImageHolder.disposeImageRequest();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        SleepAnimalReportListHolder sleepAnimalReportListHolder = this.animalReportListHolder;
        if (sleepAnimalReportListHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animalReportListHolder");
            sleepAnimalReportListHolder = null;
        }
        sleepAnimalReportListHolder.onResume();
    }
}
