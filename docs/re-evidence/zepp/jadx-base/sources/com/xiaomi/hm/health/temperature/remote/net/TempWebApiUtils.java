package com.xiaomi.hm.health.temperature.remote.net;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/temperature/remote/net/TempWebApiUtils;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/xiaomi/hm/health/temperature/remote/net/ApiResponse;", "parseResponse", "", "parseEmptyResponse", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TempWebApiUtils {

    @NotNull
    public static final TempWebApiUtils INSTANCE = new TempWebApiUtils();

    private TempWebApiUtils() {
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
    public final <T> ApiResponse<T> parseResponse(@NotNull HMHttpResponseData response, @NotNull KSerializer<T> kSerializer) {
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
            return new ApiSuccessResponse(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
        } catch (Throwable th) {
            Throwable error2 = response.getError();
            String str2 = "";
            if (error2 != null && (message = error2.getMessage()) != null) {
                str2 = message;
            }
            String str3 = "json解析发生错误. " + str2;
            HMLog.e(LogTagUtilsKt.getTAG(INSTANCE), th, str3, new Object[0]);
            return new ApiErrorResponse(str3);
        }
    }
}
