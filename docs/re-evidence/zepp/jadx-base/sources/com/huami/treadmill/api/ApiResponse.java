package com.huami.treadmill.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.treadmill.util.SerializationKtxKt;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/treadmill/api/ApiResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Companion", "Lcom/huami/treadmill/api/ApiEmptyResponse;", "Lcom/huami/treadmill/api/ApiSuccessResponse;", "Lcom/huami/treadmill/api/ApiErrorResponse;", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public abstract class ApiResponse<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¨\u0006\u000b"}, d2 = {"Lcom/huami/treadmill/api/ApiResponse$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/network/base/model/HMHttpResponseData;", AbstractJSONTokenResponse.RESPONSE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "Lcom/huami/treadmill/api/ApiResponse;", "create", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> ApiResponse<T> create(@NotNull HMHttpResponseData response, @NotNull KSerializer<T> kSerializer) {
            String message;
            String message2;
            String responseString = response.getResponseString(StandardCharsets.UTF_8);
            if (!response.isSuccess()) {
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
            if (response.getStatusCode() == 204) {
                return new ApiEmptyResponse();
            }
            if (response.getStatusCode() == 409) {
                return new ApiErrorResponse(response.getResponseString());
            }
            try {
                return new ApiSuccessResponse(SerializationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, responseString));
            } catch (Throwable unused) {
                Throwable error2 = response.getError();
                String str2 = "";
                if (error2 != null && (message2 = error2.getMessage()) != null) {
                    str2 = message2;
                }
                return new ApiErrorResponse(Intrinsics.stringPlus("json解析发生错误. ", str2));
            }
        }
    }

    private ApiResponse() {
    }

    public /* synthetic */ ApiResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
