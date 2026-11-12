package com.xiaomi.fitness.sync.util;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.sync.SyncEngine;
import com.xiaomi.fitness.sync.export.FirmwareVersionLowException;
import com.xiaomi.fitness.sync.export.MyAction1;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.util.BlueToothSender;
import defpackage.aa3;
import defpackage.b9r;
import defpackage.d9r;
import defpackage.e9r;
import defpackage.eu6;
import defpackage.g9r;
import defpackage.h9r;
import defpackage.i9r;
import defpackage.j5h;
import defpackage.n64;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.p64;
import defpackage.s64;
import defpackage.s7r;
import defpackage.t64;
import defpackage.txo;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.v64;
import defpackage.wxo;
import defpackage.x0b;
import defpackage.xgo;
import defpackage.y0b;
import defpackage.ygo;
import defpackage.z93;
import defpackage.zgo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bN\u0010IJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0006J5\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J/\u0010/\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010+2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J%\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00103\u001a\u00020-¢\u0006\u0004\b!\u00104J!\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020706052\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020 2\u0006\u0010>\u001a\u00020\u001a¢\u0006\u0004\b?\u00102J=\u0010F\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u000e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0D¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020 ¢\u0006\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/sync/util/BlueToothSender;", "", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;", "weather", "Lp64;", "getTemperature", "(Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;)Lp64;", "getHumidity", "Lb9r$a;", "getAlertsList", "(Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;)Lb9r$a;", "Lh9r;", "weatherId", "Lg9r;", "getDailyForecast", "(Lh9r;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;)Lg9r;", "getHourlyForecast", "getWindInfo", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$HourlyForecast$Wind;", "wind", "", "index", "getHourlyForecastWindInfo", "(Lcom/xiaomi/fitness/sync/export/model/WeatherResp$HourlyForecast$Wind;I)Lp64;", "getUvindex", "getAqi", "", "did", "Li9r;", "weatherLatest", "dailyForecast", "hourlyForecast", "", "handleWeather", "(Ljava/lang/String;Li9r;Lg9r;Lg9r;)V", "", "pressure", "handleWeatherPressure", "(Ljava/lang/String;F)V", "Lygo$a;", "list", "handleStockInfo", "(Ljava/lang/String;Lygo$a;)V", "Laa3$a;", "Leu6;", "", "callBack", "handleCalendar", "(Ljava/lang/String;Laa3$a;Leu6;)V", "clearCalendar", "(Ljava/lang/String;)V", "isCurrentLocation", "(Ljava/lang/String;Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;Z)V", "Lo4h;", "", "Lzgo;", "getStockSymbolList", "(Ljava/lang/String;)Lo4h;", "Lzgo$a;", "stockSymbolList", "setStockSymbolList", "(Lzgo$a;)V", "symbol", "deleteStockSymbol", "", "altitude", "latitude", "longitude", "Lcom/xiaomi/fitness/sync/export/MyAction1;", "callback", "postLocation", "(Ljava/lang/String;DDDLcom/xiaomi/fitness/sync/export/MyAction1;)V", "syncTime", "()V", "TAG", "Ljava/lang/String;", "mStockSymbolList", "Lzgo$a;", "<init>", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBlueToothSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlueToothSender.kt\ncom/xiaomi/fitness/sync/util/BlueToothSender\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,614:1\n37#2:615\n36#2,3:616\n37#2:619\n36#2,3:620\n37#2:623\n36#2,3:624\n*S KotlinDebug\n*F\n+ 1 BlueToothSender.kt\ncom/xiaomi/fitness/sync/util/BlueToothSender\n*L\n251#1:615\n251#1:616,3\n308#1:619\n308#1:620,3\n519#1:623\n519#1:624,3\n*E\n"})
public final class BlueToothSender {

    @NotNull
    public static final BlueToothSender INSTANCE = new BlueToothSender();

    @NotNull
    public static final String TAG = "BlueToothSender";

    @Nullable
    private static volatile zgo.a mStockSymbolList;

    private BlueToothSender() {
    }

