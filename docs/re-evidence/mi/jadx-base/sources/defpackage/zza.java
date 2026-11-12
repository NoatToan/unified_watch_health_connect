package defpackage;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class zza implements pkk {
    public static final String g = "rotation-degrees";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jrq f41823b;
    public krq c;
    public List<vza> d = new ArrayList();
    public float[] e = new float[16];
    public boolean f;

    public zza(List<vza> list) {
        this.f41822a = (list == null || list.isEmpty()) ? false : true;
        if (list == null) {
            this.d.add(new drq());
            return;
        }
        Iterator<vza> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof vza) {
                this.d.addAll(list);
            }
        }
        this.d.add(new drq());
        this.d.addAll(list);
    }

    @Override // defpackage.pkk
    public Surface a() {
        jrq jrqVar = this.f41823b;
        if (jrqVar != null) {
            return jrqVar.c();
        }
        return null;
    }

    @Override // defpackage.pkk
    public void b(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (surface == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires an output surface");
        }
        if (mediaFormat2 == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires target media format");
        }
        String str = g;
        int integer = mediaFormat2.containsKey(str) ? mediaFormat2.getInteger(str) : (mediaFormat == null || !mediaFormat.containsKey(str)) ? 0 : mediaFormat.getInteger(str);
        float integer2 = (mediaFormat2.containsKey("width") && mediaFormat2.containsKey("height")) ? mediaFormat2.getInteger("width") / mediaFormat2.getInteger("height") : 1.0f;
        this.c = new krq(surface);
        int integer3 = -1;
        int integer4 = (mediaFormat == null || !mediaFormat.containsKey("width")) ? -1 : mediaFormat.getInteger("width");
        if (mediaFormat != null && mediaFormat.containsKey("height")) {
            integer3 = mediaFormat.getInteger("height");
        }
        this.f41823b = new jrq(integer4, integer3);
        f(integer, integer2);
        for (vza vzaVar : this.d) {
            vzaVar.init();
            float[] fArr = this.e;
            vzaVar.b(Arrays.copyOf(fArr, fArr.length), 0);
        }
    }

    @Override // defpackage.pkk
    public void c(long j) {
        this.f41823b.a();
        d(j);
        this.c.e(j);
        this.c.f();
    }

    public final void d(long j) {
        e();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        Iterator<vza> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(j);
        }
        GLES20.glFinish();
    }

    public final void e() {
        if (this.f) {
            return;
        }
        for (vza vzaVar : this.d) {
            if (vzaVar instanceof vza) {
                vzaVar.c(this.f41823b.d(), this.f41823b.e());
            }
        }
        this.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0050 A[PHI: r2
      0x0050: PHI (r2v2 float) = (r2v1 float), (r2v4 float) binds: [B:3:0x0024, B:7:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void f(int i, float f) {
        float fCos;
        float f2;
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.orthoM(fArr, 0, -f, f, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float f3 = 1.0f;
        float fSin = 0.0f;
        if (i == 0) {
            fCos = f3;
            f2 = fSin;
        } else {
            if (i != 90) {
                f3 = -1.0f;
                if (i == 180) {
                    fCos = f3;
                } else if (i != 270) {
                    double d = ((double) (i / 180)) * 3.141592653589793d;
                    fSin = (float) Math.sin(d);
                    fCos = (float) Math.cos(d);
                }
                f2 = fSin;
            }
            f2 = f3;
            fCos = 0.0f;
        }
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f2, fCos, 0.0f);
        Matrix.setIdentityM(this.e, 0);
        Matrix.multiplyMM(this.e, 0, fArr, 0, fArr2, 0);
    }

    @Override // defpackage.pkk
    public void release() {
        Iterator<vza> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f41823b.f();
        this.c.d();
    }
}
