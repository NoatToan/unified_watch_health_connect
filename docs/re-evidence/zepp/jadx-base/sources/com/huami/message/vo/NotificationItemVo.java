package com.huami.message.vo;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.huami.message.dto.MessageStatus;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B«\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\bM\u0010NJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¶\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020%HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0005R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b=\u00102\u001a\u0004\b>\u00104R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u00104R\u001b\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u00104R\u001b\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u00104¨\u0006O"}, d2 = {"Lcom/huami/message/vo/NotificationItemVo;", "", "", "component1", "component2", "()Ljava/lang/Long;", "", "component3", "component4", "Lcom/huami/message/dto/MessageStatus;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", WebConst.QueryParam.MESSAGE_ID, "generateTime", "iconUrl", "groupExType", "status", "text", "title", "subTypeName", "typeName", "jumpType", "pushUrl", "url", WebConst.QueryParam.NOTICE_TYPE, "subType", "copy", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/message/vo/NotificationItemVo;", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getMessageId", "()J", "b", "Ljava/lang/Long;", "getGenerateTime", "c", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getGroupExType", "e", "Lcom/huami/message/dto/MessageStatus;", "getStatus", "()Lcom/huami/message/dto/MessageStatus;", "f", "getText", "g", "getTitle", "h", "getSubTypeName", "i", "getTypeName", z.j, "getJumpType", hl.k, "getPushUrl", "l", "getUrl", "m", "getNoticeType", GoogleApiAvailabilityLight.b, "getSubType", "<init>", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NotificationItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Long generateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String groupExType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final MessageStatus status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String text;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subTypeName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String typeName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String jumpType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private final String pushUrl;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final String url;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    private final String noticeType;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subType;

    public NotificationItemVo(long j, @Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable MessageStatus messageStatus, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.messageId = j;
        this.generateTime = l;
        this.iconUrl = str;
        this.groupExType = str2;
        this.status = messageStatus;
        this.text = str3;
        this.title = str4;
        this.subTypeName = str5;
        this.typeName = str6;
        this.jumpType = str7;
        this.pushUrl = str8;
        this.url = str9;
        this.noticeType = str10;
        this.subType = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getJumpType() {
        return this.jumpType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPushUrl() {
        return this.pushUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNoticeType() {
        return this.noticeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGroupExType() {
        return this.groupExType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MessageStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubTypeName() {
        return this.subTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    public final NotificationItemVo copy(long messageId, @Nullable Long generateTime, @Nullable String iconUrl, @Nullable String groupExType, @Nullable MessageStatus status, @Nullable String text, @Nullable String title, @Nullable String subTypeName, @Nullable String typeName, @Nullable String jumpType, @Nullable String pushUrl, @Nullable String url, @Nullable String noticeType, @Nullable String subType) {
        return new NotificationItemVo(messageId, generateTime, iconUrl, groupExType, status, text, title, subTypeName, typeName, jumpType, pushUrl, url, noticeType, subType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationItemVo)) {
            return false;
        }
        NotificationItemVo notificationItemVo = (NotificationItemVo) other;
        return this.messageId == notificationItemVo.messageId && Intrinsics.areEqual(this.generateTime, notificationItemVo.generateTime) && Intrinsics.areEqual(this.iconUrl, notificationItemVo.iconUrl) && Intrinsics.areEqual(this.groupExType, notificationItemVo.groupExType) && this.status == notificationItemVo.status && Intrinsics.areEqual(this.text, notificationItemVo.text) && Intrinsics.areEqual(this.title, notificationItemVo.title) && Intrinsics.areEqual(this.subTypeName, notificationItemVo.subTypeName) && Intrinsics.areEqual(this.typeName, notificationItemVo.typeName) && Intrinsics.areEqual(this.jumpType, notificationItemVo.jumpType) && Intrinsics.areEqual(this.pushUrl, notificationItemVo.pushUrl) && Intrinsics.areEqual(this.url, notificationItemVo.url) && Intrinsics.areEqual(this.noticeType, notificationItemVo.noticeType) && Intrinsics.areEqual(this.subType, notificationItemVo.subType);
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
    public final MessageStatus getStatus() {
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
        int iA = b.a(this.messageId) * 31;
        Long l = this.generateTime;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.iconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupExType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessageStatus messageStatus = this.status;
        int iHashCode4 = (iHashCode3 + (messageStatus == null ? 0 : messageStatus.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subTypeName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.typeName;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.jumpType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pushUrl;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.url;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.noticeType;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.subType;
        return iHashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NotificationItemVo(messageId=" + this.messageId + ", generateTime=" + this.generateTime + ", iconUrl=" + ((Object) this.iconUrl) + ", groupExType=" + ((Object) this.groupExType) + ", status=" + this.status + ", text=" + ((Object) this.text) + ", title=" + ((Object) this.title) + ", subTypeName=" + ((Object) this.subTypeName) + ", typeName=" + ((Object) this.typeName) + ", jumpType=" + ((Object) this.jumpType) + ", pushUrl=" + ((Object) this.pushUrl) + ", url=" + ((Object) this.url) + ", noticeType=" + ((Object) this.noticeType) + ", subType=" + ((Object) this.subType) + ')';
    }

    public /* synthetic */ NotificationItemVo(long j, Long l, String str, String str2, MessageStatus messageStatus, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : messageStatus, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11);
    }
}
