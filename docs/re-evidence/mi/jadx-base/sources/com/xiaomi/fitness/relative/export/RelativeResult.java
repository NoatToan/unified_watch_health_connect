package com.xiaomi.fitness.relative.export;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001c*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001cB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/relative/export/RelativeResult;", "T", "", "data", "errorCode", "", Constants.EXTRA_ERROR_MESSAGE, "", "<init>", "(Ljava/lang/Object;ILjava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()I", "getErrorMsg", "()Ljava/lang/String;", "isSuccess", "", "toString", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;ILjava/lang/String;)Lcom/xiaomi/fitness/relative/export/RelativeResult;", "equals", "other", "hashCode", "Companion", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RelativeResult<T> {
    public static final int ERROR_ALREADY_RELATIVES = 1004;
    public static final int ERROR_CODE_NONE = 0;
    public static final int ERROR_CODE_NOT_RELATIVES = -4002001;
    public static final int ERROR_CODE_SHARED_DATA_TYPE_EXPIRE = -4002002;
    public static final int ERROR_INVALID_PARAM = 1001;
    public static final int ERROR_INVALID_UID = -6;
    public static final int ERROR_NET_REQUEST = 1002;
    public static final int ERROR_REPEAT_INVITE = 1003;
    public static final int ERROR_SERVER_ERROR = -4;

    @Nullable
    private final T data;
    private final int errorCode;

    @Nullable
    private final String errorMsg;

    public RelativeResult() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelativeResult copy$default(RelativeResult relativeResult, Object obj, int i, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = relativeResult.data;
        }
        if ((i2 & 2) != 0) {
            i = relativeResult.errorCode;
        }
        if ((i2 & 4) != 0) {
            str = relativeResult.errorMsg;
        }
        return relativeResult.copy(obj, i, str);
    }

    @Nullable
    public final T component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final RelativeResult<T> copy(@Nullable T data, int errorCode, @Nullable String errorMsg) {
        return new RelativeResult<>(data, errorCode, errorMsg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelativeResult)) {
            return false;
        }
        RelativeResult relativeResult = (RelativeResult) other;
        return Intrinsics.areEqual(this.data, relativeResult.data) && this.errorCode == relativeResult.errorCode && Intrinsics.areEqual(this.errorMsg, relativeResult.errorMsg);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public int hashCode() {
        T t = this.data;
        int iHashCode = (((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31;
        String str = this.errorMsg;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSuccess() {
        int i = this.errorCode;
        return i == 0 || i == 606;
    }

    @NotNull
    public String toString() {
        if (isSuccess()) {
            return String.valueOf(this.data);
        }
        return "(errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    public RelativeResult(@Nullable T t, int i, @Nullable String str) {
        this.data = t;
        this.errorCode = i;
        this.errorMsg = str;
    }

    public /* synthetic */ RelativeResult(Object obj, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : obj, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
