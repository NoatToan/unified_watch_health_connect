package gc;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import fa.k;
import fa.r;
import fa.z;
import j20.x;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.text.StringSubstitutor;
import yb.n;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f76825a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f76826b = new b();

    @Override // yb.n
    public final int a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x020f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0230  */
    /* JADX WARN: Code duplicated, block: B:129:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0244  */
    /* JADX WARN: Code duplicated, block: B:132:0x024e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0256  */
    /* JADX WARN: Code duplicated, block: B:136:0x025e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0262  */
    /* JADX WARN: Code duplicated, block: B:139:0x026a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0271  */
    /* JADX WARN: Code duplicated, block: B:142:0x0279  */
    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0291  */
    /* JADX WARN: Code duplicated, block: B:152:0x0299  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:160:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:167:0x02da  */
    /* JADX WARN: Code duplicated, block: B:169:0x02df  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:174:0x030f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0320  */
    /* JADX WARN: Code duplicated, block: B:180:0x0329  */
    /* JADX WARN: Code duplicated, block: B:181:0x032b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0334  */
    /* JADX WARN: Code duplicated, block: B:185:0x0336  */
    /* JADX WARN: Code duplicated, block: B:188:0x033f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0347  */
    /* JADX WARN: Code duplicated, block: B:193:0x034c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0351  */
    /* JADX WARN: Code duplicated, block: B:196:0x0364  */
    /* JADX WARN: Code duplicated, block: B:237:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x02f7, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, fa.g<yb.c> gVar) {
        d dVarD;
        String strTrim;
        int i16;
        String string;
        int i17;
        Matcher matcher;
        String strGroup;
        byte b14;
        boolean z14;
        f fVar = this;
        r rVar = fVar.f76825a;
        rVar.E(bArr, i14 + i15);
        rVar.G(i14);
        ArrayList arrayList = new ArrayList();
        try {
            g.d(rVar);
            while (!TextUtils.isEmpty(rVar.h(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i18 = 0;
                int i19 = -1;
                int i24 = 0;
                byte b15 = -1;
                while (true) {
                    int i25 = 1;
                    if (b15 == -1) {
                        i24 = rVar.f70055b;
                        String strH = rVar.h(StandardCharsets.UTF_8);
                        if (strH == null) {
                            b15 = 0;
                        } else if ("STYLE".equals(strH)) {
                            b15 = 2;
                        } else {
                            b15 = strH.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        rVar.G(i24);
                        if (b15 == 0) {
                            yb.f.b(new h(arrayList2), bVar, gVar);
                            return;
                        }
                        if (b15 == 1) {
                            while (!TextUtils.isEmpty(rVar.h(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (b15 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    vb.h.s("A style block was found after the first cue.");
                                    return;
                                }
                                rVar.h(StandardCharsets.UTF_8);
                                b bVar2 = fVar.f76826b;
                                r rVar2 = bVar2.f76779a;
                                StringBuilder sb3 = bVar2.f76780b;
                                sb3.setLength(0);
                                int i26 = rVar.f70055b;
                                while (!TextUtils.isEmpty(rVar.h(StandardCharsets.UTF_8))) {
                                }
                                rVar2.E(rVar.f70054a, rVar.f70055b);
                                rVar2.G(i26);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    b.c(rVar2);
                                    if (rVar2.a() >= 5 && "::cue".equals(rVar2.s(5, StandardCharsets.UTF_8))) {
                                        int i27 = rVar2.f70055b;
                                        String strB = b.b(rVar2, sb3);
                                        if (strB == null) {
                                            strTrim = null;
                                        } else if ("{".equals(strB)) {
                                            rVar2.G(i27);
                                            strTrim = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i28 = rVar2.f70055b;
                                                int i29 = rVar2.f70056c;
                                                int i30 = i18;
                                                while (i28 < i29 && i30 == 0) {
                                                    int i34 = i28 + 1;
                                                    i30 = ((char) rVar2.f70054a[i28]) == ')' ? i25 : i18;
                                                    i28 = i34;
                                                }
                                                strTrim = rVar2.s((i28 - 1) - rVar2.f70055b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                strTrim = null;
                                            }
                                            if (!")".equals(b.b(rVar2, sb3))) {
                                                strTrim = null;
                                            }
                                        }
                                    } else {
                                        strTrim = null;
                                    }
                                    if (strTrim != null && "{".equals(b.b(rVar2, sb3))) {
                                        c cVar = new c();
                                        if (!"".equals(strTrim)) {
                                            int iIndexOf = strTrim.indexOf(91);
                                            if (iIndexOf != i19) {
                                                Matcher matcher2 = b.f76777c.matcher(strTrim.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    String strGroup2 = matcher2.group(i25);
                                                    strGroup2.getClass();
                                                    cVar.f76784d = strGroup2;
                                                }
                                                strTrim = strTrim.substring(i18, iIndexOf);
                                            }
                                            int i35 = z.f70071a;
                                            String[] strArrSplit = strTrim.split("\\.", i19);
                                            String str = strArrSplit[i18];
                                            int iIndexOf2 = str.indexOf(35);
                                            if (iIndexOf2 != i19) {
                                                cVar.f76782b = str.substring(i18, iIndexOf2);
                                                cVar.f76781a = str.substring(iIndexOf2 + 1);
                                            } else {
                                                cVar.f76782b = str;
                                            }
                                            if (strArrSplit.length > i25) {
                                                int length = strArrSplit.length;
                                                fa.a.a(length <= strArrSplit.length ? i25 : i18);
                                                cVar.f76783c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i25, length)));
                                            }
                                        }
                                        int i36 = i18;
                                        String strB2 = null;
                                        while (i36 == 0) {
                                            int i37 = rVar2.f70055b;
                                            strB2 = b.b(rVar2, sb3);
                                            int i38 = (strB2 == null || StringSubstitutor.DEFAULT_VAR_END.equals(strB2)) ? i25 : i18;
                                            if (i38 == 0) {
                                                rVar2.G(i37);
                                                b.c(rVar2);
                                                String strA = b.a(rVar2, sb3);
                                                if (!"".equals(strA) && ":".equals(b.b(rVar2, sb3))) {
                                                    b.c(rVar2);
                                                    StringBuilder sb4 = new StringBuilder();
                                                    boolean z15 = false;
                                                    while (true) {
                                                        if (z15) {
                                                            string = sb4.toString();
                                                        } else {
                                                            int i39 = rVar2.f70055b;
                                                            boolean z16 = z15;
                                                            String strB3 = b.b(rVar2, sb3);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if (StringSubstitutor.DEFAULT_VAR_END.equals(strB3) || ";".equals(strB3)) {
                                                                rVar2.G(i39);
                                                                z15 = true;
                                                            } else {
                                                                sb4.append(strB3);
                                                                z15 = z16;
                                                            }
                                                        }
                                                    }
                                                    if (string == null || "".equals(string)) {
                                                        i16 = 1;
                                                    } else {
                                                        int i44 = rVar2.f70055b;
                                                        String strB4 = b.b(rVar2, sb3);
                                                        if (";".equals(strB4)) {
                                                            if (TtmlNode.ATTR_TTS_COLOR.equals(strA)) {
                                                                i17 = 1;
                                                                cVar.f76786f = fa.e.a(string, true);
                                                                cVar.f76787g = true;
                                                            } else {
                                                                i17 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    cVar.f76788h = fa.e.a(string, true);
                                                                    cVar.f76789i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if (TtmlNode.COMBINE_ALL.equals(string)) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = true;
                                                                        }
                                                                        cVar.f76797q = z14;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if (TtmlNode.UNDERLINE.equals(string)) {
                                                                            i17 = 1;
                                                                            cVar.f76791k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        cVar.f76785e = Ascii.toLowerCase(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i17 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (TtmlNode.ITALIC.equals(string)) {
                                                                                cVar.f76793m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = b.f76778d.matcher(Ascii.toLowerCase(string));
                                                                            if (matcher.matches()) {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b14 = 0;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup3 = matcher.group(i16);
                                                                                        strGroup3.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup3);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b14 = 1;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup4 = matcher.group(i16);
                                                                                        strGroup4.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup4);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b14 = 2;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup5 = matcher.group(i16);
                                                                                        strGroup5.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup5);
                                                                                        break;
                                                                                }
                                                                                b14 = -1;
                                                                                switch (b14) {
                                                                                    case 0:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        x.h();
                                                                                        return;
                                                                                }
                                                                                String strGroup6 = matcher.group(i16);
                                                                                strGroup6.getClass();
                                                                                cVar.f76795o = Float.parseFloat(strGroup6);
                                                                            } else {
                                                                                k.g("Invalid font-size: '" + string + "'.");
                                                                            }
                                                                        }
                                                                    } else if (TtmlNode.BOLD.equals(string)) {
                                                                        i17 = 1;
                                                                        cVar.f76792l = 1;
                                                                    }
                                                                    i16 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    cVar.f76796p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f76796p = 2;
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = 1;
                                                                }
                                                            }
                                                            i16 = i17;
                                                        } else if (StringSubstitutor.DEFAULT_VAR_END.equals(strB4)) {
                                                            rVar2.G(i44);
                                                            if (TtmlNode.ATTR_TTS_COLOR.equals(strA)) {
                                                                i17 = 1;
                                                                cVar.f76786f = fa.e.a(string, true);
                                                                cVar.f76787g = true;
                                                            } else {
                                                                i17 = 1;
                                                                if ("background-color".equals(strA)) {
                                                                    cVar.f76788h = fa.e.a(string, true);
                                                                    cVar.f76789i = true;
                                                                } else if ("ruby-position".equals(strA)) {
                                                                    if ("text-combine-upright".equals(strA)) {
                                                                        if (TtmlNode.COMBINE_ALL.equals(string) || string.startsWith("digits")) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = false;
                                                                        }
                                                                        cVar.f76797q = z14;
                                                                    } else if ("text-decoration".equals(strA)) {
                                                                        if (TtmlNode.UNDERLINE.equals(string)) {
                                                                            i17 = 1;
                                                                            cVar.f76791k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(strA)) {
                                                                        cVar.f76785e = Ascii.toLowerCase(string);
                                                                    } else if ("font-weight".equals(strA)) {
                                                                        i17 = 1;
                                                                        if ("font-style".equals(strA)) {
                                                                            if (TtmlNode.ITALIC.equals(string)) {
                                                                                cVar.f76793m = 1;
                                                                            }
                                                                        } else if ("font-size".equals(strA)) {
                                                                            matcher = b.f76778d.matcher(Ascii.toLowerCase(string));
                                                                            if (matcher.matches()) {
                                                                                k.g("Invalid font-size: '" + string + "'.");
                                                                            } else {
                                                                                strGroup = matcher.group(2);
                                                                                strGroup.getClass();
                                                                                switch (strGroup.hashCode()) {
                                                                                    case 37:
                                                                                        if (!strGroup.equals("%")) {
                                                                                            b14 = 0;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup7 = matcher.group(i16);
                                                                                        strGroup7.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup7);
                                                                                        break;
                                                                                    case 3240:
                                                                                        if (!strGroup.equals("em")) {
                                                                                            b14 = 1;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup8 = matcher.group(i16);
                                                                                        strGroup8.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup8);
                                                                                        break;
                                                                                    case 3592:
                                                                                        if (!strGroup.equals("px")) {
                                                                                            b14 = 2;
                                                                                        }
                                                                                        switch (b14) {
                                                                                            case 0:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i16 = 1;
                                                                                                cVar.f76794n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                x.h();
                                                                                                return;
                                                                                        }
                                                                                        String strGroup9 = matcher.group(i16);
                                                                                        strGroup9.getClass();
                                                                                        cVar.f76795o = Float.parseFloat(strGroup9);
                                                                                        break;
                                                                                }
                                                                                b14 = -1;
                                                                                switch (b14) {
                                                                                    case 0:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i16 = 1;
                                                                                        cVar.f76794n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        x.h();
                                                                                        return;
                                                                                }
                                                                                String strGroup10 = matcher.group(i16);
                                                                                strGroup10.getClass();
                                                                                cVar.f76795o = Float.parseFloat(strGroup10);
                                                                            }
                                                                        }
                                                                    } else if (TtmlNode.BOLD.equals(string)) {
                                                                        i17 = 1;
                                                                        cVar.f76792l = 1;
                                                                    }
                                                                    i16 = 1;
                                                                } else if ("over".equals(string)) {
                                                                    cVar.f76796p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f76796p = 2;
                                                                    i16 = 1;
                                                                } else {
                                                                    i16 = 1;
                                                                }
                                                            }
                                                            i16 = i17;
                                                        } else {
                                                            i16 = 1;
                                                        }
                                                    }
                                                } else {
                                                    i16 = i25;
                                                }
                                            } else {
                                                i16 = i25;
                                            }
                                            i25 = i16;
                                            i36 = i38;
                                            i18 = 0;
                                        }
                                        int i45 = i25;
                                        if (StringSubstitutor.DEFAULT_VAR_END.equals(strB2)) {
                                            arrayList3.add(cVar);
                                        }
                                        i25 = i45;
                                        i18 = 0;
                                        i19 = -1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b15 == 3) {
                                Pattern pattern = e.f76801a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strH2 = rVar.h(charset);
                                if (strH2 == null) {
                                    dVarD = null;
                                } else {
                                    Pattern pattern2 = e.f76801a;
                                    Matcher matcher3 = pattern2.matcher(strH2);
                                    if (matcher3.matches()) {
                                        dVarD = e.d(null, matcher3, rVar, arrayList);
                                    } else {
                                        dVarD = null;
                                        String strH3 = rVar.h(charset);
                                        if (strH3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strH3);
                                            if (matcher4.matches()) {
                                                dVarD = e.d(strH2.trim(), matcher4, rVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (dVarD != null) {
                                    arrayList2.add(dVarD);
                                }
                            }
                            fVar = this;
                        }
                    }
                }
            }
        } catch (ParserException e4) {
            l2.t(e4);
        }
    }
}
