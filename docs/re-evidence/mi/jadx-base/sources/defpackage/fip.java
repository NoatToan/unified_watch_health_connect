package defpackage;

import android.text.TextUtils;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.google.gson.Gson;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
public class fip implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17822a = "TokenInterceptor";

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        String strHeader = request.header("tag");
        fpe.e("TokenInterceptor", "Tag：" + strHeader);
        if (!TextUtils.isEmpty(strHeader) || responseProceed.code() != 401) {
            return responseProceed;
        }
        String strString = responseProceed.body().string();
        if (!request.url().getUrl().equals(qvf.c) && ((BaseWalletResponse) new Gson().fromJson(strString, BaseWalletResponse.class)).getResultCode().equalsIgnoreCase(UnifyPayListener.ERR_SENT_FAILED)) {
            qvf.m.invalidateAccessToken(qvf.f31886r, qvf.x);
            qvf.x = null;
        }
        return responseProceed.newBuilder().body(ResponseBody.create(MediaType.parse("application/json;charset=UTF-8"), strString)).build();
    }
}
