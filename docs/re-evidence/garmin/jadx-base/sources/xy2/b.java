package xy2;

import a43.e0;
import am.x0;
import am.z0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.n0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c22.w3;
import c22.x3;
import c42.c0;
import ca0.j1;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.k1;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.chartingv2.BuildConfig;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.tasks.Task;
import com.google.common.net.HttpHeaders;
import d53.u;
import d53.w;
import e2.i0;
import e2.k0;
import e2.v;
import f21.z;
import f72.fe;
import g21.s;
import gl1.y;
import h4.r;
import i3.e5;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CancellationException;
import k72.a0;
import k72.b0;
import k72.d0;
import k72.q;
import k72.t;
import k72.x;
import l72.c1;
import l72.j0;
import o13.p;
import o4.f0;
import o4.h1;
import o4.t1;
import o53.s0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;
import p13.h0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ps.a1;
import ps.m1;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f192720a;

    public static final boolean A(a1 a1Var) {
        List<m1> listN0 = a1Var != null ? a1Var.n0() : null;
        if (listN0 == null || listN0.isEmpty()) {
            return false;
        }
        am.d dVar = (am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null);
        if (listN0.isEmpty()) {
            return false;
        }
        Iterator<T> it = listN0.iterator();
        while (it.hasNext()) {
            if (dVar.F(((m1) it.next()).getProductNumber())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static final boolean B(z0 z0Var, String str) {
        boolean z14;
        z0Var.getClass();
        boolean zB = z0.b(x0.f4308n, str);
        boolean zB2 = z0.b(x0.f4331t, str);
        x0 x0Var = x0.f4320q;
        if (z0.b(x0Var, str)) {
            x0 x0VarM = z0.m(str);
            if ((x0VarM != null ? z0.g(x0VarM) : null) == x0Var) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        boolean zB3 = z0.b(x0.O0, str);
        boolean zT = z0.T(str);
        boolean z15 = z0.z(str);
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.A() && (zB || zB2 || z14 || zB3 || zT || z15);
    }

    public static final boolean C(z0 z0Var, String str) {
        z0Var.getClass();
        boolean zB = z0.b(x0.E3, str);
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.A() && zB;
    }

    public static final void D(String str, String str2) {
        ht.a aVar = ht.a.f85464a;
        Bundle bundleA = h7.c.a(new p("garminDeviceName", str2));
        aVar.getClass();
        ht.a.a(bundleA, str);
    }

    public static final float E(Resources resources, int i14) {
        return i14 / resources.getDisplayMetrics().density;
    }

    public static String F(x33.f fVar) {
        fVar.getClass();
        String strB = fVar.b();
        strB.getClass();
        if (!e0.f1139a.contains(strB)) {
            for (int i14 = 0; i14 < strB.length(); i14++) {
                char cCharAt = strB.charAt(i14);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB).concat("`");
    }

    public static final String G(String str, String str2, e23.a aVar, e23.a aVar2, e23.l lVar) {
        str.getClass();
        str2.getClass();
        lVar.getClass();
        String str3 = (String) aVar.invoke();
        String strI = I(str, tn.k.g(str3, "Mutable"), str2, str3, tn.k.g(str3, "(Mutable)"));
        if (strI != null) {
            return strI;
        }
        String strI2 = I(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strI2 != null) {
            return strI2;
        }
        String str4 = (String) aVar2.invoke();
        StringBuilder sbK = e5.k(str4);
        sbK.append((String) lVar.invoke("Array<"));
        String string = sbK.toString();
        StringBuilder sbK2 = e5.k(str4);
        sbK2.append((String) lVar.invoke("Array<out "));
        String string2 = sbK2.toString();
        StringBuilder sbK3 = e5.k(str4);
        sbK3.append((String) lVar.invoke("Array<(out) "));
        String strI3 = I(str, string, str2, string2, sbK3.toString());
        if (strI3 != null) {
            return strI3;
        }
        return null;
    }

    public static final String H(List list) {
        StringBuilder sb3 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x33.f fVar = (x33.f) it.next();
            if (sb3.length() > 0) {
                sb3.append(".");
            }
            sb3.append(F(fVar));
        }
        return sb3.toString();
    }

    public static final String I(String str, String str2, String str3, String str4, String str5) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        if (!u.y(str, str2, false) || !u.y(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        String strSubstring2 = str3.substring(str4.length());
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (N(strSubstring, strSubstring2)) {
            return strConcat.concat("!");
        }
        return null;
    }

    public static final void J(HttpURLConnection httpURLConnection, String str, String str2, String str3, String str4, String str5) {
        httpURLConnection.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jNextLong = new Random().nextLong();
        u63.b bVar = new u63.b();
        bVar.setTokenSecret(str2);
        bVar.setConsumerSecret(str4);
        t63.a aVar = new t63.a();
        String query = httpURLConnection.getURL().getQuery();
        if (query != null) {
            aVar.c(r63.b.b(query), true);
        }
        if (str5 != null) {
            Iterator it = w.W(str5, new String[]{"&"}).iterator();
            while (it.hasNext()) {
                String[] strArr = (String[]) w.X((String) it.next(), new char[]{'='}).toArray(new String[0]);
                aVar.b(strArr[0], strArr[1], false);
            }
        }
        aVar.b("oauth_consumer_key", str3, true);
        aVar.b("oauth_signature_method", "HMAC-SHA1", true);
        aVar.b("oauth_timestamp", String.valueOf(jCurrentTimeMillis), true);
        aVar.b("oauth_nonce", String.valueOf(jNextLong), true);
        aVar.b("oauth_version", BuildConfig.VERSION_NAME, true);
        aVar.b("oauth_token", str, true);
        String strSign = bVar.sign(new s63.a(httpURLConnection), aVar);
        strSign.getClass();
        String strI = nd2.c.i(strSign);
        StringBuilder sb3 = new StringBuilder("OAuth ");
        sb3.append("oauth_token=\"" + str + "\",");
        sb3.append("oauth_consumer_key=\"" + str3 + "\",");
        sb3.append("oauth_version=\"1.0\",oauth_signature_method=\"HMAC-SHA1\",");
        sb3.append("oauth_timestamp=\"" + jCurrentTimeMillis + "\",");
        sb3.append("oauth_nonce=\"" + jNextLong + "\",");
        sb3.append("oauth_signature=\"" + strI + "\"");
        httpURLConnection.addRequestProperty(HttpHeaders.AUTHORIZATION, sb3.toString());
    }

    public static final y0 K(u1 u1Var, e23.l lVar) {
        u1Var.getClass();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(u1Var);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new w3(y0Var, lVar, null), 2);
        return y0Var;
    }

    public static final void L(pt0.p pVar, y0 y0Var, e23.l lVar) {
        y0Var.getClass();
        w9.a aVarA = v1.a(pVar);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new x3(y0Var, lVar, null), 2);
    }

    public static final oy2.a M(cy2.d dVar) {
        dVar.getClass();
        return new oy2.a(dVar.f56817a, dVar.f56818b, dVar.f56819c, dVar.f56820d, dVar.f56821e, dVar.f56822f, dVar.f56823g, dVar.f56824h, dVar.f56825i, dVar.f56826j, dVar.f56827k, dVar.f56828l, null);
    }

    public static final boolean N(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(u.v(str2, CallerData.NA, "", false))) {
            return true;
        }
        if (u.p(str2, CallerData.NA, false) && str.concat(CallerData.NA).equals(str2)) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder("(");
        sb3.append(str);
        sb3.append(")?");
        return sb3.toString().equals(str2);
    }

    public static final String O(Context context, String str) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        return str == null ? aVar.getString(R.string.txt_empty_page_no_data) : new d53.k(e5.g(aVar.getString(R.string.no_value), "|", aVar.getString(R.string.no_value_card))).f(str, aVar.getString(R.string.txt_empty_page_no_data));
    }

    public static final int P(v vVar) {
        List<e2.n> listE = vVar.e();
        if (listE.isEmpty()) {
            return 0;
        }
        int size = listE.size();
        int size2 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            size2 += listE.get(i14).getF62575q();
        }
        return vVar.getF62558r() + (size2 / listE.size());
    }

    public static final void a(e23.a aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(712113093);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.lbl_previously_reported), y.Q(o0VarE, R.string.lbl_previously_reported_content), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 0);
        }
    }

    public static final g6.e b(Context context) {
        float f14 = context.getResources().getConfiguration().fontScale;
        float f15 = context.getResources().getDisplayMetrics().density;
        h6.b.f82143a.getClass();
        h6.a aVarA = h6.b.a(f14);
        if (aVarA == null) {
            aVarA = new g6.p(f14);
        }
        return new g6.e(f15, f14, aVarA);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    public static final void c(r rVar, GeoPointDTO geoPointDTO, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(236567979);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(geoPointDTO) : o0VarE.r(geoPointDTO) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (geoPointDTO == null || !geoPointDTO.b()) {
                o0VarE.C(-443846985);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-444413200);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_driving_directions);
                d50.e.f57521a.getClass();
                z3.e eVar = d50.e.f57522b;
                boolean z15 = (i15 & 896) == 256;
                if ((i15 & 112) != 32 && ((i15 & 64) == 0 || !o0VarE.r(geoPointDTO))) {
                    z14 = false;
                }
                boolean z16 = z15 | z14;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new j1(22, pVar, geoPointDTO);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j1(22, pVar, geoPointDTO);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.g(strQ, rVar, null, eVar, null, false, false, (e23.a) objQ, o0VarE, ((i15 << 3) & 112) | 3072, 244);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(rVar, geoPointDTO, pVar, i14, 9);
        }
    }

    public static final void d(e23.a aVar, com.garmin.android.apps.connectmobile.live.activity.h hVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-554886345);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1323847186, new a51.g(aVar, 28), o0VarE);
            com.garmin.android.apps.connectmobile.live.activity.a.f38388a.getClass();
            z02.d.a(false, eVarC, null, null, null, com.garmin.android.apps.connectmobile.live.activity.a.f38389b, o0VarE, 196656, 29);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(aVar, hVar, i14, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    public static final void e(g21.r rVar, ArrayList arrayList, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(431900787);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(rVar == null ? -1 : rVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(arrayList) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(1168455376);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g21.r rVar2 = (g21.r) it.next();
                rVar2.getClass();
                x1 x1Var2 = p3.n.f135158a;
                arrayList2.add(new j0(y.Q(o0VarE, s.a(rVar2).f14352b), null, null, false, rVar2 == rVar, 14, null));
            }
            o0VarE.g0(false);
            x1 x1Var3 = p3.n.f135158a;
            i53.c cVarE = i53.a.e(arrayList2);
            i0 i0VarA = k0.a(0, 0, 3, o0VarE);
            f82.b bVar = new f82.b();
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(arrayList);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new f21.y(lVar, arrayList);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f21.y(lVar, arrayList);
                    o0VarE.K(objQ);
                }
            }
            e82.a.b(cVarE, bVar, i0VarA, null, null, (e23.p) objQ, o0VarE, 0, 24);
            boolean zR2 = o0VarE.r(arrayList) | ((i15 & 14) == 4) | o0VarE.B(i0VarA);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new z(arrayList, rVar, i0VarA, null);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new z(arrayList, rVar, i0VarA, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, rVar, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(rVar, arrayList, lVar, i14, 29);
        }
    }

    public static final void f(e23.a aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        o0 o0VarE = mVar.E(-2049608909);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, y.Q(o0VarE, R.string.rate_limit_dialog_title), y.Q(o0VarE, R.string.issue_report_limit_reached_message), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 1);
        }
    }

    public static final void g(e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(970226846);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c1.f110940a.a(false, null, y.Q(o0VarE, R.string.msg_pacepro_send_to_device_fail), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, null, o0VarE, ((i15 << 24) & 234881024) | 6, 0, 1754);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 19);
        }
    }

    public static final long h(float f14, float f15) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        g6.s.a aVar = g6.s.f76026b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final o82.g i(Uri uri) {
        if (zf.b.w(uri) == null) {
            return o82.g.f130850c;
        }
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        String str = (String) h0.e0(3, pathSegments);
        if (str == null) {
            return o82.g.f130850c;
        }
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return o82.g.f130850c;
                }
                break;
            case 49:
                if (str.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    return o82.g.f130851d;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return o82.g.f130853f;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return o82.g.f130856i;
                }
                break;
        }
        return o82.g.f130850c;
    }

    public static final Object j(Task task, v13.c cVar) throws Exception {
        if (!task.isComplete()) {
            o53.k kVar = new o53.k(u13.f.b(cVar), 1);
            kVar.q();
            task.addOnCompleteListener(a63.a.f1712a, new a63.b(kVar));
            Object objP = kVar.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            return objP;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final p1 k(a2.i iVar, p3.m mVar, int i14) {
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = p0.n(Boolean.FALSE);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        boolean z14 = (((i14 & 14) ^ 6) > 4 && mVar.B(iVar)) || (i14 & 6) == 4;
        Object objQ2 = mVar.q();
        if (z14 || objQ2 == c2565a) {
            objQ2 = new a2.d(iVar, p1Var, null);
            mVar.K(objQ2);
        }
        l0.e((e23.p) objQ2, iVar, mVar);
        return p1Var;
    }

    public static final String l(c80.u uVar, p3.m mVar) {
        String strQ;
        uVar.getClass();
        x1 x1Var = p3.n.f135158a;
        Integer num = uVar.f25614b;
        if (num == null) {
            mVar.C(1451058528);
            mVar.f();
            strQ = null;
        } else {
            mVar.C(1451058529);
            strQ = y.Q(mVar, num.intValue());
            mVar.f();
        }
        return strQ == null ? "" : strQ;
    }

    public static final String m(c80.u uVar, p3.m mVar) {
        String strQ;
        uVar.getClass();
        x1 x1Var = p3.n.f135158a;
        Integer num = uVar.f25615c;
        if (num == null) {
            mVar.C(1569870588);
            mVar.f();
            strQ = null;
        } else {
            mVar.C(1569870589);
            strQ = y.Q(mVar, num.intValue());
            mVar.f();
        }
        return strQ == null ? "" : strQ;
    }

    public static final float n(Resources resources, float f14) {
        resources.getClass();
        return TypedValue.applyDimension(1, f14, resources.getDisplayMetrics());
    }

    public static final String o(Context context, DateTime dateTime) {
        context.getClass();
        DateTime dateTimeNow = DateTime.now();
        long millis = dateTimeNow.getMillis() - dateTime.getMillis();
        long millis2 = c22.j0.R(dateTimeNow).getMillis();
        DateTime dateTimeWithZone = dateTime.withZone(DateTimeZone.getDefault());
        long millis3 = millis2 - c22.j0.R(dateTimeWithZone).getMillis();
        if (millis < 60000) {
            String string = context.getString(R.string.social_elapsed_time_just_now);
            string.getClass();
            return string;
        }
        if (millis < 3600000) {
            String string2 = context.getString(R.string.social_elapsed_time_minutes_abr_m, Long.valueOf(millis / 60000));
            string2.getClass();
            return string2;
        }
        if (millis < 86400000) {
            String string3 = context.getString(R.string.social_elapsed_time_hours_abr_h, Long.valueOf(millis / 3600000));
            string3.getClass();
            return string3;
        }
        if (millis3 < 172800000) {
            String string4 = context.getString(R.string.social_elapsed_time_yesterday);
            string4.getClass();
            return string4;
        }
        if (millis3 >= CoreConstants.MILLIS_IN_ONE_WEEK) {
            return c22.j0.n(dateTimeWithZone, 'M');
        }
        c22.j0.f23099a.getClass();
        return c22.j0.v(dateTime);
    }

    public static final String p(Context context, DateTime dateTime, DateTime dateTime2, boolean z14, boolean z15) {
        context.getClass();
        DateTime dateTimeNow = DateTime.now();
        long millis = dateTimeNow.getMillis() - dateTime.getMillis();
        DateTime dateTimeR = c22.j0.R(dateTimeNow);
        DateTime dateTimeWithZone = dateTime.withZone(DateTimeZone.getDefault());
        int iAbs = Math.abs(Days.daysBetween(new LocalDate(dateTimeR), new LocalDate(c22.j0.R(dateTimeWithZone))).getDays());
        if (millis < 60000) {
            String string = context.getString(R.string.social_elapsed_time_just_now);
            string.getClass();
            return string;
        }
        if (millis < 3600000) {
            long j8 = millis / 60000;
            if (!z15) {
                String string2 = context.getString(R.string.social_relative_date_time_minutes, Long.valueOf(j8));
                string2.getClass();
                return string2;
            }
            if (j8 == 1) {
                String string3 = context.getString(R.string.lbl_dash_sync_short_one_minute_ago);
                string3.getClass();
                return string3;
            }
            String string4 = context.getString(R.string.lbl_dash_sync_short_x_minutes_ago, String.valueOf(j8));
            string4.getClass();
            return string4;
        }
        if (millis < 86400000) {
            long j14 = millis / 3600000;
            if (!z15) {
                String string5 = context.getString(R.string.social_relative_date_time_hours, Long.valueOf(j14));
                string5.getClass();
                return string5;
            }
            if (j14 == 1) {
                String string6 = context.getString(R.string.lbl_dash_sync_short_one_hour_ago);
                string6.getClass();
                return string6;
            }
            String string7 = context.getString(R.string.lbl_dash_sync_short_x_hours_ago, String.valueOf(j14));
            string7.getClass();
            return string7;
        }
        if (iAbs < 2) {
            if (z15) {
                String string8 = context.getString(R.string.lbl_dash_sync_short_one_day_ago);
                string8.getClass();
                return string8;
            }
            String string9 = context.getString(R.string.social_relative_date_time_days, String.valueOf(iAbs));
            string9.getClass();
            return string9;
        }
        if (iAbs >= 7) {
            if (!z14) {
                dateTime2 = dateTimeWithZone;
            }
            return c22.j0.n(dateTime2, 'M');
        }
        String strValueOf = String.valueOf(iAbs);
        if (z15) {
            String string10 = context.getString(R.string.lbl_dash_sync_short_x_days_ago, strValueOf);
            string10.getClass();
            return string10;
        }
        String string11 = context.getString(R.string.social_relative_date_time_days, strValueOf);
        string11.getClass();
        return string11;
    }

    public static /* synthetic */ String q(Context context, DateTime dateTime, boolean z14, int i14) {
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        if ((i14 & 16) != 0) {
            z14 = false;
        }
        return p(context, dateTime, dateTimeNow, false, z14);
    }

    public static final n0 r(View view2) {
        view2.getClass();
        while (view2 != null) {
            Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
            n0 n0Var = tag instanceof n0 ? (n0) tag : null;
            if (n0Var != null) {
                return n0Var;
            }
            Object objA = gl1.d.A(view2);
            view2 = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final List s(fe feVar) {
        feVar.getClass();
        List list = f192720a;
        if (list != null) {
            return list;
        }
        u4.d dVarA = d0.a(feVar);
        u4.d dVarC = k72.g.f103301a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("DropletFill", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var = new t1(f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(10.8992f, 3.9221f);
            eVarL.d(11.8342f, 2.7547f, 12.5001f, 2.0f, 12.5001f, 2.0f);
            eVarL.d(12.5001f, 2.0f, 13.166f, 2.7547f, 14.101f, 3.9221f);
            eVarL.d(16.3038f, 6.6726f, 20.0001f, 11.7142f, 20.0001f, 14.575f);
            eVarL.d(20.0001f, 16.5442f, 19.2099f, 18.4328f, 17.8034f, 19.8253f);
            eVarL.d(16.3969f, 21.2177f, 14.4892f, 22.0f, 12.5001f, 22.0f);
            eVarL.d(10.511f, 22.0f, 8.6033f, 21.2177f, 7.1968f, 19.8253f);
            eVarL.d(5.7903f, 18.4328f, 5.0001f, 16.5442f, 5.0001f, 14.575f);
            eVarL.d(5.0001f, 11.7142f, 8.6964f, 6.6726f, 10.8992f, 3.9221f);
            eVarL.c();
            u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            k72.g.f103301a = dVarC;
        }
        u4.d dVarC2 = q.f103311a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("Humidity", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var2 = new t1(f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 13.3209f, 4.8474f);
            eVarK.d(15.9857f, 3.2485f, 19.2654f, 3.1502f, 22.0f, 4.5346f);
            eVarK.o(6.53f);
            eVarK.i(21.8688f, 6.4457f);
            eVarK.d(19.5459f, 4.9524f, 16.5769f, 4.9065f, 14.2089f, 6.3273f);
            eVarK.i(12.7095f, 7.227f);
            eVarK.d(9.7785f, 8.9855f, 6.1035f, 8.9287f, 3.2283f, 7.0804f);
            eVarK.i(2.0f, 6.2908f);
            eVarK.o(4.239f);
            eVarK.i(4.1616f, 5.6286f);
            eVarK.d(6.4845f, 7.1219f, 9.4536f, 7.1678f, 11.8215f, 5.747f);
            eVarK.i(13.3209f, 4.8474f);
            eVarK.c();
            u4.d.a.b(aVar4, eVarK.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var3 = new t1(f0.d(4278190080L), jVar);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(13.3209f, 9.9235f);
            eVarL2.d(14.1114f, 9.4492f, 14.956f, 9.1069f, 15.8244f, 8.8963f);
            eVarL2.d(15.2759f, 9.616f, 14.5892f, 10.5575f, 13.9347f, 11.5679f);
            eVarL2.i(12.7095f, 12.3031f);
            eVarL2.d(9.7785f, 14.0616f, 6.1035f, 14.0048f, 3.2283f, 12.1565f);
            eVarL2.i(2.0f, 11.3669f);
            eVarL2.o(9.3151f);
            eVarL2.i(4.1616f, 10.7047f);
            eVarL2.d(6.4845f, 12.198f, 9.4536f, 12.2439f, 11.8215f, 10.8231f);
            eVarL2.i(13.3209f, 9.9235f);
            eVarL2.c();
            u4.d.a.b(aVar4, eVarL2.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var4 = new t1(f0.d(4278190080L), jVar);
            u4.e eVarK2 = q2.k(2.0f, 14.3913f, 16.443f, 3.2283f, 17.2326f);
            eVarK2.d(5.7879f, 18.8781f, 8.9814f, 19.1038f, 11.7195f, 17.8927f);
            eVarK2.d(11.6784f, 17.6f, 11.6575f, 17.303f, 11.6575f, 17.0041f);
            eVarK2.d(11.6575f, 16.649f, 11.7135f, 16.2795f, 11.8063f, 15.9084f);
            eVarK2.d(9.4408f, 17.3199f, 6.4795f, 17.271f, 4.1616f, 15.7809f);
            eVarK2.i(2.0f, 14.3913f);
            eVarK2.c();
            u4.d.a.b(aVar4, eVarK2.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var5 = new t1(f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(17.864f, 9.5182f);
            eVarL3.d(17.7287f, 9.6794f, 17.5741f, 9.8661f, 17.4057f, 10.0737f);
            eVarL3.d(16.6992f, 10.9443f, 15.7629f, 12.1661f, 15.0066f, 13.387f);
            eVarL3.d(14.6284f, 13.9976f, 14.303f, 14.5955f, 14.074f, 15.1402f);
            eVarL3.d(13.8409f, 15.6944f, 13.728f, 16.1464f, 13.728f, 16.479f);
            eVarL3.d(13.728f, 17.5664f, 14.1704f, 18.6042f, 14.9493f, 19.3653f);
            eVarL3.d(15.7273f, 20.1255f, 16.7764f, 20.5474f, 17.864f, 20.5474f);
            eVarL3.d(18.9516f, 20.5474f, 20.0006f, 20.1255f, 20.7786f, 19.3653f);
            eVarL3.d(21.5576f, 18.6042f, 21.9999f, 17.5664f, 21.9999f, 16.479f);
            eVarL3.d(21.9999f, 16.1464f, 21.887f, 15.6944f, 21.654f, 15.1402f);
            eVarL3.d(21.4249f, 14.5955f, 21.0996f, 13.9976f, 20.7214f, 13.387f);
            eVarL3.d(19.9651f, 12.1661f, 19.0287f, 10.9443f, 18.3222f, 10.0737f);
            eVarL3.d(18.1539f, 9.8661f, 17.9992f, 9.6794f, 17.864f, 9.5182f);
            eVarL3.c();
            u4.d.a.b(aVar4, eVarL3.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            q.f103311a = dVarC2;
        }
        u4.d dVarC3 = k72.v.f103316a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("SeaLevel", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var6 = new t1(f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarK3 = b71.i.k(h1.f128863b, 6.0f, 9.5447f);
            eVarK3.d(7.0511f, 9.4488f, 8.073f, 9.1021f, 9.0f, 8.5268f);
            eVarK3.d(9.927f, 9.1021f, 10.9489f, 9.4488f, 12.0f, 9.5447f);
            eVarK3.d(13.0511f, 9.4488f, 14.073f, 9.1021f, 15.0f, 8.5268f);
            eVarK3.d(15.927f, 9.1021f, 16.9489f, 9.4488f, 18.0f, 9.5447f);
            eVarK3.d(18.9656f, 9.5451f, 19.9175f, 9.2834f, 20.7778f, 8.7813f);
            eVarK3.o(7.0f);
            eVarK3.d(20.7778f, 7.0f, 20.4444f, 8.2723f, 17.7778f, 8.2723f);
            eVarK3.d(16.6862f, 8.218f, 15.6369f, 7.773f, 14.7778f, 7.0f);
            eVarK3.d(13.9224f, 7.7808f, 12.8709f, 8.2268f, 11.7778f, 8.2723f);
            eVarK3.d(10.6846f, 8.2268f, 9.6331f, 7.7808f, 8.7778f, 7.0f);
            eVarK3.d(7.9186f, 7.773f, 6.8694f, 8.218f, 5.7778f, 8.2723f);
            eVarK3.d(3.3333f, 8.2723f, 3.0f, 7.1272f, 3.0f, 7.0f);
            eVarK3.o(8.7813f);
            eVarK3.d(3.9269f, 9.3242f, 4.9595f, 9.587f, 6.0f, 9.5447f);
            eVarK3.c();
            u4.d.a.b(aVar6, eVarK3.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var7 = new t1(f0.d(4278190080L), jVar);
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(6.0f, 13.3616f);
            eVarL4.d(7.0511f, 13.2658f, 8.073f, 12.919f, 9.0f, 12.3438f);
            eVarL4.d(9.927f, 12.919f, 10.9489f, 13.2658f, 12.0f, 13.3616f);
            eVarL4.d(13.0511f, 13.2658f, 14.073f, 12.919f, 15.0f, 12.3438f);
            eVarL4.d(15.927f, 12.919f, 16.9489f, 13.2658f, 18.0f, 13.3616f);
            eVarL4.d(18.9656f, 13.362f, 19.9175f, 13.1004f, 20.7778f, 12.5982f);
            eVarL4.o(10.817f);
            eVarL4.d(20.7778f, 10.817f, 20.4444f, 12.0893f, 17.7778f, 12.0893f);
            eVarL4.d(16.6862f, 12.035f, 15.6369f, 11.59f, 14.7778f, 10.817f);
            eVarL4.d(13.9224f, 11.5978f, 12.8709f, 12.0437f, 11.7778f, 12.0893f);
            eVarL4.d(10.6846f, 12.0437f, 9.6331f, 11.5978f, 8.7778f, 10.817f);
            eVarL4.d(7.9186f, 11.59f, 6.8694f, 12.035f, 5.7778f, 12.0893f);
            eVarL4.d(3.3333f, 12.0893f, 3.0f, 10.9442f, 3.0f, 10.817f);
            eVarL4.o(12.5982f);
            eVarL4.d(3.9269f, 13.1412f, 4.9595f, 13.4039f, 6.0f, 13.3616f);
            eVarL4.c();
            u4.d.a.b(aVar6, eVarL4.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var8 = new t1(f0.d(4278190080L), jVar);
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(6.0f, 17.1786f);
            eVarL5.d(7.0511f, 17.0827f, 8.073f, 16.736f, 9.0f, 16.1608f);
            eVarL5.d(9.927f, 16.736f, 10.9489f, 17.0827f, 12.0f, 17.1786f);
            eVarL5.d(13.0511f, 17.0827f, 14.073f, 16.736f, 15.0f, 16.1608f);
            eVarL5.d(15.927f, 16.736f, 16.9489f, 17.0827f, 18.0f, 17.1786f);
            eVarL5.d(19.0405f, 17.2209f, 20.0731f, 16.9582f, 21.0f, 16.4152f);
            eVarL5.o(14.634f);
            eVarL5.d(21.0f, 14.634f, 20.6667f, 15.9063f, 18.0f, 15.9063f);
            eVarL5.d(16.9084f, 15.852f, 15.8591f, 15.407f, 15.0f, 14.634f);
            eVarL5.d(14.1447f, 15.4147f, 13.0931f, 15.8607f, 12.0f, 15.9063f);
            eVarL5.d(10.9069f, 15.8607f, 9.8553f, 15.4147f, 9.0f, 14.634f);
            eVarL5.d(8.1409f, 15.407f, 7.0916f, 15.852f, 6.0f, 15.9063f);
            eVarL5.d(3.3333f, 15.9063f, 3.0f, 14.7612f, 3.0f, 14.634f);
            eVarL5.o(16.4152f);
            eVarL5.d(3.9269f, 16.9582f, 4.9595f, 17.2209f, 6.0f, 17.1786f);
            eVarL5.c();
            u4.d.a.b(aVar6, eVarL5.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            k72.v.f103316a = dVarC3;
        }
        u4.d dVarC4 = k72.f.f103299a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("Cold", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var9 = new t1(f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarE = u62.z.e(h1.f128863b, 11.0f, 22.0f, 17.85f);
            eVarE.i(7.75f, 21.05f);
            eVarE.i(6.35f, 19.65f);
            tn.k.r(eVarE, 11.0f, 15.0f, 13.0f, 9.0f);
            eVarE.i(4.35f, 17.65f);
            eVarE.i(2.95f, 16.25f);
            sn.a.A(eVarE, 6.15f, 13.0f, 2.0f, 11.0f);
            eVarE.g(6.15f);
            eVarE.i(2.95f, 7.75f);
            eVarE.i(4.35f, 6.35f);
            sn.a.A(eVarE, 9.0f, 11.0f, 11.0f, 9.0f);
            eVarE.i(6.35f, 4.35f);
            eVarE.i(7.75f, 2.95f);
            tn.k.r(eVarE, 11.0f, 6.15f, 2.0f, 13.0f);
            eVarE.o(6.15f);
            eVarE.i(16.25f, 2.95f);
            eVarE.i(17.65f, 4.35f);
            tn.k.r(eVarE, 13.0f, 9.0f, 11.0f, 15.0f);
            eVarE.i(19.65f, 6.35f);
            eVarE.i(21.05f, 7.75f);
            sn.a.A(eVarE, 17.85f, 11.0f, 22.0f, 13.0f);
            eVarE.g(17.85f);
            eVarE.i(21.05f, 16.25f);
            eVarE.i(19.65f, 17.65f);
            sn.a.A(eVarE, 15.0f, 13.0f, 13.0f, 15.0f);
            eVarE.i(17.65f, 19.65f);
            eVarE.i(16.25f, 21.05f);
            eVarE.i(13.0f, 17.85f);
            eVarE.o(22.0f);
            eVarE.g(11.0f);
            eVarE.c();
            u4.d.a.b(aVar8, eVarE.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            k72.f.f103299a = dVarC4;
        }
        u4.d dVar = dVarC4;
        u4.d dVarC5 = k72.h.f103302a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("DropletOutline", f18, f18, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var10 = new t1(f0.d(r3), null);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarL6 = com.nimbusds.jose.shaded.gson.internal.a.l(11.1982f, 3.5514f);
            eVarL6.d(11.973f, 2.5974f, 12.5001f, 2.0f, 12.5001f, 2.0f);
            eVarL6.d(12.5001f, 2.0f, 13.0272f, 2.5974f, 13.802f, 3.5514f);
            eVarL6.d(13.898f, 3.6696f, 13.9979f, 3.7934f, 14.101f, 3.9221f);
            eVarL6.d(16.3038f, 6.6726f, 20.0001f, 11.7142f, 20.0001f, 14.575f);
            eVarL6.d(20.0001f, 16.5442f, 19.2099f, 18.4328f, 17.8034f, 19.8253f);
            eVarL6.d(16.3969f, 21.2177f, 14.4892f, 22.0f, 12.5001f, 22.0f);
            eVarL6.d(10.511f, 22.0f, 8.6033f, 21.2177f, 7.1968f, 19.8253f);
            eVarL6.d(5.7903f, 18.4328f, 5.0001f, 16.5442f, 5.0001f, 14.575f);
            eVarL6.d(5.0001f, 11.7142f, 8.6964f, 6.6726f, 10.8992f, 3.9221f);
            eVarL6.d(11.0023f, 3.7934f, 11.1022f, 3.6696f, 11.1982f, 3.5514f);
            eVarL6.c();
            eVarL6.k(12.5001f, 5.1227f);
            eVarL6.d(12.4869f, 5.1392f, 12.4736f, 5.1557f, 12.4603f, 5.1724f);
            eVarL6.d(11.3818f, 6.519f, 9.966f, 8.3923f, 8.83f, 10.2505f);
            eVarL6.d(8.2617f, 11.18f, 7.7868f, 12.0679f, 7.4593f, 12.857f);
            eVarL6.d(7.1195f, 13.6758f, 7.0001f, 14.2434f, 7.0001f, 14.575f);
            eVarL6.d(7.0001f, 16.0073f, 7.5746f, 17.385f, 8.6039f, 18.404f);
            eVarL6.d(9.6338f, 19.4236f, 11.035f, 20.0f, 12.5001f, 20.0f);
            eVarL6.d(13.9652f, 20.0f, 15.3664f, 19.4236f, 16.3963f, 18.404f);
            eVarL6.d(17.4256f, 17.385f, 18.0001f, 16.0073f, 18.0001f, 14.575f);
            eVarL6.d(18.0001f, 14.2434f, 17.8807f, 13.6758f, 17.5409f, 12.857f);
            eVarL6.d(17.2134f, 12.0679f, 16.7385f, 11.18f, 16.1702f, 10.2505f);
            eVarL6.d(15.0342f, 8.3923f, 13.6184f, 6.519f, 12.5399f, 5.1724f);
            eVarL6.d(12.5266f, 5.1557f, 12.5133f, 5.1392f, 12.5001f, 5.1227f);
            eVarL6.c();
            u4.d.a.b(aVar10, eVarL6.f168407a, i15, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            k72.h.f103302a = dVarC5;
        }
        u4.d dVar2 = dVarC5;
        u4.d dVar3 = dVarC2;
        u4.d dVarA2 = k72.e0.a(feVar);
        u4.d dVarA3 = k72.k.a(feVar);
        u4.d dVarC6 = k72.l.f103306a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("GradeDescent", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var11 = new t1(f0.d(r3), null);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL7 = b71.i.l(h1.f128863b, 2.0f, 5.0025f, 20.4587f, 22.0168f);
            sn.a.v(eVarL7, 2.0f, 5.0025f);
            u4.d.a.b(aVar12, eVarL7.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var12 = new t1(f0.d(4278190080L), null);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(19.6528f, 6.8888f, 22.0f, 14.8176f);
            eVarM.i(13.7272f, 13.1077f);
            eVarM.i(16.0316f, 10.6892f);
            eVarM.i(8.3731f, 3.3988f);
            eVarM.i(9.6899f, 2.0168f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 17.3484f, 9.3072f, 19.6528f, 6.8888f);
            u4.d.a.b(aVar12, eVarM.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            k72.l.f103306a = dVarC6;
        }
        u4.d dVarA4 = k72.a.a(feVar);
        u4.d dVarA5 = k72.f0.a(feVar);
        u4.d dVarC7 = x.f103318a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("SnowColor", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var13 = new t1(f0.d(4279858898L), null);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            u4.e eVarL8 = b71.i.l(h1.f128863b, 21.2579f, 12.7684f, 16.6316f, 13.7632f);
            eVarL8.i(13.579f, 12.0f);
            eVarL8.i(16.6316f, 10.2368f);
            eVarL8.i(21.2579f, 11.2316f);
            eVarL8.i(21.5527f, 9.8f);
            eVarL8.i(18.5263f, 9.1474f);
            eVarL8.i(21.0527f, 7.6842f);
            eVarL8.i(20.2632f, 6.3158f);
            eVarL8.i(17.7316f, 7.779f);
            eVarL8.i(18.6842f, 4.8263f);
            eVarL8.i(17.2948f, 4.3632f);
            eVarL8.i(15.8421f, 8.8684f);
            eVarL8.i(12.7895f, 10.6316f);
            eVarL8.o(7.1053f);
            eVarL8.i(15.9684f, 3.5947f);
            eVarL8.i(14.8684f, 2.6263f);
            tn.k.r(eVarL8, 12.7895f, 4.9211f, 2.0f, 11.2105f);
            eVarL8.o(4.9211f);
            eVarL8.i(9.1316f, 2.6263f);
            eVarL8.i(8.0316f, 3.5947f);
            eVarL8.i(11.2105f, 7.1053f);
            eVarL8.o(10.6316f);
            eVarL8.i(8.1579f, 8.8684f);
            eVarL8.i(6.7053f, 4.3632f);
            eVarL8.i(5.3158f, 4.8263f);
            eVarL8.i(6.2632f, 7.779f);
            eVarL8.i(3.7369f, 6.3158f);
            eVarL8.i(2.9474f, 7.6842f);
            eVarL8.i(5.4737f, 9.1421f);
            eVarL8.i(2.4474f, 9.8f);
            eVarL8.i(2.7369f, 11.2316f);
            eVarL8.i(7.3684f, 10.2368f);
            eVarL8.i(10.4211f, 12.0f);
            eVarL8.i(7.3684f, 13.7632f);
            eVarL8.i(2.7369f, 12.7684f);
            eVarL8.i(2.4474f, 14.2f);
            eVarL8.i(5.4737f, 14.8579f);
            eVarL8.i(2.9474f, 16.3158f);
            eVarL8.i(3.7369f, 17.6842f);
            eVarL8.i(6.2632f, 16.2211f);
            eVarL8.i(5.3158f, 19.1737f);
            eVarL8.i(6.7053f, 19.6368f);
            eVarL8.i(8.1579f, 15.1316f);
            eVarL8.i(11.2105f, 13.3684f);
            eVarL8.o(16.8947f);
            eVarL8.i(8.0316f, 20.4053f);
            eVarL8.i(9.1316f, 21.3737f);
            tn.k.r(eVarL8, 11.2105f, 19.0789f, 22.0f, 12.7895f);
            eVarL8.o(19.0789f);
            eVarL8.i(14.8684f, 21.3737f);
            eVarL8.i(15.9684f, 20.4053f);
            eVarL8.i(12.7895f, 16.8947f);
            eVarL8.o(13.3684f);
            eVarL8.i(15.8421f, 15.1316f);
            eVarL8.i(17.2948f, 19.6368f);
            eVarL8.i(18.6842f, 19.1737f);
            eVarL8.i(17.7316f, 16.2211f);
            eVarL8.i(20.2632f, 17.6842f);
            eVarL8.i(21.0527f, 16.3158f);
            eVarL8.i(18.5263f, 14.8526f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL8, 21.5527f, 14.2f, 21.2579f, 12.7684f);
            u4.d.a.b(aVar14, eVarL8.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            x.f103318a = dVarC7;
        }
        u4.d dVar4 = dVarC7;
        u4.d dVarA6 = k72.m.a(feVar);
        feVar.getClass();
        u4.d dVarC8 = k72.z.f103320a;
        if (dVarC8 == null) {
            float f24 = (float) 24.0d;
            g6.f.a aVar15 = g6.f.f75994b;
            u4.d.a aVar16 = new u4.d.a("ThunderstormsColorDrk", f24, f24, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var14 = new t1(f0.d(4293767954L), null);
            o4.u1.f129010b.getClass();
            o4.v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarD = u62.z.d(14.9902f, 13.7139f, 12.3802f, 14.0802f, 11.3739f);
            tn.k.u(eVarD, 10.7802f, 8.5402f, 15.5939f, 11.7402f);
            eVarD.i(10.3233f, 19.4429f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarD, 14.9802f, 13.7239f, 14.9902f, 13.7139f);
            u4.d.a.b(aVar16, eVarD.f168407a, i16, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var15 = new t1(f0.d(4289111718L), null);
            u4.e eVarL9 = com.nimbusds.jose.shaded.gson.internal.a.l(20.6802f, 12.1238f);
            eVarL9.d(20.3502f, 11.7138f, 19.8702f, 11.4338f, 19.3402f, 11.3738f);
            eVarL9.g(19.3502f);
            eVarL9.d(19.3702f, 10.9538f, 19.2902f, 10.5438f, 19.1302f, 10.1638f);
            eVarL9.d(18.9702f, 9.7838f, 18.7302f, 9.4338f, 18.4302f, 9.1538f);
            eVarL9.d(18.1302f, 8.8738f, 17.7702f, 8.6638f, 17.3802f, 8.5338f);
            eVarL9.d(16.9902f, 8.4038f, 16.5802f, 8.3638f, 16.1702f, 8.4238f);
            eVarL9.d(15.7702f, 7.2638f, 15.0202f, 6.2438f, 14.0102f, 5.5438f);
            eVarL9.d(13.0102f, 4.8438f, 11.8102f, 4.5038f, 10.6002f, 4.5638f);
            eVarL9.d(9.3902f, 4.6338f, 8.2302f, 5.1038f, 7.3102f, 5.9038f);
            eVarL9.d(6.3902f, 6.7238f, 5.7502f, 7.8138f, 5.4802f, 9.0138f);
            eVarL9.d(4.6802f, 9.1738f, 3.9602f, 9.6138f, 3.4702f, 10.2738f);
            eVarL9.d(2.9802f, 10.9538f, 2.7402f, 11.7838f, 2.8102f, 12.6138f);
            eVarL9.d(2.8802f, 13.4438f, 3.2402f, 14.2138f, 3.8302f, 14.8038f);
            eVarL9.d(4.4202f, 15.3738f, 5.2102f, 15.7038f, 6.0302f, 15.7138f);
            tn.k.u(eVarL9, 7.3502f, 10.1902f, 10.3638f, 16.0602f);
            eVarL9.i(14.3602f, 12.7038f);
            tn.k.u(eVarL9, 17.0102f, 14.7402f, 15.7038f, 19.2002f);
            eVarL9.d(19.7302f, 15.6738f, 20.2302f, 15.4438f, 20.6002f, 15.0538f);
            eVarL9.d(20.9702f, 14.6638f, 21.1802f, 14.1438f, 21.2002f, 13.6038f);
            eVarL9.d(21.2202f, 13.0638f, 21.0402f, 12.5338f, 20.6902f, 12.1138f);
            eVarL9.i(20.6802f, 12.1238f);
            eVarL9.c();
            u4.d.a.b(aVar16, eVarL9.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC8 = aVar16.c();
            k72.z.f103320a = dVarC8;
        }
        u4.d dVar5 = dVarC3;
        u4.d dVar6 = dVarC6;
        List listK = p13.x.k(dVarA, dVarC, dVar3, dVar5, dVar, dVar2, dVarA2, dVarA3, dVar6, dVarA4, dVarA5, dVar4, dVarA6, dVarC8, k72.p.a(feVar), k72.o.a(feVar), b0.a(feVar), k72.c.a(feVar), k72.w.a(feVar), k72.d.a(feVar), k72.e.a(feVar), k72.n.a(feVar), k72.s.a(feVar), k72.b.a(feVar), a0.a(feVar), k72.c0.a(feVar), t.a(feVar), k72.i.a(feVar), k72.j.a(feVar), k72.u.a(feVar), k72.r.a(feVar), k72.y.a(feVar));
        f192720a = listK;
        listK.getClass();
        return listK;
    }

    public static final Intent t(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static final int u(long j8) {
        int i14 = (int) (4294967295L & j8);
        return j8 > 16777215 ? Color.argb((i14 >> 24) & 255, (i14 >> 16) & 255, (i14 >> 8) & 255, i14 & 255) : Color.rgb((i14 >> 16) & 255, (i14 >> 8) & 255, i14 & 255);
    }

    public static final Scope v() {
        Scope scopeOrNull = KoinJavaComponent.getKoin().getScopeOrNull("EpicActivityScopeId");
        return scopeOrNull == null ? Koin.createScope$default(KoinJavaComponent.getKoin(), "EpicActivityScopeId", QualifierKt.named("EpicActivityScope"), null, 4, null) : scopeOrNull;
    }

    public static final int[] w(Context context, List list) {
        context.getClass();
        list.getClass();
        j23.l lVarI = p13.x.i(list);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = lVarI.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(context.getColor(df0.b.a(((p13.p0) it).nextInt()))));
        }
        return h0.a1(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Entry x(Highlight highlight, Chart chart) {
        highlight.getClass();
        chart.getClass();
        Object data = chart.getData().getEntryForHighlight(highlight).getData();
        data.getClass();
        cf0.a aVar = (cf0.a) data;
        Entry entry = new Entry();
        String str = aVar.f27003a;
        String str2 = aVar.f27004b;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        Integer num2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        entry.setData(p13.x.k(new zz.l(e5.g(str, " - ", str2), String.valueOf(aVar.f27005c), aVar.f27007e, aVar.f27006d, str3, aVar.f27008f, null, num, 208, null), new zz.l(e5.g(str, " - ", str2), aVar.f27009g, aVar.f27010h, str3, str4, 0 == true ? 1 : 0, num, num2, 248, null), new zz.l(e5.g(str, " - ", str2), aVar.f27013k, aVar.f27014l, str4, objArr, num, num2, null, 248, null)));
        return entry;
    }

    public static final float y(Double d14, float f14) {
        fz.a.f73959a.getClass();
        double dG = fz.a.g((((double) f14) * 0.3d) - 15.0d);
        if (dG > (d14 != null ? d14.doubleValue() : 20.0d)) {
            dG = fz.a.g((d14 != null ? d14.doubleValue() : 20.0d) - 15.0d);
        }
        if (dG < 20.0d) {
            return 20.0f;
        }
        return (float) dG;
    }

    public static final Double z(b11.f fVar, String str) {
        fVar.getClass();
        if (p005kotlin.jvm.internal.s.g(str, b11.n.FIBER.f14351a)) {
            return fVar.f14270e;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.ADDED_SUGAR.f14351a)) {
            return fVar.f14272g;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.SATURATED_FAT.f14351a)) {
            return fVar.f14273h;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.IRON.f14351a)) {
            return fVar.f14284t;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.VITAMIN_A.f14351a)) {
            return fVar.f14280o;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.VITAMIN_D.f14351a)) {
            return fVar.f14282q;
        }
        if (p005kotlin.jvm.internal.s.g(str, b11.n.CALCIUM.f14351a)) {
            return fVar.f14283r;
        }
        return null;
    }
}
