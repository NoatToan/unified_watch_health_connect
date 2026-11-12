package com.xiaomi.fitness.relative.export;

import com.xiaomi.fitness.active.pk.PkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003Jb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "", "msgId", "", "relativeId", PkConstants.PARAM_INVITE_ID, "authKeys", "", "", "authTimeRange", "", "nickName", "icon", "<init>", "(JJJLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()J", "getRelativeId", "getInviteId", "getAuthKeys", "()Ljava/util/List;", "setAuthKeys", "(Ljava/util/List;)V", "getAuthTimeRange", "()Ljava/lang/Integer;", "setAuthTimeRange", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJJLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/fitness/relative/export/InvitationMsgModel;", "equals", "", "other", "hashCode", "toString", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InvitationMsgModel {

    @Nullable
    private List<String> authKeys;

    @Nullable
    private Integer authTimeRange;

    @Nullable
    private String icon;
    private final long inviteId;
    private final long msgId;

    @Nullable
    private String nickName;
    private final long relativeId;

    public InvitationMsgModel(long j, long j2, long j3, @Nullable List<String> list, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.msgId = j;
        this.relativeId = j2;
        this.inviteId = j3;
        this.authKeys = list;
        this.authTimeRange = num;
        this.nickName = str;
        this.icon = str2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    @Nullable
    public final List<String> component4() {
        return this.authKeys;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAuthTimeRange() {
        return this.authTimeRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final InvitationMsgModel copy(long msgId, long relativeId, long inviteId, @Nullable List<String> authKeys, @Nullable Integer authTimeRange, @Nullable String nickName, @Nullable String icon) {
        return new InvitationMsgModel(msgId, relativeId, inviteId, authKeys, authTimeRange, nickName, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvitationMsgModel)) {
            return false;
        }
        InvitationMsgModel invitationMsgModel = (InvitationMsgModel) other;
        return this.msgId == invitationMsgModel.msgId && this.relativeId == invitationMsgModel.relativeId && this.inviteId == invitationMsgModel.inviteId && Intrinsics.areEqual(this.authKeys, invitationMsgModel.authKeys) && Intrinsics.areEqual(this.authTimeRange, invitationMsgModel.authTimeRange) && Intrinsics.areEqual(this.nickName, invitationMsgModel.nickName) && Intrinsics.areEqual(this.icon, invitationMsgModel.icon);
    }

    @Nullable
    public final List<String> getAuthKeys() {
        return this.authKeys;
    }

    @Nullable
    public final Integer getAuthTimeRange() {
        return this.authTimeRange;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.msgId) * 31) + Long.hashCode(this.relativeId)) * 31) + Long.hashCode(this.inviteId)) * 31;
        List<String> list = this.authKeys;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.authTimeRange;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nickName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAuthKeys(@Nullable List<String> list) {
        this.authKeys = list;
    }

    public final void setAuthTimeRange(@Nullable Integer num) {
        this.authTimeRange = num;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    @NotNull
    public String toString() {
        return "InvitationMsgModel(msgId=" + this.msgId + ", relativeId=" + this.relativeId + ", inviteId=" + this.inviteId + ", authKeys=" + this.authKeys + ", authTimeRange=" + this.authTimeRange + ", nickName=" + this.nickName + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ InvitationMsgModel(long j, long j2, long j3, List list, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2);
    }
}
