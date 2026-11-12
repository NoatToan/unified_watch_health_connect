package s5;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o4.q1;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B©\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010$Bµ\u0001\b\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b!\u0010%BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010&BË\u0001\b\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010+¨\u0006,"}, d2 = {"Ls5/i0;", "Ls5/c$a;", "Ld6/l;", "textForegroundStyle", "Lg6/q;", TtmlNode.ATTR_TTS_FONT_SIZE, "Lw5/f0;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Lw5/b0;", TtmlNode.ATTR_TTS_FONT_STYLE, "Lw5/c0;", "fontSynthesis", "Lw5/q;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "fontFeatureSettings", "letterSpacing", "Ld6/a;", "baselineShift", "Ld6/m;", "textGeometricTransform", "Lz5/c;", "localeList", "Lo4/d0;", "background", "Ld6/i;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Lo4/q1;", "shadow", "Ls5/b0;", "platformStyle", "Lq4/g;", "drawStyle", "<init>", "(Ld6/l;JLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ls5/b0;Lq4/g;Lkotlin/jvm/internal/j;)V", TtmlNode.ATTR_TTS_COLOR, "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Lkotlin/jvm/internal/j;)V", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ls5/b0;Lkotlin/jvm/internal/j;)V", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ls5/b0;Lq4/g;Lkotlin/jvm/internal/j;)V", "Lo4/w;", "brush", "", "alpha", "(Lo4/w;FJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ls5/b0;Lq4/g;Lkotlin/jvm/internal/j;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6.l f157211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    public final long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    public final w5.f0 fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from toString */
    public final w5.b0 fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from toString */
    public final w5.c0 fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from toString */
    public final w5.q fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from toString */
    public final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from toString */
    public final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from toString */
    public final d6.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from toString */
    public final d6.m textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from toString */
    public final z5.c localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f157222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from toString */
    public final d6.i background;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from toString */
    public final q1 shadow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from toString */
    public final b0 platformStyle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from toString */
    public final q4.g drawStyle;

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        long j17;
        long j18;
        long j19;
        long j24;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j17 = o4.d0.f128832k;
        } else {
            j17 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var3 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j24 = o4.d0.f128832k;
        } else {
            j24 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j25 = j17;
        q1 q1Var2 = (i14 & 8192) != 0 ? null : q1Var;
        b0 b0Var4 = (i14 & 16384) != 0 ? null : b0Var2;
        long j26 = j18;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var5 = b0Var3;
        w5.c0 c0Var3 = c0Var2;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j27 = j19;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j28 = j24;
        this(j25, j26, f0Var3, b0Var5, c0Var3, qVar3, str3, j27, aVar3, mVar3, cVar3, j28, iVar3, q1Var2, b0Var4, (i14 & 32768) != 0 ? null : gVar, (p005kotlin.jvm.internal.j) null);
    }

    public static i0 a(i0 i0Var, long j8, int i14) {
        long jB = (i14 & 1) != 0 ? i0Var.f157211a.b() : j8;
        long j14 = i0Var.fontSize;
        w5.f0 f0Var = i0Var.fontWeight;
        w5.b0 b0Var = i0Var.fontStyle;
        w5.c0 c0Var = i0Var.fontSynthesis;
        w5.q qVar = (i14 & 32) != 0 ? i0Var.fontFamily : null;
        String str = i0Var.fontFeatureSettings;
        long j15 = i0Var.letterSpacing;
        d6.a aVar = i0Var.baselineShift;
        d6.m mVar = i0Var.textGeometricTransform;
        z5.c cVar = i0Var.localeList;
        long j16 = i0Var.f157222l;
        d6.i iVar = i0Var.background;
        q1 q1Var = i0Var.shadow;
        b0 b0Var2 = i0Var.platformStyle;
        q4.g gVar = i0Var.drawStyle;
        d6.l lVarB = i0Var.f157211a;
        if (!o4.d0.d(jB, lVarB.b())) {
            d6.l.f57772a.getClass();
            lVarB = d6.l.a.b(jB);
        }
        return new i0(lVarB, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, b0Var2, gVar, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean b(i0 i0Var) {
        if (this == i0Var) {
            return true;
        }
        return g6.q.b(this.fontSize, i0Var.fontSize) && p005kotlin.jvm.internal.s.g(this.fontWeight, i0Var.fontWeight) && p005kotlin.jvm.internal.s.g(this.fontStyle, i0Var.fontStyle) && p005kotlin.jvm.internal.s.g(this.fontSynthesis, i0Var.fontSynthesis) && p005kotlin.jvm.internal.s.g(this.fontFamily, i0Var.fontFamily) && p005kotlin.jvm.internal.s.g(this.fontFeatureSettings, i0Var.fontFeatureSettings) && g6.q.b(this.letterSpacing, i0Var.letterSpacing) && p005kotlin.jvm.internal.s.g(this.baselineShift, i0Var.baselineShift) && p005kotlin.jvm.internal.s.g(this.textGeometricTransform, i0Var.textGeometricTransform) && p005kotlin.jvm.internal.s.g(this.localeList, i0Var.localeList) && o4.d0.d(this.f157222l, i0Var.f157222l) && p005kotlin.jvm.internal.s.g(this.platformStyle, i0Var.platformStyle);
    }

    public final boolean c(i0 i0Var) {
        return p005kotlin.jvm.internal.s.g(this.f157211a, i0Var.f157211a) && p005kotlin.jvm.internal.s.g(this.background, i0Var.background) && p005kotlin.jvm.internal.s.g(this.shadow, i0Var.shadow) && p005kotlin.jvm.internal.s.g(this.drawStyle, i0Var.drawStyle);
    }

    public final i0 d(i0 i0Var) {
        if (i0Var == null) {
            return this;
        }
        d6.l lVar = i0Var.f157211a;
        return j0.a(this, lVar.b(), lVar.e(), lVar.a(), i0Var.fontSize, i0Var.fontWeight, i0Var.fontStyle, i0Var.fontSynthesis, i0Var.fontFamily, i0Var.fontFeatureSettings, i0Var.letterSpacing, i0Var.baselineShift, i0Var.textGeometricTransform, i0Var.localeList, i0Var.f157222l, i0Var.background, i0Var.shadow, i0Var.platformStyle, i0Var.drawStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return b(i0Var) && c(i0Var);
    }

    public final int hashCode() {
        d6.l lVar = this.f157211a;
        long jB = lVar.b();
        o4.d0.a aVar = o4.d0.f128823b;
        o13.z.a aVar2 = o13.z.f128618b;
        int iHashCode = Long.hashCode(jB) * 31;
        o4.w wVarE = lVar.e();
        int iHashCode2 = (Float.hashCode(lVar.a()) + ((iHashCode + (wVarE != null ? wVarE.hashCode() : 0)) * 31)) * 31;
        g6.q.a aVar3 = g6.q.f76018b;
        int iE = q6.f.e(iHashCode2, 31, this.fontSize);
        w5.f0 f0Var = this.fontWeight;
        int i14 = (iE + (f0Var != null ? f0Var.f182107a : 0)) * 31;
        w5.b0 b0Var = this.fontStyle;
        int iHashCode3 = (i14 + (b0Var != null ? Integer.hashCode(b0Var.f182072a) : 0)) * 31;
        w5.c0 c0Var = this.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (c0Var != null ? Integer.hashCode(c0Var.f182079a) : 0)) * 31;
        w5.q qVar = this.fontFamily;
        int iHashCode5 = (iHashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iE2 = q6.f.e((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.letterSpacing);
        d6.a aVar4 = this.baselineShift;
        int iHashCode6 = (iE2 + (aVar4 != null ? Float.hashCode(aVar4.f57704a) : 0)) * 31;
        d6.m mVar = this.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        z5.c cVar = this.localeList;
        int iE3 = q6.f.e((iHashCode7 + (cVar != null ? cVar.f202443a.hashCode() : 0)) * 31, 31, this.f157222l);
        d6.i iVar = this.background;
        int i15 = (iE3 + (iVar != null ? iVar.f57764a : 0)) * 31;
        q1 q1Var = this.shadow;
        int iHashCode8 = (i15 + (q1Var != null ? q1Var.hashCode() : 0)) * 31;
        b0 b0Var2 = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31;
        q4.g gVar = this.drawStyle;
        return iHashCode9 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SpanStyle(color=");
        d6.l lVar = this.f157211a;
        sb3.append((Object) o4.d0.j(lVar.b()));
        sb3.append(", brush=");
        sb3.append(lVar.e());
        sb3.append(", alpha=");
        sb3.append(lVar.a());
        sb3.append(", fontSize=");
        sb3.append((Object) g6.q.f(this.fontSize));
        sb3.append(", fontWeight=");
        sb3.append(this.fontWeight);
        sb3.append(", fontStyle=");
        sb3.append(this.fontStyle);
        sb3.append(", fontSynthesis=");
        sb3.append(this.fontSynthesis);
        sb3.append(", fontFamily=");
        sb3.append(this.fontFamily);
        sb3.append(", fontFeatureSettings=");
        sb3.append(this.fontFeatureSettings);
        sb3.append(", letterSpacing=");
        sb3.append((Object) g6.q.f(this.letterSpacing));
        sb3.append(", baselineShift=");
        sb3.append(this.baselineShift);
        sb3.append(", textGeometricTransform=");
        sb3.append(this.textGeometricTransform);
        sb3.append(", localeList=");
        sb3.append(this.localeList);
        sb3.append(", background=");
        q2.m(this.f157222l, ", textDecoration=", sb3);
        sb3.append(this.background);
        sb3.append(", shadow=");
        sb3.append(this.shadow);
        sb3.append(", platformStyle=");
        sb3.append(this.platformStyle);
        sb3.append(", drawStyle=");
        sb3.append(this.drawStyle);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @o13.e
    public /* synthetic */ i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, b0Var2);
    }

    public /* synthetic */ i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, b0Var2, gVar);
    }

    public /* synthetic */ i0(d6.l lVar, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(lVar, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, b0Var2, gVar);
    }

    public /* synthetic */ i0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, p005kotlin.jvm.internal.j jVar) {
        this(wVar, f14, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, b0Var2, gVar);
    }

    private i0(d6.l lVar, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar) {
        this.f157211a = lVar;
        this.fontSize = j8;
        this.fontWeight = f0Var;
        this.fontStyle = b0Var;
        this.fontSynthesis = c0Var;
        this.fontFamily = qVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j14;
        this.baselineShift = aVar;
        this.textGeometricTransform = mVar;
        this.localeList = cVar;
        this.f157222l = j15;
        this.background = iVar;
        this.shadow = q1Var;
        this.platformStyle = b0Var2;
        this.drawStyle = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(d6.l lVar, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        long j16;
        long j17;
        long j18;
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j16 = g6.q.f76020d;
        } else {
            j16 = j8;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var3 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j17 = g6.q.f76020d;
        } else {
            j17 = j14;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j15;
        }
        this(lVar, j16, f0Var2, b0Var3, c0Var2, qVar2, str2, j17, aVar2, mVar2, cVar2, j18, (i14 & 4096) != 0 ? null : iVar, (i14 & 8192) != 0 ? null : q1Var, (i14 & 16384) != 0 ? null : b0Var2, (i14 & 32768) != 0 ? null : gVar, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        long j17;
        long j18;
        long j19;
        long j24;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j17 = o4.d0.f128832k;
        } else {
            j17 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j24 = o4.d0.f128832k;
        } else {
            j24 = j16;
        }
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var3 = c0Var2;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j25 = j19;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j26 = j24;
        this(j17, j18, f0Var2, b0Var3, c0Var3, qVar3, str3, j25, aVar3, mVar3, cVar3, j26, (i14 & 4096) != 0 ? null : iVar, (i14 & 8192) != 0 ? null : q1Var, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var) {
        this(d6.l.a.b(j8), j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, (b0) null, (q4.g) null, 32768, (p005kotlin.jvm.internal.j) null);
        d6.l.f57772a.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2, int i14, p005kotlin.jvm.internal.j jVar) {
        long j17;
        long j18;
        long j19;
        long j24;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j17 = o4.d0.f128832k;
        } else {
            j17 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var3 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j24 = o4.d0.f128832k;
        } else {
            j24 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j25 = j17;
        long j26 = j18;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var4 = b0Var3;
        w5.c0 c0Var3 = c0Var2;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j27 = j19;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j28 = j24;
        this(j25, j26, f0Var3, b0Var4, c0Var3, qVar3, str3, j27, aVar3, mVar3, cVar3, j28, iVar3, (i14 & 8192) != 0 ? null : q1Var, (i14 & 16384) != 0 ? null : b0Var2, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2) {
        this(d6.l.a.b(j8), j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, b0Var2, (q4.g) null, 32768, (p005kotlin.jvm.internal.j) null);
        d6.l.f57772a.getClass();
    }

    @o13.e
    public /* synthetic */ i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar) {
        this(d6.l.a.b(j8), j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, b0Var2, gVar, (p005kotlin.jvm.internal.j) null);
        d6.l.f57772a.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        long j16;
        long j17;
        long j18;
        float f15 = (i14 & 2) != 0 ? Float.NaN : f14;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j16 = g6.q.f76020d;
        } else {
            j16 = j8;
        }
        w5.f0 f0Var2 = (i14 & 8) != 0 ? null : f0Var;
        w5.b0 b0Var3 = (i14 & 16) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 32) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 64) != 0 ? null : qVar;
        String str2 = (i14 & 128) != 0 ? null : str;
        if ((i14 & 256) != 0) {
            g6.q.f76018b.getClass();
            j17 = g6.q.f76020d;
        } else {
            j17 = j14;
        }
        d6.a aVar2 = (i14 & 512) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 1024) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 2048) != 0 ? null : cVar;
        if ((i14 & 4096) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j15;
        }
        this(wVar, f15, j16, f0Var2, b0Var3, c0Var2, qVar2, str2, j17, aVar2, mVar2, cVar2, j18, (i14 & 8192) != 0 ? null : iVar, (i14 & 16384) != 0 ? null : q1Var, (32768 & i14) != 0 ? null : b0Var2, (i14 & 65536) != 0 ? null : gVar, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private i0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, b0 b0Var2, q4.g gVar) {
        this(d6.l.a.a(f14, wVar), j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, b0Var2, gVar, (p005kotlin.jvm.internal.j) null);
        d6.l.f57772a.getClass();
    }
}
