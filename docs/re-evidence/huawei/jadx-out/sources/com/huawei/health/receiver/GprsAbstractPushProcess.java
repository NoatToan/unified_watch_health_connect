package com.huawei.health.receiver;

import android.content.Context;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.gsq;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes30.dex */
public abstract class GprsAbstractPushProcess {
    private static final String TAG = "GprsAbstractPushProcess";
    private static final String TAG_RELEASE = "DEVMGR_GprsAbstractPushProcess";
    private volatile boolean mIsShowNotifySuccess = false;

    public interface ProcessResult {
        void onResult();
    }

    protected abstract void process(Context context, gsq.e eVar, ProcessResult processResult);

    public void processPushMsg(Context context, gsq.e eVar) {
        if (context == null) {
            LogUtil.e(TAG, "processPushMsg message is null return.");
        } else {
            this.mIsShowNotifySuccess = false;
            startSyncCloud(context, eVar);
        }
    }

    private void startSyncCloud(final Context context, final gsq.e eVar) {
        LogUtil.a(TAG, "startSyncCloud");
        ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).syncCloud(Integer.parseInt(eVar.f35993b), true, new IBaseResponseCallback() { // from class: gsr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.m1148x7459da64(context, eVar, i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startSyncCloud$1$com-huawei-health-receiver-GprsAbstractPushProcess, reason: not valid java name */
    public /* synthetic */ void m1148x7459da64(Context context, gsq.e eVar, int i, Object obj) {
        if (i == Integer.parseInt("0") || i == Integer.parseInt(BleConstants.ERRCODE_TIMEOUT)) {
            LogUtil.a(TAG, "startSyncCloud syncCloud success");
            if (this.mIsShowNotifySuccess) {
                LogUtil.j(TAG, "startSyncCloud show notify is success");
                return;
            } else if (!CommonUtil.isSystemBarNoticeSwitchOnOrDefault(context)) {
                ReleaseLogUtil.e(TAG_RELEASE, "Notification closed.");
                return;
            } else {
                process(context, eVar, new ProcessResult() { // from class: gsp
                    @Override // com.huawei.health.receiver.GprsAbstractPushProcess.ProcessResult
                    public final void onResult() {
                        this.e.m1147x46814005();
                    }
                });
                return;
            }
        }
        ReleaseLogUtil.a(TAG_RELEASE, "startSyncCloud syncCloud failed, errorCode:", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: lambda$startSyncCloud$0$com-huawei-health-receiver-GprsAbstractPushProcess, reason: not valid java name */
    public /* synthetic */ void m1147x46814005() {
        this.mIsShowNotifySuccess = true;
    }
}
