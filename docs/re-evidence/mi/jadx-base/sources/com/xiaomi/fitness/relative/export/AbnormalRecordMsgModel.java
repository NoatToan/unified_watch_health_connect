package com.xiaomi.fitness.relative.export;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR,\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/relative/export/AbnormalRecordMsgModel;", "", "msgId", "", "relativeId", "abnormalRecordList", "", "", "", "nickName", "icon", "<init>", "(JJLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()J", "getRelativeId", "getAbnormalRecordList", "()Ljava/util/List;", "setAbnormalRecordList", "(Ljava/util/List;)V", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbnormalRecordMsgModel {

    @NotNull
    private List<? extends Map<String, Long>> abnormalRecordList;

    @Nullable
    private String icon;
    private final long msgId;

    @Nullable
    private String nickName;
    private final long relativeId;

    public AbnormalRecordMsgModel(long j, long j2, @NotNull List<? extends Map<String, Long>> abnormalRecordList, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(abnormalRecordList, "abnormalRecordList");
        this.msgId = j;
        this.relativeId = j2;
        this.abnormalRecordList = abnormalRecordList;
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

    @NotNull
    public final List<Map<String, Long>> component3() {
        return this.abnormalRecordList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final AbnormalRecordMsgModel copy(long msgId, long relativeId, @NotNull List<? extends Map<String, Long>> abnormalRecordList, @Nullable String nickName, @Nullable String icon) {
        Intrinsics.checkNotNullParameter(abnormalRecordList, "abnormalRecordList");
        return new AbnormalRecordMsgModel(msgId, relativeId, abnormalRecordList, nickName, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbnormalRecordMsgModel)) {
            return false;
        }
        AbnormalRecordMsgModel abnormalRecordMsgModel = (AbnormalRecordMsgModel) other;
        return this.msgId == abnormalRecordMsgModel.msgId && this.relativeId == abnormalRecordMsgModel.relativeId && Intrinsics.areEqual(this.abnormalRecordList, abnormalRecordMsgModel.abnormalRecordList) && Intrinsics.areEqual(this.nickName, abnormalRecordMsgModel.nickName) && Intrinsics.areEqual(this.icon, abnormalRecordMsgModel.icon);
    }

    @NotNull
    public final List<Map<String, Long>> getAbnormalRecordList() {
        return this.abnormalRecordList;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
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
        int iHashCode = ((((Long.hashCode(this.msgId) * 31) + Long.hashCode(this.relativeId)) * 31) + this.abnormalRecordList.hashCode()) * 31;
        String str = this.nickName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAbnormalRecordList(@NotNull List<? extends Map<String, Long>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.abnormalRecordList = list;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    @NotNull
    public String toString() {
        return "AbnormalRecordMsgModel(msgId=" + this.msgId + ", relativeId=" + this.relativeId + ", abnormalRecordList=" + this.abnormalRecordList + ", nickName=" + this.nickName + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ AbnormalRecordMsgModel(long j, long j2, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
