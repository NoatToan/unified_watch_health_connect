package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.d;
import b.e;
import c.c;
import com.huawei.harmonyos.interwork.base.ability.IInitCallBack;

/* JADX INFO: loaded from: classes23.dex */
public class dag {
    public static void b(String str, IInitCallBack iInitCallBack) throws IllegalStateException, daf, SecurityException, IllegalArgumentException {
        if (iInitCallBack == null || TextUtils.isEmpty(str)) {
            Log.e("DefKitLib_Device", "unInitDistributedEnvironment param is invalid");
            throw new IllegalArgumentException("invalid param");
        }
        c cVarA = e.a();
        if (cVarA == null) {
            Log.e("DefKitLib_Device", "get getDefInterface failed");
            throw new IllegalStateException("get getDefInterface failed");
        }
        try {
            d dVarB = d.b(str, iInitCallBack);
            if (dVarB == null) {
                Log.e("DefKitLib_Device", "initCallback is not find by the specified callback");
            } else {
                ((cr) cVarA).d(str, dVarB);
            }
        } catch (RemoteException e) {
            Log.e("DefKitLib_Device", "failed to unInit distributed environment with the specified device");
            throw new daf(e.getMessage());
        }
    }

    public static void c(String str, IInitCallBack iInitCallBack) throws IllegalStateException, daf, SecurityException, IllegalArgumentException {
        if (iInitCallBack == null || TextUtils.isEmpty(str)) {
            Log.e("DefKitLib_Device", "initDistributedEnvironment param is invalid");
            throw new IllegalArgumentException("invalid param");
        }
        c cVarA = e.a();
        if (cVarA == null) {
            Log.e("DefKitLib_Device", "get getDefInterface failed");
            throw new IllegalStateException("get getDefInterface failed");
        }
        try {
            ((cr) cVarA).a(str, d.a(str, iInitCallBack));
        } catch (RemoteException e) {
            Log.e("DefKitLib_Device", "failed to init distributed environment with the specified device");
            throw new daf(e.getMessage());
        }
    }
}
