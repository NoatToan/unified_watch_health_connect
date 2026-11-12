package com.huawei.haf.mediaprocess;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class VideoUtil {
    private VideoUtil() {
    }

    public static int b(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (TextUtils.isEmpty(string)) {
                return -5;
            }
            if ((z && string.startsWith("audio/")) || (!z && string.startsWith("video/"))) {
                return i;
            }
        }
        return -5;
    }

    public static Bitmap b(Uri uri) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(BaseApplication.b(), uri);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e) {
                    LogUtil.d("VideoUtil", "loadFirst release exception:", ExceptionUtils.c(e));
                }
            } catch (IllegalArgumentException e2) {
                LogUtil.d("VideoUtil", ExceptionUtils.c(e2));
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException e3) {
                    LogUtil.d("VideoUtil", "loadFirst release exception:", ExceptionUtils.c(e3));
                }
                frameAtTime = null;
            }
            if (frameAtTime != null) {
                LogUtil.b("VideoUtil", "loadFirst:", Integer.valueOf(frameAtTime.getHeight()));
            }
            return frameAtTime;
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException e4) {
                LogUtil.d("VideoUtil", "loadFirst release exception:", ExceptionUtils.c(e4));
            }
            throw th;
        }
    }
}
