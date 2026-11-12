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

/* JADX INFO: loaded from: classes4.dex */
public class TraceOverlay {
    public static final int TRACE_STATUS_FAILURE = 3;
    public static final int TRACE_STATUS_FINISH = 2;
    public static final int TRACE_STATUS_PREPARE = 4;
    public static final int TRACE_STATUS_PROCESSING = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Polyline f6818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PolylineOptions f6819b;
    private AMap c;
    private List<LatLng> d;
    private int e;
    private int f;
    private int g;

    public TraceOverlay(AMap aMap, List<LatLng> list) {
        this.d = new ArrayList();
        this.e = 4;
        this.c = aMap;
        a();
        this.d = list;
        this.f6819b.addAll(list);
        this.f6818a = aMap.addPolyline(this.f6819b);
    }

    private PolylineOptions a() {
        if (this.f6819b == null) {
            PolylineOptions polylineOptions = new PolylineOptions();
            this.f6819b = polylineOptions;
            polylineOptions.setCustomTexture(BitmapDescriptorFactory.fromAsset("tracelinetexture.png"));
            this.f6819b.width(40.0f);
        }
        return this.f6819b;
    }

    public void add(List<LatLng> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.d.addAll(list);
        a();
        if (this.f6818a == null) {
            this.f6818a = this.c.addPolyline(this.f6819b);
        }
        Polyline polyline = this.f6818a;
        if (polyline != null) {
            polyline.setPoints(this.d);
        }
    }

    public int getDistance() {
        return this.f;
    }

    public int getTraceStatus() {
        return this.e;
    }

    public int getWaitTime() {
        return this.g;
    }

    public void remove() {
        Polyline polyline = this.f6818a;
        if (polyline != null) {
            polyline.remove();
        }
    }

    public void setDistance(int i) {
        this.f = i;
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
            this.c.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 20));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setTraceStatus(int i) {
        this.e = i;
    }

    public void setWaitTime(int i) {
        this.g = i;
    }

    public void zoopToSpan() {
        setProperCamera(this.f6819b.getPoints());
    }

    public TraceOverlay(AMap aMap) {
        this.d = new ArrayList();
        this.e = 4;
        this.c = aMap;
        a();
    }
}
