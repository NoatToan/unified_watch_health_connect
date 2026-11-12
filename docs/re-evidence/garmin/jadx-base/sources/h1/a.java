package h1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache<String, MediaCodecInfo> f80732a = new LruCache<>(10);

    private a() {
    }

    public static MediaCodecInfo a(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache<String, MediaCodecInfo> lruCache = f80732a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        try {
            if (mediaCodecInfo != null) {
                return mediaCodecInfo;
            }
            try {
                mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                    synchronized (lruCache) {
                        lruCache.put(str, codecInfo);
                    }
                    mediaCodecCreateEncoderByType.release();
                    return codecInfo;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException | IllegalArgumentException e4) {
                throw new InvalidConfigException(e4);
            }
        } catch (Throwable th4) {
            th = th4;
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType != null) {
            mediaCodecCreateEncoderByType.release();
        }
        throw th;
    }
}
