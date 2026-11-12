package com.xiaomi.fitness.devicesettings.huami.weather;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel;
import com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.fitness.sync.export.model.LocationByNameResp;
import com.xiaomi.fitness.sync.export.model.LocationKey;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.export.model.WeatherSelectCityInfo;
import defpackage.be1;
import defpackage.kah;
import defpackage.na4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R.\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120)0\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001c¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherSelectCityViewModel;", "Lcom/xiaomi/fitness/devicesettings/base/BaseLoadableBindingViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "startLocation", "()V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_DESTROY, "(Landroidx/lifecycle/LifecycleOwner;)V", LifecycleConstantKt.ON_PAUSE, "", "key", "getLocationByName", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;", "locationInfo", "requestWeatherToLocation", "(Lcom/xiaomi/fitness/sync/export/model/WeatherSelectCityInfo;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/sync/export/model/LocationKey;", "Landroidx/lifecycle/MutableLiveData;", "getLocationInfo", "()Landroidx/lifecycle/MutableLiveData;", "setLocationInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "selectLocationKey", "getSelectLocationKey", "setSelectLocationKey", "Lna4;", "compositeDisposable", "Lna4;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel$delegate", "Lkotlin/Lazy;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "", "locationList", "getLocationList", "setLocationList", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeatherSelectCityViewModel extends BaseLoadableBindingViewModel {

    @NotNull
    public static final String TAG = "SelectCityViewModel";

    @NotNull
    private MutableLiveData<LocationKey> locationInfo = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<LocationKey> selectLocationKey = new MutableLiveData<>();

    @NotNull
    private final na4 compositeDisposable = new na4();

    /* JADX INFO: renamed from: mDeviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: o9r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WeatherSelectCityViewModel.mDeviceModel_delegate$lambda$0();
        }
    });

    @NotNull
    private MutableLiveData<List<WeatherSelectCityInfo>> locationList = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel$requestWeatherToLocation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel$requestWeatherToLocation$1", f = "WeatherSelectCityViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WeatherSelectCityInfo $locationInfo;
        int label;
        final /* synthetic */ WeatherSelectCityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22121(WeatherSelectCityInfo weatherSelectCityInfo, WeatherSelectCityViewModel weatherSelectCityViewModel, Continuation<? super C22121> continuation) {
            super(2, continuation);
            this.$locationInfo = weatherSelectCityInfo;
            this.this$0 = weatherSelectCityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22121(this.$locationInfo, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WeatherSyncManager syncExtKt = SyncExtKt.getInstance(WeatherSyncManager.INSTANCE);
                String locationKey = this.$locationInfo.getLocationKey();
                double latitude = this.$locationInfo.getLatitude();
                double longitude = this.$locationInfo.getLongitude();
                final WeatherSelectCityViewModel weatherSelectCityViewModel = this.this$0;
                final WeatherSelectCityInfo weatherSelectCityInfo = this.$locationInfo;
                be1<WeatherResp.Weather> be1Var = new be1<WeatherResp.Weather>() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel.requestWeatherToLocation.1.1
                    @Override // defpackage.be1
                    public void onFailure() {
                        weatherSelectCityViewModel.getSelectLocationKey().postValue(null);
                    }

                    @Override // defpackage.be1
                    public void onResponse(WeatherResp.Weather response) {
                        String name;
                        if (response == null) {
                            weatherSelectCityViewModel.getSelectLocationKey().postValue(null);
                            return;
                        }
                        LocationKey locationKey2 = new LocationKey();
                        locationKey2.latitude = weatherSelectCityInfo.getLatitude();
                        locationKey2.longitude = weatherSelectCityInfo.getLongitude();
                        String str = response.location_name;
                        if (str == null || str.length() == 0) {
                            String str2 = response.city_name;
                            name = (str2 == null || str2.length() == 0) ? weatherSelectCityInfo.getName() : response.city_name;
                        } else {
                            name = response.location_name;
                        }
                        locationKey2.locationName = name;
                        locationKey2.affiliation = response.affiliation;
                        locationKey2.locationKey = response.locationKey;
                        locationKey2.isUserAutoLocation = false;
                        weatherSelectCityViewModel.getSelectLocationKey().postValue(locationKey2);
                    }
                };
                this.label = 1;
                if (syncExtKt.performWeatherRequest(locationKey, latitude, longitude, be1Var, this) == coroutine_suspended) {
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
            return ((C22121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel mDeviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    @Override // com.xiaomi.fitness.devicesettings.base.BaseLoadableBindingViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        super.attach(savedInstanceState);
    }

    public final void getLocationByName(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).getCityNameByLocation(new Gson().toJson(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("name", key))), new be1<LocationByNameResp>() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel.getLocationByName.1
            @Override // defpackage.be1
            public void onFailure() {
                WeatherSelectCityViewModel.this.getLocationList().postValue(new ArrayList());
            }

            @Override // defpackage.be1
            public void onResponse(LocationByNameResp response) {
                if (response == null) {
                    WeatherSelectCityViewModel.this.getLocationList().postValue(new ArrayList());
                } else {
                    WeatherSelectCityViewModel.this.getLocationList().postValue(response.result);
                }
            }
        });
    }

    @NotNull
    public final MutableLiveData<LocationKey> getLocationInfo() {
        return this.locationInfo;
    }

    @NotNull
    public final MutableLiveData<List<WeatherSelectCityInfo>> getLocationList() {
        return this.locationList;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return (WearableDeviceModel) this.mDeviceModel.getValue();
    }

    @NotNull
    public final MutableLiveData<LocationKey> getSelectLocationKey() {
        return this.selectLocationKey;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.compositeDisposable.dispose();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.compositeDisposable.dispose();
    }

    public final void requestWeatherToLocation(@NotNull WeatherSelectCityInfo locationInfo) {
        Intrinsics.checkNotNullParameter(locationInfo, "locationInfo");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C22121(locationInfo, this, null), 3, null);
    }

    public final void setLocationInfo(@NotNull MutableLiveData<LocationKey> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.locationInfo = mutableLiveData;
    }

    public final void setLocationList(@NotNull MutableLiveData<List<WeatherSelectCityInfo>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.locationList = mutableLiveData;
    }

    public final void setSelectLocationKey(@NotNull MutableLiveData<LocationKey> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.selectLocationKey = mutableLiveData;
    }

    public final void startLocation() {
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).requestLocation(ApplicationExtKt.getApplication(), false, new kah() { // from class: com.xiaomi.fitness.devicesettings.huami.weather.WeatherSelectCityViewModel.startLocation.1
            @Override // defpackage.kah
            public void locationFail(String errorMsg) {
                WeatherSelectCityViewModel.this.getLocationInfo().postValue(null);
            }

            @Override // defpackage.kah
            public void locationSuccess(double latitude, double longitude, double altitude) {
                String json = new Gson().toJson(MapsKt__MapsKt.mapOf(TuplesKt.to("longitude", Double.valueOf(longitude)), TuplesKt.to("latitude", Double.valueOf(latitude)), TuplesKt.to("get_city_location", Boolean.TRUE)));
                Logger.i(WeatherSelectCityViewModel.TAG, "requestLocation =" + json);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(WeatherSelectCityViewModel.this), null, null, new WeatherSelectCityViewModel$startLocation$1$locationSuccess$1(latitude, longitude, json, WeatherSelectCityViewModel.this, null), 3, null);
            }
        });
    }
}
