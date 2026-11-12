package com.huami.userproperty.service.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0007\u000f\u0010\u000e\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode;", "", "", "toString", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ApiError", "ApiMissed", "InvalidToken", "PropertyEmpty", "PropertyParseError", "Unknown", "Lcom/huami/userproperty/service/entity/ErrorCode$InvalidToken;", "Lcom/huami/userproperty/service/entity/ErrorCode$Unknown;", "Lcom/huami/userproperty/service/entity/ErrorCode$ApiError;", "Lcom/huami/userproperty/service/entity/ErrorCode$ApiMissed;", "Lcom/huami/userproperty/service/entity/ErrorCode$PropertyEmpty;", "Lcom/huami/userproperty/service/entity/ErrorCode$PropertyParseError;", "service_release"}, k = 1, mv = {1, 5, 1})
public abstract class ErrorCode {

    @NotNull
    public static final String API_MISSED = "101";

    @NotNull
    public static final String INVALID_TOKEN = "401";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String message;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$ApiError;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "", "code", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class ApiError extends ErrorCode {
        public ApiError(@NotNull String str, @NotNull String str2) {
            super(str, str2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$ApiMissed;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class ApiMissed extends ErrorCode {

        @NotNull
        public static final ApiMissed INSTANCE = new ApiMissed();

        private ApiMissed() {
            super("101", "API 缺失，忽略请求", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$InvalidToken;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "", "message", "<init>", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class InvalidToken extends ErrorCode {
        public InvalidToken(@NotNull String str) {
            super("401", str, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$PropertyEmpty;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class PropertyEmpty extends ErrorCode {
        public PropertyEmpty() {
            super("200", "property value 为空", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$PropertyParseError;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "", "message", "<init>", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class PropertyParseError extends ErrorCode {
        public PropertyParseError(@NotNull String str) {
            super("300", Intrinsics.stringPlus("property 解析失败：", str), null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/huami/userproperty/service/entity/ErrorCode$Unknown;", "Lcom/huami/userproperty/service/entity/ErrorCode;", "", "message", "<init>", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {1, 5, 1})
    public static final class Unknown extends ErrorCode {
        public Unknown(@NotNull String str) {
            super("100", str, null);
        }
    }

    private ErrorCode(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public /* synthetic */ ErrorCode(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + "[code=" + this.code + ", message=" + this.message + JsonLexerKt.END_LIST;
    }
}
