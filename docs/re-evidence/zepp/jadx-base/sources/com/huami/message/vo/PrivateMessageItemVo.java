package com.huami.message.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.message.dto.MessageStatus;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b=\u0010>J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003Jl\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%\"\u0004\b,\u0010'R$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\n\"\u0004\b0\u00101R$\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010\u001f\u001a\u0004\b<\u0010!¨\u0006?"}, d2 = {"Lcom/huami/message/vo/PrivateMessageItemVo;", "", "", "component1", "", "component2", "component3", "component4", "", "component5", "()Ljava/lang/Integer;", "Lcom/huami/message/dto/MessageStatus;", "component6", "component7", "component8", "id", "userId", WebAPI.PARAM_SHARE_INVITE_AVATAR, "nickName", "count", "msgStatus", "content", "generateTime", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;J)Lcom/huami/message/vo/PrivateMessageItemVo;", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "c", "getAvatar", GoogleApiAvailabilityLight.a, "getNickName", "setNickName", "e", "Ljava/lang/Integer;", "getCount", "setCount", "(Ljava/lang/Integer;)V", "f", "Lcom/huami/message/dto/MessageStatus;", "getMsgStatus", "()Lcom/huami/message/dto/MessageStatus;", "setMsgStatus", "(Lcom/huami/message/dto/MessageStatus;)V", "g", "getContent", "setContent", "h", "getGenerateTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/huami/message/dto/MessageStatus;Ljava/lang/String;J)V", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PrivateMessageItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private String nickName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer count;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private MessageStatus msgStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private String content;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final long generateTime;

    public PrivateMessageItemVo(long j, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable MessageStatus messageStatus, @Nullable String str4, long j2) {
        this.id = j;
        this.userId = str;
        this.avatar = str2;
        this.nickName = str3;
        this.count = num;
        this.msgStatus = messageStatus;
        this.content = str4;
        this.generateTime = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MessageStatus getMsgStatus() {
        return this.msgStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final PrivateMessageItemVo copy(long id, @Nullable String userId, @Nullable String avatar, @Nullable String nickName, @Nullable Integer count, @Nullable MessageStatus msgStatus, @Nullable String content, long generateTime) {
        return new PrivateMessageItemVo(id, userId, avatar, nickName, count, msgStatus, content, generateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivateMessageItemVo)) {
            return false;
        }
        PrivateMessageItemVo privateMessageItemVo = (PrivateMessageItemVo) other;
        return this.id == privateMessageItemVo.id && Intrinsics.areEqual(this.userId, privateMessageItemVo.userId) && Intrinsics.areEqual(this.avatar, privateMessageItemVo.avatar) && Intrinsics.areEqual(this.nickName, privateMessageItemVo.nickName) && Intrinsics.areEqual(this.count, privateMessageItemVo.count) && this.msgStatus == privateMessageItemVo.msgStatus && Intrinsics.areEqual(this.content, privateMessageItemVo.content) && this.generateTime == privateMessageItemVo.generateTime;
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

    public final long getGenerateTime() {
        return this.generateTime;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final MessageStatus getMsgStatus() {
        return this.msgStatus;
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
        int iA = b.a(this.id) * 31;
        String str = this.userId;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        MessageStatus messageStatus = this.msgStatus;
        int iHashCode5 = (iHashCode4 + (messageStatus == null ? 0 : messageStatus.hashCode())) * 31;
        String str4 = this.content;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + b.a(this.generateTime);
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setMsgStatus(@Nullable MessageStatus messageStatus) {
        this.msgStatus = messageStatus;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "PrivateMessageItemVo(id=" + this.id + ", userId=" + ((Object) this.userId) + ", avatar=" + ((Object) this.avatar) + ", nickName=" + ((Object) this.nickName) + ", count=" + this.count + ", msgStatus=" + this.msgStatus + ", content=" + ((Object) this.content) + ", generateTime=" + this.generateTime + ')';
    }

    public /* synthetic */ PrivateMessageItemVo(long j, String str, String str2, String str3, Integer num, MessageStatus messageStatus, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? null : messageStatus, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? 0L : j2);
    }
}
