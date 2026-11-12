package com.weibo.ssosdk.oaid.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import com.weibo.ssosdk.oaid.repeackage.ext.SupplementaryDID.IDidAidlInterface;

/* JADX INFO: loaded from: classes18.dex */
class a implements IOAID {
    private final Context a;

    /* JADX INFO: renamed from: com.weibo.ssosdk.oaid.impl.a$a, reason: collision with other inner class name */
    public class C0764a implements OAIDService.RemoteCaller {
        public C0764a() {
        }

        @Override // com.weibo.ssosdk.oaid.impl.OAIDService.RemoteCaller
        public String callRemoteInterface(IBinder iBinder) {
            IDidAidlInterface iDidAidlInterfaceAsInterface = IDidAidlInterface.Stub.asInterface(iBinder);
            if (iDidAidlInterfaceAsInterface == null) {
                throw new OAIDException("IDidAidlInterface is null");
            }
            if (iDidAidlInterfaceAsInterface.isSupport()) {
                return iDidAidlInterfaceAsInterface.getOAID();
            }
            throw new OAIDException("IDidAidlInterface#isSupport return false");
        }
    }

    public a(Context context) {
        this.a = context;
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
        intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
        OAIDService.a(this.a, intent, iGetter, new C0764a());
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
