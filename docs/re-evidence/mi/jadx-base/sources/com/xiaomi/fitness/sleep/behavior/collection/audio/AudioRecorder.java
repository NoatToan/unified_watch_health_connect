package com.xiaomi.fitness.sleep.behavior.collection.audio;

import android.media.AudioRecord;
import android.media.MediaRecorder;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder;", "", "audioCollectionListener", "Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder$AudioCollectionListener;", "<init>", "(Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder$AudioCollectionListener;)V", "mAudioSource", "", "mAudioRecord", "Landroid/media/AudioRecord;", "value", "", "isRecording", "()Z", "mAudioCollectionListener", "startRecording", "", "init", "saveAudioData", "recordInterrupt", Constants.PARAM_STATUS_CODE, "stopRecording", "AudioCollectionListener", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioRecorder {
    private static final int AUDIO_INPUT_SOURCE_RECOGNITION = 6;
    private static final int BUFFER_SIZE = 32768;

    @NotNull
    private static final String TAG = "AudioRecorder";
    private volatile boolean isRecording;

    @Nullable
    private final AudioCollectionListener mAudioCollectionListener;

    @Nullable
    private volatile AudioRecord mAudioRecord;
    private int mAudioSource;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/audio/AudioRecorder$AudioCollectionListener;", "", "inPutAudioData", "", "cpSoundBuffer", "", "isEnd", "", "onAudioRecordStatusChanged", "recordStatus", "", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AudioCollectionListener {
        void inPutAudioData(@NotNull byte[] cpSoundBuffer, boolean isEnd);

        void onAudioRecordStatusChanged(int recordStatus);
    }

    public AudioRecorder(@NotNull AudioCollectionListener audioCollectionListener) {
        Intrinsics.checkNotNullParameter(audioCollectionListener, "audioCollectionListener");
        this.mAudioSource = 1;
        this.mAudioCollectionListener = audioCollectionListener;
    }

    private final void init() {
        int minBufferSize = AudioRecord.getMinBufferSize(16000, 1, 2);
        if (minBufferSize < 32768) {
            minBufferSize = 32768;
        }
        if (MediaRecorder.getAudioSourceMax() >= 6) {
            this.mAudioSource = 6;
        }
        if (this.mAudioRecord == null) {
            this.mAudioRecord = new AudioRecord(this.mAudioSource, 16000, 1, 2, minBufferSize * 2);
            LogExtKt.logi("init AudioRecord success");
        }
    }

    private final void recordInterrupt(int statusCode) {
        Logger.e(TAG, "record interrupt state: " + statusCode);
        AudioCollectionListener audioCollectionListener = this.mAudioCollectionListener;
        Intrinsics.checkNotNull(audioCollectionListener);
        audioCollectionListener.onAudioRecordStatusChanged(1);
        stopRecording();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[EDGE_INSN: B:15:0x0047->B:16:0x004b BREAK  A[LOOP:0: B:3:0x0005->B:23:0x0005]] */
    private final void saveAudioData() {
        byte[] bArr = new byte[32768];
        while (this.isRecording) {
            AudioRecord audioRecord = this.mAudioRecord;
            Intrinsics.checkNotNull(audioRecord);
            int i = audioRecord.read(bArr, 0, 32768);
            if (i <= 0) {
                if (i == 0) {
                    recordInterrupt(-2);
                    break;
                }
                AudioRecord audioRecord2 = this.mAudioRecord;
                Intrinsics.checkNotNull(audioRecord2);
                if (audioRecord2.getRecordingState() == 3) {
                    recordInterrupt(-3);
                    Logger.e(TAG, "read exception " + i);
                    break;
                }
                recordInterrupt(-2);
                break;
            }
            AudioCollectionListener audioCollectionListener = this.mAudioCollectionListener;
            if (audioCollectionListener != null) {
                audioCollectionListener.inPutAudioData(bArr, false);
            }
        }
        AudioCollectionListener audioCollectionListener2 = this.mAudioCollectionListener;
        if (audioCollectionListener2 != null) {
            audioCollectionListener2.inPutAudioData(bArr, true);
        }
    }

    /* JADX INFO: renamed from: isRecording, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    public final void startRecording() {
        if (this.isRecording) {
            return;
        }
        try {
            init();
            AudioRecord audioRecord = this.mAudioRecord;
            Intrinsics.checkNotNull(audioRecord);
            audioRecord.startRecording();
            this.isRecording = true;
            saveAudioData();
        } catch (Exception e) {
            Logger.e(TAG, "start record failed", e);
            recordInterrupt(-1);
        }
    }

    public final void stopRecording() {
        AudioRecord audioRecord;
        if (this.isRecording) {
            try {
                this.isRecording = false;
                AudioRecord audioRecord2 = this.mAudioRecord;
                if (audioRecord2 != null) {
                    audioRecord2.stop();
                }
                Logger.i(TAG, "mAudioRecord?.stop()");
                audioRecord = this.mAudioRecord;
                if (audioRecord != null) {
                    audioRecord.release();
                }
            } catch (Exception e) {
                Logger.e(TAG, "stop exception", e);
                audioRecord = this.mAudioRecord;
                if (audioRecord != null) {
                }
            } finally {
                AudioRecord audioRecord3 = this.mAudioRecord;
                if (audioRecord3 != null) {
                    audioRecord3.release();
                }
                Logger.i(TAG, "mAudioRecord?.release()");
                this.mAudioRecord = null;
                this.isRecording = false;
            }
        }
    }
}
