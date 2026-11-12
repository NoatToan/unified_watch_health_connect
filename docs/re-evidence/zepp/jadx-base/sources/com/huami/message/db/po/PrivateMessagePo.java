package com.huami.message.db.po;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.api.WebConst;
import com.loc.z;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Entity(indices = {@Index(unique = true, value = {WebConst.QueryParam.MESSAGE_ID})})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\bG\u0010HJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0084\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u00109R$\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R$\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010+\u001a\u0004\b>\u0010-\"\u0004\b?\u0010/R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u000f\"\u0004\bC\u0010DR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010+\u001a\u0004\bF\u0010-¨\u0006I"}, d2 = {"Lcom/huami/message/db/po/PrivateMessagePo;", "", "", "component1", "component2", "", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Ljava/lang/Long;", "component10", "id", WebConst.QueryParam.MESSAGE_ID, "userId", WebAPI.PARAM_SHARE_INVITE_AVATAR, "nickName", "count", "messageStatus", "content", "generateTime", "nextIndex", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/huami/message/db/po/PrivateMessagePo;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", com.huami.sleepassistant.apilib.utils.WebConst.QueryParam.SET_ID, "(J)V", "b", "getMessageId", "c", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", GoogleApiAvailabilityLight.a, "getAvatar", "e", "getNickName", "setNickName", "f", "Ljava/lang/Integer;", "getCount", "setCount", "(Ljava/lang/Integer;)V", "g", "getMessageStatus", "setMessageStatus", "h", "getContent", "setContent", "i", "Ljava/lang/Long;", "getGenerateTime", "setGenerateTime", "(Ljava/lang/Long;)V", z.j, "getNextIndex", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PrivateMessagePo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = true)
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private String nickName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer count;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String messageStatus;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private String content;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private Long generateTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String nextIndex;

    public PrivateMessagePo(long j, long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable String str6) {
        this.id = j;
        this.messageId = j2;
        this.userId = str;
        this.avatar = str2;
        this.nickName = str3;
        this.count = num;
        this.messageStatus = str4;
        this.content = str5;
        this.generateTime = l;
        this.nextIndex = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNextIndex() {
        return this.nextIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMessageStatus() {
        return this.messageStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final PrivateMessagePo copy(long id, long messageId, @Nullable String userId, @Nullable String avatar, @Nullable String nickName, @Nullable Integer count, @Nullable String messageStatus, @Nullable String content, @Nullable Long generateTime, @Nullable String nextIndex) {
        return new PrivateMessagePo(id, messageId, userId, avatar, nickName, count, messageStatus, content, generateTime, nextIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateMessagePo)) {
            return false;
        }
        PrivateMessagePo privateMessagePo = (PrivateMessagePo) other;
        return this.id == privateMessagePo.id && this.messageId == privateMessagePo.messageId && Intrinsics.areEqual(this.userId, privateMessagePo.userId) && Intrinsics.areEqual(this.avatar, privateMessagePo.avatar) && Intrinsics.areEqual(this.nickName, privateMessagePo.nickName) && Intrinsics.areEqual(this.count, privateMessagePo.count) && Intrinsics.areEqual(this.messageStatus, privateMessagePo.messageStatus) && Intrinsics.areEqual(this.content, privateMessagePo.content) && Intrinsics.areEqual(this.generateTime, privateMessagePo.generateTime) && Intrinsics.areEqual(this.nextIndex, privateMessagePo.nextIndex);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final Long getGenerateTime() {
        return this.generateTime;
    }

    public final long getId() {
        return this.id;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final String getMessageStatus() {
        return this.messageStatus;
    }

    @Nullable
    public final String getNextIndex() {
        return this.nextIndex;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = ((b.a(this.id) * 31) + b.a(this.messageId)) * 31;
        String str = this.userId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.messageStatus;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.generateTime;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.nextIndex;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setGenerateTime(@Nullable Long l) {
        this.generateTime = l;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setMessageStatus(@Nullable String str) {
        this.messageStatus = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "PrivateMessagePo(id=" + this.id + ", messageId=" + this.messageId + ", userId=" + ((Object) this.userId) + ", avatar=" + ((Object) this.avatar) + ", nickName=" + ((Object) this.nickName) + ", count=" + this.count + ", messageStatus=" + ((Object) this.messageStatus) + ", content=" + ((Object) this.content) + ", generateTime=" + this.generateTime + ", nextIndex=" + ((Object) this.nextIndex) + ')';
    }

    public /* synthetic */ PrivateMessagePo(long j, long j2, String str, String str2, String str3, Integer num, String str4, String str5, Long l, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? 0L : l, (i & 512) != 0 ? null : str6);
    }
}
