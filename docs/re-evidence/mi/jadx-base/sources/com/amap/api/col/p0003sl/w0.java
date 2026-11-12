package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IWeatherSearch;
import com.amap.api.services.weather.LocalWeatherForecastResult;
import com.amap.api.services.weather.LocalWeatherLiveResult;
import com.amap.api.services.weather.WeatherSearch;
import com.amap.api.services.weather.WeatherSearchQuery;
import defpackage.ays;
import defpackage.iys;
import defpackage.kys;
import defpackage.wts;
import defpackage.xts;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements IWeatherSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeatherSearchQuery f6295b;
    public WeatherSearch.OnWeatherSearchListener c;
    public LocalWeatherLiveResult d;
    public LocalWeatherForecastResult e;
    public Handler f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.arg1 = 13;
            Bundle bundle = new Bundle();
            if (w0.this.f6295b == null) {
                try {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                } catch (AMapException e) {
                    xts.i(e, "WeatherSearch", "searchWeatherAsyn");
                    return;
                }
            }
            if (w0.this.f6295b.getType() == 1) {
                try {
                    w0 w0Var = w0.this;
                    w0Var.d = w0Var.b();
                    bundle.putInt("errorCode", 1000);
                    return;
                } catch (AMapException e2) {
                    bundle.putInt("errorCode", e2.getErrorCode());
                    xts.i(e2, "WeatherSearch", "searchWeatherAsyn");
                    return;
                } catch (Throwable th) {
                    xts.i(th, "WeatherSearch", "searchWeatherAnsyThrowable");
                    return;
                } finally {
                    y.o oVar = new y.o();
                    messageObtainMessage.what = 1301;
                    oVar.f6351b = w0.this.c;
                    oVar.f6350a = w0.this.d;
                    messageObtainMessage.obj = oVar;
                    messageObtainMessage.setData(bundle);
                    w0.this.f.sendMessage(messageObtainMessage);
                }
            }
            if (w0.this.f6295b.getType() == 2) {
                try {
                    w0 w0Var2 = w0.this;
                    w0Var2.e = w0Var2.e();
                    bundle.putInt("errorCode", 1000);
                } catch (AMapException e3) {
                    bundle.putInt("errorCode", e3.getErrorCode());
                    xts.i(e3, "WeatherSearch", "searchWeatherAsyn");
                } catch (Throwable th2) {
                    xts.i(th2, "WeatherSearch", "searchWeatherAnsyThrowable");
                } finally {
                    y.n nVar = new y.n();
                    messageObtainMessage.what = 1302;
                    nVar.f6349b = w0.this.c;
                    nVar.f6348a = w0.this.e;
                    messageObtainMessage.obj = nVar;
                    messageObtainMessage.setData(bundle);
                    w0.this.f.sendMessage(messageObtainMessage);
                }
            }
        }
    }

    public w0(Context context) throws AMapException {
        this.f = null;
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6294a = context.getApplicationContext();
        this.f = y.a();
    }

    public final LocalWeatherLiveResult b() throws AMapException {
        x.c(this.f6294a);
        WeatherSearchQuery weatherSearchQuery = this.f6295b;
        if (weatherSearchQuery == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        kys kysVar = new kys(this.f6294a, weatherSearchQuery);
        return LocalWeatherLiveResult.createPagedResult(kysVar.t(), kysVar.m());
    }

    public final LocalWeatherForecastResult e() throws AMapException {
        x.c(this.f6294a);
        WeatherSearchQuery weatherSearchQuery = this.f6295b;
        if (weatherSearchQuery == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        iys iysVar = new iys(this.f6294a, weatherSearchQuery);
        return LocalWeatherForecastResult.createPagedResult(iysVar.t(), iysVar.m());
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final WeatherSearchQuery getQuery() {
        return this.f6295b;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void searchWeatherAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setOnWeatherSearchListener(WeatherSearch.OnWeatherSearchListener onWeatherSearchListener) {
        this.c = onWeatherSearchListener;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setQuery(WeatherSearchQuery weatherSearchQuery) {
        this.f6295b = weatherSearchQuery;
    }
}
