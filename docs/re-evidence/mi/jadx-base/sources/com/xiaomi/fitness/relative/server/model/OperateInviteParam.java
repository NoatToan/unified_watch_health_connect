package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.active.pk.PkConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/OperateInviteParam;", "", "msgId", "", PkConstants.PARAM_INVITE_ID, "operate", "", "identityNode", "", "dataContent", "Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "<init>", "(JJILjava/lang/String;Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;)V", "getMsgId", "()J", "getInviteId", "getOperate", "()I", "getIdentityNode", "()Ljava/lang/String;", "getDataContent", "()Lcom/xiaomi/fitness/relative/server/model/InviteAuthContent;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OperateInviteParam {

    @SerializedName("auth_content")
    @Nullable
    private final InviteAuthContent dataContent;

    @SerializedName("invite_note")
    @Nullable
    private final String identityNode;

    @SerializedName("invite_id")
    private final long inviteId;

    @SerializedName("msg_id")
    private final long msgId;

    @SerializedName("operate")
    private final int operate;

    public OperateInviteParam(long j, long j2, int i, @Nullable String str, @Nullable InviteAuthContent inviteAuthContent) {
        this.msgId = j;
        this.inviteId = j2;
        this.operate = i;
        this.identityNode = str;
        this.dataContent = inviteAuthContent;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOperate() {
        return this.operate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentityNode() {
        return this.identityNode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InviteAuthContent getDataContent() {
        return this.dataContent;
    }

    @NotNull
    public final OperateInviteParam copy(long msgId, long inviteId, int operate, @Nullable String identityNode, @Nullable InviteAuthContent dataContent) {
        return new OperateInviteParam(msgId, inviteId, operate, identityNode, dataContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperateInviteParam)) {
            return false;
        }
        OperateInviteParam operateInviteParam = (OperateInviteParam) other;
        return this.msgId == operateInviteParam.msgId && this.inviteId == operateInviteParam.inviteId && this.operate == operateInviteParam.operate && Intrinsics.areEqual(this.identityNode, operateInviteParam.identityNode) && Intrinsics.areEqual(this.dataContent, operateInviteParam.dataContent);
    }

    @Nullable
    public final InviteAuthContent getDataContent() {
        return this.dataContent;
    }

    @Nullable
    public final String getIdentityNode() {
        return this.identityNode;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final int getOperate() {
        return this.operate;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.msgId) * 31) + Long.hashCode(this.inviteId)) * 31) + Integer.hashCode(this.operate)) * 31;
        String str = this.identityNode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InviteAuthContent inviteAuthContent = this.dataContent;
        return iHashCode2 + (inviteAuthContent != null ? inviteAuthContent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OperateInviteParam(msgId=" + this.msgId + ", inviteId=" + this.inviteId + ", operate=" + this.operate + ", identityNode=" + this.identityNode + ", dataContent=" + this.dataContent + ")";
    }

    public /* synthetic */ OperateInviteParam(long j, long j2, int i, String str, InviteAuthContent inviteAuthContent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : inviteAuthContent);
    }
}
