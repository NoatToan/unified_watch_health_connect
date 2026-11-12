package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import fa.z;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f8516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0120b[] f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f8519e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8520a;

        private a(String str, int i14) {
            this.f8520a = str;
        }

        public static a a(int i14, int i15) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i14, 35722, iArr, 0);
            int i16 = iArr[0];
            byte[] bArr = new byte[i16];
            GLES20.glGetActiveAttrib(i14, i15, i16, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i17 = 0; i17 < i16; i17++) {
                if (bArr[i17] == 0) {
                    i16 = i17;
                    break;
                }
            }
            String str = new String(bArr, 0, i16);
            return new a(str, GLES20.glGetAttribLocation(i14, str));
        }
    }

    /* JADX INFO: renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    public static final class C0120b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8521a;

        private C0120b(String str, int i14, int i15) {
            this.f8521a = str;
        }

        public static C0120b a(int i14, int i15) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i14, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i16 = iArr[0];
            byte[] bArr = new byte[i16];
            GLES20.glGetActiveUniform(i14, i15, i16, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            for (int i17 = 0; i17 < i16; i17++) {
                if (bArr[i17] == 0) {
                    i16 = i17;
                    break;
                }
            }
            String str = new String(bArr, 0, i16);
            return new C0120b(str, GLES20.glGetUniformLocation(i14, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f8515a = iGlCreateProgram;
        GlUtil.b();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f8518d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f8516b = new a[iArr2[0]];
        for (int i14 = 0; i14 < iArr2[0]; i14++) {
            a aVarA = a.a(this.f8515a, i14);
            this.f8516b[i14] = aVarA;
            this.f8518d.put(aVarA.f8520a, aVarA);
        }
        this.f8519e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f8515a, 35718, iArr3, 0);
        this.f8517c = new C0120b[iArr3[0]];
        for (int i15 = 0; i15 < iArr3[0]; i15++) {
            C0120b c0120bA = C0120b.a(this.f8515a, i15);
            this.f8517c[i15] = c0120bA;
            this.f8519e.put(c0120bA.f8521a, c0120bA);
        }
        GlUtil.b();
    }

    public static void a(int i14, int i15, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i15);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i14, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    public final int b(String str) throws GlUtil.GlException {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f8515a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GlUtil.b();
        return iGlGetAttribLocation;
    }

    public b(Context context, String str, String str2) {
        this(z.M(context, str), z.M(context, str2));
    }
}
