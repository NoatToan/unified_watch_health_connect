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
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class hv implements IPoiSearch {
    private static HashMap<Integer, PoiResult> i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PoiSearch.SearchBound f2670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PoiSearch.Query f2671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2672c;
    private PoiSearch.OnPoiSearchListener d;
    private String e = "zh-CN";
    private PoiSearch.Query f;
    private PoiSearch.SearchBound g;
    private int h;
    private Handler j;

    public hv(Context context, PoiSearch.Query query) throws AMapException {
        this.j = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2672c = context.getApplicationContext();
        setQuery(query);
        this.j = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setOnPoiSearchListener(PoiSearch.OnPoiSearchListener onPoiSearchListener) {
        this.d = onPoiSearchListener;
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
    public final String getLanguage() {
        return this.e;
    }

    private boolean a() {
        PoiSearch.Query query = this.f2671b;
        if (query == null) {
            return false;
        }
        return (fu.a(query.getQueryString()) && fu.a(this.f2671b.getCategory())) ? false : true;
    }

    private boolean b() {
        PoiSearch.SearchBound bound = getBound();
        return bound != null && bound.getShape().equals("Bound");
    }

    private boolean c() {
        PoiSearch.SearchBound bound = getBound();
        if (bound == null) {
            return true;
        }
        if (bound.getShape().equals("Bound")) {
            return bound.getCenter() != null;
        }
        if (bound.getShape().equals("Polygon")) {
            List<LatLonPoint> polyGonList = bound.getPolyGonList();
            if (polyGonList == null || polyGonList.size() == 0) {
                return false;
            }
            for (int i2 = 0; i2 < polyGonList.size(); i2++) {
                if (polyGonList.get(i2) == null) {
                    return false;
                }
            }
            return true;
        }
        if (!bound.getShape().equals("Rectangle")) {
            return true;
        }
        LatLonPoint lowerLeft = bound.getLowerLeft();
        LatLonPoint upperRight = bound.getUpperRight();
        return lowerLeft != null && upperRight != null && lowerLeft.getLatitude() < upperRight.getLatitude() && lowerLeft.getLongitude() < upperRight.getLongitude();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiResult searchPOI() throws AMapException {
        try {
            gd.a(this.f2672c);
            if (!b() && !a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!c()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            PoiSearch.Query query = this.f2671b;
            if (query == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if ((!query.queryEquals(this.f) && this.f2670a == null) || (!this.f2671b.queryEquals(this.f) && !this.f2670a.equals(this.g))) {
                this.h = 0;
                this.f = this.f2671b.m770clone();
                PoiSearch.SearchBound searchBound = this.f2670a;
                if (searchBound != null) {
                    this.g = searchBound.m771clone();
                }
                HashMap<Integer, PoiResult> map = i;
                if (map != null) {
                    map.clear();
                }
            }
            PoiSearch.SearchBound searchBound2 = this.f2670a;
            PoiSearch.SearchBound searchBoundClone = searchBound2 != null ? searchBound2.m771clone() : null;
            gw.a().a(this.f2671b.getQueryString());
            this.f2671b.setPageNum(gw.a().k(this.f2671b.getPageNum()));
            this.f2671b.setPageSize(gw.a().l(this.f2671b.getPageSize()));
            if (this.h == 0) {
                PoiResult poiResultD = new gm(this.f2672c, new gq(this.f2671b.m770clone(), searchBoundClone)).d();
                a(poiResultD);
                return poiResultD;
            }
            PoiResult poiResultA = a(this.f2671b.getPageNum());
            if (poiResultA != null) {
                return poiResultA;
            }
            PoiResult poiResultD2 = new gm(this.f2672c, new gq(this.f2671b.m770clone(), searchBoundClone)).d();
            i.put(Integer.valueOf(this.f2671b.getPageNum()), poiResultD2);
            return poiResultD2;
        } catch (AMapException e) {
            fu.a(e, "PoiSearch", "searchPOI");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void searchPOIAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hv.1
                @Override // java.lang.Runnable
                public final void run() {
                    gf.j jVar;
                    Message messageObtainMessage = hv.this.j.obtainMessage();
                    messageObtainMessage.arg1 = 6;
                    messageObtainMessage.what = 600;
                    Bundle bundle = new Bundle();
                    PoiResult poiResultSearchPOI = null;
                    try {
                        poiResultSearchPOI = hv.this.searchPOI();
                        bundle.putInt("errorCode", 1000);
                        jVar = new gf.j();
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                        jVar = new gf.j();
                    } finally {
                        gf.j jVar2 = new gf.j();
                        jVar2.f2570b = hv.this.d;
                        jVar2.f2569a = poiResultSearchPOI;
                        messageObtainMessage.obj = jVar2;
                        messageObtainMessage.setData(bundle);
                        hv.this.j.sendMessage(messageObtainMessage);
                    }
                    jVar.f2570b = hv.this.d;
                    jVar.f2569a = poiResultSearchPOI;
                    messageObtainMessage.obj = jVar;
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiItem searchPOIId(String str) throws AMapException {
        gd.a(this.f2672c);
        PoiSearch.Query query = this.f2671b;
        return new gk(this.f2672c, str, query != null ? query.m770clone() : null).d();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void searchPOIIdAsyn(final String str) {
        he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hv.2
            @Override // java.lang.Runnable
            public final void run() {
                gf.h hVar;
                Message messageObtainMessage = gf.a().obtainMessage();
                messageObtainMessage.arg1 = 6;
                messageObtainMessage.what = 602;
                Bundle bundle = new Bundle();
                PoiItem poiItemSearchPOIId = null;
                try {
                    poiItemSearchPOIId = hv.this.searchPOIId(str);
                    bundle.putInt("errorCode", 1000);
                    hVar = new gf.h();
                } catch (AMapException e) {
                    fu.a(e, "PoiSearch", "searchPOIIdAsyn");
                    bundle.putInt("errorCode", e.getErrorCode());
                    hVar = new gf.h();
                } finally {
                    gf.h hVar2 = new gf.h();
                    hVar2.f2566b = hv.this.d;
                    hVar2.f2565a = poiItemSearchPOIId;
                    messageObtainMessage.obj = hVar2;
                    messageObtainMessage.setData(bundle);
                    hv.this.j.sendMessage(messageObtainMessage);
                }
                hVar.f2566b = hv.this.d;
                hVar.f2565a = poiItemSearchPOIId;
                messageObtainMessage.obj = hVar;
            }
        });
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setQuery(PoiSearch.Query query) {
        this.f2671b = query;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final void setBound(PoiSearch.SearchBound searchBound) {
        this.f2670a = searchBound;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiSearch.Query getQuery() {
        return this.f2671b;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearch
    public final PoiSearch.SearchBound getBound() {
        return this.f2670a;
    }

    private void a(PoiResult poiResult) {
        int i2;
        i = new HashMap<>();
        PoiSearch.Query query = this.f2671b;
        if (query == null || poiResult == null || (i2 = this.h) <= 0 || i2 <= query.getPageNum()) {
            return;
        }
        i.put(Integer.valueOf(this.f2671b.getPageNum()), poiResult);
    }

    private PoiResult a(int i2) {
        if (!b(i2)) {
            throw new IllegalArgumentException("page out of range");
        }
        return i.get(Integer.valueOf(i2));
    }

    private boolean b(int i2) {
        return i2 <= this.h && i2 >= 0;
    }
}
