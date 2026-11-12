package com.huami.treadmill.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b%\u0010&J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JE\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/treadmill/data/TdLineDetail;", "", "", "component1", "component2", "component3", "component4", "Lcom/huami/treadmill/data/TdLineDetailRun;", "component5", "lineDetailAvatar", "lineDetailNickName", "lineDetailTrackId", "lineDetailUserId", "lineDetailRun", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getLineDetailAvatar", "()Ljava/lang/String;", "setLineDetailAvatar", "(Ljava/lang/String;)V", "getLineDetailNickName", "setLineDetailNickName", "getLineDetailTrackId", "setLineDetailTrackId", "getLineDetailUserId", "setLineDetailUserId", "Lcom/huami/treadmill/data/TdLineDetailRun;", "getLineDetailRun", "()Lcom/huami/treadmill/data/TdLineDetailRun;", "setLineDetailRun", "(Lcom/huami/treadmill/data/TdLineDetailRun;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/treadmill/data/TdLineDetailRun;)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TdLineDetail {

    @SerializedName(WebAPI.PARAM_SHARE_INVITE_AVATAR)
    @Nullable
    private String lineDetailAvatar;

    @SerializedName("nickName")
    @Nullable
    private String lineDetailNickName;

    @SerializedName("runDetail")
    @Nullable
    private TdLineDetailRun lineDetailRun;

    @SerializedName("trackId")
    @Nullable
    private String lineDetailTrackId;

    @SerializedName("userId")
    @Nullable
    private String lineDetailUserId;

    @JvmOverloads
    public TdLineDetail() {
        this(null, null, null, null, null, 31, null);
    }

    @JvmOverloads
    public TdLineDetail(@Nullable String str) {
        this(str, null, null, null, null, 30, null);
    }

    @JvmOverloads
    public TdLineDetail(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, null, null, 28, null);
    }

    @JvmOverloads
    public TdLineDetail(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(str, str2, str3, null, null, 24, null);
    }

    @JvmOverloads
    public TdLineDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this(str, str2, str3, str4, null, 16, null);
    }

    @JvmOverloads
    public TdLineDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable TdLineDetailRun tdLineDetailRun) {
        this.lineDetailAvatar = str;
        this.lineDetailNickName = str2;
        this.lineDetailTrackId = str3;
        this.lineDetailUserId = str4;
        this.lineDetailRun = tdLineDetailRun;
    }

    public static /* synthetic */ TdLineDetail copy$default(TdLineDetail tdLineDetail, String str, String str2, String str3, String str4, TdLineDetailRun tdLineDetailRun, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tdLineDetail.lineDetailAvatar;
        }
        if ((i & 2) != 0) {
            str2 = tdLineDetail.lineDetailNickName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = tdLineDetail.lineDetailTrackId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = tdLineDetail.lineDetailUserId;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            tdLineDetailRun = tdLineDetail.lineDetailRun;
        }
        return tdLineDetail.copy(str, str5, str6, str7, tdLineDetailRun);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLineDetailAvatar() {
        return this.lineDetailAvatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLineDetailNickName() {
        return this.lineDetailNickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLineDetailTrackId() {
        return this.lineDetailTrackId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLineDetailUserId() {
        return this.lineDetailUserId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TdLineDetailRun getLineDetailRun() {
        return this.lineDetailRun;
    }

    @NotNull
    public final TdLineDetail copy(@Nullable String lineDetailAvatar, @Nullable String lineDetailNickName, @Nullable String lineDetailTrackId, @Nullable String lineDetailUserId, @Nullable TdLineDetailRun lineDetailRun) {
        return new TdLineDetail(lineDetailAvatar, lineDetailNickName, lineDetailTrackId, lineDetailUserId, lineDetailRun);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TdLineDetail)) {
            return false;
        }
        TdLineDetail tdLineDetail = (TdLineDetail) other;
        return Intrinsics.areEqual(this.lineDetailAvatar, tdLineDetail.lineDetailAvatar) && Intrinsics.areEqual(this.lineDetailNickName, tdLineDetail.lineDetailNickName) && Intrinsics.areEqual(this.lineDetailTrackId, tdLineDetail.lineDetailTrackId) && Intrinsics.areEqual(this.lineDetailUserId, tdLineDetail.lineDetailUserId) && Intrinsics.areEqual(this.lineDetailRun, tdLineDetail.lineDetailRun);
    }

    @Nullable
    public final String getLineDetailAvatar() {
        return this.lineDetailAvatar;
    }

    @Nullable
    public final String getLineDetailNickName() {
        return this.lineDetailNickName;
    }

    @Nullable
    public final TdLineDetailRun getLineDetailRun() {
        return this.lineDetailRun;
    }

    @Nullable
    public final String getLineDetailTrackId() {
        return this.lineDetailTrackId;
    }

    @Nullable
    public final String getLineDetailUserId() {
        return this.lineDetailUserId;
    }

    public int hashCode() {
        String str = this.lineDetailAvatar;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lineDetailNickName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lineDetailTrackId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lineDetailUserId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TdLineDetailRun tdLineDetailRun = this.lineDetailRun;
        return iHashCode4 + (tdLineDetailRun != null ? tdLineDetailRun.hashCode() : 0);
    }

    public final void setLineDetailAvatar(@Nullable String str) {
        this.lineDetailAvatar = str;
    }

    public final void setLineDetailNickName(@Nullable String str) {
        this.lineDetailNickName = str;
    }

    public final void setLineDetailRun(@Nullable TdLineDetailRun tdLineDetailRun) {
        this.lineDetailRun = tdLineDetailRun;
    }

    public final void setLineDetailTrackId(@Nullable String str) {
        this.lineDetailTrackId = str;
    }

    public final void setLineDetailUserId(@Nullable String str) {
        this.lineDetailUserId = str;
    }

    @NotNull
    public String toString() {
        return "TdLineDetail(lineDetailAvatar=" + ((Object) this.lineDetailAvatar) + ", lineDetailNickName=" + ((Object) this.lineDetailNickName) + ", lineDetailTrackId=" + ((Object) this.lineDetailTrackId) + ", lineDetailUserId=" + ((Object) this.lineDetailUserId) + ", lineDetailRun=" + this.lineDetailRun + ')';
    }

    public /* synthetic */ TdLineDetail(String str, String str2, String str3, String str4, TdLineDetailRun tdLineDetailRun, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : tdLineDetailRun);
    }
}
