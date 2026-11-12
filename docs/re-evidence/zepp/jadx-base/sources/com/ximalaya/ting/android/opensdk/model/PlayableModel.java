package com.ximalaya.ting.android.opensdk.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.model.live.radio.Radio;
import com.ximalaya.ting.android.opensdk.model.live.schedule.Schedule;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.util.XiMaDataSupport;

/* JADX INFO: loaded from: classes22.dex */
public class PlayableModel extends XiMaDataSupport implements Parcelable {
    public static final Parcelable.Creator<PlayableModel> CREATOR = new Parcelable.Creator<PlayableModel>() { // from class: com.ximalaya.ting.android.opensdk.model.PlayableModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayableModel createFromParcel(Parcel parcel) {
            return new PlayableModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayableModel[] newArray(int i) {
            return new PlayableModel[i];
        }
    };
    public static final String KIND_ASSISTED_SLEEP_TRACK = "assisted_sleep_track";
    public static final String KIND_LIVE_FLV = "live_flv";
    public static final String KIND_PAID_TRACK = "paid_track";
    public static final String KIND_RADIO = "radio";
    public static final String KIND_SCHEDULE = "schedule";
    public static final String KIND_TRACK = "track";
    public static final String KIND_TTS = "tts";

    @SerializedName(alternate = {"trackId", "track_id"}, value = "id")
    private long dataId;
    public boolean isWeikeTrack;
    private String kind;
    private int lastPlayedMills;
    public long weikeLessonId;
    public long weikeRoomId;
    public String weikeTrackId;

    public PlayableModel() {
        this.lastPlayedMills = -1;
    }

    public static boolean isTrackKind(String str) {
        return "track".equals(str) || KIND_PAID_TRACK.equals(str) || KIND_ASSISTED_SLEEP_TRACK.equals(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        boolean z = (obj instanceof Track) && (this instanceof Track);
        boolean z2 = (obj instanceof Radio) && (this instanceof Radio);
        boolean z3 = (obj instanceof Schedule) && (this instanceof Schedule);
        boolean z4 = getClass() == obj.getClass();
        if (!z && !z2 && !z3 && !z4) {
            return false;
        }
        PlayableModel playableModel = (PlayableModel) obj;
        boolean z5 = this.isWeikeTrack;
        if (z5 != playableModel.isWeikeTrack) {
            return false;
        }
        if (z5) {
            return TextUtils.equals(this.weikeTrackId, playableModel.weikeTrackId);
        }
        return this.dataId == playableModel.dataId;
    }

    public long getDataId() {
        return this.dataId;
    }

    public boolean getIsWeikeTrack() {
        return this.isWeikeTrack;
    }

    public String getKind() {
        return this.kind;
    }

    public int getLastPlayedMills() {
        return this.lastPlayedMills;
    }

    public long getWeikeLessonId() {
        return this.weikeLessonId;
    }

    public long getWeikeRoomId() {
        return this.weikeRoomId;
    }

    public String getWeikeTrackId() {
        return this.weikeTrackId;
    }

    public int hashCode() {
        long j = this.dataId;
        return 31 + ((int) (j ^ (j >>> 32)));
    }

    public void readFromParcel(Parcel parcel) {
        setDataId(parcel.readLong());
        setKind(parcel.readString());
        setLastPlayedMills(parcel.readInt());
        setIsWeikeTrack(parcel.readInt() != 0);
        setWeikeRoomId(parcel.readLong());
        setWeikeLessonId(parcel.readLong());
        setWeikeTrackId(parcel.readString());
    }

    public void setDataId(long j) {
        this.dataId = j;
    }

    public void setIsWeikeTrack(boolean z) {
        this.isWeikeTrack = z;
    }

    public void setKind(String str) {
        this.kind = str;
    }

    public void setLastPlayedMills(int i) {
        this.lastPlayedMills = i;
    }

    public void setWeikeLessonId(long j) {
        this.weikeLessonId = j;
    }

    public void setWeikeRoomId(long j) {
        this.weikeRoomId = j;
    }

    public void setWeikeTrackId(String str) {
        this.weikeTrackId = str;
    }

    public String toString() {
        return "PlayableModel{dataId=" + this.dataId + ", kind='" + this.kind + "', lastPlayedMills=" + this.lastPlayedMills + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.dataId);
        parcel.writeString(this.kind);
        parcel.writeInt(this.lastPlayedMills);
        parcel.writeByte(this.isWeikeTrack ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.weikeRoomId);
        parcel.writeLong(this.weikeLessonId);
        parcel.writeString(this.weikeTrackId);
    }

    public PlayableModel(Parcel parcel) {
        this.lastPlayedMills = -1;
        this.dataId = parcel.readLong();
        this.kind = parcel.readString();
        this.lastPlayedMills = parcel.readInt();
        this.isWeikeTrack = parcel.readByte() != 0;
        this.weikeRoomId = parcel.readLong();
        this.weikeLessonId = parcel.readLong();
        this.weikeTrackId = parcel.readString();
    }
}
