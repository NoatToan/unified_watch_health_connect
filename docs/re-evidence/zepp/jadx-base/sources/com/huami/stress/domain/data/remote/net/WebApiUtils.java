package com.huami.stress.domain.data.remote.net;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.gson.Gson;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\r"}, d2 = {"Lcom/huami/stress/domain/data/remote/net/WebApiUtils;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Ljava/lang/Class;", "classOfT", "Lcom/huami/stress/domain/data/remote/net/ApiResponse;", "parseResponse", "", "parseEmptyResponse", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class WebApiUtils {

    @NotNull
    public static final WebApiUtils INSTANCE = new WebApiUtils();

    private WebApiUtils() {
    }

    @NotNull
    public final ApiResponse<String> parseEmptyResponse(@NotNull HMHttpResponseData response) {
        String message;
        if (response.isSuccess()) {
            return new ApiSuccessResponse("");
        }
        String responseString = response.getResponseString(StandardCharsets.UTF_8);
        if (!(responseString == null || m.isBlank(responseString))) {
            return new ApiErrorResponse(responseString);
        }
        Throwable error = response.getError();
        String str = "网络请求错误";
        if (error != null && (message = error.getMessage()) != null) {
            str = message;
        }
        return new ApiErrorResponse(str);
    }

    @NotNull
    public final <T> ApiResponse<T> parseResponse(@NotNull HMHttpResponseData response, @NotNull Class<T> classOfT) {
        String message;
        String message2;
        String responseString = response.getResponseString(StandardCharsets.UTF_8);
        if (!response.isSuccess()) {
            if (!(responseString == null || m.isBlank(responseString))) {
                return new ApiErrorResponse(responseString);
            }
            Throwable error = response.getError();
            String str = "网络请求错误";
            if (error != null && (message2 = error.getMessage()) != null) {
                str = message2;
            }
            return new ApiErrorResponse(str);
        }
        try {
            return new ApiSuccessResponse(new Gson().fromJson(responseString, (Class) classOfT));
        } catch (Throwable th) {
            Throwable error2 = response.getError();
            String str2 = "";
            if (error2 != null && (message = error2.getMessage()) != null) {
                str2 = message;
            }
            String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", str2);
            HMLog.e(LogTagUtilsKt.getTAG(INSTANCE), th, strStringPlus, new Object[0]);
            return new ApiErrorResponse(strStringPlus);
        }
    }
}
