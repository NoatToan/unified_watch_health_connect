package com.huami.third.alipay;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/huami/third/alipay/AuthInfo;", "", "", "component1", "", "component2", "status", "authInfo", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "Ljava/lang/String;", "getAuthInfo", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class AuthInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("status")
    private final int status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("authInfo")
    @NotNull
    private final String authInfo;

    public AuthInfo(int i, @NotNull String str) {
        this.status = i;
        this.authInfo = str;
    }

    public static /* synthetic */ AuthInfo copy$default(AuthInfo authInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = authInfo.status;
        }
        if ((i2 & 2) != 0) {
            str = authInfo.authInfo;
        }
        return authInfo.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthInfo() {
        return this.authInfo;
    }

    @NotNull
    public final AuthInfo copy(int status, @NotNull String authInfo) {
        return new AuthInfo(status, authInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthInfo)) {
            return false;
        }
        AuthInfo authInfo = (AuthInfo) other;
        return this.status == authInfo.status && Intrinsics.areEqual(this.authInfo, authInfo.authInfo);
    }

    @NotNull
    public final String getAuthInfo() {
        return this.authInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.status * 31;
        String str = this.authInfo;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AuthInfo(status=" + this.status + ", authInfo=" + this.authInfo + ")";
    }
}
