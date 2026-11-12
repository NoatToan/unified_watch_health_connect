package com.xiaomi.fitness.health.curse.vm;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.CurseApi;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extension.CurseDeviceSyncExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.data.CurseMixedRecordKt;
import com.xiaomi.fitness.health.curse.data.CurseNotify;
import com.xiaomi.fitness.health.curse.data.CurseNotifyType;
import com.xiaomi.fitness.health.curse.vm.CurseSetVM;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.CurseSetting;
import com.xiaomi.onetrack.c.q;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0003:;<B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\b\u0010\u001b\u001a\u00020\u0019H\u0003J\u0006\u0010\u001c\u001a\u00020\u0019J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0012J\"\u0010\"\u001a\u00020\u00192\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00190$J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002J&\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-J\u0016\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020-J\u0006\u00107\u001a\u00020\u0019J\u000e\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0014R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0014¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "curseApi", "Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "getCurseApi", "()Lcom/xiaomi/fit/fitness/export/api/CurseApi;", "setCurseApi", "(Lcom/xiaomi/fit/fitness/export/api/CurseApi;)V", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "settingManager", "Lcom/xiaomi/fitness/settingitem/DeviceSettingManager;", q.f13857a, "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "firstConfigObserver", "Landroidx/lifecycle/MutableLiveData;", "", "getFirstConfigObserver", "()Landroidx/lifecycle/MutableLiveData;", "firstConfigObserver$delegate", "Lkotlin/Lazy;", "getSetting", "syncFirstConfig", "", "syncDeviceConfig", "saveSetting", "synPredict", "attach", "savedInstanceState", "Landroid/os/Bundle;", "getDeviceSupportNotifySingleNoRemind", "getDeviceSupportEasyPregnancy", "getConfig", "callback", "Lkotlin/Function2;", "checkDeviceConfig", "it", "deviceObserver", "Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM$DeviceRet;", "getDeviceObserver", "setDeviceNotifyEnable", "enable", "inDays", "", "ovumDays", "easyPregnancyDays", "deviceItemObserver", "Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM$DeviceDaysRet;", "getDeviceItemObserver", "setDeviceItemNotify", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "days", "setAppConfig", "setConfigRef", "setting", "DeviceRet", "DeviceDaysRet", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CurseSetVM extends AbsViewModel {
    public static final int DEVICE_CAPABILITY_SUPPORT_SINGLE_NOTIFY = 33554432;

    @NotNull
    public static final String TAG = "CurseNotifyViewModel";
    private CurseSetting config;
    public CurseApi curseApi;

    @Nullable
    private final WearableDeviceModel device = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();

    @NotNull
    private final DeviceSettingManager settingManager = DeviceSettingManager.INSTANCE.getInstance();

    /* JADX INFO: renamed from: firstConfigObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy firstConfigObserver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yb5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseSetVM.firstConfigObserver_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<DeviceRet> deviceObserver = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<DeviceDaysRet> deviceItemObserver = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM$DeviceDaysRet;", "", "type", "Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "success", "", "days", "", "<init>", "(Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;ZI)V", "getType", "()Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;", "setType", "(Lcom/xiaomi/fitness/health/curse/data/CurseNotifyType;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getDays", "()I", "setDays", "(I)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceDaysRet {
        private int days;
        private boolean success;

        @NotNull
        private CurseNotifyType type;

        public DeviceDaysRet(@NotNull CurseNotifyType type, boolean z, int i) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.success = z;
            this.days = i;
        }

        public static /* synthetic */ DeviceDaysRet copy$default(DeviceDaysRet deviceDaysRet, CurseNotifyType curseNotifyType, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                curseNotifyType = deviceDaysRet.type;
            }
            if ((i2 & 2) != 0) {
                z = deviceDaysRet.success;
            }
            if ((i2 & 4) != 0) {
                i = deviceDaysRet.days;
            }
            return deviceDaysRet.copy(curseNotifyType, z, i);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CurseNotifyType getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getDays() {
            return this.days;
        }

        @NotNull
        public final DeviceDaysRet copy(@NotNull CurseNotifyType type, boolean success, int days) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DeviceDaysRet(type, success, days);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceDaysRet)) {
                return false;
            }
            DeviceDaysRet deviceDaysRet = (DeviceDaysRet) other;
            return this.type == deviceDaysRet.type && this.success == deviceDaysRet.success && this.days == deviceDaysRet.days;
        }

        public final int getDays() {
            return this.days;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final CurseNotifyType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + Boolean.hashCode(this.success)) * 31) + Integer.hashCode(this.days);
        }

        public final void setDays(int i) {
            this.days = i;
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }

        public final void setType(@NotNull CurseNotifyType curseNotifyType) {
            Intrinsics.checkNotNullParameter(curseNotifyType, "<set-?>");
            this.type = curseNotifyType;
        }

        @NotNull
        public String toString() {
            return "DeviceDaysRet(type=" + this.type + ", success=" + this.success + ", days=" + this.days + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/CurseSetVM$DeviceRet;", "", "success", "", "enable", "<init>", "(ZZ)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getEnable", "setEnable", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeviceRet {
        private boolean enable;
        private boolean success;

        public DeviceRet(boolean z, boolean z2) {
            this.success = z;
            this.enable = z2;
        }

        public static /* synthetic */ DeviceRet copy$default(DeviceRet deviceRet, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = deviceRet.success;
            }
            if ((i & 2) != 0) {
                z2 = deviceRet.enable;
            }
            return deviceRet.copy(z, z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnable() {
            return this.enable;
        }

        @NotNull
        public final DeviceRet copy(boolean success, boolean enable) {
            return new DeviceRet(success, enable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceRet)) {
                return false;
            }
            DeviceRet deviceRet = (DeviceRet) other;
            return this.success == deviceRet.success && this.enable == deviceRet.enable;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.enable);
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setSuccess(boolean z) {
            this.success = z;
        }

        @NotNull
        public String toString() {
            return "DeviceRet(success=" + this.success + ", enable=" + this.enable + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$checkDeviceConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$checkDeviceConfig$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $beforeMenstruationPush;
        final /* synthetic */ int $beforeOvulationPush;
        final /* synthetic */ int $beforePregnancyPush;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, int i3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$beforeMenstruationPush = i;
            this.$beforePregnancyPush = i2;
            this.$beforeOvulationPush = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new AnonymousClass1(this.$beforeMenstruationPush, this.$beforePregnancyPush, this.$beforeOvulationPush, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            CurseSetting curseSetting = CurseSetVM.this.config;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            companion.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
            CurseManager.INSTANCE.getInstance().readSetting();
            if (CurseSetVM.this.device != null) {
                WearableDeviceModel wearableDeviceModel = CurseSetVM.this.device;
                Intrinsics.checkNotNull(wearableDeviceModel);
                if (CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
                    if (this.$beforeMenstruationPush <= 0) {
                        WearableDeviceModel wearableDeviceModel2 = CurseSetVM.this.device;
                        Intrinsics.checkNotNull(wearableDeviceModel2);
                        CurseDeviceSyncExtKt.curseSetNotify(wearableDeviceModel2, CurseNotifyType.IN, 3);
                    }
                    if (this.$beforePregnancyPush <= 0) {
                        WearableDeviceModel wearableDeviceModel3 = CurseSetVM.this.device;
                        Intrinsics.checkNotNull(wearableDeviceModel3);
                        CurseDeviceSyncExtKt.curseSetNotify(wearableDeviceModel3, CurseNotifyType.EASY_PREGNANCY, 1);
                    }
                    if (this.$beforeOvulationPush <= 0 && CurseSetVM.this.getDeviceSupportEasyPregnancy()) {
                        WearableDeviceModel wearableDeviceModel4 = CurseSetVM.this.device;
                        Intrinsics.checkNotNull(wearableDeviceModel4);
                        CurseDeviceSyncExtKt.curseSetNotify(wearableDeviceModel4, CurseNotifyType.OVUM, 1);
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$getConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$getConfig$1", f = "CurseSetVM.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, CurseSetting, Unit> $callback;
        int label;
        final /* synthetic */ CurseSetVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$getConfig$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/settingitem/settingitem/CurseSetting;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$getConfig$1$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CurseSetting>, Object> {
            int label;

            public C05881(Continuation<? super C05881> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05881(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Object objValueToObject = DeviceSettingManager.INSTANCE.getInstance().readSettingItem("xiaomiwear_app", "curse").valueToObject(CurseSetting.class);
                CurseSetting curseSetting = objValueToObject instanceof CurseSetting ? (CurseSetting) objValueToObject : null;
                return curseSetting == null ? CurseExtKt.m362default(new CurseSetting()) : curseSetting;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CurseSetting> continuation) {
                return ((C05881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24391(Function2<? super Boolean, ? super CurseSetting, Unit> function2, CurseSetVM curseSetVM, Continuation<? super C24391> continuation) {
            super(2, continuation);
            this.$callback = function2;
            this.this$0 = curseSetVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24391(this.$callback, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C05881 c05881 = new C05881(null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, c05881, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                CurseSetVM curseSetVM = this.this$0;
                Function2<Boolean, CurseSetting, Unit> function2 = this.$callback;
                curseSetVM.config = curseSetVM.checkDeviceConfig((CurseSetting) obj);
                CurseSetting curseSetting = curseSetVM.config;
                if (curseSetting == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting = null;
                }
                Logger.i(CurseSetVM.TAG, "readConfig " + curseSetting);
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                CurseSetting curseSetting2 = curseSetVM.config;
                if (curseSetting2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting2 = null;
                }
                function2.invoke(boolBoxBoolean, curseSetting2);
            } catch (Exception e) {
                Logger.e(CurseSetVM.TAG, "readConfig error", e);
                this.$callback.invoke(Boxing.boxBoolean(false), null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setAppConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setAppConfig$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24401(Continuation<? super C24401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24401(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            CurseSetting curseSetting = CurseSetVM.this.config;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            companion.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
            CurseManager.INSTANCE.getInstance().readSetting();
            new CurseNotify().setNotify(true);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $days;
        final /* synthetic */ CurseNotifyType $type;
        int label;
        final /* synthetic */ CurseSetVM this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24411(CurseNotifyType curseNotifyType, int i, CurseSetVM curseSetVM, Continuation<? super C24411> continuation) {
            super(2, continuation);
            this.$type = curseNotifyType;
            this.$days = i;
            this.this$0 = curseSetVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24411(this.$type, this.$days, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseNotifyType curseNotifyType = this.$type;
            int i = this.$days;
            CurseSetting curseSetting = this.this$0.config;
            CurseSetting curseSetting2 = null;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            Logger.i(CurseSetVM.TAG, "setDeviceItemNotify type " + curseNotifyType + ",days " + i + ",config " + curseSetting);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            CurseSetting curseSetting3 = this.this$0.config;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            } else {
                curseSetting2 = curseSetting3;
            }
            companion.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting2);
            CurseManager.INSTANCE.getInstance().readSetting();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$2", f = "CurseSetVM.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $days;
        final /* synthetic */ CurseNotifyType $type;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceItemNotify$2$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $days;
            final /* synthetic */ CurseNotifyType $type;
            int label;
            final /* synthetic */ CurseSetVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CurseSetVM curseSetVM, CurseNotifyType curseNotifyType, int i, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = curseSetVM;
                this.$type = curseNotifyType;
                this.$days = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$type, this.$days, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WearableDeviceModel wearableDeviceModel = this.this$0.device;
                Intrinsics.checkNotNull(wearableDeviceModel);
                CurseDeviceSyncExtKt.curseSetNotify(wearableDeviceModel, this.$type, this.$days);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CurseNotifyType curseNotifyType, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$type = curseNotifyType;
            this.$days = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new AnonymousClass2(this.$type, this.$days, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CurseSetVM.this, this.$type, this.$days, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
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
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceNotifyEnable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceNotifyEnable$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24421(Continuation<? super C24421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24421(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DeviceSettingManager companion = DeviceSettingManager.INSTANCE.getInstance();
            CurseSetting curseSetting = CurseSetVM.this.config;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            companion.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
            CurseManager.INSTANCE.getInstance().readSetting();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceNotifyEnable$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$setDeviceNotifyEnable$2", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24432 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $easyPregnancyDays;
        final /* synthetic */ boolean $enable;
        final /* synthetic */ int $inDays;
        final /* synthetic */ int $ovumDays;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24432(boolean z, int i, int i2, int i3, Continuation<? super C24432> continuation) {
            super(2, continuation);
            this.$enable = z;
            this.$inDays = i;
            this.$ovumDays = i2;
            this.$easyPregnancyDays = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24432(this.$enable, this.$inDays, this.$ovumDays, this.$easyPregnancyDays, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = CurseSetVM.this.device;
            Intrinsics.checkNotNull(wearableDeviceModel);
            CurseDeviceSyncExtKt.curseNotifyEnable(wearableDeviceModel, this.$enable, this.$inDays, this.$ovumDays, this.$easyPregnancyDays);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$synPredict$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$synPredict$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24441(Continuation<? super C24441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24441(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseSetVM.this.saveSetting();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$syncDeviceConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$syncDeviceConfig$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24451(Continuation<? super C24451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24451(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseSetVM.this.saveSetting();
            if (CurseSetVM.this.device == null || !CurseDeviceSyncExtKt.isSupportCurse(CurseSetVM.this.device)) {
                return Unit.INSTANCE;
            }
            if (DeviceModelExtKt.isHuaMi(CurseSetVM.this.device)) {
                CurseSetting curseSetting = CurseSetVM.this.config;
                CurseSetting curseSetting2 = null;
                if (curseSetting == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting = null;
                }
                byte estimatedMenstrualDays = (byte) curseSetting.getEstimatedMenstrualDays();
                CurseSetting curseSetting3 = CurseSetVM.this.config;
                if (curseSetting3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                } else {
                    curseSetting2 = curseSetting3;
                }
                CurseDeviceSyncExtKt.curseSetTotalRecord(CurseSetVM.this.device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.getDeviceSet(estimatedMenstrualDays, (byte) curseSetting2.getMenstrualCycle())));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.curse.vm.CurseSetVM$syncFirstConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.curse.vm.CurseSetVM$syncFirstConfig$1", f = "CurseSetVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C24461(Continuation<? super C24461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CurseSetVM.this.new C24461(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurseSetting curseSetting = CurseSetVM.this.config;
            CurseSetting curseSetting2 = null;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            long jLastMenstrualEnd = CurseExtKt.lastMenstrualEnd(curseSetting);
            CurseSetting curseSetting3 = CurseSetVM.this.config;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting3 = null;
            }
            long lastMenstrualTime = curseSetting3.getLastMenstrualTime();
            long j = 1000;
            long jCurrentTimeMillis = System.currentTimeMillis() / j;
            CurseSetting curseSetting4 = CurseSetVM.this.config;
            if (curseSetting4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting4 = null;
            }
            Record record = new Record(lastMenstrualTime, jLastMenstrualEnd, jCurrentTimeMillis, curseSetting4.getMenstrualCycle(), 0, 16, null);
            CurseSetVM.this.getCurseApi().updateLastModify(System.currentTimeMillis() / j);
            boolean zInsert = CurseSetVM.this.getCurseApi().insert(record);
            CurseSetting curseSetting5 = CurseSetVM.this.config;
            if (curseSetting5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting5 = null;
            }
            Logger.i("CurseSetVM", "syncFirstConfig: ret = " + zInsert + ", setting = " + curseSetting5);
            CurseSetVM.this.getFirstConfigObserver().postValue(Boxing.boxBoolean(zInsert));
            if (!zInsert) {
                return Unit.INSTANCE;
            }
            CurseSetting curseSetting6 = CurseSetVM.this.config;
            if (curseSetting6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting6 = null;
            }
            curseSetting6.setFirst(false);
            CurseSetVM.this.saveSetting();
            if (CurseSetVM.this.device == null || !CurseDeviceSyncExtKt.isSupportCurse(CurseSetVM.this.device)) {
                return Unit.INSTANCE;
            }
            if (DeviceModelExtKt.isHuaMi(CurseSetVM.this.device)) {
                CurseSetting curseSetting7 = CurseSetVM.this.config;
                if (curseSetting7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                    curseSetting7 = null;
                }
                CurseDeviceSyncExtKt.curseSetTotalRecord(CurseSetVM.this.device, CurseMixedRecordKt.genHuaMiRecord(CurseExtKt.getFirstDeviceSet(curseSetting7)));
                WearableDeviceModel wearableDeviceModel = CurseSetVM.this.device;
                CurseSetting curseSetting8 = CurseSetVM.this.config;
                if (curseSetting8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                } else {
                    curseSetting2 = curseSetting8;
                }
                CurseDeviceSyncExtKt.curseSetPredict(wearableDeviceModel, curseSetting2.isPredictEnable());
            } else {
                CurseManager.INSTANCE.getInstance().syncProtoTotalRecord(CurseSetVM.this.device);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CurseSetting checkDeviceConfig(CurseSetting it) {
        boolean deviceSupportNotifySingleNoRemind = getDeviceSupportNotifySingleNoRemind();
        Logger.i(TAG, "checkDeviceConfig supportNoRemind " + deviceSupportNotifySingleNoRemind);
        if (deviceSupportNotifySingleNoRemind) {
            return it;
        }
        int hardwareBeforeMenstruationPush = it.getHardwareBeforeMenstruationPush();
        int hardwareBeforePregnancyPush = it.getHardwareBeforePregnancyPush();
        int hardwareBeforeOvulationPush = it.getHardwareBeforeOvulationPush();
        if (hardwareBeforeMenstruationPush > 0 && hardwareBeforePregnancyPush > 0 && hardwareBeforeOvulationPush > 0) {
            return it;
        }
        this.config = it;
        Logger.i(TAG, "checkDeviceConfig conflict " + hardwareBeforeMenstruationPush + ";" + hardwareBeforePregnancyPush + ";" + hardwareBeforeOvulationPush);
        if (hardwareBeforeMenstruationPush <= 0) {
            CurseSetting curseSetting = this.config;
            if (curseSetting == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting = null;
            }
            curseSetting.setHardwareBeforeMenstruationPush(3);
        }
        if (hardwareBeforePregnancyPush <= 0) {
            CurseSetting curseSetting2 = this.config;
            if (curseSetting2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting2 = null;
            }
            curseSetting2.setHardwareBeforePregnancyPush(1);
        }
        if (hardwareBeforeOvulationPush <= 0) {
            CurseSetting curseSetting3 = this.config;
            if (curseSetting3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
                curseSetting3 = null;
            }
            curseSetting3.setHardwareBeforeOvulationPush(1);
        }
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(hardwareBeforeMenstruationPush, hardwareBeforePregnancyPush, hardwareBeforeOvulationPush, null));
        CurseSetting curseSetting4 = this.config;
        if (curseSetting4 != null) {
            return curseSetting4;
        }
        Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData firstConfigObserver_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSetting() {
        DeviceSettingManager deviceSettingManager = this.settingManager;
        CurseSetting curseSetting = this.config;
        CurseSetting curseSetting2 = null;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            curseSetting = null;
        }
        deviceSettingManager.saveDeviceSetItem(false, "xiaomiwear_app", "curse", curseSetting);
        DeviceSettingManager deviceSettingManager2 = this.settingManager;
        CurseSetting curseSetting3 = this.config;
        if (curseSetting3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        } else {
            curseSetting2 = curseSetting3;
        }
        deviceSettingManager2.sendUserSettingItem("curse", curseSetting2, false);
        CurseManager.INSTANCE.getInstance().initData("curseSetVM");
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void getConfig(@NotNull Function2<? super Boolean, ? super CurseSetting, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C24391(callback, this, null), 2, null);
    }

    @NotNull
    public final CurseApi getCurseApi() {
        CurseApi curseApi = this.curseApi;
        if (curseApi != null) {
            return curseApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("curseApi");
        return null;
    }

    @NotNull
    public final MutableLiveData<DeviceDaysRet> getDeviceItemObserver() {
        return this.deviceItemObserver;
    }

    @NotNull
    public final MutableLiveData<DeviceRet> getDeviceObserver() {
        return this.deviceObserver;
    }

    public final boolean getDeviceSupportEasyPregnancy() {
        if (this.device == null) {
            return false;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        int deviceCapability = deviceManagerExtKt.getDeviceCapability(wearableDeviceModel.getDid());
        boolean z = (deviceCapability & 16384) == 16384;
        Logger.i(TAG, "capability " + deviceCapability + ";deviceSupportEasyPregnancy " + z);
        return z;
    }

    public final boolean getDeviceSupportNotifySingleNoRemind() {
        if (this.device == null) {
            return false;
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = this.device;
        Intrinsics.checkNotNull(wearableDeviceModel);
        int deviceCapability = deviceManagerExtKt.getDeviceCapability(wearableDeviceModel.getDid());
        boolean z = (deviceCapability & 33554432) == 33554432;
        Logger.i(TAG, "capability " + deviceCapability + ";deviceSupportNotifySingleNoRemind " + z);
        return z;
    }

    @NotNull
    public final MutableLiveData<Boolean> getFirstConfigObserver() {
        return (MutableLiveData) this.firstConfigObserver.getValue();
    }

    @NotNull
    public final CurseSetting getSetting() {
        CurseSetting setting = CurseManager.INSTANCE.getInstance().getSetting();
        if (setting == null) {
            setting = CurseExtKt.m362default(new CurseSetting());
        }
        this.config = setting;
        if (setting != null) {
            return setting;
        }
        Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
        return null;
    }

    public final void setAppConfig() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C24401(null));
    }

    public final void setConfigRef(@NotNull CurseSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.config = setting;
    }

    public final void setCurseApi(@NotNull CurseApi curseApi) {
        Intrinsics.checkNotNullParameter(curseApi, "<set-?>");
        this.curseApi = curseApi;
    }

    public final void setDeviceItemNotify(@NotNull CurseNotifyType type, int days) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.deviceItemObserver.setValue(new DeviceDaysRet(type, true, days));
        ScopeExtKt.scope(Dispatchers.getIO(), new C24411(type, days, this, null));
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel == null || wearableDeviceModel == null || !CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass2(type, days, null), 3, null);
    }

    public final void setDeviceNotifyEnable(boolean enable, int inDays, int ovumDays, int easyPregnancyDays) {
        Logger.i(TAG, "setDeviceNotifyEnable enable " + enable + ";inDays " + inDays + ";ovumDays " + ovumDays + ";easyPregnancyDays " + easyPregnancyDays);
        CurseSetting curseSetting = this.config;
        if (curseSetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException(q.f13857a);
            curseSetting = null;
        }
        curseSetting.setHardwarePush(enable);
        this.deviceObserver.setValue(new DeviceRet(true, enable));
        ScopeExtKt.scope(Dispatchers.getIO(), new C24421(null));
        WearableDeviceModel wearableDeviceModel = this.device;
        if (wearableDeviceModel == null || wearableDeviceModel == null || !CurseDeviceSyncExtKt.isSupportCurse(wearableDeviceModel)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24432(enable, inDays, ovumDays, easyPregnancyDays, null), 2, null);
    }

    public final void synPredict() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24441(null), 2, null);
    }

    public final void syncDeviceConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24451(null), 2, null);
    }

    public final void syncFirstConfig() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C24461(null), 2, null);
    }
}
