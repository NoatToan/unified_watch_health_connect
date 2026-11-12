package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.active.pk.PkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/OperateSharedDataTypeParam;", "", "relativeId", "", "msgId", PkConstants.PARAM_INVITE_ID, "act", "", "appliedKeys", "", "", "sharedKeys", "<init>", "(JJJILjava/util/List;Ljava/util/List;)V", "getRelativeId", "()J", "getMsgId", "getInviteId", "getAct", "()I", "getAppliedKeys", "()Ljava/util/List;", "getSharedKeys", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OperateSharedDataTypeParam {

    @SerializedName("act")
    private final int act;

    @SerializedName("applied_keys")
    @NotNull
    private final List<String> appliedKeys;

    @SerializedName("invite_id")
    private final long inviteId;

    @SerializedName("msg_id")
    private final long msgId;

    @SerializedName("relative_uid")
    private final long relativeId;

    @SerializedName("shared_keys")
    @Nullable
    private final List<String> sharedKeys;

    public OperateSharedDataTypeParam(long j, long j2, long j3, int i, @NotNull List<String> appliedKeys, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(appliedKeys, "appliedKeys");
        this.relativeId = j;
        this.msgId = j2;
        this.inviteId = j3;
        this.act = i;
        this.appliedKeys = appliedKeys;
        this.sharedKeys = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRelativeId() {
        return this.relativeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAct() {
        return this.act;
    }

    @NotNull
    public final List<String> component5() {
        return this.appliedKeys;
    }

    @Nullable
    public final List<String> component6() {
        return this.sharedKeys;
    }

    @NotNull
    public final OperateSharedDataTypeParam copy(long relativeId, long msgId, long inviteId, int act, @NotNull List<String> appliedKeys, @Nullable List<String> sharedKeys) {
        Intrinsics.checkNotNullParameter(appliedKeys, "appliedKeys");
        return new OperateSharedDataTypeParam(relativeId, msgId, inviteId, act, appliedKeys, sharedKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperateSharedDataTypeParam)) {
            return false;
        }
        OperateSharedDataTypeParam operateSharedDataTypeParam = (OperateSharedDataTypeParam) other;
        return this.relativeId == operateSharedDataTypeParam.relativeId && this.msgId == operateSharedDataTypeParam.msgId && this.inviteId == operateSharedDataTypeParam.inviteId && this.act == operateSharedDataTypeParam.act && Intrinsics.areEqual(this.appliedKeys, operateSharedDataTypeParam.appliedKeys) && Intrinsics.areEqual(this.sharedKeys, operateSharedDataTypeParam.sharedKeys);
    }

    public final int getAct() {
        return this.act;
    }

    @NotNull
    public final List<String> getAppliedKeys() {
        return this.appliedKeys;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final long getRelativeId() {
        return this.relativeId;
    }

    @Nullable
    public final List<String> getSharedKeys() {
        return this.sharedKeys;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.relativeId) * 31) + Long.hashCode(this.msgId)) * 31) + Long.hashCode(this.inviteId)) * 31) + Integer.hashCode(this.act)) * 31) + this.appliedKeys.hashCode()) * 31;
        List<String> list = this.sharedKeys;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "OperateSharedDataTypeParam(relativeId=" + this.relativeId + ", msgId=" + this.msgId + ", inviteId=" + this.inviteId + ", act=" + this.act + ", appliedKeys=" + this.appliedKeys + ", sharedKeys=" + this.sharedKeys + ")";
    }

    public /* synthetic */ OperateSharedDataTypeParam(long j, long j2, long j3, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, i, list, (i2 & 32) != 0 ? null : list2);
    }
}
