package com.huami.third.alipay;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J6\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/third/alipay/ApiResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "()Ljava/lang/Object;", "", "component3", "code", "data", "message", "copy", "(ILjava/lang/Object;Ljava/lang/String;)Lcom/huami/third/alipay/ApiResult;", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/Object;", "getData", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/Object;Ljava/lang/String;)V", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class ApiResult<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("code")
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("data")
    @Nullable
    private final T data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("message")
    @NotNull
    private final String message;

    public ApiResult(int i, @Nullable T t, @NotNull String str) {
        this.code = i;
        this.data = t;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResult copy$default(ApiResult apiResult, int i, Object obj, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = apiResult.code;
        }
        if ((i2 & 2) != 0) {
            obj = apiResult.data;
        }
        if ((i2 & 4) != 0) {
            str = apiResult.message;
        }
        return apiResult.copy(i, obj, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T component2() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final ApiResult<T> copy(int code, @Nullable T data, @NotNull String message) {
        return new ApiResult<>(code, data, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResult)) {
            return false;
        }
        ApiResult apiResult = (ApiResult) other;
        return this.code == apiResult.code && Intrinsics.areEqual(this.data, apiResult.data) && Intrinsics.areEqual(this.message, apiResult.message);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int i = this.code * 31;
        T t = this.data;
        int iHashCode = (i + (t != null ? t.hashCode() : 0)) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApiResult(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ")";
    }
}
