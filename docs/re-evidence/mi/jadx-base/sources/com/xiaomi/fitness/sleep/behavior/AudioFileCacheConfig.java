package com.xiaomi.fitness.sleep.behavior;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences;
import com.xiaomi.fitness.common.utils.FileUtils;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/AudioFileCacheConfig;", "", "<init>", "()V", "CACHE_MAX_SIZE", "", "AUDIO_CACHE_DIR_NAME", "", "SPF_NAME", "KEY_CACHED_ENABLE", "sSpf", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "getAudioCacheDirAbsolutePath", "context", "Landroid/content/Context;", "getAudioFileCachedEnableLive", "Landroidx/lifecycle/LiveData;", "", "getAudioFileCachedEnable", "updateAudioFileCachedEnable", "", "enable", "getSpf", "getEditor", "Landroid/content/SharedPreferences$Editor;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioFileCacheConfig {

    @NotNull
    private static final String AUDIO_CACHE_DIR_NAME = "AudioCache";
    public static final long CACHE_MAX_SIZE = 104857600;

    @NotNull
    public static final AudioFileCacheConfig INSTANCE = new AudioFileCacheConfig();

    @NotNull
    private static final String KEY_CACHED_ENABLE = "enable";

    @NotNull
    private static final String SPF_NAME = "com.mi.health.audio_file_cached";

    @Nullable
    private static LiveSharedPreferences sSpf;

    private AudioFileCacheConfig() {
    }

    private final SharedPreferences.Editor getEditor(Context context) {
        return getSpf(context).edit();
    }

    private final LiveSharedPreferences getSpf(Context context) {
        if (sSpf == null) {
            sSpf = new LiveSharedPreferences(context, SPF_NAME);
        }
        LiveSharedPreferences liveSharedPreferences = sSpf;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreferences;
    }

    @NotNull
    public final String getAudioCacheDirAbsolutePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Objects.requireNonNull(context);
        String absolutePath = FileUtils.INSTANCE.createDirInFiles(context, BehaviorConfiguration.SNAIL_COLLECTOR_AUDIO_DIR_NAME + File.separator + AUDIO_CACHE_DIR_NAME).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    public final boolean getAudioFileCachedEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSpf(context).getBoolean("enable", true);
    }

    @NotNull
    public final LiveData<Boolean> getAudioFileCachedEnableLive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getSpf(context).reqBoolean("enable", true);
    }

    public final void updateAudioFileCachedEnable(@NotNull Context context, boolean enable) {
        Intrinsics.checkNotNullParameter(context, "context");
        getEditor(context).putBoolean("enable", enable).apply();
    }
}
