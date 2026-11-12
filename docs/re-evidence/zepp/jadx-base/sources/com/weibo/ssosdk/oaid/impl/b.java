package com.weibo.ssosdk.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import com.weibo.ssosdk.oaid.repeackage.ext.aidl.OpenDeviceIdentifierService;

/* JADX INFO: loaded from: classes18.dex */
class b implements IOAID {
    private final Context a;
    private String b;

    public class a implements OAIDService.RemoteCaller {
        public a() {
        }

        @Override // com.weibo.ssosdk.oaid.impl.OAIDService.RemoteCaller
        public String callRemoteInterface(IBinder iBinder) {
            OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(iBinder);
            if (openDeviceIdentifierServiceAsInterface.isOaidTrackLimited()) {
                throw new OAIDException("User has disabled advertising identifier");
            }
            return openDeviceIdentifierServiceAsInterface.getOaid();
        }
    }

    public b(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                String string = Settings.Global.getString(this.a.getContentResolver(), "pps_oaid");
                if (!TextUtils.isEmpty(string)) {
                    iGetter.onOAIDGetComplete(string);
                    return;
                }
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(this.b) && !supported()) {
            iGetter.onOAIDGetError(new OAIDException("Huawei Advertising ID not available"));
            return;
        }
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage(this.b);
        OAIDService.a(this.a, intent, iGetter, new a());
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        boolean z = true;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager.getPackageInfo("com.huawei.hwid", 0) != null) {
                this.b = "com.huawei.hwid";
            } else if (packageManager.getPackageInfo("com.huawei.hwid.tv", 0) != null) {
                this.b = "com.huawei.hwid.tv";
            } else {
                this.b = "com.huawei.hms";
                z = packageManager.getPackageInfo("com.huawei.hms", 0) != null ? false : false;
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
