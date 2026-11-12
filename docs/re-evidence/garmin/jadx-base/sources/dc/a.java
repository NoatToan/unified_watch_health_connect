package dc;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import fa.g;
import fa.k;
import fa.r;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vb.h;
import yb.c;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f59100d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f59101e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f59102a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f59103b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f59104c = new r();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    public static ea.a d(Spanned spanned, String str) {
        float f14;
        ea.a.b bVar = new ea.a.b();
        bVar.f63568a = spanned;
        if (str == null) {
            return bVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 0;
                }
                break;
            case -685620679:
                str.equals("{\\an2}");
                bVar.f63576i = 1;
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 2;
                }
                break;
            case -685620617:
                if (!str.equals("{\\an4}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 0;
                }
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVar.f63576i = 1;
                break;
            case -685620555:
                if (!str.equals("{\\an6}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 2;
                }
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 0;
                }
                break;
            case -685620493:
                str.equals("{\\an8}");
                bVar.f63576i = 1;
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVar.f63576i = 1;
                } else {
                    bVar.f63576i = 2;
                }
                break;
            default:
                bVar.f63576i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (!str.equals("{\\an1}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 2;
                }
                break;
            case -685620679:
                if (!str.equals("{\\an2}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 2;
                }
                break;
            case -685620648:
                if (!str.equals("{\\an3}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 2;
                }
                break;
            case -685620617:
                str.equals("{\\an4}");
                bVar.f63574g = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                bVar.f63574g = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                bVar.f63574g = 1;
                break;
            case -685620524:
                if (!str.equals("{\\an7}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 0;
                }
                break;
            case -685620493:
                if (!str.equals("{\\an8}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 0;
                }
                break;
            case -685620462:
                if (!str.equals("{\\an9}")) {
                    bVar.f63574g = 1;
                } else {
                    bVar.f63574g = 0;
                }
                break;
            default:
                bVar.f63574g = 1;
                break;
        }
        int i14 = bVar.f63576i;
        float f15 = 0.08f;
        if (i14 == 0) {
            f14 = 0.08f;
        } else if (i14 == 1) {
            f14 = 0.5f;
        } else {
            if (i14 != 2) {
                h.w();
                return null;
            }
            f14 = 0.92f;
        }
        bVar.f63575h = f14;
        int i15 = bVar.f63574g;
        if (i15 != 0) {
            if (i15 == 1) {
                f15 = 0.5f;
            } else {
                if (i15 != 2) {
                    h.w();
                    return null;
                }
                f15 = 0.92f;
            }
        }
        bVar.f63572e = f15;
        bVar.f63573f = 0;
        return bVar.a();
    }

    public static long e(Matcher matcher, int i14) {
        String strGroup = matcher.group(i14 + 1);
        long j8 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i14 + 2);
        strGroup2.getClass();
        long j14 = (Long.parseLong(strGroup2) * 60000) + j8;
        String strGroup3 = matcher.group(i14 + 3);
        strGroup3.getClass();
        long j15 = (Long.parseLong(strGroup3) * 1000) + j14;
        String strGroup4 = matcher.group(i14 + 4);
        if (strGroup4 != null) {
            j15 += Long.parseLong(strGroup4);
        }
        return j15 * 1000;
    }

    @Override // yb.n
    public final int a() {
        return 1;
    }

    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, g<c> gVar) {
        String str;
        a aVar = this;
        r rVar = aVar.f59104c;
        rVar.E(bArr, i14 + i15);
        rVar.G(i14);
        Charset charsetC = rVar.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        long j8 = bVar.f195664a;
        long j14 = C.TIME_UNSET;
        ArrayList arrayList = (j8 == C.TIME_UNSET || !bVar.f195665b) ? null : new ArrayList();
        while (true) {
            String strH = rVar.h(charsetC);
            if (strH == null) {
                break;
            }
            if (strH.length() != 0) {
                try {
                    Integer.parseInt(strH);
                    String strH2 = rVar.h(charsetC);
                    if (strH2 == null) {
                        k.g("Unexpected end");
                        break;
                    }
                    Matcher matcher = f59100d.matcher(strH2);
                    if (matcher.matches()) {
                        long jE = e(matcher, 1);
                        long jE2 = e(matcher, 6);
                        StringBuilder sb3 = aVar.f59102a;
                        int i16 = 0;
                        sb3.setLength(0);
                        ArrayList<String> arrayList2 = aVar.f59103b;
                        arrayList2.clear();
                        String strH3 = rVar.h(charsetC);
                        while (!TextUtils.isEmpty(strH3)) {
                            if (sb3.length() > 0) {
                                sb3.append("<br>");
                            }
                            String strTrim = strH3.trim();
                            long j15 = j14;
                            StringBuilder sb4 = new StringBuilder(strTrim);
                            int i17 = i16;
                            for (Matcher matcher2 = f59101e.matcher(strTrim); matcher2.find(); matcher2 = matcher2) {
                                String strGroup = matcher2.group();
                                arrayList2.add(strGroup);
                                int iStart = matcher2.start() - i17;
                                int length = strGroup.length();
                                sb4.replace(iStart, iStart + length, "");
                                i17 += length;
                            }
                            sb3.append(sb4.toString());
                            j14 = j15;
                            strH3 = rVar.h(charsetC);
                            i16 = 0;
                        }
                        long j16 = j14;
                        Spanned spannedFromHtml = Html.fromHtml(sb3.toString());
                        int i18 = 0;
                        while (true) {
                            if (i18 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = arrayList2.get(i18);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        long j17 = bVar.f195664a;
                        if (j17 == j16 || jE >= j17) {
                            gVar.accept(new c(ImmutableList.of(d(spannedFromHtml, str)), jE, jE2 - jE));
                        } else if (arrayList != null) {
                            arrayList.add(new c(ImmutableList.of(d(spannedFromHtml, str)), jE, jE2 - jE));
                        }
                        aVar = this;
                        j14 = j16;
                    } else {
                        k.g("Skipping invalid timing: ".concat(strH2));
                        aVar = this;
                    }
                } catch (NumberFormatException unused) {
                    k.g("Skipping invalid index: ".concat(strH));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.accept((c) it.next());
            }
        }
    }
}
