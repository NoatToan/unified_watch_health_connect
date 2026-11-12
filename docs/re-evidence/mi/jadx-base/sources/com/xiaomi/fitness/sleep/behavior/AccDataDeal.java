package com.xiaomi.fitness.sleep.behavior;

import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J&\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001c\u0010\u0010\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/AccDataDeal;", "", "<init>", "()V", "cropAccData", "", "startTime", "", "endTime", "detectionStartTime", "detectionEndTime", "data", "", "", "cropStartAccData", "cropEndAccData", "checkAccDataNum", MediaStoreUtil.MediaInfo.SIZE, "collectSuccessful", "", "dateSize", "sleepDuration", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccDataDeal {

    @NotNull
    public static final AccDataDeal INSTANCE = new AccDataDeal();

    private AccDataDeal() {
    }

    private final void cropEndAccData(int endTime, int detectionEndTime, List<Float> data) {
        int i;
        if (ArrayUtils.isEmpty(data) || endTime > detectionEndTime || (i = (detectionEndTime - endTime) * 2) <= 0 || i >= data.size()) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            data.remove(data.size() - 1);
        }
    }

    private final void cropStartAccData(int startTime, int detectionStartTime, List<Float> data) {
        int i;
        if (ArrayUtils.isEmpty(data) || startTime < detectionStartTime || (i = (startTime - detectionStartTime) * 2) <= 0 || i >= data.size()) {
            return;
        }
        data.subList(0, i).clear();
    }

    public final void checkAccDataNum(@NotNull List<Float> data, int size) {
        Intrinsics.checkNotNullParameter(data, "data");
        int size2 = size - data.size();
        int i = 0;
        if (size2 > 0) {
            while (i < size2) {
                data.add(Float.valueOf(100.0f));
                i++;
            }
        } else {
            int i2 = size2 * (-1);
            while (i < i2) {
                data.remove(data.size() - 1);
                i++;
            }
        }
    }

    public final boolean collectSuccessful(int dateSize, int sleepDuration) {
        int i = sleepDuration * 2;
        return ((float) (i - dateSize)) / (((float) i) * 1.0f) <= 0.3f;
    }

    public final void cropAccData(int startTime, int endTime, int detectionStartTime, int detectionEndTime, @NotNull List<Float> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        cropStartAccData(startTime, detectionStartTime, data);
        cropEndAccData(endTime, detectionEndTime, data);
    }
}
