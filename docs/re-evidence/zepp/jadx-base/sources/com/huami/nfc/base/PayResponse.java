package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\u0018\u0000 +*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001+B%\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u000f\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u001bR$\u0010(\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u001b¨\u0006,"}, d2 = {"Lcom/huami/nfc/base/PayResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "isSuccessful", "isUnauthorized", "isNetworkError", "isMiTokenError", "isInternalError", "", "toString", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMessage", "message", "c", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", GoogleApiAvailabilityLight.a, "getApiCode", "setApiCode", "(Ljava/lang/String;)V", "apiCode", "e", "getApiMessage", "setApiMessage", "apiMessage", "f", "getRawMessage", "setRawMessage", "rawMessage", "g", "getVoucherCode", "setVoucherCode", "voucherCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "nfc-base_release"}, k = 1, mv = {1, 5, 1})
public final class PayResponse<T> {

    @NotNull
    public static final String CODE_BLE_ERROR_PREFIX = "ble";

    @NotNull
    public static final String CODE_HTTP_ERROR_MI_TOKEN = "http498";

    @NotNull
    public static final String CODE_HTTP_ERROR_PREFIX = "http";

    @NotNull
    public static final String CODE_HTTP_ERROR_UNAUTHORIZED = "http401";

    @NotNull
    public static final String CODE_NETWORK_ERROR = "NETWORK_ERROR";

    @NotNull
    public static final String CODE_NFC_CHANNEL_ERROR = "-3";

    @NotNull
    public static final String CODE_PARAMETER_ERROR = "PARAMETER_ERROR";

    @NotNull
    public static final String CODE_SE_NOT_RESPONSE_ERROR = "-4";

    @NotNull
    public static final String CODE_SE_RESPONSE_ERROR = "-2";

    @NotNull
    public static final String CODE_SUCCESS = "0000";

    @NotNull
    public static final String CODE_UNDEFINED = "UNDEFINED";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("resp_code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("resp_msg")
    @Nullable
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("resp_data")
    @Nullable
    private final T data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String apiCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String apiMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private String rawMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String voucherCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00022\u0006\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007R\u0016\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0016\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/base/PayResponse$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "message", "data", "Lcom/huami/nfc/base/PayResponse;", "success", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/huami/nfc/base/PayResponse;", "code", "error", "CODE_BLE_ERROR_PREFIX", "Ljava/lang/String;", "CODE_HTTP_ERROR_MI_TOKEN", "CODE_HTTP_ERROR_PREFIX", "CODE_HTTP_ERROR_UNAUTHORIZED", "CODE_NETWORK_ERROR", "CODE_NFC_CHANNEL_ERROR", "CODE_PARAMETER_ERROR", "CODE_SE_NOT_RESPONSE_ERROR", "CODE_SE_RESPONSE_ERROR", "CODE_SUCCESS", "CODE_UNDEFINED", "<init>", "()V", "nfc-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PayResponse error$default(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return companion.error(str, str2);
        }

        public static /* synthetic */ PayResponse success$default(Companion companion, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = "success";
            }
            return companion.success(str, obj);
        }

        @JvmStatic
        @NotNull
        public final <T> PayResponse<T> error(@NotNull String code, @Nullable String message) {
            return new PayResponse<>(code, message, null);
        }

        @JvmStatic
        @NotNull
        public final <T> PayResponse<T> success(@Nullable String message, @Nullable T data) {
            return new PayResponse<>("0000", message, data);
        }
    }

    public PayResponse(@NotNull String str, @Nullable String str2, @Nullable T t) {
        this.code = str;
        this.message = str2;
        this.data = t;
    }

    @JvmStatic
    @NotNull
    public static final <T> PayResponse<T> error(@NotNull String str, @Nullable String str2) {
        return INSTANCE.error(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final <T> PayResponse<T> success(@Nullable String str, @Nullable T t) {
        return INSTANCE.success(str, t);
    }

    @Nullable
    public final String getApiCode() {
        return this.apiCode;
    }

    @Nullable
    public final String getApiMessage() {
        return this.apiMessage;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getRawMessage() {
        return this.rawMessage;
    }

    @Nullable
    public final String getVoucherCode() {
        return this.voucherCode;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean isInternalError() {
        if (m.startsWith$default(this.code, "http", false, 2, null)) {
            return true;
        }
        String str = this.code;
        int iHashCode = str.hashCode();
        if (iHashCode != -879828873) {
            switch (iHashCode) {
                case 1445:
                    if (!str.equals(CODE_SE_RESPONSE_ERROR)) {
                        return false;
                    }
                    break;
                case 1446:
                    if (!str.equals(CODE_NFC_CHANNEL_ERROR)) {
                        return false;
                    }
                    break;
                case 1447:
                    if (!str.equals(CODE_SE_NOT_RESPONSE_ERROR)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        } else if (!str.equals(CODE_NETWORK_ERROR)) {
            return false;
        }
        return true;
    }

    public final boolean isMiTokenError() {
        return Intrinsics.areEqual(this.code, CODE_HTTP_ERROR_MI_TOKEN);
    }

    public final boolean isNetworkError() {
        return Intrinsics.areEqual(this.code, CODE_NETWORK_ERROR);
    }

    public final boolean isSuccessful() {
        return Intrinsics.areEqual(this.code, "0000");
    }

    public final boolean isUnauthorized() {
        return Intrinsics.areEqual(this.code, "http401");
    }

    public final void setApiCode(@Nullable String str) {
        this.apiCode = str;
    }

    public final void setApiMessage(@Nullable String str) {
        this.apiMessage = str;
    }

    public final void setRawMessage(@Nullable String str) {
        this.rawMessage = str;
    }

    public final void setVoucherCode(@Nullable String str) {
        this.voucherCode = str;
    }

    @NotNull
    public String toString() {
        return "PayResponse(code='" + this.code + "', message='" + ((Object) this.message) + "', data=" + this.data + ", apiCode=" + ((Object) this.apiCode) + ", apiMessage=" + ((Object) this.apiMessage) + ", rawMessage=" + ((Object) this.rawMessage) + ')';
    }

    public /* synthetic */ PayResponse(String str, String str2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, obj);
    }
}
