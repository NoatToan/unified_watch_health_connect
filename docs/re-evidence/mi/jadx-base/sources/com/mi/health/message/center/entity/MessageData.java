package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import com.mi.health.message.center.entity.ExtraData;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.onetrack.b.m;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B©\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\b\u00104\u001a\u00020\fH\u0016J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ¶\u0001\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010H\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R \u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b+\u0010)R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u001e\u0010.\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006I"}, d2 = {"Lcom/mi/health/message/center/entity/MessageData;", "T", "Lcom/mi/health/message/center/entity/ExtraData;", "", "messageId", "", RnReportConst.ApiReport.PARAM_MODULE, "", "type", "receiverUId", "senderUId", "sid", "", "title", MiuiCursorConstants.CONTENT, "imgUrl", "extraData", "newStatus", "dataStatus", "createTime", "lastModifyTime", "<init>", "(JIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V", "getMessageId", "()J", "getModule", "()I", "getType", "getReceiverUId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSenderUId", "getSid", "()Ljava/lang/String;", "getTitle", "getContent", "getImgUrl", "getExtraData", "setExtraData", "(Ljava/lang/String;)V", "getNewStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDataStatus", "getCreateTime", "getLastModifyTime", "extraEntity", "getExtraEntity", "()Lcom/mi/health/message/center/entity/ExtraData;", "setExtraEntity", "(Lcom/mi/health/message/center/entity/ExtraData;)V", "Lcom/mi/health/message/center/entity/ExtraData;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)Lcom/mi/health/message/center/entity/MessageData;", "equals", "", "other", "hashCode", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MessageData<T extends ExtraData> {

    @SerializedName(MiuiCursorConstants.CONTENT)
    @Nullable
    private final String content;

    @SerializedName(MiuiCursorConstants.CREATE_TIME)
    @Nullable
    private final Long createTime;

    @SerializedName("data_status")
    @Nullable
    private final Integer dataStatus;

    @SerializedName("extra_data")
    @Nullable
    private String extraData;

    @Nullable
    private T extraEntity;

    @SerializedName("img_url")
    @Nullable
    private final String imgUrl;

    @SerializedName("last_modify")
    @Nullable
    private final Long lastModifyTime;

    @SerializedName("msg_id")
    private final long messageId;

    @SerializedName(RnReportConst.ApiReport.PARAM_MODULE)
    private final int module;

    @SerializedName("is_new")
    @Nullable
    private final Integer newStatus;

    @SerializedName("receiver")
    @Nullable
    private final Long receiverUId;

    @SerializedName(m.j)
    @Nullable
    private final Long senderUId;

    @SerializedName("sid")
    @Nullable
    private final String sid;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("type")
    private final int type;

    public MessageData() {
        this(0L, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getExtraData() {
        return this.extraData;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getNewStatus() {
        return this.newStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getDataStatus() {
        return this.dataStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getModule() {
        return this.module;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getReceiverUId() {
        return this.receiverUId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSenderUId() {
        return this.senderUId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @NotNull
    public final MessageData<T> copy(long messageId, int module, int type, @Nullable Long receiverUId, @Nullable Long senderUId, @Nullable String sid, @Nullable String title, @Nullable String content, @Nullable String imgUrl, @Nullable String extraData, @Nullable Integer newStatus, @Nullable Integer dataStatus, @Nullable Long createTime, @Nullable Long lastModifyTime) {
        return new MessageData<>(messageId, module, type, receiverUId, senderUId, sid, title, content, imgUrl, extraData, newStatus, dataStatus, createTime, lastModifyTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageData)) {
            return false;
        }
        MessageData messageData = (MessageData) other;
        return this.messageId == messageData.messageId && this.module == messageData.module && this.type == messageData.type && Intrinsics.areEqual(this.receiverUId, messageData.receiverUId) && Intrinsics.areEqual(this.senderUId, messageData.senderUId) && Intrinsics.areEqual(this.sid, messageData.sid) && Intrinsics.areEqual(this.title, messageData.title) && Intrinsics.areEqual(this.content, messageData.content) && Intrinsics.areEqual(this.imgUrl, messageData.imgUrl) && Intrinsics.areEqual(this.extraData, messageData.extraData) && Intrinsics.areEqual(this.newStatus, messageData.newStatus) && Intrinsics.areEqual(this.dataStatus, messageData.dataStatus) && Intrinsics.areEqual(this.createTime, messageData.createTime) && Intrinsics.areEqual(this.lastModifyTime, messageData.lastModifyTime);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Integer getDataStatus() {
        return this.dataStatus;
    }

    @Nullable
    public final String getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final T getExtraEntity() {
        return this.extraEntity;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final int getModule() {
        return this.module;
    }

    @Nullable
    public final Integer getNewStatus() {
        return this.newStatus;
    }

    @Nullable
    public final Long getReceiverUId() {
        return this.receiverUId;
    }

    @Nullable
    public final Long getSenderUId() {
        return this.senderUId;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.messageId) * 31) + Integer.hashCode(this.module)) * 31) + Integer.hashCode(this.type)) * 31;
        Long l = this.receiverUId;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.senderUId;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.sid;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imgUrl;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.extraData;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.newStatus;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.dataStatus;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.createTime;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.lastModifyTime;
        return iHashCode11 + (l4 != null ? l4.hashCode() : 0);
    }

    public final void setExtraData(@Nullable String str) {
        this.extraData = str;
    }

    public final void setExtraEntity(@Nullable T t) {
        this.extraEntity = t;
    }

    @NotNull
    public String toString() {
        return "MessageData(messageId=" + this.messageId + ", module=" + this.module + ", type=" + this.type + ", receiverUId=" + this.receiverUId + ", senderUId=" + this.senderUId + ", sid=" + this.sid + ", title=" + this.title + ", content=" + this.content + ", imgUrl=" + this.imgUrl + ", extraData=" + this.extraData + ", newStatus=" + this.newStatus + ", dataStatus=" + this.dataStatus + ", createTime=" + this.createTime + ", lastModifyTime=" + this.lastModifyTime + ", extraEntity=" + this.extraEntity + ")";
    }

    public MessageData(long j, int i, int i2, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l3, @Nullable Long l4) {
        this.messageId = j;
        this.module = i;
        this.type = i2;
        this.receiverUId = l;
        this.senderUId = l2;
        this.sid = str;
        this.title = str2;
        this.content = str3;
        this.imgUrl = str4;
        this.extraData = str5;
        this.newStatus = num;
        this.dataStatus = num2;
        this.createTime = l3;
        this.lastModifyTime = l4;
    }

    public /* synthetic */ MessageData(long j, int i, int i2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Long l3, Long l4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? null : l, (i3 & 16) != 0 ? null : l2, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : num, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) != 0 ? null : l3, (i3 & 8192) == 0 ? l4 : null);
    }
}
