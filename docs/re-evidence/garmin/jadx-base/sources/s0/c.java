package s0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import b0.a0;
import b0.b0;
import b0.c1;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k7.h;
import r0.j;
import t0.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f155256n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f155257o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f155258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a0 f155259q;

    public c(a0 a0Var, a0 a0Var2) {
        this.f155258p = a0Var;
        this.f155259q = a0Var2;
    }

    @Override // r0.j
    public final t0.a e(b0 b0Var, Map map) throws Throwable {
        t0.a aVarE = super.e(b0Var, map);
        this.f155256n = t0.d.g();
        this.f155257o = t0.d.g();
        return aVarE;
    }

    public final void l(long j8, Surface surface, c1 c1Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        t0.d.d(true, this.f148726a);
        t0.d.c(this.f148728c);
        HashMap map = this.f148727b;
        h.f(map.containsKey(surface), "The surface is not registered.");
        g gVarB = (g) map.get(surface);
        Objects.requireNonNull(gVarB);
        if (gVarB == t0.d.f161636j) {
            gVarB = b(surface);
            if (gVarB == null) {
                return;
            } else {
                map.put(surface, gVarB);
            }
        }
        g gVar = gVarB;
        if (surface != this.f148734i) {
            f(gVar.a());
            this.f148734i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        m(gVar, c1Var, surfaceTexture, this.f155258p, this.f155256n, true);
        m(gVar, c1Var, surfaceTexture2, this.f155259q, this.f155257o, false);
        EGLExt.eglPresentationTimeANDROID(this.f148729d, gVar.a(), j8);
        if (EGL14.eglSwapBuffers(this.f148729d, gVar.a())) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        i(surface, false);
    }

    public final void m(g gVar, c1 c1Var, SurfaceTexture surfaceTexture, a0 a0Var, int i14, boolean z14) {
        k(i14);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        c1Var.Q0(fArr2, fArr, z14);
        t0.d.f fVar = this.f148736k;
        fVar.getClass();
        if (fVar instanceof t0.d.g) {
            GLES20.glUniformMatrix4fv(((t0.d.g) fVar).f161646f, 1, false, fArr2, 0);
            t0.d.b("glUniformMatrix4fv");
        }
        float fC = gVar.c();
        k7.d<Float, Float> dVar = a0Var.f13844c;
        int iFloatValue = (int) (dVar.f103262a.floatValue() * fC);
        float fB = gVar.b();
        Float f14 = dVar.f103263b;
        Float f15 = dVar.f103263b;
        Float f16 = dVar.f103262a;
        Size size = new Size(iFloatValue, (int) (f14.floatValue() * fB));
        Size size2 = new Size(gVar.c(), gVar.b());
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        k7.d<Float, Float> dVar2 = a0Var.f13843b;
        if (f16.floatValue() != 0.0f || f15.floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, dVar2.f103262a.floatValue() / f16.floatValue(), dVar2.f103263b.floatValue() / f15.floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(fVar.f161642b, 1, false, fArr5, 0);
        t0.d.b("glUniformMatrix4fv");
        GLES20.glUniform1f(fVar.f161643c, a0Var.f13842a);
        t0.d.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        t0.d.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
