package defpackage;

import android.text.TextUtils;
import com.huawei.health.basefitnessadvice.R;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class ugj {
    public static void a(String str, String str2, DataCallback dataCallback) {
        if (TextUtils.isEmpty(str)) {
            a(new Exception("url is empty"), dataCallback);
        } else if (CommonUtil.ab(BaseApplication.getContext())) {
            d(str, str2, dataCallback);
        } else {
            dataCallback.onFailure(ResultUtil.ResultCode.NO_NET, BaseApplication.getContext().getString(R.string.IDS_plugin_suggestion_have_no_network));
        }
    }

    private static void d(final String str, String str2, final DataCallback dataCallback) {
        ProgressListener<File> progressListener = new ProgressListener<File>() { // from class: ugj.1
            @Override // com.huawei.networkclient.ProgressListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                try {
                    ugj.b(str, new JSONObject().put("resultCode", 0).put("resultDesc", ugz.b(0)).put(JsUtil.DATA_LIST, file.getCanonicalPath()), dataCallback);
                } catch (JSONException e) {
                    LogUtil.e("CloudImplHelper", "jsonObject Exception");
                    ugj.a(e, dataCallback);
                } catch (IOException e2) {
                    LogUtil.e("CloudImplHelper", "file IOException");
                    ugj.a(e2, dataCallback);
                } finally {
                    LogUtil.a("CloudImplHelper", "download data finish");
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                dataCallback.onProgress(j, j2, z);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.j("CloudImplHelper", "onFail, throwable.getMessage() = ", th.getMessage());
                if (th instanceof Exception) {
                    ugj.a((Exception) th, dataCallback);
                }
            }
        };
        File file = new File(CommonUtil.c(str2));
        if (file.exists()) {
            LogUtil.d("CloudImplHelper", "DeleteFile : ", file.delete() ? "Success" : "Failed");
        }
        LogUtil.d("CloudImplHelper", "CreateFile : ", file.mkdirs() ? "Success" : "Failed");
        oet.d().a(new oer(str, null, file, progressListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, JSONObject jSONObject, DataCallback dataCallback) {
        int iOptInt = 9999;
        String strB = ugz.b(9999);
        if (jSONObject != null) {
            LogUtil.a("CloudImplHelper", "datas = ", jSONObject);
            iOptInt = jSONObject.optInt("resultCode");
            LogUtil.a("CloudImplHelper", "resultCode = ", Integer.valueOf(iOptInt));
            strB = jSONObject.optString("resultDesc");
            if (iOptInt == 0) {
                if (dataCallback != null) {
                    dataCallback.onSuccess(jSONObject);
                }
                LogUtil.a("CloudImplHelper", str, jSONObject.toString());
            } else if (dataCallback != null) {
                dataCallback.onFailure(iOptInt, strB);
            }
        } else if (dataCallback != null) {
            dataCallback.onFailure(9999, strB);
        }
        LogUtil.a("CloudImplHelper", str, ugz.b(iOptInt), strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[PHI: r0
      0x0042: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:20:0x0040, B:23:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(Exception exc, DataCallback dataCallback) {
        int i;
        if ((exc instanceof SocketTimeoutException) || ((exc instanceof SSLException) && exc.getMessage().contains("Connection timed out"))) {
            i = 1003;
        } else if ((exc instanceof ConnectException) || (exc instanceof UnknownHostException)) {
            i = -8;
        } else if ((exc instanceof IOException) && exc.getMessage().contains("Canceled")) {
            i = -2;
        } else {
            int i2 = 500;
            if (ugz.b(500).equals(exc.getMessage())) {
                i = i2;
            } else {
                i2 = 503;
                if (ugz.b(503).equals(exc.getMessage())) {
                    i = i2;
                } else {
                    LogUtil.a("CloudImplHelper", "resultCode err");
                    i = 9999;
                }
            }
        }
        if (dataCallback != null) {
            dataCallback.onFailure(i, ugz.b(i));
        }
        LogUtil.a("CloudImplHelper", "resultCode=", Integer.valueOf(i));
    }
}
