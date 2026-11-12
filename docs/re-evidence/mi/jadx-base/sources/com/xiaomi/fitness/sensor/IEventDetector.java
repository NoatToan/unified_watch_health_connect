package com.xiaomi.fitness.sensor;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sensor/IEventDetector;", "", "detectEvent", "", "getDetectEvent", "()I", "onAttach", "", "indicator", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "requestRefresh", "onDetach", "samplingPeriod", "getSamplingPeriod", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IEventDetector {
    int getDetectEvent();

    int getSamplingPeriod();

    void onAttach(@NotNull IDetectorIndicator indicator);

    void onDetach();

    void requestRefresh();
}
