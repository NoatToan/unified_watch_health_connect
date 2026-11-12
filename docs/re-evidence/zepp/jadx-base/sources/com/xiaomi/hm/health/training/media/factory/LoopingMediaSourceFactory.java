package com.xiaomi.hm.health.training.media.factory;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.media.factory.loopMediaImpl.NewLoopingMediaSourceFactory;
import com.xiaomi.hm.health.training.media.factory.loopMediaImpl.OldLoopingMediaSourceFactory;

/* JADX INFO: loaded from: classes21.dex */
public class LoopingMediaSourceFactory {
    public static LoopingMediaSource create(Context context, ActionContent actionContent, int i) {
        ActionVideo actionVideo = actionContent.actionVideo;
        return ((actionVideo == null || TextUtils.isEmpty(actionVideo.getUrl())) ? new NewLoopingMediaSourceFactory() : new OldLoopingMediaSourceFactory()).create(context, actionContent, i);
    }
}
