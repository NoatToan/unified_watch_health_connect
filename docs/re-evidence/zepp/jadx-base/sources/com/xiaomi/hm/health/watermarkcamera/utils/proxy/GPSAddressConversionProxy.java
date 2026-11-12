package com.xiaomi.hm.health.watermarkcamera.utils.proxy;

import android.content.Context;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter;

/* JADX INFO: loaded from: classes22.dex */
public class GPSAddressConversionProxy implements GPSAddressConversionAdapter {
    private GPSAddressConversionAdapter a;

    public static class a {
        private static final GPSAddressConversionProxy a = new GPSAddressConversionProxy();

        private a() {
        }
    }

    private GPSAddressConversionProxy() {
    }

    public static GPSAddressConversionProxy getInstance() {
        return a.a;
    }

    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter
    public void loadSLLDescription(Context context, GPSAddressConversionAdapter.GeoAddrCallback geoAddrCallback, long j, int i, int i2) {
        this.a.loadSLLDescription(context, geoAddrCallback, j, i, i2);
    }

    public void setAdapter(GPSAddressConversionAdapter gPSAddressConversionAdapter) {
        this.a = gPSAddressConversionAdapter;
    }
}
