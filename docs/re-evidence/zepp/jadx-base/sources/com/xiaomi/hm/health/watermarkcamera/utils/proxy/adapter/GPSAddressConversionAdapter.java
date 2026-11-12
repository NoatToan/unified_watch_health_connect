package com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public interface GPSAddressConversionAdapter {

    public interface GeoAddrCallback {
        void onComplete(GeoLocation geoLocation);
    }

    public static class GeoLocation {
        public String mCity = "";
        public String mDistrict = "";
        public String mStreet = "";
        public String mCountry = "";
    }

    void loadSLLDescription(Context context, GeoAddrCallback geoAddrCallback, long j, int i, int i2);
}
