package com.amap.api.services.busline;

import android.content.Context;
import com.amap.api.col.p0003sl.hn;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;

/* JADX INFO: loaded from: classes4.dex */
public class BusLineSearch {
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBusLineSearch f3505a;

    public interface OnBusLineSearchListener {
        void onBusLineSearched(BusLineResult busLineResult, int i);
    }

    public BusLineSearch(Context context, BusLineQuery busLineQuery) throws AMapException {
        this.f3505a = null;
        try {
            this.f3505a = new hn(context, busLineQuery);
        } catch (Exception e) {
            e.printStackTrace();
            if (e instanceof AMapException) {
                throw ((AMapException) e);
            }
        }
    }

    public BusLineResult searchBusLine() throws AMapException {
        IBusLineSearch iBusLineSearch = this.f3505a;
        if (iBusLineSearch != null) {
            return iBusLineSearch.searchBusLine();
        }
        return null;
    }

    public void setOnBusLineSearchListener(OnBusLineSearchListener onBusLineSearchListener) {
        IBusLineSearch iBusLineSearch = this.f3505a;
        if (iBusLineSearch != null) {
            iBusLineSearch.setOnBusLineSearchListener(onBusLineSearchListener);
        }
    }

    public void searchBusLineAsyn() {
        IBusLineSearch iBusLineSearch = this.f3505a;
        if (iBusLineSearch != null) {
            iBusLineSearch.searchBusLineAsyn();
        }
    }

    public void setQuery(BusLineQuery busLineQuery) {
        IBusLineSearch iBusLineSearch = this.f3505a;
        if (iBusLineSearch != null) {
            iBusLineSearch.setQuery(busLineQuery);
        }
    }

    public BusLineQuery getQuery() {
        IBusLineSearch iBusLineSearch = this.f3505a;
        if (iBusLineSearch != null) {
            return iBusLineSearch.getQuery();
        }
        return null;
    }
}
