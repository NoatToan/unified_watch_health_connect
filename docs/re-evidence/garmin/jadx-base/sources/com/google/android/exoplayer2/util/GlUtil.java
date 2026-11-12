package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import com.google.android.exoplayer2.v;
import com.google.android.gms.gcm.Task;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class GlUtil {
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    public static final int RECTANGLE_VERTICES_COUNT = 4;
    private static final String TAG = "GlUtil";
    public static boolean glAssertionsEnabled = false;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    public static final class Api17 {
        private Api17() {
        }

        public static EGLContext createEglContext(EGLDisplay eGLDisplay, int i14, int[] iArr) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i14, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                EGL14.eglTerminate(eGLDisplay);
                StringBuilder sb3 = new StringBuilder(103);
                sb3.append("eglCreateContext() failed to create a valid context. The device may not support EGL version ");
                sb3.append(i14);
                GlUtil.throwGlException(sb3.toString());
            }
            GlUtil.checkGlError();
            return eGLContextEglCreateContext;
        }

        public static EGLDisplay createEglDisplay() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.checkEglException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                GlUtil.throwGlException("Error in eglInitialize.");
            }
            GlUtil.checkGlError();
            return eGLDisplayEglGetDisplay;
        }

        public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int iEglGetError = EGL14.eglGetError();
            boolean z14 = iEglGetError == 12288;
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Error releasing context: ");
            sb3.append(iEglGetError);
            GlUtil.checkEglException(z14, sb3.toString());
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                int iEglGetError2 = EGL14.eglGetError();
                boolean z15 = iEglGetError2 == 12288;
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("Error destroying context: ");
                sb4.append(iEglGetError2);
                GlUtil.checkEglException(z15, sb4.toString());
            }
            EGL14.eglReleaseThread();
            int iEglGetError3 = EGL14.eglGetError();
            boolean z16 = iEglGetError3 == 12288;
            StringBuilder sb5 = new StringBuilder(35);
            sb5.append("Error releasing thread: ");
            sb5.append(iEglGetError3);
            GlUtil.checkEglException(z16, sb5.toString());
            EGL14.eglTerminate(eGLDisplay);
            int iEglGetError4 = EGL14.eglGetError();
            boolean z17 = iEglGetError4 == 12288;
            StringBuilder sb6 = new StringBuilder(38);
            sb6.append("Error terminating display: ");
            sb6.append(iEglGetError4);
            GlUtil.checkEglException(z17, sb6.toString());
        }

        public static void focusSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i14, int i15) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != 0) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i14, i15);
        }

        private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                GlUtil.throwGlException("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
            return EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        }
    }

    public static final class Attribute {
        private Buffer buffer;
        private final int index;
        private final int location;
        public final String name;
        private int size;

        private Attribute(String str, int i14, int i15) {
            this.name = str;
            this.index = i14;
            this.location = i15;
        }

        public static Attribute create(int i14, int i15) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i14, 35722, iArr, 0);
            int i16 = iArr[0];
            byte[] bArr = new byte[i16];
            GLES20.glGetActiveAttrib(i14, i15, i16, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.strlen(bArr));
            return new Attribute(str, i15, GlUtil.getAttributeLocation(i14, str));
        }

        public void bind() {
            Buffer buffer = (Buffer) Assertions.checkNotNull(this.buffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.index);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] fArr, int i14) {
            this.buffer = GlUtil.createBuffer(fArr);
            this.size = i14;
        }
    }

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public static final class Uniform {
        private final int location;
        public final String name;
        private int texId;
        private final int type;
        private int unit;
        private final float[] value = new float[16];

        private Uniform(String str, int i14, int i15) {
            this.name = str;
            this.location = i14;
            this.type = i15;
        }

        public static Uniform create(int i14, int i15) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i16 = iArr[0];
            byte[] bArr = new byte[i16];
            GLES20.glGetActiveUniform(i14, i15, i16, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.strlen(bArr));
            return new Uniform(str, GlUtil.getUniformLocation(i14, str), iArr2[0]);
        }

        public void bind() {
            int i14 = this.type;
            if (i14 == 5126) {
                GLES20.glUniform1fv(this.location, 1, this.value, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i14 == 35675) {
                GLES20.glUniformMatrix3fv(this.location, 1, false, this.value, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i14 == 35676) {
                GLES20.glUniformMatrix4fv(this.location, 1, false, this.value, 0);
                GlUtil.checkGlError();
                return;
            }
            if (this.texId == 0) {
                h.z("No call to setSamplerTexId() before bind.");
                return;
            }
            GLES20.glActiveTexture(this.unit + 33984);
            int i15 = this.type;
            if (i15 == 36198 || i15 == GlUtil.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT) {
                GLES20.glBindTexture(36197, this.texId);
            } else {
                if (i15 != 35678) {
                    h.z(v.b(36, i15, "Unexpected uniform type: "));
                    return;
                }
                GLES20.glBindTexture(3553, this.texId);
            }
            GLES20.glUniform1i(this.location, this.unit);
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GlUtil.checkGlError();
        }

        public void setFloat(float f14) {
            this.value[0] = f14;
        }

        public void setFloats(float[] fArr) {
            System.arraycopy(fArr, 0, this.value, 0, fArr.length);
        }

        public void setSamplerTexId(int i14, int i15) {
            this.texId = i14;
            this.unit = i15;
        }
    }

    private GlUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void addShader(int i14, int i15, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i15);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            throwGlException(v.c(v.a(v.a(10, strGlGetShaderInfoLog), str), strGlGetShaderInfoLog, ", source: ", str));
        }
        GLES20.glAttachShader(i14, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(boolean z14, String str) {
        if (z14) {
            return;
        }
        throwGlException(str);
    }

    public static void checkGlError() {
        int i14 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e(TAG, strValueOf.length() != 0 ? "glError: ".concat(strValueOf) : new String("glError: "));
            i14 = iGlGetError;
        }
        if (i14 != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i14));
            throwGlException(strValueOf2.length() != 0 ? "glError: ".concat(strValueOf2) : new String("glError: "));
        }
    }

    public static FloatBuffer createBuffer(int i14) {
        return ByteBuffer.allocateDirect(i14 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) {
        return Api17.createEglContext(eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static EGLContext createEglContextEs3Rgba1010102(EGLDisplay eGLDisplay) {
        return Api17.createEglContext(eGLDisplay, 3, EGL_CONFIG_ATTRIBUTES_RGBA_1010102);
    }

    public static EGLDisplay createEglDisplay() {
        return Api17.createEglDisplay();
    }

    public static int createExternalTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError();
        return iArr[0];
    }

    public static void deleteTexture(int i14) {
        GLES20.glDeleteTextures(1, new int[]{i14}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        Api17.destroyEglContext(eGLDisplay, eGLContext);
    }

    public static void focusSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i14, int i15) {
        Api17.focusSurface(eGLDisplay, eGLContext, eGLSurface, i14, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i14, String str) {
        return GLES20.glGetAttribLocation(i14, str);
    }

    public static EGLSurface getEglSurface(EGLDisplay eGLDisplay, Object obj) {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static EGLSurface getEglSurfaceBt2020Pq(EGLDisplay eGLDisplay, Object obj) {
        return Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_1010102, EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ);
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i14, String str) {
        return GLES20.glGetUniformLocation(i14, str);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i14 = Util.SDK_INT;
        if (i14 < 24) {
            return false;
        }
        if (i14 >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i14 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static String loadAsset(Context context, String str) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return Util.fromUtf8Bytes(Util.toByteArray(inputStreamOpen));
        } finally {
            Util.closeQuietly(inputStreamOpen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int strlen(byte[] bArr) {
        for (int i14 = 0; i14 < bArr.length; i14++) {
            if (bArr[i14] == 0) {
                return i14;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwGlException(String str) {
        Log.e(TAG, str);
        if (glAssertionsEnabled) {
            throw new GlException(str);
        }
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static final class Program {
        private final Map<String, Attribute> attributeByName;
        private final Attribute[] attributes;
        private final int programId;
        private final Map<String, Uniform> uniformByName;
        private final Uniform[] uniforms;

        public Program(String str, String str2) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            this.programId = iGlCreateProgram;
            GlUtil.checkGlError();
            GlUtil.addShader(iGlCreateProgram, 35633, str);
            GlUtil.addShader(iGlCreateProgram, 35632, str2);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = {0};
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GlUtil.throwGlException(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
            }
            GLES20.glUseProgram(iGlCreateProgram);
            this.attributeByName = new HashMap();
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
            this.attributes = new Attribute[iArr2[0]];
            for (int i14 = 0; i14 < iArr2[0]; i14++) {
                Attribute attributeCreate = Attribute.create(this.programId, i14);
                this.attributes[i14] = attributeCreate;
                this.attributeByName.put(attributeCreate.name, attributeCreate);
            }
            this.uniformByName = new HashMap();
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
            this.uniforms = new Uniform[iArr3[0]];
            for (int i15 = 0; i15 < iArr3[0]; i15++) {
                Uniform uniformCreate = Uniform.create(this.programId, i15);
                this.uniforms[i15] = uniformCreate;
                this.uniformByName.put(uniformCreate.name, uniformCreate);
            }
            GlUtil.checkGlError();
        }

        private int getAttributeLocation(String str) {
            return GlUtil.getAttributeLocation(this.programId, str);
        }

        public void bindAttributesAndUniforms() {
            for (Attribute attribute : this.attributes) {
                attribute.bind();
            }
            for (Uniform uniform : this.uniforms) {
                uniform.bind();
            }
        }

        public void delete() {
            GLES20.glDeleteProgram(this.programId);
            GlUtil.checkGlError();
        }

        public int getAttributeArrayLocationAndEnable(String str) {
            int attributeLocation = getAttributeLocation(str);
            GLES20.glEnableVertexAttribArray(attributeLocation);
            GlUtil.checkGlError();
            return attributeLocation;
        }

        public int getUniformLocation(String str) {
            return GlUtil.getUniformLocation(this.programId, str);
        }

        public void setBufferAttribute(String str, float[] fArr, int i14) {
            ((Attribute) Assertions.checkNotNull(this.attributeByName.get(str))).setBuffer(fArr, i14);
        }

        public void setFloatUniform(String str, float f14) {
            ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setFloat(f14);
        }

        public void setFloatsUniform(String str, float[] fArr) {
            ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setFloats(fArr);
        }

        public void setSamplerTexIdUniform(String str, int i14, int i15) {
            ((Uniform) Assertions.checkNotNull(this.uniformByName.get(str))).setSamplerTexId(i14, i15);
        }

        public void use() {
            GLES20.glUseProgram(this.programId);
            GlUtil.checkGlError();
        }

        public Program(Context context, String str, String str2) {
            this(GlUtil.loadAsset(context, str), GlUtil.loadAsset(context, str2));
        }
    }
}
