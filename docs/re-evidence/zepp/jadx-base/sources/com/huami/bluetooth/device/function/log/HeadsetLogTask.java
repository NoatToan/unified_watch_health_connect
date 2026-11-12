package com.huami.bluetooth.device.function.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.function.log.HeadsetLogTask;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.loc.z;
import com.xiaomi.hm.health.bt.classic.ClassicConnection;
import com.xiaomi.hm.health.bt.classic.HMSyncLogTask;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.utils.AsyncHandler;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.io.File;
import java.io.FileWriter;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009b\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001N\u0018\u0000 U2\u00020\u0001:\u0001UB\u008b\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b\u0012\u0006\u0010&\u001a\u00020$\u0012\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u000b\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012!\u00100\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+\u0012!\u00102\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+¢\u0006\u0004\bR\u0010SB\u0085\u0001\b\u0016\u0012\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b\u0012\u0006\u0010&\u001a\u00020$\u0012\u000e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u000b\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012!\u00100\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+\u0012!\u00102\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+¢\u0006\u0004\bR\u0010TJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0002J.\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018J\u0006\u0010\u001b\u001a\u00020\u0002R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R1\u00100\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R1\u00102\u001a\u001d\u0012\u0013\u0012\u00110,¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0018\u00107\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00106R\u001d\u0010;\u001a\u0002088B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b1\u0010:R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010<R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010=R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00103R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00103R\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/huami/bluetooth/device/function/log/HeadsetLogTask;", "", "", hl.k, "Ljava/io/File;", "data", "Lcom/xiaomi/hm/health/bt/error/HMDeviceError;", "error", "f", "e", z.j, "Lkotlin/Function0;", "task", "c", "", "h", "file", "isFirstLog", "append", "Ljava/lang/Runnable;", "l", "i", "isOutputSingleFile", "anotherFile", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "callback", "start", "terminateDeviceLog", "Landroid/os/Looper;", "a", "Landroid/os/Looper;", "looper", "Lcom/xiaomi/hm/health/bt/classic/ITransport;", "b", "Lkotlin/jvm/functions/Function0;", NotificationCompat.CATEGORY_TRANSPORT, "", "Ljava/lang/String;", "deviceAddress", "Lcom/huami/bluetooth/device/HeadsetDevice$HeadsetDeviceState;", GoogleApiAvailabilityLight.a, "headsetState", "doRoleSwitch", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/ife/IHMConnectionCallback;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function1;", "unregisterConnectionStatusChangeInternalCallback", "g", "registerConnectionStatusChangeInternalCallback", "Z", "working", "Lcom/xiaomi/hm/health/bt/utils/AsyncHandler;", "Lcom/xiaomi/hm/health/bt/utils/AsyncHandler;", "asyncHandler", "Landroid/os/Handler;", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "Lcom/xiaomi/hm/health/bt/profile/gdsp/IHMDataCallback;", "Ljava/io/File;", "m", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/bt/classic/HMSyncLogTask;", "o", "Lcom/xiaomi/hm/health/bt/classic/HMSyncLogTask;", "currentLogTask", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.google.android.exoplayer2.text.ttml.b.r, "Ljava/util/concurrent/atomic/AtomicBoolean;", "forceStop", DTransferConstants.SEARCH_KEY, "isNeedDualDeviceLog", "Lcom/huami/bluetooth/device/function/log/DoSwitchRoleAction;", "r", "Lcom/huami/bluetooth/device/function/log/DoSwitchRoleAction;", "doSwitchRoleAction", "com/huami/bluetooth/device/function/log/HeadsetLogTask$innerCallback$1", SOAP.XMLNS, "Lcom/huami/bluetooth/device/function/log/HeadsetLogTask$innerCallback$1;", "innerCallback", "<init>", "(Landroid/os/Looper;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeadsetLogTask {
    public static final int HALF = 100;

    @NotNull
    private static final String u = "HeadsetLogTask";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Looper looper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<ITransport> transport;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String deviceAddress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<HeadsetDevice.HeadsetDeviceState> headsetState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> doRoleSwitch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function1<IHMConnectionCallback, Unit> unregisterConnectionStatusChangeInternalCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Function1<IHMConnectionCallback, Unit> registerConnectionStatusChangeInternalCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private volatile boolean working;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private AsyncHandler asyncHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private IHMDataCallback<File> callback;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private File file;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private File anotherFile;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isOutputSingleFile;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    private HMSyncLogTask currentLogTask;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean forceStop;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private volatile boolean isNeedDualDeviceLog;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    private DoSwitchRoleAction doSwitchRoleAction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final HeadsetLogTask$innerCallback$1 innerCallback;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HandlerThread> t = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/device/function/log/HeadsetLogTask$Companion;", "", "Landroid/os/HandlerThread;", "workerThread$delegate", "Lkotlin/Lazy;", "getWorkerThread", "()Landroid/os/HandlerThread;", "workerThread", "", "HALF", LogUtil.I, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "workerThread", "getWorkerThread()Landroid/os/HandlerThread;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HandlerThread getWorkerThread() {
            return (HandlerThread) HeadsetLogTask.t.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/HandlerThread;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HandlerThread> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread(HeadsetLogTask.u);
            handlerThread.start();
            return handlerThread;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/os/Handler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Handler> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(HeadsetLogTask.this.looper);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (HeadsetLogTask.this.currentLogTask != null) {
                HeadsetLogTask.this.forceStop.set(true);
                HMSyncLogTask hMSyncLogTask = HeadsetLogTask.this.currentLogTask;
                if (hMSyncLogTask == null) {
                    return;
                }
                hMSyncLogTask.forceStop();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetLogTask(@NotNull Looper looper, @NotNull Function0<? extends ITransport> function0, @NotNull String str, @NotNull Function0<HeadsetDevice.HeadsetDeviceState> function1, @NotNull Function0<Boolean> function2, @NotNull Function1<? super IHMConnectionCallback, Unit> function3, @NotNull Function1<? super IHMConnectionCallback, Unit> function4) {
        this.looper = looper;
        this.transport = function0;
        this.deviceAddress = str;
        this.headsetState = function1;
        this.doRoleSwitch = function2;
        this.unregisterConnectionStatusChangeInternalCallback = function3;
        this.registerConnectionStatusChangeInternalCallback = function4;
        this.handler = LazyKt__LazyJVMKt.lazy(new b());
        this.isOutputSingleFile = true;
        this.forceStop = new AtomicBoolean(false);
        this.isNeedDualDeviceLog = true;
        this.innerCallback = new HeadsetLogTask$innerCallback$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(final Function0<Unit> task) {
        Unit unit;
        AsyncHandler asyncHandler = this.asyncHandler;
        if (asyncHandler == null) {
            unit = null;
        } else {
            asyncHandler.run(new Runnable() { // from class: qt3
                @Override // java.lang.Runnable
                public final void run() {
                    HeadsetLogTask.d(task);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            task.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        File file;
        if (this.isOutputSingleFile) {
            Handler handlerG = g();
            File file2 = this.file;
            Objects.requireNonNull(file2);
            handlerG.post(l(file2, false, true));
        }
        boolean z = this.isOutputSingleFile;
        if (z) {
            file = this.file;
            Objects.requireNonNull(file);
        } else {
            file = this.anotherFile;
        }
        if (file == null) {
            return;
        }
        this.currentLogTask = new HMSyncLogTask(this.transport.invoke(), file, this.innerCallback, z);
        g().post(this.currentLogTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final File data, HMDeviceError error) {
        DoSwitchRoleAction doSwitchRoleAction = new DoSwitchRoleAction(this.deviceAddress, this.headsetState, this.doRoleSwitch, this.unregisterConnectionStatusChangeInternalCallback);
        doSwitchRoleAction.registerSwitchRoleCallback(new SwitchRoleCallback() { // from class: com.huami.bluetooth.device.function.log.HeadsetLogTask$doSwitchRole$1$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Unit> {
                public final /* synthetic */ boolean a;
                public final /* synthetic */ HeadsetLogTask b;
                public final /* synthetic */ File c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, HeadsetLogTask headsetLogTask, File file) {
                    super(0);
                    this.a = z;
                    this.b = headsetLogTask;
                    this.c = file;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Debug.fi("HeadsetLogTask", Intrinsics.stringPlus("onSwitchRoleResult:", Boolean.valueOf(this.a)));
                    if (this.a) {
                        this.b.e();
                        return;
                    }
                    IHMDataCallback iHMDataCallback = this.b.callback;
                    Objects.requireNonNull(iHMDataCallback);
                    iHMDataCallback.onStop(this.c, new HMDeviceError(100));
                }
            }

            @Override // com.huami.bluetooth.device.function.log.SwitchRoleCallback
            public void onSwitchRoleResult(boolean result) {
                HeadsetLogTask headsetLogTask = this.a;
                headsetLogTask.c(new a(result, headsetLogTask, data));
            }
        });
        this.registerConnectionStatusChangeInternalCallback.invoke(doSwitchRoleAction);
        Unit unit = Unit.INSTANCE;
        this.doSwitchRoleAction = doSwitchRoleAction;
        g().post(this.doSwitchRoleAction);
    }

    private final Handler g() {
        return (Handler) this.handler.getValue();
    }

    private final boolean h() {
        ITransport iTransportInvoke = this.transport.invoke();
        if (iTransportInvoke == null) {
            return false;
        }
        if (!(iTransportInvoke instanceof ClassicConnection)) {
            iTransportInvoke = null;
        }
        if (iTransportInvoke == null) {
            return false;
        }
        return ((ClassicConnection) iTransportInvoke).isConnected();
    }

    private final boolean i() {
        HeadsetDevice.HeadsetDeviceState headsetDeviceStateInvoke = this.headsetState.invoke();
        return Intrinsics.areEqual(headsetDeviceStateInvoke == null ? null : headsetDeviceStateInvoke.getHost(), MultiDeviceState.Host.Left.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        Debug.fi(u, "onAllCompleted:sync Headset Device all complete");
        this.working = false;
        this.currentLogTask = null;
        this.doSwitchRoleAction = null;
        this.forceStop.set(false);
    }

    private final void k() {
        if (this.isOutputSingleFile) {
            Handler handlerG = g();
            File file = this.file;
            Objects.requireNonNull(file);
            handlerG.post(l(file, true, false));
        }
        boolean z = this.isOutputSingleFile;
        ITransport iTransportInvoke = this.transport.invoke();
        File file2 = this.file;
        Objects.requireNonNull(file2);
        this.currentLogTask = new HMSyncLogTask(iTransportInvoke, file2, this.innerCallback, z);
        g().post(this.currentLogTask);
    }

    private final Runnable l(final File file, final boolean isFirstLog, final boolean append) {
        return new Runnable() { // from class: pt3
            @Override // java.lang.Runnable
            public final void run() {
                HeadsetLogTask.n(file, append, isFirstLog, this);
            }
        };
    }

    public static /* synthetic */ Runnable m(HeadsetLogTask headsetLogTask, File file, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return headsetLogTask.l(file, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(File file, boolean z, boolean z2, HeadsetLogTask headsetLogTask) {
        FileWriter fileWriter = new FileWriter(file, z);
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("------------------------------Currently the ");
            sb.append(headsetLogTask.i() ? "left" : "right");
            sb.append(" ear log------------------------------\n");
            fileWriter.write(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("------------------------------Next is the ");
            sb2.append(headsetLogTask.i() ? "left" : "right");
            sb2.append(" ear log------------------------------\n");
            fileWriter.write(sb2.toString());
        }
        fileWriter.flush();
        fileWriter.close();
    }

    public final void start(boolean isOutputSingleFile, @NotNull File file, @Nullable File anotherFile, @NotNull IHMDataCallback<File> callback) {
        if (!h()) {
            Debug.fi(u, "Start failed: disConnected");
            callback.onStart();
            callback.onStop(file, new HMDeviceError(3));
            return;
        }
        if (this.working) {
            Debug.fi(u, "Start failed: getHeadsetDeviceLog working!");
            callback.onStart();
            callback.onStop(file, new HMDeviceError(100));
            return;
        }
        HeadsetDevice.HeadsetDeviceState headsetDeviceStateInvoke = this.headsetState.invoke();
        this.isNeedDualDeviceLog = headsetDeviceStateInvoke == null ? false : headsetDeviceStateInvoke.isDualConnected();
        this.callback = callback;
        this.isOutputSingleFile = isOutputSingleFile;
        this.file = file;
        this.anotherFile = anotherFile;
        this.working = true;
        try {
            this.asyncHandler = new AsyncHandler();
        } catch (RuntimeException e) {
            Debug.fi(u, Intrinsics.stringPlus("asyncHandler init exception", e.getMessage()));
        }
        Debug.fi(u, "sync Headset Device Log start");
        k();
    }

    public final void terminateDeviceLog() {
        c(new c());
    }

    public HeadsetLogTask(@NotNull Function0<? extends ITransport> function0, @NotNull String str, @NotNull Function0<HeadsetDevice.HeadsetDeviceState> function1, @NotNull Function0<Boolean> function2, @NotNull Function1<? super IHMConnectionCallback, Unit> function3, @NotNull Function1<? super IHMConnectionCallback, Unit> function4) {
        this(INSTANCE.getWorkerThread().getLooper(), function0, str, function1, function2, function3, function4);
    }
}
