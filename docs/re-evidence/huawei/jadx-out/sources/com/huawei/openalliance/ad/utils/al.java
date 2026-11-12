package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.location.Geocoder;
import com.huawei.openalliance.ad.beans.metadata.Address;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class al {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (fp.b(context).w()) {
            return true;
        }
        hw.b("GeoLocationUtil", "collect geoinfo switch off");
        return false;
    }

    public static Address a(android.location.Address address) {
        if (address == null) {
            return null;
        }
        Address address2 = new Address();
        address2.a(address.getCountryCode());
        address2.b(dg.f(address.getAdminArea()));
        address2.c(dg.f(address.getLocality()));
        address2.d(dg.f(address.getSubLocality()));
        address2.e(dg.f(address.getSubAdminArea()));
        address2.f(dg.f(address.getThoroughfare()));
        address2.g(dg.f(address.getSubThoroughfare()));
        address2.h(dg.f(address.getFeatureName()));
        address2.i(address.getLocale().toString());
        return address2;
    }

    public static android.location.Address a(Context context, Double d, Double d2) {
        List<android.location.Address> fromLocation;
        if (context == null) {
            return null;
        }
        try {
            fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d2.doubleValue(), d.doubleValue(), 1);
        } catch (Throwable th) {
            hw.c("GeoLocationUtil", "onGetGeoError Exception:" + th.getClass().getSimpleName());
            fromLocation = null;
        }
        if (fromLocation == null || fromLocation.size() <= 0) {
            return null;
        }
        return fromLocation.get(0);
    }
}
