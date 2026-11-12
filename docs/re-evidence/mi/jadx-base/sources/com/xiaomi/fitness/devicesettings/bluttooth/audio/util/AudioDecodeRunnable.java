package com.xiaomi.fitness.devicesettings.bluttooth.audio.util;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u0000 )2\u00020\u0001:\u0001)B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\u001bH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/AudioDecodeRunnable;", "Ljava/lang/Runnable;", "handler", "Landroid/os/Handler;", "extractor", "Landroid/media/MediaExtractor;", "audioTrack", "", "mListener", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/IConvertAACResult;", "<init>", "(Landroid/os/Handler;Landroid/media/MediaExtractor;ILcom/xiaomi/fitness/devicesettings/bluttooth/audio/util/IConvertAACResult;)V", "POST_BYTE_SIZE_LIMIT", "getPOST_BYTE_SIZE_LIMIT", "()I", "setPOST_BYTE_SIZE_LIMIT", "(I)V", "mediaCodec", "Landroid/media/MediaCodec;", "inputBuffers", "", "Ljava/nio/ByteBuffer;", "[Ljava/nio/ByteBuffer;", "outputBuffers", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "presentationTimeUs", "", "outputStream", "Ljava/io/ByteArrayOutputStream;", "createEncoder", "", "run", "offerEncoder", "", "input", "addADTStoPacket", "packet", "packetLen", "computePresentationTime", "frameIndex", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioDecodeRunnable implements Runnable {

    @NotNull
    private static final String TAG = "AudioDecodeRunnable";
    public static final int TIMEOUT = 5000;
    private int POST_BYTE_SIZE_LIMIT;
    private final int audioTrack;

    @Nullable
    private MediaCodec.BufferInfo bufferInfo;

    @NotNull
    private final MediaExtractor extractor;

    @Nullable
    private final Handler handler;

    @Nullable
    private ByteBuffer[] inputBuffers;

    @Nullable
    private final IConvertAACResult mListener;

    @Nullable
    private MediaCodec mediaCodec;

    @Nullable
    private ByteBuffer[] outputBuffers;

    @NotNull
    private ByteArrayOutputStream outputStream;
    private long presentationTimeUs;

    public AudioDecodeRunnable(@Nullable Handler handler, @NotNull MediaExtractor extractor, int i, @Nullable IConvertAACResult iConvertAACResult) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        this.handler = handler;
        this.extractor = extractor;
        this.audioTrack = i;
        this.mListener = iConvertAACResult;
        this.POST_BYTE_SIZE_LIMIT = 65536;
        this.outputStream = new ByteArrayOutputStream();
    }

    private final void addADTStoPacket(byte[] packet, int packetLen) {
        packet[0] = -1;
        packet[1] = -7;
        packet[2] = (byte) 96;
        packet[3] = (byte) (64 + (packetLen >> 11));
        packet[4] = (byte) ((packetLen & 2047) >> 3);
        packet[5] = (byte) (((packetLen & 7) << 5) + 31);
        packet[6] = -4;
    }

    private final long computePresentationTime(long frameIndex) {
        return ((frameIndex * ((long) 90000)) * ((long) 1024)) / ((long) 44100);
    }

    private final void createEncoder() {
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE, 16000, 1);
            Intrinsics.checkNotNullExpressionValue(mediaFormatCreateAudioFormat, "createAudioFormat(...)");
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("bitrate", 16384);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", 2097152);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE);
            this.mediaCodec = mediaCodecCreateEncoderByType;
            Intrinsics.checkNotNull(mediaCodecCreateEncoderByType);
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            MediaCodec mediaCodec = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec);
            mediaCodec.start();
            MediaCodec mediaCodec2 = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec2);
            this.inputBuffers = mediaCodec2.getInputBuffers();
            MediaCodec mediaCodec3 = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec3);
            this.outputBuffers = mediaCodec3.getOutputBuffers();
            this.bufferInfo = new MediaCodec.BufferInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final int getPOST_BYTE_SIZE_LIMIT() {
        return this.POST_BYTE_SIZE_LIMIT;
    }

    @NotNull
    public final byte[] offerEncoder(@NotNull byte[] input) throws Exception {
        Intrinsics.checkNotNullParameter(input, "input");
        MediaCodec mediaCodec = this.mediaCodec;
        Intrinsics.checkNotNull(mediaCodec);
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer[] byteBufferArr = this.inputBuffers;
            Intrinsics.checkNotNull(byteBufferArr);
            ByteBuffer byteBuffer = byteBufferArr[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.limit(input.length);
            byteBuffer.put(input);
            computePresentationTime(this.presentationTimeUs);
            MediaCodec mediaCodec2 = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec2);
            mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, input.length, 0L, 0);
            this.presentationTimeUs++;
        }
        MediaCodec mediaCodec3 = this.mediaCodec;
        Intrinsics.checkNotNull(mediaCodec3);
        MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
        Intrinsics.checkNotNull(bufferInfo);
        int iDequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 10000L);
        while (iDequeueOutputBuffer >= 0) {
            MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
            Intrinsics.checkNotNull(bufferInfo2);
            int i = bufferInfo2.size;
            int i2 = i + 7;
            ByteBuffer[] byteBufferArr2 = this.outputBuffers;
            Intrinsics.checkNotNull(byteBufferArr2);
            ByteBuffer byteBuffer2 = byteBufferArr2[iDequeueOutputBuffer];
            MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
            Intrinsics.checkNotNull(bufferInfo3);
            byteBuffer2.position(bufferInfo3.offset);
            MediaCodec.BufferInfo bufferInfo4 = this.bufferInfo;
            Intrinsics.checkNotNull(bufferInfo4);
            byteBuffer2.limit(bufferInfo4.offset + i);
            byte[] bArr = new byte[i2];
            addADTStoPacket(bArr, i2);
            byteBuffer2.get(bArr, 7, i);
            MediaCodec.BufferInfo bufferInfo5 = this.bufferInfo;
            Intrinsics.checkNotNull(bufferInfo5);
            byteBuffer2.position(bufferInfo5.offset);
            this.outputStream.write(bArr, 0, i2);
            this.outputStream.flush();
            MediaCodec mediaCodec4 = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec4);
            mediaCodec4.releaseOutputBuffer(iDequeueOutputBuffer, false);
            MediaCodec mediaCodec5 = this.mediaCodec;
            Intrinsics.checkNotNull(mediaCodec5);
            MediaCodec.BufferInfo bufferInfo6 = this.bufferInfo;
            Intrinsics.checkNotNull(bufferInfo6);
            iDequeueOutputBuffer = mediaCodec5.dequeueOutputBuffer(bufferInfo6, 10000L);
        }
        byte[] byteArray = this.outputStream.toByteArray();
        this.outputStream.flush();
        this.outputStream.reset();
        Intrinsics.checkNotNull(byteArray);
        return byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    @Override // java.lang.Runnable
    public void run() {
        MediaCodec.BufferInfo bufferInfo;
        int i;
        MediaCodec.BufferInfo bufferInfo2;
        try {
            MediaFormat trackFormat = this.extractor.getTrackFormat(this.audioTrack);
            Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "ogg";
            }
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
            Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType, "createDecoderByType(...)");
            int i2 = 0;
            mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodecCreateDecoderByType.start();
            MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
            byte[] bArr = new byte[0];
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            byte[] bArr2 = bArr;
            boolean z = false;
            while (!z) {
                long j2 = j;
                int i3 = i2;
                while (i3 < 3) {
                    try {
                        int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(5000L);
                        if (iDequeueInputBuffer >= 0) {
                            ByteBuffer inputBuffer = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
                            if (inputBuffer == null) {
                                bufferInfo2 = bufferInfo3;
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            int sampleData = this.extractor.readSampleData(inputBuffer, i2);
                            if (sampleData < 0) {
                                try {
                                    mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                                    break;
                                } catch (Exception e) {
                                    e = e;
                                    i = i2;
                                    bufferInfo = bufferInfo3;
                                }
                            } else {
                                i3++;
                                long j3 = j2 + ((long) sampleData);
                                try {
                                    bufferInfo2 = bufferInfo3;
                                    try {
                                        Logger.d(TAG, Thread.currentThread().getName() + "往解码器写入数据,sampleSize:" + sampleData + ",already totalSize:" + j3 + ",duration:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                                        j2 = j3;
                                        try {
                                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.extractor.getSampleTime(), 0);
                                            this.extractor.advance();
                                            bufferInfo3 = bufferInfo2;
                                            i2 = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        j2 = j3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    j2 = j3;
                                    bufferInfo2 = bufferInfo3;
                                }
                            }
                            e = e2;
                            bufferInfo = bufferInfo2;
                            i = 0;
                            e.printStackTrace();
                            bufferInfo3 = bufferInfo;
                            i2 = i;
                            j = j2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                }
                MediaCodec.BufferInfo bufferInfo4 = bufferInfo3;
                byte[] bArr3 = bArr2;
                boolean z2 = false;
                while (!z2) {
                    bufferInfo = bufferInfo4;
                    try {
                        int iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 5000L);
                        if (iDequeueOutputBuffer == -1) {
                            z2 = true;
                        } else if (iDequeueOutputBuffer == -2) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(mediaCodecCreateDecoderByType.getOutputFormat(), "getOutputFormat(...)");
                            } catch (Exception e6) {
                                e = e6;
                                bArr2 = bArr3;
                            }
                        } else if (iDequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                            int i4 = bufferInfo.size;
                            byte[] bArr4 = new byte[i4];
                            if (outputBuffer == null) {
                                i = 0;
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            outputBuffer.get(bArr4);
                            outputBuffer.clear();
                            int length = bArr3.length + i4;
                            byte[] bArr5 = new byte[length];
                            int i5 = 0;
                            try {
                                System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
                                System.arraycopy(bArr4, 0, bArr5, bArr3.length, i4);
                                try {
                                    if (length > this.POST_BYTE_SIZE_LIMIT) {
                                        try {
                                            if (this.handler != null) {
                                                Message messageObtain = Message.obtain();
                                                messageObtain.what = 2;
                                                messageObtain.obj = bArr5;
                                                this.handler.sendMessage(messageObtain);
                                                Logger.d(TAG, "handler send message 2 bytes size = " + length);
                                                bArr3 = new byte[0];
                                            } else {
                                                bArr3 = bArr5;
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            bArr2 = bArr5;
                                        }
                                    } else {
                                        bArr3 = bArr5;
                                    }
                                    i5 = 0;
                                    mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    if ((bufferInfo.flags & 4) == 0) {
                                        continue;
                                    } else {
                                        if (this.handler != null) {
                                            if (bArr3.length != 0) {
                                                Message messageObtain2 = Message.obtain();
                                                messageObtain2.what = 2;
                                                messageObtain2.obj = bArr3;
                                                this.handler.sendMessage(messageObtain2);
                                                i = 0;
                                                try {
                                                    bArr3 = new byte[0];
                                                } catch (Exception e8) {
                                                    e = e8;
                                                }
                                            }
                                            Message messageObtain3 = Message.obtain();
                                            messageObtain3.what = 1;
                                            this.handler.sendMessage(messageObtain3);
                                        }
                                        Logger.d(TAG, "编码结束，MediaCodec解码器状态释放");
                                        this.extractor.release();
                                        mediaCodecCreateDecoderByType.stop();
                                        mediaCodecCreateDecoderByType.release();
                                        z2 = true;
                                        z = true;
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    i = 0;
                                    bArr2 = bArr5;
                                }
                            } catch (Exception e10) {
                                e = e10;
                                i = i5;
                                bArr2 = bArr3;
                            }
                            e = e8;
                            bArr2 = bArr3;
                            e.printStackTrace();
                            bufferInfo3 = bufferInfo;
                            i2 = i;
                            j = j2;
                        }
                        bufferInfo4 = bufferInfo;
                    } catch (Exception e11) {
                        e = e11;
                        i = 0;
                    }
                }
                bArr2 = bArr3;
                j = j2;
                bufferInfo3 = bufferInfo4;
                i2 = 0;
            }
            IConvertAACResult iConvertAACResult = this.mListener;
            if (iConvertAACResult != null) {
                iConvertAACResult.codecIsOver();
            }
        } catch (IOException e12) {
            e12.printStackTrace();
            Logger.d(TAG, "解码失败，error:" + e12.getMessage());
            IConvertAACResult iConvertAACResult2 = this.mListener;
            if (iConvertAACResult2 != null) {
                iConvertAACResult2.codecFail(ErrorType.ERROR_DECODE);
            }
        } catch (IllegalStateException e13) {
            e13.printStackTrace();
            Logger.d(TAG, Thread.currentThread().getName() + "解码失败，解码其状态异常");
            IConvertAACResult iConvertAACResult3 = this.mListener;
            Intrinsics.checkNotNull(iConvertAACResult3);
            iConvertAACResult3.codecFail(ErrorType.ERROR_WRONG_CODEC_STATE);
            if (this.handler != null) {
                Message messageObtain4 = Message.obtain();
                messageObtain4.what = 1;
                this.handler.sendMessage(messageObtain4);
                Logger.d(TAG, "handler send message 0");
            }
        }
    }

    public final void setPOST_BYTE_SIZE_LIMIT(int i) {
        this.POST_BYTE_SIZE_LIMIT = i;
    }
}
