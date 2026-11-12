package com.huami.treadmill.api;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lcom/huami/treadmill/api/Callback;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/huami/treadmill/api/ApiResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onResponse", "", "message", "onFailure", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public interface Callback<T> {
    void onFailure(@NotNull String message);

    void onResponse(@NotNull ApiResponse<T> response);
}
