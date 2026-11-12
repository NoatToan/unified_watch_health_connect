package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IPoiSearch;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import defpackage.ays;
import defpackage.iws;
import defpackage.rws;
import defpackage.wts;
import defpackage.xts;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements IPoiSearch {
    public static HashMap<Integer, PoiResult> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PoiSearch.SearchBound f6237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PoiSearch.Query f6238b;
    public Context c;
    public PoiSearch.OnPoiSearchListener d;
    public String e = "zh-CN";
    public PoiSearch.Query f;
    public PoiSearch.SearchBound g;
    public int h;
    public Handler i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.j jVar;
            Message messageObtainMessage = q0.this.i.obtainMessage();
            messageObtainMessage.arg1 = 6;
            messageObtainMessage.what = 600;
            Bundle bundle = new Bundle();
            PoiResult poiResultSearchPOI = null;
            try {
                poiResultSearchPOI = q0.this.searchPOI();
                bundle.putInt("errorCode", 1000);
                jVar = new y.j();
            } catch (AMapException e) {
                bundle.putInt("errorCode", e.getErrorCode());
                jVar = new y.j();
            } finally {
                y.j jVar2 = new y.j();
                jVar2.f6341b = q0.this.d;
                jVar2.f6340a = poiResultSearchPOI;
                messageObtainMessage.obj = jVar2;
                messageObtainMessage.setData(bundle);
                q0.this.i.sendMessage(messageObtainMessage);
            }
            jVar.f6341b = q0.this.d;
            jVar.f6340a = poiResultSearchPOI;
            messageObtainMessage.obj = jVar;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6240a;

        public b(String str) {
            this.f6240a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.h hVar;
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 6;
            messageObtainMessage.what = 602;
            Bundle bundle = new Bundle();
            PoiItem poiItemSearchPOIId = null;
            try {
                poiItemSearchPOIId = q0.this.searchPOIId(this.f6240a);
                bundle.putInt("errorCode", 1000);
                hVar = new y.h();
            } catch (AMapException e) {
                xts.i(e, "PoiSearch", "searchPOIIdAsyn");
                bundle.putInt("errorCode", e.getErrorCode());
                hVar = new y.h();
            } finally {
                y.h hVar2 = new y.h();
                hVar2.f6337b = q0.this.d;
                hVar2.f6336a = poiItemSearchPOIId;
                messageObtainMessage.obj = hVar2;
                messageObtainMessage.setData(bundle);
                q0.this.i.sendMessage(messageObtainMessage);
            }
            hVar.f6337b = q0.this.d;
            hVar.f6336a = poiItemSearchPOIId;
            messageObtainMessage.obj = hVar;
        }
    }

    public q0(Context context, PoiSearch.Query query) throws AMapException {
        this.i = null;
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.c = context.getApplicationContext();
        setQuery(query);
        this.i = y.a();
    }

    public final PoiResult b(int i) {
        if (g(i)) {
            return j.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    public final void c(PoiResult poiResult) {
        int i;
        j = new HashMap<>();
        PoiSearch.Query query = this.f6238b;
        if (query == null || poiResult == null || (i = this.h) <= 0 || i <= query.getPageNum()) {
            return;
        }
        j.put(Integer.valueOf(this.f6238b.getPageNum()), poiResult);
    }

    public final boolean d() {
        PoiSearch.Query query = this.f6238b;
        if (query == null) {
            return false;
        }
        return (xts.j(query.getQueryString()) && xts.j(this.f6238b.getCategory())) ? false : true;
    }

    public final boolean f() {
        PoiSearch.SearchBound bound = getBound();
        return bound != null && bound.getShape().equals("Bound");
    }

    public final boolean g(int i) {
        return i <= this.h && i >= 0;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiSearch.SearchBound getBound() {
        return this.f6237a;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final String getLanguage() {
        return this.e;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiSearch.Query getQuery() {
        return this.f6238b;
    }

    public final boolean h() {
        PoiSearch.SearchBound bound = getBound();
        if (bound == null) {
            return true;
        }
        if (bound.getShape().equals("Bound")) {
            return bound.getCenter() != null;
        }
        if (!bound.getShape().equals("Polygon")) {
            if (!bound.getShape().equals("Rectangle")) {
                return true;
            }
            LatLonPoint lowerLeft = bound.getLowerLeft();
            LatLonPoint upperRight = bound.getUpperRight();
            return lowerLeft != null && upperRight != null && lowerLeft.getLatitude() < upperRight.getLatitude() && lowerLeft.getLongitude() < upperRight.getLongitude();
        }
        List<LatLonPoint> polyGonList = bound.getPolyGonList();
        if (polyGonList == null || polyGonList.size() == 0) {
            return false;
        }
        for (int i = 0; i < polyGonList.size(); i++) {
            if (polyGonList.get(i) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiResult searchPOI() throws AMapException {
        try {
            x.c(this.c);
            if (!f() && !d()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!h()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            PoiSearch.Query query = this.f6238b;
            if (query == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if ((!query.queryEquals(this.f) && this.f6237a == null) || (!this.f6238b.queryEquals(this.f) && !this.f6237a.equals(this.g))) {
                this.h = 0;
                this.f = this.f6238b.m99clone();
                PoiSearch.SearchBound searchBound = this.f6237a;
                if (searchBound != null) {
                    this.g = searchBound.m100clone();
                }
                HashMap<Integer, PoiResult> map = j;
                if (map != null) {
                    map.clear();
                }
            }
            PoiSearch.SearchBound searchBound2 = this.f6237a;
            PoiSearch.SearchBound searchBoundClone = searchBound2 != null ? searchBound2.m100clone() : null;
            rws.a().f(this.f6238b.getQueryString());
            this.f6238b.setPageNum(rws.a().B(this.f6238b.getPageNum()));
            this.f6238b.setPageSize(rws.a().C(this.f6238b.getPageSize()));
            if (this.h == 0) {
                PoiResult poiResultM = new b0(this.c, new iws(this.f6238b.m99clone(), searchBoundClone)).m();
                c(poiResultM);
                return poiResultM;
            }
            PoiResult poiResultB = b(this.f6238b.getPageNum());
            if (poiResultB != null) {
                return poiResultB;
            }
            PoiResult poiResultM2 = new b0(this.c, new iws(this.f6238b.m99clone(), searchBoundClone)).m();
            j.put(Integer.valueOf(this.f6238b.getPageNum()), poiResultM2);
            return poiResultM2;
        } catch (AMapException e) {
            xts.i(e, "PoiSearch", "searchPOI");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void searchPOIAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiItem searchPOIId(String str) throws AMapException {
        x.c(this.c);
        PoiSearch.Query query = this.f6238b;
        return new z(this.c, str, query != null ? query.m99clone() : null).m();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void searchPOIIdAsyn(String str) {
        ays.a().b(new b(str));
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setBound(PoiSearch.SearchBound searchBound) {
        this.f6237a = searchBound;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setLanguage(String str) {
        if ("en".equals(str)) {
            this.e = "en";
        } else {
            this.e = "zh-CN";
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setOnPoiSearchListener(PoiSearch.OnPoiSearchListener onPoiSearchListener) {
        this.d = onPoiSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setQuery(PoiSearch.Query query) {
        this.f6238b = query;
    }
}
