package com.weibo.ssosdk.oaid.helpers;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import com.weibo.ssosdk.AppUtils;
import com.weibo.ssosdk.oaid.interfaces.OppoIDInterface;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes18.dex */
public class OppoDeviceIDHelper {
    private Context a;
    private String b;
    public OppoIDInterface c;
    public String oaid = "OUID";
    public ServiceConnection d = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                OppoDeviceIDHelper.this.c = OppoIDInterface.up.genInterface(iBinder);
                OppoDeviceIDHelper oppoDeviceIDHelper = OppoDeviceIDHelper.this;
                if (oppoDeviceIDHelper.c != null) {
                    AppUtils.saveOadi(OppoDeviceIDHelper.this.a, "OPPO", "ouid", oppoDeviceIDHelper.d("OUID"));
                    AppUtils.saveOadi(OppoDeviceIDHelper.this.a, "OPPO", "duid", OppoDeviceIDHelper.this.d("DUID"));
                    AppUtils.saveOadi(OppoDeviceIDHelper.this.a, "OPPO", "auid", OppoDeviceIDHelper.this.d("AUID"));
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            OppoDeviceIDHelper.this.c = null;
        }
    }

    public OppoDeviceIDHelper(Context context) {
        this.a = context;
    }

    private boolean c() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (packageInfo == null) {
                return false;
            }
            return (Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode) >= 1;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        Signature[] signatureArr;
        String packageName = this.a.getPackageName();
        if (this.b == null) {
            String string = null;
            try {
                signatureArr = this.a.getPackageManager().getPackageInfo(packageName, 64).signatures;
            } catch (Exception e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            this.b = string;
        }
        return ((OppoIDInterface.up.down) this.c).getSerID(packageName, this.b, str);
    }

    public String getID() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
        intent.setAction("android.intent.action.OPEN_ID");
        this.a.bindService(intent, this.d, 1);
        return "";
    }
}
