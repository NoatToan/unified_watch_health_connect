package com.xiaomi.hm.health.weather.viewmodel;

import android.app.Application;
import android.content.Context;
import androidx.annotation.WorkerThread;
import androidx.p008lifecycle.AndroidViewModel;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.utils.SingleLiveEvent;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.weather.device.WeatherDeviceDelegate;
import com.xiaomi.hm.health.weather.model.WeatherSettingVo;
import com.xiaomi.hm.health.weather.model.WeatherVo;
import com.xiaomi.hm.health.weather.other.WeatherItemType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001(B\u000f\u0012\u0006\u0010,\u001a\u00020'¢\u0006\u0004\bW\u0010XJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0003J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\u0013\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0003J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u001a\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\u000fJ\u0016\u0010&\u001a\u00020$2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$R\u0019\u0010,\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R%\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060-8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001f\u00104\u001a\b\u0012\u0004\u0012\u00020\n0-8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010/\u001a\u0004\b3\u00101R\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u00101R\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u00101R\u001f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0;8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\bA\u00101R\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\bC\u00101R\u001d\u0010H\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\b8\u0010GR\u001d\u0010K\u001a\u00020I8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010F\u001a\u0004\b.\u0010JR\u001f\u0010N\u001a\u0004\u0018\u00010L8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\b<\u0010MR\u001f\u0010S\u001a\u0004\u0018\u00010O8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010F\u001a\u0004\bQ\u0010RR\u001d\u0010V\u001a\u00020T8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\b(\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Y"}, d2 = {"Lcom/xiaomi/hm/health/weather/viewmodel/WeatherViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "i", "m", "", "Lcom/xiaomi/hm/health/weather/model/WeatherVo;", "h", "o", "Lcom/xiaomi/hm/health/weather/model/WeatherSettingVo;", z.j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "g", "weatherVo", GoogleApiAvailabilityLight.b, "", "c", "selectType", hl.k, "updateCity", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "cityInfo", "addCity", "alert", "setAlert", "tempUnit", "setTempUnit", "deleteCity", "setDefaultCity", "supportDefaultCity", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "cityName", "getCurrentCityTitle", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getCityListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "cityListLiveData", "getWeatherSettingLiveData", "weatherSettingLiveData", GoogleApiAvailabilityLight.a, "getLoadingLiveData", "loadingLiveData", "e", "getDeleteCityResultLiveData", "deleteCityResultLiveData", "Lcom/huami/account/utils/SingleLiveEvent;", "f", "Lcom/huami/account/utils/SingleLiveEvent;", "getAddCityResultLiveData", "()Lcom/huami/account/utils/SingleLiveEvent;", "addCityResultLiveData", "getModifyDefaultCityLiveData", "modifyDefaultCityLiveData", "getAlertVisibleLiveData", "alertVisibleLiveData", "Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "weatherHandler", "Lcom/huami/devicex/manager/DeviceManagerApi;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManager", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "weatherModule", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "l", "getSettingsModule", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/xiaomi/hm/health/weather/device/WeatherDeviceDelegate;", "()Lcom/xiaomi/hm/health/weather/device/WeatherDeviceDelegate;", "deviceDelegate", "<init>", "(Landroid/app/Application;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherViewModel extends AndroidViewModel implements KoinComponentAdapter {

    @NotNull
    private static final a n = new a(null);

    @Deprecated
    @NotNull
    private static final String o = "WeatherViewModel";

    @Deprecated
    private static final int p = 2;

    @Deprecated
    @NotNull
    private static final String q = "weather_user_select_region_";

    @Deprecated
    @NotNull
    private static final String r = "user_select_type";

    @Deprecated
    private static final int s = -1;

    @Deprecated
    private static final int t = 0;

    @Deprecated
    private static final int u = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<WeatherVo>> cityListLiveData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<WeatherSettingVo> weatherSettingLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> loadingLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deleteCityResultLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final SingleLiveEvent<Boolean> addCityResultLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> modifyDefaultCityLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> alertVisibleLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherModule;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingsModule;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/weather/viewmodel/WeatherViewModel$a", "", "", "KEY_USER_SELECT", "Ljava/lang/String;", "", "SELECT_TYPE_CITY_LIST", LogUtil.I, "SELECT_TYPE_CURRENT_LOCATE", "SELECT_TYPE_NONE", "SP", "TAG", "WEATHER_PROTOCOL_VERSION_2", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel$addCity$1", f = "WeatherViewModel.kt", i = {0}, l = {136}, m = "invokeSuspend", n = {"result"}, s = {"Z$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public boolean a;
        public int b;
        public final /* synthetic */ CityInfo c;
        public final /* synthetic */ WeatherViewModel d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "set city info is null!!";
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1042b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1042b(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "add city result: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CityInfo cityInfo, WeatherViewModel weatherViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = cityInfo;
            this.d = weatherViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zAddCity;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.c == null) {
                    HMLog.info(WeatherViewModel.o, a.a);
                    this.d.getAddCityResultLiveData().postValue(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                zAddCity = this.d.a().addCity(new City(this.c.getLocationKey(), this.c.getName()));
                HMLog.info(WeatherViewModel.o, new C1042b(zAddCity));
                if (zAddCity) {
                    WeatherViewModel weatherViewModel = this.d;
                    this.a = zAddCity;
                    this.b = 1;
                    Object objJ = weatherViewModel.j(this);
                    if (objJ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zAddCity;
                    obj = objJ;
                }
                this.d.getAddCityResultLiveData().postValue(Boxing.boxBoolean(zAddCity));
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.a;
            ResultKt.throwOnFailure(obj);
            this.d.getWeatherSettingLiveData().postValue((WeatherSettingVo) obj);
            this.d.m();
            zAddCity = z;
            this.d.getAddCityResultLiveData().postValue(Boxing.boxBoolean(zAddCity));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/weather/device/WeatherDeviceDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<WeatherDeviceDelegate> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeatherDeviceDelegate invoke() {
            return new WeatherDeviceDelegate(WeatherViewModel.this.f(), WeatherViewModel.this.getSettingsModule());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tempUnit: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<SettingsModule> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingsModule invoke() {
            HMBaseDevice device = WeatherViewModel.this.b().getDevice(HMDeviceType.MILI);
            if (device == null) {
                return null;
            }
            return (SettingsModule) device.getChannelModule(SettingsModule.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel$updateCity$1", f = "WeatherViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ City c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "update located city result: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(City city, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = city;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeatherViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean zUpdateLocateCity = WeatherViewModel.this.a().updateLocateCity(this.c);
            HMLog.info(WeatherViewModel.o, new a(zUpdateLocateCity));
            if (zUpdateLocateCity) {
                WeatherViewModel.this.m();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "update default city result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<WeatherModule> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeatherModule invoke() {
            HMBaseDevice device = WeatherViewModel.this.b().getDevice(HMDeviceType.MILI);
            if (device == null) {
                return null;
            }
            return (WeatherModule) device.getChannelModule(WeatherModule.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeatherViewModel(@NotNull Application application) {
        super(application);
        this.app = application;
        this.cityListLiveData = new MutableLiveData<>();
        this.weatherSettingLiveData = new MutableLiveData<>();
        this.loadingLiveData = new MutableLiveData<>();
        this.deleteCityResultLiveData = new SingleLiveEvent();
        this.addCityResultLiveData = new SingleLiveEvent<>();
        this.modifyDefaultCityLiveData = new MutableLiveData<>();
        this.alertVisibleLiveData = new MutableLiveData<>();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.weatherHandler = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IZeppOSWeatherHandler>() { // from class: com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IZeppOSWeatherHandler invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IZeppOSWeatherHandler.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.weather.viewmodel.WeatherViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        this.weatherModule = LazyKt__LazyJVMKt.lazy(new h());
        this.settingsModule = LazyKt__LazyJVMKt.lazy(new e());
        this.deviceDelegate = LazyKt__LazyJVMKt.lazy(new c());
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$special$$inlined$safeLaunch$1(null, this), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeatherDeviceDelegate a() {
        return (WeatherDeviceDelegate) this.deviceDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManager.getValue();
    }

    private final int c() {
        long validUid = HMLoginManager.getValidUid();
        return this.app.getSharedPreferences(q + validUid, 0).getInt(r, -1);
    }

    private final IZeppOSWeatherHandler e() {
        return (IZeppOSWeatherHandler) this.weatherHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeatherModule f() {
        return (WeatherModule) this.weatherModule.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(City city) {
        if (e().supportLocation()) {
            return a().deleteCity(city);
        }
        if (!Intrinsics.areEqual(city, a().loadWeatherSetting().getCurrentLocatedCity())) {
            return a().deleteCity(city);
        }
        List<City> listLoadCityList = a().loadCityList();
        return listLoadCityList.isEmpty() ? a().updateLocateCity(new City("", "")) : a().updateLocateCity((City) CollectionsKt.first((List) listLoadCityList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsModule getSettingsModule() {
        return (SettingsModule) this.settingsModule.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    @WorkerThread
    private final List<WeatherVo> h() {
        Object obj;
        Object next;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WeatherVo(WeatherItemType.CITY_TITLE, "", "", false, 8, null));
        int iC = c();
        WeatherVo weatherVoO = o();
        if (weatherVoO != null) {
            arrayList.add(weatherVoO);
        }
        for (City city : a().loadCityList()) {
            arrayList.add(new WeatherVo(WeatherItemType.CITY_LIST, city.getName(), city.getLocationKey(), false, 8, null));
        }
        City defaultCity = a().loadWeatherSetting().getDefaultCity();
        Iterator it2 = arrayList.iterator();
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            WeatherVo weatherVo = (WeatherVo) next;
            if (weatherVo.getType() != WeatherItemType.LOCATED_CITY) {
                z2 = false;
            } else if (Intrinsics.areEqual(weatherVo.getLocationKey(), defaultCity == null ? null : defaultCity.getLocationKey())) {
                z2 = true;
            } else {
                z2 = false;
            }
        } while (!z2);
        WeatherVo weatherVo2 = (WeatherVo) next;
        for (Object obj2 : arrayList) {
            WeatherVo weatherVo3 = (WeatherVo) obj2;
            if (weatherVo3.getType() != WeatherItemType.CITY_LIST) {
                z = false;
            } else if (Intrinsics.areEqual(weatherVo3.getLocationKey(), defaultCity == null ? null : defaultCity.getLocationKey())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = obj2;
                break;
            }
        }
        WeatherVo weatherVo4 = (WeatherVo) obj;
        if (weatherVo2 != null && weatherVo4 == null) {
            weatherVo2.setDefaultCity(true);
        } else if (weatherVo2 == null && weatherVo4 != null) {
            weatherVo4.setDefaultCity(true);
        } else if (iC == -1 || iC == 0) {
            if (weatherVo2 != null) {
                weatherVo2.setDefaultCity(true);
            }
        } else if (iC == 1 && weatherVo4 != null) {
            weatherVo4.setDefaultCity(true);
        }
        arrayList.add(new WeatherVo(WeatherItemType.ADD_CITY, "", "", false, 8, null));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        int iLoadProtocolVersion = a().loadProtocolVersion();
        e().setWeatherProtocolVersion(Integer.valueOf(iLoadProtocolVersion));
        this.alertVisibleLiveData.postValue(Boolean.valueOf(iLoadProtocolVersion < 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(Continuation<? super WeatherSettingVo> continuation) {
        WeatherSetting weatherSettingLoadWeatherSetting = a().loadWeatherSetting();
        int tempUnit = a().getTempUnit();
        HMLog.info(o, new d(tempUnit));
        return new WeatherSettingVo(weatherSettingLoadWeatherSetting.getWeatherAlarmSwitch(), weatherSettingLoadWeatherSetting.getDefaultCity(), weatherSettingLoadWeatherSetting.getCurrentLocatedCity(), Boxing.boxInt(tempUnit));
    }

    private final void k(int selectType) {
        long validUid = HMLoginManager.getValidUid();
        this.app.getSharedPreferences(q + validUid, 0).edit().putInt(r, selectType).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void m() {
        this.cityListLiveData.postValue(h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final boolean n(WeatherVo weatherVo) {
        boolean defaultCity = a().setDefaultCity(new City(weatherVo.getLocationKey(), weatherVo.getCity()));
        HMLog.info(o, new g(defaultCity));
        if (defaultCity) {
            k(weatherVo.getType() == WeatherItemType.LOCATED_CITY ? 0 : 1);
        }
        return defaultCity;
    }

    private final WeatherVo o() {
        String locationKey;
        City currentLocatedCity = a().loadWeatherSetting().getCurrentLocatedCity();
        if (!e().supportLocation()) {
            if (currentLocatedCity == null) {
                return null;
            }
            if (currentLocatedCity.getName().length() == 0) {
                return null;
            }
            return new WeatherVo(WeatherItemType.CITY_LIST, currentLocatedCity.getName(), currentLocatedCity.getLocationKey(), false, 8, null);
        }
        String name = currentLocatedCity == null ? null : currentLocatedCity.getName();
        String string = (name == null || m.isBlank(name)) ^ true ? name : null;
        if (string == null) {
            string = DeviceXFunctionsKt.getString(R.string.locating);
        }
        return new WeatherVo(WeatherItemType.LOCATED_CITY, string, (currentLocatedCity == null || (locationKey = currentLocatedCity.getLocationKey()) == null) ? "" : locationKey, false, 8, null);
    }

    public final void addCity(@Nullable CityInfo cityInfo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(cityInfo, this, null), 2, null);
    }

    public final void deleteCity(@NotNull WeatherVo weatherVo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$deleteCity$$inlined$safeLaunch$1(null, this, weatherVo), 2, null);
    }

    @NotNull
    public final SingleLiveEvent<Boolean> getAddCityResultLiveData() {
        return this.addCityResultLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getAlertVisibleLiveData() {
        return this.alertVisibleLiveData;
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    @NotNull
    public final MutableLiveData<List<WeatherVo>> getCityListLiveData() {
        return this.cityListLiveData;
    }

    @NotNull
    public final String getCurrentCityTitle(@NotNull Context context, @NotNull String cityName) {
        boolean zCheckPermission = DeviceXFunctionsKt.getAppStateApi().checkPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean zCheckPermission2 = DeviceXFunctionsKt.getAppStateApi().checkPermission(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zCheckPermission && !zCheckPermission2) {
            return cityName;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(DeviceXFunctionsKt.getString(R.string.huamios_weather_current_located), Arrays.copyOf(new Object[]{cityName}, 1));
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteCityResultLiveData() {
        return this.deleteCityResultLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getModifyDefaultCityLiveData() {
        return this.modifyDefaultCityLiveData;
    }

    @NotNull
    public final MutableLiveData<WeatherSettingVo> getWeatherSettingLiveData() {
        return this.weatherSettingLiveData;
    }

    public final void setAlert(boolean alert) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$setAlert$$inlined$safeLaunch$1(null, this, alert), 2, null);
    }

    public final void setDefaultCity(@NotNull WeatherVo weatherVo) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$setDefaultCity$$inlined$safeLaunch$1(null, this, weatherVo), 2, null);
    }

    public final void setTempUnit(int tempUnit) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new WeatherViewModel$setTempUnit$$inlined$safeLaunch$1(null, this, tempUnit), 2, null);
    }

    public final boolean supportDefaultCity() {
        return a().supportDefaultCity();
    }

    public final void updateCity(@Nullable City city) {
        if (Intrinsics.areEqual(a().loadWeatherSetting().getCurrentLocatedCity(), city)) {
            return;
        }
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(city, null), 2, null);
    }
}
