package com.huawei.haf.mediaprocess;

import android.content.Context;
import android.media.MediaExtractor;
import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HealthVideoProcessor {
    public static final Integer d = 20;

    private HealthVideoProcessor() {
    }

    public static class Processor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f6000b;
        private boolean d = true;

        public Processor(Context context) {
            this.f6000b = context;
        }
    }

    public static class MediaSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f5998a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f5999c;
        private Uri d;

        public void c(MediaExtractor mediaExtractor) throws IOException {
            String str = this.f5998a;
            if (str != null) {
                mediaExtractor.setDataSource(str);
            } else {
                mediaExtractor.setDataSource(this.f5999c, this.d, (Map<String, String>) null);
            }
        }
    }
}
