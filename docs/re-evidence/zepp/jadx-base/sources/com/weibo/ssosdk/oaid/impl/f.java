package com.weibo.ssosdk.oaid.impl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;
import com.weibo.ssosdk.oaid.repeackage.ext.openid.IOpenID;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes18.dex */
class f implements IOAID {
    private final Context a;
    private String b;

    public class a implements OAIDService.RemoteCaller {
        public a() {
        }

        @Override // com.weibo.ssosdk.oaid.impl.OAIDService.RemoteCaller
        public String callRemoteInterface(IBinder iBinder) throws RemoteException {
            try {
                return f.this.c(iBinder);
            } catch (RemoteException e) {
                throw e;
            } catch (OAIDException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new OAIDException(e3);
            }
        }
    }

    public f(Context context) {
        if (context instanceof Application) {
            this.a = context;
        } else {
            this.a = context.getApplicationContext();
        }
    }

    private String b(IBinder iBinder, String str, String str2) {
        IOpenID iOpenIDAsInterface = IOpenID.Stub.asInterface(iBinder);
        if (iOpenIDAsInterface != null) {
            return iOpenIDAsInterface.getSerID(str, str2, "OUID");
        }
        throw new OAIDException("IOpenID is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"PackageManagerGetSignatures"})
    public String c(IBinder iBinder) {
        String packageName = this.a.getPackageName();
        String str = this.b;
        if (str != null) {
            return b(iBinder, packageName, str);
        }
        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(this.a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
        }
        String string = sb.toString();
        this.b = string;
        return b(iBinder, packageName, string);
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        OAIDService.a(this.a, intent, iGetter, new a());
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        try {
            return this.a.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
