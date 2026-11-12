package com.huawei.ui.homehealth.healthheadlinecard;

import android.media.session.PlaybackState;
import defpackage.gdy;

/* JADX INFO: loaded from: classes17.dex */
public interface MediaStatusSubscriber {
    void onMediaChanged(gdy gdyVar, int i);

    void onPlaybackStateChanged(PlaybackState playbackState);

    void onProgressChanged(int i, int i2, float f, int i3);
}
