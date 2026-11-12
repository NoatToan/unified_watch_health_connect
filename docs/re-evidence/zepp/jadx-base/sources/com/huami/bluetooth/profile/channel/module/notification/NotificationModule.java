package com.huami.bluetooth.profile.channel.module.notification;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.DeviceRequestHandler;
import com.huami.bluetooth.profile.channel.module.base.IncreasePredict;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.RequestPredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.notification.codec.VersionCodec;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 30)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u001a\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", "data", "", "c", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", GoogleApiAvailabilityLight.a, PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "loadApi", "Lkotlin/Function1;", "notify", "registerNotify", "g", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", "h", "Lkotlin/jvm/functions/Function1;", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "i", "Lcom/huami/bluetooth/profile/channel/module/base/DeviceRequestHandler;", "mRequestHandler", z.j, "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "notificationApi", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationModule extends BaseModule {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private NotificationVersion version;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private Function1<? super byte[], Unit> notify;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final DeviceRequestHandler mRequestHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private NotificationApi notificationApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reset version";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mRequestHandler: ", NotificationModule.this.mRequestHandler);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("loadApi version: ", NotificationModule.this.version);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<byte[], Unit> {
        public d(NotificationModule notificationModule) {
            super(1, notificationModule, NotificationModule.class, "onNotify", "onNotify([B)V", 0);
        }

        public final void a(@NotNull byte[] bArr) {
            ((NotificationModule) this.receiver).c(bArr);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<byte[], Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull byte[] bArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ ModuleResult<byte[]> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ModuleResult<byte[]> moduleResult) {
            super(0);
            this.a = moduleResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("version response: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Version is null";
        }
    }

    public NotificationModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.notify = e.a;
        this.mRequestHandler = new DeviceRequestHandler(new d(this), new RequestPredict() { // from class: com.huami.bluetooth.profile.channel.module.notification.NotificationModule$mRequestHandler$2
            @Override // com.huami.bluetooth.profile.channel.module.base.RequestPredict
            public boolean predict(@NotNull byte[] byteArray) {
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(byte[] data) {
        this.notify.invoke(data);
    }

    private final NotificationVersion d() {
        ModuleResult<byte[]> moduleResultSendRequest = sendRequest(new ModuleRequest(NotificationCommand.QueryVersion.INSTANCE, IncreasePredict.INSTANCE, 0L, null, false, 28, null));
        HMLog.info(Log.logTag, new f(moduleResultSendRequest));
        if (moduleResultSendRequest instanceof Success) {
            return new VersionCodec().decode((byte[]) ((Success) moduleResultSendRequest).getData());
        }
        HMLog.info(Log.logTag, g.a);
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        HMLog.info(Log.logTag, a.a);
        this.version = null;
        HMLog.info(Log.logTag, new b());
        registerDeviceRequestHandler(this.mRequestHandler);
    }

    @Nullable
    public final NotificationApi loadApi() {
        HMLog.info(Log.logTag, new c());
        if (this.version == null) {
            NotificationVersion notificationVersionD = d();
            this.version = notificationVersionD;
            NotificationApi notificationApiImpl = null;
            if (notificationVersionD != null) {
                int version = notificationVersionD.getVersion();
                if (version == 1) {
                    notificationApiImpl = new NotificationApiImpl(this, notificationVersionD);
                } else if (version == 2) {
                    notificationApiImpl = new NotificationApiImplV2(this, notificationVersionD);
                } else if (version == 3) {
                    notificationApiImpl = new NotificationApiImplV3(this, notificationVersionD);
                } else if (version == 4) {
                    notificationApiImpl = new NotificationApiImplV4(this, notificationVersionD);
                }
            }
            this.notificationApi = notificationApiImpl;
        }
        return this.notificationApi;
    }

    public final void registerNotify(@NotNull Function1<? super byte[], Unit> notify) {
        this.notify = notify;
    }
}
