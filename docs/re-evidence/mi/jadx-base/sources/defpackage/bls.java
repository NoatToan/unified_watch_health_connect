package defpackage;

import com.amap.api.col.p0003sl.n;
import com.amap.api.col.p0003sl.q;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes4.dex */
public final class bls {

    public static class a extends n {
        public static int h = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4351b;
        public int c;
        public int[] g = new int[1];
        public int d = 0;
        public int e = 16;
        public int f = 8;

        public a(int i, int i2, int i3) {
            this.f4350a = i;
            this.f4351b = i2;
            this.c = i3;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.g)) {
                return this.g[0];
            }
            return 0;
        }

        private EGLConfig c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.e && iA2 >= this.f) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.f4350a && iA4 == this.f4351b && iA5 == this.c && iA6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        public final c b(EGL10 egl10, EGLDisplay eGLDisplay) {
            c cVar = new c((byte) 0);
            int[] iArrD = d(true);
            cVar.f4352a = iArrD;
            egl10.eglChooseConfig(eGLDisplay, iArrD, null, 0, cVar.f4353b);
            if (cVar.f4353b[0] <= 0) {
                int[] iArrD2 = d(false);
                cVar.f4352a = iArrD2;
                egl10.eglChooseConfig(eGLDisplay, iArrD2, null, 0, cVar.f4353b);
                if (cVar.f4353b[0] <= 0) {
                    return null;
                }
            }
            return cVar;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.col.3sl.aa.e
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr;
            int[] iArr2;
            c cVarB = b(egl10, eGLDisplay);
            if (cVarB == null || (iArr = cVarB.f4352a) == null) {
                return null;
            }
            int[] iArr3 = cVarB.f4353b;
            int i = iArr3[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i];
            egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i, iArr3);
            EGLConfig eGLConfigC = c(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigC != null) {
                return eGLConfigC;
            }
            this.f4350a = 8;
            this.f4351b = 8;
            this.c = 8;
            c cVarB2 = b(egl10, eGLDisplay);
            if (cVarB2 == null || (iArr2 = cVarB2.f4352a) == null) {
                return eGLConfigC;
            }
            int[] iArr4 = cVarB2.f4353b;
            int i2 = iArr4[0];
            EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
            egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, i2, iArr4);
            return c(egl10, eGLDisplay, eGLConfigArr2);
        }

        public final int[] d(boolean z) {
            return new int[]{12324, this.f4350a, 12323, this.f4351b, 12322, this.c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, z ? 1 : 0, 12352, h, 12344};
        }
    }

    public static class b extends q {
        @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            try {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.col.3sl.aa.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public static void a(IGLSurfaceView iGLSurfaceView, int i, int i2, int i3) {
        iGLSurfaceView.setEGLContextFactory(new b());
        iGLSurfaceView.setEGLConfigChooser(new a(i, i2, i3));
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f4352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f4353b;

        public c() {
            this.f4352a = null;
            this.f4353b = new int[1];
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }
}
