package com.xiaomi.fitness.util;

import com.xiaomi.fitness.chart.entrys.EnvironmentalNoiseLevel;
import defpackage.c0j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/util/NoiseLevelUtil;", "", "<init>", "()V", "NOISE_LEVEL_PLEASANT_SHRESHOULD", "", "NOISE_LEVEL_HIGH_SHRESHOULD", "getNoiseLevel", "noiseVolume", "getNoiseLevelStringResId", "noiseLevel", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoiseLevelUtil {

    @NotNull
    public static final NoiseLevelUtil INSTANCE = new NoiseLevelUtil();
    private static final int NOISE_LEVEL_PLEASANT_SHRESHOULD = 60;
    private static final int NOISE_LEVEL_HIGH_SHRESHOULD = 80;

    private NoiseLevelUtil() {
    }

    @EnvironmentalNoiseLevel
    public final int getNoiseLevel(int noiseVolume) {
        if (noiseVolume >= NOISE_LEVEL_HIGH_SHRESHOULD) {
            return 2;
        }
        if (noiseVolume >= NOISE_LEVEL_PLEASANT_SHRESHOULD) {
            return 1;
        }
        return noiseVolume >= 0 ? 0 : -1;
    }

    public final int getNoiseLevelStringResId(int noiseLevel) {
        if (noiseLevel == -1) {
            return -1;
        }
        if (noiseLevel == 0) {
            return c0j.T8;
        }
        if (noiseLevel == 1) {
            return c0j.R8;
        }
        if (noiseLevel != 2) {
            return 0;
        }
        return c0j.P8;
    }
}
