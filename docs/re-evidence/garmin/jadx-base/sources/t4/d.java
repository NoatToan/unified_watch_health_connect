package t4;

import e23.l;
import g6.o;
import g8.i;
import n4.g;
import o4.d1;
import o4.e0;
import o4.h;
import o4.y;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import q4.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010#\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lt4/d;", "", "<init>", "()V", "Lo4/d1;", "obtainPaint", "()Lo4/d1;", "Lo4/e0;", "colorFilter", "", "configureColorFilter", "(Lo4/e0;)V", "", "alpha", "configureAlpha", "(F)V", "Lg6/o;", "rtl", "configureLayoutDirection", "(Lg6/o;)V", "Lq4/f;", "onDraw", "(Lq4/f;)V", "", "applyAlpha", "(F)Z", "applyColorFilter", "(Lo4/e0;)Z", "layoutDirection", "applyLayoutDirection", "(Lg6/o;)Z", "Ln4/g;", "size", "draw-x_KDEd0", "(Lq4/f;JFLo4/e0;)V", "draw", "layerPaint", "Lo4/d1;", "useLayer", "Z", "Lo4/e0;", "F", "Lg6/o;", "Lkotlin/Function1;", "drawLambda", "Le23/l;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class d {
    public static final int $stable = 8;
    private e0 colorFilter;
    private d1 layerPaint;
    private boolean useLayer;
    private float alpha = 1.0f;
    private o layoutDirection = o.Ltr;
    private final l<f, Unit> drawLambda = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<f, Unit> {
        public a() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(f fVar) {
            d.this.onDraw(fVar);
            return Unit.INSTANCE;
        }
    }

    private final void configureAlpha(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!applyAlpha(alpha)) {
            if (alpha == 1.0f) {
                d1 d1Var = this.layerPaint;
                if (d1Var != null) {
                    d1Var.c(alpha);
                }
                this.useLayer = false;
            } else {
                obtainPaint().c(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void configureColorFilter(e0 colorFilter) {
        if (s.g(this.colorFilter, colorFilter)) {
            return;
        }
        if (!applyColorFilter(colorFilter)) {
            if (colorFilter == null) {
                d1 d1Var = this.layerPaint;
                if (d1Var != null) {
                    d1Var.d(null);
                }
                this.useLayer = false;
            } else {
                obtainPaint().d(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void configureLayoutDirection(o rtl) {
        if (this.layoutDirection != rtl) {
            applyLayoutDirection(rtl);
            this.layoutDirection = rtl;
        }
    }

    /* JADX INFO: renamed from: draw-x_KDEd0$default, reason: not valid java name */
    public static /* synthetic */ void m500drawx_KDEd0$default(d dVar, f fVar, long j8, float f14, e0 e0Var, int i14, Object obj) {
        if (obj != null) {
            e.w("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
            return;
        }
        if ((i14 & 2) != 0) {
            f14 = 1.0f;
        }
        float f15 = f14;
        if ((i14 & 4) != 0) {
            e0Var = null;
        }
        dVar.m501drawx_KDEd0(fVar, j8, f15, e0Var);
    }

    private final d1 obtainPaint() {
        d1 d1Var = this.layerPaint;
        if (d1Var != null) {
            return d1Var;
        }
        h hVar = new h();
        this.layerPaint = hVar;
        return hVar;
    }

    public boolean applyAlpha(float alpha) {
        return false;
    }

    public boolean applyColorFilter(e0 colorFilter) {
        return false;
    }

    public boolean applyLayoutDirection(o layoutDirection) {
        return false;
    }

    /* JADX INFO: renamed from: draw-x_KDEd0, reason: not valid java name */
    public final void m501drawx_KDEd0(f fVar, long j8, float f14, e0 e0Var) {
        configureAlpha(f14);
        configureColorFilter(e0Var);
        configureLayoutDirection(fVar.getLayoutDirection());
        int i14 = (int) (j8 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) - Float.intBitsToFloat(i14);
        int i15 = (int) (j8 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - Float.intBitsToFloat(i15);
        fVar.getF142543b().f142550a.e(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f14 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i14) > 0.0f && Float.intBitsToFloat(i15) > 0.0f) {
                    if (this.useLayer) {
                        n4.c.f123541b.getClass();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i14);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i15);
                        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat3);
                        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L;
                        g.a aVar = g.f123559b;
                        n4.d dVarG = i.g(0L, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
                        y yVarA = fVar.getF142543b().a();
                        try {
                            yVarA.c(dVarG, obtainPaint());
                            onDraw(fVar);
                            yVarA.i();
                        } catch (Throwable th3) {
                            yVarA.i();
                            throw th3;
                        }
                    } else {
                        onDraw(fVar);
                    }
                }
            } catch (Throwable th4) {
                fVar.getF142543b().f142550a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th4;
            }
        }
        fVar.getF142543b().f142550a.e(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public abstract long mo54getIntrinsicSizeNHjbRc();

    public abstract void onDraw(f fVar);
}
