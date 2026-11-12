package d0;

import androidx.camera.core.impl.k0;
import b0.b0;
import b0.s0;
import cq0.g;
import f0.c;
import f0.d;
import f0.e;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ld0/a;", "", "<init>", "()V", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56987a = 0;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56988a;

        static {
            int[] iArr = new int[f0.b.values().length];
            try {
                iArr[f0.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f56988a = iArr;
        }
    }

    static {
        new C1222a(null);
        b0 b0Var = b0.f13855e;
        b0Var.getClass();
        new f0.a(b0Var);
        new c(60, 60);
        new e(e.b.PREVIEW);
        new d(1);
    }

    public a() {
        m.b(new g(this, 6));
    }

    /* JADX INFO: renamed from: a */
    public abstract f0.b getF67640c();

    public boolean b(k0 k0Var, s0 s0Var) {
        k0Var.getClass();
        return true;
    }

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Ld0/a$a;", "", "<init>", "()V", "Ld0/a;", "HDR_HLG10", "Ld0/a;", "FPS_60", "PREVIEW_STABILIZATION", "IMAGE_ULTRA_HDR", "", "FEATURE_TYPE_DYNAMIC_RANGE", "I", "FEATURE_TYPE_FPS_RANGE", "FEATURE_TYPE_VIDEO_STABILIZATION", "FEATURE_TYPE_IMAGE_FORMAT", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1222a {
        public /* synthetic */ C1222a(j jVar) {
            this();
        }

        private C1222a() {
        }
    }
}
