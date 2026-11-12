package lg;

import am.x0;
import am.z0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.v;
import c42.e0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.common.util.concurrent.ListenableFuture;
import d53.w;
import dh0.e;
import dh0.g;
import dh0.h;
import dh0.i;
import e2.i0;
import e2.k0;
import e23.p;
import e63.j;
import e63.t;
import ew1.r1;
import f72.c3;
import fo.q;
import g22.k;
import g4.m;
import g4.o;
import g4.r;
import g6.l;
import i72.a0;
import i72.a1;
import i72.a2;
import i72.a3;
import i72.a4;
import i72.a5;
import i72.b1;
import i72.b2;
import i72.b3;
import i72.b4;
import i72.b5;
import i72.c0;
import i72.c2;
import i72.c4;
import i72.c5;
import i72.d0;
import i72.d1;
import i72.d2;
import i72.d3;
import i72.d4;
import i72.d5;
import i72.e1;
import i72.e2;
import i72.e3;
import i72.e4;
import i72.e5;
import i72.f1;
import i72.f2;
import i72.f3;
import i72.f4;
import i72.f5;
import i72.g0;
import i72.g1;
import i72.g2;
import i72.g3;
import i72.g4;
import i72.g5;
import i72.h0;
import i72.h2;
import i72.h3;
import i72.h4;
import i72.h5;
import i72.i1;
import i72.i2;
import i72.i3;
import i72.i4;
import i72.i5;
import i72.j1;
import i72.j2;
import i72.j3;
import i72.j4;
import i72.j5;
import i72.k1;
import i72.k2;
import i72.k3;
import i72.k4;
import i72.k5;
import i72.l1;
import i72.l2;
import i72.l3;
import i72.l4;
import i72.l5;
import i72.m0;
import i72.m1;
import i72.m2;
import i72.m3;
import i72.m4;
import i72.m5;
import i72.n0;
import i72.n1;
import i72.n3;
import i72.n4;
import i72.n5;
import i72.o1;
import i72.o2;
import i72.o3;
import i72.o4;
import i72.o5;
import i72.p0;
import i72.p1;
import i72.p3;
import i72.p4;
import i72.p5;
import i72.q0;
import i72.q1;
import i72.q3;
import i72.q4;
import i72.q5;
import i72.r0;
import i72.r2;
import i72.r3;
import i72.r4;
import i72.r5;
import i72.s0;
import i72.s1;
import i72.s2;
import i72.s3;
import i72.s4;
import i72.s5;
import i72.t0;
import i72.t2;
import i72.t3;
import i72.t4;
import i72.t5;
import i72.u;
import i72.u2;
import i72.u3;
import i72.u4;
import i72.u5;
import i72.v0;
import i72.v2;
import i72.v3;
import i72.v4;
import i72.v5;
import i72.w0;
import i72.w1;
import i72.w2;
import i72.w3;
import i72.w4;
import i72.w5;
import i72.x2;
import i72.x3;
import i72.x4;
import i72.y0;
import i72.y1;
import i72.y2;
import i72.y4;
import i72.z1;
import i72.z2;
import i72.z3;
import i72.z4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.concurrent.ExecutionException;
import k30.x;
import kotlin.t1;
import l72.c1;
import lc.u0;
import o4.f0;
import o4.h1;
import o4.u1;
import o4.v1;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.KotlinNullPointerException;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import p3.l0;
import p3.n;
import p3.n2;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.y3;
import r1.q2;
import u62.z;
import z3.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f112152a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f112153b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f112154c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List f112155d;

    public static final boolean A(Locale locale) {
        return s.g(locale.getLanguage(), BooleanUtils.NO) || s.g(locale.getLanguage(), "nb") || s.g(locale.getLanguage(), "nn");
    }

    public static final boolean B(q qVar) {
        return (qVar.f72406e != 0 || qVar.f72405d || qVar.f72404c || p(qVar) || qVar.f72403b.length() != 0) ? false : true;
    }

    public static void C(Context context, String str) {
        context.getClass();
        if (str == null) {
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0244  */
    /* JADX WARN: Code duplicated, block: B:114:0x025d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0266  */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:119:0x027c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0292  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x02af  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x0303  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public static final g4.s D(String str) {
        boolean z14;
        boolean z15;
        String strE;
        int i14;
        String str2;
        int i15;
        j0 j0Var;
        List list;
        String strE2;
        String str3;
        String strSubstring;
        ArrayList arrayList;
        ?? r14;
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        String strE3;
        String str4;
        r rVar = new r(str);
        boolean zC = rVar.c('C');
        char c14 = CoreConstants.LEFT_PARENTHESIS_CHAR;
        int i16 = 1;
        if (zC) {
            rVar.f75751b++;
            if (rVar.c('C')) {
                rVar.f75751b++;
                z14 = true;
            } else {
                z14 = false;
            }
            if (rVar.c(CoreConstants.LEFT_PARENTHESIS_CHAR)) {
                rVar.f75751b++;
                strE = rVar.e(")");
                rVar.b();
                rVar.f75751b++;
                z15 = true;
            } else {
                z15 = true;
            }
            RandomAccess randomAccess = j0.f134944a;
            while (true) {
                i14 = rVar.f75751b;
                str2 = rVar.f75750a;
                if (i14 >= str2.length() - i16 || !Character.isLetter(str2.charAt(rVar.f75751b)) || str2.charAt(rVar.f75751b + i16) != c14) {
                    break;
                }
                char cCharAt = str2.charAt(rVar.f75751b);
                i16 = i16;
                if (cCharAt != 'N') {
                    int i17 = rVar.f75751b;
                    if (cCharAt != 'P') {
                        rVar.f75751b = i17 + 2;
                        int i18 = 0;
                        while (true) {
                            if (i18 <= 0 && rVar.c(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                rVar.b();
                                rVar.f75751b++;
                                break;
                            }
                            if (rVar.a()) {
                                rVar.f("unexpected end");
                                throw null;
                            }
                            if (rVar.c(c14)) {
                                i18++;
                            } else if (rVar.c(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                                i18--;
                            }
                            rVar.f75751b++;
                        }
                    } else {
                        rVar.f75751b = i17 + 2;
                        ArrayList arrayList2 = new ArrayList();
                        int i19 = 0;
                        for (char c15 = CoreConstants.RIGHT_PARENTHESIS_CHAR; !rVar.a() && !rVar.c(c15); c15 = CoreConstants.RIGHT_PARENTHESIS_CHAR) {
                            if (rVar.c('!')) {
                                rVar.f75751b++;
                                String strE4 = rVar.e("!,)");
                                if (strE4.length() != 0) {
                                    int i24 = Integer.parseInt(strE4);
                                    int i25 = 0;
                                    while (i24 > 0) {
                                        int size = arrayList2.size();
                                        int i26 = 0;
                                        while (true) {
                                            if (i26 >= size) {
                                                arrayList2.add(new o(i25, null, null, 6, null));
                                                i24--;
                                                break;
                                            }
                                            if (((o) arrayList2.get(i26)).f75747a == i25) {
                                                i25++;
                                                break;
                                            }
                                            i26++;
                                        }
                                    }
                                } else {
                                    i19 = i16;
                                }
                            } else {
                                int iD = rVar.d("!:,)");
                                if (rVar.c(CoreConstants.COLON_CHAR)) {
                                    rVar.f75751b++;
                                    String strE5 = rVar.e("!,)");
                                    int iH = w.H(strE5, "c#", 0, false, 2);
                                    if (iH >= 0) {
                                        strE5 = w.T(strE5, "androidx.compose.", iH, 2 + iH).toString();
                                    }
                                    str4 = strE5;
                                } else {
                                    str4 = null;
                                }
                                if (i19 != 0) {
                                    int i27 = 0;
                                    while (i27 < iD) {
                                        int size2 = arrayList2.size();
                                        int i28 = 0;
                                        while (true) {
                                            if (i28 >= size2) {
                                                int i29 = i27;
                                                arrayList2.add(new o(i29, null, null, 6, null));
                                                i27 = i29;
                                                break;
                                            }
                                            if (((o) arrayList2.get(i28)).f75747a == i27) {
                                                i27++;
                                                break;
                                            }
                                            i28++;
                                        }
                                    }
                                    i19 = 0;
                                }
                                arrayList2.add(new o(iD, null, str4, 2, null));
                            }
                            if (rVar.c(CoreConstants.COMMA_CHAR)) {
                                rVar.f75751b++;
                            }
                        }
                        rVar.b();
                        rVar.f75751b++;
                        randomAccess = arrayList2;
                    }
                } else {
                    rVar.f75751b += 2;
                    ArrayList arrayList3 = new ArrayList();
                    while (!rVar.a() && !rVar.c(CoreConstants.RIGHT_PARENTHESIS_CHAR)) {
                        String strE6 = rVar.e(":,)");
                        if (rVar.c(CoreConstants.COLON_CHAR)) {
                            rVar.f75751b++;
                            strE3 = rVar.e(",)");
                            int iH2 = w.H(strE3, "c#", 0, false, 2);
                            if (iH2 >= 0) {
                                strE3 = w.T(strE3, "androidx.compose.", iH2, 2 + iH2).toString();
                            }
                        } else {
                            strE3 = null;
                        }
                        arrayList3.add(new o(arrayList3.size(), strE6, strE3));
                        if (rVar.c(CoreConstants.COMMA_CHAR)) {
                            rVar.f75751b++;
                        }
                    }
                    rVar.b();
                    rVar.f75751b++;
                    randomAccess = arrayList3;
                }
                c14 = CoreConstants.LEFT_PARENTHESIS_CHAR;
            }
            i15 = i16;
            j0Var = j0.f134944a;
            if (rVar.c(CoreConstants.COLON_CHAR)) {
                rVar.f75751b++;
                list = j0Var;
            } else {
                arrayList = new ArrayList();
                while (!rVar.a() && !rVar.c(CoreConstants.COLON_CHAR)) {
                    if (rVar.c('*')) {
                        rVar.f75751b++;
                        r14 = i15;
                    } else {
                        r14 = 0;
                    }
                    if (rVar.c('@')) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(rVar.d("@") + 1);
                    }
                    rVar.f75751b++;
                    int iD2 = rVar.d("L,:");
                    if (rVar.c('L')) {
                        rVar.f75751b++;
                        numValueOf2 = Integer.valueOf(rVar.d(",:"));
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    arrayList.add(new m(iIntValue, iD2, numValueOf2 != null ? numValueOf2.intValue() : -1, r14));
                    if (rVar.c(CoreConstants.COMMA_CHAR)) {
                        rVar.f75751b++;
                    }
                }
                rVar.f75751b++;
                list = arrayList;
            }
            strE2 = rVar.e("#");
            if (strE2.length() > 0) {
                str3 = strE2;
            } else {
                str3 = null;
            }
            if (rVar.c('#')) {
                int i30 = rVar.f75751b + 1;
                rVar.f75751b = i30;
                strSubstring = str2.substring(i30, str2.length());
            } else {
                strSubstring = null;
            }
            return new g4.s(z15, z14, strE, str3, randomAccess, strSubstring, list, str);
        }
        z14 = false;
        z15 = false;
        strE = null;
        RandomAccess randomAccess2 = j0.f134944a;
        while (true) {
            i14 = rVar.f75751b;
            str2 = rVar.f75750a;
            if (i14 >= str2.length() - i16) {
                break;
            }
            break;
        }
        i15 = i16;
        j0Var = j0.f134944a;
        if (rVar.c(CoreConstants.COLON_CHAR)) {
            arrayList = new ArrayList();
            while (!rVar.a()) {
                if (rVar.c('*')) {
                    rVar.f75751b++;
                    r14 = i15;
                } else {
                    r14 = 0;
                }
                if (rVar.c('@')) {
                    numValueOf = Integer.valueOf(rVar.d("@") + 1);
                } else {
                    numValueOf = null;
                }
                rVar.f75751b++;
                int iD3 = rVar.d("L,:");
                if (rVar.c('L')) {
                    rVar.f75751b++;
                    numValueOf2 = Integer.valueOf(rVar.d(",:"));
                } else {
                    numValueOf2 = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = -1;
                }
                arrayList.add(new m(iIntValue, iD3, numValueOf2 != null ? numValueOf2.intValue() : -1, r14));
                if (rVar.c(CoreConstants.COMMA_CHAR)) {
                    rVar.f75751b++;
                }
            }
            rVar.f75751b++;
            list = arrayList;
        } else {
            rVar.f75751b++;
            list = j0Var;
        }
        strE2 = rVar.e("#");
        if (strE2.length() > 0) {
            str3 = strE2;
        } else {
            str3 = null;
        }
        if (rVar.c('#')) {
            int i34 = rVar.f75751b + 1;
            rVar.f75751b = i34;
            strSubstring = str2.substring(i34, str2.length());
        } else {
            strSubstring = null;
        }
        return new g4.s(z15, z14, strE, str3, randomAccess2, strSubstring, list, str);
    }

    public static final String E(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i14 = reader.read(cArr);
        while (i14 >= 0) {
            stringWriter.write(cArr, 0, i14);
            i14 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final l F(n4.d dVar) {
        return new l(Math.round(dVar.f123547a), Math.round(dVar.f123548b), Math.round(dVar.f123549c), Math.round(dVar.f123550d));
    }

    public static final void G(TextPaint textPaint, float f14) {
        if (Float.isNaN(f14)) {
            return;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f14 * 255));
    }

    public static final boolean H(Double d14) {
        if (((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).N()) {
            return d14 == null || Double.isNaN(d14.doubleValue());
        }
        return false;
    }

    public static final dh0.a I(dh0.c cVar) {
        Double d14;
        Double d15;
        e eVar;
        List<String> list;
        e eVar2;
        List<String> list2;
        e eVar3;
        List<String> list3;
        e eVar4;
        e eVar5;
        e eVar6;
        cVar.getClass();
        Double d16 = cVar.f59560e;
        Double d17 = cVar.f59559d;
        Double d18 = cVar.f59558c;
        if (d18 != null) {
            Double dW = (d17 == null || d18.doubleValue() <= d17.doubleValue()) ? ge1.b.w(d18) : ge1.b.k(d18);
            d14 = dW;
        } else {
            d14 = null;
        }
        if (d16 != null) {
            Double dW2 = (d17 == null || d16.doubleValue() <= d17.doubleValue()) ? ge1.b.w(d16) : ge1.b.k(d16);
            d15 = dW2;
        } else {
            d15 = null;
        }
        Double dW3 = ge1.b.w(d17);
        ArrayList arrayList = new ArrayList();
        dh0.b bVar = cVar.f59561f;
        if (((bVar == null || (eVar6 = bVar.f59552c) == null) ? null : eVar6.f59573a) != null) {
            arrayList.add(J(bVar.f59552c, g.VIGOROUS_DAYS));
        } else {
            arrayList.add(new dh0.d(g.VIGOROUS_DAYS, null, null, Boolean.TRUE, (bVar == null || (eVar = bVar.f59552c) == null || (list = eVar.f59577e) == null) ? null : N(list), null, null, null, 230, null));
        }
        if (((bVar == null || (eVar5 = bVar.f59553d) == null) ? null : eVar5.f59573a) != null) {
            arrayList.add(J(bVar.f59553d, g.VIGOROUS_MINUTES));
        } else {
            arrayList.add(new dh0.d(g.VIGOROUS_MINUTES, null, null, Boolean.TRUE, (bVar == null || (eVar2 = bVar.f59553d) == null || (list2 = eVar2.f59577e) == null) ? null : N(list2), null, null, null, 230, null));
        }
        if (((bVar == null || (eVar4 = bVar.f59554e) == null) ? null : eVar4.f59573a) != null) {
            arrayList.add(J(bVar.f59554e, g.RESTING_HR));
        } else {
            arrayList.add(new dh0.d(g.RESTING_HR, null, null, Boolean.TRUE, (bVar == null || (eVar3 = bVar.f59554e) == null || (list3 = eVar3.f59577e) == null) ? null : N(list3), null, null, null, 230, null));
        }
        if ((bVar != null ? bVar.f59551b : null) != null) {
            arrayList.add(J(bVar.f59551b, g.BODY_FAT));
        } else {
            if ((bVar != null ? bVar.f59550a : null) != null) {
                arrayList.add(J(bVar.f59550a, g.BMI));
            } else {
                arrayList.add(new dh0.d(g.BMI, null, null, Boolean.TRUE, null, null, null, null, 230, null));
            }
        }
        return new dh0.a(cVar.f59557b, d14, dW3, d15, arrayList, k.q(cVar.f59562g, "yyyy-MM-dd'T'HH:mm:ss.SSS", null), cVar.f59556a);
    }

    public static final dh0.d J(e eVar, g gVar) {
        List<String> list;
        return new dh0.d(gVar, eVar != null ? eVar.f59573a : null, eVar != null ? eVar.f59574b : null, eVar != null ? eVar.f59576d : null, (eVar == null || (list = eVar.f59577e) == null) ? null : N(list), k.w(eVar != null ? eVar.f59578f : null, "yyyy-MM-dd"), eVar != null ? eVar.f59579g : null, eVar != null ? eVar.f59581i : null);
    }

    public static final i K(dh0.k kVar) {
        Double dW;
        kVar.getClass();
        dh0.o oVar = kVar.f59606b;
        Double d14 = oVar != null ? oVar.f59617a : null;
        Double d15 = oVar != null ? oVar.f59618b : null;
        if (d14 != null) {
            dW = (d15 == null || d14.doubleValue() <= d15.doubleValue()) ? ge1.b.w(d14) : ge1.b.k(d14);
        } else {
            dW = null;
        }
        String str = kVar.f59605a;
        return new i(str != null ? k.w(str, "yyyy-MM-dd") : null, dW);
    }

    public static final b11.k L(g21.o oVar) {
        oVar.getClass();
        long j8 = oVar.f75463a;
        String str = oVar.f75464b;
        j23.g<v> gVar = oVar.f75467e;
        return new b11.k(j8, str, gVar != null ? (v) gVar.getStart() : null, gVar != null ? (v) gVar.b() : null);
    }

    public static final float M(float f14, p3.m mVar) {
        mVar.L(-739975953);
        float fS0 = ((g6.c) mVar.A(t1.f91490h)).s0(f14);
        mVar.R();
        return fS0;
    }

    public static final ArrayList N(List list) {
        Object next;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            w13.c cVar = h.f59599e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            do {
                if (!bVarN.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarN.next();
            } while (!s.g(str, ((h) next).f59600a));
            h hVar = (h) next;
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public static final boolean O(Locale locale) {
        return (s.g(locale.getLanguage(), Locale.CHINESE.getLanguage()) || s.g(locale.getLanguage(), Locale.JAPANESE.getLanguage())) ? false : true;
    }

    public static final void P(ByteArrayOutputStream byteArrayOutputStream, int i14) {
        byteArrayOutputStream.getClass();
        byteArrayOutputStream.write(i14 & 255);
        byteArrayOutputStream.write((i14 >> 8) & 255);
    }

    public static final void Q(ByteArrayOutputStream byteArrayOutputStream, long j8) {
        byteArrayOutputStream.getClass();
        byteArrayOutputStream.write((int) (j8 & 255));
        byteArrayOutputStream.write((int) ((j8 >> 8) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 16) & 255));
        byteArrayOutputStream.write((int) ((j8 >> 24) & 255));
    }

    public static final void R(ByteArrayOutputStream byteArrayOutputStream, String str) throws IOException {
        str.getClass();
        if (str.length() == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        if (bytes.length > 255) {
            bytes = Arrays.copyOf(bytes, 255);
        }
        byteArrayOutputStream.write(bytes.length);
        byteArrayOutputStream.write(bytes);
    }

    public static final void a(float f14, float f15, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        o0 o0VarE = mVar.E(29119275);
        int i18 = i15 & 1;
        int i19 = 2;
        if (i18 != 0) {
            i16 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i16 = (o0VarE.i(f14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 != 0) {
            i17 = i16 | 48;
        } else {
            i17 = i16 | (o0VarE.i(f15) ? 32 : 16);
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            if (i18 != 0) {
                f14 = 1.5f;
            }
            if (i24 != 0) {
                f15 = Float.MAX_VALUE;
            }
            x1 x1Var = n.f135158a;
            y3 y3Var = t1.f91490h;
            g6.c cVar = (g6.c) o0VarE.A(y3Var);
            p3.v.a(y3Var.c(new g6.d(cVar.getF75991a() >= f15 ? f15 : cVar.getF75991a(), cVar.getF75992b() >= f14 ? f14 : cVar.getF75992b())), f.c(-242264085, new aa2.o(eVar, i19), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        float f16 = f14;
        float f17 = f15;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c22.a(f16, f17, eVar, i14, i15);
        }
    }

    public static final void b(i21.c cVar, e23.l lVar, p3.m mVar, int i14) {
        g21.d dVar;
        g21.d dVar2;
        lVar.getClass();
        o0 o0VarE = mVar.E(632482379);
        int i15 = 2;
        int i16 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Iterable iterable = null;
            g21.v vVar = (cVar == null || (dVar2 = cVar.f87247b) == null) ? null : dVar2.f75405a;
            List<g21.v> list = (cVar == null || (dVar = cVar.f87247b) == null) ? null : dVar.f75406b;
            if (list == null) {
                o0VarE.C(261432485);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2069776676);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                context.getClass();
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                for (g21.v vVar2 : list) {
                    String string = context.getString(vVar2.f75527a);
                    string.getClass();
                    arrayList.add(new l72.j0(string, null, null, false, vVar2 == vVar, 14, null));
                }
                o0VarE.g0(false);
                iterable = arrayList;
            }
            if (iterable == null) {
                iterable = j0.f134944a;
            }
            i53.c cVarE = i53.a.e(iterable);
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            f82.b bVar = new f82.b();
            boolean zR = o0VarE.r(list) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new e0(list, lVar, i15);
                o0VarE.K(objQ2);
            }
            e82.a.b(cVarE, bVar, i0VarA, null, null, (p) objQ2, o0VarE, 0, 24);
            boolean zR2 = o0VarE.r(list) | o0VarE.k(vVar == null ? -1 : vVar.ordinal()) | o0VarE.r(b0Var) | o0VarE.B(i0VarA);
            Object objQ3 = o0VarE.q();
            if (zR2 || objQ3 == c2565a) {
                f21.a aVar = new f21.a(list, vVar, b0Var, i0VarA, null);
                o0VarE.K(aVar);
                objQ3 = aVar;
            }
            l0.e((p) objQ3, vVar, o0VarE);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(cVar, lVar, i14, 6);
        }
    }

    public static final void c(boolean z14, i53.c cVar, e23.a aVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        int i15;
        Object obj;
        aVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-299965270);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            obj = lVar2;
            i15 |= o0VarE.r(obj) ? 16384 : 8192;
        } else {
            obj = lVar2;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(1561904359);
                l72.r1.b(gl1.y.Q(o0VarE, R.string.pacepro_title), f.c(1158752672, new d50.i(cVar, aVar, lVar, obj, 0), o0VarE), o0VarE, 48, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1562627992);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(z14, cVar, aVar, lVar, lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    public static final void d(boolean z14, d92.a aVar, d92.a aVar2, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        z3.e eVar2;
        d92.a aVar3;
        d92.a aVar4;
        d92.a aVarA;
        d92.a aVarB;
        int i17;
        o0 o0VarE = mVar.E(-1195074131);
        if ((i14 & 6) == 0) {
            i16 = i14 | (((i15 & 1) == 0 && o0VarE.h(z14)) ? 4 : 2);
        } else {
            i16 = i14;
        }
        int i18 = i16 | SyslogConstants.LOG_LOCAL2;
        int i19 = 0;
        boolean z15 = true;
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 1) != 0) {
                    z14 = u1.n.h(o0VarE);
                    i18 &= -15;
                }
                aVarA = j92.a.a();
                aVarB = j92.a.b();
                i17 = i18 & (-1009);
            } else {
                o0VarE.e();
                if ((i15 & 1) != 0) {
                    i18 &= -15;
                }
                i17 = i18 & (-1009);
                aVarA = aVar;
                aVarB = aVar2;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6046f;
            View view2 = (View) o0VarE.A(y3Var);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            d92.a aVar5 = z14 ? aVarA : aVarB;
            gl.a aVarA2 = z14 ? gl.d.a() : gl.d.b();
            Context context2 = ((View) o0VarE.A(y3Var)).getContext();
            if (context2 instanceof Activity) {
                int iJ = f0.j(aVar5.c().c());
                Window window = ((Activity) context2).getWindow();
                if (window != null) {
                    window.setStatusBarColor(iJ);
                }
            }
            boolean zR = o0VarE.r(context) | o0VarE.r(view2);
            if ((((i17 & 14) ^ 6) <= 4 || !o0VarE.h(z14)) && (i17 & 6) != 4) {
                z15 = false;
            }
            boolean z16 = zR | z15;
            Object objQ = o0VarE.q();
            p3.m.a aVar6 = p3.m.f135153a;
            if (z16) {
                objQ = new d92.d(context, view2, z14, i19);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d92.d(context, view2, z14, i19);
                    o0VarE.K(objQ);
                }
            }
            l0.i((e23.a) objQ, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar6.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = d92.a.a(aVar5, null, 2047);
                o0VarE.K(objQ2);
            }
            d92.a aVar7 = (d92.a) objQ2;
            jg.b.S(aVar7, aVar5);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = gl.a.a(aVarA2);
                o0VarE.K(objQ3);
            }
            gl.a aVar8 = (gl.a) objQ3;
            gl.b.T(aVar8, aVarA2);
            boolean zEquals = aVar5.equals(aVarA);
            eVar2 = eVar;
            p3.v.b(new n2[]{gl.d.f77768a.c(aVar8), d92.c.f58627a.c(aVar7), d92.c.f58628b.c(Boolean.valueOf(zEquals))}, f.c(640254189, new d92.e(z14, eVar2, i19), o0VarE), o0VarE, 56);
            aVar3 = aVarA;
            aVar4 = aVarB;
        } else {
            eVar2 = eVar;
            o0VarE.e();
            aVar3 = aVar;
            aVar4 = aVar2;
        }
        boolean z17 = z14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(z17, aVar3, aVar4, eVar2, i14, i15, 5);
        }
    }

    public static final l e(long j8, long j14) {
        g6.k.a aVar = g6.k.f76003b;
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        return new l(i14, i15, ((int) (j14 >> 32)) + i14, ((int) (j14 & 4294967295L)) + i15);
    }

    public static final void f(e23.a aVar, ux1.g gVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-744311850);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(gVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_exit_setup_question), gl1.y.Q(o0VarE, R.string.msg_lifestyle_logging_exit_setup), null, null, gl1.y.Q(o0VarE, R.string.lbl_exit_setup_capitalized), false, false, gVar, gl1.y.Q(o0VarE, R.string.lbl_cancel), aVar, o0VarE, ((i15 << 21) & 234881024) | 6, i15 & 14, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(aVar, gVar, i14, 27);
        }
    }

    public static final void g(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1901078235);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.dialog_no_compatible_trails_devices_title), gl1.y.Q(o0VarP, R.string.dialog_no_compatible_trails_devices_message), null, null, gl1.y.Q(o0VarP, R.string.lbl_ok), false, false, aVar, gl1.y.Q(o0VarP, R.string.common_learn_more), aVar2, o0VarP, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 1);
        }
    }

    public static final void h(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 453346927);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.lbl_skip_course_profile), gl1.y.Q(o0VarP, R.string.lbl_skip_course_profile_description), null, null, gl1.y.Q(o0VarP, R.string.common_confirm), false, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, (i15 << 24) & 234881024, 6, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.f(aVar, aVar2, i14, 9);
        }
    }

    public static synchronized void i(Throwable th3) {
        String string;
        try {
            ArrayList arrayList = new ArrayList();
            if (th3 != null) {
                StringWriter stringWriter = new StringWriter();
                th3.printStackTrace(new PrintWriter(stringWriter));
                string = stringWriter.toString();
            } else {
                string = "";
            }
            arrayList.add(string);
            j(arrayList);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public static synchronized void j(ArrayList arrayList) {
        try {
            if (!oi0.c.g(f112153b) && !oi0.c.g(f112154c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f112154c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append(", " + ((String) it.next()));
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f112152a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f112152a, f112153b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final Object k(ListenableFuture listenableFuture, v13.c cVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return androidx.concurrent.futures.a.getUninterruptibly(listenableFuture);
            }
            o53.k kVar = new o53.k(u13.f.b(cVar), 1);
            listenableFuture.addListener(new androidx.concurrent.futures.f(listenableFuture, kVar), androidx.concurrent.futures.c.INSTANCE);
            kVar.r(new androidx.concurrent.futures.d(listenableFuture));
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause != null) {
                throw cause;
            }
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
            s.j(kotlinNullPointerException, s.class.getName());
            throw kotlinNullPointerException;
        }
    }

    public static final void l(q13.b bVar, e63.o oVar) {
        if (oVar instanceof e63.e) {
            bVar.add(((e63.e) oVar).f63243a);
            return;
        }
        if (oVar instanceof e63.h) {
            Iterator it = ((e63.h) oVar).f63248a.iterator();
            while (it.hasNext()) {
                l(bVar, (e63.s) it.next());
            }
            return;
        }
        if (oVar instanceof j) {
            return;
        }
        if (oVar instanceof e63.y) {
            l(bVar, ((e63.y) oVar).f63279a);
            return;
        }
        if (!(oVar instanceof e63.c)) {
            if (oVar instanceof t) {
                l(bVar, ((t) oVar).f63269b);
                return;
            } else {
                u0.r();
                return;
            }
        }
        e63.c cVar = (e63.c) oVar;
        l(bVar, cVar.f63236a);
        Iterator it3 = cVar.f63237b.iterator();
        while (it3.hasNext()) {
            l(bVar, (e63.o) it3.next());
        }
    }

    public static final i53.f m(w20.a aVar) {
        aVar.getClass();
        com.garmin.android.apps.connectmobile.courses.model.e eVar = aVar.f181476a;
        boolean zC = eVar.m().c();
        ArrayList arrayList = new ArrayList();
        List<ClimbDTO> list = aVar.f181477b;
        boolean z14 = true;
        boolean z15 = list == null || list.isEmpty();
        if (zC && !z15) {
            arrayList.add(new r30.b(r30.a.CLIMBS, false));
        }
        x xVar = aVar.f181479d;
        List<k30.w> listD = xVar != null ? xVar.d() : null;
        if (listD != null && !listD.isEmpty()) {
            z14 = false;
        }
        if (zC && !z14) {
            arrayList.add(new r30.b(r30.a.ROAD_SURFACE, false));
        }
        ArrayList arrayListK = eVar.k();
        if (arrayListK != null && !arrayListK.isEmpty()) {
            arrayList.add(new r30.b(r30.a.COURSE_POINTS, false));
        }
        return i53.a.j(arrayList);
    }

    public static final ArrayList n(k30.t tVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        ArrayList arrayList;
        tVar.getClass();
        eVar.getClass();
        List<k30.s> listD = tVar.d();
        if (listD == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (k30.s sVar : listD) {
            List<GeoPointDTO> list = eVar.geoPoints;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                    Double d14 = geoPointDTO.distance;
                    if (geoPointDTO.b() && d14 != null) {
                        double d15 = sVar.getStartDistance();
                        double dB = sVar.getEndDistance();
                        double dDoubleValue = d14.doubleValue();
                        if (d15 <= dDoubleValue && dDoubleValue <= dB) {
                            arrayList.add(obj);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
        }
        return arrayList2;
    }

    public static final com.garmin.android.library.mapsdkadapter.p o(Resources resources, com.garmin.android.library.mapsdkadapter.f fVar, x0 x0Var, boolean z14) {
        fVar.getClass();
        x0Var.getClass();
        String str = x0Var.f4358a;
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.d(fVar);
        float f14 = z14 ? 2.0f : 1.0f;
        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
        oVar.f50311c = f14;
        oVar.f50312d = z14 ? "-2" : "-1";
        pVar.a(0.5f, 0.9f);
        if (!z14) {
            pVar.b(2131232001);
            return pVar;
        }
        int i14 = z0.R(str) ? R.drawable.safety : 2131232000;
        if (z0.R(str)) {
            pVar.c(qw0.l.a(resources, i14));
            return pVar;
        }
        pVar.b(i14);
        return pVar;
    }

    public static final boolean p(q qVar) {
        qVar.getClass();
        i53.c<jo.c> cVar = qVar.f72412k;
        if (cVar == null || cVar.isEmpty()) {
            return false;
        }
        Iterator<jo.c> it = cVar.iterator();
        while (it.hasNext()) {
            if (it.next().getF99728d()) {
                return true;
            }
        }
        return false;
    }

    public static final List q(c3 c3Var) {
        c3Var.getClass();
        List list = f112155d;
        if (list != null) {
            return list;
        }
        u4.d dVarC = c5.f92048a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("PoiTollBooth", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarN = z.n(h1.f128863b, 10.625f, 20.0f, 2.875f, 5.5f);
            z.u(eVarN, 10.625f, 20.0f, 8.375f, 7.75f);
            v.e0.x(eVarN, 4.875f, 11.25f, 8.375f, 7.75f);
            u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarD = z.d(14.125f, 7.25f, 2.0f, 2.375f, 4.0f);
            tn.k.q(eVarD, 13.625f, 14.125f, 7.25f);
            u4.d.a.b(aVar2, eVarD.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarD2 = z.d(8.375f, 15.375f, 6.625f, 8.625f, 13.25f);
            tn.k.q(eVarD2, 10.375f, 8.375f, 15.375f);
            u4.d.a.b(aVar2, eVarD2.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarD3 = z.d(12.25f, 15.375f, 10.5f, 12.5f, 13.25f);
            tn.k.q(eVarD3, 14.25f, 12.25f, 15.375f);
            u4.d.a.b(aVar2, eVarD3.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarD4 = z.d(16.125f, 15.375f, 14.375f, 16.375f, 13.25f);
            tn.k.q(eVarD4, 18.125f, 16.125f, 15.375f);
            u4.d.a.b(aVar2, eVarD4.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarD5 = z.d(20.0f, 15.375f, 18.25f, 20.25f, 13.25f);
            tn.k.q(eVarD5, 22.0f, 20.0f, 15.375f);
            u4.d.a.b(aVar2, eVarD5.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarL = z.l(20.75f, 15.375f, 5.375f, 13.25f, 20.75f);
            v.e0.w(eVarL, 15.375f, 22.0f, 11.875f, 4.125f);
            z.v(eVarL, 16.625f, 22.0f, 11.875f);
            u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            c5.f92048a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarC2 = h2.f92080a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("PoiGasStation", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var8 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarM = z.m(h1.f128863b, 3.0313f, 7.7451f, 13.5223f);
            eVarM.d(13.7121f, 7.7194f, 13.8881f, 7.6322f, 14.0235f, 7.4969f);
            eVarM.d(14.1589f, 7.3615f, 14.2461f, 7.1854f, 14.2717f, 6.9957f);
            eVarM.o(2.7494f);
            eVarM.d(14.2461f, 2.5596f, 14.1589f, 2.3836f, 14.0235f, 2.2482f);
            eVarM.d(13.8881f, 2.1128f, 13.7121f, 2.0256f, 13.5223f, 2.0f);
            eVarM.g(3.0313f);
            eVarM.d(2.8416f, 2.0256f, 2.6655f, 2.1128f, 2.5302f, 2.2482f);
            eVarM.d(2.3948f, 2.3836f, 2.3076f, 2.5596f, 2.282f, 2.7494f);
            eVarM.o(6.9957f);
            eVarM.d(2.3076f, 7.1854f, 2.3948f, 7.3615f, 2.5302f, 7.4969f);
            eVarM.d(2.6655f, 7.6322f, 2.8416f, 7.7194f, 3.0313f, 7.7451f);
            z.w(eVarM, 4.7798f, 3.9983f, 11.7738f, 4.9974f);
            z.u(eVarM, 4.7798f, 3.9983f, 21.0159f, 16.3627f);
            eVarM.d(20.5202f, 15.8556f, 20.2119f, 15.1949f, 20.1417f, 14.4893f);
            eVarM.d(20.2062f, 14.4196f, 20.2495f, 14.3329f, 20.2666f, 14.2395f);
            sn.a.B(eVarM, 11.2421f, 20.3914f, 20.6412f, 10.9923f);
            eVarM.o(8.2446f);
            eVarM.d(20.6412f, 8.1198f, 20.5163f, 7.9949f, 20.2666f, 7.87f);
            eVarM.g(20.0168f);
            eVarM.d(20.0089f, 7.7737f, 19.9641f, 7.6842f, 19.8919f, 7.6202f);
            eVarM.d(19.8085f, 6.8849f, 19.5775f, 6.174f, 19.2126f, 5.5301f);
            eVarM.d(18.8478f, 4.8863f, 18.3566f, 4.3228f, 17.7687f, 3.8734f);
            eVarM.g(17.5189f);
            eVarM.i(17.1442f, 4.373f);
            eVarM.d(17.9112f, 5.0469f, 18.4008f, 5.9815f, 18.5181f, 6.9957f);
            eVarM.o(7.87f);
            eVarM.i(18.1434f, 8.2446f);
            eVarM.i(17.0193f, 8.7442f);
            eVarM.i(16.3949f, 8.994f);
            eVarM.d(16.27f, 9.1189f, 16.27f, 9.3687f, 16.27f, 10.118f);
            eVarM.o(10.7425f);
            eVarM.d(16.27f, 10.8087f, 16.2963f, 10.8723f, 16.3431f, 10.9191f);
            eVarM.d(16.39f, 10.966f, 16.4535f, 10.9923f, 16.5198f, 10.9923f);
            q2.w(eVarM, 16.6447f, 13.4901f, 16.7696f);
            sn.a.A(eVarM, 18.8927f, 13.9897f, 19.0176f, 14.4893f);
            eVarM.d(19.0119f, 14.557f, 19.02f, 14.6251f, 19.0415f, 14.6895f);
            eVarM.d(19.063f, 14.7539f, 19.0973f, 14.8133f, 19.1425f, 14.864f);
            eVarM.d(19.2223f, 15.702f, 19.5731f, 16.4912f, 20.1417f, 17.112f);
            eVarM.d(20.427f, 17.4563f, 20.6032f, 17.8779f, 20.6477f, 18.3229f);
            eVarM.d(20.6922f, 18.7678f, 20.603f, 19.2159f, 20.3914f, 19.6099f);
            eVarM.d(20.2761f, 19.9638f, 20.0332f, 20.2622f, 19.71f, 20.4469f);
            eVarM.d(19.3868f, 20.6316f, 19.0064f, 20.6894f, 18.6429f, 20.609f);
            eVarM.d(18.2114f, 20.5374f, 17.808f, 20.3479f, 17.4774f, 20.0613f);
            eVarM.d(17.1468f, 19.7748f, 16.9018f, 19.4025f, 16.7696f, 18.9854f);
            eVarM.i(16.5198f, 18.2361f);
            eVarM.d(16.1172f, 16.9105f, 15.3869f, 15.7078f, 14.3966f, 14.7391f);
            eVarM.o(10.2429f);
            eVarM.d(14.371f, 10.0532f, 14.2838f, 9.8771f, 14.1484f, 9.7418f);
            eVarM.d(14.013f, 9.6064f, 13.837f, 9.5192f, 13.6472f, 9.4936f);
            eVarM.g(3.0313f);
            eVarM.d(2.8416f, 9.5192f, 2.6655f, 9.6064f, 2.5302f, 9.7418f);
            eVarM.d(2.3948f, 9.8771f, 2.3076f, 10.0532f, 2.282f, 10.2429f);
            eVarM.o(21.2335f);
            eVarM.d(2.3076f, 21.4232f, 2.3948f, 21.5993f, 2.5302f, 21.7347f);
            eVarM.d(2.6655f, 21.87f, 2.8416f, 21.9572f, 3.0313f, 21.9829f);
            eVarM.g(13.3974f);
            eVarM.d(13.5872f, 21.9572f, 13.7632f, 21.87f, 13.8986f, 21.7347f);
            eVarM.d(14.034f, 21.5993f, 14.1212f, 21.4232f, 14.1468f, 21.2335f);
            eVarM.o(16.8623f);
            eVarM.d(14.5865f, 17.4237f, 14.9246f, 18.0577f, 15.1459f, 18.7356f);
            eVarM.i(15.3957f, 19.485f);
            eVarM.d(15.5748f, 20.1607f, 15.9595f, 20.764f, 16.4965f, 21.2115f);
            eVarM.d(17.0335f, 21.659f, 17.6963f, 21.9285f, 18.3932f, 21.9829f);
            eVarM.d(18.998f, 22.0507f, 19.6083f, 21.9158f, 20.1282f, 21.5994f);
            eVarM.d(20.6481f, 21.2829f, 21.0482f, 20.8028f, 21.2657f, 20.2344f);
            eVarM.d(21.6002f, 19.6554f, 21.7551f, 18.9901f, 21.7106f, 18.323f);
            eVarM.d(21.6661f, 17.6558f, 21.4243f, 17.017f, 21.0159f, 16.4876f);
            u4.d.a.b(aVar4, eVarM.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            h2.f92080a = dVarC2;
        }
        u4.d dVar2 = dVarC2;
        u4.d dVarC3 = e2.f92059a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("PoiFountainLandmark", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var9 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 8.5903f, 15.23f);
            eVarK.d(8.9666f, 15.23f, 9.2802f, 14.9164f, 9.2802f, 14.5401f);
            eVarK.o(8.1429f);
            eVarK.d(9.2802f, 7.7666f, 8.9666f, 7.453f, 8.5903f, 7.453f);
            eVarK.g(8.3394f);
            eVarK.d(7.9631f, 7.453f, 7.6495f, 7.7666f, 7.6495f, 8.1429f);
            eVarK.o(14.5401f);
            eVarK.d(7.6495f, 14.9164f, 7.9631f, 15.23f, 8.3394f, 15.23f);
            eVarK.g(8.5903f);
            eVarK.c();
            u4.d.a.b(aVar6, eVarK.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var10 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(15.8655f, 7.453f);
            eVarL2.d(15.4892f, 7.453f, 15.1756f, 7.7666f, 15.1756f, 8.1429f);
            eVarL2.o(14.5401f);
            eVarL2.d(15.1756f, 14.9164f, 15.4892f, 15.23f, 15.8655f, 15.23f);
            eVarL2.g(16.1164f);
            eVarL2.d(16.4927f, 15.23f, 16.8063f, 14.9164f, 16.8063f, 14.5401f);
            eVarL2.o(8.1429f);
            eVarL2.d(16.8063f, 7.7666f, 16.4927f, 7.453f, 16.1164f, 7.453f);
            eVarL2.g(15.8655f);
            eVarL2.c();
            u4.d.a.b(aVar6, eVarL2.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(5.768f, 13.4112f);
            eVarL3.d(6.1443f, 13.4112f, 6.4578f, 13.0976f, 6.4578f, 12.7213f);
            eVarL3.o(10.8397f);
            eVarL3.d(6.4578f, 10.4634f, 6.1443f, 10.1498f, 5.768f, 10.1498f);
            eVarL3.g(5.5171f);
            eVarL3.d(5.1408f, 10.1498f, 4.8272f, 10.4634f, 4.8272f, 10.8397f);
            eVarL3.o(12.7213f);
            eVarL3.d(4.8272f, 13.0976f, 5.1408f, 13.4112f, 5.5171f, 13.4112f);
            eVarL3.g(5.768f);
            eVarL3.c();
            u4.d.a.b(aVar6, eVarL3.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarJ = tn.k.j(18.876f, 10.1498f, 18.6251f);
            eVarJ.d(18.2488f, 10.1498f, 17.9352f, 10.4634f, 17.9352f, 10.8397f);
            eVarJ.o(12.7213f);
            eVarJ.d(17.9352f, 13.0976f, 18.2488f, 13.4112f, 18.6251f, 13.4112f);
            eVarJ.g(18.876f);
            eVarJ.d(19.2523f, 13.4112f, 19.5659f, 13.0976f, 19.5659f, 12.7213f);
            eVarJ.o(10.8397f);
            eVarJ.d(19.5659f, 10.4634f, 19.2523f, 10.1498f, 18.876f, 10.1498f);
            eVarJ.c();
            u4.d.a.b(aVar6, eVarJ.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var13 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarS = v.e0.s(19.754f, 19.3066f, 18.4369f, 17.9895f);
            eVarS.d(18.4369f, 17.7387f, 18.2488f, 17.5505f, 17.9979f, 17.5505f);
            eVarS.g(13.2314f);
            eVarS.o(7.2021f);
            eVarS.d(13.2314f, 5.885f, 14.2976f, 4.8188f, 15.6146f, 4.8188f);
            eVarS.d(16.9317f, 4.8188f, 17.9979f, 5.885f, 17.9979f, 7.2021f);
            eVarS.o(8.5819f);
            eVarS.d(17.9979f, 9.0836f, 18.4369f, 9.5226f, 18.9387f, 9.5226f);
            eVarS.d(19.4404f, 9.5226f, 19.8795f, 9.0836f, 19.8795f, 8.5819f);
            eVarS.o(7.2021f);
            eVarS.d(19.8795f, 4.8815f, 17.9979f, 3.0f, 15.6774f, 3.0f);
            eVarS.d(14.2349f, 3.0f, 12.9805f, 3.6899f, 12.2279f, 4.8188f);
            eVarS.d(11.4753f, 3.7526f, 10.2209f, 3.0f, 8.7784f, 3.0f);
            eVarS.d(6.4578f, 3.0f, 4.5763f, 4.8815f, 4.5763f, 7.2021f);
            eVarS.o(8.5819f);
            eVarS.d(4.5763f, 9.0836f, 5.0153f, 9.5226f, 5.5171f, 9.5226f);
            eVarS.d(6.0188f, 9.5226f, 6.4578f, 9.0836f, 6.4578f, 8.5819f);
            eVarS.o(7.2021f);
            eVarS.d(6.4578f, 5.885f, 7.5241f, 4.8188f, 8.8411f, 4.8188f);
            eVarS.d(10.1582f, 4.8188f, 11.2244f, 5.885f, 11.2244f, 7.2021f);
            eVarS.o(17.5505f);
            eVarS.g(6.4578f);
            eVarS.d(6.207f, 17.5505f, 6.0188f, 17.7387f, 6.0188f, 17.9895f);
            eVarS.o(19.3066f);
            eVarS.g(4.639f);
            eVarS.d(4.3882f, 19.3066f, 4.2f, 19.4948f, 4.2f, 19.7456f);
            eVarS.o(20.561f);
            eVarS.d(4.2f, 20.8118f, 4.3882f, 21.0f, 4.639f, 21.0f);
            eVarS.g(19.8167f);
            eVarS.d(20.0676f, 21.0f, 20.2558f, 20.8118f, 20.2558f, 20.561f);
            eVarS.o(19.7456f);
            eVarS.d(20.193f, 19.4948f, 20.0049f, 19.3066f, 19.754f, 19.3066f);
            eVarS.c();
            u4.d.a.b(aVar6, eVarS.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            e2.f92059a = dVarC3;
        }
        u4.d dVar3 = dVarC3;
        u4.d dVarC4 = d1.f92051a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("PoiCover", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var14 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(h1.f128863b, 18.875f, 11.0f);
            eVarK2.d(19.5926f, 9.2626f, 20.6558f, 7.6891f, 22.0f, 6.375f);
            eVarK2.d(20.8106f, 9.1854f, 20.174f, 12.1987f, 20.125f, 15.25f);
            eVarK2.d(20.375f, 16.75f, 20.5f, 17.625f, 20.5f, 17.625f);
            eVarK2.g(4.375f);
            eVarK2.d(4.375f, 10.125f, 2.375f, 6.375f, 2.375f, 6.375f);
            eVarK2.d(3.7306f, 7.7279f, 4.7942f, 9.3446f, 5.5f, 11.125f);
            eVarK2.d(5.2129f, 8.1889f, 4.4531f, 5.3186f, 3.25f, 2.625f);
            eVarK2.d(7.5f, 6.5f, 9.125f, 13.375f, 9.75f, 16.25f);
            eVarK2.d(9.5f, 9.625f, 7.75f, 6.375f, 7.75f, 6.375f);
            eVarK2.d(9.1056f, 7.7279f, 10.1692f, 9.3446f, 10.875f, 11.125f);
            eVarK2.d(10.5879f, 8.1889f, 9.8281f, 5.3186f, 8.625f, 2.625f);
            eVarK2.d(12.75f, 6.5f, 14.375f, 13.375f, 15.0f, 16.25f);
            eVarK2.d(14.75f, 9.625f, 13.0f, 6.375f, 13.0f, 6.375f);
            eVarK2.d(14.3584f, 7.7256f, 15.4224f, 9.3429f, 16.125f, 11.125f);
            eVarK2.d(15.8379f, 8.1889f, 15.0781f, 5.3186f, 13.875f, 2.625f);
            eVarK2.d(16.1834f, 4.9797f, 17.8975f, 7.8507f, 18.875f, 11.0f);
            eVarK2.c();
            u4.d.a.b(aVar8, eVarK2.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(f0.d(4278190080L), jVar);
            u4.e eVarL4 = z.l(2.0f, 18.875f, 22.0f, 21.375f, 2.0f);
            eVarL4.o(18.875f);
            eVarL4.c();
            u4.d.a.b(aVar8, eVarL4.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            d1.f92051a = dVarC4;
        }
        u4.d dVar4 = dVarC4;
        c3Var.getClass();
        u4.d dVarC5 = n3.f92123a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("PoiParking", f18, f18, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var16 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarN2 = z.n(h1.f128863b, 12.4998f, 2.0003f, 4.7499f, 22.0f);
            q2.w(eVarN2, 9.2499f, 15.3751f, 12.6248f);
            eVarN2.d(14.3984f, 15.3585f, 16.0928f, 14.6381f, 17.3352f, 13.3722f);
            eVarN2.d(18.5776f, 12.1064f, 19.2663f, 10.3988f, 19.2497f, 8.6252f);
            eVarN2.d(19.2332f, 6.8516f, 18.5127f, 5.1572f, 17.2468f, 3.9148f);
            eVarN2.d(15.981f, 2.6724f, 14.2734f, 1.9837f, 12.4998f, 2.0003f);
            z.w(eVarN2, 12.7498f, 11.0002f, 9.2499f, 6.5002f);
            eVarN2.g(12.7498f);
            eVarN2.d(13.0453f, 6.492f, 13.3395f, 6.5421f, 13.6156f, 6.6476f);
            eVarN2.d(13.8917f, 6.7531f, 14.1444f, 6.9119f, 14.3591f, 7.115f);
            eVarN2.d(14.5738f, 7.3182f, 14.7464f, 7.5616f, 14.8671f, 7.8314f);
            eVarN2.d(14.9878f, 8.1013f, 15.0541f, 8.3922f, 15.0623f, 8.6877f);
            eVarN2.d(15.0705f, 8.9832f, 15.0204f, 9.2774f, 14.9149f, 9.5535f);
            eVarN2.d(14.8094f, 9.8296f, 14.6506f, 10.0822f, 14.4475f, 10.297f);
            eVarN2.d(14.2444f, 10.5117f, 14.0009f, 10.6843f, 13.7311f, 10.805f);
            eVarN2.d(13.4612f, 10.9256f, 13.1703f, 10.992f, 12.8748f, 11.0002f);
            eVarN2.g(12.7498f);
            eVarN2.c();
            u4.d.a.b(aVar10, eVarN2.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            n3.f92123a = dVarC5;
        }
        u4.d dVar5 = dVarC5;
        u4.d dVarA = i72.i.a(c3Var);
        u4.d dVarA2 = i72.c.a(c3Var);
        u4.d dVarA3 = n4.a(c3Var);
        u4.d dVarA4 = s0.a(c3Var);
        u4.d dVarA5 = i72.e.a(c3Var);
        u4.d dVarA6 = i72.e0.a(c3Var);
        u4.d dVarA7 = t3.a(c3Var);
        u4.d dVarA8 = k4.a(c3Var);
        u4.d dVarA9 = c4.a(c3Var);
        u4.d dVarA10 = i2.a(c3Var);
        u4.d dVarA11 = o2.a(c3Var);
        u4.d dVarA12 = i72.u1.a(c3Var);
        u4.d dVarA13 = w2.a(c3Var);
        u4.d dVarA14 = g0.a(c3Var);
        u4.d dVarA15 = i72.l0.a(c3Var);
        u4.d dVarA16 = i72.v1.a(c3Var);
        c3Var.getClass();
        u4.d dVarC6 = e3.f92060a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("PoiMileMarker", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var17 = new o4.t1(f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL5 = b71.i.l(h1.f128863b, 12.0f, 2.0f, 2.0f, 12.0f);
            eVarL5.i(12.0f, 22.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 22.0f, 12.0f, 12.0f, 2.0f);
            eVarL5.k(6.6667f, 12.0f);
            eVarL5.i(12.0f, 6.6667f);
            eVarL5.i(17.3333f, 12.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 12.0f, 17.3333f, 6.6667f, 12.0f);
            u4.d.a.b(aVar12, eVarL5.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            e3.f92060a = dVarC6;
        }
        List listK = p13.x.k(dVar, dVar2, dVar3, dVar4, dVar5, dVarA, dVarA2, dVarA3, dVarA4, dVarA5, dVarA6, dVarA7, dVarA8, dVarA9, dVarA10, dVarA11, dVarA12, dVarA13, dVarA14, dVarA15, dVarA16, dVarC6, s1.a(c3Var), i72.d.a(c3Var), f3.a(c3Var), i72.j.a(c3Var), i72.s.a(c3Var), p5.a(c3Var), u.a(c3Var), w4.a(c3Var), m2.a(c3Var), i72.y3.a(c3Var), i72.m.a(c3Var), p4.a(c3Var), i72.i0.a(c3Var), z4.a(c3Var), i72.f0.a(c3Var), k1.a(c3Var), k2.a(c3Var), i4.a(c3Var), i72.z.a(c3Var), g2.a(c3Var), b1.a(c3Var), t0.a(c3Var), o5.a(c3Var), h0.a(c3Var), v2.a(c3Var), i72.z0.a(c3Var), v3.a(c3Var), v5.a(c3Var), i72.v.a(c3Var), a2.a(c3Var), w0.a(c3Var), u5.a(c3Var), d5.a(c3Var), g3.a(c3Var), o4.a(c3Var), j3.a(c3Var), k5.a(c3Var), m3.a(c3Var), i72.a.a(c3Var), f1.a(c3Var), g1.a(c3Var), p3.a(c3Var), i5.a(c3Var), f4.a(c3Var), e5.a(c3Var), u2.a(c3Var), i72.c3.a(c3Var), p1.a(c3Var), d0.a(c3Var), c2.a(c3Var), i72.q.a(c3Var), t4.a(c3Var), u3.a(c3Var), u4.a(c3Var), i72.w.a(c3Var), i72.x.a(c3Var), s5.a(c3Var), s4.a(c3Var), h4.a(c3Var), i72.u0.a(c3Var), m5.a(c3Var), h5.a(c3Var), d2.a(c3Var), y0.a(c3Var), l4.a(c3Var), n1.a(c3Var), a4.a(c3Var), l3.a(c3Var), i72.y.a(c3Var), m1.a(c3Var), x4.a(c3Var), k3.a(c3Var), w3.a(c3Var), n0.a(c3Var), i72.j0.a(c3Var), i72.k0.a(c3Var), l1.a(c3Var), a0.a(c3Var), i72.r.a(c3Var), y4.a(c3Var), t2.a(c3Var), i72.q2.a(c3Var), b2.a(c3Var), i72.x0.a(c3Var), t5.a(c3Var), f5.a(c3Var), y1.a(c3Var), q3.a(c3Var), c0.a(c3Var), f2.a(c3Var), i72.t.a(c3Var), r0.a(c3Var), i72.p.a(c3Var), b5.a(c3Var), x2.a(c3Var), q1.a(c3Var), r3.a(c3Var), s3.a(c3Var), r2.a(c3Var), i72.h1.a(c3Var), e4.a(c3Var), n5.a(c3Var), i72.o0.a(c3Var), a1.a(c3Var), z2.a(c3Var), l5.a(c3Var), i72.k.a(c3Var), p0.a(c3Var), z3.a(c3Var), j1.a(c3Var), i72.p2.a(c3Var), o1.a(c3Var), x3.a(c3Var), i72.c1.a(c3Var), a5.a(c3Var), o3.a(c3Var), i72.h.a(c3Var), j5.a(c3Var), d4.a(c3Var), l2.a(c3Var), i72.l.a(c3Var), g5.a(c3Var), e1.a(c3Var), m4.a(c3Var), i72.f.a(c3Var), s2.a(c3Var), i1.a(c3Var), i72.o.a(c3Var), y2.a(c3Var), a3.a(c3Var), m0.a(c3Var), i72.b0.a(c3Var), r4.a(c3Var), w5.a(c3Var), q4.a(c3Var), d3.a(c3Var), i72.x1.a(c3Var), j4.a(c3Var), i72.b.a(c3Var), i72.r1.a(c3Var), q5.a(c3Var), j2.a(c3Var), i3.a(c3Var), h3.a(c3Var), g4.a(c3Var), w1.a(c3Var), i72.n.a(c3Var), q0.a(c3Var), i72.n2.a(c3Var), v0.a(c3Var), z1.a(c3Var), b3.a(c3Var), i72.t1.a(c3Var), r5.a(c3Var), i72.g.a(c3Var), b4.a(c3Var), v4.a(c3Var));
        f112155d = listK;
        listK.getClass();
        return listK;
    }

    public static final k30.n r() {
        return new k30.n(k30.m.COURSE_DATE, i53.a.a(new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.ROAD_CYCLING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.MOUNTAIN_BIKING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.GRAVEL_CYCLING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.RUNNING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.TRAIL_RUNNING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.OBSTACLE_COURSE_RACING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.HIKING, true), new k30.o(com.garmin.android.apps.connectmobile.courses.model.i.OTHER, true)), 0.0d, Double.MAX_VALUE);
    }

    public static final int s(com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var, int i14) {
        ArrayList arrayList;
        List<Integer> listB;
        List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF = c0Var.f();
        if (listF != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listF) {
                if (((com.garmin.android.apps.connectmobile.repcounting.model.e) obj).f0()) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(y.r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((com.garmin.android.apps.connectmobile.repcounting.model.e) it.next()).G()));
            }
        } else {
            arrayList = null;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.f0 f0VarG = c0Var.getSplit();
        if (f0VarG == null || (listB = f0VarG.b()) == null || i14 < 0) {
            return i14;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listB) {
            int iIntValue = ((Number) obj2).intValue();
            if (arrayList != null && !arrayList.contains(Integer.valueOf(iIntValue))) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3.indexOf(Integer.valueOf(i14)) + 1;
    }

    public static final int t(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar) {
        List<Integer> listB;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF = fVar.f();
        int i14 = 0;
        if (listF != null) {
            for (com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var : listF) {
                List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF2 = c0Var.f();
                long j8 = 0;
                if (listF2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listF2) {
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) obj;
                        com.garmin.android.apps.connectmobile.activities.newmodel.f0 f0VarG = c0Var.getSplit();
                        if (f0VarG == null || (listB = f0VarG.b()) == null) {
                            listB = j0.f134944a;
                        }
                        if (listB.contains(Integer.valueOf(eVar.G())) && eVar.e0()) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    long jLongValue = 0;
                    while (it.hasNext()) {
                        Long lH = ((com.garmin.android.apps.connectmobile.repcounting.model.e) it.next()).H();
                        jLongValue += lH != null ? lH.longValue() : 0L;
                    }
                    j8 = jLongValue;
                }
                i14 += (int) j8;
            }
        }
        return i14;
    }

    public static final int u(com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var) {
        List<Integer> listB;
        List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF = c0Var.f();
        long j8 = 0;
        if (listF != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listF) {
                com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) obj;
                com.garmin.android.apps.connectmobile.activities.newmodel.f0 f0VarG = c0Var.getSplit();
                if (f0VarG == null || (listB = f0VarG.b()) == null) {
                    listB = j0.f134944a;
                }
                if (listB.contains(Integer.valueOf(eVar.G())) && eVar.e0()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Long lH = ((com.garmin.android.apps.connectmobile.repcounting.model.e) it.next()).H();
                jLongValue += lH != null ? lH.longValue() : 0L;
            }
            j8 = jLongValue;
        }
        return (int) j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final int v(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar) {
        List<Integer> listB;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF = fVar.f();
        if (listF == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList(y.r(listF, 10));
        Iterator it = listF.iterator();
        while (true) {
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.c0) it.next();
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF2 = c0Var.f();
            if (listF2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj : listF2) {
                    com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) obj;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f0 f0VarG = c0Var.getSplit();
                    if (f0VarG == null || (listB = f0VarG.b()) == null) {
                        listB = j0.f134944a;
                    }
                    if (listB.contains(Integer.valueOf(eVar.G())) && eVar.e0()) {
                        arrayList2.add(obj);
                    }
                }
            }
            arrayList.add(arrayList2);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return 0;
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
            return 0;
        }
        ?? next = it3.next();
        while (it3.hasNext()) {
            Collection collection = (List) it3.next();
            List list = (List) next;
            next = list != null ? new ArrayList(list) : 0;
            if (next != 0) {
                if (collection == null) {
                    collection = j0.f134944a;
                }
                next.addAll(collection);
            }
        }
        List list2 = (List) next;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final long w(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar) {
        List<Integer> listB;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.c0> listF = fVar.f();
        long jLongValue = 0;
        if (listF == null) {
            return 0L;
        }
        ArrayList arrayList = new ArrayList(y.r(listF, 10));
        Iterator it = listF.iterator();
        while (true) {
            ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.c0 c0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.c0) it.next();
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> listF2 = c0Var.f();
            if (listF2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj : listF2) {
                    com.garmin.android.apps.connectmobile.repcounting.model.e eVar = (com.garmin.android.apps.connectmobile.repcounting.model.e) obj;
                    com.garmin.android.apps.connectmobile.activities.newmodel.f0 f0VarG = c0Var.getSplit();
                    if (f0VarG == null || (listB = f0VarG.b()) == null) {
                        listB = j0.f134944a;
                    }
                    if (listB.contains(Integer.valueOf(eVar.G())) && eVar.e0()) {
                        arrayList2.add(obj);
                    }
                }
            }
            arrayList.add(arrayList2);
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return 0L;
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            org.apache.commons.lang3.e.w("Empty collection can't be reduced.");
            return 0L;
        }
        ?? next = it3.next();
        while (it3.hasNext()) {
            Collection collection = (List) it3.next();
            List list = (List) next;
            next = list != null ? new ArrayList(list) : 0;
            if (next != 0) {
                if (collection == null) {
                    collection = j0.f134944a;
                }
                next.addAll(collection);
            }
        }
        List<com.garmin.android.apps.connectmobile.repcounting.model.e> list2 = (List) next;
        if (list2 == null) {
            return 0L;
        }
        ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
        for (com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 : list2) {
            Long lH = eVar2.H();
            long jLongValue2 = lH != null ? lH.longValue() : 0L;
            Long lZ = eVar2.Z();
            arrayList3.add(Long.valueOf(jLongValue2 * (lZ != null ? lZ.longValue() : 0L)));
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            jLongValue += ((Number) it4.next()).longValue();
        }
        return jLongValue;
    }

    public static final String x(byte[] bArr) {
        bArr.getClass();
        return p13.u.O(bArr, "", new fo.x(13), 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer y(Exception exc) {
        exc.getClass();
        bd2.a aVar = exc instanceof bd2.a ? (bd2.a) exc : null;
        Integer httpCode = aVar != null ? aVar.getHttpCode() : null;
        if (httpCode != null) {
            return httpCode;
        }
        Object cause = exc.getCause();
        bd2.a aVar2 = cause instanceof bd2.a ? (bd2.a) cause : null;
        Integer httpCode2 = aVar2 != null ? aVar2.getHttpCode() : null;
        if (httpCode2 != null) {
            return httpCode2;
        }
        Throwable cause2 = exc.getCause();
        Exception exc2 = cause2 instanceof Exception ? (Exception) cause2 : null;
        if (exc2 != null) {
            return y(exc2);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String z(Exception exc) {
        exc.getClass();
        bd2.b bVar = exc instanceof bd2.b ? (bd2.b) exc : null;
        String url = bVar != null ? bVar.getUrl() : null;
        if (url != null) {
            return url;
        }
        Object cause = exc.getCause();
        bd2.b bVar2 = cause instanceof bd2.b ? (bd2.b) cause : null;
        String url2 = bVar2 != null ? bVar2.getUrl() : null;
        if (url2 != null) {
            return url2;
        }
        Throwable cause2 = exc.getCause();
        Exception exc2 = cause2 instanceof Exception ? (Exception) cause2 : null;
        if (exc2 != null) {
            return z(exc2);
        }
        return null;
    }
}
