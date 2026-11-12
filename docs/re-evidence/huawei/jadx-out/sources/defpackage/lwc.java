package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lwc extends JsBaseModule {
    private WebView e;

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        LogUtil.a("CmccAijs", "onCreate");
        this.e = this.mH5ProInstance.getWebView();
        e();
    }

    private void e() {
        LogUtil.a("CmccAijs", "initPermission");
        WebView webView = this.e;
        if (webView == null) {
            ReleaseLogUtil.e("R_CmccAijs", "initPermission mWebview is null");
        } else {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwcmccai.js.CmccAijs$1
                @Override // android.webkit.WebChromeClient
                public void onPermissionRequest(PermissionRequest permissionRequest) {
                    permissionRequest.grant(permissionRequest.getResources());
                }
            });
        }
    }

    @JavascriptInterface
    public String getAppConfig() {
        LogUtil.a("CmccAijs", "getAppConfig entry");
        DeviceInfo deviceInfoC = mgg.c("CmccAijs");
        if (deviceInfoC == null) {
            ReleaseLogUtil.e("R_CmccAijs", "getAppConfig deviceInfo is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), "cmcc_ai_device_info", lwd.c().b(deviceInfoC));
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.d("R_CmccAijs", "getAppConfig cmccAiDeviceInfoStr is empty");
            return "";
        }
        LogUtil.a("CmccAijs", "getAppConfig success");
        return strE;
    }

    @JavascriptInterface
    public void copyToClipboard(final String str) {
        LogUtil.a("CmccAijs", "copyToClipboard entry");
        HandlerExecutor.c(new Runnable() { // from class: lwi
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(str);
            }
        });
    }

    /* synthetic */ void a(String str) {
        if (this.mContext == null) {
            ReleaseLogUtil.e("R_CmccAijs", "copyToClipboard mContext isnull");
        } else {
            ((ClipboardManager) this.mContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", str));
            LogUtil.a("CmccAijs", "copyToClipboard success");
        }
    }

    @JavascriptInterface
    public void checkMicrophonePermission() {
        LogUtil.a("CmccAijs", "checkMicrophonePermission entry");
        PermissionUtil.d(this.mContext, PermissionUtil.PermissionType.RECORD_AUDIO, new PermissionsResultAction() { // from class: lwc.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("CmccAijs", "onGranted");
                lwc.this.d(true);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("CmccAijs", "onDenied: ", str);
                lwc.this.d(false);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                super.onForeverDenied(permissionType);
                lwc.this.d(false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z) {
        LogUtil.a("CmccAijs", "checkMicrophonePermission havePermission is ", Boolean.valueOf(z));
        HandlerExecutor.c(new Runnable() { // from class: lwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f40963b.c(z);
            }
        });
    }

    /* synthetic */ void c(final boolean z) {
        WebView webView = this.e;
        if (webView == null) {
            ReleaseLogUtil.d("R_CmccAijs", "callbackMicrophonePermission mWebview is null");
            return;
        }
        webView.evaluateJavascript("javascript:onMicrophonePermissionChanged(" + z + Constants.RIGHT_BRACKET_ONLY, new ValueCallback() { // from class: lwf
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ReleaseLogUtil.d("R_CmccAijs", "callbackMicrophonePermission callbackMicrophonePermission success, havePermission is ", Boolean.valueOf(z));
            }
        });
    }

    @JavascriptInterface
    public void goBack() {
        LogUtil.a("CmccAijs", "goBack entry");
        HandlerExecutor.c(new Runnable() { // from class: lwh
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        });
    }

    /* synthetic */ void a() {
        LogUtil.a("CmccAijs", "goBack finishPage");
        d();
    }

    private void d() {
        LogUtil.a("CmccAijs", "finishPage entry");
        Activity activityJ = this.mContext instanceof Activity ? (Activity) this.mContext : null;
        if (activityJ == null) {
            activityJ = BaseApplication.j();
        }
        if (activityJ != null) {
            LogUtil.a("CmccAijs", "finishPage success");
            activityJ.finish();
        } else {
            ReleaseLogUtil.d("R_CmccAijs", "finishPage activity is null");
        }
    }
}
