package com.google.android.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.ui.a;
import com.google.common.collect.ImmutableMap;
import defpackage.ofc;
import defpackage.qac;
import defpackage.r0l;
import defpackage.rk1;
import defpackage.w7p;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8384a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f8386b;

        public b(String str, Map<String, String> map) {
            this.f8385a = str;
            this.f8386b = map;
        }
    }

    public static final class c {
        public static final Comparator<c> e = new Comparator() { // from class: i5n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a.c.e((a.c) obj, (a.c) obj2);
            }
        };
        public static final Comparator<c> f = new Comparator() { // from class: j5n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a.c.f((a.c) obj, (a.c) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8388b;
        public final String c;
        public final String d;

        public static /* synthetic */ int e(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f8388b, cVar.f8388b);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar.c.compareTo(cVar2.c);
            return iCompareTo != 0 ? iCompareTo : cVar.d.compareTo(cVar2.d);
        }

        public static /* synthetic */ int f(c cVar, c cVar2) {
            int iCompare = Integer.compare(cVar2.f8387a, cVar.f8387a);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = cVar2.c.compareTo(cVar.c);
            return iCompareTo != 0 ? iCompareTo : cVar2.d.compareTo(cVar.d);
        }

        public c(int i, int i2, String str, String str2) {
            this.f8387a = i;
            this.f8388b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<c> f8389a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c> f8390b = new ArrayList();
    }

    public static b a(CharSequence charSequence, float f) {
        if (charSequence == null) {
            return new b("", ImmutableMap.of());
        }
        if (!(charSequence instanceof Spanned)) {
            return new b(b(charSequence), ImmutableMap.of());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            StringBuilder sb = new StringBuilder(14);
            sb.append("bg_");
            sb.append(iIntValue);
            map.put(ofc.a(sb.toString()), wlq.D("background-color:%s;", ofc.b(iIntValue)));
        }
        SparseArray<d> sparseArrayC = c(spanned, f);
        StringBuilder sb2 = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < sparseArrayC.size()) {
            int iKeyAt = sparseArrayC.keyAt(i);
            sb2.append(b(spanned.subSequence(i2, iKeyAt)));
            d dVar = sparseArrayC.get(iKeyAt);
            Collections.sort(dVar.f8390b, c.f);
            Iterator it2 = dVar.f8390b.iterator();
            while (it2.hasNext()) {
                sb2.append(((c) it2.next()).d);
            }
            Collections.sort(dVar.f8389a, c.e);
            Iterator it3 = dVar.f8389a.iterator();
            while (it3.hasNext()) {
                sb2.append(((c) it3.next()).c);
            }
            i++;
            i2 = iKeyAt;
        }
        sb2.append(b(spanned.subSequence(i2, spanned.length())));
        return new b(sb2.toString(), map);
    }

    public static String b(CharSequence charSequence) {
        return f8384a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static SparseArray<d> c(Spanned spanned, float f) {
        SparseArray<d> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strE = e(obj, f);
            String strD = d(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strE != null) {
                rk1.e(strD);
                c cVar = new c(spanStart, spanEnd, strE, strD);
                f(sparseArray, spanStart).f8389a.add(cVar);
                f(sparseArray, spanEnd).f8390b.add(cVar);
            }
        }
        return sparseArray;
    }

    public static String d(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof qac) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof w7p)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof r0l) {
                String strB = b(((r0l) obj).f32055a);
                StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 16);
                sb.append("<rt>");
                sb.append(strB);
                sb.append("</rt></ruby>");
                return sb.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    public static String e(Object obj, float f) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return wlq.D("<span style='color:%s;'>", ofc.b(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return wlq.D("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof qac) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            return wlq.D("<span style='font-size:%.2fpx;'>", Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f));
        }
        if (obj instanceof RelativeSizeSpan) {
            return wlq.D("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return wlq.D("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (!(obj instanceof r0l)) {
            if (obj instanceof UnderlineSpan) {
                return "<u>";
            }
            if (!(obj instanceof w7p)) {
                return null;
            }
            w7p w7pVar = (w7p) obj;
            return wlq.D("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", h(w7pVar.f37700a, w7pVar.f37701b), g(w7pVar.c));
        }
        int i = ((r0l) obj).f32056b;
        if (i == -1) {
            return "<ruby style='ruby-position:unset;'>";
        }
        if (i == 1) {
            return "<ruby style='ruby-position:over;'>";
        }
        if (i != 2) {
            return null;
        }
        return "<ruby style='ruby-position:under;'>";
    }

    public static d f(SparseArray<d> sparseArray, int i) {
        d dVar = sparseArray.get(i);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        sparseArray.put(i, dVar2);
        return dVar2;
    }

    public static String g(int i) {
        return i != 2 ? "over right" : "under left";
    }

    public static String h(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append("circle");
        } else if (i == 2) {
            sb.append("dot");
        } else if (i != 3) {
            sb.append("unset");
        } else {
            sb.append("sesame");
        }
        return sb.toString();
    }
}
