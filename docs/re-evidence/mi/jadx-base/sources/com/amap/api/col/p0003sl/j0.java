package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.busline.BusStationSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusStationSearch;
import defpackage.ays;
import defpackage.qts;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements IBusStationSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BusStationSearch.OnBusStationSearchListener f6171b;
    public BusStationQuery c;
    public BusStationQuery d;
    public ArrayList<BusStationResult> e = new ArrayList<>();
    public int f;
    public Handler g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.arg1 = 7;
                    y.c cVar = new y.c();
                    cVar.f6327b = j0.this.f6171b;
                    messageObtainMessage.obj = cVar;
                    BusStationResult busStationResultSearchBusStation = j0.this.searchBusStation();
                    messageObtainMessage.what = 1000;
                    cVar.f6326a = busStationResultSearchBusStation;
                } catch (AMapException e) {
                    messageObtainMessage.what = e.getErrorCode();
                }
            } finally {
                j0.this.g.sendMessage(messageObtainMessage);
            }
        }
    }

    public j0(Context context, BusStationQuery busStationQuery) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6170a = context.getApplicationContext();
        this.c = busStationQuery;
        this.g = y.a();
    }

    public final void b(BusStationResult busStationResult) {
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
            this.e.set(this.c.getPageNumber(), busStationResult);
        }
    }

    public final boolean c() {
        BusStationQuery busStationQuery = this.c;
        return (busStationQuery == null || xts.j(busStationQuery.getQueryString())) ? false : true;
    }

    public final boolean d(int i) {
        return i <= this.f && i >= 0;
    }

    public final BusStationResult f(int i) {
        if (d(i)) {
            return this.e.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final BusStationQuery getQuery() {
        return this.c;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final BusStationResult searchBusStation() throws AMapException {
        try {
            x.c(this.f6170a);
            if (!c()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!this.c.weakEquals(this.d)) {
                this.d = this.c.m95clone();
                this.f = 0;
                ArrayList<BusStationResult> arrayList = this.e;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            if (this.f == 0) {
                BusStationResult busStationResult = (BusStationResult) new qts(this.f6170a, this.c).m();
                this.f = busStationResult.getPageCount();
                b(busStationResult);
                return busStationResult;
            }
            BusStationResult busStationResultF = f(this.c.getPageNumber());
            if (busStationResultF != null) {
                return busStationResultF;
            }
            BusStationResult busStationResult2 = (BusStationResult) new qts(this.f6170a, this.c).m();
            this.e.set(this.c.getPageNumber(), busStationResult2);
            return busStationResult2;
        } catch (AMapException e) {
            xts.i(e, "BusStationSearch", "searchBusStation");
            throw new AMapException(e.getErrorMessage());
        } catch (Throwable th) {
            xts.i(th, "BusStationSearch", "searchBusStation");
            return null;
        }
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void searchBusStationAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setOnBusStationSearchListener(BusStationSearch.OnBusStationSearchListener onBusStationSearchListener) {
        this.f6171b = onBusStationSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IBusStationSearch
    public final void setQuery(BusStationQuery busStationQuery) {
        if (busStationQuery.weakEquals(this.c)) {
            return;
        }
        this.c = busStationQuery;
    }
}
