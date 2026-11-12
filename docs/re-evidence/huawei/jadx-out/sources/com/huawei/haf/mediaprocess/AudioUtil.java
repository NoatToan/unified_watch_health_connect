package com.huawei.haf.mediaprocess;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.OpusUtil;
import health.compact.a.LogUtil;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AudioUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Map<Integer, Integer> f5988c = new HashMap<Integer, Integer>() { // from class: com.huawei.haf.mediaprocess.AudioUtil.1
        {
            put(96000, 0);
            put(88200, 1);
            put(64000, 2);
            put(Integer.valueOf(OpusUtil.SAMPLE_RATE), 3);
            put(44100, 4);
            put(32000, 5);
            put(24000, 6);
            put(22050, 7);
            put(Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND), 8);
            put(12000, 9);
            put(11025, 10);
            put(8000, 11);
            put(7350, 12);
        }
    };

    private AudioUtil() {
    }

    public static long c(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, int i, VideoProgressListener videoProgressListener) {
        int iB = VideoUtil.b(mediaExtractor, true);
        mediaExtractor.selectTrack(iB);
        mediaExtractor.seekTo(0L, 2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        long j = 0;
        while (true) {
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleTime == -1) {
                break;
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(iB);
            long j2 = trackFormat.getLong("durationUs");
            if (videoProgressListener != null && j2 != 0) {
                videoProgressListener.onProgress(Math.min(1.0f, Math.max(0.0f, sampleTime / j2)));
            }
            bufferInfo.presentationTimeUs = sampleTime;
            bufferInfo.flags = mediaExtractor.getSampleFlags();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c(trackFormat));
            bufferInfo.size = mediaExtractor.readSampleData(byteBufferAllocateDirect, 0);
            if (bufferInfo.size < 0) {
                break;
            }
            LogUtil.b("AudioUtil", "writeAudioSampleData,time:", Float.valueOf(new BigDecimal(bufferInfo.presentationTimeUs).divide(new BigDecimal(1000), 2, 4).floatValue()));
            mediaMuxer.writeSampleData(i, byteBufferAllocateDirect, bufferInfo);
            long j3 = bufferInfo.presentationTimeUs;
            mediaExtractor.advance();
            j = j3;
        }
        return j;
    }

    public static int c(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("max-input-size")) {
            return mediaFormat.getInteger("max-input-size");
        }
        return 100000;
    }
}
