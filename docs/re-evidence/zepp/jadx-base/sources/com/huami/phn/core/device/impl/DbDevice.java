package com.huami.phn.core.device.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.core.device.Device;
import com.huami.phn.core.device.DeviceDelegate;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R'\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR'\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\b\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u00020\b8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\r8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u00070\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0003\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/phn/core/device/impl/DbDevice;", "Lcom/huami/phn/core/device/Device;", "Lcom/xiaomi/hm/health/databases/model/Device;", "a", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function1;", "isSupportPhn", "", "c", "name", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "isPhnSupport", "()Z", "e", "Z", "isPhnEnable", "f", "getDisplayName", "()Ljava/lang/String;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "kotlin.jvm.PlatformType", "g", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "<init>", "(Lcom/xiaomi/hm/health/databases/model/Device;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DbDevice extends Device {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final com.xiaomi.hm.health.databases.model.Device device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<HMDeviceSource, Boolean> isSupportPhn;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<HMDeviceSource, String> name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy isPhnSupport;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isPhnEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HMDeviceSource, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull HMDeviceSource hMDeviceSource) {
            List<HMDeviceSource> phnDeviceSource = DeviceDelegate.INSTANCE.getPhnDeviceSource();
            return Boolean.valueOf(phnDeviceSource == null ? false : phnDeviceSource.contains(hMDeviceSource));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<HMDeviceSource, String> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@NotNull HMDeviceSource hMDeviceSource) {
            String strInvoke;
            Function1<HMDeviceSource, String> deviceName = DeviceDelegate.INSTANCE.getDeviceName();
            return (deviceName == null || (strInvoke = deviceName.invoke(hMDeviceSource)) == null) ? "" : strInvoke;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return (String) DbDevice.this.name.invoke(DbDevice.this.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return (Boolean) DbDevice.this.isSupportPhn.invoke(DbDevice.this.a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<HMDeviceSource> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource invoke() {
            return HMDeviceSource.fromValue(DbDevice.this.device.getDevice_source().intValue());
        }
    }

    public /* synthetic */ DbDevice(com.xiaomi.hm.health.databases.model.Device device, Function1 function1, Function1 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(device, (i & 2) != 0 ? a.a : function1, (i & 4) != 0 ? b.a : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMDeviceSource a() {
        return (HMDeviceSource) this.source.getValue();
    }

    @Override // com.huami.phn.core.device.Device
    @NotNull
    public String getDisplayName() {
        return (String) this.displayName.getValue();
    }

    @Override // com.huami.phn.core.device.Device
    /* JADX INFO: renamed from: isPhnEnable, reason: from getter */
    public boolean getIsPhnEnable() {
        return this.isPhnEnable;
    }

    @Override // com.huami.phn.core.device.Device
    public boolean isPhnSupport() {
        return ((Boolean) this.isPhnSupport.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DbDevice(@NotNull com.xiaomi.hm.health.databases.model.Device device, @NotNull Function1<? super HMDeviceSource, Boolean> function1, @NotNull Function1<? super HMDeviceSource, String> function2) {
        this.device = device;
        this.isSupportPhn = function1;
        this.name = function2;
        this.isPhnSupport = LazyKt__LazyJVMKt.lazy(new d());
        this.displayName = LazyKt__LazyJVMKt.lazy(new c());
        this.source = LazyKt__LazyJVMKt.lazy(new e());
    }
}