    private final b9r.a getAlertsList(WeatherResp.Weather weather) {
        b9r.a aVar = new b9r.a();
        List<WeatherResp.Alert> list = weather.alerts;
        int size = list != null ? list.size() : 0;
        aVar.c = new b9r[size];
        for (int i = 0; i < size; i++) {
            WeatherResp.Alert alert = weather.alerts.get(i);
            b9r b9rVar = new b9r();
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            b9rVar.c = syncUtil.getNonNullString(alert.alertId);
            b9rVar.d = syncUtil.getNonNullString(alert.type);
            b9rVar.e = syncUtil.getNonNullString(alert.level);
            b9rVar.f = syncUtil.getNonNullString(alert.title);
            b9rVar.g = syncUtil.getNonNullString(alert.detail);
            aVar.c[i] = b9rVar;
        }
        return aVar;
    }

    private final p64 getAqi(WeatherResp.Weather weather) {
        p64 p64Var = new p64();
        if (weather.aqi != null) {
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            p64Var.c = syncUtil.getNonNullString(weather.aqi_level);
            String aqi = weather.aqi.aqi;
            Intrinsics.checkNotNullExpressionValue(aqi, "aqi");
            p64Var.d = syncUtil.getSafeIntValue(aqi);
        }
        return p64Var;
    }

    private final g9r getDailyForecast(h9r weatherId, WeatherResp.Weather weather) {
        s64 s64Var;
        String str;
        s64 s64Var2;
        d9r d9rVar;
        List<String> list;
        List<WeatherResp.StringFromTo> list2;
        List<WeatherResp.StringFromTo> list3;
        List<WeatherResp.StringFromTo> list4;
        WeatherResp.DailyForecast dailyForecast = weather.daily_forecast;
        ArrayList arrayList = new ArrayList();
        if (dailyForecast != null) {
            int i = 0;
            do {
                WeatherResp.DailyForecast.Weather weather2 = dailyForecast.weather;
                p64 p64Var = null;
                if (weather2 == null || (list4 = weather2.value) == null || i >= list4.size()) {
                    s64Var = null;
                } else {
                    s64Var = new s64();
                    SyncUtil syncUtil = SyncUtil.INSTANCE;
                    String from = dailyForecast.weather.value.get(i).from;
                    Intrinsics.checkNotNullExpressionValue(from, "from");
                    s64Var.c = syncUtil.getSafeIntValue(from);
                    String to = dailyForecast.weather.value.get(i).to;
                    Intrinsics.checkNotNullExpressionValue(to, "to");
                    s64Var.d = syncUtil.getSafeIntValue(to);
                }
                WeatherResp.DailyForecast.Temperature temperature = dailyForecast.temperature;
                if (temperature == null || (list3 = temperature.value) == null || i >= list3.size()) {
                    str = "";
                    s64Var2 = null;
                } else {
                    s64Var2 = new s64();
                    SyncUtil syncUtil2 = SyncUtil.INSTANCE;
                    String from2 = dailyForecast.temperature.value.get(i).from;
                    Intrinsics.checkNotNullExpressionValue(from2, "from");
                    s64Var2.c = syncUtil2.getSafeIntValue(from2);
                    String to2 = dailyForecast.temperature.value.get(i).to;
                    Intrinsics.checkNotNullExpressionValue(to2, "to");
                    s64Var2.d = syncUtil2.getSafeIntValue(to2);
                    str = dailyForecast.temperature.unit;
                }
                WeatherResp.DailyForecast.SunRiseSet sunRiseSet = dailyForecast.sunRiseSet;
                if (sunRiseSet == null || (list2 = sunRiseSet.value) == null || i >= list2.size()) {
                    d9rVar = null;
                } else {
                    d9rVar = new d9r();
                    SyncUtil syncUtil3 = SyncUtil.INSTANCE;
                    d9rVar.c = syncUtil3.getNonNullString(dailyForecast.sunRiseSet.value.get(i).from);
                    d9rVar.d = syncUtil3.getNonNullString(dailyForecast.sunRiseSet.value.get(i).to);
                }
                WeatherResp.ForecastAqi forecastAqi = dailyForecast.aqi;
                if (forecastAqi != null && forecastAqi.value != null && (list = dailyForecast.aqi_level) != null && i < list.size() && i < dailyForecast.aqi.value.size()) {
                    p64Var = new p64();
                    p64Var.c = SyncUtil.INSTANCE.getNonNullString(dailyForecast.aqi_level.get(i));
                    p64Var.d = dailyForecast.aqi.value.get(i).intValue();
                }
                if (s64Var == null && s64Var2 == null && d9rVar == null && p64Var == null) {
                    break;
                }
                g9r.a aVar = new g9r.a();
                if (p64Var == null) {
                    p64Var = new p64();
                }
                aVar.c = p64Var;
                aVar.d = s64Var;
                aVar.e = s64Var2;
                aVar.f = str;
                aVar.g = d9rVar;
                arrayList.add(aVar);
                i++;
            } while (i != 7);
        }
        g9r g9rVar = new g9r();
        g9rVar.c = weatherId;
        g9r.a.C0942a c0942a = new g9r.a.C0942a();
        g9rVar.d = c0942a;
        c0942a.c = (g9r.a[]) arrayList.toArray(new g9r.a[0]);
        return g9rVar;
    }

