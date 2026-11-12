package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
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
import com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.db.entity.SettingItemEntity;
import com.xiaomi.fitness.settingitem.settingitem.WorldclockSetting;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import defpackage.k14;
import defpackage.r14;
import defpackage.s7r;
import defpackage.za1;
import java.time.Instant;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0018\u001a\u00020\r2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aJ\u0006\u0010\u001c\u001a\u00020\rJ(\u0010\u001d\u001a\u00020\r2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\b\u0010 \u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\rH\u0002J\b\u0010%\u001a\u00020\rH\u0002J\u0018\u0010&\u001a\u00020\r2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0002J\u0018\u0010'\u001a\u00020\r2\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aH\u0002J(\u0010(\u001a\u00020\r2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J(\u0010.\u001a\u00020\r2\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002J \u0010/\u001a\u0002002\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a2\u0006\u00101\u001a\u000202H\u0002J\u0012\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u000105H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR)\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00100\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0016\u0010\u0012R'\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b\"\u0010\u0012R!\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b,\u0010\u0012¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "initCityMap", "", "cityIdListRet", "Landroidx/lifecycle/MutableLiveData;", "", "getCityIdListRet", "()Landroidx/lifecycle/MutableLiveData;", "cityIdListRet$delegate", "syncResult", "", "getSyncResult", "syncResult$delegate", "deleteWordCLockData", "list", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "loadWordClockData", "syncWorldTime", "entireList", "addList", "getWorldClocks", "getWorldClocksRet", "getGetWorldClocksRet", "getWorldClocksRet$delegate", "getWorldClocksHuami", "getWorldClocksDefault", "deleteWordCLockDataHuami", "deleteWordCLockDataDefault", "syncWorldTime2Huami", "dataList", "setBleResult", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockViewModel$SetBleResult;", "getSetBleResult", "setBleResult$delegate", "syncWorldTime2Libai", "convertTimeZoneItem2WorldTime", "Lcom/xiaomi/hm/health/bt/profile/worldclock/WorldTime;", "i", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "SetBleResult", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorldClockViewModel extends AbsViewModel {

    @NotNull
    private final String TAG = "WorldClockViewModel";

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: por
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorldClockViewModel.deviceModel_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: cityIdListRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cityIdListRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorldClockViewModel.cityIdListRet_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: syncResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ror
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorldClockViewModel.syncResult_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: getWorldClocksRet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getWorldClocksRet = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: sor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorldClockViewModel.getWorldClocksRet_delegate$lambda$3();
        }
    });

    /* JADX INFO: renamed from: setBleResult$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy setBleResult = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tor
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WorldClockViewModel.setBleResult_delegate$lambda$4();
        }
    });

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/worldclock/WorldClockViewModel$SetBleResult;", "", "code", "", "addList", "", "Lcom/xiaomi/fitness/devicesettings/base/worldclock/TimeZoneItem;", "<init>", "(ILjava/util/List;)V", "getCode", "()I", "getAddList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetBleResult {

        @NotNull
        private final List<TimeZoneItem> addList;
        private final int code;

        public SetBleResult(int i, @NotNull List<TimeZoneItem> addList) {
            Intrinsics.checkNotNullParameter(addList, "addList");
            this.code = i;
            this.addList = addList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SetBleResult copy$default(SetBleResult setBleResult, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setBleResult.code;
            }
            if ((i2 & 2) != 0) {
                list = setBleResult.addList;
            }
            return setBleResult.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final List<TimeZoneItem> component2() {
            return this.addList;
        }

        @NotNull
        public final SetBleResult copy(int code, @NotNull List<TimeZoneItem> addList) {
            Intrinsics.checkNotNullParameter(addList, "addList");
            return new SetBleResult(code, addList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetBleResult)) {
                return false;
            }
            SetBleResult setBleResult = (SetBleResult) other;
            return this.code == setBleResult.code && Intrinsics.areEqual(this.addList, setBleResult.addList);
        }

        @NotNull
        public final List<TimeZoneItem> getAddList() {
            return this.addList;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return (Integer.hashCode(this.code) * 31) + this.addList.hashCode();
        }

        @NotNull
        public String toString() {
            return "SetBleResult(code=" + this.code + ", addList=" + this.addList + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$getWorldClocksHuami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$getWorldClocksHuami$1", f = "WorldClockViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$getWorldClocksHuami$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$getWorldClocksHuami$1$1", f = "WorldClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ WorldClockViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04501(WorldClockViewModel worldClockViewModel, Continuation<? super C04501> continuation) {
                super(2, continuation);
                this.this$0 = worldClockViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04501(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String jsonValue;
                WorldclockSetting worldclockSetting;
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
                Intrinsics.checkNotNull(deviceModel);
                SettingItemEntity settingItem = companion.readSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_WORLDCLOCK);
                ArrayList arrayList = new ArrayList();
                if (settingItem != null && (jsonValue = settingItem.getJsonValue()) != null && jsonValue.length() != 0 && (worldclockSetting = (WorldclockSetting) settingItem.valueToObject(WorldclockSetting.class)) != null) {
                    List<String> cityIds = worldclockSetting.getCityIds();
                    Intrinsics.checkNotNullExpressionValue(cityIds, "getCityIds(...)");
                    int size = cityIds.size();
                    for (int i = 0; i < size; i++) {
                        String str = cityIds.get(i);
                        CityTimeZoneHelper companion2 = CityTimeZoneHelper.INSTANCE.getInstance();
                        TimeZoneItem cityTimezoneItemById = companion2 != null ? companion2.getCityTimezoneItemById(str) : null;
                        if (cityTimezoneItemById != null) {
                            arrayList.add(cityTimezoneItemById);
                        }
                    }
                }
                Logger.i(this.this$0.TAG, "getWorldClocksHuami size: " + arrayList.size());
                this.this$0.getGetWorldClocksRet().postValue(arrayList);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C20221(Continuation<? super C20221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WorldClockViewModel.this.new C20221(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04501 c04501 = new C04501(WorldClockViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04501, this) == coroutine_suspended) {
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
            return ((C20221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$syncWorldTime2Huami$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$syncWorldTime2Huami$1", f = "WorldClockViewModel.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HuamiApiCaller $huamiDevice;
        final /* synthetic */ List<WorldTime> $worldTimeList;
        int label;
        final /* synthetic */ WorldClockViewModel this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$syncWorldTime2Huami$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel$syncWorldTime2Huami$1$1", f = "WorldClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ HuamiApiCaller $huamiDevice;
            final /* synthetic */ List<WorldTime> $worldTimeList;
            int label;
            final /* synthetic */ WorldClockViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04511(HuamiApiCaller huamiApiCaller, List<WorldTime> list, WorldClockViewModel worldClockViewModel, Continuation<? super C04511> continuation) {
                super(2, continuation);
                this.$huamiDevice = huamiApiCaller;
                this.$worldTimeList = list;
                this.this$0 = worldClockViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04511(this.$huamiDevice, this.$worldTimeList, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                HuamiApiCaller huamiApiCaller = this.$huamiDevice;
                if (Intrinsics.areEqual(huamiApiCaller != null ? Boxing.boxBoolean(huamiApiCaller.setWorldClock(this.$worldTimeList)) : null, Boxing.boxBoolean(true))) {
                    WorldclockSetting worldclockSetting = new WorldclockSetting();
                    ArrayList arrayList = new ArrayList();
                    int size = this.$worldTimeList.size();
                    for (int i = 0; i < size; i++) {
                        String cityCode = this.$worldTimeList.get(i).getCityCode();
                        Intrinsics.checkNotNullExpressionValue(cityCode, "getCityCode(...)");
                        arrayList.add(cityCode);
                    }
                    worldclockSetting.setCityIds(arrayList);
                    DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
                    WearableDeviceModel deviceModel = this.this$0.getDeviceModel();
                    Intrinsics.checkNotNull(deviceModel);
                    companion.sendSettingItem(deviceModel.getDid(), DeviceSettingConfigKey.BIG_KEY_WORLDCLOCK, worldclockSetting);
                    this.this$0.getSyncResult().postValue(Boxing.boxBoolean(true));
                } else {
                    this.this$0.getSyncResult().postValue(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20231(HuamiApiCaller huamiApiCaller, List<WorldTime> list, WorldClockViewModel worldClockViewModel, Continuation<? super C20231> continuation) {
            super(2, continuation);
            this.$huamiDevice = huamiApiCaller;
            this.$worldTimeList = list;
            this.this$0 = worldClockViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20231(this.$huamiDevice, this.$worldTimeList, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04511 c04511 = new C04511(this.$huamiDevice, this.$worldTimeList, this.this$0, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04511, this) == coroutine_suspended) {
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
            return ((C20231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData cityIdListRet_delegate$lambda$1() {
        return new MutableLiveData();
    }

    private final WorldTime convertTimeZoneItem2WorldTime(List<TimeZoneItem> dataList, int i) {
        TimeZoneItem timeZoneItem = dataList.get(i);
        WorldTime worldTime = new WorldTime();
        worldTime.setCity(timeZoneItem != null ? timeZoneItem.c() : null);
        worldTime.setCityCode(timeZoneItem != null ? timeZoneItem.d() : null);
        worldTime.setCountry(timeZoneItem != null ? timeZoneItem.e() : null);
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneItem != null ? timeZoneItem.i() : null);
        worldTime.setTimeZone(timeZone.getRawOffset());
        worldTime.setIndex(i);
        if (timeZone.useDaylightTime()) {
            boolean zInDaylightTime = timeZone.inDaylightTime(new Date());
            if (zInDaylightTime) {
                worldTime.setDaylightState(1);
            } else {
                worldTime.setDaylightState(2);
            }
            ZoneRules rules = timeZone.toZoneId().getRules();
            worldTime.setOffsetTransitionDateTime(rules.nextTransition(Instant.now()).getDateTimeBefore().atZone(timeZone.toZoneId()).toEpochSecond());
            if (zInDaylightTime) {
                worldTime.setDaylightDuration((int) (rules.previousTransition(Instant.now()).getDuration().getSeconds() / ((long) 60)));
            } else {
                worldTime.setDaylightDuration((int) (rules.nextTransition(Instant.now()).getDuration().getSeconds() / ((long) 60)));
            }
        } else {
            worldTime.setDaylightState(0);
        }
        return worldTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void deleteWordCLockDataDefault(List<TimeZoneItem> list) {
        String strD;
        if (getDeviceModel() == null) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 13;
        final ArrayList arrayList = new ArrayList();
        for (TimeZoneItem timeZoneItem : list) {
            if (timeZoneItem == null || (strD = timeZoneItem.d()) == null) {
                strD = "";
            }
            arrayList.add(strD);
        }
        int size = arrayList.size();
        r14 r14Var = new r14();
        r14Var.c = new String[size];
        for (int i = 0; i < size; i++) {
            r14Var.c[i] = arrayList.get(i);
        }
        k14 k14Var = new k14();
        k14Var.N(r14Var);
        s7rVar.P(k14Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel.deleteWordCLockDataDefault.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WorldClockViewModel.this.TAG, "wearOS deleteWordCLockDataDefault fail: " + code);
                WorldClockViewModel.this.getSyncResult().postValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result != null) {
                    s7r packet = result.getPacket();
                    k14 k14VarQ = packet != null ? packet.q() : null;
                    if (k14VarQ != null && k14VarQ.A() && k14VarQ.y() == 0) {
                        WorldClockViewModel.this.getCityIdListRet().postValue(arrayList);
                        WorldClockViewModel.this.getSyncResult().postValue(Boolean.TRUE);
                    }
                    Logger.i(WorldClockViewModel.this.TAG, "wearOS deleteWordCLockDataDefault success: " + (k14VarQ != null ? Integer.valueOf(k14VarQ.y()) : null));
                }
            }
        }, 0, 8, null);
    }

    private final void deleteWordCLockDataHuami(List<TimeZoneItem> list) {
        String strD;
        if (getDeviceModel() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TimeZoneItem timeZoneItem : list) {
            if (timeZoneItem == null || (strD = timeZoneItem.d()) == null) {
                strD = "";
            }
            arrayList.add(strD);
        }
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        if (deviceModel.getIsDeviceConnected()) {
            getCityIdListRet().postValue(arrayList);
        } else {
            getCityIdListRet().postValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    private final void getWorldClocks() {
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            getWorldClocksHuami();
        } else {
            getWorldClocksDefault();
        }
    }

    private final void getWorldClocksDefault() {
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 10;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel.getWorldClocksDefault.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(WorldClockViewModel.this.TAG, "getWorldClocksDefault fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                TimeZoneItem cityTimezoneItemById;
                s7r packet;
                k14 k14VarQ;
                r14 r14VarX;
                String[] strArr = (result == null || (packet = result.getPacket()) == null || (k14VarQ = packet.q()) == null || (r14VarX = k14VarQ.x()) == null) ? null : r14VarX.c;
                if (strArr != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : strArr) {
                        CityTimeZoneHelper companion = CityTimeZoneHelper.INSTANCE.getInstance();
                        if (companion != null) {
                            Intrinsics.checkNotNull(str);
                            cityTimezoneItemById = companion.getCityTimezoneItemById(str);
                        } else {
                            cityTimezoneItemById = null;
                        }
                        if (cityTimezoneItemById != null) {
                            arrayList.add(cityTimezoneItemById);
                        }
                    }
                    Logger.i(WorldClockViewModel.this.TAG, "getWorldClocksDefault size: " + arrayList.size());
                    WorldClockViewModel.this.getGetWorldClocksRet().postValue(arrayList);
                }
            }
        }, 0, 8, null);
    }

    private final void getWorldClocksHuami() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20221(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData getWorldClocksRet_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData setBleResult_delegate$lambda$4() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData syncResult_delegate$lambda$2() {
        return new MutableLiveData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncWorldTime$default(WorldClockViewModel worldClockViewModel, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = null;
        }
        worldClockViewModel.syncWorldTime(list, list2);
    }

    private final void syncWorldTime2Huami(List<TimeZoneItem> dataList, List<TimeZoneItem> addList) {
        if (getDeviceModel() == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (addList != null) {
            Iterator<TimeZoneItem> it = addList.iterator();
            while (it.hasNext()) {
                dataList.add(0, it.next());
            }
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(convertTimeZoneItem2WorldTime(dataList, i));
        }
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20231(com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.getHuamiDevice(deviceModel), arrayList, this, null), 3, null);
    }

    private final void syncWorldTime2Libai(List<TimeZoneItem> dataList, final List<TimeZoneItem> addList) {
        List<TimeZoneItem> list = addList;
        if (list == null || list.isEmpty()) {
            Logger.i(this.TAG, "add empty, return");
            getSetBleResult().postValue(new SetBleResult(255, new ArrayList()));
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 17;
        s7rVar.f = 11;
        r14 r14Var = new r14();
        r14Var.c = new String[addList.size()];
        int size = addList.size();
        for (int i = 0; i < size; i++) {
            r14Var.c[i] = addList.get(i).d;
        }
        k14 k14Var = new k14();
        k14Var.N(r14Var);
        s7rVar.P(k14Var);
        Logger.i(this.TAG, "syncWorldTime2Libai: " + s7rVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.worldclock.WorldClockViewModel.syncWorldTime2Libai.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                WorldClockViewModel.this.getSetBleResult().postValue(new SetBleResult(code, addList));
                Logger.i(WorldClockViewModel.this.TAG, "wearOS syncWorldTime2Libai fail: " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                if (result != null) {
                    s7r packet = result.getPacket();
                    k14 k14VarQ = packet != null ? packet.q() : null;
                    if (k14VarQ == null || !k14VarQ.A()) {
                        onError(did, type, 255);
                    } else {
                        WorldClockViewModel.this.getSetBleResult().postValue(new SetBleResult(k14VarQ.y(), addList));
                    }
                    Logger.i(WorldClockViewModel.this.TAG, "wearOS syncWorldTime2Libai success: " + (k14VarQ != null ? Integer.valueOf(k14VarQ.y()) : null));
                }
            }
        }, 0, 8, null);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteWordCLockData(@NotNull List<TimeZoneItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (getDeviceModel() == null) {
            getSyncResult().postValue(Boolean.FALSE);
            return;
        }
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            deleteWordCLockDataHuami(list);
        } else {
            deleteWordCLockDataDefault(list);
        }
    }

    @NotNull
    public final MutableLiveData<List<String>> getCityIdListRet() {
        return (MutableLiveData) this.cityIdListRet.getValue();
    }

    @NotNull
    public final MutableLiveData<List<TimeZoneItem>> getGetWorldClocksRet() {
        return (MutableLiveData) this.getWorldClocksRet.getValue();
    }

    @NotNull
    public final MutableLiveData<SetBleResult> getSetBleResult() {
        return (MutableLiveData) this.setBleResult.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> getSyncResult() {
        return (MutableLiveData) this.syncResult.getValue();
    }

    public final void initCityMap() {
        CityTimeZoneHelper companion = CityTimeZoneHelper.INSTANCE.getInstance();
        if (companion != null) {
            companion.init(ApplicationExtKt.getApplication());
        }
        try {
            za1.a(ApplicationExtKt.getApplication());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void loadWordClockData() {
        if (getDeviceModel() == null) {
            return;
        }
        getWorldClocks();
    }

    public final void syncWorldTime(@NotNull List<TimeZoneItem> entireList, @Nullable List<TimeZoneItem> addList) {
        Intrinsics.checkNotNullParameter(entireList, "entireList");
        if (getDeviceModel() == null) {
            return;
        }
        WearableDeviceModel deviceModel = getDeviceModel();
        Intrinsics.checkNotNull(deviceModel);
        if (DeviceModelExtKt.isHuaMi(deviceModel)) {
            syncWorldTime2Huami(entireList, addList);
        } else {
            syncWorldTime2Libai(entireList, addList);
        }
    }
}
