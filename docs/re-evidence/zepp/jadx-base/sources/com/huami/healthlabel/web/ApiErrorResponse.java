package com.huami.healthlabel.web;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010!J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0005R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/huami/healthlabel/web/ApiErrorResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/healthlabel/web/ApiResponse;", "", "component1", "()Ljava/lang/Integer;", "", "component2", "", "component3", "code", "msg", "error", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huami/healthlabel/web/ApiErrorResponse;", "toString", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Integer;", "getCode", "b", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "c", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ApiErrorResponse<T> extends ApiResponse<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String msg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Throwable error;

    public ApiErrorResponse() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ApiErrorResponse(Integer num, String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : th);
    }

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, Integer num, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            num = apiErrorResponse.code;
        }
        if ((i & 2) != 0) {
            str = apiErrorResponse.msg;
        }
        if ((i & 4) != 0) {
            th = apiErrorResponse.error;
        }
        return apiErrorResponse.copy(num, str, th);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    @NotNull
    public final ApiErrorResponse<T> copy(@Nullable Integer code, @Nullable String msg, @Nullable Throwable error) {
        return new ApiErrorResponse<>(code, msg, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) other;
        return Intrinsics.areEqual(this.code, apiErrorResponse.code) && Intrinsics.areEqual(this.msg, apiErrorResponse.msg) && Intrinsics.areEqual(this.error, apiErrorResponse.error);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final Throwable getError() {
        return this.error;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApiErrorResponse(code=" + this.code + ", msg=" + this.msg + ", error=" + this.error + ")";
    }

    public ApiErrorResponse(@Nullable Integer num, @Nullable String str, @Nullable Throwable th) {
        super(null);
        this.code = num;
        this.msg = str;
        this.error = th;
    }
}
