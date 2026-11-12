package t5;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.garmin.proto.generated.GDIInReachMessaging;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lt5/b0;", "", "", "charSequence", "", "width", "Landroid/text/TextPaint;", "textPaint", "", "alignment", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "", "includePadding", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "", "leftIndents", "rightIndents", "Lt5/o;", "layoutIntrinsics", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILt5/o;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f162402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f162403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f162405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f162406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5.g f162407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Layout f162408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f162409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f162410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f162411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f162412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f162413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f162414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint.FontMetricsInt f162415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f162416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v5.h[] f162417p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f162418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n f162419r;

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    public b0(CharSequence charSequence, float f14, TextPaint textPaint, int i14, TextUtils.TruncateAt truncateAt, int i15, float f15, float f16, boolean z14, boolean z15, int i16, int i17, int i18, int i19, int i24, int i25, int[] iArr, int[] iArr2, o oVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i26;
        int i27;
        Layout layoutA;
        v5.h[] hVarArr;
        int i28;
        int i29;
        long j8;
        char c14;
        long jA;
        ?? IsFallbackLineSpacingEnabled;
        int topPadding;
        boolean zIsFallbackLineSpacingEnabled;
        long jA2;
        Paint.FontMetricsInt fontMetricsInt;
        v5.h hVar;
        v5.h hVar2;
        int i30;
        int i34;
        this.f162402a = textPaint;
        this.f162403b = truncateAt;
        this.f162404c = z14;
        this.f162405d = z15;
        this.f162418q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = d0.b(i15);
        z.f162484a.getClass();
        Layout.Alignment alignment = i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? Layout.Alignment.ALIGN_NORMAL : z.f162486c : z.f162485b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z16 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, v5.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = oVar.a();
            double d14 = f14;
            int iCeil = (int) Math.ceil(d14);
            if (metricsA == null || oVar.c() > f14 || z16) {
                this.f162414m = false;
                x xVar = x.f162461a;
                int length2 = charSequence.length();
                int iCeil2 = (int) Math.ceil(d14);
                xVar.getClass();
                textDirectionHeuristic = textDirectionHeuristicB;
                i26 = i16;
                i27 = 0;
                layoutA = x.a(charSequence, textPaint, iCeil, length2, textDirectionHeuristic, alignment, i26, truncateAt, iCeil2, f15, f16, i25, z14, z15, i17, i18, i19, i24, iArr, iArr2);
            } else {
                this.f162414m = true;
                d.f162421a.getClass();
                if (iCeil < 0) {
                    y5.a.a("negative width");
                }
                if (iCeil < 0) {
                    y5.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    int i35 = c.f162420a;
                    layoutA = sf0.d.e(charSequence, textPaint, iCeil, alignment, metricsA, z14, truncateAt, iCeil, z15);
                    i34 = 0;
                } else {
                    int i36 = e.f162424a;
                    i34 = 0;
                    layoutA = new BoringLayout(charSequence, textPaint, iCeil, alignment, 1.0f, 0.0f, metricsA, z14, truncateAt, iCeil);
                }
                textDirectionHeuristic = textDirectionHeuristicB;
                i26 = i16;
                i27 = i34;
            }
            this.f162408g = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i26);
            this.f162409h = iMin;
            int i37 = iMin - 1;
            this.f162406e = (iMin >= i26 && (layoutA.getEllipsisCount(i37) > 0 || layoutA.getLineEnd(i37) != charSequence.length())) ? 1 : i27;
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                text.getClass();
                if (p.b((Spanned) text, v5.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    text2.getClass();
                    hVarArr = (v5.h[]) ((Spanned) text2).getSpans(i27, layoutA.getText().length(), v5.h.class);
                } else {
                    hVarArr = null;
                }
            } else {
                hVarArr = null;
            }
            this.f162417p = hVarArr;
            if (hVarArr == null || (hVar2 = (v5.h) p13.u.H(hVarArr)) == null) {
                i28 = i27;
            } else {
                if (hVar2.f175713d) {
                    int i38 = hVar2.f175716g;
                    d6.f.c.f57740b.getClass();
                    if (i38 == d6.f.c.f57742d) {
                        i30 = 1;
                    } else {
                        i30 = i27;
                    }
                } else {
                    i30 = i27;
                }
                i28 = i30;
            }
            if (hVarArr == null || (hVar = (v5.h) p13.u.H(hVarArr)) == null || !hVar.f175714e) {
                i29 = i27;
            } else {
                int i39 = hVar.f175716g;
                d6.f.c.f57740b.getClass();
                if (i39 == d6.f.c.f57742d) {
                    i29 = 1;
                } else {
                    i29 = i27;
                }
            }
            if (i28 == 0 || i29 == 0) {
                long jA3 = d0.f162423b;
                if (z14) {
                    IsFallbackLineSpacingEnabled = zIsFallbackLineSpacingEnabled;
                    j8 = 4294967295L;
                    c14 = ' ';
                } else {
                    if (this.f162414m) {
                        BoringLayout boringLayout = (BoringLayout) layoutA;
                        d.f162421a.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            int i44 = c.f162420a;
                            zIsFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            IsFallbackLineSpacingEnabled = i27;
                        }
                    } else {
                        StaticLayout staticLayout = (StaticLayout) layoutA;
                        x.f162461a.getClass();
                        x.f162462b.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            int i45 = v.f162459a;
                            IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else {
                            IsFallbackLineSpacingEnabled = z15;
                        }
                    }
                    if (IsFallbackLineSpacingEnabled != 0) {
                        IsFallbackLineSpacingEnabled = zIsFallbackLineSpacingEnabled;
                        j8 = 4294967295L;
                        c14 = ' ';
                    } else {
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        j8 = 4294967295L;
                        Rect rectA = r.a(paint, text3, layoutA.getLineStart(i27), layoutA.getLineEnd(i27));
                        int lineAscent = layoutA.getLineAscent(i27);
                        c14 = ' ';
                        int i46 = rectA.top;
                        if (i46 < lineAscent) {
                            IsFallbackLineSpacingEnabled = zIsFallbackLineSpacingEnabled;
                            topPadding = lineAscent - i46;
                        } else {
                            IsFallbackLineSpacingEnabled = zIsFallbackLineSpacingEnabled;
                            topPadding = layoutA.getTopPadding();
                        }
                        rectA = iMin != 1 ? r.a(paint, text3, layoutA.getLineStart(i37), layoutA.getLineEnd(i37)) : rectA;
                        int lineDescent = layoutA.getLineDescent(i37);
                        int i47 = rectA.bottom;
                        int bottomPadding = i47 > lineDescent ? i47 - lineDescent : layoutA.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = d0.a(topPadding, bottomPadding);
                        }
                    }
                }
                jA = d0.a(i28 != 0 ? i27 : (int) (jA3 >> c14), i29 != 0 ? i27 : (int) (jA3 & j8));
            } else {
                jA = d0.f162423b;
                j8 = 4294967295L;
                c14 = ' ';
            }
            if (hVarArr != null) {
                int length3 = hVarArr.length;
                int iMax = i27;
                int iMax2 = iMax;
                for (int i48 = iMax2; i48 < length3; i48++) {
                    v5.h hVar3 = hVarArr[i48];
                    int i49 = hVar3.f175721l;
                    iMax = i49 < 0 ? Math.max(iMax, Math.abs(i49)) : iMax;
                    int i54 = hVar3.f175722m;
                    if (i54 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i54));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? d0.f162423b : d0.a(iMax, iMax2);
            } else {
                jA2 = d0.f162423b;
            }
            this.f162410i = Math.max((int) (jA >> c14), (int) (jA2 >> c14));
            this.f162411j = Math.max((int) (jA & j8), (int) (jA2 & j8));
            TextPaint textPaint2 = this.f162402a;
            v5.h[] hVarArr2 = this.f162417p;
            int i55 = this.f162409h - 1;
            Layout layout = this.f162408g;
            if (layout.getLineStart(i55) != layout.getLineEnd(i55) || hVarArr2 == null || hVarArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                v5.h hVar4 = (v5.h) p13.u.E(hVarArr2);
                spannableString.setSpan(new v5.h(hVar4.f175710a, 0, spannableString.length(), (i55 == 0 || !hVar4.f175714e) ? hVar4.f175714e : i27, hVar4.f175714e, hVar4.f175715f, hVar4.f175716g, null), i27, spannableString.length(), 33);
                x xVar2 = x.f162461a;
                int length4 = spannableString.length();
                boolean z17 = this.f162404c;
                boolean z18 = this.f162405d;
                m.f162437a.getClass();
                Layout.Alignment alignment2 = m.f162438b;
                xVar2.getClass();
                StaticLayout staticLayoutA = x.a(spannableString, textPaint2, Integer.MAX_VALUE, length4, textDirectionHeuristic2, alignment2, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 1.0f, 0.0f, 0, z17, z18, 0, 0, 0, 0, null, null);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i27);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i27);
                fontMetricsInt.top = staticLayoutA.getLineTop(i27);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i27);
            }
            this.f162416o = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i37) - g(i37))) : i27;
            this.f162415n = fontMetricsInt;
            Layout layout2 = this.f162408g;
            this.f162412k = v5.d.a(layout2, i37, layout2.getPaint());
            Layout layout3 = this.f162408g;
            this.f162413l = v5.d.b(layout3, i37, layout3.getPaint());
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final int a() {
        boolean z14 = this.f162406e;
        Layout layout = this.f162408g;
        return (z14 ? layout.getLineBottom(this.f162409h - 1) : layout.getHeight()) + this.f162410i + this.f162411j + this.f162416o;
    }

    public final float b(int i14) {
        if (i14 == this.f162409h - 1) {
            return this.f162412k + this.f162413l;
        }
        return 0.0f;
    }

    public final n c() {
        n nVar = this.f162419r;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this.f162408g);
        this.f162419r = nVar2;
        return nVar2;
    }

    public final float d(int i14) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f162410i + ((i14 != this.f162409h + (-1) || (fontMetricsInt = this.f162415n) == null) ? this.f162408g.getLineBaseline(i14) : g(i14) - fontMetricsInt.ascent);
    }

    public final float e(int i14) {
        Paint.FontMetricsInt fontMetricsInt;
        int i15 = this.f162409h;
        int i16 = i15 - 1;
        Layout layout = this.f162408g;
        if (i14 != i16 || (fontMetricsInt = this.f162415n) == null) {
            return this.f162410i + layout.getLineBottom(i14) + (i14 == i15 + (-1) ? this.f162411j : 0);
        }
        return layout.getLineBottom(i14 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i14) {
        ThreadLocal<a0> threadLocal = d0.f162422a;
        Layout layout = this.f162408g;
        return (layout.getEllipsisCount(i14) <= 0 || this.f162403b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i14) : layout.getText().length();
    }

    public final float g(int i14) {
        return this.f162408g.getLineTop(i14) + (i14 == 0 ? 0 : this.f162410i);
    }

    public final float h(int i14, boolean z14) {
        return b(this.f162408g.getLineForOffset(i14)) + c().c(i14, true, z14);
    }

    public final float i(int i14, boolean z14) {
        return b(this.f162408g.getLineForOffset(i14)) + c().c(i14, false, z14);
    }

    public final u5.g j() {
        u5.g gVar = this.f162407f;
        if (gVar != null) {
            return gVar;
        }
        Layout layout = this.f162408g;
        u5.g gVar2 = new u5.g(layout.getText(), 0, layout.getText().length(), this.f162402a.getTextLocale());
        this.f162407f = gVar2;
        return gVar2;
    }

    public /* synthetic */ b0(CharSequence charSequence, float f14, TextPaint textPaint, int i14, TextUtils.TruncateAt truncateAt, int i15, float f15, float f16, boolean z14, boolean z15, int i16, int i17, int i18, int i19, int i24, int i25, int[] iArr, int[] iArr2, o oVar, int i26, p005kotlin.jvm.internal.j jVar) {
        CharSequence charSequence2;
        TextPaint textPaint2;
        o oVar2;
        int i27 = (i26 & 8) != 0 ? 0 : i14;
        TextUtils.TruncateAt truncateAt2 = (i26 & 16) != 0 ? null : truncateAt;
        int i28 = (i26 & 32) != 0 ? 2 : i15;
        float f17 = (i26 & 64) != 0 ? 1.0f : f15;
        float f18 = (i26 & 128) != 0 ? 0.0f : f16;
        boolean z16 = (i26 & 256) != 0 ? false : z14;
        boolean z17 = (i26 & 512) != 0 ? true : z15;
        int i29 = (i26 & 1024) != 0 ? Integer.MAX_VALUE : i16;
        int i30 = (i26 & 2048) != 0 ? 0 : i17;
        int i34 = (i26 & 4096) != 0 ? 0 : i18;
        int i35 = (i26 & 8192) != 0 ? 0 : i19;
        int i36 = (i26 & 16384) != 0 ? 0 : i24;
        int i37 = (32768 & i26) != 0 ? 0 : i25;
        int[] iArr3 = (65536 & i26) != 0 ? null : iArr;
        int[] iArr4 = (131072 & i26) != 0 ? null : iArr2;
        if ((i26 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            oVar2 = new o(charSequence2, textPaint2, i28);
        } else {
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            oVar2 = oVar;
        }
        this(charSequence2, f14, textPaint2, i27, truncateAt2, i28, f17, f18, z16, z17, i29, i30, i34, i35, i36, i37, iArr3, iArr4, oVar2);
    }
}
