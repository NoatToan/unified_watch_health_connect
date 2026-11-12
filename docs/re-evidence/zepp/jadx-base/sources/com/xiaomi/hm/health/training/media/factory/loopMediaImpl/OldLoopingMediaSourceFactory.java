package com.xiaomi.hm.health.training.media.factory.loopMediaImpl;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.media.factory.ILoopingMediaSourceFactory;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public class OldLoopingMediaSourceFactory implements ILoopingMediaSourceFactory {
    @Override // com.xiaomi.hm.health.training.media.factory.ILoopingMediaSourceFactory
    public LoopingMediaSource create(Context context, ActionContent actionContent, int i) {
        ActionVideo actionVideo = actionContent.actionVideo;
        File medialFromCacheByUri = MediaFileUtils.getMedialFromCacheByUri(actionVideo.url, actionVideo.size.longValue());
        if (medialFromCacheByUri == null) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(medialFromCacheByUri);
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(context, Util.getUserAgent(context, "com.xiaomi.hm.health"), DefaultBandwidthMeter.getSingletonInstance(context))).createMediaSource(new MediaItem.Builder().setUri(uriFromFile).build());
        return i == 0 ? new LoopingMediaSource(progressiveMediaSourceCreateMediaSource) : new LoopingMediaSource(progressiveMediaSourceCreateMediaSource, i);
    }
}
