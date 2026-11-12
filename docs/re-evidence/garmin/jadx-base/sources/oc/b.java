package oc;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.j;
import b11.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.gfdi.core.ProtocolTimeoutException;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import d53.w;
import d72.u;
import g22.k;
import gs1.f;
import i3.e5;
import j20.x;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentMap;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import l72.c1;
import o13.p;
import o13.r;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;
import o72.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.json.JSONObject;
import p005kotlin.jvm.internal.i0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.y;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p43.a2;
import p43.g2;
import p43.m1;
import p43.n0;
import q33.e0;
import q33.f0;
import r1.q2;
import s3.l;
import t23.d1;
import t23.e;
import t23.v;
import u62.z;
import v62.l2;
import v62.z7;
import vb.h;
import vc2.m;
import x33.d;
import x62.g;
import x62.o;
import x62.q;
import x62.s;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f131143a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ArrayList f131144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static List f131145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static List f131146d;

    public static final String A(String str) {
        str.getClass();
        return (w.J(str) || str.equals("en")) ? "" : "_".concat(str);
    }

    public static final void B(Menu menu, Context context) {
        String string;
        if (c22.b.e(context)) {
            int size = menu.size();
            for (int i14 = 0; i14 < size; i14++) {
                MenuItem item = menu.getItem(i14);
                if (item != null) {
                    CharSequence title = item.getTitle();
                    if (title == null || (string = title.toString()) == null) {
                        string = "";
                    }
                    item.setTitle(c22.c.b(string, context.getResources().getDimension(R.dimen.andfont_body_1), context, 1.5f));
                }
            }
        }
    }

    public static final void C(l lVar, p3.c cVar, int i14) {
        while (true) {
            int i15 = lVar.f156384v;
            if (i14 > i15 && i14 < lVar.f156383u) {
                return;
            }
            if (i15 == 0 && i14 == 0) {
                return;
            }
            lVar.O();
            if (lVar.y(lVar.f156384v)) {
                cVar.up();
            }
            lVar.j();
        }
    }

    public static final m D(nd2.b bVar) {
        bVar.getClass();
        int i14 = bVar.f125409a;
        int i15 = 0;
        if (200 > i14 || i14 >= 300) {
            return (i14 == 404 || i14 == 408 || (500 <= i14 && i14 < 600)) ? new m(4, null, 2, null) : new m(0, null, 2, null);
        }
        byte[] bArr = bVar.f125411c;
        bArr.getClass();
        JSONObject jSONObject = new JSONObject(new String(bArr, d53.c.f57666b));
        String strOptString = jSONObject.optString("Status");
        strOptString.getClass();
        Locale locale = Locale.US;
        String strF = x.f(locale, strOptString, locale);
        int iHashCode = strF.hashCode();
        if (iHashCode != -734239628) {
            if (iHashCode != 112785) {
                if (iHashCode == 98619139 && strF.equals("green")) {
                    i15 = 1;
                }
            } else if (strF.equals("red")) {
                i15 = 3;
            }
        } else if (strF.equals("yellow")) {
            i15 = 2;
        }
        String strOptString2 = jSONObject.optString("CardMessage");
        strOptString2.getClass();
        String strOptString3 = jSONObject.optString("BannerMessage");
        strOptString3.getClass();
        return new m(i15, new vc2.l(strOptString2, strOptString3, jSONObject.optBoolean("CardDismissible"), jSONObject.optBoolean("BannerDismissible")));
    }

    public static final b11.l E(i iVar, i53.c cVar, boolean z14, boolean z15) {
        Object obj;
        Object next;
        Object next2;
        iVar.getClass();
        cVar.getClass();
        Iterator<E> it = cVar.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((b11.l) next).f14331a != iVar.getF14318d());
        b11.l lVar = (b11.l) next;
        if (!z14) {
            if (lVar == null || lVar.f14332b.equals(b11.c.UNCATEGORIZED.f14250a)) {
                return null;
            }
            return lVar;
        }
        b11.l lVarL = zf.b.L(cVar, true, iVar.getF14317c(), null, z15);
        if (lVar != null && !lVar.f14332b.equals(b11.c.UNCATEGORIZED.f14250a)) {
            return lVar;
        }
        if (lVarL != null && !lVarL.f14332b.equals(b11.c.UNCATEGORIZED.f14250a)) {
            return lVarL;
        }
        Iterator<E> it3 = cVar.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!((b11.l) next2).f14332b.equals(b11.c.SNACKS.f14250a));
        b11.l lVar2 = (b11.l) next2;
        if (lVar2 != null) {
            return lVar2;
        }
        for (Object obj2 : cVar) {
            if (!((b11.l) obj2).f14332b.equals(b11.c.UNCATEGORIZED.f14250a)) {
                obj = obj2;
                break;
            }
        }
        return (b11.l) obj;
    }

    public static final p F(int i14, List list) {
        if (!z(i14, list)) {
            while (!z(i14, list) && (i14 = i14 - 1) >= 0) {
            }
        }
        int i15 = i14 + 1;
        while (!z(i15, list) && (i15 = i15 + 1) < list.size()) {
        }
        return new p(Integer.valueOf(i14), Integer.valueOf(i15 - 1));
    }

    public static final void G(MenuItem menuItem, Context context, int i14) {
        Drawable icon;
        Drawable drawableMutate;
        context.getClass();
        if (menuItem == null || (icon = menuItem.getIcon()) == null || (drawableMutate = icon.mutate()) == null) {
            return;
        }
        drawableMutate.setColorFilter(c7.a.a(a7.b.getColor(context, i14), c7.b.SRC_ATOP));
    }

    public static final void H(View view2, boolean z14) {
        view2.getClass();
        view2.setVisibility(z14 ? 0 : 8);
    }

    public static final String I(e0 e0Var, e eVar, String str) {
        String strO;
        e0Var.getClass();
        eVar.getClass();
        str.getClass();
        s23.c cVar = s23.c.f156232a;
        d dVar = f43.e.g(eVar).f188596a;
        cVar.getClass();
        x33.b bVarF = s23.c.f(dVar);
        if (bVarF != null) {
            strO = g43.c.f(bVarF);
            strO.getClass();
        } else {
            strO = t.o(eVar, f0.f142465a);
        }
        return e0.e(strO, str);
    }

    public static final n0 J(d1 d1Var) {
        d1Var.getClass();
        t23.l lVarD = d1Var.d();
        lVarD.getClass();
        if (lVarD instanceof t23.i) {
            List<d1> parameters = ((t23.i) lVarD).h().getParameters();
            parameters.getClass();
            ArrayList arrayList = new ArrayList(y.r(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                m1 m1VarH = ((d1) it.next()).h();
                m1VarH.getClass();
                arrayList.add(m1VarH);
            }
            List<n0> upperBounds = d1Var.getUpperBounds();
            upperBounds.getClass();
            p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE = f43.e.e(d1Var);
            n0 n0VarJ = a2.e(new p43.d1(arrayList)).j(g2.OUT_VARIANCE, (n0) h0.b0(upperBounds));
            return n0VarJ == null ? dVarE.n() : n0VarJ;
        }
        if (!(lVarD instanceof v)) {
            h.s("Unsupported descriptor type to build star projection type based on type parameters of it");
            return null;
        }
        List<d1> typeParameters = ((v) lVarD).getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList2 = new ArrayList(y.r(typeParameters, 10));
        Iterator<T> it3 = typeParameters.iterator();
        while (it3.hasNext()) {
            m1 m1VarH2 = ((d1) it3.next()).h();
            m1VarH2.getClass();
            arrayList2.add(m1VarH2);
        }
        List<n0> upperBounds2 = d1Var.getUpperBounds();
        upperBounds2.getClass();
        p005kotlin.reflect.jvm.internal.impl.builtins.d dVarE2 = f43.e.e(d1Var);
        n0 n0VarJ2 = a2.e(new p43.d1(arrayList2)).j(g2.OUT_VARIANCE, (n0) h0.b0(upperBounds2));
        return n0VarJ2 == null ? dVarE2.n() : n0VarJ2;
    }

    public static final void K(Activity activity, qy2.d dVar, Intent intent) {
        activity.getClass();
        dVar.getClass();
        Intent intent2 = activity.getIntent();
        intent2.getClass();
        h(intent2, intent);
        activity.startActivity(intent);
    }

    public static final void L(Activity activity, qy2.d dVar, Intent intent, f.c cVar) {
        activity.getClass();
        dVar.getClass();
        cVar.getClass();
        Intent intent2 = activity.getIntent();
        intent2.getClass();
        h(intent2, intent);
        cVar.a(intent, null);
    }

    public static final String M(sc2.l lVar) {
        lVar.getClass();
        String str = lVar.f158524a;
        String str2 = lVar.f158525b;
        if (str2 == null) {
            str2 = "";
        }
        byte[] bytes = e5.g(str, ":", str2).getBytes(d53.c.f57668d);
        bytes.getClass();
        return fb1.c.n("Basic ", Base64.encodeToString(bytes, 2));
    }

    public static final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1289723929);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            t11.c.f161716a.getClass();
            h82.e.a(t11.c.f161717b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 25);
        }
    }

    public static final void b(boolean z14, e23.p pVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1818896922);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(pVar) ? 32 : 16);
        if ((i15 & 19) == 18 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            c.w.b(z14, pVar, o0VarE, i15 & 126);
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(z14, pVar, i14);
        }
    }

    public static final void c(e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -1936020909);
        int i15 = i14 | (o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(aVar2) ? 32 : 16);
        if (o0VarP.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1.f110940a.a(false, gl1.y.Q(o0VarP, R.string.lbl_stp_reset_plan_dialog_title), gl1.y.Q(o0VarP, R.string.lbl_stp_reset_plan_dialog_message), null, null, gl1.y.Q(o0VarP, R.string.lbl_reset), false, false, aVar, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, (i15 << 24) & 234881024, (i15 >> 3) & 14, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 8);
        }
    }

    public static byte[] d(String str) throws UnsupportedEncodingException {
        int i14;
        byte[] bArr;
        byte b14;
        int i15;
        byte b15;
        int i16;
        byte b16;
        int i17;
        byte b17;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int i18 = 0;
        loop0: while (i18 < length) {
            while (true) {
                i14 = i18 + 1;
                byte b18 = bytes[i18];
                bArr = f131143a;
                b14 = bArr[b18];
                if (i14 >= length || b14 != -1) {
                    break;
                }
                i18 = i14;
            }
            if (b14 == -1) {
                break;
            }
            while (true) {
                i15 = i14 + 1;
                b15 = bArr[bytes[i14]];
                if (i15 >= length || b15 != -1) {
                    break;
                }
                i14 = i15;
            }
            if (b15 == -1) {
                break;
            }
            stringBuffer.append((char) ((b14 << 2) | ((b15 & 48) >>> 4)));
            while (true) {
                i16 = i15 + 1;
                byte b19 = bytes[i15];
                if (b19 == 61) {
                    break loop0;
                }
                b16 = bArr[b19];
                if (i16 >= length || b16 != -1) {
                    break;
                }
                i15 = i16;
            }
            if (b16 == -1) {
                break;
            }
            stringBuffer.append((char) (((b15 & Ascii.SI) << 4) | ((b16 & 60) >>> 2)));
            while (true) {
                i17 = i16 + 1;
                byte b24 = bytes[i16];
                if (b24 == 61) {
                    break loop0;
                }
                b17 = bArr[b24];
                if (i17 >= length || b17 != -1) {
                    break;
                }
                i16 = i17;
            }
            if (b17 == -1) {
                break;
            }
            stringBuffer.append((char) (b17 | ((b16 & 3) << 6)));
            i18 = i17;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }

    public static final ArrayList e(ArrayList arrayList, boolean z14) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i14 = 0;
        if (!z(0, arrayList2) && arrayList2.size() >= 2) {
            rq.a aVar = (rq.a) h0.b0(arrayList2);
            arrayList2.set(0, arrayList2.get(1));
            arrayList2.set(1, aVar);
        }
        if (!z14) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                if (z(i14, arrayList2) && (z(i15, arrayList2) || i14 == arrayList2.size() - 1)) {
                    arrayList3.add(obj);
                }
                i14 = i15;
            }
            if (!arrayList3.isEmpty()) {
                arrayList2.removeAll(arrayList3);
            }
        }
        return arrayList2;
    }

    public static final s3.b f(p3.b bVar) {
        s3.b bVar2 = bVar instanceof s3.b ? (s3.b) bVar : null;
        if (bVar2 != null) {
            return bVar2;
        }
        n.b("Inconsistent composition");
        o2.c.f();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    public static final int g(HttpURLConnection httpURLConnection) throws RateLimitException, IOException {
        Integer numValueOf;
        int iB;
        httpURLConnection.getClass();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 429 || (500 <= responseCode && responseCode < 600)) {
            Long lValueOf = null;
            if (responseCode != 429) {
                numValueOf = null;
            } else {
                int headerFieldInt = httpURLConnection.getHeaderFieldInt(HttpHeaders.RETRY_AFTER, -1);
                if (headerFieldInt != -1) {
                    numValueOf = Integer.valueOf(headerFieldInt);
                } else {
                    int headerFieldInt2 = httpURLConnection.getHeaderFieldInt(com.mapbox.common.HttpHeaders.RETRY_AFTER, -1);
                    if (headerFieldInt2 != -1) {
                        numValueOf = Integer.valueOf(headerFieldInt2);
                    } else {
                        numValueOf = null;
                    }
                }
            }
            uc2.a aVar = uc2.a.f169996a;
            URL url = httpURLConnection.getURL();
            url.getClass();
            synchronized (aVar) {
                try {
                    uc2.c cVarC = uc2.a.c(url);
                    if (cVarC != null) {
                        o13.t tVar = uc2.a.f169998c;
                        if (!((ConcurrentMap) tVar.getValue()).containsKey(cVarC)) {
                            iB = numValueOf != null ? numValueOf.intValue() : uc2.a.b(null);
                        } else if (numValueOf != null) {
                            iB = numValueOf.intValue();
                        } else {
                            Object obj = ((ConcurrentMap) tVar.getValue()).get(cVarC);
                            obj.getClass();
                            iB = uc2.a.b(Integer.valueOf(((uc2.b) obj).f170003c));
                        }
                        int i14 = iB;
                        Calendar calendarC = nd2.c.c();
                        calendarC.add(13, i14);
                        long timeInMillis = calendarC.getTimeInMillis();
                        ConcurrentMap concurrentMap = (ConcurrentMap) tVar.getValue();
                        uc2.b bVar = new uc2.b(responseCode, nd2.c.c().getTimeInMillis(), i14, timeInMillis);
                        uc2.a.a().warn("rate limit in effect for group " + cVarC.name() + " due to " + bVar.f170001a + " -> retryAfterSeconds[" + bVar.f170003c + "], retryAfterTimestampUTC[" + ((SimpleDateFormat) uc2.a.f170000e.getValue()).format(Long.valueOf(bVar.f170004d)) + "]");
                        concurrentMap.put(cVarC, bVar);
                        lValueOf = Long.valueOf(timeInMillis);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (lValueOf != null) {
                String string = httpURLConnection.getURL().toString();
                string.getClass();
                throw new RateLimitException(responseCode, string, nd2.c.g(httpURLConnection), lValueOf.longValue());
            }
        } else {
            uc2.a aVar2 = uc2.a.f169996a;
            URL url2 = httpURLConnection.getURL();
            url2.getClass();
            aVar2.getClass();
            ConcurrentMap concurrentMap2 = (ConcurrentMap) uc2.a.f169998c.getValue();
            uc2.c cVarC2 = uc2.a.c(url2);
            if (cVarC2 != null && ((uc2.b) concurrentMap2.remove(cVarC2)) != null) {
                com.airbnb.lottie.animation.keyframe.a.w("disabled rateLimitGroup [", cVarC2.name(), uc2.a.a());
                return responseCode;
            }
        }
        return responseCode;
    }

    public static final Intent h(Intent intent, Intent intent2) {
        if (((qy2.b) intent.getParcelableExtra("extra.synthesize.ui_review_config")) != null) {
            ComponentName component = intent2.getComponent();
            if (component != null) {
                try {
                    Class<?> cls = Class.forName(component.getClassName());
                    t0 t0Var = s0.f105811a;
                    k23.d dVarB = t0Var.b(cls);
                    k23.d dVarB2 = t0Var.b(sy2.e.class);
                    if (dVarB.equals(dVarB2) || z43.b.d(p13.w.c(dVarB), new l23.c(new i0() { // from class: l23.e
                        @Override // p005kotlin.jvm.internal.i0, k23.n
                        public final Object get(Object obj) {
                            k23.d dVar = (k23.d) obj;
                            dVar.getClass();
                            List<k23.p> listB = dVar.b();
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = listB.iterator();
                            while (it.hasNext()) {
                                k23.e f105782a = ((k23.p) it.next()).getF105782a();
                                k23.d dVar2 = f105782a instanceof k23.d ? (k23.d) f105782a : null;
                                if (dVar2 != null) {
                                    arrayList.add(dVar2);
                                }
                            }
                            return arrayList;
                        }
                    }), new l23.d(dVarB2)).booleanValue()) {
                        qy2.a.a(qy2.a.f148592a, intent2, 3);
                        return intent2;
                    }
                } catch (Throwable unused) {
                }
            }
            qy2.c.f148593a.getClass();
            qy2.c.a(intent2);
        }
        return intent2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    public static final ArrayList i(List list) {
        boolean z14;
        boolean z15;
        Object next;
        Integer numValueOf;
        ArrayList arrayListL = j.l(list);
        Iterator it = list.iterator();
        while (true) {
            Integer numValueOf2 = null;
            boolean z16 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            ir0.b bVar = (ir0.b) next2;
            boolean zD = bVar.d();
            ActivityListItemDTO activityListItemDTO = bVar.f94783b;
            f fVar = bVar.f94782a;
            if (zD) {
                if (fVar != null) {
                    numValueOf = fVar.getModerateIntensityMinutes();
                } else {
                    numValueOf = null;
                }
            } else if (activityListItemDTO != null) {
                numValueOf = Integer.valueOf(activityListItemDTO.W1);
            } else {
                numValueOf = null;
            }
            if ((numValueOf != null ? numValueOf.intValue() : -1) >= 0) {
                if (bVar.d()) {
                    if (fVar != null) {
                        numValueOf2 = fVar.getVigorousIntensityMinutes();
                    }
                } else if (activityListItemDTO != null) {
                    numValueOf2 = Integer.valueOf(activityListItemDTO.X1);
                }
                if ((numValueOf2 != null ? numValueOf2.intValue() : -1) >= 0) {
                    z16 = true;
                }
            }
            if (z16) {
                arrayListL.add(next2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            if (!((ir0.b) obj).d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ActivityListItemDTO activityListItemDTO2 = ((ir0.b) it3.next()).f94783b;
            if (activityListItemDTO2 != null) {
                arrayList2.add(activityListItemDTO2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayListL) {
            f fVar2 = ((ir0.b) obj2).f94782a;
            if (fVar2 != null) {
                LocalDateTime localDateTimeK = fVar2.k();
                LocalDateTime localDateTimeH = fVar2.h();
                if (localDateTimeK == null || localDateTimeH == null) {
                    z15 = false;
                } else {
                    Iterator it4 = arrayList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        ActivityListItemDTO activityListItemDTO3 = (ActivityListItemDTO) next;
                        DateTime dateTimeQ = k.q(activityListItemDTO3.f29259e, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
                        if (dateTimeQ != null) {
                            if (localDateTimeK.getMillisOfDay() < dateTimeQ.plusSeconds((int) activityListItemDTO3.f29275k).getMillisOfDay() && localDateTimeH.getMillisOfDay() > dateTimeQ.getMillisOfDay()) {
                                break;
                            }
                        }
                    }
                    if (((ActivityListItemDTO) next) != null) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (z15) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = true;
            }
            if (z14) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object j(gx2.a aVar, v13.c cVar) throws UnexpectedResponseCodeException {
        tx2.b bVar;
        if (cVar instanceof tx2.b) {
            bVar = (tx2.b) cVar;
            int i14 = bVar.f166849b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f166849b = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new tx2.b(cVar);
            }
        } else {
            bVar = new tx2.b(cVar);
        }
        tx2.b bVar2 = bVar;
        Object objA = bVar2.f166848a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f166849b;
        if (i15 == 0) {
            r.b(objA);
            bVar2.f166849b = 1;
            objA = sx2.b.a(FirebasePerformance.HttpMethod.GET, "/account/v1/account", aVar, null, null, null, null, null, bVar2);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objA);
        }
        qx2.c cVar2 = (qx2.c) objA;
        int i16 = cVar2.f148454c;
        String str = cVar2.f148456e;
        if (i16 == 200) {
            sx2.b.c().debug(t.u(cVar2));
            return new mx2.b(str);
        }
        sx2.b.c().error(cVar2.toString());
        throw new UnexpectedResponseCodeException(cVar2.f148454c, str, null, 4, null);
    }

    public static final List k(l2 l2Var) {
        l2Var.getClass();
        List list = f131145c;
        if (list != null) {
            return list;
        }
        u4.d dVarC = x62.l.f189300a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("Rotate", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(13.7627f, 1.998f);
            eVarL.d(13.8918f, 1.9981f, 13.998f, 2.1084f, 13.998f, 2.2422f);
            z.y(eVarL, 20.502f, 20.498f, 11.502f, 15.998f);
            eVarL.o(10.002f);
            eVarL.g(21.7578f);
            eVarL.d(21.8916f, 10.002f, 22.0018f, 10.1082f, 22.002f, 10.2373f);
            eVarL.o(21.7666f);
            eVarL.d(22.0018f, 21.8957f, 21.8916f, 22.002f, 21.7578f, 22.002f);
            eVarL.g(2.2334f);
            eVarL.d(2.1649f, 22.0019f, 2.1037f, 21.97f, 2.0605f, 21.9209f);
            eVarL.d(2.0224f, 21.8793f, 1.9981f, 21.8259f, 1.998f, 21.7666f);
            eVarL.o(2.2422f);
            eVarL.d(1.998f, 2.1084f, 2.1043f, 1.9981f, 2.2334f, 1.998f);
            v.e0.A(eVarL, 13.7627f, 3.498f, 20.502f, 12.498f);
            z.v(eVarL, 3.502f, 3.498f, 20.502f);
            u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var2 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarJ = tn.k.j(16.998f, 3.7295f, 17.498f);
            eVarJ.d(18.8787f, 3.7295f, 19.9979f, 4.8489f, 19.998f, 6.2295f);
            sn.a.B(eVarJ, 6.7236f, 20.998f, 19.498f, 8.7236f);
            sn.a.A(eVarJ, 17.998f, 6.7236f, 18.998f, 6.2295f);
            eVarJ.d(18.9979f, 5.4012f, 18.3264f, 4.7295f, 17.498f, 4.7295f);
            tn.k.t(eVarJ, 16.998f, 5.7295f, 14.998f, 4.2285f);
            sn.a.w(eVarJ, 16.998f, 2.7295f, 3.7295f);
            u4.d.a.b(aVar2, eVarJ.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            x62.l.f189300a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarA = x62.b.a(l2Var);
        u4.d dVarC2 = x62.m.f189301a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("SendToEdge", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var3 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 16.9395f, 2.0f);
            eVarK.d(17.0695f, 2.0001f, 17.195f, 2.0507f, 17.2881f, 2.1416f);
            eVarK.d(17.6578f, 2.5027f, 18.6375f, 3.4634f, 19.1152f, 3.9639f);
            eVarK.d(19.2015f, 4.0544f, 19.248f, 4.1747f, 19.248f, 4.2998f);
            eVarK.o(19.6875f);
            eVarK.d(19.248f, 19.8199f, 19.1951f, 19.9473f, 19.1016f, 20.041f);
            eVarK.i(17.2891f, 21.8535f);
            eVarK.d(17.1954f, 21.9472f, 17.068f, 21.9999f, 16.9355f, 22.0f);
            eVarK.g(8.9815f);
            eVarK.d(8.849f, 22.0f, 8.7217f, 21.9471f, 8.6279f, 21.8535f);
            eVarK.i(6.8154f, 20.041f);
            eVarK.d(6.7217f, 19.9473f, 6.669f, 19.8201f, 6.669f, 19.6875f);
            z.y(eVarK, 17.5439f, 8.7744f, 19.8945f, 17.1426f);
            z.y(eVarK, 4.1055f, 8.7744f, 11.9688f, 6.669f);
            eVarK.o(8.8428f);
            eVarK.g(6.1162f);
            eVarK.d(5.8402f, 8.8428f, 5.6165f, 8.6187f, 5.6162f, 8.3428f);
            eVarK.o(6.1846f);
            eVarK.d(5.6162f, 5.9084f, 5.8401f, 5.6846f, 6.1162f, 5.6846f);
            eVarK.g(6.669f);
            eVarK.o(4.3125f);
            eVarK.d(6.669f, 4.1799f, 6.7217f, 4.0528f, 6.8154f, 3.959f);
            eVarK.i(8.6279f, 2.1465f);
            eVarK.d(8.7217f, 2.0529f, 8.849f, 2.0f, 8.9815f, 2.0f);
            eVarK.g(16.9395f);
            eVarK.c();
            u4.d.a.b(aVar4, eVarK.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var4 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarK2 = tn.k.k(15.3799f, 14.9102f, 11.7402f, 18.1699f, 15.8398f);
            q2.x(eVarK2, 4.0f, 13.6602f, 11.7402f, 11.3398f);
            eVarK2.i(15.3799f, 14.9102f);
            eVarK2.c();
            u4.d.a.b(aVar4, eVarK2.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            x62.m.f189301a = dVarC2;
        }
        u4.d dVar2 = dVarC2;
        u4.d dVarA2 = x62.n.a(l2Var);
        u4.d dVarC3 = x62.c.f189291a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("ConnectivitySquare", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var5 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarJ2 = tn.k.j(12.8664f, 5.889f, 11.8442f);
            eVarJ2.d(11.6219f, 4.8891f, 11.422f, 3.1558f, 11.2997f, 2.5558f);
            eVarJ2.g(4.9444f);
            eVarJ2.d(4.8221f, 3.1558f, 4.611f, 4.8891f, 4.3833f, 5.889f);
            eVarJ2.g(3.3555f);
            eVarJ2.d(2.6055f, 5.889f, 2.0f, 6.5001f, 2.0f, 7.2501f);
            eVarJ2.o(16.7554f);
            eVarJ2.d(2.0f, 17.4998f, 2.6055f, 18.1109f, 3.3555f, 18.1109f);
            eVarJ2.g(4.3777f);
            eVarJ2.d(4.6055f, 19.1109f, 4.8166f, 20.8442f, 4.9388f, 21.4441f);
            eVarJ2.g(11.2942f);
            eVarJ2.d(11.4164f, 20.8442f, 11.6164f, 19.1109f, 11.8386f, 18.1109f);
            eVarJ2.g(12.8608f);
            eVarJ2.d(13.6108f, 18.1109f, 14.2163f, 17.4998f, 14.2163f, 16.7498f);
            eVarJ2.o(7.2501f);
            eVarJ2.d(14.2219f, 6.5001f, 13.6163f, 5.889f, 12.8664f, 5.889f);
            eVarJ2.c();
            eVarJ2.k(12.5553f, 15.7943f);
            eVarJ2.d(12.5553f, 16.1498f, 12.2664f, 16.4443f, 11.9053f, 16.4443f);
            eVarJ2.g(4.3166f);
            eVarJ2.d(3.9555f, 16.4443f, 3.6666f, 16.1554f, 3.6666f, 15.7943f);
            eVarJ2.o(8.2056f);
            eVarJ2.d(3.6666f, 7.8445f, 3.9555f, 7.5556f, 4.3166f, 7.5556f);
            eVarJ2.g(11.9053f);
            eVarJ2.d(12.2608f, 7.5556f, 12.5553f, 7.8445f, 12.5553f, 8.2056f);
            b71.i.z(eVarJ2, 15.7943f, 21.9772f, 11.4833f);
            eVarJ2.d(21.7939f, 8.7112f, 20.5106f, 6.2112f, 18.3662f, 4.4391f);
            eVarJ2.i(17.6107f, 5.3557f);
            eVarJ2.d(19.4995f, 6.9168f, 20.6328f, 9.1223f, 20.7939f, 11.5611f);
            eVarJ2.d(20.955f, 13.9944f, 20.1217f, 16.3054f, 18.4718f, 18.1109f);
            eVarJ2.i(19.344f, 18.9164f);
            eVarJ2.d(19.4051f, 18.8498f, 19.4717f, 18.7776f, 19.5273f, 18.7109f);
            eVarJ2.d(21.2883f, 16.7054f, 22.155f, 14.1499f, 21.9772f, 11.4833f);
            eVarJ2.c();
            eVarJ2.k(19.1551f, 11.6722f);
            eVarJ2.d(19.0273f, 9.7167f, 18.1162f, 7.9445f, 16.5996f, 6.6946f);
            eVarJ2.i(15.8441f, 7.6112f);
            eVarJ2.d(17.1107f, 8.6556f, 17.8662f, 10.1222f, 17.9718f, 11.75f);
            eVarJ2.d(18.0773f, 13.3721f, 17.5218f, 14.9221f, 16.4163f, 16.1221f);
            eVarJ2.i(17.2885f, 16.9276f);
            eVarJ2.d(17.3329f, 16.8776f, 17.3773f, 16.8276f, 17.4218f, 16.7776f);
            eVarJ2.d(18.6606f, 15.3665f, 19.2773f, 13.5555f, 19.1551f, 11.6722f);
            eVarJ2.c();
            u4.d.a.b(aVar6, eVarJ2.f168407a, i15, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            x62.c.f189291a = dVarC3;
        }
        u4.d dVarC4 = x62.e.f189293a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("DisplayOn", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var6 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(7.9316f, 12.4285f);
            eVarL2.d(7.9316f, 10.1012f, 9.8185f, 8.2142f, 12.1458f, 8.2142f);
            eVarL2.d(14.4732f, 8.2142f, 16.3601f, 10.1012f, 16.3601f, 12.4285f);
            eVarL2.d(16.3601f, 14.7558f, 14.4732f, 16.6428f, 12.1458f, 16.6428f);
            eVarL2.d(9.8185f, 16.6428f, 7.9316f, 14.7558f, 7.9316f, 12.4285f);
            eVarL2.c();
            u4.d.a.b(aVar8, eVarL2.f168407a, i16, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var7 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarJ3 = sn.a.j(15.1798f, 7.0964f, 14.8346f, 4.0f, 9.457f);
            eVarJ3.i(9.1122f, 7.0962f);
            eVarJ3.d(7.2535f, 8.1503f, 6.0f, 10.1433f, 6.0f, 12.4285f);
            eVarJ3.d(6.0f, 14.7137f, 7.2535f, 16.7067f, 9.1122f, 17.7609f);
            eVarJ3.i(9.457f, 20.857f);
            eVarJ3.g(14.8346f);
            eVarJ3.i(15.1798f, 17.7606f);
            eVarJ3.d(17.0383f, 16.7064f, 18.2916f, 14.7136f, 18.2916f, 12.4285f);
            eVarJ3.d(18.2916f, 10.1435f, 17.0383f, 8.1506f, 15.1798f, 7.0964f);
            eVarJ3.c();
            eVarJ3.k(7.1523f, 12.4285f);
            eVarJ3.d(7.1523f, 9.6778f, 9.3879f, 7.448f, 12.1458f, 7.448f);
            eVarJ3.d(14.9037f, 7.448f, 17.1393f, 9.6778f, 17.1393f, 12.4285f);
            eVarJ3.d(17.1393f, 15.1793f, 14.9037f, 17.409f, 12.1458f, 17.409f);
            eVarJ3.d(9.3879f, 17.409f, 7.1523f, 15.1793f, 7.1523f, 12.4285f);
            eVarJ3.c();
            u4.d.a.b(aVar8, eVarJ3.f168407a, i16, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var8 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = z.l(22.0f, 12.5f, 19.0f, 11.5f, 22.0f);
            eVarL3.o(12.5f);
            eVarL3.c();
            u4.d.a.b(aVar8, eVarL3.f168407a, i16, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var9 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(20.6603f, 17.5f, 18.0622f, 16.0f);
            eVarM.i(18.5622f, 15.134f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 21.1603f, 16.634f, 20.6603f, 17.5f);
            u4.d.a.b(aVar8, eVarM.f168407a, i16, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var10 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL4 = z.l(5.0f, 12.5f, 2.0f, 11.5f, 5.0f);
            b71.i.z(eVarL4, 12.5f, 5.9378f, 16.0f);
            eVarL4.i(3.3398f, 17.5f);
            eVarL4.i(2.8398f, 16.634f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 5.4378f, 15.134f, 5.9378f, 16.0f);
            u4.d.a.b(aVar8, eVarL4.f168407a, i16, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var11 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(5.7745f, 9.0f, 3.1765f, 7.5f);
            eVarM2.i(3.6765f, 6.634f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 6.2745f, 8.134f, 5.7745f, 9.0f);
            u4.d.a.b(aVar8, eVarM2.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var12 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM3 = com.nimbusds.jose.shaded.gson.internal.a.m(20.6603f, 7.5f, 18.0622f, 9.0f);
            eVarM3.i(17.5622f, 8.134f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM3, 20.1603f, 6.634f, 20.6603f, 7.5f);
            u4.d.a.b(aVar8, eVarM3.f168407a, i16, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            x62.e.f189293a = dVarC4;
        }
        u4.d dVar3 = dVarC4;
        u4.d dVarC5 = x62.d.f189292a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("DeviceCompatible", f18, f18, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var13 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK3 = b71.i.k(h1.f128863b, 15.3242f, 2.0f);
            eVarK3.d(15.4543f, 2.0001f, 15.5798f, 2.0507f, 15.6729f, 2.1416f);
            eVarK3.d(16.0425f, 2.5027f, 17.0223f, 3.4634f, 17.5f, 3.9639f);
            eVarK3.d(17.5863f, 4.0544f, 17.6328f, 4.1747f, 17.6328f, 4.2998f);
            z.y(eVarK3, 7.0352f, 15.5273f, 4.1055f, 7.1592f);
            eVarK3.o(19.8945f);
            eVarK3.g(10.5234f);
            eVarK3.d(10.5519f, 19.9222f, 10.5794f, 19.9514f, 10.6084f, 19.9785f);
            eVarK3.d(10.6528f, 20.3048f, 10.6973f, 20.6535f, 10.7383f, 20.9912f);
            eVarK3.d(10.7802f, 21.3366f, 10.8247f, 21.7079f, 10.8691f, 22.0f);
            eVarK3.g(7.3662f);
            eVarK3.d(7.2337f, 22.0f, 7.1064f, 21.9471f, 7.0127f, 21.8535f);
            eVarK3.i(5.2002f, 20.041f);
            eVarK3.d(5.1065f, 19.9473f, 5.0537f, 19.8201f, 5.0537f, 19.6875f);
            eVarK3.o(8.8428f);
            eVarK3.g(4.501f);
            eVarK3.d(4.225f, 8.8428f, 4.0003f, 8.6187f, 4.0f, 8.3428f);
            eVarK3.o(6.1846f);
            eVarK3.d(4.0f, 5.9084f, 4.2248f, 5.6846f, 4.501f, 5.6846f);
            eVarK3.g(5.0537f);
            eVarK3.o(4.3125f);
            eVarK3.d(5.0537f, 4.1799f, 5.1065f, 4.0528f, 5.2002f, 3.959f);
            eVarK3.i(7.0127f, 2.1465f);
            eVarK3.d(7.1064f, 2.0529f, 7.2337f, 2.0f, 7.3662f, 2.0f);
            eVarK3.g(15.3242f);
            eVarK3.c();
            u4.d.a.b(aVar10, eVarK3.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var14 = new t1(o4.f0.d(4278190080L), jVar);
            int i17 = h1.f128864c;
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(17.6318f, 8.5352f);
            eVarL5.d(17.6765f, 8.776f, 17.7314f, 9.2291f, 17.7939f, 9.7412f);
            eVarL5.d(17.8626f, 10.3029f, 17.9408f, 10.9359f, 18.0225f, 11.4395f);
            eVarL5.d(19.115f, 12.3392f, 19.8174f, 13.7129f, 19.8174f, 15.2598f);
            eVarL5.g(19.833f);
            eVarL5.d(19.833f, 16.7909f, 19.1151f, 18.1803f, 18.0225f, 19.0801f);
            eVarL5.d(17.9277f, 19.62f, 17.8417f, 20.2992f, 17.7686f, 20.8818f);
            eVarL5.d(17.7092f, 21.3551f, 17.6582f, 21.7651f, 17.6162f, 21.9844f);
            eVarL5.g(12.3867f);
            eVarL5.d(12.3409f, 21.7525f, 12.2874f, 21.3123f, 12.2266f, 20.8105f);
            eVarL5.d(12.1632f, 20.2876f, 12.0923f, 19.6974f, 12.0127f, 19.2061f);
            eVarL5.d(10.8264f, 18.3063f, 10.0615f, 16.8698f, 10.0615f, 15.2598f);
            eVarL5.d(10.0615f, 13.6497f, 10.8264f, 12.2132f, 12.0127f, 11.3135f);
            eVarL5.d(12.0904f, 10.8343f, 12.1634f, 10.2612f, 12.2295f, 9.748f);
            eVarL5.d(12.2962f, 9.2301f, 12.3553f, 8.773f, 12.4023f, 8.5352f);
            b71.i.y(eVarL5, 17.6318f, 14.9473f, 11.8027f);
            eVarL5.d(13.0741f, 11.8027f, 11.5439f, 13.3499f, 11.5439f, 15.2441f);
            eVarL5.d(11.5441f, 17.1383f, 13.0742f, 18.6855f, 14.9473f, 18.6855f);
            eVarL5.d(16.8202f, 18.6853f, 18.3495f, 17.1381f, 18.3496f, 15.2441f);
            eVarL5.d(18.3496f, 13.35f, 16.8203f, 11.8029f, 14.9473f, 11.8027f);
            eVarL5.c();
            u4.d.a.b(aVar10, eVarL5.f168407a, i17, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            x62.d.f189292a = dVarC5;
        }
        u4.d dVar4 = dVarC5;
        u4.d dVarC6 = x62.f.f189294a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("Edge", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var15 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i18 = h1.f128864c;
            u4.e eVarL6 = com.nimbusds.jose.shaded.gson.internal.a.l(16.3232f, 2.0f);
            eVarL6.d(16.4535f, 2.0f, 16.5782f, 2.0506f, 16.6714f, 2.1416f);
            eVarL6.d(17.0407f, 2.5024f, 18.0211f, 3.4632f, 18.499f, 3.9639f);
            eVarL6.d(18.5854f, 4.0544f, 18.6318f, 4.1746f, 18.6318f, 4.2998f);
            eVarL6.o(19.6875f);
            eVarL6.d(18.6318f, 19.82f, 18.579f, 19.9473f, 18.4854f, 20.041f);
            eVarL6.i(16.6729f, 21.8535f);
            eVarL6.d(16.5791f, 21.9473f, 16.4519f, 22.0f, 16.3193f, 22.0f);
            eVarL6.g(8.3652f);
            eVarL6.d(8.2327f, 22.0f, 8.1055f, 21.9472f, 8.0117f, 21.8535f);
            eVarL6.i(6.1992f, 20.041f);
            eVarL6.d(6.1055f, 19.9473f, 6.0527f, 19.8201f, 6.0527f, 19.6875f);
            eVarL6.o(8.8423f);
            eVarL6.g(5.5f);
            eVarL6.d(5.2239f, 8.8423f, 5.0f, 8.6184f, 5.0f, 8.3423f);
            eVarL6.o(6.1846f);
            eVarL6.d(5.0f, 5.9084f, 5.2239f, 5.6846f, 5.5f, 5.6846f);
            eVarL6.g(6.0527f);
            eVarL6.o(4.3125f);
            eVarL6.d(6.0527f, 4.1799f, 6.1055f, 4.0528f, 6.1992f, 3.959f);
            eVarL6.i(8.0117f, 2.1465f);
            eVarL6.d(8.1055f, 2.0528f, 8.2327f, 2.0f, 8.3652f, 2.0f);
            v.e0.A(eVarL6, 16.3232f, 8.1582f, 19.8945f, 16.5264f);
            z.v(eVarL6, 4.1055f, 8.1582f, 19.8945f);
            u4.d.a.b(aVar12, eVarL6.f168407a, i18, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            x62.f.f189294a = dVarC6;
        }
        u4.d dVar5 = dVarC6;
        u4.d dVarA3 = g.a(l2Var);
        l2Var.getClass();
        u4.d dVarC7 = x62.h.f189296a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("Handheld", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var16 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i19 = h1.f128864c;
            u4.e eVarL7 = com.nimbusds.jose.shaded.gson.internal.a.l(10.2109f, 2.0f);
            eVarL7.d(10.5014f, 2.0002f, 10.7373f, 2.2358f, 10.7373f, 2.5264f);
            eVarL7.o(4.1055f);
            eVarL7.g(15.5674f);
            eVarL7.d(16.3877f, 4.1057f, 17.0526f, 4.7705f, 17.0527f, 5.5908f);
            eVarL7.o(20.5146f);
            eVarL7.d(17.0525f, 21.3349f, 16.3876f, 21.9997f, 15.5674f, 22.0f);
            eVarL7.g(7.4854f);
            eVarL7.d(6.6651f, 21.9998f, 6.0002f, 21.3349f, 6.0f, 20.5146f);
            eVarL7.o(5.5908f);
            eVarL7.d(6.0001f, 4.9209f, 6.4434f, 4.3542f, 7.0527f, 4.169f);
            eVarL7.o(2.5264f);
            eVarL7.d(7.0527f, 2.2357f, 7.2884f, 2.0f, 7.5791f, 2.0f);
            v.e0.A(eVarL7, 10.2109f, 7.5791f, 17.2627f, 15.4736f);
            z.v(eVarL7, 5.6846f, 7.5791f, 17.2627f);
            u4.d.a.b(aVar14, eVarL7.f168407a, i19, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            x62.h.f189296a = dVarC7;
        }
        List listK = p13.x.k(dVar, dVarA, dVar2, dVarA2, dVarC3, dVar3, dVar4, dVar5, dVarA3, dVarC7, x62.i.a(l2Var), x62.j.a(l2Var), x62.k.a(l2Var), o.a(l2Var), x62.p.a(l2Var), q.a(l2Var), x62.r.a(l2Var), s.a(l2Var), x62.a.a(l2Var));
        f131145c = listK;
        listK.getClass();
        return listK;
    }

    public static final List l(z7 z7Var) {
        long j8;
        u4.d dVar;
        z7Var.getClass();
        List list = f131146d;
        if (list != null) {
            return list;
        }
        u4.d dVarA = d72.n.a(z7Var);
        u4.d dVarC = d72.a.f58175a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("ActivityTracking", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarE = z.e(h1.f128863b, 3.3513f, 3.0935f, 6.3346f);
            eVarE.i(4.4324f, 5.2542f);
            eVarE.i(5.5135f, 6.3346f);
            eVarE.o(3.1475f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 4.4324f, 2.0131f, 3.3513f, 3.0935f);
            eVarE.k(3.3513f, 7.9552f);
            eVarE.o(11.1963f);
            eVarE.i(4.4324f, 10.1159f);
            eVarE.i(5.5135f, 11.1963f);
            eVarE.o(8.0092f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 4.4324f, 6.8748f, 3.3513f, 7.9552f);
            eVarE.k(3.3513f, 12.8168f);
            eVarE.o(16.058f);
            eVarE.i(4.4324f, 14.9776f);
            eVarE.i(5.5135f, 16.058f);
            eVarE.o(12.8708f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 4.4324f, 11.7365f, 3.3513f, 12.8168f);
            eVarE.k(3.3513f, 17.6785f);
            eVarE.o(22.0f);
            eVarE.g(5.5135f);
            eVarE.o(17.7325f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 4.4324f, 16.5981f, 3.3513f, 17.6785f);
            eVarE.k(10.5405f, 17.4624f);
            eVarE.i(7.2432f, 21.2437f);
            eVarE.i(8.2162f, 21.4598f);
            eVarE.i(12.1621f, 18.2727f);
            eVarE.i(13.5135f, 16.4361f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 11.2973f, 14.4914f, 10.5405f, 17.4624f);
            eVarE.k(14.5946f, 5.7404f);
            eVarE.d(14.9936f, 5.8247f, 15.4092f, 5.7779f, 15.7794f, 5.607f);
            eVarE.d(16.1496f, 5.4361f, 16.4547f, 5.1502f, 16.6491f, 4.792f);
            eVarE.d(16.8435f, 4.4337f, 16.9169f, 4.0222f, 16.8583f, 3.6189f);
            eVarE.d(16.7997f, 3.2156f, 16.6122f, 2.8419f, 16.3238f, 2.5538f);
            eVarE.d(16.0354f, 2.2656f, 15.6616f, 2.0782f, 15.258f, 2.0196f);
            eVarE.d(14.8544f, 1.9611f, 14.4427f, 2.0344f, 14.0841f, 2.2287f);
            eVarE.d(13.7256f, 2.423f, 13.4396f, 2.7278f, 13.2685f, 3.0978f);
            eVarE.d(13.0975f, 3.4678f, 13.0507f, 3.8831f, 13.1351f, 4.2819f);
            eVarE.d(13.2109f, 4.6401f, 13.3892f, 4.9686f, 13.6483f, 5.2276f);
            eVarE.d(13.9074f, 5.4865f, 14.2361f, 5.6646f, 14.5946f, 5.7404f);
            b71.i.z(eVarE, 5.7404f, 17.1351f, 11.7905f);
            eVarE.i(20.1081f, 12.8168f);
            eVarE.i(20.6486f, 12.2766f);
            eVarE.i(17.8378f, 10.44f);
            eVarE.i(16.054f, 7.0368f);
            eVarE.i(13.081f, 6.3346f);
            eVarE.i(9.9459f, 8.7114f);
            eVarE.i(8.5405f, 12.7088f);
            eVarE.i(9.2432f, 12.9789f);
            eVarE.i(11.1351f, 10.0619f);
            eVarE.i(12.3243f, 9.1436f);
            eVarE.d(12.3243f, 9.1436f, 12.1081f, 10.9802f, 12.0f, 11.7365f);
            eVarE.d(11.8919f, 12.4927f, 11.7297f, 13.0329f, 12.054f, 13.357f);
            eVarE.i(16.0f, 17.0303f);
            eVarE.i(18.4865f, 21.4598f);
            eVarE.i(19.5675f, 22.0f);
            eVarE.i(17.081f, 15.4097f);
            eVarE.i(15.2432f, 12.7628f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 15.4054f, 10.6021f, 17.1351f, 11.7905f);
            u4.d.a.b(aVar2, eVarE.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            d72.a.f58175a = dVarC;
        }
        u4.d dVarC2 = d72.c.f58177a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("AreaCalculator", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var2 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarM = z.m(h1.f128863b, 20.4787f, 2.0001f, 3.5142f);
            eVarM.d(3.3166f, 1.9982f, 3.1207f, 2.0357f, 2.9375f, 2.1106f);
            eVarM.d(2.7543f, 2.1855f, 2.5876f, 2.2962f, 2.4469f, 2.4364f);
            eVarM.d(2.3062f, 2.5766f, 2.1943f, 2.7435f, 2.1176f, 2.9276f);
            eVarM.d(2.0409f, 3.1116f, 2.0009f, 3.3092f, 2.0f, 3.5089f);
            eVarM.o(20.4839f);
            eVarM.d(2.0f, 20.6842f, 2.0393f, 20.8826f, 2.1155f, 21.0675f);
            eVarM.d(2.1918f, 21.2524f, 2.3036f, 21.4202f, 2.4444f, 21.5612f);
            eVarM.d(2.5851f, 21.7021f, 2.7522f, 21.8135f, 2.9358f, 21.8888f);
            eVarM.d(3.1195f, 21.9641f, 3.316f, 22.002f, 3.5142f, 22.0f);
            eVarM.g(20.4787f);
            eVarM.d(20.6772f, 22.0019f, 20.8741f, 21.9642f, 21.0581f, 21.889f);
            eVarM.d(21.2422f, 21.8137f, 21.4096f, 21.7025f, 21.551f, 21.5616f);
            eVarM.d(21.6924f, 21.4207f, 21.8048f, 21.253f, 21.8819f, 21.068f);
            eVarM.d(21.9589f, 20.8831f, 21.9991f, 20.6846f, 22.0f, 20.4839f);
            eVarM.o(3.5089f);
            eVarM.d(21.9981f, 3.3089f, 21.9573f, 3.1111f, 21.8798f, 2.927f);
            eVarM.d(21.8023f, 2.7429f, 21.6898f, 2.576f, 21.5485f, 2.4359f);
            eVarM.d(21.4072f, 2.2958f, 21.24f, 2.1852f, 21.0565f, 2.1104f);
            eVarM.d(20.8729f, 2.0356f, 20.6766f, 1.9982f, 20.4787f, 2.0001f);
            z.w(eVarM, 19.1529f, 12.0001f, 16.2857f, 17.0001f);
            q2.x(eVarM, 11.2857f, 12.0001f, 5.5714f, 7.0001f);
            sn.a.v(eVarM, 19.1529f, 12.0001f);
            u4.d.a.b(aVar4, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            d72.c.f58177a = dVarC2;
        }
        u4.d dVarC3 = d72.d.f58178a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("AudioPrompts", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var3 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL = b71.i.l(h1.f128863b, 21.4371f, 15.8653f, 21.4731f, 15.7456f);
            eVarL.d(21.8204f, 14.65f, 22.0f, 13.5425f, 22.0f, 12.4649f);
            eVarL.d(22.0f, 6.6936f, 17.515f, 2.0f, 12.0f, 2.0f);
            eVarL.d(6.485f, 2.0f, 2.0f, 6.6936f, 2.0f, 12.4649f);
            eVarL.d(2.0f, 13.5604f, 2.1737f, 14.668f, 2.521f, 15.7576f);
            eVarL.i(2.5569f, 15.8773f);
            eVarL.i(2.497f, 15.9911f);
            eVarL.d(1.9701f, 16.9549f, 1.8623f, 18.0505f, 2.1856f, 19.0802f);
            eVarL.d(2.7964f, 21.002f, 4.7305f, 22.0856f, 6.5868f, 21.5588f);
            eVarL.i(6.7904f, 21.4989f);
            eVarL.i(6.9162f, 21.6725f);
            eVarL.d(7.1138f, 21.9539f, 7.4491f, 22.0676f, 7.7605f, 21.9599f);
            eVarL.d(8.1617f, 21.8222f, 8.3832f, 21.3612f, 8.2455f, 20.9301f);
            eVarL.i(5.982f, 13.782f);
            eVarL.d(5.9162f, 13.5724f, 5.7724f, 13.4048f, 5.5868f, 13.309f);
            eVarL.d(5.4132f, 13.2192f, 5.2096f, 13.2072f, 5.024f, 13.2731f);
            eVarL.d(4.7066f, 13.3808f, 4.497f, 13.6921f, 4.497f, 14.0514f);
            eVarL.o(14.2549f);
            eVarL.i(4.3114f, 14.3327f);
            eVarL.d(4.2695f, 14.3447f, 4.2275f, 14.3687f, 4.1856f, 14.3926f);
            eVarL.d(4.1743f, 14.3991f, 4.1633f, 14.4056f, 4.1526f, 14.412f);
            eVarL.d(4.1238f, 14.4291f, 4.0964f, 14.4454f, 4.0659f, 14.4585f);
            eVarL.i(3.7126f, 14.6381f);
            eVarL.i(3.6347f, 14.2489f);
            eVarL.d(3.515f, 13.6203f, 3.4551f, 13.0336f, 3.4551f, 12.4649f);
            eVarL.d(3.4551f, 7.5497f, 7.2874f, 3.5506f, 12.0f, 3.5506f);
            eVarL.d(16.7126f, 3.5506f, 20.5449f, 7.5497f, 20.5449f, 12.4649f);
            eVarL.d(20.5449f, 13.0156f, 20.485f, 13.5844f, 20.3533f, 14.2429f);
            eVarL.i(20.2754f, 14.6321f);
            eVarL.i(19.9222f, 14.4585f);
            eVarL.d(19.8916f, 14.4454f, 19.8643f, 14.4291f, 19.8355f, 14.412f);
            eVarL.d(19.8247f, 14.4056f, 19.8138f, 14.3991f, 19.8024f, 14.3926f);
            eVarL.d(19.7935f, 14.3875f, 19.7848f, 14.3824f, 19.7763f, 14.3774f);
            eVarL.d(19.7446f, 14.3587f, 19.7144f, 14.3409f, 19.6766f, 14.3267f);
            eVarL.i(19.491f, 14.2489f);
            eVarL.o(14.0454f);
            eVarL.d(19.491f, 13.6921f, 19.2814f, 13.3808f, 18.9641f, 13.2671f);
            eVarL.d(18.8862f, 13.2431f, 18.8084f, 13.2252f, 18.7305f, 13.2252f);
            eVarL.d(18.6168f, 13.2252f, 18.509f, 13.2491f, 18.4072f, 13.303f);
            eVarL.d(18.2156f, 13.3988f, 18.0778f, 13.5664f, 18.012f, 13.776f);
            eVarL.i(15.7485f, 20.9242f);
            eVarL.d(15.6108f, 21.3492f, 15.8323f, 21.8102f, 16.2335f, 21.9539f);
            eVarL.d(16.5449f, 22.0616f, 16.8862f, 21.9479f, 17.0778f, 21.6665f);
            eVarL.i(17.2036f, 21.4929f);
            eVarL.i(17.4072f, 21.5528f);
            eVarL.d(19.2695f, 22.0856f, 21.1976f, 20.996f, 21.8084f, 19.0743f);
            eVarL.d(22.1377f, 18.0445f, 22.024f, 16.943f, 21.491f, 15.9791f);
            eVarL.i(21.4371f, 15.8653f);
            eVarL.c();
            u4.d.a.b(aVar6, eVarL.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var4 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(9.8147f, 19.2058f);
            eVarL2.d(9.8226f, 19.1914f, 9.8304f, 19.1772f, 9.8383f, 19.1641f);
            eVarL2.d(10.3233f, 18.2361f, 10.4131f, 17.1884f, 10.0958f, 16.1946f);
            eVarL2.d(9.7664f, 15.1649f, 9.0479f, 14.3387f, 8.0718f, 13.8658f);
            eVarL2.i(7.5868f, 14.8715f);
            eVarL2.d(8.2874f, 15.2128f, 8.7964f, 15.7995f, 9.0299f, 16.5359f);
            eVarL2.d(9.2634f, 17.2722f, 9.1736f, 18.0385f, 8.8084f, 18.721f);
            eVarL2.i(9.7844f, 19.2598f);
            eVarL2.d(9.7934f, 19.2449f, 9.8024f, 19.2284f, 9.8113f, 19.2119f);
            eVarL2.i(9.8147f, 19.2058f);
            eVarL2.c();
            u4.d.a.b(aVar6, eVarL2.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var5 = new t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(14.0239f, 19.1641f);
            eVarL3.d(14.0317f, 19.1772f, 14.0396f, 19.1914f, 14.0474f, 19.2058f);
            eVarL3.i(14.0508f, 19.2119f);
            eVarL3.d(14.0598f, 19.2284f, 14.0688f, 19.2449f, 14.0778f, 19.2598f);
            eVarL3.i(15.0538f, 18.721f);
            eVarL3.d(14.6885f, 18.0385f, 14.5987f, 17.2722f, 14.8322f, 16.5359f);
            eVarL3.d(15.0658f, 15.7995f, 15.5748f, 15.2128f, 16.2754f, 14.8715f);
            eVarL3.i(15.7903f, 13.8658f);
            eVarL3.d(14.8143f, 14.3387f, 14.0957f, 15.1649f, 13.7664f, 16.1946f);
            eVarL3.d(13.449f, 17.1884f, 13.5448f, 18.2361f, 14.0239f, 19.1641f);
            eVarL3.c();
            u4.d.a.b(aVar6, eVarL3.f168407a, 0, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            d72.d.f58178a = dVarC3;
        }
        u4.d dVarC4 = d72.e.f58179a;
        if (dVarC4 != null) {
            j8 = 4278190080L;
        } else {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("Brightness", f17, f17, 24.0f, 24.0f, 0L, 0, true, 96, null);
            j8 = 4278190080L;
            t1 t1Var6 = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarL4 = com.nimbusds.jose.shaded.gson.internal.a.l(12.0f, 7.1429f);
            eVarL4.d(11.0393f, 7.1429f, 10.1003f, 7.4277f, 9.3015f, 7.9614f);
            eVarL4.d(8.5028f, 8.4951f, 7.8802f, 9.2537f, 7.5126f, 10.1413f);
            eVarL4.d(7.145f, 11.0288f, 7.0488f, 12.0054f, 7.2362f, 12.9476f);
            eVarL4.d(7.4236f, 13.8898f, 7.8862f, 14.7552f, 8.5655f, 15.4345f);
            eVarL4.d(9.2448f, 16.1138f, 10.1102f, 16.5764f, 11.0524f, 16.7638f);
            eVarL4.d(11.9946f, 16.9512f, 12.9712f, 16.855f, 13.8587f, 16.4874f);
            eVarL4.d(14.7463f, 16.1198f, 15.5049f, 15.4972f, 16.0386f, 14.6985f);
            eVarL4.d(16.5723f, 13.8997f, 16.8571f, 12.9607f, 16.8571f, 12.0f);
            eVarL4.d(16.8571f, 10.7118f, 16.3454f, 9.4764f, 15.4345f, 8.5655f);
            eVarL4.d(14.5236f, 7.6546f, 13.2882f, 7.1429f, 12.0f, 7.1429f);
            z.w(eVarL4, 12.8571f, 2.0f, 11.1429f, 6.0f);
            z.u(eVarL4, 12.8571f, 2.0f, 11.1429f, 22.0f);
            v.e0.x(eVarL4, 12.8571f, 18.0f, 11.1429f, 22.0f);
            z.x(eVarL4, 18.0f, 12.2857f, 22.0f, 10.5714f);
            z.u(eVarL4, 18.0f, 12.2857f, 6.0f, 10.5714f);
            v.e0.x(eVarL4, 2.0f, 12.2857f, 6.0f, 10.5714f);
            eVarL4.k(19.6571f, 5.5429f);
            eVarL4.i(18.4571f, 4.3429f);
            eVarL4.i(15.6571f, 7.1429f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 16.8571f, 8.3429f, 19.6571f, 5.5429f);
            eVarL4.k(4.3429f, 18.4571f);
            eVarL4.i(5.5429f, 19.6571f);
            eVarL4.i(8.3429f, 16.8571f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 7.1429f, 15.6571f, 4.3429f, 18.4571f);
            eVarL4.k(16.0571f, 16.4571f);
            eVarL4.i(18.8571f, 19.2571f);
            eVarL4.i(20.0571f, 18.0571f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 17.2571f, 15.2571f, 16.0571f, 16.4571f);
            eVarL4.k(8.8f, 6.7429f);
            eVarL4.i(5.9429f, 3.9429f);
            eVarL4.i(4.7429f, 5.1429f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 7.5429f, 7.9429f, 8.8f, 6.7429f);
            u4.d.a.b(aVar8, eVarL4.f168407a, i14, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            d72.e.f58179a = dVarC4;
        }
        u4.d dVar2 = dVarC4;
        u4.d dVarA2 = d72.f.a(z7Var);
        u4.d dVarA3 = d72.g.a(z7Var);
        u4.d dVarC5 = d72.h.f58182a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("DataField", f18, f18, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var7 = new t1(o4.f0.d(j8), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarL5 = com.nimbusds.jose.shaded.gson.internal.a.l(22.0f, 12.0f);
            eVarL5.d(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f);
            eVarL5.d(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f);
            eVarL5.d(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f);
            eVarL5.d(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f);
            eVarL5.c();
            eVarL5.k(18.98f, 16.4f);
            eVarL5.d(17.5186f, 18.7135f, 14.9387f, 20.25f, 12.0f, 20.25f);
            eVarL5.d(9.0613f, 20.25f, 6.4814f, 18.7135f, 5.02f, 16.4f);
            q2.y(eVarL5, 18.98f, 16.4f, 19.6876f, 15.0f);
            q2.w(eVarL5, 12.6998f, 9.0f, 19.6876f);
            eVarL5.d(20.0507f, 9.9298f, 20.25f, 10.9416f, 20.25f, 12.0f);
            eVarL5.d(20.25f, 13.0584f, 20.0507f, 14.0702f, 19.6876f, 15.0f);
            hb.a.r(eVarL5, 18.98f, 7.6f, 5.02f, 7.6f);
            eVarL5.d(6.4814f, 5.2865f, 9.0613f, 3.75f, 12.0f, 3.75f);
            eVarL5.d(14.9387f, 3.75f, 17.5186f, 5.2865f, 18.98f, 7.6f);
            eVarL5.c();
            eVarL5.k(4.3124f, 9.0f);
            eVarL5.d(3.9493f, 9.9298f, 3.75f, 10.9416f, 3.75f, 12.0f);
            eVarL5.d(3.75f, 13.0584f, 3.9493f, 14.0702f, 4.3124f, 15.0f);
            z.r(eVarL5, 11.2998f, 9.0f, 4.3124f);
            u4.d.a.b(aVar10, eVarL5.f168407a, i15, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            d72.h.f58182a = dVarC5;
        }
        u4.d dVar3 = dVarC3;
        u4.d dVarA4 = d72.j.a(z7Var);
        u4.d dVarA5 = d72.k.a(z7Var);
        u4.d dVar4 = dVarC2;
        u4.d dVar5 = dVarC5;
        u4.d dVarA6 = d72.l.a(z7Var);
        u4.d dVarC6 = d72.m.f58187a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("MoveBarWellness", f19, f19, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var8 = new t1(o4.f0.d(j8), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarM2 = z.m(h1.f128863b, 8.1794f, 18.0f, 2.0f);
            eVarM2.i(7.918f, 12.0f);
            eVarM2.i(2.0f, 6.0f);
            eVarM2.g(8.1794f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 14.0974f, 12.0f, 8.1794f, 18.0f);
            u4.d.a.b(aVar12, eVarM2.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            t1 t1Var9 = new t1(o4.f0.d(j8), null);
            u4.e eVarD = z.d(16.082f, 18.0f, 9.9025f, 15.8206f, 12.0f);
            eVarD.i(9.9025f, 6.0f);
            eVarD.g(16.082f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarD, 22.0011f, 12.0f, 16.082f, 18.0f);
            u4.d.a.b(aVar12, eVarD.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            d72.m.f58187a = dVarC6;
        }
        z7Var.getClass();
        u4.d dVarC7 = d72.o.f58189a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("Settings", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            t1 t1Var10 = new t1(o4.f0.d(j8), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarK = q2.k(22.0f, 13.4832f, 10.5285f, 19.0588f, 9.734f);
            eVarK.d(18.9353f, 9.3573f, 18.7941f, 8.9923f, 18.6176f, 8.6451f);
            eVarK.i(20.1706f, 5.9729f);
            eVarK.i(18.0824f, 3.8835f);
            eVarK.i(15.4059f, 5.4373f);
            eVarK.d(15.0588f, 5.2607f, 14.7f, 5.1077f, 14.3294f, 4.99f);
            eVarK.i(13.5471f, 2.0f);
            eVarK.g(10.5882f);
            eVarK.i(9.7882f, 5.0018f);
            eVarK.d(9.4235f, 5.1195f, 9.0706f, 5.2725f, 8.7294f, 5.4432f);
            eVarK.i(6.0412f, 3.8776f);
            eVarK.i(3.9471f, 5.9729f);
            eVarK.i(5.5118f, 8.6804f);
            eVarK.d(5.3471f, 9.01f, 5.2118f, 9.3631f, 5.0941f, 9.7163f);
            eVarK.i(2.0f, 10.5109f);
            eVarK.o(13.4715f);
            eVarK.i(5.1f, 14.2837f);
            eVarK.d(5.2176f, 14.6368f, 5.3529f, 14.9841f, 5.5177f, 15.3078f);
            eVarK.i(3.9353f, 18.0153f);
            eVarK.i(6.0294f, 20.1107f);
            eVarK.i(8.7412f, 18.5391f);
            eVarK.d(9.0765f, 18.7098f, 9.4177f, 18.857f, 9.7765f, 18.9747f);
            eVarK.i(10.5706f, 22.0f);
            eVarK.g(13.5235f);
            eVarK.i(14.3235f, 18.9923f);
            eVarK.d(14.6882f, 18.8746f, 15.0412f, 18.7216f, 15.3824f, 18.5509f);
            eVarK.i(18.0706f, 20.1165f);
            eVarK.i(20.1588f, 18.0271f);
            eVarK.i(18.6059f, 15.3431f);
            eVarK.d(18.7824f, 15.0018f, 18.9235f, 14.6368f, 19.0471f, 14.266f);
            q2.y(eVarK, 22.0f, 13.4832f, 12.0f, 17.2913f);
            eVarK.d(9.0765f, 17.2913f, 6.7059f, 14.9194f, 6.7059f, 11.9941f);
            eVarK.d(6.7059f, 9.0689f, 9.0765f, 6.6969f, 12.0f, 6.6969f);
            eVarK.d(14.9235f, 6.6969f, 17.2941f, 9.0689f, 17.2941f, 11.9941f);
            eVarK.d(17.2941f, 14.9194f, 14.9235f, 17.2913f, 12.0f, 17.2913f);
            eVarK.c();
            u4.d.a.b(aVar14, eVarK.f168407a, i16, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            d72.o.f58189a = dVarC7;
        }
        u4.d dVar6 = dVarC6;
        u4.d dVarA7 = d72.n.a(z7Var);
        u4.d dVarC8 = d72.p.f58190a;
        if (dVarC8 != null) {
            dVar = dVarC7;
        } else {
            u4.d dVar7 = dVarC7;
            float f24 = (float) 24.0d;
            g6.f.a aVar15 = g6.f.f75994b;
            u4.d.a aVar16 = new u4.d.a("StorageSd", f24, f24, 24.0f, 24.0f, 0L, 0, true, 96, null);
            long jD = o4.f0.d(j8);
            dVar = dVar7;
            t1 t1Var11 = new t1(jD, null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i17 = h1.f128864c;
            u4.e eVarS = v.e0.s(19.9229f, 21.0098f, 4.0f, 8.168f);
            eVarS.i(6.6758f, 5.6758f);
            c22.t.k(eVarS, 9.6963f, 3.0f, 19.9229f, 21.0098f);
            z.x(eVarS, 6.5957f, 19.0361f, 17.6006f, 14.0762f);
            z.u(eVarS, 6.5957f, 19.0361f, 9.5908f, 5.0283f);
            v.e0.y(eVarS, 9.0293f, 11.6074f, 5.0283f, 9.5908f);
            z.x(eVarS, 12.5938f, 9.0293f, 14.6104f, 5.0283f);
            z.u(eVarS, 12.5938f, 9.0293f, 15.5977f, 9.0293f);
            v.e0.x(eVarS, 17.6133f, 5.0283f, 15.5977f, 9.0293f);
            u4.d.a.b(aVar16, eVarS.f168407a, i17, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC8 = aVar16.c();
            d72.p.f58190a = dVarC8;
        }
        List listK = p13.x.k(dVarA, dVarC, dVar4, dVar3, dVar2, dVarA2, dVarA3, dVar5, dVarA4, dVarA5, dVarA6, dVar6, dVar, dVarA7, dVarC8, d72.q.a(z7Var), d72.r.a(z7Var), d72.s.a(z7Var), d72.t.a(z7Var), u.a(z7Var), d72.b.a(z7Var), d72.i.a(z7Var));
        f131146d = listK;
        listK.getClass();
        return listK;
    }

    public static final int m(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        return Days.daysBetween(localDate, localDate2).getDays() + 1;
    }

    public static final List n(oz1.b bVar, Context context) {
        oz1.a aVarT;
        oz1.a aVarT2;
        oz1.a aVarT3;
        oz1.a aVarT4;
        oz1.a aVarT5;
        oz1.p pVarValueOf;
        oz1.l lVarValueOf;
        oz1.d dVarValueOf;
        String strValueOf;
        oz1.h hVarValueOf;
        oz1.j jVarValueOf;
        String strF;
        oz1.n nVarValueOf;
        oz1.f fVar;
        context.getClass();
        Integer minutesSinceLastDive = bVar.getMinutesSinceLastDive();
        oz1.a aVarT6 = null;
        if (minutesSinceLastDive != null) {
            int iIntValue = minutesSinceLastDive.intValue();
            if (iIntValue <= 90) {
                fVar = oz1.f.SHORT;
            } else {
                fVar = iIntValue <= 240 ? oz1.f.MEDIUM : oz1.f.LONG;
            }
            oz1.c cVar = oz1.c.RECENT_DIVES;
            String string = context.getString(R.string.social_relative_date_time_hours);
            string.getClass();
            aVarT = t(context, cVar, String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(24 - (iIntValue / 60))}, 1)), fVar.name(), fVar.f134547a);
        } else {
            aVarT = null;
        }
        String sleepScoreFactorFeedback = bVar.getSleepScoreFactorFeedback();
        if (sleepScoreFactorFeedback == null || (nVarValueOf = oz1.n.valueOf(sleepScoreFactorFeedback)) == null) {
            aVarT2 = null;
        } else {
            aVarT2 = t(context, oz1.c.SLEEP_SCORE, bVar.getSleepScore() != null ? String.valueOf(bVar.getSleepScore().intValue()) : null, nVarValueOf.name(), nVarValueOf.f134594a);
        }
        String recoveryTimeFactorFeedback = bVar.getRecoveryTimeFactorFeedback();
        if (recoveryTimeFactorFeedback == null || (jVarValueOf = oz1.j.valueOf(recoveryTimeFactorFeedback)) == null) {
            aVarT3 = null;
        } else {
            if (bVar.getRecoveryTime() == null) {
                strF = "";
            } else {
                Integer recoveryTime = bVar.getRecoveryTime();
                int iIntValue2 = recoveryTime != null ? recoveryTime.intValue() / 60 : 0;
                if (iIntValue2 > 96) {
                    int i14 = iIntValue2 / 24;
                    int i15 = iIntValue2 % 24;
                    int i16 = i15 + ((((i15 ^ 24) & ((-i15) | i15)) >> 31) & 24);
                    if (6 > i16 || i16 >= 18) {
                        strF = i16 > 17 ? j.f(i14, "1d") : j.f(i14, "d");
                    } else {
                        strF = j.f(i14, ".5d");
                    }
                } else {
                    strF = j.f(iIntValue2, "h");
                }
            }
            aVarT3 = t(context, oz1.c.RECOVERY_TIME, strF, jVarValueOf.name(), jVarValueOf.f134570a);
        }
        String hrvFactorFeedback = bVar.getHrvFactorFeedback();
        if (hrvFactorFeedback == null || (hVarValueOf = oz1.h.valueOf(hrvFactorFeedback)) == null) {
            aVarT4 = null;
        } else {
            aVarT4 = t(context, oz1.c.HRV_STATUS, bVar.getHrvWeeklyAverage() + StringUtils.SPACE + context.getString(R.string.lbl_ms), hVarValueOf.name(), hVarValueOf.f134558a);
        }
        String acwrFactorFeedback = bVar.getAcwrFactorFeedback();
        if (acwrFactorFeedback == null || (dVarValueOf = oz1.d.valueOf(acwrFactorFeedback)) == null) {
            aVarT5 = null;
        } else {
            if (dVarValueOf == oz1.d.NONE || bVar.getAcuteLoad() == null) {
                strValueOf = bVar.getAcuteLoad() != null ? String.valueOf(bVar.getAcuteLoad().intValue()) : null;
            } else {
                strValueOf = NumberFormat.getIntegerInstance().format(bVar.getAcuteLoad()).toString();
            }
            aVarT5 = t(context, oz1.c.ACUTE_LOAD, strValueOf, dVarValueOf.name(), dVarValueOf.f134538a);
        }
        String sleepHistoryFactorFeedback = bVar.getSleepHistoryFactorFeedback();
        oz1.a aVarT7 = (sleepHistoryFactorFeedback == null || (lVarValueOf = oz1.l.valueOf(sleepHistoryFactorFeedback)) == null) ? null : t(context, oz1.c.RECENT_SLEEP_SCORE, "", lVarValueOf.name(), lVarValueOf.f134582a);
        String stressHistoryFactorFeedback = bVar.getStressHistoryFactorFeedback();
        if (stressHistoryFactorFeedback != null && (pVarValueOf = oz1.p.valueOf(stressHistoryFactorFeedback)) != null) {
            aVarT6 = t(context, oz1.c.RECENT_STRESS, "", pVarValueOf.name(), pVarValueOf.f134606a);
        }
        return p13.x.k(aVarT, aVarT2, aVarT3, aVarT4, aVarT5, aVarT7, aVarT6);
    }

    public static final t62.c o(s62.a aVar) {
        aVar.getClass();
        return t62.c.f162799a;
    }

    public static final ArrayList p(ActivityDetailChartDTO activityDetailChartDTO, String str) {
        int iH;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> listG = activityDetailChartDTO.G();
        if (listG == null || listG.isEmpty() || (iH = activityDetailChartDTO.H(str)) == -1) {
            return null;
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
        listC.getClass();
        ArrayList arrayList = new ArrayList(y.r(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.activities.newmodel.b) it.next()).C().get(iH));
        }
        return arrayList;
    }

    public static final List q(int i14, int i15, Context context) {
        return p13.x.k(new xz.h(i14, ql1.d.a(R.drawable.sleep, context), null, 4, null), new xz.h(i15, ql1.d.a(R.drawable.alarms, context), null, 4, null));
    }

    public static final int r(rl1.k kVar, boolean z14, boolean z15) {
        kVar.getClass();
        int i14 = kVar.f153447a;
        if (kVar == rl1.k.NO_LEVELS) {
            return 0;
        }
        if (kVar != rl1.k.MANUAL) {
            return (z14 || kVar != rl1.k.AWAKE) ? i14 + 1 : i14;
        }
        if (z15) {
            return 1;
        }
        return i14 + 1;
    }

    public static final String s(qs1.b bVar) {
        String imageThumbnailUrl = bVar.getImageThumbnailUrl();
        return (imageThumbnailUrl == null && (imageThumbnailUrl = bVar.getImageMediumUrl()) == null) ? bVar.getImageUrl() : imageThumbnailUrl;
    }

    public static final oz1.a t(Context context, oz1.c cVar, String str, String str2, int i14) {
        String string;
        boolean z14 = str2.length() > 0 && !str2.equalsIgnoreCase("NONE");
        if (!z14 || str == null) {
            string = context.getString(cVar == oz1.c.HRV_STATUS ? R.string.msg_not_enough_data : R.string.no_data_on_device);
        } else {
            string = str;
        }
        string.getClass();
        return new oz1.a(cVar, string, i14, z14 ? i14 : R.string.no_data_label, !z14 || (str == null && cVar == oz1.c.SLEEP_SCORE) || cVar == oz1.c.RECENT_DIVES);
    }

    public static int u(long j8, long j14) {
        return (int) Math.ceil(((int) (j8 - j14)) / DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static int v(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        dateTime2.getClass();
        return (int) Math.ceil(((int) (dateTime.getMillis() - dateTime2.getMillis())) / DateTimeConstants.MILLIS_PER_MINUTE);
    }

    public static final void w(Throwable th3, t13.g gVar) {
        Throwable runtimeException;
        Iterator it = u53.e.f168726a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).L(th3, gVar);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th4) {
                if (th3 == th4) {
                    runtimeException = th3;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                    o13.g.a(runtimeException, th3);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            o13.g.a(th3, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
    }

    public static final boolean x(Exception exc) {
        if (exc == null) {
            return false;
        }
        if ((exc instanceof ProtocolTimeoutException) || (exc.getCause() instanceof ProtocolTimeoutException)) {
            return true;
        }
        Throwable cause = exc.getCause();
        Exception exc2 = cause instanceof Exception ? (Exception) cause : null;
        if (exc2 != null) {
            return x(exc2);
        }
        return false;
    }

    public static final boolean y() {
        bv.b.f21239a.getClass();
        bv.b.a();
        k1 k1Var = k1.f37122a;
        return k1Var.e0() || k1Var.l();
    }

    public static final boolean z(int i14, List list) {
        return i14 >= 0 && i14 < list.size() && (list.get(i14) instanceof rq.a.C2917a);
    }
}
