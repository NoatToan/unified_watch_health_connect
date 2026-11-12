package com.xiaomi.fitness.rn.modules;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.UploadFileManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.rn.RNRequest;
import com.xiaomi.fitness.rn.log.RnPluginLog;
import com.xiaomi.fitness.rn.modules.HostModule;
import com.xiaomi.fitness.sport.eco.export.EcoSportManager;
import com.xiaomi.fitness.sport.eco.export.EcoSportManagerExtKt;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import defpackage.fw7;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0014\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/rn/modules/HostModule;", "Lcom/xiaomi/fitness/rn/modules/BaseNativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mRequest", "Lcom/xiaomi/fitness/rn/RNRequest;", "getName", "", "getPluginVersion", "", "model", "callback", "Lcom/facebook/react/bridge/Callback;", "requestUrl", "url", "params", "Lcom/facebook/react/bridge/ReadableMap;", "getRegionInfo", "openFeedback", "openSmartRopeDeviceManager", "openSportDataCenter", "openSportReport", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHostModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HostModule.kt\ncom/xiaomi/fitness/rn/modules/HostModule\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,124:1\n32#2,2:125\n*S KotlinDebug\n*F\n+ 1 HostModule.kt\ncom/xiaomi/fitness/rn/modules/HostModule\n*L\n50#1:125,2\n*E\n"})
public final class HostModule extends BaseNativeModule {

    @Nullable
    private RNRequest mRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openSportReport$lambda$3(Callback callback, Object[] objArr) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(objArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestUrl$lambda$1(Callback callback, RNRequest.CommonData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WritableMap writableMapCreateMap = Arguments.createMap();
        MIOTUtils.getMap(new JSONObject(it.getResp()), writableMapCreateMap);
        if (callback != null) {
            callback.invoke(Boolean.TRUE, writableMapCreateMap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestUrl$lambda$2(Callback callback, ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("code", it.getErrorCode());
        writableNativeMap.putString("msg", it.getMessage());
        if (callback != null) {
            callback.invoke(Boolean.FALSE, writableNativeMap);
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "MiWearHost";
    }

    @ReactMethod
    public final void getPluginVersion(@NotNull String model, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callback, "callback");
        StringBuilder sb = new StringBuilder();
        sb.append("getPluginVersion: ");
        sb.append(model);
        callback.invoke("测试版本：" + model);
    }

    @ReactMethod
    public final void getRegionInfo(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Arguments.createMap());
    }

    @ReactMethod
    public final void openFeedback() {
        if (getCurrentActivity() == null) {
            RnPluginLog.INSTANCE.e("current activity is null");
            return;
        }
        UploadFileManager uploadFileManagerExtKt = UploadFileManagerExtKt.getInstance(UploadFileManager.INSTANCE);
        Activity currentActivity = getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        uploadFileManagerExtKt.launchFeedback(currentActivity);
    }

    @ReactMethod
    public final void openSmartRopeDeviceManager(@NotNull ReadableMap params, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = params.getString("did");
        if (getCurrentActivity() == null) {
            RnPluginLog.INSTANCE.e("current activity is null");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        EcoDeviceManagerExtKt.launchToBindRopeSkippingList(currentActivity, string);
    }

    @ReactMethod
    public final void openSportDataCenter(@NotNull ReadableMap params, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        params.getString("did");
        int i = params.getInt("selectIdx");
        String string = params.hasKey(DailyRecordKey.sportType) ? params.getString(DailyRecordKey.sportType) : "rope_skipping";
        Logger.i(getName(), "openSportDataCenter() " + i + " " + string);
        if (getCurrentActivity() == null) {
            RnPluginLog.INSTANCE.e("current activity is null");
            return;
        }
        SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
        Activity currentActivity = getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        sportRecordApi.goSportRecordList(currentActivity, null, string, Integer.valueOf(i));
    }

    @ReactMethod
    public final void openSportReport(@NotNull ReadableMap params, @NotNull final Callback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = params.getString("did");
        int i = params.getInt("timestamp");
        int i2 = params.hasKey(DailyRecordKey.sportType) ? params.getInt(DailyRecordKey.sportType) : 14;
        Logger.i(getName(), "openSportReport() " + i + " " + i2);
        if (getCurrentActivity() == null) {
            RnPluginLog.INSTANCE.e("current activity is null");
            return;
        }
        EcoSportManager instance = EcoSportManagerExtKt.getINSTANCE(EcoSportManager.INSTANCE);
        Activity currentActivity = getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        instance.openSportReport(currentActivity, String.valueOf(string), i, i2, new fw7() { // from class: wac
            @Override // defpackage.fw7
            public final void invoke(Object[] objArr) {
                HostModule.openSportReport$lambda$3(callback, objArr);
            }
        });
    }

    @ReactMethod
    public final void requestUrl(@NotNull String url, @Nullable ReadableMap params, @Nullable final Callback callback) throws JSONException {
        Iterator<Map.Entry<String, Object>> entryIterator;
        Intrinsics.checkNotNullParameter(url, "url");
        if (this.mRequest == null) {
            this.mRequest = new RNRequest();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eco_api", params != null ? params.getString("eco_api") : null);
        ReadableMap map = params != null ? params.getMap("params") : null;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && (entryIterator = map.getEntryIterator()) != null) {
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                jSONObject2.put(next.getKey(), next.getValue());
            }
        }
        jSONObject.put("params", jSONObject2.toString());
        RNRequest rNRequest = this.mRequest;
        Intrinsics.checkNotNull(rNRequest);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        rNRequest.requestApi(url, string, new Function1() { // from class: uac
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HostModule.requestUrl$lambda$1(callback, (RNRequest.CommonData) obj);
            }
        }, new Function1() { // from class: vac
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HostModule.requestUrl$lambda$2(callback, (ApiException) obj);
            }
        });
    }
}
