package com.xiaomi.fitness.keep_alive;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.n0a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\fH\u0003J\b\u0010\u0011\u001a\u00020\fH\u0002J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\fJ\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010 \u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/keep_alive/TimeTracker;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "TAG", "", "PROCESS_MINUTE", "scope", "Lkotlinx/coroutines/CoroutineScope;", "timeStart", "", "init", "", "trackProcessAlive", "report", "", "reportProcessAliveAboveR", "reportProcessAliveBelowR", "loop", CervicalMucusRecord.Appearance.CLEAR, "getFrom", "", BroadcastsKt.SILENT_PUSHING_CANCEL, "onConnectStart", "did", "onConnectFailure", "errorCode", "", "retryTimes", "connectStart", "connected", "onConnectSuccess", "onDisconnect", "reasonCodeToString", "reason", "keep-alive_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeTracker implements OnDeviceStatusListener {

    @NotNull
    public static final TimeTracker INSTANCE = new TimeTracker();

    @NotNull
    private static final String PROCESS_MINUTE = "process_minute";

    @NotNull
    private static final String TAG = "TimeTracker";
    private static volatile long connectStart;
    private static volatile boolean connected;

    @Nullable
    private static CoroutineScope scope;
    private static long timeStart;

    /* JADX INFO: renamed from: com.xiaomi.fitness.keep_alive.TimeTracker$loop$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.keep_alive.TimeTracker$loop$1", f = "TimeTracker.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                long jCurrentTimeMillis = System.currentTimeMillis() - TimeTracker.timeStart;
                long j = 60000;
                KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
                keepAlivePreference.setKEY_PROCESS_ALIVE_MINUTE((int) (jCurrentTimeMillis / j));
                if (!keepAlivePreference.getKEY_WAS_FOREGROUND_STARTED() && KeepAliveService.INSTANCE.getSIsForegroundStarted()) {
                    keepAlivePreference.setKEY_WAS_FOREGROUND_STARTED(true);
                }
                if (!keepAlivePreference.getKEY_WAS_START_ALARM() && AlarmBroadcastReceiver.f12354a) {
                    keepAlivePreference.setKEY_WAS_START_ALARM(true);
                }
                if (!keepAlivePreference.getKEY_WAS_START_JOB_SCHEDULER() && KeepAliveJobSchedulerService.f12359a) {
                    keepAlivePreference.setKEY_WAS_START_JOB_SCHEDULER(true);
                }
                keepAlivePreference.setKEY_LATEST_IS_FOREGROUND(KeepAliveService.INSTANCE.getSIsForegroundStarted());
                if (TimeTracker.connected) {
                    long jCurrentTimeMillis2 = (System.currentTimeMillis() - TimeTracker.connectStart) / j;
                    Logger.i(TimeTracker.TAG, "trackProcessAlive() called duration " + jCurrentTimeMillis2 + ", miill " + System.currentTimeMillis() + ", start " + TimeTracker.connectStart);
                    keepAlivePreference.setKEY_CONNECT_PART_TIME((int) jCurrentTimeMillis2);
                }
                this.label = 1;
            } while (DelayKt.delay(60000L, this) != coroutine_suspended);
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private TimeTracker() {
    }

    private final void clear() {
        KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
        keepAlivePreference.setKEY_PROCESS_ALIVE_MINUTE(0);
        keepAlivePreference.setKEY_WAS_FOREGROUND_STARTED(false);
        keepAlivePreference.setKEY_WAS_START_ALARM(false);
        keepAlivePreference.setKEY_WAS_START_JOB_SCHEDULER(false);
        keepAlivePreference.setKEY_CONNECT_ALL_TIME(0);
        keepAlivePreference.setKEY_CONNECT_PART_TIME(0);
        keepAlivePreference.setKEY_START_CONNECT(false);
    }

    private final void loop() {
        cancel();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AnonymousClass1(null), 3, null);
        scope = CoroutineScope;
    }

    private final String reasonCodeToString(int reason) {
        switch (reason) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return "ANR";
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case 11:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case 13:
                return "OTHER KILLS BY SYSTEM";
            case 14:
                return "FREEZER";
            default:
                return DeviceTypes.UNKNOWN;
        }
    }

    @RequiresApi(30)
    private final void reportProcessAliveAboveR() {
        KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
        long key_process_start = keepAlivePreference.getKEY_PROCESS_START();
        if (key_process_start == 0) {
            keepAlivePreference.setKEY_PROCESS_START(System.currentTimeMillis());
            return;
        }
        Object systemService = ApplicationExtKt.getApplication().getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 5);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        if (historicalProcessExitReasons.isEmpty()) {
            Logger.i(TAG, "reportProcessAliveAboveR() called exit info empty");
            return;
        }
        Iterator it = historicalProcessExitReasons.iterator();
        ApplicationExitInfo applicationExitInfo = null;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = n0a.a(it.next());
            String processName = applicationExitInfoA.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "getProcessName(...)");
            if (StringsKt__StringsKt.contains$default((CharSequence) processName, (CharSequence) ":device", false, 2, (Object) null) && (applicationExitInfo == null || applicationExitInfoA.getTimestamp() > applicationExitInfo.getTimestamp())) {
                applicationExitInfo = applicationExitInfoA;
            }
        }
        if (applicationExitInfo == null) {
            Logger.i(TAG, "reportProcessAliveAboveR() called exit info null");
            return;
        }
        Logger.i(TAG, "getProcessAlive() called " + applicationExitInfo);
        long j = (long) 60000;
        int timestamp = (int) ((applicationExitInfo.getTimestamp() - key_process_start) / j);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("view", "56.66.0.1.27701");
        Object[] objArr = new Object[20];
        objArr[0] = "duration";
        objArr[1] = String.valueOf(timestamp);
        objArr[2] = "is_foreground";
        KeepAlivePreference keepAlivePreference2 = KeepAlivePreference.INSTANCE;
        objArr[3] = String.valueOf(keepAlivePreference2.getKEY_LATEST_IS_FOREGROUND());
        objArr[4] = "was_start_foreground";
        objArr[5] = String.valueOf(keepAlivePreference2.getKEY_WAS_FOREGROUND_STARTED());
        objArr[6] = "from";
        objArr[7] = String.valueOf((int) getFrom());
        objArr[8] = "start_connect";
        objArr[9] = Boolean.valueOf(keepAlivePreference2.getKEY_START_CONNECT());
        objArr[10] = "duration_dict";
        objArr[11] = Integer.valueOf(keepAlivePreference2.getKEY_CONNECT_ALL_TIME() + keepAlivePreference2.getKEY_CONNECT_PART_TIME());
        objArr[12] = "reason";
        objArr[13] = reasonCodeToString(applicationExitInfo.getReason());
        objArr[14] = "sub_reason";
        String description = applicationExitInfo.getDescription();
        if (description == null) {
            description = "";
        }
        objArr[15] = description;
        objArr[16] = "importance";
        objArr[17] = Integer.valueOf(applicationExitInfo.getImportance());
        objArr[18] = "interval";
        objArr[19] = Long.valueOf((System.currentTimeMillis() - applicationExitInfo.getTimestamp()) / j);
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        keepAlivePreference2.setKEY_PROCESS_START(System.currentTimeMillis());
    }

    private final void reportProcessAliveBelowR() {
        KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
        int key_process_alive_minute = keepAlivePreference.getKEY_PROCESS_ALIVE_MINUTE();
        if (key_process_alive_minute > 0) {
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("view", "56.66.0.1.27701"), "duration", String.valueOf(key_process_alive_minute), "is_foreground", String.valueOf(keepAlivePreference.getKEY_LATEST_IS_FOREGROUND()), "was_start_foreground", String.valueOf(keepAlivePreference.getKEY_WAS_FOREGROUND_STARTED()), "from", String.valueOf((int) getFrom()), "start_connect", Boolean.valueOf(keepAlivePreference.getKEY_START_CONNECT()), "duration_dict", Integer.valueOf(keepAlivePreference.getKEY_CONNECT_ALL_TIME() + keepAlivePreference.getKEY_CONNECT_PART_TIME()));
        }
    }

    public final void cancel() {
        CoroutineScope coroutineScope = scope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        scope = null;
    }

    public final byte getFrom() {
        KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
        boolean key_was_start_alarm = keepAlivePreference.getKEY_WAS_START_ALARM();
        byte b2 = (byte) ((key_was_start_alarm ? 1 : 0) | (keepAlivePreference.getKEY_WAS_START_JOB_SCHEDULER() ? 2 : 0) | (keepAlivePreference.getKEY_WAS_FOREGROUND_STARTED() ? 4 : 0));
        StringBuilder sb = new StringBuilder();
        sb.append("getFrom: ");
        sb.append((int) b2);
        return b2;
    }

    public final void init() {
        timeStart = System.currentTimeMillis();
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
        KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
        if (keepAlivePreference.getKEY_START_CONNECT()) {
            return;
        }
        keepAlivePreference.setKEY_START_CONNECT(true);
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            connected = true;
            KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
            keepAlivePreference.setKEY_CONNECT_ALL_TIME(keepAlivePreference.getKEY_CONNECT_ALL_TIME() + keepAlivePreference.getKEY_CONNECT_PART_TIME());
            keepAlivePreference.setKEY_CONNECT_PART_TIME(0);
            connectStart = System.currentTimeMillis();
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            connected = false;
            KeepAlivePreference keepAlivePreference = KeepAlivePreference.INSTANCE;
            keepAlivePreference.setKEY_CONNECT_ALL_TIME(keepAlivePreference.getKEY_CONNECT_ALL_TIME() + keepAlivePreference.getKEY_CONNECT_PART_TIME());
            keepAlivePreference.setKEY_CONNECT_PART_TIME(0);
            Logger.i(TAG, "onDisconnect() called with: did = " + did + ", " + keepAlivePreference.getKEY_CONNECT_ALL_TIME());
        }
    }

    public final void trackProcessAlive(boolean report) {
        if (!report) {
            Logger.i(TAG, "trackProcessAlive() not report");
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            reportProcessAliveAboveR();
        } else {
            reportProcessAliveBelowR();
        }
        clear();
        loop();
    }
}
