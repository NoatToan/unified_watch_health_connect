package defpackage;

import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.upload.ErrorCodeUploadApi;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mjp {
    public static void e(String str, String str2, byte[] bArr, Map<String, String> map, IBaseResponseCallback iBaseResponseCallback) {
        Submit<String> submitErrorCodeUploadPut;
        LogUtil.a("UploadProfileUtils", "Enter postDataToOBS");
        if (e(str)) {
            return;
        }
        try {
            ErrorCodeUploadApi errorCodeUploadApi = (ErrorCodeUploadApi) oet.c(d()).e(ErrorCodeUploadApi.class);
            RequestBody requestBodyCreate = RequestBody.create(map.get("Content-Type"), bArr);
            if ("POST".equals(str2)) {
                submitErrorCodeUploadPut = errorCodeUploadApi.errorCodeUploadPost(str, map, requestBodyCreate);
            } else {
                submitErrorCodeUploadPut = errorCodeUploadApi.errorCodeUploadPut(str, map, requestBodyCreate);
            }
            Response<String> responseExecute = submitErrorCodeUploadPut.execute();
            if (responseExecute == null) {
                LogUtil.e("UploadProfileUtils", "postDataToObs response is null");
            } else {
                iBaseResponseCallback.a(responseExecute.getCode(), null);
            }
        } catch (IOException e) {
            LogUtil.a("UploadProfileUtils", "doGet ", e.getMessage());
        }
    }

    private static HttpClient d() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(30000).readTimeout(60000).build();
    }

    private static boolean e(String str) {
        return str == null || str.equals("");
    }
}
