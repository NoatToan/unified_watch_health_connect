package com.xiaomi.fitness.aivs.request.model;

import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/UserCredentialScopeResp;", "", "status", "", "error", "", XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION_2, "code", "scope", "", "Lcom/xiaomi/fitness/aivs/request/model/Scope;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getStatus", "()Ljava/lang/String;", "getError", "()I", "getError_description", "getCode", "getScope", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserCredentialScopeResp {

    @NotNull
    private final String code;
    private final int error;

    @NotNull
    private final String error_description;

    @NotNull
    private final List<Scope> scope;

    @NotNull
    private final String status;

    public UserCredentialScopeResp(@NotNull String status, int i, @NotNull String error_description, @NotNull String code, @NotNull List<Scope> scope) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.status = status;
        this.error = i;
        this.error_description = error_description;
        this.code = code;
        this.scope = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserCredentialScopeResp copy$default(UserCredentialScopeResp userCredentialScopeResp, String str, int i, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userCredentialScopeResp.status;
        }
        if ((i2 & 2) != 0) {
            i = userCredentialScopeResp.error;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = userCredentialScopeResp.error_description;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = userCredentialScopeResp.code;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            list = userCredentialScopeResp.scope;
        }
        return userCredentialScopeResp.copy(str, i3, str4, str5, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getError() {
        return this.error;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_description() {
        return this.error_description;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final List<Scope> component5() {
        return this.scope;
    }

    @NotNull
    public final UserCredentialScopeResp copy(@NotNull String status, int error, @NotNull String error_description, @NotNull String code, @NotNull List<Scope> scope) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(error_description, "error_description");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new UserCredentialScopeResp(status, error, error_description, code, scope);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCredentialScopeResp)) {
            return false;
        }
        UserCredentialScopeResp userCredentialScopeResp = (UserCredentialScopeResp) other;
        return Intrinsics.areEqual(this.status, userCredentialScopeResp.status) && this.error == userCredentialScopeResp.error && Intrinsics.areEqual(this.error_description, userCredentialScopeResp.error_description) && Intrinsics.areEqual(this.code, userCredentialScopeResp.code) && Intrinsics.areEqual(this.scope, userCredentialScopeResp.scope);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getError() {
        return this.error;
    }

    @NotNull
    public final String getError_description() {
        return this.error_description;
    }

    @NotNull
    public final List<Scope> getScope() {
        return this.scope;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.status.hashCode() * 31) + Integer.hashCode(this.error)) * 31) + this.error_description.hashCode()) * 31) + this.code.hashCode()) * 31) + this.scope.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserCredentialScopeResp(status=" + this.status + ", error=" + this.error + ", error_description=" + this.error_description + ", code=" + this.code + ", scope=" + this.scope + ")";
    }
}
