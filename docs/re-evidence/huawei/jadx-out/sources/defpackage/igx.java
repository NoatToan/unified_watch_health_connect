package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes9.dex */
public class igx {
    private static final igx e = new igx();
    private final ParamsFactory d = new igq();

    private igx() {
    }

    public static igx e() {
        return e;
    }

    public void d(final IRequest iRequest, final ResponseCallback<String> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: igw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37609c.a(iRequest, responseCallback);
                }
            });
        } else {
            b(iRequest, null, null, responseCallback);
        }
    }

    /* synthetic */ void a(IRequest iRequest, ResponseCallback responseCallback) {
        b(iRequest, "", "", responseCallback);
    }

    public void e(final String str, final String str2, final ResponseCallback<String> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: igt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(str, str2, responseCallback);
                }
            });
        } else {
            b(null, str, str2, responseCallback);
        }
    }

    /* synthetic */ void c(String str, String str2, ResponseCallback responseCallback) {
        b(null, str, str2, responseCallback);
    }

    public void e(final Map<String, String> map, final String str, final ResponseCallback<String> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: igv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(map, str, responseCallback);
                }
            });
        } else {
            b(map, str, responseCallback);
        }
    }

    private void b(IRequest iRequest, String str, String str2, final ResponseCallback<String> responseCallback) {
        if (iRequest != null) {
            str2 = iRequest.getUrl();
        }
        Map<String, String> headers = this.d.getHeaders();
        Map<String, Object> body = this.d.getBody(iRequest);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(str)) {
            str = ofe.c(body);
        }
        LogUtil.a("TaskPlatform_CloudManager", "url: ", str2, ", headers: ", headers, ", bodyMap: ", str);
        final String str3 = str2;
        oet.d().c(str2, headers, str, String.class, new ResultCallback<String>() { // from class: igx.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str4) {
                responseCallback.onResponse(0, str4);
                igx.this.a(str3, jElapsedRealtime, str4);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "callHttpPost onFailure : ", ExceptionUtils.c(th));
                igx.this.d(str3, th, (ResponseCallback<String>) responseCallback, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Map<String, String> map, final String str, final ResponseCallback<String> responseCallback) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> headers = this.d.getHeaders();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.a("TaskPlatform_CloudManager", "url: ", str, ", headers: ", headers, ", queryParams: ", map);
        oet.d().e(str, headers, map, String.class, new ResultCallback<String>() { // from class: igx.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str2) {
                responseCallback.onResponse(0, str2);
                igx.this.a(str, jElapsedRealtime, str2);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "commonGet !useCache onFailure : " + th.toString());
                igx.this.d(str, th, (ResponseCallback<String>) responseCallback, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[PHI: r0
      0x004e: PHI (r0v14 int) = (r0v11 int), (r0v12 int) binds: [B:22:0x004c, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(String str, Throwable th, ResponseCallback<String> responseCallback, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iE = 9999;
        if (th instanceof Exception) {
            Exception exc = (Exception) th;
            if ((exc instanceof SocketTimeoutException) || ((exc instanceof SSLException) && TextUtils.equals(exc.getMessage(), "Connection timed out"))) {
                iE = 1003;
            } else if ((exc instanceof ConnectException) || (exc instanceof UnknownHostException)) {
                iE = -8;
            } else if ((exc instanceof IOException) && TextUtils.equals(exc.getMessage(), "Canceled")) {
                iE = -2;
            } else {
                int i = 500;
                if (ResultUtil.c(500).equals(exc.getMessage())) {
                    iE = i;
                } else {
                    i = 503;
                    if (ResultUtil.c(503).equals(exc.getMessage())) {
                        iE = i;
                    } else if (exc instanceof oeu) {
                        iE = ((oeu) exc).e();
                    } else {
                        ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "onFailure, unknow exception");
                    }
                }
            }
            ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "onFailure ", Integer.valueOf(iE), ":", ResultUtil.c(iE));
            responseCallback.onResponse(iE, ResultUtil.c(iE));
        } else {
            String message = th.getMessage() != null ? th.getMessage() : ResultUtil.c(9999);
            ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "onFailure, throwable = ", message);
            responseCallback.onResponse(9999, message);
        }
        d(str, iE, j, jElapsedRealtime);
    }

    private void d(String str, int i, long j, long j2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("status", "1");
        linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j2 - j));
        linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
        linkedHashMap.put(OpAnalyticsConstants.URL_HEADER, str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TASK_PLATFORM_2129050.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, String str2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qet qetVar = (qet) HiJsonUtil.d(str2, qet.class);
        if (qetVar == null || qetVar.e() == 0) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("status", "0");
        linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(jElapsedRealtime - j));
        linkedHashMap.put("resultCode", String.valueOf(qetVar.e()));
        linkedHashMap.put(OpAnalyticsConstants.RESULT_DESCRIBE, qetVar.a());
        linkedHashMap.put(OpAnalyticsConstants.URL_HEADER, str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_TASK_PLATFORM_2129050.value(), linkedHashMap);
        ReleaseLogUtil.a("R_TaskPlatform_CloudManager", "setSuccessBi with ", qetVar);
    }
}
