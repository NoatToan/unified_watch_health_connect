package com.xiaomi.fitness.net.response;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/net/response/ApiException;", "Ljava/io/IOException;", "message", "", "errorCode", "", "cause", "", "<init>", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "(Ljava/lang/String;I)V", "(I)V", "getErrorCode", "()I", "equals", "", "other", "", "hashCode", "toString", "Companion", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApiException extends IOException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ApiException EMPTY = new ApiException("数据为空", 606);

    @NotNull
    private static final ApiException UNKNOWN = new ApiException("未知异常", 600);
    private final int errorCode;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/response/ApiException$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/xiaomi/fitness/net/response/ApiException;", "getEMPTY", "()Lcom/xiaomi/fitness/net/response/ApiException;", DeviceTypes.UNKNOWN, "getUNKNOWN", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ApiException getEMPTY() {
            return ApiException.EMPTY;
        }

        @NotNull
        public final ApiException getUNKNOWN() {
            return ApiException.UNKNOWN;
        }
    }

    public ApiException(@Nullable String str, int i, @Nullable Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ApiException)) {
            return false;
        }
        ApiException apiException = (ApiException) other;
        return this.errorCode == apiException.errorCode && Intrinsics.areEqual(getMessage(), apiException.getMessage());
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        String message = getMessage();
        return ((message != null ? message.hashCode() : 0) * 31) + this.errorCode;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "ApiException={errorCode=" + this.errorCode + ", message=" + getMessage() + ", cause=" + getCause() + "}@" + hashCode();
    }

    public ApiException(@Nullable Throwable th) {
        this(null, 0, th);
    }

    public ApiException(@Nullable String str, int i) {
        this(str, i, null);
    }

    public /* synthetic */ ApiException(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }

    public ApiException(int i) {
        this(null, i, null);
    }
}
