package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;

/* JADX INFO: loaded from: classes21.dex */
public final class hx implements IRoutePOISearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RoutePOISearchQuery f2682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RoutePOISearch.OnRoutePOISearchListener f2684c;
    private Handler d;

    public hx(Context context, RoutePOISearchQuery routePOISearchQuery) throws AMapException {
        this.d = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2683b = context;
        this.f2682a = routePOISearchQuery;
        this.d = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setRoutePOISearchListener(RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener) {
        this.f2684c = onRoutePOISearchListener;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void searchRoutePOIAsyn() {
        he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hx.1
            @Override // java.lang.Runnable
            public final void run() {
                gf.m mVar;
                Message messageObtainMessage = hx.this.d.obtainMessage();
                messageObtainMessage.arg1 = 14;
                Bundle bundle = new Bundle();
                RoutePOISearchResult routePOISearchResultSearchRoutePOI = null;
                try {
                    routePOISearchResultSearchRoutePOI = hx.this.searchRoutePOI();
                    bundle.putInt("errorCode", 1000);
                    mVar = new gf.m();
                } catch (AMapException e) {
                    bundle.putInt("errorCode", e.getErrorCode());
                    mVar = new gf.m();
                } finally {
                    gf.m mVar2 = new gf.m();
                    mVar2.f2576b = hx.this.f2684c;
                    mVar2.f2575a = routePOISearchResultSearchRoutePOI;
                    messageObtainMessage.obj = mVar2;
                    messageObtainMessage.setData(bundle);
                    hx.this.d.sendMessage(messageObtainMessage);
                }
                mVar.f2576b = hx.this.f2684c;
                mVar.f2575a = routePOISearchResultSearchRoutePOI;
                messageObtainMessage.obj = mVar;
            }
        });
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        this.f2682a = routePOISearchQuery;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final RoutePOISearchQuery getQuery() {
        return this.f2682a;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final RoutePOISearchResult searchRoutePOI() throws AMapException {
        try {
            gd.a(this.f2683b);
            if (!a()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new ha(this.f2683b, this.f2682a.m787clone()).d();
        } catch (AMapException e) {
            fu.a(e, "RoutePOISearchCore", "searchRoutePOI");
            throw e;
        }
    }

    private boolean a() {
        RoutePOISearchQuery routePOISearchQuery = this.f2682a;
        if (routePOISearchQuery == null || routePOISearchQuery.getSearchType() == null) {
            return false;
        }
        return (this.f2682a.getFrom() == null && this.f2682a.getTo() == null && this.f2682a.getPolylines() == null) ? false : true;
    }
}
