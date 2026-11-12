package com.ximalaya.ting.android.sdkdownloader.model;

import com.ximalaya.ting.android.opensdk.model.track.Track;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class XmDownloadAlbumHaveTracks {
    private XmDownloadAlbum a;
    private List<Track> b;

    public XmDownloadAlbumHaveTracks(XmDownloadAlbum xmDownloadAlbum, List<Track> list) {
        this.a = xmDownloadAlbum;
        this.b = list;
    }

    public XmDownloadAlbum getAlbum() {
        return this.a;
    }

    public List<Track> getTracks() {
        return this.b;
    }

    public void setAlbum(XmDownloadAlbum xmDownloadAlbum) {
        this.a = xmDownloadAlbum;
    }

    public void setTracks(List<Track> list) {
        this.b = list;
    }
}
