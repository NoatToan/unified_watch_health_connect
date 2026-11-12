package defpackage;

import android.content.Context;
import android.location.Location;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iwh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38128c;
    private Context d;
    private boolean e = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38126a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38127b = true;

    public iwh(Context context, int i) {
        this.d = context;
        this.f38128c = i;
    }

    public jpg b(Location location) {
        if (location == null) {
            return new jpg(0.0d, 0.0d);
        }
        if (this.f38126a && "network".equals(location.getProvider())) {
            e(this.d, location);
            this.f38126a = false;
        }
        if (this.e && d(location.getProvider())) {
            e(this.d, location);
            this.e = false;
            this.f38126a = false;
        }
        if (this.f38127b) {
            double[] dArrB = izt.b(this.d, location);
            return new jpg(dArrB[0], dArrB[1]);
        }
        return new jpg(location.getLatitude(), location.getLongitude());
    }

    private boolean d(String str) {
        return GeocodeSearch.GPS.equals(str) || "GpsMockProvider".equals(str);
    }

    private void e(Context context, Location location) {
        int i = this.f38128c;
        if (i == 0) {
            b(context, location);
            return;
        }
        if (i == 1) {
            this.f38127b = true;
        } else if (i == 2) {
            this.f38127b = false;
        } else {
            b(context, location);
        }
    }

    private void b(Context context, Location location) {
        if (context == null || location == null) {
            return;
        }
        int iC = npl.c(location.getLatitude(), location.getLongitude());
        if (iC == 1) {
            LogUtil.a("Track_ConvertManger", "AREA 1");
            this.f38127b = true;
            return;
        }
        if (iC == 2) {
            LogUtil.a("Track_ConvertManger", "AREA 2");
            this.f38127b = false;
        } else if (iC == 3) {
            LogUtil.a("Track_ConvertManger", "AREA 3");
            jaa.d(context);
            this.f38127b = false;
        } else {
            LogUtil.a("Track_ConvertManger", "isInChina default");
            this.f38127b = true;
        }
    }
}
