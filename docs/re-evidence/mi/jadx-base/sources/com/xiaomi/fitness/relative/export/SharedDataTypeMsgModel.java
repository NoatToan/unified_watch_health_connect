package com.xiaomi.fitness.relative.export;

import com.xiaomi.fitness.active.pk.PkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/relative/export/SharedDataTypeMsgModel;", "", "msgId", "", "relativeId", PkConstants.PARAM_INVITE_ID, "authKeys", "", "", "nickName", "icon", "<init>", "(JJJLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()J", "getRelativeId", "getInviteId", "getAuthKeys", "()Ljava/util/List;", "setAuthKeys", "(Ljava/util/List;)V", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedDataTypeMsgModel {

    @NotNull
    private List<String> authKeys;

    @Nullable
    private String icon;
    private final long inviteId;
    private final long msgId;

    @Nullable
    private String nickName;
    private final long relativeId;

    public SharedDataTypeMsgModel(long j, long j2, long j3, @NotNull List<String> authKeys, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(authKeys, "authKeys");
        this.msgId = j;
        this.relativeId = j2;
        this.inviteId = j3;
        this.authKeys = authKeys;
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

    @NotNull
    public final List<String> component4() {
        return this.authKeys;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final SharedDataTypeMsgModel copy(long msgId, long relativeId, long inviteId, @NotNull List<String> authKeys, @Nullable String nickName, @Nullable String icon) {
        Intrinsics.checkNotNullParameter(authKeys, "authKeys");
        return new SharedDataTypeMsgModel(msgId, relativeId, inviteId, authKeys, nickName, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedDataTypeMsgModel)) {
            return false;
        }
        SharedDataTypeMsgModel sharedDataTypeMsgModel = (SharedDataTypeMsgModel) other;
        return this.msgId == sharedDataTypeMsgModel.msgId && this.relativeId == sharedDataTypeMsgModel.relativeId && this.inviteId == sharedDataTypeMsgModel.inviteId && Intrinsics.areEqual(this.authKeys, sharedDataTypeMsgModel.authKeys) && Intrinsics.areEqual(this.nickName, sharedDataTypeMsgModel.nickName) && Intrinsics.areEqual(this.icon, sharedDataTypeMsgModel.icon);
    }

    @NotNull
    public final List<String> getAuthKeys() {
        return this.authKeys;
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
        int iHashCode = ((((((Long.hashCode(this.msgId) * 31) + Long.hashCode(this.relativeId)) * 31) + Long.hashCode(this.inviteId)) * 31) + this.authKeys.hashCode()) * 31;
        String str = this.nickName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAuthKeys(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.authKeys = list;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    @NotNull
    public String toString() {
        return "SharedDataTypeMsgModel(msgId=" + this.msgId + ", relativeId=" + this.relativeId + ", inviteId=" + this.inviteId + ", authKeys=" + this.authKeys + ", nickName=" + this.nickName + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ SharedDataTypeMsgModel(long j, long j2, long j3, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, list, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2);
    }
}
