package com.huawei.updatesdk.sdk.service.storekit;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.foundation.utils.h;
import com.huawei.updatesdk.sdk.service.storekit.bean.c;
import com.huawei.updatesdk.sdk.service.storekit.bean.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class b extends AsyncTask<c, Void, d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f29920a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.updatesdk.sdk.service.storekit.bean.a f29922c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f29921b = null;
    private com.huawei.updatesdk.sdk.foundation.https.b d = null;
    private int e = 0;

    public final d c() {
        d dVarA = null;
        do {
            if (this.e > 0 && dVarA != null) {
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "call store error! responseCode:" + dVarA.d() + ", retryTimes:" + this.e);
            }
            dVarA = a();
        } while (c(dVarA));
        this.f29921b = dVarA;
        return dVarA;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "onPostExecute, method:" + this.f29920a.b());
        com.huawei.updatesdk.service.store.b.a().remove(this);
        e();
    }

    public void b() {
        com.huawei.updatesdk.sdk.foundation.https.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
            this.d = null;
        }
    }

    public final void a(Executor executor) {
        executeOnExecutor(executor, this.f29920a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d doInBackground(c... cVarArr) {
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "doInBackground, method:" + this.f29920a.b());
        com.huawei.updatesdk.service.store.b.a((AsyncTask) this);
        d dVarC = c();
        com.huawei.updatesdk.sdk.service.storekit.bean.a aVar = this.f29922c;
        if (aVar != null) {
            aVar.a(this.f29920a, dVarC);
        }
        return dVarC;
    }

    protected d a() {
        d dVarA;
        d dVar = null;
        try {
            dVarA = a.a(this.f29920a.b());
            try {
                if (com.huawei.updatesdk.sdk.foundation.utils.network.a.d(com.huawei.updatesdk.sdk.service.app.a.c().a())) {
                    String strA = this.f29920a.a();
                    String strD = this.f29920a.d();
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "callStore, method:" + this.f29920a.b() + ", url:" + strD + ", body:" + strA);
                    if (c(strA)) {
                        com.huawei.updatesdk.sdk.foundation.a.a("StoreTask", "requestbean field is proguard, please add UpdateSDK proguard rules!");
                    }
                    com.huawei.updatesdk.sdk.foundation.https.b bVar = new com.huawei.updatesdk.sdk.foundation.https.b();
                    this.d = bVar;
                    com.huawei.updatesdk.sdk.foundation.https.b.a aVarA = bVar.a(strD, strA, "UTF-8", d(), com.huawei.updatesdk.sdk.service.app.a.c().a());
                    String strB = aVarA.b();
                    dVarA.a(aVarA.a());
                    com.huawei.updatesdk.sdk.foundation.a.c("StoreTask", "UpdateSDK call store responsecode: " + dVarA.b() + ", xTraceId: " + aVarA.c());
                    if (aVarA.a() / 100 == 5) {
                        dVarA.b(0);
                        return dVarA;
                    }
                    if (b(strB)) {
                        dVarA.b(1);
                        dVarA.a(d.a.JSON_ERROR);
                        d(strB);
                    } else {
                        dVarA = a(strB, dVarA);
                        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "callStore response, method:" + this.f29920a.b() + ", url:" + strD + ", body:" + strA + ", Receive Json msg:" + dVarA.toJson());
                    }
                } else {
                    dVarA.b(3);
                    dVarA.a(d.a.NO_NETWORK);
                }
            } catch (Throwable th) {
                th = th;
                dVar = dVarA;
                a(dVar, th, null);
                dVarA = dVar;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (dVarA != null) {
            return dVarA;
        }
        d dVar2 = new d();
        dVar2.b(5);
        dVar2.a(d.a.PARAM_ERROR);
        return dVar2;
    }

    private void e() {
        a(this.f29921b);
    }

    private void d(String str) {
        com.huawei.updatesdk.sdk.foundation.a.a("StoreTask", TextUtils.isEmpty(str) ? "UpdateSDK response error, resData == null" : "UpdateSDK response error, resData is not json string");
    }

    private String d() {
        String strA = com.huawei.updatesdk.service.store.a.a();
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.c("StoreTask", "UserAgent is: " + strA);
        return TextUtils.isEmpty(strA) ? "Android/1.0" : strA;
    }

    private boolean c(String str) {
        return (str == null || str.contains("emuiApiLevel") || str.contains("ts") || str.contains("harmonyApiLevel")) ? false : true;
    }

    private boolean c(d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.d() != 1 && dVar.d() != 2) {
            return false;
        }
        int i = this.e;
        this.e = i + 1;
        if (i >= 3) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "retry completed total times = " + this.e + ",response.responseCode = " + dVar.d());
            return false;
        }
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "retry times = " + this.e + ",response.responseCode = " + dVar.d());
        return true;
    }

    private boolean b(String str) {
        return TextUtils.isEmpty(str) || !h.d(str);
    }

    private boolean a(String str) {
        try {
            return Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)").matcher(str).find();
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.a.b("StoreTask", "is contain ip error: " + e.getMessage());
            return true;
        }
    }

    private void a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder("invoke store error, exceptionType:");
        String string = th.toString();
        if (a(th.toString())) {
            string = th.getClass().getName();
        }
        sb.append(string);
        sb.append(", url:");
        sb.append(str);
        sb.append(", method:");
        sb.append(this.f29920a.b());
        sb.append(", retryTimes:");
        sb.append(this.e);
        String string2 = sb.toString();
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", string2, th);
        com.huawei.updatesdk.sdk.foundation.a.a("StoreTask", "UpdateSDK call store error: " + string2);
    }

    private void a(d dVar, Throwable th, String str) {
        d.a aVar;
        int i = 1;
        if (th instanceof ConnectException) {
            aVar = d.a.CONNECT_EXCEPTION;
        } else if ((th instanceof SocketTimeoutException) || (th.getMessage() != null && th.getMessage().contains("ConnectTimeoutException"))) {
            aVar = d.a.CONNECT_EXCEPTION;
            i = 2;
        } else if (th instanceof IllegalArgumentException) {
            aVar = d.a.PARAM_ERROR;
            i = 5;
        } else if (th instanceof IllegalAccessException) {
            aVar = d.a.UNKNOWN_EXCEPTION;
        } else {
            if (!(th instanceof ArrayIndexOutOfBoundsException)) {
                if ((th instanceof InterruptedException) || (th instanceof InterruptedIOException)) {
                    a(dVar, 0, d.a.NORMAL, th);
                    com.huawei.updatesdk.sdk.foundation.a.a("StoreTask", "UpdateSDK task is canceled");
                } else if (th instanceof IOException) {
                    aVar = d.a.IO_EXCEPTION;
                } else if (dVar != null) {
                    dVar.a(th.toString());
                }
                a(str, th);
            }
            aVar = d.a.NO_PROGUARD;
            i = 6;
        }
        a(dVar, i, aVar, th);
        a(str, th);
    }

    private void a(d dVar, int i, d.a aVar, Throwable th) {
        if (dVar != null) {
            dVar.b(i);
            dVar.a(aVar);
            String string = th.toString();
            if (a(th.toString())) {
                string = th.getClass().getName();
            }
            dVar.a(string);
        }
    }

    private void a(d dVar) {
        StringBuilder sb;
        d.a aVar;
        if (isCancelled() || this.f29922c == null) {
            return;
        }
        if (dVar == null) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("StoreTask", "notifyResult, response is null");
            try {
                dVar = a.a(this.f29920a.b());
            } catch (IllegalAccessException e) {
                e = e;
                sb = new StringBuilder("notifyResult, create response error, method:");
                sb.append(this.f29920a.b());
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", sb.toString(), e);
            } catch (InstantiationException e2) {
                e = e2;
                sb = new StringBuilder("notifyResult, create response error, method:");
                sb.append(this.f29920a.b());
                com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", sb.toString(), e);
            }
            if (dVar == null) {
                dVar = new d();
                aVar = d.a.PARAM_ERROR;
            } else {
                aVar = d.a.UNKNOWN_EXCEPTION;
            }
            dVar.a(aVar);
            dVar.b(1);
        }
        this.f29922c.b(this.f29920a, dVar);
    }

    private d a(String str, d dVar) {
        try {
            dVar.fromJson(new JSONObject(str));
            dVar.b(0);
            return dVar;
        } catch (Exception e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("StoreTask", "parse json error", e);
            return dVar;
        }
    }

    public b(c cVar, com.huawei.updatesdk.sdk.service.storekit.bean.a aVar) {
        this.f29920a = cVar;
        this.f29922c = aVar;
    }
}
