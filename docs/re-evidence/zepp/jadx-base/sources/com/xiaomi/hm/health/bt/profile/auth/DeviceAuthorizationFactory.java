package com.xiaomi.hm.health.bt.profile.auth;

import com.huami.bluetooth.profile.channel.module.auth.AuthModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModule2;
import com.huami.bluetooth.profile.channel.module.auth.impl.AuthApiImpl;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/DeviceAuthorizationFactory;", "", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceAuthorizationFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "DeviceAuthorizationFactory";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/auth/DeviceAuthorizationFactory$Companion;", "", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/auth/IDeviceAuthorization;", "createAuthorization", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<AuthModule> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HMBaseDevice hMBaseDevice) {
                super(0, Intrinsics.Kotlin.class, "authProvider", "createAuthorization$authProvider(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", 0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuthModule getA() {
                return Companion.a(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<AuthModule> {
            public final /* synthetic */ HMBaseDevice a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HMBaseDevice hMBaseDevice) {
                super(0, Intrinsics.Kotlin.class, "authProvider", "createAuthorization$authProvider(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", 0);
                this.a = hMBaseDevice;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuthModule getA() {
                return Companion.a(this.a);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AuthModule a(HMBaseDevice hMBaseDevice) {
            AuthModule authModule = (AuthModule) hMBaseDevice.getChannelModule(AuthModule.class);
            Objects.requireNonNull(authModule, "No authorization module");
            if (authModule.getChannelVersion().getEncryptEnable() == null) {
                return authModule;
            }
            AuthModule2 authModule2 = (AuthModule2) hMBaseDevice.getChannelModule(AuthModule2.class);
            Objects.requireNonNull(authModule2, "No authorization module");
            return authModule2;
        }

        @Nullable
        public final IDeviceAuthorization createAuthorization(@NotNull GattPeripheral gattPeripheral, @NotNull HMBaseDevice device) {
            if (device.supportModule(128) || device.supportModule(130)) {
                Debug.fi(DeviceAuthorizationFactory.a, "Use auth protocol base on channel");
                return a(device).getChannelVersion().getEncryptEnable() == null ? new DeviceAuthorizationImpl1(gattPeripheral.getDevice().getAddress(), new AuthApiImpl(new a(device))) : new DeviceAuthorizationImpl2(gattPeripheral.getDevice().getAddress(), new AuthApiImpl(new b(device)));
            }
            Debug.fi(DeviceAuthorizationFactory.a, "Use traditional auth protocol");
            return new TraditionalDeviceAuthorizationImpl(gattPeripheral);
        }
    }
}
