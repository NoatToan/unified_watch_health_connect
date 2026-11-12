package com.nanchen.screenrecordhelper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.hardware.display.VirtualDisplay;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.miui.tsmclient.util.Constants;
import com.nanchen.screenrecordhelper.ScreenRecordHelper;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.r72;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002?@B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020'H\u0007J\b\u0010)\u001a\u00020'H\u0007J\u001e\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020'J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u0007H\u0002J\b\u00103\u001a\u00020'H\u0002J&\u00104\u001a\u00020'2\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002062\n\b\u0002\u00108\u001a\u0004\u0018\u000109J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u001dH\u0002J\b\u0010<\u001a\u00020\u001fH\u0002J\u0006\u0010=\u001a\u00020'J \u0010>\u001a\u00020'2\u0006\u00107\u001a\u0002062\u0006\u00105\u001a\u0002062\u0006\u00108\u001a\u000209H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006A"}, d2 = {"Lcom/nanchen/screenrecordhelper/ScreenRecordHelper;", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/nanchen/screenrecordhelper/ScreenRecordHelper$OnVideoRecordListener;", "savePath", "", "saveName", "<init>", "(Landroid/app/Activity;Lcom/nanchen/screenrecordhelper/ScreenRecordHelper$OnVideoRecordListener;Ljava/lang/String;Ljava/lang/String;)V", "mediaProjectionManager", "Landroid/media/projection/MediaProjectionManager;", "getMediaProjectionManager", "()Landroid/media/projection/MediaProjectionManager;", "mediaProjectionManager$delegate", "Lkotlin/Lazy;", "mediaRecorder", "Landroid/media/MediaRecorder;", "mediaProjection", "Landroid/media/projection/MediaProjection;", "virtualDisplay", "Landroid/hardware/display/VirtualDisplay;", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics$delegate", "saveFile", "Ljava/io/File;", "isRecording", "", "()Z", "setRecording", "(Z)V", "recordAudio", "getRecordAudio", "setRecordAudio", "startRecord", "", "resume", "pause", "onActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "resultCode", "data", "Landroid/content/Intent;", "cancelRecord", "showToast", "resId", BroadcastsKt.SILENT_PUSHING_STOP, "stopRecord", "videoDuration", "", "audioDuration", "afdd", "Landroid/content/res/AssetFileDescriptor;", "refreshVideo", "newFile", "initRecorder", "clearAll", "syntheticAudio", "Companion", "OnVideoRecordListener", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenRecordHelper {
    private static final int REQUEST_CODE = 1024;

    @NotNull
    private static final String TAG = "ScreenRecordHelper";
    private static final int VIDEO_FRAME_RATE = 30;

    @NotNull
    private Activity activity;

    /* JADX INFO: renamed from: displayMetrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayMetrics;
    private boolean isRecording;

    @Nullable
    private final OnVideoRecordListener listener;

    @Nullable
    private MediaProjection mediaProjection;

    /* JADX INFO: renamed from: mediaProjectionManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaProjectionManager;

    @Nullable
    private MediaRecorder mediaRecorder;
    private boolean recordAudio;

    @Nullable
    private File saveFile;

    @NotNull
    private final String saveName;

    @NotNull
    private String savePath;

    @Nullable
    private VirtualDisplay virtualDisplay;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/nanchen/screenrecordhelper/ScreenRecordHelper$OnVideoRecordListener;", "", "onBeforeRecord", "", "onStartRecord", "onCancelRecord", "onEndRecord", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnVideoRecordListener {
        void onBeforeRecord();

        void onCancelRecord();

        void onEndRecord();

        void onStartRecord();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScreenRecordHelper(@NotNull Activity activity, @Nullable OnVideoRecordListener onVideoRecordListener) {
        this(activity, onVideoRecordListener, null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayMetrics displayMetrics_delegate$lambda$1() {
        return new DisplayMetrics();
    }

    private final DisplayMetrics getDisplayMetrics() {
        return (DisplayMetrics) this.displayMetrics.getValue();
    }

    private final MediaProjectionManager getMediaProjectionManager() {
        return (MediaProjectionManager) this.mediaProjectionManager.getValue();
    }

    private final boolean initRecorder() {
        File file = new File(this.savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(this.savePath, this.saveName + ".tmp");
        this.saveFile = file2;
        if (file2.exists()) {
            file2.delete();
        }
        this.mediaRecorder = new MediaRecorder();
        int iMin = Math.min(getDisplayMetrics().widthPixels, Constants.FHD_WIDTH);
        int iMin2 = Math.min(getDisplayMetrics().heightPixels, 1920);
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder == null) {
            return true;
        }
        if (this.recordAudio) {
            mediaRecorder.setAudioSource(1);
        }
        mediaRecorder.setVideoSource(2);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setVideoEncoder(2);
        if (this.recordAudio) {
            mediaRecorder.setAudioEncoder(1);
        }
        File file3 = this.saveFile;
        Intrinsics.checkNotNull(file3);
        mediaRecorder.setOutputFile(file3.getAbsolutePath());
        mediaRecorder.setVideoSize(iMin, iMin2);
        mediaRecorder.setVideoEncodingBitRate(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
        mediaRecorder.setVideoFrameRate(30);
        try {
            mediaRecorder.prepare();
            MediaProjection mediaProjection = this.mediaProjection;
            this.virtualDisplay = mediaProjection != null ? mediaProjection.createVirtualDisplay("MainScreen", iMin, iMin2, getDisplayMetrics().densityDpi, 16, mediaRecorder.getSurface(), new VirtualDisplay.Callback() { // from class: com.nanchen.screenrecordhelper.ScreenRecordHelper$initRecorder$2$1
                @Override // android.hardware.display.VirtualDisplay.Callback
                public void onStopped() {
                    super.onStopped();
                }
            }, null) : null;
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("IllegalStateException preparing MediaRecorder: ");
            sb.append(message);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaProjectionManager mediaProjectionManager_delegate$lambda$0(ScreenRecordHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.activity.getSystemService("media_projection");
        if (systemService instanceof MediaProjectionManager) {
            return (MediaProjectionManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onActivityResult$lambda$3(ScreenRecordHelper this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.initRecorder()) {
            this$0.showToast("phone_not_support_screen_record");
            return;
        }
        this$0.isRecording = true;
        MediaRecorder mediaRecorder = this$0.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.start();
        }
        OnVideoRecordListener onVideoRecordListener = this$0.listener;
        if (onVideoRecordListener != null) {
            onVideoRecordListener.onStartRecord();
        }
    }

    private final void refreshVideo(File newFile) {
        long length = newFile.length();
        StringBuilder sb = new StringBuilder();
        sb.append("screen record end,file length:");
        sb.append(length);
        sb.append(".");
        if (newFile.length() <= 5000) {
            newFile.delete();
            showToast("phone_not_support_screen_record");
        } else {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(newFile));
            this.activity.sendBroadcast(intent);
            showToast("save_to_album_success");
        }
    }

    private final void showToast(String resId) {
        Toast.makeText(this.activity.getApplicationContext(), resId, 0).show();
    }

    private final void stop() {
        OnVideoRecordListener onVideoRecordListener;
        if (this.isRecording) {
            this.isRecording = false;
            try {
                try {
                    MediaRecorder mediaRecorder = this.mediaRecorder;
                    if (mediaRecorder != null) {
                        mediaRecorder.setOnErrorListener(null);
                        mediaRecorder.setOnInfoListener(null);
                        mediaRecorder.setPreviewDisplay(null);
                        mediaRecorder.stop();
                    }
                    MediaRecorder mediaRecorder2 = this.mediaRecorder;
                    if (mediaRecorder2 != null) {
                        mediaRecorder2.reset();
                    }
                    VirtualDisplay virtualDisplay = this.virtualDisplay;
                    if (virtualDisplay != null) {
                        virtualDisplay.release();
                    }
                    MediaProjection mediaProjection = this.mediaProjection;
                    if (mediaProjection != null) {
                        mediaProjection.stop();
                    }
                    onVideoRecordListener = this.listener;
                    if (onVideoRecordListener == null) {
                        return;
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append("stopRecorder() error！");
                    sb.append(message);
                    MediaRecorder mediaRecorder3 = this.mediaRecorder;
                    if (mediaRecorder3 != null) {
                        mediaRecorder3.reset();
                    }
                    VirtualDisplay virtualDisplay2 = this.virtualDisplay;
                    if (virtualDisplay2 != null) {
                        virtualDisplay2.release();
                    }
                    MediaProjection mediaProjection2 = this.mediaProjection;
                    if (mediaProjection2 != null) {
                        mediaProjection2.stop();
                    }
                    onVideoRecordListener = this.listener;
                    if (onVideoRecordListener == null) {
                        return;
                    }
                }
                onVideoRecordListener.onEndRecord();
            } catch (Throwable th) {
                MediaRecorder mediaRecorder4 = this.mediaRecorder;
                if (mediaRecorder4 != null) {
                    mediaRecorder4.reset();
                }
                VirtualDisplay virtualDisplay3 = this.virtualDisplay;
                if (virtualDisplay3 != null) {
                    virtualDisplay3.release();
                }
                MediaProjection mediaProjection3 = this.mediaProjection;
                if (mediaProjection3 != null) {
                    mediaProjection3.stop();
                }
                OnVideoRecordListener onVideoRecordListener2 = this.listener;
                if (onVideoRecordListener2 != null) {
                    onVideoRecordListener2.onEndRecord();
                }
                throw th;
            }
        }
    }

    public static /* synthetic */ void stopRecord$default(ScreenRecordHelper screenRecordHelper, long j, long j2, AssetFileDescriptor assetFileDescriptor, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            assetFileDescriptor = null;
        }
        screenRecordHelper.stopRecord(j, j2, assetFileDescriptor);
    }

    @SuppressLint({"WrongConstant"})
    private final void syntheticAudio(long audioDuration, long videoDuration, AssetFileDescriptor afdd) throws IOException {
        Handler handler;
        Runnable runnable;
        final File file = new File(this.savePath, this.saveName + ".mp4");
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                file.createNewFile();
                MediaExtractor mediaExtractor = new MediaExtractor();
                File file2 = this.saveFile;
                Intrinsics.checkNotNull(file2);
                mediaExtractor.setDataSource(file2.getAbsolutePath());
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                mediaExtractor2.setDataSource(afdd.getFileDescriptor(), afdd.getStartOffset(), (afdd.getLength() * videoDuration) / audioDuration);
                MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), 0);
                mediaExtractor.selectTrack(0);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(0);
                Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                int iAddTrack = mediaMuxer.addTrack(trackFormat);
                mediaExtractor2.selectTrack(0);
                MediaFormat trackFormat2 = mediaExtractor2.getTrackFormat(0);
                Intrinsics.checkNotNullExpressionValue(trackFormat2, "getTrackFormat(...)");
                int iAddTrack2 = mediaMuxer.addTrack(trackFormat2);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024000);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1024000);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                int i = iAddTrack;
                mediaExtractor.seekTo(0L, 2);
                mediaExtractor2.seekTo(0L, 2);
                mediaMuxer.start();
                int integer = 1000000 / (trackFormat.containsKey("frame-rate") ? trackFormat.getInteger("frame-rate") : 31);
                boolean z = false;
                while (!z) {
                    bufferInfo.offset = 100;
                    int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 100);
                    bufferInfo.size = sampleData;
                    if (sampleData < 0) {
                        bufferInfo.size = 0;
                        z = true;
                    } else {
                        bufferInfo.presentationTimeUs += (long) integer;
                        bufferInfo.flags = mediaExtractor.getSampleFlags();
                        int i2 = i;
                        mediaMuxer.writeSampleData(i2, byteBufferAllocate, bufferInfo);
                        mediaExtractor.advance();
                        i = i2;
                    }
                }
                boolean z2 = false;
                while (!z2) {
                    bufferInfo2.offset = 100;
                    int sampleData2 = mediaExtractor2.readSampleData(byteBufferAllocate2, 100);
                    bufferInfo2.size = sampleData2;
                    if (sampleData2 < 0) {
                        bufferInfo2.size = 0;
                        z2 = true;
                    } else {
                        bufferInfo2.presentationTimeUs = mediaExtractor2.getSampleTime();
                        bufferInfo2.flags = mediaExtractor2.getSampleFlags();
                        mediaMuxer.writeSampleData(iAddTrack2, byteBufferAllocate2, bufferInfo2);
                        mediaExtractor2.advance();
                    }
                }
                mediaMuxer.stop();
                mediaMuxer.release();
                mediaExtractor.release();
                mediaExtractor2.release();
                File file3 = this.saveFile;
                if (file3 != null) {
                    file3.delete();
                }
                afdd.close();
                handler = new Handler();
                runnable = new Runnable() { // from class: sgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenRecordHelper.syntheticAudio$lambda$8(this.f33618a, file);
                    }
                };
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Mixer Error:");
                sb.append(message);
                File file4 = this.saveFile;
                if (file4 != null) {
                    file4.renameTo(file);
                }
                afdd.close();
                handler = new Handler();
                runnable = new Runnable() { // from class: sgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenRecordHelper.syntheticAudio$lambda$8(this.f33618a, file);
                    }
                };
            }
            handler.post(runnable);
        } catch (Throwable th) {
            afdd.close();
            new Handler().post(new Runnable() { // from class: sgl
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenRecordHelper.syntheticAudio$lambda$8(this.f33618a, file);
                }
            });
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syntheticAudio$lambda$8(ScreenRecordHelper this$0, File newFile) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newFile, "$newFile");
        this$0.refreshVideo(newFile);
        this$0.saveFile = null;
    }

    public final void cancelRecord() throws IOException {
        stopRecord$default(this, 0L, 0L, null, 7, null);
        File file = this.saveFile;
        if (file != null) {
            file.delete();
        }
        this.saveFile = null;
        OnVideoRecordListener onVideoRecordListener = this.listener;
        if (onVideoRecordListener != null) {
            onVideoRecordListener.onCancelRecord();
        }
    }

    public final void clearAll() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        this.mediaRecorder = null;
        VirtualDisplay virtualDisplay = this.virtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.virtualDisplay = null;
        MediaProjection mediaProjection = this.mediaProjection;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        this.mediaProjection = null;
    }

    public final boolean getRecordAudio() {
        return this.recordAudio;
    }

    /* JADX INFO: renamed from: isRecording, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    public final void onActivityResult(int requestCode, int resultCode, @NotNull Intent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 1024) {
            if (resultCode != -1) {
                showToast("phone_not_support_screen_record");
                return;
            }
            MediaProjectionManager mediaProjectionManager = getMediaProjectionManager();
            Intrinsics.checkNotNull(mediaProjectionManager);
            this.mediaProjection = mediaProjectionManager.getMediaProjection(resultCode, data);
            new Handler().postDelayed(new Runnable() { // from class: rgl
                @Override // java.lang.Runnable
                public final void run() {
                    ScreenRecordHelper.onActivityResult$lambda$3(this.f32525a);
                }
            }, 150L);
        }
    }

    @RequiresApi(24)
    public final void pause() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.pause();
        }
    }

    @RequiresApi(24)
    public final void resume() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.resume();
        }
    }

    public final void setRecordAudio(boolean z) {
        this.recordAudio = z;
    }

    public final void setRecording(boolean z) {
        this.isRecording = z;
    }

    public final void startRecord() {
        if (getMediaProjectionManager() == null) {
            showToast("phone_not_support_screen_record");
            return;
        }
        MediaProjectionManager mediaProjectionManager = getMediaProjectionManager();
        if (mediaProjectionManager != null) {
            OnVideoRecordListener onVideoRecordListener = this.listener;
            if (onVideoRecordListener != null) {
                onVideoRecordListener.onBeforeRecord();
            }
            Intent intentCreateScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
            Intrinsics.checkNotNullExpressionValue(intentCreateScreenCaptureIntent, "createScreenCaptureIntent(...)");
            if (this.activity.getPackageManager().resolveActivity(intentCreateScreenCaptureIntent, 65536) != null) {
                this.activity.startActivityForResult(intentCreateScreenCaptureIntent, 1024);
            } else {
                showToast("phone_not_support_screen_record");
            }
        }
    }

    public final void stopRecord(long videoDuration, long audioDuration, @Nullable AssetFileDescriptor afdd) throws IOException {
        stop();
        if (audioDuration != 0 && afdd != null) {
            syntheticAudio(videoDuration, audioDuration, afdd);
            return;
        }
        if (this.saveFile != null) {
            File file = new File(this.savePath, this.saveName + ".mp4");
            File file2 = this.saveFile;
            Intrinsics.checkNotNull(file2);
            file2.renameTo(file);
            refreshVideo(file);
        }
        this.saveFile = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScreenRecordHelper(@NotNull Activity activity, @Nullable OnVideoRecordListener onVideoRecordListener, @NotNull String savePath) {
        this(activity, onVideoRecordListener, savePath, null, 8, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
    }

    @JvmOverloads
    public ScreenRecordHelper(@NotNull Activity activity, @Nullable OnVideoRecordListener onVideoRecordListener, @NotNull String savePath, @NotNull String saveName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(savePath, "savePath");
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        this.activity = activity;
        this.listener = onVideoRecordListener;
        this.savePath = savePath;
        this.saveName = saveName;
        this.mediaProjectionManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tgl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScreenRecordHelper.mediaProjectionManager_delegate$lambda$0(this.f34678a);
            }
        });
        this.displayMetrics = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ugl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ScreenRecordHelper.displayMetrics_delegate$lambda$1();
            }
        });
        this.activity.getWindowManager().getDefaultDisplay().getMetrics(getDisplayMetrics());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ScreenRecordHelper(Activity activity, OnVideoRecordListener onVideoRecordListener, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 4) != 0 ? r72.q() : str;
        if ((i & 8) != 0) {
            str2 = "nanchen_" + System.currentTimeMillis();
        }
        this(activity, onVideoRecordListener, str, str2);
    }
}
