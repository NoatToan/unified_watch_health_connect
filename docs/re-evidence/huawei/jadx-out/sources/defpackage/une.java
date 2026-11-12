package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.GRSManager;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class une {
    public static void a(Context context, final IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.e("PressureDialog", "showBeginDeviceStressAdjust() parameter is null.");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.pressure_detect_dialog, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.open_pressure_auto_detector_content);
        if (qrs.v()) {
            healthTextView.setTextSize(1, 30.0f);
        }
        healthTextView.setText(context.getString(R.string.IDS_hw_begin_pressure_adjust_dialog_content));
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).a(context.getString(R.string.IDS_hw_pressure_adjust)).d(viewInflate).c(context.getString(R.string.IDS_hw_cancel_begin_pressure_adjust), new View.OnClickListener() { // from class: une.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iBaseResponseCallback.a(100001, null);
            }
        }).a(context.getString(R.string.IDS_hw_begin_pressure_adjust), new View.OnClickListener() { // from class: une.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iBaseResponseCallback.a(0, null);
            }
        }).d();
        customViewDialogD.setCancelable(false);
        LogUtil.a("PressureDialog", "showBeginDeviceStressAdjust");
        customViewDialogD.show();
    }

    private static void d(Context context, int i) {
        if (context == null) {
            LogUtil.e("PressureDialog", "showDeviceNoConnectDialog() parameter is null.");
            return;
        }
        View viewInflate = View.inflate(context, R.layout.pressure_device_connect, null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.pressure_device_no_connect);
        if (qrs.v()) {
            healthTextView.setTextSize(1, 30.0f);
        }
        if (i == 1) {
            healthTextView.setText(context.getString(R.string.IDS_hw_pressure_device_connect));
        } else {
            if (i != 2) {
                LogUtil.e("PressureDialog", "showDeviceNotConnectedDialog() Unsupported type.");
                return;
            }
            healthTextView.setText(context.getString(R.string.IDS_hw_adjust_show_pressure_device_connect));
        }
        ((LinearLayout) viewInflate.findViewById(R.id.hw_health_agree_dialog_pressure)).setVisibility(8);
        b(context, viewInflate);
    }

    private static void b(final Context context, View view) {
        CustomViewDialog.Builder builderA = new CustomViewDialog.Builder(context).d(view).a(context.getString(R.string.IDS_hw_pressure_known), new View.OnClickListener() { // from class: une.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        if (!Utils.o()) {
            builderA.c(context.getString(R.string.IDS_hw_pressure_learn_more), new View.OnClickListener() { // from class: une.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    une.a(context);
                }
            });
        }
        CustomViewDialog customViewDialogD = builderA.d();
        customViewDialogD.setCancelable(false);
        customViewDialogD.show();
    }

    /* JADX INFO: renamed from: une$3, reason: invalid class name */
    class AnonymousClass3 implements GrsQueryCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f50393c;

        AnonymousClass3(Context context) {
            this.f50393c = context;
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackSuccess(final String str) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.e("PressureDialog", "showDeviceNotConnected messageCenterHost is empty");
                return;
            }
            LogUtil.a("PressureDialog", "showDeviceNotConnected messageCenterHost = ", str);
            final Context context = this.f50393c;
            HandlerExecutor.c(new Runnable() { // from class: ung
                @Override // java.lang.Runnable
                public final void run() {
                    une.AnonymousClass3.c(context, str);
                }
            });
        }

        static /* synthetic */ void c(Context context, String str) {
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", str + "/messageH5/sleephtml/salesPromotion.html");
            iov.d(context, intent);
        }

        @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
        public void onCallBackFail(int i) {
            LogUtil.a("PressureDialog", "GRSManager onCallBackFail ACTIVITY_KEY code = ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Context context) {
        GRSManager.c(context).d("messageCenterUrl", new AnonymousClass3(context));
    }

    public static void c(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.e("PressureDialog", "pressureAdjustButtonDialog() parameter is null.");
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("PressureDialog");
        if (deviceInfoC != null) {
            LogUtil.d("PressureDialog", "currentDeviceInfo.toString() ", deviceInfoC.toString());
            if (deviceInfoC.getDeviceConnectState() != 2) {
                d(context, 2);
                return;
            }
            if (eej.c() == null || !eej.c().isSupportPressAutoMonitor()) {
                LogUtil.a("PressureDialog", "Adjust isSupportPressAutoMonitor() = false");
                d(context, 2);
                return;
            }
            LogUtil.a("PressureDialog", "Adjust isSupportPressAutoMonitor() = true");
            if (HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoC.getDeviceIdentify())) {
                d(context);
                return;
            } else {
                iBaseResponseCallback.a(100000, null);
                return;
            }
        }
        d(context, 2);
    }

    public static void b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null || iBaseResponseCallback == null) {
            LogUtil.e("PressureDialog", "pressureMeasurementButtonDialog() parameter is null.");
            return;
        }
        DeviceInfo deviceInfoC = mgg.c("PressureDialog");
        if (deviceInfoC == null) {
            d(context, 1);
            return;
        }
        LogUtil.d("PressureDialog", "currentDeviceInfo = " + deviceInfoC.toString());
        if (deviceInfoC.getDeviceConnectState() != 2) {
            d(context, 1);
            return;
        }
        if (eej.c() == null) {
            LogUtil.a("PressureDialog", "CapabilityUtils.getDeviceCapability() is null");
            d(context, 1);
            return;
        }
        boolean zIsSupportPressAutoMonitor = eej.c().isSupportPressAutoMonitor();
        LogUtil.a("PressureDialog", "Adjust isSupportPressAutoMonitor() = " + zIsSupportPressAutoMonitor);
        if (zIsSupportPressAutoMonitor) {
            if (HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoC.getDeviceIdentify())) {
                d(context);
                return;
            } else {
                e(iBaseResponseCallback);
                return;
            }
        }
        d(context, 1);
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.e("PressureDialog", "showTipDialog() parameter is null.");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: une.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("PressureDialog", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private static void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("PressureDialog", "doPressureAdjust() parameter is null.");
        } else {
            new uis().e(new CommonUiBaseResponse() { // from class: une.7
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i, Object obj) {
                    if (i == 0 && obj != null) {
                        Boolean bool = (Boolean) obj;
                        boolean zBooleanValue = bool.booleanValue();
                        LogUtil.a("PressureDialog", "isAlreadyDoPressureAdjust isAlreadyAdjust = ", bool);
                        if (zBooleanValue) {
                            iBaseResponseCallback.a(0, null);
                            return;
                        } else {
                            iBaseResponseCallback.a(100001, null);
                            return;
                        }
                    }
                    iBaseResponseCallback.a(100001, null);
                }
            });
        }
    }
}
