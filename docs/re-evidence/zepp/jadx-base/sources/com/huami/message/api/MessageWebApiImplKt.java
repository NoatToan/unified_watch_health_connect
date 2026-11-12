package com.huami.message.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.android.vo.ApiEmptyResponse;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.message.util.SerializationKtxKt;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002\u001a\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0002H\u0002\u001a\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/android/vo/ApiResponse;", "b", "", "c", AbstractJSONTokenResponse.RESPONSE, "", "a", "common-message_release"}, k = 2, mv = {1, 5, 1})
public final class MessageWebApiImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiResponse<String> a(HMHttpResponseData hMHttpResponseData) {
        String message;
        if (hMHttpResponseData.isSuccess()) {
            return new ApiSuccessResponse("");
        }
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        if (!(responseString == null || m.isBlank(responseString))) {
            return new ApiErrorResponse(responseString);
        }
        Throwable error = hMHttpResponseData.getError();
        String str = "网络请求错误";
        if (error != null && (message = error.getMessage()) != null) {
            str = message;
        }
        return new ApiErrorResponse(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ApiResponse<T> b(HMHttpResponseData hMHttpResponseData, KSerializer<T> kSerializer) {
        String message;
        String message2;
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        if (!hMHttpResponseData.isSuccess()) {
            if (!(responseString == null || m.isBlank(responseString))) {
                return new ApiErrorResponse(responseString);
            }
            Throwable error = hMHttpResponseData.getError();
            String str = "网络请求错误";
            if (error != null && (message = error.getMessage()) != null) {
                str = message;
            }
            return new ApiErrorResponse(str);
        }
        if (responseString == null || Intrinsics.areEqual(responseString, MessageFormatter.c) || hMHttpResponseData.getStatusCode() == 204 || Intrinsics.areEqual(responseString, "{\"items\":[]}")) {
            return new ApiEmptyResponse();
        }
        try {
            return new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
        } catch (Throwable th) {
            Throwable error2 = hMHttpResponseData.getError();
            String str2 = "";
            if (error2 != null && (message2 = error2.getMessage()) != null) {
                str2 = message2;
            }
            String strStringPlus = Intrinsics.stringPlus("json解析发生错误. ", str2);
            HMLog.w("Train-TrainingWebApiImpl", th, strStringPlus, new Object[0]);
            return new ApiErrorResponse(strStringPlus);
        }
    }

    private static final ApiResponse<Unit> c(HMHttpResponseData hMHttpResponseData) {
        String message;
        if (hMHttpResponseData.isSuccess()) {
            return hMHttpResponseData.getStatusCode() == 204 ? new ApiEmptyResponse() : new ApiSuccessResponse(Unit.INSTANCE);
        }
        String responseString = hMHttpResponseData.getResponseString(StandardCharsets.UTF_8);
        if (!(responseString == null || m.isBlank(responseString))) {
            return new ApiErrorResponse(responseString);
        }
        Throwable error = hMHttpResponseData.getError();
        String str = "网络请求错误";
        if (error != null && (message = error.getMessage()) != null) {
            str = message;
        }
        return new ApiErrorResponse(str);
    }
}
