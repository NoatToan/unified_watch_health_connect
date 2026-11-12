package com.huami.view.videoview;

import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
interface a {
    int getCurrentPosition();

    void init(View view, Uri uri);

    void onPause();

    void onResume();

    void setFrameVideoViewListener(FrameVideoViewListener frameVideoViewListener);

    void stop();
}
