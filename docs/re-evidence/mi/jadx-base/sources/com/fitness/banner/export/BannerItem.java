package com.fitness.banner.export;

import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.TrackContent;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.onetrack.c.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010O\u001a\u00020\rHÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010(J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0015HÆ\u0003Jº\u0001\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020\u00152\b\u0010Z\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010[\u001a\u00020\u0003HÖ\u0001J\t\u0010\\\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0015X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R\u001c\u00107\u001a\u0004\u0018\u00010\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u00103R,\u0010:\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010;X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010A\u001a\u00020B8VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006]"}, d2 = {"Lcom/fitness/banner/export/BannerItem;", "Lcom/example/statistics/export/TrackContent;", "id", "", CardInfo.KEY_CARD_GROUP_ID, OneTrackExtKt.KEY_BUSINESS, "", "mainTitle", "iconHead", "jumpSource", "createOperator", "updateOperator", "createTime", "", "changeTime", "startTime", "endTime", "expGroupId", "expParams", "expLayerName", "smallImage", "", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getGroupId", "getBusiness", "()Ljava/lang/String;", "getMainTitle", "getIconHead", "getJumpSource", "getCreateOperator", "getUpdateOperator", "getCreateTime", "()J", "getChangeTime", "getStartTime", "getEndTime", "getExpGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpParams", "getExpLayerName", "getSmallImage", "()Z", "setSmallImage", "(Z)V", "key", "getKey", "setKey", "(Ljava/lang/String;)V", "repeatEnable", "getRepeatEnable", "setRepeatEnable", i.d, "getEventName", "setEventName", "params", "", "", "getParams", "()Ljava/util/Map;", "setParams", "(Ljava/util/Map;)V", "exposePercent", "", "getExposePercent", "()F", "setExposePercent", "(F)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)Lcom/fitness/banner/export/BannerItem;", "equals", "other", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerItem implements TrackContent {

    @Nullable
    private final String business;
    private final long changeTime;

    @Nullable
    private final String createOperator;
    private final long createTime;
    private final long endTime;

    @Nullable
    private String eventName;

    @Nullable
    private final Long expGroupId;

    @Nullable
    private final String expLayerName;

    @Nullable
    private final String expParams;
    private float exposePercent;
    private final int groupId;

    @NotNull
    private final String iconHead;
    private final int id;

    @NotNull
    private final String jumpSource;

    @Nullable
    private String key;

    @NotNull
    private final String mainTitle;

    @Nullable
    private Map<String, ? extends Object> params;
    private boolean repeatEnable;
    private boolean smallImage;
    private final long startTime;

    @Nullable
    private final String updateOperator;

    public BannerItem(int i, int i2, @Nullable String str, @NotNull String mainTitle, @NotNull String iconHead, @NotNull String jumpSource, @Nullable String str2, @Nullable String str3, long j, long j2, long j3, long j4, @Nullable Long l, @Nullable String str4, @Nullable String str5, boolean z) {
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        Intrinsics.checkNotNullParameter(iconHead, "iconHead");
        Intrinsics.checkNotNullParameter(jumpSource, "jumpSource");
        this.id = i;
        this.groupId = i2;
        this.business = str;
        this.mainTitle = mainTitle;
        this.iconHead = iconHead;
        this.jumpSource = jumpSource;
        this.createOperator = str2;
        this.updateOperator = str3;
        this.createTime = j;
        this.changeTime = j2;
        this.startTime = j3;
        this.endTime = j4;
        this.expGroupId = l;
        this.expParams = str4;
        this.expLayerName = str5;
        this.smallImage = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getChangeTime() {
        return this.changeTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getExpGroupId() {
        return this.expGroupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getExpParams() {
        return this.expParams;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExpLayerName() {
        return this.expLayerName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getSmallImage() {
        return this.smallImage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getGroupId() {
        return this.groupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBusiness() {
        return this.business;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconHead() {
        return this.iconHead;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJumpSource() {
        return this.jumpSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreateOperator() {
        return this.createOperator;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpdateOperator() {
        return this.updateOperator;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final BannerItem copy(int id, int groupId, @Nullable String business, @NotNull String mainTitle, @NotNull String iconHead, @NotNull String jumpSource, @Nullable String createOperator, @Nullable String updateOperator, long createTime, long changeTime, long startTime, long endTime, @Nullable Long expGroupId, @Nullable String expParams, @Nullable String expLayerName, boolean smallImage) {
        Intrinsics.checkNotNullParameter(mainTitle, "mainTitle");
        Intrinsics.checkNotNullParameter(iconHead, "iconHead");
        Intrinsics.checkNotNullParameter(jumpSource, "jumpSource");
        return new BannerItem(id, groupId, business, mainTitle, iconHead, jumpSource, createOperator, updateOperator, createTime, changeTime, startTime, endTime, expGroupId, expParams, expLayerName, smallImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerItem)) {
            return false;
        }
        BannerItem bannerItem = (BannerItem) other;
        return this.id == bannerItem.id && this.groupId == bannerItem.groupId && Intrinsics.areEqual(this.business, bannerItem.business) && Intrinsics.areEqual(this.mainTitle, bannerItem.mainTitle) && Intrinsics.areEqual(this.iconHead, bannerItem.iconHead) && Intrinsics.areEqual(this.jumpSource, bannerItem.jumpSource) && Intrinsics.areEqual(this.createOperator, bannerItem.createOperator) && Intrinsics.areEqual(this.updateOperator, bannerItem.updateOperator) && this.createTime == bannerItem.createTime && this.changeTime == bannerItem.changeTime && this.startTime == bannerItem.startTime && this.endTime == bannerItem.endTime && Intrinsics.areEqual(this.expGroupId, bannerItem.expGroupId) && Intrinsics.areEqual(this.expParams, bannerItem.expParams) && Intrinsics.areEqual(this.expLayerName, bannerItem.expLayerName) && this.smallImage == bannerItem.smallImage;
    }

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    public final long getChangeTime() {
        return this.changeTime;
    }

    @Nullable
    public final String getCreateOperator() {
        return this.createOperator;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @Nullable
    public final Long getExpGroupId() {
        return this.expGroupId;
    }

    @Nullable
    public final String getExpLayerName() {
        return this.expLayerName;
    }

    @Nullable
    public final String getExpParams() {
        return this.expParams;
    }

    @Override // com.example.statistics.export.TrackContent
    public float getExposePercent() {
        float f = this.exposePercent;
        if (f <= 0.0f) {
            return 0.6666667f;
        }
        return f;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getIconHead() {
        return this.iconHead;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getJumpSource() {
        return this.jumpSource;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public String getKey() {
        return this.key;
    }

    @NotNull
    public final String getMainTitle() {
        return this.mainTitle;
    }

    @Override // com.example.statistics.export.TrackContent
    @Nullable
    public Map<String, Object> getParams() {
        return this.params;
    }

    @Override // com.example.statistics.export.TrackContent
    public boolean getRepeatEnable() {
        return this.repeatEnable;
    }

    public final boolean getSmallImage() {
        return this.smallImage;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getUpdateOperator() {
        return this.updateOperator;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.groupId)) * 31;
        String str = this.business;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.mainTitle.hashCode()) * 31) + this.iconHead.hashCode()) * 31) + this.jumpSource.hashCode()) * 31;
        String str2 = this.createOperator;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updateOperator;
        int iHashCode4 = (((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.changeTime)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        Long l = this.expGroupId;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.expParams;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expLayerName;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.smallImage);
    }

    @Override // com.example.statistics.export.TrackContent
    public void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setExposePercent(float f) {
        this.exposePercent = f;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setKey(@Nullable String str) {
        this.key = str;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setParams(@Nullable Map<String, ? extends Object> map) {
        this.params = map;
    }

    @Override // com.example.statistics.export.TrackContent
    public void setRepeatEnable(boolean z) {
        this.repeatEnable = z;
    }

    public final void setSmallImage(boolean z) {
        this.smallImage = z;
    }

    @NotNull
    public String toString() {
        return "BannerItem(id=" + this.id + ", groupId=" + this.groupId + ", business=" + this.business + ", mainTitle=" + this.mainTitle + ", iconHead=" + this.iconHead + ", jumpSource=" + this.jumpSource + ", createOperator=" + this.createOperator + ", updateOperator=" + this.updateOperator + ", createTime=" + this.createTime + ", changeTime=" + this.changeTime + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", expGroupId=" + this.expGroupId + ", expParams=" + this.expParams + ", expLayerName=" + this.expLayerName + ", smallImage=" + this.smallImage + ")";
    }

    public /* synthetic */ BannerItem(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, long j4, Long l, String str7, String str8, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, str2, str3, str4, str5, str6, j, j2, j3, j4, l, str7, str8, (i3 & 32768) != 0 ? false : z);
    }
}
