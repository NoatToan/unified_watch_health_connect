package com.huami.nfc.bus;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J+\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/bus/ResponseError;", "", "", "component1", "component2", "component3", "code", "message", "tip", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "b", "getMessage", "c", "getTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ResponseError {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("msg")
    @Nullable
    private final String message;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("snMsg")
    @Nullable
    private final String tip;

    public ResponseError(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        this.code = str;
        this.message = str2;
        this.tip = str3;
    }

    public static /* synthetic */ ResponseError copy$default(ResponseError responseError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseError.code;
        }
        if ((i & 2) != 0) {
            str2 = responseError.message;
        }
        if ((i & 4) != 0) {
            str3 = responseError.tip;
        }
        return responseError.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    @NotNull
    public final ResponseError copy(@NotNull String code, @Nullable String message, @Nullable String tip) {
        return new ResponseError(code, message, tip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseError)) {
            return false;
        }
        ResponseError responseError = (ResponseError) other;
        return Intrinsics.areEqual(this.code, responseError.code) && Intrinsics.areEqual(this.message, responseError.message) && Intrinsics.areEqual(this.tip, responseError.tip);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tip;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResponseError(code=" + this.code + ", message=" + ((Object) this.message) + ", tip=" + ((Object) this.tip) + ')';
    }

    public /* synthetic */ ResponseError(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
