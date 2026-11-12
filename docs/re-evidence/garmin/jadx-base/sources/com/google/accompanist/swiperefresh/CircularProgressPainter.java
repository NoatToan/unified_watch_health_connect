package com.google.accompanist.swiperefresh;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.internal.ViewUtils;
import g6.f;
import gl1.y;
import n4.c;
import n4.g;
import n4.h;
import o13.l;
import o13.m;
import o4.d0;
import o4.f1;
import o4.u1;
import p005kotlin.Metadata;
import p3.p0;
import p3.p1;
import q4.a;
import t4.d;
import tn.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R4\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R4\u0010%\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020!8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R4\u0010)\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020!8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R+\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R4\u00103\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020!8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010 R4\u00107\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020!8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R+\u0010;\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R+\u0010E\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u0016\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R+\u0010I\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u0016\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R+\u0010M\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0016\u001a\u0004\bK\u0010\u001e\"\u0004\bL\u0010 R\u001d\u0010P\u001a\u00020N8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Lcom/google/accompanist/swiperefresh/CircularProgressPainter;", "Lt4/d;", "<init>", "()V", "Lq4/f;", "", "startAngle", "sweepAngle", "Ln4/d;", "bounds", "", "drawArrow", "(Lq4/f;FFLn4/d;)V", "alpha", "", "applyAlpha", "(F)Z", "onDraw", "(Lq4/f;)V", "Lo4/d0;", "<set-?>", "color$delegate", "Lp3/p1;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", TtmlNode.ATTR_TTS_COLOR, "alpha$delegate", "getAlpha", "()F", "setAlpha", "(F)V", "Lg6/f;", "arcRadius$delegate", "getArcRadius-D9Ej5fM", "setArcRadius-0680j_4", "arcRadius", "strokeWidth$delegate", "getStrokeWidth-D9Ej5fM", "setStrokeWidth-0680j_4", "strokeWidth", "arrowEnabled$delegate", "getArrowEnabled", "()Z", "setArrowEnabled", "(Z)V", "arrowEnabled", "arrowWidth$delegate", "getArrowWidth-D9Ej5fM", "setArrowWidth-0680j_4", "arrowWidth", "arrowHeight$delegate", "getArrowHeight-D9Ej5fM", "setArrowHeight-0680j_4", "arrowHeight", "arrowScale$delegate", "getArrowScale", "setArrowScale", "arrowScale", "Lo4/f1;", "arrow$delegate", "Lo13/l;", "getArrow", "()Lo4/f1;", "arrow", "startTrim$delegate", "getStartTrim", "setStartTrim", "startTrim", "endTrim$delegate", "getEndTrim", "setEndTrim", "endTrim", "rotation$delegate", "getRotation", "setRotation", "rotation", "Ln4/g;", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "swiperefresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CircularProgressPainter extends d {

    /* JADX INFO: renamed from: alpha$delegate, reason: from kotlin metadata */
    private final p1 alpha;

    /* JADX INFO: renamed from: arcRadius$delegate, reason: from kotlin metadata */
    private final p1 arcRadius;

    /* JADX INFO: renamed from: arrow$delegate, reason: from kotlin metadata */
    private final l arrow;

    /* JADX INFO: renamed from: arrowEnabled$delegate, reason: from kotlin metadata */
    private final p1 arrowEnabled;

    /* JADX INFO: renamed from: arrowHeight$delegate, reason: from kotlin metadata */
    private final p1 arrowHeight;

    /* JADX INFO: renamed from: arrowScale$delegate, reason: from kotlin metadata */
    private final p1 arrowScale;

    /* JADX INFO: renamed from: arrowWidth$delegate, reason: from kotlin metadata */
    private final p1 arrowWidth;

    /* JADX INFO: renamed from: color$delegate, reason: from kotlin metadata */
    private final p1 color;

    /* JADX INFO: renamed from: endTrim$delegate, reason: from kotlin metadata */
    private final p1 endTrim;

    /* JADX INFO: renamed from: rotation$delegate, reason: from kotlin metadata */
    private final p1 rotation;

    /* JADX INFO: renamed from: startTrim$delegate, reason: from kotlin metadata */
    private final p1 startTrim;

    /* JADX INFO: renamed from: strokeWidth$delegate, reason: from kotlin metadata */
    private final p1 strokeWidth;

    public CircularProgressPainter() {
        d0.f128823b.getClass();
        this.color = p0.n(d0.a(d0.f128832k));
        Float fValueOf = Float.valueOf(1.0f);
        this.alpha = p0.n(fValueOf);
        float f14 = 0;
        this.arcRadius = p0.n(f.a(f14));
        this.strokeWidth = p0.n(f.a(5));
        this.arrowEnabled = p0.n(Boolean.FALSE);
        this.arrowWidth = p0.n(f.a(f14));
        this.arrowHeight = p0.n(f.a(f14));
        this.arrowScale = p0.n(fValueOf);
        this.arrow = m.b(CircularProgressPainter$arrow$2.INSTANCE);
        Float fValueOf2 = Float.valueOf(0.0f);
        this.startTrim = p0.n(fValueOf2);
        this.endTrim = p0.n(fValueOf2);
        this.rotation = p0.n(fValueOf2);
    }

    private final void drawArrow(q4.f fVar, float f14, float f15, n4.d dVar) {
        getArrow().reset();
        getArrow().a(0.0f, 0.0f);
        getArrow().c(getArrowScale() * fVar.s0(m66getArrowWidthD9Ej5fM()), 0.0f);
        getArrow().c((getArrowScale() * fVar.s0(m66getArrowWidthD9Ej5fM())) / 2, getArrowScale() * fVar.s0(m65getArrowHeightD9Ej5fM()));
        float fMin = Math.min(dVar.f123549c - dVar.f123547a, dVar.f123550d - dVar.f123548b) / 2.0f;
        getArrow().e(y.f((c.g(dVar.f()) + fMin) - ((getArrowScale() * fVar.s0(m66getArrowWidthD9Ej5fM())) / 2.0f), (fVar.s0(m68getStrokeWidthD9Ej5fM()) / 2.0f) + c.h(dVar.f())));
        getArrow().close();
        float f16 = f14 + f15;
        long jI1 = fVar.i1();
        a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        f142543b.f142550a.f(f16, jI1);
        q4.f.L(fVar, getArrow(), m67getColor0d7_KjU(), getAlpha(), null, 56);
        k.p(f142543b, jB);
    }

    private final f1 getArrow() {
        return (f1) this.arrow.getValue();
    }

    @Override // t4.d
    public boolean applyAlpha(float alpha) {
        setAlpha(alpha);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getAlpha() {
        return ((Number) this.alpha.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getArcRadius-D9Ej5fM, reason: not valid java name */
    public final float m64getArcRadiusD9Ej5fM() {
        return ((f) this.arcRadius.getF182175a()).f75997a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getArrowEnabled() {
        return ((Boolean) this.arrowEnabled.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getArrowHeight-D9Ej5fM, reason: not valid java name */
    public final float m65getArrowHeightD9Ej5fM() {
        return ((f) this.arrowHeight.getF182175a()).f75997a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getArrowScale() {
        return ((Number) this.arrowScale.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getArrowWidth-D9Ej5fM, reason: not valid java name */
    public final float m66getArrowWidthD9Ej5fM() {
        return ((f) this.arrowWidth.getF182175a()).f75997a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m67getColor0d7_KjU() {
        return ((d0) this.color.getF182175a()).f128833a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getEndTrim() {
        return ((Number) this.endTrim.getF182175a()).floatValue();
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long getF162260d() {
        g.f123559b.getClass();
        return g.f123560c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getRotation() {
        return ((Number) this.rotation.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getStartTrim() {
        return ((Number) this.startTrim.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m68getStrokeWidthD9Ej5fM() {
        return ((f) this.strokeWidth.getF182175a()).f75997a;
    }

    @Override // t4.d
    public void onDraw(q4.f fVar) {
        fVar.getClass();
        float rotation = getRotation();
        long jI1 = fVar.i1();
        a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        f142543b.f142550a.f(rotation, jI1);
        float fS0 = (fVar.s0(m68getStrokeWidthD9Ej5fM()) / 2.0f) + fVar.s0(m64getArcRadiusD9Ej5fM());
        n4.d dVar = new n4.d(c.g(h.b(fVar.b())) - fS0, c.h(h.b(fVar.b())) - fS0, c.g(h.b(fVar.b())) + fS0, c.h(h.b(fVar.b())) + fS0);
        float f14 = 360;
        float rotation2 = (getRotation() + getStartTrim()) * f14;
        float rotation3 = ((getRotation() + getEndTrim()) * f14) - rotation2;
        long jM67getColor0d7_KjU = m67getColor0d7_KjU();
        float alpha = getAlpha();
        long jI = dVar.i();
        long jG = dVar.g();
        float fS1 = fVar.s0(m68getStrokeWidthD9Ej5fM());
        u1.f129010b.getClass();
        q4.f.Q1(fVar, jM67getColor0d7_KjU, rotation2, rotation3, jI, jG, alpha, new q4.k(fS1, 0.0f, u1.f129012d, 0, null, 26, null), ViewUtils.EDGE_TO_EDGE_FLAGS);
        if (getArrowEnabled()) {
            drawArrow(fVar, rotation2, rotation3, dVar);
        }
        k.p(f142543b, jB);
    }

    public final void setAlpha(float f14) {
        this.alpha.setValue(Float.valueOf(f14));
    }

    /* JADX INFO: renamed from: setArcRadius-0680j_4, reason: not valid java name */
    public final void m69setArcRadius0680j_4(float f14) {
        this.arcRadius.setValue(f.a(f14));
    }

    public final void setArrowEnabled(boolean z14) {
        this.arrowEnabled.setValue(Boolean.valueOf(z14));
    }

    /* JADX INFO: renamed from: setArrowHeight-0680j_4, reason: not valid java name */
    public final void m70setArrowHeight0680j_4(float f14) {
        this.arrowHeight.setValue(f.a(f14));
    }

    public final void setArrowScale(float f14) {
        this.arrowScale.setValue(Float.valueOf(f14));
    }

    /* JADX INFO: renamed from: setArrowWidth-0680j_4, reason: not valid java name */
    public final void m71setArrowWidth0680j_4(float f14) {
        this.arrowWidth.setValue(f.a(f14));
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m72setColor8_81llA(long j8) {
        this.color.setValue(d0.a(j8));
    }

    public final void setEndTrim(float f14) {
        this.endTrim.setValue(Float.valueOf(f14));
    }

    public final void setRotation(float f14) {
        this.rotation.setValue(Float.valueOf(f14));
    }

    public final void setStartTrim(float f14) {
        this.startTrim.setValue(Float.valueOf(f14));
    }

    /* JADX INFO: renamed from: setStrokeWidth-0680j_4, reason: not valid java name */
    public final void m73setStrokeWidth0680j_4(float f14) {
        this.strokeWidth.setValue(f.a(f14));
    }
}
