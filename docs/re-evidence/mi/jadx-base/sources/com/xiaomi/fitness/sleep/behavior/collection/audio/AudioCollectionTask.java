package com.xiaomi.fitness.sleep.behavior.collection.audio;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import com.xiaomi.fitness.sleep.behavior.analyze.core.SleepingBehaviorDetector;
import com.xiaomi.fitness.sleep.behavior.analyze.snore.SleepSnoreReportGenerator;
import com.xiaomi.fitness.sleep.behavior.collection.CollectionTask;
import com.xiaomi.fitness.sleep.behavior.collection.audio.AudioCollectionTask;
import com.xiaomi.fitness.sleep.trace.db.SleepReport;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import defpackage.b1j;
import defpackage.owg;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import services.reminder.notification.NotificationFactory;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0002EFB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\u001a\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u001a\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\u001eH\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\rH\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\rH\u0003J\b\u00107\u001a\u00020\rH\u0002J\b\u00108\u001a\u00020\u0019H\u0002J\u0010\u00109\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010:\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0010\u0010;\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0018\u0010<\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u001eH\u0002J\u0010\u0010>\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\b\u0010A\u001a\u00020\u0019H\u0002J\u0010\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\u001cH\u0002J\b\u0010D\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioCollectionTask;", "Lcom/xiaomi/fitness/sleep/behavior/collection/CollectionTask;", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mBatteryHandler", "Landroid/os/Handler;", "mAudioRecorder", "Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder;", "mUnlockReceiver", "Landroid/content/BroadcastReceiver;", "beingAnalyzed", "", "mLastCheckBatteryTime", "", "beingRunAudioBattery", "", "mBatteryRunnable", "Ljava/lang/Runnable;", "mAudioCollectionListener", "Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder$AudioCollectionListener;", "isActive", "()Z", "performStartTask", "", "context", "checkPermissions", "", "packageName", "", "op", "performPauseTask", "onInterruptTask", "performCancelTask", "performFinishTask", "result", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReport;", "doPauseAudio", "taskPausedState", "cancelBatteryCheckTask", "checkBatteryStatusIfNeed", "stopRecord", "clearCollectionTempResult", "handleResultFiles", "printAllFile", "fileDir", "Ljava/io/File;", "kindTag", "updateStatus", "isRunning", "analyzeAudio", "audioData", "", "isEnd", "needDelayStart", "removeDelayStartEvent", "registUnlockRecevier", "unregistUnlockReceiver", "postNormalNotification", "popNotification", "type", "cancelNotification", "createNotification", "Landroid/app/Notification;", "cancelTask", "isSnailAvailable", Constants.PARAM_STATUS_CODE, "getName", "RecordStatus", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioCollectionTask extends CollectionTask {
    private static final long DELAYED_TIME_MILLS = 2000;
    private static final int ERROR_CODE_SNAIL_ERROR = 1;
    private static final int NOTIFICATION_ID_SLEEP_SNORE_DETECTION = 102;

    @NotNull
    private static final String TAG = "AudioCollectionTask";
    private volatile boolean beingAnalyzed;
    private float beingRunAudioBattery;

    @NotNull
    private final AudioRecorder.AudioCollectionListener mAudioCollectionListener;

    @NotNull
    private final AudioRecorder mAudioRecorder;

    @NotNull
    private final Handler mBatteryHandler;

    @NotNull
    private final Runnable mBatteryRunnable;

    @NotNull
    private final Context mContext;
    private long mLastCheckBatteryTime;

    @NotNull
    private final BroadcastReceiver mUnlockReceiver;
    private static final long MAX_QUERY_BATTERY_INTERVAL = TimeUnit.MINUTES.toMillis(30);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0081\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioCollectionTask$RecordStatus;", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RecordStatus {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int STATUS_NO_DATA = -2;
        public static final int STATUS_PAUSED = 1;
        public static final int STATUS_PAUSED_LOW_POWER = 2;
        public static final int STATUS_PAUSED_UNLOCK = 3;
        public static final int STATUS_READ_FAILED = -3;
        public static final int STATUS_START_FAILED = -1;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioCollectionTask$RecordStatus$Companion;", "", "<init>", "()V", "STATUS_START_FAILED", "", "STATUS_NO_DATA", "STATUS_READ_FAILED", "STATUS_PAUSED", "STATUS_PAUSED_LOW_POWER", "STATUS_PAUSED_UNLOCK", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int STATUS_NO_DATA = -2;
            public static final int STATUS_PAUSED = 1;
            public static final int STATUS_PAUSED_LOW_POWER = 2;
            public static final int STATUS_PAUSED_UNLOCK = 3;
            public static final int STATUS_READ_FAILED = -3;
            public static final int STATUS_START_FAILED = -1;

            private Companion() {
            }
        }
    }

    public AudioCollectionTask(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mBatteryHandler = ExecutorHelper.INSTANCE.getMainHandler();
        this.mUnlockReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.sleep.behavior.collection.audio.AudioCollectionTask$mUnlockReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                    this.this$0.mAudioCollectionListener.onAudioRecordStatusChanged(3);
                }
            }
        };
        this.mBatteryRunnable = new Runnable() { // from class: com.xiaomi.fitness.sleep.behavior.collection.audio.AudioCollectionTask$mBatteryRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                Application application = ApplicationExtKt.getApplication();
                Intent intentRegisterReceiver = application.registerReceiver(null, intentFilter);
                if (intentRegisterReceiver != null) {
                    this.this$0.mLastCheckBatteryTime = System.currentTimeMillis();
                    int intExtra = intentRegisterReceiver.getIntExtra("status", 1);
                    if (intExtra == 2 || intExtra == 5) {
                        this.this$0.mBatteryHandler.postDelayed(this, AudioCollectionTask.MAX_QUERY_BATTERY_INTERVAL);
                        return;
                    }
                    try {
                        float intExtra2 = (intentRegisterReceiver.getIntExtra("level", 0) * 100.0f) / intentRegisterReceiver.getIntExtra("scale", 1);
                        if (this.this$0.beingRunAudioBattery == 0.0f) {
                            this.this$0.beingRunAudioBattery = intExtra2;
                            Logger.i("AudioCollectionTask", "beingRunAudioBattery  " + this.this$0.beingRunAudioBattery);
                        }
                        if ((intExtra2 < 30.0f || this.this$0.beingRunAudioBattery - intExtra2 >= 30.0f) && this.this$0.isRunning(application)) {
                            this.this$0.doPauseAudio(application, 2);
                        }
                    } finally {
                        this.this$0.mBatteryHandler.postDelayed(this, AudioCollectionTask.MAX_QUERY_BATTERY_INTERVAL);
                    }
                }
            }
        };
        AudioRecorder.AudioCollectionListener audioCollectionListener = new AudioRecorder.AudioCollectionListener() { // from class: com.xiaomi.fitness.sleep.behavior.collection.audio.AudioCollectionTask$mAudioCollectionListener$1
            @Override // com.xiaomi.fitness.sleep.behavior.collection.audio.AudioRecorder.AudioCollectionListener
            public void inPutAudioData(byte[] cpSoundBuffer, boolean isEnd) {
                Intrinsics.checkNotNullParameter(cpSoundBuffer, "cpSoundBuffer");
                this.this$0.analyzeAudio(cpSoundBuffer, isEnd);
            }

            @Override // com.xiaomi.fitness.sleep.behavior.collection.audio.AudioRecorder.AudioCollectionListener
            public void onAudioRecordStatusChanged(int recordStatus) {
                AudioCollectionTask audioCollectionTask = this.this$0;
                if (audioCollectionTask.isInProgress(audioCollectionTask.mContext)) {
                    AudioCollectionTask audioCollectionTask2 = this.this$0;
                    audioCollectionTask2.doPauseAudio(audioCollectionTask2.mContext, recordStatus);
                }
            }
        };
        this.mAudioCollectionListener = audioCollectionListener;
        this.mAudioRecorder = new AudioRecorder(audioCollectionListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void analyzeAudio(byte[] audioData, boolean isEnd) {
        if (!this.beingAnalyzed) {
            if (isSnailAvailable(SleepingBehaviorDetector.INSTANCE.getINSTANCE().soundIdentify(System.currentTimeMillis() / ((long) 1000), audioData, false))) {
                this.beingAnalyzed = true;
                return;
            }
            return;
        }
        SleepingBehaviorDetector.Companion companion = SleepingBehaviorDetector.INSTANCE;
        if (isSnailAvailable(companion.getINSTANCE().soundIdentify(0L, audioData, isEnd)) && isEnd) {
            this.beingAnalyzed = false;
            updateStatus(false);
            companion.getINSTANCE().release();
        }
    }

    private final void cancelBatteryCheckTask() {
        this.mBatteryHandler.removeCallbacks(this.mBatteryRunnable);
    }

    private final void cancelNotification(Context context) {
        Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getSystemService(...)");
        ((NotificationManager) systemService).cancel(102);
    }

    private final void cancelTask() {
        onCancelTask(this.mContext);
    }

    private final void checkBatteryStatusIfNeed() {
        if (this.mLastCheckBatteryTime == 0 || System.currentTimeMillis() - this.mLastCheckBatteryTime >= MAX_QUERY_BATTERY_INTERVAL) {
            this.mBatteryHandler.post(this.mBatteryRunnable);
        }
    }

    private final void clearCollectionTempResult(Context context) {
        FileUtils.INSTANCE.deleteFile(new File(BehaviorConfiguration.INSTANCE.getTempResultDirAbsolutePath(context)));
    }

    private final Notification createNotification(Context context) {
        owg owgVar = new owg();
        owg.b bVar = new owg.b();
        bVar.f29767a = "channel:background_service";
        bVar.f29768b = context.getString(b1j.c);
        owgVar.c = bVar;
        Intent intent = new Intent();
        intent.setAction(context.getPackageName() + ".action.SLEEP_DETECT");
        intent.setPackage(context.getPackageName());
        owgVar.r(intent);
        owgVar.m = context.getApplicationInfo().icon;
        owgVar.g = context.getString(b1j.c);
        owgVar.e = 2;
        owgVar.t(0);
        owgVar.h = context.getString(b1j.e);
        return NotificationFactory.INSTANCE.create(context, owgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doPauseAudio(Context context, int taskPausedState) {
        Logger.i(TAG, "pause task, state: " + taskPausedState);
        stopRecord(context);
        updateTaskState(context, 2);
        if (taskPausedState == 1) {
            popNotification(context, "sleep_snore_detection_stop");
        } else if (taskPausedState == 2) {
            popNotification(context, "sleep_snore_detection_stop_cause_low_power");
        } else {
            if (taskPausedState != 3) {
                throw new IllegalStateException();
            }
            cancelNotification(context);
        }
    }

    private final void handleResultFiles(Context context) {
        BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
        File file = new File(behaviorConfiguration.getSnailAudioConfigTempDirPath(context));
        printAllFile(file, "audioConfigDir");
        FileUtils fileUtils = FileUtils.INSTANCE;
        fileUtils.deleteFile(file);
        Logger.i(TAG, "delete tempDir " + file.getAbsoluteFile());
        File file2 = new File(behaviorConfiguration.getTempResultDirAbsolutePath(context));
        printAllFile(file2, "audioTempDir");
        String currentDayFilePath = behaviorConfiguration.getCurrentDayFilePath(context);
        fileUtils.rename(file2, currentDayFilePath);
        Logger.i(TAG, "rename: from " + file2.getAbsoluteFile() + ", to " + currentDayFilePath);
    }

    private final boolean isSnailAvailable(int statusCode) {
        if (statusCode != 1) {
            return true;
        }
        cancelTask();
        Logger.e(TAG, "snail sdk is not available");
        return false;
    }

    private final boolean needDelayStart() {
        BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
        long snoreDetectionFirstStartTimeMills = behaviorConfiguration.getSnoreDetectionFirstStartTimeMills();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (snoreDetectionFirstStartTimeMills != 0 && jCurrentTimeMillis - snoreDetectionFirstStartTimeMills >= TimeUnit.HOURS.toMillis(1L)) {
            return false;
        }
        behaviorConfiguration.setSnoreDetectionFirstStartTimeMills(jCurrentTimeMillis);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performCancelTask$lambda$1(AudioCollectionTask this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.clearCollectionTempResult(context);
        Logger.i(TAG, "cleared temp result");
        AudioTaskEnvironment.INSTANCE.setCancelModeDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performStartTask$lambda$0(AudioCollectionTask this$0, Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Logger.i(TAG, "performStartTask: startRecording");
        String packageName = AppUtil.getApp().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        int iCheckPermissions = this$0.checkPermissions(context, packageName, "android:record_audio");
        if (iCheckPermissions != 0) {
            BehaviorConfiguration.INSTANCE.setSleepSnoreRequestStatus(System.currentTimeMillis() / ((long) 1000));
        }
        Logger.i(TAG, "performStartTask: startRecording checkPermissions " + iCheckPermissions);
        this$0.mAudioRecorder.startRecording();
        return Unit.INSTANCE;
    }

    private final void popNotification(Context context, String type) {
        ((NotificationManager) context.getSystemService(NotificationManager.class)).notify(102, createNotification(context));
    }

    private final void postNormalNotification(Context context) {
        cancelNotification(context);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).notify(102, createNotification(context));
    }

    private final void printAllFile(File fileDir, String kindTag) {
        if (fileDir == null || !fileDir.exists()) {
            Logger.e(TAG, "fileDir not exists or null");
            return;
        }
        Logger.i(TAG, "files in " + kindTag);
        FileUtils.INSTANCE.printAllFilesInDir(fileDir, kindTag);
    }

    private final void registUnlockRecevier(Context context) {
        context.getApplicationContext().registerReceiver(this.mUnlockReceiver, new IntentFilter("android.intent.action.USER_PRESENT"));
    }

    private final void removeDelayStartEvent() {
        BehaviorConfiguration.INSTANCE.setSnoreDetectionFirstStartTimeMills(0L);
    }

    private final void stopRecord(Context context) {
        if (this.mAudioRecorder.getIsRecording()) {
            this.mAudioRecorder.stopRecording();
        }
        cancelBatteryCheckTask();
        unregistUnlockReceiver(context);
    }

    private final void unregistUnlockReceiver(Context context) {
        try {
            context.getApplicationContext().unregisterReceiver(this.mUnlockReceiver);
        } catch (Exception e) {
            Logger.e(TAG, "unregist failed:", e);
        }
    }

    private final void updateStatus(boolean isRunning) {
        LogExtKt.logi("update task status to " + isRunning);
    }

    @RequiresApi(24)
    public final int checkPermissions(@NotNull Context context, @NotNull String packageName, @NotNull String op) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(op, "op");
        try {
            int packageUid = context.getPackageManager().getPackageUid(packageName, 0);
            Object systemService = context.getSystemService("appops");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            return ((AppOpsManager) systemService).checkOp(op, packageUid, packageName);
        } catch (SecurityException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    @NotNull
    public String getName() {
        return TAG;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public boolean isActive() {
        boolean zIsSleepSnoreDetectionEnable = BehaviorConfiguration.INSTANCE.isSleepSnoreDetectionEnable();
        LogExtKt.logi("audio collect task's active is " + zIsSleepSnoreDetectionEnable);
        return zIsSleepSnoreDetectionEnable;
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void onInterruptTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onInterruptTask(context);
        performCancelTask(context);
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performCancelTask(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        cancelNotification(context);
        BehaviorConfiguration.INSTANCE.setKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease(false);
        stopRecord(context);
        if (AudioTaskEnvironment.INSTANCE.isCancelClearMode()) {
            ExecutorHelper.INSTANCE.postInWorker(new Runnable() { // from class: qm1
                @Override // java.lang.Runnable
                public final void run() {
                    AudioCollectionTask.performCancelTask$lambda$1(this.f31645a, context);
                }
            }, 2000L);
        }
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performFinishTask(@NotNull Context context, @Nullable SleepReport result) {
        Intrinsics.checkNotNullParameter(context, "context");
        stopRecord(context);
        BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
        behaviorConfiguration.setSnoreDetectionFinishTimeMills$sleep_trace_chinaProductRelease(System.currentTimeMillis());
        cancelNotification(context);
        behaviorConfiguration.setKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease(false);
        AudioTaskEnvironment audioTaskEnvironment = AudioTaskEnvironment.INSTANCE;
        if (audioTaskEnvironment.isNeedGenerateReport()) {
            handleResultFiles(context);
            new SleepSnoreReportGenerator().generateReport(result);
        }
        audioTaskEnvironment.release();
        removeDelayStartEvent();
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performPauseTask(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        doPauseAudio(context, 1);
    }

    @Override // com.xiaomi.fitness.sleep.behavior.collection.CollectionTask
    public void performStartTask(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (needDelayStart() || this.beingAnalyzed) {
            Logger.e(TAG, "performStartTask: needDelayStart=true, beingAnalyzed=" + this.beingAnalyzed);
            return;
        }
        Logger.i(TAG, "start record");
        postNormalNotification(context);
        AudioTaskEnvironment.INSTANCE.prepare();
        updateStatus(true);
        BehaviorConfiguration behaviorConfiguration = BehaviorConfiguration.INSTANCE;
        if (!behaviorConfiguration.getKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease()) {
            clearCollectionTempResult(context);
            behaviorConfiguration.setKEY_SNORE_DETECTION_IN_PROGRESS$sleep_trace_chinaProductRelease(true);
        }
        checkBatteryStatusIfNeed();
        registUnlockRecevier(context);
        SleepingBehaviorDetector.INSTANCE.getINSTANCE().init(context, behaviorConfiguration.getSnailAudioResultTempPath(context), new Function0() { // from class: pm1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioCollectionTask.performStartTask$lambda$0(this.f30530a, context);
            }
        });
    }
}
