package com.huawei.watchface;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.base.common.MediaType;
import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.network.CommonService;
import com.huawei.watchface.videoedit.sysc.Consumer;
import com.huawei.watchface.videoedit.sysc.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile CommonService f30672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile RestClient f30673c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30671a = false;
    public boolean d = false;

    public class a extends NetworkKit.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f30674a;

        public a(long j) {
            this.f30674a = j;
        }

        @Override // com.huawei.hms.network.NetworkKit.Callback
        public void onResult(boolean z) {
            y2 y2Var = y2.this;
            y2Var.f30671a = z;
            y2Var.d = !z;
            HwLog.i("NetworkKitClient", "init time:" + (SystemClock.elapsedRealtime() - this.f30674a) + ",result:" + z);
            y2 y2Var2 = y2.this;
            if (y2Var2.f30671a) {
                y2Var2.e();
            }
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y2 f30676a = new y2();
    }

    public static y2 b() {
        return b.f30676a;
    }

    public CommonService a() {
        RestClient restClientC;
        if (this.f30672b == null) {
            synchronized (y2.class) {
                if (this.f30672b == null && (restClientC = c()) != null) {
                    this.f30672b = (CommonService) restClientC.create(CommonService.class);
                }
            }
        }
        return this.f30672b;
    }

    public RestClient c() {
        if (this.f30673c == null) {
            synchronized (y2.class) {
                d();
            }
        }
        return this.f30673c;
    }

    public void d() {
        if (this.f30671a) {
            HwLog.i("NetworkKitClient", "isInit");
            return;
        }
        try {
            NetworkKit.init(Environment.getApplicationContext(), new a(SystemClock.elapsedRealtime()));
            this.f30673c = new RestClient.Builder().httpClient(new HttpClient.Builder().addNetworkInterceptor((Interceptor) new f0()).build()).build();
        } catch (Exception e) {
            HwLog.e("NetworkKitClient", "init error : " + HwLog.printException(e));
            this.d = true;
        } catch (NoClassDefFoundError e2) {
            HwLog.e("NetworkKitClient", "init NoClassDefFoundError: " + HwLog.printException((Error) e2));
            this.d = true;
        } catch (VerifyError e3) {
            HwLog.e("NetworkKitClient", "init VerifyError: " + HwLog.printException((Error) e3));
            this.d = true;
        }
    }

    public final void e() {
        boolean zB = NewSystemParamManager.b(SystemParamNames.CLIENT_WATCHFACE_NETWORK_CONFIG_IPV6, "1", true);
        HwLog.i("NetworkKitClient", "setNetworkKitOptions ipv6 enable:" + zB);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("enable_ipv6_preferred", String.valueOf(zB));
        } catch (Exception e) {
            HwLog.e("NetworkKitClient", "setNetworkKit error : " + HwLog.printException(e));
        }
        NetworkKit.getInstance().setOptions(jSONObject.toString());
        NetworkKit.getInstance().initConnectionPool(100, 120L, TimeUnit.SECONDS);
    }

    public final void f() {
        final Activity activity = WebViewActivity.getActivity();
        if (activity == null || !(activity instanceof WebViewActivity)) {
            return;
        }
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.y2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ((WebViewActivity) activity).showNoNetworkPage();
            }
        });
    }

    public final void b(String str) {
        if (!CommonUtils.x()) {
            HwLog.i("NetworkKitClient", "showExceptionPage is not foreground");
        } else if (CommonUtils.C()) {
            a(str);
        } else {
            f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025 A[Catch: Exception -> 0x0037, TryCatch #0 {Exception -> 0x0037, blocks: (B:7:0x0016, B:8:0x001b, B:10:0x0025, B:11:0x002e), top: B:21:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x002e A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:7:0x0016, B:8:0x001b, B:10:0x0025, B:11:0x002e), top: B:21:0x0016 }] */
    public h5 a(String str, String str2, LinkedHashMap linkedHashMap, String str3, i iVar) {
        Response<String> responseExecute;
        RequestBody requestBodyA;
        final h5 h5Var = new h5();
        h5Var.b(str);
        CommonService commonServiceA = a();
        if (!this.d && commonServiceA != null) {
            if (linkedHashMap == null) {
                try {
                    linkedHashMap = new LinkedHashMap();
                    requestBodyA = a(linkedHashMap, str2);
                    if (TextUtils.isEmpty(str3)) {
                        responseExecute = commonServiceA.post(str, linkedHashMap, requestBodyA).execute();
                    } else {
                        responseExecute = commonServiceA.post(str, linkedHashMap, requestBodyA, str3).execute();
                    }
                } catch (Exception e) {
                    HwLog.e("NetworkKitClient", "postRequest commonService request Exception =" + HwLog.printException(e));
                    iVar.d(CommonUtils.a((Throwable) e));
                    b(str);
                    responseExecute = null;
                }
            } else {
                requestBodyA = a(linkedHashMap, str2);
                if (TextUtils.isEmpty(str3)) {
                    responseExecute = commonServiceA.post(str, linkedHashMap, requestBodyA).execute();
                } else {
                    responseExecute = commonServiceA.post(str, linkedHashMap, requestBodyA, str3).execute();
                }
            }
            if (responseExecute == null) {
                HwLog.e("NetworkKitClient", "postRequest response is null");
            }
            Optional.ofNullable(responseExecute).ifPresent(new Consumer() { // from class: com.huawei.watchface.y2$$ExternalSyntheticLambda1
                @Override // com.huawei.watchface.videoedit.sysc.Consumer
                public final void accept(Object obj) {
                    y2.a(h5Var, (Response) obj);
                }
            });
            return h5Var;
        }
        String strB = WatchFaceHttpUtil.b(str, str2, linkedHashMap);
        iVar.d("doPostHttpsURLConnection");
        h5Var.a(strB);
        return h5Var;
    }

    public static /* synthetic */ void a(h5 h5Var, Response response) {
        h5Var.a(response.getHeaders());
        h5Var.a(response.getCode());
        h5Var.a((String) response.getBody());
        HwLog.i("NetworkKitClient", "postRequest Response code =" + h5Var.a());
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("NetworkKitClient", "showErrorPage url is empty");
            return;
        }
        if (!str.contains(WatchFaceHttpUtil.D()) && !str.contains(WatchFaceHttpUtil.q())) {
            HwLog.i("NetworkKitClient", "showErrorPage url is not sign or online state");
            return;
        }
        final Activity activity = WebViewActivity.getActivity();
        if (activity == null || !(activity instanceof WebViewActivity)) {
            return;
        }
        BackgroundTaskUtils.postInMainThread(new Runnable() { // from class: com.huawei.watchface.y2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ((WebViewActivity) activity).showWatchFaceNetworkRetryPage();
            }
        });
    }

    public final RequestBody a(LinkedHashMap linkedHashMap, String str) {
        String strA = q2.a((Map) linkedHashMap, "Content-Type");
        if (TextUtils.isEmpty(strA)) {
            return RequestBodyProviders.create(MediaType.parse("application/json"), str);
        }
        if (strA.contains("application/x-www-form-urlencoded")) {
            return RequestBodyProviders.create(MediaType.parse("application/x-www-form-urlencoded"), str);
        }
        return RequestBodyProviders.create(MediaType.parse("application/json"), str);
    }
}
