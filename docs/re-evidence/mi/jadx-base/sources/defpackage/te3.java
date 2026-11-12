package defpackage;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.r;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class te3 implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hz6 f34617b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34618a;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f34618a = iArr;
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34618a[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34618a[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34618a[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public te3(Context context) {
        this.f34617b = hz6.b(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public Config a(UseCaseConfigFactory.CaptureType captureType, int i) {
        m mVarO = m.O();
        SessionConfig.b bVar = new SessionConfig.b();
        int[] iArr = a.f34618a;
        int i2 = iArr[captureType.ordinal()];
        if (i2 == 1) {
            bVar.s(i == 2 ? 5 : 1);
        } else if (i2 == 2 || i2 == 3) {
            bVar.s(1);
        } else if (i2 == 4) {
            bVar.s(3);
        }
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType == captureType2) {
            x7i.a(bVar);
        }
        mVarO.z(r.s, bVar.m());
        mVarO.z(r.u, se3.f33556a);
        e.a aVar = new e.a();
        int i3 = iArr[captureType.ordinal()];
        if (i3 == 1) {
            aVar.p(i != 2 ? 2 : 5);
        } else if (i3 == 2 || i3 == 3) {
            aVar.p(1);
        } else if (i3 == 4) {
            aVar.p(3);
        }
        mVarO.z(r.t, aVar.h());
        mVarO.z(r.v, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? g3d.c : wd3.f37864a);
        if (captureType == captureType2) {
            mVarO.z(k.q, this.f34617b.d());
        }
        mVarO.z(k.m, Integer.valueOf(this.f34617b.c().getRotation()));
        return n.M(mVarO);
    }
}
