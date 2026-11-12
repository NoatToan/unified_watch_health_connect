package com.xiaomi.fitness.relative.server.model;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/SendInvitationModel;", "", "relativeId", "", "inviteLinkId", "authTypes", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "authTimeScope", "", "relativeNode", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getRelativeId", "()Ljava/lang/Long;", "setRelativeId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInviteLinkId", "setInviteLinkId", "getAuthTypes", "()Ljava/util/List;", "setAuthTypes", "(Ljava/util/List;)V", "getAuthTimeScope", "()Ljava/lang/Integer;", "setAuthTimeScope", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRelativeNode", "()Ljava/lang/String;", "setRelativeNode", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/xiaomi/fitness/relative/server/model/SendInvitationModel;", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SendInvitationModel {

    @Nullable
    private Integer authTimeScope;

    @Nullable
    private List<? extends HomeDataType> authTypes;

    @Nullable
    private Long inviteLinkId;

    @Nullable
    private Long relativeId;

    @Nullable
    private String relativeNode;

    public SendInvitationModel() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendInvitationModel copy$default(SendInvitationModel sendInvitationModel, Long l, Long l2, List list, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = sendInvitationModel.relativeId;
        }
        if ((i & 2) != 0) {
            l2 = sendInvitationModel.inviteLinkId;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            list = sendInvitationModel.authTypes;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            num = sendInvitationModel.authTimeScope;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str = sendInvitationModel.relativeNode;
        }
        return sendInvitationModel.copy(l, l3, list2, num2, str);
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
    public final SendInvitationModel copy(@Nullable Long relativeId, @Nullable Long inviteLinkId, @Nullable List<? extends HomeDataType> authTypes, @DataSharedTimeScope @Nullable Integer authTimeScope, @Nullable String relativeNode) {
        return new SendInvitationModel(relativeId, inviteLinkId, authTypes, authTimeScope, relativeNode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendInvitationModel)) {
            return false;
        }
        SendInvitationModel sendInvitationModel = (SendInvitationModel) other;
        return Intrinsics.areEqual(this.relativeId, sendInvitationModel.relativeId) && Intrinsics.areEqual(this.inviteLinkId, sendInvitationModel.inviteLinkId) && Intrinsics.areEqual(this.authTypes, sendInvitationModel.authTypes) && Intrinsics.areEqual(this.authTimeScope, sendInvitationModel.authTimeScope) && Intrinsics.areEqual(this.relativeNode, sendInvitationModel.relativeNode);
    }

    @Nullable
    public final Integer getAuthTimeScope() {
        return this.authTimeScope;
    }

    @Nullable
    public final List<HomeDataType> getAuthTypes() {
        return this.authTypes;
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
        List<? extends HomeDataType> list = this.authTypes;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.authTimeScope;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.relativeNode;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final void setAuthTimeScope(@Nullable Integer num) {
        this.authTimeScope = num;
    }

    public final void setAuthTypes(@Nullable List<? extends HomeDataType> list) {
        this.authTypes = list;
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
        return "SendInvitationModel(relativeId=" + this.relativeId + ", inviteLinkId=" + this.inviteLinkId + ", authTypes=" + this.authTypes + ", authTimeScope=" + this.authTimeScope + ", relativeNode=" + this.relativeNode + ")";
    }

    public SendInvitationModel(@Nullable Long l, @Nullable Long l2, @Nullable List<? extends HomeDataType> list, @DataSharedTimeScope @Nullable Integer num, @Nullable String str) {
        this.relativeId = l;
        this.inviteLinkId = l2;
        this.authTypes = list;
        this.authTimeScope = num;
        this.relativeNode = str;
    }

    public /* synthetic */ SendInvitationModel(Long l, Long l2, List list, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str);
    }
}
