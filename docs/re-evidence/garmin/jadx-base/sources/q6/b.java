package q6;

import androidx.constraintlayout.core.parser.CLParsingException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o6.q;
import r6.i;
import r6.j;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a implements InterfaceC2691b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f143054a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f143056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f143057d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f143059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f143060g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f143055b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f143058e = 0.0f;

        public a(float f14, float f15, float f16, String str, String str2) {
            this.f143054a = f16;
            this.f143056c = str == null ? "" : str;
            this.f143057d = str2 == null ? "" : str2;
            this.f143060g = f15;
            this.f143059f = f14;
        }

        @Override // q6.b.InterfaceC2691b
        public final float value() {
            float f14 = this.f143058e;
            if (f14 >= this.f143060g) {
                this.f143055b = true;
            }
            if (!this.f143055b) {
                this.f143058e = f14 + this.f143054a;
            }
            return this.f143058e;
        }
    }

    /* JADX INFO: renamed from: q6.b$b, reason: collision with other inner class name */
    public interface InterfaceC2691b {
        float value();
    }

    public static class c implements InterfaceC2691b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f143061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f143062b;

        public c(float f14, float f15) {
            this.f143061a = f15;
            this.f143062b = f14;
        }

        @Override // q6.b.InterfaceC2691b
        public final float value() {
            float f14 = this.f143062b + this.f143061a;
            this.f143062b = f14;
            return f14;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, Integer> f143063a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, InterfaceC2691b> f143064b = new HashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap<String, ArrayList<String>> f143065c = new HashMap<>();

        public final float a(p6.d dVar) {
            if (!(dVar instanceof p6.h)) {
                if (dVar instanceof p6.f) {
                    return ((p6.f) dVar).c();
                }
                return 0.0f;
            }
            String strB = ((p6.h) dVar).b();
            HashMap<String, InterfaceC2691b> map = this.f143064b;
            if (map.containsKey(strB)) {
                return map.get(strB).value();
            }
            HashMap<String, Integer> map2 = this.f143063a;
            if (map2.containsKey(strB)) {
                return map2.get(strB).floatValue();
            }
            return 0.0f;
        }
    }

    public static class e implements InterfaceC2691b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f143066a;

        public e(float f14) {
            this.f143066a = f14;
        }

        @Override // q6.b.InterfaceC2691b
        public final float value() {
            return this.f143066a;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(String str, p6.g gVar, q6.a aVar, d dVar, g gVar2) throws CLParsingException {
        byte b14;
        long j8;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                b14 = str.equals("centerVertically") ? (byte) 0 : (byte) -1;
                break;
            case -1364013995:
                b14 = str.equals(TtmlNode.CENTER) ? (byte) 1 : (byte) -1;
                break;
            case -1349088399:
                b14 = str.equals("custom") ? (byte) 2 : (byte) -1;
                break;
            case -1249320806:
                b14 = str.equals("rotationX") ? (byte) 3 : (byte) -1;
                break;
            case -1249320805:
                b14 = str.equals("rotationY") ? (byte) 4 : (byte) -1;
                break;
            case -1249320804:
                b14 = str.equals("rotationZ") ? (byte) 5 : (byte) -1;
                break;
            case -1225497657:
                b14 = str.equals("translationX") ? (byte) 6 : (byte) -1;
                break;
            case -1225497656:
                b14 = str.equals("translationY") ? (byte) 7 : (byte) -1;
                break;
            case -1225497655:
                b14 = str.equals("translationZ") ? (byte) 8 : (byte) -1;
                break;
            case -1221029593:
                b14 = str.equals("height") ? (byte) 9 : (byte) -1;
                break;
            case -1068318794:
                b14 = str.equals("motion") ? (byte) 10 : (byte) -1;
                break;
            case -987906986:
                b14 = str.equals("pivotX") ? Ascii.VT : (byte) -1;
                break;
            case -987906985:
                b14 = str.equals("pivotY") ? Ascii.FF : (byte) -1;
                break;
            case -908189618:
                b14 = str.equals("scaleX") ? Ascii.CR : (byte) -1;
                break;
            case -908189617:
                b14 = str.equals("scaleY") ? Ascii.SO : (byte) -1;
                break;
            case -247669061:
                b14 = str.equals("hRtlBias") ? Ascii.SI : (byte) -1;
                break;
            case -61505906:
                b14 = str.equals("vWeight") ? (byte) 16 : (byte) -1;
                break;
            case 92909918:
                b14 = str.equals("alpha") ? (byte) 17 : (byte) -1;
                break;
            case 98116417:
                b14 = str.equals("hBias") ? Ascii.DC2 : (byte) -1;
                break;
            case 111045711:
                b14 = str.equals("vBias") ? (byte) 19 : (byte) -1;
                break;
            case 113126854:
                b14 = str.equals("width") ? Ascii.DC4 : (byte) -1;
                break;
            case 398344448:
                b14 = str.equals("hWeight") ? Ascii.NAK : (byte) -1;
                break;
            case 1404070310:
                b14 = str.equals("centerHorizontally") ? Ascii.SYN : (byte) -1;
                break;
            case 1941332754:
                b14 = str.equals("visibility") ? Ascii.ETB : (byte) -1;
                break;
            default:
                b14 = -1;
                break;
        }
        switch (b14) {
            case 0:
                String strP = gVar.p(str);
                q6.a aVarC = strP.equals("parent") ? gVar2.c(0) : gVar2.c(strP);
                aVar.p(aVarC);
                aVar.e(aVarC);
                return;
            case 1:
                String strP2 = gVar.p(str);
                q6.a aVarC2 = strP2.equals("parent") ? gVar2.c(0) : gVar2.c(strP2);
                aVar.o(aVarC2);
                aVar.i(aVarC2);
                aVar.p(aVarC2);
                aVar.e(aVarC2);
                return;
            case 2:
                p6.d dVarN = gVar.n(str);
                p6.g gVar3 = dVarN instanceof p6.g ? (p6.g) dVarN : null;
                if (gVar3 == null) {
                    return;
                }
                for (String str2 : gVar3.t()) {
                    p6.d dVarJ = gVar3.j(str2);
                    if (dVarJ instanceof p6.f) {
                        float fC = dVarJ.c();
                        if (aVar.f143036j0 == null) {
                            aVar.f143036j0 = new HashMap<>();
                        }
                        aVar.f143036j0.put(str2, Float.valueOf(fC));
                    } else if (dVarJ instanceof p6.h) {
                        String strB = dVarJ.b();
                        if (strB.startsWith("#")) {
                            String strSubstring = strB.substring(1);
                            if (strSubstring.length() == 6) {
                                strSubstring = "FF".concat(strSubstring);
                            }
                            j8 = Long.parseLong(strSubstring, 16);
                        } else {
                            j8 = -1;
                        }
                        if (j8 != -1) {
                            aVar.f143034i0.put(str2, Integer.valueOf((int) j8));
                        }
                    }
                }
                return;
            case 3:
                aVar.f143052z = dVar.a(gVar.j(str));
                return;
            case 4:
                aVar.A = dVar.a(gVar.j(str));
                return;
            case 5:
                aVar.B = dVar.a(gVar.j(str));
                return;
            case 6:
                aVar.C = gVar2.f143084a.e(dVar.a(gVar.j(str)));
                return;
            case 7:
                aVar.D = gVar2.f143084a.e(dVar.a(gVar.j(str)));
                return;
            case 8:
                aVar.E = gVar2.f143084a.e(dVar.a(gVar.j(str)));
                return;
            case 9:
                aVar.f143028f0 = d(gVar, str, gVar2, gVar2.f143084a);
                return;
            case 10:
                p6.d dVarJ2 = gVar.j(str);
                if (dVarJ2 instanceof p6.g) {
                    p6.g gVar4 = (p6.g) dVarJ2;
                    q qVar = new q();
                    for (String str3 : gVar4.t()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                qVar.a(gVar4.l(str3), 600);
                                break;
                            case "easing":
                                qVar.c(603, gVar4.p(str3));
                                break;
                            case "quantize":
                                p6.d dVarJ3 = gVar4.j(str3);
                                if (dVarJ3 instanceof p6.a) {
                                    p6.a aVar2 = (p6.a) dVarJ3;
                                    int size = aVar2.f136192e.size();
                                    if (size > 0) {
                                        qVar.b(610, aVar2.getInt(0));
                                        if (size > 1) {
                                            qVar.c(611, aVar2.o(1));
                                            if (size > 2) {
                                                qVar.a(aVar2.getFloat(2), 602);
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    p6.d dVarJ4 = gVar4.j(str3);
                                    if (dVarJ4 == null) {
                                        StringBuilder sbL = hb.a.l("no int found for key <", str3, ">, found [");
                                        sbL.append(dVarJ4.e());
                                        sbL.append("] : ");
                                        sbL.append(dVarJ4);
                                        throw new CLParsingException(sbL.toString(), gVar4);
                                    }
                                    qVar.b(610, dVarJ4.d());
                                    break;
                                }
                                break;
                            case "pathArc":
                                String strP3 = gVar4.p(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= 6) {
                                        i14 = -1;
                                    } else if (!strArr[i14].equals(strP3)) {
                                        i14++;
                                    }
                                }
                                if (i14 != -1) {
                                    qVar.b(607, i14);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + strP3 + "'");
                                    break;
                                }
                                break;
                            case "relativeTo":
                                qVar.c(605, gVar4.p(str3));
                                break;
                        }
                    }
                    aVar.getClass();
                    return;
                }
                return;
            case 11:
                aVar.f143050x = dVar.a(gVar.j(str));
                return;
            case 12:
                aVar.f143051y = dVar.a(gVar.j(str));
                return;
            case 13:
                aVar.G = dVar.a(gVar.j(str));
                return;
            case 14:
                aVar.H = dVar.a(gVar.j(str));
                return;
            case 15:
                float fA = dVar.a(gVar.j(str));
                if (!gVar2.f143085b) {
                    fA = 1.0f - fA;
                }
                aVar.f143031h = fA;
                return;
            case 16:
                aVar.f143029g = dVar.a(gVar.j(str));
                return;
            case 17:
                aVar.F = dVar.a(gVar.j(str));
                return;
            case 18:
                aVar.f143031h = dVar.a(gVar.j(str));
                return;
            case 19:
                aVar.f143033i = dVar.a(gVar.j(str));
                return;
            case 20:
                aVar.f143026e0 = d(gVar, str, gVar2, gVar2.f143084a);
                return;
            case 21:
                aVar.f143027f = dVar.a(gVar.j(str));
                return;
            case 22:
                String strP4 = gVar.p(str);
                q6.a aVarC3 = strP4.equals("parent") ? gVar2.c(0) : gVar2.c(strP4);
                aVar.o(aVarC3);
                aVar.i(aVarC3);
                return;
            case 23:
                switch (gVar.p(str)) {
                    case "invisible":
                        aVar.I = 4;
                        aVar.F = 0.0f;
                        return;
                    case "gone":
                        aVar.I = 8;
                        return;
                    case "visible":
                        aVar.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                c(str, gVar, aVar, dVar, gVar2);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    public static void b(int i14, g gVar, d dVar, p6.a aVar) throws CLParsingException {
        r6.d dVar2;
        String strB;
        if (i14 == 0) {
            gVar.getClass();
            dVar2 = (i) gVar.f(g.d.HORIZONTAL_CHAIN);
        } else {
            gVar.getClass();
            dVar2 = (j) gVar.f(g.d.VERTICAL_CHAIN);
        }
        p6.d dVarI = aVar.i(1);
        if (dVarI instanceof p6.a) {
            p6.a aVar2 = (p6.a) dVarI;
            if (aVar2.f136192e.size() < 1) {
                return;
            }
            for (int i15 = 0; i15 < aVar2.f136192e.size(); i15++) {
                dVar2.q(aVar2.o(i15));
            }
            if (aVar.f136192e.size() > 2) {
                p6.d dVarI2 = aVar.i(2);
                if (dVarI2 instanceof p6.g) {
                    p6.g gVar2 = (p6.g) dVarI2;
                    for (String str : gVar2.t()) {
                        str.getClass();
                        if (str.equals(TtmlNode.TAG_STYLE)) {
                            p6.d dVarJ = gVar2.j(str);
                            if (dVarJ instanceof p6.a) {
                                p6.a aVar3 = (p6.a) dVarJ;
                                if (aVar3.f136192e.size() > 1) {
                                    strB = aVar3.o(0);
                                    dVar2.f150967n0 = aVar3.getFloat(1);
                                } else {
                                    strB = dVarJ.b();
                                }
                            } else {
                                strB = dVarJ.b();
                            }
                            if (strB.equals("packed")) {
                                dVar2.f150973t0 = g.a.PACKED;
                            } else if (strB.equals("spread_inside")) {
                                dVar2.f150973t0 = g.a.SPREAD_INSIDE;
                            } else {
                                dVar2.f150973t0 = g.a.SPREAD;
                            }
                        } else {
                            c(str, gVar2, dVar2, dVar, gVar);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, q6.a] */
    /* JADX WARN: Type inference failed for: r25v0, types: [q6.g] */
    public static void c(String str, p6.g gVar, q6.a aVar, d dVar, g gVar2) throws CLParsingException {
        boolean z14;
        char c14;
        boolean z15;
        boolean z16;
        boolean z17 = gVar2.f143085b;
        p6.d dVarN = gVar.n(str);
        p6.a aVar2 = dVarN instanceof p6.a ? (p6.a) dVarN : null;
        ?? r16 = -1;
        r16 = -1;
        r16 = -1;
        r16 = -1;
        if (aVar2 == null || aVar2.f136192e.size() <= 1) {
            String strQ = gVar.q(str);
            if (strQ != null) {
                q6.a aVarC = strQ.equals("parent") ? gVar2.c(0) : gVar2.c(strQ);
                str.getClass();
                switch (str) {
                    case "baseline":
                        gVar2.b(aVar.f143017a);
                        gVar2.b(aVarC.f143017a);
                        aVar.f143024d0 = g.b.BASELINE_TO_BASELINE;
                        aVar.X = aVarC;
                        break;
                    case "bottom":
                        aVar.e(aVarC);
                        break;
                    case "end":
                        if (z17) {
                            aVar.getClass();
                            aVar.f143024d0 = g.b.RIGHT_TO_RIGHT;
                            aVar.M = aVarC;
                            break;
                        } else {
                            aVar.getClass();
                            aVar.f143024d0 = g.b.LEFT_TO_LEFT;
                            aVar.J = aVarC;
                            break;
                        }
                        break;
                    case "top":
                        aVar.p(aVarC);
                        break;
                    case "start":
                        if (z17) {
                            aVar.getClass();
                            aVar.f143024d0 = g.b.LEFT_TO_LEFT;
                            aVar.J = aVarC;
                            break;
                        } else {
                            aVar.getClass();
                            aVar.f143024d0 = g.b.RIGHT_TO_RIGHT;
                            aVar.M = aVarC;
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String strO = aVar2.o(0);
        p6.d dVarM = aVar2.m(1);
        String strB = dVarM instanceof p6.h ? dVarM.b() : null;
        float fE = aVar2.f136192e.size() > 2 ? gVar2.f143084a.e(dVar.a(aVar2.m(2))) : 0.0f;
        float fE2 = aVar2.f136192e.size() > 3 ? gVar2.f143084a.e(dVar.a(aVar2.m(3))) : 0.0f;
        q6.a aVarC2 = strO.equals("parent") ? gVar2.c(0) : gVar2.c(strO);
        str.getClass();
        switch (str) {
            case "baseline":
                z14 = true;
                c14 = 2;
                strB.getClass();
                switch (strB) {
                    case "baseline":
                        gVar2.b(aVar.f143017a);
                        gVar2.b(aVarC2.f143017a);
                        aVar.f143024d0 = g.b.BASELINE_TO_BASELINE;
                        aVar.X = aVarC2;
                        break;
                    case "bottom":
                        gVar2.b(aVar.f143017a);
                        aVar.f143024d0 = g.b.BASELINE_TO_BOTTOM;
                        aVar.Z = aVarC2;
                        break;
                    case "top":
                        gVar2.b(aVar.f143017a);
                        aVar.f143024d0 = g.b.BASELINE_TO_TOP;
                        aVar.Y = aVarC2;
                        break;
                }
                z15 = z14;
                z16 = false;
                break;
            case "circular":
                z14 = true;
                float fA = dVar.a(aVar2.i(1));
                float fE3 = aVar2.f136192e.size() > 2 ? gVar2.f143084a.e(dVar.a(aVar2.m(2))) : 0.0f;
                aVar.f143018a0 = aVar.j(aVarC2);
                aVar.f143020b0 = fA;
                aVar.f143022c0 = fE3;
                aVar.f143024d0 = g.b.CIRCULAR_CONSTRAINT;
                c14 = 2;
                z15 = z14;
                z16 = false;
                break;
            case "bottom":
                strB.getClass();
                switch (strB) {
                    case "baseline":
                        gVar2.b(aVarC2.f143017a);
                        aVar.getClass();
                        aVar.f143024d0 = g.b.BOTTOM_TO_BASELINE;
                        aVar.W = aVarC2;
                        break;
                    case "bottom":
                        aVar.e(aVarC2);
                        break;
                    case "top":
                        aVar.getClass();
                        aVar.f143024d0 = g.b.BOTTOM_TO_TOP;
                        aVar.U = aVarC2;
                        break;
                }
                z14 = true;
                c14 = 2;
                z15 = z14;
                z16 = false;
                break;
            case "end":
                z15 = !z17;
                z14 = true;
                z16 = true;
                c14 = 2;
                break;
            case "top":
                strB.getClass();
                switch (strB) {
                    case "baseline":
                        gVar2.b(aVarC2.f143017a);
                        aVar.getClass();
                        aVar.f143024d0 = g.b.TOP_TO_BASELINE;
                        aVar.T = aVarC2;
                        break;
                    case "bottom":
                        aVar.getClass();
                        aVar.f143024d0 = g.b.TOP_TO_BOTTOM;
                        aVar.S = aVarC2;
                        break;
                    case "top":
                        aVar.p(aVarC2);
                        break;
                }
                z14 = true;
                c14 = 2;
                z15 = z14;
                z16 = false;
                break;
            case "left":
                z14 = true;
                z16 = true;
                c14 = 2;
                z15 = true;
                break;
            case "right":
                z14 = true;
                z16 = true;
                c14 = 2;
                z15 = false;
                break;
            case "start":
                z15 = z17;
                z14 = true;
                z16 = true;
                c14 = 2;
                break;
            default:
                z14 = true;
                c14 = 2;
                z15 = z14;
                z16 = false;
                break;
        }
        if (z16) {
            strB.getClass();
            switch (strB.hashCode()) {
                case 100571:
                    if (strB.equals(TtmlNode.END)) {
                        r16 = 0;
                    }
                    break;
                case 108511772:
                    if (strB.equals(TtmlNode.RIGHT)) {
                        r16 = z14;
                    }
                    break;
                case 109757538:
                    if (strB.equals(TtmlNode.START)) {
                        r16 = c14;
                    }
                    break;
            }
            switch (r16) {
                case 0:
                    z14 = !z17;
                    break;
                case 1:
                    z14 = false;
                    break;
                case 2:
                    z14 = z17;
                    break;
            }
            if (z15) {
                if (z14) {
                    aVar.getClass();
                    aVar.f143024d0 = g.b.LEFT_TO_LEFT;
                    aVar.J = aVarC2;
                } else {
                    aVar.getClass();
                    aVar.f143024d0 = g.b.LEFT_TO_RIGHT;
                    aVar.K = aVarC2;
                }
            } else if (z14) {
                aVar.getClass();
                aVar.f143024d0 = g.b.RIGHT_TO_LEFT;
                aVar.L = aVarC2;
            } else {
                aVar.getClass();
                aVar.f143024d0 = g.b.RIGHT_TO_RIGHT;
                aVar.M = aVarC2;
            }
        }
        aVar.l(Float.valueOf(fE)).n(Float.valueOf(fE2));
    }

    public static q6.c d(p6.g gVar, String str, g gVar2, hy.d dVar) throws CLParsingException {
        p6.d dVarJ = gVar.j(str);
        q6.c cVarC = q6.c.c(0);
        if (dVarJ instanceof p6.h) {
            return e(dVarJ.b());
        }
        if (dVarJ instanceof p6.f) {
            return q6.c.c(gVar2.d(Float.valueOf(dVar.e(gVar.l(str)))));
        }
        if (dVarJ instanceof p6.g) {
            p6.g gVar3 = (p6.g) dVarJ;
            String strQ = gVar3.q("value");
            if (strQ != null) {
                cVarC = e(strQ);
            }
            p6.d dVarN = gVar3.n("min");
            if (dVarN != null) {
                if (dVarN instanceof p6.f) {
                    int iD = gVar2.d(Float.valueOf(dVar.e(((p6.f) dVarN).c())));
                    if (iD >= 0) {
                        cVarC.f143073a = iD;
                    }
                } else if (dVarN instanceof p6.h) {
                    cVarC.f143073a = -2;
                }
            }
            p6.d dVarN2 = gVar3.n("max");
            if (dVarN2 != null) {
                if (dVarN2 instanceof p6.f) {
                    int iD2 = gVar2.d(Float.valueOf(dVar.e(((p6.f) dVarN2).c())));
                    if (cVarC.f143074b >= 0) {
                        cVarC.f143074b = iD2;
                        return cVarC;
                    }
                } else if ((dVarN2 instanceof p6.h) && cVarC.f143079g) {
                    cVarC.f143078f = q6.c.f143068i;
                    cVarC.f143074b = Integer.MAX_VALUE;
                }
            }
        }
        return cVarC;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static q6.c e(String str) {
        q6.c cVarC = q6.c.c(0);
        byte b14 = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b14 = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b14 = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b14 = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b14 = 3;
                }
                break;
        }
        String str2 = q6.c.f143069j;
        switch (b14) {
            case 0:
                return q6.c.g(q6.c.f143068i);
            case 1:
                return q6.c.d();
            case 2:
                return q6.c.g(str2);
            case 3:
                return q6.c.h();
            default:
                if (str.endsWith("%")) {
                    q6.c cVarE = q6.c.e(Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f);
                    cVarE.f143079g = true;
                    cVarE.f143074b = 0;
                    return cVarE;
                }
                if (!str.contains(":")) {
                    return cVarC;
                }
                q6.c cVarF = q6.c.f(str);
                cVarF.f143078f = str2;
                cVarF.f143079g = true;
                return cVarF;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    public static void f(int i14, g gVar, String str, p6.g gVar2) throws CLParsingException {
        ArrayList<String> arrayListT = gVar2.t();
        q6.a aVarC = gVar.c(str);
        if (i14 == 0) {
            gVar.e(0, str);
        } else {
            gVar.e(1, str);
        }
        boolean z14 = gVar.f143085b || i14 == 0;
        r6.h hVar = (r6.h) aVarC.f143021c;
        boolean z15 = false;
        boolean z16 = true;
        float fL = 0.0f;
        for (String str2 : arrayListT) {
            str2.getClass();
            switch (str2) {
                case "percent":
                    p6.d dVarN = gVar2.n(str2);
                    p6.a aVar = dVarN instanceof p6.a ? (p6.a) dVarN : null;
                    if (aVar == null) {
                        fL = gVar2.l(str2);
                        z15 = true;
                        z16 = true;
                        break;
                    } else {
                        if (aVar.f136192e.size() > 1) {
                            String strO = aVar.o(0);
                            float f14 = aVar.getFloat(1);
                            switch (strO) {
                                case "end":
                                    z16 = !z14;
                                    break;
                                case "left":
                                    z16 = true;
                                    fL = f14;
                                    z15 = true;
                                    continue;
                                    break;
                                case "right":
                                    z16 = false;
                                    break;
                                case "start":
                                    z16 = z14;
                                    break;
                            }
                            fL = f14;
                        }
                        z15 = true;
                        break;
                    }
                    break;
                case "end":
                    fL = gVar.f143084a.e(gVar2.l(str2));
                    z16 = !z14;
                    break;
                case "left":
                    fL = gVar.f143084a.e(gVar2.l(str2));
                    z16 = true;
                    break;
                case "right":
                    fL = gVar.f143084a.e(gVar2.l(str2));
                    z16 = false;
                    break;
                case "start":
                    fL = gVar.f143084a.e(gVar2.l(str2));
                    z16 = z14;
                    break;
            }
        }
        if (z15) {
            if (z16) {
                hVar.f151003d = -1;
                hVar.f151004e = -1;
                hVar.f151005f = fL;
                return;
            } else {
                hVar.f151003d = -1;
                hVar.f151004e = -1;
                hVar.f151005f = 1.0f - fL;
                return;
            }
        }
        if (z16) {
            hVar.f151003d = hVar.f151000a.d(Float.valueOf(fL));
            hVar.f151004e = -1;
            hVar.f151005f = 0.0f;
        } else {
            Float fValueOf = Float.valueOf(fL);
            hVar.f151003d = -1;
            hVar.f151004e = hVar.f151000a.d(fValueOf);
            hVar.f151005f = 0.0f;
        }
    }

    public static void g(g gVar, d dVar, String str, p6.g gVar2) throws CLParsingException {
        q6.a aVarC = gVar.c(str);
        if (aVarC.f143026e0 == null) {
            aVarC.f143026e0 = q6.c.h();
        }
        if (aVarC.f143028f0 == null) {
            aVarC.f143028f0 = q6.c.h();
        }
        Iterator<String> it = gVar2.t().iterator();
        while (it.hasNext()) {
            a(it.next(), gVar2, aVarC, dVar, gVar);
        }
    }
}
