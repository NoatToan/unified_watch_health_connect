package com.xiaomi.fitness.device.manager.ui.bind;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.LinkSpanHelper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.extensions.DeviceWebUrlsKt;
import com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import defpackage.av6;
import defpackage.bji;
import defpackage.kb;
import defpackage.uzi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = DeviceManagerExtKt.BIND_LOCAL_DEVICE_PATH)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0014J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0014\u0010\u000e\u001a\u00020\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0014¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/bind/BindLocalDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindDeviceActivity;", "Lcom/xiaomi/fitness/device/manager/ui/bind/BindLocalViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startBind", "isEcoDevice", "", "showPolicyAndAgreementDialog", "showPolicyDialog", "addPolicyDialogCallback", "dialog", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "showBindConfirmDialog", "oobNumber", "", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindLocalDeviceActivity extends Hilt_BindLocalDeviceActivity<BindLocalViewModel> {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BindLocalViewModel access$getMViewModel(BindLocalDeviceActivity bindLocalDeviceActivity) {
        return (BindLocalViewModel) bindLocalDeviceActivity.getMViewModel();
    }

    private final void addPolicyDialogCallback(CommonDialog<?> dialog) {
        dialog.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity.addPolicyDialogCallback.1
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

    private final boolean isEcoDevice() {
        return Intrinsics.areEqual(getMDeviceInfo().getModel(), "ksmb.treadmill.m2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BindLocalDeviceActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceModelExtKt.logi("BindLocalDeviceActivity to path " + str);
        if (str == null || str.length() == 0) {
            this$0.finish();
            Activity activityFindActivity = AppManager.INSTANCE.getInstance().findActivity(ScanDeviceActivity.class);
            if (activityFindActivity != null) {
                activityFindActivity.finish();
            }
        } else {
            kb.c().a(str).navigation();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BindLocalDeviceActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            if (this$0.isEcoDevice()) {
                this$0.showPolicyAndAgreementDialog();
            } else {
                this$0.showPolicyDialog();
            }
        }
        return Unit.INSTANCE;
    }

    private final void showPolicyAndAgreementDialog() {
        String ecoPrivacyPolicyUrlByType = DeviceWebUrlsKt.getEcoPrivacyPolicyUrlByType("sport_healthy_privacy_policy", getMDeviceInfo().getModel());
        String ecoUserAgreementByType = DeviceWebUrlsKt.getEcoUserAgreementByType("sport_healthy_user_agreement", getMDeviceInfo().getModel());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(uzi.p1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str = String.format(string, Arrays.copyOf(new Object[]{ecoUserAgreementByType, ecoPrivacyPolicyUrlByType}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("policy_dialog").setDialogTitle(uzi.z).setPositiveText(uzi.x).setNegativeText(uzi.c).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, str, Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: fm2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str2) {
                BindLocalDeviceActivity.showPolicyAndAgreementDialog$lambda$2(view, str2);
            }
        }))).create();
        Intrinsics.checkNotNull(commonDialogCreate);
        addPolicyDialogCallback(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPolicyAndAgreementDialog$lambda$2(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    private final void showPolicyDialog() {
        CommonDialog<?> commonDialogCreate = new CommonDialog.c("policy_dialog").setDialogTitle(uzi.z).setPositiveText(uzi.x).setNegativeText(uzi.c).setDialogDescriptionString(new DialogParams.DialogDescriptionString(LinkSpanHelper.a(this, getString(uzi.q1, DeviceWebUrlsKt.getWatchAgreementUrl(getMDeviceInfo().getModel())), Integer.valueOf(bji.f4286a), new LinkSpanHelper.a() { // from class: dm2
            @Override // com.xiaomi.fitness.common.extensions.LinkSpanHelper.a
            public final void onLinkClicked(View view, String str) {
                BindLocalDeviceActivity.showPolicyDialog$lambda$3(view, str);
            }
        }))).create();
        Intrinsics.checkNotNull(commonDialogCreate);
        addPolicyDialogCallback(commonDialogCreate);
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPolicyDialog$lambda$3(View view, String str) {
        Intrinsics.checkNotNull(str);
        WebViewUtilKt.startWebView$default(str, null, false, false, null, false, null, false, 254, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.bind.Hilt_BindLocalDeviceActivity, com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BindLocalViewModel) getMViewModel()).getBindFinish().observe(this, new BindLocalDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: zl2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindLocalDeviceActivity.onCreate$lambda$0(this.f41417a, (String) obj);
            }
        }));
        ((BindLocalViewModel) getMViewModel()).getPolicyFlag().observe(this, new BindLocalDeviceActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: bm2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindLocalDeviceActivity.onCreate$lambda$1(this.f4358a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void showBindConfirmDialog(@NotNull String oobNumber) {
        Intrinsics.checkNotNullParameter(oobNumber, "oobNumber");
        setMBindConfirmDialog(new BindConfirmDialog.Builder(oobNumber).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.device.manager.ui.bind.BindLocalDeviceActivity.showBindConfirmDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
            }
        }));
        CommonDialog<?> mBindConfirmDialog = getMBindConfirmDialog();
        Intrinsics.checkNotNull(mBindConfirmDialog);
        mBindConfirmDialog.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.device.manager.ui.bind.BindDeviceActivity
    public void startBind() {
        if (((BindLocalViewModel) getMViewModel()).getAgreesPolicy()) {
            super.startBind();
        }
    }
}
