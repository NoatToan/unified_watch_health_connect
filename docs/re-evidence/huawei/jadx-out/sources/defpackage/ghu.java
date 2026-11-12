package defpackage;

import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.courseplanservice.R;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.operation.jsoperation.JsUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ghu {
    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject e(File file) {
        JSONObject jSONObject = new JSONObject();
        if (file != null) {
            try {
                jSONObject.put("resultCode", 0).put("resultDesc", ResultUtil.c(0)).put(JsUtil.DATA_LIST, file.getCanonicalPath());
                return jSONObject;
            } catch (IOException | JSONException e) {
                LogUtil.e("Suggestion_CloudImplHelper", "constructDownloadFinishJson() ", e.getClass().getSimpleName());
            }
        }
        return jSONObject;
    }

    static void d(final String str, final String str2, final DataCallback dataCallback) {
        LogUtil.a("Suggestion_CloudImplHelper", "url is:", str, " path :", str2);
        if (dataCallback == null) {
            LogUtil.j("Suggestion_CloudImplHelper", "downLoad callback == null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a(gzb.class.getName(), new Exception("url is empty"), dataCallback);
            return;
        }
        if (!CommonUtil.ab(btx.c())) {
            dataCallback.onFailure(ResultUtil.ResultCode.NO_NET, btx.c().getString(R.string.IDS_plugin_suggestion_have_no_network));
            return;
        }
        ProgressListener<File> progressListener = new ProgressListener<File>() { // from class: ghu.1
            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
            }

            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("Suggestion_CloudImplHelper", "downloadJsonFile onFinish");
                xkf.c(file.getName(), file.lastModified());
                dataCallback.onSuccess(ghu.e(file));
                if (file.isDirectory()) {
                    LogUtil.j("Suggestion_CloudImplHelper", "downloadFile as directory, url=", str, ", path=", str2);
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                dataCallback.onProgress(j, j2, z);
            }
        };
        File file = new File(str2);
        if (file.exists()) {
            LogUtil.d("Suggestion_CloudImplHelper", "DeleteFile : ", file.delete() ? "Success" : "Failed");
        }
        try {
            File parentFile = file.getParentFile();
            LogUtil.a("Suggestion_CloudImplHelper", "CreateFile ", Boolean.valueOf(parentFile != null && parentFile.mkdirs() && file.createNewFile()));
        } catch (IOException e) {
            LogUtil.e("Suggestion_CloudImplHelper", "downLoad IOException: ", LogAnonymous.b(e));
        }
        oet.d().a(new gkz(str, a(), file, progressListener, dataCallback));
    }

    private static Map<String, String> a() {
        HashMap map = new HashMap(2);
        map.put("x-huid", LoginInit.getInstance(BaseApplication.getContext()).getHuidOrDefault());
        map.put("x-version", CommonUtil.c(BaseApplication.getContext()));
        return map;
    }

    private static void a(String str, Throwable th, DataCallback dataCallback) {
        e(str, th, dataCallback, 9999);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[PHI: r1
      0x0066: PHI (r1v13 int) = (r1v12 int), (r1v14 int) binds: [B:26:0x0053, B:29:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    public static void e(String str, Throwable th, DataCallback dataCallback, int i) {
        if (dataCallback == null) {
            LogUtil.e("Suggestion_CloudImplHelper", "onFailure the callback is null.");
            return;
        }
        if (th instanceof Exception) {
            Exception exc = (Exception) th;
            if ((exc instanceof SocketTimeoutException) || ((exc instanceof SSLException) && TextUtils.equals(exc.getMessage(), "Connection timed out"))) {
                i = 1003;
            } else if ((exc instanceof ConnectException) || (exc instanceof UnknownHostException)) {
                i = -8;
            } else if ((exc instanceof IOException) && TextUtils.equals(exc.getMessage(), "Canceled")) {
                i = -2;
            } else {
                int i2 = 500;
                if (ResultUtil.c(500).equals(exc.getMessage())) {
                    i = i2;
                } else {
                    i2 = 503;
                    if (ResultUtil.c(503).equals(exc.getMessage())) {
                        i = i2;
                    } else if (exc instanceof oeu) {
                        i = ((oeu) exc).e();
                    } else {
                        ReleaseLogUtil.a("Suggestion_CloudImplHelper", "onFailure, Exception=", ExceptionUtils.c(exc), ", Msg=", exc.getMessage());
                        i = 9999;
                    }
                }
            }
            dataCallback.onFailure(i, ResultUtil.c(i));
        } else {
            dataCallback.onFailure(i, th.getMessage() != null ? th.getMessage() : ResultUtil.c(i));
        }
        LogUtil.e("Suggestion_CloudImplHelper", str, "resultCode=", Integer.valueOf(i), ResultUtil.c(i), th.getMessage());
    }
}
