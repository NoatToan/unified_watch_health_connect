package com.huami.watch.companion.mediac;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huami.watch.transport.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
public class MediaInfo implements SafeParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new a();
    private static final String a = "music";
    public String album;
    public String artist;
    public int currVol;
    public int maxVol;
    public String mediaPlayerName;
    public float speed;
    public String title;
    public Long duration = 0L;
    public Long pos = 0L;
    public Integer state = 0;
    public Integer playerHasGone = 0;
    public Long stateChangeTimeMs = 0L;

    public class a implements Parcelable.Creator<MediaInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaInfo createFromParcel(Parcel parcel) {
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.state = Integer.valueOf(parcel.readInt());
            mediaInfo.artist = parcel.readString();
            mediaInfo.album = parcel.readString();
            mediaInfo.title = parcel.readString();
            mediaInfo.duration = Long.valueOf(parcel.readLong());
            mediaInfo.pos = Long.valueOf(parcel.readLong());
            mediaInfo.currVol = parcel.readInt();
            mediaInfo.maxVol = parcel.readInt();
            mediaInfo.mediaPlayerName = parcel.readString();
            mediaInfo.playerHasGone = Integer.valueOf(parcel.readInt());
            try {
                mediaInfo.stateChangeTimeMs = Long.valueOf(parcel.readLong());
                mediaInfo.speed = parcel.readFloat();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mediaInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaInfo[] newArray(int i) {
            return new MediaInfo[i];
        }
    }

    public void a() {
        this.title = null;
        this.album = null;
        this.artist = null;
        this.duration = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        Log.e("music", "MediaInfo{currVol=" + this.currVol + ", maxVol=" + this.maxVol + ", artist='" + this.artist + "', album='" + this.album + "', title='" + this.title + "', duration=" + this.duration + ", pos=" + this.pos + ", state=" + this.state + ", mediaPlayerName='" + this.mediaPlayerName + "', playerHasGone=" + this.playerHasGone + ", stateChangeTimeMs=" + this.stateChangeTimeMs + ", speed=" + this.speed + '}');
        return super.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.state.intValue());
        parcel.writeString(this.artist);
        parcel.writeString(this.album);
        parcel.writeString(this.title);
        parcel.writeLong(this.duration.longValue());
        parcel.writeLong(this.pos.longValue());
        parcel.writeInt(this.currVol);
        parcel.writeInt(this.maxVol);
        parcel.writeString(this.mediaPlayerName);
        parcel.writeInt(this.playerHasGone.intValue());
        parcel.writeLong(this.stateChangeTimeMs.longValue());
        parcel.writeFloat(this.speed);
    }
}
