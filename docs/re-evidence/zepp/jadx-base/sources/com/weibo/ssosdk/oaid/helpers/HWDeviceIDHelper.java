package com.weibo.ssosdk.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;
import com.weibo.ssosdk.AppUtils;
import com.weibo.ssosdk.oaid.interfaces.HWIDInterface;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes18.dex */
public class HWDeviceIDHelper {
    private Context a;
    public final LinkedBlockingQueue<IBinder> linkedBlockingQueue = new LinkedBlockingQueue<>(1);
    public ServiceConnection b = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                try {
                    String iDs = new HWIDInterface.HWID(iBinder).getIDs();
                    if (!TextUtils.isEmpty(iDs)) {
                        AppUtils.saveOadi(HWDeviceIDHelper.this.a, AndroidManufacturerUtils.MANUFACTURE_HUAWEI, "oaid", iDs);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                HWDeviceIDHelper.this.a.unbindService(HWDeviceIDHelper.this.b);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public HWDeviceIDHelper(Context context) {
        this.a = context;
    }

    public void getHWID() {
        try {
            this.a.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
        } catch (Exception unused) {
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        this.a.bindService(intent, this.b, 1);
    }
}
