package com.weibo.ssosdk.oaid.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import com.weibo.ssosdk.oaid.repeackage.ext.deviceidservice.IDeviceidInterface;

/* JADX INFO: loaded from: classes18.dex */
class c implements IOAID {
    private final Context a;

    public class a implements OAIDService.RemoteCaller {
        public a() {
        }

        @Override // com.weibo.ssosdk.oaid.impl.OAIDService.RemoteCaller
        public String callRemoteInterface(IBinder iBinder) {
            IDeviceidInterface iDeviceidInterfaceAsInterface = IDeviceidInterface.Stub.asInterface(iBinder);
            if (iDeviceidInterfaceAsInterface == null) {
                throw new OAIDException("IDeviceidInterface is null");
            }
            if (iDeviceidInterfaceAsInterface.isSupport()) {
                return iDeviceidInterfaceAsInterface.getOAID();
            }
            throw new OAIDException("IDeviceidInterface#isSupport return false");
        }
    }

    public c(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        OAIDService.a(this.a, intent, iGetter, new a());
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
