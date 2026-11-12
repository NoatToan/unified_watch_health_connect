package com.xiaomi.fitness.sleep.behavior.analyze.core;

import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/analyze/core/DreamTalkStrategy;", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BaseStrategy;", "resultDirPath", "", "<init>", "(Ljava/lang/String;)V", "isInvalid", "", "updateFile", "", "behaviorSegment", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/BehaviorSegment;", "fileName", "isCredible", "score", "Lcom/xiaomi/fitness/sleep/behavior/analyze/core/Score;", "type", "", "getType", "()I", "namePrefix", "getNamePrefix", "()Ljava/lang/String;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DreamTalkStrategy extends BaseStrategy {

    @NotNull
    private final String namePrefix;
    private final int type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamTalkStrategy(@NotNull String resultDirPath) {
        super(resultDirPath);
        Intrinsics.checkNotNullParameter(resultDirPath, "resultDirPath");
        this.namePrefix = DeviceTagInterface.CUSTOM_TAG_DISPLAY_TYPE;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    @NotNull
    public String getNamePrefix() {
        return this.namePrefix;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public int getType() {
        return this.type;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.Strategy
    public boolean isCredible(@NotNull Score score) {
        Intrinsics.checkNotNullParameter(score, "score");
        return score.isCredible() == 1 && score.getCredibility() >= 0.5d;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy
    public boolean isInvalid() {
        return getValidCount() < 3;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.analyze.core.BaseStrategy
    public void updateFile(@NotNull BehaviorSegment behaviorSegment, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(behaviorSegment, "behaviorSegment");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        saveAudioFileAndJson(behaviorSegment, fileName);
        updateFileList(behaviorSegment);
    }
}
