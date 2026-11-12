package a6;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import o4.d0;
import o4.p1;
import o4.q1;
import o4.t1;
import p005kotlin.Metadata;
import p3.x3;
import s5.a0;
import s5.c0;
import s5.i0;
import s5.u;
import s5.w;
import s5.x0;
import s5.y;
import s5.z;
import w5.b0;
import w5.f0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La6/d;", "Ls5/u;", "", "text", "Ls5/x0;", TtmlNode.TAG_STYLE, "", "Ls5/c$d;", "Ls5/c$a;", "annotations", "Ls5/y;", "placeholders", "Lw5/q$b;", "fontFamilyResolver", "Lg6/c;", "density", "<init>", "(Ljava/lang/String;Ls5/x0;Ljava/util/List;Ljava/util/List;Lw5/q$b;Lg6/c;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f1486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<s5.c.d<? extends s5.c.a>> f1487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<s5.c.d<y>> f1488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w5.q.b f1489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g6.c f1490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f1491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f1492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t5.o f1493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f1494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1495k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1496l;

    /* JADX WARN: Code duplicated, block: B:135:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:186:0x03df  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:192:0x0403  */
    /* JADX WARN: Code duplicated, block: B:193:0x0410  */
    /* JADX WARN: Code duplicated, block: B:196:0x0416  */
    /* JADX WARN: Code duplicated, block: B:199:0x041d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0420  */
    /* JADX WARN: Code duplicated, block: B:206:0x043d  */
    /* JADX WARN: Code duplicated, block: B:207:0x043f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0443  */
    /* JADX WARN: Code duplicated, block: B:212:0x0456  */
    /* JADX WARN: Code duplicated, block: B:215:0x045d  */
    /* JADX WARN: Code duplicated, block: B:217:0x0463  */
    /* JADX WARN: Code duplicated, block: B:222:0x0479  */
    /* JADX WARN: Code duplicated, block: B:223:0x047c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0482  */
    /* JADX WARN: Code duplicated, block: B:227:0x0485  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:233:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:240:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:241:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:246:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:247:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:249:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:250:0x0504  */
    /* JADX WARN: Code duplicated, block: B:253:0x0510  */
    /* JADX WARN: Code duplicated, block: B:254:0x0515  */
    /* JADX WARN: Code duplicated, block: B:256:0x051d  */
    /* JADX WARN: Code duplicated, block: B:257:0x0523  */
    /* JADX WARN: Code duplicated, block: B:259:0x0543  */
    /* JADX WARN: Code duplicated, block: B:262:0x0557  */
    /* JADX WARN: Code duplicated, block: B:264:0x0563  */
    /* JADX WARN: Code duplicated, block: B:266:0x056a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0575  */
    /* JADX WARN: Code duplicated, block: B:274:0x0579  */
    /* JADX WARN: Code duplicated, block: B:276:0x057f  */
    /* JADX WARN: Code duplicated, block: B:280:0x058b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0596  */
    /* JADX WARN: Code duplicated, block: B:288:0x059a  */
    /* JADX WARN: Code duplicated, block: B:292:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:295:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:297:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:300:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:302:0x0618  */
    /* JADX WARN: Code duplicated, block: B:304:0x0627 A[LOOP:9: B:303:0x0625->B:304:0x0627, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0641  */
    /* JADX WARN: Code duplicated, block: B:309:0x0646  */
    /* JADX WARN: Code duplicated, block: B:311:0x064d  */
    /* JADX WARN: Code duplicated, block: B:313:0x0651  */
    /* JADX WARN: Code duplicated, block: B:314:0x0656  */
    /* JADX WARN: Code duplicated, block: B:316:0x065f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0673  */
    /* JADX WARN: Code duplicated, block: B:327:0x0691  */
    /* JADX WARN: Code duplicated, block: B:332:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:334:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:336:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:341:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:385:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:387:0x0803  */
    /* JADX WARN: Code duplicated, block: B:389:0x0811  */
    /* JADX WARN: Code duplicated, block: B:391:0x0817  */
    /* JADX WARN: Code duplicated, block: B:396:0x0825  */
    /* JADX WARN: Code duplicated, block: B:409:0x086f  */
    /* JADX WARN: Code duplicated, block: B:411:0x0882  */
    /* JADX WARN: Code duplicated, block: B:412:0x0887  */
    /* JADX WARN: Code duplicated, block: B:414:0x088f  */
    /* JADX WARN: Code duplicated, block: B:415:0x0896  */
    /* JADX WARN: Code duplicated, block: B:417:0x089b  */
    /* JADX WARN: Code duplicated, block: B:420:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:422:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:423:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:425:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:427:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:435:0x0902  */
    /* JADX WARN: Code duplicated, block: B:437:0x091c A[LOOP:8: B:436:0x091a->B:437:0x091c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:440:0x094a  */
    /* JADX WARN: Code duplicated, block: B:442:0x094e  */
    /* JADX WARN: Code duplicated, block: B:444:0x0952  */
    /* JADX WARN: Code duplicated, block: B:445:0x0955  */
    /* JADX WARN: Code duplicated, block: B:447:0x0959  */
    /* JADX WARN: Code duplicated, block: B:448:0x095c  */
    /* JADX WARN: Code duplicated, block: B:450:0x0960  */
    /* JADX WARN: Code duplicated, block: B:451:0x0963  */
    /* JADX WARN: Code duplicated, block: B:453:0x0967  */
    /* JADX WARN: Code duplicated, block: B:455:0x096b  */
    /* JADX WARN: Code duplicated, block: B:457:0x096f  */
    /* JADX WARN: Code duplicated, block: B:458:0x0971  */
    /* JADX WARN: Code duplicated, block: B:460:0x0975  */
    /* JADX WARN: Code duplicated, block: B:467:0x099c  */
    /* JADX WARN: Code duplicated, block: B:479:0x0582 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x08f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x0686 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:435:0x0902, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, x0 x0Var, List<? extends s5.c.d<? extends s5.c.a>> list, List<s5.c.d<y>> list2, w5.q.b bVar, g6.c cVar) {
        boolean zBooleanValue;
        Locale locale;
        int i14;
        Object obj;
        boolean z14;
        f0 f0Var;
        f0 f0Var2;
        int i15;
        int i16;
        boolean z15;
        i0 i0Var;
        CharSequence charSequenceH;
        Spannable spannableString;
        w wVar;
        d6.i iVar;
        c0 c0Var;
        boolean z16;
        d6.f fVar;
        float fB;
        int length;
        int i17;
        boolean z17;
        boolean z18;
        int i18;
        d6.n nVar;
        w wVar2;
        ArrayList arrayList;
        int size;
        int i19;
        i0 i0Var2;
        w5.q qVar;
        boolean z19;
        i0 i0Var3;
        aa2.f fVar2;
        int size2;
        int i24;
        int[] iArr;
        int size3;
        int i25;
        int i26;
        int i27;
        int i28;
        int size4;
        int i29;
        ArrayList arrayList2;
        int i30;
        int i34;
        int size5;
        boolean z24;
        int i35;
        boolean z25;
        Spannable spannable;
        g6.c cVar2;
        d6.n nVar2;
        float f14;
        int size6;
        int i36;
        int size7;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        T t7;
        s5.h hVar;
        float fA;
        long j8;
        long jC;
        float fD;
        int size8;
        int i46;
        s5.c.d<? extends s5.c.a> dVar;
        s5.c.a aVar;
        int i47;
        int i48;
        Object eVar;
        s5.c.d<? extends s5.c.a> dVar2;
        T t14;
        boolean z26;
        Spannable spannable2;
        int i49;
        int i54;
        int i55;
        s5.c.d<? extends s5.c.a> dVar3;
        T t15;
        i0 i0Var4;
        boolean z27;
        int i56;
        long j14;
        long j15;
        long jC2;
        long j16;
        float fD2;
        long jC3;
        float fD3;
        a0 a0Var;
        a0 a0Var2;
        this.f1485a = str;
        this.f1486b = x0Var;
        this.f1487c = list;
        this.f1488d = list2;
        this.f1489e = bVar;
        this.f1490f = cVar;
        h hVar2 = new h(1, cVar.getF75991a());
        this.f1491g = hVar2;
        boolean zA = e.a(x0Var);
        i0 i0Var5 = x0Var.f157322a;
        w wVar3 = x0Var.f157323b;
        int i57 = 0;
        if (zA) {
            o.f1517a.getClass();
            m mVar = o.f1518b;
            x3<Boolean> x3VarA = mVar.f1513a;
            if (x3VarA == null) {
                if (androidx.emoji2.text.d.e()) {
                    x3VarA = mVar.a();
                    mVar.f1513a = x3VarA;
                } else {
                    x3VarA = p.f1519a;
                }
            }
            zBooleanValue = x3VarA.getF182175a().booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.f1495k = zBooleanValue;
        int i58 = wVar3.f157307b;
        z5.c cVar3 = i0Var5.localeList;
        d6.j.f57765b.getClass();
        if (i58 == d6.j.f57769f) {
            i14 = 2;
        } else if (i58 == d6.j.f57770g) {
            i14 = 3;
        } else if (i58 == d6.j.f57766c) {
            i14 = 0;
        } else if (i58 == d6.j.f57767d) {
            i14 = 1;
        } else {
            if (i58 != d6.j.f57768e && i58 != 0) {
                vb.h.z("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((cVar3 == null || (locale = cVar3.f202443a.get(0).f202440a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i14 = 2;
            } else {
                i14 = 3;
            }
        }
        this.f1496l = i14;
        c cVar4 = new c(this, i57);
        d6.o oVar = wVar3.f157314i;
        if (oVar == null) {
            d6.o.f57783c.getClass();
            oVar = d6.o.f57784d;
        }
        hVar2.setFlags(oVar.f57787b ? hVar2.getFlags() | 128 : hVar2.getFlags() & (-129));
        int i59 = oVar.f57786a;
        d6.o.b.f57788b.getClass();
        if (i59 == d6.o.b.f57789c) {
            hVar2.setFlags(hVar2.getFlags() | 64);
            hVar2.setHinting(0);
        } else if (i59 == d6.o.b.f57790d) {
            hVar2.getFlags();
            hVar2.setHinting(1);
        } else if (i59 == d6.o.b.f57791e) {
            hVar2.getFlags();
            hVar2.setHinting(0);
        } else {
            hVar2.getFlags();
        }
        int size9 = list.size();
        int i64 = 0;
        while (true) {
            if (i64 >= size9) {
                obj = null;
                break;
            }
            obj = list.get(i64);
            if (((s5.c.d) obj).f157149a instanceof i0) {
                break;
            } else {
                i64++;
            }
        }
        boolean z28 = obj != null;
        long j17 = i0Var5.fontSize;
        f0 f0Var3 = i0Var5.fontWeight;
        b0 b0Var = i0Var5.fontStyle;
        String str2 = i0Var5.fontFeatureSettings;
        z5.c cVar5 = i0Var5.localeList;
        d6.l lVar = i0Var5.f157211a;
        d6.m mVar2 = i0Var5.textGeometricTransform;
        long j18 = i0Var5.letterSpacing;
        long jC4 = g6.q.c(j17);
        g6.r.f76022b.getClass();
        if (g6.r.b(jC4, g6.r.f76023c)) {
            hVar2.setTextSize(cVar.g0(j17));
            z14 = z28;
            f0Var = f0Var3;
        } else {
            z14 = z28;
            f0Var = f0Var3;
            if (g6.r.b(jC4, g6.r.f76024d)) {
                hVar2.setTextSize(g6.q.d(j17) * hVar2.getTextSize());
            }
        }
        w5.q qVar2 = i0Var5.fontFamily;
        if (qVar2 != null || b0Var != null || f0Var != null) {
            if (f0Var == null) {
                f0.f182097b.getClass();
                f0Var2 = f0.f182102g;
            } else {
                f0Var2 = f0Var;
            }
            if (b0Var != null) {
                i15 = b0Var.f182072a;
            } else {
                b0.f182070b.getClass();
                i15 = 0;
            }
            b0 b0VarA = b0.a(i15);
            w5.c0 c0Var2 = i0Var5.fontSynthesis;
            if (c0Var2 != null) {
                i16 = c0Var2.f182079a;
            } else {
                w5.c0.f182075b.getClass();
                i16 = w5.c0.f182078e;
            }
            hVar2.setTypeface((Typeface) cVar4.invoke(qVar2, f0Var2, b0VarA, w5.c0.a(i16)));
        }
        if (cVar5 != null) {
            z5.c.f202441c.getClass();
            if (!cVar5.equals(z5.d.f202445a.a())) {
                b6.a.f16162a.getClass();
                ArrayList arrayList3 = new ArrayList(p13.y.r(cVar5, 10));
                Iterator<z5.b> it = cVar5.f202443a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().f202440a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                hVar2.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            hVar2.setFontFeatureSettings(str2);
        }
        if (mVar2 != null) {
            d6.m.f57775c.getClass();
            if (!mVar2.equals(d6.m.f57776d)) {
                hVar2.setTextScaleX(hVar2.getTextScaleX() * mVar2.f57777a);
                hVar2.setTextSkewX(hVar2.getTextSkewX() + mVar2.f57778b);
            }
        }
        hVar2.d(lVar.getF57707b());
        o4.w wVarE = lVar.e();
        n4.g.f123559b.getClass();
        hVar2.c(wVarE, n4.g.f123560c, lVar.getF57706c());
        hVar2.f(i0Var5.shadow);
        hVar2.g(i0Var5.background);
        hVar2.e(i0Var5.drawStyle);
        long jC5 = g6.q.c(j18);
        g6.r.f76022b.getClass();
        long j19 = g6.r.f76023c;
        if (g6.r.b(jC5, j19) && g6.q.d(j18) != 0.0f) {
            float textScaleX = hVar2.getTextScaleX() * hVar2.getTextSize();
            float fG0 = cVar.g0(j18);
            if (textScaleX != 0.0f) {
                hVar2.setLetterSpacing(fG0 / textScaleX);
            }
        } else if (g6.r.b(g6.q.c(j18), g6.r.f76024d)) {
            hVar2.setLetterSpacing(g6.q.d(j18));
        }
        long j24 = i0Var5.f157222l;
        d6.a aVar2 = i0Var5.baselineShift;
        boolean z29 = z14 && g6.r.b(g6.q.c(j18), j19) && g6.q.d(j18) != 0.0f;
        d0.f128823b.getClass();
        long j25 = d0.f128832k;
        boolean z34 = (d0.d(j24, j25) || d0.d(j24, d0.f128831j)) ? false : true;
        if (aVar2 != null) {
            d6.a.f57703b.getClass();
            if (Float.compare(aVar2.f57704a, 0.0f) == 0) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        if (z29 || z34 || z15) {
            if (!z29) {
                g6.q.f76018b.getClass();
                j18 = g6.q.f76020d;
            }
            i0Var = new i0(0L, 0L, (f0) null, (b0) null, (w5.c0) null, (w5.q) null, (String) null, j18, z15 ? aVar2 : null, (d6.m) null, (z5.c) null, z34 ? j24 : j25, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 63103, (p005kotlin.jvm.internal.j) null);
        } else {
            i0Var = null;
        }
        List<s5.c.d<? extends s5.c.a>> list3 = this.f1487c;
        if (i0Var != null) {
            int size10 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size10);
            int i65 = 0;
            while (i65 < size10) {
                arrayList4.add(i65 == 0 ? new s5.c.d<>(i0Var, 0, this.f1485a.length()) : this.f1487c.get(i65 - 1));
                i65++;
            }
            list3 = arrayList4;
        }
        String str3 = this.f1485a;
        float textSize = this.f1491g.getTextSize();
        x0 x0Var2 = this.f1486b;
        List<s5.c.d<y>> list4 = this.f1488d;
        g6.c cVar6 = this.f1490f;
        boolean z35 = this.f1495k;
        b.a aVar3 = b.f1482a;
        if (z35 && androidx.emoji2.text.d.e()) {
            c0 c0Var3 = x0Var2.platformStyle;
            s5.l lVarA = (c0Var3 == null || (a0Var2 = c0Var3.f157154b) == null) ? null : s5.l.a(a0Var2.f157126b);
            s5.l.f157234b.getClass();
            charSequenceH = androidx.emoji2.text.d.a().h(0, str3.length(), (lVarA != null && lVarA.f157237a == s5.l.f157236d) ? 1 : 0, str3);
            charSequenceH.getClass();
        } else {
            charSequenceH = str3;
        }
        if (list3.isEmpty() && list4.isEmpty()) {
            d6.n nVar3 = x0Var2.f157323b.f157309d;
            d6.n.f57779c.getClass();
            if (p005kotlin.jvm.internal.s.g(nVar3, d6.n.f57780d)) {
                long j26 = x0Var2.f157323b.f157308c;
                g6.q.a aVar4 = g6.q.f76018b;
                if ((j26 & 1095216660480L) != 0) {
                    if (charSequenceH instanceof Spannable) {
                        spannableString = (Spannable) charSequenceH;
                    } else {
                        spannableString = new SpannableString(charSequenceH);
                    }
                    i0 i0Var6 = x0Var2.f157322a;
                    wVar = x0Var2.f157323b;
                    iVar = i0Var6.background;
                    d6.i.f57760b.getClass();
                    if (p005kotlin.jvm.internal.s.g(iVar, d6.i.f57762d)) {
                        spannableString.setSpan(b.f1482a, 0, str3.length(), 33);
                    }
                    c0Var = x0Var2.platformStyle;
                    if (c0Var != null) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        fVar = wVar.f157311f;
                        if (fVar == null) {
                            d6.f.f57730d.getClass();
                            fVar = d6.f.f57731e;
                        }
                        fB = b6.c.b(wVar.f157308c, textSize, cVar6);
                        if (Float.isNaN(fB)) {
                            i18 = 0;
                        } else {
                            if (spannableString.length() == 0) {
                                length = spannableString.length() + 1;
                            } else {
                                length = spannableString.length();
                            }
                            int i66 = length;
                            i17 = fVar.f57733b;
                            if ((i17 & 1) > 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i17 & 16) > 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            i18 = 0;
                            spannableString.setSpan(new v5.h(fB, 0, i66, z17, z18, fVar.f57732a, fVar.f57734c, null), 0, spannableString.length(), 33);
                        }
                    } else {
                        fVar = wVar.f157311f;
                        if (fVar == null) {
                            d6.f.f57730d.getClass();
                            fVar = d6.f.f57731e;
                        }
                        fB = b6.c.b(wVar.f157308c, textSize, cVar6);
                        if (Float.isNaN(fB)) {
                            if (spannableString.length() == 0) {
                                length = spannableString.length() + 1;
                            } else {
                                length = spannableString.length();
                            }
                            int i67 = length;
                            i17 = fVar.f57733b;
                            if ((i17 & 1) > 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if ((i17 & 16) > 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            i18 = 0;
                            spannableString.setSpan(new v5.h(fB, 0, i67, z17, z18, fVar.f57732a, fVar.f57734c, null), 0, spannableString.length(), 33);
                        } else {
                            i18 = 0;
                        }
                    }
                    nVar = wVar.f157309d;
                    if (nVar != null) {
                        i56 = i18;
                        j14 = nVar.f57781a;
                        j15 = nVar.f57782b;
                        if (!g6.q.b(j14, o53.f0.B(i56))) {
                        }
                        if ((j14 & 1095216660480L) == r13) {
                            wVar2 = wVar;
                        } else {
                            jC2 = g6.q.c(j14);
                            g6.r.f76022b.getClass();
                            wVar2 = wVar;
                            j16 = g6.r.f76023c;
                            if (g6.r.b(jC2, j16)) {
                                fD2 = cVar6.g0(j14);
                            } else if (g6.r.b(jC2, g6.r.f76024d)) {
                                fD2 = g6.q.d(j14) * textSize;
                            } else {
                                fD2 = 0.0f;
                            }
                            jC3 = g6.q.c(j15);
                            if (g6.r.b(jC3, j16)) {
                                fD3 = cVar6.g0(j15);
                            } else if (g6.r.b(jC3, g6.r.f76024d)) {
                                fD3 = g6.q.d(j15) * textSize;
                            } else {
                                fD3 = 0.0f;
                            }
                            spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fD2), (int) Math.ceil(fD3)), 0, spannableString.length(), 33);
                        }
                        arrayList = new ArrayList(list3.size());
                        size = list3.size();
                        for (i19 = 0; i19 < size; i19++) {
                            dVar3 = list3.get(i19);
                            t15 = dVar3.f157149a;
                            if (t15 instanceof i0) {
                                i0Var4 = (i0) t15;
                                if (i0Var4.fontFamily != null) {
                                    z27 = true;
                                } else {
                                    z27 = true;
                                }
                                if (z27) {
                                    arrayList.add(dVar3);
                                } else {
                                    arrayList.add(dVar3);
                                }
                            }
                        }
                        i0Var2 = x0Var2.f157322a;
                        qVar = i0Var2.fontFamily;
                        if (qVar != null) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z19) {
                            i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                        } else {
                            i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                        }
                        fVar2 = new aa2.f(8, spannableString, cVar4);
                        if (arrayList.size() <= 1) {
                            size2 = arrayList.size();
                            i24 = size2 * 2;
                            iArr = new int[i24];
                            size3 = arrayList.size();
                            for (i25 = 0; i25 < size3; i25++) {
                                s5.c.d dVar4 = (s5.c.d) arrayList.get(i25);
                                iArr[i25] = dVar4.f157150b;
                                iArr[i25 + size2] = dVar4.f157151c;
                            }
                            if (i24 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i24 != 0) {
                                n23.j.s("Array is empty.");
                                throw null;
                            }
                            i26 = iArr[0];
                            i27 = 0;
                            while (i27 < i24) {
                                i28 = iArr[i27];
                                if (i28 == i26) {
                                    arrayList2 = arrayList;
                                } else {
                                    size4 = arrayList.size();
                                    i29 = 0;
                                    while (i29 < size4) {
                                        ArrayList arrayList5 = arrayList;
                                        s5.c.d dVar5 = (s5.c.d) arrayList.get(i29);
                                        int i68 = size4;
                                        i30 = dVar5.f157150b;
                                        int i69 = i29;
                                        i34 = dVar5.f157151c;
                                        if (i30 == i34) {
                                        }
                                        i29 = i69 + 1;
                                        size4 = i68;
                                        arrayList = arrayList5;
                                    }
                                    arrayList2 = arrayList;
                                    if (i0Var3 != null) {
                                        fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                                    }
                                    i26 = i28;
                                }
                                i27++;
                                i0Var3 = i0Var3;
                                arrayList = arrayList2;
                            }
                        } else if (!arrayList.isEmpty()) {
                            i0 i0Var7 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                            fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var7) : i0Var7, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                        }
                        size5 = list3.size();
                        z24 = false;
                        i35 = 0;
                        while (i35 < size5) {
                            dVar2 = list3.get(i35);
                            t14 = dVar2.f157149a;
                            if (t14 instanceof i0) {
                                i49 = dVar2.f157150b;
                                int i74 = dVar2.f157151c;
                                if (i49 >= 0) {
                                    size5 = size5;
                                    z26 = z24;
                                    i35 = i35;
                                    spannable2 = spannableString;
                                    cVar6 = cVar6;
                                } else {
                                    size5 = size5;
                                    z26 = z24;
                                    i35 = i35;
                                    spannable2 = spannableString;
                                    cVar6 = cVar6;
                                }
                            } else {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            }
                            i35++;
                            cVar6 = cVar6;
                            size5 = size5;
                            spannableString = spannable2;
                            z24 = z26;
                        }
                        z25 = z24;
                        spannable = spannableString;
                        cVar2 = cVar6;
                        if (z25) {
                            size8 = list3.size();
                            i46 = 0;
                            while (i46 < size8) {
                                dVar = list3.get(i46);
                                aVar = (s5.c.a) dVar.f157149a;
                                if (aVar instanceof i0) {
                                    i48 = dVar.f157150b;
                                    int i75 = dVar.f157151c;
                                    if (i48 >= 0) {
                                        i47 = i46;
                                    } else {
                                        i47 = i46;
                                    }
                                } else {
                                    i47 = i46;
                                }
                                i46 = i47 + 1;
                            }
                        }
                        nVar2 = wVar2.f157309d;
                        if (nVar2 != null) {
                            j8 = nVar2.f57781a;
                            jC = g6.q.c(j8);
                            g6.r.f76022b.getClass();
                            if (g6.r.b(jC, g6.r.f76023c)) {
                                fD = cVar2.g0(j8);
                            } else if (g6.r.b(jC, g6.r.f76024d)) {
                                fD = g6.q.d(j8) * textSize;
                            } else {
                                fD = 0.0f;
                            }
                            f14 = fD;
                        } else {
                            f14 = 0.0f;
                        }
                        size6 = list3.size();
                        for (i36 = 0; i36 < size6; i36++) {
                            s5.c.d<? extends s5.c.a> dVar6 = list3.get(i36);
                            t7 = dVar6.f157149a;
                            if (t7 instanceof s5.h) {
                                hVar = (s5.h) t7;
                            } else {
                                hVar = null;
                            }
                            if (hVar != null) {
                                fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                                float fA2 = b6.c.a(hVar.f157200c, textSize, cVar2);
                                float fA3 = b6.c.a(hVar.f157201d, textSize, cVar2);
                                if (Float.isNaN(fA)) {
                                }
                            }
                        }
                        size7 = list4.size();
                        i37 = 0;
                        while (i37 < size7) {
                            List<s5.c.d<y>> list5 = list4;
                            s5.c.d<y> dVar7 = list5.get(i37);
                            y yVar = dVar7.f157149a;
                            int i76 = dVar7.f157150b;
                            int i77 = dVar7.f157151c;
                            for (Object obj2 : spannable.getSpans(i76, i77, a8.g.class)) {
                                spannable.removeSpan((a8.g) obj2);
                            }
                            long j27 = yVar.f157325a;
                            long j28 = yVar.f157326b;
                            float fD4 = g6.q.d(j27);
                            int iA = b6.b.a(yVar.f157325a);
                            float fD5 = g6.q.d(j28);
                            int iA2 = b6.b.a(j28);
                            i39 = yVar.f157327c;
                            z.f157329b.getClass();
                            if (i39 == z.f157330c) {
                                i45 = 0;
                            } else if (i39 == z.f157331d) {
                                i45 = 1;
                            } else if (i39 == z.f157332e) {
                                i45 = 2;
                            } else if (i39 == z.f157333f) {
                                i45 = 3;
                            } else {
                                if (i39 == z.f157334g) {
                                    i44 = 4;
                                } else if (i39 == z.f157335h) {
                                    i44 = 5;
                                } else {
                                    if (i39 == z.f157336i) {
                                        vb.h.z("Invalid PlaceholderVerticalAlign");
                                        throw null;
                                    }
                                    i44 = 6;
                                }
                                i45 = i44;
                            }
                            v5.i iVar2 = new v5.i(fD4, iA, fD5, iA2, cVar2, i45);
                            cVar2 = cVar2;
                            spannable.setSpan(iVar2, i76, i77, 33);
                            i37++;
                            list4 = list5;
                        }
                        charSequenceH = spannable;
                    } else {
                        wVar2 = wVar;
                    }
                    arrayList = new ArrayList(list3.size());
                    size = list3.size();
                    while (i19 < size) {
                        dVar3 = list3.get(i19);
                        t15 = dVar3.f157149a;
                        if (t15 instanceof i0) {
                            i0Var4 = (i0) t15;
                            if (i0Var4.fontFamily != null) {
                                z27 = true;
                            } else {
                                z27 = true;
                            }
                            if (z27) {
                                arrayList.add(dVar3);
                            } else {
                                arrayList.add(dVar3);
                            }
                        }
                    }
                    i0Var2 = x0Var2.f157322a;
                    qVar = i0Var2.fontFamily;
                    if (qVar != null) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z19) {
                        i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                    } else {
                        i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                    }
                    fVar2 = new aa2.f(8, spannableString, cVar4);
                    if (arrayList.size() <= 1) {
                        size2 = arrayList.size();
                        i24 = size2 * 2;
                        iArr = new int[i24];
                        size3 = arrayList.size();
                        while (i25 < size3) {
                            s5.c.d dVar8 = (s5.c.d) arrayList.get(i25);
                            iArr[i25] = dVar8.f157150b;
                            iArr[i25 + size2] = dVar8.f157151c;
                        }
                        if (i24 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i24 != 0) {
                            n23.j.s("Array is empty.");
                            throw null;
                        }
                        i26 = iArr[0];
                        i27 = 0;
                        while (i27 < i24) {
                            i28 = iArr[i27];
                            if (i28 == i26) {
                                arrayList2 = arrayList;
                            } else {
                                size4 = arrayList.size();
                                i29 = 0;
                                while (i29 < size4) {
                                    ArrayList arrayList6 = arrayList;
                                    s5.c.d dVar9 = (s5.c.d) arrayList.get(i29);
                                    int i610 = size4;
                                    i30 = dVar9.f157150b;
                                    int i611 = i29;
                                    i34 = dVar9.f157151c;
                                    if (i30 == i34) {
                                    }
                                    i29 = i611 + 1;
                                    size4 = i610;
                                    arrayList = arrayList6;
                                }
                                arrayList2 = arrayList;
                                if (i0Var3 != null) {
                                    fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                                }
                                i26 = i28;
                            }
                            i27++;
                            i0Var3 = i0Var3;
                            arrayList = arrayList2;
                        }
                    } else if (!arrayList.isEmpty()) {
                        i0 i0Var8 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                        fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var8) : i0Var8, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                    }
                    size5 = list3.size();
                    z24 = false;
                    i35 = 0;
                    while (i35 < size5) {
                        dVar2 = list3.get(i35);
                        t14 = dVar2.f157149a;
                        if (t14 instanceof i0) {
                            i49 = dVar2.f157150b;
                            int i78 = dVar2.f157151c;
                            if (i49 >= 0) {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            } else {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            }
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                        i35++;
                        cVar6 = cVar6;
                        size5 = size5;
                        spannableString = spannable2;
                        z24 = z26;
                    }
                    z25 = z24;
                    spannable = spannableString;
                    cVar2 = cVar6;
                    if (z25) {
                        size8 = list3.size();
                        i46 = 0;
                        while (i46 < size8) {
                            dVar = list3.get(i46);
                            aVar = (s5.c.a) dVar.f157149a;
                            if (aVar instanceof i0) {
                                i48 = dVar.f157150b;
                                int i79 = dVar.f157151c;
                                if (i48 >= 0) {
                                    i47 = i46;
                                } else {
                                    i47 = i46;
                                }
                            } else {
                                i47 = i46;
                            }
                            i46 = i47 + 1;
                        }
                    }
                    nVar2 = wVar2.f157309d;
                    if (nVar2 != null) {
                        j8 = nVar2.f57781a;
                        jC = g6.q.c(j8);
                        g6.r.f76022b.getClass();
                        if (g6.r.b(jC, g6.r.f76023c)) {
                            fD = cVar2.g0(j8);
                        } else if (g6.r.b(jC, g6.r.f76024d)) {
                            fD = g6.q.d(j8) * textSize;
                        } else {
                            fD = 0.0f;
                        }
                        f14 = fD;
                    } else {
                        f14 = 0.0f;
                    }
                    size6 = list3.size();
                    while (i36 < size6) {
                        s5.c.d<? extends s5.c.a> dVar10 = list3.get(i36);
                        t7 = dVar10.f157149a;
                        if (t7 instanceof s5.h) {
                            hVar = (s5.h) t7;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                            float fA4 = b6.c.a(hVar.f157200c, textSize, cVar2);
                            float fA5 = b6.c.a(hVar.f157201d, textSize, cVar2);
                            if (Float.isNaN(fA)) {
                            }
                        }
                    }
                    size7 = list4.size();
                    i37 = 0;
                    while (i37 < size7) {
                        List<s5.c.d<y>> list6 = list4;
                        s5.c.d<y> dVar11 = list6.get(i37);
                        y yVar2 = dVar11.f157149a;
                        int i710 = dVar11.f157150b;
                        int i711 = dVar11.f157151c;
                        while (i38 < r10) {
                            spannable.removeSpan((a8.g) obj2);
                        }
                        long j29 = yVar2.f157325a;
                        long j210 = yVar2.f157326b;
                        float fD6 = g6.q.d(j29);
                        int iA3 = b6.b.a(yVar2.f157325a);
                        float fD7 = g6.q.d(j210);
                        int iA4 = b6.b.a(j210);
                        i39 = yVar2.f157327c;
                        z.f157329b.getClass();
                        if (i39 == z.f157330c) {
                            i45 = 0;
                        } else if (i39 == z.f157331d) {
                            i45 = 1;
                        } else if (i39 == z.f157332e) {
                            i45 = 2;
                        } else if (i39 == z.f157333f) {
                            i45 = 3;
                        } else {
                            if (i39 == z.f157334g) {
                                i44 = 4;
                            } else if (i39 == z.f157335h) {
                                i44 = 5;
                            } else {
                                if (i39 == z.f157336i) {
                                    vb.h.z("Invalid PlaceholderVerticalAlign");
                                    throw null;
                                }
                                i44 = 6;
                            }
                            i45 = i44;
                        }
                        v5.i iVar3 = new v5.i(fD6, iA3, fD7, iA4, cVar2, i45);
                        cVar2 = cVar2;
                        spannable.setSpan(iVar3, i710, i711, 33);
                        i37++;
                        list4 = list6;
                    }
                    charSequenceH = spannable;
                }
            } else {
                if (charSequenceH instanceof Spannable) {
                    spannableString = (Spannable) charSequenceH;
                } else {
                    spannableString = new SpannableString(charSequenceH);
                }
                i0 i0Var9 = x0Var2.f157322a;
                wVar = x0Var2.f157323b;
                iVar = i0Var9.background;
                d6.i.f57760b.getClass();
                if (p005kotlin.jvm.internal.s.g(iVar, d6.i.f57762d)) {
                    spannableString.setSpan(b.f1482a, 0, str3.length(), 33);
                }
                c0Var = x0Var2.platformStyle;
                if (c0Var != null) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    fVar = wVar.f157311f;
                    if (fVar == null) {
                        d6.f.f57730d.getClass();
                        fVar = d6.f.f57731e;
                    }
                    fB = b6.c.b(wVar.f157308c, textSize, cVar6);
                    if (Float.isNaN(fB)) {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i612 = length;
                        i17 = fVar.f57733b;
                        if ((i17 & 1) > 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i17 & 16) > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i18 = 0;
                        spannableString.setSpan(new v5.h(fB, 0, i612, z17, z18, fVar.f57732a, fVar.f57734c, null), 0, spannableString.length(), 33);
                    } else {
                        i18 = 0;
                    }
                } else {
                    fVar = wVar.f157311f;
                    if (fVar == null) {
                        d6.f.f57730d.getClass();
                        fVar = d6.f.f57731e;
                    }
                    fB = b6.c.b(wVar.f157308c, textSize, cVar6);
                    if (Float.isNaN(fB)) {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i613 = length;
                        i17 = fVar.f57733b;
                        if ((i17 & 1) > 0) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        if ((i17 & 16) > 0) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        i18 = 0;
                        spannableString.setSpan(new v5.h(fB, 0, i613, z17, z18, fVar.f57732a, fVar.f57734c, null), 0, spannableString.length(), 33);
                    } else {
                        i18 = 0;
                    }
                }
                nVar = wVar.f157309d;
                if (nVar != null) {
                    i56 = i18;
                    j14 = nVar.f57781a;
                    j15 = nVar.f57782b;
                    if (!g6.q.b(j14, o53.f0.B(i56))) {
                    }
                    if ((j14 & 1095216660480L) == r13) {
                        wVar2 = wVar;
                    } else {
                        jC2 = g6.q.c(j14);
                        g6.r.f76022b.getClass();
                        wVar2 = wVar;
                        j16 = g6.r.f76023c;
                        if (g6.r.b(jC2, j16)) {
                            fD2 = cVar6.g0(j14);
                        } else if (g6.r.b(jC2, g6.r.f76024d)) {
                            fD2 = g6.q.d(j14) * textSize;
                        } else {
                            fD2 = 0.0f;
                        }
                        jC3 = g6.q.c(j15);
                        if (g6.r.b(jC3, j16)) {
                            fD3 = cVar6.g0(j15);
                        } else if (g6.r.b(jC3, g6.r.f76024d)) {
                            fD3 = g6.q.d(j15) * textSize;
                        } else {
                            fD3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fD2), (int) Math.ceil(fD3)), 0, spannableString.length(), 33);
                    }
                    arrayList = new ArrayList(list3.size());
                    size = list3.size();
                    while (i19 < size) {
                        dVar3 = list3.get(i19);
                        t15 = dVar3.f157149a;
                        if (t15 instanceof i0) {
                            i0Var4 = (i0) t15;
                            if (i0Var4.fontFamily != null) {
                                z27 = true;
                            } else {
                                z27 = true;
                            }
                            if (z27) {
                                arrayList.add(dVar3);
                            } else {
                                arrayList.add(dVar3);
                            }
                        }
                    }
                    i0Var2 = x0Var2.f157322a;
                    qVar = i0Var2.fontFamily;
                    if (qVar != null) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z19) {
                        i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                    } else {
                        i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                    }
                    fVar2 = new aa2.f(8, spannableString, cVar4);
                    if (arrayList.size() <= 1) {
                        size2 = arrayList.size();
                        i24 = size2 * 2;
                        iArr = new int[i24];
                        size3 = arrayList.size();
                        while (i25 < size3) {
                            s5.c.d dVar12 = (s5.c.d) arrayList.get(i25);
                            iArr[i25] = dVar12.f157150b;
                            iArr[i25 + size2] = dVar12.f157151c;
                        }
                        if (i24 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i24 != 0) {
                            n23.j.s("Array is empty.");
                            throw null;
                        }
                        i26 = iArr[0];
                        i27 = 0;
                        while (i27 < i24) {
                            i28 = iArr[i27];
                            if (i28 == i26) {
                                arrayList2 = arrayList;
                            } else {
                                size4 = arrayList.size();
                                i29 = 0;
                                while (i29 < size4) {
                                    ArrayList arrayList7 = arrayList;
                                    s5.c.d dVar13 = (s5.c.d) arrayList.get(i29);
                                    int i614 = size4;
                                    i30 = dVar13.f157150b;
                                    int i615 = i29;
                                    i34 = dVar13.f157151c;
                                    if (i30 == i34) {
                                    }
                                    i29 = i615 + 1;
                                    size4 = i614;
                                    arrayList = arrayList7;
                                }
                                arrayList2 = arrayList;
                                if (i0Var3 != null) {
                                    fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                                }
                                i26 = i28;
                            }
                            i27++;
                            i0Var3 = i0Var3;
                            arrayList = arrayList2;
                        }
                    } else if (!arrayList.isEmpty()) {
                        i0 i0Var10 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                        fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var10) : i0Var10, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                    }
                    size5 = list3.size();
                    z24 = false;
                    i35 = 0;
                    while (i35 < size5) {
                        dVar2 = list3.get(i35);
                        t14 = dVar2.f157149a;
                        if (t14 instanceof i0) {
                            i49 = dVar2.f157150b;
                            int i712 = dVar2.f157151c;
                            if (i49 >= 0) {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            } else {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            }
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                        i35++;
                        cVar6 = cVar6;
                        size5 = size5;
                        spannableString = spannable2;
                        z24 = z26;
                    }
                    z25 = z24;
                    spannable = spannableString;
                    cVar2 = cVar6;
                    if (z25) {
                        size8 = list3.size();
                        i46 = 0;
                        while (i46 < size8) {
                            dVar = list3.get(i46);
                            aVar = (s5.c.a) dVar.f157149a;
                            if (aVar instanceof i0) {
                                i48 = dVar.f157150b;
                                int i713 = dVar.f157151c;
                                if (i48 >= 0) {
                                    i47 = i46;
                                } else {
                                    i47 = i46;
                                }
                            } else {
                                i47 = i46;
                            }
                            i46 = i47 + 1;
                        }
                    }
                    nVar2 = wVar2.f157309d;
                    if (nVar2 != null) {
                        j8 = nVar2.f57781a;
                        jC = g6.q.c(j8);
                        g6.r.f76022b.getClass();
                        if (g6.r.b(jC, g6.r.f76023c)) {
                            fD = cVar2.g0(j8);
                        } else if (g6.r.b(jC, g6.r.f76024d)) {
                            fD = g6.q.d(j8) * textSize;
                        } else {
                            fD = 0.0f;
                        }
                        f14 = fD;
                    } else {
                        f14 = 0.0f;
                    }
                    size6 = list3.size();
                    while (i36 < size6) {
                        s5.c.d<? extends s5.c.a> dVar14 = list3.get(i36);
                        t7 = dVar14.f157149a;
                        if (t7 instanceof s5.h) {
                            hVar = (s5.h) t7;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                            float fA6 = b6.c.a(hVar.f157200c, textSize, cVar2);
                            float fA7 = b6.c.a(hVar.f157201d, textSize, cVar2);
                            if (Float.isNaN(fA)) {
                            }
                        }
                    }
                    size7 = list4.size();
                    i37 = 0;
                    while (i37 < size7) {
                        List<s5.c.d<y>> list7 = list4;
                        s5.c.d<y> dVar15 = list7.get(i37);
                        y yVar3 = dVar15.f157149a;
                        int i714 = dVar15.f157150b;
                        int i715 = dVar15.f157151c;
                        while (i38 < r10) {
                            spannable.removeSpan((a8.g) obj2);
                        }
                        long j211 = yVar3.f157325a;
                        long j212 = yVar3.f157326b;
                        float fD8 = g6.q.d(j211);
                        int iA5 = b6.b.a(yVar3.f157325a);
                        float fD9 = g6.q.d(j212);
                        int iA6 = b6.b.a(j212);
                        i39 = yVar3.f157327c;
                        z.f157329b.getClass();
                        if (i39 == z.f157330c) {
                            i45 = 0;
                        } else if (i39 == z.f157331d) {
                            i45 = 1;
                        } else if (i39 == z.f157332e) {
                            i45 = 2;
                        } else if (i39 == z.f157333f) {
                            i45 = 3;
                        } else {
                            if (i39 == z.f157334g) {
                                i44 = 4;
                            } else if (i39 == z.f157335h) {
                                i44 = 5;
                            } else {
                                if (i39 == z.f157336i) {
                                    vb.h.z("Invalid PlaceholderVerticalAlign");
                                    throw null;
                                }
                                i44 = 6;
                            }
                            i45 = i44;
                        }
                        v5.i iVar4 = new v5.i(fD8, iA5, fD9, iA6, cVar2, i45);
                        cVar2 = cVar2;
                        spannable.setSpan(iVar4, i714, i715, 33);
                        i37++;
                        list4 = list7;
                    }
                    charSequenceH = spannable;
                } else {
                    wVar2 = wVar;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i19 < size) {
                    dVar3 = list3.get(i19);
                    t15 = dVar3.f157149a;
                    if (t15 instanceof i0) {
                        i0Var4 = (i0) t15;
                        if (i0Var4.fontFamily != null) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (z27) {
                            arrayList.add(dVar3);
                        } else {
                            arrayList.add(dVar3);
                        }
                    }
                }
                i0Var2 = x0Var2.f157322a;
                qVar = i0Var2.fontFamily;
                if (qVar != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                }
                fVar2 = new aa2.f(8, spannableString, cVar4);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i24 = size2 * 2;
                    iArr = new int[i24];
                    size3 = arrayList.size();
                    while (i25 < size3) {
                        s5.c.d dVar16 = (s5.c.d) arrayList.get(i25);
                        iArr[i25] = dVar16.f157150b;
                        iArr[i25 + size2] = dVar16.f157151c;
                    }
                    if (i24 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i24 != 0) {
                        n23.j.s("Array is empty.");
                        throw null;
                    }
                    i26 = iArr[0];
                    i27 = 0;
                    while (i27 < i24) {
                        i28 = iArr[i27];
                        if (i28 == i26) {
                            arrayList2 = arrayList;
                        } else {
                            size4 = arrayList.size();
                            i29 = 0;
                            while (i29 < size4) {
                                ArrayList arrayList8 = arrayList;
                                s5.c.d dVar17 = (s5.c.d) arrayList.get(i29);
                                int i616 = size4;
                                i30 = dVar17.f157150b;
                                int i617 = i29;
                                i34 = dVar17.f157151c;
                                if (i30 == i34) {
                                }
                                i29 = i617 + 1;
                                size4 = i616;
                                arrayList = arrayList8;
                            }
                            arrayList2 = arrayList;
                            if (i0Var3 != null) {
                                fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                            }
                            i26 = i28;
                        }
                        i27++;
                        i0Var3 = i0Var3;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    i0 i0Var11 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                    fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var11) : i0Var11, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                }
                size5 = list3.size();
                z24 = false;
                i35 = 0;
                while (i35 < size5) {
                    dVar2 = list3.get(i35);
                    t14 = dVar2.f157149a;
                    if (t14 instanceof i0) {
                        i49 = dVar2.f157150b;
                        int i716 = dVar2.f157151c;
                        if (i49 >= 0) {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                    } else {
                        size5 = size5;
                        z26 = z24;
                        i35 = i35;
                        spannable2 = spannableString;
                        cVar6 = cVar6;
                    }
                    i35++;
                    cVar6 = cVar6;
                    size5 = size5;
                    spannableString = spannable2;
                    z24 = z26;
                }
                z25 = z24;
                spannable = spannableString;
                cVar2 = cVar6;
                if (z25) {
                    size8 = list3.size();
                    i46 = 0;
                    while (i46 < size8) {
                        dVar = list3.get(i46);
                        aVar = (s5.c.a) dVar.f157149a;
                        if (aVar instanceof i0) {
                            i48 = dVar.f157150b;
                            int i717 = dVar.f157151c;
                            if (i48 >= 0) {
                                i47 = i46;
                            } else {
                                i47 = i46;
                            }
                        } else {
                            i47 = i46;
                        }
                        i46 = i47 + 1;
                    }
                }
                nVar2 = wVar2.f157309d;
                if (nVar2 != null) {
                    j8 = nVar2.f57781a;
                    jC = g6.q.c(j8);
                    g6.r.f76022b.getClass();
                    if (g6.r.b(jC, g6.r.f76023c)) {
                        fD = cVar2.g0(j8);
                    } else if (g6.r.b(jC, g6.r.f76024d)) {
                        fD = g6.q.d(j8) * textSize;
                    } else {
                        fD = 0.0f;
                    }
                    f14 = fD;
                } else {
                    f14 = 0.0f;
                }
                size6 = list3.size();
                while (i36 < size6) {
                    s5.c.d<? extends s5.c.a> dVar18 = list3.get(i36);
                    t7 = dVar18.f157149a;
                    if (t7 instanceof s5.h) {
                        hVar = (s5.h) t7;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                        float fA8 = b6.c.a(hVar.f157200c, textSize, cVar2);
                        float fA9 = b6.c.a(hVar.f157201d, textSize, cVar2);
                        if (Float.isNaN(fA)) {
                        }
                    }
                }
                size7 = list4.size();
                i37 = 0;
                while (i37 < size7) {
                    List<s5.c.d<y>> list8 = list4;
                    s5.c.d<y> dVar19 = list8.get(i37);
                    y yVar4 = dVar19.f157149a;
                    int i718 = dVar19.f157150b;
                    int i719 = dVar19.f157151c;
                    while (i38 < r10) {
                        spannable.removeSpan((a8.g) obj2);
                    }
                    long j213 = yVar4.f157325a;
                    long j214 = yVar4.f157326b;
                    float fD10 = g6.q.d(j213);
                    int iA7 = b6.b.a(yVar4.f157325a);
                    float fD11 = g6.q.d(j214);
                    int iA8 = b6.b.a(j214);
                    i39 = yVar4.f157327c;
                    z.f157329b.getClass();
                    if (i39 == z.f157330c) {
                        i45 = 0;
                    } else if (i39 == z.f157331d) {
                        i45 = 1;
                    } else if (i39 == z.f157332e) {
                        i45 = 2;
                    } else if (i39 == z.f157333f) {
                        i45 = 3;
                    } else {
                        if (i39 == z.f157334g) {
                            i44 = 4;
                        } else if (i39 == z.f157335h) {
                            i44 = 5;
                        } else {
                            if (i39 == z.f157336i) {
                                vb.h.z("Invalid PlaceholderVerticalAlign");
                                throw null;
                            }
                            i44 = 6;
                        }
                        i45 = i44;
                    }
                    v5.i iVar5 = new v5.i(fD10, iA7, fD11, iA8, cVar2, i45);
                    cVar2 = cVar2;
                    spannable.setSpan(iVar5, i718, i719, 33);
                    i37++;
                    list4 = list8;
                }
                charSequenceH = spannable;
            }
        } else {
            if (charSequenceH instanceof Spannable) {
                spannableString = (Spannable) charSequenceH;
            } else {
                spannableString = new SpannableString(charSequenceH);
            }
            i0 i0Var12 = x0Var2.f157322a;
            wVar = x0Var2.f157323b;
            iVar = i0Var12.background;
            d6.i.f57760b.getClass();
            if (p005kotlin.jvm.internal.s.g(iVar, d6.i.f57762d)) {
                spannableString.setSpan(b.f1482a, 0, str3.length(), 33);
            }
            c0Var = x0Var2.platformStyle;
            if (c0Var != null || (a0Var = c0Var.f157154b) == null) {
                z16 = false;
            } else {
                z16 = a0Var.f157125a;
            }
            if (z16 || wVar.f157311f != null) {
                fVar = wVar.f157311f;
                if (fVar == null) {
                    d6.f.f57730d.getClass();
                    fVar = d6.f.f57731e;
                }
                fB = b6.c.b(wVar.f157308c, textSize, cVar6);
                if (Float.isNaN(fB)) {
                    if (spannableString.length() == 0 && d53.y.r0(spannableString) != '\n') {
                        length = spannableString.length();
                    } else {
                        length = spannableString.length() + 1;
                    }
                    int i618 = length;
                    i17 = fVar.f57733b;
                    if ((i17 & 1) > 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if ((i17 & 16) > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    i18 = 0;
                    spannableString.setSpan(new v5.h(fB, 0, i618, z17, z18, fVar.f57732a, fVar.f57734c, null), 0, spannableString.length(), 33);
                }
                nVar = wVar.f157309d;
                if (nVar != null) {
                    i56 = i18;
                    j14 = nVar.f57781a;
                    j15 = nVar.f57782b;
                    if (!g6.q.b(j14, o53.f0.B(i56)) && g6.q.b(j15, o53.f0.B(i56))) {
                        wVar2 = wVar;
                    } else if ((j14 & 1095216660480L) == r13 && (j15 & 1095216660480L) != 0) {
                        jC2 = g6.q.c(j14);
                        g6.r.f76022b.getClass();
                        wVar2 = wVar;
                        j16 = g6.r.f76023c;
                        if (g6.r.b(jC2, j16)) {
                            fD2 = cVar6.g0(j14);
                        } else if (g6.r.b(jC2, g6.r.f76024d)) {
                            fD2 = g6.q.d(j14) * textSize;
                        } else {
                            fD2 = 0.0f;
                        }
                        jC3 = g6.q.c(j15);
                        if (g6.r.b(jC3, j16)) {
                            fD3 = cVar6.g0(j15);
                        } else if (g6.r.b(jC3, g6.r.f76024d)) {
                            fD3 = g6.q.d(j15) * textSize;
                        } else {
                            fD3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fD2), (int) Math.ceil(fD3)), 0, spannableString.length(), 33);
                    } else {
                        wVar2 = wVar;
                    }
                    arrayList = new ArrayList(list3.size());
                    size = list3.size();
                    while (i19 < size) {
                        dVar3 = list3.get(i19);
                        t15 = dVar3.f157149a;
                        if (t15 instanceof i0) {
                            i0Var4 = (i0) t15;
                            if (i0Var4.fontFamily != null && i0Var4.fontStyle == null && i0Var4.fontWeight == null) {
                                z27 = false;
                            } else {
                                z27 = true;
                            }
                            if (z27 || ((i0) t15).fontSynthesis != null) {
                                arrayList.add(dVar3);
                            }
                        }
                    }
                    i0Var2 = x0Var2.f157322a;
                    qVar = i0Var2.fontFamily;
                    if (qVar != null && i0Var2.fontStyle == null && i0Var2.fontWeight == null) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    if (z19 || i0Var2.fontSynthesis != null) {
                        i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                    } else {
                        i0Var3 = null;
                    }
                    fVar2 = new aa2.f(8, spannableString, cVar4);
                    if (arrayList.size() <= 1) {
                        size2 = arrayList.size();
                        i24 = size2 * 2;
                        iArr = new int[i24];
                        size3 = arrayList.size();
                        while (i25 < size3) {
                            s5.c.d dVar110 = (s5.c.d) arrayList.get(i25);
                            iArr[i25] = dVar110.f157150b;
                            iArr[i25 + size2] = dVar110.f157151c;
                        }
                        if (i24 > 1) {
                            Arrays.sort(iArr);
                        }
                        if (i24 != 0) {
                            n23.j.s("Array is empty.");
                            throw null;
                        }
                        i26 = iArr[0];
                        i27 = 0;
                        while (i27 < i24) {
                            i28 = iArr[i27];
                            if (i28 == i26) {
                                arrayList2 = arrayList;
                            } else {
                                size4 = arrayList.size();
                                i29 = 0;
                                while (i29 < size4) {
                                    ArrayList arrayList9 = arrayList;
                                    s5.c.d dVar111 = (s5.c.d) arrayList.get(i29);
                                    int i619 = size4;
                                    i30 = dVar111.f157150b;
                                    int i6110 = i29;
                                    i34 = dVar111.f157151c;
                                    if (i30 == i34 && s5.f.b(i26, i28, i30, i34)) {
                                        i0 i0Var13 = (i0) dVar111.f157149a;
                                        i0Var3 = i0Var3 != null ? i0Var3.d(i0Var13) : i0Var13;
                                    }
                                    i29 = i6110 + 1;
                                    size4 = i619;
                                    arrayList = arrayList9;
                                }
                                arrayList2 = arrayList;
                                if (i0Var3 != null) {
                                    fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                                }
                                i26 = i28;
                            }
                            i27++;
                            i0Var3 = i0Var3;
                            arrayList = arrayList2;
                        }
                    } else if (!arrayList.isEmpty()) {
                        i0 i0Var14 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                        fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var14) : i0Var14, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                    }
                    size5 = list3.size();
                    z24 = false;
                    i35 = 0;
                    while (i35 < size5) {
                        dVar2 = list3.get(i35);
                        t14 = dVar2.f157149a;
                        if (t14 instanceof i0) {
                            i49 = dVar2.f157150b;
                            int i7110 = dVar2.f157151c;
                            if (i49 >= 0 || i49 >= spannableString.length() || i7110 <= i49 || i7110 > spannableString.length()) {
                                size5 = size5;
                                z26 = z24;
                                i35 = i35;
                                spannable2 = spannableString;
                                cVar6 = cVar6;
                            } else {
                                i0 i0Var15 = (i0) t14;
                                long j34 = i0Var15.letterSpacing;
                                d6.a aVar5 = i0Var15.baselineShift;
                                d6.l lVar2 = i0Var15.f157211a;
                                if (aVar5 != null) {
                                    spannableString.setSpan(new v5.a(aVar5.f57704a), i49, i7110, 33);
                                }
                                z26 = z24;
                                b6.c.c(spannableString, lVar2.getF57707b(), i49, i7110);
                                o4.w wVarE2 = lVar2.e();
                                float fA10 = lVar2.getF57706c();
                                if (wVarE2 != null) {
                                    if (wVarE2 instanceof t1) {
                                        b6.c.c(spannableString, ((t1) wVarE2).f129007b, i49, i7110);
                                    } else {
                                        spannableString.setSpan(new c6.e((p1) wVarE2, fA10), i49, i7110, 33);
                                    }
                                }
                                d6.i iVar6 = i0Var15.background;
                                if (iVar6 != null) {
                                    d6.i.f57760b.getClass();
                                    v5.l lVar3 = new v5.l(iVar6.a(d6.i.f57762d), iVar6.a(d6.i.f57763e));
                                    i54 = 33;
                                    spannableString.setSpan(lVar3, i49, i7110, 33);
                                } else {
                                    i54 = 33;
                                }
                                b6.c.d(spannableString, i0Var15.fontSize, cVar6, i49, i7110);
                                spannable2 = spannableString;
                                String str4 = i0Var15.fontFeatureSettings;
                                if (str4 != null) {
                                    spannable2.setSpan(new v5.b(str4), i49, i7110, i54);
                                }
                                d6.m mVar3 = i0Var15.textGeometricTransform;
                                if (mVar3 != null) {
                                    spannable2.setSpan(new ScaleXSpan(mVar3.f57777a), i49, i7110, i54);
                                    spannable2.setSpan(new v5.k(mVar3.f57778b), i49, i7110, i54);
                                }
                                b6.c.e(spannable2, i0Var15.localeList, i49, i7110);
                                long j35 = i0Var15.f157222l;
                                if (j35 != 16) {
                                    spannable2.setSpan(new BackgroundColorSpan(o4.f0.j(j35)), i49, i7110, 33);
                                }
                                q1 q1Var = i0Var15.shadow;
                                if (q1Var != null) {
                                    long j36 = q1Var.f128959b;
                                    int iJ = o4.f0.j(q1Var.f128958a);
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j36 >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j36 & 4294967295L));
                                    float f15 = q1Var.f128960c;
                                    v5.j jVar = new v5.j(iJ, fIntBitsToFloat, fIntBitsToFloat2, f15 == 0.0f ? Float.MIN_VALUE : f15);
                                    i55 = 33;
                                    spannable2.setSpan(jVar, i49, i7110, 33);
                                } else {
                                    i55 = 33;
                                }
                                q4.g gVar = i0Var15.drawStyle;
                                if (gVar != null) {
                                    spannable2.setSpan(new c6.c(gVar), i49, i7110, i55);
                                }
                                long jC6 = g6.q.c(j34);
                                g6.r.f76022b.getClass();
                                if (g6.r.b(jC6, g6.r.f76023c) || g6.r.b(g6.q.c(j34), g6.r.f76024d)) {
                                    z26 = true;
                                }
                            }
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                        i35++;
                        cVar6 = cVar6;
                        size5 = size5;
                        spannableString = spannable2;
                        z24 = z26;
                    }
                    z25 = z24;
                    spannable = spannableString;
                    cVar2 = cVar6;
                    if (z25) {
                        size8 = list3.size();
                        i46 = 0;
                        while (i46 < size8) {
                            dVar = list3.get(i46);
                            aVar = (s5.c.a) dVar.f157149a;
                            if (aVar instanceof i0) {
                                i48 = dVar.f157150b;
                                int i7111 = dVar.f157151c;
                                if (i48 >= 0 || i48 >= spannable.length() || i7111 <= i48 || i7111 > spannable.length()) {
                                    i47 = i46;
                                } else {
                                    long j37 = ((i0) aVar).letterSpacing;
                                    long jC7 = g6.q.c(j37);
                                    g6.r.f76022b.getClass();
                                    g6.c cVar7 = cVar2;
                                    if (g6.r.b(jC7, g6.r.f76023c)) {
                                        cVar2 = cVar7;
                                        eVar = new v5.f(cVar2.g0(j37));
                                        i47 = i46;
                                    } else {
                                        cVar2 = cVar7;
                                        i47 = i46;
                                        eVar = g6.r.b(jC7, g6.r.f76024d) ? new v5.e(g6.q.d(j37)) : null;
                                    }
                                    if (eVar != null) {
                                        spannable.setSpan(eVar, i48, i7111, 33);
                                    }
                                }
                            } else {
                                i47 = i46;
                            }
                            i46 = i47 + 1;
                        }
                    }
                    nVar2 = wVar2.f157309d;
                    if (nVar2 != null) {
                        j8 = nVar2.f57781a;
                        jC = g6.q.c(j8);
                        g6.r.f76022b.getClass();
                        if (g6.r.b(jC, g6.r.f76023c)) {
                            fD = cVar2.g0(j8);
                        } else if (g6.r.b(jC, g6.r.f76024d)) {
                            fD = g6.q.d(j8) * textSize;
                        } else {
                            fD = 0.0f;
                        }
                        f14 = fD;
                    } else {
                        f14 = 0.0f;
                    }
                    size6 = list3.size();
                    while (i36 < size6) {
                        s5.c.d<? extends s5.c.a> dVar112 = list3.get(i36);
                        t7 = dVar112.f157149a;
                        if (t7 instanceof s5.h) {
                            hVar = (s5.h) t7;
                        } else {
                            hVar = null;
                        }
                        if (hVar != null) {
                            fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                            float fA11 = b6.c.a(hVar.f157200c, textSize, cVar2);
                            float fA12 = b6.c.a(hVar.f157201d, textSize, cVar2);
                            if (Float.isNaN(fA) && !Float.isNaN(fA11) && !Float.isNaN(fA12)) {
                                g6.c cVar8 = cVar2;
                                cVar2 = cVar8;
                                spannable.setSpan(new c6.b(hVar.f157198a, fA, fA11, fA12, hVar.f157202e, hVar.f157203f, hVar.f157204g, cVar8, f14), dVar112.f157150b, dVar112.f157151c, 33);
                            }
                        }
                    }
                    size7 = list4.size();
                    i37 = 0;
                    while (i37 < size7) {
                        List<s5.c.d<y>> list9 = list4;
                        s5.c.d<y> dVar113 = list9.get(i37);
                        y yVar5 = dVar113.f157149a;
                        int i7112 = dVar113.f157150b;
                        int i7113 = dVar113.f157151c;
                        while (i38 < r10) {
                            spannable.removeSpan((a8.g) obj2);
                        }
                        long j215 = yVar5.f157325a;
                        long j216 = yVar5.f157326b;
                        float fD12 = g6.q.d(j215);
                        int iA9 = b6.b.a(yVar5.f157325a);
                        float fD13 = g6.q.d(j216);
                        int iA10 = b6.b.a(j216);
                        i39 = yVar5.f157327c;
                        z.f157329b.getClass();
                        if (i39 == z.f157330c) {
                            i45 = 0;
                        } else if (i39 == z.f157331d) {
                            i45 = 1;
                        } else if (i39 == z.f157332e) {
                            i45 = 2;
                        } else if (i39 == z.f157333f) {
                            i45 = 3;
                        } else {
                            if (i39 == z.f157334g) {
                                i44 = 4;
                            } else if (i39 == z.f157335h) {
                                i44 = 5;
                            } else {
                                if (i39 == z.f157336i) {
                                    vb.h.z("Invalid PlaceholderVerticalAlign");
                                    throw null;
                                }
                                i44 = 6;
                            }
                            i45 = i44;
                        }
                        v5.i iVar7 = new v5.i(fD12, iA9, fD13, iA10, cVar2, i45);
                        cVar2 = cVar2;
                        spannable.setSpan(iVar7, i7112, i7113, 33);
                        i37++;
                        list4 = list9;
                    }
                    charSequenceH = spannable;
                } else {
                    wVar2 = wVar;
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i19 < size) {
                    dVar3 = list3.get(i19);
                    t15 = dVar3.f157149a;
                    if (t15 instanceof i0) {
                        i0Var4 = (i0) t15;
                        if (i0Var4.fontFamily != null) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (z27) {
                            arrayList.add(dVar3);
                        } else {
                            arrayList.add(dVar3);
                        }
                    }
                }
                i0Var2 = x0Var2.f157322a;
                qVar = i0Var2.fontFamily;
                if (qVar != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                }
                fVar2 = new aa2.f(8, spannableString, cVar4);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i24 = size2 * 2;
                    iArr = new int[i24];
                    size3 = arrayList.size();
                    while (i25 < size3) {
                        s5.c.d dVar114 = (s5.c.d) arrayList.get(i25);
                        iArr[i25] = dVar114.f157150b;
                        iArr[i25 + size2] = dVar114.f157151c;
                    }
                    if (i24 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i24 != 0) {
                        n23.j.s("Array is empty.");
                        throw null;
                    }
                    i26 = iArr[0];
                    i27 = 0;
                    while (i27 < i24) {
                        i28 = iArr[i27];
                        if (i28 == i26) {
                            arrayList2 = arrayList;
                        } else {
                            size4 = arrayList.size();
                            i29 = 0;
                            while (i29 < size4) {
                                ArrayList arrayList10 = arrayList;
                                s5.c.d dVar115 = (s5.c.d) arrayList.get(i29);
                                int i6111 = size4;
                                i30 = dVar115.f157150b;
                                int i6112 = i29;
                                i34 = dVar115.f157151c;
                                if (i30 == i34) {
                                }
                                i29 = i6112 + 1;
                                size4 = i6111;
                                arrayList = arrayList10;
                            }
                            arrayList2 = arrayList;
                            if (i0Var3 != null) {
                                fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                            }
                            i26 = i28;
                        }
                        i27++;
                        i0Var3 = i0Var3;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    i0 i0Var16 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                    fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var16) : i0Var16, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                }
                size5 = list3.size();
                z24 = false;
                i35 = 0;
                while (i35 < size5) {
                    dVar2 = list3.get(i35);
                    t14 = dVar2.f157149a;
                    if (t14 instanceof i0) {
                        i49 = dVar2.f157150b;
                        int i7114 = dVar2.f157151c;
                        if (i49 >= 0) {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                    } else {
                        size5 = size5;
                        z26 = z24;
                        i35 = i35;
                        spannable2 = spannableString;
                        cVar6 = cVar6;
                    }
                    i35++;
                    cVar6 = cVar6;
                    size5 = size5;
                    spannableString = spannable2;
                    z24 = z26;
                }
                z25 = z24;
                spannable = spannableString;
                cVar2 = cVar6;
                if (z25) {
                    size8 = list3.size();
                    i46 = 0;
                    while (i46 < size8) {
                        dVar = list3.get(i46);
                        aVar = (s5.c.a) dVar.f157149a;
                        if (aVar instanceof i0) {
                            i48 = dVar.f157150b;
                            int i7115 = dVar.f157151c;
                            if (i48 >= 0) {
                                i47 = i46;
                            } else {
                                i47 = i46;
                            }
                        } else {
                            i47 = i46;
                        }
                        i46 = i47 + 1;
                    }
                }
                nVar2 = wVar2.f157309d;
                if (nVar2 != null) {
                    j8 = nVar2.f57781a;
                    jC = g6.q.c(j8);
                    g6.r.f76022b.getClass();
                    if (g6.r.b(jC, g6.r.f76023c)) {
                        fD = cVar2.g0(j8);
                    } else if (g6.r.b(jC, g6.r.f76024d)) {
                        fD = g6.q.d(j8) * textSize;
                    } else {
                        fD = 0.0f;
                    }
                    f14 = fD;
                } else {
                    f14 = 0.0f;
                }
                size6 = list3.size();
                while (i36 < size6) {
                    s5.c.d<? extends s5.c.a> dVar116 = list3.get(i36);
                    t7 = dVar116.f157149a;
                    if (t7 instanceof s5.h) {
                        hVar = (s5.h) t7;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                        float fA13 = b6.c.a(hVar.f157200c, textSize, cVar2);
                        float fA14 = b6.c.a(hVar.f157201d, textSize, cVar2);
                        if (Float.isNaN(fA)) {
                        }
                    }
                }
                size7 = list4.size();
                i37 = 0;
                while (i37 < size7) {
                    List<s5.c.d<y>> list10 = list4;
                    s5.c.d<y> dVar117 = list10.get(i37);
                    y yVar6 = dVar117.f157149a;
                    int i7116 = dVar117.f157150b;
                    int i7117 = dVar117.f157151c;
                    while (i38 < r10) {
                        spannable.removeSpan((a8.g) obj2);
                    }
                    long j217 = yVar6.f157325a;
                    long j218 = yVar6.f157326b;
                    float fD14 = g6.q.d(j217);
                    int iA11 = b6.b.a(yVar6.f157325a);
                    float fD15 = g6.q.d(j218);
                    int iA12 = b6.b.a(j218);
                    i39 = yVar6.f157327c;
                    z.f157329b.getClass();
                    if (i39 == z.f157330c) {
                        i45 = 0;
                    } else if (i39 == z.f157331d) {
                        i45 = 1;
                    } else if (i39 == z.f157332e) {
                        i45 = 2;
                    } else if (i39 == z.f157333f) {
                        i45 = 3;
                    } else {
                        if (i39 == z.f157334g) {
                            i44 = 4;
                        } else if (i39 == z.f157335h) {
                            i44 = 5;
                        } else {
                            if (i39 == z.f157336i) {
                                vb.h.z("Invalid PlaceholderVerticalAlign");
                                throw null;
                            }
                            i44 = 6;
                        }
                        i45 = i44;
                    }
                    v5.i iVar8 = new v5.i(fD14, iA11, fD15, iA12, cVar2, i45);
                    cVar2 = cVar2;
                    spannable.setSpan(iVar8, i7116, i7117, 33);
                    i37++;
                    list4 = list10;
                }
                charSequenceH = spannable;
            } else {
                float fB2 = b6.c.b(wVar.f157308c, textSize, cVar6);
                if (!Float.isNaN(fB2)) {
                    spannableString.setSpan(new v5.g(fB2), 0, spannableString.length(), 33);
                }
            }
            i18 = 0;
            nVar = wVar.f157309d;
            if (nVar != null) {
                i56 = i18;
                j14 = nVar.f57781a;
                j15 = nVar.f57782b;
                if (!g6.q.b(j14, o53.f0.B(i56))) {
                }
                if ((j14 & 1095216660480L) == r13) {
                    wVar2 = wVar;
                } else {
                    jC2 = g6.q.c(j14);
                    g6.r.f76022b.getClass();
                    wVar2 = wVar;
                    j16 = g6.r.f76023c;
                    if (g6.r.b(jC2, j16)) {
                        fD2 = cVar6.g0(j14);
                    } else if (g6.r.b(jC2, g6.r.f76024d)) {
                        fD2 = g6.q.d(j14) * textSize;
                    } else {
                        fD2 = 0.0f;
                    }
                    jC3 = g6.q.c(j15);
                    if (g6.r.b(jC3, j16)) {
                        fD3 = cVar6.g0(j15);
                    } else if (g6.r.b(jC3, g6.r.f76024d)) {
                        fD3 = g6.q.d(j15) * textSize;
                    } else {
                        fD3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fD2), (int) Math.ceil(fD3)), 0, spannableString.length(), 33);
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i19 < size) {
                    dVar3 = list3.get(i19);
                    t15 = dVar3.f157149a;
                    if (t15 instanceof i0) {
                        i0Var4 = (i0) t15;
                        if (i0Var4.fontFamily != null) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        if (z27) {
                            arrayList.add(dVar3);
                        } else {
                            arrayList.add(dVar3);
                        }
                    }
                }
                i0Var2 = x0Var2.f157322a;
                qVar = i0Var2.fontFamily;
                if (qVar != null) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                if (z19) {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                } else {
                    i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
                }
                fVar2 = new aa2.f(8, spannableString, cVar4);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i24 = size2 * 2;
                    iArr = new int[i24];
                    size3 = arrayList.size();
                    while (i25 < size3) {
                        s5.c.d dVar118 = (s5.c.d) arrayList.get(i25);
                        iArr[i25] = dVar118.f157150b;
                        iArr[i25 + size2] = dVar118.f157151c;
                    }
                    if (i24 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i24 != 0) {
                        n23.j.s("Array is empty.");
                        throw null;
                    }
                    i26 = iArr[0];
                    i27 = 0;
                    while (i27 < i24) {
                        i28 = iArr[i27];
                        if (i28 == i26) {
                            arrayList2 = arrayList;
                        } else {
                            size4 = arrayList.size();
                            i29 = 0;
                            while (i29 < size4) {
                                ArrayList arrayList11 = arrayList;
                                s5.c.d dVar119 = (s5.c.d) arrayList.get(i29);
                                int i6113 = size4;
                                i30 = dVar119.f157150b;
                                int i6114 = i29;
                                i34 = dVar119.f157151c;
                                if (i30 == i34) {
                                }
                                i29 = i6114 + 1;
                                size4 = i6113;
                                arrayList = arrayList11;
                            }
                            arrayList2 = arrayList;
                            if (i0Var3 != null) {
                                fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                            }
                            i26 = i28;
                        }
                        i27++;
                        i0Var3 = i0Var3;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    i0 i0Var17 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                    fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var17) : i0Var17, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
                }
                size5 = list3.size();
                z24 = false;
                i35 = 0;
                while (i35 < size5) {
                    dVar2 = list3.get(i35);
                    t14 = dVar2.f157149a;
                    if (t14 instanceof i0) {
                        i49 = dVar2.f157150b;
                        int i7118 = dVar2.f157151c;
                        if (i49 >= 0) {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        } else {
                            size5 = size5;
                            z26 = z24;
                            i35 = i35;
                            spannable2 = spannableString;
                            cVar6 = cVar6;
                        }
                    } else {
                        size5 = size5;
                        z26 = z24;
                        i35 = i35;
                        spannable2 = spannableString;
                        cVar6 = cVar6;
                    }
                    i35++;
                    cVar6 = cVar6;
                    size5 = size5;
                    spannableString = spannable2;
                    z24 = z26;
                }
                z25 = z24;
                spannable = spannableString;
                cVar2 = cVar6;
                if (z25) {
                    size8 = list3.size();
                    i46 = 0;
                    while (i46 < size8) {
                        dVar = list3.get(i46);
                        aVar = (s5.c.a) dVar.f157149a;
                        if (aVar instanceof i0) {
                            i48 = dVar.f157150b;
                            int i7119 = dVar.f157151c;
                            if (i48 >= 0) {
                                i47 = i46;
                            } else {
                                i47 = i46;
                            }
                        } else {
                            i47 = i46;
                        }
                        i46 = i47 + 1;
                    }
                }
                nVar2 = wVar2.f157309d;
                if (nVar2 != null) {
                    j8 = nVar2.f57781a;
                    jC = g6.q.c(j8);
                    g6.r.f76022b.getClass();
                    if (g6.r.b(jC, g6.r.f76023c)) {
                        fD = cVar2.g0(j8);
                    } else if (g6.r.b(jC, g6.r.f76024d)) {
                        fD = g6.q.d(j8) * textSize;
                    } else {
                        fD = 0.0f;
                    }
                    f14 = fD;
                } else {
                    f14 = 0.0f;
                }
                size6 = list3.size();
                while (i36 < size6) {
                    s5.c.d<? extends s5.c.a> dVar1110 = list3.get(i36);
                    t7 = dVar1110.f157149a;
                    if (t7 instanceof s5.h) {
                        hVar = (s5.h) t7;
                    } else {
                        hVar = null;
                    }
                    if (hVar != null) {
                        fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                        float fA15 = b6.c.a(hVar.f157200c, textSize, cVar2);
                        float fA16 = b6.c.a(hVar.f157201d, textSize, cVar2);
                        if (Float.isNaN(fA)) {
                        }
                    }
                }
                size7 = list4.size();
                i37 = 0;
                while (i37 < size7) {
                    List<s5.c.d<y>> list11 = list4;
                    s5.c.d<y> dVar1111 = list11.get(i37);
                    y yVar7 = dVar1111.f157149a;
                    int i71110 = dVar1111.f157150b;
                    int i71111 = dVar1111.f157151c;
                    while (i38 < r10) {
                        spannable.removeSpan((a8.g) obj2);
                    }
                    long j219 = yVar7.f157325a;
                    long j2110 = yVar7.f157326b;
                    float fD16 = g6.q.d(j219);
                    int iA13 = b6.b.a(yVar7.f157325a);
                    float fD17 = g6.q.d(j2110);
                    int iA14 = b6.b.a(j2110);
                    i39 = yVar7.f157327c;
                    z.f157329b.getClass();
                    if (i39 == z.f157330c) {
                        i45 = 0;
                    } else if (i39 == z.f157331d) {
                        i45 = 1;
                    } else if (i39 == z.f157332e) {
                        i45 = 2;
                    } else if (i39 == z.f157333f) {
                        i45 = 3;
                    } else {
                        if (i39 == z.f157334g) {
                            i44 = 4;
                        } else if (i39 == z.f157335h) {
                            i44 = 5;
                        } else {
                            if (i39 == z.f157336i) {
                                vb.h.z("Invalid PlaceholderVerticalAlign");
                                throw null;
                            }
                            i44 = 6;
                        }
                        i45 = i44;
                    }
                    v5.i iVar9 = new v5.i(fD16, iA13, fD17, iA14, cVar2, i45);
                    cVar2 = cVar2;
                    spannable.setSpan(iVar9, i71110, i71111, 33);
                    i37++;
                    list4 = list11;
                }
                charSequenceH = spannable;
            } else {
                wVar2 = wVar;
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i19 < size) {
                dVar3 = list3.get(i19);
                t15 = dVar3.f157149a;
                if (t15 instanceof i0) {
                    i0Var4 = (i0) t15;
                    if (i0Var4.fontFamily != null) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    if (z27) {
                        arrayList.add(dVar3);
                    } else {
                        arrayList.add(dVar3);
                    }
                }
            }
            i0Var2 = x0Var2.f157322a;
            qVar = i0Var2.fontFamily;
            if (qVar != null) {
                z19 = true;
            } else {
                z19 = true;
            }
            if (z19) {
                i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
            } else {
                i0Var3 = new i0(0L, 0L, i0Var2.fontWeight, i0Var2.fontStyle, i0Var2.fontSynthesis, qVar, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65475, (p005kotlin.jvm.internal.j) null);
            }
            fVar2 = new aa2.f(8, spannableString, cVar4);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i24 = size2 * 2;
                iArr = new int[i24];
                size3 = arrayList.size();
                while (i25 < size3) {
                    s5.c.d dVar1112 = (s5.c.d) arrayList.get(i25);
                    iArr[i25] = dVar1112.f157150b;
                    iArr[i25 + size2] = dVar1112.f157151c;
                }
                if (i24 > 1) {
                    Arrays.sort(iArr);
                }
                if (i24 != 0) {
                    n23.j.s("Array is empty.");
                    throw null;
                }
                i26 = iArr[0];
                i27 = 0;
                while (i27 < i24) {
                    i28 = iArr[i27];
                    if (i28 == i26) {
                        arrayList2 = arrayList;
                    } else {
                        size4 = arrayList.size();
                        i29 = 0;
                        while (i29 < size4) {
                            ArrayList arrayList12 = arrayList;
                            s5.c.d dVar1113 = (s5.c.d) arrayList.get(i29);
                            int i6115 = size4;
                            i30 = dVar1113.f157150b;
                            int i6116 = i29;
                            i34 = dVar1113.f157151c;
                            if (i30 == i34) {
                            }
                            i29 = i6116 + 1;
                            size4 = i6115;
                            arrayList = arrayList12;
                        }
                        arrayList2 = arrayList;
                        if (i0Var3 != null) {
                            fVar2.invoke(i0Var3, Integer.valueOf(i26), Integer.valueOf(i28));
                        }
                        i26 = i28;
                    }
                    i27++;
                    i0Var3 = i0Var3;
                    arrayList = arrayList2;
                }
            } else if (!arrayList.isEmpty()) {
                i0 i0Var18 = (i0) ((s5.c.d) arrayList.get(0)).f157149a;
                fVar2.invoke(i0Var3 != null ? i0Var3.d(i0Var18) : i0Var18, Integer.valueOf(((s5.c.d) arrayList.get(0)).f157150b), Integer.valueOf(((s5.c.d) arrayList.get(0)).f157151c));
            }
            size5 = list3.size();
            z24 = false;
            i35 = 0;
            while (i35 < size5) {
                dVar2 = list3.get(i35);
                t14 = dVar2.f157149a;
                if (t14 instanceof i0) {
                    i49 = dVar2.f157150b;
                    int i71112 = dVar2.f157151c;
                    if (i49 >= 0) {
                        size5 = size5;
                        z26 = z24;
                        i35 = i35;
                        spannable2 = spannableString;
                        cVar6 = cVar6;
                    } else {
                        size5 = size5;
                        z26 = z24;
                        i35 = i35;
                        spannable2 = spannableString;
                        cVar6 = cVar6;
                    }
                } else {
                    size5 = size5;
                    z26 = z24;
                    i35 = i35;
                    spannable2 = spannableString;
                    cVar6 = cVar6;
                }
                i35++;
                cVar6 = cVar6;
                size5 = size5;
                spannableString = spannable2;
                z24 = z26;
            }
            z25 = z24;
            spannable = spannableString;
            cVar2 = cVar6;
            if (z25) {
                size8 = list3.size();
                i46 = 0;
                while (i46 < size8) {
                    dVar = list3.get(i46);
                    aVar = (s5.c.a) dVar.f157149a;
                    if (aVar instanceof i0) {
                        i48 = dVar.f157150b;
                        int i71113 = dVar.f157151c;
                        if (i48 >= 0) {
                            i47 = i46;
                        } else {
                            i47 = i46;
                        }
                    } else {
                        i47 = i46;
                    }
                    i46 = i47 + 1;
                }
            }
            nVar2 = wVar2.f157309d;
            if (nVar2 != null) {
                j8 = nVar2.f57781a;
                jC = g6.q.c(j8);
                g6.r.f76022b.getClass();
                if (g6.r.b(jC, g6.r.f76023c)) {
                    fD = cVar2.g0(j8);
                } else if (g6.r.b(jC, g6.r.f76024d)) {
                    fD = g6.q.d(j8) * textSize;
                } else {
                    fD = 0.0f;
                }
                f14 = fD;
            } else {
                f14 = 0.0f;
            }
            size6 = list3.size();
            while (i36 < size6) {
                s5.c.d<? extends s5.c.a> dVar1114 = list3.get(i36);
                t7 = dVar1114.f157149a;
                if (t7 instanceof s5.h) {
                    hVar = (s5.h) t7;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    fA = b6.c.a(hVar.f157199b, textSize, cVar2);
                    float fA17 = b6.c.a(hVar.f157200c, textSize, cVar2);
                    float fA18 = b6.c.a(hVar.f157201d, textSize, cVar2);
                    if (Float.isNaN(fA)) {
                    }
                }
            }
            size7 = list4.size();
            i37 = 0;
            while (i37 < size7) {
                List<s5.c.d<y>> list12 = list4;
                s5.c.d<y> dVar1115 = list12.get(i37);
                y yVar8 = dVar1115.f157149a;
                int i71114 = dVar1115.f157150b;
                int i71115 = dVar1115.f157151c;
                while (i38 < r10) {
                    spannable.removeSpan((a8.g) obj2);
                }
                long j2111 = yVar8.f157325a;
                long j2112 = yVar8.f157326b;
                float fD18 = g6.q.d(j2111);
                int iA15 = b6.b.a(yVar8.f157325a);
                float fD19 = g6.q.d(j2112);
                int iA16 = b6.b.a(j2112);
                i39 = yVar8.f157327c;
                z.f157329b.getClass();
                if (i39 == z.f157330c) {
                    i45 = 0;
                } else if (i39 == z.f157331d) {
                    i45 = 1;
                } else if (i39 == z.f157332e) {
                    i45 = 2;
                } else if (i39 == z.f157333f) {
                    i45 = 3;
                } else {
                    if (i39 == z.f157334g) {
                        i44 = 4;
                    } else if (i39 == z.f157335h) {
                        i44 = 5;
                    } else {
                        if (i39 == z.f157336i) {
                            vb.h.z("Invalid PlaceholderVerticalAlign");
                            throw null;
                        }
                        i44 = 6;
                    }
                    i45 = i44;
                }
                v5.i iVar10 = new v5.i(fD18, iA15, fD19, iA16, cVar2, i45);
                cVar2 = cVar2;
                spannable.setSpan(iVar10, i71114, i71115, 33);
                i37++;
                list4 = list12;
            }
            charSequenceH = spannable;
        }
        this.f1492h = charSequenceH;
        this.f1493i = new t5.o(charSequenceH, this.f1491g, this.f1496l);
    }

    @Override // s5.u
    public final float a() {
        return this.f1493i.c();
    }

    @Override // s5.u
    public final boolean b() {
        s sVar = this.f1494j;
        if (sVar != null ? sVar.a() : false) {
            return true;
        }
        if (!this.f1495k && e.a(this.f1486b)) {
            o.f1517a.getClass();
            m mVar = o.f1518b;
            x3<Boolean> x3VarA = mVar.f1513a;
            if (x3VarA == null) {
                if (androidx.emoji2.text.d.e()) {
                    x3VarA = mVar.a();
                    mVar.f1513a = x3VarA;
                } else {
                    x3VarA = p.f1519a;
                }
            }
            if (x3VarA.getF182175a().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // s5.u
    public final float c() {
        float f14;
        t5.o oVar = this.f1493i;
        float f15 = oVar.f162451e;
        TextPaint textPaint = oVar.f162448b;
        if (!Float.isNaN(f15)) {
            return oVar.f162451e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = oVar.f162447a;
        int i14 = 0;
        lineInstance.setText(new t5.k(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, t5.p.f162455a);
        int next = lineInstance.next();
        while (true) {
            int i15 = i14;
            i14 = next;
            if (i14 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new j23.l(i15, i14));
            } else {
                j23.l lVar = (j23.l) priorityQueue.peek();
                if (lVar != null && lVar.f96797b - lVar.f96796a < i14 - i15) {
                    priorityQueue.poll();
                    priorityQueue.add(new j23.l(i15, i14));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            f14 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return 0.0f;
            }
            j23.l lVar2 = (j23.l) it.next();
            float desiredWidth = Layout.getDesiredWidth(oVar.b(), lVar2.f96796a, lVar2.f96797b, textPaint);
            while (it.hasNext()) {
                j23.l lVar3 = (j23.l) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(oVar.b(), lVar3.f96796a, lVar3.f96797b, textPaint));
            }
            f14 = desiredWidth;
        }
        oVar.f162451e = f14;
        return f14;
    }
}
