package defpackage;

import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;

/* JADX INFO: loaded from: classes10.dex */
public class jfk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LatLong f38545a;
    private double d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LatLngBounds.Builder f38547c = new LatLngBounds.Builder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LatLngBounds f38546b = null;

    public jfk() {
        this.f38545a = null;
        this.d = 0.0d;
        this.d = 0.0d;
        this.f38545a = null;
    }

    public void d() {
        this.d = 0.0d;
        this.f38545a = null;
        this.f38547c = new LatLngBounds.Builder();
        this.f38546b = null;
    }

    public void a(LatLong latLong) {
        if (latLong == null || jfn.a(latLong.getLatLng().d, latLong.getLatLng().f38787a) || jfn.b(latLong.getLatLng().d, latLong.getLatLng().f38787a)) {
            return;
        }
        this.f38547c.include(new LatLng(latLong.getLatLng().d, latLong.getLatLng().f38787a));
        b(latLong);
    }

    public LatLong c() {
        if (this.f38546b == null) {
            this.f38546b = this.f38547c.build();
        }
        if (this.f38546b == null) {
            return new LatLong();
        }
        return new LatLong(this.f38546b.southwest.latitude, this.f38546b.southwest.longitude);
    }

    public LatLong e() {
        if (this.f38546b == null) {
            this.f38546b = this.f38547c.build();
        }
        if (this.f38546b == null) {
            return new LatLong();
        }
        return new LatLong(this.f38546b.northeast.latitude, this.f38546b.northeast.longitude);
    }

    public LatLong b() {
        if (this.f38546b == null) {
            this.f38546b = this.f38547c.build();
        }
        if (this.f38546b == null) {
            return new LatLong();
        }
        return new LatLong((this.f38546b.northeast.latitude + this.f38546b.southwest.latitude) / 2.0d, (this.f38546b.northeast.longitude + this.f38546b.southwest.longitude) / 2.0d);
    }

    public double a() {
        return this.d;
    }

    private void b(LatLong latLong) {
        if (latLong == null) {
            return;
        }
        LatLong latLong2 = this.f38545a;
        if (latLong2 == null) {
            this.f38545a = latLong;
        } else {
            this.d += jfa.b(latLong2, latLong);
            this.f38545a = latLong;
        }
    }
}
