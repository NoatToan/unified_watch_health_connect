package defpackage;

import android.graphics.Color;
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
import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class pcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30260a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30261b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map<String, Integer> c;
    public static final Map<String, Integer> d;

    public static class b {
        public static final Comparator<b> c = new Comparator() { // from class: qcr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return pcr.b.e((pcr.b) obj, (pcr.b) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f30262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30263b;

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.f30262a.f30265b, bVar2.f30262a.f30265b);
        }

        public b(c cVar, int i) {
            this.f30262a = cVar;
            this.f30263b = i;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f30264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30265b;
        public final String c;
        public final Set<String> d;

        public c(String str, int i, String str2, Set<String> set) {
            this.f30265b = i;
            this.f30264a = str;
            this.c = str2;
            this.d = set;
        }

        public static c a(String str, int i) {
            String str2;
            String strTrim = str.trim();
            rk1.a(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrM0 = wlq.M0(strTrim, z.f14007a);
            String str3 = strArrM0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrM0.length; i2++) {
                hashSet.add(strArrM0[i2]);
            }
            return new c(str3, i, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ncr f30267b;

        public d(int i, ncr ncrVar) {
            this.f30266a = i;
            this.f30267b = ncrVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.f30266a, dVar.f30266a);
        }
    }

    public static final class e {
        public CharSequence c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f30268a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f30269b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f30270k = Integer.MIN_VALUE;

        public static float b(float f, int i) {
            if (f != -3.4028235E38f && i == 0 && (f < 0.0f || f > 1.0f)) {
                return 1.0f;
            }
            if (f != -3.4028235E38f) {
                return f;
            }
            return i == 0 ? 1.0f : -3.4028235E38f;
        }

        public static Layout.Alignment c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Unknown textAlignment: ");
                            sb.append(i);
                            toe.h("WebvttCueParser", sb.toString());
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public static float e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public ocr a() {
            return new ocr(g().a(), this.f30268a, this.f30269b);
        }

        public h55.b g() {
            float fE = this.h;
            if (fE == -3.4028235E38f) {
                fE = e(this.d);
            }
            int iF = this.i;
            if (iF == Integer.MIN_VALUE) {
                iF = f(this.d);
            }
            h55.b bVarR = new h55.b().p(c(this.d)).h(b(this.e, this.f), this.f).i(this.g).k(fE).l(iF).n(Math.min(this.j, d(iF, fE))).r(this.f30270k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                bVarR.o(charSequence);
            }
            return bVarR;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append(Typography.greater);
                break;
            case "lt":
                spannableStringBuilder.append(Typography.less);
                break;
            case "amp":
                spannableStringBuilder.append(Typography.amp);
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                StringBuilder sb = new StringBuilder(str.length() + 33);
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                toe.h("WebvttCueParser", sb.toString());
                break;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List<b> list, List<ncr> list2) {
        int i = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.c);
        int i2 = cVar.f30265b;
        int length = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((b) arrayList.get(i3)).f30262a.f30264a)) {
                b bVar = (b) arrayList.get(i3);
                int iG = g(i(list2, str, bVar.f30262a), i, 1);
                int i4 = bVar.f30262a.f30265b - length;
                int i5 = bVar.f30263b - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i4, i5);
                spannableStringBuilder.delete(i4, i5);
                spannableStringBuilder.setSpan(new r0l(charSequenceSubSequence.toString(), iG), i2, i4, 33);
                length += charSequenceSubSequence.length();
                i2 = i4;
            }
        }
    }

    public static void d(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<ncr> list2) {
        int i = cVar.f30265b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f30264a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<d> listH = h(list2, str, cVar);
        for (int i2 = 0; i2 < listH.size(); i2++) {
            e(spannableStringBuilder, listH.get(i2).f30267b, i, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, ncr ncrVar, int i, int i2) {
        if (ncrVar == null) {
            return;
        }
        if (ncrVar.i() != -1) {
            d5n.a(spannableStringBuilder, new StyleSpan(ncrVar.i()), i, i2, 33);
        }
        if (ncrVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ncrVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ncrVar.k()) {
            d5n.a(spannableStringBuilder, new ForegroundColorSpan(ncrVar.c()), i, i2, 33);
        }
        if (ncrVar.j()) {
            d5n.a(spannableStringBuilder, new BackgroundColorSpan(ncrVar.a()), i, i2, 33);
        }
        if (ncrVar.d() != null) {
            d5n.a(spannableStringBuilder, new TypefaceSpan(ncrVar.d()), i, i2, 33);
        }
        int iF = ncrVar.f();
        if (iF == 1) {
            d5n.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ncrVar.e(), true), i, i2, 33);
        } else if (iF == 2) {
            d5n.a(spannableStringBuilder, new RelativeSizeSpan(ncrVar.e()), i, i2, 33);
        } else if (iF == 3) {
            d5n.a(spannableStringBuilder, new RelativeSizeSpan(ncrVar.e() / 100.0f), i, i2, 33);
        }
        if (ncrVar.b()) {
            spannableStringBuilder.setSpan(new qac(), i, i2, 33);
        }
    }

    public static int f(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static List<d> h(List<ncr> list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ncr ncrVar = list.get(i);
            int iH = ncrVar.h(str, cVar.f30264a, cVar.d, cVar.c);
            if (iH > 0) {
                arrayList.add(new d(iH, ncrVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List<ncr> list, String str, c cVar) {
        List<d> listH = h(list, str, cVar);
        for (int i = 0; i < listH.size(); i++) {
            ncr ncrVar = listH.get(i).f30267b;
            if (ncrVar.g() != -1) {
                return ncrVar.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String strTrim = str.trim();
        rk1.a(!strTrim.isEmpty());
        return wlq.N0(strTrim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static h55 l(CharSequence charSequence) {
        e eVar = new e();
        eVar.c = charSequence;
        return eVar.g().a();
    }

    public static ocr m(okh okhVar, List<ncr> list) {
        String strP = okhVar.p();
        if (strP == null) {
            return null;
        }
        Pattern pattern = f30260a;
        Matcher matcher = pattern.matcher(strP);
        if (matcher.matches()) {
            return n(null, matcher, okhVar, list);
        }
        String strP2 = okhVar.p();
        if (strP2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strP2);
        if (matcher2.matches()) {
            return n(strP.trim(), matcher2, okhVar, list);
        }
        return null;
    }

    public static ocr n(String str, Matcher matcher, okh okhVar, List<ncr> list) {
        e eVar = new e();
        try {
            eVar.f30268a = tcr.d((String) rk1.e(matcher.group(1)));
            eVar.f30269b = tcr.d((String) rk1.e(matcher.group(2)));
            p((String) rk1.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String strP = okhVar.p();
            while (!TextUtils.isEmpty(strP)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strP.trim());
                strP = okhVar.p();
            }
            eVar.c = q(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            toe.h("WebvttCueParser", strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    public static h55.b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    public static void p(String str, e eVar) {
        Matcher matcher = f30261b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) rk1.e(matcher.group(1));
            String str3 = (String) rk1.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if (MediaStoreUtil.MediaInfo.SIZE.equals(str2)) {
                    eVar.j = tcr.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f30270k = w(str3);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21 + String.valueOf(str3).length());
                    sb.append("Unknown cue setting ");
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str3);
                    toe.h("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String strValueOf = String.valueOf(matcher.group());
                toe.h("WebvttCueParser", strValueOf.length() != 0 ? "Skipping bad cue setting: ".concat(strValueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    public static SpannedString q(String str, String str2, List<ncr> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    b(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iF = i + 1;
                if (iF < str2.length()) {
                    boolean z = str2.charAt(iF) == '/';
                    iF = f(str2, iF);
                    int i2 = iF - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iF - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strJ = j(strSubstring);
                        if (k(strJ)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length()));
                                    }
                                    if (cVar.f30264a.equals(strJ)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(c.a(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iF;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                toe.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.g = r(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = tcr.c(str);
            eVar.f = 0;
        } else {
            eVar.e = Integer.parseInt(str);
            eVar.f = 1;
        }
    }

    public static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                toe.h("WebvttCueParser", str.length() != 0 ? "Invalid anchor value: ".concat(str) : new String("Invalid anchor value: "));
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, e eVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            eVar.i = t(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        eVar.h = tcr.c(str);
    }

    public static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                toe.h("WebvttCueParser", str.length() != 0 ? "Invalid alignment value: ".concat(str) : new String("Invalid alignment value: "));
                return 2;
        }
    }

    public static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        toe.h("WebvttCueParser", str.length() != 0 ? "Invalid 'vertical' value: ".concat(str) : new String("Invalid 'vertical' value: "));
        return Integer.MIN_VALUE;
    }
}
