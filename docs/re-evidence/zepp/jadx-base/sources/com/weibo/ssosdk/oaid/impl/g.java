package com.weibo.ssosdk.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import com.weibo.ssosdk.oaid.repeackage.ext.deviceidservice.IDeviceIdService;

/* JADX INFO: loaded from: classes18.dex */
class g implements IOAID {
    private final Context a;

    public class a implements OAIDService.RemoteCaller {
        public a() {
        }

        @Override // com.weibo.ssosdk.oaid.impl.OAIDService.RemoteCaller
        public String callRemoteInterface(IBinder iBinder) {
            IDeviceIdService iDeviceIdServiceAsInterface = IDeviceIdService.Stub.asInterface(iBinder);
            if (iDeviceIdServiceAsInterface != null) {
                return iDeviceIdServiceAsInterface.getOAID();
            }
            throw new OAIDException("IDeviceIdService is null");
        }
    }

    public g(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        OAIDService.a(this.a, intent, iGetter, new a());
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
