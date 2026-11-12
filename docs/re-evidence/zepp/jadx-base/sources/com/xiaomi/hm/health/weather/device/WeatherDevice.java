package com.xiaomi.hm.health.weather.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u001f\b&\u0018\u0000 D2\u00020\u0001:\u0001DB\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010%\u001a\u00020\u0005¢\u0006\u0004\bB\u0010CJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\u00020\u00058\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070&8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0012\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010$\"\u0004\b<\u0010=R$\u0010A\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010-\u001a\u0004\b?\u0010/\"\u0004\b@\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/xiaomi/hm/health/weather/device/WeatherDevice;", "Lcom/xiaomi/hm/health/weather/device/IWeatherDevice;", "", PointCategory.INIT, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "loadProtocolVersion", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "city", "", "updateLocateCity", "", "loadCityList", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "loadWeatherSetting", "alert", "setAlert", "getTempUnit", "tempUnit", "setTempUnit", "deleteCity", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "a", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "getModule$devicex_zeppRelease", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "getSettingModule$devicex_zeppRelease", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingModule", "c", LogUtil.I, "getVersion$devicex_zeppRelease", "()I", "version", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getCityList$devicex_zeppRelease", "()Ljava/util/List;", "cityList", "e", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "getLocatedCity$devicex_zeppRelease", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "setLocatedCity$devicex_zeppRelease", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;)V", "locatedCity", "f", "Z", "getAlertSwitch$devicex_zeppRelease", "()Z", "setAlertSwitch$devicex_zeppRelease", "(Z)V", "alertSwitch", "g", "getTempUnit$devicex_zeppRelease", "setTempUnit$devicex_zeppRelease", "(I)V", "h", "getDefaultCity$devicex_zeppRelease", "setDefaultCity$devicex_zeppRelease", "defaultCity", "<init>", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;I)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class WeatherDevice implements IWeatherDevice {

    @NotNull
    public static final String TAG = "WeatherDevice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeatherModule module;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SettingsModule settingModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<City> cityList = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private City locatedCity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean alertSwitch;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int tempUnit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private City defaultCity;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.device.WeatherDevice", f = "WeatherDevice.kt", i = {}, l = {47}, m = PointCategory.INIT, n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return WeatherDevice.this.init(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query version: " + WeatherDevice.this.getVersion();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<City> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList<City> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "city list size: " + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "tempUnit: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.weather.device.WeatherDevice$setTempUnit$result$1", f = "WeatherDevice.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeatherDevice.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingModule = WeatherDevice.this.getSettingModule();
                General general = new General();
                general.setTemperatureUnit(new EnumData(this.c));
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = SettingsExtsKt.write(settingModule, general, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public WeatherDevice(@NotNull WeatherModule weatherModule, @NotNull SettingsModule settingsModule, int i) {
        this.module = weatherModule;
        this.settingModule = settingsModule;
        this.version = i;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean deleteCity(@NotNull City city) {
        boolean zModifyCity = this.module.modifyCity(city, false);
        if (zModifyCity) {
            this.cityList.remove(city);
        }
        return zModifyCity;
    }

    /* JADX INFO: renamed from: getAlertSwitch$devicex_zeppRelease, reason: from getter */
    public final boolean getAlertSwitch() {
        return this.alertSwitch;
    }

    @NotNull
    public final List<City> getCityList$devicex_zeppRelease() {
        return this.cityList;
    }

    @Nullable
    /* JADX INFO: renamed from: getDefaultCity$devicex_zeppRelease, reason: from getter */
    public final City getDefaultCity() {
        return this.defaultCity;
    }

    @Nullable
    /* JADX INFO: renamed from: getLocatedCity$devicex_zeppRelease, reason: from getter */
    public final City getLocatedCity() {
        return this.locatedCity;
    }

    @NotNull
    /* JADX INFO: renamed from: getModule$devicex_zeppRelease, reason: from getter */
    public final WeatherModule getModule() {
        return this.module;
    }

    @NotNull
    /* JADX INFO: renamed from: getSettingModule$devicex_zeppRelease, reason: from getter */
    public final SettingsModule getSettingModule() {
        return this.settingModule;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public int getTempUnit() {
        return this.tempUnit;
    }

    public final int getTempUnit$devicex_zeppRelease() {
        return this.tempUnit;
    }

    /* JADX INFO: renamed from: getVersion$devicex_zeppRelease, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object init(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        WeatherDevice weatherDevice;
        EnumData temperatureUnit;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuery = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuery);
            HMLog.info(TAG, new b());
            ArrayList<City> arrayListQueryCityList = getModule().queryCityList();
            if (arrayListQueryCityList != null) {
                HMLog.info(TAG, new c(arrayListQueryCityList));
                Boxing.boxBoolean(getCityList$devicex_zeppRelease().addAll(arrayListQueryCityList));
            }
            WeatherSetting weatherSettingQueryWeatherSettings = getModule().queryWeatherSettings();
            if (weatherSettingQueryWeatherSettings != null) {
                Boolean weatherAlarmSwitch = weatherSettingQueryWeatherSettings.getWeatherAlarmSwitch();
                setAlertSwitch$devicex_zeppRelease(weatherAlarmSwitch == null ? getAlertSwitch() : weatherAlarmSwitch.booleanValue());
                setLocatedCity$devicex_zeppRelease(weatherSettingQueryWeatherSettings.getCurrentLocatedCity());
                setDefaultCity$devicex_zeppRelease(weatherSettingQueryWeatherSettings.getDefaultCity());
            }
            SettingsModule settingModule = getSettingModule();
            SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
            aVar.a = this;
            aVar.d = 1;
            objQuery = WatchSettingExtsKt.query(settingModule, settingsGroupType, false, aVar);
            if (objQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
            weatherDevice = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            weatherDevice = (WeatherDevice) aVar.a;
            ResultKt.throwOnFailure(objQuery);
        }
        Integer numBoxInt = null;
        General general = objQuery instanceof General ? (General) objQuery : null;
        if (general != null && (temperatureUnit = general.getTemperatureUnit()) != null) {
            numBoxInt = Boxing.boxInt(temperatureUnit.getValue());
        }
        weatherDevice.setTempUnit$devicex_zeppRelease(numBoxInt != null ? numBoxInt.intValue() : 0);
        HMLog.info(TAG, new d(numBoxInt));
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    @NotNull
    public List<City> loadCityList() {
        return this.cityList;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public int loadProtocolVersion() {
        return this.version;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    @NotNull
    public WeatherSetting loadWeatherSetting() {
        return new WeatherSetting(Boolean.valueOf(this.alertSwitch), this.locatedCity, this.defaultCity);
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setAlert(boolean alert) {
        boolean zUpdateWeatherSettings = this.module.updateWeatherSettings(new WeatherSetting(Boolean.valueOf(alert), null, null, 6, null));
        if (zUpdateWeatherSettings) {
            this.alertSwitch = alert;
        }
        return zUpdateWeatherSettings;
    }

    public final void setAlertSwitch$devicex_zeppRelease(boolean z) {
        this.alertSwitch = z;
    }

    public final void setDefaultCity$devicex_zeppRelease(@Nullable City city) {
        this.defaultCity = city;
    }

    public final void setLocatedCity$devicex_zeppRelease(@Nullable City city) {
        this.locatedCity = city;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean setTempUnit(int tempUnit) {
        boolean zBooleanValue = ((Boolean) kotlinx.coroutines.d.b(null, new e(tempUnit, null), 1, null)).booleanValue();
        if (zBooleanValue) {
            this.tempUnit = tempUnit;
        }
        return zBooleanValue;
    }

    public final void setTempUnit$devicex_zeppRelease(int i) {
        this.tempUnit = i;
    }

    @Override // com.xiaomi.hm.health.weather.device.IWeatherDevice
    public boolean updateLocateCity(@Nullable City city) {
        if (city == null) {
            return false;
        }
        boolean zUpdateWeatherSettings = this.module.updateWeatherSettings(new WeatherSetting(null, city, null, 5, null));
        if (zUpdateWeatherSettings) {
            this.locatedCity = city;
        }
        return zUpdateWeatherSettings;
    }
}
