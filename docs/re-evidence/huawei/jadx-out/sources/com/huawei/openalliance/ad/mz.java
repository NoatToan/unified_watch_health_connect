package com.huawei.openalliance.ad;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.ipc.CallResult;
import java.io.Closeable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class mz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mz f19658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f19659b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Uri f19660c = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/pps/api/call").build();
    private Context d;

    /* JADX WARN: Multi-variable type inference failed */
    public <T> CallResult<T> a(String str, String str2, Class<T> cls) {
        String message;
        boolean zBf;
        CallResult<T> callResult = (CallResult<T>) new CallResult();
        Cursor cursorQuery = null;
        try {
            try {
                Context context = this.d;
                Uri uri = f19660c;
                if (!com.huawei.openalliance.ad.utils.as.b(context, uri)) {
                    hw.c("ApiCallManager", "uri invalid");
                    callResult.setCode(-1);
                    com.huawei.openalliance.ad.utils.df.a((Closeable) null);
                    return callResult;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "3.4.84.300");
                jSONObject.put("content", str2);
                cursorQuery = this.d.getContentResolver().query(uri, null, null, new String[]{str, jSONObject.toString()}, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("code"));
                    callResult.setCode(i);
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("content"));
                    if (hw.a()) {
                        hw.a("ApiCallManager", "call: %s code: %s result: %s", str, Integer.valueOf(i), string);
                    }
                    if (i == 200) {
                        callResult.setData(nd.a(string, cls));
                    } else {
                        callResult.setMsg(string);
                    }
                }
                com.huawei.openalliance.ad.utils.df.a(cursorQuery);
                hw.b("ApiCallManager", "call %s code: %s msg: %s", str, Integer.valueOf(callResult.getCode()), callResult.getMsg());
                if (callResult.getCode() == -100 && (zBf = fp.b(this.d).bf())) {
                    HiAd.a(this.d).a(zBf);
                }
                return callResult;
            } catch (IllegalArgumentException e) {
                hw.c("ApiCallManager", "callRemote IllegalArgumentException");
                callResult.setCode(-1);
                message = e.getMessage();
                callResult.setMsg(message);
            } catch (Throwable th) {
                hw.c("ApiCallManager", "callRemote " + th.getClass().getSimpleName());
                callResult.setCode(-1);
                message = th.getMessage();
                callResult.setMsg(message);
            }
        } catch (Throwable th2) {
            com.huawei.openalliance.ad.utils.df.a((Closeable) null);
            throw th2;
        }
    }

    public static mz a(Context context) {
        mz mzVar;
        synchronized (f19659b) {
            if (f19658a == null) {
                f19658a = new mz(context);
            }
            mzVar = f19658a;
        }
        return mzVar;
    }

    private mz(Context context) {
        this.d = context.getApplicationContext();
    }
}
