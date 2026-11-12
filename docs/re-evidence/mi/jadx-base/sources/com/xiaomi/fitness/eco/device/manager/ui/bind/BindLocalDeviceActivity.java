package com.xiaomi.fitness.eco.device.manager.ui.bind;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.extensions.EcoDeviceWebUrlsKt;
import com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.sport_eco_manager_export.SportDeviceModel;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.dji;
import defpackage.kb;
import defpackage.nre;
import defpackage.yzi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = EcoDeviceManagerExtKt.ECO_BIND_LOCAL_DEVICE_PATH)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0014J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0014\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindLocalDeviceActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindDeviceActivity;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindLocalViewModel;", "<init>", "()V", "countDownTimer", "Landroid/os/CountDownTimer;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finishActivity", "startBind", "showPolicyAndAgreementDialog", "showPolicyDialog", "addPolicyDialogCallback", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "showBindConfirmDialog", "oobNumber", "", "startCountDownTimer", "stopCountDownTimer", LifecycleConstantKt.ON_STOP, "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindLocalDeviceActivity extends Hilt_BindLocalDeviceActivity<BindLocalViewModel> {

    @Nullable
    private CountDownTimer countDownTimer;

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BindLocalViewModel access$getMViewModel(BindLocalDeviceActivity bindLocalDeviceActivity) {
        return (BindLocalViewModel) bindLocalDeviceActivity.getMViewModel();
    }

    private final void addPolicyDialogCallback(CommonDialog<?> dialog) {
        dialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity.addPolicyDialogCallback.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog2, int which) {
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                if (which == -2) {
                    BindLocalDeviceActivity.access$getMViewModel(BindLocalDeviceActivity.this).setAgreesPolicy(false);
                    BindLocalDeviceActivity.this.finish();
                } else {
                    if (which != -1) {
                        return;
                    }
                    BindLocalDeviceActivity.access$getMViewModel(BindLocalDeviceActivity.this).setAgreesPolicy(true);
                    BindLocalDeviceActivity.this.startBind();
                }
            }
        });
    }

    private final void finishActivity() {
        finish();
        try {
            Postcard postcardA = kb.c().a(DeviceManagerExtKt.SCAN_PATH);
            nre.b(postcardA);
            Class<?> destination = postcardA.getDestination();
            AppManager companion = AppManager.INSTANCE.getInstance();
            Intrinsics.checkNotNull(destination);
            Activity activityFindActivity = companion.findActivity(destination);
            if (activityFindActivity != null) {
                activityFindActivity.finish();
            }
        } catch (NoRouteFoundException unused) {
            EcoDeviceModelExtKt.logi("Can't find route of /device/manager/scan");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$0(BindLocalDeviceActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EcoDeviceModelExtKt.logi("BindLocalDeviceActivity to path " + str);
        ((BindLocalViewModel) this$0.getMViewModel()).finishRopeSkipping2Page();
        this$0.finishActivity();
        if (str != null && str.length() != 0) {
            kb.c().a(str).navigation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BindLocalDeviceActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!bool.booleanValue()) {
            this$0.startBind();
        } else if (SportDeviceModel.INSTANCE.isEcoDevice(this$0.getMDeviceInfo().getModel())) {
            this$0.showPolicyAndAgreementDialog();
        } else {
            this$0.showPolicyDialog();
        }
        return Unit.INSTANCE;
    }

    private final void showPolicyAndAgreementDialog() {
        final String ecoPrivacyPolicyUrlByType = EcoDeviceWebUrlsKt.getEcoPrivacyPolicyUrlByType(EcoDeviceWebUrlsKt.getEcoPrivacyPolicyType(), getMDeviceInfo().getModel());
        final String ecoUserAgreementByType = EcoDeviceWebUrlsKt.getEcoUserAgreementByType(EcoDeviceWebUrlsKt.getEcoUserAgreementType(), getMDeviceInfo().getModel());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(yzi.Y);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{ecoUserAgreementByType, ecoPrivacyPolicyUrlByType}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("policy_dialog").setDialogTitle(yzi.v).setPositiveText(yzi.p).setNegativeText(yzi.i).setCancelable(false).setCanceledOnTouchOutside(false).setCanceledOnBackPressed(false).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, str, Integer.valueOf(dji.f15593a), new LinkSpanHelper.a() { // from class: em2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str2) {
                BindLocalDeviceActivity.showPolicyAndAgreementDialog$lambda$2(ecoUserAgreementByType, this, ecoPrivacyPolicyUrlByType, view, str2);
            }
        }))).create();
        Intrinsics.checkNotNull(commonDialogCreate);
        addPolicyDialogCallback(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPolicyAndAgreementDialog$lambda$2(String userAgreement, BindLocalDeviceActivity this$0, String privacyPolicyUrl, View view, String str) {
        String string;
        Intrinsics.checkNotNullParameter(userAgreement, "$userAgreement");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(privacyPolicyUrl, "$privacyPolicyUrl");
        if (Intrinsics.areEqual(str, userAgreement)) {
            string = this$0.getString(yzi.n0);
        } else {
            string = Intrinsics.areEqual(str, privacyPolicyUrl) ? this$0.getString(yzi.m0) : null;
        }
        String str2 = string;
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, str2, false, false, null, false, null, false, 252, null);
    }

    private final void showPolicyDialog() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LinkSpanHelper.a(this, getString(yzi.Z, EcoDeviceWebUrlsKt.getEcoAgreementUrl(getMDeviceInfo().getModel())), Integer.valueOf(dji.f15593a), new LinkSpanHelper.a() { // from class: yl2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                BindLocalDeviceActivity.showPolicyDialog$lambda$3(view, str);
            }
        }));
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("policy_dialog").setDialogTitle(yzi.v).setPositiveText(yzi.p).setNegativeText(yzi.i).setDialogDescriptionString(new DialogParams.DialogDescriptionString(spannableStringBuilder)).create();
        Intrinsics.checkNotNull(commonDialogCreate);
        addPolicyDialogCallback(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPolicyDialog$lambda$3(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void startCountDownTimer() {
        stopCountDownTimer();
        CountDownTimer countDownTimer = new CountDownTimer() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity.startCountDownTimer.1
            {
                super(60000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                CommonDialog<?> mBindConfirmDialog = BindLocalDeviceActivity.this.getMBindConfirmDialog();
                if (mBindConfirmDialog != null) {
                    mBindConfirmDialog.dismiss();
                }
            }

            @Override // android.os.CountDownTimer
            @SuppressLint({"DefaultLocale"})
            public void onTick(long millisUntilFinished) {
            }
        };
        this.countDownTimer = countDownTimer;
        countDownTimer.start();
    }

    private final void stopCountDownTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.countDownTimer = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.Hilt_BindLocalDeviceActivity, com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BindLocalViewModel) getMViewModel()).getBindFinish().observe(this, new BindLocalDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: am2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindLocalDeviceActivity.onCreate$lambda$0(this.f1204a, (String) obj);
            }
        }));
        ((BindLocalViewModel) getMViewModel()).getPolicyFlag().observe(this, new BindLocalDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindLocalDeviceActivity.onCreate$lambda$1(this.f5474a, (Boolean) obj);
            }
        }));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopCountDownTimer();
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity
    public void showBindConfirmDialog(@NotNull String oobNumber) {
        Intrinsics.checkNotNullParameter(oobNumber, "oobNumber");
        if (SportDeviceModel.INSTANCE.isJump()) {
            CommonDialog<?> mBindConfirmDialog = getMBindConfirmDialog();
            if (mBindConfirmDialog != null && mBindConfirmDialog.isShowing()) {
                return;
            } else {
                startCountDownTimer();
            }
        }
        setMBindConfirmDialog(new BindConfirmDialog.Builder(oobNumber).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindLocalDeviceActivity.showBindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
            }
        }));
        CommonDialog<?> mBindConfirmDialog2 = getMBindConfirmDialog();
        Intrinsics.checkNotNull(mBindConfirmDialog2);
        mBindConfirmDialog2.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindDeviceActivity
    public void startBind() {
        if (((BindLocalViewModel) getMViewModel()).getAgreesPolicy()) {
            super.startBind();
        }
    }
}
