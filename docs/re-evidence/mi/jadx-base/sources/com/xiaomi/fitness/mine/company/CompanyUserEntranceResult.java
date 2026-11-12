package com.xiaomi.fitness.mine.company;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/mine/company/CompanyUserEntranceResult;", "", "show", "", "jumpUrl", "", q.f13858b, "", "<init>", "(ZLjava/lang/String;J)V", "getShow", "()Z", "getJumpUrl", "()Ljava/lang/String;", "getAppId", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CompanyUserEntranceResult {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName("jump_url")
    @NotNull
    private final String jumpUrl;

    @SerializedName("show")
    private final boolean show;

    public CompanyUserEntranceResult(boolean z, @NotNull String jumpUrl, long j) {
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        this.show = z;
        this.jumpUrl = jumpUrl;
        this.appId = j;
    }

    public static /* synthetic */ CompanyUserEntranceResult copy$default(CompanyUserEntranceResult companyUserEntranceResult, boolean z, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = companyUserEntranceResult.show;
        }
        if ((i & 2) != 0) {
            str = companyUserEntranceResult.jumpUrl;
        }
        if ((i & 4) != 0) {
            j = companyUserEntranceResult.appId;
        }
        return companyUserEntranceResult.copy(z, str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final CompanyUserEntranceResult copy(boolean show, @NotNull String jumpUrl, long appId) {
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        return new CompanyUserEntranceResult(show, jumpUrl, appId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyUserEntranceResult)) {
            return false;
        }
        CompanyUserEntranceResult companyUserEntranceResult = (CompanyUserEntranceResult) other;
        return this.show == companyUserEntranceResult.show && Intrinsics.areEqual(this.jumpUrl, companyUserEntranceResult.jumpUrl) && this.appId == companyUserEntranceResult.appId;
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.show) * 31) + this.jumpUrl.hashCode()) * 31) + Long.hashCode(this.appId);
    }

    @NotNull
    public String toString() {
        return "CompanyUserEntranceResult(show=" + this.show + ", jumpUrl=" + this.jumpUrl + ", appId=" + this.appId + ")";
    }
}
