package com.huami.watch.companion.ecg.media;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.annotation.IntRange;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import com.huami.watch.util.AndroidPermissions;
import com.huami.watch.util.Log;
import com.huami.watch.util.NetworkUtil;
import com.huami.widget.share.ShareAnalytics;
import com.twitter.sdk.android.tweetcomposer.g;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\u00020\u0001:\u000201B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0002R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001c\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper;", "", "", GoogleApiAvailabilityLight.a, "", ShareAnalytics.ParamValue.SAVE, "e", "Ljava/io/File;", "file", "b", "c", "", "filePath", "startRecord", "stopAndRelease", g.g, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/media/MediaRecorder;", "Landroid/media/MediaRecorder;", "mMediaRecorder", "Ljava/io/File;", "currentFile", "Z", "isPrepare", "", "J", "startTime", "Ljava/util/concurrent/ScheduledFuture;", "f", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "taskOne", "Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;", "h", "Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;", "getOnMediaRecordChangeListener", "()Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;", "setOnMediaRecordChangeListener", "(Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;)V", "onMediaRecordChangeListener", "<init>", "(Landroid/content/Context;)V", "Companion", "OnMediaRecordChangeListener", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class MediaRecorderHelper {
    public static final int MAX_LEVEL = 7;
    public static final long MAX_RECORD_TIME = 180000;
    public static final long MIN_RECORD_TIME = 1000;
    public static final long WARN_TIME = 10000;

    @NotNull
    private static final String i = "Ecg-MediaRecord";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private MediaRecorder mMediaRecorder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private File currentFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isPrepare;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ScheduledFuture<?> schedule;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Runnable taskOne = new Runnable() { // from class: zx4
        @Override // java.lang.Runnable
        public final void run() {
            MediaRecorderHelper.g(this.a);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private OnMediaRecordChangeListener onMediaRecordChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaRecorderHelper$OnMediaRecordChangeListener;", "", "", "voiceLevel", "", "onVoiceLevelChange", "Lcom/huami/watch/companion/ecg/media/VoiceRecord;", "voiceRecord", "onMediaRecordSave", "onMediaRecordStart", "", "timeLeft", "timeCountDown", "onNeedPermission", "onNeedNetWork", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public interface OnMediaRecordChangeListener {
        void onMediaRecordSave(@NotNull VoiceRecord voiceRecord);

        void onMediaRecordStart();

        void onNeedNetWork();

        void onNeedPermission();

        void onVoiceLevelChange(@IntRange(from = 0, to = 7) int voiceLevel);

        void timeCountDown(long timeLeft);
    }

    public MediaRecorderHelper(@NotNull Context context) {
        this.context = context;
    }

    private final void b(File file) {
        if ((file != null) && file.exists()) {
            file.delete();
        }
    }

    private final void c() {
        Object systemService = this.context.getSystemService("vibrator");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(50L, -1));
        } else {
            vibrator.vibrate(new long[]{0, 50}, -1);
        }
    }

    private final void d() {
        this.schedule = Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(this.taskOne, 100L, 100L, TimeUnit.MILLISECONDS);
    }

    private final void e(boolean save) {
        ScheduledFuture<?> scheduledFuture = this.schedule;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (!save) {
            b(this.currentFile);
            return;
        }
        File file = this.currentFile;
        if (file == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        if (jCurrentTimeMillis < 1000) {
            b(this.currentFile);
        }
        VoiceRecord voiceRecord = new VoiceRecord(file.getAbsolutePath(), jCurrentTimeMillis);
        OnMediaRecordChangeListener onMediaRecordChangeListener = getOnMediaRecordChangeListener();
        if (onMediaRecordChangeListener == null) {
            return;
        }
        onMediaRecordChangeListener.onMediaRecordSave(voiceRecord);
    }

    public static /* synthetic */ void f(MediaRecorderHelper mediaRecorderHelper, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        mediaRecorderHelper.e(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MediaRecorderHelper mediaRecorderHelper) {
        if (mediaRecorderHelper.isPrepare) {
            try {
                int maxAmplitude = ((mediaRecorderHelper.mMediaRecorder.getMaxAmplitude() * 7) / 32768) + 1;
                OnMediaRecordChangeListener onMediaRecordChangeListener = mediaRecorderHelper.getOnMediaRecordChangeListener();
                if (onMediaRecordChangeListener != null) {
                    onMediaRecordChangeListener.onVoiceLevelChange(maxAmplitude);
                }
                long jCurrentTimeMillis = (MAX_RECORD_TIME - System.currentTimeMillis()) + mediaRecorderHelper.startTime;
                if (jCurrentTimeMillis < 10000) {
                    if (jCurrentTimeMillis < 0) {
                        mediaRecorderHelper.stopAndRelease(true);
                    }
                    OnMediaRecordChangeListener onMediaRecordChangeListener2 = mediaRecorderHelper.getOnMediaRecordChangeListener();
                    if (onMediaRecordChangeListener2 == null) {
                        return;
                    }
                    onMediaRecordChangeListener2.timeCountDown(jCurrentTimeMillis);
                }
            } catch (Exception e) {
                Log.e(i, e.getMessage(), e, new Object[0]);
            }
        }
    }

    public static /* synthetic */ void stopAndRelease$default(MediaRecorderHelper mediaRecorderHelper, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        mediaRecorderHelper.stopAndRelease(z);
    }

    public final void cancel() {
        stopAndRelease(false);
        b(this.currentFile);
    }

    @Nullable
    public final OnMediaRecordChangeListener getOnMediaRecordChangeListener() {
        return this.onMediaRecordChangeListener;
    }

    public final void setOnMediaRecordChangeListener(@Nullable OnMediaRecordChangeListener onMediaRecordChangeListener) {
        this.onMediaRecordChangeListener = onMediaRecordChangeListener;
    }

    public final void startRecord(@NotNull String filePath) {
        if (!AndroidPermissions.checkGranted(this.context, "android.permission.RECORD_AUDIO")) {
            OnMediaRecordChangeListener onMediaRecordChangeListener = this.onMediaRecordChangeListener;
            if (onMediaRecordChangeListener == null) {
                return;
            }
            onMediaRecordChangeListener.onNeedPermission();
            return;
        }
        if (NetworkUtil.isOffline(this.context)) {
            OnMediaRecordChangeListener onMediaRecordChangeListener2 = this.onMediaRecordChangeListener;
            if (onMediaRecordChangeListener2 == null) {
                return;
            }
            onMediaRecordChangeListener2.onNeedNetWork();
            return;
        }
        try {
            this.mMediaRecorder = new MediaRecorder();
            this.currentFile = new File(filePath);
            this.mMediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
            this.mMediaRecorder.setAudioSource(1);
            this.mMediaRecorder.setOutputFormat(2);
            this.mMediaRecorder.setAudioEncoder(3);
            this.mMediaRecorder.setAudioSamplingRate(44100);
            this.mMediaRecorder.prepare();
            this.mMediaRecorder.start();
            this.startTime = System.currentTimeMillis();
            c();
            this.isPrepare = true;
            OnMediaRecordChangeListener onMediaRecordChangeListener3 = this.onMediaRecordChangeListener;
            if (onMediaRecordChangeListener3 != null) {
                onMediaRecordChangeListener3.onMediaRecordStart();
            }
            d();
        } catch (Exception e) {
            Log.e(i, e.getMessage(), e, new Object[0]);
        }
    }

    public final void stopAndRelease(boolean save) {
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder == null) {
            return;
        }
        try {
            try {
                mediaRecorder.stop();
                mediaRecorder.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.mMediaRecorder = null;
            e(save);
        }
    }
}
