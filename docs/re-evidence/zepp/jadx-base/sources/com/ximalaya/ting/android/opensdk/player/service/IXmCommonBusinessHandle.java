package com.ximalaya.ting.android.opensdk.player.service;

import com.ximalaya.ting.android.opensdk.model.track.Track;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmCommonBusinessHandle {
    void closeApp();

    String getDownloadPlayPath(Track track);

    void isOldTrackDownload(Track track);
}
