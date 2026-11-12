package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.auto.AutoTChargeStationResult;
import com.amap.api.services.auto.AutoTSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IAutoTSearch;
import defpackage.ays;
import defpackage.bts;
import defpackage.wts;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements IAutoTSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f6070b;
    public AutoTSearch.Query c;
    public AutoTSearch.OnChargeStationListener d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.a aVar;
            Message messageObtainMessage = h0.this.f6070b.obtainMessage();
            messageObtainMessage.arg1 = 20;
            messageObtainMessage.what = 600;
            Bundle bundle = new Bundle();
            AutoTChargeStationResult autoTChargeStationResultSearchChargeStation = null;
            try {
                autoTChargeStationResultSearchChargeStation = h0.this.searchChargeStation();
                bundle.putInt("errorCode", 1000);
                aVar = new y.a();
            } catch (AMapException e) {
                bundle.putInt("errorCode", e.getErrorCode());
                aVar = new y.a();
            } finally {
                y.a aVar2 = new y.a();
                aVar2.f6323b = h0.this.d;
                aVar2.f6322a = autoTChargeStationResultSearchChargeStation;
                messageObtainMessage.obj = aVar2;
                messageObtainMessage.setData(bundle);
                h0.this.f6070b.sendMessage(messageObtainMessage);
            }
            aVar.f6323b = h0.this.d;
            aVar.f6322a = autoTChargeStationResultSearchChargeStation;
            messageObtainMessage.obj = aVar;
        }
    }

    public h0(Context context) throws AMapException {
        this.f6070b = null;
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6069a = context.getApplicationContext();
        this.f6070b = y.a();
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final AutoTChargeStationResult searchChargeStation() throws AMapException {
        try {
            x.c(this.f6069a);
            AutoTSearch.Query query = this.c;
            if (query != null) {
                return new bts(this.f6069a, query.m93clone()).m();
            }
            throw new AMapException("无效的参数 - IllegalArgumentException");
        } catch (AMapException e) {
            throw new AMapException(e.getMessage());
        }
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void searchChargeStationAsync() {
        try {
            ays.a().b(new a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setChargeStationListener(AutoTSearch.OnChargeStationListener onChargeStationListener) {
        this.d = onChargeStationListener;
    }

    @Override // com.amap.api.services.interfaces.IAutoTSearch
    public final void setQuery(AutoTSearch.Query query) {
        this.c = query;
    }
}
