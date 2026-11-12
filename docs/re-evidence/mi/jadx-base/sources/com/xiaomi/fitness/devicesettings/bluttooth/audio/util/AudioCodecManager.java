package com.xiaomi.fitness.devicesettings.bluttooth.audio.util;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/AudioCodecManager;", "", "<init>", "()V", "TAG", "", "startTime", "", "startEncodeTime", "convert", "", "inputPath", "outputPath", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/IConvertAACResult;", "addADTStoPacket", "packet", "", "packetLen", "", "EncodeThread", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioCodecManager {

    @NotNull
    public static final AudioCodecManager INSTANCE = new AudioCodecManager();

    @NotNull
    private static final String TAG = "AudioCodecManger";
    private static long startEncodeTime;
    private static long startTime;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/AudioCodecManager$EncodeThread;", "Ljava/lang/Thread;", "outputPath", "", "extractor", "Landroid/media/MediaExtractor;", "extractorIndex", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/IConvertAACResult;", "<init>", "(Ljava/lang/String;Landroid/media/MediaExtractor;ILcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/IConvertAACResult;)V", "value", "Landroid/os/Handler;", "handler", "getHandler", "()Landroid/os/Handler;", "run", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EncodeThread extends Thread {

        @NotNull
        private final MediaExtractor extractor;
        private final int extractorIndex;

        @Nullable
        private Handler handler;

        @Nullable
        private final IConvertAACResult listener;

        @Nullable
        private final String outputPath;

        public EncodeThread(@Nullable String str, @NotNull MediaExtractor extractor, int i, @Nullable IConvertAACResult iConvertAACResult) {
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            this.outputPath = str;
            this.extractor = extractor;
            this.extractorIndex = i;
            this.listener = iConvertAACResult;
        }

        @Nullable
        public final Handler getHandler() {
            return this.handler;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            try {
                MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE, 44100, 1);
                Intrinsics.checkNotNullExpressionValue(mediaFormatCreateAudioFormat, "createAudioFormat(...)");
                mediaFormatCreateAudioFormat.setInteger("bitrate", 16384);
                mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
                mediaFormatCreateAudioFormat.setInteger("max-input-size", EventRecurrence.TH);
                final MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE);
                Intrinsics.checkNotNullExpressionValue(mediaCodecCreateEncoderByType, "createEncoderByType(...)");
                mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                mediaCodecCreateEncoderByType.start();
                final ByteBuffer[] outputBuffers = mediaCodecCreateEncoderByType.getOutputBuffers();
                Intrinsics.checkNotNullExpressionValue(outputBuffers, "getOutputBuffers(...)");
                final MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.outputPath)), EventRecurrence.TH);
                Looper.prepare();
                Logger.d(AudioCodecManager.TAG, "init handler");
                final Looper looperMyLooper = Looper.myLooper();
                Intrinsics.checkNotNull(looperMyLooper);
                this.handler = new Handler(looperMyLooper) { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.util.AudioCodecManager$EncodeThread$run$1
                    @Override // android.os.Handler
                    public void handleMessage(Message msg) {
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        Logger.d("AudioCodecManger", "编码HandlerMessage code = " + msg.what);
                        int i = msg.what;
                        if (i == 1) {
                            mediaCodecCreateEncoderByType.stop();
                            mediaCodecCreateEncoderByType.release();
                            Logger.d("AudioCodecManger", "handler finish音频编码完成,转码开始时间：" + AudioCodecManager.startTime + "，总用时：" + (System.currentTimeMillis() - AudioCodecManager.startTime));
                            Logger.d("AudioCodecManger", "handler finish音频编码完成,编码开始时间：" + AudioCodecManager.startEncodeTime + ",编码用时用时：" + (System.currentTimeMillis() - AudioCodecManager.startEncodeTime));
                            IConvertAACResult iConvertAACResult = this.listener;
                            if (iConvertAACResult != null) {
                                iConvertAACResult.codecIsOver();
                            }
                            getLooper().quit();
                            return;
                        }
                        if (i != 2) {
                            return;
                        }
                        Object obj = msg.obj;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                        byte[] bArr = (byte[]) obj;
                        Logger.d("AudioCodecManger", "handler obj bytes size = " + bArr.length);
                        if (AudioCodecManager.startEncodeTime == 0) {
                            AudioCodecManager.startEncodeTime = System.currentTimeMillis();
                            Logger.i("AudioCodecManger", "编码开始时间 = " + AudioCodecManager.startEncodeTime);
                        }
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                        Logger.d("AudioCodecManger", "读取文件并写入编码器" + bArrCopyOf.length + ",传入的bytes 长度=" + bArr.length);
                        int iDequeueInputBuffer = mediaCodecCreateEncoderByType.dequeueInputBuffer(0L);
                        StringBuilder sb = new StringBuilder();
                        sb.append("dequeueInputBuffer inputIndex = ");
                        sb.append(iDequeueInputBuffer);
                        Logger.d("AudioCodecManger", sb.toString());
                        if (iDequeueInputBuffer >= 0) {
                            ByteBuffer inputBuffer = mediaCodecCreateEncoderByType.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            inputBuffer.clear();
                            inputBuffer.limit(bArrCopyOf.length);
                            inputBuffer.put(bArrCopyOf);
                            mediaCodecCreateEncoderByType.queueInputBuffer(iDequeueInputBuffer, 0, bArrCopyOf.length, 0L, 0);
                        }
                        int iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
                        while (iDequeueOutputBuffer >= 0) {
                            MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                            int i2 = bufferInfo2.size;
                            int i3 = i2 + 7;
                            ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                            byteBuffer.position(bufferInfo2.offset);
                            byteBuffer.limit(bufferInfo.offset + i2);
                            byte[] bArr2 = new byte[i3];
                            AudioCodecManager.INSTANCE.addADTStoPacket(bArr2, i3);
                            byteBuffer.get(bArr2, 7, i2);
                            byteBuffer.position(bufferInfo.offset);
                            Logger.d("AudioCodecManger", "编码成功并写入文件" + i3);
                            try {
                                bufferedOutputStream.write(bArr2, 0, i3);
                                bufferedOutputStream.flush();
                            } catch (IOException e) {
                                Logger.d("AudioCodecManger", "编码异常 error:" + e.getMessage());
                                IConvertAACResult iConvertAACResult2 = this.listener;
                                if (iConvertAACResult2 != null) {
                                    iConvertAACResult2.codecFail(ErrorType.ERROR_ENCODE);
                                }
                            }
                            mediaCodecCreateEncoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            iDequeueOutputBuffer = mediaCodecCreateEncoderByType.dequeueOutputBuffer(bufferInfo, 10000L);
                        }
                    }
                };
                new Thread(new AudioDecodeRunnable(this.handler, this.extractor, this.extractorIndex, new IConvertAACResult() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.util.AudioCodecManager$EncodeThread$run$2
                    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.util.IConvertAACResult
                    public void codecFail(ErrorType errorType) {
                        Intrinsics.checkNotNullParameter(errorType, "errorType");
                        Logger.d("AudioCodecManger", "音频解码失败");
                    }

                    @Override // com.xiaomi.fitness.devicesettings.bluttooth.audio.util.IConvertAACResult
                    public void codecIsOver() {
                        Logger.d("AudioCodecManger", "音频解码完成,解码开始时间：" + AudioCodecManager.startTime + ",解码用时：" + (System.currentTimeMillis() - AudioCodecManager.startTime));
                    }
                })).start();
                Looper.loop();
            } catch (Exception e) {
                Logger.d(AudioCodecManager.TAG, "编码参数配置异常 error:" + e.getMessage());
                IConvertAACResult iConvertAACResult = this.listener;
                if (iConvertAACResult != null) {
                    iConvertAACResult.codecFail(ErrorType.ERROR_ENCODE_PARAMS);
                }
            }
        }
    }

    private AudioCodecManager() {
    }

    public final void addADTStoPacket(@NotNull byte[] packet, int packetLen) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        packet[0] = -1;
        packet[1] = -7;
        packet[2] = (byte) 76;
        packet[3] = (byte) (64 + (packetLen >> 11));
        packet[4] = (byte) ((packetLen & 2047) >> 3);
        packet[5] = (byte) (((packetLen & 7) << 5) + 31);
        packet[6] = -4;
    }

    public final void convert(@Nullable String inputPath, @Nullable String outputPath, @Nullable IConvertAACResult listener) {
        startTime = System.currentTimeMillis();
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            Intrinsics.checkNotNull(inputPath);
            mediaExtractor.setDataSource(inputPath);
            int trackCount = mediaExtractor.getTrackCount();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = -1;
                    break;
                }
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                String string = trackFormat.getString("mime");
                if (string == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (StringsKt__StringsJVMKt.startsWith$default(string, "audio/", false, 2, null)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                mediaExtractor.selectTrack(i);
                new EncodeThread(outputPath, mediaExtractor, i, listener).start();
            } else if (listener != null) {
                listener.codecFail(ErrorType.ERROR_WITHOUT_TRACK);
            }
        } catch (IOException unused) {
            if (listener != null) {
                listener.codecFail(ErrorType.ERROR_FILE_SOURCE);
            }
        }
    }
}
