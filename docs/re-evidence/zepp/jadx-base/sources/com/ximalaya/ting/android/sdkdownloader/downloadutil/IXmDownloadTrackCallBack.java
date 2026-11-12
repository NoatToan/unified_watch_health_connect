package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.task.Callback;

/* JADX INFO: loaded from: classes22.dex */
public interface IXmDownloadTrackCallBack {
    void onCancelled(Track track, Callback.CancelledException cancelledException);

    void onError(Track track, Throwable th);

    void onProgress(Track track, long j, long j2);

    void onRemoved();

    void onStarted(Track track);

    void onSuccess(Track track);

    void onWaiting(Track track);
}
