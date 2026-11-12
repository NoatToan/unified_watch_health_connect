package defpackage;

import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.RouteSearchV2;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rws {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile rws f32989r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32990a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32991b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = true;
    public int h = 25;
    public int i = 100;
    public int j = 100;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32992k = 100;
    public int l = 6;
    public int m = 100;
    public int n = 5000;
    public int o = 1200;
    public int p = 100000000;
    public int q = 16;

    public static rws a() {
        if (f32989r == null) {
            synchronized (rws.class) {
                try {
                    if (f32989r == null) {
                        f32989r = new rws();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32989r;
    }

    public static void l(List<LatLonPoint> list) throws AMapException {
        if (list != null && 16 < list.size()) {
            throw new AMapException(AMapException.AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION);
        }
    }

    public final void A(int i) {
        this.q = i;
    }

    public final int B(int i) {
        int i2;
        return (this.d && (i2 = this.m) < i) ? i2 : i;
    }

    public final int C(int i) {
        int i2;
        return (this.d && (i2 = this.h) < i) ? i2 : i;
    }

    public final void b(int i) {
        this.h = i;
    }

    public final void c(RouteSearch.FromAndTo fromAndTo) throws AMapException {
        if (!this.e || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.o < ((double) xts.b(fromAndTo.getFrom(), fromAndTo.getTo())) / 1000.0d) {
            throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void d(RouteSearch.FromAndTo fromAndTo, List<LatLonPoint> list) throws AMapException {
        double dB;
        if (!this.c || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (list == null || list.size() == 0) {
            dB = xts.b(fromAndTo.getFrom(), fromAndTo.getTo());
        } else {
            LatLonPoint from = fromAndTo.getFrom();
            LatLonPoint to = fromAndTo.getTo();
            double dB2 = 0.0d;
            for (LatLonPoint latLonPoint : list) {
                dB2 += (double) xts.b(from, latLonPoint);
                from = latLonPoint;
            }
            dB = dB2 + ((double) xts.b(from, to));
        }
        if (this.n < dB / 1000.0d) {
            throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void e(RouteSearchV2.FromAndTo fromAndTo) throws AMapException {
        if (!this.e || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.o < ((double) xts.b(fromAndTo.getFrom(), fromAndTo.getTo())) / 1000.0d) {
            throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void f(String str) throws AMapException {
        if (str != null && this.f32991b && str.length() > this.i) {
            throw new AMapException(AMapException.AMAP_CLIENT_OVER_KEYWORD_LEN_MAX_COUNT_EXCEPTION);
        }
    }

    public final void g(List<LatLonPoint> list) throws AMapException {
        if (this.g && list != null) {
            if (this.l < list.size()) {
                throw new AMapException(AMapException.AMAP_CLIENT_OVER_PASSBY_MAX_COUNT_EXCEPTION);
            }
        }
    }

    public final void h(boolean z) {
        this.f32990a = z;
    }

    public final void i(int i) {
        this.i = i;
    }

    public final void j(RouteSearch.FromAndTo fromAndTo) throws AMapException {
        if (!this.f || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.f32992k < ((double) xts.b(fromAndTo.getFrom(), fromAndTo.getTo())) / 1000.0d) {
            throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void k(RouteSearchV2.FromAndTo fromAndTo) throws AMapException {
        if (!this.f || fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return;
        }
        if (this.f32992k < ((double) xts.b(fromAndTo.getFrom(), fromAndTo.getTo())) / 1000.0d) {
            throw new AMapException(AMapException.AMAP_OVER_DIRECTION_RANGE);
        }
    }

    public final void m(boolean z) {
        this.c = z;
    }

    public final void n(int i) {
        this.j = i;
    }

    public final void o(List<List<LatLonPoint>> list) throws AMapException {
        if (this.f32990a && list != null) {
            if (this.j < list.size()) {
                throw new AMapException(AMapException.AMAP_CLIENT_OVER_PASSAREA_MAX_COUNT_EXCEPTION);
            }
            for (List<LatLonPoint> list2 : list) {
                double dK = xts.k(list2);
                if (this.q < list2.size()) {
                    throw new AMapException(AMapException.AMAP_CLIENT_OVER_PASSAREA_ITEM_POINT_COUNT_EXCEPTION);
                }
                if (this.p < dK) {
                    throw new AMapException(AMapException.AMAP_CLIENT_OVER_PASSAREA_MAX_AREA_EXCEPTION);
                }
            }
        }
    }

    public final void p(boolean z) {
        this.d = z;
    }

    public final void q(int i) {
        this.f32992k = i;
    }

    public final void r(boolean z) {
        this.e = z;
    }

    public final void s(int i) {
        this.l = i;
    }

    public final void t(boolean z) {
        this.f = z;
    }

    public final void u(int i) {
        this.m = i;
    }

    public final void v(boolean z) {
        this.g = z;
    }

    public final void w(int i) {
        this.n = i;
    }

    public final void x(boolean z) {
        this.f32991b = z;
    }

    public final void y(int i) {
        this.o = i;
    }

    public final void z(int i) {
        this.p = i;
    }
}