    private final g9r getHourlyForecast(h9r weatherId, WeatherResp.Weather weather) {
        boolean z;
        s64 s64Var;
        List<Integer> list;
        List<Integer> list2;
        WeatherResp.HourlyForecast hourlyForecast = weather.hourly_forecast;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = true;
        while (z2) {
            p64 p64Var = new p64();
            List<String> list3 = hourlyForecast.aqi_level;
            if (list3 != null && i < list3.size()) {
                p64Var.c = SyncUtil.INSTANCE.getNonNullString(hourlyForecast.aqi_level.get(i));
            }
            List<Integer> list4 = hourlyForecast.aqi.value;
            if (list4 == null || i >= list4.size()) {
                z = true;
            } else {
                p64Var.d = hourlyForecast.aqi.value.get(i).intValue();
                z = false;
            }
            WeatherResp.HourlyForecast.Weather weather2 = hourlyForecast.weather;
            s64 s64Var2 = null;
            if (weather2 == null || (list2 = weather2.value) == null || i >= list2.size()) {
                s64Var = null;
            } else {
                s64 s64Var3 = new s64();
                s64Var3.d = hourlyForecast.weather.value.get(i).intValue();
                s64Var = s64Var3;
                z = false;
            }
            WeatherResp.HourlyForecast.Temperature temperature = hourlyForecast.temperature;
            if (temperature != null && (list = temperature.value) != null && i < list.size()) {
                s64Var2 = new s64();
                s64Var2.d = hourlyForecast.temperature.value.get(i).intValue();
                z = false;
            }
            boolean z3 = !z;
            if (s64Var2 == null || s64Var == null) {
                break;
            }
            g9r.a aVar = new g9r.a();
            aVar.c = p64Var;
            aVar.e = s64Var2;
            aVar.d = s64Var;
            WeatherResp.HourlyForecast.Wind wind = hourlyForecast.wind;
            Intrinsics.checkNotNullExpressionValue(wind, "wind");
            aVar.h = getHourlyForecastWindInfo(wind, i);
            arrayList.add(aVar);
            i++;
            z2 = z3;
        }
        Logger.i("weather request", " getHourlyForecast:" + arrayList);
        g9r g9rVar = new g9r();
        g9rVar.c = weatherId;
        g9r.a.C0942a c0942a = new g9r.a.C0942a();
        g9rVar.d = c0942a;
        c0942a.c = (g9r.a[]) arrayList.toArray(new g9r.a[0]);
        return g9rVar;
    }

    private final p64 getHourlyForecastWindInfo(WeatherResp.HourlyForecast.Wind wind, int index) {
        p64 p64Var = new p64();
        List<WeatherResp.HourlyForecast.Wind.Value> list = wind.value;
        if (index < list.size()) {
            WeatherResp.HourlyForecast.Wind.Value value = list.get(index);
            String speed = value.speed;
            Intrinsics.checkNotNullExpressionValue(speed, "speed");
            float f = Float.parseFloat(speed);
            p64Var.c = value.direction;
            int i = 0;
            if (f >= 1.0f) {
                if (f >= 1.0f && f < 6.0f) {
                    i = 1;
                } else if (f >= 6.0f && f < 12.0f) {
                    i = 2;
                } else if (f >= 12.0f && f < 20.0f) {
                    i = 3;
                } else if (f >= 20.0f && f < 29.0f) {
                    i = 4;
                } else if (f >= 29.0f && f < 39.0f) {
                    i = 5;
                } else if (f >= 39.0f && f < 50.0f) {
                    i = 6;
                } else if (f >= 50.0f && f < 62.0f) {
                    i = 7;
                } else if (f >= 62.0f && f < 75.0f) {
                    i = 8;
                } else if (f >= 75.0f && f < 89.0f) {
                    i = 9;
                } else if (f >= 89.0f && f < 103.0f) {
                    i = 10;
                } else if (f >= 103.0f && f < 117.0f) {
                    i = 11;
                } else if (f >= 117.0f) {
                    i = 12;
                }
            }
            p64Var.d = i;
        }
        return p64Var;
    }

