package com.xiaomi.fitness.app;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseData;
import com.xiaomi.fitness.net.response.BaseResponse;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.response.HttpResultHandler;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\t2\u0006\u0010\u000b\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/app/HttpResultHandlerImpl;", "Lcom/xiaomi/fitness/net/response/HttpResultHandler;", "<init>", "()V", "handleError", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "", "handleResponse", "R", "T", com.xiaomi.onetrack.api.b.I, "(Ljava/lang/Object;)Ljava/lang/Object;", "convertStatusCode", "", "httpException", "Lretrofit2/HttpException;", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpResultHandlerImpl implements HttpResultHandler {
    private final String convertStatusCode(HttpException httpException) {
        int iCode = httpException.code();
        if (iCode == 307) {
            return "请求被重定向到其他链接";
        }
        if (iCode == 408) {
            return null;
        }
        if (iCode == 500 || iCode == 503) {
            return "服务暂不可用";
        }
        if (iCode != 403) {
            return iCode != 404 ? httpException.message() : "请求地址不存在";
        }
        return "请求被服务器拒绝";
    }

    @Override // com.xiaomi.fitness.net.response.HttpResultHandler
    @NotNull
    public ApiException handleError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ApiException) {
            return (ApiException) error;
        }
        if (error instanceof UnknownHostException) {
            return new ApiException("请求地址不可用", 602, error);
        }
        if (error instanceof SocketTimeoutException) {
            return new ApiException("请求网络超时", 604, error);
        }
        if (error instanceof ConnectException) {
            return new ApiException("网络连接错误", 603, error);
        }
        if (error instanceof HttpException) {
            HttpException httpException = (HttpException) error;
            return new ApiException(convertStatusCode(httpException), httpException.code(), error);
        }
        if ((error instanceof JsonParseException) || (error instanceof ParseException) || (error instanceof JSONException)) {
            return new ApiException("数据解析错误", 601, error);
        }
        if (error instanceof NullPointerException) {
            return new ApiException("数据为空", 606, error);
        }
        if (error instanceof SSLHandshakeException) {
            return new ApiException("证书错误", 608, error);
        }
        ApiException apiException = new ApiException(error.getMessage(), 600, error);
        ExceptionsKt__ExceptionsKt.addSuppressed(apiException, error);
        return apiException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.net.response.HttpResultHandler
    public <T, R> R handleResponse(T response) throws ApiException {
        if (!(response instanceof BaseResponse)) {
            return response;
        }
        BaseResponse baseResponse = (BaseResponse) response;
        if (!baseResponse.isSuccess()) {
            throw new ApiException(baseResponse.getMsg(), baseResponse.getCode());
        }
        if (response instanceof BaseResult) {
            BaseResult baseResult = (BaseResult) response;
            if (baseResult.getResult() != null) {
                return (R) baseResult.getResult();
            }
            throw ApiException.INSTANCE.getEMPTY();
        }
        if (!(response instanceof BaseData)) {
            return response;
        }
        BaseData baseData = (BaseData) response;
        if (baseData.getData() != null) {
            return (R) baseData.getData();
        }
        throw ApiException.INSTANCE.getEMPTY();
    }
}
