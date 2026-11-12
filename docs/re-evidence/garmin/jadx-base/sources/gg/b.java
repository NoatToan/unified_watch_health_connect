package gg;

import am.j;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import b43.i;
import c22.c3;
import c53.c0;
import c53.f0;
import c53.q;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import d53.w;
import ds.e0;
import ew1.v1;
import f5.p;
import h5.l0;
import hf.y;
import i3.e5;
import i43.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import l33.b1;
import l33.d1;
import lc.m0;
import lc.o0;
import lc.p0;
import mt0.k4;
import n23.y3;
import o53.g2;
import o53.k;
import o53.o2;
import o53.u;
import o53.y0;
import o53.z;
import org.apache.commons.io.IOUtils;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p008y1.b2;
import p13.a1;
import p13.h0;
import p13.j0;
import p3.m;
import p3.n;
import p3.p1;
import p3.p2;
import p3.x1;
import p43.c2;
import p43.n0;
import qw0.v;
import t13.d;
import t23.e;
import t23.h;
import t23.j1;
import u53.f;
import u53.g;
import u53.x;
import u62.h1;
import w23.x0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f77099a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f77100b = false;

    public static final k A(d dVar) {
        k kVar;
        k kVar2;
        if (!(dVar instanceof f)) {
            return new k(dVar, 1);
        }
        f fVar = (f) dVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f.f168731h;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            kVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, g.f168737b);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                x xVar = g.f168737b;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, xVar)) {
                        kVar2 = (k) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != g.f168737b && !(obj instanceof Throwable)) {
                e0.t(obj, "Inconsistent state ");
                return null;
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f129359g;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if (!(obj2 instanceof u) || ((u) obj2).f129413d == null) {
                k.f129358f.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, o53.b.f129306a);
                kVar = kVar2;
            } else {
                kVar2.l();
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(dVar, 2);
    }

    public static final b1 B(e eVar) {
        e eVar2;
        eVar.getClass();
        int i14 = f43.e.f68881a;
        Iterator<n0> it = eVar.p().F0().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            n0 next = it.next();
            if (!p005kotlin.reflect.jvm.internal.impl.builtins.d.y(next)) {
                h hVarT = next.F0().t();
                int i15 = i.f15728a;
                if (i.l(hVarT, t23.f.CLASS) || i.l(hVarT, t23.f.ENUM_CLASS)) {
                    hVarT.getClass();
                    eVar2 = (e) hVarT;
                    break;
                }
            }
        }
        if (eVar2 == null) {
            return null;
        }
        l lVarP = eVar2.P();
        b1 b1Var = lVarP instanceof b1 ? (b1) lVarP : null;
        return b1Var == null ? B(eVar2) : b1Var;
    }

    public static final List C(y yVar) {
        String str = yVar.f83622e;
        if (str == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        int i14 = -1;
        while (i14 < str.length()) {
            int i15 = i14 + 1;
            int iG = w.G(IOUtils.DIR_SEPARATOR_UNIX, i15, 4, str);
            if (iG == -1) {
                iG = str.length();
            }
            String strSubstring = str.substring(i15, iG);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i14 = iG;
        }
        return arrayList;
    }

    public static final DateTime D(k4 k4Var) {
        k4Var.getClass();
        DateTime dateTimeWithDayOfWeek = DateTime.now().withDayOfWeek(1);
        if (k4Var == k4.CurrentWeek) {
            dateTimeWithDayOfWeek.getClass();
            return dateTimeWithDayOfWeek;
        }
        DateTime dateTimeMinusWeeks = dateTimeWithDayOfWeek.minusWeeks(1);
        dateTimeMinusWeeks.getClass();
        return dateTimeMinusWeeks;
    }

    public static final o73.u E(kt2.f fVar) {
        fVar.getClass();
        kt2.e.f106460a.getClass();
        return (o73.u) kt2.e.U0.getValue();
    }

    public static final o73.u F(kt2.f fVar) {
        fVar.getClass();
        kt2.e.f106460a.getClass();
        return (o73.u) kt2.e.Y0.getValue();
    }

    public static final void G(o63.a aVar, String str) {
        aVar.getClass();
        aVar.l(aVar.f129815a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean H(y3 y3Var) {
        y3Var.getClass();
        return y3Var.getF122615j() != p005kotlin.jvm.internal.e.NO_RECEIVER;
    }

    public static final boolean I(byte[] bArr) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        charsetDefaultCharset.getClass();
        String strG = sn.a.g(new String(bArr, charsetDefaultCharset));
        return (w.z(strG, "<!DOCTYPE HTML", false) || w.z(strG, "<HTML", false)) ? false : true;
    }

    public static final void J(String str) {
        str.getClass();
        throw new IllegalArgumentException(j.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final CharSequence K(int i14, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i14 != -1) {
                int i15 = i14 - 30;
                int i16 = i14 + 30;
                String str = i15 <= 0 ? "" : ".....";
                String str2 = i16 >= charSequence.length() ? "" : ".....";
                StringBuilder sbK = e5.k(str);
                if (i15 < 0) {
                    i15 = 0;
                }
                int length = charSequence.length();
                if (i16 > length) {
                    i16 = length;
                }
                sbK.append(charSequence.subSequence(i15, i16).toString());
                sbK.append(str2);
                return sbK.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final o0 L(e23.l lVar) {
        p0 p0Var = new p0();
        lVar.invoke(p0Var);
        boolean z14 = p0Var.f111829b;
        o0.a aVar = p0Var.f111828a;
        aVar.f111816a = z14;
        aVar.f111817b = p0Var.f111830c;
        String str = p0Var.f111832e;
        if (str != null) {
            boolean z15 = p0Var.f111833f;
            boolean z16 = p0Var.f111834g;
            aVar.f111819d = str;
            aVar.f111818c = -1;
            aVar.f111822g = z15;
            aVar.f111823h = z16;
        } else {
            k23.d<?> dVar = p0Var.f111835h;
            if (dVar != null) {
                boolean z17 = p0Var.f111833f;
                boolean z18 = p0Var.f111834g;
                aVar.f111820e = dVar;
                aVar.f111818c = -1;
                aVar.f111822g = z17;
                aVar.f111823h = z18;
            } else {
                Object obj = p0Var.f111836i;
                if (obj != null) {
                    boolean z19 = p0Var.f111833f;
                    boolean z24 = p0Var.f111834g;
                    aVar.f111821f = obj;
                    aVar.f111818c = rc.l.b(gl1.y.J(s0.f105811a.b(obj.getClass())));
                    aVar.f111819d = null;
                    aVar.f111822g = z19;
                    aVar.f111823h = z24;
                } else {
                    int i14 = p0Var.f111831d;
                    boolean z25 = p0Var.f111833f;
                    boolean z26 = p0Var.f111834g;
                    aVar.f111818c = i14;
                    aVar.f111819d = null;
                    aVar.f111822g = z25;
                    aVar.f111823h = z26;
                }
            }
        }
        return aVar.a();
    }

    public static final String M(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= iMax) {
                if (i14 == i15) {
                    return str;
                }
                if (i14 >= length) {
                    p13.c.a aVar = p13.c.f134916a;
                    int length2 = bArr.length;
                    aVar.getClass();
                    p13.c.a.a(0, i15, length2);
                    return new String(bArr, 0, i15, d53.c.f57666b);
                }
            } else if (str.charAt(i14) == '%') {
                int i16 = i14 + 3;
                try {
                    String strSubstring = str.substring(i14 + 1, i16);
                    d53.a.a(16);
                    bArr[i15] = (byte) Integer.parseInt(strSubstring, 16);
                    i15++;
                    i14 = i16;
                } catch (NumberFormatException unused) {
                    bArr[i15] = (byte) str.charAt(i14);
                    i15++;
                    i14++;
                }
            }
            bArr[i15] = (byte) str.charAt(i14);
            i15++;
            i14++;
        }
    }

    public static final k33.f N(k33.i iVar, o33.c cVar) {
        iVar.getClass();
        cVar.getClass();
        return new k33.f(iVar, cVar, false, 4, null);
    }

    public static final void O(o63.a aVar, Number number) {
        aVar.getClass();
        o63.a.m(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static m33.a P(c2 c2Var, boolean z14, d1 d1Var, int i14) {
        boolean z15 = (i14 & 1) != 0 ? false : z14;
        boolean z16 = (i14 & 2) == 0;
        if ((i14 & 4) != 0) {
            d1Var = null;
        }
        c2Var.getClass();
        return new m33.a(c2Var, null, z16, z15, d1Var != null ? a1.b(d1Var) : null, null, 34, null);
    }

    public static final f0 Q(Interval interval) {
        return c0.r(q.e(new lq1.a(24), interval.getStart()), new kp2.a(interval, 15));
    }

    public static final o21.d R(g01.x xVar, int i14) {
        xVar.getClass();
        b11.l lVarB = xVar.b();
        if (lVarB == null) {
            return null;
        }
        g21.u uVar = lVarB.f14336f;
        return new o21.d(lVarB.f14331a, lVarB.f14332b, i14, uVar != null ? Integer.valueOf(uVar.f75499a) : null, uVar != null ? uVar.f75503e : null, uVar != null ? uVar.f75502d : null, uVar != null ? uVar.f75501c : null);
    }

    public static y S(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = w63.y.f183409c;
        String strV = !s.g(str2, "/") ? d53.u.v(str, str2, "/", false) : str;
        boolean z14 = true;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        while (i14 < strV.length()) {
            char cCharAt = strV.charAt(i14);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i17 == -1 && i15 == -1) {
                            i17 = i14 + 1;
                        }
                    } else if (z14 && i17 == -1 && i15 == -1) {
                        int i24 = i14 + 2;
                        if (i24 < str.length() && str.charAt(i14 + 1) == '/' && str.charAt(i24) == '/') {
                            i18 = i14 + 3;
                            z14 = false;
                            i19 = i14;
                            i14 = i24;
                        } else if (strV.equals(str)) {
                            i16 = i14 + 1;
                            i19 = i14;
                            i14 = i16;
                            i18 = i14;
                        }
                    }
                } else if (i16 == -1 && i17 == -1 && i15 == -1) {
                    i16 = i18 == -1 ? 0 : i14;
                    z14 = false;
                }
            } else if (i15 == -1) {
                i15 = i14 + 1;
            }
            i14++;
        }
        int iMin = Math.min(i15 == -1 ? Integer.MAX_VALUE : i15 - 1, strV.length());
        int iMin2 = Math.min(i17 == -1 ? Integer.MAX_VALUE : i17 - 1, iMin);
        if (i18 != -1) {
            strSubstring2 = strV.substring(0, i19);
            strSubstring = strV.substring(i18, Math.min(i16 != -1 ? i16 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i16 != -1 ? strV.substring(i16, iMin2) : null;
        String strSubstring4 = i17 != -1 ? strV.substring(i17, iMin) : null;
        String strSubstring5 = i15 != -1 ? strV.substring(i15, strV.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        return new y(strV, str2, strSubstring2 != null ? M(strSubstring2, bArr) : null, strSubstring != null ? M(strSubstring, bArr) : null, strSubstring3 != null ? M(strSubstring3, bArr) : null, str3 != null ? M(str3, bArr) : null, strSubstring5 != null ? M(strSubstring5, bArr) : null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d A[PHI: r5
      0x005d: PHI (r5v6 java.util.Iterator) = (r5v4 java.util.Iterator), (r5v7 java.util.Iterator) binds: [B:23:0x0059, B:30:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0071 -> B:29:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object T(okhttp3.OkHttpClient r5, v13.c r6) {
        /*
            boolean r0 = r6 instanceof kd2.b
            if (r0 == 0) goto L13
            r0 = r6
            kd2.b r0 = (kd2.b) r0
            int r1 = r0.f104523c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104523c = r1
            goto L18
        L13:
            kd2.b r0 = new kd2.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f104522b
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f104523c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.util.Iterator r5 = r0.f104521a
            o13.r.b(r6)
            goto L74
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r5)
            r5 = 0
            return r5
        L30:
            o13.r.b(r6)
            java.util.List r5 = r5.interceptors()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L40:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()
            boolean r4 = r2 instanceof id2.i
            if (r4 == 0) goto L40
            r6.add(r2)
            goto L40
        L52:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L59
            goto L7d
        L59:
            java.util.Iterator r5 = r6.iterator()
        L5d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7d
            java.lang.Object r6 = r5.next()
            id2.i r6 = (id2.i) r6
            r0.f104521a = r5
            r0.f104523c = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L74
            return r1
        L74:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            r3 = 0
        L7d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.b.T(okhttp3.OkHttpClient, v13.c):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object U(v13.c cVar) {
        Object obj;
        t13.g f129362e = cVar.getF157466b();
        g8.i.v(f129362e);
        d dVarB = u13.f.b(cVar);
        f fVar = dVarB instanceof f ? (f) dVarB : null;
        if (fVar == null) {
            obj = Unit.INSTANCE;
        } else {
            z zVar = fVar.f168732d;
            if (g.c(zVar, f129362e)) {
                fVar.f168734f = Unit.INSTANCE;
                fVar.f129380c = 1;
                zVar.dispatchYield(f129362e, fVar);
            } else {
                o2 o2Var = new o2();
                t13.g gVarPlus = f129362e.plus(o2Var);
                Unit unit = Unit.INSTANCE;
                fVar.f168734f = unit;
                fVar.f129380c = 1;
                zVar.dispatchYield(gVarPlus, fVar);
                if (o2Var.f129378a) {
                    g2.f129341a.getClass();
                    y0 y0VarA = g2.a();
                    p13.k<o53.p0<?>> kVar = y0VarA.f129425c;
                    if (kVar != null ? kVar.isEmpty() : true) {
                        obj = Unit.INSTANCE;
                    } else {
                        if (y0VarA.f129423a >= 4294967296L) {
                            fVar.f168734f = unit;
                            fVar.f129380c = 1;
                            y0VarA.T(fVar);
                            obj = u13.a.COROUTINE_SUSPENDED;
                        } else {
                            y0VarA.U(true);
                            try {
                                fVar.run();
                                do {
                                } while (y0VarA.W());
                            } catch (Throwable th3) {
                                try {
                                    fVar.g(th3);
                                } catch (Throwable th4) {
                                    y0VarA.H(true);
                                    throw th4;
                                }
                            }
                            y0VarA.H(true);
                            obj = Unit.INSTANCE;
                        }
                    }
                }
            }
            obj = u13.a.COROUTINE_SUSPENDED;
        }
        return obj == u13.a.COROUTINE_SUSPENDED ? obj : Unit.INSTANCE;
    }

    public static final i4.g a(String str) {
        return new i4.g(a1.b(str));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public static final void b(m0 m0Var, e23.a aVar, m mVar, int i14) {
        e23.a aVar2;
        m0Var.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1985259493);
        int i15 = (o0VarE.r(m0Var) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(m0Var);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new k62.j(m0Var, 19);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.j(m0Var, 19);
                    o0VarE.K(objQ);
                }
            }
            n72.b.f124848a.getClass();
            aVar2 = aVar;
            m72.f.a("Dimensions", (e23.a) objQ, aVar2, null, null, n72.b.f124849b, o0VarE, ((i15 << 3) & 896) | 196614, 24);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n72.h(m0Var, aVar2, i14, i16);
        }
    }

    public static final void c(int i14, e23.a aVar, String str, m mVar) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-269570622);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(993296844, new ao1.g(str, aVar, 13), o0VarE), o0VarE, 196608, 31);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 14);
        }
    }

    public static final JsonDecodingException d(Number number, String str, String str2) {
        str.getClass();
        str2.getClass();
        return g(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) K(-1, str2)));
    }

    public static final JsonEncodingException e(String str, Number number) {
        str.getClass();
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) K(-1, str)));
    }

    public static final JsonEncodingException f(k63.e eVar) {
        return new JsonEncodingException("Value of type '" + eVar.getF103221c() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.getF103234b() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException g(int i14, String str) {
        if (i14 >= 0) {
            str = sn.a.e(i14, "Unexpected JSON token at offset ", ": ", str);
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException h(CharSequence charSequence, int i14, String str) {
        charSequence.getClass();
        return g(i14, str + "\nJSON input: " + ((Object) K(i14, charSequence)));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void i(v vVar, boolean z14, final boolean z15, e23.l lVar, m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        boolean z17;
        Object obj;
        c3 c3VarB;
        Object obj2;
        vVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(447445882);
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 = i14 | 48;
            z16 = z14;
        } else {
            z16 = z14;
            i16 = i14 | (o0VarE.h(z16) ? 32 : 16);
        }
        int i18 = i16 | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        int i19 = 1;
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            final boolean z18 = i17 != 0 ? true : z16;
            x1 x1Var = n.f135158a;
            Object[] objArr = {Boolean.valueOf(z15), Boolean.valueOf(z18)};
            boolean z19 = ((i18 & 112) == 32) | ((i18 & 896) == 256);
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (z19) {
                obj = objQ;
                e23.a aVar2 = new e23.a() { // from class: n40.j
                    @Override // e23.a
                    public final Object invoke() {
                        return p3.p0.n(Boolean.valueOf(z18 && z15));
                    }
                };
                o0VarE.K(aVar2);
                obj = aVar2;
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    obj = objQ;
                    e23.a aVar3 = new e23.a() { // from class: n40.j
                        @Override // e23.a
                        public final Object invoke() {
                            return p3.p0.n(Boolean.valueOf(z18 && z15));
                        }
                    };
                    o0VarE.K(aVar3);
                    obj = aVar3;
                }
            }
            obj = objQ;
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) obj, o0VarE, 0);
            e23.a aVar4 = null;
            if (vVar == v.MILE_MARKERS) {
                c3VarB = c22.i.b(((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? R.string.lbl_distance_markers_km : R.string.lbl_distance_markers_mi);
            } else {
                c3VarB = vVar.f148365a;
            }
            l72.p2 p2Var = l72.p2.f111205a;
            String strT = gl1.d.T(c3VarB, o0VarE, 0);
            z3.e eVarC = z3.f.c(1361089871, new hn1.b(z18, p1Var, i19), o0VarE);
            if (z18) {
                o0VarE.C(-1717359559);
                int i24 = (o0VarE.B(p1Var) ? 1 : 0) | ((i18 & 7168) != 2048 ? 0 : 1);
                Object objQ2 = o0VarE.q();
                if (i24 == 0) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        obj2 = objQ2;
                        v1 v1Var = new v1(lVar, p1Var, 13);
                        o0VarE.K(v1Var);
                        obj2 = v1Var;
                    }
                } else {
                    obj2 = objQ2;
                    v1 v1Var2 = new v1(lVar, p1Var, 13);
                    o0VarE.K(v1Var2);
                    obj2 = v1Var2;
                }
                obj2 = objQ2;
                aVar4 = (e23.a) obj2;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1717246068);
                o0VarE.g0(false);
            }
            p2Var.g(strT, null, null, null, eVarC, false, false, aVar4, o0VarE, 24576, 238);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z16;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ct1.a(vVar, z17, z15, lVar, i14, i15);
        }
    }

    public static final void j(m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1637825481);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            Integer numValueOf = Integer.valueOf(R.drawable.epic_wizard_header);
            s62.a.f157643a.getClass();
            u4.d dVarA = h1.a(t62.a.f162797a);
            jy0.d.f101681a.getClass();
            b82.y0.c(numValueOf, dVarA, null, null, null, null, jy0.d.f101683c, o0VarE, 1572864, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.b(i14);
        }
    }

    public static y k(String str) {
        String str2 = w63.y.f183409c;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("file");
        sb3.append(CoreConstants.COLON_CHAR);
        if (str != null) {
            sb3.append(str);
        }
        return new y(sb3.toString(), str2, "file", null, str, null, null);
    }

    public static final int l(l0 l0Var, f5.a aVar) {
        long j8;
        l0 l0VarO0 = l0Var.O0();
        if (l0VarO0 == null) {
            e5.a.b("Child of " + l0Var + " cannot be null when calculating alignment line");
        }
        if (l0Var.Q0().p().containsKey(aVar)) {
            Integer num = l0Var.Q0().p().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iE = l0VarO0.E(aVar);
            if (iE != Integer.MIN_VALUE) {
                l0VarO0.f81864j = true;
                l0Var.f81865k = true;
                l0Var.f1();
                l0VarO0.f81864j = false;
                l0Var.f81865k = false;
                if (aVar instanceof p) {
                    long jU0 = l0VarO0.getE();
                    g6.k.a aVar2 = g6.k.f76003b;
                    j8 = jU0 & 4294967295L;
                } else {
                    long jU1 = l0VarO0.getE();
                    g6.k.a aVar3 = g6.k.f76003b;
                    j8 = jU1 >> 32;
                }
                return iE + ((int) j8);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean m(int i14, KeyEvent keyEvent) {
        return ((int) (z4.f.a(keyEvent.getKeyCode()) >> 32)) == i14;
    }

    public static final void n(int i14, StringBuilder sb3) {
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append(CallerData.NA);
            if (i15 < i14 - 1) {
                sb3.append(",");
            }
        }
    }

    public static final e23.p o(boolean z14, z3.e eVar, m mVar) {
        eVar.getClass();
        mVar.C(1966133873);
        x1 x1Var = n.f135158a;
        if (z14) {
            mVar.f();
            return eVar;
        }
        mVar.f();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList p(ArrayList arrayList, List list, t23.v vVar) {
        n0 n0VarF;
        list.getClass();
        arrayList.size();
        list.size();
        ArrayList<o13.p> arrayListK1 = h0.k1(arrayList, list);
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListK1, 10));
        for (o13.p pVar : arrayListK1) {
            n0 n0Var = (n0) pVar.f128594a;
            j1 j1Var = (j1) pVar.f128595b;
            int index = j1Var.getIndex();
            u23.h annotations = j1Var.getAnnotations();
            x33.f name = j1Var.getName();
            name.getClass();
            boolean zH0 = j1Var.h0();
            boolean zX0 = j1Var.x0();
            boolean zV0 = j1Var.v0();
            if (j1Var.R() != null) {
                int i14 = f43.e.f68881a;
                t23.c0 c0VarC = i.c(vVar);
                c0VarC.getClass();
                n0VarF = c0VarC.e().f(n0Var);
            } else {
                n0VarF = null;
            }
            n0 n0Var2 = n0VarF;
            t23.y0 source = j1Var.getSource();
            source.getClass();
            arrayList2.add(new x0(vVar, null, index, annotations, name, n0Var, zH0, zX0, zV0, n0Var2, source));
        }
        return arrayList2;
    }

    public static final ns2.a q(boolean z14) {
        return new ns2.a(j0.f134944a, z14);
    }

    public static final o73.u r(kt2.f fVar) {
        fVar.getClass();
        kt2.e.f106460a.getClass();
        return (o73.u) kt2.e.A.getValue();
    }

    public static final String[] s(i4.s sVar) {
        sVar.getClass();
        return (String[]) ((i4.g) sVar).f90840b.toArray(new String[0]);
    }

    public static final ViewModelStoreOwner t(Fragment fragment) {
        if (fragment.requireActivity() instanceof EditContactMethodActivity) {
            androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
            mVarRequireActivity.getClass();
            return mVarRequireActivity;
        }
        Fragment fragmentRequireParentFragment = fragment.requireParentFragment();
        fragmentRequireParentFragment.getClass();
        return fragmentRequireParentFragment;
    }

    public static final DateTime u(k4 k4Var) {
        k4Var.getClass();
        DateTime dateTimeWithDayOfWeek = DateTime.now().withDayOfWeek(7);
        if (k4Var == k4.CurrentWeek) {
            dateTimeWithDayOfWeek.getClass();
            return dateTimeWithDayOfWeek;
        }
        DateTime dateTimeMinusWeeks = dateTimeWithDayOfWeek.minusWeeks(1);
        dateTimeMinusWeeks.getClass();
        return dateTimeMinusWeeks;
    }

    public static final String v(y yVar) {
        List listC = C(yVar);
        String str = yVar.f83619b;
        if (listC.isEmpty()) {
            return null;
        }
        String str2 = yVar.f83622e;
        str2.getClass();
        if (!d53.u.y(str2, str, false)) {
            str = "";
        }
        return h0.k0(listC, yVar.f83619b, str, null, null, 60);
    }

    public static final List w(String str, boolean z14, List list, List list2) {
        Object obj;
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ep2.g gVar = (ep2.g) it.next();
            if (gVar.getRequired() && (gVar.getName() == ep2.h.NAME || gVar.getName() == ep2.h.PAN || gVar.getName() == ep2.h.EXP_MONTH || gVar.getName() == ep2.h.EXP_YEAR || gVar.getName() == ep2.h.ADDRESS)) {
                arrayList.add(gVar);
            }
        }
        Iterator it3 = list.iterator();
        do {
            obj = null;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((ep2.g) next).getName() != ep2.h.CVV);
        ep2.g gVar2 = (ep2.g) next;
        if (gVar2 != null) {
            if (gVar2.getRequired()) {
                arrayList.add(new ep2.g(ep2.h.CVV, false, true, null, 10, null));
            } else if (list2 != null) {
                for (Object obj2 : list2) {
                    if (s.g(((ep2.b) obj2).getCardType(), str)) {
                        obj = obj2;
                        break;
                    }
                }
                ep2.b bVar = (ep2.b) obj;
                if (bVar != null && s.g(bVar.getCvvRequired(), Boolean.TRUE) && !z14) {
                    arrayList.add(new ep2.g(ep2.h.CVV, false, true, null, 10, null));
                }
            }
        }
        return h0.b1(arrayList);
    }

    public static final o73.u x(kt2.f fVar) {
        fVar.getClass();
        kt2.e.f106460a.getClass();
        return (o73.u) kt2.e.J0.getValue();
    }

    public static final o73.u y(kt2.f fVar) {
        fVar.getClass();
        kt2.e.f106460a.getClass();
        return (o73.u) kt2.e.K0.getValue();
    }

    public static final int z(h2.v vVar) {
        return (int) (vVar.getF80848e() == b2.Vertical ? vVar.a() & 4294967295L : vVar.a() >> 32);
    }
}
