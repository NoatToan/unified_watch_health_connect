package com.tencent.connect.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import com.tencent.open.TDialog;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.f;
import com.tencent.open.utils.g;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IRequestListener;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public abstract class BaseApi {
    public static String businessId = null;
    public static String installChannel = null;
    public static boolean isOEM = false;
    public static String registerChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f30927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QQToken f30928c;

    public void releaseResource() {
    }

    public BaseApi(c cVar, QQToken qQToken) {
        this.f30927b = cVar;
        this.f30928c = qQToken;
    }

    public BaseApi(QQToken qQToken) {
        this(null, qQToken);
    }

    protected Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", f.a().c(g.a()));
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        QQToken qQToken = this.f30928c;
        if (qQToken != null && qQToken.isSessionValid()) {
            bundle.putString(Constants.PARAM_ACCESS_TOKEN, this.f30928c.getAccessToken());
            bundle.putString("oauth_consumer_key", this.f30928c.getAppId());
            bundle.putString("openid", this.f30928c.getOpenId());
        }
        SharedPreferences sharedPreferences = g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-android-" + registerChannel + com.huawei.openalliance.ad.constant.Constants.LINK + businessId);
            return bundle;
        }
        bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
        return bundle;
    }

    public String a(String str) {
        Bundle bundleA = a();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty(str)) {
            bundleA.putString("need_version", str);
        }
        sb.append(HttpUtils.encodeUrl(bundleA));
        return sb.toString();
    }

    protected void a(StringBuilder sb, Activity activity) {
        if (sb.indexOf("?") < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(Constants.JumpUrlConstants.URL_KEY_SRC);
        sb.append("=");
        sb.append("app");
        String appId = this.f30928c.getAppId();
        String openId = this.f30928c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            a(sb, "app_id", appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            a(sb, Constants.JumpUrlConstants.URL_KEY_OPENID, m.k(openId));
        }
        String strA = m.a(activity);
        if (!TextUtils.isEmpty(strA)) {
            if (strA.length() > 20) {
                strA = strA.substring(0, 20) + "...";
            }
            a(sb, "app_name", m.k(strA));
        }
        a(sb, "sdk_version", m.k(Constants.SDK_VERSION));
    }

    protected void a(StringBuilder sb, String str, String str2) {
        sb.append("&");
        sb.append(str);
        sb.append("=");
        sb.append(m.f(str2));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("appid", this.f30928c.getAppId());
        if (this.f30928c.isSessionValid()) {
            bundle.putString(Constants.PARAM_KEY_STR, this.f30928c.getAccessToken());
            bundle.putString(Constants.PARAM_KEY_TYPE, "0x80");
        }
        String openId = this.f30928c.getOpenId();
        if (openId != null) {
            bundle.putString("hopenid", openId);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = g.a().getSharedPreferences(Constants.PREFERENCE_PF, 0);
        if (isOEM) {
            bundle.putString(Constants.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-android-" + registerChannel + com.huawei.openalliance.ad.constant.Constants.LINK + businessId);
        } else {
            bundle.putString(Constants.PARAM_PLATFORM_ID, sharedPreferences.getString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF));
            bundle.putString(Constants.PARAM_PLATFORM_ID, Constants.DEFAULT_PF);
        }
        bundle.putString("sdkv", Constants.SDK_VERSION);
        bundle.putString("sdkp", "a");
        return bundle;
    }

    private Intent a(Activity activity, Intent intent, Map<String, Object> map, int i) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        a(activity, intent2, intent, i);
        if (map != null) {
            try {
                if (map.containsKey(Constants.KEY_RESTORE_LANDSCAPE)) {
                    intent2.putExtra(Constants.KEY_RESTORE_LANDSCAPE, ((Boolean) map.get(Constants.KEY_RESTORE_LANDSCAPE)).booleanValue());
                    return intent2;
                }
            } catch (Exception e) {
                SLog.e("openSDK_LOG.BaseApi", "Exception", e);
            }
        }
        return intent2;
    }

    public void a(Activity activity, int i, Intent intent, boolean z) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        if (z) {
            intent2.putExtra("is_qq_mobile_share", true);
        }
        a(activity, intent2, intent, i);
        try {
            activity.startActivityForResult(intent2, i);
        } catch (Exception e) {
            SLog.e("openSDK_LOG.BaseApi", "startAssistActivity exception", e);
        }
    }

    protected void a(Activity activity, Intent intent, int i) {
        a(activity, intent, i, (Map<String, Object>) null);
    }

    protected void a(Activity activity, Intent intent, int i, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i);
        try {
            activity.startActivityForResult(a(activity, intent, map, i), i);
        } catch (Exception e) {
            SLog.e("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }

    protected void a(Fragment fragment, Intent intent, int i, Map<String, Object> map) {
        intent.putExtra(Constants.KEY_REQUEST_CODE, i);
        try {
            fragment.startActivityForResult(a(fragment.getActivity(), intent, map, i), i);
        } catch (Exception e) {
            SLog.e("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }

    private void a(Activity activity, Intent intent, Intent intent2, int i) {
        if (intent == null || intent2 == null) {
            return;
        }
        try {
            if (intent2.getClipData() == null) {
                intent2.setClipData(ClipData.newPlainText(null, null));
            }
            intent2.setFlags(intent2.getFlags() & (-196));
        } catch (Throwable th) {
            SLog.e("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent.putExtra(AssistActivity.KEY_REQUEST_ORIENTATION, activity.getRequestedOrientation());
        intent.putExtra(AssistActivity.EXTRA_INTENT, intent2);
        try {
            SLog.i("openSDK_LOG.BaseApi", "setActivityIntent requestCode: " + i);
            intent.putExtra(AssistActivity.KEY_EXTRA_PENDING_INTENT, PendingIntent.getActivity(activity, i, intent2, 1140850688));
        } catch (Throwable th2) {
            SLog.e("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    protected Intent b(String str) {
        Intent intent = new Intent();
        if (m.c(g.a())) {
            intent.setClassName(Constants.PACKAGE_QQ_PAD, str);
            if (!k.a(g.a(), intent)) {
                intent.setClassName("com.tencent.mobileqq", str);
                if (!k.a(g.a(), intent)) {
                    intent.setClassName(Constants.PACKAGE_TIM, str);
                    if (k.a(g.a(), intent)) {
                        return null;
                    }
                }
            }
        } else {
            intent.setClassName("com.tencent.mobileqq", str);
            if (!k.a(g.a(), intent)) {
                intent.setClassName(Constants.PACKAGE_TIM, str);
                if (k.a(g.a(), intent)) {
                    return null;
                }
            }
        }
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    protected Intent c() {
        Intent intent = new Intent();
        if (m.c(g.a())) {
            intent.setClassName(Constants.PACKAGE_QQ_PAD, "com.tencent.open.agent.AgentActivity");
            if (!k.b(g.a(), intent)) {
                intent.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
                if (!k.b(g.a(), intent)) {
                    intent.setClassName(Constants.PACKAGE_TIM, "com.tencent.open.agent.AgentActivity");
                    if (k.b(g.a(), intent)) {
                        return null;
                    }
                }
            }
        } else {
            intent.setClassName("com.tencent.mobileqq", "com.tencent.open.agent.AgentActivity");
            if (!k.b(g.a(), intent)) {
                intent.setClassName(Constants.PACKAGE_TIM, "com.tencent.open.agent.AgentActivity");
                if (k.b(g.a(), intent)) {
                    return null;
                }
            }
        }
        return intent;
    }

    protected void a(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.i("openSDK_LOG.BaseApi", "--handleDownloadLastestQQ");
        new TDialog(activity, "", "https://imgcache.qq.com/ptlogin/static/qzsjump.html?" + HttpUtils.encodeUrl(bundle), null, this.f30928c).show();
    }

    protected Intent c(String str) {
        Intent intent = new Intent();
        Intent intentB = b(str);
        if (intentB == null || intentB.getComponent() == null) {
            return null;
        }
        intent.setClassName(intentB.getComponent().getPackageName(), "com.tencent.open.agent.AgentActivity");
        return intent;
    }

    public class TempRequestListener implements IRequestListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IUiListener f30930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f30931c;

        public TempRequestListener(IUiListener iUiListener) {
            this.f30930b = iUiListener;
            this.f30931c = new Handler(g.a().getMainLooper()) { // from class: com.tencent.connect.common.BaseApi.TempRequestListener.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what == 0) {
                        TempRequestListener.this.f30930b.onComplete(message.obj);
                    } else {
                        TempRequestListener.this.f30930b.onError(new UiError(message.what, (String) message.obj, null));
                    }
                }
            };
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onComplete(JSONObject jSONObject) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = jSONObject;
            messageObtainMessage.what = 0;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onIOException(IOException iOException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = iOException.getMessage();
            messageObtainMessage.what = -2;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onMalformedURLException(MalformedURLException malformedURLException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = malformedURLException.getMessage();
            messageObtainMessage.what = -3;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onJSONException(JSONException jSONException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = jSONException.getMessage();
            messageObtainMessage.what = -4;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onSocketTimeoutException(SocketTimeoutException socketTimeoutException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = socketTimeoutException.getMessage();
            messageObtainMessage.what = -8;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onNetworkUnavailableException(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = networkUnavailableException.getMessage();
            messageObtainMessage.what = -10;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onHttpStatusException(HttpUtils.HttpStatusException httpStatusException) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = httpStatusException.getMessage();
            messageObtainMessage.what = -9;
            this.f30931c.sendMessage(messageObtainMessage);
        }

        @Override // com.tencent.tauth.IRequestListener
        public void onUnknowException(Exception exc) {
            Message messageObtainMessage = this.f30931c.obtainMessage();
            messageObtainMessage.obj = exc.getMessage();
            messageObtainMessage.what = -6;
            this.f30931c.sendMessage(messageObtainMessage);
        }
    }
}
