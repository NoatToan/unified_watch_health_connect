package com.huami.phn.core.webapi;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/phn/core/webapi/ApiResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/phn/core/webapi/ApiResult$Success;", "Lcom/huami/phn/core/webapi/ApiResult$Failed;", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class ApiResult<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/phn/core/webapi/ApiResult$Failed;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/phn/core/webapi/ApiResult;", "", "toString", "Lcom/huami/phn/core/webapi/ErrorCode;", "a", "Lcom/huami/phn/core/webapi/ErrorCode;", "getCode", "()Lcom/huami/phn/core/webapi/ErrorCode;", "code", "<init>", "(Lcom/huami/phn/core/webapi/ErrorCode;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Failed<T> extends ApiResult<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ErrorCode code;

        public Failed(@NotNull ErrorCode errorCode) {
            super(null);
            this.code = errorCode;
        }

        @NotNull
        public final ErrorCode getCode() {
            return this.code;
        }

        @NotNull
        public String toString() {
            return "ApiResult Failed[" + this.code + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\t\u001a\u00028\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/phn/core/webapi/ApiResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/phn/core/webapi/ApiResult;", "", "toString", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/Object;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success<T> extends ApiResult<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final T data;

        public Success(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        @NotNull
        public String toString() {
            return "ApiResult Success[" + this.data + "]";
        }
    }

    private ApiResult() {
    }

    public /* synthetic */ ApiResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
