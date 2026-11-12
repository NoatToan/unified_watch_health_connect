package com.huami.watch.wififtp;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.Status;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010!\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001=B\t\b\u0002¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\b\u0010\u0018\u001a\u00020\u0015H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\b\u0010\u001e\u001a\u00020\u0004H\u0007J\b\u0010\u001f\u001a\u00020\u0004H\u0007J \u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000eH\u0007J\b\u0010$\u001a\u00020\u0004H\u0007J\b\u0010%\u001a\u00020\u0004H\u0007J\b\u0010&\u001a\u00020\u0004H\u0007J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J \u0010(\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u000eH\u0007J\b\u0010)\u001a\u00020\u0015H\u0007J\b\u0010*\u001a\u00020\u0015H\u0007J\b\u0010+\u001a\u00020\u0015H\u0007J\u0006\u0010,\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000b078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/watch/wififtp/WifiFtpModule;", "", "Lcom/huami/watch/wififtp/IWifiFtpModule;", "module", "", "setBleModule", "Lcom/huami/watch/wififtp/WifiFtpModule$ClassicBTWifiFtpModule;", "setClassicModule", "Lcom/huami/watch/transport/Transporter$DataListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setClassicTransporterDataListener", "Lcom/huami/watch/wififtp/IWifiFtpListener;", "addListener", "removeListener", "", "state", "notifyWifiApStateChanged", "", "ipAddress", "userName", "notifyFtpServerStateChanged", "", Status.PRE_CONNECT_STATE_CONNECTED, "notifyDeviceConnectionChanged", "isBleDevice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "hasBoundDevice", "isDeviceConnected", PointCategory.INIT, "release", "sendStartService", "ssid", "pwd", "keyMgmt", "sendEnableWifiAP", "sendDisableWifiAP", "sendEnableFtp", "sendDisableFtp", "getDeviceAddress", "enableWifiSync", "disableWifiSync", "enableFtpSync", "disableFtpSync", "getMusicInfoMaxLength", "getDeviceSourceValue", "a", "Ljava/lang/String;", "TAG", "b", "Lcom/huami/watch/wififtp/WifiFtpModule$ClassicBTWifiFtpModule;", "sModule", "c", "Lcom/huami/watch/wififtp/IWifiFtpModule;", "sBleModule", "", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "sListeners", "<init>", "()V", "ClassicBTWifiFtpModule", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class WifiFtpModule {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "WifiFtpModule";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static IWifiFtpModule sBleModule;

    @NotNull
    public static final WifiFtpModule INSTANCE = new WifiFtpModule();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static ClassicBTWifiFtpModule sModule = new ClassicBTWifiFtpModule();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final List<IWifiFtpListener> sListeners = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0011\u001a\u00020\u0007J\u0013\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/huami/watch/wififtp/WifiFtpModule$ClassicBTWifiFtpModule;", "Lcom/huami/watch/wififtp/IWifiFtpModule;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "b", "", "isBleDevice", "hasBoundDevice", "isDeviceConnected", PointCategory.INIT, "release", "", "getDeviceAddress", "", "getDeviceSource", "sendStartService", "sendEnableFtp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDisableFtp", "ssid", "pwd", "keyMgmt", "sendEnableWifiAP", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDisableWifiAP", "Lcom/huami/watch/transport/Transporter;", "Lcom/huami/watch/transport/Transporter;", "mTransporter", "Lcom/huami/watch/transport/Transporter$DataListener;", "Lcom/huami/watch/transport/Transporter$DataListener;", "getMDataListener", "()Lcom/huami/watch/transport/Transporter$DataListener;", "setMDataListener", "(Lcom/huami/watch/transport/Transporter$DataListener;)V", "mDataListener", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static class ClassicBTWifiFtpModule implements IWifiFtpModule {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Transporter mTransporter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Transporter.DataListener mDataListener;

        private final void a(Context context) {
            Transporter transporter = Transporter.get(context, WifiFtpTransportModule.MODULE_NAME_WIFI_FTP);
            this.mTransporter = transporter;
            Transporter.DataListener dataListener = this.mDataListener;
            if (dataListener != null) {
                transporter.addDataListener(dataListener);
            }
            this.mTransporter.connectTransportService();
        }

        private final void b() {
            if (this.mDataListener != null) {
                this.mTransporter.removeDataListener(this.mDataListener);
            }
            this.mTransporter.disconnectTransportService();
        }

        public static /* synthetic */ Object c(ClassicBTWifiFtpModule classicBTWifiFtpModule, Continuation continuation) {
            classicBTWifiFtpModule.mTransporter.send(WifiFtpTransportModule.ACTION_DISABLE_FTP);
            return Boxing.boxBoolean(true);
        }

        public static /* synthetic */ Object d(ClassicBTWifiFtpModule classicBTWifiFtpModule, Continuation continuation) {
            classicBTWifiFtpModule.mTransporter.send(WifiFtpTransportModule.ACTION_DISABLE_AP);
            return Boxing.boxBoolean(true);
        }

        public static /* synthetic */ Object e(ClassicBTWifiFtpModule classicBTWifiFtpModule, Continuation continuation) {
            classicBTWifiFtpModule.mTransporter.send(WifiFtpTransportModule.ACTION_ENABLE_FTP);
            return Boxing.boxBoolean(true);
        }

        public static /* synthetic */ Object f(ClassicBTWifiFtpModule classicBTWifiFtpModule, String str, String str2, int i, Continuation continuation) {
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString(WifiFtpTransportModule.KEY_SSID_STRING, str);
            dataBundle.putString(WifiFtpTransportModule.KEY_PSWD_STRING, str2);
            dataBundle.putInt(WifiFtpTransportModule.KEY_KEYMGMT_INT, i);
            classicBTWifiFtpModule.mTransporter.send(WifiFtpTransportModule.ACTION_ENABLE_AP, dataBundle);
            return Boxing.boxBoolean(true);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        @NotNull
        public String getDeviceAddress(@NotNull Context context) {
            Device currentDevice;
            String strAddress;
            DeviceManager manager = DeviceManager.getManager(context);
            return (manager == null || (currentDevice = manager.getCurrentDevice()) == null || (strAddress = currentDevice.address()) == null) ? "" : strAddress;
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public int getDeviceSource(@NotNull Context context) {
            return DeviceSource.getDeviceSource(DeviceManager.getManager(context).getCurrentDevice());
        }

        @Nullable
        public final Transporter.DataListener getMDataListener() {
            return this.mDataListener;
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public int getMusicInfoMaxLength() {
            return IWifiFtpModule.DefaultImpls.getMusicInfoMaxLength(this);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public boolean hasBoundDevice(@NotNull Context context) {
            return DeviceManager.getManager(context).hasBoundDevice();
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public void init(@NotNull Context context) {
            a(context);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public boolean isBleDevice() {
            return false;
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public boolean isDeviceConnected(@NotNull Context context) {
            return DeviceManager.getManager(context).isBoundDeviceConnected();
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        public void release() {
            b();
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        @Nullable
        public Object sendDisableFtp(@NotNull Continuation<? super Boolean> continuation) {
            return c(this, continuation);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        @Nullable
        public Object sendDisableWifiAP(@NotNull Continuation<? super Boolean> continuation) {
            return d(this, continuation);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        @Nullable
        public Object sendEnableFtp(@NotNull Continuation<? super Boolean> continuation) {
            return e(this, continuation);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpModule
        @Nullable
        public Object sendEnableWifiAP(@NotNull String str, @NotNull String str2, int i, @NotNull Continuation<? super Boolean> continuation) {
            return f(this, str, str2, i, continuation);
        }

        public final boolean sendStartService() {
            this.mTransporter.send(WifiFtpTransportModule.ACTION_START_SERVICE);
            return true;
        }

        public final void setMDataListener(@Nullable Transporter.DataListener dataListener) {
            this.mDataListener = dataListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$disableFtpSync$1", f = "WifiFtpModule.kt", i = {}, l = {220, 222}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "disableFtpSync...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    obj = iWifiFtpModuleAccess$getSBleModule$p.sendDisableFtp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    obj = classicBTWifiFtpModuleAccess$getSModule$p.sendDisableFtp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$disableWifiSync$1", f = "WifiFtpModule.kt", i = {}, l = {196, 198}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "disableWifiSync...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    obj = iWifiFtpModuleAccess$getSBleModule$p.sendDisableWifiAP(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    obj = classicBTWifiFtpModuleAccess$getSModule$p.sendDisableWifiAP(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$enableFtpSync$1", f = "WifiFtpModule.kt", i = {}, l = {208, com.baseflow.permissionhandler.m.d}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "enableFtpSync...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    obj = iWifiFtpModuleAccess$getSBleModule$p.sendEnableFtp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    obj = classicBTWifiFtpModuleAccess$getSModule$p.sendEnableFtp(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$enableWifiSync$1", f = "WifiFtpModule.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_BOULDERING, DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    String str = this.b;
                    String str2 = this.c;
                    int i2 = this.d;
                    this.a = 1;
                    obj = iWifiFtpModuleAccess$getSBleModule$p.sendEnableWifiAP(str, str2, i2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    String str3 = this.b;
                    String str4 = this.c;
                    int i3 = this.d;
                    this.a = 2;
                    obj = classicBTWifiFtpModuleAccess$getSModule$p.sendEnableWifiAP(str3, str4, i3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/huami/watch/wififtp/WifiFtpModule$notifyDeviceConnectionChanged$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$notifyDeviceConnectionChanged$1$1", f = "WifiFtpModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Continuation continuation, boolean z) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (IWifiFtpListener iWifiFtpListener : WifiFtpModule.access$getSListeners$p(WifiFtpModule.INSTANCE)) {
                if (this.b) {
                    iWifiFtpListener.onDeviceConnected();
                } else {
                    iWifiFtpListener.onDeviceDisconnected();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$sendDisableFtp$1", f = "WifiFtpModule.kt", i = {}, l = {171, DataTypeSource.SPORT_TYPE_CHESS}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "Send Disable FTP...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    if (iWifiFtpModuleAccess$getSBleModule$p.sendDisableFtp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    if (classicBTWifiFtpModuleAccess$getSModule$p.sendDisableFtp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$sendDisableWifiAP$1", f = "WifiFtpModule.kt", i = {}, l = {147, 149}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "Send Disable WifiAP...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    if (iWifiFtpModuleAccess$getSBleModule$p.sendDisableWifiAP(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    if (classicBTWifiFtpModuleAccess$getSModule$p.sendDisableWifiAP(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$sendEnableFtp$1", f = "WifiFtpModule.kt", i = {}, l = {159, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "Send Enable FTP...", new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    this.a = 1;
                    if (iWifiFtpModuleAccess$getSBleModule$p.sendEnableFtp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    this.a = 2;
                    if (classicBTWifiFtpModuleAccess$getSModule$p.sendEnableFtp(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @DebugMetadata(c = "com.huami.watch.wififtp.WifiFtpModule$sendEnableWifiAP$1", f = "WifiFtpModule.kt", i = {}, l = {135, 137}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.d(WifiFtpModule.TAG, "Send Enable WifiAP: [SSID: " + this.b + ", PWD: " + this.c + ", KeyMgmt: " + this.d + JsonLexerKt.END_LIST, new Object[0]);
                if (WifiFtpModule.isBleDevice()) {
                    IWifiFtpModule iWifiFtpModuleAccess$getSBleModule$p = WifiFtpModule.access$getSBleModule$p(WifiFtpModule.INSTANCE);
                    String str = this.b;
                    String str2 = this.c;
                    int i2 = this.d;
                    this.a = 1;
                    if (iWifiFtpModuleAccess$getSBleModule$p.sendEnableWifiAP(str, str2, i2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    ClassicBTWifiFtpModule classicBTWifiFtpModuleAccess$getSModule$p = WifiFtpModule.access$getSModule$p(WifiFtpModule.INSTANCE);
                    String str3 = this.b;
                    String str4 = this.c;
                    int i3 = this.d;
                    this.a = 2;
                    if (classicBTWifiFtpModuleAccess$getSModule$p.sendEnableWifiAP(str3, str4, i3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private WifiFtpModule() {
    }

    public static final /* synthetic */ IWifiFtpModule access$getSBleModule$p(WifiFtpModule wifiFtpModule) {
        return sBleModule;
    }

    public static final /* synthetic */ List access$getSListeners$p(WifiFtpModule wifiFtpModule) {
        return sListeners;
    }

    public static final /* synthetic */ ClassicBTWifiFtpModule access$getSModule$p(WifiFtpModule wifiFtpModule) {
        return sModule;
    }

    @JvmStatic
    public static final void addListener(@NotNull IWifiFtpListener listener) {
        List<IWifiFtpListener> list = sListeners;
        synchronized (list) {
            if (!list.contains(listener)) {
                list.add(listener);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    @Nullable
    public static final String getDeviceAddress(@NotNull Context context) {
        return isBleDevice() ? sBleModule.getDeviceAddress(context) : sModule.getDeviceAddress(context);
    }

    @JvmStatic
    public static final boolean hasBoundDevice(@NotNull Context context) {
        return isBleDevice() ? sBleModule.hasBoundDevice(context) : sModule.hasBoundDevice(context);
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        IWifiFtpModule iWifiFtpModule = sBleModule;
        if (iWifiFtpModule != null) {
            iWifiFtpModule.init(context);
        }
        sModule.init(context);
    }

    @JvmStatic
    public static final boolean isBleDevice() {
        IWifiFtpModule iWifiFtpModule = sBleModule;
        return iWifiFtpModule != null && iWifiFtpModule.isBleDevice();
    }

    @JvmStatic
    public static final boolean isDeviceConnected(@NotNull Context context) {
        return isBleDevice() ? sBleModule.isDeviceConnected(context) : sModule.isDeviceConnected(context);
    }

    @JvmStatic
    public static final void notifyDeviceConnectionChanged(boolean connected) {
        synchronized (sListeners) {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new e(null, connected), 2, null);
        }
    }

    @JvmStatic
    public static final void notifyFtpServerStateChanged(int state, @Nullable String ipAddress, @Nullable String userName) {
        List<IWifiFtpListener> list = sListeners;
        synchronized (list) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((IWifiFtpListener) it2.next()).onFtpServerStateChanged(state, ipAddress, userName);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void notifyWifiApStateChanged(int state) {
        List<IWifiFtpListener> list = sListeners;
        synchronized (list) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((IWifiFtpListener) it2.next()).onWifiApStateChanged(state);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void release() {
        IWifiFtpModule iWifiFtpModule = sBleModule;
        if (iWifiFtpModule != null) {
            iWifiFtpModule.release();
        }
        sModule.release();
    }

    @JvmStatic
    public static final void removeListener(@NotNull IWifiFtpListener listener) {
        List<IWifiFtpListener> list = sListeners;
        synchronized (list) {
            list.remove(listener);
        }
    }

    @JvmStatic
    public static final void sendDisableFtp() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new f(null), 2, null);
    }

    @JvmStatic
    public static final void sendDisableWifiAP() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new g(null), 2, null);
    }

    @JvmStatic
    public static final void sendEnableFtp() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new h(null), 2, null);
    }

    @JvmStatic
    public static final void sendEnableWifiAP(@NotNull String ssid, @NotNull String pwd, int keyMgmt) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new i(ssid, pwd, keyMgmt, null), 2, null);
    }

    @JvmStatic
    public static final void sendStartService() {
        if (isBleDevice()) {
            return;
        }
        sModule.sendStartService();
    }

    @JvmStatic
    public static final void setBleModule(@NotNull IWifiFtpModule module) {
        sBleModule = module;
    }

    @JvmStatic
    public static final void setClassicModule(@NotNull ClassicBTWifiFtpModule module) {
        sModule = module;
    }

    @JvmStatic
    public static final void setClassicTransporterDataListener(@NotNull Transporter.DataListener listener) {
        sModule.setMDataListener(listener);
    }

    @WorkerThread
    public final boolean disableFtpSync() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new a(null), 1, null)).booleanValue();
    }

    @WorkerThread
    public final boolean disableWifiSync() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new b(null), 1, null)).booleanValue();
    }

    @WorkerThread
    public final boolean enableFtpSync() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new c(null), 1, null)).booleanValue();
    }

    @WorkerThread
    public final boolean enableWifiSync(@NotNull String ssid, @NotNull String pwd, int keyMgmt) {
        Log.d(TAG, "enableWifiSync wifi info: {SSID: " + ssid + ", PWD: " + pwd + ", KeyMgmt: " + keyMgmt + '}', new Object[0]);
        return ((Boolean) kotlinx.coroutines.d.b(null, new d(ssid, pwd, keyMgmt, null), 1, null)).booleanValue();
    }

    public final int getDeviceSourceValue(@NotNull Context context) {
        return isBleDevice() ? sBleModule.getDeviceSource(context) : sModule.getDeviceSource(context);
    }

    public final int getMusicInfoMaxLength() {
        return isBleDevice() ? sBleModule.getMusicInfoMaxLength() : sModule.getMusicInfoMaxLength();
    }
}
