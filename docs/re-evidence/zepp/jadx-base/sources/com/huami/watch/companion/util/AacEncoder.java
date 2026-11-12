package com.huami.watch.companion.util;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.watch.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public class AacEncoder {
    private static final String c = "AacEncoder";
    private MediaCodec a;
    private MediaCodec.BufferInfo b;

    private void a(byte[] bArr, int i) {
        bArr[0] = -1;
        bArr[1] = -7;
        bArr[2] = (byte) 96;
        bArr[3] = (byte) (64 + (i >> 11));
        bArr[4] = (byte) ((i & 2047) >> 3);
        bArr[5] = (byte) (((i & 7) << 5) + 31);
        bArr[6] = -4;
    }

    private void b(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        ByteBuffer[] inputBuffers = this.a.getInputBuffers();
        ByteBuffer[] outputBuffers = this.a.getOutputBuffers();
        this.b = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.a.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            byteBuffer.limit(bArr.length);
            this.a.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, 0L, 0);
        } else {
            Log.d(c, "Get input buffer fail by inputIndex:" + iDequeueInputBuffer, new Object[0]);
        }
        int iDequeueOutputBuffer = this.a.dequeueOutputBuffer(this.b, 0L);
        while (iDequeueOutputBuffer >= 0) {
            MediaCodec.BufferInfo bufferInfo = this.b;
            int i = bufferInfo.size;
            int i2 = i + 7;
            ByteBuffer byteBuffer2 = outputBuffers[iDequeueOutputBuffer];
            byteBuffer2.position(bufferInfo.offset);
            MediaCodec.BufferInfo bufferInfo2 = this.b;
            byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
            byte[] bArr2 = new byte[i2];
            a(bArr2, i2);
            byteBuffer2.get(bArr2, 7, i);
            byteBuffer2.position(this.b.offset);
            byteArrayOutputStream.write(bArr2);
            this.a.releaseOutputBuffer(iDequeueOutputBuffer, false);
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(this.b, 0L);
        }
    }

    private void c() throws IOException {
        this.a = MediaCodec.createEncoderByType(MimeTypes.AUDIO_AAC);
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(MimeTypes.AUDIO_AAC, 16000, 1);
        mediaFormatCreateAudioFormat.setInteger("bitrate", 64000);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("max-input-size", 10240000);
        this.b = new MediaCodec.BufferInfo();
        this.a.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
    }

    public byte[] encode(byte[] bArr) throws IOException {
        if (this.a == null) {
            c();
        }
        this.a.start();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[10240];
        while (true) {
            int i = byteArrayInputStream.read(bArr2);
            if (i <= 0) {
                byteArrayOutputStream.flush();
                this.a.stop();
                this.a.release();
                this.a = null;
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream2.write(bArr2, 0, i);
            b(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream);
            byteArrayOutputStream2.reset();
        }
    }
}
