package com.xiaomi.fitness.membership.export.data;

import com.facebook.react.modules.appstate.AppStateModule;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "", AppStateModule.APP_STATE_ACTIVE, "", "type", "", "days", "expiredAt", "", "deprecatedMember", Feature.WATCHFACE, "<init>", "(ZIILjava/lang/String;ZZ)V", "getActive", "()Z", "getType", "()I", "getDays", "getExpiredAt", "()Ljava/lang/String;", "getDeprecatedMember", "getWatchface", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipInfo {
    public static final int TYPE_DEDUCT = 1;
    public static final int TYPE_PAY = 0;
    private final boolean active;
    private final int days;

    @SerializedName("deprecated_member")
    private final boolean deprecatedMember;

    @SerializedName("expired_at")
    @NotNull
    private final String expiredAt;
    private final int type;
    private final boolean watchface;

    public VipInfo(boolean z, int i, int i2, @NotNull String expiredAt, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(expiredAt, "expiredAt");
        this.active = z;
        this.type = i;
        this.days = i2;
        this.expiredAt = expiredAt;
        this.deprecatedMember = z2;
        this.watchface = z3;
    }

    public static /* synthetic */ VipInfo copy$default(VipInfo vipInfo, boolean z, int i, int i2, String str, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = vipInfo.active;
        }
        if ((i3 & 2) != 0) {
            i = vipInfo.type;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = vipInfo.days;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = vipInfo.expiredAt;
        }
        String str2 = str;
        if ((i3 & 16) != 0) {
            z2 = vipInfo.deprecatedMember;
        }
        boolean z4 = z2;
        if ((i3 & 32) != 0) {
            z3 = vipInfo.watchface;
        }
        return vipInfo.copy(z, i4, i5, str2, z4, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDeprecatedMember() {
        return this.deprecatedMember;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getWatchface() {
        return this.watchface;
    }

    @NotNull
    public final VipInfo copy(boolean active, int type, int days, @NotNull String expiredAt, boolean deprecatedMember, boolean watchface) {
        Intrinsics.checkNotNullParameter(expiredAt, "expiredAt");
        return new VipInfo(active, type, days, expiredAt, deprecatedMember, watchface);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipInfo)) {
            return false;
        }
        VipInfo vipInfo = (VipInfo) other;
        return this.active == vipInfo.active && this.type == vipInfo.type && this.days == vipInfo.days && Intrinsics.areEqual(this.expiredAt, vipInfo.expiredAt) && this.deprecatedMember == vipInfo.deprecatedMember && this.watchface == vipInfo.watchface;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final int getDays() {
        return this.days;
    }

    public final boolean getDeprecatedMember() {
        return this.deprecatedMember;
    }

    @NotNull
    public final String getExpiredAt() {
        return this.expiredAt;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean getWatchface() {
        return this.watchface;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.active) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.days)) * 31) + this.expiredAt.hashCode()) * 31) + Boolean.hashCode(this.deprecatedMember)) * 31) + Boolean.hashCode(this.watchface);
    }

    @NotNull
    public String toString() {
        return "VipInfo(active=" + this.active + ", type=" + this.type + ", days=" + this.days + ", expiredAt=" + this.expiredAt + ", deprecatedMember=" + this.deprecatedMember + ", watchface=" + this.watchface + ")";
    }
}
