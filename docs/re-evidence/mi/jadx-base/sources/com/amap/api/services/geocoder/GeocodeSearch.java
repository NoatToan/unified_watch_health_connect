package com.amap.api.services.geocoder;

import android.content.Context;
import com.amap.api.col.p0003sl.n0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IGeocodeSearch;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GeocodeSearch {
    public static final String AMAP = "autonavi";
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final String GPS = "gps";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IGeocodeSearch f6566a;

    public interface OnGeocodeSearchListener {
        void onGeocodeSearched(GeocodeResult geocodeResult, int i);

        void onRegeocodeSearched(RegeocodeResult regeocodeResult, int i);
    }

    public GeocodeSearch(Context context) throws AMapException {
        if (this.f6566a == null) {
            try {
                this.f6566a = new n0(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        IGeocodeSearch iGeocodeSearch = this.f6566a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocation(regeocodeQuery);
        }
        return null;
    }

    public final void getFromLocationAsyn(RegeocodeQuery regeocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f6566a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationAsyn(regeocodeQuery);
        }
    }

    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        IGeocodeSearch iGeocodeSearch = this.f6566a;
        if (iGeocodeSearch != null) {
            return iGeocodeSearch.getFromLocationName(geocodeQuery);
        }
        return null;
    }

    public final void getFromLocationNameAsyn(GeocodeQuery geocodeQuery) {
        IGeocodeSearch iGeocodeSearch = this.f6566a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.getFromLocationNameAsyn(geocodeQuery);
        }
    }

    public final void setOnGeocodeSearchListener(OnGeocodeSearchListener onGeocodeSearchListener) {
        IGeocodeSearch iGeocodeSearch = this.f6566a;
        if (iGeocodeSearch != null) {
            iGeocodeSearch.setOnGeocodeSearchListener(onGeocodeSearchListener);
        }
    }
}
