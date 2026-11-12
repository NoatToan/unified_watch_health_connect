package com.xiaomi.fitness.electronic.scale;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.configwifi.WifiPBApi;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.WifiInfoActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.av1;
import defpackage.av6;
import defpackage.dl0;
import defpackage.f4b;
import defpackage.gui;
import defpackage.wc0;
import defpackage.zcp;
import defpackage.zzi;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/WifiInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/WifiInfoViewModel;", "Ldl0;", "", "initView", "()V", "showResetDialog", "restoreWifi", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WifiInfoActivity extends Hilt_WifiInfoActivity<WifiInfoViewModel, dl0> {

    @NotNull
    public static final String TAG = "WifiInfoActivity";

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.WifiInfoActivity$restoreWifi$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/electronic/scale/WifiInfoActivity$restoreWifi$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements OnEcoSyncCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(WifiInfoActivity this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).startConfigWifiActivity(this$0, str, null);
            this$0.finish();
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        public void onError(String did, int type, int code) {
            OTALogExtKt.logi(WifiInfoActivity.TAG, "restoreWifi, onError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
            ToastExtKt.toastShort(WifiInfoActivity.this, zzi.b6);
        }

        @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
        @SuppressLint({"SetTextI18n"})
        public void onSuccess(final String did, int type, EcoSyncResult result) {
            OTALogExtKt.logi(WifiInfoActivity.TAG, "restoreWifi, onSuccess, result" + f4b.c(result));
            ToastExtKt.toastShort(WifiInfoActivity.this, zzi.c6);
            final WifiInfoActivity wifiInfoActivity = WifiInfoActivity.this;
            zcp.a(new Runnable() { // from class: nkr
                @Override // java.lang.Runnable
                public final void run() {
                    WifiInfoActivity.AnonymousClass1.onSuccess$lambda$0(wifiInfoActivity, did);
                }
            }, TimeUnit.SECONDS.toMillis(3L));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setTitle(getString(zzi.E));
        }
        setActionBarDisplayable(true);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        ((dl0) getMBinding()).D.setOnClickListener(new View.OnClickListener() { // from class: mkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiInfoActivity.initView$lambda$0(this.f26967a, view);
            }
        });
        String stringExtra = getIntent().getStringExtra(ElectronicScaleManagerExtKt.PARAM_SSID);
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((dl0) getMBinding()).C.setRemindText(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WifiInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showResetDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreWifi() {
        String stringExtra = getIntent().getStringExtra("did");
        Intrinsics.checkNotNull(stringExtra);
        WifiPBApi.INSTANCE.restoreWifi(stringExtra, new AnonymousClass1());
    }

    private final void showResetDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("wifi_info_reset").setDialogTitle(zzi.Z5).setDialogDescription(zzi.a6).setPositiveText(zzi.c).setNegativeText(zzi.f41831b).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.electronic.scale.WifiInfoActivity.showResetDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                if (which != -3) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    } else if (which != -1) {
                        return;
                    }
                }
                if (dialog != null) {
                    dialog.dismiss();
                }
                WifiInfoActivity.this.restoreWifi();
            }
        });
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.A;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_WifiInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }
}
