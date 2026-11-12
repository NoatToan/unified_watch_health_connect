package com.huami.watch.musicupload.viewmodel;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.wififtp.WatchWifiFtpUtil;
import com.huami.watch.wififtp.WifiFtpModule;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 42\u00020\u0001:\u0003\u001c!%B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b2\u00103J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0018H\u0016R%\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010#\u001a\u00060 R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00060$R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice;", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice;", "", PointCategory.INIT, "deInit", "", "getAddress", "wifiName", "password", "Lcom/huami/watch/musicupload/viewmodel/TransformMode;", "mode", "", "enableWifi", "disableWifi", "", "getMusicInfoMaxLength", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getDeviceSourceValue", "enable", "enableFtp", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setWifiStatusListener", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "setFtpStatusListener", "Lcom/huami/watch/wififtp/WatchWifiFtpUtil;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "()Lcom/huami/watch/wififtp/WatchWifiFtpUtil;", "wifiFtpUtil", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice$b;", "b", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice$b;", "innerApListener", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice$c;", "c", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice$c;", "innerFtpListener", GoogleApiAvailabilityLight.a, "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceWifiStatusListener;", "wifiStatusListener", "e", "Lcom/huami/watch/musicupload/viewmodel/IWifiFtpDevice$IDeviceFtpStatusListener;", "ftpStatusListener", "f", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "h", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiFtpDevice implements IWifiFtpDevice {
    private static final String g = "WifiFtpDevice";

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy wifiFtpUtil = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final b innerApListener = new b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final c innerFtpListener = new c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private IWifiFtpDevice.IDeviceWifiStatusListener wifiStatusListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private IWifiFtpDevice.IDeviceFtpStatusListener ftpStatusListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpDevice$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpDevice$b", "Lcom/huami/watch/wififtp/WatchWifiFtpUtil$WatchAPStateListener;", "", "status", "", "b", "a", "code", "", "data", "", "onAPEnableResult", "oldstate", "newstate", "onAPStateChanged", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements WatchWifiFtpUtil.WatchAPStateListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, String str) {
                super(0);
                this.a = i;
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onAPEnableResult code: " + this.a + ", data: " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.WifiFtpDevice$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0671b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0671b(int i, int i2) {
                super(0);
                this.a = i;
                this.b = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onAPStateChanged old state: " + this.a + "; new state: " + this.b;
            }
        }

        public b() {
        }

        private final boolean a(int status) {
            return status == 11;
        }

        private final boolean b(int status) {
            return status == 13;
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPEnableResult(int code, @Nullable String data) {
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new a(code, data));
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPStateChanged(int oldstate, int newstate) {
            IWifiFtpDevice.IDeviceWifiStatusListener iDeviceWifiStatusListener;
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new C0671b(oldstate, newstate));
            if (!(b(newstate) || a(newstate)) || (iDeviceWifiStatusListener = WifiFtpDevice.this.wifiStatusListener) == null) {
                return;
            }
            iDeviceWifiStatusListener.onWifiStatusChanged(b(newstate));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"com/huami/watch/musicupload/viewmodel/WifiFtpDevice$c", "Lcom/huami/watch/wififtp/WatchWifiFtpUtil$WatchFTPListener;", "", "status", "", "b", "a", "", "filePath", "", "onFileUpload", "onFileDownload", "onFileDelete", "oldstate", "newstate", "onFTPServerStateChanged", "<init>", "(Lcom/huami/watch/musicupload/viewmodel/WifiFtpDevice;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class c implements WatchWifiFtpUtil.WatchFTPListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2) {
                super(0);
                this.a = i;
                this.b = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onFTPServerStateChanged old state: " + this.a + "; new state: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onFileDelete, " + this.a;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.viewmodel.WifiFtpDevice$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0672c extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0672c(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onFileDownload, " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "onFileUpload, " + this.a;
            }
        }

        public c() {
        }

        private final boolean a(int status) {
            return status == 1;
        }

        private final boolean b(int status) {
            return status == 2;
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFTPServerStateChanged(int oldstate, int newstate) {
            IWifiFtpDevice.IDeviceFtpStatusListener iDeviceFtpStatusListener;
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new a(oldstate, newstate));
            if (!(b(newstate) || a(newstate)) || (iDeviceFtpStatusListener = WifiFtpDevice.this.ftpStatusListener) == null) {
                return;
            }
            iDeviceFtpStatusListener.onFtpStatusChanged(b(newstate));
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDelete(@Nullable String filePath) {
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new b(filePath));
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDownload(@Nullable String filePath) {
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new C0672c(filePath));
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileUpload(@Nullable String filePath) {
            a unused = WifiFtpDevice.h;
            HMLog.info(WifiFtpDevice.g, new d(filePath));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/huami/watch/wififtp/WatchWifiFtpUtil;", "kotlin.jvm.PlatformType", "a", "()Lcom/huami/watch/wififtp/WatchWifiFtpUtil;"}, k = 3, mv = {1, 4, 1})
    public static final class d extends Lambda implements Function0<WatchWifiFtpUtil> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchWifiFtpUtil invoke() {
            WatchWifiFtpUtil.init(WifiFtpDevice.this.getContext().getApplicationContext());
            return WatchWifiFtpUtil.get();
        }
    }

    public WifiFtpDevice(@NotNull Context context) {
        this.context = context;
    }

    private final WatchWifiFtpUtil a() {
        return (WatchWifiFtpUtil) this.wifiFtpUtil.getValue();
    }

    public final void deInit() {
        a().setWatchFTPListener(null);
        a().setWatchAPStateListener(null);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean disableWifi() {
        return WifiFtpModule.INSTANCE.disableWifiSync();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean enableFtp(boolean enable, @NotNull TransformMode mode) {
        return enable ? WifiFtpModule.INSTANCE.enableFtpSync() : WifiFtpModule.INSTANCE.disableFtpSync();
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public boolean enableWifi(@NotNull String wifiName, @NotNull String password, @NotNull TransformMode mode) {
        return WifiFtpModule.INSTANCE.enableWifiSync(wifiName, password, 4);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    @Nullable
    public String getAddress() {
        return a().getDeviceAddress(this.context);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public int getDeviceSourceValue(@NotNull Context context) {
        return WifiFtpModule.INSTANCE.getDeviceSourceValue(context);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public int getMusicInfoMaxLength() {
        return WifiFtpModule.INSTANCE.getMusicInfoMaxLength();
    }

    public final void init() {
        a().setWatchAPStateListener(this.innerApListener);
        a().setWatchFTPListener(this.innerFtpListener);
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public void setFtpStatusListener(@Nullable IWifiFtpDevice.IDeviceFtpStatusListener listener) {
        this.ftpStatusListener = listener;
    }

    @Override // com.huami.watch.musicupload.viewmodel.IWifiFtpDevice
    public void setWifiStatusListener(@Nullable IWifiFtpDevice.IDeviceWifiStatusListener listener) {
        this.wifiStatusListener = listener;
    }
}
