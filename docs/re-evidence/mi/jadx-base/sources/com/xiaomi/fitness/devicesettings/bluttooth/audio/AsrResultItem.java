package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0006\u0010!\u001a\u00020\u0003J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AsrResultItem;", "Landroid/os/Parcelable;", "speakerId", "", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, "", CommonConstants.KEY_USER_NAME, "", SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, MiuiCursorConstants.CONTENT, "<init>", "(IJLjava/lang/String;JLjava/lang/String;)V", "getSpeakerId", "()I", "setSpeakerId", "(I)V", "getStart_time", "()J", "setStart_time", "(J)V", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "getEnd_time", "setEnd_time", "getContent", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AsrResultItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsrResultItem> CREATOR = new Creator();

    @SerializedName("onebest")
    @NotNull
    private final String content;
    private long end_time;

    @SerializedName("spk")
    private int speakerId;
    private long start_time;

    @NotNull
    private String userName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AsrResultItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsrResultItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsrResultItem(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AsrResultItem[] newArray(int i) {
            return new AsrResultItem[i];
        }
    }

    public AsrResultItem(int i, long j, @NotNull String userName, long j2, @NotNull String content) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(content, "content");
        this.speakerId = i;
        this.start_time = j;
        this.userName = userName;
        this.end_time = j2;
        this.content = content;
    }

    public static /* synthetic */ AsrResultItem copy$default(AsrResultItem asrResultItem, int i, long j, String str, long j2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = asrResultItem.speakerId;
        }
        if ((i2 & 2) != 0) {
            j = asrResultItem.start_time;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            str = asrResultItem.userName;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            j2 = asrResultItem.end_time;
        }
        long j4 = j2;
        if ((i2 & 16) != 0) {
            str2 = asrResultItem.content;
        }
        return asrResultItem.copy(i, j3, str3, j4, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSpeakerId() {
        return this.speakerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStart_time() {
        return this.start_time;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEnd_time() {
        return this.end_time;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final AsrResultItem copy(int speakerId, long start_time, @NotNull String userName, long end_time, @NotNull String content) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(content, "content");
        return new AsrResultItem(speakerId, start_time, userName, end_time, content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsrResultItem)) {
            return false;
        }
        AsrResultItem asrResultItem = (AsrResultItem) other;
        return this.speakerId == asrResultItem.speakerId && this.start_time == asrResultItem.start_time && Intrinsics.areEqual(this.userName, asrResultItem.userName) && this.end_time == asrResultItem.end_time && Intrinsics.areEqual(this.content, asrResultItem.content);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getEnd_time() {
        return this.end_time;
    }

    public final int getSpeakerId() {
        return this.speakerId;
    }

    public final long getStart_time() {
        return this.start_time;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.speakerId) * 31) + Long.hashCode(this.start_time)) * 31) + this.userName.hashCode()) * 31) + Long.hashCode(this.end_time)) * 31) + this.content.hashCode();
    }

    public final void setEnd_time(long j) {
        this.end_time = j;
    }

    public final void setSpeakerId(int i) {
        this.speakerId = i;
    }

    public final void setStart_time(long j) {
        this.start_time = j;
    }

    public final void setUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    @NotNull
    public String toString() {
        return "AsrResultItem(speakerId=" + this.speakerId + ", start_time=" + this.start_time + ", userName=" + this.userName + ", end_time=" + this.end_time + ", content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.speakerId);
        dest.writeLong(this.start_time);
        dest.writeString(this.userName);
        dest.writeLong(this.end_time);
        dest.writeString(this.content);
    }
}
