package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class GlUtil {
    private static final String a = "GlUtil";
    private static final String b = "EGL_EXT_protected_content";
    private static final String c = "EGL_KHR_surfaceless_context";

    public static final class Attribute {
        private final int a;
        private final int b;

        @Nullable
        private Buffer c;
        private int d;
        public final String name;

        public Attribute(int program, int index) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(program, 35722, iArr, 0);
            byte[] bArr = new byte[iArr[0]];
            int[] iArr2 = new int[1];
            int i = iArr[0];
            GLES20.glGetActiveAttrib(program, index, i, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.c(bArr));
            this.name = str;
            this.b = GLES20.glGetAttribLocation(program, str);
            this.a = index;
        }

        public void bind() {
            Buffer buffer = (Buffer) Assertions.checkNotNull(this.c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.b, this.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.a);
            GlUtil.checkGlError();
        }

        public void setBuffer(float[] buffer, int size) {
            this.c = GlUtil.createBuffer(buffer);
            this.d = size;
        }
    }

    public static final class Uniform {
        private final int a;
        private final int b;
        private final float[] c;
        private int d;
        private int e;
        public final String name;

        public Uniform(int program, int index) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(program, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            byte[] bArr = new byte[iArr[0]];
            int i = iArr[0];
            GLES20.glGetActiveUniform(program, index, i, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, GlUtil.c(bArr));
            this.name = str;
            this.a = GLES20.glGetUniformLocation(program, str);
            this.b = iArr2[0];
            this.c = new float[16];
        }

        public void bind() {
            int i = this.b;
            if (i == 5126) {
                GLES20.glUniform1fv(this.a, 1, this.c, 0);
                GlUtil.checkGlError();
                return;
            }
            if (i == 35676) {
                GLES20.glUniformMatrix4fv(this.a, 1, false, this.c, 0);
                GlUtil.checkGlError();
                return;
            }
            if (this.d == 0) {
                throw new IllegalStateException("call setSamplerTexId before bind");
            }
            GLES20.glActiveTexture(this.e + 33984);
            int i2 = this.b;
            if (i2 == 36198) {
                GLES20.glBindTexture(36197, this.d);
            } else {
                if (i2 != 35678) {
                    int i3 = this.b;
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("unexpected uniform type: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                GLES20.glBindTexture(3553, this.d);
            }
            GLES20.glUniform1i(this.a, this.e);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GlUtil.checkGlError();
        }

        public void setFloat(float value) {
            this.c[0] = value;
        }

        public void setFloats(float[] value) {
            System.arraycopy(value, 0, this.c, 0, value.length);
        }

        public void setSamplerTexId(int texId, int unit) {
            this.d = texId;
            this.e = unit;
        }
    }

    private GlUtil() {
    }

    private static void b(int type, String source, int program) {
        int iGlCreateShader = GLES20.glCreateShader(type);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            StringBuilder sb = new StringBuilder(String.valueOf(strGlGetShaderInfoLog).length() + 10 + String.valueOf(source).length());
            sb.append(strGlGetShaderInfoLog);
            sb.append(", source: ");
            sb.append(source);
            d(sb.toString());
        }
        GLES20.glAttachShader(program, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(byte[] strVal) {
        for (int i = 0; i < strVal.length; i++) {
            if (strVal[i] == 0) {
                return i;
            }
        }
        return strVal.length;
    }

    public static void checkGlError() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            Log.e(a, strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
        }
    }

    public static int compileProgram(String[] vertexCode, String[] fragmentCode) {
        return compileProgram(TextUtils.join("\n", vertexCode), TextUtils.join("\n", fragmentCode));
    }

    public static FloatBuffer createBuffer(float[] data) {
        return (FloatBuffer) createBuffer(data.length).put(data).flip();
    }

    public static int createExternalTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlError();
        return iArr[0];
    }

    private static void d(String errorMsg) {
        Log.e(a, errorMsg);
    }

    public static Attribute[] getAttributes(int program) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(program, 35721, iArr, 0);
        if (iArr[0] != 2) {
            throw new IllegalStateException("expected two attributes");
        }
        Attribute[] attributeArr = new Attribute[iArr[0]];
        for (int i = 0; i < iArr[0]; i++) {
            attributeArr[i] = new Attribute(program, i);
        }
        return attributeArr;
    }

    public static Uniform[] getUniforms(int program) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(program, 35718, iArr, 0);
        Uniform[] uniformArr = new Uniform[iArr[0]];
        for (int i = 0; i < iArr[0]; i++) {
            uniformArr[i] = new Uniform(program, i);
        }
        return uniformArr;
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        String strEglQueryString;
        int i = Util.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(Util.MANUFACTURER) || "XT1650".equals(Util.MODEL))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(b);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        String strEglQueryString;
        return Util.SDK_INT >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(c);
    }

    public static int compileProgram(String vertexCode, String fragmentCode) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        checkGlError();
        b(35633, vertexCode, iGlCreateProgram);
        b(35632, fragmentCode, iGlCreateProgram);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram));
            d(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
        }
        checkGlError();
        return iGlCreateProgram;
    }

    public static FloatBuffer createBuffer(int capacity) {
        return ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }
}
