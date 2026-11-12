package com.huami.core.device.feature.gps.filter;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/DataOutCallback;", "", "", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "points", "", "onDataOut", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public interface DataOutCallback {
    void onDataOut(@NotNull List<? extends GpsPointWrapper> points);
}
