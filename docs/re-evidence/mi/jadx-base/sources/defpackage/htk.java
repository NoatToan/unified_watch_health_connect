package defpackage;

import android.text.TextUtils;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.service.mi.wallet.entity.resp.BaseWalletResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes6.dex */
public class htk implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20440a = "RetryIntercepterNew";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20441b = 5000;
    public final int c = 3;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        String strHeader = request.header("tag");
        fpe.e("RetryIntercepterNew", "Tag：" + strHeader);
        if (!TextUtils.isEmpty(strHeader) || !responseProceed.isSuccessful()) {
            return responseProceed;
        }
        String path = request.url().url().getPath();
        String strString = responseProceed.body().string();
        fpe.e("RetryIntercepterNew", "Response Content：" + strString);
        if (path.endsWith("/checkEligibility") || path.endsWith("/digitize") || path.endsWith("/apdu/notify") || path.endsWith("/app/manage") || path.endsWith("/apdu/report") || path.endsWith("/se/prepare") || path.endsWith("/app/sync") || path.endsWith("/se/deleteNxpApp") || path.endsWith("/se/remove")) {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(strString, JsonObject.class);
            String asString = jsonObject.get("messageId").getAsString();
            int i = 1;
            while (jsonObject != null && jsonObject.get("status").getAsString().equals(AMap3DTileBuildType.HOUSING) && i <= 3) {
                try {
                    Thread.sleep(i * 5000);
                    Headers headers = request.headers();
                    RequestBody requestBodyBody = request.body();
                    Buffer buffer = new Buffer();
                    requestBodyBody.writeTo(buffer);
                    JsonObject jsonObject2 = (JsonObject) new Gson().fromJson(buffer.readUtf8(), JsonObject.class);
                    jsonObject2.addProperty("messageId", asString);
                    responseProceed = chain.proceed(request.newBuilder().url(request.url()).headers(headers).post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), new GsonBuilder().disableHtmlEscaping().create().toJson((JsonElement) jsonObject2))).build());
                    if (responseProceed.isSuccessful()) {
                        strString = responseProceed.body().string();
                        jsonObject = (JsonObject) new Gson().fromJson(strString, JsonObject.class);
                    } else {
                        jsonObject = null;
                    }
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (!request.url().getUrl().equals(qvf.c) && ((BaseWalletResponse) new Gson().fromJson(strString, BaseWalletResponse.class)).getResultCode().equalsIgnoreCase(UnifyPayListener.ERR_SENT_FAILED)) {
            qvf.m.invalidateAccessToken(qvf.f31886r, qvf.x);
            qvf.x = null;
        }
        return responseProceed.newBuilder().body(ResponseBody.create(MediaType.parse("application/json;charset=UTF-8"), strString)).build();
    }
}
