package com.xiaomi.fitness.health.sleep.ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.b;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.PermissionManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSnoreDetectionSettingActivity;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepDetectionGuideCarouselItem;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselAdapter;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.av6;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gwb;
import defpackage.iji;
import defpackage.jui;
import defpackage.ohi;
import defpackage.pni;
import defpackage.yaa;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b2\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u0019\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\u0007J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u001c\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u0014\u0010/\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSnoreDetectionSettingActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/ui/setting/SleepSettingViewModel;", "Lgwb;", "Lyaa;", "", "findViews", "()V", "initViews", "checkAudioRecordingPermission", "showAudioRecordPermissionDeniedRationalDialog", "initViewPager", "showCloseDetectionDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "mSnoreDetectionCloseCheckDialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "expectedSnoreWordsSwitchStatus", "Z", "getExpectedSnoreWordsSwitchStatus", "()Z", "setExpectedSnoreWordsSwitchStatus", "(Z)V", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "mSnoreAndSleepWordsDetectionView", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "getMSnoreAndSleepWordsDetectionView", "()Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "setMSnoreAndSleepWordsDetectionView", "(Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;)V", "mAutoClearAudioFileView", "getMAutoClearAudioFileView", "setMAutoClearAudioFileView", "mRationaleDialog", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepSnoreDetectionSettingActivity extends Hilt_SleepSnoreDetectionSettingActivity<SleepSettingViewModel, gwb> implements yaa {
    private boolean expectedSnoreWordsSwitchStatus;
    public SwitchButtonTwoLineTextView mAutoClearAudioFileView;

    @Nullable
    private CommonDialog<?> mRationaleDialog;
    public SwitchButtonTwoLineTextView mSnoreAndSleepWordsDetectionView;

    @Nullable
    private CommonDialog<?> mSnoreDetectionCloseCheckDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SleepSettingViewModel access$getMViewModel(SleepSnoreDetectionSettingActivity sleepSnoreDetectionSettingActivity) {
        return (SleepSettingViewModel) sleepSnoreDetectionSettingActivity.getMViewModel();
    }

    private final void checkAudioRecordingPermission() {
        PermissionExtKt.permission(this, "android.permission.RECORD_AUDIO", getString(c0j.oq), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: uym
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSnoreDetectionSettingActivity.checkAudioRecordingPermission$lambda$5(this.f36284a, (PermissionBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAudioRecordingPermission$lambda$5(final SleepSnoreDetectionSettingActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: sym
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSnoreDetectionSettingActivity.checkAudioRecordingPermission$lambda$5$lambda$2(this.f34107a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: tym
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepSnoreDetectionSettingActivity.checkAudioRecordingPermission$lambda$5$lambda$4(this.f35188a, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit checkAudioRecordingPermission$lambda$5$lambda$2(SleepSnoreDetectionSettingActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getMSnoreAndSleepWordsDetectionView().setSwitch(true);
        ViewExtKt.setVisible(this$0.getMAutoClearAudioFileView(), true);
        ((SleepSettingViewModel) this$0.getMViewModel()).setSnoreAndSleepWordsDetectionStatusToSP(2);
        Logger.d(BaseBindingActivity.TAG, "checkAudioRecordingPermission granted");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAudioRecordingPermission$lambda$5$lambda$4(final SleepSnoreDetectionSettingActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.getMSnoreAndSleepWordsDetectionView().setSwitch(false);
        ViewExtKt.invisible(this$0.getMAutoClearAudioFileView());
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), it, this$0, null, null, null, new Function0() { // from class: vym
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SleepSnoreDetectionSettingActivity.checkAudioRecordingPermission$lambda$5$lambda$4$lambda$3(this.f37368a);
            }
        }, 28, null);
        Logger.d(BaseBindingActivity.TAG, "checkAudioRecordingPermission NOT granted");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkAudioRecordingPermission$lambda$5$lambda$4$lambda$3(SleepSnoreDetectionSettingActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showAudioRecordPermissionDeniedRationalDialog();
        return Unit.INSTANCE;
    }

    private final void findViews() {
        setMSnoreAndSleepWordsDetectionView((SwitchButtonTwoLineTextView) findViewById(eri.Bg));
        setMAutoClearAudioFileView((SwitchButtonTwoLineTextView) findViewById(eri.M));
    }

    private final void initViewPager() {
        String[] stringArray = ResourceExtKt.getStringArray(this, ohi.q);
        String[] stringArray2 = ResourceExtKt.getStringArray(this, ohi.p);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(pni.E0), Integer.valueOf(pni.F0), Integer.valueOf(pni.G0)});
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new SleepDetectionGuideCarouselItem(stringArray[i], stringArray2[i], ((Number) listListOf.get(i)).intValue()));
        }
        SleepGuideCarouselAdapter sleepGuideCarouselAdapter = new SleepGuideCarouselAdapter(arrayList);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(eri.Zo);
        final SleepGuideCarouselIndicator sleepGuideCarouselIndicator = (SleepGuideCarouselIndicator) findViewById(eri.To);
        sleepGuideCarouselIndicator.setColor(iji.x1, iji.y1);
        sleepGuideCarouselIndicator.initIndicatorCount(3);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setClipChildren(false);
        viewPager2.setPageTransformer(new b(ExtUtilsKt.getDp(Float.valueOf(13.0f))));
        viewPager2.setAdapter(sleepGuideCarouselAdapter);
        viewPager2.h(new ViewPager2.i() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSnoreDetectionSettingActivity.initViewPager.1
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                sleepGuideCarouselIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }
        });
    }

    private final void initViews() {
        getMSnoreAndSleepWordsDetectionView().setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: qym
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepSnoreDetectionSettingActivity.initViews$lambda$0(this.f31983a, z, iSwitchButton);
            }
        });
        getMAutoClearAudioFileView().setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: rym
            @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
            public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                SleepSnoreDetectionSettingActivity.initViews$lambda$1(this.f33071a, z, iSwitchButton);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(SleepSnoreDetectionSettingActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.checkAudioRecordingPermission();
            return;
        }
        this$0.expectedSnoreWordsSwitchStatus = false;
        this$0.getMSnoreAndSleepWordsDetectionView().setSwitch(true);
        this$0.showCloseDetectionDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initViews$lambda$1(SleepSnoreDetectionSettingActivity this$0, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((SleepSettingViewModel) this$0.getMViewModel()).setAutoClearAudioFileEnabled(z);
    }

    private final void showAudioRecordPermissionDeniedRationalDialog() {
        if (this.mRationaleDialog == null) {
            CommonDialog<?> commonDialogCreate = new CommonDialog.c("rationale_dialog").setDialogTitle(c0j.P).setDialogDescription(c0j.O).setPositiveText(c0j.qq).setNegativeText(c0j.c).create();
            this.mRationaleDialog = commonDialogCreate;
            Intrinsics.checkNotNull(commonDialogCreate);
            commonDialogCreate.setRequestCode(1003);
        }
        CommonDialog<?> commonDialog = this.mRationaleDialog;
        if (commonDialog != null) {
            commonDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSnoreDetectionSettingActivity.showAudioRecordPermissionDeniedRationalDialog.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -1) {
                        SleepSnoreDetectionSettingActivity.this.setExpectedSnoreWordsSwitchStatus(true);
                    }
                }
            });
        }
        CommonDialog<?> commonDialog2 = this.mRationaleDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    private final void showCloseDetectionDialog() {
        if (this.mSnoreDetectionCloseCheckDialog == null) {
            this.mSnoreDetectionCloseCheckDialog = new CommonDialog.c("detection_close_dialog").setPositiveText(c0j.d).setNegativeText(c0j.c).setDialogTitle(c0j.Hk).setCancelable(true).setCanceledOnTouchOutside(true).create();
        }
        CommonDialog<?> commonDialog = this.mSnoreDetectionCloseCheckDialog;
        Intrinsics.checkNotNull(commonDialog != null ? commonDialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.sleep.ui.setting.SleepSnoreDetectionSettingActivity.showCloseDetectionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    SleepSnoreDetectionSettingActivity.access$getMViewModel(SleepSnoreDetectionSettingActivity.this).setSnoreAndSleepWordsDetectionStatusToSP(0);
                    SleepSnoreDetectionSettingActivity.access$getMViewModel(SleepSnoreDetectionSettingActivity.this).setSleepSnoreDetectionEnable(false);
                    SleepSnoreDetectionSettingActivity.this.getMSnoreAndSleepWordsDetectionView().setSwitch(false);
                    ViewExtKt.invisible(SleepSnoreDetectionSettingActivity.this.getMAutoClearAudioFileView());
                }
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        CommonDialog<?> commonDialog2 = this.mSnoreDetectionCloseCheckDialog;
        Intrinsics.checkNotNull(commonDialog2);
        commonDialog2.showIfNeed(getSupportFragmentManager());
    }

    public final boolean getExpectedSnoreWordsSwitchStatus() {
        return this.expectedSnoreWordsSwitchStatus;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.U3;
    }

    @NotNull
    public final SwitchButtonTwoLineTextView getMAutoClearAudioFileView() {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.mAutoClearAudioFileView;
        if (switchButtonTwoLineTextView != null) {
            return switchButtonTwoLineTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAutoClearAudioFileView");
        return null;
    }

    @NotNull
    public final SwitchButtonTwoLineTextView getMSnoreAndSleepWordsDetectionView() {
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.mSnoreAndSleepWordsDetectionView;
        if (switchButtonTwoLineTextView != null) {
            return switchButtonTwoLineTextView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSnoreAndSleepWordsDetectionView");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.setting.Hilt_SleepSnoreDetectionSettingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c0j.pk);
        findViews();
        initViewPager();
        initViews();
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (resultCode != -1) {
            getMSnoreAndSleepWordsDetectionView().setSwitch(false);
            return;
        }
        PermissionManager.INSTANCE.openPermissionEditorPage(this);
        getMSnoreAndSleepWordsDetectionView().setSwitch(true);
        if (PermissionExtKt.isPermissionGranted(this, "android.permission.RECORD_AUDIO")) {
            return;
        }
        getMSnoreAndSleepWordsDetectionView().setSwitch(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (PermissionExtKt.isPermissionGranted(this, "android.permission.RECORD_AUDIO") && this.expectedSnoreWordsSwitchStatus) {
            getMSnoreAndSleepWordsDetectionView().setSwitch(true);
            ViewExtKt.visible(getMAutoClearAudioFileView());
            ((SleepSettingViewModel) getMViewModel()).setSnoreAndSleepWordsDetectionStatusToSP(2);
            getMAutoClearAudioFileView().setSwitch(((SleepSettingViewModel) getMViewModel()).getAutoClearAudioFileValue());
        }
        if (PermissionExtKt.isPermissionGranted(this, "android.permission.RECORD_AUDIO") && ((SleepSettingViewModel) getMViewModel()).getSnoreAndSleepWordsDetectionValue() == 2) {
            getMSnoreAndSleepWordsDetectionView().setSwitch(true);
            ViewExtKt.visible(getMAutoClearAudioFileView());
            getMAutoClearAudioFileView().setSwitch(((SleepSettingViewModel) getMViewModel()).getAutoClearAudioFileValue());
        }
        if (PermissionExtKt.isPermissionGranted(this, "android.permission.RECORD_AUDIO")) {
            return;
        }
        getMSnoreAndSleepWordsDetectionView().setSwitch(false);
        ViewExtKt.invisible(getMAutoClearAudioFileView());
    }

    public final void setExpectedSnoreWordsSwitchStatus(boolean z) {
        this.expectedSnoreWordsSwitchStatus = z;
    }

    public final void setMAutoClearAudioFileView(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        Intrinsics.checkNotNullParameter(switchButtonTwoLineTextView, "<set-?>");
        this.mAutoClearAudioFileView = switchButtonTwoLineTextView;
    }

    public final void setMSnoreAndSleepWordsDetectionView(@NotNull SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        Intrinsics.checkNotNullParameter(switchButtonTwoLineTextView, "<set-?>");
        this.mSnoreAndSleepWordsDetectionView = switchButtonTwoLineTextView;
    }
}
