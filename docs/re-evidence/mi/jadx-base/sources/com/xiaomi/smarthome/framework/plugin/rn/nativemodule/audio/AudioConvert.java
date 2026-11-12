package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(16)
public class AudioConvert {
    private static final String TAG = "AudioConvert";
    private BufferedInputStream bis;
    private BufferedOutputStream bos;
    private ArrayList<byte[]> chunkPCMDataContainer;
    private boolean codeOver = false;
    private MediaCodec.BufferInfo decodeBufferInfo;
    private ByteBuffer[] decodeInputBuffers;
    private ByteBuffer[] decodeOutputBuffers;
    private long decodeSize;
    private String dstPath;
    private MediaCodec.BufferInfo encodeBufferInfo;
    private ByteBuffer[] encodeInputBuffers;
    private ByteBuffer[] encodeOutputBuffers;
    private String encodeType;
    private long fileTotalSize;
    private FileInputStream fis;
    private FileOutputStream fos;
    private MediaCodec mediaDecode;
    private MediaCodec mediaEncode;
    private MediaExtractor mediaExtractor;
    private OnCompleteListener onCompleteListener;
    private OnProgressListener onProgressListener;
    private String srcPath;

    public class DecodeRunnable implements Runnable {
        private DecodeRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!AudioConvert.this.codeOver) {
                AudioConvert.this.srcAudioFormatToPCM();
            }
        }
    }

    public class EncodeRunnable implements Runnable {
        private EncodeRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (true) {
                if (AudioConvert.this.codeOver && AudioConvert.this.chunkPCMDataContainer.isEmpty()) {
                    break;
                } else {
                    AudioConvert.this.dstAudioFormatFromPCM();
                }
            }
            if (AudioConvert.this.onCompleteListener != null) {
                AudioConvert.this.onCompleteListener.completed();
            }
            AudioConvert.this.showLog("size:" + AudioConvert.this.fileTotalSize + " decodeSize:" + AudioConvert.this.decodeSize + "time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    public interface OnCompleteListener {
        void completed();
    }

    public interface OnProgressListener {
        void progress();
    }

    private void addADTStoPacket(byte[] bArr, int i) {
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = (byte) 80;
        bArr[3] = (byte) (128 + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dstAudioFormatFromPCM() {
        byte[] pCMData;
        for (int i = 0; i < this.encodeInputBuffers.length - 1 && (pCMData = getPCMData()) != null; i++) {
            int iDequeueInputBuffer = this.mediaEncode.dequeueInputBuffer(-1L);
            ByteBuffer byteBuffer = this.encodeInputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.limit(pCMData.length);
            byteBuffer.put(pCMData);
            this.mediaEncode.queueInputBuffer(iDequeueInputBuffer, 0, pCMData.length, 0L, 0);
        }
        int iDequeueOutputBuffer = this.mediaEncode.dequeueOutputBuffer(this.encodeBufferInfo, 10000L);
        while (iDequeueOutputBuffer >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.encodeBufferInfo;
            int i2 = bufferInfo.size;
            int i3 = i2 + 7;
            ByteBuffer byteBuffer2 = this.encodeOutputBuffers[iDequeueOutputBuffer];
            byteBuffer2.position(bufferInfo.offset);
            byteBuffer2.limit(this.encodeBufferInfo.offset + i2);
            byte[] bArr = new byte[i3];
            addADTStoPacket(bArr, i3);
            byteBuffer2.get(bArr, 7, i2);
            byteBuffer2.position(this.encodeBufferInfo.offset);
            try {
                this.bos.write(bArr, 0, i3);
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.mediaEncode.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.mediaEncode.dequeueOutputBuffer(this.encodeBufferInfo, 10000L);
        }
    }

    private byte[] getPCMData() {
        synchronized (AudioConvert.class) {
            try {
                showLog("getPCM:" + this.chunkPCMDataContainer.size());
                if (this.chunkPCMDataContainer.isEmpty()) {
                    return null;
                }
                byte[] bArr = this.chunkPCMDataContainer.get(0);
                this.chunkPCMDataContainer.remove(bArr);
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initMPEGMediaEncode() {
    }

    private void initMediaDecode() {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.mediaExtractor = mediaExtractor;
            mediaExtractor.setDataSource(this.srcPath);
            for (int i = 0; i < this.mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = this.mediaExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string.startsWith("audio")) {
                    this.mediaExtractor.selectTrack(i);
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(string);
                    this.mediaDecode = mediaCodecCreateDecoderByType;
                    mediaCodecCreateDecoderByType.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        MediaCodec mediaCodec = this.mediaDecode;
        if (mediaCodec == null) {
            return;
        }
        mediaCodec.start();
        this.decodeInputBuffers = this.mediaDecode.getInputBuffers();
        this.decodeOutputBuffers = this.mediaDecode.getOutputBuffers();
        this.decodeBufferInfo = new MediaCodec.BufferInfo();
        showLog("buffers:" + this.decodeInputBuffers.length);
    }

    private void putPCMData(byte[] bArr) {
        synchronized (AudioConvert.class) {
            this.chunkPCMDataContainer.add(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showLog(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void srcAudioFormatToPCM() {
        for (int i = 0; i < this.decodeInputBuffers.length - 1; i++) {
            int iDequeueInputBuffer = this.mediaDecode.dequeueInputBuffer(-1L);
            if (iDequeueInputBuffer < 0) {
                this.codeOver = true;
                return;
            }
            ByteBuffer byteBuffer = this.decodeInputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            int sampleData = this.mediaExtractor.readSampleData(byteBuffer, 0);
            if (sampleData < 0) {
                this.codeOver = true;
            } else {
                this.mediaDecode.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, 0L, 0);
                this.mediaExtractor.advance();
                this.decodeSize += (long) sampleData;
            }
        }
        int iDequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(this.decodeBufferInfo, 10000L);
        while (iDequeueOutputBuffer >= 0) {
            ByteBuffer byteBuffer2 = this.decodeOutputBuffers[iDequeueOutputBuffer];
            byte[] bArr = new byte[this.decodeBufferInfo.size];
            byteBuffer2.get(bArr);
            byteBuffer2.clear();
            putPCMData(bArr);
            this.mediaDecode.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.mediaDecode.dequeueOutputBuffer(this.decodeBufferInfo, 10000L);
        }
    }

    public void prepare() {
        if (this.encodeType == null) {
            throw new IllegalArgumentException("encodeType can't be null");
        }
        if (this.srcPath == null) {
            throw new IllegalArgumentException("srcPath can't be null");
        }
        if (this.dstPath == null) {
            throw new IllegalArgumentException("dstPath can't be null");
        }
        try {
            this.fos = new FileOutputStream(new File(this.dstPath));
            this.bos = new BufferedOutputStream(this.fos, 204800);
            this.fileTotalSize = new File(this.srcPath).length();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.chunkPCMDataContainer = new ArrayList<>();
        initMediaDecode();
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(this.encodeType, 44100, 2);
            mediaFormatCreateAudioFormat.setInteger("bitrate", 96000);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", 102400);
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.encodeType);
            this.mediaEncode = mediaCodecCreateEncoderByType;
            mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        MediaCodec mediaCodec = this.mediaEncode;
        if (mediaCodec == null) {
            return;
        }
        this.encodeInputBuffers = mediaCodec.getInputBuffers();
        this.encodeOutputBuffers = this.mediaEncode.getOutputBuffers();
        this.encodeBufferInfo = new MediaCodec.BufferInfo();
        this.mediaEncode.start();
    }

    public void release() {
        try {
            try {
                BufferedOutputStream bufferedOutputStream = this.bos;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.flush();
                }
                BufferedOutputStream bufferedOutputStream2 = this.bos;
                if (bufferedOutputStream2 != null) {
                    try {
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        this.bos = null;
                    } catch (Throwable th) {
                        this.bos = null;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                BufferedOutputStream bufferedOutputStream3 = this.bos;
                if (bufferedOutputStream3 != null) {
                    try {
                        try {
                            bufferedOutputStream3.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } finally {
                        this.bos = null;
                    }
                }
                throw th2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            BufferedOutputStream bufferedOutputStream4 = this.bos;
            if (bufferedOutputStream4 != null) {
                try {
                    try {
                        bufferedOutputStream4.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                } catch (Throwable th3) {
                    this.bos = null;
                    throw th3;
                }
            }
        }
        try {
            try {
                FileOutputStream fileOutputStream = this.fos;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.fos = null;
            MediaCodec mediaCodec = this.mediaEncode;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mediaEncode.release();
                this.mediaEncode = null;
            }
            MediaCodec mediaCodec2 = this.mediaDecode;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
                this.mediaDecode.release();
                this.mediaDecode = null;
            }
            MediaExtractor mediaExtractor = this.mediaExtractor;
            if (mediaExtractor != null) {
                mediaExtractor.release();
                this.mediaExtractor = null;
            }
            if (this.onCompleteListener != null) {
                this.onCompleteListener = null;
            }
            if (this.onProgressListener != null) {
                this.onProgressListener = null;
            }
            showLog("release");
        } catch (Throwable th4) {
            this.fos = null;
            throw th4;
        }
    }

    public void setEncodeType(String str) {
        this.encodeType = str;
    }

    public void setIOPath(String str, String str2) {
        this.srcPath = str;
        this.dstPath = str2;
    }

    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }

    public void setOnProgressListener(OnProgressListener onProgressListener) {
        this.onProgressListener = onProgressListener;
    }

    public void startAsync() {
        showLog(StatConstants.PARAM_START);
        new Thread(new DecodeRunnable()).start();
        new Thread(new EncodeRunnable()).start();
    }
}
