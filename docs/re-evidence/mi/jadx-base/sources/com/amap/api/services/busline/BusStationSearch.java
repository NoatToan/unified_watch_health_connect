package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.col.p0003sl.j0;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;

/* JADX INFO: loaded from: classes4.dex */
public class BusStationSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBusStationSearch f6517a;

    public interface OnBusStationSearchListener {
        void onBusStationSearched(BusStationResult busStationResult, int i);
    }

    public BusStationSearch(Context context, BusStationQuery busStationQuery) throws AMapException {
        if (this.f6517a == null) {
            try {
                this.f6517a = new j0(context, busStationQuery);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public BusStationQuery getQuery() {
        IBusStationSearch iBusStationSearch = this.f6517a;
        if (iBusStationSearch != null) {
            return iBusStationSearch.getQuery();
        }
        return null;
    }

    public BusStationResult searchBusStation() throws AMapException {
        IBusStationSearch iBusStationSearch = this.f6517a;
        if (iBusStationSearch != null) {
            return iBusStationSearch.searchBusStation();
        }
        return null;
    }

    public void searchBusStationAsyn() {
        IBusStationSearch iBusStationSearch = this.f6517a;
        if (iBusStationSearch != null) {
            iBusStationSearch.searchBusStationAsyn();
        }
    }

    public void setOnBusStationSearchListener(OnBusStationSearchListener onBusStationSearchListener) {
        IBusStationSearch iBusStationSearch = this.f6517a;
        if (iBusStationSearch != null) {
            iBusStationSearch.setOnBusStationSearchListener(onBusStationSearchListener);
        }
    }

    public void setQuery(BusStationQuery busStationQuery) {
        IBusStationSearch iBusStationSearch = this.f6517a;
        if (iBusStationSearch != null) {
            iBusStationSearch.setQuery(busStationQuery);
        }
    }
}
