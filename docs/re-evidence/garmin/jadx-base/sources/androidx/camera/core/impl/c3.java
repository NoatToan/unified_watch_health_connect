package androidx.camera.core.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5519a = new a();

    public class a implements c3 {
        @Override // androidx.camera.core.impl.c3
        public final x0 a(b bVar, int i14) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        v.n0 a(Context context);
    }

    x0 a(b bVar, int i14);
}
