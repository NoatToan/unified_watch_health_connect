package com.amap.api.trace;

import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class TraceOverlay {
    public static final int TRACE_STATUS_FAILURE = 3;
    public static final int TRACE_STATUS_FINISH = 2;
    public static final int TRACE_STATUS_PREPARE = 4;
    public static final int TRACE_STATUS_PROCESSING = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Polyline f3900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PolylineOptions f3901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AMap f3902c;
    private List<LatLng> d;
    private int e;
    private int f;
    private int g;

    public TraceOverlay(AMap aMap, List<LatLng> list) {
        this.d = new ArrayList();
        this.e = 4;
        this.f3902c = aMap;
        a();
        this.d = list;
        this.f3901b.addAll(list);
        this.f3900a = aMap.addPolyline(this.f3901b);
    }

    public TraceOverlay(AMap aMap) {
        this.d = new ArrayList();
        this.e = 4;
        this.f3902c = aMap;
        a();
    }

    public void add(List<LatLng> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.d.addAll(list);
        a();
        if (this.f3900a == null) {
            this.f3900a = this.f3902c.addPolyline(this.f3901b);
        }
        Polyline polyline = this.f3900a;
        if (polyline != null) {
            polyline.setPoints(this.d);
        }
    }

    public void remove() {
        Polyline polyline = this.f3900a;
        if (polyline != null) {
            polyline.remove();
        }
    }

    public void setProperCamera(List<LatLng> list) {
        LatLngBounds.Builder builder = LatLngBounds.builder();
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<LatLng> it = list.iterator();
        while (it.hasNext()) {
            builder.include(it.next());
        }
        try {
            this.f3902c.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 20));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void zoopToSpan() {
        setProperCamera(this.f3901b.getPoints());
    }

    private PolylineOptions a() {
        if (this.f3901b == null) {
            PolylineOptions polylineOptions = new PolylineOptions();
            this.f3901b = polylineOptions;
            polylineOptions.setCustomTexture(BitmapDescriptorFactory.fromAsset("tracelinetexture.png"));
            this.f3901b.width(40.0f);
        }
        return this.f3901b;
    }

    public int getTraceStatus() {
        return this.e;
    }

    public void setTraceStatus(int i) {
        this.e = i;
    }

    public int getDistance() {
        return this.f;
    }

    public void setDistance(int i) {
        this.f = i;
    }

    public int getWaitTime() {
        return this.g;
    }

    public void setWaitTime(int i) {
        this.g = i;
    }
}
