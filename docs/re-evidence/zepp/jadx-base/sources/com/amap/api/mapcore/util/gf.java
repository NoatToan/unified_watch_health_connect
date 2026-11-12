package com.amap.api.mapcore.util;

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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class gf implements LocationSource.OnLocationChangedListener, LBSTraceBase {
    private static final TimeUnit s = TimeUnit.SECONDS;
    private Context b;
    private CoordinateConverter c;
    private ExecutorService d;
    private ExecutorService e;
    private TraceStatusListener h;
    private aq i;
    private c n;
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
    public int a = Runtime.getRuntime().availableProcessors();
    private BlockingQueue<Runnable> t = new LinkedBlockingQueue();
    private BlockingQueue<Runnable> u = new LinkedBlockingQueue();

    public class a implements Runnable {
        private int c;
        private int d;
        private List<TraceLocation> e;
        private TraceListener g;
        private List<TraceLocation> b = new ArrayList();
        private String f = ej.a();

        public a(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
            this.c = i2;
            this.d = i;
            this.e = list;
            this.g = traceListener;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004c  */
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int time;
            try {
                gf.this.n.a(this.g);
                List<TraceLocation> list = this.e;
                if (list == null || list.size() == 0) {
                    i = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    i = 0;
                    for (TraceLocation traceLocation : this.e) {
                        if (traceLocation != null) {
                            if (traceLocation.getSpeed() < 0.01d) {
                                arrayList.add(traceLocation);
                            } else {
                                int size = arrayList.size();
                                if (size <= 1) {
                                    time = 0;
                                } else {
                                    TraceLocation traceLocation2 = (TraceLocation) arrayList.get(0);
                                    TraceLocation traceLocation3 = (TraceLocation) arrayList.get(size - 1);
                                    if (traceLocation2 == null || traceLocation3 == null) {
                                        time = 0;
                                    } else {
                                        time = (int) ((traceLocation3.getTime() - traceLocation2.getTime()) / 1000);
                                    }
                                }
                                i += time;
                                arrayList.clear();
                            }
                        }
                    }
                }
                List<TraceLocation> list2 = this.e;
                if (list2 != null && list2.size() >= 2) {
                    Iterator<TraceLocation> it2 = this.e.iterator();
                    while (it2.hasNext()) {
                        TraceLocation traceLocationCopy = it2.next().copy();
                        if (traceLocationCopy != null && traceLocationCopy.getLatitude() > 0.0d && traceLocationCopy.getLongitude() > 0.0d) {
                            this.b.add(traceLocationCopy);
                        }
                    }
                    int size2 = (this.b.size() - 2) / 500;
                    gg.a().a(this.f, this.d, size2, i);
                    int i2 = 0;
                    int size3 = 500;
                    while (i2 <= size2) {
                        if (i2 == size2) {
                            size3 = this.b.size();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < size3; i3++) {
                            TraceLocation traceLocationRemove = this.b.remove(0);
                            if (traceLocationRemove != null) {
                                int i4 = this.c;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                        gf.this.c.from(CoordinateConverter.CoordType.BAIDU);
                                    } else if (i4 == 2) {
                                        gf.this.c.from(CoordinateConverter.CoordType.GPS);
                                    }
                                    gf.this.c.coord(new LatLng(traceLocationRemove.getLatitude(), traceLocationRemove.getLongitude()));
                                    LatLng latLngConvert = gf.this.c.convert();
                                    if (latLngConvert != null) {
                                        traceLocationRemove.setLatitude(latLngConvert.latitude);
                                        traceLocationRemove.setLongitude(latLngConvert.longitude);
                                    }
                                }
                                arrayList2.add(traceLocationRemove);
                            }
                        }
                        if (arrayList2.size() >= 2 && arrayList2.size() <= 500) {
                            gf.this.e.execute(new ge(gf.this.b, gf.this.n, arrayList2, this.f, this.d, i2));
                            int i5 = i2 + 1;
                            try {
                                Thread.sleep(50L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            i2 = i5;
                        }
                    }
                    return;
                }
                gg.a();
                gg.a(gf.this.n, this.d, LBSTraceClient.MIN_GRASP_POINT_ERROR);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements TraceListener {
        private final List<TraceLocation> b;

        public b(List<TraceLocation> list) {
            this.b = list;
        }

        private void a(int i, List<LatLng> list) {
            try {
                synchronized (gf.this.r) {
                    gf.this.r.clear();
                    gf.this.r.addAll(list);
                }
                gf.this.q.clear();
                if (i == 0) {
                    gf.this.q.addAll(gf.this.r);
                } else {
                    gf.this.q.addAll(gf.this.p);
                    gf.this.q.addAll(gf.this.r);
                }
                gf.this.h.onTraceStatus(gf.this.j, gf.this.q, LBSTraceClient.TRACE_SUCCESS);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onFinished(int i, List<LatLng> list, int i2, int i3) {
            a(i, list);
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onRequestFailed(int i, String str) {
            ArrayList arrayList = new ArrayList();
            if (gf.this.r != null) {
                arrayList.addAll(gf.this.r);
            }
            List<TraceLocation> list = this.b;
            if (list != null) {
                int size = list.size();
                if (this.b.size() > gf.this.g) {
                    for (int i2 = size - gf.this.g; i2 < size; i2++) {
                        TraceLocation traceLocation = this.b.get(i2);
                        if (traceLocation != null) {
                            arrayList.add(new LatLng(traceLocation.getLatitude(), traceLocation.getLongitude()));
                        }
                    }
                }
            }
            a(i, arrayList);
        }

        @Override // com.amap.api.trace.TraceListener
        public final void onTraceProcessing(int i, int i2, List<LatLng> list) {
        }
    }

    public static class c extends Handler {
        private TraceListener a;

        public c(Looper looper) {
            super(looper);
        }

        public final void a(TraceListener traceListener) {
            this.a = traceListener;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            try {
                if (this.a == null || (data = message.getData()) == null) {
                    return;
                }
                int i = data.getInt("lineID");
                switch (message.what) {
                    case 100:
                        this.a.onTraceProcessing(i, message.arg1, (List) message.obj);
                        break;
                    case 101:
                        this.a.onFinished(i, (List) message.obj, message.arg1, message.arg2);
                        break;
                    case 102:
                        this.a.onRequestFailed(i, (String) message.obj);
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public gf(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = new CoordinateConverter(applicationContext);
        this.n = new c(Looper.getMainLooper());
        gp.a().a(this.b);
        int i = this.a * 2;
        TimeUnit timeUnit = s;
        this.d = new ThreadPoolExecutor(1, i, 1L, timeUnit, this.t, new ee("AMapTraceManagerProcess"), new ThreadPoolExecutor.AbortPolicy());
        this.e = new ThreadPoolExecutor(1, this.a * 2, 1L, timeUnit, this.u, new ee("AMapTraceManagerRequest"), new ThreadPoolExecutor.AbortPolicy());
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void destroy() {
        try {
            stopTrace();
            ExecutorService executorService = this.d;
            if (executorService != null && !executorService.isShutdown()) {
                this.d.shutdownNow();
                this.d = null;
            }
            ExecutorService executorService2 = this.e;
            if (executorService2 != null && !executorService2.isShutdown()) {
                this.e.shutdownNow();
                this.e = null;
            }
            this.j = null;
            this.h = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.b = null;
        this.c = null;
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
                    TraceLocation traceLocation2 = this.o;
                    if (traceLocation2 != null && traceLocation2.getLatitude() == traceLocation.getLatitude() && traceLocation2.getLongitude() == traceLocation.getLongitude()) {
                        return;
                    }
                    this.j.add(traceLocation);
                    this.o = traceLocation;
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 == this.g) {
                        this.l += i2;
                        int size = this.j.size();
                        if (size >= this.g) {
                            if (size <= 50) {
                                ArrayList arrayList = new ArrayList(this.j);
                                queryProcessedTrace(0, arrayList, 1, new b(arrayList));
                            } else {
                                int i3 = size - 50;
                                if (i3 >= 0) {
                                    a(new ArrayList(this.j.subList(i3 - this.g, i3)));
                                    ArrayList arrayList2 = new ArrayList(this.j.subList(i3, size));
                                    queryProcessedTrace(i3, arrayList2, 1, new b(arrayList2));
                                }
                            }
                        }
                        this.k = 0;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        try {
            this.d.execute(new a(i, list, i2, traceListener));
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
        if (this.b == null) {
            Log.w("LBSTraceClient", "Context need to be initialized");
            return;
        }
        this.m = System.currentTimeMillis();
        this.h = traceStatusListener;
        if (this.i == null) {
            aq aqVar = new aq(this.b);
            this.i = aqVar;
            aqVar.a(this.f);
            this.i.activate(this);
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void stopTrace() {
        aq aqVar = this.i;
        if (aqVar != null) {
            aqVar.deactivate();
            this.i = null;
        }
        this.t.clear();
        this.u.clear();
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

    private void a(List<TraceLocation> list) throws Throwable {
        gf gfVar = this;
        synchronized (gfVar.r) {
            try {
                if (list.size() <= 0) {
                    return;
                }
                if (gfVar.r.size() <= 0) {
                    return;
                }
                LatLng latLng = null;
                double dA = 0.0d;
                TraceLocation traceLocation = null;
                double d = 0.0d;
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
                Iterator<LatLng> it2 = gfVar.r.iterator();
                while (it2.hasNext()) {
                    LatLng next = it2.next();
                    if (next == null) {
                        it2.remove();
                    } else {
                        if (latLng == null) {
                            gfVar.p.add(next);
                            it2.remove();
                        } else {
                            Iterator<LatLng> it3 = it2;
                            try {
                                dA += a(latLng.latitude, latLng.longitude, next.latitude, next.longitude);
                                if (dA >= d) {
                                    break;
                                }
                                gfVar = this;
                                gfVar.p.add(next);
                                it3.remove();
                                it2 = it3;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
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
}
