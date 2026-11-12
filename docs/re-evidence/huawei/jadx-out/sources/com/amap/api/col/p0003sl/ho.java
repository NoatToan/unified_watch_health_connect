package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class ho implements IBusStationSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BusStationSearch.OnBusStationSearchListener f2630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BusStationQuery f2631c;
    private BusStationQuery d;
    private ArrayList<BusStationResult> e = new ArrayList<>();
    private int f;
    private Handler g;

    public ho(Context context, BusStationQuery busStationQuery) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2629a = context.getApplicationContext();
        this.f2631c = busStationQuery;
        this.g = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final BusStationResult searchBusStation() throws AMapException {
        try {
            gd.a(this.f2629a);
            if (!a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!this.f2631c.weakEquals(this.d)) {
                this.d = this.f2631c.m766clone();
                this.f = 0;
                ArrayList<BusStationResult> arrayList = this.e;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            if (this.f == 0) {
                BusStationResult busStationResult = (BusStationResult) new fp(this.f2629a, this.f2631c).d();
                this.f = busStationResult.getPageCount();
                a(busStationResult);
                return busStationResult;
            }
            BusStationResult busStationResultB = b(this.f2631c.getPageNumber());
            if (busStationResultB != null) {
                return busStationResultB;
            }
            BusStationResult busStationResult2 = (BusStationResult) new fp(this.f2629a, this.f2631c).d();
            this.e.set(this.f2631c.getPageNumber(), busStationResult2);
            return busStationResult2;
        } catch (AMapException e) {
            fu.a(e, "BusStationSearch", "searchBusStation");
            throw new AMapException(e.getErrorMessage());
        } catch (Throwable th) {
            fu.a(th, "BusStationSearch", "searchBusStation");
            return null;
        }
    }

    private void a(BusStationResult busStationResult) {
        int i;
        this.e = new ArrayList<>();
        int i2 = 0;
        while (true) {
            i = this.f;
            if (i2 > i) {
                break;
            }
            this.e.add(null);
            i2++;
        }
        if (i > 0) {
            this.e.set(this.f2631c.getPageNumber(), busStationResult);
        }
    }

    private boolean a(int i) {
        return i <= this.f && i >= 0;
    }

    private BusStationResult b(int i) {
        if (!a(i)) {
            throw new IllegalArgumentException("page out of range");
        }
        return this.e.get(i);
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setOnBusStationSearchListener(BusStationSearch.OnBusStationSearchListener onBusStationSearchListener) {
        this.f2630b = onBusStationSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void searchBusStationAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ho.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.arg1 = 7;
                            gf.c cVar = new gf.c();
                            cVar.f2556b = ho.this.f2630b;
                            messageObtainMessage.obj = cVar;
                            BusStationResult busStationResultSearchBusStation = ho.this.searchBusStation();
                            messageObtainMessage.what = 1000;
                            cVar.f2555a = busStationResultSearchBusStation;
                        } catch (AMapException e) {
                            messageObtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        ho.this.g.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setQuery(BusStationQuery busStationQuery) {
        if (busStationQuery.weakEquals(this.f2631c)) {
            return;
        }
        this.f2631c = busStationQuery;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final BusStationQuery getQuery() {
        return this.f2631c;
    }

    private boolean a() {
        BusStationQuery busStationQuery = this.f2631c;
        return (busStationQuery == null || fu.a(busStationQuery.getQueryString())) ? false : true;
    }
}
