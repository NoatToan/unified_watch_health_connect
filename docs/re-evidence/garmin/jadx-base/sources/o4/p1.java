package o4;

import android.graphics.Shader;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/p1;", "Lo4/w;", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p1 extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f128928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f128929c;

    public p1() {
        super(null);
        n4.g.f123559b.getClass();
        this.f128929c = n4.g.f123560c;
    }

    @Override // o4.w
    public final void a(float f14, long j8, d1 d1Var) {
        a2 a2Var = this.f128928b;
        if (a2Var == null || !n4.g.c(this.f128929c, j8)) {
            if (n4.g.h(j8)) {
                this.f128928b = null;
                n4.g.f123559b.getClass();
                this.f128929c = n4.g.f123560c;
                a2Var = null;
            } else {
                a2Var = this.f128928b;
                if (a2Var == null) {
                    a2Var = new a2();
                    this.f128928b = a2Var;
                }
                a2Var.f128809a = b(j8);
                this.f128928b = a2Var;
                this.f128929c = j8;
            }
        }
        long jB = d1Var.b();
        d0.f128823b.getClass();
        long j14 = d0.f128824c;
        if (!d0.d(jB, j14)) {
            d1Var.e(j14);
        }
        if (!p005kotlin.jvm.internal.s.g(d1Var.f(), a2Var != null ? a2Var.f128809a : null)) {
            d1Var.g(a2Var != null ? a2Var.f128809a : null);
        }
        if (d1Var.a() == f14) {
            return;
        }
        d1Var.c(f14);
    }

    public abstract Shader b(long j8);
}
