package o63;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lo63/a0;", "Ln63/h;", "", "Ll63/a;", "Ln63/b;", "json", "Lo63/g0;", "mode", "Lo63/a;", "lexer", "Lk63/e;", "descriptor", "Lo63/a0$a;", "discriminatorHolder", "<init>", "(Ln63/b;Lo63/g0;Lo63/a;Lk63/e;Lo63/a0$a;)V", "a", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a0 extends l63.a implements n63.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n63.b f129819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f129820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o63.a f129821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p63.e f129822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f129823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f129824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n63.g f129825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f129826i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/a0$a;", "", "", "discriminatorToSkip", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f129827a;

        public a(String str) {
            this.f129827a = str;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129828a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f129828a = iArr;
        }
    }

    public a0(n63.b bVar, g0 g0Var, o63.a aVar, k63.e eVar, a aVar2) {
        bVar.getClass();
        g0Var.getClass();
        aVar.getClass();
        eVar.getClass();
        this.f129819b = bVar;
        this.f129820c = g0Var;
        this.f129821d = aVar;
        this.f129822e = bVar.f123894b;
        this.f129823f = -1;
        this.f129824g = aVar2;
        n63.g gVar = bVar.f123893a;
        this.f129825h = gVar;
        this.f129826i = gVar.f123924f ? null : new n(eVar);
    }

    @Override // l63.a, l63.e
    public final boolean D() {
        n nVar = this.f129826i;
        return ((nVar != null ? nVar.f129872b : false) || this.f129821d.v(true)) ? false : true;
    }

    @Override // l63.e, l63.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p63.e getF129870c() {
        return this.f129822e;
    }

    @Override // l63.a, l63.c
    public final void b(k63.e eVar) {
        eVar.getClass();
        int f116985c = eVar.getF103235c();
        n63.b bVar = this.f129819b;
        if (f116985c == 0 && o.d(eVar, bVar)) {
            while (e(eVar) != -1) {
            }
        }
        o63.a aVar = this.f129821d;
        if (aVar.u() && !bVar.f123893a.f123932n) {
            gg.b.G(aVar, "");
            throw null;
        }
        aVar.g(this.f129820c.f129863b);
        p pVar = aVar.f129816b;
        int i14 = pVar.f129876c;
        int[] iArr = pVar.f129875b;
        if (iArr[i14] == -2) {
            iArr[i14] = -1;
            pVar.f129876c = i14 - 1;
        }
        int i15 = pVar.f129876c;
        if (i15 != -1) {
            pVar.f129876c = i15 - 1;
        }
    }

    @Override // l63.a, l63.e
    public final l63.c c(k63.e eVar) {
        eVar.getClass();
        n63.b bVar = this.f129819b;
        g0 g0VarB = h0.b(eVar, bVar);
        o63.a aVar = this.f129821d;
        p pVar = aVar.f129816b;
        pVar.getClass();
        int i14 = pVar.f129876c + 1;
        pVar.f129876c = i14;
        Object[] objArr = pVar.f129874a;
        if (i14 == objArr.length) {
            int i15 = i14 * 2;
            pVar.f129874a = Arrays.copyOf(objArr, i15);
            pVar.f129875b = Arrays.copyOf(pVar.f129875b, i15);
        }
        pVar.f129874a[i14] = eVar;
        aVar.g(g0VarB.f129862a);
        if (aVar.q() == 4) {
            o63.a.m(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i16 = b.f129828a[g0VarB.ordinal()];
        if (i16 == 1 || i16 == 2 || i16 == 3) {
            return new a0(this.f129819b, g0VarB, this.f129821d, eVar, this.f129824g);
        }
        if (this.f129820c == g0VarB && bVar.f123893a.f123924f) {
            return this;
        }
        return new a0(this.f129819b, g0VarB, this.f129821d, eVar, this.f129824g);
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02ad A[EDGE_INSN: B:152:0x02ad->B:185:0x0304 BREAK  A[LOOP:2: B:135:0x024c->B:210:?]] */
    @Override // l63.c
    public final int e(k63.e eVar) {
        boolean z14;
        boolean z15;
        char c14;
        String strR;
        eVar.getClass();
        int[] iArr = b.f129828a;
        g0 g0Var = this.f129820c;
        int i14 = iArr[g0Var.ordinal()];
        char c15 = CoreConstants.COLON_CHAR;
        boolean zU = false;
        int i15 = 0;
        zU = false;
        n63.b bVar = this.f129819b;
        boolean z16 = true;
        int i16 = -1;
        o63.a aVar = this.f129821d;
        if (i14 == 2) {
            int i17 = this.f129823f;
            boolean z17 = i17 % 2 != 0;
            if (!z17) {
                aVar.g(CoreConstants.COLON_CHAR);
            } else if (i17 != -1) {
                zU = aVar.u();
            }
            if (aVar.b()) {
                if (z17) {
                    int i18 = this.f129823f;
                    int i19 = aVar.f129815a;
                    if (i18 == -1) {
                        if (zU) {
                            o63.a.m(aVar, "Unexpected leading comma", i19, null, 4);
                            throw null;
                        }
                    } else if (!zU) {
                        o63.a.m(aVar, "Expected comma after the key-value pair", i19, null, 4);
                        throw null;
                    }
                }
                i16 = this.f129823f + 1;
                this.f129823f = i16;
            } else {
                if (zU && !bVar.f123893a.f123932n) {
                    gg.b.G(aVar, "object");
                    throw null;
                }
                i16 = -1;
            }
        } else if (i14 != 4) {
            boolean zU2 = aVar.u();
            if (aVar.b()) {
                int i24 = this.f129823f;
                if (i24 != -1 && !zU2) {
                    o63.a.m(aVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i16 = i24 + 1;
                this.f129823f = i16;
            } else if (zU2 && !bVar.f123893a.f123932n) {
                gg.b.G(aVar, "array");
                throw null;
            }
        } else {
            boolean zU3 = aVar.u();
            p pVar = aVar.f129816b;
            while (true) {
                boolean zB = aVar.b();
                n nVar = this.f129826i;
                if (zB) {
                    n63.g gVar = this.f129825h;
                    boolean z18 = gVar.f123921c;
                    int i25 = i16;
                    String strK = z18 ? aVar.k() : aVar.d();
                    aVar.g(c15);
                    int iB = o.b(eVar, bVar, strK);
                    if (iB != -3) {
                        if (gVar.f123926h) {
                            boolean zI = eVar.i(iB);
                            k63.e eVarH = eVar.h(iB);
                            if (zI && !eVarH.b() && aVar.v(z16)) {
                                z14 = z16;
                            } else {
                                z14 = z16;
                                if (p005kotlin.jvm.internal.s.g(eVarH.getF103234b(), k63.l.b.f103252a) && ((!eVarH.b() || !aVar.v(false)) && (strR = aVar.r(z18)) != null)) {
                                    int iB2 = o.b(eVarH, bVar, strR);
                                    boolean z19 = (bVar.f123893a.f123924f || !eVarH.b()) ? false : z14;
                                    if (iB2 == -3 && (zI || z19)) {
                                        aVar.i();
                                    }
                                }
                            }
                            zU3 = aVar.u();
                            z15 = false;
                        }
                        if (nVar != null) {
                            m63.z zVar = nVar.f129871a;
                            if (iB < 64) {
                                zVar.f117053c |= 1 << iB;
                            } else {
                                int i26 = (iB >>> 6) - 1;
                                long[] jArr = zVar.f117054d;
                                jArr[i26] = jArr[i26] | (1 << (iB & 63));
                            }
                        }
                        i16 = iB;
                    } else {
                        z14 = z16;
                        zU3 = false;
                        z15 = z14;
                    }
                    if (z15) {
                        if (!o.d(eVar, bVar)) {
                            a aVar2 = this.f129824g;
                            if (aVar2 == null || !p005kotlin.jvm.internal.s.g(aVar2.f129827a, strK)) {
                                int i27 = pVar.f129876c;
                                int[] iArr2 = pVar.f129875b;
                                if (iArr2[i27] == -2) {
                                    iArr2[i27] = i25;
                                    pVar.f129876c = i27 - 1;
                                }
                                int i28 = pVar.f129876c;
                                if (i28 != i25) {
                                    pVar.f129876c = i28 + i25;
                                }
                                int iL = d53.w.L(0, 6, aVar.getF129846e().subSequence(0, aVar.f129815a).toString(), strK);
                                StringBuilder sbK = androidx.core.view.j.k(iL, "Encountered an unknown key '", strK, "' at offset ", " at path: ");
                                sbK.append(pVar.a());
                                sbK.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                                sbK.append((Object) gg.b.K(iL, aVar.getF129846e()));
                                throw new JsonDecodingException(sbK.toString());
                            }
                            aVar2.f129827a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bQ = aVar.q();
                        if (bQ == 8 || bQ == 6) {
                            while (true) {
                                byte bQ2 = aVar.q();
                                if (bQ2 != z14) {
                                    c14 = 6;
                                    if (bQ2 == 8 || bQ2 == 6) {
                                        arrayList.add(Byte.valueOf(bQ2));
                                    } else {
                                        if (bQ2 == 9) {
                                            if (((Number) p13.h0.m0(arrayList)).byteValue() != 8) {
                                                throw gg.b.h(aVar.getF129846e(), aVar.f129815a, "found ] instead of } at path: " + pVar);
                                            }
                                            p13.d0.F(arrayList);
                                        } else if (bQ2 == 7) {
                                            if (((Number) p13.h0.m0(arrayList)).byteValue() != 6) {
                                                throw gg.b.h(aVar.getF129846e(), aVar.f129815a, "found } instead of ] at path: " + pVar);
                                            }
                                            p13.d0.F(arrayList);
                                        } else if (bQ2 == 10) {
                                            o63.a.m(aVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c14 = 6;
                                    }
                                    aVar.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z18) {
                                    aVar.j();
                                } else {
                                    aVar.d();
                                }
                                z14 = true;
                            }
                        } else {
                            aVar.j();
                            c14 = 6;
                        }
                        zU3 = aVar.u();
                    }
                    c15 = CoreConstants.COLON_CHAR;
                    z16 = true;
                    i16 = -1;
                } else {
                    if (zU3 && !bVar.f123893a.f123932n) {
                        gg.b.G(aVar, "object");
                        throw null;
                    }
                    if (nVar == null) {
                        i16 = -1;
                        break;
                    }
                    m63.z zVar2 = nVar.f129871a;
                    e23.p<k63.e, Integer, Boolean> pVar2 = zVar2.f117052b;
                    k63.e eVar2 = zVar2.f117051a;
                    int f116985c = eVar2.getF103235c();
                    while (true) {
                        long j8 = zVar2.f117053c;
                        long j14 = -1;
                        if (j8 == -1) {
                            if (f116985c <= 64) {
                                i16 = -1;
                                break;
                            }
                            long[] jArr2 = zVar2.f117054d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i15 >= length) {
                                    i16 = -1;
                                    break;
                                }
                                int i29 = i15 + 1;
                                int i30 = i29 * 64;
                                long j15 = jArr2[i15];
                                while (true) {
                                    if (j15 != j14) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j15);
                                        j15 |= 1 << iNumberOfTrailingZeros;
                                        int i34 = iNumberOfTrailingZeros + i30;
                                        if (pVar2.invoke(eVar2, Integer.valueOf(i34)).booleanValue()) {
                                            jArr2[i15] = j15;
                                            i16 = i34;
                                            break;
                                        }
                                        j14 = -1;
                                    } else {
                                        jArr2[i15] = j15;
                                        i15 = i29;
                                        j14 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                            zVar2.f117053c |= 1 << iNumberOfTrailingZeros2;
                            if (pVar2.invoke(eVar2, Integer.valueOf(iNumberOfTrailingZeros2)).booleanValue()) {
                                i16 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (g0Var != g0.MAP) {
            p pVar3 = aVar.f129816b;
            pVar3.f129875b[pVar3.f129876c] = i16;
        }
        return i16;
    }

    @Override // l63.a, l63.e
    public final double f() {
        o63.a aVar = this.f129821d;
        String strJ = aVar.j();
        try {
            double d14 = Double.parseDouble(strJ);
            if (this.f129819b.f123893a.f123929k || Math.abs(d14) <= Double.MAX_VALUE) {
                return d14;
            }
            gg.b.O(aVar, Double.valueOf(d14));
            throw null;
        } catch (IllegalArgumentException unused) {
            o63.a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'double' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0139, please report this as an issue */
    @Override // l63.e
    public final <T> T h(i63.b<? extends T> bVar) {
        String message;
        n63.b bVar2 = this.f129819b;
        o63.a aVar = this.f129821d;
        bVar.getClass();
        try {
            if ((bVar instanceof m63.b) && !bVar2.f123893a.f123927i) {
                String strA = z.a(((m63.b) bVar).getF158591b(), bVar2);
                String strP = aVar.p(strA, this.f129825h.f123921c);
                String strA2 = null;
                if (strP != null) {
                    try {
                        i63.b bVarV = gl1.d.v((m63.b) bVar, this, strP);
                        this.f129824g = new a(strA);
                        return (T) bVarV.deserialize(this);
                    } catch (SerializationException e4) {
                        String message2 = e4.getMessage();
                        message2.getClass();
                        String strR = d53.w.R(d53.w.f0(message2, '\n'), ".");
                        String message3 = e4.getMessage();
                        message3.getClass();
                        String strSubstring = "";
                        int iG = d53.w.G('\n', 0, 6, message3);
                        if (iG != -1) {
                            strSubstring = message3.substring(iG + 1, message3.length());
                        }
                        o63.a.m(aVar, strR, 0, strSubstring, 2);
                        throw null;
                    }
                }
                if ((bVar instanceof m63.b) && !bVar2.f123893a.f123927i) {
                    String strA3 = z.a(((m63.b) bVar).getF158591b(), bVar2);
                    n63.i iVarI = i();
                    String f116983a = ((m63.b) bVar).getF158591b().getF103221c();
                    if (iVarI instanceof n63.x) {
                        n63.x xVar = (n63.x) iVarI;
                        n63.i iVar = (n63.i) xVar.get(strA3);
                        if (iVar != null) {
                            n63.z zVarA = n63.j.a(iVar);
                            if (!(zVarA instanceof n63.u)) {
                                strA2 = zVarA.getF123941c();
                            }
                        }
                        try {
                            return (T) gl.b.L(bVar2, strA3, xVar, gl1.d.v((m63.b) bVar, this, strA2));
                        } catch (SerializationException e14) {
                            String message4 = e14.getMessage();
                            message4.getClass();
                            throw gg.b.h(xVar.toString(), -1, message4);
                        }
                    }
                    StringBuilder sb3 = new StringBuilder("Expected ");
                    t0 t0Var = s0.f105811a;
                    sb3.append(t0Var.b(n63.x.class).D());
                    sb3.append(", but had ");
                    sb3.append(t0Var.b(iVarI.getClass()).D());
                    sb3.append(" as the serialized body of ");
                    sb3.append(f116983a);
                    sb3.append(" at element: ");
                    sb3.append(aVar.f129816b.a());
                    throw gg.b.h(iVarI.toString(), -1, sb3.toString());
                }
                return bVar.deserialize(this);
                message = e.getMessage();
                message.getClass();
                if (d53.w.z(message, "at path", false)) {
                    throw e;
                }
                throw new MissingFieldException(e.getMissingFields(), e.getMessage() + " at path: " + aVar.f129816b.a(), e);
            }
            return bVar.deserialize(this);
        } catch (MissingFieldException e15) {
            message = e15.getMessage();
            message.getClass();
            if (d53.w.z(message, "at path", false)) {
                throw e15;
            }
            throw new MissingFieldException(e15.getMissingFields(), e15.getMessage() + " at path: " + aVar.f129816b.a(), e15);
        }
    }

    @Override // n63.h
    public final n63.i i() {
        return new y(this.f129819b.f123893a, this.f129821d).b();
    }

    @Override // l63.a, l63.e
    public final l63.e k(k63.e eVar) {
        eVar.getClass();
        return c0.a(eVar) ? new m(this.f129821d, this.f129819b) : this;
    }

    @Override // l63.a, l63.c
    public final <T> T l(k63.e eVar, int i14, i63.b<? extends T> bVar, T t7) {
        eVar.getClass();
        bVar.getClass();
        boolean z14 = this.f129820c == g0.MAP && (i14 & 1) == 0;
        o63.a aVar = this.f129821d;
        if (z14) {
            p pVar = aVar.f129816b;
            int[] iArr = pVar.f129875b;
            int i15 = pVar.f129876c;
            if (iArr[i15] == -2) {
                pVar.f129874a[i15] = p.a.f129877a;
            }
        }
        T t14 = (T) h(bVar);
        if (z14) {
            p pVar2 = aVar.f129816b;
            int[] iArr2 = pVar2.f129875b;
            int i16 = pVar2.f129876c;
            if (iArr2[i16] != -2) {
                int i17 = i16 + 1;
                pVar2.f129876c = i17;
                Object[] objArr = pVar2.f129874a;
                if (i17 == objArr.length) {
                    int i18 = i17 * 2;
                    pVar2.f129874a = Arrays.copyOf(objArr, i18);
                    pVar2.f129875b = Arrays.copyOf(pVar2.f129875b, i18);
                }
            }
            Object[] objArr2 = pVar2.f129874a;
            int i19 = pVar2.f129876c;
            objArr2[i19] = t14;
            pVar2.f129875b[i19] = -2;
        }
        return t14;
    }

    @Override // l63.a, l63.e
    public final byte m() {
        o63.a aVar = this.f129821d;
        long jH = aVar.h();
        byte b14 = (byte) jH;
        if (jH == b14) {
            return b14;
        }
        o63.a.m(aVar, "Failed to parse byte for input '" + jH + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final long o() {
        return this.f129821d.h();
    }

    @Override // l63.a, l63.e
    public final short p() {
        o63.a aVar = this.f129821d;
        long jH = aVar.h();
        short s8 = (short) jH;
        if (jH == s8) {
            return s8;
        }
        o63.a.m(aVar, "Failed to parse short for input '" + jH + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final char q() {
        o63.a aVar = this.f129821d;
        String strJ = aVar.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        o63.a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Expected single char, but got '", strJ), 0, null, 6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final String s() {
        boolean z14 = this.f129825h.f123921c;
        o63.a aVar = this.f129821d;
        return z14 ? aVar.k() : aVar.i();
    }

    @Override // l63.a, l63.e
    public final int u() {
        o63.a aVar = this.f129821d;
        long jH = aVar.h();
        int i14 = (int) jH;
        if (jH == i14) {
            return i14;
        }
        o63.a.m(aVar, "Failed to parse int for input '" + jH + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final float x() {
        o63.a aVar = this.f129821d;
        String strJ = aVar.j();
        try {
            float f14 = Float.parseFloat(strJ);
            if (this.f129819b.f123893a.f123929k || Math.abs(f14) <= Float.MAX_VALUE) {
                return f14;
            }
            gg.b.O(aVar, Float.valueOf(f14));
            throw null;
        } catch (IllegalArgumentException unused) {
            o63.a.m(aVar, o2.c.c(CoreConstants.SINGLE_QUOTE_CHAR, "Failed to parse type 'float' for input '", strJ), 0, null, 6);
            throw null;
        }
    }

    @Override // l63.a, l63.e
    public final boolean y() {
        boolean z14;
        boolean z15;
        o63.a aVar = this.f129821d;
        int iT = aVar.t();
        if (iT == aVar.getF129846e().length()) {
            o63.a.m(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (aVar.getF129846e().charAt(iT) == '\"') {
            iT++;
            z14 = true;
        } else {
            z14 = false;
        }
        int iS = aVar.s(iT);
        if (iS >= aVar.getF129846e().length() || iS == -1) {
            o63.a.m(aVar, "EOF", 0, null, 6);
            throw null;
        }
        int i14 = iS + 1;
        int iCharAt = aVar.getF129846e().charAt(iS) | ' ';
        if (iCharAt == 102) {
            aVar.c(i14, "alse");
            z15 = false;
        } else {
            if (iCharAt != 116) {
                o63.a.m(aVar, "Expected valid boolean literal prefix, but had '" + aVar.j() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6);
                throw null;
            }
            aVar.c(i14, "rue");
            z15 = true;
        }
        if (!z14) {
            return z15;
        }
        if (aVar.f129815a == aVar.getF129846e().length()) {
            o63.a.m(aVar, "EOF", 0, null, 6);
            throw null;
        }
        if (aVar.getF129846e().charAt(aVar.f129815a) == '\"') {
            aVar.f129815a++;
            return z15;
        }
        o63.a.m(aVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // l63.a, l63.e
    public final int z(k63.e eVar) {
        eVar.getClass();
        return o.c(eVar, this.f129819b, s(), " at path ".concat(this.f129821d.f129816b.a()));
    }
}
