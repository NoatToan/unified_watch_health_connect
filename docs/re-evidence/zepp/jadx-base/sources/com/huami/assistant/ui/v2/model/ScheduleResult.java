package com.huami.assistant.ui.v2.model;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleResult;", "", "", "isSuccess", "isFail", "isLoading", "", "component1", "status", "copy", "", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getStatus", "()I", "<init>", "(I)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleResult$Companion;", "", "Lcom/huami/assistant/ui/v2/model/ScheduleResult;", "success", "loading", "fail", "", "FAIL", LogUtil.I, "LOADING", c.p, "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleResult fail() {
            return new ScheduleResult(2, null);
        }

        @NotNull
        public final ScheduleResult loading() {
            return new ScheduleResult(0, null);
        }

        @NotNull
        public final ScheduleResult success() {
            return new ScheduleResult(1, null);
        }
    }

    private ScheduleResult(int i) {
        this.status = i;
    }

    public /* synthetic */ ScheduleResult(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ ScheduleResult copy$default(ScheduleResult scheduleResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scheduleResult.status;
        }
        return scheduleResult.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final ScheduleResult copy(int status) {
        return new ScheduleResult(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScheduleResult) && this.status == ((ScheduleResult) other).status;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status;
    }

    public final boolean isFail() {
        return this.status == 2;
    }

    public final boolean isLoading() {
        return this.status == 0;
    }

    public final boolean isSuccess() {
        return this.status == 1;
    }

    @NotNull
    public String toString() {
        return "ScheduleResult(status=" + this.status + ")";
    }
}