    private final p64 getHumidity(WeatherResp.Weather weather) {
        p64 p64Var = new p64();
        WeatherResp.UnitValue unitValue = weather.humidity;
        if (unitValue != null) {
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            p64Var.c = syncUtil.getNonNullString(unitValue.unit);
            String value = weather.humidity.value;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            p64Var.d = syncUtil.getSafeIntValue(value);
        } else {
            p64Var.c = "";
            p64Var.d = 0;
        }
        return p64Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getStockSymbolList$lambda$0(String did, final v4h emitter) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 4;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.BlueToothSender$getStockSymbolList$1$1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                if (code == 1) {
                    emitter.onError(new FirmwareVersionLowException("stock not support"));
                } else {
                    emitter.onError(new IllegalArgumentException("result.Error"));
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                xgo xgoVarD;
                s7r packet;
                ArrayList arrayList = new ArrayList();
                if (((result == null || (packet = result.getPacket()) == null) ? null : packet.D()) != null) {
                    BlueToothSender blueToothSender = BlueToothSender.INSTANCE;
                    s7r packet2 = result.getPacket();
                    BlueToothSender.mStockSymbolList = (packet2 == null || (xgoVarD = packet2.D()) == null) ? null : xgoVarD.o();
                    zgo.a aVar = BlueToothSender.mStockSymbolList;
                    if ((aVar != null ? aVar.c : null) != null) {
                        zgo.a aVar2 = BlueToothSender.mStockSymbolList;
                        Intrinsics.checkNotNull(aVar2);
                        zgo[] zgoVarArr = aVar2.c;
                        Collections.addAll(arrayList, Arrays.copyOf(zgoVarArr, zgoVarArr.length));
                    }
                }
                String tag = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
                Logger.d(tag, "getStockListFromDevice:" + arrayList);
                emitter.onNext(arrayList);
                emitter.onComplete();
            }
        }, 0, 16, (Object) null);
    }

    private final p64 getTemperature(WeatherResp.Weather weather) {
        p64 p64Var = new p64();
        WeatherResp.UnitValue unitValue = weather.temperature;
        if (unitValue != null) {
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            p64Var.c = syncUtil.getNonNullString(unitValue.unit);
            String value = weather.temperature.value;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            p64Var.d = syncUtil.getSafeIntValue(value);
        } else {
            p64Var.c = "";
            p64Var.d = 0;
        }
        return p64Var;
    }

    private final p64 getUvindex(WeatherResp.Weather weather) {
        WeatherResp.Indice indice;
        p64 p64Var = new p64();
        if (weather.uvIndex != null) {
            WeatherResp.Indices indices = weather.indices;
            if (indices != null && (indice = indices.uvIndex) != null) {
                p64Var.c = SyncUtil.INSTANCE.getNonNullString(indice.level);
            }
            SyncUtil syncUtil = SyncUtil.INSTANCE;
            String uvIndex = weather.uvIndex;
            Intrinsics.checkNotNullExpressionValue(uvIndex, "uvIndex");
            p64Var.d = syncUtil.getSafeIntValue(uvIndex);
        }
        return p64Var;
    }

    private final p64 getWindInfo(WeatherResp.Weather weather) {
        WeatherResp.UnitValue unitValue;
        float f;
        p64 p64Var = new p64();
        WeatherResp.Wind wind = weather.wind;
        if (wind != null && (unitValue = wind.direction) != null && wind.speed != null) {
            p64Var.c = SyncUtil.INSTANCE.getNonNullString(unitValue.value);
            String str = weather.wind.speed.value;
            try {
                Intrinsics.checkNotNull(str);
                f = Float.parseFloat(str);
            } catch (Exception e) {
                e.printStackTrace();
                f = 0.0f;
            }
            if (f < 1.0f) {
                p64Var.d = 0;
            } else if (f >= 1.0f && f < 6.0f) {
                p64Var.d = 1;
            } else if (f >= 6.0f && f < 12.0f) {
                p64Var.d = 2;
            } else if (f >= 12.0f && f < 20.0f) {
                p64Var.d = 3;
            } else if (f >= 20.0f && f < 29.0f) {
                p64Var.d = 4;
            } else if (f >= 29.0f && f < 39.0f) {
                p64Var.d = 5;
            } else if (f >= 39.0f && f < 50.0f) {
                p64Var.d = 6;
            } else if (f >= 50.0f && f < 62.0f) {
                p64Var.d = 7;
            } else if (f >= 62.0f && f < 75.0f) {
                p64Var.d = 8;
            } else if (f >= 75.0f && f < 89.0f) {
                p64Var.d = 9;
            } else if (f >= 89.0f && f < 103.0f) {
                p64Var.d = 10;
            } else if (f >= 103.0f && f < 117.0f) {
                p64Var.d = 11;
            } else if (f >= 117.0f) {
                p64Var.d = 12;
            }
        }
        return p64Var;
    }

    private final void handleWeather(String did, i9r weatherLatest, g9r dailyForecast, g9r hourlyForecast) {
        if (weatherLatest != null) {
            s7r s7rVar = new s7r();
            s7rVar.e = 10;
            s7rVar.f = 0;
            e9r e9rVar = new e9r();
            e9rVar.v(weatherLatest);
            s7rVar.f0(e9rVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
        }
        if (dailyForecast != null) {
            s7r s7rVar2 = new s7r();
            s7rVar2.e = 10;
            s7rVar2.f = 1;
            e9r e9rVar2 = new e9r();
            e9rVar2.u(dailyForecast);
            s7rVar2.f0(e9rVar2);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar2, false, (OnSyncCallback) null, 0, 16, (Object) null);
        }
        if (hourlyForecast != null) {
            s7r s7rVar3 = new s7r();
            s7rVar3.e = 10;
            s7rVar3.f = 2;
            e9r e9rVar3 = new e9r();
            e9rVar3.u(hourlyForecast);
            s7rVar3.f0(e9rVar3);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar3, false, (OnSyncCallback) null, 0, 16, (Object) null);
        }
    }

    private final void handleWeatherPressure(String did, float pressure) {
        Logger.i("BlueToothSender", "SET_PRESSURE handleWeatherPressure to device  pressure = " + pressure);
        s7r s7rVar = new s7r();
        s7rVar.e = 10;
        s7rVar.f = 4;
        e9r e9rVar = new e9r();
        e9rVar.w(pressure);
        s7rVar.f0(e9rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
    }

    public final void clearCalendar(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 12;
        s7rVar.f = 1;
        z93 z93Var = new z93();
        aa3.a aVar = new aa3.a();
        aVar.d = true;
        z93Var.p(aVar);
        s7rVar.O(z93Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.BlueToothSender.clearCalendar.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                Logger.i("BlueToothSender", "clearCalendar fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                Logger.i("BlueToothSender", "clearCalendar success");
            }
        }, 0, 16, (Object) null);
    }

    public final void deleteStockSymbol(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        if (mStockSymbolList != null) {
            zgo.a aVar = mStockSymbolList;
            Intrinsics.checkNotNull(aVar);
            if (aVar.c != null) {
                ArrayList arrayList = new ArrayList();
                zgo.a aVar2 = mStockSymbolList;
                Intrinsics.checkNotNull(aVar2);
                Iterator it = ArrayIteratorKt.iterator(aVar2.c);
                while (it.hasNext()) {
                    zgo zgoVar = (zgo) it.next();
                    if (!Intrinsics.areEqual(zgoVar.c, symbol)) {
                        Intrinsics.checkNotNull(zgoVar);
                        arrayList.add(zgoVar);
                    }
                }
                zgo.a aVar3 = mStockSymbolList;
                Intrinsics.checkNotNull(aVar3);
                aVar3.c = (zgo[]) arrayList.toArray(new zgo[0]);
            }
        }
    }

    @NotNull
    public final o4h<List<zgo>> getStockSymbolList(@NotNull final String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        o4h<List<zgo>> o4hVarH = o4h.f(new j5h() { // from class: z13
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                BlueToothSender.getStockSymbolList$lambda$0(did, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c());
        Intrinsics.checkNotNullExpressionValue(o4hVarH, "observeOn(...)");
        return o4hVarH;
    }

    public final void handleCalendar(@NotNull String did, @Nullable aa3.a list, @Nullable final eu6<Boolean> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 12;
        s7rVar.f = 1;
        z93 z93Var = new z93();
        z93Var.p(list);
        s7rVar.O(z93Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.BlueToothSender.handleCalendar.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                eu6<Boolean> eu6Var = callBack;
                if (eu6Var != null) {
                    eu6Var.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                eu6<Boolean> eu6Var = callBack;
                if (eu6Var != null) {
                    eu6Var.onResult(Boolean.TRUE);
                }
            }
        }, 0, 16, (Object) null);
    }

    public final void handleStockInfo(@NotNull String did, @Nullable ygo.a list) {
        Intrinsics.checkNotNullParameter(did, "did");
        s7r s7rVar = new s7r();
        s7rVar.e = 11;
        s7rVar.f = 1;
        xgo xgoVar = new xgo();
        xgoVar.r(list);
        s7rVar.b0(xgoVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, (OnSyncCallback) null, 0, 16, (Object) null);
    }

    public final void postLocation(@NotNull String did, double altitude, double latitude, double longitude, @NotNull final MyAction1<Boolean> callback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null) {
            callback.call(Boolean.TRUE);
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 16;
        s7rVar.f = 2;
        y0b y0bVar = new y0b();
        y0bVar.f = altitude;
        y0bVar.e = latitude;
        y0bVar.d = longitude;
        y0bVar.c = (int) (System.currentTimeMillis() / 1000);
        String tag = SyncEngine.INSTANCE.getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        Logger.d(tag, "postLocation: al = " + altitude + "; la = " + latitude + ";  lo = " + longitude);
        x0b x0bVar = new x0b();
        x0bVar.r(y0bVar);
        s7rVar.T(x0bVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.BlueToothSender.postLocation.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did2, int type, int code) {
                callback.call(Boolean.FALSE);
                String tag2 = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
                Logger.i(tag2, "syncLocationToDevice: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did2, int type, SyncResult result) {
                callback.call(Boolean.TRUE);
                String tag2 = SyncEngine.INSTANCE.getTAG();
                Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
                Logger.d(tag2, "syncLocationToDevice: success");
            }
        }, 0, 16, (Object) null);
    }

    public final void setStockSymbolList(@Nullable zgo.a stockSymbolList) {
        if (stockSymbolList != null) {
            mStockSymbolList = stockSymbolList;
        }
    }

    public final void syncTime() {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 3;
        txo txoVar = new txo();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(2) + 1;
        n64 n64Var = new n64();
        n64Var.c = calendar.get(1);
        n64Var.d = i;
        n64Var.e = calendar.get(5);
        t64 t64Var = new t64();
        t64Var.c = calendar.get(11);
        t64Var.d = calendar.get(12);
        t64Var.e = calendar.get(13);
        t64Var.f = calendar.get(14);
        v64 v64Var = new v64();
        v64Var.c = ((calendar.get(15) / 1000) / 60) / 15;
        v64Var.d = ((calendar.get(16) / 1000) / 60) / 15;
        v64Var.e = TimeZone.getDefault().getID();
        wxo wxoVar = new wxo();
        wxoVar.c = n64Var;
        wxoVar.d = t64Var;
        wxoVar.e = v64Var;
        wxoVar.f = TimeDateUtil.INSTANCE.is12HourFormat(ApplicationExtKt.getApplication());
        txoVar.o0(wxoVar);
        s7rVar.c0(txoVar);
        n64 n64Var2 = wxoVar.c;
        int i2 = n64Var2.c;
        int i3 = n64Var2.d;
        int i4 = n64Var2.e;
        t64 t64Var2 = wxoVar.d;
        Logger.i("BlueToothSender", "syncTime SET_SYSTEM_TIME:" + i2 + "-" + i3 + "-" + i4 + "," + t64Var2.c + ":" + t64Var2.d + ":" + t64Var2.e + " tz:" + wxoVar.e);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.sync.util.BlueToothSender.syncTime.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
            }
        }, 0, 8, null);
    }

    public final void handleWeather(@NotNull String did, @NotNull WeatherResp.Weather weather, boolean isCurrentLocation) {
        WearableDeviceModel wearableDeviceModel;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(weather, "weather");
        Logger.d("BlueToothSender", "handleWeather() called with: weather = [" + weather + "]");
        h9r h9rVar = new h9r();
        SyncUtil syncUtil = SyncUtil.INSTANCE;
        h9rVar.f = syncUtil.getNonNullString(weather.locationKey);
        h9rVar.d = syncUtil.getNonNullString(weather.city_name);
        h9rVar.e = syncUtil.getNonNullString(weather.location_name);
        h9rVar.c = syncUtil.getNonNullString(weather.pubTime);
        h9rVar.g = isCurrentLocation;
        i9r i9rVar = new i9r();
        i9rVar.c = h9rVar;
        String weather2 = weather.weather;
        Intrinsics.checkNotNullExpressionValue(weather2, "weather");
        i9rVar.d = syncUtil.getSafeIntValue(weather2);
        i9rVar.e = getTemperature(weather);
        i9rVar.f = getHumidity(weather);
        i9rVar.g = getWindInfo(weather);
        i9rVar.h = getUvindex(weather);
        i9rVar.i = getAqi(weather);
        i9rVar.j = getAlertsList(weather);
        WeatherResp.UnitValue unitValue = weather.pressure;
        float f = 0.0f;
        if (unitValue != null) {
            if (!StringsKt__StringsJVMKt.equals("mb", unitValue.unit, true) && !StringsKt__StringsJVMKt.equals("mbar", weather.pressure.unit, true) && !StringsKt__StringsJVMKt.equals("hPa", weather.pressure.unit, true)) {
                if (StringsKt__StringsJVMKt.equals("KPa", weather.pressure.unit, true)) {
                    if (!syncUtil.isBlank(weather.pressure.value)) {
                        String value = weather.pressure.value;
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        f = Float.parseFloat(value) * 1000;
                    }
                    i9rVar.f20918k = f;
                } else if (StringsKt__StringsJVMKt.equals("MPa", weather.pressure.unit, true)) {
                    if (!syncUtil.isBlank(weather.pressure.value)) {
                        String value2 = weather.pressure.value;
                        Intrinsics.checkNotNullExpressionValue(value2, "value");
                        float f2 = 1000;
                        f = Float.parseFloat(value2) * f2 * f2;
                    }
                    i9rVar.f20918k = f;
                } else if (StringsKt__StringsJVMKt.equals("Pa", weather.pressure.unit, true)) {
                    if (!syncUtil.isBlank(weather.pressure.value)) {
                        String value3 = weather.pressure.value;
                        Intrinsics.checkNotNullExpressionValue(value3, "value");
                        f = Float.parseFloat(value3);
                    }
                    i9rVar.f20918k = f;
                }
            } else {
                if (!syncUtil.isBlank(weather.pressure.value)) {
                    String value4 = weather.pressure.value;
                    Intrinsics.checkNotNullExpressionValue(value4, "value");
                    f = Float.parseFloat(value4) * 100;
                }
                i9rVar.f20918k = f;
            }
        }
        g9r dailyForecast = getDailyForecast(h9rVar, weather);
        g9r hourlyForecast = getHourlyForecast(h9rVar, weather);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel2 != null && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel2, "weather")) {
            WearableDeviceModel wearableDeviceModel3 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel3 == null) {
                return;
            }
            boolean zIsNeedSyncWeather = SyncPreference.INSTANCE.isNeedSyncWeather(wearableDeviceModel3.getDid());
            boolean z = isCurrentLocation && (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel()) != null && com.xiaomi.fitness.device.manager.DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.ATMO_PRESURE);
            if (z) {
                handleWeatherPressure(did, f);
            }
            Logger.i("Wearable.weather", "handleWeatherPressure = " + z + ", isNeedSyncWeather: " + zIsNeedSyncWeather);
            if (zIsNeedSyncWeather) {
                handleWeather(did, i9rVar, dailyForecast, hourlyForecast);
                return;
            }
            return;
        }
        handleWeatherPressure(did, f);
    }
}
