package com.amap.api.col.p0003sl;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.trace.LBSTraceBase;
import com.amap.api.trace.LBSTraceClient;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import com.amap.api.trace.TraceStatusListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes21.dex */
public final class ih implements LocationSource.OnLocationChangedListener, LBSTraceBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CoordinateConverter f2745c;
    private ma d;
    private ma e;
    private TraceStatusListener h;
    private ba i;
    private long f = 2000;
    private int g = 5;
    private List<TraceLocation> j = new ArrayList();
    private int k = 0;
    private int l = 0;
    private long m = 0;
    private TraceLocation o = null;
    private List<LatLng> p = new ArrayList();
    private List<LatLng> q = new ArrayList();
    private List<LatLng> r = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2743a = Runtime.getRuntime().availableProcessors();
    private BlockingQueue<Runnable> s = new LinkedBlockingQueue();
    private BlockingQueue<Runnable> t = new LinkedBlockingQueue();
    private c n = new c(Looper.getMainLooper());

    public ih(Context context) {
        this.f2744b = context.getApplicationContext();
        this.f2745c = new CoordinateConverter(this.f2744b);
        ir.a().a(this.f2744b);
        this.d = ea.a(this.f2743a * 2, this.s, "AMapTraceManagerProcess");
        this.e = ea.a(this.f2743a * 2, this.t, "AMapTraceManagerRequest");
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        try {
            this.d.a(new a(i, list, i2, traceListener));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setLocationInterval(long j) {
        this.f = j;
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setTraceStatusInterval(int i) {
        this.g = Math.max(i, 2);
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void startTrace(TraceStatusListener traceStatusListener) {
        if (this.f2744b == null) {
            Log.w("LBSTraceClient", "Context need to be initialized");
            return;
        }
        this.m = System.currentTimeMillis();
        this.h = traceStatusListener;
        if (this.i == null) {
            ba baVar = new ba(this.f2744b);
            this.i = baVar;
            baVar.a(this.f);
            this.i.activate(this);
        }
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        TraceStatusListener traceStatusListener;
        if (this.h != null) {
            try {
                if (System.currentTimeMillis() - this.m >= 30000 && (traceStatusListener = this.h) != null) {
                    traceStatusListener.onTraceStatus(null, null, LBSTraceClient.LOCATE_TIMEOUT_ERROR);
                }
                this.m = System.currentTimeMillis();
                Bundle extras = location.getExtras();
                int i = extras.getInt("errorCode");
                if (i != 0) {
                    Log.w("LBSTraceClient", "Locate failed [errorCode:\"" + i + "\"  errorInfo:" + extras.getString(MyLocationStyle.ERROR_INFO) + "\"]");
                    return;
                }
                synchronized (this.j) {
                    TraceLocation traceLocation = new TraceLocation(location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getBearing(), location.getTime());
                    if (a(this.o, traceLocation)) {
                        return;
                    }
                    this.j.add(traceLocation);
                    this.o = traceLocation;
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 == this.g) {
                        this.l += i2;
                        a();
                        this.k = 0;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static boolean a(TraceLocation traceLocation, TraceLocation traceLocation2) {
        return traceLocation != null && traceLocation.getLatitude() == traceLocation2.getLatitude() && traceLocation.getLongitude() == traceLocation2.getLongitude();
    }

    private void a() throws Throwable {
        int size = this.j.size();
        if (size < this.g) {
            return;
        }
        if (size <= 50) {
            ArrayList arrayList = new ArrayList(this.j);
            queryProcessedTrace(0, arrayList, 1, new b(arrayList));
            return;
        }
        int i = size - 50;
        if (i < 0) {
            return;
        }
        a(new ArrayList(this.j.subList(i - this.g, i)));
        ArrayList arrayList2 = new ArrayList(this.j.subList(i, size));
        queryProcessedTrace(i, arrayList2, 1, new b(arrayList2));
    }

    private void a(List<TraceLocation> list) throws Throwable {
        Iterator<LatLng> it;
        ih ihVar = this;
        synchronized (ihVar.r) {
            try {
                if (list.size() <= 0) {
                    return;
                }
                if (ihVar.r.size() <= 0) {
                    return;
                }
                double dA = 0.0d;
                LatLng latLng = null;
                double d = 0.0d;
                TraceLocation traceLocation = null;
                for (TraceLocation traceLocation2 : list) {
                    if (traceLocation2 != null) {
                        if (traceLocation != null) {
                            double dA2 = a(traceLocation.getLatitude(), traceLocation.getLongitude(), traceLocation2.getLatitude(), traceLocation2.getLongitude());
                            if (dA2 <= 100.0d) {
                                d += dA2;
                            }
                        }
                        traceLocation = traceLocation2;
                    }
                }
                Iterator<LatLng> it2 = ihVar.r.iterator();
                while (it2.hasNext()) {
                    LatLng next = it2.next();
                    if (next == null) {
                        it2.remove();
                    } else {
                        if (latLng == null) {
                            ihVar.p.add(next);
                            it2.remove();
                            it = it2;
                        } else {
                            it = it2;
                            try {
                                dA += a(latLng.latitude, latLng.longitude, next.latitude, next.longitude);
                                if (dA >= d) {
                                    break;
                                }
                                ihVar = this;
                                ihVar.p.add(next);
                                it.remove();
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        it2 = it;
                        latLng = next;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private static double a(double d, double d2, double d3, double d4) {
        double d5 = d > d3 ? d - d3 : d3 - d;
        double d6 = d2 > d4 ? d2 - d4 : d4 - d2;
        return Math.sqrt((d5 * d5) + (d6 * d6));
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void stopTrace() {
        b();
        c();
    }

    private void b() {
        ba baVar = this.i;
        if (baVar != null) {
            baVar.deactivate();
            this.i = null;
        }
    }

    private void c() {
        this.s.clear();
        this.t.clear();
        List<TraceLocation> list = this.j;
        if (list != null) {
            synchronized (list) {
                List<TraceLocation> list2 = this.j;
                if (list2 != null) {
                    list2.clear();
                }
                this.l = 0;
                this.k = 0;
                this.m = 0L;
                this.o = null;
            }
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void destroy() {
        try {
            stopTrace();
            ma maVar = this.d;
            if (maVar != null) {
                maVar.e();
                this.d = null;
            }
            ma maVar2 = this.e;
            if (maVar2 != null) {
                maVar2.e();
                this.e = null;
            }
            this.j = null;
            this.h = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f2744b = null;
        this.f2745c = null;
    }

    final class b implements TraceListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<TraceLocation> f2752b;

        @Override // com.amap.api.trace.TraceListener
        public final void onTraceProcessing(int i, int i2, List<LatLng> list) {
        }

        public b(List<TraceLocation> list) {
            this.f2752b = list;
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onRequestFailed(int i, String str) {
            ArrayList arrayList = new ArrayList();
            if (ih.this.r != null) {
                arrayList.addAll(ih.this.r);
            }
            List<TraceLocation> list = this.f2752b;
            if (list != null) {
                int size = list.size();
                if (this.f2752b.size() > ih.this.g) {
                    for (int i2 = size - ih.this.g; i2 < size; i2++) {
                        TraceLocation traceLocation = this.f2752b.get(i2);
                        if (traceLocation != null) {
                            arrayList.add(new LatLng(traceLocation.getLatitude(), traceLocation.getLongitude()));
                        }
                    }
                }
            }
            a(i, arrayList);
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onFinished(int i, List<LatLng> list, int i2, int i3) {
            a(i, list);
        }

        private void a(int i, List<LatLng> list) {
            try {
                synchronized (ih.this.r) {
                    ih.this.r.clear();
                    ih.this.r.addAll(list);
                }
                ih.this.q.clear();
                if (i == 0) {
                    ih.this.q.addAll(ih.this.r);
                } else {
                    ih.this.q.addAll(ih.this.p);
                    ih.this.q.addAll(ih.this.r);
                }
                ih.this.h.onTraceStatus(ih.this.j, ih.this.q, LBSTraceClient.TRACE_SUCCESS);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    final class a extends mb {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2748c;
        private int d;
        private List<TraceLocation> e;
        private TraceListener h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<TraceLocation> f2747b = new ArrayList();
        private String g = dt.a();

        public a(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
            this.f2748c = i2;
            this.d = i;
            this.e = list;
            this.h = traceListener;
        }

        @Override // com.amap.api.col.p0003sl.mb
        public final void runTask() {
            try {
                ih.this.n.a(this.h);
                int iA = a();
                List<TraceLocation> list = this.e;
                if (list != null && list.size() >= 2) {
                    Iterator<TraceLocation> it = this.e.iterator();
                    while (it.hasNext()) {
                        TraceLocation traceLocationCopy = it.next().copy();
                        if (traceLocationCopy != null && traceLocationCopy.getLatitude() > 0.0d && traceLocationCopy.getLongitude() > 0.0d) {
                            this.f2747b.add(traceLocationCopy);
                        }
                    }
                    int size = (this.f2747b.size() - 2) / 500;
                    ii.a().a(this.g, this.d, size, iA);
                    int i = 0;
                    int size2 = 500;
                    while (i <= size) {
                        if (i == size) {
                            size2 = this.f2747b.size();
                        }
                        int i2 = size2;
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i2; i3++) {
                            TraceLocation traceLocationRemove = this.f2747b.remove(0);
                            if (traceLocationRemove != null) {
                                int i4 = this.f2748c;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                        ih.this.f2745c.from(CoordinateConverter.CoordType.BAIDU);
                                    } else if (i4 == 2) {
                                        ih.this.f2745c.from(CoordinateConverter.CoordType.GPS);
                                    }
                                    ih.this.f2745c.coord(new LatLng(traceLocationRemove.getLatitude(), traceLocationRemove.getLongitude()));
                                    LatLng latLngConvert = ih.this.f2745c.convert();
                                    if (latLngConvert != null) {
                                        traceLocationRemove.setLatitude(latLngConvert.latitude);
                                        traceLocationRemove.setLongitude(latLngConvert.longitude);
                                    }
                                }
                                arrayList.add(traceLocationRemove);
                            }
                        }
                        if (arrayList.size() >= 2 && arrayList.size() <= 500) {
                            final ig igVar = new ig(ih.this.f2744b, ih.this.n, arrayList, this.g, this.d, i);
                            ih.this.e.a(new mb() { // from class: com.amap.api.col.3sl.ih.a.1
                                @Override // com.amap.api.col.p0003sl.mb
                                public final void runTask() {
                                    igVar.run();
                                }
                            });
                            i++;
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        size2 = i2;
                    }
                    return;
                }
                ii.a();
                ii.a(ih.this.n, this.d, LBSTraceClient.MIN_GRASP_POINT_ERROR);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private int a() {
            List<TraceLocation> list = this.e;
            int iA = 0;
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (TraceLocation traceLocation : this.e) {
                    if (traceLocation != null) {
                        if (traceLocation.getSpeed() < 0.01d) {
                            arrayList.add(traceLocation);
                        } else {
                            iA += a(arrayList);
                            arrayList.clear();
                        }
                    }
                }
            }
            return iA;
        }

        private static int a(List<TraceLocation> list) {
            int size = list.size();
            if (size <= 1) {
                return 0;
            }
            TraceLocation traceLocation = list.get(0);
            TraceLocation traceLocation2 = list.get(size - 1);
            if (traceLocation == null || traceLocation2 == null || traceLocation == null || traceLocation2 == null) {
                return 0;
            }
            return (int) ((traceLocation2.getTime() - traceLocation.getTime()) / 1000);
        }
    }

    static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TraceListener f2753a;

        public c(Looper looper) {
            super(looper);
        }

        public final void a(TraceListener traceListener) {
            this.f2753a = traceListener;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            try {
                if (this.f2753a != null && (data = message.getData()) != null) {
                    int i = data.getInt("lineID");
                    switch (message.what) {
                        case 100:
                            this.f2753a.onTraceProcessing(i, message.arg1, (List) message.obj);
                            break;
                        case 101:
                            this.f2753a.onFinished(i, (List) message.obj, message.arg1, message.arg2);
                            break;
                        case 102:
                            this.f2753a.onRequestFailed(i, (String) message.obj);
                            break;
                        default:
                            break;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
