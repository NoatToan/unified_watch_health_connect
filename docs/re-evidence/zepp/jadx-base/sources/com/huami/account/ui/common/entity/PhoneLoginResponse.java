package com.huami.account.ui.common.entity;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.passport.ErrorCode;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "使用 PhoneLoginState")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b!\u0010\"J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "Lcom/huami/passport/ErrorCode;", "component2", "component3", "()Ljava/lang/Object;", "status", "errorCode", "data", "copy", "(ILcom/huami/passport/ErrorCode;Ljava/lang/Object;)Lcom/huami/account/ui/common/entity/PhoneLoginResponse;", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "Lcom/huami/passport/ErrorCode;", "getErrorCode", "()Lcom/huami/passport/ErrorCode;", "setErrorCode", "(Lcom/huami/passport/ErrorCode;)V", "c", "Ljava/lang/Object;", "getData", "<init>", "(ILcom/huami/passport/ErrorCode;Ljava/lang/Object;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PhoneLoginResponse<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private ErrorCode errorCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final T data;

    public PhoneLoginResponse() {
        this(0, null, null, 7, null);
    }

    public PhoneLoginResponse(int i, @Nullable ErrorCode errorCode, @Nullable T t) {
        this.status = i;
        this.errorCode = errorCode;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneLoginResponse copy$default(PhoneLoginResponse phoneLoginResponse, int i, ErrorCode errorCode, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = phoneLoginResponse.status;
        }
        if ((i2 & 2) != 0) {
            errorCode = phoneLoginResponse.errorCode;
        }
        if ((i2 & 4) != 0) {
            obj = phoneLoginResponse.data;
        }
        return phoneLoginResponse.copy(i, errorCode, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final T component3() {
        return this.data;
    }

    @NotNull
    public final PhoneLoginResponse<T> copy(int status, @Nullable ErrorCode errorCode, @Nullable T data) {
        return new PhoneLoginResponse<>(status, errorCode, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneLoginResponse)) {
            return false;
        }
        PhoneLoginResponse phoneLoginResponse = (PhoneLoginResponse) other;
        return this.status == phoneLoginResponse.status && Intrinsics.areEqual(this.errorCode, phoneLoginResponse.errorCode) && Intrinsics.areEqual(this.data, phoneLoginResponse.data);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.status * 31;
        ErrorCode errorCode = this.errorCode;
        int iHashCode = (i + (errorCode == null ? 0 : errorCode.hashCode())) * 31;
        T t = this.data;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final void setErrorCode(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @NotNull
    public String toString() {
        return "PhoneLoginResponse(status=" + this.status + ", errorCode=" + this.errorCode + ", data=" + this.data + ")";
    }

    public /* synthetic */ PhoneLoginResponse(int i, ErrorCode errorCode, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : errorCode, (i2 & 4) != 0 ? null : obj);
    }
}
