package com.huawei.hwdevice.phoneprocess.mgr.sleepsync;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.intelligent.DeviceServiceInfo;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataRequest;
import com.huawei.hwcloudmodel.model.intelligent.TransferDeviceDataResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.lmf;
import defpackage.lqo;
import defpackage.mhs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class SleepSyncManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17522a = new Object();
    private static SleepSyncManager e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17523b;
    private lqo f;
    private DeviceInfo g;
    protected int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f17524c = 0;
    private b j = new b();
    private mhs i = mhs.a();
    private ExtendHandler h = HandlerCenter.b(this.j, "SleepSyncManager");

    public SleepSyncManager(Context context) {
        this.f17523b = context;
        this.f = lqo.b(this.f17523b);
    }

    public static SleepSyncManager d() {
        SleepSyncManager sleepSyncManager;
        synchronized (f17522a) {
            if (e == null) {
                e = new SleepSyncManager(BaseApplication.getContext());
            }
            sleepSyncManager = e;
        }
        return sleepSyncManager;
    }

    public void d(DeviceInfo deviceInfo) {
        LogUtil.a("SleepSyncManager", "action is ACTION_SYNC_SLEEP_MASK");
        this.d = 0;
        this.f17524c = 0;
        this.g = deviceInfo;
        c();
    }

    protected void c() {
        LogUtil.a("SleepSyncManager", "activeTransportDeviceData enter");
        DeviceInfo deviceInfo = this.g;
        if (deviceInfo == null) {
            LogUtil.j("SleepSyncManager", "activeTransportDeviceData mDeviceInfo is null");
        } else {
            this.i.getSwitchSetting("intelligent_home_linkage", deviceInfo.getDeviceIdentify(), new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.sleepsync.SleepSyncManager.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("SleepSyncManager", "activeTransportDeviceData errorCode is: ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof String)) {
                        SleepSyncManager.this.e((String) obj);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
            String[] strArrSplit = str.split(Constants.PARAM_SERVER_SPLIT);
            LogUtil.a("SleepSyncManager", "INTELLIGENT_HOME_LINKAGE new split : ", Integer.valueOf(strArrSplit.length));
            if (strArrSplit.length == 5) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                String str4 = strArrSplit[2];
                String str5 = strArrSplit[3];
                String str6 = strArrSplit[4];
                LogUtil.a("SleepSyncManager", "checkDeviceIdIsPermanent deviceId : ", CommonUtil.n(str2), " ,expires : ", str3, " ,productId : ", str4, " ,enable : ", str5, " ,isClick : ", str6);
                if (Boolean.parseBoolean(str5) && Boolean.parseBoolean(str6)) {
                    b(str2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ExtendHandler extendHandler = this.h;
        if (extendHandler != null) {
            extendHandler.removeMessages(10010);
        }
        this.f17524c = 0;
        if (this.d < 3) {
            c();
        } else {
            this.d = 0;
        }
    }

    private void b(String str) {
        ReleaseLogUtil.d("R_SleepSyncManager", "transportDeviceData enter");
        Message messageObtain = Message.obtain();
        messageObtain.what = 10011;
        this.h.sendEmptyMessage(messageObtain.what, 60000L);
        c("sleep", "1", str, new FitnessCloudCallBack() { // from class: com.huawei.hwdevice.phoneprocess.mgr.sleepsync.SleepSyncManager.3
            @Override // com.huawei.callback.FitnessCloudCallBack
            public void onResponce(Object obj) {
                if (!(obj instanceof TransferDeviceDataResponse)) {
                    LogUtil.j("SleepSyncManager", "objectData is error");
                    return;
                }
                if (((TransferDeviceDataResponse) obj).getResultCode().intValue() == 0) {
                    SleepSyncManager.this.d = 0;
                    SleepSyncManager.this.f17524c = 0;
                    SleepSyncManager.this.h.removeMessages(10011);
                    ReleaseLogUtil.d("R_SleepSyncManager", "transportDeviceData is success");
                    return;
                }
                ReleaseLogUtil.e("R_SleepSyncManager", "transportDeviceData is fail");
            }
        });
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.SETTING_1090018.value(), new HashMap(16), 0);
    }

    private void c(String str, String str2, String str3, final FitnessCloudCallBack fitnessCloudCallBack) {
        if (fitnessCloudCallBack == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        PowerKitManager.a().b("SleepSyncManager", 512, "auto-health-transDeviceData");
        DeviceServiceInfo deviceServiceInfo = new DeviceServiceInfo();
        deviceServiceInfo.setSid(str);
        HashMap map = new HashMap(16);
        map.put("state", str2);
        deviceServiceInfo.setData(map);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(deviceServiceInfo);
        TransferDeviceDataRequest transferDeviceDataRequest = new TransferDeviceDataRequest();
        transferDeviceDataRequest.setDevId(str3);
        transferDeviceDataRequest.setServices(arrayList);
        this.f.b(transferDeviceDataRequest, new ICloudOperationResult<TransferDeviceDataResponse>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.sleepsync.SleepSyncManager.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(TransferDeviceDataResponse transferDeviceDataResponse, String str4, boolean z) {
                if (transferDeviceDataResponse != null) {
                    fitnessCloudCallBack.onResponce(transferDeviceDataResponse);
                    PowerKitManager.a().a("SleepSyncManager", 512, "auto-health-transDeviceData");
                }
            }
        });
    }

    class b implements Handler.Callback {
        private b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("SleepSyncManager", "message is null");
                return false;
            }
            LogUtil.a("SleepSyncManager", "handleMessage message is ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 10010) {
                SleepSyncManager.this.e();
                return true;
            }
            if (i == 10011) {
                if (SleepSyncManager.this.h != null) {
                    SleepSyncManager.this.h.removeMessages(10011);
                }
                SleepSyncManager.this.f17524c++;
                LogUtil.a("SleepSyncManager", "connectedThree :", Integer.valueOf(SleepSyncManager.this.f17524c));
                if (SleepSyncManager.this.f17524c == 3) {
                    SleepSyncManager.this.d++;
                    LogUtil.a("SleepSyncManager", "connected :", Integer.valueOf(SleepSyncManager.this.d));
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 10010;
                    SleepSyncManager.this.h.sendEmptyMessage(messageObtain.what, 600000L);
                }
                if (SleepSyncManager.this.f17524c < 3) {
                    SleepSyncManager.this.c();
                }
                return true;
            }
            LogUtil.j("SleepSyncManager", "handleMessage default");
            return false;
        }
    }
}
