package com.xiaomi.hm.health.bt.profile.auth.errorcode;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthResult;", "", "", "component1", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "component2", "originCode", "authError", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getOriginCode", "()I", "setOriginCode", "(I)V", "b", "Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "getAuthError", "()Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;", "setAuthError", "(Lcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;)V", "<init>", "(ILcom/xiaomi/hm/health/bt/profile/auth/errorcode/AuthError;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AuthResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int originCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private AuthError authError;

    public AuthResult(int i, @NotNull AuthError authError) {
        this.originCode = i;
        this.authError = authError;
    }

    public static /* synthetic */ AuthResult copy$default(AuthResult authResult, int i, AuthError authError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = authResult.originCode;
        }
        if ((i2 & 2) != 0) {
            authError = authResult.authError;
        }
        return authResult.copy(i, authError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOriginCode() {
        return this.originCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AuthError getAuthError() {
        return this.authError;
    }

    @NotNull
    public final AuthResult copy(int originCode, @NotNull AuthError authError) {
        return new AuthResult(originCode, authError);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) other;
        return this.originCode == authResult.originCode && Intrinsics.areEqual(this.authError, authResult.authError);
    }

    @NotNull
    public final AuthError getAuthError() {
        return this.authError;
    }

    public final int getOriginCode() {
        return this.originCode;
    }

    public int hashCode() {
        return (this.originCode * 31) + this.authError.hashCode();
    }

    public final void setAuthError(@NotNull AuthError authError) {
        this.authError = authError;
    }

    public final void setOriginCode(int i) {
        this.originCode = i;
    }

    @NotNull
    public String toString() {
        return "AuthResult(originCode=" + this.originCode + ", authError=" + this.authError + ')';
    }
}
