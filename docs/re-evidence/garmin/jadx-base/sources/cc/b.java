package cc;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import fa.g;
import fa.k;
import fa.r;
import fa.z;
import j20.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f26653g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f26655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f26656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f26657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f26658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f26659f;

    public b(List<byte[]> list) {
        this.f26658e = -3.4028235E38f;
        this.f26659f = -3.4028235E38f;
        this.f26656c = new r();
        if (list == null || list.isEmpty()) {
            this.f26654a = false;
            this.f26655b = null;
            return;
        }
        this.f26654a = true;
        String strN = z.n(list.get(0));
        fa.a.a(strN.startsWith("Format:"));
        a aVarA = a.a(strN);
        aVarA.getClass();
        this.f26655b = aVarA;
        e(new r(list.get(1)), StandardCharsets.UTF_8);
    }

    public static int d(long j8, ArrayList arrayList, ArrayList arrayList2) {
        int i14;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i14 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j8) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j8) {
                i14 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i14, Long.valueOf(j8));
        arrayList2.add(i14, i14 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i14 - 1)));
        return i14;
    }

    public static long f(String str) {
        Matcher matcher = f26653g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        int i14 = z.f70071a;
        return (Long.parseLong(matcher.group(4)) * AbstractComponentTracker.LINGERING_TIMEOUT) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // yb.n
    public final int a() {
        return 1;
    }

    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, g<yb.c> gVar) {
        Layout.Alignment alignment;
        int i16;
        int i17;
        int i18;
        float f14;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        b bVar2 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r rVar = bVar2.f26656c;
        rVar.E(bArr, i14 + i15);
        rVar.G(i14);
        Charset charsetC = rVar.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z14 = bVar2.f26654a;
        if (!z14) {
            bVar2.e(rVar, charsetC);
        }
        a aVarA = z14 ? bVar2.f26655b : null;
        while (true) {
            String strH = rVar.h(charsetC);
            if (strH == null) {
                ArrayList arrayList3 = (bVar.f195664a == C.TIME_UNSET || !bVar.f195665b) ? null : new ArrayList();
                for (int i28 = 0; i28 < arrayList.size(); i28++) {
                    List list = (List) arrayList.get(i28);
                    if (!list.isEmpty() || i28 == 0) {
                        if (i28 == arrayList.size() - 1) {
                            x.h();
                            return;
                        }
                        long jLongValue = ((Long) arrayList2.get(i28)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i28 + 1)).longValue() - ((Long) arrayList2.get(i28)).longValue();
                        long j8 = bVar.f195664a;
                        if (j8 == C.TIME_UNSET || jLongValue >= j8) {
                            gVar.accept(new yb.c(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new yb.c(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        gVar.accept((yb.c) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                aVarA = a.a(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (aVarA == null) {
                        k.g("Skipping dialogue line before complete format: ".concat(strH));
                    } else {
                        int i29 = aVarA.f26652e;
                        fa.a.a(strH.startsWith("Dialogue:"));
                        String[] strArrSplit = strH.substring(9).split(",", i29);
                        if (strArrSplit.length != i29) {
                            k.g("Skipping dialogue line with fewer columns than format: ".concat(strH));
                        } else {
                            if (f(strArrSplit[aVarA.f26648a]) == C.TIME_UNSET) {
                                k.g("Skipping invalid timing: ".concat(strH));
                            } else {
                                long jF = f(strArrSplit[aVarA.f26649b]);
                                if (jF == C.TIME_UNSET) {
                                    k.g("Skipping invalid timing: ".concat(strH));
                                } else {
                                    LinkedHashMap linkedHashMap = bVar2.f26657d;
                                    c cVar = (linkedHashMap == null || (i27 = aVarA.f26650c) == -1) ? null : (c) linkedHashMap.get(strArrSplit[i27].trim());
                                    String str = strArrSplit[aVarA.f26651d];
                                    c.b bVarA = c.b.a(str);
                                    String strReplace = c.b.f26681c.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f15 = bVar2.f26658e;
                                    float f16 = bVar2.f26659f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    ea.a.b bVar3 = new ea.a.b();
                                    bVar3.f63568a = spannableString;
                                    if (cVar != null) {
                                        boolean z15 = cVar.f26666g;
                                        Integer num = cVar.f26663d;
                                        Integer num2 = cVar.f26662c;
                                        if (num2 != null) {
                                            i19 = 0;
                                            i24 = 33;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i19 = 0;
                                            i24 = 33;
                                        }
                                        if (cVar.f26669j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i19, spannableString.length(), i24);
                                        }
                                        float f17 = cVar.f26664e;
                                        if (f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                                            bVar3.f63578k = f17 / f16;
                                            bVar3.f63577j = 1;
                                        }
                                        boolean z16 = cVar.f26665f;
                                        if (z16 && z15) {
                                            i25 = 0;
                                            i26 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i25 = 0;
                                            i26 = 33;
                                            if (z16) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z15) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (cVar.f26667h) {
                                            spannableString.setSpan(new UnderlineSpan(), i25, spannableString.length(), i26);
                                        }
                                        if (cVar.f26668i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i25, spannableString.length(), i26);
                                        }
                                    } else {
                                        charsetC = charsetC;
                                        aVarA = aVarA;
                                        rVar = rVar;
                                    }
                                    int i30 = bVarA.f26685a;
                                    if (i30 == -1) {
                                        i30 = cVar != null ? cVar.f26661b : -1;
                                    }
                                    switch (i30) {
                                        case 0:
                                        default:
                                            fb1.c.r(i30, "Unknown alignment: ");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    bVar3.f63570c = alignment;
                                    int i34 = Integer.MIN_VALUE;
                                    switch (i30) {
                                        case 0:
                                        default:
                                            fb1.c.r(i30, "Unknown alignment: ");
                                        case -1:
                                            i16 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i16 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i16 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i16 = 2;
                                            break;
                                    }
                                    bVar3.f63576i = i16;
                                    switch (i30) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            fb1.c.r(i30, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i34 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i34 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i34 = 0;
                                            break;
                                    }
                                    bVar3.f63574g = i34;
                                    PointF pointF = bVarA.f26686b;
                                    if (pointF == null || f16 == -3.4028235E38f || f15 == -3.4028235E38f) {
                                        int i35 = bVar3.f63576i;
                                        float f18 = 0.05f;
                                        if (i35 != 0) {
                                            i17 = 1;
                                            if (i35 != 1) {
                                                i18 = 2;
                                                f14 = i35 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i18 = 2;
                                                f14 = 0.5f;
                                            }
                                        } else {
                                            i17 = 1;
                                            i18 = 2;
                                            f14 = 0.05f;
                                        }
                                        bVar3.f63575h = f14;
                                        if (i34 != 0) {
                                            f18 = i34 != i17 ? i34 != i18 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        bVar3.f63572e = f18;
                                        bVar3.f63573f = 0;
                                    } else {
                                        bVar3.f63575h = pointF.x / f15;
                                        bVar3.f63572e = pointF.y / f16;
                                        bVar3.f63573f = 0;
                                    }
                                    ea.a aVarA2 = bVar3.a();
                                    int iD = d(jF, arrayList2, arrayList);
                                    for (int iD2 = d(r14, arrayList2, arrayList); iD2 < iD; iD2++) {
                                        ((List) arrayList.get(iD2)).add(aVarA2);
                                    }
                                }
                            }
                        }
                    }
                    charsetC = charsetC;
                    aVarA = aVarA;
                    rVar = rVar;
                } else {
                    charsetC = charsetC;
                    aVarA = aVarA;
                    rVar = rVar;
                }
                bVar2 = this;
                aVarA = aVarA;
                charsetC = charsetC;
                rVar = rVar;
            }
        }
    }

    public final void e(r rVar, Charset charset) {
        while (true) {
            String strH = rVar.h(charset);
            if (strH == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strH)) {
                while (true) {
                    String strH2 = rVar.h(charset);
                    if (strH2 == null || (rVar.a() != 0 && rVar.c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == 2) {
                        String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                        lowerCase.getClass();
                        if (lowerCase.equals("playresx")) {
                            this.f26658e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (lowerCase.equals("playresy")) {
                            try {
                                this.f26659f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                c.a aVarA = null;
                while (true) {
                    String strH3 = rVar.h(charset);
                    if (strH3 == null || (rVar.a() != 0 && rVar.c(charset) == '[')) {
                        break;
                    }
                    if (strH3.startsWith("Format:")) {
                        aVarA = c.a.a(strH3);
                    } else if (strH3.startsWith("Style:")) {
                        if (aVarA == null) {
                            k.g("Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                        } else {
                            c cVarA = c.a(strH3, aVarA);
                            if (cVarA != null) {
                                linkedHashMap.put(cVarA.f26660a, cVarA);
                            }
                        }
                    }
                }
                this.f26657d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                k.f("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strH)) {
                return;
            }
        }
    }

    public b() {
        this(null);
    }
}
