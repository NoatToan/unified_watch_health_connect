package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.controlcenter.featureability.sdk.IAuthCallback;
import com.huawei.controlcenter.featureability.sdk.IConnectCallback;
import com.huawei.controlcenter.featureability.sdk.model.ExtraParams;
import com.huawei.onehop.fasdk.job.PendingRequest;
import com.huawei.onehop.fasdk.job.ResultCallback;
import com.huawei.onehop.fasdk.model.DeviceConnectState;
import com.tencent.open.apireq.BaseResp;

/* JADX INFO: loaded from: classes40.dex */
public class ohd {
    private static ohe d;

    public static boolean b(Context context, final String str, final ResultCallback resultCallback, final IAuthCallback iAuthCallback) {
        if (context == null) {
            Log.e("FAKit: SyncConnect", "authReq: context is null");
            return false;
        }
        if (TextUtils.isEmpty(str) || iAuthCallback == null) {
            Log.e("FAKit: SyncConnect", "authReq: packageName or callback is null");
            return false;
        }
        int iE = e(context, new PendingRequest() { // from class: ohd.3
            @Override // com.huawei.onehop.fasdk.job.PendingRequest
            public void execute() {
                Log.i("FAKit: SyncConnect", "authReq PendingRequest execute");
                boolean zB = ohd.d.b(str, iAuthCallback);
                ResultCallback resultCallback2 = resultCallback;
                if (resultCallback2 != null) {
                    resultCallback2.onResult("auth", zB ? 0 : -1);
                }
            }
        });
        if (iE == 0 || resultCallback == null) {
            return true;
        }
        resultCallback.onResult("auth", iE);
        return true;
    }

    public static int d(String str, IBinder iBinder, ExtraParams extraParams, IConnectCallback iConnectCallback) {
        Log.i("FAKit: SyncConnect", "register start");
        ohe oheVar = d;
        if (oheVar == null) {
            Log.w("FAKit: SyncConnect", "register, sConnector is null");
            return BaseResp.CODE_QQ_LOW_VERSION;
        }
        return oheVar.d(str, iBinder, extraParams, iConnectCallback);
    }

    public static boolean c(int i) {
        Log.i("FAKit: SyncConnect", "unregister start");
        ohe oheVar = d;
        if (oheVar == null) {
            Log.w("FAKit: SyncConnect", "unregister, sConnector is null");
            return false;
        }
        return oheVar.b(i);
    }

    public static boolean c(int i, String str, DeviceConnectState deviceConnectState) {
        Log.i("FAKit: SyncConnect", "updateConnectStatus start");
        ohe oheVar = d;
        if (oheVar == null || deviceConnectState == null) {
            Log.w("FAKit: SyncConnect", "updateConnectStatus, sConnector or state is null");
            return false;
        }
        return oheVar.d(i, str, deviceConnectState.getState());
    }

    public static boolean e(int i, ExtraParams extraParams) {
        Log.i("FAKit: SyncConnect", "showDeviceList start");
        ohe oheVar = d;
        if (oheVar == null) {
            Log.w("FAKit: SyncConnect", "showDeviceList, sConnector is null");
            return false;
        }
        return oheVar.a(i, extraParams);
    }

    private static int e(Context context, PendingRequest pendingRequest) {
        if (d == null) {
            d = ohe.e(context);
        }
        if (!d.b()) {
            return d.e(pendingRequest);
        }
        pendingRequest.execute();
        return 0;
    }
}
