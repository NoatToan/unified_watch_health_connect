package v;

import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import androidx.camera.core.impl.c3;

/* JADX INFO: loaded from: classes.dex */
public class i2 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173847a;

        static {
            int[] iArr = new int[c3.b.values().length];
            f173847a = iArr;
            try {
                iArr[c3.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f173847a[c3.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f173847a[c3.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f173847a[c3.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f173847a[c3.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private i2() {
    }

    public static int a(c3.b bVar, int i14) {
        int i15 = a.f173847a[bVar.ordinal()];
        if (i15 != 1) {
            return (i15 == 2 && x.c.f188202a.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1;
        }
        return i14 == 2 ? 5 : 1;
    }
}
