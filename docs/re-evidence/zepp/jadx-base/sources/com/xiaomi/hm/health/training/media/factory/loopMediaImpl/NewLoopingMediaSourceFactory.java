package com.xiaomi.hm.health.training.media.factory.loopMediaImpl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
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
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NewLoopingMediaSourceFactory implements ILoopingMediaSourceFactory {
    private Long a(ActionContent actionContent) {
        List<ActionVideo> list = actionContent.videos;
        return (list == null || list.size() <= 0 || actionContent.videos.get(0).getSize().longValue() <= 0) ? actionContent.actionVideo.size : actionContent.videos.get(0).getSize();
    }

    private String b(ActionContent actionContent) {
        List<ActionVideo> list = actionContent.videos;
        return (list == null || list.size() <= 0 || TextUtils.isEmpty(actionContent.videos.get(0).getUrl())) ? actionContent.actionVideo.url : actionContent.videos.get(0).getUrl();
    }

    @Override // com.xiaomi.hm.health.training.media.factory.ILoopingMediaSourceFactory
    public LoopingMediaSource create(Context context, ActionContent actionContent, int i) {
        Uri uriFromFile = Uri.fromFile(MediaFileUtils.getMedialFromCacheByUri(b(actionContent), a(actionContent).longValue()));
        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSourceFactory(context, Util.getUserAgent(context, "com.xiaomi.hm.health"), DefaultBandwidthMeter.getSingletonInstance(context))).createMediaSource(new MediaItem.Builder().setUri(uriFromFile).build());
        return i == 0 ? new LoopingMediaSource(progressiveMediaSourceCreateMediaSource) : new LoopingMediaSource(progressiveMediaSourceCreateMediaSource, i);
    }
}
