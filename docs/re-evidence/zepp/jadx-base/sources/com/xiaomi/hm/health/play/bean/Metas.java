package com.xiaomi.hm.health.play.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J@\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/Metas;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", Constants.GIF_PATH, "recentMark", "minFwVersion", "transparentBg", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/hm/health/play/bean/Metas;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getGif", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRecentMark", "getMinFwVersion", "getTransparentBg", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Metas {

    @Nullable
    private final String gif;

    @SerializedName("minimum_firmware_version")
    @Nullable
    private final String minFwVersion;

    @SerializedName("recent_mark")
    @Nullable
    private final Integer recentMark;

    @SerializedName("transparent_background")
    @Nullable
    private final String transparentBg;

    public Metas(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3) {
        this.gif = str;
        this.recentMark = num;
        this.minFwVersion = str2;
        this.transparentBg = str3;
    }

    public static /* synthetic */ Metas copy$default(Metas metas, String str, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metas.gif;
        }
        if ((i & 2) != 0) {
            num = metas.recentMark;
        }
        if ((i & 4) != 0) {
            str2 = metas.minFwVersion;
        }
        if ((i & 8) != 0) {
            str3 = metas.transparentBg;
        }
        return metas.copy(str, num, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRecentMark() {
        return this.recentMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMinFwVersion() {
        return this.minFwVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransparentBg() {
        return this.transparentBg;
    }

    @NotNull
    public final Metas copy(@Nullable String gif, @Nullable Integer recentMark, @Nullable String minFwVersion, @Nullable String transparentBg) {
        return new Metas(gif, recentMark, minFwVersion, transparentBg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metas)) {
            return false;
        }
        Metas metas = (Metas) other;
        return Intrinsics.areEqual(this.gif, metas.gif) && Intrinsics.areEqual(this.recentMark, metas.recentMark) && Intrinsics.areEqual(this.minFwVersion, metas.minFwVersion) && Intrinsics.areEqual(this.transparentBg, metas.transparentBg);
    }

    @Nullable
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    public final String getMinFwVersion() {
        return this.minFwVersion;
    }

    @Nullable
    public final Integer getRecentMark() {
        return this.recentMark;
    }

    @Nullable
    public final String getTransparentBg() {
        return this.transparentBg;
    }

    public int hashCode() {
        String str = this.gif;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.recentMark;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.minFwVersion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transparentBg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Metas(gif=" + this.gif + ", recentMark=" + this.recentMark + ", minFwVersion=" + this.minFwVersion + ", transparentBg=" + this.transparentBg + ")";
    }
}
