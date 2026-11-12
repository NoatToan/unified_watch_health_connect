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
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;

/* JADX INFO: loaded from: classes21.dex */
public final class ib implements IWeatherSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeatherSearchQuery f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeatherSearch.OnWeatherSearchListener f2736c;
    private LocalWeatherLiveResult d;
    private LocalWeatherForecastResult e;
    private Handler f;

    public ib(Context context) throws AMapException {
        this.f = null;
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2734a = context.getApplicationContext();
        this.f = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final WeatherSearchQuery getQuery() {
        return this.f2735b;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setQuery(WeatherSearchQuery weatherSearchQuery) {
        this.f2735b = weatherSearchQuery;
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void searchWeatherAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ib.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.arg1 = 13;
                    Bundle bundle = new Bundle();
                    if (ib.this.f2735b == null) {
                        try {
                            throw new AMapException("无效的参数 - IllegalArgumentException");
                        } catch (AMapException e) {
                            fu.a(e, "WeatherSearch", "searchWeatherAsyn");
                            return;
                        }
                    }
                    if (ib.this.f2735b.getType() == 1) {
                        try {
                            try {
                                ib ibVar = ib.this;
                                ibVar.d = ibVar.a();
                                bundle.putInt("errorCode", 1000);
                                gf.o oVar = new gf.o();
                                messageObtainMessage.what = CommonPickerConstant.RETCODE.H5_UNAUTHORIZED_CODE;
                                oVar.f2580b = ib.this.f2736c;
                                oVar.f2579a = ib.this.d;
                                messageObtainMessage.obj = oVar;
                                messageObtainMessage.setData(bundle);
                                ib.this.f.sendMessage(messageObtainMessage);
                                return;
                            } catch (Throwable th) {
                                gf.o oVar2 = new gf.o();
                                messageObtainMessage.what = CommonPickerConstant.RETCODE.H5_UNAUTHORIZED_CODE;
                                oVar2.f2580b = ib.this.f2736c;
                                oVar2.f2579a = ib.this.d;
                                messageObtainMessage.obj = oVar2;
                                messageObtainMessage.setData(bundle);
                                ib.this.f.sendMessage(messageObtainMessage);
                                throw th;
                            }
                        } catch (AMapException e2) {
                            bundle.putInt("errorCode", e2.getErrorCode());
                            fu.a(e2, "WeatherSearch", "searchWeatherAsyn");
                            gf.o oVar3 = new gf.o();
                            messageObtainMessage.what = CommonPickerConstant.RETCODE.H5_UNAUTHORIZED_CODE;
                            oVar3.f2580b = ib.this.f2736c;
                            oVar3.f2579a = ib.this.d;
                            messageObtainMessage.obj = oVar3;
                            messageObtainMessage.setData(bundle);
                            ib.this.f.sendMessage(messageObtainMessage);
                            return;
                        } catch (Throwable th2) {
                            fu.a(th2, "WeatherSearch", "searchWeatherAnsyThrowable");
                            gf.o oVar4 = new gf.o();
                            messageObtainMessage.what = CommonPickerConstant.RETCODE.H5_UNAUTHORIZED_CODE;
                            oVar4.f2580b = ib.this.f2736c;
                            oVar4.f2579a = ib.this.d;
                            messageObtainMessage.obj = oVar4;
                            messageObtainMessage.setData(bundle);
                            ib.this.f.sendMessage(messageObtainMessage);
                            return;
                        }
                    }
                    if (ib.this.f2735b.getType() == 2) {
                        try {
                            try {
                                ib ibVar2 = ib.this;
                                ibVar2.e = ibVar2.b();
                                bundle.putInt("errorCode", 1000);
                                gf.n nVar = new gf.n();
                                messageObtainMessage.what = 1302;
                                nVar.f2578b = ib.this.f2736c;
                                nVar.f2577a = ib.this.e;
                                messageObtainMessage.obj = nVar;
                                messageObtainMessage.setData(bundle);
                                ib.this.f.sendMessage(messageObtainMessage);
                            } catch (Throwable th3) {
                                gf.n nVar2 = new gf.n();
                                messageObtainMessage.what = 1302;
                                nVar2.f2578b = ib.this.f2736c;
                                nVar2.f2577a = ib.this.e;
                                messageObtainMessage.obj = nVar2;
                                messageObtainMessage.setData(bundle);
                                ib.this.f.sendMessage(messageObtainMessage);
                                throw th3;
                            }
                        } catch (AMapException e3) {
                            bundle.putInt("errorCode", e3.getErrorCode());
                            fu.a(e3, "WeatherSearch", "searchWeatherAsyn");
                            gf.n nVar3 = new gf.n();
                            messageObtainMessage.what = 1302;
                            nVar3.f2578b = ib.this.f2736c;
                            nVar3.f2577a = ib.this.e;
                            messageObtainMessage.obj = nVar3;
                            messageObtainMessage.setData(bundle);
                            ib.this.f.sendMessage(messageObtainMessage);
                        } catch (Throwable th4) {
                            fu.a(th4, "WeatherSearch", "searchWeatherAnsyThrowable");
                            gf.n nVar4 = new gf.n();
                            messageObtainMessage.what = 1302;
                            nVar4.f2578b = ib.this.f2736c;
                            nVar4.f2577a = ib.this.e;
                            messageObtainMessage.obj = nVar4;
                            messageObtainMessage.setData(bundle);
                            ib.this.f.sendMessage(messageObtainMessage);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalWeatherLiveResult a() throws AMapException {
        gd.a(this.f2734a);
        if (this.f2735b == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        hj hjVar = new hj(this.f2734a, this.f2735b);
        return LocalWeatherLiveResult.createPagedResult(hjVar.f(), hjVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalWeatherForecastResult b() throws AMapException {
        gd.a(this.f2734a);
        if (this.f2735b == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        hi hiVar = new hi(this.f2734a, this.f2735b);
        return LocalWeatherForecastResult.createPagedResult(hiVar.f(), hiVar.d());
    }

    @Override // com.amap.api.services.interfaces.IWeatherSearch
    public final void setOnWeatherSearchListener(WeatherSearch.OnWeatherSearchListener onWeatherSearchListener) {
        this.f2736c = onWeatherSearchListener;
    }
}
