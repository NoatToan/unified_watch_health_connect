package com.xiaomi.hm.health.locweather;

import android.location.Location;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.base.model.Support;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.locweather.bean.AlertInfoBean;
import com.xiaomi.hm.health.locweather.bean.CityInfoBean;
import com.xiaomi.hm.health.locweather.encrypt.EncryptImpl;
import com.xiaomi.hm.health.locweather.huami_weather_bean.Change;
import com.xiaomi.hm.health.locweather.huami_weather_bean.CurrentWeatherModel;
import com.xiaomi.hm.health.locweather.huami_weather_bean.ForecastWeatherInfoBean;
import com.xiaomi.hm.health.locweather.huami_weather_bean.RealtimeWeatherInfoBean;
import com.xiaomi.hm.health.locweather.model.AlertInfo;
import com.xiaomi.hm.health.locweather.model.AqiInfo;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.ForecastWeatherInfo;
import com.xiaomi.hm.health.locweather.model.RealtimeWeatherInfo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\u001a\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u001a6\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u001a\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a2\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u001a8\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002\u001a\f\u0010\u001f\u001a\u00020\u001b*\u0004\u0018\u00010\u001e\"\u0016\u0010!\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010 \"\u0016\u0010#\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0016\u0010%\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 \"\u0016\u0010'\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 \"\u0016\u0010)\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 \"\u0016\u0010+\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010 \"\u0016\u0010-\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 \"\u0016\u0010/\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010 \"\u0016\u00101\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010 \"\u0016\u00103\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010 \"\u0016\u00105\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010 \"\u0016\u00107\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010 \"\u0016\u00109\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010 \"\u0016\u0010;\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010 \"\u0016\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010=\"\u0016\u0010>\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010 \"\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010=¨\u0006A"}, d2 = {"", "name", "", "source", "", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "searchCities", "Landroid/location/Location;", "loc", "cachedInfo", "getCityInfo", "locKey", "day", "Lcom/xiaomi/hm/health/locweather/model/ForecastWeatherInfo;", "cachedInfos", "getForecastWeather", "Lcom/xiaomi/hm/health/locweather/model/AlertInfo;", "getAlert", "Lcom/xiaomi/hm/health/locweather/model/RealtimeWeatherInfo;", "cachedRealTimeInfo", "Lcom/xiaomi/hm/health/locweather/model/AqiInfo;", "cachedAqiInfo", "", "getWeatherRealtime", "url", "", "params", "", "needRetry", "a", "Lcom/xiaomi/hm/health/locweather/bean/CityInfoBean;", "valid", "Ljava/lang/String;", "URL_CITY", "b", "URL_CURRENT", "c", "URL_ALERT", GoogleApiAvailabilityLight.a, "URL_FORECAST", "e", "KEY_LATITUDE", "f", "KEY_LONGITUDE", "g", "KEY_NAME", "h", "KEY_LOCALE", "i", "KEY_IS_GLOBAL", z.j, "KEY_LOCATION_KEY", hl.k, "KEY_DAYS", "l", "KEY_SOURCE", "m", "VALUE_TYPE_XIAOMI", GoogleApiAvailabilityLight.b, "TAG", "SOURCE_INVALID", LogUtil.I, "FLAG_LIMITED", "o", "CODE_LIMITED", "locweather_release"}, k = 2, mv = {1, 5, 1})
public final class WeatherAPINewKt {

    @NotNull
    public static final String FLAG_LIMITED = "limited";
    public static final int SOURCE_INVALID = -1;

    @NotNull
    private static final String a = "city/search";

    @NotNull
    private static final String b = "weather/current";

    @NotNull
    private static final String c = "weather/alerts";

    @NotNull
    private static final String d = "weather/forecast";

    @NotNull
    private static final String e = "latitude";

    @NotNull
    private static final String f = "longitude";

    @NotNull
    private static final String g = "name";

    @NotNull
    private static final String h = "locale";

    @NotNull
    private static final String i = "isGlobal";

    @NotNull
    private static final String j = "locationKey";

    @NotNull
    private static final String k = "days";

    @NotNull
    private static final String l = "deviceSource";

    @NotNull
    private static final String m = "xiaomi";

