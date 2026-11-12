package e0;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import androidx.camera.core.impl.c3;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import b0.i1;
import b0.l0;
import b0.w0;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Le0/d;", "", "Ljava/lang/Class;", "surfaceClass", "", "defaultImageFormat", "<init>", "(Ljava/lang/String;ILjava/lang/Class;I)V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum d {
    PREVIEW(SurfaceHolder.class, 34),
    IMAGE_CAPTURE(null, 256),
    VIDEO_CAPTURE(MediaCodec.class, 34),
    STREAM_SHARING(SurfaceTexture.class, 34),
    UNDEFINED(null, 34);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f61822b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f61829a;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61832a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.IMAGE_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.VIDEO_CAPTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.STREAM_SHARING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f61832a = iArr;
        }
    }

    d(Class cls, int i14) {
        this.f61829a = cls;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i14 = b.f61832a[ordinal()];
        if (i14 == 1) {
            return "Preview";
        }
        if (i14 == 2) {
            return "ImageCapture";
        }
        if (i14 == 3) {
            return "VideoCapture";
        }
        if (i14 == 4) {
            return "StreamSharing";
        }
        if (i14 == 5) {
            return "Undefined";
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le0/d$a;", "", "<init>", "()V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: e0.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1310a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f61830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f61831b;

            static {
                int[] iArr = new int[c3.b.values().length];
                try {
                    iArr[c3.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c3.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c3.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c3.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f61830a = iArr;
                int[] iArr2 = new int[f0.b.values().length];
                try {
                    iArr2[f0.b.DYNAMIC_RANGE.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[f0.b.FPS_RANGE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[f0.b.VIDEO_STABILIZATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[f0.b.IMAGE_FORMAT.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f61831b = iArr2;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(i1 i1Var) {
            i1Var.getClass();
            if (i1Var instanceof w0) {
                return d.PREVIEW;
            }
            if (i1Var instanceof l0) {
                return d.IMAGE_CAPTURE;
            }
            if (CameraUseCaseAdapter.A(i1Var)) {
                return d.VIDEO_CAPTURE;
            }
            return i1Var instanceof v0.d ? d.STREAM_SHARING : d.UNDEFINED;
        }

        private a() {
        }
    }
}
