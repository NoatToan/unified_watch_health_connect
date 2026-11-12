package com.xiaomi.wearable.yrn.components.amap;

import android.app.Activity;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import com.amap.api.services.geocoder.GeocodeResult;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import com.amap.api.services.geocoder.RegeocodeResult;
import com.amap.api.services.poisearch.PoiResult;
import com.amap.api.services.poisearch.PoiSearch;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.sync.export.di.SyncExtKt;
import com.xiaomi.fitness.sync.export.di.WeatherSyncManager;
import com.xiaomi.wearable.yrn.components.YRNComponentsExtKt;
import com.xiaomi.wearable.yrn.components.amap.YRNAMapModule;
import defpackage.kah;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007J8\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010%\u001a\u00020\u000eH\u0016¨\u0006'"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "requestLocation", "", "highAccuracy", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getFromLocationName", "name", "", "code", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "searchPoi", "readableMap", "Lcom/facebook/react/bridge/ReadableMap;", "getFromLocation", "convertPoi", "Lcom/facebook/react/bridge/WritableMap;", "item", "Lcom/amap/api/services/core/PoiItem;", "latitude", "", "longitude", TSMAuthContants.PARAM_CITYCODE, "city", "isLocationEnable", "isGpsEnable", "openGPSSettings", "hasLocationPermission", "hasFineLocationPermission", "hasBackgroundLocationPermission", "getName", "Companion", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YRNAMapModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String TAG = "YRNAMapModule";

    /* JADX INFO: renamed from: com.xiaomi.wearable.yrn.components.amap.YRNAMapModule$openGPSSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.wearable.yrn.components.amap.YRNAMapModule$openGPSSettings$1", f = "YRNAMapModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Callback $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34831(FragmentActivity fragmentActivity, Callback callback, Continuation<? super C34831> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$callback = callback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C34831(this.$activity, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            this.$callback.invoke(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YRNAMapModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap convertPoi(PoiItem item, double latitude, double longitude, String cityCode, String city) {
        int iIntValue = (item.getDistance() > 0 ? Integer.valueOf(item.getDistance()) : Float.valueOf(AMapUtils.calculateLineDistance(new LatLng(latitude, longitude), new LatLng(item.getLatLonPoint().getLatitude(), item.getLatLonPoint().getLongitude())))).intValue();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("poiId", item.getPoiId());
        Intrinsics.checkNotNull(writableMapCreateMap);
        YRNComponentsExtKt.safePutMap(writableMapCreateMap, "coordinate", item.getLatLonPoint(), new Function2() { // from class: wtr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YRNAMapModule.convertPoi$lambda$3$lambda$0((WritableMap) obj, (LatLonPoint) obj2);
            }
        });
        YRNComponentsExtKt.safePutMap(writableMapCreateMap, "enterCoordinate", item.getEnter(), new Function2() { // from class: xtr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YRNAMapModule.convertPoi$lambda$3$lambda$1((WritableMap) obj, (LatLonPoint) obj2);
            }
        });
        YRNComponentsExtKt.safePutMap(writableMapCreateMap, "exitCoordinate", item.getExit(), new Function2() { // from class: ytr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return YRNAMapModule.convertPoi$lambda$3$lambda$2((WritableMap) obj, (LatLonPoint) obj2);
            }
        });
        writableMapCreateMap.putString("businessArea", item.getBusinessArea());
        writableMapCreateMap.putString("adCode", item.getAdCode());
        writableMapCreateMap.putString("adName", item.getAdName());
        if (cityCode == null) {
            cityCode = item.getCityCode();
        }
        writableMapCreateMap.putString(TSMAuthContants.PARAM_CITYCODE, cityCode);
        if (city == null) {
            city = item.getCityName();
        }
        writableMapCreateMap.putString("cityName", city);
        writableMapCreateMap.putString("provinceCode", item.getProvinceCode());
        writableMapCreateMap.putString("provinceName", item.getProvinceName());
        writableMapCreateMap.putString("typeDes", item.getTypeDes());
        writableMapCreateMap.putString("tel", item.getTel());
        writableMapCreateMap.putInt("distance", iIntValue);
        writableMapCreateMap.putString("title", item.getTitle());
        writableMapCreateMap.putString("snippet", item.getSnippet());
        writableMapCreateMap.putString("website", item.getWebsite());
        writableMapCreateMap.putString("postcode", item.getPostcode());
        writableMapCreateMap.putString("email", item.getEmail());
        writableMapCreateMap.putString("parkingType", item.getParkingType());
        writableMapCreateMap.putString("typeCode", item.getTypeCode());
        writableMapCreateMap.putString("shopID", item.getShopID());
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    public static /* synthetic */ WritableMap convertPoi$default(YRNAMapModule yRNAMapModule, PoiItem poiItem, double d, double d2, String str, String str2, int i, Object obj) {
        return yRNAMapModule.convertPoi(poiItem, d, d2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertPoi$lambda$3$lambda$0(WritableMap safePutMap, LatLonPoint latLonPoint) {
        Intrinsics.checkNotNullParameter(safePutMap, "$this$safePutMap");
        Intrinsics.checkNotNullParameter(latLonPoint, "latLonPoint");
        safePutMap.putDouble("latitude", latLonPoint.getLatitude());
        safePutMap.putDouble("longitude", latLonPoint.getLongitude());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertPoi$lambda$3$lambda$1(WritableMap safePutMap, LatLonPoint enter) {
        Intrinsics.checkNotNullParameter(safePutMap, "$this$safePutMap");
        Intrinsics.checkNotNullParameter(enter, "enter");
        safePutMap.putDouble("latitude", enter.getLatitude());
        safePutMap.putDouble("longitude", enter.getLongitude());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit convertPoi$lambda$3$lambda$2(WritableMap safePutMap, LatLonPoint exit) {
        Intrinsics.checkNotNullParameter(safePutMap, "$this$safePutMap");
        Intrinsics.checkNotNullParameter(exit, "exit");
        safePutMap.putDouble("latitude", exit.getLatitude());
        safePutMap.putDouble("longitude", exit.getLongitude());
        return Unit.INSTANCE;
    }

    @ReactMethod
    public final void getFromLocation(@NotNull ReadableMap readableMap, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        final double dSafeGetDouble = YRNComponentsExtKt.safeGetDouble(readableMap, "latitude", 0.0d);
        final double dSafeGetDouble2 = YRNComponentsExtKt.safeGetDouble(readableMap, "longitude", 0.0d);
        final int iSafeGetInt = YRNComponentsExtKt.safeGetInt(readableMap, "pageSize", 10);
        GeocodeSearch geocodeSearch = new GeocodeSearch(currentActivity);
        RegeocodeQuery regeocodeQuery = new RegeocodeQuery(new LatLonPoint(dSafeGetDouble, dSafeGetDouble2), 200.0f, GeocodeSearch.AMAP);
        regeocodeQuery.setExtensions("all");
        regeocodeQuery.setPoiType("");
        geocodeSearch.setOnGeocodeSearchListener(new GeocodeSearch.OnGeocodeSearchListener() { // from class: com.xiaomi.wearable.yrn.components.amap.YRNAMapModule.getFromLocation.1
            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onGeocodeSearched(GeocodeResult p0, int p1) {
            }

            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onRegeocodeSearched(RegeocodeResult p0, int p1) {
                List<PoiItem> listTake;
                if (p1 != 1000) {
                    callback.invoke(Boolean.FALSE, Integer.valueOf(p1), null);
                    return;
                }
                WritableArray writableArrayCreateArray = Arguments.createArray();
                Callback callback2 = callback;
                int i = iSafeGetInt;
                YRNAMapModule yRNAMapModule = this;
                double d = dSafeGetDouble;
                double d2 = dSafeGetDouble2;
                RegeocodeAddress regeocodeAddress = p0 != null ? p0.getRegeocodeAddress() : null;
                if (regeocodeAddress == null) {
                    callback2.invoke(Boolean.TRUE, Integer.valueOf(p1), null);
                    return;
                }
                String cityCode = regeocodeAddress.getCityCode();
                String city = regeocodeAddress.getCity();
                List<PoiItem> pois = regeocodeAddress.getPois();
                if (pois != null && (listTake = CollectionsKt___CollectionsKt.take(pois, i)) != null) {
                    for (PoiItem poiItem : listTake) {
                        Intrinsics.checkNotNull(poiItem);
                        writableArrayCreateArray.pushMap(yRNAMapModule.convertPoi(poiItem, d, d2, cityCode, city));
                        d = d;
                    }
                }
                callback.invoke(Boolean.TRUE, Integer.valueOf(p1), writableArrayCreateArray);
            }
        });
        geocodeSearch.getFromLocationAsyn(regeocodeQuery);
    }

    @ReactMethod
    public final void getFromLocationName(@NotNull String name, @NotNull String code, @NotNull final Promise promise) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        GeocodeSearch geocodeSearch = new GeocodeSearch(currentActivity);
        GeocodeQuery geocodeQuery = new GeocodeQuery(name, code);
        geocodeSearch.setOnGeocodeSearchListener(new GeocodeSearch.OnGeocodeSearchListener() { // from class: com.xiaomi.wearable.yrn.components.amap.YRNAMapModule.getFromLocationName.1
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onGeocodeSearched(GeocodeResult p0, int p1) {
                if (p1 != 1000 || p0 == null) {
                    promise.reject(String.valueOf(p1), "result may by null");
                    return;
                }
                List<GeocodeAddress> geocodeAddressList = p0.getGeocodeAddressList();
                Intrinsics.checkNotNullExpressionValue(geocodeAddressList, "getGeocodeAddressList(...)");
                GeocodeAddress geocodeAddress = (GeocodeAddress) CollectionsKt___CollectionsKt.getOrNull(geocodeAddressList, 0);
                if (geocodeAddress == null) {
                    promise.reject(String.valueOf(p1), "no match address");
                    return;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("latitude", geocodeAddress.getLatLonPoint().getLatitude());
                writableMapCreateMap2.putDouble("longitude", geocodeAddress.getLatLonPoint().getLongitude());
                Unit unit = Unit.INSTANCE;
                writableMapCreateMap.putMap("coordinate", writableMapCreateMap2);
                writableMapCreateMap.putString("formatAddress", geocodeAddress.getFormatAddress());
                writableMapCreateMap.putString("province", geocodeAddress.getProvince());
                writableMapCreateMap.putString("city", geocodeAddress.getCity());
                writableMapCreateMap.putString(DistrictSearchQuery.KEYWORDS_DISTRICT, geocodeAddress.getDistrict());
                writableMapCreateMap.putString("township", geocodeAddress.getTownship());
                writableMapCreateMap.putString("neighborhood", geocodeAddress.getNeighborhood());
                writableMapCreateMap.putString("building", geocodeAddress.getBuilding());
                writableMapCreateMap.putString("adcode", geocodeAddress.getAdcode());
                writableMapCreateMap.putString("level", geocodeAddress.getLevel());
                promise.resolve(writableMapCreateMap);
            }

            @Override // com.amap.api.services.geocoder.GeocodeSearch.OnGeocodeSearchListener
            public void onRegeocodeSearched(RegeocodeResult p0, int p1) {
            }
        });
        geocodeSearch.getFromLocationNameAsyn(geocodeQuery);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "YRNComponentsModule";
    }

    @ReactMethod
    public final void hasBackgroundLocationPermission(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(Build.VERSION.SDK_INT >= 29 ? PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_BACKGROUND_LOCATION") : true);
        callback.invoke(objArr);
    }

    @ReactMethod
    public final void hasFineLocationPermission(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_FINE_LOCATION")));
    }

    @ReactMethod
    public final void hasLocationPermission(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.valueOf(PermissionsUtil.INSTANCE.checkPermission("android.permission.ACCESS_COARSE_LOCATION")));
    }

    @ReactMethod
    public final void isGpsEnable(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LocationManager locationManager = (LocationManager) ApplicationExtKt.getApplication().getSystemService("location");
        boolean z = false;
        if (locationManager != null) {
            try {
                if (locationManager.isProviderEnabled("gps")) {
                    z = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        callback.invoke(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @ReactMethod
    public final void isLocationEnable(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LocationManager locationManager = (LocationManager) ApplicationExtKt.getApplication().getSystemService("location");
        boolean z = false;
        if (locationManager != null) {
            try {
                if (!locationManager.isProviderEnabled("gps")) {
                    if (locationManager != null && locationManager.isProviderEnabled("network")) {
                    }
                }
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (locationManager != null) {
            z = true;
        }
        callback.invoke(Boolean.valueOf(z));
    }

    @ReactMethod
    public final void openGPSSettings(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            AnyExtKt.main$default(null, new C34831(fragmentActivity, callback, null), 1, null);
        }
    }

    @ReactMethod
    public final void requestLocation(boolean highAccuracy, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SyncExtKt.getInstance(WeatherSyncManager.INSTANCE).requestLocation(ApplicationExtKt.getApplication(), highAccuracy, new kah() { // from class: com.xiaomi.wearable.yrn.components.amap.YRNAMapModule.requestLocation.1
            @Override // defpackage.kah
            public void locationFail(String errorMsg) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", false);
                writableMapCreateMap.putString(Constants.EXTRA_ERROR_MESSAGE, errorMsg);
                callback.invoke(writableMapCreateMap);
            }

            @Override // defpackage.kah
            public void locationSuccess(double latitude, double longitude, double altitude) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putBoolean("success", true);
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putDouble("latitude", latitude);
                writableMapCreateMap2.putDouble("longitude", longitude);
                Unit unit = Unit.INSTANCE;
                writableMapCreateMap.putMap("coordinate", writableMapCreateMap2);
                writableMapCreateMap.putDouble("latitude", latitude);
                callback.invoke(writableMapCreateMap);
            }
        });
    }

    @ReactMethod
    public final void searchPoi(@NotNull ReadableMap readableMap, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(readableMap, "readableMap");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        final double dSafeGetDouble = YRNComponentsExtKt.safeGetDouble(readableMap, "latitude", 0.0d);
        final double dSafeGetDouble2 = YRNComponentsExtKt.safeGetDouble(readableMap, "longitude", 0.0d);
        String strSafeGetString$default = YRNComponentsExtKt.safeGetString$default(readableMap, "keyWord", null, 2, null);
        String strSafeGetString = YRNComponentsExtKt.safeGetString(readableMap, "category", "");
        String strSafeGetString2 = YRNComponentsExtKt.safeGetString(readableMap, "city", "");
        int iSafeGetInt = YRNComponentsExtKt.safeGetInt(readableMap, "pageSize", 30);
        YRNComponentsExtKt.safeGetInt(readableMap, "pageNum", 0);
        PoiSearch.Query query = new PoiSearch.Query(strSafeGetString$default, strSafeGetString, strSafeGetString2);
        query.setPageSize(iSafeGetInt);
        PoiSearch poiSearch = new PoiSearch(currentActivity, query);
        poiSearch.setOnPoiSearchListener(new PoiSearch.OnPoiSearchListener() { // from class: com.xiaomi.wearable.yrn.components.amap.YRNAMapModule.searchPoi.1
            @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
            public void onPoiItemSearched(PoiItem p0, int p1) {
            }

            @Override // com.amap.api.services.poisearch.PoiSearch.OnPoiSearchListener
            public void onPoiSearched(PoiResult p0, int p1) {
                ArrayList<PoiItem> pois;
                if (p1 != 1000) {
                    callback.invoke(Boolean.FALSE, Integer.valueOf(p1), null);
                    return;
                }
                WritableArray writableArrayCreateArray = Arguments.createArray();
                YRNAMapModule yRNAMapModule = this;
                double d = dSafeGetDouble;
                double d2 = dSafeGetDouble2;
                if (p0 != null && (pois = p0.getPois()) != null) {
                    for (PoiItem poiItem : pois) {
                        Intrinsics.checkNotNull(poiItem);
                        writableArrayCreateArray.pushMap(YRNAMapModule.convertPoi$default(yRNAMapModule, poiItem, d, d2, null, null, 24, null));
                        d2 = d2;
                    }
                }
                callback.invoke(Boolean.TRUE, Integer.valueOf(p1), writableArrayCreateArray);
            }
        });
        poiSearch.searchPOIAsyn();
    }
}
