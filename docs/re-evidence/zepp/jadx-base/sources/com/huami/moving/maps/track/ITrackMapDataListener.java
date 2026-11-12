package com.huami.moving.maps.track;

/* JADX INFO: loaded from: classes11.dex */
public interface ITrackMapDataListener {
    void onContourTrackCreated(long j, int i, String str);

    void onTrackDataLoaded(long j, int i);

    void onTrackDataReceived(long j, GPSContourTrack.LoadData loadData);
}
