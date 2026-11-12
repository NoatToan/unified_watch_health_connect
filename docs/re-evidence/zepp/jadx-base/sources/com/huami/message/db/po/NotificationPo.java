package com.huami.message.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Entity(indices = {@Index(unique = true, value = {WebConst.QueryParam.MESSAGE_ID})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bR\u0010SJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003JÀ\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0002HÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0007R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bE\u0010;R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010;R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bI\u0010;R\u001b\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bK\u0010;R\u001b\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bM\u0010;R\u001b\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010;R\u001b\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bQ\u0010;¨\u0006T"}, d2 = {"Lcom/huami/message/db/po/NotificationPo;", "", "", "component1", "", "component2", "component3", "()Ljava/lang/Long;", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "id", WebConst.QueryParam.MESSAGE_ID, "generateTime", "iconUrl", "groupExType", "status", "text", "title", "subTypeName", "typeName", "jumpType", "url", "pushUrl", WebConst.QueryParam.NOTICE_TYPE, "subType", "copy", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/message/db/po/NotificationPo;", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getId", "()I", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.SET_ID, "(I)V", "b", "J", "getMessageId", "()J", "c", "Ljava/lang/Long;", "getGenerateTime", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", "e", "getGroupExType", "f", "getStatus", "g", "getText", "h", "getTitle", "i", "getSubTypeName", z.j, "getTypeName", hl.k, "getJumpType", "l", "getUrl", "m", "getPushUrl", GoogleApiAvailabilityLight.b, "getNoticeType", "o", "getSubType", "<init>", "(IJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NotificationPo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    private int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String groupExType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String status;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subTypeName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String typeName;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String jumpType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String pushUrl;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final String noticeType;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    public NotificationPo(int i, long j, @Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.id = i;
        this.messageId = j;
        this.generateTime = l;
        this.iconUrl = str;
        this.groupExType = str2;
        this.status = str3;
        this.text = str4;
        this.title = str5;
        this.subTypeName = str6;
        this.typeName = str7;
        this.jumpType = str8;
        this.url = str9;
        this.pushUrl = str10;
        this.noticeType = str11;
        this.subType = str12;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupExType() {
        return this.groupExType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @NotNull
    public final NotificationPo copy(int id, long messageId, @Nullable Long generateTime, @Nullable String iconUrl, @Nullable String groupExType, @Nullable String status, @Nullable String text, @Nullable String title, @Nullable String subTypeName, @Nullable String typeName, @Nullable String jumpType, @Nullable String url, @Nullable String pushUrl, @Nullable String noticeType, @Nullable String subType) {
        return new NotificationPo(id, messageId, generateTime, iconUrl, groupExType, status, text, title, subTypeName, typeName, jumpType, url, pushUrl, noticeType, subType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationPo)) {
            return false;
        }
        NotificationPo notificationPo = (NotificationPo) other;
        return this.id == notificationPo.id && this.messageId == notificationPo.messageId && Intrinsics.areEqual(this.generateTime, notificationPo.generateTime) && Intrinsics.areEqual(this.iconUrl, notificationPo.iconUrl) && Intrinsics.areEqual(this.groupExType, notificationPo.groupExType) && Intrinsics.areEqual(this.status, notificationPo.status) && Intrinsics.areEqual(this.text, notificationPo.text) && Intrinsics.areEqual(this.title, notificationPo.title) && Intrinsics.areEqual(this.subTypeName, notificationPo.subTypeName) && Intrinsics.areEqual(this.typeName, notificationPo.typeName) && Intrinsics.areEqual(this.jumpType, notificationPo.jumpType) && Intrinsics.areEqual(this.url, notificationPo.url) && Intrinsics.areEqual(this.pushUrl, notificationPo.pushUrl) && Intrinsics.areEqual(this.noticeType, notificationPo.noticeType) && Intrinsics.areEqual(this.subType, notificationPo.subType);
    }

    @Nullable
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    public final String getGroupExType() {
        return this.groupExType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpType() {
        return this.jumpType;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iA = ((this.id * 31) + b.a(this.messageId)) * 31;
        Long l = this.generateTime;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.iconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupExType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subTypeName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.typeName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.jumpType;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pushUrl;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.noticeType;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.subType;
        return iHashCode12 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public String toString() {
        return "NotificationPo(id=" + this.id + ", messageId=" + this.messageId + ", generateTime=" + this.generateTime + ", iconUrl=" + ((Object) this.iconUrl) + ", groupExType=" + ((Object) this.groupExType) + ", status=" + ((Object) this.status) + ", text=" + ((Object) this.text) + ", title=" + ((Object) this.title) + ", subTypeName=" + ((Object) this.subTypeName) + ", typeName=" + ((Object) this.typeName) + ", jumpType=" + ((Object) this.jumpType) + ", url=" + ((Object) this.url) + ", pushUrl=" + ((Object) this.pushUrl) + ", noticeType=" + ((Object) this.noticeType) + ", subType=" + ((Object) this.subType) + ')';
    }

    public /* synthetic */ NotificationPo(int i, long j, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, j, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? null : str11, (i2 & 16384) != 0 ? null : str12);
    }
}