    @NotNull
    private static final String n = "WeatherAPINew";
    private static final int o = 412;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getWeatherAlerts:", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getCity: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("result: ", new EncryptImpl().encrypt(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getWeatherForecast:", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse aqi: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse pm25: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse pm10: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getWeatherRealtime:", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "city name blank";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getCity: ", this.a);
        }
    }

    private static final String a(final String str, Map<String, ? extends Object> map, int i2, boolean z) {
        ((HashMap) map).put("deviceSource", Integer.valueOf(i2));
        final StringBuilder sb = new StringBuilder();
        HMLog.i(n, Intrinsics.stringPlus("请求了接口！: ", str), new Object[0]);
        HMWebUtil.doRequest(str, map, Support.RequestSupport.GET, true, new IHMBasicHttpResponseHandler() { // from class: com.xiaomi.hm.health.locweather.WeatherAPINewKt$getResponseFromServer$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ int b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String str, int i) {
                    super(0);
                    this.a = str;
                    this.b = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "url: " + this.a + ", onError, type: " + this.b;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String str) {
                    super(0);
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "url: " + this.a + ", onCompleted";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ Throwable b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(String str, Throwable th) {
                    super(0);
                    this.a = str;
                    this.b = th;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "url: " + this.a + ", onError, e: " + ((Object) this.b.getMessage());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ HMHttpResponseData b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(String str, HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = str;
                    this.b = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "url: " + this.a + ", onFailure, statusCode: " + this.b.getStatusCode();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ HMHttpResponseData b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String str, HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = str;
                    this.b = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "onSuccess, url: " + this.a + ", statusCode: " + this.b.getStatusCode();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function0<String> {
                public final /* synthetic */ HMHttpResponseData a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(HMHttpResponseData hMHttpResponseData) {
                    super(0);
                    this.a = hMHttpResponseData;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("response: ", this.a.getResponseString());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class g extends Lambda implements Function0<String> {
                public final /* synthetic */ Exception a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(Exception exc) {
                    super(0);
                    this.a = exc;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("exception: ", this.a.getMessage());
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCancel(int type) {
                HMLog.info("WeatherAPINew", new a(str, type));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onCompleted() {
                HMLog.info("WeatherAPINew", new b(str));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onError(@NotNull Throwable throwable) {
                HMLog.info("WeatherAPINew", new c(str, throwable));
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onFailure(@NotNull HMHttpResponseData item) {
                Analytics.recordEvent(new CountEventBuilder(com.xiaomi.hm.health.locweather.c.v).setValue(String.valueOf(item.getStatusCode())));
                HMLog.info("WeatherAPINew", new d(str, item));
                if (item.getStatusCode() == 412) {
                    sb.append(WeatherAPINewKt.FLAG_LIMITED);
                }
            }

            @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
            public void onSuccess(@NotNull HMHttpResponseData item) {
                HMLog.info("WeatherAPINew", new e(str, item));
                if (item.getStatusCode() != 200) {
                    Analytics.recordEvent(new CountEventBuilder(com.xiaomi.hm.health.locweather.c.v).setValue(String.valueOf(item.getStatusCode())));
                }
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "city/search", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "weather/alerts", false, 2, (Object) null)) {
                    HMLog.info("WeatherAPINew", new f(item));
                }
                try {
                    sb.append(new String(item.getResponseBody(), Charsets.UTF_8));
                } catch (Exception e2) {
                    HMLog.info("WeatherAPINew", new g(e2));
                }
            }
        });
        return sb.toString();
    }

    public static /* synthetic */ String b(String str, Map map, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        return a(str, map, i2, z);
    }

    @Nullable
    public static final List<AlertInfo> getAlert(@NotNull String str, int i2) {
        if (!LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            return WeatherAPI.e(str, ConfigurationHolder.a());
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(j, str);
        systemParams.put("locale", LocWeatherKeeper.getCurrLanguage());
        systemParams.put(i, Boolean.valueOf(LocWeatherManager.getInstance().k().isGlobal()));
        String strB = b(HMServerDef.getUrl(c), systemParams, i2, false, 8, null);
        if (strB.length() == 0) {
            return null;
        }
        try {
            AlertInfoBean alertInfoBean = (AlertInfoBean) new Gson().fromJson(strB, AlertInfoBean.class);
            if (alertInfoBean != null && alertInfoBean.getAlerts() != null && alertInfoBean.getAlerts().size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (AlertInfoBean.AlertsBean alertsBean : alertInfoBean.getAlerts()) {
                    AlertInfo alertInfo = new AlertInfo();
                    alertInfo.setPubTime(Calendar.getInstance());
                    alertInfo.setAlertId(alertsBean.getAlertId());
                    alertInfo.setDetail(alertsBean.getDetail());
                    alertInfo.setLevel(alertsBean.getLevel());
                    alertInfo.setType(alertsBean.getType());
                    alertInfo.setTitle(alertsBean.getTitle());
                    alertInfo.setSuccess(true);
                    arrayList.add(alertInfo);
                }
                return arrayList;
            }
            return null;
        } catch (Exception e2) {
            HMLog.info(n, new a(e2));
            return null;
        }
    }

    @Nullable
    public static final CityInfo getCityInfo(@NotNull Location location, int i2, @Nullable CityInfo cityInfo) {
        String name;
        if (!LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            return WeatherAPI.c(location);
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("latitude", String.valueOf(location.getLatitude()));
        systemParams.put("longitude", String.valueOf(location.getLongitude()));
        systemParams.put("locale", LocWeatherKeeper.getCurrLanguage());
        systemParams.put(i, Boolean.valueOf(LocWeatherManager.getInstance().k().isGlobal()));
        String strB = b(HMServerDef.getUrl(a), systemParams, i2, false, 8, null);
        if (TextUtils.equals(strB, FLAG_LIMITED)) {
            return cityInfo;
        }
        CityInfo cityInfo2 = null;
        try {
            CityInfoBean[] cityInfoBeanArr = (CityInfoBean[]) new Gson().fromJson(strB, CityInfoBean[].class);
            if (cityInfoBeanArr == null) {
                return null;
            }
            if (cityInfoBeanArr.length == 0) {
                return null;
            }
            CityInfoBean cityInfoBean = cityInfoBeanArr[0];
            if (valid(cityInfoBean)) {
                cityInfo2 = WeatherAPI.toCityInfo(cityInfoBean);
            }
        } catch (Exception e2) {
            HMLog.info(n, new b(e2));
        }
        if (cityInfo2 != null && (name = cityInfo2.getName()) != null) {
            HMLog.info(n, new c(name));
        }
        return cityInfo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final List<ForecastWeatherInfo> getForecastWeather(@NotNull String str, int i2, int i3, @Nullable List<? extends ForecastWeatherInfo> list) {
        Calendar pubTime;
        if (!LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            return WeatherAPI.d(str, ConfigurationHolder.a(), i2);
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(j, str);
        systemParams.put("locale", com.xiaomi.hm.health.locweather.c.c());
        systemParams.put(i, Boolean.valueOf(LocWeatherManager.getInstance().k().isGlobal()));
        systemParams.put("days", Integer.valueOf(i2));
        String strB = b(HMServerDef.getUrl(d), systemParams, i3, false, 8, null);
        boolean z = true;
        int i4 = 0;
        if (strB.length() == 0) {
            return null;
        }
        if (TextUtils.equals(strB, FLAG_LIMITED)) {
            if (list != 0 && !list.isEmpty()) {
                z = false;
            }
            if (!z && (pubTime = ((ForecastWeatherInfo) list.get(0)).getPubTime()) != null) {
                pubTime.setTimeInMillis(System.currentTimeMillis() - ((long) 600000));
            }
            return list;
        }
        try {
            ForecastWeatherInfoBean forecastWeatherInfoBean = (ForecastWeatherInfoBean) new Gson().fromJson(strB, ForecastWeatherInfoBean.class);
            if (forecastWeatherInfoBean == null) {
                return null;
            }
            List<Change> value = forecastWeatherInfoBean.getWeather().getValue();
            List<Change> value2 = forecastWeatherInfoBean.getTemperature().getValue();
            List<Change> value3 = forecastWeatherInfoBean.getSunRiseSet().getValue();
            if (value != null && !value.isEmpty() && value2 != null && !value2.isEmpty() && value3 != null && !value3.isEmpty() && value.size() == value2.size()) {
                int size = value.size();
                if (size <= i2) {
                    i2 = size;
                }
                ArrayList arrayList = new ArrayList();
                Calendar calendar = Calendar.getInstance();
                if (i2 > 0) {
                    while (true) {
                        int i5 = i4 + 1;
                        ForecastWeatherInfo forecastWeatherInfo = new ForecastWeatherInfo();
                        forecastWeatherInfo.setPubTime(calendar);
                        if (calendar != null) {
                            Calendar calendar2 = (Calendar) calendar.clone();
                            calendar2.add(5, i4);
                            forecastWeatherInfo.setDate(calendar2);
                        }
                        Change change = value.get(i4);
                        Change change2 = value2.get(i4);
                        Change change3 = value3.get(i4);
                        forecastWeatherInfo.setWeatherFrom(Integer.parseInt(change.getFrom()));
                        forecastWeatherInfo.setWeatherTo(Integer.parseInt(change.getTo()));
                        forecastWeatherInfo.setTemperatureFrom(Integer.parseInt(change2.getFrom()));
                        forecastWeatherInfo.setTemperatureTo(Integer.parseInt(change2.getTo()));
                        forecastWeatherInfo.setTemperatureUnit(forecastWeatherInfoBean.getTemperature().getUnit());
                        forecastWeatherInfo.setSunriseTime(WeatherAPI.parsePubTime(change3.getFrom()));
                        forecastWeatherInfo.setSunsetTime(WeatherAPI.parsePubTime(change3.getTo()));
                        forecastWeatherInfo.setSuccess(true);
                        forecastWeatherInfo.setLastUpdateTime(System.currentTimeMillis());
                        arrayList.add(forecastWeatherInfo);
                        if (i5 >= i2) {
                            break;
                        }
                        i4 = i5;
                    }
                }
                return arrayList;
            }
            return null;
        } catch (Exception e2) {
            HMLog.info(n, new d(e2));
            return null;
        }
    }

    @Nullable
    public static final List<Object> getWeatherRealtime(@NotNull String str, int i2, @Nullable RealtimeWeatherInfo realtimeWeatherInfo, @Nullable AqiInfo aqiInfo) {
        int i3;
        int i4;
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put(j, str);
        systemParams.put("locale", com.xiaomi.hm.health.locweather.c.c());
        systemParams.put(i, Boolean.valueOf(LocWeatherManager.getInstance().k().isGlobal()));
        String strB = b(HMServerDef.getUrl(b), systemParams, i2, false, 8, null);
        if (strB.length() == 0) {
            return null;
        }
        if (TextUtils.equals(strB, FLAG_LIMITED) && realtimeWeatherInfo != null && aqiInfo != null) {
            Calendar pubTime = realtimeWeatherInfo.getPubTime();
            if (pubTime != null) {
                pubTime.setTimeInMillis(System.currentTimeMillis() - ((long) 600000));
            }
            return CollectionsKt__CollectionsKt.arrayListOf(realtimeWeatherInfo, aqiInfo);
        }
        try {
            RealtimeWeatherInfoBean realtimeWeatherInfoBean = (RealtimeWeatherInfoBean) new Gson().fromJson(strB, RealtimeWeatherInfoBean.class);
            if (realtimeWeatherInfoBean == null) {
                return null;
            }
            CurrentWeatherModel currentWeatherModel = realtimeWeatherInfoBean.getCurrentWeatherModel();
            if ((currentWeatherModel == null ? null : currentWeatherModel.getTemperature()) != null && currentWeatherModel.getWeather() != null) {
                String unit = currentWeatherModel.getTemperature().getUnit();
                int i5 = Integer.parseInt(currentWeatherModel.getTemperature().getValue());
                int i6 = Integer.parseInt(currentWeatherModel.getWeather());
                float f2 = Float.parseFloat(currentWeatherModel.getHumidity().getValue());
                float f3 = Float.parseFloat(currentWeatherModel.getWind().getSpeed().getValue());
                float f4 = Float.parseFloat(currentWeatherModel.getWind().getDirection().getValue());
                int i7 = -1;
                int i8 = !TextUtils.isEmpty(currentWeatherModel.getUvIndex()) ? Integer.parseInt(currentWeatherModel.getUvIndex()) : -1;
                Calendar calendar = Calendar.getInstance();
                RealtimeWeatherInfo realtimeWeatherInfo2 = new RealtimeWeatherInfo();
                realtimeWeatherInfo2.setPubTime(calendar);
                realtimeWeatherInfo2.setCurrentWeather(i6);
                realtimeWeatherInfo2.setCurrentTemperature(i5);
                realtimeWeatherInfo2.setCurrentTemperatureUnit(unit);
                realtimeWeatherInfo2.setDate(calendar);
                realtimeWeatherInfo2.setHumidity(f2);
                realtimeWeatherInfo2.setWindSpeed(f3);
                realtimeWeatherInfo2.setWindDirection(f4);
                realtimeWeatherInfo2.setUvi(i8);
                realtimeWeatherInfo2.setSuccess(true);
                try {
                    i3 = Integer.parseInt(realtimeWeatherInfoBean.getAqiModel().getAqi());
                } catch (Exception e2) {
                    HMLog.info(n, new e(e2));
                    i3 = -1;
                }
                AqiInfo aqiInfo2 = new AqiInfo();
                aqiInfo2.setAqi(i3);
                aqiInfo2.setPubTime(calendar);
                aqiInfo2.setSuccess(true);
                try {
                    i4 = Integer.parseInt(realtimeWeatherInfoBean.getAqiModel().getPm25());
                } catch (Exception e3) {
                    HMLog.info(n, new f(e3));
                    i4 = -1;
                }
                try {
                    i7 = Integer.parseInt(realtimeWeatherInfoBean.getAqiModel().getPm10());
                } catch (Exception e4) {
                    HMLog.info(n, new g(e4));
                }
                realtimeWeatherInfo2.setPm25(i4);
                realtimeWeatherInfo2.setPm10(i7);
                return CollectionsKt__CollectionsKt.arrayListOf(realtimeWeatherInfo2, aqiInfo2);
            }
            return null;
        } catch (Exception e5) {
            HMLog.info(n, new h(e5));
            return null;
        }
    }

    @Nullable
    public static final List<CityInfo> searchCities(@NotNull String str, int i2) {
        if (HMWeatherUpdater.isBlank(str)) {
            HMLog.info(n, i.a);
            return null;
        }
        if (!LocWeatherManager.getInstance().k().isSupportHuamiWeatherService()) {
            return WeatherAPI.j(str);
        }
        Map<String, Object> systemParams = HMWebUtil.getSystemParams();
        systemParams.put("name", str);
        systemParams.put("locale", LocWeatherKeeper.getCurrLanguage());
        systemParams.put(i, Boolean.valueOf(LocWeatherManager.getInstance().k().isGlobal()));
        String strB = b(HMServerDef.getUrl(a), systemParams, i2, false, 8, null);
        ArrayList arrayList = new ArrayList();
        try {
            CityInfoBean[] cityInfoBeanArr = (CityInfoBean[]) new Gson().fromJson(strB, CityInfoBean[].class);
            if (cityInfoBeanArr == null) {
                return null;
            }
            if (cityInfoBeanArr.length == 0) {
                return null;
            }
            for (CityInfoBean cityInfoBean : cityInfoBeanArr) {
                if (valid(cityInfoBean)) {
                    arrayList.add(WeatherAPI.toCityInfo(cityInfoBean));
                }
            }
        } catch (Exception e2) {
            HMLog.info(n, new j(e2));
        }
        return arrayList;
    }

    public static final boolean valid(@Nullable CityInfoBean cityInfoBean) {
        if (cityInfoBean != null) {
            String affiliation = cityInfoBean.getAffiliation();
            if (affiliation == null || affiliation.length() == 0) {
                cityInfoBean.setAffiliation("");
            }
        }
        if (cityInfoBean != null) {
            String latitude = cityInfoBean.getLatitude();
            if (!(latitude == null || m.isBlank(latitude))) {
                String longitude = cityInfoBean.getLongitude();
                if (!(longitude == null || m.isBlank(longitude))) {
                    String name = cityInfoBean.getName();
                    if (!(name == null || m.isBlank(name))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
