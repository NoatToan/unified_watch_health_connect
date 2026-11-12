package com.xiaomi.fitness.devicesettings.huami.weather;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.sync.export.SyncPreference;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.City;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting;
import defpackage.c9r;
import defpackage.e9r;
import defpackage.f9r;
import defpackage.kah;
import defpackage.s7r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 b2\u00020\u0001:\u0001bB\u0007¢\u0006\u0004\ba\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\n2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0003\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J;\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u00182\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001d\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J/\u0010,\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b,\u0010-J1\u00100\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u00020\n0.¢\u0006\u0004\b0\u00101J)\u00103\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\n¢\u0006\u0004\b5\u0010\u0011J#\u00108\u001a\u00020\n2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b8\u0010\u0016J\u0015\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u00020/¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\n2\u0006\u0010<\u001a\u00020/¢\u0006\u0004\b=\u0010;J+\u0010@\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u00062\u0014\u0010?\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020\n2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\bB\u0010\u0016J1\u0010C\u001a\u00020\n2\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\bC\u0010-J)\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u00132\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\bG\u0010\u0004J)\u0010J\u001a\u00020\n2\u0006\u0010H\u001a\u00020/2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\u00182\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\bM\u00104R\"\u0010N\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bN\u0010\u000f\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010O\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010QR*\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001d\u0010`\u001a\u0004\u0018\u00010[8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Lcom/xiaomi/fitness/settingitem/settingitem/WeatherSetting;", "getHuamiWeatherSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "queryCityList", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "", "isLocationServiceOpen", "()Z", "startLocation", "()V", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "weatherSettings", "getHuaMiWeatherSettingsForL66", "(Lkotlin/jvm/functions/Function1;)V", "weather", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "locationKey", "blePostWeatherToDevice", "(Lcom/xiaomi/fitness/sync/export/model/LocationKey;)V", "", "", "Lc9r;", "cityList", "isLocationInCityList", "(Ljava/lang/String;Ljava/util/List;)Z", "isNeedCurrentLocation", "currentLocationKey", "cityKeyList", "getBleCityList", "(ZLcom/xiaomi/fitness/sync/export/model/LocationKey;Lkotlin/jvm/functions/Function1;)V", DeviceSettingConfigKey.KEY_WEATHERSETTING, "saveWeatherSetting", "(Lcom/xiaomi/fitness/settingitem/settingitem/WeatherSetting;)V", "list", "isSuccess", "updateCityList", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "addCityKeyForBleL67", "(Lcom/xiaomi/fitness/sync/export/model/LocationKey;Lkotlin/jvm/functions/Function2;)V", "onSuccess", "removeCityKey", "(Lcom/xiaomi/fitness/sync/export/model/LocationKey;Lkotlin/jvm/functions/Function1;)V", "syncWeather", "Lf9r;", "weatherConfigCallback", "getL67BleWeatherConfig", "temp", "setBleWeatherConfig", "(I)V", "alert", "setBleWeatherConfigAlert", "city", "finalCity", "addCityForHuamiL66", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Lkotlin/jvm/functions/Function1;)V", "queryCityListForHuami", "writeCityListForHuami", "weatherSettins", "updateWeatherSettings", "(Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;Lkotlin/jvm/functions/Function1;)V", "queryWeatherSettings", "unit", "isSuc", "setWeatherTemperatureUnit", "(ILkotlin/jvm/functions/Function1;)V", "cityKey", "removeCityForHuami", "isSupportConfig", "Z", "setSupportConfig", "(Z)V", "isSupportMoreCity", "setSupportMoreCity", "Landroidx/lifecycle/MutableLiveData;", "locationInfo", "Landroidx/lifecycle/MutableLiveData;", "getLocationInfo", "()Landroidx/lifecycle/MutableLiveData;", "setLocationInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeatherSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,605:1\n37#2:606\n36#2,3:607\n*S KotlinDebug\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel\n*L\n316#1:606\n316#1:607,3\n*E\n"})
public final class WeatherSetViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "WeatherSetViewModel";
    private boolean isSupportConfig = true;
    private boolean isSupportMoreCity = true;

    @NotNull
    private MutableLiveData<LocationKey> locationInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: abr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeatherSetViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityForHuamiL66$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityForHuamiL66$1", f = "WeatherSetViewModel.kt", i = {}, l = {521}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ City $city;
        final /* synthetic */ Function1<City, Unit> $finalCity;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityForHuamiL66$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityForHuamiL66$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ City $city;
            final /* synthetic */ Function1<City, Unit> $finalCity;
            final /* synthetic */ HuamiApiCaller $huamiDevice;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05251(HuamiApiCaller huamiApiCaller, City city, Function1<? super City, Unit> function1, Continuation<? super C05251> continuation) {
                super(2, continuation);
                this.$huamiDevice = huamiApiCaller;
                this.$city = city;
                this.$finalCity = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05251(this.$huamiDevice, this.$city, this.$finalCity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.$huamiDevice;
                this.$finalCity.invoke2(huamiApiCaller != null ? huamiApiCaller.modifyCity(this.$city, true) : false ? this.$city : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HuamiApiCaller huamiApiCaller, City city, Function1<? super City, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.$city = city;
            this.$finalCity = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$huamiDevice, this.$city, this.$finalCity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05251 c05251 = new C05251(this.$huamiDevice, this.$city, this.$finalCity, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05251, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityKeyForBleL67$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityKeyForBleL67$1", f = "WeatherSetViewModel.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, Integer, Unit> $isSuccess;
        final /* synthetic */ LocationKey $locationKey;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityKeyForBleL67$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$addCityKeyForBleL67$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<Boolean, Integer, Unit> $isSuccess;
            final /* synthetic */ LocationKey $locationKey;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05261(LocationKey locationKey, WeatherSetViewModel weatherSetViewModel, Function2<? super Boolean, ? super Integer, Unit> function2, Continuation<? super C05261> continuation) {
                super(2, continuation);
                this.$locationKey = locationKey;
                this.this$0 = weatherSetViewModel;
                this.$isSuccess = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05261(this.$locationKey, this.this$0, this.$isSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 7;
                e9r e9rVar = new e9r();
                c9r c9rVar = new c9r();
                LocationKey locationKey = this.$locationKey;
                c9rVar.d = locationKey.locationName;
                c9rVar.c = locationKey.locationKey;
                e9rVar.s(c9rVar);
                s7rVar.f0(e9rVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                final Function2<Boolean, Integer, Unit> function2 = this.$isSuccess;
                OnSyncCallback onSyncCallback = new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.addCityKeyForBleL67.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.i(WeatherSetViewModel.TAG, "Ble addCityKey failed code:" + code);
                        function2.invoke(Boolean.FALSE, Integer.valueOf(code));
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        Logger.i(WeatherSetViewModel.TAG, "Ble addCityKey onSuccess result:" + result);
                        function2.invoke(Boolean.TRUE, null);
                    }
                };
                WearableDeviceModel mDeviceModel2 = this.this$0.getMDeviceModel();
                deviceSyncExtKt.call(did, s7rVar, true, onSyncCallback, (mDeviceModel2 == null || !DeviceModelExtKt.isWearOS(mDeviceModel2)) ? -1 : 60000);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22181(LocationKey locationKey, WeatherSetViewModel weatherSetViewModel, Function2<? super Boolean, ? super Integer, Unit> function2, Continuation<? super C22181> continuation) {
            super(2, continuation);
            this.$locationKey = locationKey;
            this.this$0 = weatherSetViewModel;
            this.$isSuccess = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22181(this.$locationKey, this.this$0, this.$isSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05261 c05261 = new C05261(this.$locationKey, this.this$0, this.$isSuccess, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05261, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getBleCityList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getBleCityList$1", f = "WeatherSetViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<LocationKey>, Unit> $cityKeyList;
        final /* synthetic */ LocationKey $currentLocationKey;
        final /* synthetic */ boolean $isNeedCurrentLocation;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getBleCityList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getBleCityList$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<List<LocationKey>, Unit> $cityKeyList;
            final /* synthetic */ LocationKey $currentLocationKey;
            final /* synthetic */ boolean $isNeedCurrentLocation;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getBleCityList$1$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel$getBleCityList$1$1$2", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nWeatherSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel$getBleCityList$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,605:1\n1863#2,2:606\n*S KotlinDebug\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel$getBleCityList$1$1$2\n*L\n251#1:606,2\n*E\n"})
            public static final class AnonymousClass2 implements OnSyncCallback {
                final /* synthetic */ Function1<List<LocationKey>, Unit> $cityKeyList;
                final /* synthetic */ LocationKey $currentLocationKey;
                final /* synthetic */ LocationKey $defaultLocation;
                final /* synthetic */ List<c9r> $updateCityKeyList;
                final /* synthetic */ List<LocationKey> $updateLocationKeyList;
                final /* synthetic */ WeatherSetViewModel this$0;

                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(WeatherSetViewModel weatherSetViewModel, List<c9r> list, Function1<? super List<LocationKey>, Unit> function1, List<LocationKey> list2, LocationKey locationKey, LocationKey locationKey2) {
                    this.this$0 = weatherSetViewModel;
                    this.$updateCityKeyList = list;
                    this.$cityKeyList = function1;
                    this.$updateLocationKeyList = list2;
                    this.$defaultLocation = locationKey;
                    this.$currentLocationKey = locationKey2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit onError$lambda$2(boolean z) {
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit onSuccess$lambda$1(boolean z) {
                    return Unit.INSTANCE;
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(WeatherSetViewModel.TAG, "getWeatherCityList failed code:" + code);
                    if (code == 1) {
                        this.this$0.setSupportMoreCity(false);
                    }
                    this.this$0.updateCityList(this.$updateCityKeyList, new Function1() { // from class: bbr
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherSetViewModel.C22191.C05281.AnonymousClass2.onError$lambda$2(((Boolean) obj).booleanValue());
                        }
                    });
                    this.$cityKeyList.invoke2(this.$updateLocationKeyList);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    String str;
                    s7r packet;
                    e9r e9rVarH;
                    c9r.a aVarP;
                    s7r packet2;
                    e9r e9rVarH2;
                    c9r.a aVarP2;
                    c9r[] c9rVarArr;
                    s7r packet3;
                    e9r e9rVarH3;
                    c9r.a aVarP3;
                    s7r packet4;
                    Logger.i(WeatherSetViewModel.TAG, "getWeatherCityList onSuccess result:" + ((result == null || (packet4 = result.getPacket()) == null) ? null : packet4.H()));
                    if (result != null && result.isNotSupport()) {
                        this.this$0.setSupportMoreCity(false);
                    }
                    c9r[] c9rVarArr2 = (result == null || (packet3 = result.getPacket()) == null || (e9rVarH3 = packet3.H()) == null || (aVarP3 = e9rVarH3.p()) == null) ? null : aVarP3.c;
                    if (c9rVarArr2 != null && c9rVarArr2.length != 0) {
                        Logger.i(WeatherSetViewModel.TAG, "getWeatherCityList onSuccess list:" + ((result == null || (packet2 = result.getPacket()) == null || (e9rVarH2 = packet2.H()) == null || (aVarP2 = e9rVarH2.p()) == null || (c9rVarArr = aVarP2.c) == null) ? null : ArraysKt___ArraysKt.toMutableList(c9rVarArr)));
                        c9r[] c9rVarArr3 = (result == null || (packet = result.getPacket()) == null || (e9rVarH = packet.H()) == null || (aVarP = e9rVarH.p()) == null) ? null : aVarP.c;
                        Intrinsics.checkNotNull(c9rVarArr3);
                        List<c9r> mutableList = ArraysKt___ArraysKt.toMutableList(c9rVarArr3);
                        LocationKey locationKey = this.$defaultLocation;
                        LocationKey locationKey2 = this.$currentLocationKey;
                        List<c9r> list = this.$updateCityKeyList;
                        List<LocationKey> list2 = this.$updateLocationKeyList;
                        WeatherSetViewModel weatherSetViewModel = this.this$0;
                        for (c9r c9rVar : mutableList) {
                            String str2 = c9rVar.c;
                            if (str2 != null && str2.length() != 0 && (str = c9rVar.d) != null && str.length() != 0) {
                                if (!Intrinsics.areEqual(locationKey != null ? locationKey.locationKey : null, c9rVar.c)) {
                                    if (!Intrinsics.areEqual(locationKey2 != null ? locationKey2.locationKey : null, c9rVar.c)) {
                                        LocationKey locationKey3 = new LocationKey();
                                        locationKey3.locationKey = c9rVar.c;
                                        locationKey3.locationName = c9rVar.d;
                                        locationKey3.isUserAutoLocation = false;
                                        Intrinsics.checkNotNull(c9rVar);
                                        list.add(c9rVar);
                                        list2.add(locationKey3);
                                        weatherSetViewModel.blePostWeatherToDevice(locationKey3);
                                    }
                                }
                            }
                        }
                    }
                    this.this$0.updateCityList(this.$updateCityKeyList, new Function1() { // from class: cbr
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherSetViewModel.C22191.C05281.AnonymousClass2.onSuccess$lambda$1(((Boolean) obj).booleanValue());
                        }
                    });
                    this.$cityKeyList.invoke2(this.$updateLocationKeyList);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05281(LocationKey locationKey, boolean z, WeatherSetViewModel weatherSetViewModel, Function1<? super List<LocationKey>, Unit> function1, Continuation<? super C05281> continuation) {
                super(2, continuation);
                this.$currentLocationKey = locationKey;
                this.$isNeedCurrentLocation = z;
                this.this$0 = weatherSetViewModel;
                this.$cityKeyList = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05281(this.$currentLocationKey, this.$isNeedCurrentLocation, this.this$0, this.$cityKeyList, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                String str2;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                SyncPreference syncPreference = SyncPreference.INSTANCE;
                LocationKey locationKey = syncPreference.getWeatherLocation().length() == 0 ? null : (LocationKey) GsonExtKt.toObject(new Gson(), syncPreference.getWeatherLocation(), LocationKey.class);
                LocationKey locationKey2 = this.$currentLocationKey;
                if (locationKey2 == null) {
                    locationKey2 = locationKey;
                }
                if (this.$isNeedCurrentLocation && locationKey2 != null && (str = locationKey2.locationKey) != null && str.length() != 0 && (str2 = locationKey2.locationName) != null && str2.length() != 0) {
                    this.this$0.blePostWeatherToDevice(locationKey2);
                    arrayList.add(0, locationKey2);
                    c9r c9rVar = new c9r();
                    c9rVar.d = locationKey2.locationName;
                    c9rVar.c = locationKey2.locationKey;
                    Unit unit = Unit.INSTANCE;
                    arrayList2.add(0, c9rVar);
                }
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 5;
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new AnonymousClass2(this.this$0, arrayList2, this.$cityKeyList, arrayList, locationKey, this.$currentLocationKey), 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22191(LocationKey locationKey, boolean z, WeatherSetViewModel weatherSetViewModel, Function1<? super List<LocationKey>, Unit> function1, Continuation<? super C22191> continuation) {
            super(2, continuation);
            this.$currentLocationKey = locationKey;
            this.$isNeedCurrentLocation = z;
            this.this$0 = weatherSetViewModel;
            this.$cityKeyList = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22191(this.$currentLocationKey, this.$isNeedCurrentLocation, this.this$0, this.$cityKeyList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05281 c05281 = new C05281(this.$currentLocationKey, this.$isNeedCurrentLocation, this.this$0, this.$cityKeyList, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05281, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getHuaMiWeatherSettingsForL66$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getHuaMiWeatherSettingsForL66$1", f = "WeatherSetViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<WeatherSetting, Unit> $weatherSettings;
        Object L$0;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22201(Function1<? super WeatherSetting, Unit> function1, WeatherSetViewModel weatherSetViewModel, Continuation<? super C22201> continuation) {
            super(2, continuation);
            this.$weatherSettings = function1;
            this.this$0 = weatherSetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22201(this.$weatherSettings, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<WeatherSetting, Unit> function2 = this.$weatherSettings;
                WeatherSetViewModel weatherSetViewModel = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                Object objQueryWeatherSettings = weatherSetViewModel.queryWeatherSettings(this);
                if (objQueryWeatherSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objQueryWeatherSettings;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke2(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getHuamiWeatherSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getHuamiWeatherSetting$1", f = "WeatherSetViewModel.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<com.xiaomi.fitness.settingitem.settingitem.WeatherSetting, Unit> $weather;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22211(Function1<? super com.xiaomi.fitness.settingitem.settingitem.WeatherSetting, Unit> function1, Continuation<? super C22211> continuation) {
            super(2, continuation);
            this.$weather = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22211(this.$weather, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeatherSetViewModel weatherSetViewModel = WeatherSetViewModel.this;
                this.label = 1;
                obj = weatherSetViewModel.getHuamiWeatherSetting(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$weather.invoke2((com.xiaomi.fitness.settingitem.settingitem.WeatherSetting) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getHuamiWeatherSetting$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel", f = "WeatherSetViewModel.kt", i = {}, l = {143}, m = "getHuamiWeatherSetting", n = {}, s = {})
    public static final class AnonymousClass2 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WeatherSetViewModel.this.getHuamiWeatherSetting(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getL67BleWeatherConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getL67BleWeatherConfig$1", f = "WeatherSetViewModel.kt", i = {}, l = {433}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<f9r, Unit> $weatherConfigCallback;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getL67BleWeatherConfig$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$getL67BleWeatherConfig$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<f9r, Unit> $weatherConfigCallback;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05291(WeatherSetViewModel weatherSetViewModel, Function1<? super f9r, Unit> function1, Continuation<? super C05291> continuation) {
                super(2, continuation);
                this.this$0 = weatherSetViewModel;
                this.$weatherConfigCallback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05291(this.this$0, this.$weatherConfigCallback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 9;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                final WeatherSetViewModel weatherSetViewModel = this.this$0;
                final Function1<f9r, Unit> function1 = this.$weatherConfigCallback;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.getL67BleWeatherConfig.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.i(WeatherSetViewModel.TAG, "Ble getBleWeatherConfig failed code:" + code);
                        if (code == 1) {
                            weatherSetViewModel.setSupportConfig(false);
                        }
                        function1.invoke2(null);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        s7r packet;
                        Logger.i(WeatherSetViewModel.TAG, "Ble getBleWeatherConfig onSuccess result:" + result);
                        if (result != null && result.isNotSupport()) {
                            weatherSetViewModel.setSupportConfig(false);
                            function1.invoke2(null);
                            return;
                        }
                        if (((result == null || (packet = result.getPacket()) == null) ? null : packet.H()) == null) {
                            function1.invoke2(null);
                            return;
                        }
                        Function1<f9r, Unit> function2 = function1;
                        s7r packet2 = result.getPacket();
                        e9r e9rVarH = packet2 != null ? packet2.H() : null;
                        Intrinsics.checkNotNull(e9rVarH);
                        function2.invoke2(e9rVarH.q());
                    }
                }, 0, 16, (Object) null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22221(Function1<? super f9r, Unit> function1, Continuation<? super C22221> continuation) {
            super(2, continuation);
            this.$weatherConfigCallback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22221(this.$weatherConfigCallback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05291 c05291 = new C05291(WeatherSetViewModel.this, this.$weatherConfigCallback, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05291, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryCityList$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryCityList$2", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22232 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends City>>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22232(HuamiApiCaller huamiApiCaller, Continuation<? super C22232> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22232(this.$huamiDevice, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends City>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<City>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<City> listQueryCityList;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huamiApiCaller = this.$huamiDevice;
            return (huamiApiCaller == null || (listQueryCityList = huamiApiCaller.queryCityList()) == null) ? new ArrayList() : listQueryCityList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<City>> continuation) {
            return ((C22232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryCityListForHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryCityListForHuami$1", f = "WeatherSetViewModel.kt", i = {}, l = {531}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<City>, Unit> $cityList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22241(Function1<? super List<City>, Unit> function1, Continuation<? super C22241> continuation) {
            super(2, continuation);
            this.$cityList = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22241(this.$cityList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeatherSetViewModel weatherSetViewModel = WeatherSetViewModel.this;
                this.label = 1;
                obj = weatherSetViewModel.queryCityList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$cityList.invoke2((List) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryWeatherSettings$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$queryWeatherSettings$2", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22252 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WeatherSetting>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22252(HuamiApiCaller huamiApiCaller, Continuation<? super C22252> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22252(this.$huamiDevice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller huamiApiCaller = this.$huamiDevice;
            if (huamiApiCaller != null) {
                return huamiApiCaller.queryWeatherSettings();
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WeatherSetting> continuation) {
            return ((C22252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityForHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityForHuami$1", f = "WeatherSetViewModel.kt", i = {}, l = {597}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocationKey $cityKey;
        final /* synthetic */ Function1<Boolean, Unit> $isSuc;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityForHuami$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityForHuami$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LocationKey $cityKey;
            final /* synthetic */ Function1<Boolean, Unit> $isSuc;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05311(WeatherSetViewModel weatherSetViewModel, LocationKey locationKey, Function1<? super Boolean, Unit> function1, Continuation<? super C05311> continuation) {
                super(2, continuation);
                this.this$0 = weatherSetViewModel;
                this.$cityKey = locationKey;
                this.$isSuc = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05311(this.this$0, this.$cityKey, this.$isSuc, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel);
                String locationKey = this.$cityKey.locationKey;
                Intrinsics.checkNotNullExpressionValue(locationKey, "locationKey");
                String locationName = this.$cityKey.locationName;
                Intrinsics.checkNotNullExpressionValue(locationName, "locationName");
                this.$isSuc.invoke2(Boxing.boxBoolean(huamiDevice != null ? huamiDevice.modifyCity(new City(locationKey, locationName), false) : false));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22261(LocationKey locationKey, Function1<? super Boolean, Unit> function1, Continuation<? super C22261> continuation) {
            super(2, continuation);
            this.$cityKey = locationKey;
            this.$isSuc = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22261(this.$cityKey, this.$isSuc, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05311 c05311 = new C05311(WeatherSetViewModel.this, this.$cityKey, this.$isSuc, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05311, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityKey$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityKey$1", f = "WeatherSetViewModel.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LocationKey $locationKey;
        final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityKey$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$removeCityKey$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nWeatherSetViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel$removeCityKey$1$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,605:1\n37#2:606\n36#2,3:607\n*S KotlinDebug\n*F\n+ 1 WeatherSetViewModel.kt\ncom/xiaomi/fitness/devicesettings/huami/weather/WeatherSetViewModel$removeCityKey$1$1\n*L\n397#1:606\n397#1:607,3\n*E\n"})
        public static final class C05321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LocationKey $locationKey;
            final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05321(LocationKey locationKey, WeatherSetViewModel weatherSetViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super C05321> continuation) {
                super(2, continuation);
                this.$locationKey = locationKey;
                this.this$0 = weatherSetViewModel;
                this.$onSuccess = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05321(this.$locationKey, this.this$0, this.$onSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 8;
                e9r e9rVar = new e9r();
                c9r c9rVar = new c9r();
                LocationKey locationKey = this.$locationKey;
                c9rVar.c = locationKey.locationKey;
                c9rVar.d = locationKey.locationName;
                ArrayList arrayList = new ArrayList();
                arrayList.add(c9rVar);
                c9r.a aVar = new c9r.a();
                aVar.c = (c9r[]) arrayList.toArray(new c9r[0]);
                e9rVar.t(aVar);
                s7rVar.f0(e9rVar);
                Logger.i(WeatherSetViewModel.TAG, "Ble removeCityKey: " + e9rVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                final Function1<Boolean, Unit> function1 = this.$onSuccess;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, did, s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.removeCityKey.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did2, int type, int code) {
                        Logger.i(WeatherSetViewModel.TAG, "Ble removeCityKey failed code:" + code);
                        function1.invoke2(Boolean.FALSE);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did2, int type, SyncResult result) {
                        Logger.i(WeatherSetViewModel.TAG, "Ble removeCityKey onSuccess result:" + result);
                        function1.invoke2(Boolean.TRUE);
                    }
                }, 0, 16, (Object) null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22271(LocationKey locationKey, WeatherSetViewModel weatherSetViewModel, Function1<? super Boolean, Unit> function1, Continuation<? super C22271> continuation) {
            super(2, continuation);
            this.$locationKey = locationKey;
            this.this$0 = weatherSetViewModel;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22271(this.$locationKey, this.this$0, this.$onSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05321 c05321 = new C05321(this.$locationKey, this.this$0, this.$onSuccess, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05321, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$saveWeatherSetting$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$saveWeatherSetting$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ com.xiaomi.fitness.settingitem.settingitem.WeatherSetting $weatherSetting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22281(com.xiaomi.fitness.settingitem.settingitem.WeatherSetting weatherSetting, Continuation<? super C22281> continuation) {
            super(2, continuation);
            this.$weatherSetting = weatherSetting;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22281(this.$weatherSetting, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
            DeviceSettingManager companion2 = companion.getInstance();
            WearableDeviceModel mDeviceModel = WeatherSetViewModel.this.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel);
            companion2.saveDeviceSetItem(false, mDeviceModel.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING, this.$weatherSetting);
            DeviceSettingManager companion3 = companion.getInstance();
            WearableDeviceModel mDeviceModel2 = WeatherSetViewModel.this.getMDeviceModel();
            Intrinsics.checkNotNull(mDeviceModel2);
            companion3.sendSettingItem(mDeviceModel2.getDid(), DeviceSettingConfigKey.KEY_WEATHERSETTING, this.$weatherSetting);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfig$1", f = "WeatherSetViewModel.kt", i = {}, l = {471}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $temp;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfig$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfig$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $temp;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05341(int i, WeatherSetViewModel weatherSetViewModel, Continuation<? super C05341> continuation) {
                super(2, continuation);
                this.$temp = i;
                this.this$0 = weatherSetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05341(this.$temp, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 10;
                e9r e9rVar = new e9r();
                f9r f9rVar = new f9r();
                int i = this.$temp + 1;
                f9rVar.c = i;
                Logger.i(WeatherSetViewModel.TAG, "Ble setBleWeatherConfig unit temperatureUnit:" + i);
                e9rVar.x(f9rVar);
                s7rVar.f0(e9rVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, mDeviceModel != null ? mDeviceModel.getDid() : null, s7rVar, false, (OnSyncCallback) null, 0, 24, (Object) null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22291(int i, WeatherSetViewModel weatherSetViewModel, Continuation<? super C22291> continuation) {
            super(2, continuation);
            this.$temp = i;
            this.this$0 = weatherSetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22291(this.$temp, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05341 c05341 = new C05341(this.$temp, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05341, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfigAlert$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfigAlert$1", f = "WeatherSetViewModel.kt", i = {}, l = {494}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $alert;
        int label;
        final /* synthetic */ WeatherSetViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfigAlert$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setBleWeatherConfigAlert$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $alert;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05351(int i, WeatherSetViewModel weatherSetViewModel, Continuation<? super C05351> continuation) {
                super(2, continuation);
                this.$alert = i;
                this.this$0 = weatherSetViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05351(this.$alert, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 10;
                s7rVar.f = 10;
                e9r e9rVar = new e9r();
                f9r f9rVar = new f9r();
                int i = this.$alert;
                f9rVar.d = i;
                Logger.i(WeatherSetViewModel.TAG, "Ble setBleWeatherConfig alert:" + i);
                e9rVar.x(f9rVar);
                s7rVar.f0(e9rVar);
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, mDeviceModel != null ? mDeviceModel.getDid() : null, s7rVar, false, (OnSyncCallback) null, 0, 24, (Object) null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22301(int i, WeatherSetViewModel weatherSetViewModel, Continuation<? super C22301> continuation) {
            super(2, continuation);
            this.$alert = i;
            this.this$0 = weatherSetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22301(this.$alert, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05351 c05351 = new C05351(this.$alert, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05351, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setWeatherTemperatureUnit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setWeatherTemperatureUnit$1", f = "WeatherSetViewModel.kt", i = {}, l = {582}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $isSuc;
        final /* synthetic */ int $unit;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setWeatherTemperatureUnit$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$setWeatherTemperatureUnit$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $isSuc;
            final /* synthetic */ int $unit;
            int label;
            final /* synthetic */ WeatherSetViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05361(WeatherSetViewModel weatherSetViewModel, int i, Function1<? super Boolean, Unit> function1, Continuation<? super C05361> continuation) {
                super(2, continuation);
                this.this$0 = weatherSetViewModel;
                this.$unit = i;
                this.$isSuc = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05361(this.this$0, this.$unit, this.$isSuc, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel mDeviceModel = this.this$0.getMDeviceModel();
                Intrinsics.checkNotNull(mDeviceModel);
                HuamiApiCaller huamiDevice = com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel);
                boolean weatherTemperatureUnit = huamiDevice != null ? huamiDevice.setWeatherTemperatureUnit((byte) this.$unit) : false;
                Logger.i(WeatherSetViewModel.TAG, "L66 setWeatherTemperatureUnit weathersettins unit = " + this.$unit + " res = " + weatherTemperatureUnit);
                this.$isSuc.invoke2(Boxing.boxBoolean(weatherTemperatureUnit));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22311(int i, Function1<? super Boolean, Unit> function1, Continuation<? super C22311> continuation) {
            super(2, continuation);
            this.$unit = i;
            this.$isSuc = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WeatherSetViewModel.this.new C22311(this.$unit, this.$isSuc, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05361 c05361 = new C05361(WeatherSetViewModel.this, this.$unit, this.$isSuc, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05361, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$updateWeatherSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$updateWeatherSettings$1", f = "WeatherSetViewModel.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
        final /* synthetic */ WeatherSetting $weatherSettins;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$updateWeatherSettings$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$updateWeatherSettings$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $huamiDevice;
            final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
            final /* synthetic */ WeatherSetting $weatherSettins;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05371(HuamiApiCaller huamiApiCaller, WeatherSetting weatherSetting, Function1<? super Boolean, Unit> function1, Continuation<? super C05371> continuation) {
                super(2, continuation);
                this.$huamiDevice = huamiApiCaller;
                this.$weatherSettins = weatherSetting;
                this.$onSuccess = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05371(this.$huamiDevice, this.$weatherSettins, this.$onSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.$huamiDevice;
                Boolean boolBoxBoolean = huamiApiCaller != null ? Boxing.boxBoolean(huamiApiCaller.updateWeatherSettings(this.$weatherSettins)) : null;
                Logger.i(WeatherSetViewModel.TAG, "L66 updateWeatherSettings weathersettins locationkey" + this.$weatherSettins.getCurrentLocatedCity() + " res " + boolBoxBoolean);
                this.$onSuccess.invoke2(Boxing.boxBoolean(boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22351(HuamiApiCaller huamiApiCaller, WeatherSetting weatherSetting, Function1<? super Boolean, Unit> function1, Continuation<? super C22351> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.$weatherSettins = weatherSetting;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22351(this.$huamiDevice, this.$weatherSettins, this.$onSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05371 c05371 = new C05371(this.$huamiDevice, this.$weatherSettins, this.$onSuccess, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05371, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$writeCityListForHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$writeCityListForHuami$1", f = "WeatherSetViewModel.kt", i = {}, l = {548}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<City> $cityList;
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$writeCityListForHuami$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel$writeCityListForHuami$1$1", f = "WeatherSetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<City> $cityList;
            final /* synthetic */ HuamiApiCaller $huamiDevice;
            final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05381(HuamiApiCaller huamiApiCaller, List<City> list, Function1<? super Boolean, Unit> function1, Continuation<? super C05381> continuation) {
                super(2, continuation);
                this.$huamiDevice = huamiApiCaller;
                this.$cityList = list;
                this.$onSuccess = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05381(this.$huamiDevice, this.$cityList, this.$onSuccess, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.$huamiDevice;
                Boolean boolBoxBoolean = huamiApiCaller != null ? Boxing.boxBoolean(huamiApiCaller.writeCityList(this.$cityList)) : null;
                this.$onSuccess.invoke2(Boxing.boxBoolean(boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22361(HuamiApiCaller huamiApiCaller, List<City> list, Function1<? super Boolean, Unit> function1, Continuation<? super C22361> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.$cityList = list;
            this.$onSuccess = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22361(this.$huamiDevice, this.$cityList, this.$onSuccess, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05381 c05381 = new C05381(this.$huamiDevice, this.$cityList, this.$onSuccess, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05381, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryCityList(Continuation<? super List<City>> continuation) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        return BuildersKt.withContext(Dispatchers.getIO(), new C22232(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel), null), continuation);
    }

    public final void addCityForHuamiL66(@NotNull City city, @NotNull Function1<? super City, Unit> finalCity) {
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(finalCity, "finalCity");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel), city, finalCity, null), 3, null);
    }

    public final void addCityKeyForBleL67(@NotNull LocationKey locationKey, @NotNull Function2<? super Boolean, ? super Integer, Unit> isSuccess) {
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22181(locationKey, this, isSuccess, null), 3, null);
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    public final void blePostWeatherToDevice(@NotNull LocationKey locationKey) {
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        ArrayList arrayList = new ArrayList();
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        arrayList.add(mDeviceModel);
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).syncWeatherToDevices(arrayList, true, locationKey, true, null, false);
    }

    public void getBleCityList(boolean isNeedCurrentLocation, @Nullable LocationKey currentLocationKey, @NotNull Function1<? super List<LocationKey>, Unit> cityKeyList) {
        Intrinsics.checkNotNullParameter(cityKeyList, "cityKeyList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22191(currentLocationKey, isNeedCurrentLocation, this, cityKeyList, null), 3, null);
    }

    public final void getHuaMiWeatherSettingsForL66(@NotNull Function1<? super WeatherSetting, Unit> weatherSettings) {
        Intrinsics.checkNotNullParameter(weatherSettings, "weatherSettings");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22201(weatherSettings, this, null), 3, null);
    }

    public final void getHuamiWeatherSetting(@NotNull Function1<? super com.xiaomi.fitness.settingitem.settingitem.WeatherSetting, Unit> weather) {
        Intrinsics.checkNotNullParameter(weather, "weather");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22211(weather, null), 3, null);
    }

    public final void getL67BleWeatherConfig(@NotNull Function1<? super f9r, Unit> weatherConfigCallback) {
        Intrinsics.checkNotNullParameter(weatherConfigCallback, "weatherConfigCallback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22221(weatherConfigCallback, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<LocationKey> getLocationInfo() {
        return this.locationInfo;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    public final boolean isLocationInCityList(@Nullable String locationKey, @Nullable List<c9r> cityList) {
        List<c9r> list = cityList;
        if (list != null && !list.isEmpty()) {
            Iterator<c9r> it = cityList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(locationKey, it.next().c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isLocationServiceOpen() {
        return LocationExtKt.isGpsEnable(ApplicationExtKt.getApplication());
    }

    /* JADX INFO: renamed from: isSupportConfig, reason: from getter */
    public final boolean getIsSupportConfig() {
        return this.isSupportConfig;
    }

    /* JADX INFO: renamed from: isSupportMoreCity, reason: from getter */
    public final boolean getIsSupportMoreCity() {
        return this.isSupportMoreCity;
    }

    public final void queryCityListForHuami(@NotNull Function1<? super List<City>, Unit> cityList) {
        Intrinsics.checkNotNullParameter(cityList, "cityList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22241(cityList, null), 3, null);
    }

    @Nullable
    public final Object queryWeatherSettings(@NotNull Continuation<? super WeatherSetting> continuation) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        return BuildersKt.withContext(Dispatchers.getIO(), new C22252(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel), null), continuation);
    }

    public final void removeCityForHuami(@NotNull LocationKey cityKey, @NotNull Function1<? super Boolean, Unit> isSuc) {
        Intrinsics.checkNotNullParameter(cityKey, "cityKey");
        Intrinsics.checkNotNullParameter(isSuc, "isSuc");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22261(cityKey, isSuc, null), 3, null);
    }

    public final void removeCityKey(@NotNull LocationKey locationKey, @NotNull Function1<? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(locationKey, "locationKey");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22271(locationKey, this, onSuccess, null), 3, null);
    }

    public final void saveWeatherSetting(@NotNull com.xiaomi.fitness.settingitem.settingitem.WeatherSetting weatherSetting) {
        Intrinsics.checkNotNullParameter(weatherSetting, "weatherSetting");
        AnyExtKt.io$default(null, new C22281(weatherSetting, null), 1, null);
    }

    public final void setBleWeatherConfig(int temp) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22291(temp, this, null), 3, null);
    }

    public final void setBleWeatherConfigAlert(int alert) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22301(alert, this, null), 3, null);
    }

    public final void setLocationInfo(@NotNull MutableLiveData<LocationKey> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.locationInfo = mutableLiveData;
    }

    public final void setSupportConfig(boolean z) {
        this.isSupportConfig = z;
    }

    public final void setSupportMoreCity(boolean z) {
        this.isSupportMoreCity = z;
    }

    public final void setWeatherTemperatureUnit(int unit, @NotNull Function1<? super Boolean, Unit> isSuc) {
        Intrinsics.checkNotNullParameter(isSuc, "isSuc");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22311(unit, isSuc, null), 3, null);
    }

    public final void startLocation() {
        if (this.locationInfo.getValue() != null) {
            LocationKey value = this.locationInfo.getValue();
            Intrinsics.checkNotNull(value);
            if (value.isUserAutoLocation) {
                MutableLiveData<LocationKey> mutableLiveData = this.locationInfo;
                mutableLiveData.postValue(mutableLiveData.getValue());
                return;
            }
        }
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).requestLocation(ApplicationExtKt.getApplication(), false, new kah() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.startLocation.1
            @Override // defpackage.kah
            public void locationFail(String errorMsg) {
                WeatherSetViewModel.this.getLocationInfo().postValue(null);
            }

            @Override // defpackage.kah
            public void locationSuccess(double latitude, double longitude, double altitude) {
                String json = new Gson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("longitude", Double.valueOf(longitude)), TuplesKt.to("latitude", Double.valueOf(latitude)), TuplesKt.to("get_city_location", Boolean.TRUE)));
                Logger.i(WeatherSetViewModel.TAG, "requestLocation =" + json);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(WeatherSetViewModel.this), null, null, new WeatherSetViewModel$startLocation$1$locationSuccess$1(latitude, longitude, json, WeatherSetViewModel.this, null), 3, null);
            }
        });
    }

    public final void syncWeather() {
        final ArrayList arrayList = new ArrayList();
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        arrayList.add(mDeviceModel);
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).readWeatherSetting(new WeatherSyncManager.ReadWeatherSettingCallBack() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.syncWeather.1
            @Override // com.xiaomi.fitness.sync.export.di.WeatherSyncManager.ReadWeatherSettingCallBack
            public void onResult(LocationKey locationKey) {
                SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).syncWeatherToDevices(arrayList, true, locationKey, true, null, false);
            }
        });
    }

    public final void updateCityList(@NotNull List<c9r> list, @NotNull final Function1<? super Boolean, Unit> isSuccess) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Logger.i(TAG, "updateCityList = " + list);
        if (list.isEmpty()) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 10;
        s7rVar.f = 6;
        e9r e9rVar = new e9r();
        c9r.a aVar = new c9r.a();
        aVar.c = (c9r[]) list.toArray(new c9r[0]);
        e9rVar.t(aVar);
        s7rVar.f0(e9rVar);
        DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, mDeviceModel != null ? mDeviceModel.getDid() : null, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSetViewModel.updateCityList.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WeatherSetViewModel.TAG, "BLE updateCityList failed code:" + code);
                isSuccess.invoke2(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(WeatherSetViewModel.TAG, "BLE updateCityList onSuccess result:" + result);
                isSuccess.invoke2(Boolean.TRUE);
            }
        }, 0, 16, (Object) null);
    }

    public final void updateWeatherSettings(@NotNull WeatherSetting weatherSettins, @NotNull Function1<? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(weatherSettins, "weatherSettins");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22351(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel), weatherSettins, onSuccess, null), 3, null);
    }

    public final void writeCityListForHuami(@NotNull List<City> cityList, @NotNull Function1<? super Boolean, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(cityList, "cityList");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22361(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(mDeviceModel), cityList, onSuccess, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHuamiWeatherSetting(Continuation<? super com.xiaomi.fitness.settingitem.settingitem.WeatherSetting> continuation) {
        AnonymousClass2 anonymousClass2;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i = anonymousClass2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        Object objWithContext = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            WeatherSetViewModel$getHuamiWeatherSetting$weatherSetting$1 weatherSetViewModel$getHuamiWeatherSetting$weatherSetting$1 = new WeatherSetViewModel$getHuamiWeatherSetting$weatherSetting$1(this, null);
            anonymousClass2.label = 1;
            objWithContext = BuildersKt.withContext(io2, weatherSetViewModel$getHuamiWeatherSetting$weatherSetting$1, anonymousClass2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return (com.xiaomi.fitness.settingitem.settingitem.WeatherSetting) objWithContext;
    }
}
