package com.huami.mipay;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/huami/mipay/MiPayResponse;", "", "", "isSuccessful", "", "component1", "", "component2", "component3", "code", "message", "result", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "getResult", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Companion", "mipay-wrapper_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class MiPayResponse {
    public static final int CODE_SUCCESS = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int ERROR_CODE_CANCELED = 2;
    public static final int ERROR_CODE_EXCEPTION = 1;
    private static final int d = -100;
    private static final int e = -200;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String result;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/mipay/MiPayResponse$Companion;", "", "Lcom/huami/mipay/MiPayResponse;", "unknown", "crash", "", "CODE_SUCCESS", LogUtil.I, "ERROR_CODE_CANCELED", "ERROR_CODE_CRASH", "ERROR_CODE_EXCEPTION", "ERROR_CODE_UNKNOWN", "<init>", "()V", "mipay-wrapper_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MiPayResponse crash() {
            return new MiPayResponse(-200, "小米钱包crash", null);
        }

        @NotNull
        public final MiPayResponse unknown() {
            return new MiPayResponse(-100, "未知错误", null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MiPayResponse(int i, @Nullable String str, @Nullable String str2) {
        this.code = i;
        this.message = str;
        this.result = str2;
    }

    public static /* synthetic */ MiPayResponse copy$default(MiPayResponse miPayResponse, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = miPayResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = miPayResponse.message;
        }
        if ((i2 & 4) != 0) {
            str2 = miPayResponse.result;
        }
        return miPayResponse.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final MiPayResponse copy(int code, @Nullable String message, @Nullable String result) {
        return new MiPayResponse(code, message, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof MiPayResponse) {
                MiPayResponse miPayResponse = (MiPayResponse) other;
                if (!(this.code == miPayResponse.code) || !Intrinsics.areEqual(this.message, miPayResponse.message) || !Intrinsics.areEqual(this.result, miPayResponse.result)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.message;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.result;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSuccessful() {
        return this.code == 0;
    }

    @NotNull
    public String toString() {
        return "MiPayResponse(code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
    }
}
