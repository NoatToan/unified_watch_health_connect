package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingVideoPlayBackUtils {
    private Context a;
    private String b;
    private long c;
    private SimpleExoPlayer d;
    private LoopingMediaSource e;

    public TrainingVideoPlayBackUtils(Context context, String str, long j, SimpleExoPlayer simpleExoPlayer) {
        this.a = context;
        this.b = str;
        this.c = j;
        this.d = simpleExoPlayer;
    }

    public void prepareVideoRes() {
        Uri uriFromFile = Uri.fromFile(MediaFileUtils.getMedialFromCacheByUri(this.b, this.c));
        LoopingMediaSource loopingMediaSource = this.e;
        if (loopingMediaSource != null) {
            loopingMediaSource.releaseSource(null);
        }
        DefaultBandwidthMeter singletonInstance = DefaultBandwidthMeter.getSingletonInstance(this.a);
        Context context = this.a;
        DefaultDataSourceFactory defaultDataSourceFactory = new DefaultDataSourceFactory(context, Util.getUserAgent(context, "com.xiaomi.hm.health"), singletonInstance);
        LoopingMediaSource loopingMediaSource2 = new LoopingMediaSource(new ProgressiveMediaSource.Factory(defaultDataSourceFactory).createMediaSource(new MediaItem.Builder().setUri(uriFromFile).build()));
        this.e = loopingMediaSource2;
        this.d.prepare(loopingMediaSource2);
    }

    public void startPlayback() {
        this.d.setPlayWhenReady(true);
    }

    public void stopPlayback() {
        this.d.stop();
        this.d.release();
    }
}
