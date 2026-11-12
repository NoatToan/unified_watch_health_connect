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
import defpackage.ays;
import defpackage.pxs;
import defpackage.wts;
import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements IRoutePOISearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RoutePOISearchQuery f6247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6248b;
    public RoutePOISearch.OnRoutePOISearchListener c;
    public Handler d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.m mVar;
            Message messageObtainMessage = s0.this.d.obtainMessage();
            messageObtainMessage.arg1 = 14;
            Bundle bundle = new Bundle();
            RoutePOISearchResult routePOISearchResultSearchRoutePOI = null;
            try {
                routePOISearchResultSearchRoutePOI = s0.this.searchRoutePOI();
                bundle.putInt("errorCode", 1000);
                mVar = new y.m();
            } catch (AMapException e) {
                bundle.putInt("errorCode", e.getErrorCode());
                mVar = new y.m();
            } finally {
                y.m mVar2 = new y.m();
                mVar2.f6347b = s0.this.c;
                mVar2.f6346a = routePOISearchResultSearchRoutePOI;
                messageObtainMessage.obj = mVar2;
                messageObtainMessage.setData(bundle);
                s0.this.d.sendMessage(messageObtainMessage);
            }
            mVar.f6347b = s0.this.c;
            mVar.f6346a = routePOISearchResultSearchRoutePOI;
            messageObtainMessage.obj = mVar;
        }
    }

    public s0(Context context, RoutePOISearchQuery routePOISearchQuery) throws AMapException {
        this.d = null;
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6248b = context;
        this.f6247a = routePOISearchQuery;
        this.d = y.a();
    }

    public final boolean b() {
        RoutePOISearchQuery routePOISearchQuery = this.f6247a;
        if (routePOISearchQuery == null || routePOISearchQuery.getSearchType() == null) {
            return false;
        }
        return (this.f6247a.getFrom() == null && this.f6247a.getTo() == null && this.f6247a.getPolylines() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final RoutePOISearchQuery getQuery() {
        return this.f6247a;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final RoutePOISearchResult searchRoutePOI() throws AMapException {
        try {
            x.c(this.f6248b);
            if (!b()) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new pxs(this.f6248b, this.f6247a.m116clone()).m();
        } catch (AMapException e) {
            xts.i(e, "RoutePOISearchCore", "searchRoutePOI");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void searchRoutePOIAsyn() {
        ays.a().b(new a());
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setQuery(RoutePOISearchQuery routePOISearchQuery) {
        this.f6247a = routePOISearchQuery;
    }

    @Override // com.amap.api.services.interfaces.IRoutePOISearch
    public final void setRoutePOISearchListener(RoutePOISearch.OnRoutePOISearchListener onRoutePOISearchListener) {
        this.c = onRoutePOISearchListener;
    }
}
