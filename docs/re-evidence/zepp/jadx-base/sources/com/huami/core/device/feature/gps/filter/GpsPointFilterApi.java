package com.huami.core.device.feature.gps.filter;

import androidx.annotation.WorkerThread;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H&J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006\f"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPointFilterApi;", "", "Lcom/huami/core/device/feature/gps/filter/DataOutCallback;", "l", "", "setDataOutListener", "Lcom/huami/core/device/feature/gps/filter/DataItemOutCallback;", "setDataFlowOutListener", "", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "points", "filterPoints", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public interface GpsPointFilterApi {
    @WorkerThread
    @NotNull
    List<GpsPointWrapper> filterPoints(@NotNull List<? extends GpsPointWrapper> points);

    void setDataFlowOutListener(@NotNull DataItemOutCallback l);

    void setDataOutListener(@NotNull DataOutCallback l);
}
