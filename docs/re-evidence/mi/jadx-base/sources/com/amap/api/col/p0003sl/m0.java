package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearch;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.interfaces.IDistrictSearch;
import defpackage.aus;
import defpackage.ays;
import defpackage.wts;
import defpackage.xts;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements IDistrictSearch {
    public static HashMap<Integer, DistrictResult> g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DistrictSearchQuery f6207b;
    public DistrictSearch.OnDistrictSearchListener c;
    public DistrictSearchQuery d;
    public int e;
    public Handler f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            DistrictResult districtResult = new DistrictResult();
            districtResult.setQuery(m0.this.f6207b);
            try {
                districtResult = m0.this.searchDistrict();
                if (districtResult != null) {
                    districtResult.setAMapException(new AMapException());
                }
            } catch (AMapException e) {
                districtResult.setAMapException(e);
            } catch (Throwable th) {
                xts.i(th, "DistrictSearch", "searchDistrictAnsyThrowable");
            } finally {
                messageObtainMessage.arg1 = 4;
                messageObtainMessage.obj = m0.this.c;
                Bundle bundle = new Bundle();
                bundle.putParcelable("result", districtResult);
                messageObtainMessage.setData(bundle);
                if (m0.this.f != null) {
                    m0.this.f.sendMessage(messageObtainMessage);
                }
            }
        }
    }

    public m0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6206a = context.getApplicationContext();
        this.f = y.a();
    }

    public final DistrictResult a(int i) throws AMapException {
        if (f(i)) {
            return g.get(Integer.valueOf(i));
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    public final void c(DistrictResult districtResult) {
        int i;
        g = new HashMap<>();
        DistrictSearchQuery districtSearchQuery = this.f6207b;
        if (districtSearchQuery == null || districtResult == null || (i = this.e) <= 0 || i <= districtSearchQuery.getPageNum()) {
            return;
        }
        g.put(Integer.valueOf(this.f6207b.getPageNum()), districtResult);
    }

    public final boolean d() {
        return this.f6207b != null;
    }

    public final boolean f(int i) {
        return i < this.e && i >= 0;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final DistrictSearchQuery getQuery() {
        return this.f6207b;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final DistrictResult searchDistrict() throws AMapException {
        DistrictResult districtResultA;
        int i;
        try {
            DistrictResult districtResult = new DistrictResult();
            x.c(this.f6206a);
            if (!d()) {
                this.f6207b = new DistrictSearchQuery();
            }
            districtResult.setQuery(this.f6207b.m98clone());
            if (!this.f6207b.weakEquals(this.d)) {
                this.e = 0;
                this.d = this.f6207b.m98clone();
                HashMap<Integer, DistrictResult> map = g;
                if (map != null) {
                    map.clear();
                }
            }
            if (this.e == 0) {
                districtResultA = new aus(this.f6206a, this.f6207b.m98clone()).m();
                if (districtResultA == null) {
                    return districtResultA;
                }
                this.e = districtResultA.getPageCount();
                c(districtResultA);
            } else {
                districtResultA = a(this.f6207b.getPageNum());
                if (districtResultA == null) {
                    districtResultA = new aus(this.f6206a, this.f6207b.m98clone()).m();
                    DistrictSearchQuery districtSearchQuery = this.f6207b;
                    if (districtSearchQuery != null && districtResultA != null && (i = this.e) > 0 && i > districtSearchQuery.getPageNum()) {
                        g.put(Integer.valueOf(this.f6207b.getPageNum()), districtResultA);
                    }
                }
            }
            return districtResultA;
        } catch (AMapException e) {
            xts.i(e, "DistrictSearch", "searchDistrict");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAnsy() {
        searchDistrictAsyn();
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void searchDistrictAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setOnDistrictSearchListener(DistrictSearch.OnDistrictSearchListener onDistrictSearchListener) {
        this.c = onDistrictSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IDistrictSearch
    public final void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f6207b = districtSearchQuery;
    }
}
