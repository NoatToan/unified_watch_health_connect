package com.xiaomi.hm.health.device.weather.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.weather.model.WeatherSettingVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.weather.viewmodel.WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1", f = "WeatherViewModel.kt", i = {0}, l = {25}, m = "invokeSuspend", n = {HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER}, s = {"L$0"})
public final class WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ WeatherViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1(Continuation continuation, WeatherViewModel weatherViewModel) {
        super(2, continuation);
        this.c = weatherViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1 weatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1 = new WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1(continuation, this.c);
        weatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1.b = obj;
        return weatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WeatherViewModel$loadWeatherSettingFromDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        WeatherSetting weatherSetting;
        Settings settings;
        General general;
        EnumData temperatureUnit;
        Integer numBoxInt;
        Boolean weatherAlarmSwitch;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WeatherModule weatherModule = this.c.weatherModule;
            WeatherSetting weatherSettingQueryWeatherSettings = weatherModule == null ? null : weatherModule.queryWeatherSettings();
            this.c.currCity = weatherSettingQueryWeatherSettings == null ? null : weatherSettingQueryWeatherSettings.getCurrentLocatedCity();
            SettingsModule settingsModule = this.c.settingsModule;
            if (settingsModule == null) {
                weatherSetting = weatherSettingQueryWeatherSettings;
                settings = null;
            } else {
                SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
                this.b = weatherSettingQueryWeatherSettings;
                this.a = 1;
                Object objQuery = WatchSettingExtsKt.query(settingsModule, settingsGroupType, false, this);
                if (objQuery == coroutine_suspended) {
                    return coroutine_suspended;
                }
                weatherSetting = weatherSettingQueryWeatherSettings;
                obj = objQuery;
            }
            if (settings instanceof General) {
                general = (General) settings;
            } else {
                general = null;
            }
            if (general == null && (temperatureUnit = general.getTemperatureUnit()) != null) {
                numBoxInt = Boxing.boxInt(temperatureUnit.getValue());
            } else {
                numBoxInt = null;
            }
            HMLog.info("WeatherViewModel", new WeatherViewModel.b(numBoxInt));
            MutableLiveData mutableLiveData = this.c.weatherSettingLiveData;
            if (weatherSetting == null) {
                weatherAlarmSwitch = null;
            } else {
                weatherAlarmSwitch = weatherSetting.getWeatherAlarmSwitch();
            }
            mutableLiveData.postValue(new WeatherSettingVo(weatherAlarmSwitch, weatherSetting != null ? weatherSetting.getCurrentLocatedCity() : null, numBoxInt));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        weatherSetting = (WeatherSetting) this.b;
        ResultKt.throwOnFailure(obj);
        settings = (Settings) obj;
        if (settings instanceof General) {
            general = (General) settings;
        } else {
            general = null;
        }
        if (general == null) {
            numBoxInt = null;
        } else {
            numBoxInt = Boxing.boxInt(temperatureUnit.getValue());
        }
        HMLog.info("WeatherViewModel", new WeatherViewModel.b(numBoxInt));
        MutableLiveData mutableLiveData2 = this.c.weatherSettingLiveData;
        if (weatherSetting == null) {
            weatherAlarmSwitch = null;
        } else {
            weatherAlarmSwitch = weatherSetting.getWeatherAlarmSwitch();
        }
        mutableLiveData2.postValue(new WeatherSettingVo(weatherAlarmSwitch, weatherSetting != null ? weatherSetting.getCurrentLocatedCity() : null, numBoxInt));
        return Unit.INSTANCE;
    }
}
