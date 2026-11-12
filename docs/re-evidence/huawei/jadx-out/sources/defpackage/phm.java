package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginmessagecenter.util.HttpResCallback;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class phm {
    private static void c(HttpResCallback httpResCallback, String str, String str2, String str3) {
        if (httpResCallback != null) {
            httpResCallback.onSucceed(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, String str, String str2, final HttpResCallback httpResCallback) {
        if (c(context, str)) {
            return;
        }
        oet.d().c(str, e(context), str2, String.class, new ResultCallback<String>() { // from class: phm.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str3) {
                LogUtil.a("UIDV_MessagesHttpUtils", "doPost success");
                phm.e(str3, httpResCallback);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("UIDV_MessagesHttpUtils", "doPost fail exception:", ExceptionUtils.c(th));
                phm.e(httpResCallback, -2);
            }
        });
    }

    private static Map<String, String> e(Context context) {
        HashMap map = new HashMap();
        map.put("accept", "*/*");
        map.put(w9.h, "Keep-Alive");
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("charset", "utf-8");
        map.put("x-huid", LoginInit.getInstance(context).getAccountInfo(1011));
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        map.put("Date", String.valueOf(SystemClock.currentThreadTimeMillis()));
        return map;
    }

    private static boolean c(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        LogUtil.a("UIDV_MessagesHttpUtils", "url is null");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, HttpResCallback httpResCallback) {
        a aVarB = b(str);
        if (aVarB != null) {
            if (aVarB.e() == 0) {
                c(httpResCallback, aVarB.d(), aVarB.a(), aVarB.c());
                return;
            } else {
                e(httpResCallback, aVarB.e());
                return;
            }
        }
        LogUtil.e("UIDV_MessagesHttpUtils", "processResult resResult is null");
        e(httpResCallback, -1);
    }

    private static a b(String str) {
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a(Integer.parseInt(!jSONObject.isNull("resultCode") ? jSONObject.getString("resultCode") : ""), !jSONObject.isNull("resultDesc") ? jSONObject.getString("resultDesc") : "", !jSONObject.isNull("moreInfoUrl") ? jSONObject.getString("moreInfoUrl") : !jSONObject.isNull("messages") ? jSONObject.getString("messages") : "", !jSONObject.isNull("revokeMsgIds") ? jSONObject.getString("revokeMsgIds") : "", jSONObject.isNull("latestGetMsgTimestamp") ? "" : jSONObject.getString("latestGetMsgTimestamp"));
            try {
                LogUtil.d("UIDV_MessagesHttpUtils", "resResult = ", aVar.toString());
                return aVar;
            } catch (JSONException unused) {
                LogUtil.e("UIDV_MessagesHttpUtils", "parseResult() ==> JSONException");
                return aVar;
            }
        } catch (JSONException unused2) {
            aVar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(HttpResCallback httpResCallback, int i) {
        if (httpResCallback != null) {
            httpResCallback.onFailed(i);
        }
    }

    public static void a(final Context context, final String str, final String str2, final HttpResCallback httpResCallback) {
        if (TextUtils.isEmpty(str) || !Utils.h()) {
            LogUtil.a("UIDV_MessagesHttpUtils", "NoCloudVersion no doPostReq");
            return;
        }
        if (CommonUtil.ca()) {
            LogUtil.a("UIDV_MessagesHttpUtils", "storeDemo no message center");
            e(httpResCallback, -1);
        } else if (TextUtils.isEmpty(str2)) {
            LogUtil.e("UIDV_MessagesHttpUtils", "params is null");
            e(httpResCallback, -1);
        } else {
            lsy.a(new Runnable() { // from class: phm.2
                @Override // java.lang.Runnable
                public void run() {
                    Context context2 = context;
                    if (context2 != null) {
                        phm.c(context2, str, str2, httpResCallback);
                    }
                }
            });
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f45388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f45389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f45390c;
        private int d;
        private String e;

        a(int i, String str, String str2, String str3, String str4) {
            this.d = i;
            this.f45390c = str;
            this.f45389b = str2;
            this.e = str3;
            this.f45388a = str4;
        }

        public int e() {
            return this.d;
        }

        public String d() {
            return this.f45389b;
        }

        public String a() {
            return this.e;
        }

        public String c() {
            return this.f45388a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("HttpResResult{resultCode=");
            sb.append(this.d);
            sb.append(", resultDesc=");
            sb.append(this.f45390c);
            sb.append(", messages=");
            sb.append(this.f45389b);
            sb.append(", revokeMsgIds=");
            sb.append(this.e);
            sb.append(", latestGetMsgTimestamp");
            sb.append(this.f45388a);
            sb.append('}');
            return sb.toString();
        }
    }
}
