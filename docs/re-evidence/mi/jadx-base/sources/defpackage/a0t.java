package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.r;
import com.amap.api.maps.CoordinateConverter;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.trace.LBSTraceBase;
import com.amap.api.trace.LBSTraceClient;
import com.amap.api.trace.TraceListener;
import com.amap.api.trace.TraceLocation;
import com.amap.api.trace.TraceStatusListener;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class a0t implements LocationSource.OnLocationChangedListener, LBSTraceBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CoordinateConverter f497b;
    public j1 c;
    public j1 d;
    public TraceStatusListener g;
    public com.amap.api.col.p0003sl.a h;
    public c m;
    public long e = VibrateModeProgressBar.sLongToLong;
    public int f = 5;
    public List<TraceLocation> i = new ArrayList();
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f498k = 0;
    public long l = 0;
    public TraceLocation n = null;
    public List<LatLng> o = new ArrayList();
    public List<LatLng> p = new ArrayList();
    public List<LatLng> q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f499r = Runtime.getRuntime().availableProcessors();
    public BlockingQueue<Runnable> s = new LinkedBlockingQueue();
    public BlockingQueue<Runnable> t = new LinkedBlockingQueue();

    public class a extends f7t {
        public int e;
        public int g;
        public List<TraceLocation> h;
        public TraceListener j;
        public List<TraceLocation> d = new ArrayList();
        public String i = tls.a();

        /* JADX INFO: renamed from: a0t$a$a, reason: collision with other inner class name */
        public class C0001a extends f7t {
            public final /* synthetic */ zzs d;

            public C0001a(zzs zzsVar) {
                this.d = zzsVar;
            }

            @Override // defpackage.f7t
            public final void runTask() {
                this.d.run();
            }
        }

        public a(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
            this.e = i2;
            this.g = i;
            this.h = list;
            this.j = traceListener;
        }

        public static int e(List<TraceLocation> list) {
            int size = list.size();
            if (size <= 1) {
                return 0;
            }
            TraceLocation traceLocation = list.get(0);
            TraceLocation traceLocation2 = list.get(size - 1);
            if (traceLocation == null || traceLocation2 == null) {
                return 0;
            }
            return (int) ((traceLocation2.getTime() - traceLocation.getTime()) / 1000);
        }

        public final int d() {
            List<TraceLocation> list = this.h;
            int iE = 0;
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (TraceLocation traceLocation : this.h) {
                    if (traceLocation != null) {
                        if (traceLocation.getSpeed() < 0.01d) {
                            arrayList.add(traceLocation);
                        } else {
                            iE += e(arrayList);
                            arrayList.clear();
                        }
                    }
                }
            }
            return iE;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                a0t.this.m.a(this.j);
                int iD = d();
                List<TraceLocation> list = this.h;
                if (list != null && list.size() >= 2) {
                    Iterator<TraceLocation> it = this.h.iterator();
                    while (it.hasNext()) {
                        TraceLocation traceLocationCopy = it.next().copy();
                        if (traceLocationCopy != null && traceLocationCopy.getLatitude() > 0.0d && traceLocationCopy.getLongitude() > 0.0d) {
                            this.d.add(traceLocationCopy);
                        }
                    }
                    int size = (this.d.size() - 2) / 500;
                    b0t.b().d(this.i, this.g, size, iD);
                    int i = 0;
                    int size2 = 500;
                    while (i <= size) {
                        if (i == size) {
                            size2 = this.d.size();
                        }
                        int i2 = size2;
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i2; i3++) {
                            TraceLocation traceLocationRemove = this.d.remove(0);
                            if (traceLocationRemove != null) {
                                int i4 = this.e;
                                if (i4 != 1) {
                                    if (i4 == 3) {
                                        a0t.this.f497b.from(CoordinateConverter.CoordType.BAIDU);
                                    } else if (i4 == 2) {
                                        a0t.this.f497b.from(CoordinateConverter.CoordType.GPS);
                                    }
                                    a0t.this.f497b.coord(new LatLng(traceLocationRemove.getLatitude(), traceLocationRemove.getLongitude()));
                                    LatLng latLngConvert = a0t.this.f497b.convert();
                                    if (latLngConvert != null) {
                                        traceLocationRemove.setLatitude(latLngConvert.latitude);
                                        traceLocationRemove.setLongitude(latLngConvert.longitude);
                                    }
                                }
                                arrayList.add(traceLocationRemove);
                            }
                        }
                        if (arrayList.size() >= 2 && arrayList.size() <= 500) {
                            a0t.this.d.b(new C0001a(new zzs(a0t.this.f496a, a0t.this.m, arrayList, this.i, this.g, i)));
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
                b0t.b();
                b0t.c(a0t.this.m, this.g, LBSTraceClient.MIN_GRASP_POINT_ERROR);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements TraceListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<TraceLocation> f501a;

        public b(List<TraceLocation> list) {
            this.f501a = list;
        }

        public final void a(int i, List<LatLng> list) {
            try {
                synchronized (a0t.this.q) {
                    a0t.this.q.clear();
                    a0t.this.q.addAll(list);
                }
                a0t.this.p.clear();
                if (i == 0) {
                    a0t.this.p.addAll(a0t.this.q);
                } else {
                    a0t.this.p.addAll(a0t.this.o);
                    a0t.this.p.addAll(a0t.this.q);
                }
                a0t.this.g.onTraceStatus(a0t.this.i, a0t.this.p, LBSTraceClient.TRACE_SUCCESS);
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
            if (a0t.this.q != null) {
                arrayList.addAll(a0t.this.q);
            }
            List<TraceLocation> list = this.f501a;
            if (list != null) {
                int size = list.size();
                if (this.f501a.size() > a0t.this.f) {
                    for (int i2 = size - a0t.this.f; i2 < size; i2++) {
                        TraceLocation traceLocation = this.f501a.get(i2);
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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TraceListener f503a;

        public c(Looper looper) {
            super(looper);
        }

        public final void a(TraceListener traceListener) {
            this.f503a = traceListener;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data;
            try {
                if (this.f503a == null || (data = message.getData()) == null) {
                    return;
                }
                int i = data.getInt("lineID");
                switch (message.what) {
                    case 100:
                        this.f503a.onTraceProcessing(i, message.arg1, (List) message.obj);
                        break;
                    case 101:
                        this.f503a.onFinished(i, (List) message.obj, message.arg1, message.arg2);
                        break;
                    case 102:
                        this.f503a.onRequestFailed(i, (String) message.obj);
                        break;
                    default:
                        break;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public a0t(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f496a = applicationContext;
        this.f497b = new CoordinateConverter(applicationContext);
        this.m = new c(Looper.getMainLooper());
        k0t.a().c(this.f496a);
        this.c = r.a(this.f499r * 2, this.s, "AMapTraceManagerProcess");
        this.d = r.a(this.f499r * 2, this.t, "AMapTraceManagerRequest");
    }

    public static double a(double d, double d2, double d3, double d4) {
        double d5 = d > d3 ? d - d3 : d3 - d;
        double d6 = d2 > d4 ? d2 - d4 : d4 - d2;
        return Math.sqrt((d5 * d5) + (d6 * d6));
    }

    public static boolean e(TraceLocation traceLocation, TraceLocation traceLocation2) {
        return traceLocation != null && traceLocation.getLatitude() == traceLocation2.getLatitude() && traceLocation.getLongitude() == traceLocation2.getLongitude();
    }

    public final void c() throws Throwable {
        int size = this.i.size();
        if (size < this.f) {
            return;
        }
        if (size <= 50) {
            ArrayList arrayList = new ArrayList(this.i);
            queryProcessedTrace(0, arrayList, 1, new b(arrayList));
            return;
        }
        int i = size - 50;
        if (i < 0) {
            return;
        }
        d(new ArrayList(this.i.subList(i - this.f, i)));
        ArrayList arrayList2 = new ArrayList(this.i.subList(i, size));
        queryProcessedTrace(i, arrayList2, 1, new b(arrayList2));
    }

    public final void d(List<TraceLocation> list) throws Throwable {
        a0t a0tVar = this;
        synchronized (a0tVar.q) {
            try {
                if (list.size() <= 0) {
                    return;
                }
                if (a0tVar.q.size() <= 0) {
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
                Iterator<LatLng> it = a0tVar.q.iterator();
                while (it.hasNext()) {
                    LatLng next = it.next();
                    if (next == null) {
                        it.remove();
                    } else {
                        if (latLng == null) {
                            a0tVar.o.add(next);
                            it.remove();
                        } else {
                            Iterator<LatLng> it2 = it;
                            try {
                                dA += a(latLng.latitude, latLng.longitude, next.latitude, next.longitude);
                                if (dA >= d) {
                                    break;
                                }
                                a0tVar = this;
                                a0tVar.o.add(next);
                                it2.remove();
                                it = it2;
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

    @Override // com.amap.api.trace.LBSTraceBase
    public final void destroy() {
        try {
            stopTrace();
            j1 j1Var = this.c;
            if (j1Var != null) {
                j1Var.g();
                this.c = null;
            }
            j1 j1Var2 = this.d;
            if (j1Var2 != null) {
                j1Var2.g();
                this.d = null;
            }
            this.i = null;
            this.g = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f496a = null;
        this.f497b = null;
    }

    public final void g() {
        com.amap.api.col.p0003sl.a aVar = this.h;
        if (aVar != null) {
            aVar.deactivate();
            this.h = null;
        }
    }

    public final void i() {
        this.s.clear();
        this.t.clear();
        List<TraceLocation> list = this.i;
        if (list != null) {
            synchronized (list) {
                try {
                    List<TraceLocation> list2 = this.i;
                    if (list2 != null) {
                        list2.clear();
                    }
                    this.f498k = 0;
                    this.j = 0;
                    this.l = 0L;
                    this.n = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.amap.api.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        TraceStatusListener traceStatusListener;
        if (this.g != null) {
            try {
                if (System.currentTimeMillis() - this.l >= 30000 && (traceStatusListener = this.g) != null) {
                    traceStatusListener.onTraceStatus(null, null, LBSTraceClient.LOCATE_TIMEOUT_ERROR);
                }
                this.l = System.currentTimeMillis();
                Bundle extras = location.getExtras();
                int i = extras.getInt("errorCode");
                if (i != 0) {
                    StringBuilder sb = new StringBuilder("Locate failed [errorCode:\"");
                    sb.append(i);
                    sb.append("\"  errorInfo:");
                    sb.append(extras.getString(MyLocationStyle.ERROR_INFO));
                    sb.append("\"]");
                    return;
                }
                synchronized (this.i) {
                    try {
                        TraceLocation traceLocation = new TraceLocation(location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getBearing(), location.getTime());
                        if (e(this.n, traceLocation)) {
                            return;
                        }
                        this.i.add(traceLocation);
                        this.n = traceLocation;
                        int i2 = this.j + 1;
                        this.j = i2;
                        if (i2 == this.f) {
                            this.f498k += i2;
                            c();
                            this.j = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void queryProcessedTrace(int i, List<TraceLocation> list, int i2, TraceListener traceListener) {
        try {
            this.c.b(new a(i, list, i2, traceListener));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setLocationInterval(long j) {
        this.e = j;
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void setTraceStatusInterval(int i) {
        this.f = Math.max(i, 2);
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void startTrace(TraceStatusListener traceStatusListener) {
        if (this.f496a == null) {
            return;
        }
        this.l = System.currentTimeMillis();
        this.g = traceStatusListener;
        if (this.h == null) {
            com.amap.api.col.p0003sl.a aVar = new com.amap.api.col.p0003sl.a(this.f496a);
            this.h = aVar;
            aVar.d(this.e);
            this.h.activate(this);
        }
    }

    @Override // com.amap.api.trace.LBSTraceBase
    public final void stopTrace() {
        g();
        i();
    }
}
