package com.huami.widget.share;

import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.apache.http.Header;
import org.apache.http.entity.FileEntity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ShareMifitCircleApi {
    private static final String a = "v1/soc/post/xmyd";
    private static final String b = "v1/soc/post/xmyd/image";
    private static final String c = "ShareMifitCircleApi";
    private static final int d = 1;
    private static final int e = 309;
    private static final int f = 311;
    private static ApiListener g;

    public interface ApiListener {
        void onFailed(int i, String str);

        void onSuccess(String str, String str2);
    }

    public class a extends IHMSimpleHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ File b;

        public a(String str, File file) {
            this.a = str;
            this.b = file;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(String str) {
            return "onFail resp==" + str;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            ShareMifitCircleApi.e(i, "");
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() != null) {
                final String str = new String(hMHttpResponseData.getResponseBody());
                HMLog.error(ShareMifitCircleApi.c, new Function0() { // from class: com.huami.widget.share.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareMifitCircleApi.a.b(str);
                    }
                });
                ShareMifitCircleApi.e(311, "");
            }
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            try {
                JSONObject jSONObject = new JSONObject(webResponse.data);
                ShareMifitCircleApi.i(this.a, jSONObject.optString("putURI"), jSONObject.optString("getURI"), this.b);
            } catch (JSONException e) {
                e.printStackTrace();
                ShareMifitCircleApi.e(311, "");
            }
        }
    }

    public class b extends AsyncHttpResponseHandler {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(int i) {
            return "uploadFile fail：" + i;
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onFailure(final int i, Header[] headerArr, byte[] bArr, Throwable th) {
            HMLog.error(ShareMifitCircleApi.c, new Function0() { // from class: com.huami.widget.share.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMifitCircleApi.b.b(i);
                }
            });
            ShareMifitCircleApi.e(i, "");
        }

        @Override // com.loopj.android.http.AsyncHttpResponseHandler
        public void onSuccess(int i, Header[] headerArr, byte[] bArr) {
            if (i == 200) {
                ShareMifitCircleApi.g(this.a, this.b);
            }
        }
    }

    public class c extends IHMSimpleHttpResponseHandler {
        private void b(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("code");
                String strOptString = jSONObject.optString("message");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                int iOptInt2 = jSONObjectOptJSONObject.optInt("code");
                if (iOptInt != 1) {
                    ShareMifitCircleApi.e(iOptInt, strOptString);
                } else if (iOptInt2 == 0) {
                    ShareMifitCircleApi.f(jSONObjectOptJSONObject.toString(), jSONObjectOptJSONObject.optString("postID"));
                } else {
                    ShareMifitCircleApi.e(iOptInt2, strOptString);
                }
            } catch (JSONException e) {
                ShareMifitCircleApi.e(309, str);
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(String str) {
            return "onFail resp==" + str;
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler, com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            ShareMifitCircleApi.e(i, "");
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onFailure(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.getResponseBody() == null) {
                ShareMifitCircleApi.e(311, "");
                return;
            }
            final String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.error(ShareMifitCircleApi.c, new Function0() { // from class: com.huami.widget.share.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareMifitCircleApi.c.c(str);
                }
            });
            b(str);
        }

        @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
        public void onSuccess(WebResponse webResponse, HMHttpResponseData hMHttpResponseData) {
            b(new String(hMHttpResponseData.getResponseBody()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i, String str) {
        ApiListener apiListener = g;
        if (apiListener != null) {
            apiListener.onFailed(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str, String str2) {
        ApiListener apiListener = g;
        if (apiListener != null) {
            apiListener.onSuccess(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(String str, String str2) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("content", str);
        systemParams.put("image", str2);
        HMWebUtil.doRequest(HMServerDef.getUrl(a), systemParams, Support.RequestSupport.POST, new c());
    }

    private static void h(String str, String str2) {
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        File file = new File(str2);
        systemParams.put("fileName", file.getName());
        HMWebUtil.doRequest(HMServerDef.getUrl(b), systemParams, Support.RequestSupport.POST, new a(str, file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(String str, String str2, String str3, File file) {
        new AsyncHttpClient().put(null, str2, new FileEntity(file, null), null, new b(str, str3));
    }

    public static void shareToMifitCircle(String str, String str2, ApiListener apiListener) {
        g = apiListener;
        h(str2, str);
    }
}
