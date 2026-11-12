package com.xiaomi.fitness.devicesettings.base.clock;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mi.health.sleep.SleepDataHelperKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel;
import com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSetting;
import com.xiaomi.fitness.settingitem.settingitem.AlarmSettingItem;
import defpackage.eu6;
import defpackage.ld8;
import defpackage.wzi;
import defpackage.y08;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u0001:\u000201B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\tJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u000eJ\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tH\u0002J0\u0010#\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u001a\u0010%\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r\u0012\u0004\u0012\u00020\u001b0&J\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\tJ\u0010\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+J\u000e\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.J\u001a\u0010/\u001a\u00020\u001b2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001b0&R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mSupportMaxClocks", "", "supportBleIntelligence", "", "supportBleWorkHoliday", "alarmList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "getAlarmList", "()Landroidx/lifecycle/MutableLiveData;", "alarmList$delegate", "Lkotlin/Lazy;", "switchStatus", "getSwitchStatus", "addOrUpdateState", "getAddOrUpdateState", "getSupportMax", "getSupportBleIntelligence", "getSupportBleWorkHoliday", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "getAlarms", "syncRemoteAlarmData", "isChecked", "item", "changeAlarmItem", "deleteAlarms", "list", "callback", "Lkotlin/Function1;", "addOrUpdateAlarmData", "isAdd", "hasScreenLockPwd", "context", "Landroid/content/Context;", "hasClockInstalled", "packageManager", "Landroid/content/pm/PackageManager;", "supportLinkageMiuiAlarm", "AlarmClockList", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlarmClockViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlarmClockViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class AlarmClockViewModel extends AbsViewModel {
    private static final int MAX_ACCOUNT = 10;
    public static final int SWITCH_FINISH = 3;
    public static final int SWITCH_PREPARE = 2;
    public static final int SWITCH_RESET = 1;

    @NotNull
    public static final String TAG = "AlarmClockViewModel";

    @Nullable
    private WearableDeviceModel deviceModel;
    private int mSupportMaxClocks;
    private boolean supportBleIntelligence;
    private boolean supportBleWorkHoliday;

    /* JADX INFO: renamed from: alarmList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy alarmList = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: s31
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlarmClockViewModel.alarmList_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<Integer> switchStatus = new MutableLiveData<>(-1);

    @NotNull
    private final MutableLiveData<Boolean> addOrUpdateState = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/AlarmClockViewModel$AlarmClockList;", "", "viewType", "", "item", "Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "<init>", "(ILcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;)V", "getViewType", "()I", "getItem", "()Lcom/xiaomi/fitness/settingitem/settingitem/AlarmSettingItem;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlarmClockList {

        @Nullable
        private final AlarmSettingItem item;
        private final int viewType;

        public AlarmClockList(int i, @Nullable AlarmSettingItem alarmSettingItem) {
            this.viewType = i;
            this.item = alarmSettingItem;
        }

        public static /* synthetic */ AlarmClockList copy$default(AlarmClockList alarmClockList, int i, AlarmSettingItem alarmSettingItem, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = alarmClockList.viewType;
            }
            if ((i2 & 2) != 0) {
                alarmSettingItem = alarmClockList.item;
            }
            return alarmClockList.copy(i, alarmSettingItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getViewType() {
            return this.viewType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AlarmSettingItem getItem() {
            return this.item;
        }

        @NotNull
        public final AlarmClockList copy(int viewType, @Nullable AlarmSettingItem item) {
            return new AlarmClockList(viewType, item);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlarmClockList)) {
                return false;
            }
            AlarmClockList alarmClockList = (AlarmClockList) other;
            return this.viewType == alarmClockList.viewType && Intrinsics.areEqual(this.item, alarmClockList.item);
        }

        @Nullable
        public final AlarmSettingItem getItem() {
            return this.item;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.viewType) * 31;
            AlarmSettingItem alarmSettingItem = this.item;
            return iHashCode + (alarmSettingItem == null ? 0 : alarmSettingItem.hashCode());
        }

        @NotNull
        public String toString() {
            return "AlarmClockList(viewType=" + this.viewType + ", item=" + this.item + ")";
        }

        public /* synthetic */ AlarmClockList(int i, AlarmSettingItem alarmSettingItem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : alarmSettingItem);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$addOrUpdateAlarmData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$addOrUpdateAlarmData$1", f = "AlarmClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isAdd;
        final /* synthetic */ AlarmSettingItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AlarmSettingItem alarmSettingItem, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$item = alarmSettingItem;
            this.$isAdd = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlarmClockViewModel.this.new AnonymousClass1(this.$item, this.$isAdd, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = AlarmClockViewModel.this.deviceModel;
            Intrinsics.checkNotNull(wearableDeviceModel);
            final AlarmSettingItem alarmSettingItem = this.$item;
            final boolean z = this.$isAdd;
            final AlarmClockViewModel alarmClockViewModel = AlarmClockViewModel.this;
            DeviceModelExtKt.addOrUpdateAlarmData(wearableDeviceModel, alarmSettingItem, z, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel.addOrUpdateAlarmData.1.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.e(AlarmClockViewModel.TAG, "addOrUpdateAlarmData: code = " + errorCode);
                    ToastUtil.showShortToast(z ? wzi.B1 : wzi.P);
                    alarmClockViewModel.getAddOrUpdateState().postValue(Boolean.FALSE);
                }

                @Override // defpackage.eu6
                public /* bridge */ /* synthetic */ void onResult(Boolean bool) {
                    onResult(bool.booleanValue());
                }

                public void onResult(boolean result) {
                    Logger.e(AlarmClockViewModel.TAG, "addOrUpdateAlarmData: result = " + result);
                    if (result) {
                        ld8.c().l(new y08(z, alarmSettingItem));
                    } else {
                        ToastUtil.showShortToast(z ? wzi.B1 : wzi.P);
                    }
                    alarmClockViewModel.getAddOrUpdateState().postValue(Boolean.valueOf(result));
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$getAlarms$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$getAlarms$1", f = "AlarmClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20041(Continuation<? super C20041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlarmClockViewModel.this.new C20041(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = AlarmClockViewModel.this.deviceModel;
            if (wearableDeviceModel != null) {
                final AlarmClockViewModel alarmClockViewModel = AlarmClockViewModel.this;
                DeviceModelExtKt.getAlarmClocks(wearableDeviceModel, new eu6<AlarmSetting>() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel.getAlarms.1.1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        Logger.e(AlarmClockViewModel.TAG, "getAlarmClocks error " + errorCode);
                        ToastUtil.showShortToast(wzi.i2);
                        alarmClockViewModel.getAlarmList().postValue(CollectionsKt__CollectionsKt.emptyList());
                    }

                    @Override // defpackage.eu6
                    public void onResult(AlarmSetting result) {
                        if (result == null) {
                            onError(-1);
                            return;
                        }
                        AlarmClockViewModel alarmClockViewModel2 = alarmClockViewModel;
                        Logger.d(AlarmClockViewModel.TAG, "getAlarmClocks " + result);
                        alarmClockViewModel2.mSupportMaxClocks = result.getSupportMaxClocks();
                        alarmClockViewModel2.supportBleIntelligence = result.isSupportIntelligence();
                        alarmClockViewModel2.supportBleWorkHoliday = result.isSupportHoliday();
                        alarmClockViewModel2.getAlarmList().postValue(result.getAlarmItems());
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$supportLinkageMiuiAlarm$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$supportLinkageMiuiAlarm$1", f = "AlarmClockViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20051(Function1<? super Boolean, Unit> function1, Continuation<? super C20051> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AlarmClockViewModel.this.new C20051(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String mac;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            WearableDeviceModel wearableDeviceModel = AlarmClockViewModel.this.deviceModel;
            if (wearableDeviceModel == null || (mac = com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
                mac = "";
            }
            HuamiApiCaller huaMiApiCaller = deviceManagerExtKt.getHuaMiApiCaller(mac);
            boolean z = false;
            if (huaMiApiCaller != null && huaMiApiCaller.supportLinkageMiuiAlarm()) {
                z = true;
            }
            Logger.i(AlarmClockViewModel.TAG, "supportLinkageMiuiAlarm: " + z);
            this.$callback.invoke2(Boxing.boxBoolean(z));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData alarmList_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeAlarmItem(AlarmSettingItem item, boolean isChecked) {
        if (isChecked) {
            item.setEnable(true);
            item.setNextAlarmTimeIfReOpen();
        } else {
            item.setEnable(false);
            item.setNextAlarmTimeLong(0L);
        }
    }

    public final void addOrUpdateAlarmData(@NotNull AlarmSettingItem item, boolean isAdd) {
        Intrinsics.checkNotNullParameter(item, "item");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (wearableDeviceModel.getIsDeviceConnected()) {
                ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(item, isAdd, null));
                return;
            }
        }
        this.addOrUpdateState.postValue(null);
        ToastUtil.showShortToast(wzi.q);
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void deleteAlarms(@NotNull List<? extends AlarmSettingItem> list, @NotNull Function1<? super List<? extends AlarmSettingItem>, Unit> callback) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(callback, "callback");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AlarmClockViewModel$deleteAlarms$1$1(wearableDeviceModel, list, callback, null), 2, null);
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getAddOrUpdateState() {
        return this.addOrUpdateState;
    }

    @NotNull
    public final MutableLiveData<List<AlarmSettingItem>> getAlarmList() {
        return (MutableLiveData) this.alarmList.getValue();
    }

    public final void getAlarms() {
        if (this.deviceModel == null) {
            ToastUtil.showShortToast(wzi.e2);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C20041(null), 2, null);
        }
    }

    public final boolean getSupportBleIntelligence() {
        return this.supportBleIntelligence;
    }

    public final boolean getSupportBleWorkHoliday() {
        return this.supportBleWorkHoliday;
    }

    public final int getSupportMax() {
        int i = this.mSupportMaxClocks;
        if (i == 0) {
            return 10;
        }
        return i;
    }

    @NotNull
    public final MutableLiveData<Integer> getSwitchStatus() {
        return this.switchStatus;
    }

    public final boolean hasClockInstalled(@NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        try {
            if (!RomUtils.isXiaomi()) {
                return false;
            }
            int i = packageManager.getPackageInfo(SleepDataHelperKt.DEAK_CLOCK_PKG, 0).versionCode;
            Logger.i(TAG, "get alarm clock version: " + i);
            if (AppUtil.INSTANCE.isPlayChannel()) {
                if (i < 13010101) {
                    return false;
                }
            } else if (i < 13010901) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            Logger.i(TAG, "clock has been uninstall");
            return false;
        }
    }

    public final boolean hasScreenLockPwd(@Nullable Context context) {
        Object systemService = context != null ? context.getSystemService("keyguard") : null;
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        return ((KeyguardManager) systemService).isKeyguardSecure();
    }

    public final void supportLinkageMiuiAlarm(@NotNull Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20051(callback, null), 3, null);
    }

    public final void syncRemoteAlarmData(final boolean isChecked, @NotNull final AlarmSettingItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            if (!wearableDeviceModel.getIsDeviceConnected()) {
                ToastUtil.showShortToast(wzi.f2);
                this.switchStatus.postValue(1);
            } else {
                this.switchStatus.postValue(2);
                changeAlarmItem(item, isChecked);
                DeviceModelExtKt.syncRemoteAlarmData(wearableDeviceModel, item, isChecked, new eu6<Boolean>() { // from class: com.xiaomi.fitness.devicesettings.base.clock.AlarmClockViewModel$syncRemoteAlarmData$1$1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                        this.this$0.changeAlarmItem(item, !isChecked);
                        ToastUtil.showShortToast(wzi.i2);
                        this.this$0.getSwitchStatus().postValue(1);
                        this.this$0.getSwitchStatus().postValue(3);
                    }

                    @Override // defpackage.eu6
                    public void onResult(Boolean result) {
                        if (Intrinsics.areEqual(result, Boolean.FALSE)) {
                            this.this$0.changeAlarmItem(item, !isChecked);
                            this.this$0.getSwitchStatus().postValue(1);
                            ToastUtil.showShortToast(wzi.i2);
                        }
                        this.this$0.getSwitchStatus().postValue(3);
                    }
                });
            }
        }
    }
}
