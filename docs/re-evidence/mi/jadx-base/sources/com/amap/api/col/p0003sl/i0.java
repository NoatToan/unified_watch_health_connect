package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusLineSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IBusLineSearch;
import defpackage.ays;
import defpackage.qts;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements IBusLineSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BusLineSearch.OnBusLineSearchListener f6081b;
    public BusLineQuery c;
    public BusLineQuery d;
    public int e;
    public ArrayList<BusLineResult> f = new ArrayList<>();
    public Handler g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.arg1 = 3;
                    messageObtainMessage.what = 1000;
                    y.b bVar = new y.b();
                    messageObtainMessage.obj = bVar;
                    bVar.f6325b = i0.this.f6081b;
                    bVar.f6324a = i0.this.searchBusLine();
                } catch (AMapException e) {
                    messageObtainMessage.what = e.getErrorCode();
                }
            } finally {
                i0.this.g.sendMessage(messageObtainMessage);
            }
        }
    }

    public i0(Context context, BusLineQuery busLineQuery) throws AMapException {
        this.g = null;
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6080a = context.getApplicationContext();
        this.c = busLineQuery;
        if (busLineQuery != null) {
            this.d = busLineQuery.m94clone();
        }
        this.g = y.a();
    }

    public final void b(BusLineResult busLineResult) {
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
        if (i < 0 || !d(this.c.getPageNumber())) {
            return;
        }
        this.f.set(this.c.getPageNumber(), busLineResult);
    }

    public final boolean c() {
        BusLineQuery busLineQuery = this.c;
        return (busLineQuery == null || xts.j(busLineQuery.getQueryString())) ? false : true;
    }

    public final boolean d(int i) {
        return i < this.e && i >= 0;
    }

    public final BusLineResult f(int i) {
        if (d(i)) {
            return this.f.get(i);
        }
        throw new IllegalArgumentException("page out of range");
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final BusLineQuery getQuery() {
        return this.c;
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final BusLineResult searchBusLine() throws AMapException {
        try {
            x.c(this.f6080a);
            if (this.d == null || !c()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!this.c.weakEquals(this.d)) {
                this.d = this.c.m94clone();
                this.e = 0;
                ArrayList<BusLineResult> arrayList = this.f;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            if (this.e == 0) {
                BusLineResult busLineResult = (BusLineResult) new qts(this.f6080a, this.c.m94clone()).m();
                b(busLineResult);
                return busLineResult;
            }
            BusLineResult busLineResultF = f(this.c.getPageNumber());
            if (busLineResultF != null) {
                return busLineResultF;
            }
            BusLineResult busLineResult2 = (BusLineResult) new qts(this.f6080a, this.c).m();
            this.f.set(this.c.getPageNumber(), busLineResult2);
            return busLineResult2;
        } catch (AMapException e) {
            xts.i(e, "BusLineSearch", "searchBusLine");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void searchBusLineAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setOnBusLineSearchListener(BusLineSearch.OnBusLineSearchListener onBusLineSearchListener) {
        this.f6081b = onBusLineSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IBusLineSearch
    public final void setQuery(BusLineQuery busLineQuery) {
        if (this.c.weakEquals(busLineQuery)) {
            return;
        }
        this.c = busLineQuery;
        this.d = busLineQuery.m94clone();
    }
}
