package com.huawei.operation.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.R;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.view.CustomWebView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;

/* JADX INFO: loaded from: classes13.dex */
public class WebViewActivityExt {
    private static final String TAG = "PluginOperation_WebViewActivity";
    private CustomTextAlertDialog mUnbindDialog;

    public void showActivityResultExplainDialog(Context context) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).e(context.getString(R.string.IDS_social_information_tips)).a(context.getResources().getString(R.string.IDS_activity_result_explain)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivityExt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    public void startVmallLogout(CustomWebView customWebView, WebView webView) {
        if (customWebView == null || webView == null) {
            return;
        }
        LogUtil.d(TAG, "startVmallLogout Constants.WEB_VIEW_STATUS_ON_DESTROY");
        customWebView.startVmallLogout();
        customWebView.callbackWebViewStatus(Constants.WEBVIEW_STATUS_ON_DESTROY);
        customWebView.setRegisterActivityQuitFunctionRes("");
        customWebView.clear();
    }

    public void showUnBindDeviceDialog(final Context context, final ContentValues contentValues, final String str, final PluginOperationAdapter pluginOperationAdapter) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.operation.activity.WebViewActivityExt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1513x3bac8ebf(context, pluginOperationAdapter, contentValues, str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$showUnBindDeviceDialog$2$com-huawei-operation-activity-WebViewActivityExt, reason: not valid java name */
    /* synthetic */ void m1513x3bac8ebf(final Context context, final PluginOperationAdapter pluginOperationAdapter, final ContentValues contentValues, final String str) {
        if (context == null || pluginOperationAdapter == null) {
            LogUtil.a(TAG, "showUnBindDeviceDialog context or adapter is null");
            return;
        }
        int i = R.string.IDS_hw_health_wear_connect_device_unpair_button;
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(i, new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivityExt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1511x58594281(pluginOperationAdapter, context, contentValues, str, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.operation.activity.WebViewActivityExt$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m1512x4a02e8a0(view);
            }
        }).b();
        this.mUnbindDialog = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.mUnbindDialog.show();
    }

    /* JADX INFO: renamed from: lambda$showUnBindDeviceDialog$0$com-huawei-operation-activity-WebViewActivityExt, reason: not valid java name */
    /* synthetic */ void m1511x58594281(PluginOperationAdapter pluginOperationAdapter, Context context, ContentValues contentValues, String str, View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog == null) {
            LogUtil.a(TAG, "showUnBindDeviceDialog setPositiveButton mUnbindDialog = null");
            return;
        }
        customTextAlertDialog.dismiss();
        if (pluginOperationAdapter.unbindHaveBindingDevice(context, contentValues, str)) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(67108864);
                context.startActivity(launchIntentForPackage);
            }
            if (context instanceof Activity) {
                ((Activity) context).finish();
            } else {
                LogUtil.a(TAG, "showUnBindDeviceDialog context is not Activity ");
            }
        }
    }

    /* JADX INFO: renamed from: lambda$showUnBindDeviceDialog$1$com-huawei-operation-activity-WebViewActivityExt, reason: not valid java name */
    /* synthetic */ void m1512x4a02e8a0(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.mUnbindDialog;
        if (customTextAlertDialog == null) {
            LogUtil.a(TAG, "showUnBindDeviceDialog setNegativeButton mUnbindDialog = null");
        } else {
            customTextAlertDialog.dismiss();
            this.mUnbindDialog = null;
        }
    }
}
