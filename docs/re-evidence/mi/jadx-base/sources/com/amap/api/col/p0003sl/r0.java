package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.interfaces.IPoiSearchV2;
import com.amap.api.services.poisearch.PoiResultV2;
import com.amap.api.services.poisearch.PoiSearchV2;
import defpackage.ays;
import defpackage.kws;
import defpackage.rws;
import defpackage.wts;
import defpackage.xts;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements IPoiSearchV2 {
    public static HashMap<Integer, PoiResultV2> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PoiSearchV2.SearchBound f6242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PoiSearchV2.Query f6243b;
    public Context c;
    public PoiSearchV2.OnPoiSearchListener d;
    public String e = "zh-CN";
    public PoiSearchV2.Query f;
    public PoiSearchV2.SearchBound g;
    public int h;
    public Handler i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.k kVar;
            Message messageObtainMessage = r0.this.i.obtainMessage();
            messageObtainMessage.arg1 = 19;
            messageObtainMessage.what = 603;
            Bundle bundle = new Bundle();
            PoiResultV2 poiResultV2SearchPOI = null;
            try {
                poiResultV2SearchPOI = r0.this.searchPOI();
                bundle.putInt("errorCode", 1000);
                kVar = new y.k();
            } catch (AMapException e) {
                bundle.putInt("errorCode", e.getErrorCode());
                kVar = new y.k();
            } finally {
                y.k kVar2 = new y.k();
                kVar2.f6343b = r0.this.d;
                kVar2.f6342a = poiResultV2SearchPOI;
                messageObtainMessage.obj = kVar2;
                messageObtainMessage.setData(bundle);
                r0.this.i.sendMessage(messageObtainMessage);
            }
            kVar.f6343b = r0.this.d;
            kVar.f6342a = poiResultV2SearchPOI;
            messageObtainMessage.obj = kVar;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6245a;

        public b(String str) {
            this.f6245a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.i iVar;
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 19;
            messageObtainMessage.what = 604;
            Bundle bundle = new Bundle();
            PoiItemV2 poiItemV2SearchPOIId = null;
            try {
                poiItemV2SearchPOIId = r0.this.searchPOIId(this.f6245a);
                bundle.putInt("errorCode", 1000);
                iVar = new y.i();
            } catch (AMapException e) {
                xts.i(e, "PoiSearch", "searchPOIIdAsyn");
                bundle.putInt("errorCode", e.getErrorCode());
                iVar = new y.i();
            } finally {
                y.i iVar2 = new y.i();
                iVar2.f6339b = r0.this.d;
                iVar2.f6338a = poiItemV2SearchPOIId;
                messageObtainMessage.obj = iVar2;
                messageObtainMessage.setData(bundle);
                r0.this.i.sendMessage(messageObtainMessage);
            }
            iVar.f6339b = r0.this.d;
            iVar.f6338a = poiItemV2SearchPOIId;
            messageObtainMessage.obj = iVar;
        }
    }

    public r0(Context context, PoiSearchV2.Query query) throws AMapException {
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

    public final PoiResultV2 b(int i) {
        if (g(i)) {
            return j.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException("page out of range");
    }

    public final void c(PoiResultV2 poiResultV2) {
        int i;
        j = new HashMap<>();
        PoiSearchV2.Query query = this.f6243b;
        if (query == null || poiResultV2 == null || (i = this.h) <= 0 || i <= query.getPageNum()) {
            return;
        }
        j.put(Integer.valueOf(this.f6243b.getPageNum()), poiResultV2);
    }

    public final boolean d() {
        PoiSearchV2.Query query = this.f6243b;
        if (query == null) {
            return false;
        }
        return (xts.j(query.getQueryString()) && xts.j(this.f6243b.getCategory())) ? false : true;
    }

    public final boolean f() {
        PoiSearchV2.SearchBound bound = getBound();
        return bound != null && bound.getShape().equals("Bound");
    }

    public final boolean g(int i) {
        return i <= this.h && i >= 0;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiSearchV2.SearchBound getBound() {
        return this.f6242a;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final String getLanguage() {
        return this.e;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiSearchV2.Query getQuery() {
        return this.f6243b;
    }

    public final boolean h() {
        PoiSearchV2.SearchBound bound = getBound();
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

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiResultV2 searchPOI() throws AMapException {
        try {
            x.c(this.c);
            if (!f() && !d()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!h()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            PoiSearchV2.Query query = this.f6243b;
            if (query == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if ((!query.queryEquals(this.f) && this.f6242a == null) || (!this.f6243b.queryEquals(this.f) && !this.f6242a.equals(this.g))) {
                this.h = 0;
                this.f = this.f6243b.m101clone();
                PoiSearchV2.SearchBound searchBound = this.f6242a;
                if (searchBound != null) {
                    this.g = searchBound.m102clone();
                }
                HashMap<Integer, PoiResultV2> map = j;
                if (map != null) {
                    map.clear();
                }
            }
            PoiSearchV2.SearchBound searchBound2 = this.f6242a;
            PoiSearchV2.SearchBound searchBoundClone = searchBound2 != null ? searchBound2.m102clone() : null;
            rws.a().f(this.f6243b.getQueryString());
            this.f6243b.setPageNum(rws.a().B(this.f6243b.getPageNum()));
            this.f6243b.setPageSize(rws.a().C(this.f6243b.getPageSize()));
            if (this.h == 0) {
                PoiResultV2 poiResultV2M = new c0(this.c, new kws(this.f6243b.m101clone(), searchBoundClone)).m();
                c(poiResultV2M);
                return poiResultV2M;
            }
            PoiResultV2 poiResultV2B = b(this.f6243b.getPageNum());
            if (poiResultV2B != null) {
                return poiResultV2B;
            }
            PoiResultV2 poiResultV2M2 = new c0(this.c, new kws(this.f6243b.m101clone(), searchBoundClone)).m();
            j.put(Integer.valueOf(this.f6243b.getPageNum()), poiResultV2M2);
            return poiResultV2M2;
        } catch (AMapException e) {
            xts.i(e, "PoiSearch", "searchPOI");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiItemV2 searchPOIId(String str) throws AMapException {
        x.c(this.c);
        PoiSearchV2.Query query = this.f6243b;
        return new a0(this.c, str, query != null ? query.m101clone() : null).m();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIIdAsyn(String str) {
        ays.a().b(new b(str));
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setBound(PoiSearchV2.SearchBound searchBound) {
        this.f6242a = searchBound;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setLanguage(String str) {
        if ("en".equals(str)) {
            this.e = "en";
        } else {
            this.e = "zh-CN";
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setOnPoiSearchListener(PoiSearchV2.OnPoiSearchListener onPoiSearchListener) {
        this.d = onPoiSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setQuery(PoiSearchV2.Query query) {
        this.f6243b = query;
    }
}
