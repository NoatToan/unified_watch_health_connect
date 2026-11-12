package com.xiaomi.fitness.mine.company;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mine/company/AuthInfo;", "", q.f13858b, "", "status", "", "<init>", "(JI)V", "getAppId", "()J", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthInfo {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName("status")
    private final int status;

    public AuthInfo(long j, int i) {
        this.appId = j;
        this.status = i;
    }

    public static /* synthetic */ AuthInfo copy$default(AuthInfo authInfo, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = authInfo.appId;
        }
        if ((i2 & 2) != 0) {
            i = authInfo.status;
        }
        return authInfo.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final AuthInfo copy(long appId, int status) {
        return new AuthInfo(appId, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthInfo)) {
            return false;
        }
        AuthInfo authInfo = (AuthInfo) other;
        return this.appId == authInfo.appId && this.status == authInfo.status;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (Long.hashCode(this.appId) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "AuthInfo(appId=" + this.appId + ", status=" + this.status + ")";
    }
}
