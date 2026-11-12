package com.xiaomi.hm.health.nfc.service;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B#\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b \u0010!J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\r\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "json", "", "isSuccessful", "", "component1", "component2", "component3", "()Ljava/lang/Object;", "code", "message", "data", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "getData", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NfcOpenServiceResponse<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("resultCode")
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("resultMsg")
    @NotNull
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("data")
    @Nullable
    private final T data;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00062\u0006\u0010\n\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse$Companion;", "", "", "code", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "message", "Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "error", "data", "success", "(Ljava/lang/Object;)Lcom/xiaomi/hm/health/nfc/service/NfcOpenServiceResponse;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(int code) {
            if (code == 0) {
                return "执行成功。";
            }
            if (code != 1) {
                return code != 2 ? "未知错误" : "执行失败，设备处于未连接状态。请确保APP中设备处于连接状态。";
            }
            return "执行失败，绑定的设备不支持NFC功能。请更换设备后重试。";
        }

        public static /* synthetic */ NfcOpenServiceResponse error$default(Companion companion, int i, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return companion.error(i, str);
        }

        @JvmStatic
        @NotNull
        public final <T> NfcOpenServiceResponse<T> error(int code, @Nullable String message) {
            if (message == null) {
                message = a(code);
            }
            return new NfcOpenServiceResponse<>(code, message, null);
        }

        @JvmStatic
        @NotNull
        public final <T> NfcOpenServiceResponse<T> success(T data) {
            return new NfcOpenServiceResponse<>(0, a(0), data);
        }
    }

    public NfcOpenServiceResponse(int i, @NotNull String str, @Nullable T t) {
        this.code = i;
        this.message = str;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcOpenServiceResponse copy$default(NfcOpenServiceResponse nfcOpenServiceResponse, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = nfcOpenServiceResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = nfcOpenServiceResponse.message;
        }
        if ((i2 & 4) != 0) {
            obj = nfcOpenServiceResponse.data;
        }
        return nfcOpenServiceResponse.copy(i, str, obj);
    }

    @JvmStatic
    @NotNull
    public static final <T> NfcOpenServiceResponse<T> error(int i, @Nullable String str) {
        return INSTANCE.error(i, str);
    }

    @JvmStatic
    @NotNull
    public static final <T> NfcOpenServiceResponse<T> success(T t) {
        return INSTANCE.success(t);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final T component3() {
        return this.data;
    }

    @NotNull
    public final NfcOpenServiceResponse<T> copy(int code, @NotNull String message, @Nullable T data) {
        return new NfcOpenServiceResponse<>(code, message, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcOpenServiceResponse)) {
            return false;
        }
        NfcOpenServiceResponse nfcOpenServiceResponse = (NfcOpenServiceResponse) other;
        return this.code == nfcOpenServiceResponse.code && Intrinsics.areEqual(this.message, nfcOpenServiceResponse.message) && Intrinsics.areEqual(this.data, nfcOpenServiceResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = ((this.code * 31) + this.message.hashCode()) * 31;
        T t = this.data;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final boolean isSuccessful() {
        return this.code == 0;
    }

    @NotNull
    public final String json() {
        return new Gson().toJson(this);
    }

    @NotNull
    public String toString() {
        return "NfcOpenServiceResponse(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public /* synthetic */ NfcOpenServiceResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : obj);
    }
}
