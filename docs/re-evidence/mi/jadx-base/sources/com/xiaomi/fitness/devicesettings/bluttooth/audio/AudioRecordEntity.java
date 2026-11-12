package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.TypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@TypeConverters({AudioRecordConverter.class})
@Parcelize
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jm\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0006\u0010@\u001a\u00020\nJ\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\nHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR$\u0010-\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u00101R$\u00102\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010*\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u00101¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "Landroid/os/Parcelable;", "timestamp", "", "title", "", "newTitle", "did", "duration", "status", "", "format", "fdsName", "contentList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/util/List;)V", "getTimestamp", "()J", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getNewTitle", "setNewTitle", "getDid", "getDuration", "getStatus", "()I", "setStatus", "(I)V", "getFormat", "setFormat", "getFdsName", "setFdsName", "getContentList", "()Ljava/util/List;", "setContentList", "(Ljava/util/List;)V", "audioPlayStatus", "getAudioPlayStatus$annotations", "()V", "getAudioPlayStatus", "setAudioPlayStatus", "audioPlayCurrentTimes", "getAudioPlayCurrentTimes$annotations", "getAudioPlayCurrentTimes", "setAudioPlayCurrentTimes", "(J)V", "audioTotalTimes", "getAudioTotalTimes$annotations", "getAudioTotalTimes", "setAudioTotalTimes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Entity(primaryKeys = {"title", "did"}, tableName = AudioRecordDataBase.sName)
public final /* data */ class AudioRecordEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AudioRecordEntity> CREATOR = new Creator();
    private long audioPlayCurrentTimes;
    private int audioPlayStatus;
    private long audioTotalTimes;

    @Nullable
    private List<AsrResultItem> contentList;

    @NotNull
    private final String did;
    private final long duration;

    @Nullable
    private String fdsName;
    private int format;

    @NotNull
    private String newTitle;
    private int status;
    private final long timestamp;

    @NotNull
    private String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AudioRecordEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioRecordEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(AsrResultItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AudioRecordEntity(j, string, string2, string3, j2, i, i2, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AudioRecordEntity[] newArray(int i) {
            return new AudioRecordEntity[i];
        }
    }

    public AudioRecordEntity(long j, @NotNull String title, @NotNull String newTitle, @NotNull String did, long j2, int i, int i2, @Nullable String str, @Nullable List<AsrResultItem> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(did, "did");
        this.timestamp = j;
        this.title = title;
        this.newTitle = newTitle;
        this.did = did;
        this.duration = j2;
        this.status = i;
        this.format = i2;
        this.fdsName = str;
        this.contentList = list;
    }

    public static /* synthetic */ void getAudioPlayCurrentTimes$annotations() {
    }

    public static /* synthetic */ void getAudioPlayStatus$annotations() {
    }

    public static /* synthetic */ void getAudioTotalTimes$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewTitle() {
        return this.newTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFdsName() {
        return this.fdsName;
    }

    @Nullable
    public final List<AsrResultItem> component9() {
        return this.contentList;
    }

    @NotNull
    public final AudioRecordEntity copy(long timestamp, @NotNull String title, @NotNull String newTitle, @NotNull String did, long duration, int status, int format, @Nullable String fdsName, @Nullable List<AsrResultItem> contentList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newTitle, "newTitle");
        Intrinsics.checkNotNullParameter(did, "did");
        return new AudioRecordEntity(timestamp, title, newTitle, did, duration, status, format, fdsName, contentList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioRecordEntity)) {
            return false;
        }
        AudioRecordEntity audioRecordEntity = (AudioRecordEntity) other;
        return this.timestamp == audioRecordEntity.timestamp && Intrinsics.areEqual(this.title, audioRecordEntity.title) && Intrinsics.areEqual(this.newTitle, audioRecordEntity.newTitle) && Intrinsics.areEqual(this.did, audioRecordEntity.did) && this.duration == audioRecordEntity.duration && this.status == audioRecordEntity.status && this.format == audioRecordEntity.format && Intrinsics.areEqual(this.fdsName, audioRecordEntity.fdsName) && Intrinsics.areEqual(this.contentList, audioRecordEntity.contentList);
    }

    public final long getAudioPlayCurrentTimes() {
        return this.audioPlayCurrentTimes;
    }

    public final int getAudioPlayStatus() {
        return this.audioPlayStatus;
    }

    public final long getAudioTotalTimes() {
        return this.audioTotalTimes;
    }

    @Nullable
    public final List<AsrResultItem> getContentList() {
        return this.contentList;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getFdsName() {
        return this.fdsName;
    }

    public final int getFormat() {
        return this.format;
    }

    @NotNull
    public final String getNewTitle() {
        return this.newTitle;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.timestamp) * 31) + this.title.hashCode()) * 31) + this.newTitle.hashCode()) * 31) + this.did.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.format)) * 31;
        String str = this.fdsName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AsrResultItem> list = this.contentList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setAudioPlayCurrentTimes(long j) {
        this.audioPlayCurrentTimes = j;
    }

    public final void setAudioPlayStatus(int i) {
        this.audioPlayStatus = i;
    }

    public final void setAudioTotalTimes(long j) {
        this.audioTotalTimes = j;
    }

    public final void setContentList(@Nullable List<AsrResultItem> list) {
        this.contentList = list;
    }

    public final void setFdsName(@Nullable String str) {
        this.fdsName = str;
    }

    public final void setFormat(int i) {
        this.format = i;
    }

    public final void setNewTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newTitle = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "AudioRecordEntity(timestamp=" + this.timestamp + ", title=" + this.title + ", newTitle=" + this.newTitle + ", did=" + this.did + ", duration=" + this.duration + ", status=" + this.status + ", format=" + this.format + ", fdsName=" + this.fdsName + ", contentList=" + this.contentList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.timestamp);
        dest.writeString(this.title);
        dest.writeString(this.newTitle);
        dest.writeString(this.did);
        dest.writeLong(this.duration);
        dest.writeInt(this.status);
        dest.writeInt(this.format);
        dest.writeString(this.fdsName);
        List<AsrResultItem> list = this.contentList;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<AsrResultItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AudioRecordEntity(long j, String str, String str2, String str3, long j2, int i, int i2, String str4, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? 4 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : list);
    }
}
