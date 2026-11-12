package com.xiaomi.hm.health.device.webapi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\u001d\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "", "", "toString", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMsg", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ApiError", "Error", "InvalidUrl", "NoneData", "ParseError", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode$InvalidUrl;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode$ParseError;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode$NoneData;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode$Error;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode$ApiError;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ErrorCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String msg;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode$ApiError;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "", "code", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ApiError extends ErrorCode {
        public ApiError(@NotNull String str, @NotNull String str2) {
            super(str, str2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode$Error;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "", "msg", "<init>", "(Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Error extends ErrorCode {
        public Error(@Nullable String str) {
            super("100004", str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode$InvalidUrl;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "", "url", "<init>", "(Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class InvalidUrl extends ErrorCode {
        public InvalidUrl(@NotNull String str) {
            super("100001", "Invalid url: " + str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode$NoneData;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class NoneData extends ErrorCode {

        @NotNull
        public static final NoneData INSTANCE = new NoneData();

        private NoneData() {
            super("100003", "None data!", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/webapi/ErrorCode$ParseError;", "Lcom/xiaomi/hm/health/device/webapi/ErrorCode;", "", "msg", "<init>", "(Ljava/lang/String;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ParseError extends ErrorCode {
        public ParseError(@Nullable String str) {
            super("100002", str, null);
        }
    }

    private ErrorCode(String str, String str2) {
        this.code = str;
        this.msg = str2;
    }

    public /* synthetic */ ErrorCode(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + "(code=" + this.code + ", msg=" + this.msg + ")";
    }

    public /* synthetic */ ErrorCode(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, null);
    }
}
