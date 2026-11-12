package defpackage;

import android.opengl.GLES20;
import com.projectseptember.RNGL.GLShaderCompilationFailed;
import com.projectseptember.RNGL.RNGLContext;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class lva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25468b;
    public final String c;
    public Map<String, Integer> d;
    public List<String> e;
    public int f;
    public int[] g;
    public int h;
    public Map<String, Integer> i;
    public Map<String, Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f25469k;
    public RNGLContext l;
    public GLShaderCompilationFailed m;

    public lva(mva mvaVar, Integer num, RNGLContext rNGLContext) {
        this.f25467a = mvaVar.f27250a;
        this.f25468b = mvaVar.f27251b;
        this.c = mvaVar.c;
        this.f25469k = num;
        this.l = rNGLContext;
    }

    public void a() {
        d();
        if (!GLES20.glIsProgram(this.f)) {
            j("not a program");
        }
        GLES20.glUseProgram(this.f);
        GLES20.glBindBuffer(34962, this.g[0]);
        GLES20.glEnableVertexAttribArray(this.h);
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 0, 0);
    }

    public final int b(String str, int i) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        j(GLES20.glGetShaderInfoLog(iGlCreateShader));
        return -1;
    }

    public final void c() {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f, 35718, iArr, 0);
        int i = 0;
        while (i < iArr[0]) {
            int i2 = i;
            String strGlGetActiveUniform = GLES20.glGetActiveUniform(this.f, i, iArr3, 0, iArr2, 0);
            int i3 = iArr3[0];
            int i4 = iArr2[0];
            if (strGlGetActiveUniform.contains("[0]")) {
                strGlGetActiveUniform = strGlGetActiveUniform.substring(0, strGlGetActiveUniform.length() - 3);
            }
            arrayList.add(strGlGetActiveUniform);
            map.put(strGlGetActiveUniform, Integer.valueOf(i4));
            map3.put(strGlGetActiveUniform, Integer.valueOf(i3));
            if (i3 == 1) {
                map2.put(strGlGetActiveUniform, Integer.valueOf(GLES20.glGetUniformLocation(this.f, strGlGetActiveUniform)));
            } else {
                for (int i5 = 0; i5 < i3; i5++) {
                    String str = strGlGetActiveUniform + "[" + i5 + "]";
                    map2.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.f, str)));
                    map.put(str, Integer.valueOf(i4));
                    map3.put(str, 1);
                }
            }
            i = i2 + 1;
        }
        this.d = map;
        this.i = map2;
        this.j = map3;
        this.e = arrayList;
    }

    public boolean d() {
        if (!h()) {
            GLShaderCompilationFailed gLShaderCompilationFailed = this.m;
            if (gLShaderCompilationFailed != null) {
                throw gLShaderCompilationFailed;
            }
            try {
                i();
                this.l.shaderSucceedToCompile(this.f25469k, this.d);
            } catch (GLShaderCompilationFailed e) {
                this.m = e;
                this.l.shaderFailedToCompile(this.f25469k, e);
                throw e;
            }
        }
        return h();
    }

    public List<String> e() {
        return this.e;
    }

    public Map<String, Integer> f() {
        return this.j;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.g != null) {
            GLES20.glDeleteProgram(this.f);
            GLES20.glDeleteBuffers(1, this.g, 0);
        }
    }

    public Map<String, Integer> g() {
        return this.d;
    }

    public boolean h() {
        return (this.g == null || this.i == null) ? false : true;
    }

    public final void i() throws GLShaderCompilationFailed {
        int iB;
        int iB2 = b(this.f25468b, 35633);
        if (iB2 == -1 || (iB = b(this.c, 35632)) == -1) {
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        GLES20.glAttachShader(this.f, iB);
        GLES20.glLinkProgram(this.f);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f, 35714, iArr, 0);
        if (iArr[0] == 0) {
            j(GLES20.glGetProgramInfoLog(this.f));
        }
        GLES20.glUseProgram(this.f);
        o();
        c();
        this.h = GLES20.glGetAttribLocation(this.f, "position");
        int[] iArr2 = new int[1];
        this.g = iArr2;
        GLES20.glGenBuffers(1, iArr2, 0);
        GLES20.glBindBuffer(34962, this.g[0]);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, -1.0f, 4.0f, 4.0f, -1.0f}).position(0);
        GLES20.glBufferData(34962, 24, floatBufferAsFloatBuffer, 35044);
    }

    public void j(String str) {
        throw new GLShaderCompilationFailed(this.f25467a, str);
    }

    public void k(String str, Float f) {
        GLES20.glUniform1f(this.i.get(str).intValue(), f.floatValue());
    }

    public void l(String str, Integer num) {
        GLES20.glUniform1i(this.i.get(str).intValue(), num.intValue());
    }

    public void m(String str, FloatBuffer floatBuffer, int i) {
        switch (i) {
            case 35664:
                GLES20.glUniform2fv(this.i.get(str).intValue(), 1, floatBuffer);
                break;
            case 35665:
                GLES20.glUniform3fv(this.i.get(str).intValue(), 1, floatBuffer);
                break;
            case 35666:
                GLES20.glUniform4fv(this.i.get(str).intValue(), 1, floatBuffer);
                break;
            default:
                switch (i) {
                    case 35674:
                        GLES20.glUniformMatrix2fv(this.i.get(str).intValue(), 1, false, floatBuffer);
                        break;
                    case 35675:
                        GLES20.glUniformMatrix3fv(this.i.get(str).intValue(), 1, false, floatBuffer);
                        break;
                    case 35676:
                        GLES20.glUniformMatrix4fv(this.i.get(str).intValue(), 1, false, floatBuffer);
                        break;
                    default:
                        j("Unsupported case: uniform '" + str + "' type: " + i);
                        break;
                }
                break;
        }
    }

    public void n(String str, IntBuffer intBuffer, int i) {
        switch (i) {
            case 35667:
            case 35671:
                GLES20.glUniform2iv(this.i.get(str).intValue(), 1, intBuffer);
                break;
            case 35668:
            case 35672:
                GLES20.glUniform3iv(this.i.get(str).intValue(), 1, intBuffer);
                break;
            case 35669:
            case 35673:
                GLES20.glUniform4iv(this.i.get(str).intValue(), 1, intBuffer);
                break;
            case 35670:
            default:
                j("Unsupported case: uniform '" + str + "' type: " + i);
                break;
        }
    }

    public void o() {
        GLES20.glValidateProgram(this.f);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f, 35715, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glGetProgramInfoLog(this.f);
            j(GLES20.glGetProgramInfoLog(this.f));
        }
    }
}
