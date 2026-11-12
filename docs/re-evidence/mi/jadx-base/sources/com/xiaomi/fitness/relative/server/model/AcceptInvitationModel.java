package com.xiaomi.fitness.relative.server.model;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.active.pk.PkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/AcceptInvitationModel;", "", "msgId", "", PkConstants.PARAM_INVITE_ID, "authTypes", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "authTimeScope", "", "relativeNode", "", "<init>", "(JJLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getMsgId", "()J", "getInviteId", "setInviteId", "(J)V", "getAuthTypes", "()Ljava/util/List;", "setAuthTypes", "(Ljava/util/List;)V", "getAuthTimeScope", "()Ljava/lang/Integer;", "setAuthTimeScope", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRelativeNode", "()Ljava/lang/String;", "setRelativeNode", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(JJLjava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fitness/relative/server/model/AcceptInvitationModel;", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AcceptInvitationModel {

    @Nullable
    private Integer authTimeScope;

    @Nullable
    private List<? extends HomeDataType> authTypes;
    private long inviteId;
    private final long msgId;

    @Nullable
    private String relativeNode;

    public AcceptInvitationModel(long j, long j2, @Nullable List<? extends HomeDataType> list, @DataSharedTimeScope @Nullable Integer num, @Nullable String str) {
        this.msgId = j;
        this.inviteId = j2;
        this.authTypes = list;
        this.authTimeScope = num;
        this.relativeNode = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMsgId() {
        return this.msgId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInviteId() {
        return this.inviteId;
    }

    @Nullable
    public final List<HomeDataType> component3() {
        return this.authTypes;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAuthTimeScope() {
        return this.authTimeScope;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    @NotNull
    public final AcceptInvitationModel copy(long msgId, long inviteId, @Nullable List<? extends HomeDataType> authTypes, @DataSharedTimeScope @Nullable Integer authTimeScope, @Nullable String relativeNode) {
        return new AcceptInvitationModel(msgId, inviteId, authTypes, authTimeScope, relativeNode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcceptInvitationModel)) {
            return false;
        }
        AcceptInvitationModel acceptInvitationModel = (AcceptInvitationModel) other;
        return this.msgId == acceptInvitationModel.msgId && this.inviteId == acceptInvitationModel.inviteId && Intrinsics.areEqual(this.authTypes, acceptInvitationModel.authTypes) && Intrinsics.areEqual(this.authTimeScope, acceptInvitationModel.authTimeScope) && Intrinsics.areEqual(this.relativeNode, acceptInvitationModel.relativeNode);
    }

    @Nullable
    public final Integer getAuthTimeScope() {
        return this.authTimeScope;
    }

    @Nullable
    public final List<HomeDataType> getAuthTypes() {
        return this.authTypes;
    }

    public final long getInviteId() {
        return this.inviteId;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    @Nullable
    public final String getRelativeNode() {
        return this.relativeNode;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.msgId) * 31) + Long.hashCode(this.inviteId)) * 31;
        List<? extends HomeDataType> list = this.authTypes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.authTimeScope;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.relativeNode;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setAuthTimeScope(@Nullable Integer num) {
        this.authTimeScope = num;
    }

    public final void setAuthTypes(@Nullable List<? extends HomeDataType> list) {
        this.authTypes = list;
    }

    public final void setInviteId(long j) {
        this.inviteId = j;
    }

    public final void setRelativeNode(@Nullable String str) {
        this.relativeNode = str;
    }

    @NotNull
    public String toString() {
        return "AcceptInvitationModel(msgId=" + this.msgId + ", inviteId=" + this.inviteId + ", authTypes=" + this.authTypes + ", authTimeScope=" + this.authTimeScope + ", relativeNode=" + this.relativeNode + ")";
    }

    public /* synthetic */ AcceptInvitationModel(long j, long j2, List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str);
    }
}
