package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.recognizekit.impl.RecognizeAuthListener;
import com.huawei.health.recognizekit.impl.RecognizeHelper;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public class gug implements RecognizeHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f36045c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RecognizeHelper.RecognizeListener f36046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36047b;
    private RecognizeAuthListener d;
    private int h = 5000;
    private boolean e = false;

    public void c(RecognizeAuthListener recognizeAuthListener) {
        this.d = recognizeAuthListener;
    }

    public gug(RecognizeHelper.RecognizeListener recognizeListener) {
        this.f36046a = recognizeListener;
        f();
    }

    public static void e(String str) {
        f36045c = str;
    }

    @Override // com.huawei.health.recognizekit.impl.RecognizeHelper
    public void release() {
        this.f36046a = null;
    }

    @Override // com.huawei.health.recognizekit.impl.RecognizeHelper
    public void recognize(final Bitmap bitmap) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: guc
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(bitmap);
            }
        });
    }

    /* synthetic */ void e(Bitmap bitmap) {
        a(bitmap, 90);
        RecognizeHelper.RecognizeListener recognizeListener = this.f36046a;
        if (recognizeListener == null) {
            LogUtil.b("RecognizeCloudHelper", "recognizeListener is null, no need to callback");
        } else {
            recognizeListener.onRecognized("recognize_success");
        }
    }

    public static String b() {
        return f36045c;
    }

    private void f() {
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: gug.3
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.b("RecognizeCloudHelper", "initHostUrl success");
                gug.this.f36047b = str;
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.e("RecognizeCloudHelper", "initHostUrl failed, resultCode: " + i);
            }
        });
    }

    private Map<String, String> c() {
        HashMap map = new HashMap();
        map.put("x-version", CommonUtil.c(com.huawei.haf.application.BaseApplication.b()));
        map.put(j2.v, "gzip, deflate");
        map.put("Connection", w9.j);
        map.put("Content-Encoding", Constants.GZIP);
        map.put("x-huid", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        return map;
    }

    private String a(Context context) {
        String deviceId = LoginInit.getInstance(context).getDeviceId();
        HashMap map = new HashMap();
        map.put("siteID", LoginInit.getInstance(context).getAccountInfo(1009));
        map.put("token", LoginInit.getInstance(context).getAccountInfo(1008));
        map.put("tokenType", Integer.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("appId", "com.huawei.health");
        map.put("appType", 1);
        map.put("ts", Long.valueOf(System.currentTimeMillis()));
        map.put("timeZone", ieg.d());
        map.put("countryCode", GRSManager.c(context).getCommonCountryCode());
        map.put("iVersion", "5");
        map.put("language", (TextUtils.isEmpty(LanguageUtil.a()) ? "zh-CN" : LanguageUtil.a()).replace("_", Constants.LINK));
        map.put("actionId", 600002);
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("source", "1");
        return ofe.c((Object) map);
    }

    private static String a(Bitmap bitmap, int i) {
        String strB = null;
        if (bitmap == null) {
            ReleaseLogUtil.a("R_RecognizeCloudHelper", "bitmapToBase64Encode failed, bitmap is null");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                strB = Base64.b(byteArrayOutputStream.toByteArray());
                if (strB != null && strB.length() > 2097152) {
                    StringBuilder sb = new StringBuilder("img is too large, change quality and recur in: ");
                    int i2 = i - 10;
                    sb.append(i2);
                    LogUtil.e("RecognizeCloudHelper", sb.toString());
                    strB = a(bitmap, i2);
                }
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    LogUtil.d("RecognizeCloudHelper", "bitmapToBase64Encode failed, e: ", ExceptionUtils.c(e));
                }
            } catch (IOException e2) {
                LogUtil.d("RecognizeCloudHelper", "bitmapToBase64Encode failed, e: ", ExceptionUtils.c(e2));
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    LogUtil.d("RecognizeCloudHelper", "bitmapToBase64Encode failed, e: ", ExceptionUtils.c(e3));
                }
            }
            f36045c = strB;
            return strB;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                LogUtil.d("RecognizeCloudHelper", "bitmapToBase64Encode failed, e: ", ExceptionUtils.c(e4));
            }
            throw th;
        }
    }

    public void e() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: guk
            @Override // java.lang.Runnable
            public final void run() {
                this.f36052c.d();
            }
        });
    }

    /* synthetic */ void d() {
        new HashMap().put("country", GRSManager.c(BaseApplication.getContext()).getCommonCountryCode());
        Task taskCallInBackground = Tasks.callInBackground(new Callable() { // from class: guj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f36051a.a();
            }
        });
        taskCallInBackground.addOnSuccessListener(new OnSuccessListener() { // from class: gul
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f36053a.c((gud) obj);
            }
        });
        taskCallInBackground.addOnFailureListener(new OnFailureListener() { // from class: gui
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f36050c.b(exc);
            }
        });
    }

    /* synthetic */ gud a() throws Exception {
        return (gud) oet.d().e(this.f36047b + "/healthExpansion/food/pictureRecognitionAuth", c(), a(BaseApplication.getContext()), gud.class);
    }

    /* synthetic */ void c(gud gudVar) {
        LogUtil.b("RecognizeCloudHelper", "pictureRecognitionAuth Success result: " + gudVar);
        RecognizeAuthListener recognizeAuthListener = this.d;
        if (recognizeAuthListener != null) {
            recognizeAuthListener.onRecognizedAuth(gudVar);
        }
    }

    /* synthetic */ void b(Exception exc) {
        LogUtil.d("RecognizeCloudHelper", "exception occurs when recognizeAuth in cloud, e: " + exc);
        RecognizeAuthListener recognizeAuthListener = this.d;
        if (recognizeAuthListener != null) {
            recognizeAuthListener.onRecognizedAuth(null);
        }
    }
}
