package com.amap.api.mapcore.util;

import android.graphics.Color;
import android.opengl.GLES20;
import android.util.Log;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.autonavi.base.amap.mapcore.AMapNativeRenderer;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes2.dex */
public final class dz {
    private static float[] a = new float[1024];

    public static class a extends dx {
        private static int g = 4;
        private int[] h = new int[1];
        public int a = 5;
        public int b = 6;
        public int c = 5;
        public int d = 0;
        public int e = 16;
        public int f = 8;

        private int[] a(boolean z) {
            return new int[]{12324, this.a, 12323, this.b, 12322, this.c, 12321, this.d, 12325, this.e, 12326, this.f, 12338, z ? 1 : 0, 12352, g, 12344};
        }

        @Override // com.amap.api.mapcore.util.dx, android.opengl.GLSurfaceView.EGLConfigChooser, com.amap.api.mapcore.util.m.e
        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr;
            int[] iArr2;
            c cVarA = a(egl10, eGLDisplay);
            if (cVarA == null || (iArr = cVarA.a) == null) {
                return null;
            }
            int[] iArr3 = cVarA.b;
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr3[0]];
            egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, iArr3[0], iArr3);
            EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
            if (eGLConfigA != null) {
                return eGLConfigA;
            }
            this.a = 8;
            this.b = 8;
            this.c = 8;
            c cVarA2 = a(egl10, eGLDisplay);
            if (cVarA2 == null || (iArr2 = cVarA2.a) == null) {
                return eGLConfigA;
            }
            int[] iArr4 = cVarA2.b;
            EGLConfig[] eGLConfigArr2 = new EGLConfig[iArr4[0]];
            egl10.eglChooseConfig(eGLDisplay, iArr2, eGLConfigArr2, iArr4[0], iArr4);
            return a(egl10, eGLDisplay, eGLConfigArr2);
        }

        private c a(EGL10 egl10, EGLDisplay eGLDisplay) {
            c cVar = new c((byte) 0);
            int[] iArrA = a(true);
            cVar.a = iArrA;
            egl10.eglChooseConfig(eGLDisplay, iArrA, null, 0, cVar.b);
            if (cVar.b[0] <= 0) {
                int[] iArrA2 = a(false);
                cVar.a = iArrA2;
                egl10.eglChooseConfig(eGLDisplay, iArrA2, null, 0, cVar.b);
                if (cVar.b[0] <= 0) {
                    return null;
                }
            }
            return cVar;
        }

        private EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int iA = a(egl10, eGLDisplay, eGLConfig, 12325);
                int iA2 = a(egl10, eGLDisplay, eGLConfig, 12326);
                if (iA >= this.e && iA2 >= this.f) {
                    int iA3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                    int iA4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                    int iA5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                    int iA6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                    if (iA3 == this.a && iA4 == this.b && iA5 == this.c && iA6 == this.d) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.h)) {
                return this.h[0];
            }
            return 0;
        }
    }

    public static class b extends dy {
        @Override // com.amap.api.mapcore.util.dy, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.mapcore.util.m.f
        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            try {
                return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        @Override // com.amap.api.mapcore.util.dy, android.opengl.GLSurfaceView.EGLContextFactory, com.amap.api.mapcore.util.m.f
        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("amap", str + ": glError " + iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }

    public static class c {
        public int[] a;
        public int[] b;

        private c() {
            this.a = null;
            this.b = new int[1];
        }

        public /* synthetic */ c(byte b) {
            this();
        }
    }

    public static void a(df.e eVar, int i, int i2, FloatBuffer floatBuffer, float f, FloatBuffer floatBuffer2, int i3, int i4, float[] fArr, int i5, float f2, float f3, int i6, int i7, boolean z, boolean z2) {
        a(eVar, 4, i, floatBuffer2, 1.0f, i4, fArr);
        if (z2) {
            a(eVar, i2, floatBuffer, f, i3, fArr, i5, f2, f3, i6, i7, z);
        }
    }

    public static void a(df.e eVar, int i, int i2, FloatBuffer floatBuffer, float f, int i3, float[] fArr, float f2, int i4, float f3, boolean z, boolean z2) {
        a(eVar, 6, i, floatBuffer, 1.0f, i3, fArr);
        if (z2) {
            a(eVar, i2, floatBuffer, f, i3, fArr, f2, i4, f3, z);
        }
    }

    public static void a(df.e eVar, int i, FloatBuffer floatBuffer, float f, int i2, float[] fArr, float f2, int i3, float f3, boolean z) {
        if (z && i3 != -1) {
            a(i, floatBuffer, f * f2, i2, fArr, i3, f3);
        } else {
            a(eVar, i, floatBuffer, f, i2, fArr);
        }
    }

    public static void a(df.e eVar, int i, FloatBuffer floatBuffer, float f, int i2, float[] fArr, int i3, float f2, float f3, int i4, int i5, boolean z) {
        if (z && i3 != -1) {
            float f4 = f3 * f;
            try {
                float fAlpha = Color.alpha(i) / 255.0f;
                float fRed = Color.red(i) / 255.0f;
                float fGreen = Color.green(i) / 255.0f;
                float fBlue = Color.blue(i) / 255.0f;
                if (i2 < 3) {
                    return;
                }
                int i6 = i2 * 3;
                if (floatBuffer != null && floatBuffer.limit() >= i6) {
                    float[] fArr2 = a;
                    if (fArr2 == null || fArr2.length < i6) {
                        a = new float[i6];
                    }
                    floatBuffer.get(a, 0, i6);
                    AMapNativeRenderer.nativeDrawLineByTextureID(a, i6, f4, i3, f2, fRed, fGreen, fBlue, fAlpha, 0.0f, false, true, false, fArr, i4, i5, true);
                    return;
                }
                return;
            } catch (Throwable unused) {
            }
        }
        a(eVar, 2, i, floatBuffer, f, i2, fArr);
    }

    private static void a(int i, FloatBuffer floatBuffer, float f, int i2, float[] fArr, int i3, float f2) {
        try {
            float fAlpha = Color.alpha(i) / 255.0f;
            float fRed = Color.red(i) / 255.0f;
            float fGreen = Color.green(i) / 255.0f;
            float fBlue = Color.blue(i) / 255.0f;
            if (i2 < 3) {
                return;
            }
            int i4 = (i2 - 1) * 3;
            if (floatBuffer != null && floatBuffer.limit() >= i4 + 3) {
                float[] fArr2 = a;
                if (fArr2 == null || fArr2.length < i4) {
                    a = new float[i4];
                }
                for (int i5 = 0; i5 < i4; i5++) {
                    a[i5] = floatBuffer.get(i5 + 3);
                }
                AMapNativeRenderer.nativeDrawLineByTextureID(a, i4, f, i3, f2, fRed, fGreen, fBlue, fAlpha, 0.0f, true, true, false, fArr, 3, 0, true);
            }
        } catch (Throwable th) {
            hn.c(th, "GlesUtility", "drawCircleLine");
        }
    }

    private static void a(df.e eVar, int i, FloatBuffer floatBuffer, float f, int i2, float[] fArr) {
        a(eVar, 2, i, floatBuffer, f, 1, i2 - 1, fArr);
    }

    private static void a(df.e eVar, int i, int i2, FloatBuffer floatBuffer, float f, int i3, float[] fArr) {
        a(eVar, i, i2, floatBuffer, f, 0, i3, fArr);
    }

    public static void a(IGLSurfaceView iGLSurfaceView) {
        iGLSurfaceView.setEGLContextFactory(new b());
        iGLSurfaceView.setEGLConfigChooser(new a());
    }

    private static void a(df.e eVar, int i, int i2, FloatBuffer floatBuffer, float f, int i3, int i4, float[] fArr) {
        if (f == 0.0f || eVar == null) {
            return;
        }
        GLES20.glUseProgram(eVar.d);
        GLES20.glEnable(3042);
        GLES20.glDisable(2929);
        GLES20.glBlendFunc(770, 771);
        float[] fArr2 = {Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, Color.alpha(i2) / 255.0f};
        GLES20.glLineWidth(f);
        GLES20.glEnableVertexAttribArray(eVar.b);
        GLES20.glVertexAttribPointer(eVar.b, 3, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glUniform4fv(eVar.c, 1, fArr2, 0);
        GLES20.glUniformMatrix4fv(eVar.a, 1, false, fArr, 0);
        GLES20.glDrawArrays(i, i3, i4);
        GLES20.glDisableVertexAttribArray(eVar.b);
        GLES20.glDisable(3042);
        GLES20.glUseProgram(0);
    }
}
