package com.huami.treadmill.api;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a$\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/treadmill/api/ApiResponse;", "Lcom/huami/treadmill/api/Callback;", "callBack", "", "enqueue", "treadmill_release"}, k = 2, mv = {1, 5, 1})
public final class ApiResponseKt {
    public static final <T> void enqueue(@NotNull ApiResponse<T> apiResponse, @NotNull Callback<T> callback) {
        if (apiResponse instanceof ApiSuccessResponse) {
            callback.onResponse(apiResponse);
        } else if (apiResponse instanceof ApiEmptyResponse) {
            callback.onResponse(apiResponse);
        } else if (apiResponse instanceof ApiErrorResponse) {
            callback.onFailure(((ApiErrorResponse) apiResponse).getErrorMessage());
        }
    }
}
