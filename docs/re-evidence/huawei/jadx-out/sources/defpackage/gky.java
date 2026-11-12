package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sport.utils.ResultUtil;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gky {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gky f35447a = new gky();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ParamsFactory f35448b = new gkw();

    private gky() {
    }

    public static gky c() {
        return f35447a;
    }

    public void a(IRequest iRequest, DataCallback dataCallback) {
        c(iRequest, null, null, false, dataCallback);
    }

    public void c(IRequest iRequest, boolean z, DataCallback dataCallback) {
        c(iRequest, null, null, z, dataCallback);
    }

    public void b(Object obj, String str, DataCallback dataCallback) {
        c(null, obj, str, false, dataCallback);
    }

    public void a(Object obj, String str, boolean z, DataCallback dataCallback) {
        c(null, obj, str, z, dataCallback);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void c(IRequest iRequest, Object obj, String str, boolean z, final DataCallback dataCallback) {
        Object obj2;
        if (iRequest != null) {
            str = iRequest.getUrl();
            obj2 = iRequest;
        } else {
            obj2 = obj;
        }
        Map<String, String> headers = this.f35448b.getHeaders();
        Map<String, Object> body = this.f35448b.getBody(obj2);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.a("Suggestion_CloudHelper", "url: ", str, ", headers: ", headers.toString(), ", bodyMap: ", body.toString());
        if (!z) {
            try {
                oet.d().c(str, headers, ofe.c(body), String.class, new ResultCallback<String>() { // from class: gky.2
                    @Override // com.huawei.networkclient.ResultCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str2) {
                        gky.this.a(str2, dataCallback, jElapsedRealtime);
                    }

                    @Override // com.huawei.networkclient.ResultCallback
                    public void onFailure(Throwable th) {
                        LogUtil.e("Suggestion_CloudHelper", "callHttpPost !useCache onFailure : " + th.toString());
                        gky.this.d(th, dataCallback, jElapsedRealtime);
                    }
                });
                return;
            } catch (NullPointerException e) {
                d(e, dataCallback, jElapsedRealtime);
                return;
            }
        }
        String strC = ofe.c(obj2);
        String strB = lsp.b(BaseApplication.b(), str + strC);
        LogUtil.a("Suggestion_CloudHelper", str, "md5 = ", strB);
        oet.d().b(str, headers, ofe.c(body), String.class, new ResultCallback<ofg<String>>() { // from class: gky.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ofg<String> ofgVar) {
                LogUtil.d("Suggestion_CloudHelper", "source from = ", Integer.valueOf(ofgVar.d()));
                gky.this.a(ofgVar.c(), dataCallback, jElapsedRealtime);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Suggestion_CloudHelper", "callHttpPost useCache onFailure : " + th.toString());
                gky.this.d(th, dataCallback, jElapsedRealtime);
            }
        }, new gkx().e(strB));
    }

    public void a(String str, DataCallback dataCallback, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (TextUtils.isEmpty(jSONObject.toString())) {
                ReleaseLogUtil.a("Suggestion_CloudHelper", "onResponse, response data is empty");
                dataCallback.onFailure(9999, ResultUtil.c(9999));
            } else {
                int iOptInt = jSONObject.optInt("resultCode");
                String strOptString = jSONObject.optString("resultDesc");
                if (iOptInt != 0 && iOptInt != 20004) {
                    ReleaseLogUtil.a("Suggestion_CloudHelper", "onResponse, onFailure ", Integer.valueOf(iOptInt), ":", strOptString);
                    dataCallback.onFailure(iOptInt, strOptString);
                } else {
                    dataCallback.onSuccess(jSONObject);
                }
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("Suggestion_CloudHelper", "onResponse, JSONException");
            LogUtil.a("Suggestion_CloudHelper", "onResponse JSONException json=", str);
            dataCallback.onFailure(-5, ResultUtil.c(-5));
        }
        c(j, jElapsedRealtime);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e A[PHI: r0
      0x004e: PHI (r0v14 int) = (r0v11 int), (r0v12 int) binds: [B:22:0x004c, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(Throwable th, DataCallback dataCallback, long j) {
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
                        ReleaseLogUtil.a("Suggestion_CloudHelper", "onFailure, unknow exception");
                    }
                }
            }
            ReleaseLogUtil.a("Suggestion_CloudHelper", "onFailure ", Integer.valueOf(iE), ":", ResultUtil.c(iE));
            dataCallback.onFailure(iE, ResultUtil.c(iE));
        } else {
            String message = th.getMessage() != null ? th.getMessage() : ResultUtil.c(9999);
            LogUtil.e("Suggestion_CloudHelper", "onFailure, throwable = ", message);
            dataCallback.onFailure(9999, message);
        }
        e(iE, j, jElapsedRealtime);
    }

    private void e(int i, long j, long j2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("module", "3");
        linkedHashMap.put("status", "1");
        linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j2 - j));
        linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
    }

    private void c(long j, long j2) {
        long j3 = j2 - j;
        if (j3 >= 5000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
            linkedHashMap.put("module", "3");
            linkedHashMap.put("status", "0");
            linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(j3));
            linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(200));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
        }
    }

    public void c(Map<String, String> map, String str, DataCallback dataCallback) {
        e(map, str, false, dataCallback);
    }

    private void e(Map<String, String> map, String str, boolean z, final DataCallback dataCallback) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        Map<String, String> headers = this.f35448b.getHeaders();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.a("Suggestion_CloudHelper", "url: ", str, ", headers: ", headers.toString(), ", queryParams: ", map2.toString());
        if (!z) {
            oet.d().e(str, headers, map2, String.class, new ResultCallback<String>() { // from class: gky.5
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str2) {
                    gky.this.a(str2, dataCallback, jElapsedRealtime);
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.e("Suggestion_CloudHelper", "commonGet !useCache onFailure : " + th.toString());
                    gky.this.d(th, dataCallback, jElapsedRealtime);
                }
            });
            return;
        }
        String strC = ofe.c((Object) map2);
        String strB = lsp.b(BaseApplication.b(), str + strC);
        LogUtil.a("Suggestion_CloudHelper", str, "md5 = ", strB);
        oet.d().d(str, headers, map2, String.class, new ResultCallback<ofg<String>>() { // from class: gky.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ofg<String> ofgVar) {
                gky.this.a(ofgVar.c(), dataCallback, jElapsedRealtime);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("Suggestion_CloudHelper", "commonGet useCache onFailure : " + th.toString());
                gky.this.d(th, dataCallback, jElapsedRealtime);
            }
        }, new gkx().e(strB));
    }
}
