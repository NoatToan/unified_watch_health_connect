package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.IReadCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hihealth.IWriteCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearkit.IRealTimeCallback;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class lel {
    public static IRealTimeDataCallback d(final IRealTimeDataCallback iRealTimeDataCallback, final len lenVar, final Context context, final ler lerVar) {
        return new IRealTimeDataCallback.Stub() { // from class: lel.5
            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onResult(int i) {
                try {
                    iRealTimeDataCallback.onResult(i);
                } catch (Exception e) {
                    ReleaseLogUtil.a("HiH_DotProxy", "third party app exception ", LogAnonymous.b(e));
                }
                lenVar.d(context, lerVar.e(i));
            }

            @Override // com.huawei.hihealth.IRealTimeDataCallback
            public void onChange(int i, String str) throws RemoteException {
                lel.b(iRealTimeDataCallback, i, str, context, lerVar);
                if (lck.a(i)) {
                    return;
                }
                lenVar.d(context, lerVar.e(i));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final IRealTimeDataCallback iRealTimeDataCallback, int i, String str, Context context, ler lerVar) throws RemoteException {
        if (let.d(lerVar.c()) >= 8 && i == 0 && "getDeviceList".equals(lerVar.a())) {
            lee.b(context, str, new IRealTimeCallback.Stub() { // from class: lel.2
                @Override // com.huawei.wearkit.IRealTimeCallback
                public void onResult(int i2) {
                    LogUtil.a("DotProxy", "nothing to do");
                }

                @Override // com.huawei.wearkit.IRealTimeCallback
                public void onChange(int i2, String str2) {
                    try {
                        iRealTimeDataCallback.onChange(i2, str2);
                    } catch (Exception e) {
                        ReleaseLogUtil.a("HiH_DotProxy", "third party app exception ", LogAnonymous.b(e));
                    }
                }
            });
            return;
        }
        try {
            iRealTimeDataCallback.onChange(i, str);
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_DotProxy", "third party app exception ", LogAnonymous.b(e));
        }
    }

    public static ICommonCallback d(final ICommonCallback iCommonCallback, final len lenVar, final Context context, final ler lerVar, final String str) {
        return new ICommonCallback.Stub() { // from class: lel.4
            @Override // com.huawei.hihealth.ICommonCallback
            public void onResult(int i, String str2) throws RemoteException {
                iCommonCallback.onResult(i, str2);
                lenVar.d(context, lerVar.e(lee.a(str, i)));
            }
        };
    }

    public static IWriteCallback c(final IWriteCallback iWriteCallback, final len lenVar, final Context context, final ler lerVar, final JSONObject jSONObject) {
        if (iWriteCallback == null) {
            LogUtil.e("DotProxy", "getWriteCallback writeCallback is null");
            return null;
        }
        return new IWriteCallback.Stub() { // from class: lel.1
            @Override // com.huawei.hihealth.IWriteCallback
            public void onResult(int i, String str) throws RemoteException {
                iWriteCallback.onResult(i, str);
                lerVar.e(lck.d(i));
                try {
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 == null) {
                        LogUtil.e("DotProxy", "getWriteCallback infoObject is null");
                        return;
                    }
                    if (jSONObject2.optBoolean("isWriteFile")) {
                        if (new JSONObject(jSONObject.optString("sizeAndFinish")).optBoolean("is_finished")) {
                            if (i == 200 && TextUtils.equals("100", str)) {
                                lenVar.d(context, lerVar);
                                return;
                            } else {
                                if (i != 200) {
                                    lenVar.d(context, lerVar);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    lenVar.d(context, lerVar);
                } catch (JSONException e) {
                    ReleaseLogUtil.a("HiH_DotProxy", "getWriteCallback JSONException", LogAnonymous.b(e));
                    lenVar.d(context, lerVar);
                }
            }
        };
    }

    public static IReadCallback b(final IReadCallback iReadCallback, final len lenVar, final Context context, final ler lerVar) {
        return new IReadCallback.Stub() { // from class: lel.3
            @Override // com.huawei.hihealth.IReadCallback
            public void onResult(int i, String str, byte[] bArr) throws RemoteException {
                iReadCallback.onResult(i, str, bArr);
                lenVar.d(context, lerVar.e(lck.d(i)));
            }
        };
    }
}
