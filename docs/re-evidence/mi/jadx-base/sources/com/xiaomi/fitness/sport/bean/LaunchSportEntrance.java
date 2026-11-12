package com.xiaomi.fitness.sport.bean;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport/bean/LaunchSportEntrance;", "", DailyRecordKey.sportType, "", "sportLogoResId", "bgImageResId", "title", "", "tag", "tagImageResId", "<init>", "(IIILjava/lang/String;Ljava/lang/String;I)V", "getSportType", "()I", "getSportLogoResId", "getBgImageResId", "getTitle", "()Ljava/lang/String;", "getTag", "getTagImageResId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LaunchSportEntrance {
    private final int bgImageResId;
    private final int sportLogoResId;
    private final int sportType;

    @NotNull
    private final String tag;
    private final int tagImageResId;

    @NotNull
    private final String title;

    public LaunchSportEntrance(int i, int i2, int i3, @NotNull String title, @NotNull String tag, int i4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.sportType = i;
        this.sportLogoResId = i2;
        this.bgImageResId = i3;
        this.title = title;
        this.tag = tag;
        this.tagImageResId = i4;
    }

    public static /* synthetic */ LaunchSportEntrance copy$default(LaunchSportEntrance launchSportEntrance, int i, int i2, int i3, String str, String str2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = launchSportEntrance.sportType;
        }
        if ((i5 & 2) != 0) {
            i2 = launchSportEntrance.sportLogoResId;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = launchSportEntrance.bgImageResId;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            str = launchSportEntrance.title;
        }
        String str3 = str;
        if ((i5 & 16) != 0) {
            str2 = launchSportEntrance.tag;
        }
        String str4 = str2;
        if ((i5 & 32) != 0) {
            i4 = launchSportEntrance.tagImageResId;
        }
        return launchSportEntrance.copy(i, i6, i7, str3, str4, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportType() {
        return this.sportType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportLogoResId() {
        return this.sportLogoResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBgImageResId() {
        return this.bgImageResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTagImageResId() {
        return this.tagImageResId;
    }

    @NotNull
    public final LaunchSportEntrance copy(int sportType, int sportLogoResId, int bgImageResId, @NotNull String title, @NotNull String tag, int tagImageResId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new LaunchSportEntrance(sportType, sportLogoResId, bgImageResId, title, tag, tagImageResId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchSportEntrance)) {
            return false;
        }
        LaunchSportEntrance launchSportEntrance = (LaunchSportEntrance) other;
        return this.sportType == launchSportEntrance.sportType && this.sportLogoResId == launchSportEntrance.sportLogoResId && this.bgImageResId == launchSportEntrance.bgImageResId && Intrinsics.areEqual(this.title, launchSportEntrance.title) && Intrinsics.areEqual(this.tag, launchSportEntrance.tag) && this.tagImageResId == launchSportEntrance.tagImageResId;
    }

    public final int getBgImageResId() {
        return this.bgImageResId;
    }

    public final int getSportLogoResId() {
        return this.sportLogoResId;
    }

    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getTagImageResId() {
        return this.tagImageResId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.sportType) * 31) + Integer.hashCode(this.sportLogoResId)) * 31) + Integer.hashCode(this.bgImageResId)) * 31) + this.title.hashCode()) * 31) + this.tag.hashCode()) * 31) + Integer.hashCode(this.tagImageResId);
    }

    @NotNull
    public String toString() {
        return "LaunchSportEntrance(sportType=" + this.sportType + ", sportLogoResId=" + this.sportLogoResId + ", bgImageResId=" + this.bgImageResId + ", title=" + this.title + ", tag=" + this.tag + ", tagImageResId=" + this.tagImageResId + ")";
    }

    public /* synthetic */ LaunchSportEntrance(int i, int i2, int i3, String str, String str2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) == 0 ? str2 : "", (i5 & 32) == 0 ? i4 : 0);
    }
}
