package com.huawei.health.vip;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.view.EquityDialogActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.fcn;
import health.compact.a.CommonUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes.dex */
public class VipInnerApi extends JsBaseModule {
    @JavascriptInterface
    public void startVipPayViewActivity(long j, String str) {
        LogUtil.a(this.TAG, "startVipPayViewActivity");
        if (this.mContext instanceof Activity) {
            VipApi vipApi = (VipApi) Services.d("vip", VipApi.class);
            if (vipApi != null) {
                vipApi.startVipPayViewActivity((Activity) this.mContext, str);
                onSuccessCallback(j);
                return;
            } else {
                LogUtil.j(this.TAG, "vipApi is null.");
                return;
            }
        }
        LogUtil.j(this.TAG, "mContext is not activity.");
    }

    @JavascriptInterface
    /* JADX INFO: renamed from: showDialog, reason: merged with bridge method [inline-methods] */
    public void m1242lambda$showDialog$0$comhuaweihealthvipVipInnerApi(final long j, final String str) {
        LogUtil.a(this.TAG, "showDialog");
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: irr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.m1242lambda$showDialog$0$comhuaweihealthvipVipInnerApi(j, str);
                }
            });
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null || activityJ.isFinishing() || activityJ.isDestroyed()) {
            LogUtil.e(this.TAG, "activity is wrong or destroyed");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activityJ);
        builder.a(str);
        final Context contextB = BaseApplication.b();
        builder.c(R.string.IDS_vip_continue_open, new View.OnClickListener() { // from class: irp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.m1243lambda$showDialog$1$comhuaweihealthvipVipInnerApi(contextB, j, view);
            }
        });
        if (CommonUtil.j(LoginInit.getInstance(this.mContext).getAccountInfo(1009)) == 7) {
            builder.a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: irq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.m1244lambda$showDialog$2$comhuaweihealthvipVipInnerApi(contextB, j, view);
                }
            });
        } else {
            builder.e(R.string.IDS_settings_button_cancal, com.huawei.ui.commonui.R.color.textColorSecondary, new View.OnClickListener() { // from class: iro
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38009a.m1245lambda$showDialog$3$comhuaweihealthvipVipInnerApi(contextB, j, view);
                }
            });
        }
        builder.b(true);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: irw
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.d.m1246lambda$showDialog$4$comhuaweihealthvipVipInnerApi(contextB, j, dialogInterface);
            }
        });
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: renamed from: lambda$showDialog$1$com-huawei-health-vip-VipInnerApi, reason: not valid java name */
    public /* synthetic */ void m1243lambda$showDialog$1$comhuaweihealthvipVipInnerApi(Context context, long j, View view) {
        LogUtil.a(this.TAG, "agreed confirmed");
        fcn.c(context, 1);
        onSuccessCallback(j, 1);
    }

    /* JADX INFO: renamed from: lambda$showDialog$2$com-huawei-health-vip-VipInnerApi, reason: not valid java name */
    public /* synthetic */ void m1244lambda$showDialog$2$comhuaweihealthvipVipInnerApi(Context context, long j, View view) {
        LogUtil.a(this.TAG, "agree canceled");
        fcn.c(context, 2);
        onSuccessCallback(j, 0);
    }

    /* JADX INFO: renamed from: lambda$showDialog$3$com-huawei-health-vip-VipInnerApi, reason: not valid java name */
    public /* synthetic */ void m1245lambda$showDialog$3$comhuaweihealthvipVipInnerApi(Context context, long j, View view) {
        LogUtil.a(this.TAG, "agree canceled");
        fcn.c(context, 2);
        onSuccessCallback(j, 0);
    }

    /* JADX INFO: renamed from: lambda$showDialog$4$com-huawei-health-vip-VipInnerApi, reason: not valid java name */
    public /* synthetic */ void m1246lambda$showDialog$4$comhuaweihealthvipVipInnerApi(Context context, long j, DialogInterface dialogInterface) {
        LogUtil.a(this.TAG, "dialog canceled");
        fcn.c(context, 3);
        onSuccessCallback(j, 0);
    }

    @JavascriptInterface
    public void finishEquityDialog(final long j) {
        LogUtil.a(this.TAG, "finishEquityDialogActivity");
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.vip.VipInnerApi.2
            @Override // java.lang.Runnable
            public void run() {
                Activity activity;
                if (VipInnerApi.this.mContext == null) {
                    return;
                }
                if (VipInnerApi.this.mContext instanceof Activity) {
                    activity = (Activity) VipInnerApi.this.mContext;
                } else if (!(VipInnerApi.this.mContext instanceof ContextWrapper) || !(((ContextWrapper) VipInnerApi.this.mContext).getBaseContext() instanceof Activity)) {
                    return;
                } else {
                    activity = (Activity) ((ContextWrapper) VipInnerApi.this.mContext).getBaseContext();
                }
                if (activity instanceof EquityDialogActivity) {
                    ((EquityDialogActivity) activity).finish();
                    VipInnerApi.this.onSuccessCallback(j, 0);
                } else {
                    VipInnerApi.this.onSuccessCallback(j, -1);
                }
            }
        });
    }
}
