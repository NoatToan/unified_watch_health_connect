package com.huawei.hwdevice.mainprocess.receiver.hwdfx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.loj;
import defpackage.ltr;
import defpackage.lws;
import defpackage.mfz;
import defpackage.mjh;
import defpackage.niz;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceTriggerDfxReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17403c = null;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("DeviceTriggerDfxReceiver", "DeviceTriggerDfxReceiver enter");
        this.f17403c = context;
        if (!e()) {
            LogUtil.a("DeviceTriggerDfxReceiver", "not support DXF");
            return;
        }
        if (intent == null) {
            LogUtil.e("DeviceTriggerDfxReceiver", "intent == null");
            return;
        }
        CommonUtil.c();
        ltr.b().init(this.f17403c);
        String action = intent.getAction();
        int intExtra = intent.getIntExtra("isUploadAppLog", 1);
        boolean booleanExtra = intent.getBooleanExtra("isFromBetaClub", false);
        int intExtra2 = intent.getIntExtra("netType", 0);
        LogUtil.a("DeviceTriggerDfxReceiver", "DeviceTriggerDfxReceiver action: ", action, ",netType:", Integer.valueOf(intExtra2));
        if ("com.huawei.bone.dfx.device_trigger_log".equalsIgnoreCase(action)) {
            a(intExtra, booleanExtra, context, intExtra2);
            return;
        }
        if ("com.huawei.bone.dfx.device_trigger_upload_log".equalsIgnoreCase(action)) {
            mjh.a(intExtra2 == 1);
            lws.c(context).c(intent.getBooleanExtra("isAuto", false), intent.getStringExtra("pre_log_export_mac"));
        } else if ("com.huawei.bone.dfx.device_trigger_retry".equalsIgnoreCase(action)) {
            mjh.a(intExtra2 == 1);
            lws.c(context).c(intent.getBooleanExtra("isAuto", false), intent.getStringExtra("pre_log_export_mac"));
        } else {
            LogUtil.a("DeviceTriggerDfxReceiver", "DeviceTriggerDfxReceiver others action");
        }
    }

    private void a(final int i, final boolean z, final Context context, final int i2) {
        LogUtil.a("DeviceTriggerDfxReceiver", "enter handleBetaClubCollect");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.receiver.hwdfx.DeviceTriggerDfxReceiver.3
            @Override // java.lang.Runnable
            public void run() {
                lws.c(context).a(0, new DeviceDfxBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.receiver.hwdfx.DeviceTriggerDfxReceiver.3.5
                    @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
                    public void onProgress(int i3, String str) {
                    }

                    @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
                    public void onSuccess(int i3, String str) {
                        LogUtil.a("DeviceTriggerDfxReceiver", "onSuccess successCode:", Integer.valueOf(i3), ",isUploadAppLog:", Integer.valueOf(i), "，0 upload，1 don't upload");
                        if (z) {
                            mfz.d(5, true);
                        }
                        mjh.a(i2 == 1);
                        lws.c(DeviceTriggerDfxReceiver.this.f17403c).c(i == 1 && !z, str);
                    }

                    @Override // com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.callback.DeviceDfxBaseResponseCallback
                    public void onFailure(int i3, String str) {
                        ReleaseLogUtil.d("DEVMGR_DeviceTriggerDfxReceiver", "onFailure errorCode:", Integer.valueOf(i3), ", errorMessage = ", str);
                        if (z) {
                            mfz.d(5, true);
                            String strF = mjh.f(str);
                            mjh.a(i2 == 1);
                            lws.c(DeviceTriggerDfxReceiver.this.f17403c).c(false, strF);
                        }
                    }
                }, z);
            }
        });
    }

    private boolean e() {
        boolean zC = niz.c();
        LogUtil.a("DeviceTriggerDfxReceiver", "BuildConfig.SUPPORT_LOG_FEEDBACK " + CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK") + ",experence = " + zC);
        return zC && loj.c(48) && CompileParameterUtil.d("SUPPORT_LOG_FEEDBACK");
    }
}
