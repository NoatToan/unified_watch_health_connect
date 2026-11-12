package com.huami.core.device.feature.gps.filter;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u0007\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\u0007\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPointFilterHelper;", "", "Lcom/huami/core/device/feature/gps/filter/GpsPointFilterApi;", "getFilterApi", "", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "points", "filterPoints", "Lcom/huami/core/device/feature/gps/filter/DataItemOutCallback;", "dataOutCallback", "", "Lcom/huami/core/device/feature/gps/filter/DataOutCallback;", "<init>", "()V", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public final class GpsPointFilterHelper {
    public static final GpsPointFilterHelper INSTANCE = new GpsPointFilterHelper();

    static {
        System.loadLibrary("gps-filter");
    }

    private GpsPointFilterHelper() {
    }

    @NotNull
    public final List<GpsPointWrapper> filterPoints(@NotNull List<? extends GpsPointWrapper> points) {
        return new GpsPointFilterProcess().filterPoints(points);
    }

    @NotNull
    public final GpsPointFilterApi getFilterApi() {
        return new GpsPointFilterProcess();
    }

    public final void filterPoints(@NotNull List<? extends GpsPointWrapper> points, @NotNull DataItemOutCallback dataOutCallback) {
        GpsPointFilterProcess gpsPointFilterProcess = new GpsPointFilterProcess();
        gpsPointFilterProcess.setDataFlowOutListener(dataOutCallback);
        gpsPointFilterProcess.filterPoints(points);
    }

    public final void filterPoints(@NotNull List<? extends GpsPointWrapper> points, @NotNull DataOutCallback dataOutCallback) {
        GpsPointFilterProcess gpsPointFilterProcess = new GpsPointFilterProcess();
        gpsPointFilterProcess.setDataOutListener(dataOutCallback);
        gpsPointFilterProcess.filterPoints(points);
    }
}
