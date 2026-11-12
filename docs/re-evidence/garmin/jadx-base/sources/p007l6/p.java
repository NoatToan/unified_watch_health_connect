package p007l6;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.core.parser.CLParsingException;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.firebase.messaging.Constants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.HeaderParameterNames;
import e23.l;
import en0.n;
import f4.v;
import f5.y0;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p3.y2;
import p6.f;
import p6.g;
import q6.b;
import r6.d;
import r6.i;
import r6.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll6/p;", "Ll6/o;", "Lp3/y2;", "Ll6/m;", Action.SCOPE_ATTRIBUTE, "<init>", "(Ll6/m;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p implements o, y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f110489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f110490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f110491c = new v(new Function0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110492d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f110493e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f110494f = new ArrayList();

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<y0> f110495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f110496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f110497c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends y0> list, p pVar, a0 a0Var) {
            super(0);
            this.f110495a = list;
            this.f110496b = pVar;
            this.f110497c = a0Var;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:119:0x021a A[PHI: r32
          0x021a: PHI (r32v15 java.util.Iterator<java.lang.String>) = 
          (r32v1 java.util.Iterator<java.lang.String>)
          (r32v2 java.util.Iterator<java.lang.String>)
          (r32v3 java.util.Iterator<java.lang.String>)
          (r32v4 java.util.Iterator<java.lang.String>)
          (r32v5 java.util.Iterator<java.lang.String>)
          (r32v6 java.util.Iterator<java.lang.String>)
          (r32v7 java.util.Iterator<java.lang.String>)
          (r32v8 java.util.Iterator<java.lang.String>)
          (r32v9 java.util.Iterator<java.lang.String>)
          (r32v10 java.util.Iterator<java.lang.String>)
          (r32v11 java.util.Iterator<java.lang.String>)
          (r32v12 java.util.Iterator<java.lang.String>)
          (r32v13 java.util.Iterator<java.lang.String>)
          (r32v16 java.util.Iterator<java.lang.String>)
         binds: [B:169:0x02cf, B:165:0x02c2, B:161:0x02b5, B:157:0x02a8, B:153:0x029b, B:149:0x028e, B:145:0x0281, B:141:0x0271, B:137:0x0263, B:133:0x0253, B:129:0x0243, B:125:0x0235, B:121:0x0225, B:118:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:213:0x03e1  */
        /* JADX WARN: Code duplicated, block: B:215:0x03e5  */
        /* JADX WARN: Code duplicated, block: B:219:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:221:0x03ff  */
        /* JADX WARN: Code duplicated, block: B:225:0x0415  */
        /* JADX WARN: Code duplicated, block: B:227:0x0419  */
        /* JADX WARN: Code duplicated, block: B:246:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:266:0x052e  */
        /* JADX WARN: Code duplicated, block: B:276:0x059f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:288:0x05e0  */
        /* JADX WARN: Code duplicated, block: B:315:0x0656  */
        /* JADX WARN: Code duplicated, block: B:331:0x06b8  */
        /* JADX WARN: Code duplicated, block: B:359:0x0760  */
        /* JADX WARN: Code duplicated, block: B:385:0x07bc  */
        /* JADX WARN: Code duplicated, block: B:438:0x0899  */
        /* JADX WARN: Code duplicated, block: B:478:0x0914  */
        /* JADX WARN: Code duplicated, block: B:54:0x011f  */
        /* JADX WARN: Code duplicated, block: B:557:0x0b28  */
        /* JADX WARN: Code duplicated, block: B:684:0x0d41  */
        /* JADX WARN: Code duplicated, block: B:774:0x0fab  */
        /* JADX WARN: Code duplicated, block: B:793:0x0fd8  */
        /* JADX WARN: Code duplicated, block: B:850:0x043e A[SYNTHETIC] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v69 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // e23.a
        public final Unit invoke() throws CLParsingException {
            ?? r14;
            g gVar;
            b.d dVar;
            Iterator<String> it;
            String str;
            g gVar2;
            String strQ;
            g gVar3;
            String strQ2;
            String str2;
            String str3;
            String str4;
            String strP;
            byte b14;
            byte b15;
            float fD;
            float f14;
            float f15;
            float f16;
            String strB;
            int iD;
            b.d dVar2;
            d dVar3;
            byte b16;
            String str5;
            Iterator<String> it3;
            b.d dVar4;
            String str6;
            Iterator<String> it4;
            float f17;
            float fE;
            float f18;
            float fE2;
            float fE3;
            float f19;
            String strB2;
            Iterator<String> it5;
            byte b17;
            String str7;
            String str8;
            String str9;
            String strB3;
            String strO;
            String strO2;
            Float fValueOf;
            Float fValueOf2;
            Float fValueOf3;
            String strB4;
            String strO3;
            String strO4;
            float fD2;
            float f22;
            float f24;
            float f25;
            Float fValueOf4;
            Float f26;
            Float fValueOf5;
            String str10;
            p6.a aVar;
            float f27;
            float fE4;
            float fE5;
            a aVar2 = this;
            List<y0> list = aVar2.f110495a;
            int size = list.size();
            boolean z14 = false;
            int i14 = 0;
            while (true) {
                String str11 = "] : ";
                p pVar = aVar2.f110496b;
                if (i14 >= size) {
                    g gVar4 = pVar.f110489a.f110470a;
                    b.d dVar5 = new b.d();
                    for (Iterator<String> it6 = gVar4.t().iterator(); it6.hasNext(); it6 = it) {
                        String next = it6.next();
                        p6.d dVarJ = gVar4.j(next);
                        next.getClass();
                        switch (next) {
                            case "Helpers":
                                r14 = z14;
                                break;
                            case "Generate":
                                r14 = 1;
                                break;
                            case "Variables":
                                r14 = 2;
                                break;
                            default:
                                r14 = -1;
                                break;
                        }
                        a0 a0Var = aVar2.f110497c;
                        HashMap<String, ArrayList<String>> map = dVar5.f143065c;
                        switch (r14) {
                            case 0:
                                gVar = gVar4;
                                dVar = dVar5;
                                it = it6;
                                str = str11;
                                if (dVarJ instanceof p6.a) {
                                    p6.a aVar3 = (p6.a) dVarJ;
                                    for (int i15 = 0; i15 < aVar3.f136192e.size(); i15++) {
                                        p6.d dVarI = aVar3.i(i15);
                                        if (dVarI instanceof p6.a) {
                                            p6.a aVar4 = (p6.a) dVarI;
                                            if (aVar4.f136192e.size() > 1) {
                                                switch (aVar4.o(0)) {
                                                    case "vGuideline":
                                                        p6.d dVarI2 = aVar4.i(1);
                                                        if (!(dVarI2 instanceof g) || (strQ = (gVar2 = (g) dVarI2).q(TtmlNode.ATTR_ID)) == null) {
                                                            break;
                                                        } else {
                                                            b.f(1, a0Var, strQ, gVar2);
                                                            break;
                                                        }
                                                        break;
                                                    case "hChain":
                                                        b.b(0, a0Var, dVar, aVar4);
                                                        break;
                                                    case "vChain":
                                                        b.b(1, a0Var, dVar, aVar4);
                                                        break;
                                                    case "hGuideline":
                                                        p6.d dVarI3 = aVar4.i(1);
                                                        if ((dVarI3 instanceof g) && (strQ2 = (gVar3 = (g) dVarI3).q(TtmlNode.ATTR_ID)) != null) {
                                                            b.f(0, a0Var, strQ2, gVar3);
                                                        }
                                                        break;
                                                    default:
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                                aVar2 = this;
                                dVar5 = dVar;
                                str11 = str;
                                z14 = false;
                                gVar4 = gVar;
                                break;
                            case 1:
                                gVar = gVar4;
                                dVar = dVar5;
                                it = it6;
                                str = str11;
                                if (dVarJ instanceof g) {
                                    g gVar5 = (g) dVarJ;
                                    for (String str12 : gVar5.t()) {
                                        p6.d dVarJ2 = gVar5.j(str12);
                                        ArrayList<String> arrayList = map.containsKey(str12) ? map.get(str12) : null;
                                        if (arrayList != null && (dVarJ2 instanceof g)) {
                                            Iterator<String> it7 = arrayList.iterator();
                                            while (it7.hasNext()) {
                                                b.g(a0Var, dVar, it7.next(), (g) dVarJ2);
                                            }
                                        }
                                    }
                                }
                                aVar2 = this;
                                dVar5 = dVar;
                                str11 = str;
                                z14 = false;
                                gVar4 = gVar;
                                break;
                            case 2:
                                gVar = gVar4;
                                dVar = dVar5;
                                str2 = str11;
                                it = it6;
                                if (dVarJ instanceof g) {
                                    g gVar6 = (g) dVarJ;
                                    for (String str13 : gVar6.t()) {
                                        p6.d dVarJ3 = gVar6.j(str13);
                                        if (dVarJ3 instanceof f) {
                                            dVar.f143063a.put(str13, Integer.valueOf(dVarJ3.d()));
                                        } else {
                                            if (dVarJ3 instanceof g) {
                                                g gVar7 = (g) dVarJ3;
                                                if (gVar7.r(Constants.MessagePayloadKeys.FROM) && gVar7.r("to")) {
                                                    float fA = dVar.a(gVar7.j(Constants.MessagePayloadKeys.FROM));
                                                    float fA2 = dVar.a(gVar7.j("to"));
                                                    String strQ3 = gVar7.q("prefix");
                                                    String strQ4 = gVar7.q("postfix");
                                                    HashMap<String, b.InterfaceC2691b> map2 = dVar.f143064b;
                                                    if (!map2.containsKey(str13) || !(map2.get(str13) instanceof b.e)) {
                                                        b.a aVar5 = new b.a(fA, fA2, 1.0f, strQ3, strQ4);
                                                        map2.put(str13, aVar5);
                                                        ArrayList<String> arrayList2 = new ArrayList<>();
                                                        int i16 = (int) aVar5.f143059f;
                                                        int i17 = (int) aVar5.f143060g;
                                                        int i18 = i16;
                                                        while (i16 <= i17) {
                                                            arrayList2.add(aVar5.f143056c + i18 + aVar5.f143057d);
                                                            i18 += (int) aVar5.f143054a;
                                                            i16++;
                                                        }
                                                        map.put(str13, arrayList2);
                                                    }
                                                } else if (gVar7.r(Constants.MessagePayloadKeys.FROM) && gVar7.r("step")) {
                                                    float fA3 = dVar.a(gVar7.j(Constants.MessagePayloadKeys.FROM));
                                                    float fA4 = dVar.a(gVar7.j("step"));
                                                    HashMap<String, b.InterfaceC2691b> map3 = dVar.f143064b;
                                                    if (!map3.containsKey(str13) || !(map3.get(str13) instanceof b.e)) {
                                                        map3.put(str13, new b.c(fA3, fA4));
                                                    }
                                                } else if (gVar7.r("ids")) {
                                                    p6.d dVarJ4 = gVar7.j("ids");
                                                    if (!(dVarJ4 instanceof p6.a)) {
                                                        throw new CLParsingException("no array found for key <ids>, found [" + dVarJ4.e() + str2 + dVarJ4, gVar7);
                                                    }
                                                    p6.a aVar6 = (p6.a) dVarJ4;
                                                    ArrayList<String> arrayList3 = new ArrayList<>();
                                                    for (int i19 = 0; i19 < aVar6.f136192e.size(); i19++) {
                                                        arrayList3.add(aVar6.o(i19));
                                                    }
                                                    map.put(str13, arrayList3);
                                                } else {
                                                    str3 = str2;
                                                    if (gVar7.r(HeaderParameterNames.AUTHENTICATION_TAG)) {
                                                        String strP2 = gVar7.p(HeaderParameterNames.AUTHENTICATION_TAG);
                                                        HashMap<String, ArrayList<String>> map4 = a0Var.f143088e;
                                                        map.put(str13, map4.containsKey(strP2) ? map4.get(strP2) : null);
                                                    }
                                                }
                                            }
                                            str2 = str3;
                                        }
                                        str3 = str2;
                                        str2 = str3;
                                    }
                                }
                                str = str2;
                                aVar2 = this;
                                dVar5 = dVar;
                                str11 = str;
                                z14 = false;
                                gVar4 = gVar;
                                break;
                            default:
                                if (dVarJ instanceof g) {
                                    g gVar8 = (g) dVarJ;
                                    Iterator<String> it8 = gVar8.t().iterator();
                                    while (true) {
                                        boolean zHasNext = it8.hasNext();
                                        str4 = NotificationConstants.KEY_DATA_MIME_TYPE;
                                        if (!zHasNext) {
                                            strP = null;
                                        } else if (it8.next().equals(NotificationConstants.KEY_DATA_MIME_TYPE)) {
                                            strP = gVar8.p(NotificationConstants.KEY_DATA_MIME_TYPE);
                                        }
                                    }
                                    if (strP != null) {
                                        String str14 = "hFlow";
                                        switch (strP) {
                                            case "vGuideline":
                                                b14 = 0;
                                                break;
                                            case "column":
                                                b14 = 1;
                                                break;
                                            case "hChain":
                                                b14 = 2;
                                                break;
                                            case "vChain":
                                                b14 = 3;
                                                break;
                                            case "barrier":
                                                b14 = 4;
                                                break;
                                            case "row":
                                                b14 = 5;
                                                break;
                                            case "grid":
                                                b14 = 6;
                                                break;
                                            case "hFlow":
                                                b14 = 7;
                                                break;
                                            case "vFlow":
                                                b14 = 8;
                                                break;
                                            case "hGuideline":
                                                b14 = 9;
                                                break;
                                            default:
                                                b14 = -1;
                                                break;
                                        }
                                        String str15 = TtmlNode.START;
                                        String str16 = "bottom";
                                        gVar = gVar4;
                                        it = it6;
                                        switch (b14) {
                                            case 0:
                                                dVar = dVar5;
                                                str2 = str11;
                                                b.f(1, a0Var, next, gVar8);
                                                break;
                                            case 1:
                                            case 5:
                                            case 6:
                                                dVar = dVar5;
                                                str2 = str11;
                                                q6.a aVarC = a0Var.c(next);
                                                Object obj = aVarC.f143021c;
                                                if (obj == null || !(obj instanceof r6.g)) {
                                                    q6.g.d dVar6 = q6.g.d.GRID;
                                                    if (strP.charAt(0) == 'r') {
                                                        dVar6 = q6.g.d.ROW;
                                                    } else if (strP.charAt(0) == 'c') {
                                                        dVar6 = q6.g.d.COLUMN;
                                                    }
                                                    r6.g gVar9 = new r6.g(a0Var, dVar6);
                                                    aVarC.f143021c = gVar9;
                                                    aVarC.c(gVar9.a());
                                                }
                                                r6.g gVar10 = (r6.g) aVarC.f143021c;
                                                for (String str17 : gVar8.t()) {
                                                    str17.getClass();
                                                    switch (str17.hashCode()) {
                                                        case -1439500848:
                                                            if (str17.equals(ModelSourceWrapper.ORIENTATION)) {
                                                                b15 = 0;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case -806339567:
                                                            if (str17.equals("padding")) {
                                                                b15 = 1;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case -567445985:
                                                            if (str17.equals("contains")) {
                                                                b15 = 2;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 3169614:
                                                            if (str17.equals("hGap")) {
                                                                b15 = 3;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 3506649:
                                                            if (str17.equals("rows")) {
                                                                b15 = 4;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 3586688:
                                                            if (str17.equals("vGap")) {
                                                                b15 = 5;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 97513095:
                                                            if (str17.equals("flags")) {
                                                                b15 = 6;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 109497044:
                                                            if (str17.equals("skips")) {
                                                                b15 = 7;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 109638249:
                                                            if (str17.equals("spans")) {
                                                                b15 = 8;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 144441793:
                                                            if (str17.equals("rowWeights")) {
                                                                b15 = 9;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 949721053:
                                                            if (str17.equals("columns")) {
                                                                b15 = 10;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        case 2033353925:
                                                            if (str17.equals("columnWeights")) {
                                                                b15 = Ascii.VT;
                                                            } else {
                                                                b15 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b15 = -1;
                                                            break;
                                                    }
                                                    switch (b15) {
                                                        case 0:
                                                            gVar10.f150992s0 = gVar8.j(str17).d();
                                                            break;
                                                        case 1:
                                                            p6.d dVarJ5 = gVar8.j(str17);
                                                            if (dVarJ5 instanceof p6.a) {
                                                                p6.a aVar7 = (p6.a) dVarJ5;
                                                                if (aVar7.f136192e.size() > 1) {
                                                                    fD = aVar7.getInt(0);
                                                                    f16 = aVar7.getInt(1);
                                                                    if (aVar7.f136192e.size() > 2) {
                                                                        f15 = aVar7.getInt(2);
                                                                        try {
                                                                            try {
                                                                                f14 = ((p6.a) dVarJ5).getInt(3);
                                                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                                                f14 = 0.0f;
                                                                            }
                                                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                                                        }
                                                                    } else {
                                                                        f15 = fD;
                                                                        f14 = f16;
                                                                    }
                                                                } else {
                                                                    fD = dVarJ5.d();
                                                                    f14 = fD;
                                                                    f15 = f14;
                                                                    f16 = f15;
                                                                }
                                                            } else {
                                                                fD = dVarJ5.d();
                                                                f14 = fD;
                                                                f15 = f14;
                                                                f16 = f15;
                                                            }
                                                            gVar10.f150988o0 = Math.round(a0Var.f143084a.e(fD));
                                                            gVar10.f150990q0 = Math.round(a0Var.f143084a.e(f16));
                                                            gVar10.f150989p0 = Math.round(a0Var.f143084a.e(f15));
                                                            gVar10.f150991r0 = Math.round(a0Var.f143084a.e(f14));
                                                            break;
                                                        case 2:
                                                            p6.d dVarN = gVar8.n(str17);
                                                            p6.a aVar8 = dVarN instanceof p6.a ? (p6.a) dVarN : null;
                                                            if (aVar8 != null) {
                                                                for (int i24 = 0; i24 < aVar8.f136192e.size(); i24++) {
                                                                    gVar10.q(a0Var.c(aVar8.i(i24).b()));
                                                                }
                                                            }
                                                            break;
                                                        case 3:
                                                            gVar10.f150995v0 = a0Var.f143084a.e(gVar8.j(str17).c());
                                                            break;
                                                        case 4:
                                                            int iD2 = gVar8.j(str17).d();
                                                            if (iD2 > 0 && gVar10.f143081l0 != q6.g.d.COLUMN) {
                                                                gVar10.f150993t0 = iD2;
                                                            }
                                                            break;
                                                        case 5:
                                                            gVar10.f150996w0 = a0Var.f143084a.e(gVar8.j(str17).c());
                                                            break;
                                                        case 6:
                                                            try {
                                                                p6.d dVarJ6 = gVar8.j(str17);
                                                                if (dVarJ6 instanceof f) {
                                                                    iD = dVarJ6.d();
                                                                    strB = "";
                                                                } else {
                                                                    strB = dVarJ6.b();
                                                                    iD = 0;
                                                                }
                                                            } catch (Exception e4) {
                                                                System.err.println("Error parsing grid flags " + e4);
                                                                strB = "";
                                                            }
                                                            if (strB.isEmpty()) {
                                                                gVar10.B0 = iD;
                                                            } else {
                                                                gVar10.getClass();
                                                                if (!strB.isEmpty()) {
                                                                    String[] strArrSplit = strB.split("\\|");
                                                                    gVar10.B0 = 0;
                                                                    for (String str18 : strArrSplit) {
                                                                        String lowerCase = str18.toLowerCase();
                                                                        lowerCase.getClass();
                                                                        if (lowerCase.equals("subgridbycolrow")) {
                                                                            gVar10.B0 |= 1;
                                                                        } else if (lowerCase.equals("spansrespectwidgetorder")) {
                                                                            gVar10.B0 |= 2;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 7:
                                                            String strB5 = gVar8.j(str17).b();
                                                            if (strB5.contains(":")) {
                                                                gVar10.A0 = strB5;
                                                            }
                                                            break;
                                                        case 8:
                                                            String strB6 = gVar8.j(str17).b();
                                                            if (strB6.contains(":")) {
                                                                gVar10.f150999z0 = strB6;
                                                            }
                                                            break;
                                                        case 9:
                                                            String strB7 = gVar8.j(str17).b();
                                                            if (strB7.contains(",")) {
                                                                gVar10.f150997x0 = strB7;
                                                            }
                                                            break;
                                                        case 10:
                                                            int iD3 = gVar8.j(str17).d();
                                                            if (iD3 > 0 && gVar10.f143081l0 != q6.g.d.ROW) {
                                                                gVar10.f150994u0 = iD3;
                                                            }
                                                            break;
                                                        case 11:
                                                            String strB8 = gVar8.j(str17).b();
                                                            if (strB8.contains(",")) {
                                                                gVar10.f150998y0 = strB8;
                                                            }
                                                            break;
                                                        default:
                                                            b.a(str17, gVar8, a0Var.c(next), dVar, a0Var);
                                                            break;
                                                    }
                                                }
                                                break;
                                            case 2:
                                            case 3:
                                                dVar2 = dVar5;
                                                str2 = str11;
                                                if (strP.charAt(0) == 'h') {
                                                    a0Var.getClass();
                                                    dVar3 = (i) a0Var.f(q6.g.d.HORIZONTAL_CHAIN);
                                                } else {
                                                    a0Var.getClass();
                                                    dVar3 = (j) a0Var.f(q6.g.d.VERTICAL_CHAIN);
                                                }
                                                dVar3.f143017a = next;
                                                Iterator<String> it9 = gVar8.t().iterator();
                                                while (it9.hasNext()) {
                                                    String next2 = it9.next();
                                                    next2.getClass();
                                                    switch (next2.hashCode()) {
                                                        case -1383228885:
                                                            if (next2.equals(str16)) {
                                                                b16 = 0;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case -567445985:
                                                            if (next2.equals("contains")) {
                                                                b16 = 1;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 100571:
                                                            if (next2.equals(TtmlNode.END)) {
                                                                b16 = 2;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 115029:
                                                            if (next2.equals("top")) {
                                                                b16 = 3;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 3317767:
                                                            if (next2.equals(TtmlNode.LEFT)) {
                                                                b16 = 4;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 108511772:
                                                            if (next2.equals(TtmlNode.RIGHT)) {
                                                                b16 = 5;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 109757538:
                                                            if (next2.equals(TtmlNode.START)) {
                                                                b16 = 6;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        case 109780401:
                                                            if (next2.equals(TtmlNode.TAG_STYLE)) {
                                                                b16 = 7;
                                                            } else {
                                                                b16 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            b16 = -1;
                                                            break;
                                                    }
                                                    switch (b16) {
                                                        case 0:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            str5 = str16;
                                                            it3 = it9;
                                                            dVar4 = dVar2;
                                                            b.c(next2, gVar8, dVar3, dVar4, a0Var);
                                                            dVar2 = dVar4;
                                                            it9 = it3;
                                                            str16 = str5;
                                                            break;
                                                        case 1:
                                                            p6.d dVarJ7 = gVar8.j(next2);
                                                            if (dVarJ7 instanceof p6.a) {
                                                                p6.a aVar9 = (p6.a) dVarJ7;
                                                                if (aVar9.f136192e.size() >= 1) {
                                                                    int i25 = 0;
                                                                    while (i25 < aVar9.f136192e.size()) {
                                                                        p6.d dVarI4 = aVar9.i(i25);
                                                                        if (dVarI4 instanceof p6.a) {
                                                                            p6.a aVar10 = (p6.a) dVarI4;
                                                                            if (aVar10.f136192e.size() > 0) {
                                                                                String strB9 = aVar10.i(0).b();
                                                                                str6 = str16;
                                                                                int size2 = aVar10.f136192e.size();
                                                                                it4 = it9;
                                                                                if (size2 != 2) {
                                                                                    if (size2 == 3) {
                                                                                        f19 = aVar10.getFloat(1);
                                                                                        fE = a0Var.f143084a.e(aVar10.getFloat(2));
                                                                                        fE3 = fE;
                                                                                    } else if (size2 == 4) {
                                                                                        f19 = aVar10.getFloat(1);
                                                                                        float fE6 = a0Var.f143084a.e(aVar10.getFloat(2));
                                                                                        fE = a0Var.f143084a.e(aVar10.getFloat(3));
                                                                                        fE3 = fE6;
                                                                                    } else if (size2 != 6) {
                                                                                        fE = Float.NaN;
                                                                                        f18 = Float.NaN;
                                                                                        fE2 = Float.NaN;
                                                                                        f17 = Float.NaN;
                                                                                        fE3 = Float.NaN;
                                                                                    } else {
                                                                                        float f28 = aVar10.getFloat(1);
                                                                                        fE3 = a0Var.f143084a.e(aVar10.getFloat(2));
                                                                                        float fE7 = a0Var.f143084a.e(aVar10.getFloat(3));
                                                                                        float fE8 = a0Var.f143084a.e(aVar10.getFloat(4));
                                                                                        fE2 = a0Var.f143084a.e(aVar10.getFloat(5));
                                                                                        fE = fE7;
                                                                                        f17 = f28;
                                                                                        f18 = fE8;
                                                                                    }
                                                                                    f17 = f19;
                                                                                    f18 = Float.NaN;
                                                                                    fE2 = Float.NaN;
                                                                                } else {
                                                                                    f17 = aVar10.getFloat(1);
                                                                                    fE = Float.NaN;
                                                                                    f18 = Float.NaN;
                                                                                    fE2 = Float.NaN;
                                                                                    fE3 = Float.NaN;
                                                                                }
                                                                                dVar3.q(strB9);
                                                                                String string = strB9.toString();
                                                                                if (!Float.isNaN(f17)) {
                                                                                    dVar3.f150968o0.put(string, Float.valueOf(f17));
                                                                                }
                                                                                if (!Float.isNaN(fE3)) {
                                                                                    dVar3.f150969p0.put(string, Float.valueOf(fE3));
                                                                                }
                                                                                if (!Float.isNaN(fE)) {
                                                                                    dVar3.f150970q0.put(string, Float.valueOf(fE));
                                                                                }
                                                                                if (!Float.isNaN(f18)) {
                                                                                    if (dVar3.f150971r0 == null) {
                                                                                        dVar3.f150971r0 = new HashMap<>();
                                                                                    }
                                                                                    dVar3.f150971r0.put(string, Float.valueOf(f18));
                                                                                }
                                                                                if (!Float.isNaN(fE2)) {
                                                                                    if (dVar3.f150972s0 == null) {
                                                                                        dVar3.f150972s0 = new HashMap<>();
                                                                                    }
                                                                                    dVar3.f150972s0.put(string, Float.valueOf(fE2));
                                                                                }
                                                                            } else {
                                                                                str6 = str16;
                                                                                it4 = it9;
                                                                            }
                                                                        } else {
                                                                            str6 = str16;
                                                                            it4 = it9;
                                                                            dVar3.q(dVarI4.b());
                                                                        }
                                                                        i25++;
                                                                        it9 = it4;
                                                                        str16 = str6;
                                                                    }
                                                                    str5 = str16;
                                                                    it3 = it9;
                                                                    dVar4 = dVar2;
                                                                    dVar2 = dVar4;
                                                                    it9 = it3;
                                                                    str16 = str5;
                                                                    break;
                                                                }
                                                            }
                                                            PrintStream printStream = System.err;
                                                            StringBuilder sbI = sn.a.i(next, " contains should be an array \"");
                                                            sbI.append(dVarJ7.b());
                                                            sbI.append("\"");
                                                            printStream.println(sbI.toString());
                                                            break;
                                                        case 7:
                                                            p6.d dVarJ8 = gVar8.j(next2);
                                                            if (dVarJ8 instanceof p6.a) {
                                                                p6.a aVar11 = (p6.a) dVarJ8;
                                                                if (aVar11.f136192e.size() > 1) {
                                                                    strB2 = aVar11.o(0);
                                                                    dVar3.f150967n0 = aVar11.getFloat(1);
                                                                } else {
                                                                    strB2 = dVarJ8.b();
                                                                }
                                                            } else {
                                                                strB2 = dVarJ8.b();
                                                            }
                                                            if (strB2.equals("packed")) {
                                                                dVar3.f150973t0 = q6.g.a.PACKED;
                                                            } else if (strB2.equals("spread_inside")) {
                                                                dVar3.f150973t0 = q6.g.a.SPREAD_INSIDE;
                                                            } else {
                                                                dVar3.f150973t0 = q6.g.a.SPREAD;
                                                            }
                                                            str5 = str16;
                                                            it3 = it9;
                                                            dVar4 = dVar2;
                                                            dVar2 = dVar4;
                                                            it9 = it3;
                                                            str16 = str5;
                                                            break;
                                                        default:
                                                            str5 = str16;
                                                            it3 = it9;
                                                            dVar4 = dVar2;
                                                            dVar2 = dVar4;
                                                            it9 = it3;
                                                            str16 = str5;
                                                            break;
                                                    }
                                                    dVar = dVar2;
                                                }
                                                dVar = dVar2;
                                                break;
                                            case 4:
                                                dVar2 = dVar5;
                                                str2 = str11;
                                                boolean z15 = a0Var.f143085b;
                                                q6.g.c cVar = q6.g.c.END;
                                                q6.a aVarC2 = a0Var.c(next);
                                                Object obj2 = aVarC2.f143021c;
                                                if (obj2 == null || !(obj2 instanceof r6.c)) {
                                                    r6.c cVar2 = new r6.c(a0Var);
                                                    cVar2.f150963n0 = cVar;
                                                    aVarC2.f143021c = cVar2;
                                                    aVarC2.c(cVar2.a());
                                                }
                                                r6.c cVar3 = (r6.c) aVarC2.f143021c;
                                                for (String str19 : gVar8.t()) {
                                                    str19.getClass();
                                                    switch (str19) {
                                                        case "margin":
                                                            p6.d dVarN2 = gVar8.n(str19);
                                                            float fC = dVarN2 instanceof f ? dVarN2.c() : Float.NaN;
                                                            if (!Float.isNaN(fC)) {
                                                                cVar3.l(Float.valueOf(a0Var.f143084a.e(fC)));
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                            break;
                                                        case "direction":
                                                            switch (gVar8.p(str19)) {
                                                                case "bottom":
                                                                    cVar3.f150963n0 = q6.g.c.BOTTOM;
                                                                    break;
                                                                case "end":
                                                                    if (!z15) {
                                                                        cVar3.f150963n0 = q6.g.c.LEFT;
                                                                        break;
                                                                    } else {
                                                                        cVar3.f150963n0 = q6.g.c.RIGHT;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case "top":
                                                                    cVar3.f150963n0 = q6.g.c.TOP;
                                                                    break;
                                                                case "left":
                                                                    cVar3.f150963n0 = q6.g.c.LEFT;
                                                                    break;
                                                                case "right":
                                                                    cVar3.f150963n0 = q6.g.c.RIGHT;
                                                                    break;
                                                                case "start":
                                                                    if (!z15) {
                                                                        cVar3.f150963n0 = q6.g.c.RIGHT;
                                                                        break;
                                                                    } else {
                                                                        cVar3.f150963n0 = q6.g.c.LEFT;
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                        case "contains":
                                                            p6.d dVarN3 = gVar8.n(str19);
                                                            p6.a aVar12 = dVarN3 instanceof p6.a ? (p6.a) dVarN3 : null;
                                                            if (aVar12 == null) {
                                                                break;
                                                            } else {
                                                                for (int i26 = 0; i26 < aVar12.f136192e.size(); i26++) {
                                                                    cVar3.q(a0Var.c(aVar12.i(i26).b()));
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                                dVar = dVar2;
                                                break;
                                            case 7:
                                            case 8:
                                                str2 = str11;
                                                Float fValueOf6 = Float.valueOf(0.5f);
                                                boolean z16 = strP.charAt(0) == 'v';
                                                q6.a aVarC3 = a0Var.c(next);
                                                boolean z17 = z16;
                                                Object obj3 = aVarC3.f143021c;
                                                if (obj3 == null || !(obj3 instanceof r6.f)) {
                                                    r6.f fVar = z17 ? new r6.f(a0Var, q6.g.d.VERTICAL_FLOW) : new r6.f(a0Var, q6.g.d.HORIZONTAL_FLOW);
                                                    aVarC3.f143021c = fVar;
                                                    aVarC3.c(fVar.a());
                                                } else {
                                                    str15 = TtmlNode.START;
                                                }
                                                r6.f fVar2 = (r6.f) aVarC3.f143021c;
                                                Iterator<String> it10 = gVar8.t().iterator();
                                                while (it10.hasNext()) {
                                                    String next3 = it10.next();
                                                    next3.getClass();
                                                    switch (next3.hashCode()) {
                                                        case -1254185091:
                                                            it5 = it10;
                                                            if (next3.equals("hAlign")) {
                                                                b17 = 0;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -1237307863:
                                                            it5 = it10;
                                                            if (next3.equals("hStyle")) {
                                                                b17 = 1;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -1198076529:
                                                            it5 = it10;
                                                            if (next3.equals("hFlowBias")) {
                                                                b17 = 2;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -853376977:
                                                            it5 = it10;
                                                            if (next3.equals("vAlign")) {
                                                                b17 = 3;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -836499749:
                                                            it5 = it10;
                                                            if (next3.equals("vStyle")) {
                                                                b17 = 4;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -806339567:
                                                            it5 = it10;
                                                            if (next3.equals("padding")) {
                                                                b17 = 5;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -732635235:
                                                            it5 = it10;
                                                            if (next3.equals("vFlowBias")) {
                                                                b17 = 6;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -567445985:
                                                            it5 = it10;
                                                            if (next3.equals("contains")) {
                                                                b17 = 7;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case -488900360:
                                                            it5 = it10;
                                                            if (next3.equals("maxElement")) {
                                                                b17 = 8;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case 3169614:
                                                            it5 = it10;
                                                            if (next3.equals("hGap")) {
                                                                b17 = 9;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case 3575610:
                                                            it5 = it10;
                                                            if (next3.equals(str4)) {
                                                                b17 = 10;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case 3586688:
                                                            it5 = it10;
                                                            if (next3.equals("vGap")) {
                                                                b17 = Ascii.VT;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        case 3657802:
                                                            it5 = it10;
                                                            if (next3.equals("wrap")) {
                                                                b17 = Ascii.FF;
                                                            } else {
                                                                b17 = -1;
                                                            }
                                                            break;
                                                        default:
                                                            it5 = it10;
                                                            b17 = -1;
                                                            break;
                                                    }
                                                    switch (b17) {
                                                        case 0:
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            String strB10 = gVar8.j(next3).b();
                                                            if (strB10.equals(TtmlNode.END)) {
                                                                str9 = str15;
                                                                fVar2.f150986z0 = 1;
                                                            } else {
                                                                str9 = str15;
                                                                if (strB10.equals(str9)) {
                                                                    fVar2.f150986z0 = 0;
                                                                } else {
                                                                    fVar2.f150986z0 = 2;
                                                                }
                                                            }
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 1:
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            p6.d dVarJ9 = gVar8.j(next3);
                                                            if (dVarJ9 instanceof p6.a) {
                                                                p6.a aVar13 = (p6.a) dVarJ9;
                                                                if (aVar13.f136192e.size() > 1) {
                                                                    strO = aVar13.o(0);
                                                                    strB3 = aVar13.o(1);
                                                                    strO2 = aVar13.f136192e.size() > 2 ? aVar13.o(2) : "";
                                                                } else {
                                                                    strB3 = dVarJ9.b();
                                                                    strO = "";
                                                                    strO2 = strO;
                                                                }
                                                            } else {
                                                                strB3 = dVarJ9.b();
                                                                strO = "";
                                                                strO2 = strO;
                                                            }
                                                            if (!strB3.equals("")) {
                                                                fVar2.f150982v0 = q6.g.a.a(strB3);
                                                            }
                                                            if (!strO.equals("")) {
                                                                fVar2.f150983w0 = q6.g.a.a(strO);
                                                            }
                                                            if (!strO2.equals("")) {
                                                                fVar2.f150984x0 = q6.g.a.a(strO2);
                                                            }
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 2:
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            p6.d dVarJ10 = gVar8.j(next3);
                                                            if (dVarJ10 instanceof p6.a) {
                                                                p6.a aVar14 = (p6.a) dVarJ10;
                                                                if (aVar14.f136192e.size() > 1) {
                                                                    fValueOf2 = Float.valueOf(aVar14.getFloat(0));
                                                                    fValueOf = Float.valueOf(aVar14.getFloat(1));
                                                                    fValueOf3 = aVar14.f136192e.size() > 2 ? Float.valueOf(aVar14.getFloat(2)) : fValueOf6;
                                                                } else {
                                                                    fValueOf = Float.valueOf(dVarJ10.c());
                                                                    fValueOf2 = fValueOf6;
                                                                    fValueOf3 = fValueOf2;
                                                                }
                                                            } else {
                                                                fValueOf = Float.valueOf(dVarJ10.c());
                                                                fValueOf2 = fValueOf6;
                                                                fValueOf3 = fValueOf2;
                                                            }
                                                            try {
                                                                fVar2.f143031h = fValueOf.floatValue();
                                                                if (fValueOf2.floatValue() != 0.5f) {
                                                                    fVar2.K0 = fValueOf2.floatValue();
                                                                }
                                                                if (fValueOf3.floatValue() != 0.5f) {
                                                                    fVar2.L0 = fValueOf3.floatValue();
                                                                }
                                                            } catch (NumberFormatException unused3) {
                                                            }
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 3:
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            switch (gVar8.j(next3).b()) {
                                                                case "baseline":
                                                                    fVar2.f150985y0 = 3;
                                                                    break;
                                                                case "bottom":
                                                                    fVar2.f150985y0 = 1;
                                                                    break;
                                                                case "top":
                                                                    fVar2.f150985y0 = 0;
                                                                    break;
                                                                default:
                                                                    fVar2.f150985y0 = 2;
                                                                    break;
                                                            }
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 4:
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            p6.d dVarJ11 = gVar8.j(next3);
                                                            if (dVarJ11 instanceof p6.a) {
                                                                p6.a aVar15 = (p6.a) dVarJ11;
                                                                if (aVar15.f136192e.size() > 1) {
                                                                    strO3 = aVar15.o(0);
                                                                    strB4 = aVar15.o(1);
                                                                    strO4 = aVar15.f136192e.size() > 2 ? aVar15.o(2) : "";
                                                                } else {
                                                                    strB4 = dVarJ11.b();
                                                                    strO3 = "";
                                                                    strO4 = strO3;
                                                                }
                                                            } else {
                                                                strB4 = dVarJ11.b();
                                                                strO3 = "";
                                                                strO4 = strO3;
                                                            }
                                                            if (!strB4.equals("")) {
                                                                fVar2.f150979s0 = q6.g.a.a(strB4);
                                                            }
                                                            if (!strO3.equals("")) {
                                                                fVar2.f150980t0 = q6.g.a.a(strO3);
                                                            }
                                                            if (!strO4.equals("")) {
                                                                fVar2.f150981u0 = q6.g.a.a(strO4);
                                                            }
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 5:
                                                            str7 = str4;
                                                            str8 = str14;
                                                            p6.d dVarJ12 = gVar8.j(next3);
                                                            if (dVarJ12 instanceof p6.a) {
                                                                p6.a aVar16 = (p6.a) dVarJ12;
                                                                if (aVar16.f136192e.size() > 1) {
                                                                    float f29 = aVar16.getInt(0);
                                                                    f24 = aVar16.getInt(1);
                                                                    if (aVar16.f136192e.size() > 2) {
                                                                        f22 = aVar16.getInt(2);
                                                                        try {
                                                                            f25 = ((p6.a) dVarJ12).getInt(3);
                                                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                                                            f25 = 0.0f;
                                                                        }
                                                                        fD2 = f29;
                                                                    } else {
                                                                        dVar5 = dVar5;
                                                                        f25 = f24;
                                                                        fD2 = f29;
                                                                        f22 = fD2;
                                                                    }
                                                                } else {
                                                                    fD2 = dVarJ12.d();
                                                                    dVar5 = dVar5;
                                                                    f22 = fD2;
                                                                    f24 = f22;
                                                                    f25 = f24;
                                                                }
                                                            } else {
                                                                fD2 = dVarJ12.d();
                                                                dVar5 = dVar5;
                                                                f22 = fD2;
                                                                f24 = f22;
                                                                f25 = f24;
                                                            }
                                                            fVar2.C0 = Math.round(a0Var.f143084a.e(fD2));
                                                            fVar2.E0 = Math.round(a0Var.f143084a.e(f24));
                                                            fVar2.D0 = Math.round(a0Var.f143084a.e(f22));
                                                            fVar2.F0 = Math.round(a0Var.f143084a.e(f25));
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 6:
                                                            str7 = str4;
                                                            str8 = str14;
                                                            p6.d dVarJ13 = gVar8.j(next3);
                                                            if (dVarJ13 instanceof p6.a) {
                                                                p6.a aVar17 = (p6.a) dVarJ13;
                                                                if (aVar17.f136192e.size() > 1) {
                                                                    Float fValueOf7 = Float.valueOf(aVar17.getFloat(0));
                                                                    fValueOf4 = Float.valueOf(aVar17.getFloat(1));
                                                                    fValueOf5 = aVar17.f136192e.size() > 2 ? Float.valueOf(aVar17.getFloat(2)) : fValueOf6;
                                                                    f26 = fValueOf7;
                                                                } else {
                                                                    fValueOf4 = Float.valueOf(dVarJ13.c());
                                                                    f26 = fValueOf6;
                                                                    fValueOf5 = f26;
                                                                }
                                                            } else {
                                                                fValueOf4 = Float.valueOf(dVarJ13.c());
                                                                f26 = fValueOf6;
                                                                fValueOf5 = f26;
                                                            }
                                                            try {
                                                                fVar2.f143033i = fValueOf4.floatValue();
                                                                if (f26.floatValue() != 0.5f) {
                                                                    fVar2.I0 = f26.floatValue();
                                                                }
                                                                if (fValueOf5.floatValue() != 0.5f) {
                                                                    fVar2.J0 = fValueOf5.floatValue();
                                                                }
                                                            } catch (NumberFormatException unused5) {
                                                            }
                                                            dVar5 = dVar5;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 7:
                                                            p6.d dVarJ14 = gVar8.j(next3);
                                                            if (dVarJ14 instanceof p6.a) {
                                                                p6.a aVar18 = (p6.a) dVarJ14;
                                                                str7 = str4;
                                                                if (aVar18.f136192e.size() >= 1) {
                                                                    int i27 = 0;
                                                                    while (i27 < aVar18.f136192e.size()) {
                                                                        p6.d dVarI5 = aVar18.i(i27);
                                                                        int i28 = i27;
                                                                        if (dVarI5 instanceof p6.a) {
                                                                            p6.a aVar19 = (p6.a) dVarI5;
                                                                            if (aVar19.f136192e.size() > 0) {
                                                                                String strB11 = aVar19.i(0).b();
                                                                                str10 = str14;
                                                                                int size3 = aVar19.f136192e.size();
                                                                                aVar = aVar18;
                                                                                if (size3 != 2) {
                                                                                    if (size3 == 3) {
                                                                                        f27 = aVar19.getFloat(1);
                                                                                        fE4 = a0Var.f143084a.e(aVar19.getFloat(2));
                                                                                    } else if (size3 != 4) {
                                                                                        fE4 = Float.NaN;
                                                                                        f27 = Float.NaN;
                                                                                        fE5 = Float.NaN;
                                                                                    } else {
                                                                                        float f34 = aVar19.getFloat(1);
                                                                                        fE4 = a0Var.f143084a.e(aVar19.getFloat(2));
                                                                                        fE5 = a0Var.f143084a.e(aVar19.getFloat(3));
                                                                                        f27 = f34;
                                                                                    }
                                                                                    fVar2.q(strB11);
                                                                                    if (!Float.isNaN(f27)) {
                                                                                        if (fVar2.f150975o0 == null) {
                                                                                            fVar2.f150975o0 = new HashMap<>();
                                                                                        }
                                                                                        fVar2.f150975o0.put(strB11, Float.valueOf(f27));
                                                                                    }
                                                                                    if (!Float.isNaN(fE4)) {
                                                                                        if (fVar2.f150976p0 == null) {
                                                                                            fVar2.f150976p0 = new HashMap<>();
                                                                                        }
                                                                                        fVar2.f150976p0.put(strB11, Float.valueOf(fE4));
                                                                                    }
                                                                                    if (Float.isNaN(fE5)) {
                                                                                        if (fVar2.f150977q0 == null) {
                                                                                            fVar2.f150977q0 = new HashMap<>();
                                                                                        }
                                                                                        fVar2.f150977q0.put(strB11, Float.valueOf(fE5));
                                                                                    }
                                                                                } else {
                                                                                    f27 = aVar19.getFloat(1);
                                                                                    fE4 = Float.NaN;
                                                                                }
                                                                                fE5 = fE4;
                                                                                fVar2.q(strB11);
                                                                                if (!Float.isNaN(f27)) {
                                                                                    if (fVar2.f150975o0 == null) {
                                                                                        fVar2.f150975o0 = new HashMap<>();
                                                                                    }
                                                                                    fVar2.f150975o0.put(strB11, Float.valueOf(f27));
                                                                                }
                                                                                if (!Float.isNaN(fE4)) {
                                                                                    if (fVar2.f150976p0 == null) {
                                                                                        fVar2.f150976p0 = new HashMap<>();
                                                                                    }
                                                                                    fVar2.f150976p0.put(strB11, Float.valueOf(fE4));
                                                                                }
                                                                                if (Float.isNaN(fE5)) {
                                                                                    if (fVar2.f150977q0 == null) {
                                                                                        fVar2.f150977q0 = new HashMap<>();
                                                                                    }
                                                                                    fVar2.f150977q0.put(strB11, Float.valueOf(fE5));
                                                                                }
                                                                            } else {
                                                                                str10 = str14;
                                                                                aVar = aVar18;
                                                                            }
                                                                        } else {
                                                                            str10 = str14;
                                                                            aVar = aVar18;
                                                                            fVar2.q(dVarI5.b());
                                                                        }
                                                                        i27 = i28 + 1;
                                                                        str14 = str10;
                                                                        aVar18 = aVar;
                                                                    }
                                                                    str8 = str14;
                                                                    dVar5 = dVar5;
                                                                    str9 = str15;
                                                                    str15 = str9;
                                                                    it10 = it5;
                                                                    dVar5 = dVar5;
                                                                    str4 = str7;
                                                                    str14 = str8;
                                                                    break;
                                                                }
                                                            }
                                                            PrintStream printStream2 = System.err;
                                                            StringBuilder sbI2 = sn.a.i(next, " contains should be an array \"");
                                                            sbI2.append(dVarJ14.b());
                                                            sbI2.append("\"");
                                                            printStream2.println(sbI2.toString());
                                                            break;
                                                        case 8:
                                                            fVar2.G0 = gVar8.j(next3).d();
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 9:
                                                            fVar2.B0 = gVar8.j(next3).d();
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 10:
                                                            if (gVar8.j(next3).b().equals(str14)) {
                                                                fVar2.H0 = 0;
                                                            } else {
                                                                fVar2.H0 = 1;
                                                            }
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 11:
                                                            fVar2.A0 = gVar8.j(next3).d();
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        case 12:
                                                            String strB12 = gVar8.j(next3).b();
                                                            HashMap map5 = q6.g.e.f143137a;
                                                            fVar2.f150978r0 = map5.containsKey(strB12) ? ((Integer) map5.get(strB12)).intValue() : -1;
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                        default:
                                                            b.a(next3, gVar8, a0Var.c(next), dVar5, a0Var);
                                                            dVar5 = dVar5;
                                                            str7 = str4;
                                                            str8 = str14;
                                                            str9 = str15;
                                                            str15 = str9;
                                                            it10 = it5;
                                                            dVar5 = dVar5;
                                                            str4 = str7;
                                                            str14 = str8;
                                                            break;
                                                    }
                                                    dVar2 = dVar5;
                                                    dVar = dVar2;
                                                }
                                                dVar2 = dVar5;
                                                dVar = dVar2;
                                                break;
                                            case 9:
                                                b.f(0, a0Var, next, gVar8);
                                            default:
                                                dVar = dVar5;
                                                str2 = str11;
                                                break;
                                        }
                                    } else {
                                        gVar = gVar4;
                                        dVar = dVar5;
                                        str2 = str11;
                                        it = it6;
                                        b.g(a0Var, dVar, next, gVar8);
                                    }
                                } else {
                                    gVar = gVar4;
                                    dVar = dVar5;
                                    str2 = str11;
                                    it = it6;
                                    if (dVarJ instanceof f) {
                                        dVar.f143063a.put(next, Integer.valueOf(dVarJ.d()));
                                    }
                                }
                                str = str2;
                                aVar2 = this;
                                dVar5 = dVar;
                                str11 = str;
                                z14 = false;
                                gVar4 = gVar;
                                break;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Object f81969t = list.get(i14).getF81969t();
                l lVar = f81969t instanceof l ? (l) f81969t : null;
                if (lVar != null) {
                    e eVar = lVar.f110480a;
                    m mVar = pVar.f110489a;
                    mVar.getClass();
                    String string2 = eVar.f110465b.toString();
                    g gVar11 = mVar.f110470a;
                    p6.d dVarN4 = gVar11.n(string2);
                    if ((dVarN4 instanceof g ? (g) dVarN4 : null) == null) {
                        gVar11.u(string2, new g(new char[0]));
                    }
                    p6.d dVarJ15 = gVar11.j(string2);
                    if (!(dVarJ15 instanceof g)) {
                        StringBuilder sbL = hb.a.l("no object found for key <", string2, ">, found [");
                        sbL.append(dVarJ15.e());
                        sbL.append("] : ");
                        sbL.append(dVarJ15);
                        throw new CLParsingException(sbL.toString(), gVar11);
                    }
                    lVar.f110481b.invoke(new d(eVar.f110465b, (g) dVarJ15));
                }
                pVar.f110494f.add(lVar);
                i14++;
            }
        }
    }

    /* JADX INFO: renamed from: l6.p$b, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "invoke", "(Le23/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class Function0 extends w implements l<e23.a<? extends Unit>, Unit> {
        public Function0() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(e23.a<? extends Unit> aVar) {
            e23.a<? extends Unit> aVar2 = aVar;
            if (s.g(Looper.myLooper(), Looper.getMainLooper())) {
                aVar2.invoke();
            } else {
                p pVar = p.this;
                Handler handler = pVar.f110490b;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    pVar.f110490b = handler;
                }
                handler.post(new com.garmin.android.music.c(aVar2, 7));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends w implements l<Unit, Unit> {
        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(Unit unit) {
            p.this.f110492d = true;
            return Unit.INSTANCE;
        }
    }

    public p(m mVar) {
        this.f110489a = mVar;
    }

    @Override // p007l6.o
    public final boolean a(List<? extends y0> list) {
        if (this.f110492d) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.f110494f;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Object f81969t = list.get(i14).getF81969t();
            if (!s.g(f81969t instanceof l ? (l) f81969t : null, arrayList.get(i14))) {
                return true;
            }
        }
        return false;
    }

    @Override // p007l6.o
    public final void b(a0 a0Var, List<? extends y0> list) {
        this.f110494f.clear();
        this.f110491c.d(Unit.INSTANCE, this.f110493e, new a(list, this, a0Var));
        this.f110492d = false;
    }

    @Override // p3.y2
    public final void onAbandoned() {
    }

    @Override // p3.y2
    public final void onForgotten() {
        v vVar = this.f110491c;
        n nVar = vVar.f68820h;
        if (nVar != null) {
            nVar.c();
        }
        vVar.a();
    }

    @Override // p3.y2
    public final void onRemembered() {
        v vVar = this.f110491c;
        vVar.getClass();
        f4.f.a aVar = f4.f.f68735e;
        dh1.a aVar2 = vVar.f68816d;
        aVar.getClass();
        vVar.f68820h = f4.f.a.d(aVar2);
    }
}
