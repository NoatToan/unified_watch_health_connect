package com.xiaomi.hm.health.training.media.factory;

import android.content.Context;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;

/* JADX INFO: loaded from: classes21.dex */
public interface ILoopingMediaSourceFactory {
    LoopingMediaSource create(Context context, ActionContent actionContent, int i);
}
