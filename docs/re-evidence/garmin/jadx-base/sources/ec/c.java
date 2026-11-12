package ec;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import fa.k;
import fa.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f63710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f63711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f63713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f63714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f63715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f63716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f63717m;

    private c(String str, String str2, long j8, long j14, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f63705a = str;
        this.f63706b = str2;
        this.f63713i = str4;
        this.f63710f = gVar;
        this.f63711g = strArr;
        this.f63707c = str2 != null;
        this.f63708d = j8;
        this.f63709e = j14;
        str3.getClass();
        this.f63712h = str3;
        this.f63714j = cVar;
        this.f63715k = new HashMap<>();
        this.f63716l = new HashMap<>();
    }

    public static c a(String str, long j8, long j14, g gVar, String[] strArr, String str2, String str3, c cVar) {
        return new c(str, null, j8, j14, gVar, strArr, str2, str3, cVar);
    }

    public static c b(String str) {
        return new c(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder f(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            ea.a.b bVar = new ea.a.b();
            bVar.f63568a = new SpannableStringBuilder();
            treeMap.put(str, bVar);
        }
        CharSequence charSequence = ((ea.a.b) treeMap.get(str)).f63568a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c c(int i14) {
        ArrayList arrayList = this.f63717m;
        if (arrayList != null) {
            return (c) arrayList.get(i14);
        }
        o2.c.q();
        return null;
    }

    public final int d() {
        ArrayList arrayList = this.f63717m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z14) {
        String str = this.f63705a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z14 || zEquals || (zEquals2 && this.f63713i != null)) {
            long j8 = this.f63708d;
            if (j8 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j8));
            }
            long j14 = this.f63709e;
            if (j14 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j14));
            }
        }
        if (this.f63717m == null) {
            return;
        }
        for (int i14 = 0; i14 < this.f63717m.size(); i14++) {
            ((c) this.f63717m.get(i14)).e(treeSet, z14 || zEquals);
        }
    }

    public final boolean g(long j8) {
        long j14 = this.f63708d;
        long j15 = this.f63709e;
        if (j14 == C.TIME_UNSET && j15 == C.TIME_UNSET) {
            return true;
        }
        if (j14 <= j8 && j15 == C.TIME_UNSET) {
            return true;
        }
        if (j14 != C.TIME_UNSET || j8 >= j15) {
            return j14 <= j8 && j8 < j15;
        }
        return true;
    }

    public final void h(long j8, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f63712h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (g(j8) && TtmlNode.TAG_DIV.equals(this.f63705a) && (str2 = this.f63713i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i14 = 0; i14 < d(); i14++) {
            c(i14).h(j8, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0205  */
    /* JADX WARN: Code duplicated, block: B:146:0x0213  */
    /* JADX WARN: Code duplicated, block: B:148:0x0216  */
    /* JADX WARN: Code duplicated, block: B:150:0x0219  */
    /* JADX WARN: Code duplicated, block: B:151:0x021f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:165:0x0264  */
    /* JADX WARN: Code duplicated, block: B:168:0x027c  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:180:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    public final void i(long j8, Map map, Map map2, String str, TreeMap treeMap) {
        Iterator<Map.Entry<String, Integer>> it;
        int i14;
        c cVar;
        int i15;
        g gVarA;
        int i16;
        float f14;
        float f15;
        float f16;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i17;
        RelativeSizeSpan relativeSizeSpan;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        Map map3 = map;
        if (g(j8)) {
            String str2 = this.f63712h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator<Map.Entry<String, Integer>> it3 = this.f63716l.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<String, Integer> next = it3.next();
                String key = next.getKey();
                HashMap<String, Integer> map4 = this.f63715k;
                int iIntValue = map4.containsKey(key) ? map4.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    ea.a.b bVar = (ea.a.b) treeMap.get(key);
                    bVar.getClass();
                    e eVar = (e) map2.get(str3);
                    eVar.getClass();
                    int i27 = eVar.f63741j;
                    g gVarA2 = f.a(this.f63710f, this.f63711g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.f63568a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bVar.f63568a = spannableStringBuilder;
                    }
                    if (gVarA2 != null) {
                        int i28 = gVarA2.f63749h;
                        int i29 = 1;
                        if (((i28 == -1 && gVarA2.f63750i == -1) ? -1 : (i28 == 1 ? (char) 1 : (char) 0) | (gVarA2.f63750i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i30 = gVarA2.f63749h;
                            if (i30 != -1) {
                                if (i30 == i29) {
                                    i24 = i29;
                                } else {
                                    i24 = 0;
                                }
                                if (gVarA2.f63750i == i29) {
                                    i25 = 2;
                                } else {
                                    i25 = 0;
                                }
                                i26 = i24 | i25;
                            } else if (gVarA2.f63750i == -1) {
                                i26 = -1;
                                i29 = 1;
                            } else {
                                i29 = 1;
                                if (i30 == i29) {
                                    i24 = i29;
                                } else {
                                    i24 = 0;
                                }
                                if (gVarA2.f63750i == i29) {
                                    i25 = 2;
                                } else {
                                    i25 = 0;
                                }
                                i26 = i24 | i25;
                            }
                            StyleSpan styleSpan = new StyleSpan(i26);
                            i14 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i14 = 33;
                        }
                        if (gVarA2.f63747f == i29) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i14);
                        }
                        if (gVarA2.f63748g == i29) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i14);
                        }
                        if (gVarA2.f63744c) {
                            if (!gVarA2.f63744c) {
                                vb.h.z("Font color has not been defined.");
                                return;
                            }
                            ea.g.a(spannableStringBuilder, new ForegroundColorSpan(gVarA2.f63743b), iIntValue, iIntValue2);
                        }
                        if (gVarA2.f63746e) {
                            if (!gVarA2.f63746e) {
                                vb.h.z("Background color has not been defined.");
                                return;
                            }
                            ea.g.a(spannableStringBuilder, new BackgroundColorSpan(gVarA2.f63745d), iIntValue, iIntValue2);
                        }
                        if (gVarA2.f63742a != null) {
                            ea.g.a(spannableStringBuilder, new TypefaceSpan(gVarA2.f63742a), iIntValue, iIntValue2);
                        }
                        b bVar2 = gVarA2.f63759r;
                        if (bVar2 != null) {
                            int i34 = bVar2.f63702a;
                            if (i34 == -1) {
                                i34 = (i27 == 2 || i27 == 1) ? 3 : 1;
                                i19 = 1;
                            } else {
                                i19 = bVar2.f63703b;
                            }
                            int i35 = bVar2.f63704c;
                            if (i35 == -2) {
                                i35 = 1;
                            }
                            ea.g.a(spannableStringBuilder, new ea.h(i34, i19, i35), iIntValue, iIntValue2);
                        }
                        int i36 = gVarA2.f63754m;
                        if (i36 == 2) {
                            c cVar2 = this.f63714j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                g gVarA3 = f.a(cVar2.f63710f, cVar2.f63711g, map3);
                                if (gVarA3 != null && gVarA3.f63754m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.f63714j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    g gVarA4 = f.a(cVar3.f63710f, cVar3.f63711g, map3);
                                    if (gVarA4 != null && gVarA4.f63754m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iD = cVar3.d() - 1; iD >= 0; iD--) {
                                        arrayDeque.push(cVar3.c(iD));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.d() == 1) {
                                        i15 = 0;
                                        if (cVar.c(0).f63706b != null) {
                                            String str4 = cVar.c(0).f63706b;
                                            int i37 = z.f70071a;
                                            g gVarA5 = f.a(cVar.f63710f, cVar.f63711g, map3);
                                            int i38 = gVarA5 != null ? gVarA5.f63755n : -1;
                                            if (i38 == -1 && (gVarA = f.a(cVar2.f63710f, cVar2.f63711g, map3)) != null) {
                                                i38 = gVarA.f63755n;
                                            }
                                            spannableStringBuilder.setSpan(new ea.f(str4, i38), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    k.f("Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (gVarA2.f63758q == 1) {
                                ea.g.a(spannableStringBuilder, new ea.d(), iIntValue, iIntValue2);
                            }
                            i16 = gVarA2.f63751j;
                            f14 = 100.0f;
                            if (i16 != 1) {
                                it = it3;
                                f15 = 100.0f;
                                ea.g.a(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarA2.f63752k, true), iIntValue, iIntValue2);
                            } else if (i16 != 2) {
                                it = it3;
                                f15 = 100.0f;
                                ea.g.a(spannableStringBuilder, new RelativeSizeSpan(gVarA2.f63752k), iIntValue, iIntValue2);
                            } else if (i16 != 3) {
                                it = it3;
                                f15 = 100.0f;
                            } else {
                                float f17 = gVarA2.f63752k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i39 = i15;
                                sizeChange = f17;
                                i17 = i39;
                                while (i17 < length) {
                                    float f18 = f14;
                                    relativeSizeSpan = relativeSizeSpanArr[i17];
                                    Iterator<Map.Entry<String, Integer>> it4 = it3;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i18 = i17;
                                    } else {
                                        i18 = i17;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i17 = i18 + 1;
                                    f14 = f18;
                                    it3 = it4;
                                }
                                it = it3;
                                f15 = f14;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f63705a)) {
                                f16 = gVarA2.f63760s;
                                if (f16 != Float.MAX_VALUE) {
                                    bVar.f63584q = (f16 * (-90.0f)) / f15;
                                }
                                alignment = gVarA2.f63756o;
                                if (alignment != null) {
                                    bVar.f63570c = alignment;
                                }
                                alignment2 = gVarA2.f63757p;
                                if (alignment2 != null) {
                                    bVar.f63571d = alignment2;
                                }
                            }
                        } else if (i36 == 3 || i36 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i15 = 0;
                        if (gVarA2.f63758q == 1) {
                            ea.g.a(spannableStringBuilder, new ea.d(), iIntValue, iIntValue2);
                        }
                        i16 = gVarA2.f63751j;
                        f14 = 100.0f;
                        if (i16 != 1) {
                            it = it3;
                            f15 = 100.0f;
                            ea.g.a(spannableStringBuilder, new AbsoluteSizeSpan((int) gVarA2.f63752k, true), iIntValue, iIntValue2);
                        } else if (i16 != 2) {
                            it = it3;
                            f15 = 100.0f;
                            ea.g.a(spannableStringBuilder, new RelativeSizeSpan(gVarA2.f63752k), iIntValue, iIntValue2);
                        } else if (i16 != 3) {
                            it = it3;
                            f15 = 100.0f;
                        } else {
                            float f19 = gVarA2.f63752k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i310 = i15;
                            sizeChange = f19;
                            i17 = i310;
                            while (i17 < length) {
                                float f110 = f14;
                                relativeSizeSpan = relativeSizeSpanArr[i17];
                                Iterator<Map.Entry<String, Integer>> it5 = it3;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i18 = i17;
                                } else {
                                    i18 = i17;
                                }
                                i17 = i18 + 1;
                                f14 = f110;
                                it3 = it5;
                            }
                            it = it3;
                            f15 = f14;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f63705a)) {
                            f16 = gVarA2.f63760s;
                            if (f16 != Float.MAX_VALUE) {
                                bVar.f63584q = (f16 * (-90.0f)) / f15;
                            }
                            alignment = gVarA2.f63756o;
                            if (alignment != null) {
                                bVar.f63570c = alignment;
                            }
                            alignment2 = gVarA2.f63757p;
                            if (alignment2 != null) {
                                bVar.f63571d = alignment2;
                            }
                        }
                    }
                    it3 = it;
                }
                it = it3;
                it3 = it;
            }
            int i44 = 0;
            while (i44 < d()) {
                c(i44).i(j8, map3, map2, str3, treeMap);
                i44++;
                map3 = map;
            }
        }
    }

    public final void j(long j8, boolean z14, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f63715k;
        map.clear();
        HashMap<String, Integer> map2 = this.f63716l;
        map2.clear();
        String str2 = this.f63705a;
        if (TtmlNode.TAG_METADATA.equals(str2)) {
            return;
        }
        String str3 = this.f63712h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f63707c && z14) {
            SpannableStringBuilder spannableStringBuilderF = f(str4, treeMap);
            String str5 = this.f63706b;
            str5.getClass();
            spannableStringBuilderF.append((CharSequence) str5);
            return;
        }
        if (TtmlNode.TAG_BR.equals(str2) && z14) {
            f(str4, treeMap).append('\n');
            return;
        }
        if (g(j8)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((ea.a.b) entry.getValue()).f63568a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i14 = 0; i14 < d(); i14++) {
                c(i14).j(j8, z14 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderF2 = f(str4, treeMap);
                int length = spannableStringBuilderF2.length() - 1;
                while (length >= 0 && spannableStringBuilderF2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderF2.charAt(length) != '\n') {
                    spannableStringBuilderF2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((ea.a.b) entry2.getValue()).f63568a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
