package com.linecorp.linesdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes18.dex */
public class LineApiResponse<R> {
    private static final LineApiResponse<?> d = new LineApiResponse<>(LineApiResponseCode.SUCCESS, null, LineApiError.DEFAULT);

    @NonNull
    private final LineApiResponseCode a;

    @Nullable
    private final R b;

    @NonNull
    private final LineApiError c;

    private LineApiResponse(@NonNull LineApiResponseCode lineApiResponseCode, @Nullable R r, @NonNull LineApiError lineApiError) {
        this.a = lineApiResponseCode;
        this.b = r;
        this.c = lineApiError;
    }

    @NonNull
    public static <T> LineApiResponse<T> createAsError(@NonNull LineApiResponseCode lineApiResponseCode, @NonNull LineApiError lineApiError) {
        return new LineApiResponse<>(lineApiResponseCode, null, lineApiError);
    }

    @NonNull
    public static <T> LineApiResponse<T> createAsSuccess(@Nullable T t) {
        return t == null ? (LineApiResponse<T>) d : new LineApiResponse<>(LineApiResponseCode.SUCCESS, t, LineApiError.DEFAULT);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineApiResponse lineApiResponse = (LineApiResponse) obj;
        if (this.a != lineApiResponse.a) {
            return false;
        }
        R r = this.b;
        if (r == null ? lineApiResponse.b == null : r.equals(lineApiResponse.b)) {
            return this.c.equals(lineApiResponse.c);
        }
        return false;
    }

    @NonNull
    public LineApiError getErrorData() {
        return this.c;
    }

    @NonNull
    public LineApiResponseCode getResponseCode() {
        return this.a;
    }

    @NonNull
    public R getResponseData() {
        R r = this.b;
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        R r = this.b;
        return ((iHashCode + (r != null ? r.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public boolean isNetworkError() {
        return this.a == LineApiResponseCode.NETWORK_ERROR;
    }

    public boolean isServerError() {
        return this.a == LineApiResponseCode.SERVER_ERROR;
    }

    public boolean isSuccess() {
        return this.a == LineApiResponseCode.SUCCESS;
    }

    public String toString() {
        return "LineApiResponse{errorData=" + this.c + ", responseCode=" + this.a + ", responseData=" + this.b + '}';
    }
}
