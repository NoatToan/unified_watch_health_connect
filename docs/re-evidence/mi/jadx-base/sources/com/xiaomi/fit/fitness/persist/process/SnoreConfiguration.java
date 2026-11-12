package com.xiaomi.fit.fitness.persist.process;

import android.content.Context;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0005H\u0007J\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SnoreConfiguration;", "", "<init>", "()V", "SNORE_DECIBEL_DATA_FILE_NAME", "", "SNAIL_COLLECTOR_AUDIO_DIR_NAME", "AUDIO_COLLECTOR_DIR", "AUDIO_CONFIG_DIR_NAME", "AUDIO_RESULT_DIR_NAME", "PATTERN_Y_M_D", "AUDIO_CACHE_DIR_NAME", "getAudioRelativePath", "getAudioCacheRelativePath", "getAudioResultRelativeDir", "timeInMillis", "", "getAudioRootPath", "context", "Landroid/content/Context;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnoreConfiguration {

    @NotNull
    private static final String AUDIO_CACHE_DIR_NAME = "AudioCache";

    @NotNull
    private static final String AUDIO_COLLECTOR_DIR = "Audio";

    @NotNull
    private static final String AUDIO_CONFIG_DIR_NAME = "AudioConfig";

    @NotNull
    private static final String AUDIO_RESULT_DIR_NAME = "AudioResult";

    @NotNull
    public static final SnoreConfiguration INSTANCE = new SnoreConfiguration();

    @NotNull
    private static final String PATTERN_Y_M_D = "yyyy-MM-dd";

    @NotNull
    private static final String SNAIL_COLLECTOR_AUDIO_DIR_NAME = "SnailCollector";

    @NotNull
    public static final String SNORE_DECIBEL_DATA_FILE_NAME = "snore_info.dat";

    private SnoreConfiguration() {
    }

    @JvmStatic
    @NotNull
    public static final String getAudioRelativePath() {
        return "SnailCollector" + File.separator + AUDIO_COLLECTOR_DIR;
    }

    @JvmStatic
    @NotNull
    public static final String getAudioResultRelativeDir(long timeInMillis) {
        String date = TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(timeInMillis));
        String audioRelativePath = getAudioRelativePath();
        String str = File.separator;
        return audioRelativePath + str + date + str + AUDIO_RESULT_DIR_NAME;
    }

    @JvmStatic
    @NotNull
    public static final String getAudioRootPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return FileUtils.getFilesPath(context);
    }

    @NotNull
    public final String getAudioCacheRelativePath() {
        return "SnailCollector" + File.separator + AUDIO_CACHE_DIR_NAME;
    }
}
