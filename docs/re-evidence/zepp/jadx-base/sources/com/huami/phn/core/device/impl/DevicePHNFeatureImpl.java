package com.huami.phn.core.device.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.base.Failure;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.base.Timeout;
import com.huami.bluetooth.profile.channel.module.sport.PHNApi;
import com.huami.bluetooth.profile.channel.module.sport.PHNErrorCode;
import com.huami.bluetooth.profile.channel.module.sport.PHNModule;
import com.huami.bluetooth.profile.channel.module.sport.PHNSummaryResult;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.core.device.DevicePHNFeature;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.util.Result;
import com.huami.phn.util.SerialzationKtxKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J;\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\u0082\bJ\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\tH\u0082\bJ\r\u0010\r\u001a\u00020\f*\u00020\u000bH\u0082\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010#R\u0016\u0010&\u001a\u00020\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lcom/huami/phn/core/device/impl/DevicePHNFeatureImpl;", "Lcom/huami/phn/core/device/DevicePHNFeature;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNApi;", "Lcom/huami/phn/util/Result;", "Lcom/huami/phn/core/device/BleException;", "action", GoogleApiAvailabilityLight.a, "", "f", "Lcom/huami/bluetooth/profile/channel/module/sport/PHNSummaryResult;", "Lkotlinx/serialization/json/JsonObject;", "e", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "queryVersion", "Lcom/huami/phn/core/model/PHNProjectRecord;", "project", "startPhnProject", "", "rest", "updateRest", "stopPhnProject", "syncPhnResult", "syncPhnUpdate", "Lcom/huami/phn/core/device/DeviceManager;", "a", "Lcom/huami/phn/core/device/DeviceManager;", "manager", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "c", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "()Z", "activeDeviceDisconnected", "b", "activeDeviceUnSupportPhn", "<init>", "(Lcom/huami/phn/core/device/DeviceManager;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DevicePHNFeatureImpl implements DevicePHNFeature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceManager manager;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PHNErrorCode.values().length];
            iArr[PHNErrorCode.SUCCESS.ordinal()] = 1;
            iArr[PHNErrorCode.DEVICE_NO_PHN.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DevicePHNFeatureImpl(@NotNull DeviceManager deviceManager) {
        this.manager = deviceManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a() {
        return !this.manager.isActiveDeviceConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b() {
        return !this.manager.isActiveDeviceSupportPhn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice c() {
        return this.manager.getActiveBleDevice();
    }

    private final <T> Result<T, BleException> d(Function1<? super PHNApi, ? extends Result<? extends T, ? extends BleException>> action) {
        Object objM3845constructorimpl;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(action.invoke(pHNApiLoadApi));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    private final JsonObject e(PHNSummaryResult pHNSummaryResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("percent_completed_week_trimp", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getWeekTrimp())));
        linkedHashMap.put("percent_completed_daily_trimp", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getDayTrimp())));
        if (pHNSummaryResult.getUpdateTime() > 0 && pHNSummaryResult.getUpdateTimeTz() >= -46 && pHNSummaryResult.getUpdateTimeTz() <= 56) {
            linkedHashMap.put("last_update_time", JsonElementKt.JsonPrimitive(Long.valueOf(pHNSummaryResult.getUpdateTime())));
            linkedHashMap.put("last_update_time_zone", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getUpdateTimeTz())));
        }
        return new JsonObject(linkedHashMap);
    }

    private final Result<Boolean, BleException> f(boolean z) {
        return z ? Result.INSTANCE.success$phn_coach_release(Boolean.valueOf(z)) : Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Device Failed!"));
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public HMDeviceSource deviceSource() {
        HMBaseDevice hMBaseDeviceC = c();
        HMDeviceSource mDeviceSource = hMBaseDeviceC == null ? null : hMBaseDeviceC.getMDeviceSource();
        return mDeviceSource == null ? HMDeviceSource.VDEVICE : mDeviceSource;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<String, BleException> queryVersion() {
        Object objM3845constructorimpl;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Result.INSTANCE.success$phn_coach_release(pHNApiLoadApi.getAlgorithmVersion()));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<Boolean, BleException> startPhnProject(@NotNull PHNProjectRecord project) {
        Object objM3845constructorimpl;
        JsonObject result = project.getResult();
        String string = result == null ? null : result.toString();
        if (string == null) {
            return Result.INSTANCE.failure$phn_coach_release(new BleException.InvalidParams("project.result"));
        }
        long timestamp = project.getSetting().getStartDate().getTimestamp() / ((long) 1000);
        List<Integer> list = ArraysKt___ArraysKt.toList(project.getSetting().getRestDays());
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule != null ? pHNModule.loadApi() : null;
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            boolean zStartPHN = pHNApiLoadApi.startPHN(string, list, timestamp);
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(zStartPHN ? Result.INSTANCE.success$phn_coach_release(Boolean.valueOf(zStartPHN)) : Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Device Failed!")));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<Boolean, BleException> stopPhnProject() {
        Object objM3845constructorimpl;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            PHNErrorCode pHNErrorCodeStopPHN = pHNApiLoadApi.stopPHN();
            int i = WhenMappings.$EnumSwitchMapping$0[pHNErrorCodeStopPHN.ordinal()];
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl((i == 1 || i == 2) ? Result.INSTANCE.success$phn_coach_release(Boolean.TRUE) : Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError(pHNErrorCodeStopPHN.getDesc())));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<JsonObject, BleException> syncPhnResult() {
        Object objM3845constructorimpl;
        Result resultFailure$phn_coach_release;
        Object objM3845constructorimpl2;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            ModuleResult<String> moduleResultPullPHN = pHNApiLoadApi.pullPHN();
            if (moduleResultPullPHN instanceof Success) {
                String str = (String) ((Success) moduleResultPullPHN).getData();
                if (str == null) {
                    throw new RuntimeException("None phn result!");
                }
                try {
                    objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(Result.INSTANCE.success$phn_coach_release(JsonElementKt.getJsonObject(SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).parseToJsonElement(str))));
                } catch (Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                ResultKt.throwOnFailure(objM3845constructorimpl2);
                resultFailure$phn_coach_release = (Result) objM3845constructorimpl2;
            } else if (moduleResultPullPHN instanceof Timeout) {
                resultFailure$phn_coach_release = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Timeout!"));
            } else {
                if (!(moduleResultPullPHN instanceof Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                resultFailure$phn_coach_release = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError(((Failure) moduleResultPullPHN).getMsg()));
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(resultFailure$phn_coach_release);
        } catch (Throwable th2) {
            kotlin.Result.Companion companion3 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<JsonObject, BleException> syncPhnUpdate() {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        Result resultFailure$phn_coach_release;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            try {
                objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(pHNApiLoadApi.getSummaryResult());
            } catch (Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                objM3845constructorimpl2 = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl2);
            if (thM3848exceptionOrNullimpl == null) {
                PHNSummaryResult pHNSummaryResult = (PHNSummaryResult) objM3845constructorimpl2;
                Result.Companion companion3 = Result.INSTANCE;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("percent_completed_week_trimp", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getWeekTrimp())));
                linkedHashMap.put("percent_completed_daily_trimp", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getDayTrimp())));
                if (pHNSummaryResult.getUpdateTime() > 0 && pHNSummaryResult.getUpdateTimeTz() >= -46 && pHNSummaryResult.getUpdateTimeTz() <= 56) {
                    linkedHashMap.put("last_update_time", JsonElementKt.JsonPrimitive(Long.valueOf(pHNSummaryResult.getUpdateTime())));
                    linkedHashMap.put("last_update_time_zone", JsonElementKt.JsonPrimitive(Integer.valueOf(pHNSummaryResult.getUpdateTimeTz())));
                }
                resultFailure$phn_coach_release = companion3.success$phn_coach_release(new JsonObject(linkedHashMap));
            } else {
                Result.Companion companion4 = Result.INSTANCE;
                String message = thM3848exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Failed!";
                }
                resultFailure$phn_coach_release = companion4.failure$phn_coach_release(new BleException.DeviceError(message));
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(resultFailure$phn_coach_release);
        } catch (Throwable th2) {
            kotlin.Result.Companion companion5 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM3848exceptionOrNullimpl2 = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl2 != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl2.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }

    @Override // com.huami.phn.core.device.DevicePHNFeature
    @NotNull
    public Result<Boolean, BleException> updateRest(@NotNull int[] rest) {
        Object objM3845constructorimpl;
        Result resultSuccess$phn_coach_release;
        HMBaseDevice hMBaseDeviceC = c();
        if (hMBaseDeviceC == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.NoActiveDevice.INSTANCE);
        }
        if (a()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.DeviceDisconnected.INSTANCE);
        }
        if (b()) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceVersionNoPhn.INSTANCE);
        }
        PHNModule pHNModule = (PHNModule) hMBaseDeviceC.getChannelModule(PHNModule.class);
        PHNApi pHNApiLoadApi = pHNModule == null ? null : pHNModule.loadApi();
        if (pHNApiLoadApi == null) {
            return Result.INSTANCE.failure$phn_coach_release(BleException.ActiveDeviceNoPhn.INSTANCE);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            PHNErrorCode pHNErrorCodeUpdateRestDay = pHNApiLoadApi.updateRestDay(ArraysKt___ArraysKt.toList(rest));
            int i = WhenMappings.$EnumSwitchMapping$0[pHNErrorCodeUpdateRestDay.ordinal()];
            if (i != 1) {
                resultSuccess$phn_coach_release = i != 2 ? Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError(pHNErrorCodeUpdateRestDay.getDesc())) : Result.INSTANCE.failure$phn_coach_release(BleException.NoPhnPlan.INSTANCE);
            } else {
                resultSuccess$phn_coach_release = Result.INSTANCE.success$phn_coach_release(Boolean.TRUE);
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(resultSuccess$phn_coach_release);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            objM3845constructorimpl = Result.INSTANCE.failure$phn_coach_release(new BleException.DeviceError("Ble exception: " + thM3848exceptionOrNullimpl.getMessage()));
        }
        return (Result) objM3845constructorimpl;
    }
}
