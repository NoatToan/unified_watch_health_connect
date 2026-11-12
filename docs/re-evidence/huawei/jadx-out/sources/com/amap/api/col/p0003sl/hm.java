package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.AutoTSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IAutoTSearch;

/* JADX INFO: loaded from: classes21.dex */
public final class hm implements IAutoTSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f2622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AutoTSearch.Query f2623c;
    private AutoTSearch.OnChargeStationListener d;

    public hm(Context context) throws AMapException {
        this.f2622b = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2621a = context.getApplicationContext();
        this.f2622b = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setQuery(AutoTSearch.Query query) {
        this.f2623c = query;
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setChargeStationListener(AutoTSearch.OnChargeStationListener onChargeStationListener) {
        this.d = onChargeStationListener;
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final AutoTChargeStationResult searchChargeStation() throws AMapException {
        try {
            gd.a(this.f2621a);
            if (this.f2623c == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new fi(this.f2621a, this.f2623c.m764clone()).d();
        } catch (AMapException e) {
            throw new AMapException(e.getMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void searchChargeStationAsync() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.hm.1
                @Override // java.lang.Runnable
                public final void run() {
                    gf.a aVar;
                    Message messageObtainMessage = hm.this.f2622b.obtainMessage();
                    messageObtainMessage.arg1 = 20;
                    messageObtainMessage.what = 600;
                    Bundle bundle = new Bundle();
                    AutoTChargeStationResult autoTChargeStationResultSearchChargeStation = null;
                    try {
                        autoTChargeStationResultSearchChargeStation = hm.this.searchChargeStation();
                        bundle.putInt("errorCode", 1000);
                        aVar = new gf.a();
                    } catch (AMapException e) {
                        bundle.putInt("errorCode", e.getErrorCode());
                        aVar = new gf.a();
                    } finally {
                        gf.a aVar2 = new gf.a();
                        aVar2.f2552b = hm.this.d;
                        aVar2.f2551a = autoTChargeStationResultSearchChargeStation;
                        messageObtainMessage.obj = aVar2;
                        messageObtainMessage.setData(bundle);
                        hm.this.f2622b.sendMessage(messageObtainMessage);
                    }
                    aVar.f2552b = hm.this.d;
                    aVar.f2551a = autoTChargeStationResultSearchChargeStation;
                    messageObtainMessage.obj = aVar;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
