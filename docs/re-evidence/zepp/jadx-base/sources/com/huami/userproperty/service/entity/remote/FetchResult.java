package com.huami.userproperty.service.entity.remote;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.AnalyticsEvents;
import com.huami.userproperty.service.entity.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/FetchResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Success;", "Lcom/huami/userproperty/service/entity/remote/FetchResult$Failed;", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class FetchResult<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/FetchResult$Failed;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "toString", "Lcom/huami/userproperty/service/entity/ErrorCode;", "a", "Lcom/huami/userproperty/service/entity/ErrorCode;", "getErrorCode", "()Lcom/huami/userproperty/service/entity/ErrorCode;", "errorCode", "<init>", "(Lcom/huami/userproperty/service/entity/ErrorCode;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Failed<T> extends FetchResult<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ErrorCode errorCode;

        public Failed(@NotNull ErrorCode errorCode) {
            super(null);
            this.errorCode = errorCode;
        }

        @NotNull
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public String toString() {
            return "FetchFailed[code=" + this.errorCode.getCode() + ", message=" + this.errorCode.getMessage() + JsonLexerKt.END_LIST;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00018\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/FetchResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/userproperty/service/entity/remote/FetchResult;", "", "toString", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success<T> extends FetchResult<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final T value;

        public Success(@Nullable T t) {
            super(null);
            this.value = t;
        }

        @Nullable
        public final T getValue() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "FetchSuccess[value=" + this.value + JsonLexerKt.END_LIST;
        }
    }

    private FetchResult() {
    }

    public /* synthetic */ FetchResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
