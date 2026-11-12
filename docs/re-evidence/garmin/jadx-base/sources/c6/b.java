package c6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import g6.o;
import j20.x;
import lc.u0;
import n4.f;
import o4.b1;
import o4.f0;
import o4.f1;
import o4.g1;
import o4.m;
import o4.p1;
import o4.r1;
import o4.t1;
import o4.w;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import q4.g;
import q4.j;
import q4.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lc6/b;", "Landroid/text/style/LeadingMarginSpan;", "Lo4/r1;", "shape", "", "bulletWidthPx", "bulletHeightPx", "gapWidthPx", "Lo4/w;", "brush", "alpha", "Lq4/g;", "drawStyle", "Lg6/c;", "density", "textIndentPx", "<init>", "(Lo4/r1;FFFLo4/w;FLq4/g;Lg6/c;F)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f24597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f24600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f24602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g6.c f24603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24605i;

    public b(r1 r1Var, float f14, float f15, float f16, w wVar, float f17, g gVar, g6.c cVar, float f18) {
        this.f24597a = r1Var;
        this.f24598b = f14;
        this.f24599c = f15;
        this.f24600d = wVar;
        this.f24601e = f17;
        this.f24602f = gVar;
        this.f24603g = cVar;
        int iC = MathKt.c(f14 + f16);
        this.f24604h = iC;
        this.f24605i = MathKt.c(f18) - iC;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i14, final int i15, int i16, int i17, int i18, CharSequence charSequence, int i19, int i24, boolean z14, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f14 = (i16 + i18) / 2.0f;
        int i25 = i14 - this.f24604h;
        if (i25 < 0) {
            i25 = 0;
        }
        final int i26 = i25;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i19 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        j jVar = j.f142560a;
        g gVar = this.f24602f;
        Integer numValueOf = null;
        if (s.g(gVar, jVar)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(gVar instanceof k)) {
                u0.r();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            k kVar = (k) gVar;
            paint.setStrokeWidth(kVar.f142562a);
            paint.setStrokeMiter(kVar.f142563b);
            paint.setStrokeCap(d.a(kVar.f142564c));
            paint.setStrokeJoin(d.b(kVar.f142565d));
            g1 g1Var = kVar.f142566e;
            paint.setPathEffect(g1Var != null ? ((o4.k) g1Var).f128879b : null);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f24598b)) << 32) | (((long) Float.floatToRawIntBits(this.f24599c)) & 4294967295L);
        n4.g.a aVar = n4.g.f123559b;
        e23.a aVar2 = new e23.a() { // from class: c6.a
            @Override // e23.a
            public final Object invoke() {
                b bVar = this.f24590a;
                r1 r1Var = bVar.f24597a;
                int i27 = i15;
                b1 b1VarA = r1Var.a(jFloatToRawIntBits, i27 > 0 ? o.Ltr : o.Rtl, bVar.f24603g);
                float f15 = i26;
                boolean z15 = b1VarA instanceof b1.a;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f16 = f14;
                if (z15) {
                    canvas2.save();
                    f1 f1Var = ((b1.a) b1VarA).f128811a;
                    n4.d bounds = f1Var.getBounds();
                    canvas2.translate(f15, f16 - ((bounds.f123550d - bounds.f123548b) / 2.0f));
                    if (!(f1Var instanceof o4.j)) {
                        org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
                        return null;
                    }
                    canvas2.drawPath(((o4.j) f1Var).f128869b, paint2);
                    canvas2.restore();
                } else if (b1VarA instanceof b1.c) {
                    n4.e eVar = ((b1.c) b1VarA).f128813a;
                    if (f.d(eVar)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f123555e >> 32));
                        canvas2.drawRoundRect(f15, f16 - (eVar.a() / 2.0f), (eVar.b() * i27) + f15, (eVar.a() / 2.0f) + f16, fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        o4.j jVarA = m.a();
                        jVarA.k(eVar, f1.b.CounterClockwise);
                        canvas2.save();
                        canvas2.translate(f15, f16 - (eVar.a() / 2.0f));
                        canvas2.drawPath(jVarA.f128869b, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(b1VarA instanceof b1.b)) {
                        u0.r();
                        return null;
                    }
                    n4.d dVar = ((b1.b) b1VarA).f128812a;
                    float f17 = (dVar.f123550d - dVar.f123548b) / 2.0f;
                    canvas2.drawRect(f15, f16 - f17, x.a(dVar.f123549c, dVar.f123547a, i27, f15), f17 + f16, paint2);
                }
                return Unit.INSTANCE;
            }
        };
        w wVar = this.f24600d;
        float f15 = this.f24601e;
        if (wVar == null) {
            if (!Float.isNaN(f15)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f15 * 255.0f));
            }
            aVar2.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (wVar instanceof t1) {
            int color = paint.getColor();
            if (!Float.isNaN(f15)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f15 * 255.0f));
            }
            paint.setColor(f0.j(((t1) wVar).f129007b));
            aVar2.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else {
            if (!(wVar instanceof p1)) {
                u0.r();
                return;
            }
            Shader shader = paint.getShader();
            if (!Float.isNaN(f15)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f15 * 255.0f));
            }
            paint.setShader(((p1) wVar).b(jFloatToRawIntBits));
            aVar2.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z14) {
        int i14 = this.f24605i;
        if (i14 >= 0) {
            return 0;
        }
        return Math.abs(i14);
    }
}
