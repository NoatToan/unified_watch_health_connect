package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JR\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "", q.f13858b, "", "appIcon", "", "appName", "thirdPartyType", "", CloudContract.COL_TENANT_ID, "jumpLink", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getAppId", "()J", "getAppIcon", "()Ljava/lang/String;", "getAppName", "getThirdPartyType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTenantId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getJumpLink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "equals", "", "other", "hashCode", "toString", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class App {

    @SerializedName("app_icon")
    @Nullable
    private final String appIcon;

    @SerializedName(g.d)
    private final long appId;

    @SerializedName(FeedbackConstants.KEY_APP_NAME)
    @NotNull
    private final String appName;

    @SerializedName("jump_link")
    @Nullable
    private final String jumpLink;

    @SerializedName(PersonalDataManagementExtKt.PARAM_TENANT_ID)
    @Nullable
    private final Long tenantId;

    @SerializedName(PersonalDataManagementExtKt.PARAM_THIRD_PARTY_TYPE)
    @Nullable
    private final Integer thirdPartyType;

    public App(long j, @Nullable String str, @NotNull String appName, @Nullable Integer num, @Nullable Long l, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.appId = j;
        this.appIcon = str;
        this.appName = appName;
        this.thirdPartyType = num;
        this.tenantId = l;
        this.jumpLink = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getThirdPartyType() {
        return this.thirdPartyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTenantId() {
        return this.tenantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @NotNull
    public final App copy(long appId, @Nullable String appIcon, @NotNull String appName, @Nullable Integer thirdPartyType, @Nullable Long tenantId, @Nullable String jumpLink) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new App(appId, appIcon, appName, thirdPartyType, tenantId, jumpLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        return this.appId == app.appId && Intrinsics.areEqual(this.appIcon, app.appIcon) && Intrinsics.areEqual(this.appName, app.appName) && Intrinsics.areEqual(this.thirdPartyType, app.thirdPartyType) && Intrinsics.areEqual(this.tenantId, app.tenantId) && Intrinsics.areEqual(this.jumpLink, app.jumpLink);
    }

    @Nullable
    public final String getAppIcon() {
        return this.appIcon;
    }

    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @Nullable
    public final Long getTenantId() {
        return this.tenantId;
    }

    @Nullable
    public final Integer getThirdPartyType() {
        return this.thirdPartyType;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.appId) * 31;
        String str = this.appIcon;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.appName.hashCode()) * 31;
        Integer num = this.thirdPartyType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.tenantId;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.jumpLink;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "App(appId=" + this.appId + ", appIcon=" + this.appIcon + ", appName=" + this.appName + ", thirdPartyType=" + this.thirdPartyType + ", tenantId=" + this.tenantId + ", jumpLink=" + this.jumpLink + ")";
    }

    public /* synthetic */ App(long j, String str, String str2, Integer num, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : str3);
    }
}
