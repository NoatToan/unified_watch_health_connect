package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItemV2;
import com.amap.api.services.interfaces.IPoiSearchV2;
import com.amap.api.services.poisearch.PoiResultV2;
import com.amap.api.services.poisearch.PoiSearchV2;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class hw implements IPoiSearchV2 {
    private static HashMap<Integer, PoiResultV2> i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PoiSearchV2.SearchBound f2676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PoiSearchV2.Query f2677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f2678c;
    private PoiSearchV2.OnPoiSearchListener d;
    private String e = "zh-CN";
    private PoiSearchV2.Query f;
    private PoiSearchV2.SearchBound g;
    private int h;
    private Handler j;

    public hw(Context context, PoiSearchV2.Query query) throws AMapException {
        this.j = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2678c = context.getApplicationContext();
        setQuery(query);
        this.j = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setOnPoiSearchListener(PoiSearchV2.OnPoiSearchListener onPoiSearchListener) {
        this.d = onPoiSearchListener;
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
    public final String getLanguage() {
        return this.e;
    }

    private boolean a() {
        PoiSearchV2.Query query = this.f2677b;
        if (query == null) {
            return false;
        }
        return (fu.a(query.getQueryString()) && fu.a(this.f2677b.getCategory())) ? false : true;
    }

    private boolean b() {
        PoiSearchV2.SearchBound bound = getBound();
        return bound != null && bound.getShape().equals("Bound");
    }

    private boolean c() {
        PoiSearchV2.SearchBound bound = getBound();
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

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiResultV2 searchPOI() throws AMapException {
        try {
            gd.a(this.f2678c);
            if (!b() && !a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (!c()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            PoiSearchV2.Query query = this.f2677b;
            if (query == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if ((!query.queryEquals(this.f) && this.f2676a == null) || (!this.f2677b.queryEquals(this.f) && !this.f2676a.equals(this.g))) {
                this.h = 0;
                this.f = this.f2677b.m772clone();
                PoiSearchV2.SearchBound searchBound = this.f2676a;
                if (searchBound != null) {
                    this.g = searchBound.m773clone();
                }
                HashMap<Integer, PoiResultV2> map = i;
                if (map != null) {
                    map.clear();
                }
            }
            PoiSearchV2.SearchBound searchBound2 = this.f2676a;
            PoiSearchV2.SearchBound searchBoundClone = searchBound2 != null ? searchBound2.m773clone() : null;
            gw.a().a(this.f2677b.getQueryString());
            this.f2677b.setPageNum(gw.a().k(this.f2677b.getPageNum()));
            this.f2677b.setPageSize(gw.a().l(this.f2677b.getPageSize()));
            if (this.h == 0) {
                PoiResultV2 poiResultV2D = new gn(this.f2678c, new gr(this.f2677b.m772clone(), searchBoundClone)).d();
                a(poiResultV2D);
                return poiResultV2D;
            }
            PoiResultV2 poiResultV2A = a(this.f2677b.getPageNum());
            if (poiResultV2A != null) {
                return poiResultV2A;
            }
            PoiResultV2 poiResultV2D2 = new gn(this.f2678c, new gr(this.f2677b.m772clone(), searchBoundClone)).d();
            i.put(Integer.valueOf(this.f2677b.getPageNum()), poiResultV2D2);
            return poiResultV2D2;
        } catch (AMapException e) {
            fu.a(e, "PoiSearch", "searchPOI");
            throw new AMapException(e.getErrorMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hw.1
                @Override // java.lang.Runnable
                public final void run() {
                    gf.k kVar;
                    Message messageObtainMessage = hw.this.j.obtainMessage();
                    messageObtainMessage.arg1 = 19;
                    messageObtainMessage.what = TypedValues.MotionType.TYPE_EASING;
                    Bundle bundle = new Bundle();
                    PoiResultV2 poiResultV2SearchPOI = null;
                    try {
                        poiResultV2SearchPOI = hw.this.searchPOI();
                        bundle.putInt("errorCode", 1000);
                        kVar = new gf.k();
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                        kVar = new gf.k();
                    } finally {
                        gf.k kVar2 = new gf.k();
                        kVar2.f2572b = hw.this.d;
                        kVar2.f2571a = poiResultV2SearchPOI;
                        messageObtainMessage.obj = kVar2;
                        messageObtainMessage.setData(bundle);
                        hw.this.j.sendMessage(messageObtainMessage);
                    }
                    kVar.f2572b = hw.this.d;
                    kVar.f2571a = poiResultV2SearchPOI;
                    messageObtainMessage.obj = kVar;
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiItemV2 searchPOIId(String str) throws AMapException {
        gd.a(this.f2678c);
        PoiSearchV2.Query query = this.f2677b;
        return new gl(this.f2678c, str, query != null ? query.m772clone() : null).d();
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void searchPOIIdAsyn(final String str) {
        he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hw.2
            @Override // java.lang.Runnable
            public final void run() {
                gf.i iVar;
                Message messageObtainMessage = gf.a().obtainMessage();
                messageObtainMessage.arg1 = 19;
                messageObtainMessage.what = TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR;
                Bundle bundle = new Bundle();
                PoiItemV2 poiItemV2SearchPOIId = null;
                try {
                    poiItemV2SearchPOIId = hw.this.searchPOIId(str);
                    bundle.putInt("errorCode", 1000);
                    iVar = new gf.i();
                } catch (AMapException e) {
                    fu.a(e, "PoiSearch", "searchPOIIdAsyn");
                    bundle.putInt("errorCode", e.getErrorCode());
                    iVar = new gf.i();
                } finally {
                    gf.i iVar2 = new gf.i();
                    iVar2.f2568b = hw.this.d;
                    iVar2.f2567a = poiItemV2SearchPOIId;
                    messageObtainMessage.obj = iVar2;
                    messageObtainMessage.setData(bundle);
                    hw.this.j.sendMessage(messageObtainMessage);
                }
                iVar.f2568b = hw.this.d;
                iVar.f2567a = poiItemV2SearchPOIId;
                messageObtainMessage.obj = iVar;
            }
        });
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setQuery(PoiSearchV2.Query query) {
        this.f2677b = query;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final void setBound(PoiSearchV2.SearchBound searchBound) {
        this.f2676a = searchBound;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiSearchV2.Query getQuery() {
        return this.f2677b;
    }

    @Override // com.amap.api.services.interfaces.IPoiSearchV2
    public final PoiSearchV2.SearchBound getBound() {
        return this.f2676a;
    }

    private void a(PoiResultV2 poiResultV2) {
        int i2;
        i = new HashMap<>();
        PoiSearchV2.Query query = this.f2677b;
        if (query == null || poiResultV2 == null || (i2 = this.h) <= 0 || i2 <= query.getPageNum()) {
            return;
        }
        i.put(Integer.valueOf(this.f2677b.getPageNum()), poiResultV2);
    }

    private PoiResultV2 a(int i2) {
        if (!b(i2)) {
            throw new IllegalArgumentException("page out of range");
        }
        return i.get(Integer.valueOf(i2));
    }

    private boolean b(int i2) {
        return i2 <= this.h && i2 >= 0;
    }
}
