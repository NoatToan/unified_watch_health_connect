package defpackage;

import com.huami.bluetooth.profile.channel.module.auth.AuthModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModule2;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lu6;", "", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f35440a = new a(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lu6$a;", "", "Ljet;", "gattPeripheral", "Lkd;", "device", "Lkh;", PluginDeviceInfo.FMODEL, "(Ljet;Lkd;)Lkh;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: u6$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class C1115a extends FunctionReferenceImpl implements Function0<AuthModule> {
            public final /* synthetic */ kd t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1115a(kd kdVar) {
                super(0, Intrinsics.Kotlin.class, "authProvider", "createAuthorization$authProvider(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", 0);
                this.t = kdVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuthModule invoke() {
                return a.b(this.t);
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<AuthModule> {
            public final /* synthetic */ kd t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kd kdVar) {
                super(0, Intrinsics.Kotlin.class, "authProvider", "createAuthorization$authProvider(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", 0);
                this.t = kdVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AuthModule invoke() {
                return a.b(this.t);
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final AuthModule b(kd kdVar) {
            AuthModule authModule = (AuthModule) kdVar.y(AuthModule.class);
            if (authModule == null) {
                throw new NullPointerException("No authorization module");
            }
            if (authModule.getChannelVersion().getEncryptEnable() == null) {
                return authModule;
            }
            AuthModule2 authModule2 = (AuthModule2) kdVar.y(AuthModule2.class);
            if (authModule2 != null) {
                return authModule2;
            }
            throw new NullPointerException("No authorization module");
        }

        @Nullable
        public final kh a(@NotNull jet gattPeripheral, @NotNull kd device) {
            Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
            Intrinsics.checkNotNullParameter(device, "device");
            if (!device.a(128) && !device.a(130)) {
                t5t.d("DeviceAuthorizationFactory", "Use traditional auth protocol");
                return new bv(gattPeripheral);
            }
            t5t.d("DeviceAuthorizationFactory", "Use auth protocol base on channel");
            if (b(device).getChannelVersion().getEncryptEnable() == null) {
                String address = gattPeripheral.m0().getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "gattPeripheral.device.address");
                return new v6(address, new m0(new C1115a(device)));
            }
            String address2 = gattPeripheral.m0().getAddress();
            Intrinsics.checkNotNullExpressionValue(address2, "gattPeripheral.device.address");
            return new w6(address2, new m0(new b(device)));
        }
    }
}
