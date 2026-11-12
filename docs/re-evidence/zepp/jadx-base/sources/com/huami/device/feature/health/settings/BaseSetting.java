package com.huami.device.feature.health.settings;

import androidx.annotation.CallSuper;
import androidx.exifinterface.media.ExifInterface;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.init.BaseHealthInit;
import com.huami.device.feature.health.model.HealthSettingData;
import com.huami.device.feature.health.settings.device.OnDeviceConnect;
import com.huami.device.feature.health.settings.device.ReadFromDevice;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.settings.device.SyncConfigToDevice;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u001f¢\u0006\u0004\b9\u0010:J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fJ\u0013\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\fH\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u001a\u001a\u00020\u0010R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u00100\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00028\u0000018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001b\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b5\u0010\u0006R\u0015\u00108\u001a\u0004\u0018\u00010\b8F@\u0006¢\u0006\u0006\u001a\u0004\b7\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/huami/device/feature/health/settings/BaseSetting;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/device/feature/health/settings/device/OnDeviceConnect;", "Lcom/huami/device/feature/health/settings/device/SyncConfigToDevice;", "Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/SetToDevice;", "createSet", "Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet$health_base_release", "()Lcom/huami/device/feature/health/settings/device/ReadFromDevice;", "createGet", "", "supportRead", "supportSet", "isSupport", "", "onDeviceBound", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDeviceConnect", "syncUserConfigToDevice", "syncUserConfigFromDevice", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "getUserConfig$health_base_release", "()Lcom/huami/device/feature/health/user/HealthSettingConfig;", "getUserConfig", "notifyChange", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "a", "Lcom/huami/device/feature/health/device/init/BaseHealthInit;", "initItem", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lcom/huami/device/feature/health/device/HealthDevice;", "getDevice$health_base_release", "()Lcom/huami/device/feature/health/device/HealthDevice;", "device", "c", "Z", "getHasRestored$health_base_release", "()Z", "setHasRestored$health_base_release", "(Z)V", "hasRestored", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "data", "Lcom/huami/device/feature/health/model/HealthSettingData;", "getSettingData", "()Lcom/huami/device/feature/health/model/HealthSettingData;", "settingData", "getSetToDevice", "setToDevice", "getReadFromDevice", "readFromDevice", "<init>", "(Lcom/huami/device/feature/health/device/init/BaseHealthInit;Lcom/huami/device/feature/health/device/HealthDevice;)V", "health-base_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseSetting<T> implements OnDeviceConnect, SyncConfigToDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BaseHealthInit initItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HealthDevice device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasRestored = true;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.BaseSetting", f = "BaseSetting.kt", i = {0}, l = {82, 83}, m = "syncUserConfigFromDevice$suspendImpl", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ BaseSetting<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BaseSetting<T> baseSetting, Continuation<? super a> continuation) {
            super(continuation);
            this.c = baseSetting;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BaseSetting.c(this.c, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncUserConfigFromDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.settings.BaseSetting", f = "BaseSetting.kt", i = {0}, l = {76}, m = "syncUserConfigToDevice$suspendImpl", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ BaseSetting<T> c;
        public int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BaseSetting<T> baseSetting, Continuation<? super c> continuation) {
            super(continuation);
            this.c = baseSetting;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return BaseSetting.d(this.c, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncUserConfigToDevice";
        }
    }

    public BaseSetting(@NotNull BaseHealthInit baseHealthInit, @NotNull HealthDevice healthDevice) {
        this.initItem = baseHealthInit;
        this.device = healthDevice;
    }

    public static /* synthetic */ Object a(BaseSetting baseSetting, Continuation continuation) {
        baseSetting.setHasRestored$health_base_release(false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object b(BaseSetting baseSetting, Continuation continuation) {
        ReadFromDevice readFromDevice;
        if (!baseSetting.getHasRestored() || (readFromDevice = baseSetting.getReadFromDevice()) == null) {
            return Unit.INSTANCE;
        }
        Object obj = readFromDevice.read(continuation);
        return obj == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object c(BaseSetting baseSetting, Continuation continuation) {
        a aVar;
        Boolean bool;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(baseSetting, continuation);
            }
        } else {
            aVar = new a(baseSetting, continuation);
        }
        Object itemTag = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        boolean zBooleanValue = false;
        if (i2 != 0) {
            if (i2 == 1) {
                baseSetting = (BaseSetting) aVar.a;
                ResultKt.throwOnFailure(itemTag);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(itemTag);
            }
            bool = (Boolean) itemTag;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        ResultKt.throwOnFailure(itemTag);
        aVar.a = baseSetting;
        aVar.d = 1;
        itemTag = baseSetting.getItemTag(aVar);
        if (itemTag == coroutine_suspended) {
            return coroutine_suspended;
        }
        HMLog.info((String) itemTag, b.a);
        ReadFromDevice readFromDevice = baseSetting.getReadFromDevice();
        if (readFromDevice != null) {
            aVar.a = null;
            aVar.d = 2;
            itemTag = readFromDevice.read(aVar);
            if (itemTag == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) itemTag;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @CallSuper
    public static /* synthetic */ Object d(BaseSetting baseSetting, Continuation continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.d = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(baseSetting, continuation);
            }
        } else {
            cVar = new c(baseSetting, continuation);
        }
        Object itemTag = cVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(itemTag);
            cVar.a = baseSetting;
            cVar.d = 1;
            itemTag = baseSetting.getItemTag(cVar);
            if (itemTag == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseSetting = (BaseSetting) cVar.a;
            ResultKt.throwOnFailure(itemTag);
        }
        HMLog.info((String) itemTag, d.a);
        baseSetting.setHasRestored$health_base_release(true);
        return Boxing.boxBoolean(true);
    }

    @NotNull
    public abstract ReadFromDevice createGet$health_base_release();

    @NotNull
    public abstract SetToDevice<T> createSet$health_base_release();

    public abstract T getData();

    @NotNull
    /* JADX INFO: renamed from: getDevice$health_base_release, reason: from getter */
    public final HealthDevice getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: getHasRestored$health_base_release, reason: from getter */
    public final boolean getHasRestored() {
        return this.hasRestored;
    }

    @Nullable
    public final ReadFromDevice getReadFromDevice() {
        if (this.initItem.supportRead()) {
            return createGet$health_base_release();
        }
        return null;
    }

    @Nullable
    public final SetToDevice<T> getSetToDevice() {
        if (this.initItem.supportWrite()) {
            return createSet$health_base_release();
        }
        return null;
    }

    @NotNull
    public abstract HealthSettingData<T> getSettingData();

    @NotNull
    public final HealthSettingConfig getUserConfig$health_base_release() {
        return HealthDetect.INSTANCE.getUserConfig();
    }

    public final boolean isSupport() {
        return this.initItem.isSupport();
    }

    public final void notifyChange() {
    }

    @Override // com.huami.device.feature.health.settings.device.OnDeviceConnect
    @Nullable
    public Object onDeviceBound(@NotNull Continuation<? super Unit> continuation) {
        return a(this, continuation);
    }

    @Override // com.huami.device.feature.health.settings.device.OnDeviceConnect
    @Nullable
    public Object onDeviceConnect(@NotNull Continuation<? super Unit> continuation) {
        return b(this, continuation);
    }

    public abstract void setData(T t);

    public final void setHasRestored$health_base_release(boolean z) {
        this.hasRestored = z;
    }

    public final boolean supportRead() {
        return getReadFromDevice() != null;
    }

    public final boolean supportSet() {
        return getSetToDevice() != null;
    }

    @Override // com.huami.device.feature.health.settings.device.SyncConfigToDevice
    @Nullable
    public Object syncUserConfigFromDevice(@NotNull Continuation<? super Boolean> continuation) {
        return c(this, continuation);
    }

    @CallSuper
    @Nullable
    public Object syncUserConfigToDevice(@NotNull Continuation<? super Boolean> continuation) {
        return d(this, continuation);
    }
}
