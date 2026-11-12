package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/Scope;", "", "scopeId", "", "authStatus", "", "<init>", "(Ljava/lang/String;I)V", "getScopeId", "()Ljava/lang/String;", "getAuthStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Scope {

    @SerializedName("auth_status")
    private final int authStatus;

    @SerializedName("scope_id")
    @NotNull
    private final String scopeId;

    public Scope(@NotNull String scopeId, int i) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        this.scopeId = scopeId;
        this.authStatus = i;
    }

    public static /* synthetic */ Scope copy$default(Scope scope, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scope.scopeId;
        }
        if ((i2 & 2) != 0) {
            i = scope.authStatus;
        }
        return scope.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScopeId() {
        return this.scopeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final Scope copy(@NotNull String scopeId, int authStatus) {
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        return new Scope(scopeId, authStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scope)) {
            return false;
        }
        Scope scope = (Scope) other;
        return Intrinsics.areEqual(this.scopeId, scope.scopeId) && this.authStatus == scope.authStatus;
    }

    public final int getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final String getScopeId() {
        return this.scopeId;
    }

    public int hashCode() {
        return (this.scopeId.hashCode() * 31) + Integer.hashCode(this.authStatus);
    }

    @NotNull
    public String toString() {
        return "Scope(scopeId=" + this.scopeId + ", authStatus=" + this.authStatus + ")";
    }
}
