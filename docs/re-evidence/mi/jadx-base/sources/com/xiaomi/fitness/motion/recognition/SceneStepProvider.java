package com.xiaomi.fitness.motion.recognition;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/SceneStepProvider;", "", "getStepCount", "", "Lcom/xiaomi/fitness/motion/recognition/Step;", "beginTime", "", "endTime", "getActsByTime", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SceneStepProvider {
    @NotNull
    List<Step> getActsByTime(long beginTime, long endTime);

    @NotNull
    List<Step> getStepCount(long beginTime, long endTime);
}
