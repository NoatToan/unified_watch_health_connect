package kotlin;

import android.graphics.Outline;
import android.os.Build;
import lc.u0;
import n4.c;
import n4.d;
import n4.e;
import n4.f;
import n4.g;
import o4.b1;
import o4.f1;
import o4.j;
import o4.m;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li5/y2;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91650a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f91651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f91652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f91653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f1 f91654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f1 f91657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f91658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f91659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f91660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f91661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f91662m;

    public y2() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f91651b = outline;
        c.f123541b.getClass();
        this.f91660k = 0L;
        g.f123559b.getClass();
        this.f91661l = 0L;
    }

    public final void a() {
        if (this.f91655f) {
            c.f123541b.getClass();
            this.f91660k = 0L;
            this.f91659j = 0.0f;
            this.f91654e = null;
            this.f91655f = false;
            this.f91656g = false;
            b1 b1Var = this.f91652c;
            Outline outline = this.f91651b;
            if (b1Var == null || !this.f91662m || Float.intBitsToFloat((int) (this.f91661l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f91661l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f91650a = true;
            if (b1Var instanceof b1.b) {
                d dVar = ((b1.b) b1Var).f128812a;
                float f14 = dVar.f123547a;
                float f15 = dVar.f123548b;
                this.f91660k = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
                float f16 = dVar.f123549c;
                float f17 = dVar.f123547a;
                float f18 = dVar.f123550d;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f16 - f17);
                long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f18 - f15)) & 4294967295L;
                g.a aVar = g.f123559b;
                this.f91661l = jFloatToRawIntBits2 | (jFloatToRawIntBits << 32);
                outline.setRect(Math.round(f17), Math.round(f15), Math.round(f16), Math.round(f18));
                return;
            }
            if (!(b1Var instanceof b1.c)) {
                if (b1Var instanceof b1.a) {
                    b(((b1.a) b1Var).f128811a);
                    return;
                } else {
                    u0.r();
                    return;
                }
            }
            e eVar = ((b1.c) b1Var).f128813a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f123555e >> 32));
            float f19 = eVar.f123551a;
            float f22 = eVar.f123552b;
            this.f91660k = (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L);
            float fB = eVar.b();
            float fA = eVar.a();
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fB);
            long jFloatToRawIntBits4 = ((long) Float.floatToRawIntBits(fA)) & 4294967295L;
            g.a aVar2 = g.f123559b;
            this.f91661l = jFloatToRawIntBits4 | (jFloatToRawIntBits3 << 32);
            if (f.d(eVar)) {
                this.f91651b.setRoundRect(Math.round(f19), Math.round(f22), Math.round(eVar.f123553c), Math.round(eVar.f123554d), fIntBitsToFloat);
                this.f91659j = fIntBitsToFloat;
                return;
            }
            j jVarA = this.f91653d;
            if (jVarA == null) {
                jVarA = m.a();
                this.f91653d = jVarA;
            }
            jVarA.reset();
            jVarA.k(eVar, f1.b.CounterClockwise);
            b(jVarA);
        }
    }

    public final void b(f1 f1Var) {
        int i14 = Build.VERSION.SDK_INT;
        Outline outline = this.f91651b;
        if (i14 > 28 || f1Var.h()) {
            if (i14 >= 30) {
                z2.f91669a.a(outline, f1Var);
            } else {
                if (!(f1Var instanceof j)) {
                    org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                    return;
                }
                outline.setConvexPath(((j) f1Var).f128869b);
            }
            this.f91656g = !outline.canClip();
        } else {
            this.f91650a = false;
            outline.setEmpty();
            this.f91656g = true;
        }
        this.f91654e = f1Var;
    }
}
