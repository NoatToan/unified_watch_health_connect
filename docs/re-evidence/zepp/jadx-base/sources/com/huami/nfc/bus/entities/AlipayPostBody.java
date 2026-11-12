package com.huami.nfc.bus.entities;

import com.google.gson.annotations.SerializedName;
import com.huami.nfc.bus.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/nfc/bus/entities/AlipayPostBody;", "", "", "component1", "component2", ConstantKt.KEY_APP_CODE, "authChannelType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getApp_code", "()Ljava/lang/String;", "b", "getAuthChannelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AlipayPostBody {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(ConstantKt.KEY_APP_CODE)
    @NotNull
    private final String app_code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("authChannelType")
    @NotNull
    private final String authChannelType;

    public AlipayPostBody(@NotNull String str, @NotNull String str2) {
        this.app_code = str;
        this.authChannelType = str2;
    }

    public static /* synthetic */ AlipayPostBody copy$default(AlipayPostBody alipayPostBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alipayPostBody.app_code;
        }
        if ((i & 2) != 0) {
            str2 = alipayPostBody.authChannelType;
        }
        return alipayPostBody.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp_code() {
        return this.app_code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthChannelType() {
        return this.authChannelType;
    }

    @NotNull
    public final AlipayPostBody copy(@NotNull String app_code, @NotNull String authChannelType) {
        return new AlipayPostBody(app_code, authChannelType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlipayPostBody)) {
            return false;
        }
        AlipayPostBody alipayPostBody = (AlipayPostBody) other;
        return Intrinsics.areEqual(this.app_code, alipayPostBody.app_code) && Intrinsics.areEqual(this.authChannelType, alipayPostBody.authChannelType);
    }

    @NotNull
    public final String getApp_code() {
        return this.app_code;
    }

    @NotNull
    public final String getAuthChannelType() {
        return this.authChannelType;
    }

    public int hashCode() {
        return (this.app_code.hashCode() * 31) + this.authChannelType.hashCode();
    }

    @NotNull
    public String toString() {
        return "AlipayPostBody(app_code=" + this.app_code + ", authChannelType=" + this.authChannelType + ')';
    }
}
