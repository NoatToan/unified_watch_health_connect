package com.huami.android.mipay.h5;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/android/mipay/h5/MiPayH5Response;", "", "", "isSuccessful", "", "component1", "", "component2", "code", "message", "copy", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "Companion", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class MiPayH5Response {
    public static final int CODE_SUCCESS = 300;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int RESULT_CODE_BACK = 200;
    public static final int RESULT_CODE_UNKNOWN = 100;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String message;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/android/mipay/h5/MiPayH5Response$Companion;", "", "Lcom/huami/android/mipay/h5/MiPayH5Response;", "unknown", "", "CODE_SUCCESS", LogUtil.I, "RESULT_CODE_BACK", "RESULT_CODE_UNKNOWN", "<init>", "()V", "mipay-h5_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MiPayH5Response unknown() {
            return new MiPayH5Response(100, "用户没有支付，也没有检测到用户");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MiPayH5Response(int i, @Nullable String str) {
        this.code = i;
        this.message = str;
    }

    public static /* synthetic */ MiPayH5Response copy$default(MiPayH5Response miPayH5Response, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = miPayH5Response.code;
        }
        if ((i2 & 2) != 0) {
            str = miPayH5Response.message;
        }
        return miPayH5Response.copy(i, str);
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

    @NotNull
    public final MiPayH5Response copy(int code, @Nullable String message) {
        return new MiPayH5Response(code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof MiPayH5Response) {
                MiPayH5Response miPayH5Response = (MiPayH5Response) other;
                if (!(this.code == miPayH5Response.code) || !Intrinsics.areEqual(this.message, miPayH5Response.message)) {
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

    public int hashCode() {
        int i = this.code * 31;
        String str = this.message;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSuccessful() {
        return this.code == 300;
    }

    @NotNull
    public String toString() {
        return "MiPayH5Response(code=" + this.code + ", message=" + this.message + ")";
    }
}
