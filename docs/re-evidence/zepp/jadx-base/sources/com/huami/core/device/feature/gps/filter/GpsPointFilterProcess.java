package com.huami.core.device.feature.gps.filter;

import androidx.annotation.Keep;
import com.huami.core.device.feature.gps.filter.internal.GpsPointConverter;
import com.huami.tools.log.HMLog;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001b\u001a\u00020\rH\u0086 J\t\u0010\u001c\u001a\u00020\rH\u0086 R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006)"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPointFilterProcess;", "Lcom/huami/core/device/feature/gps/filter/GpsPointFilterApi;", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "wrapper", "Lcom/huami/core/device/feature/gps/filter/GpsPoint;", "wrapperToPoint", "gpsPoint", "", "hasNext", "", "inputGpsFilterData", "Lcom/huami/core/device/feature/gps/filter/DataOutCallback;", "l", "", "setDataOutListener", "Lcom/huami/core/device/feature/gps/filter/DataItemOutCallback;", "setDataFlowOutListener", "", "points", "filterPoints", "pointWrapper", "loadPoint", "point", "dataOutPut", "fetchPoints$gps_filter_release", "()Ljava/util/List;", "fetchPoints", "finish", "loadTest", "", "tag", "Ljava/lang/String;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "Ljava/lang/ref/SoftReference;", "daOutCallback", "Ljava/lang/ref/SoftReference;", "dataItemOutCallback", "<init>", "()V", "Companion", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public final class GpsPointFilterProcess implements GpsPointFilterApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean debug;
    private SoftReference<DataOutCallback> daOutCallback;
    private SoftReference<DataItemOutCallback> dataItemOutCallback;
    private final String tag = GpsPointFilterProcess.class.getSimpleName();
    private final LinkedList<GpsPoint> points = new LinkedList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nR(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/GpsPointFilterProcess$Companion;", "", "", "debug", "Z", "getDebug", "()Z", "setDebug", "(Z)V", "debug$annotations", "()V", "<init>", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static /* synthetic */ void debug$annotations() {
        }

        public final boolean getDebug() {
            return GpsPointFilterProcess.debug;
        }

        public final void setDebug(boolean z) {
            GpsPointFilterProcess.debug = z;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final boolean getDebug() {
        return debug;
    }

    private final native int inputGpsFilterData(GpsPoint gpsPoint, boolean hasNext);

    public static /* synthetic */ void loadPoint$default(GpsPointFilterProcess gpsPointFilterProcess, GpsPointWrapper gpsPointWrapper, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        gpsPointFilterProcess.loadPoint(gpsPointWrapper, z);
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    private final GpsPoint wrapperToPoint(GpsPointWrapper wrapper) {
        return new GpsPoint(wrapper.time(), wrapper.latitude(), wrapper.longitude(), wrapper.altitude(), wrapper.state(), wrapper.pace());
    }

    public final void dataOutPut(@NotNull GpsPoint point) {
        DataItemOutCallback dataItemOutCallback;
        if (debug) {
            HMLog.i(this.tag, "data out --> " + point, new Object[0]);
        }
        this.points.push(point);
        SoftReference<DataItemOutCallback> softReference = this.dataItemOutCallback;
        if (softReference == null || (dataItemOutCallback = softReference.get()) == null) {
            return;
        }
        dataItemOutCallback.onItemBack(new GpsPointConverter(point), true);
    }

    @NotNull
    public final List<GpsPointWrapper> fetchPoints$gps_filter_release() {
        LinkedList<GpsPoint> linkedList = this.points;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedList, 10));
        Iterator<T> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            arrayList.add(new GpsPointConverter((GpsPoint) it2.next()));
        }
        this.points.clear();
        return arrayList;
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointFilterApi
    @NotNull
    public List<GpsPointWrapper> filterPoints(@NotNull List<? extends GpsPointWrapper> points) {
        List<GpsPointWrapper> listSortedWith;
        DataItemOutCallback dataItemOutCallback;
        DataOutCallback dataOutCallback;
        HMLog.w("Test-Check", "使用了算法滤波 time = " + Calendar.getInstance().getTime(), new Object[0]);
        synchronized (this) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(points, 10));
            Iterator<T> it2 = points.iterator();
            while (it2.hasNext()) {
                loadPoint$default(this, (GpsPointWrapper) it2.next(), false, 2, null);
                arrayList.add(Unit.INSTANCE);
            }
            finish();
            List<GpsPointWrapper> listFetchPoints$gps_filter_release = fetchPoints$gps_filter_release();
            SoftReference<DataOutCallback> softReference = this.daOutCallback;
            if (softReference != null && (dataOutCallback = softReference.get()) != null) {
                dataOutCallback.onDataOut(listFetchPoints$gps_filter_release);
            }
            SoftReference<DataItemOutCallback> softReference2 = this.dataItemOutCallback;
            if (softReference2 != null && (dataItemOutCallback = softReference2.get()) != null) {
                dataItemOutCallback.onItemBack(null, false);
            }
            HMLog.i("Test-Check", "算法滤波结束 time = " + Calendar.getInstance().getTime(), new Object[0]);
            listSortedWith = CollectionsKt___CollectionsKt.sortedWith(listFetchPoints$gps_filter_release, new Comparator<T>() { // from class: com.huami.core.device.feature.gps.filter.GpsPointFilterProcess$$special$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((GpsPointWrapper) t).time()), Integer.valueOf(((GpsPointWrapper) t2).time()));
                }
            });
        }
        return listSortedWith;
    }

    public final native void finish();

    public final void loadPoint(@NotNull GpsPointWrapper pointWrapper, boolean hasNext) {
        inputGpsFilterData(wrapperToPoint(pointWrapper), hasNext);
    }

    public final native void loadTest();

    @Override // com.huami.core.device.feature.gps.filter.GpsPointFilterApi
    public void setDataFlowOutListener(@NotNull DataItemOutCallback l) {
        this.dataItemOutCallback = new SoftReference<>(l);
    }

    @Override // com.huami.core.device.feature.gps.filter.GpsPointFilterApi
    public void setDataOutListener(@NotNull DataOutCallback l) {
        this.daOutCallback = new SoftReference<>(l);
    }
}
