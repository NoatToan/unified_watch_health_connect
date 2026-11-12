package androidx.camera.core.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f5515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f5516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f5517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.s0<b0.l1> f5518e;

    public c(k0 k0Var, e0 e0Var) {
        super(k0Var);
        this.f5518e = null;
        this.f5515b = k0Var;
        this.f5517d = e0Var;
        this.f5516c = e0Var.t();
        h hVar = e0.f5534d;
        Boolean bool = Boolean.FALSE;
        ((Boolean) e0Var.f(hVar, bool)).getClass();
        ((Boolean) e0Var.f(e0.f5536f, bool)).getClass();
    }

    public static float y(float f14, float f15, float f16) {
        if (f16 == f15) {
            return 0.0f;
        }
        if (f14 == f16) {
            return 1.0f;
        }
        if (f14 == f15) {
            return 0.0f;
        }
        float f17 = 1.0f / f15;
        return ((1.0f / f14) - f17) / ((1.0f / f16) - f17);
    }

    public static float z(float f14, float f15, float f16) {
        if (f14 == 1.0f) {
            return f16;
        }
        if (f14 == 0.0f) {
            return f15;
        }
        double d14 = 1.0f / f15;
        double d15 = 1.0d / (((((double) (1.0f / f16)) - d14) * ((double) f14)) + d14);
        double d16 = f15;
        double d17 = f16;
        if (d15 < d16) {
            d15 = d16;
        } else if (d15 > d17) {
            d15 = d17;
        }
        return (float) d15;
    }

    @Override // androidx.camera.core.impl.i1, b0.r
    public final androidx.lifecycle.s0<b0.l1> g() {
        n2 n2Var = this.f5516c;
        if (!j0.t.a(n2Var, 0)) {
            return new androidx.lifecycle.y0(new m0.a(1.0f, 1.0f, 1.0f, 0.0f));
        }
        k0 k0Var = this.f5515b;
        if (n2Var != null) {
            b0.l1 l1VarD = k0Var.g().d();
            Range rangeF = n2.f();
            if (rangeF != null && (((Float) rangeF.getLower()).floatValue() != l1VarD.d() || ((Float) rangeF.getUpper()).floatValue() != l1VarD.c())) {
                if (this.f5518e == null) {
                    this.f5518e = j0.n.a(k0Var.g(), new a73.j(rangeF, 7));
                }
                return this.f5518e;
            }
        }
        return k0Var.g();
    }

    @Override // androidx.camera.core.impl.i1, androidx.camera.core.impl.k0
    public final k0 getImplementation() {
        return this.f5515b;
    }

    @Override // androidx.camera.core.impl.i1, b0.r
    public final androidx.lifecycle.s0<Integer> m() {
        return !j0.t.a(this.f5516c, 6) ? new androidx.lifecycle.y0(0) : this.f5515b.m();
    }

    @Override // androidx.camera.core.impl.i1, androidx.camera.core.impl.k0
    public final boolean x() {
        int[] iArr;
        if (this.f5516c != null) {
            Iterator it = Collections.EMPTY_LIST.iterator();
            while (true) {
                if (!it.hasNext()) {
                    iArr = null;
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                    iArr = (int[]) pair.second;
                    break;
                }
            }
            if (iArr != null) {
                for (int i14 : iArr) {
                    if (i14 == 1) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.f5574a.x();
    }
}
