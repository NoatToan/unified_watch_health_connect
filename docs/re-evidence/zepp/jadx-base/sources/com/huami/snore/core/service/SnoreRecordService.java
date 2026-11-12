package com.huami.snore.core.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.snore.core.domain.RecorderConfig;
import com.huami.snore.core.helper.SnoreHelper;
import com.huami.snore.core.processor.SnoreMonitorProcessor;
import com.huami.snore.core.service.SnoreRecordService;
import com.huami.snore.core.util.DateParseUtilKt;
import com.huami.snore.core.util.NotificationBuildUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.liulishuo.engzo.lingorecorder.LingoRecorder;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0016J\"\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/snore/core/service/SnoreRecordService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "", "c", "", "type", "f", "onCreate", "", DataCacher.j, "startId", "onStartCommand", "Landroid/os/IBinder;", "onBind", "onDestroy", "Lcom/liulishuo/engzo/lingorecorder/LingoRecorder;", "a", "Lcom/liulishuo/engzo/lingorecorder/LingoRecorder;", "lingoRecorder", "", "b", "J", "startTime", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreRecordService extends Service {

    @NotNull
    public static final String KEY_MONITOR_START_TIME = "monitor_start_time";

    @NotNull
    public static final String KEY_MONITOR_TOTAL_TIME = "monitor_total_time";

    @NotNull
    public static final String RECORD_FINISH_TYPE = "finish_type";

    @NotNull
    public static final String SNORE_FINISH_ACTION = "snore_finish_action";

    @NotNull
    public static final String TYPE_PROCESS_END = "process_end";

    @NotNull
    public static final String TYPE_PROCESS_ERROR = "process_error";

    @NotNull
    public static final String TYPE_RECORD_END = "record_end";

    @NotNull
    public static final String TYPE_RECORD_ERROR = "record_error";

    @NotNull
    private static final String c = "AudioRecordService";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LingoRecorder lingoRecorder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long startTime;

    private final void c(Intent intent) {
        if (this.lingoRecorder == null) {
            this.lingoRecorder = new LingoRecorder();
        }
        Serializable serializableExtra = intent == null ? null : intent.getSerializableExtra(SnoreHelper.RECORDER_CONFIG);
        if (serializableExtra == null) {
            serializableExtra = new RecorderConfig();
        }
        RecorderConfig recorderConfig = (RecorderConfig) serializableExtra;
        LingoRecorder lingoRecorder = this.lingoRecorder;
        if (lingoRecorder == null) {
            return;
        }
        if (lingoRecorder.isRecording()) {
            lingoRecorder.stop();
        }
        if (intent != null) {
            lingoRecorder.channels(recorderConfig.getChannels());
            lingoRecorder.bitsPerSample(recorderConfig.getBitsPerSample());
            lingoRecorder.sampleRate(recorderConfig.getSampleRate());
        }
        lingoRecorder.setOnRecordStopListener(new LingoRecorder.OnRecordStopListener() { // from class: c67
            @Override // com.liulishuo.engzo.lingorecorder.LingoRecorder.OnRecordStopListener
            public final void onRecordStop(Throwable th, LingoRecorder.OnRecordStopListener.Result result) {
                SnoreRecordService.d(this.a, th, result);
            }
        });
        lingoRecorder.setOnProcessStopListener(new LingoRecorder.OnProcessStopListener() { // from class: b67
            @Override // com.liulishuo.engzo.lingorecorder.LingoRecorder.OnProcessStopListener
            public final void onProcessStop(Throwable th, Map map) {
                SnoreRecordService.e(this.a, th, map);
            }
        });
        lingoRecorder.remove("process1");
        lingoRecorder.put("process1", new SnoreMonitorProcessor(getApplicationContext(), recorderConfig));
        lingoRecorder.start();
        this.startTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(SnoreRecordService snoreRecordService, Throwable th, LingoRecorder.OnRecordStopListener.Result result) {
        if (th != null) {
            snoreRecordService.f(TYPE_RECORD_ERROR);
        } else {
            snoreRecordService.f(TYPE_RECORD_END);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SnoreRecordService snoreRecordService, Throwable th, Map map) {
        if (th != null) {
            snoreRecordService.f(TYPE_PROCESS_ERROR);
        } else {
            snoreRecordService.f(TYPE_PROCESS_END);
        }
    }

    private final void f(String type) {
        stopSelf();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        Intent intent = new Intent();
        intent.setAction(SNORE_FINISH_ACTION);
        intent.putExtra(RECORD_FINISH_TYPE, type);
        intent.putExtra(KEY_MONITOR_TOTAL_TIME, System.currentTimeMillis() - this.startTime);
        intent.putExtra(KEY_MONITOR_START_TIME, DateParseUtilKt.timeStampToDate(Long.valueOf(this.startTime)));
        Unit unit = Unit.INSTANCE;
        localBroadcastManager.sendBroadcast(intent);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(111, NotificationBuildUtil.INSTANCE.buildNotification(this, NotificationBuildUtil.CHANNEL_ID));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LingoRecorder lingoRecorder = this.lingoRecorder;
        if (lingoRecorder == null) {
            return;
        }
        lingoRecorder.stop();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        c(intent);
        return super.onStartCommand(intent, flags, startId);
    }
}
