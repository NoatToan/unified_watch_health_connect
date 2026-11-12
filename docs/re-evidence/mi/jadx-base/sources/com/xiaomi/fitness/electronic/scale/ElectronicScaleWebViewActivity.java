package com.xiaomi.fitness.electronic.scale;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.electronic.scale.ElectronicScaleWebViewActivity;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.hbk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0012\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ElectronicScaleWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "mDid", "", "mMac", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "handler", "Landroid/os/Handler;", "initWebView", "", "getJavaScriptInterface", "Lcom/xiaomi/fitness/electronic/scale/ElectronicScaleInnerJavaScriptImpl;", "loadDevice", "loadDeviceModel", LifecycleConstantKt.ON_DESTROY, "initDeviceModel", "onMenuItemSelected", "", "featureId", "", "item", "Landroid/view/MenuItem;", "onBackPressed", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectronicScaleWebViewActivity extends WebViewActivity {

    @NotNull
    public static final String SCAN_ACTIVITY_CLASS = "com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceActivity";

    @NotNull
    private static final String TAG = "ElectronicScaleWebViewActivity";

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Nullable
    private EcoDeviceModel mDeviceModel;

    @Nullable
    private String mDid;

    @Nullable
    private String mMac;

    /* JADX INFO: renamed from: com.xiaomi.fitness.electronic.scale.ElectronicScaleWebViewActivity$loadDeviceModel$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/electronic/scale/ElectronicScaleWebViewActivity$loadDeviceModel$1", "Lhbk$a;", "", "onSuccess", "()V", "", "code", "", "msg", "onFail", "(ILjava/lang/String;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends hbk.a {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onFail$lambda$0(ElectronicScaleWebViewActivity this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.loadDeviceModel();
        }

        @Override // defpackage.hbk
        public void onFail(int code, String msg) {
            Logger.e("getEcoListError code : " + code + " , msg : " + msg, new Object[0]);
            Handler handler = ElectronicScaleWebViewActivity.this.handler;
            final ElectronicScaleWebViewActivity electronicScaleWebViewActivity = ElectronicScaleWebViewActivity.this;
            handler.postDelayed(new Runnable() { // from class: t68
                @Override // java.lang.Runnable
                public final void run() {
                    ElectronicScaleWebViewActivity.AnonymousClass1.onFail$lambda$0(electronicScaleWebViewActivity);
                }
            }, VibrateModeProgressBar.sLongToLong);
        }

        @Override // defpackage.hbk
        public void onSuccess() {
            AnyExtKt.main$default(null, new ElectronicScaleWebViewActivity$loadDeviceModel$1$onSuccess$1(ElectronicScaleWebViewActivity.this, null), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initDeviceModel() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel != null && ecoDeviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "initDeviceModel isDeviceConnected");
            return;
        }
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        ecoDeviceManagerExtKt.connectDevice(str);
    }

    private final void loadDevice() {
        Logger.i(TAG, "loadDevice " + this.mDid + " , " + this.mMac + " ");
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        ecoDeviceManagerExtKt.disconnectDevice(str);
        EcoApiCallManager ecoApiCallManager = EcoApiCallManager.INSTANCE.get();
        String str2 = this.mDid;
        Intrinsics.checkNotNull(str2);
        ecoApiCallManager.destroyEcoCall(str2);
        loadDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDeviceModel() {
        EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).refreshEcoList(new AnonymousClass1());
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initWebView() {
        this.mDid = getIntent().getStringExtra("did");
        this.mMac = getIntent().getStringExtra("mac");
        super.initWebView();
        String str = this.mDid;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        loadDevice();
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        super.lambda$onCreate$0();
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        String str2 = this.mMac;
        Intrinsics.checkNotNull(str2);
        ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity(this, str, str2, false);
        finish();
        AppManager companion = AppManager.INSTANCE.getInstance();
        ScanDeviceActivity.Companion companion2 = ScanDeviceActivity.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(ScanDeviceActivity.class, "forName(...)");
        companion.killActivity(ScanDeviceActivity.class);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onMenuItemSelected(featureId, item);
        }
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        String str2 = this.mMac;
        Intrinsics.checkNotNull(str2);
        ElectronicScaleManagerExtKt.launchToElectronicScaleMainActivity(this, str, str2, false);
        finish();
        AppManager companion = AppManager.INSTANCE.getInstance();
        ScanDeviceActivity.Companion companion2 = ScanDeviceActivity.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(ScanDeviceActivity.class, "forName(...)");
        companion.killActivity(ScanDeviceActivity.class);
        return true;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public ElectronicScaleInnerJavaScriptImpl getJavaScriptInterface() {
        ElectronicScaleInnerJavaScriptImpl electronicScaleInnerJavaScriptImpl = new ElectronicScaleInnerJavaScriptImpl(this, this);
        String str = this.mDid;
        Intrinsics.checkNotNull(str);
        electronicScaleInnerJavaScriptImpl.setDid(str);
        String str2 = this.mMac;
        Intrinsics.checkNotNull(str2);
        electronicScaleInnerJavaScriptImpl.setMac(str2);
        return electronicScaleInnerJavaScriptImpl;
    }
}
