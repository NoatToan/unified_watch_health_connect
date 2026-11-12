package i1;

import androidx.camera.core.impl.x2;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import g1.c0;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f86991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x2 f86992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraUseInconsistentTimebaseQuirk f86993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f86994d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x2 f86995e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86996a;

        static {
            int[] iArr = new int[x2.values().length];
            f86996a = iArr;
            try {
                iArr[x2.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86996a[x2.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(c0 c0Var, x2 x2Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f86991a = c0Var;
        this.f86992b = x2Var;
        this.f86993c = cameraUseInconsistentTimebaseQuirk;
    }
}
