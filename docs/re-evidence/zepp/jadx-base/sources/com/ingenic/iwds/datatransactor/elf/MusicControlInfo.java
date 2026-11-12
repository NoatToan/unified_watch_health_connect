package com.ingenic.iwds.datatransactor.elf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class MusicControlInfo implements Parcelable {
    public static final Parcelable.Creator<MusicControlInfo> CREATOR = new Parcelable.Creator<MusicControlInfo>() { // from class: com.ingenic.iwds.datatransactor.elf.MusicControlInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MusicControlInfo createFromParcel(Parcel parcel) {
            MusicControlInfo musicControlInfo = new MusicControlInfo();
            musicControlInfo.cmd = parcel.readInt();
            musicControlInfo.musicAlbum = parcel.readString();
            musicControlInfo.musicArtist = parcel.readString();
            musicControlInfo.songName = parcel.readString();
            musicControlInfo.volumeMax = parcel.readInt();
            musicControlInfo.volumeCurrent = parcel.readInt();
            return musicControlInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MusicControlInfo[] newArray(int i) {
            return new MusicControlInfo[i];
        }
    };
    public int cmd = -99;
    public String musicAlbum = null;
    public String musicArtist = null;
    public String songName = null;
    public int volumeMax = 15;
    public int volumeCurrent = 5;

    public enum COMMAND {
        START,
        PAUSE,
        NEXT,
        PREV
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MusicControlInfo [cmd=" + this.cmd + ", musicAlbum=" + this.musicAlbum + ", musicArtist=" + this.musicArtist + ", songName=" + this.songName + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cmd);
        parcel.writeString(this.musicAlbum);
        parcel.writeString(this.musicArtist);
        parcel.writeString(this.songName);
        parcel.writeInt(this.volumeMax);
        parcel.writeInt(this.volumeCurrent);
    }
}
