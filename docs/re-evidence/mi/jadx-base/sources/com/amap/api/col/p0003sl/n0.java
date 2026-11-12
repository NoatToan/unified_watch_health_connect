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
import defpackage.ays;
import defpackage.wts;
import defpackage.xts;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements IGeocodeSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GeocodeSearch.OnGeocodeSearchListener f6210b;
    public Handler c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RegeocodeQuery f6211a;

        public a(RegeocodeQuery regeocodeQuery) {
            this.f6211a = regeocodeQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.arg1 = 2;
                    messageObtainMessage.what = 201;
                    y.l lVar = new y.l();
                    lVar.f6345b = n0.this.f6210b;
                    messageObtainMessage.obj = lVar;
                    lVar.f6344a = new RegeocodeResult(this.f6211a, n0.this.getFromLocation(this.f6211a));
                    messageObtainMessage.arg2 = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                n0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GeocodeQuery f6213a;

        public b(GeocodeQuery geocodeQuery) {
            this.f6213a = geocodeQuery;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            try {
                try {
                    messageObtainMessage.what = 200;
                    messageObtainMessage.arg1 = 2;
                    messageObtainMessage.arg2 = 1000;
                    y.f fVar = new y.f();
                    fVar.f6333b = n0.this.f6210b;
                    messageObtainMessage.obj = fVar;
                    fVar.f6332a = new GeocodeResult(this.f6213a, n0.this.getFromLocationName(this.f6213a));
                } catch (AMapException e) {
                    messageObtainMessage.arg2 = e.getErrorCode();
                }
            } finally {
                n0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public n0(Context context) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6209a = context.getApplicationContext();
        this.c = y.a();
    }

    public static boolean b(RegeocodeQuery regeocodeQuery) {
        return (regeocodeQuery == null || regeocodeQuery.getPoint() == null || regeocodeQuery.getLatLonType() == null) ? false : true;
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final RegeocodeAddress getFromLocation(RegeocodeQuery regeocodeQuery) throws AMapException {
        try {
            x.c(this.f6209a);
            if (b(regeocodeQuery)) {
                return new g0(this.f6209a, regeocodeQuery).m();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            xts.i(e, "GeocodeSearch", "getFromLocationAsyn");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationAsyn(RegeocodeQuery regeocodeQuery) {
        try {
            ays.a().b(new a(regeocodeQuery));
        } catch (Throwable th) {
            xts.i(th, "GeocodeSearch", "getFromLocationAsyn_threadcreate");
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final List<GeocodeAddress> getFromLocationName(GeocodeQuery geocodeQuery) throws AMapException {
        try {
            x.c(this.f6209a);
            if (geocodeQuery != null) {
                return new w(this.f6209a, geocodeQuery).m();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            xts.i(e, "GeocodeSearch", "getFromLocationName");
            throw e;
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void getFromLocationNameAsyn(GeocodeQuery geocodeQuery) {
        try {
            ays.a().b(new b(geocodeQuery));
        } catch (Throwable th) {
            xts.i(th, "GeocodeSearch", "getFromLocationNameAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.IGeocodeSearch
    public final void setOnGeocodeSearchListener(GeocodeSearch.OnGeocodeSearchListener onGeocodeSearchListener) {
        this.f6210b = onGeocodeSearchListener;
    }
}
