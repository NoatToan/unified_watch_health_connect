package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c {
    @Deprecated
    public static MediaSource a(MediaSourceFactory _this, Uri uri) {
        return _this.createMediaSource(MediaItem.fromUri(uri));
    }

    @Deprecated
    public static MediaSourceFactory b(@Nullable MediaSourceFactory mediaSourceFactory, List list) {
        return mediaSourceFactory;
    }
}
