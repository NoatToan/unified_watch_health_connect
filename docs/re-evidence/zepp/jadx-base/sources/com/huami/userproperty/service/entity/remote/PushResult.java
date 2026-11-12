package com.huami.userproperty.service.entity.remote;

import com.facebook.internal.AnalyticsEvents;
import com.huami.userproperty.service.entity.ErrorCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/PushResult;", "", "", "toString", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Success", "Lcom/huami/userproperty/service/entity/remote/PushResult$Success;", "Lcom/huami/userproperty/service/entity/remote/PushResult$Failed;", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class PushResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/PushResult$Failed;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "a", "Lcom/huami/userproperty/service/entity/ErrorCode;", "getErrorCode", "()Lcom/huami/userproperty/service/entity/ErrorCode;", "errorCode", "<init>", "(Lcom/huami/userproperty/service/entity/ErrorCode;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Failed extends PushResult {

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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/PushResult$Success;", "Lcom/huami/userproperty/service/entity/remote/PushResult;", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Success extends PushResult {

        @NotNull
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private PushResult() {
    }

    public /* synthetic */ PushResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        if (this instanceof Success) {
            return "PushResult(success)";
        }
        if (!(this instanceof Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        return "PushFailed(" + ((Failed) this).getErrorCode() + ')';
    }
}
