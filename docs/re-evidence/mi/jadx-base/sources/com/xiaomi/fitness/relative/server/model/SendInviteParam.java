package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/SendInviteParam;", "", "relativeId", "", "inviteLinkId", "relativeNode", "", "dataContent", "Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;)V", "getRelativeId", "()Ljava/lang/Long;", "setRelativeId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInviteLinkId", "setInviteLinkId", "getRelativeNode", "()Ljava/lang/String;", "setRelativeNode", "(Ljava/lang/String;)V", "getDataContent", "()Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;)Lcom/xiaomi/fitness/relative/server/model/SendInviteParam;", "equals", "", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendInviteParam {

    @SerializedName("auth_content")
    @Nullable
    private final InviteAuthContent dataContent;

    @SerializedName("invite_link_id")
    @Nullable
    private Long inviteLinkId;

    @SerializedName("relative_uid")
    @Nullable
    private Long relativeId;

    @SerializedName("relative_note")
    @Nullable
    private String relativeNode;

    public SendInviteParam() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SendInviteParam copy$default(SendInviteParam sendInviteParam, Long l, Long l2, String str, InviteAuthContent inviteAuthContent, int i, Object obj) {
        if ((i & 1) != 0) {
            l = sendInviteParam.relativeId;
        }
        if ((i & 2) != 0) {
            l2 = sendInviteParam.inviteLinkId;
        }
        if ((i & 4) != 0) {
            str = sendInviteParam.relativeNode;
        }
        if ((i & 8) != 0) {
            inviteAuthContent = sendInviteParam.dataContent;
        }
        return sendInviteParam.copy(l, l2, str, inviteAuthContent);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInviteLinkId() {
        return this.inviteLinkId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InviteAuthContent getDataContent() {
        return this.dataContent;
    }

    @NotNull
    public final SendInviteParam copy(@Nullable Long relativeId, @Nullable Long inviteLinkId, @Nullable String relativeNode, @Nullable InviteAuthContent dataContent) {
        return new SendInviteParam(relativeId, inviteLinkId, relativeNode, dataContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendInviteParam)) {
            return false;
        }
        SendInviteParam sendInviteParam = (SendInviteParam) other;
        return Intrinsics.areEqual(this.relativeId, sendInviteParam.relativeId) && Intrinsics.areEqual(this.inviteLinkId, sendInviteParam.inviteLinkId) && Intrinsics.areEqual(this.relativeNode, sendInviteParam.relativeNode) && Intrinsics.areEqual(this.dataContent, sendInviteParam.dataContent);
    }

    @Nullable
    public final InviteAuthContent getDataContent() {
        return this.dataContent;
    }

    @Nullable
    public final Long getInviteLinkId() {
        return this.inviteLinkId;
    }

    @Nullable
    public final Long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    public int hashCode() {
        Long l = this.relativeId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.inviteLinkId;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.relativeNode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InviteAuthContent inviteAuthContent = this.dataContent;
        return iHashCode3 + (inviteAuthContent != null ? inviteAuthContent.hashCode() : 0);
    }

    public final void setInviteLinkId(@Nullable Long l) {
        this.inviteLinkId = l;
    }

    public final void setRelativeId(@Nullable Long l) {
        this.relativeId = l;
    }

    public final void setRelativeNode(@Nullable String str) {
        this.relativeNode = str;
    }

    @NotNull
    public String toString() {
        return "SendInviteParam(relativeId=" + this.relativeId + ", inviteLinkId=" + this.inviteLinkId + ", relativeNode=" + this.relativeNode + ", dataContent=" + this.dataContent + ")";
    }

    public SendInviteParam(@Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable InviteAuthContent inviteAuthContent) {
        this.relativeId = l;
        this.inviteLinkId = l2;
        this.relativeNode = str;
        this.dataContent = inviteAuthContent;
    }

    public /* synthetic */ SendInviteParam(Long l, Long l2, String str, InviteAuthContent inviteAuthContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : inviteAuthContent);
    }
}
