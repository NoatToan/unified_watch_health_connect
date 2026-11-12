package com.huawei.hwdevice.mainprocess.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.eeq;
import defpackage.lug;
import defpackage.lvb;
import defpackage.lvj;
import defpackage.lvv;
import defpackage.lxg;
import health.compact.a.CommonUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes38.dex */
public class SendDataToDeviceBroadcastReceiver extends BroadcastReceiver {
    private boolean d(int i, int i2) {
        return i == 26 && i2 == 7;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (b(context, intent)) {
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            LogUtil.j("SendDataToDeviceBroadcastReceiver", "onReceive action is null");
            return;
        }
        LogUtil.a("SendDataToDeviceBroadcastReceiver", "onReceive: action: ", action);
        action.hashCode();
        if (action.equals("com.huawei.bone.ACTION_RECEIVE_SEND_SPORT_GOAL")) {
            e(intent);
        } else if (!action.equals("com.huawei.bone.ACTION_RECEIVE_SEND_HEART_CONFIG")) {
            LogUtil.j("SendDataToDeviceBroadcastReceiver", "onReceive: no support action: ", action);
        } else {
            e(context);
        }
    }

    private boolean b(Context context, Intent intent) {
        if (!CommonUtil.ck()) {
            LogUtil.j("SendDataToDeviceBroadcastReceiver", "onReceive: not support wear product");
            return true;
        }
        if (context != null && intent != null) {
            return false;
        }
        LogUtil.j("SendDataToDeviceBroadcastReceiver", "onReceive: context or intent is null");
        return true;
    }

    private void e(Context context) {
        lxg.c(context).d(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.receiver.SendDataToDeviceBroadcastReceiver.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("SendDataToDeviceBroadcastReceiver", "setHeartZoneConfig onResponse errorCode: ", Integer.valueOf(i));
                if (i != 0 || obj == null) {
                    return;
                }
                LogUtil.a("SendDataToDeviceBroadcastReceiver", "setHeartZoneConfig onResponse objectData: ", obj.toString());
            }
        }, true);
    }

    private void e(Intent intent) {
        byte[] byteArrayExtra;
        final byte[] byteArrayExtra2;
        DeviceInfo deviceInfo = null;
        try {
            byteArrayExtra = intent.getByteArrayExtra("synchronize_data_key");
            try {
                byteArrayExtra2 = intent.getByteArrayExtra("alarm_data_key");
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("synchronize_data_deviceinfo_key");
                    if (parcelableExtra instanceof DeviceInfo) {
                        deviceInfo = (DeviceInfo) parcelableExtra;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    e = e;
                    LogUtil.e("SendDataToDeviceBroadcastReceiver", "processActionSportGoal Exception : ", ExceptionUtils.c(e));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                byteArrayExtra2 = null;
            }
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
            byteArrayExtra = null;
            byteArrayExtra2 = null;
        }
        if (byteArrayExtra != null) {
            LogUtil.a("SendDataToDeviceBroadcastReceiver", "tlvDataInfos");
            d(byteArrayExtra, deviceInfo);
        } else {
            if (byteArrayExtra2 != null) {
                LogUtil.a("SendDataToDeviceBroadcastReceiver", "tlvAlarmInfos");
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.receiver.SendDataToDeviceBroadcastReceiver.5
                    @Override // java.lang.Runnable
                    public void run() {
                        SendDataToDeviceBroadcastReceiver.this.a(byteArrayExtra2);
                    }
                });
            }
            a();
        }
    }

    private int b(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            return d(bArr[0], bArr[1]) ? 1 : -1;
        }
        LogUtil.a("SendDataToDeviceBroadcastReceiver", "tlvDataInfos is null or length is less than 2.");
        return -1;
    }

    private void c(final byte[] bArr, final DeviceInfo deviceInfo) {
        LogUtil.a("SendDataToDeviceBroadcastReceiver", "tlvSyncAccountInfos");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.receiver.SendDataToDeviceBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    LogUtil.e("SendDataToDeviceBroadcastReceiver", "processSyncAccountReport InterruptedException ", e.getMessage());
                }
                lvj.c().c(bArr, deviceInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr) {
        LogUtil.a("SendDataToDeviceBroadcastReceiver", "processSmartAlarmReport enter.");
        lvv lvvVarC = lvv.c(BaseApplication.getContext());
        for (int i = 0; i < 10; i++) {
            if (lug.c() == null) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    LogUtil.e("SendDataToDeviceBroadcastReceiver", "processSmartAlarmReport Exception : ", ExceptionUtils.c(e));
                }
            } else {
                LogUtil.j("SendDataToDeviceBroadcastReceiver", "phoneService binder is not null.");
                if (bArr != null && bArr.length > 2) {
                    byte b2 = bArr[1];
                    LogUtil.a("SendDataToDeviceBroadcastReceiver", "commandId: ", Integer.valueOf(b2));
                    if (b2 == 8) {
                        lvvVarC.d(eeq.e(bArr));
                        return;
                    }
                }
                lvvVarC.a(eeq.e(bArr));
                return;
            }
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.receiver.SendDataToDeviceBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                lvb.e().f();
            }
        });
        if (b(bArr) == 1) {
            c(bArr, deviceInfo);
        } else {
            LogUtil.a("SendDataToDeviceBroadcastReceiver", "tlvDataInfos default");
        }
    }

    private void a() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.receiver.SendDataToDeviceBroadcastReceiver.3
            @Override // java.lang.Runnable
            public void run() {
                lxg.c(BaseApplication.getContext()).h();
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }
}
