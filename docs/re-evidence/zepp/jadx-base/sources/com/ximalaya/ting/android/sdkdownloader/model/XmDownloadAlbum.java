package com.ximalaya.ting.android.sdkdownloader.model;

import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public class XmDownloadAlbum {
    private long a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;
    private long g;

    public static XmDownloadAlbum getAlbumByTrack(Track track) {
        if (track == null || track.getAlbum() == null) {
            return null;
        }
        XmDownloadAlbum xmDownloadAlbum = new XmDownloadAlbum();
        xmDownloadAlbum.setDownloadTrackSize(track.getDownloadSize());
        xmDownloadAlbum.setTrackCount(1);
        xmDownloadAlbum.setAlbumId(track.getAlbum().getAlbumId());
        xmDownloadAlbum.setCoverUrlLarge(track.getAlbum().getCoverUrlLarge());
        xmDownloadAlbum.setCoverUrlMiddle(track.getAlbum().getCoverUrlMiddle());
        xmDownloadAlbum.setCoverUrlSmall(track.getAlbum().getCoverUrlSmall());
        xmDownloadAlbum.setAlbumTitle(track.getAlbum().getAlbumTitle());
        return xmDownloadAlbum;
    }

    public long getAlbumId() {
        return this.a;
    }

    public String getAlbumTitle() {
        return this.b;
    }

    public String getCoverUrlLarge() {
        return this.e;
    }

    public String getCoverUrlMiddle() {
        return this.d;
    }

    public String getCoverUrlSmall() {
        return this.c;
    }

    public long getDownloadTrackSize() {
        return this.g;
    }

    public int getTrackCount() {
        return this.f;
    }

    public void setAlbumId(long j) {
        this.a = j;
    }

    public void setAlbumTitle(String str) {
        this.b = str;
    }

    public void setCoverUrlLarge(String str) {
        this.e = str;
    }

    public void setCoverUrlMiddle(String str) {
        this.d = str;
    }

    public void setCoverUrlSmall(String str) {
        this.c = str;
    }

    public void setDownloadTrackSize(long j) {
        this.g = j;
    }

    public void setTrackCount(int i) {
        this.f = i;
    }

    public void trackCountIncrease() {
        this.f++;
    }
}
