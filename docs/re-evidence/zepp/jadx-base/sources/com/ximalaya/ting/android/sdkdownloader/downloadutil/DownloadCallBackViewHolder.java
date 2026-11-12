package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public abstract class DownloadCallBackViewHolder implements IXmDownloadTrackCallBack {
    private Track a;

    public DownloadCallBackViewHolder(Track track) {
        this.a = track;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DownloadCallBackViewHolder)) {
            return false;
        }
        DownloadCallBackViewHolder downloadCallBackViewHolder = (DownloadCallBackViewHolder) obj;
        if (downloadCallBackViewHolder.getTrack() == null) {
            return false;
        }
        return downloadCallBackViewHolder.getTrack().equals(this.a);
    }

    public Track getTrack() {
        return this.a;
    }

    public final int hashCode() {
        Track track = this.a;
        return track != null ? track.hashCode() : super.hashCode();
    }

    public void setTrack(Track track) {
        this.a = track;
    }
}
