package gc;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import ea.i;
import fa.k;
import fa.r;
import fa.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f76801a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f76802b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f76803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f76804d;

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final androidx.browser.trusted.c f76805c = new androidx.browser.trusted.c(12);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f76806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76807b;

        private b(c cVar, int i14) {
            this.f76806a = cVar;
            this.f76807b = i14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f76811d;

        private c(String str, int i14, String str2, Set<String> set) {
            this.f76809b = i14;
            this.f76808a = str;
            this.f76810c = str2;
            this.f76811d = set;
        }

        public static c a(int i14, String str) {
            String str2;
            String strTrim = str.trim();
            fa.a.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(StringUtils.SPACE);
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            int i15 = z.f70071a;
            String[] strArrSplit = strTrim.split("\\.", -1);
            String str3 = strArrSplit[0];
            HashSet hashSet = new HashSet();
            for (int i16 = 1; i16 < strArrSplit.length; i16++) {
                hashSet.add(strArrSplit[i16]);
            }
            return new c(str3, i14, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.EMPTY_SET);
        }
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f76812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gc.c f76813b;

        public d(int i14, gc.c cVar) {
            this.f76812a = i14;
            this.f76813b = cVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            return Integer.compare(this.f76812a, dVar.f76812a);
        }
    }

    /* JADX INFO: renamed from: gc.e$e, reason: collision with other inner class name */
    public static final class C1547e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f76816c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f76814a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f76815b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76817d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f76818e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f76819f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76820g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f76821h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f76822i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f76823j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f76824k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0032  */
        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        /* JADX WARN: Code duplicated, block: B:29:0x004d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0053  */
        /* JADX WARN: Code duplicated, block: B:39:0x0069  */
        public final ea.a.b a() {
            Layout.Alignment alignment;
            float f14 = this.f76821h;
            float f15 = -3.4028235E38f;
            if (f14 == -3.4028235E38f) {
                int i14 = this.f76817d;
                if (i14 != 4) {
                    f14 = i14 != 5 ? 0.5f : 1.0f;
                } else {
                    f14 = 0.0f;
                }
            }
            int i15 = this.f76822i;
            if (i15 == Integer.MIN_VALUE) {
                int i16 = this.f76817d;
                if (i16 == 1) {
                    i15 = 0;
                } else if (i16 == 3) {
                    i15 = 2;
                } else if (i16 == 4) {
                    i15 = 0;
                } else if (i16 != 5) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
            }
            ea.a.b bVar = new ea.a.b();
            int i17 = this.f76817d;
            if (i17 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i17 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i17 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i17 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i17 != 5) {
                fb1.c.r(i17, "Unknown textAlignment: ");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            bVar.f63570c = alignment;
            float f16 = this.f76818e;
            int i18 = this.f76819f;
            if (f16 != -3.4028235E38f && i18 == 0 && (f16 < 0.0f || f16 > 1.0f)) {
                f15 = 1.0f;
            } else if (f16 != -3.4028235E38f) {
                f15 = f16;
            } else if (i18 == 0) {
                f15 = 1.0f;
            }
            bVar.f63572e = f15;
            bVar.f63573f = i18;
            bVar.f63574g = this.f76820g;
            bVar.f63575h = f14;
            bVar.f63576i = i15;
            float f17 = this.f76823j;
            if (i15 == 0) {
                f14 = 1.0f - f14;
            } else if (i15 == 1) {
                f14 = f14 <= 0.5f ? f14 * 2.0f : (1.0f - f14) * 2.0f;
            } else if (i15 != 2) {
                vb.h.z(String.valueOf(i15));
                return null;
            }
            bVar.f63579l = Math.min(f17, f14);
            bVar.f63583p = this.f76824k;
            CharSequence charSequence = this.f76816c;
            if (charSequence != null) {
                bVar.f63568a = charSequence;
            }
            return bVar;
        }
    }

    static {
        HashMap map = new HashMap();
        fb1.c.q(255, 255, 255, map, "white");
        fb1.c.q(0, 255, 0, map, "lime");
        fb1.c.q(0, 255, 255, map, "cyan");
        fb1.c.q(255, 0, 0, map, "red");
        fb1.c.q(255, 255, 0, map, "yellow");
        fb1.c.q(255, 0, 255, map, "magenta");
        fb1.c.q(0, 0, 255, map, "blue");
        fb1.c.q(0, 0, 0, map, "black");
        f76803c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        fb1.c.q(255, 255, 255, map2, "bg_white");
        fb1.c.q(0, 255, 0, map2, "bg_lime");
        fb1.c.q(0, 255, 255, map2, "bg_cyan");
        fb1.c.q(255, 0, 0, map2, "bg_red");
        fb1.c.q(255, 255, 0, map2, "bg_yellow");
        fb1.c.q(255, 0, 255, map2, "bg_magenta");
        fb1.c.q(0, 0, 255, map2, "bg_blue");
        fb1.c.q(0, 0, 0, map2, "bg_black");
        f76804d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<gc.c> list2) {
        int i14;
        int i15;
        int i16;
        int i17 = cVar.f76809b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f76808a;
        str2.getClass();
        int i18 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i17, length, 33);
                break;
            case "c":
                for (String str3 : cVar.f76811d) {
                    Map<String, Integer> map = f76803c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i17, length, 33);
                    } else {
                        Map<String, Integer> map2 = f76804d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i17, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i17, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i17, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new i(cVar.f76810c), i17, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, cVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, b.f76805c);
                int i19 = cVar.f76809b;
                int i24 = 0;
                int length2 = 0;
                while (i24 < arrayList.size()) {
                    if ("rt".equals(((b) arrayList.get(i24)).f76806a.f76808a)) {
                        b bVar = (b) arrayList.get(i24);
                        int iC2 = c(list2, str, bVar.f76806a);
                        if (iC2 == i18) {
                            iC2 = iC != i18 ? iC : 1;
                        }
                        int i25 = bVar.f76806a.f76809b - length2;
                        int i26 = bVar.f76807b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i25, i26);
                        spannableStringBuilder.delete(i25, i26);
                        spannableStringBuilder.setSpan(new ea.f(charSequenceSubSequence.toString(), iC2), i19, i25, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i19 = i25;
                    }
                    i24++;
                    i18 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, cVar);
        for (int i27 = 0; i27 < arrayListB.size(); i27++) {
            gc.c cVar2 = ((d) arrayListB.get(i27)).f76813b;
            if (cVar2 != null) {
                int i28 = cVar2.f76792l;
                if (i28 == -1 && cVar2.f76793m == -1) {
                    i14 = -1;
                } else {
                    i14 = (cVar2.f76793m == 1 ? (char) 2 : (char) 0) | (i28 == 1 ? (char) 1 : (char) 0);
                }
                if (i14 != -1) {
                    int i29 = cVar2.f76792l;
                    if (i29 == -1 && cVar2.f76793m == -1) {
                        i16 = -1;
                        i15 = 1;
                    } else {
                        i15 = 1;
                        i16 = (i29 == 1 ? 1 : 0) | (cVar2.f76793m == 1 ? 2 : 0);
                    }
                    ea.g.a(spannableStringBuilder, new StyleSpan(i16), i17, length);
                } else {
                    i15 = 1;
                }
                if (cVar2.f76790j == i15) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i17, length, 33);
                }
                if (cVar2.f76791k == i15) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i17, length, 33);
                }
                if (cVar2.f76787g) {
                    if (!cVar2.f76787g) {
                        vb.h.z("Font color not defined");
                        return;
                    }
                    ea.g.a(spannableStringBuilder, new ForegroundColorSpan(cVar2.f76786f), i17, length);
                }
                if (cVar2.f76789i) {
                    if (!cVar2.f76789i) {
                        vb.h.z("Background color not defined.");
                        return;
                    }
                    ea.g.a(spannableStringBuilder, new BackgroundColorSpan(cVar2.f76788h), i17, length);
                }
                if (cVar2.f76785e != null) {
                    ea.g.a(spannableStringBuilder, new TypefaceSpan(cVar2.f76785e), i17, length);
                }
                int i30 = cVar2.f76794n;
                if (i30 == 1) {
                    ea.g.a(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar2.f76795o, true), i17, length);
                } else if (i30 == 2) {
                    ea.g.a(spannableStringBuilder, new RelativeSizeSpan(cVar2.f76795o), i17, length);
                } else if (i30 == 3) {
                    ea.g.a(spannableStringBuilder, new RelativeSizeSpan(cVar2.f76795o / 100.0f), i17, length);
                }
                if (cVar2.f76797q) {
                    spannableStringBuilder.setSpan(new ea.d(), i17, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, c cVar) {
        ?? r14;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < list.size(); i14++) {
            gc.c cVar2 = (gc.c) list.get(i14);
            String str2 = cVar.f76808a;
            Set<String> set = cVar.f76811d;
            String str3 = cVar.f76810c;
            if (cVar2.f76781a.isEmpty() && cVar2.f76782b.isEmpty() && cVar2.f76783c.isEmpty() && cVar2.f76784d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = gc.c.a(gc.c.a(gc.c.a(0, cVar2.f76781a, str, 1073741824), cVar2.f76782b, str2, 2), cVar2.f76784d, str3, 4);
                if (iA == -1 || !set.containsAll(cVar2.f76783c)) {
                    r14 = 0;
                } else {
                    size = iA + (cVar2.f76783c.size() * 4);
                }
            }
            if (r14 > 0) {
                r14 = size;
                r14 = zIsEmpty;
                arrayList.add(new d(r14, cVar2));
            } else {
                r14 = size;
                r14 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<gc.c> list, String str, c cVar) {
        ArrayList arrayListB = b(list, str, cVar);
        for (int i14 = 0; i14 < arrayListB.size(); i14++) {
            int i15 = ((d) arrayListB.get(i14)).f76813b.f76796p;
            if (i15 != -1) {
                return i15;
            }
        }
        return -1;
    }

    public static gc.d d(String str, Matcher matcher, r rVar, ArrayList arrayList) {
        C1547e c1547e = new C1547e();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c1547e.f76814a = g.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c1547e.f76815b = g.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, c1547e);
            StringBuilder sb3 = new StringBuilder();
            rVar.getClass();
            String strH = rVar.h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strH)) {
                if (sb3.length() > 0) {
                    sb3.append("\n");
                }
                sb3.append(strH.trim());
                strH = rVar.h(StandardCharsets.UTF_8);
            }
            c1547e.f76816c = f(str, sb3.toString(), arrayList);
            return new gc.d(c1547e.a().a(), c1547e.f76814a, c1547e.f76815b);
        } catch (NumberFormatException unused) {
            k.g("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, C1547e c1547e) {
        Matcher matcher = f76802b.matcher(str);
        while (matcher.find()) {
            int i14 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, c1547e);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i14 = 2;
                                break;
                            case "end":
                                i14 = 3;
                                break;
                            case "left":
                                i14 = 4;
                                break;
                            case "right":
                                i14 = 5;
                                break;
                            case "start":
                                break;
                            default:
                                k.g("Invalid alignment value: ".concat(strGroup2));
                                i14 = 2;
                                break;
                        }
                        c1547e.f76817d = i14;
                    } else if (ModelSourceWrapper.POSITION.equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i14 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    break;
                                case "line-right":
                                case "end":
                                    i14 = 2;
                                    break;
                                default:
                                    k.g("Invalid anchor value: ".concat(strSubstring));
                                    i14 = Integer.MIN_VALUE;
                                    break;
                            }
                            c1547e.f76822i = i14;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c1547e.f76821h = g.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c1547e.f76823j = g.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i14 = 2;
                        } else if (!strGroup2.equals("rl")) {
                            k.g("Invalid 'vertical' value: ".concat(strGroup2));
                            i14 = Integer.MIN_VALUE;
                        }
                        c1547e.f76824k = i14;
                    } else {
                        k.g("Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                k.g("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List<gc.c> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (i14 < str2.length()) {
            char cCharAt = str2.charAt(i14);
            if (cCharAt == '&') {
                i14++;
                int iIndexOf = str2.indexOf(59, i14);
                int iIndexOf2 = str2.indexOf(32, i14);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i14, iIndexOf);
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            k.g("ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) StringUtils.SPACE);
                    }
                    i14 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i14++;
            } else {
                int i15 = i14 + 1;
                if (i15 >= str2.length()) {
                    i14 = i15;
                } else {
                    boolean z14 = str2.charAt(i15) == '/';
                    int iIndexOf3 = str2.indexOf(62, i15);
                    int length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i16 = length - 2;
                    boolean z15 = str2.charAt(i16) == '/';
                    int i17 = i14 + (z14 ? 2 : 1);
                    if (!z15) {
                        i16 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i17, i16);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim = strSubstring2.trim();
                        fa.a.a(!strTrim.isEmpty());
                        int i18 = z.f70071a;
                        String str3 = strTrim.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (z14) {
                                    while (!arrayDeque.isEmpty()) {
                                        c cVar = (c) arrayDeque.pop();
                                        a(str, cVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                        }
                                        if (cVar.f76808a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else {
                                    if (!z15) {
                                        arrayDeque.push(c.a(spannableStringBuilder.length(), strSubstring2));
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    i14 = length;
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        a(str, c.b(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static void g(String str, C1547e c1547e) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            int i14 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i14 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i14 = 0;
                    break;
                default:
                    k.g("Invalid anchor value: ".concat(strSubstring));
                    i14 = Integer.MIN_VALUE;
                    break;
            }
            c1547e.f76820g = i14;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c1547e.f76818e = g.b(str);
            c1547e.f76819f = 0;
        } else {
            c1547e.f76818e = Integer.parseInt(str);
            c1547e.f76819f = 1;
        }
    }
}
