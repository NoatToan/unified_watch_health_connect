package com.xiaomi.hm.health.ui.sportfitness.watermark;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import com.huami.mifit.sportlib.model.PointTrackLocation;
import com.huami.moving.datacenter.TrackDataManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class WatermarkGPSAddressConversionAdapter implements GPSAddressConversionAdapter {
    @Override // com.xiaomi.hm.health.watermarkcamera.utils.proxy.adapter.GPSAddressConversionAdapter
    public void loadSLLDescription(Context context, final GPSAddressConversionAdapter.GeoAddrCallback callback, long trackId, int deviceSource, int sportType) {
        List<PointTrackLocation> pointLocationList = TrackDataManager.getInstance().getTrackData(trackId, deviceSource, sportType).getPointLocationList();
        if (pointLocationList.size() <= 0) {
            HMLog.i("Address", "no point location info !!!", new Object[0]);
            return;
        }
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation((float) pointLocationList.get(0).getPointLatitude(), (float) pointLocationList.get(0).getPointLongitude(), 1);
            if (fromLocation.size() > 0) {
                Address address = fromLocation.get(0);
                GPSAddressConversionAdapter.GeoLocation geoLocation = new GPSAddressConversionAdapter.GeoLocation();
                geoLocation.mCity = address.getLocality();
                geoLocation.mDistrict = address.getSubLocality();
                if (callback != null) {
                    callback.onComplete(geoLocation);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
