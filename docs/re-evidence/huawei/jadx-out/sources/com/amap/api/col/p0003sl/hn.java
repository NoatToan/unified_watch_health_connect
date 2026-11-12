package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class hn implements IBusLineSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BusLineSearch.OnBusLineSearchListener f2626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BusLineQuery f2627c;
    private BusLineQuery d;
    private int e;
    private ArrayList<BusLineResult> f = new ArrayList<>();
    private Handler g;

    public hn(Context context, BusLineQuery busLineQuery) throws AMapException {
        this.g = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2625a = context.getApplicationContext();
        this.f2627c = busLineQuery;
        if (busLineQuery != null) {
            this.d = busLineQuery.m765clone();
        }
        this.g = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final BusLineResult searchBusLine() throws AMapException {
        try {
            gd.a(this.f2625a);
            if (this.d == null || !a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!this.f2627c.weakEquals(this.d)) {
                this.d = this.f2627c.m765clone();
                this.e = 0;
                ArrayList<BusLineResult> arrayList = this.f;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            if (this.e == 0) {
                BusLineResult busLineResult = (BusLineResult) new fp(this.f2625a, this.f2627c.m765clone()).d();
                a(busLineResult);
                return busLineResult;
            }
            BusLineResult busLineResultB = b(this.f2627c.getPageNumber());
            if (busLineResultB != null) {
                return busLineResultB;
            }
            BusLineResult busLineResult2 = (BusLineResult) new fp(this.f2625a, this.f2627c).d();
            this.f.set(this.f2627c.getPageNumber(), busLineResult2);
            return busLineResult2;
        } catch (AMapException e) {
            fu.a(e, "BusLineSearch", "searchBusLine");
            throw new AMapException(e.getErrorMessage());
        }
    }

    private void a(BusLineResult busLineResult) {
        int i;
        this.f = new ArrayList<>();
        int i2 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            this.f.add(null);
            i2++;
        }
        if (i < 0 || !a(this.f2627c.getPageNumber())) {
            return;
        }
        this.f.set(this.f2627c.getPageNumber(), busLineResult);
    }

    private boolean a(int i) {
        return i < this.e && i >= 0;
    }

    private BusLineResult b(int i) {
        if (!a(i)) {
            throw new IllegalArgumentException("page out of range");
        }
        return this.f.get(i);
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setOnBusLineSearchListener(BusLineSearch.OnBusLineSearchListener onBusLineSearchListener) {
        this.f2626b = onBusLineSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void searchBusLineAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hn.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.arg1 = 3;
                            messageObtainMessage.what = 1000;
                            gf.b bVar = new gf.b();
                            messageObtainMessage.obj = bVar;
                            bVar.f2554b = hn.this.f2626b;
                            bVar.f2553a = hn.this.searchBusLine();
                        } catch (AMapException e) {
                            messageObtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        hn.this.g.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setQuery(BusLineQuery busLineQuery) {
        if (this.f2627c.weakEquals(busLineQuery)) {
            return;
        }
        this.f2627c = busLineQuery;
        this.d = busLineQuery.m765clone();
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final BusLineQuery getQuery() {
        return this.f2627c;
    }

    private boolean a() {
        BusLineQuery busLineQuery = this.f2627c;
        return (busLineQuery == null || fu.a(busLineQuery.getQueryString())) ? false : true;
    }
}
