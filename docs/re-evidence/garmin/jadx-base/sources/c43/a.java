package c43;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import i43.l;
import java.util.List;
import p005kotlin.jvm.internal.j;
import p13.j0;
import p43.f2;
import p43.k1;
import p43.m1;
import p43.n0;
import p43.t1;
import p43.v0;
import q43.f;
import r43.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends v0 implements t43.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f24437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f24440e;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(t1 t1Var, b bVar, boolean z14, k1 k1Var, int i14, j jVar) {
        bVar = (i14 & 2) != 0 ? new c(t1Var) : bVar;
        z14 = (i14 & 4) != 0 ? false : z14;
        if ((i14 & 8) != 0) {
            k1.f135863b.getClass();
            k1Var = k1.f135864c;
        }
        this(t1Var, bVar, z14, k1Var);
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return j0.f134944a;
    }

    @Override // p43.n0
    public final k1 E0() {
        return this.f24440e;
    }

    @Override // p43.n0
    public final m1 F0() {
        return this.f24438c;
    }

    @Override // p43.n0
    public final boolean G0() {
        return this.f24439d;
    }

    @Override // p43.n0
    public final n0 H0(f fVar) {
        fVar.getClass();
        return new a(this.f24437b.c(fVar), this.f24438c, this.f24439d, this.f24440e);
    }

    @Override // p43.v0, p43.f2
    public final f2 J0(boolean z14) {
        if (z14 == this.f24439d) {
            return this;
        }
        return new a(this.f24437b, this.f24438c, z14, this.f24440e);
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: K0 */
    public final f2 H0(f fVar) {
        fVar.getClass();
        return new a(this.f24437b.c(fVar), this.f24438c, this.f24439d, this.f24440e);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        if (z14 == this.f24439d) {
            return this;
        }
        return new a(this.f24437b, this.f24438c, z14, this.f24440e);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return new a(this.f24437b, this.f24438c, this.f24439d, k1Var);
    }

    @Override // p43.n0
    public final l i() {
        return r43.l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p43.v0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Captured(");
        sb3.append(this.f24437b);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb3.append(this.f24439d ? CallerData.NA : "");
        return sb3.toString();
    }

    public a(t1 t1Var, b bVar, boolean z14, k1 k1Var) {
        t1Var.getClass();
        bVar.getClass();
        k1Var.getClass();
        this.f24437b = t1Var;
        this.f24438c = bVar;
        this.f24439d = z14;
        this.f24440e = k1Var;
    }
}
