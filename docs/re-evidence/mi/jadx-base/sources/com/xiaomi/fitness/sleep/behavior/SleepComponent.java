package com.xiaomi.fitness.sleep.behavior;

import android.app.Application;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.SnoreAudioFileMigrate;
import com.xiaomi.fitness.sleep.disklrucache.AudioDiskLruCacheHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/SleepComponent;", "", "<init>", "()V", "initAudioCacheDir", "", "context", "Landroid/app/Application;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepComponent {
    public final void initAudioCacheDir(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AudioFileCacheConfig audioFileCacheConfig = AudioFileCacheConfig.INSTANCE;
        String audioCacheDirAbsolutePath = audioFileCacheConfig.getAudioCacheDirAbsolutePath(context);
        long internalAvailableSize = FileUtils.INSTANCE.getInternalAvailableSize();
        AudioDiskLruCacheHelper.INSTANCE.createDiskCacheDir(audioCacheDirAbsolutePath, audioFileCacheConfig.getAudioFileCachedEnable(context) ? Math.min(internalAvailableSize / ((long) 2), AudioFileCacheConfig.CACHE_MAX_SIZE) : internalAvailableSize / ((long) 2));
        SnoreAudioFileMigrate.INSTANCE.moveOldAudioFileToCache(context);
    }
}
