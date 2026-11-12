package com.xiaomi.fitness.watch.face.edit.video.videoprocess;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.watch.face.edit.video.videoprocess.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<String, int[]> f13369a = new HashMap();

    static {
        int i = Build.VERSION.SDK_INT;
        f13369a.put("video/avc", i >= 27 ? new int[]{65536, 1, 4, 2, 524288, 8, 16, 32, 64} : new int[]{1, 4, 2, 8, 16, 32, 64});
        f13369a.put("video/x-vnd.on2.vp8", new int[]{1});
        f13369a.put("video/hevc", i >= 29 ? new int[]{1, 2, 4096, 8192} : new int[]{1, 2, 4096});
        f13369a.put("video/x-vnd.on2.vp9", i >= 29 ? new int[]{1, 2, 4, 4096, 16384, 8, 8192, 32768} : new int[]{1, 2, 4, 4096, 8, 8192});
        if (i >= 29) {
            f13369a.put("video/av01", new int[]{1, 2, 4096, 8192});
        }
    }

    public static void b(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, boolean z) throws IllegalStateException {
        if (z) {
            surface = null;
        }
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z ? 1 : 0);
    }

    public static MediaCodec c(MediaFormat mediaFormat, Surface surface, boolean z, List<Callable<MediaCodec>> list) throws IllegalStateException, IOException {
        MediaCodec mediaCodecCall;
        Exception e;
        Iterator<Callable<MediaCodec>> it = list.iterator();
        MediaCodec mediaCodec = null;
        IOException iOException = null;
        while (it.hasNext()) {
            try {
                mediaCodecCall = it.next().call();
                if (mediaCodecCall != null) {
                    try {
                        b(mediaCodecCall, mediaFormat, surface, z);
                        mediaCodec = mediaCodecCall;
                        break;
                    } catch (Exception e2) {
                        e = e2;
                        if (mediaCodecCall != null) {
                            mediaCodecCall.release();
                            mediaCodecCall = null;
                        }
                        if (e instanceof IOException) {
                            iOException = (IOException) e;
                        }
                        mediaCodec = mediaCodecCall;
                    }
                } else {
                    continue;
                    mediaCodec = mediaCodecCall;
                }
            } catch (Exception e3) {
                mediaCodecCall = mediaCodec;
                e = e3;
            }
        }
        if (mediaCodec != null) {
            return mediaCodec;
        }
        if (iOException != null) {
            throw iOException;
        }
        throw new IllegalStateException();
    }

    public static List<Callable<MediaCodec>> d(boolean z, String str, MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        for (final MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() == z) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (mediaFormat == null || capabilitiesForType.isFormatSupported(mediaFormat))) {
                        arrayList.add(new Callable() { // from class: n34
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return a.h(mediaCodecInfo);
                            }
                        });
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0026  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031  */
    public static MediaCodec e(MediaFormat mediaFormat, Surface surface, boolean z, TrackTranscoderException.Error error, TrackTranscoderException.Error error2, TrackTranscoderException.Error error3) throws TrackTranscoderException {
        try {
            try {
                MediaCodec mediaCodecF = f(mediaFormat, surface, z);
                if (mediaCodecF != null) {
                    return mediaCodecF;
                }
                throw new IllegalStateException("Try fallbackToGetCodecByType");
            } catch (IOException | IllegalStateException unused) {
                MediaCodec mediaCodecG = g(mediaFormat, surface, z);
                if (mediaCodecG != null) {
                    return mediaCodecG;
                }
                throw new TrackTranscoderException(error, mediaFormat, null, null);
            }
        } catch (IOException | IllegalStateException e) {
            if (e instanceof IOException) {
                throw new TrackTranscoderException(error2, mediaFormat, null, null, e);
            }
            throw new TrackTranscoderException(error3, mediaFormat, null, null, e);
        }
        if (e instanceof IOException) {
            throw new TrackTranscoderException(error2, mediaFormat, null, null, e);
        }
        throw new TrackTranscoderException(error3, mediaFormat, null, null, e);
    }

    @RequiresApi(api = 21)
    public static MediaCodec f(MediaFormat mediaFormat, Surface surface, boolean z) throws IllegalStateException, IOException {
        List<Callable<MediaCodec>> listD = d(z, mediaFormat.getString("mime"), mediaFormat);
        if (listD.isEmpty()) {
            return null;
        }
        return c(mediaFormat, surface, z, listD);
    }

    public static MediaCodec g(MediaFormat mediaFormat, Surface surface, boolean z) throws IllegalStateException, IOException {
        List<Callable<MediaCodec>> listD = d(z, mediaFormat.getString("mime"), null);
        if (listD.isEmpty()) {
            return null;
        }
        return c(mediaFormat, surface, z, listD);
    }

    public static /* synthetic */ MediaCodec h(MediaCodecInfo mediaCodecInfo) throws Exception {
        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
    }
}
