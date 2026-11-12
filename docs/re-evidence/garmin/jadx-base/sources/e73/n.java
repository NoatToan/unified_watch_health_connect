package e73;

import ch.qos.logback.core.CoreConstants;
import h73.u;
import h73.w;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f63383i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f63384j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f63385k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f63386l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f63387m = Pattern.compile("`+");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f63388n = Pattern.compile("^`+");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f63389o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f63390p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f63391q = Pattern.compile("^ *(?:\n *)?");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f63392r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f63393s = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f63394t = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitSet f63395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitSet f63396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f63397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i73.a f63398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f63401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f63402h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f63404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f63405c;

        public a(int i14, boolean z14, boolean z15) {
            this.f63403a = i14;
            this.f63405c = z14;
            this.f63404b = z15;
        }
    }

    public n(i73.a aVar) {
        List<k73.a> list = ((m) aVar).f63381a;
        HashMap map = new HashMap();
        b(map, Arrays.asList(new f73.a(), new f73.c()));
        b(map, list);
        this.f63397c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.f63396b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f63395a = bitSet2;
        this.f63398d = aVar;
    }

    public static void a(char c14, k73.a aVar, HashMap map) {
        if (((k73.a) map.put(Character.valueOf(c14), aVar)) == null) {
            return;
        }
        com.nimbusds.jose.shaded.gson.internal.a.n(c14, "Delimiter processor conflict with delimiter char '", "'");
    }

    public static void b(HashMap map, List list) {
        s sVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k73.a aVar = (k73.a) it.next();
            char cE = aVar.e();
            char cA = aVar.a();
            if (cE == cA) {
                k73.a aVar2 = (k73.a) map.get(Character.valueOf(cE));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    a(cE, aVar, map);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(cE);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(cE), sVar);
                }
            } else {
                a(cE, aVar, map);
                a(cA, aVar, map);
            }
        }
    }

    public static void d(w wVar, w wVar2, int i14) {
        if (wVar == null || wVar2 == null || wVar == wVar2) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(wVar.f82386f);
        h73.r rVar = wVar.f82383e;
        h73.r rVar2 = wVar2.f82383e;
        while (rVar != rVar2) {
            sb3.append(((w) rVar).f82386f);
            h73.r rVar3 = rVar.f82383e;
            rVar.f();
            rVar = rVar3;
        }
        wVar.f82386f = sb3.toString();
    }

    public static void e(h73.r rVar, h73.r rVar2) {
        w wVar = null;
        w wVar2 = null;
        int length = 0;
        while (rVar != null) {
            if (rVar instanceof w) {
                wVar2 = (w) rVar;
                if (wVar == null) {
                    wVar = wVar2;
                }
                length = wVar2.f82386f.length() + length;
            } else {
                d(wVar, wVar2, length);
                wVar = null;
                wVar2 = null;
                length = 0;
            }
            if (rVar == rVar2) {
                break;
            } else {
                rVar = rVar.f82383e;
            }
        }
        d(wVar, wVar2, length);
    }

    public final String c(Pattern pattern) {
        if (this.f63400f >= this.f63399e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f63399e);
        matcher.region(this.f63400f, this.f63399e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f63400f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f1 A[PHI: r6
      0x01f1: PHI (r6v28 char) = (r6v27 char), (r6v29 char), (r6v30 char) binds: [B:113:0x01e6, B:115:0x01ea, B:118:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:141:0x0244  */
    /* JADX WARN: Code duplicated, block: B:143:0x024e  */
    /* JADX WARN: Code duplicated, block: B:148:0x026a  */
    /* JADX WARN: Code duplicated, block: B:159:0x028c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0294  */
    /* JADX WARN: Code duplicated, block: B:162:0x0298  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ec A[LOOP:3: B:173:0x02ea->B:174:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x030d A[ADDED_TO_REGION, LOOP:4: B:181:0x030d->B:185:0x0316, LOOP_START, PHI: r2
      0x030d: PHI (r2v72 e73.e) = (r2v71 e73.e), (r2v73 e73.e) binds: [B:180:0x030b, B:185:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x030f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0313  */
    /* JADX WARN: Code duplicated, block: B:186:0x0319  */
    /* JADX WARN: Code duplicated, block: B:204:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:231:0x044f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0457  */
    /* JADX WARN: Code duplicated, block: B:260:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:265:0x050b A[LOOP:0: B:3:0x0013->B:265:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x051c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:269:0x051d  */
    /* JADX WARN: Code duplicated, block: B:271:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [h73.w] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r19v0, types: [h73.r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v18, types: [h73.d] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v27, types: [h73.r] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v44, types: [h73.w] */
    /* JADX WARN: Type inference failed for: r4v45, types: [h73.w] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v61, types: [h73.r] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r5v25, types: [e73.n$a] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    public final void f(String str, h73.r rVar) {
        int i14;
        Object uVar;
        ?? r14;
        ?? r15;
        Object wVar;
        w wVar2;
        ?? wVar3;
        h73.n nVar;
        ?? dVar;
        int i15;
        String strA;
        String strA2;
        boolean z14;
        h73.r rVar2;
        h73.r rVar3;
        h73.r rVar4;
        e eVar;
        int i16;
        int i17;
        String strSubstring;
        h73.o oVar;
        int iB;
        int iC;
        int i18;
        int i19;
        w wVar4;
        ?? r16;
        ?? r17;
        ?? aVar;
        h73.r rVar5;
        h73.r rVar6;
        this.f63399e = str.trim();
        int i24 = 0;
        this.f63400f = 0;
        w wVar5 = null;
        this.f63401g = null;
        this.f63402h = null;
        ?? r18 = 0;
        while (true) {
            char cG = g();
            if (cG == 0) {
                i14 = i24;
            } else {
                if (cG == '\n') {
                    this.f63400f++;
                    if (r18 instanceof w) {
                        w wVar6 = (w) r18;
                        if (wVar6.f82386f.endsWith(StringUtils.SPACE)) {
                            String str2 = wVar6.f82386f;
                            Matcher matcher = f63394t.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i14 = 0;
                            if (iEnd > 0) {
                                wVar6.f82386f = fb1.c.m(iEnd, 0, str2);
                            }
                            uVar = iEnd >= 2 ? new h73.h() : new u();
                        } else {
                            i14 = 0;
                            uVar = new u();
                        }
                    } else {
                        i14 = 0;
                        uVar = new u();
                    }
                    r14 = uVar;
                } else if (cG == '!') {
                    int i25 = this.f63400f + 1;
                    this.f63400f = i25;
                    if (g() == '[') {
                        this.f63400f++;
                        wVar2 = new w("![");
                        e eVarA = e.a(wVar2, i25, this.f63402h, this.f63401g);
                        e eVar2 = this.f63402h;
                        if (eVar2 != null) {
                            eVar2.f63341g = true;
                        }
                        this.f63402h = eVarA;
                        wVar3 = wVar2;
                        i14 = 0;
                        r14 = wVar3;
                    } else {
                        wVar = new w("!");
                        wVar3 = wVar;
                        i14 = 0;
                        r14 = wVar3;
                    }
                } else if (cG == '&') {
                    String strC = c(f63386l);
                    if (strC != null) {
                        wVar2 = new w(g73.b.a(strC));
                        wVar3 = wVar2;
                    } else {
                        wVar3 = 0;
                    }
                    i14 = 0;
                    r14 = wVar3;
                } else if (cG != '<') {
                    if (cG != '`') {
                        switch (cG) {
                            case '[':
                                int i26 = this.f63400f;
                                this.f63400f = i26 + 1;
                                wVar3 = new w("[");
                                e eVarB = e.b(wVar3, i26, this.f63402h, this.f63401g);
                                e eVar3 = this.f63402h;
                                if (eVar3 != null) {
                                    eVar3.f63341g = true;
                                }
                                this.f63402h = eVarB;
                                i14 = 0;
                                r14 = wVar3;
                                break;
                            case '\\':
                                this.f63400f++;
                                if (g() == '\n') {
                                    wVar = new h73.h();
                                    this.f63400f++;
                                } else {
                                    if (this.f63400f < this.f63399e.length()) {
                                        String str3 = this.f63399e;
                                        int i27 = this.f63400f;
                                        if (f63385k.matcher(str3.substring(i27, i27 + 1)).matches()) {
                                            String str4 = this.f63399e;
                                            int i28 = this.f63400f;
                                            w wVar7 = new w(str4.substring(i28, i28 + 1));
                                            this.f63400f++;
                                            wVar3 = wVar7;
                                        }
                                        i14 = 0;
                                        r14 = wVar3;
                                    }
                                    wVar = new w("\\");
                                }
                                wVar3 = wVar;
                                i14 = 0;
                                r14 = wVar3;
                                break;
                            case ']':
                                int i29 = this.f63400f + 1;
                                this.f63400f = i29;
                                e eVar4 = this.f63402h;
                                if (eVar4 != null) {
                                    w wVar8 = eVar4.f63335a;
                                    boolean z15 = eVar4.f63337c;
                                    if (!eVar4.f63340f) {
                                        this.f63402h = eVar4.f63338d;
                                        dVar = new w("]");
                                    } else {
                                        if (g() == '(') {
                                            this.f63400f++;
                                            Pattern pattern = f63391q;
                                            c(pattern);
                                            i15 = 1;
                                            int iA = g73.c.a(this.f63400f, this.f63399e);
                                            if (iA == -1) {
                                                strA = null;
                                            } else {
                                                char cG2 = g();
                                                String str5 = this.f63399e;
                                                int i30 = this.f63400f;
                                                String strSubstring2 = cG2 == '<' ? str5.substring(i30 + 1, iA - 1) : str5.substring(i30, iA);
                                                this.f63400f = iA;
                                                strA = g73.a.a(strSubstring2);
                                            }
                                            if (strA != null) {
                                                c(pattern);
                                                String str6 = this.f63399e;
                                                int i34 = this.f63400f;
                                                if (f63393s.matcher(str6.substring(i34 - 1, i34)).matches()) {
                                                    String str7 = this.f63399e;
                                                    int i35 = this.f63400f;
                                                    if (i35 >= str7.length()) {
                                                        i19 = -1;
                                                        i18 = -1;
                                                    } else {
                                                        char cCharAt = str7.charAt(i35);
                                                        char c14 = CoreConstants.DOUBLE_QUOTE_CHAR;
                                                        if (cCharAt != '\"') {
                                                            c14 = CoreConstants.SINGLE_QUOTE_CHAR;
                                                            if (cCharAt == '\'') {
                                                                iC = g73.c.c(str7, i35 + 1, c14);
                                                                if (iC == -1 && iC < str7.length() && str7.charAt(iC) == c14) {
                                                                    i18 = iC + 1;
                                                                    i19 = -1;
                                                                } else {
                                                                    i19 = -1;
                                                                    i18 = -1;
                                                                }
                                                            } else if (cCharAt != '(') {
                                                                i19 = -1;
                                                                i18 = -1;
                                                            } else {
                                                                c14 = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                                                                iC = g73.c.c(str7, i35 + 1, c14);
                                                                if (iC == -1) {
                                                                    i19 = -1;
                                                                    i18 = -1;
                                                                } else {
                                                                    i18 = iC + 1;
                                                                    i19 = -1;
                                                                }
                                                            }
                                                        } else {
                                                            iC = g73.c.c(str7, i35 + 1, c14);
                                                            if (iC == -1) {
                                                                i19 = -1;
                                                                i18 = -1;
                                                            } else {
                                                                i18 = iC + 1;
                                                                i19 = -1;
                                                            }
                                                        }
                                                    }
                                                    if (i18 == i19) {
                                                        strA2 = null;
                                                    } else {
                                                        String strSubstring3 = this.f63399e.substring(this.f63400f + 1, i18 - 1);
                                                        this.f63400f = i18;
                                                        strA2 = g73.a.a(strSubstring3);
                                                    }
                                                    c(pattern);
                                                } else {
                                                    strA2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f63400f++;
                                                    z14 = true;
                                                } else {
                                                    this.f63400f = i29;
                                                }
                                                if (!z14) {
                                                    i16 = this.f63400f;
                                                    if (i16 < this.f63399e.length() && this.f63399e.charAt(this.f63400f) == '[') {
                                                        int i36 = this.f63400f + 1;
                                                        iB = g73.c.b(i36, this.f63399e);
                                                        int i37 = iB - i36;
                                                        if (iB != -1 && i37 <= 999 && iB < this.f63399e.length() && this.f63399e.charAt(iB) == ']') {
                                                            this.f63400f = iB + 1;
                                                        }
                                                    }
                                                    i17 = this.f63400f - i16;
                                                    if (i17 > 2) {
                                                        strSubstring = this.f63399e.substring(i16, i17 + i16);
                                                    } else if (eVar4.f63341g) {
                                                        strSubstring = null;
                                                    } else {
                                                        strSubstring = this.f63399e.substring(eVar4.f63336b, i29);
                                                    }
                                                    if (strSubstring != null) {
                                                        Pattern pattern2 = g73.a.f76209a;
                                                        oVar = ((m) this.f63398d).f63382b.get(g73.a.f76211c.matcher(strSubstring.substring(i15, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(StringUtils.SPACE));
                                                        if (oVar != null) {
                                                            strA = oVar.f82376g;
                                                            strA2 = oVar.f82377h;
                                                            z14 = true;
                                                        }
                                                    }
                                                }
                                                if (!z14) {
                                                    this.f63400f = i29;
                                                    this.f63402h = this.f63402h.f63338d;
                                                    wVar = new w("]");
                                                    wVar3 = wVar;
                                                    i14 = 0;
                                                    r14 = wVar3;
                                                } else {
                                                    if (z15) {
                                                        dVar = new h73.l(strA, strA2);
                                                    } else {
                                                        dVar = new h73.n(strA, strA2);
                                                    }
                                                    rVar2 = wVar8.f82383e;
                                                    while (rVar2 != null) {
                                                        h73.r rVar7 = rVar2.f82383e;
                                                        dVar.b(rVar2);
                                                        rVar2 = rVar7;
                                                    }
                                                    h(eVar4.f63339e);
                                                    rVar3 = dVar.f82380b;
                                                    rVar4 = dVar.f82381c;
                                                    if (rVar3 != rVar4) {
                                                        e(rVar3, rVar4);
                                                    }
                                                    wVar8.f();
                                                    eVar = this.f63402h.f63338d;
                                                    this.f63402h = eVar;
                                                    if (!z15) {
                                                        while (eVar != null) {
                                                            if (!eVar.f63337c) {
                                                                eVar.f63340f = false;
                                                            }
                                                            eVar = eVar.f63338d;
                                                        }
                                                    }
                                                }
                                            }
                                            z14 = false;
                                            if (!z14) {
                                                i16 = this.f63400f;
                                                if (i16 < this.f63399e.length()) {
                                                    int i38 = this.f63400f + 1;
                                                    iB = g73.c.b(i38, this.f63399e);
                                                    int i39 = iB - i38;
                                                    if (iB != -1) {
                                                        this.f63400f = iB + 1;
                                                    }
                                                }
                                                i17 = this.f63400f - i16;
                                                if (i17 > 2) {
                                                    strSubstring = this.f63399e.substring(i16, i17 + i16);
                                                } else if (eVar4.f63341g) {
                                                    strSubstring = this.f63399e.substring(eVar4.f63336b, i29);
                                                } else {
                                                    strSubstring = null;
                                                }
                                                if (strSubstring != null) {
                                                    Pattern pattern3 = g73.a.f76209a;
                                                    oVar = ((m) this.f63398d).f63382b.get(g73.a.f76211c.matcher(strSubstring.substring(i15, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(StringUtils.SPACE));
                                                    if (oVar != null) {
                                                        strA = oVar.f82376g;
                                                        strA2 = oVar.f82377h;
                                                        z14 = true;
                                                    }
                                                }
                                            }
                                            if (!z14) {
                                                this.f63400f = i29;
                                                this.f63402h = this.f63402h.f63338d;
                                                wVar = new w("]");
                                                wVar3 = wVar;
                                                i14 = 0;
                                                r14 = wVar3;
                                            } else {
                                                if (z15) {
                                                    dVar = new h73.l(strA, strA2);
                                                } else {
                                                    dVar = new h73.n(strA, strA2);
                                                }
                                                rVar2 = wVar8.f82383e;
                                                while (rVar2 != null) {
                                                    h73.r rVar8 = rVar2.f82383e;
                                                    dVar.b(rVar2);
                                                    rVar2 = rVar8;
                                                }
                                                h(eVar4.f63339e);
                                                rVar3 = dVar.f82380b;
                                                rVar4 = dVar.f82381c;
                                                if (rVar3 != rVar4) {
                                                    e(rVar3, rVar4);
                                                }
                                                wVar8.f();
                                                eVar = this.f63402h.f63338d;
                                                this.f63402h = eVar;
                                                if (!z15) {
                                                    while (eVar != null) {
                                                        if (!eVar.f63337c) {
                                                            eVar.f63340f = false;
                                                        }
                                                        eVar = eVar.f63338d;
                                                    }
                                                }
                                            }
                                        } else {
                                            i15 = 1;
                                            strA = null;
                                        }
                                        strA2 = null;
                                        z14 = false;
                                        if (!z14) {
                                            i16 = this.f63400f;
                                            if (i16 < this.f63399e.length()) {
                                                int i310 = this.f63400f + 1;
                                                iB = g73.c.b(i310, this.f63399e);
                                                int i311 = iB - i310;
                                                if (iB != -1) {
                                                    this.f63400f = iB + 1;
                                                }
                                            }
                                            i17 = this.f63400f - i16;
                                            if (i17 > 2) {
                                                strSubstring = this.f63399e.substring(i16, i17 + i16);
                                            } else if (eVar4.f63341g) {
                                                strSubstring = this.f63399e.substring(eVar4.f63336b, i29);
                                            } else {
                                                strSubstring = null;
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern4 = g73.a.f76209a;
                                                oVar = ((m) this.f63398d).f63382b.get(g73.a.f76211c.matcher(strSubstring.substring(i15, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(StringUtils.SPACE));
                                                if (oVar != null) {
                                                    strA = oVar.f82376g;
                                                    strA2 = oVar.f82377h;
                                                    z14 = true;
                                                }
                                            }
                                        }
                                        if (!z14) {
                                            this.f63400f = i29;
                                            this.f63402h = this.f63402h.f63338d;
                                            wVar = new w("]");
                                            wVar3 = wVar;
                                            i14 = 0;
                                            r14 = wVar3;
                                        } else {
                                            if (z15) {
                                                dVar = new h73.l(strA, strA2);
                                            } else {
                                                dVar = new h73.n(strA, strA2);
                                            }
                                            rVar2 = wVar8.f82383e;
                                            while (rVar2 != null) {
                                                h73.r rVar9 = rVar2.f82383e;
                                                dVar.b(rVar2);
                                                rVar2 = rVar9;
                                            }
                                            h(eVar4.f63339e);
                                            rVar3 = dVar.f82380b;
                                            rVar4 = dVar.f82381c;
                                            if (rVar3 != rVar4) {
                                                e(rVar3, rVar4);
                                            }
                                            wVar8.f();
                                            eVar = this.f63402h.f63338d;
                                            this.f63402h = eVar;
                                            if (!z15) {
                                                while (eVar != null) {
                                                    if (!eVar.f63337c) {
                                                        eVar.f63340f = false;
                                                    }
                                                    eVar = eVar.f63338d;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    dVar = new w("]");
                                }
                                break;
                            default:
                                if (this.f63396b.get(cG)) {
                                    k73.a aVar2 = (k73.a) this.f63397c.get(Character.valueOf(cG));
                                    int i44 = this.f63400f;
                                    int i45 = i24;
                                    while (g() == cG) {
                                        i45++;
                                        this.f63400f++;
                                    }
                                    if (i45 < aVar2.d()) {
                                        this.f63400f = i44;
                                        aVar = wVar5;
                                    } else {
                                        String strSubstring4 = i44 == 0 ? "\n" : this.f63399e.substring(i44 - 1, i44);
                                        char cG3 = g();
                                        String strValueOf = cG3 != 0 ? String.valueOf(cG3) : "\n";
                                        Pattern pattern5 = f63383i;
                                        boolean zMatches = pattern5.matcher(strSubstring4).matches();
                                        Pattern pattern6 = f63392r;
                                        boolean zMatches2 = pattern6.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern5.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern6.matcher(strValueOf).matches();
                                        int i46 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i24 : 1;
                                        int i47 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i24 : 1;
                                        if (cG == '_') {
                                            int i48 = (i46 == 0 || !(i47 == 0 || zMatches)) ? i24 : 1;
                                            if (i47 == 0 || !(i46 == 0 || zMatches3)) {
                                                r17 = i24;
                                                r16 = i48;
                                            } else {
                                                r17 = 1;
                                                r16 = i48;
                                            }
                                        } else {
                                            int i49 = (i46 == 0 || cG != aVar2.e()) ? i24 : 1;
                                            int i54 = (i47 == 0 || cG != aVar2.a()) ? i24 : 1;
                                            r16 = i49;
                                            r17 = i54;
                                        }
                                        this.f63400f = i44;
                                        aVar = new a(i45, r16, r17);
                                    }
                                    if (aVar == 0) {
                                        wVar4 = wVar5;
                                    } else {
                                        int i55 = aVar.f63403a;
                                        int i56 = this.f63400f;
                                        int i57 = i56 + i55;
                                        this.f63400f = i57;
                                        w wVar9 = new w(this.f63399e.substring(i56, i57));
                                        f fVar = new f(wVar9, cG, aVar.f63405c, aVar.f63404b, this.f63401g);
                                        this.f63401g = fVar;
                                        fVar.f63348g = i55;
                                        fVar.f63349h = i55;
                                        f fVar2 = fVar.f63346e;
                                        if (fVar2 != null) {
                                            fVar2.f63347f = fVar;
                                        }
                                        wVar4 = wVar9;
                                    }
                                } else {
                                    int i58 = this.f63400f;
                                    int length = this.f63399e.length();
                                    while (true) {
                                        int i59 = this.f63400f;
                                        if (i59 != length) {
                                            if (!this.f63395a.get(this.f63399e.charAt(i59))) {
                                                this.f63400f++;
                                            }
                                        }
                                    }
                                    int i64 = this.f63400f;
                                    if (i58 != i64) {
                                        wVar4 = new w(this.f63399e.substring(i58, i64));
                                    } else {
                                        wVar4 = wVar5;
                                    }
                                }
                                i14 = i24;
                                r14 = wVar4;
                                break;
                        }
                    } else {
                        String strC2 = c(f63388n);
                        if (strC2 == null) {
                            wVar3 = 0;
                        } else {
                            int i65 = this.f63400f;
                            while (true) {
                                String strC3 = c(f63387m);
                                if (strC3 == null) {
                                    this.f63400f = i65;
                                    wVar2 = new w(strC2);
                                    wVar3 = wVar2;
                                } else if (strC3.equals(strC2)) {
                                    dVar = new h73.d();
                                    String strReplace = this.f63399e.substring(i65, this.f63400f - strC2.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (g73.d.b(' ', 0, length2, strReplace) != length2) {
                                            strReplace = fb1.c.m(1, 1, strReplace);
                                        }
                                    }
                                    dVar.f82363f = strReplace;
                                }
                            }
                        }
                        i14 = 0;
                        r14 = wVar3;
                    }
                    wVar3 = dVar;
                    i14 = 0;
                    r14 = wVar3;
                } else {
                    String strC4 = c(f63389o);
                    if (strC4 != null) {
                        String strM = fb1.c.m(1, 1, strC4);
                        nVar = new h73.n("mailto:".concat(strM), null);
                        nVar.b(new w(strM));
                    } else {
                        String strC5 = c(f63390p);
                        if (strC5 != null) {
                            String strM2 = fb1.c.m(1, 1, strC5);
                            nVar = new h73.n(strM2, null);
                            nVar.b(new w(strM2));
                        } else {
                            wVar3 = 0;
                        }
                        if (wVar3 == 0) {
                            if (c(f63384j) != null) {
                                wVar = new h73.k();
                                wVar3 = wVar;
                            } else {
                                wVar3 = 0;
                            }
                        }
                        i14 = 0;
                        r14 = wVar3;
                    }
                    wVar3 = nVar;
                    if (wVar3 == 0) {
                        if (c(f63384j) != null) {
                            wVar = new h73.k();
                            wVar3 = wVar;
                        } else {
                            wVar3 = 0;
                        }
                    }
                    i14 = 0;
                    r14 = wVar3;
                }
                if (r14 != 0) {
                    r15 = r14;
                } else {
                    this.f63400f++;
                    wVar5 = new w(String.valueOf(cG));
                }
                if (r15 != 0) {
                    h(null);
                    rVar5 = rVar.f82380b;
                    rVar6 = rVar.f82381c;
                    if (rVar5 == rVar6) {
                        return;
                    }
                    e(rVar5, rVar6);
                    return;
                }
                rVar.b(r15);
                i24 = i14;
                wVar5 = null;
                r18 = r15;
            }
            r15 = wVar5;
            if (r15 != 0) {
                h(null);
                rVar5 = rVar.f82380b;
                rVar6 = rVar.f82381c;
                if (rVar5 == rVar6) {
                    return;
                }
                e(rVar5, rVar6);
                return;
            }
            rVar.b(r15);
            i24 = i14;
            wVar5 = null;
            r18 = r15;
        }
    }

    public final char g() {
        if (this.f63400f < this.f63399e.length()) {
            return this.f63399e.charAt(this.f63400f);
        }
        return (char) 0;
    }

    public final void h(f fVar) {
        boolean z14;
        h73.r rVar;
        HashMap map = new HashMap();
        f fVar2 = this.f63401g;
        while (fVar2 != null) {
            f fVar3 = fVar2.f63346e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            w wVar = fVar2.f63342a;
            char c14 = fVar2.f63343b;
            k73.a aVar = (k73.a) this.f63397c.get(Character.valueOf(c14));
            if (!fVar2.f63345d || aVar == null) {
                fVar2 = fVar2.f63347f;
            } else {
                char cE = aVar.e();
                f fVar4 = fVar2.f63346e;
                int iB = 0;
                boolean z15 = false;
                while (true) {
                    if (fVar4 == null || fVar4 == fVar || fVar4 == map.get(Character.valueOf(c14))) {
                        z14 = z15;
                        z15 = false;
                        break;
                    }
                    if (fVar4.f63344c && fVar4.f63343b == cE) {
                        iB = aVar.b(fVar4, fVar2);
                        z15 = true;
                        if (iB > 0) {
                            z14 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.f63346e;
                }
                if (z15) {
                    w wVar2 = fVar4.f63342a;
                    fVar4.f63348g -= iB;
                    fVar2.f63348g -= iB;
                    wVar2.f82386f = fb1.c.m(iB, 0, wVar2.f82386f);
                    wVar.f82386f = fb1.c.m(iB, 0, wVar.f82386f);
                    f fVar5 = fVar2.f63346e;
                    while (fVar5 != null && fVar5 != fVar4) {
                        f fVar6 = fVar5.f63346e;
                        i(fVar5);
                        fVar5 = fVar6;
                    }
                    if (wVar2 != wVar && (rVar = wVar2.f82383e) != wVar) {
                        e(rVar, wVar.f82382d);
                    }
                    aVar.c(wVar2, wVar, iB);
                    if (fVar4.f63348g == 0) {
                        fVar4.f63342a.f();
                        i(fVar4);
                    }
                    if (fVar2.f63348g == 0) {
                        f fVar7 = fVar2.f63347f;
                        wVar.f();
                        i(fVar2);
                        fVar2 = fVar7;
                    }
                } else {
                    if (!z14) {
                        map.put(Character.valueOf(c14), fVar2.f63346e);
                        if (!fVar2.f63344c) {
                            i(fVar2);
                        }
                    }
                    fVar2 = fVar2.f63347f;
                }
            }
        }
        while (true) {
            f fVar8 = this.f63401g;
            if (fVar8 == null || fVar8 == fVar) {
                return;
            } else {
                i(fVar8);
            }
        }
    }

    public final void i(f fVar) {
        f fVar2 = fVar.f63346e;
        if (fVar2 != null) {
            fVar2.f63347f = fVar.f63347f;
        }
        f fVar3 = fVar.f63347f;
        if (fVar3 == null) {
            this.f63401g = fVar2;
        } else {
            fVar3.f63346e = fVar2;
        }
    }
}
