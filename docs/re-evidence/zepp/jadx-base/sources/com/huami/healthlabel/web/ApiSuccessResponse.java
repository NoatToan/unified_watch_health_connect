package com.huami.healthlabel.web;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\u0005\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/huami/healthlabel/web/ApiSuccessResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/healthlabel/web/ApiResponse;", "component1", "()Ljava/lang/Object;", "body", "copy", "(Ljava/lang/Object;)Lcom/huami/healthlabel/web/ApiSuccessResponse;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/Object;", "getBody", "<init>", "(Ljava/lang/Object;)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ApiSuccessResponse<T> extends ApiResponse<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final T body;

    public ApiSuccessResponse(T t) {
        super(null);
        this.body = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiSuccessResponse copy$default(ApiSuccessResponse apiSuccessResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = apiSuccessResponse.body;
        }
        return apiSuccessResponse.copy(obj);
    }

    public final T component1() {
        return this.body;
    }

    @NotNull
    public final ApiSuccessResponse<T> copy(T body) {
        return new ApiSuccessResponse<>(body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiSuccessResponse) && Intrinsics.areEqual(this.body, ((ApiSuccessResponse) other).body);
    }

    public final T getBody() {
        return this.body;
    }

    public int hashCode() {
        T t = this.body;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApiSuccessResponse(body=" + this.body + ")";
    }
}
