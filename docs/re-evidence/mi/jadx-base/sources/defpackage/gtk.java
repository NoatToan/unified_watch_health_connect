package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.service.mi.wallet.entity.resp.ApduCommandBaseResp;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public class gtk implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19320a = "RetryIntercepter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19321b = 5000;
    public final int c = 3;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        String strHeader = request.header("tag");
        fpe.e("RetryIntercepter", "Tag：" + strHeader);
        if (!TextUtils.isEmpty(strHeader) || !responseProceed.isSuccessful()) {
            return responseProceed;
        }
        String path = request.url().url().getPath();
        String strString = responseProceed.body().string();
        fpe.e("RetryIntercepter", "Response Content：" + strString);
        if (path.endsWith("/provision") || path.endsWith("/getRegistationCode2")) {
            ApduCommandBaseResp apduCommandBaseResp = (ApduCommandBaseResp) new Gson().fromJson(strString, ApduCommandBaseResp.class);
            int i = 1;
            while (apduCommandBaseResp != null && apduCommandBaseResp.isNeedRetry() && i <= 3) {
                try {
                    Thread.sleep(i * 5000);
                    fpe.e("RetryIntercepter", "个人化重试第：" + i + "次");
                    responseProceed = chain.proceed(request);
                    if (responseProceed.isSuccessful()) {
                        strString = responseProceed.body().string();
                        fpe.e("RetryIntercepter", "Response Content：" + strString);
                        apduCommandBaseResp = (ApduCommandBaseResp) new Gson().fromJson(strString, ApduCommandBaseResp.class);
                    } else {
                        apduCommandBaseResp = null;
                    }
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return responseProceed.newBuilder().body(ResponseBody.create(MediaType.parse("application/json;charset=UTF-8"), strString)).build();
    }
}
