package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003JM\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010)\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/RelativeUserInfo;", "", "uid", "", "note", "", "icon", "latestDataTime", "latestAbnormalRecordList", "", "Lcom/xiaomi/fitness/relative/server/model/AbnormalLatestTime;", "tag", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/util/List;I)V", "getUid", "()J", "getNote", "()Ljava/lang/String;", "getIcon", "getLatestDataTime", "getLatestAbnormalRecordList", "()Ljava/util/List;", "getTag", "()I", "hasNewData", "", "getHasNewData", "()Z", "setHasNewData", "(Z)V", "hasNewAbnormalRecord", "getHasNewAbnormalRecord", "setHasNewAbnormalRecord", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RelativeUserInfo {
    private boolean hasNewAbnormalRecord;
    private boolean hasNewData;

    @SerializedName("relative_icon")
    @NotNull
    private final String icon;

    @SerializedName("latest_abnormal_record_time")
    @Nullable
    private final List<AbnormalLatestTime> latestAbnormalRecordList;

    @SerializedName("latest_data_time")
    private final long latestDataTime;

    @SerializedName("relative_note")
    @NotNull
    private final String note;

    @SerializedName("source_tag")
    private final int tag;

    @SerializedName("relative_uid")
    private final long uid;

    public RelativeUserInfo(long j, @NotNull String note, @NotNull String icon, long j2, @Nullable List<AbnormalLatestTime> list, @RelativeUserTag int i) {
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.uid = j;
        this.note = note;
        this.icon = icon;
        this.latestDataTime = j2;
        this.latestAbnormalRecordList = list;
        this.tag = i;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLatestDataTime() {
        return this.latestDataTime;
    }

    @Nullable
    public final List<AbnormalLatestTime> component5() {
        return this.latestAbnormalRecordList;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTag() {
        return this.tag;
    }

    @NotNull
    public final RelativeUserInfo copy(long uid, @NotNull String note, @NotNull String icon, long latestDataTime, @Nullable List<AbnormalLatestTime> latestAbnormalRecordList, @RelativeUserTag int tag) {
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new RelativeUserInfo(uid, note, icon, latestDataTime, latestAbnormalRecordList, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelativeUserInfo)) {
            return false;
        }
        RelativeUserInfo relativeUserInfo = (RelativeUserInfo) other;
        return this.uid == relativeUserInfo.uid && Intrinsics.areEqual(this.note, relativeUserInfo.note) && Intrinsics.areEqual(this.icon, relativeUserInfo.icon) && this.latestDataTime == relativeUserInfo.latestDataTime && Intrinsics.areEqual(this.latestAbnormalRecordList, relativeUserInfo.latestAbnormalRecordList) && this.tag == relativeUserInfo.tag;
    }

    public final boolean getHasNewAbnormalRecord() {
        return this.hasNewAbnormalRecord;
    }

    public final boolean getHasNewData() {
        return this.hasNewData;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<AbnormalLatestTime> getLatestAbnormalRecordList() {
        return this.latestAbnormalRecordList;
    }

    public final long getLatestDataTime() {
        return this.latestDataTime;
    }

    @NotNull
    public final String getNote() {
        return this.note;
    }

    public final int getTag() {
        return this.tag;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.uid) * 31) + this.note.hashCode()) * 31) + this.icon.hashCode()) * 31) + Long.hashCode(this.latestDataTime)) * 31;
        List<AbnormalLatestTime> list = this.latestAbnormalRecordList;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.tag);
    }

    public final void setHasNewAbnormalRecord(boolean z) {
        this.hasNewAbnormalRecord = z;
    }

    public final void setHasNewData(boolean z) {
        this.hasNewData = z;
    }

    @NotNull
    public String toString() {
        return "RelativeUserInfo(uid=" + this.uid + ", note=" + this.note + ", icon=" + this.icon + ", latestDataTime=" + this.latestDataTime + ", latestAbnormalRecordList=" + this.latestAbnormalRecordList + ", tag=" + this.tag + ")";
    }
}
