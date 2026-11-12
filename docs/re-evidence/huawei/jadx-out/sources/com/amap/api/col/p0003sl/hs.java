package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.interfaces.IGeocodeSearch;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hs implements IGeocodeSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GeocodeSearch.OnGeocodeSearchListener f2651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f2652c;

    public hs(Context context) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2650a = context.getApplicationContext();
        this.f2652c = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        try {
            gd.a(this.f2650a);
            if (!a(regeocodeQuery)) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new gx(this.f2650a, regeocodeQuery).d();
        } catch (AMapException e) {
            fu.a(e, "GeocodeSearch", "getFromLocationAsyn");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        try {
            gd.a(this.f2650a);
            if (geocodeQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new ga(this.f2650a, geocodeQuery).d();
        } catch (AMapException e) {
            fu.a(e, "GeocodeSearch", "getFromLocationName");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void setOnGeocodeSearchListener(GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener) {
        this.f2651b = onGeocodeSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationAsyn(final RegeocodeQuery regeocodeQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hs.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.arg1 = 2;
                            messageObtainMessage.what = 201;
                            gf.l lVar = new gf.l();
                            lVar.f2574b = hs.this.f2651b;
                            messageObtainMessage.obj = lVar;
                            lVar.f2573a = new RegeocodeResult(regeocodeQuery, hs.this.getFromLocation(regeocodeQuery));
                            messageObtainMessage.arg2 = 1000;
                        } catch (AMapException e) {
                            messageObtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        hs.this.f2652c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "GeocodeSearch", "getFromLocationAsyn_threadcreate");
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationNameAsyn(final GeocodeQuery geocodeQuery) {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hs.2
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    try {
                        try {
                            messageObtainMessage.what = 200;
                            messageObtainMessage.arg1 = 2;
                            messageObtainMessage.arg2 = 1000;
                            gf.f fVar = new gf.f();
                            fVar.f2562b = hs.this.f2651b;
                            messageObtainMessage.obj = fVar;
                            fVar.f2561a = new GeocodeResult(geocodeQuery, hs.this.getFromLocationName(geocodeQuery));
                        } catch (AMapException e) {
                            messageObtainMessage.arg2 = e.getErrorCode();
                        }
                    } finally {
                        hs.this.f2652c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "GeocodeSearch", "getFromLocationNameAsynThrowable");
        }
    }

    private static boolean a(RegeocodeQuery regeocodeQuery) {
        return (regeocodeQuery == null || regeocodeQuery.getPoint() == null || regeocodeQuery.getLatLonType() == null) ? false : true;
    }
}
