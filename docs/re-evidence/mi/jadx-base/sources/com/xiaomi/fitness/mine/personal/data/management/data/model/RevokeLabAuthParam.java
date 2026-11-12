package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/RevokeLabAuthParam;", "", q.f13858b, "", "sid", "", "<init>", "(JLjava/lang/String;)V", "getAppId", "()J", "getSid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RevokeLabAuthParam {

    @SerializedName(g.d)
    private final long appId;

    @SerializedName("sid")
    @Nullable
    private final String sid;

    public RevokeLabAuthParam(long j, @Nullable String str) {
        this.appId = j;
        this.sid = str;
    }

    public static /* synthetic */ RevokeLabAuthParam copy$default(RevokeLabAuthParam revokeLabAuthParam, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = revokeLabAuthParam.appId;
        }
        if ((i & 2) != 0) {
            str = revokeLabAuthParam.sid;
        }
        return revokeLabAuthParam.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final RevokeLabAuthParam copy(long appId, @Nullable String sid) {
        return new RevokeLabAuthParam(appId, sid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevokeLabAuthParam)) {
            return false;
        }
        RevokeLabAuthParam revokeLabAuthParam = (RevokeLabAuthParam) other;
        return this.appId == revokeLabAuthParam.appId && Intrinsics.areEqual(this.sid, revokeLabAuthParam.sid);
    }

    public final long getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.appId) * 31;
        String str = this.sid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "RevokeLabAuthParam(appId=" + this.appId + ", sid=" + this.sid + ")";
    }
}
