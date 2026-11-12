package com.xiaomi.fitness.sensor;

import com.mibi.sdk.component.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b`\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00020\b\"\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "", "onRefresh", "", "event", "", "accuracy", Constants.KEY_RECHARGE_VALUES, "", "", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDetectorIndicator {
    void onRefresh(int event, int accuracy, @NotNull float... values);
}
