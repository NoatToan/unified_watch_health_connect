package og;

import ak0.q;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import bq0.k;
import ch.qos.logback.core.joran.action.Action;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.samd.repository.UnexpectedResponseCodeException;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import e23.l;
import ew1.u1;
import h4.r;
import hb2.e;
import i3.e5;
import i3.fe;
import i3.n8;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.t1;
import kotlinx.coroutines.internal.UndeliveredElementException;
import l4.w;
import l72.i3;
import lc.j0;
import lc.k0;
import lc.m0;
import lc.u0;
import lc.v;
import lc.v0;
import lc.y;
import lx2.c;
import o13.p;
import o4.h1;
import o4.v1;
import o72.t;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.LoggerFactory;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.c1;
import p13.d0;
import p13.h0;
import p13.t0;
import p13.u;
import p13.x;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p3.x3;
import p43.e2;
import p43.f0;
import p43.f2;
import p43.n0;
import p43.y0;
import ps.x0;
import pu0.b;
import pu0.f;
import pu0.h;
import pu0.i;
import pu0.j;
import q53.o;
import qu0.d;
import r1.q2;
import ro0.g;
import s5.w0;
import sg0.p0;
import u62.z;
import v.e0;
import v62.h5;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f131966a;

    public static final String A(b bVar) {
        bVar.getClass();
        String str = bVar.f141184b;
        String str2 = bVar.f141185c;
        if (str2 == null) {
            str2 = "";
        }
        return e5.g(str, StringUtils.SPACE, str2);
    }

    public static final String B(b bVar) {
        String str;
        bVar.getClass();
        f fVar = (f) h0.d0(bVar.f141186d);
        return (fVar == null || (str = fVar.f141221b) == null) ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n0 C(n0 n0Var) {
        n0Var.getClass();
        if (n0Var instanceof e2) {
            return ((e2) n0Var).N();
        }
        return null;
    }

    public static final c D(kx2.a aVar, String str, String str2) throws UnexpectedResponseCodeException {
        str.getClass();
        qx2.c cVarB = rx2.a.b(false, FirebasePerformance.HttpMethod.GET, new URL(a0.j("https://", str, "/userpreference-service/", aVar.f107121a)), str2, null, null);
        String str3 = cVarB.f148456e;
        if (cVarB.f148454c == 200) {
            rx2.a.c().debug(t.u(cVarB));
            return new c(str3);
        }
        rx2.a.c().error(cVarB.toString());
        throw new UnexpectedResponseCodeException(cVarB.f148454c, str3, null, 4, null);
    }

    public static final qu0.c E(b bVar) {
        Object obj;
        Object next;
        List<qu0.c> list;
        qu0.c cVar;
        Object next2;
        Iterator<T> it = bVar.f141186d.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<qu0.c> list2 = ((f) next).f141227h;
            if (list2 != null) {
                Iterator<T> it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((qu0.c) next2).f147880a != d.LIVETRACK);
                cVar = (qu0.c) next2;
            } else {
                cVar = null;
            }
        } while (cVar == null);
        f fVar = (f) next;
        if (fVar == null || (list = fVar.f141227h) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((qu0.c) obj2).f147880a == d.LIVETRACK) {
                obj = obj2;
                break;
            }
        }
        return (qu0.c) obj;
    }

    public static final qu0.c F(b bVar) {
        Object obj;
        Object next;
        List<qu0.c> list;
        qu0.c cVar;
        Object next2;
        bVar.getClass();
        Iterator<T> it = bVar.f141191i.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<qu0.c> list2 = ((i) next).f141268i;
            if (list2 != null) {
                Iterator<T> it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((qu0.c) next2).f147880a != d.LIVETRACK);
                cVar = (qu0.c) next2;
            } else {
                cVar = null;
            }
        } while (cVar == null);
        i iVar = (i) next;
        if (iVar == null || (list = iVar.f141268i) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (((qu0.c) obj2).f147880a == d.LIVETRACK) {
                obj = obj2;
                break;
            }
        }
        return (qu0.c) obj;
    }

    public static final j G(b bVar) {
        bVar.getClass();
        i iVar = (i) h0.d0(bVar.f141191i);
        if (iVar != null) {
            return iVar.f141267h;
        }
        return null;
    }

    public static final double H(List list) {
        if (list == null || list.isEmpty()) {
            return 0.0d;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return 0.0d;
        }
        Double dR = ((x0) it.next()).getAverageSpeed();
        double dDoubleValue = dR != null ? dR.doubleValue() : 0.0d;
        while (it.hasNext()) {
            Double dR2 = ((x0) it.next()).getAverageSpeed();
            dDoubleValue = Math.max(dDoubleValue, dR2 != null ? dR2.doubleValue() : 0.0d);
        }
        return dDoubleValue;
    }

    public static final String I(b bVar) {
        String str;
        bVar.getClass();
        h hVar = (h) h0.d0(bVar.f141192j);
        return (hVar == null || (str = hVar.f141238b) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    public static final v J(v vVar, y yVar, m mVar) {
        vVar.getClass();
        yVar.getClass();
        x1 x1Var = n.f135158a;
        j0 j0Var = vVar.f111882b.f111774c;
        String str = j0Var != null ? j0Var.f111773b.f144347f : null;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            if (str != null) {
            }
            mVar.K(vVarH);
            objQ = vVarH;
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                v vVarH = str != null ? yVar.f111904b.h(str) : null;
                mVar.K(vVarH);
                objQ = vVarH;
            }
        }
        return (v) objQ;
    }

    public static final String K(b bVar) {
        String str;
        bVar.getClass();
        i iVar = (i) h0.d0(bVar.f141191i);
        return (iVar == null || (str = iVar.f141261b) == null) ? "" : str;
    }

    public static final ArrayList L(rf0.a aVar) {
        aVar.getClass();
        List<? extends gf0.f> list = aVar.f152388a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d0.v(arrayList, u.i0(((gf0.f) it.next()).f77063a));
        }
        return arrayList;
    }

    public static final ArrayList M(rf0.a aVar) {
        aVar.getClass();
        List<? extends gf0.h> list = aVar.f152389b;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((gf0.h) it.next()).f77072a);
        }
        return arrayList;
    }

    public static final String N(Exception exc, Context context) {
        LoggerFactory.getLogger("GeoLocationService").warn("locateMe: failed, fallback using SIM then default locale", (Throwable) exc);
        String strA = e.a(context);
        strA.getClass();
        ud2.b.f170019a.getClass();
        ud2.b.c(context, strA);
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static final r O(r rVar, e23.a aVar, String str, m mVar) {
        rVar.getClass();
        aVar.getClass();
        str.getClass();
        x1 x1Var = n.f135158a;
        boolean zB = mVar.B(str) | mVar.B(aVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new n8(str, aVar, 3);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new n8(str, aVar, 3);
                mVar.K(objQ);
            }
        }
        r rVarC = p5.v.c((l) objQ, rVar, true);
        long jZ = fb1.c.z(d92.b.f58623a, mVar);
        d92.b.f58625c.getClass();
        return u1.n.e(rVarC, jZ, k2.i.a(j92.b.f97899b.f97918c));
    }

    public static final f2 P(f2 f2Var, n0 n0Var) {
        f2Var.getClass();
        n0Var.getClass();
        return e0(f2Var, C(n0Var));
    }

    public static final boolean Q(rf0.a aVar) {
        aVar.getClass();
        return aVar.f152388a.isEmpty() && aVar.f152389b.isEmpty() && aVar.f152390c == null && aVar.f152391d == null;
    }

    public static final String R(String str, String str2, String str3) {
        return str3 != null ? am.j.o(str3, "');\n        ", p6.b.i("\n            document.getElementById('upc-frame').contentWindow.document.documentElement.style.setProperty('", str, "', '", str2, "', '")) : e0.g("\n            document.getElementById('upc-frame').contentWindow.document.documentElement.style.setProperty('", str, "', '", str2, "');\n        ");
    }

    public static final String S(py2.d dVar, py2.e eVar, py2.a aVar) {
        dVar.getClass();
        eVar.getClass();
        aVar.getClass();
        String str = "--color-" + eVar + "-" + dVar;
        py2.b bVar = py2.b.IMPORTANT;
        return bVar != null ? R(str, String.valueOf(aVar), String.valueOf(bVar)) : R(str, String.valueOf(aVar), null);
    }

    public static final void T(y yVar, String str, Bundle bundle) {
        yVar.getClass();
        lc.h0 h0VarB = yVar.b(str);
        if (h0VarB != null) {
            yVar.g(h0VarB.f111773b.f144346e, bundle);
        }
    }

    public static final void U(lx2.b bVar, String str, String str2) throws JSONException, UnexpectedResponseCodeException {
        String str3 = bVar.f115278a;
        URL url = new URL(a0.j("https://", str, "/userpreference-service/", str3));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Action.KEY_ATTRIBUTE, str3);
        jSONObject.put("value", bVar.f115279b);
        String string = jSONObject.toString();
        string.getClass();
        byte[] bytes = string.getBytes(d53.c.f57666b);
        bytes.getClass();
        qx2.c cVarB = rx2.a.b(true, FirebasePerformance.HttpMethod.PUT, url, str2, "application/json", bytes);
        if (cVarB.f148454c == 200) {
            t.u(cVarB);
            "SAMD#".concat("GCHttpClient");
        } else {
            new Throwable(cVarB.toString());
            "SAMD#".concat("GCHttpClient");
            throw new UnexpectedResponseCodeException(cVarB.f148454c, cVarB.f148456e, null, 4, null);
        }
    }

    public static void V(k0 k0Var, m0 m0Var, ot1.a aVar, fe feVar, int i14) {
        if ((i14 & 8) != 0) {
            feVar = null;
        }
        k0Var.getClass();
        m0Var.getClass();
        aVar.getClass();
        nc.n.b(k0Var, aVar.d(), aVar.b(), aVar.c(), null, null, null, null, new z3.e(1285240815, true, new i91.e(aVar, 21, m0Var, feVar)), 248);
    }

    public static final void W(TimePickerDialog timePickerDialog, Context context) {
        context.getClass();
        TextView textView = (TextView) timePickerDialog.findViewById(context.getResources().getIdentifier("input_hour", TtmlNode.ATTR_ID, "android"));
        TextView textView2 = (TextView) timePickerDialog.findViewById(context.getResources().getIdentifier("label_hour", TtmlNode.ATTR_ID, "android"));
        TextView textView3 = (TextView) timePickerDialog.findViewById(context.getResources().getIdentifier("input_minute", TtmlNode.ATTR_ID, "android"));
        TextView textView4 = (TextView) timePickerDialog.findViewById(context.getResources().getIdentifier("label_minute", TtmlNode.ATTR_ID, "android"));
        TextView textView5 = (TextView) timePickerDialog.findViewById(context.getResources().getIdentifier("input_separator", TtmlNode.ATTR_ID, "android"));
        if (c22.b.a(context) >= 1.5f) {
            float fB = c22.b.b(context, context.getResources().getDimensionPixelSize(R.dimen.andfont_h_3), 1.5f);
            float fB2 = c22.b.b(context, context.getResources().getDimensionPixelSize(R.dimen.andfont_body_2), 1.5f);
            if (textView != null) {
                textView.setTextSize(0, fB);
            }
            if (textView3 != null) {
                textView3.setTextSize(0, fB);
            }
            if (textView5 != null) {
                textView5.setTextSize(0, fB);
            }
            if (textView2 != null) {
                textView2.setTextSize(0, fB2);
            }
            if (textView4 != null) {
                textView4.setTextSize(0, fB2);
            }
        }
    }

    public static final Object X(Set set, Object obj, Object obj2, Enum r14, boolean z14) {
        Set setG1;
        Object obj3;
        if (!z14) {
            if (r14 != null && (setG1 = h0.g1(c1.i(set, r14))) != null) {
                set = setG1;
            }
            return h0.J0(set);
        }
        if (set.contains(obj)) {
            obj3 = obj;
        } else {
            obj3 = set.contains(obj2) ? obj2 : null;
        }
        if (s.g(obj3, obj) && s.g(r14, obj2)) {
            return null;
        }
        return r14 == null ? obj3 : r14;
    }

    public static final void Y(BubbleLayout bubbleLayout, String str) {
        bubbleLayout.getClass();
        String string = bubbleLayout.getContext().getString(R.string.lbl_tooltip_value, str);
        string.getClass();
        v22.e.f(bubbleLayout, string);
    }

    public static final p Z(int i14, int i15, boolean z14) {
        if (!z14 || i15 >= 5) {
            return i15 < i14 ? new p(Boolean.TRUE, Integer.valueOf(i14)) : new p(Boolean.FALSE, 0);
        }
        return new p(Boolean.TRUE, 5);
    }

    public static final void a(int i14, e23.a aVar, String str, m mVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1511294045);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            l72.c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.lbl_admin_setup_required), gl1.y.P(R.string.msg_admin_setup_emergency_calling, new Object[]{str}, o0VarE), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar, o0VarE, (i15 << 21) & 234881024, (i15 >> 3) & 14, 729);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uu1.i(str, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    public static final r a0(r rVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, String str, String str2, String str3, m mVar, int i14) {
        float f14;
        rVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        x1 x1Var = n.f135158a;
        if (z14) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f14 = j92.b.f97899b.f97918c;
        } else {
            f14 = 0;
            g6.f.a aVar4 = g6.f.f75994b;
        }
        x3 x3VarA = s1.f.a(f14, null, "", mVar, 384, 10);
        boolean z15 = ((((458752 & i14) ^ 196608) > 131072 && mVar.B(str)) || (i14 & 196608) == 131072) | ((((i14 & 896) ^ 384) > 256 && mVar.B(aVar)) || (i14 & 384) == 256) | ((((3670016 & i14) ^ 1572864) > 1048576 && mVar.B(str2)) || (i14 & 1572864) == 1048576) | ((((i14 & 7168) ^ 3072) > 2048 && mVar.B(aVar2)) || (i14 & 3072) == 2048) | ((((29360128 & i14) ^ 12582912) > 8388608 && mVar.B(str3)) || (i14 & 12582912) == 8388608) | ((((57344 & i14) ^ 24576) > 16384 && mVar.B(aVar3)) || (i14 & 24576) == 16384);
        Object objQ = mVar.q();
        if (z15) {
            t21.s sVar = new t21.s(str, str2, str3, aVar, aVar2, aVar3, 1);
            mVar.K(sVar);
            objQ = sVar;
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                t21.s sVar2 = new t21.s(str, str2, str3, aVar, aVar2, aVar3, 1);
                mVar.K(sVar2);
                objQ = sVar2;
            }
        }
        r rVarC = p5.v.c((l) objQ, rVar, true);
        long jZ = fb1.c.z(d92.b.f58623a, mVar);
        d92.b.f58625c.getClass();
        return w.a(u1.n.e(rVarC, jZ, k2.i.a(j92.b.f97899b.f97918c)), ((g6.f) x3VarA.getF182175a()).f75997a, null, false, 30);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    public static final void b(p0 p0Var, m mVar, int i14) {
        o0 o0VarE = mVar.E(1199918351);
        int i15 = (o0VarE.r(p0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.mobile_auth_title_unable_to_continue);
            String strQ2 = gl1.y.Q(o0VarE, R.string.msg_child_registration_failed);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new g(p0Var, 26);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(p0Var, 26);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s5.a(p0Var, i14, 10);
        }
    }

    public static final String b0(long j8, CharSequence charSequence) {
        return charSequence.subSequence(w0.h(j8), w0.g(j8)).toString();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    public static final void c(Long l14, e23.a aVar, e23.a aVar2, m mVar, int i14) {
        o0 o0Var;
        String string;
        String strP;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 91384124);
        int i15 = i14 | (o0VarP.B(l14) ? 4 : 2) | (o0VarP.r(aVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            new q42.h(context);
            context.getClass();
            if (l14 == null || l14.longValue() <= 0) {
                string = context.getString(R.string.no_value);
                string.getClass();
            } else {
                string = DateFormat.getTimeFormat(context).format(new Date(l14.longValue()));
                string.getClass();
            }
            k42.b.f102880a.getClass();
            if (k42.b.r()) {
                o0VarP.C(-584480688);
                strP = gl1.y.P(R.string.lbl_delete_value_weigh_in, new Object[]{string}, o0VarP);
                o0VarP.g0(false);
            } else {
                o0VarP.C(-584389672);
                strP = gl1.y.Q(o0VarP, R.string.lbl_delete_weight) + " ?";
                o0VarP.g0(false);
            }
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.lbl_delete);
            String strQ2 = gl1.y.Q(o0VarP, R.string.common_cancel);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarP.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new t21.a(aVar2, 21);
                o0VarP.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t21.a(aVar2, 21);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarP.q();
            if (z15) {
                objQ2 = new t21.a(aVar, 22);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new t21.a(aVar, 22);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            c1Var.a(false, null, strP, null, null, strQ, false, false, aVar4, strQ2, (e23.a) objQ2, o0Var, 6, 0, 218);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t42.c(l14, aVar, aVar2, i14, 0);
        }
    }

    public static final k c0(pt1.u uVar) {
        uVar.getClass();
        Uri uri = Uri.parse(uVar.f140986a);
        String str = uVar.f140988c;
        String str2 = str == null ? "" : str;
        String str3 = uVar.f140989d;
        return new k(uri, str3 == null ? "" : str3, str2, uVar.f140990e);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    public static final void d(int i14, e23.a aVar, String str, m mVar, boolean z14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(996321680);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(m0VarI) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ad0.f(aVar, m0VarI, z14, 20);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ad0.f(aVar, m0VarI, z14, 20);
                    o0VarE.K(objQ);
                }
            }
            nc.y.b(m0VarI, str, null, null, null, null, null, null, (l) objQ, o0VarE, (i15 << 3) & 112, 1020);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 12);
        }
    }

    public static final void d0(q53.w wVar, Object obj) {
        Object objI = wVar.i(obj);
        if (objI instanceof q53.m.c) {
            Object obj2 = ((q53.m) ge1.b.W(t13.h.f161748a, new o(wVar, obj, null))).f143000a;
        } else {
            q53.m.b bVar = q53.m.f142998b;
            Unit unit = Unit.INSTANCE;
            bVar.getClass();
        }
    }

    public static final void e(z3.e eVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(485037221);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            p3.v.a(t1.f91496n.c(g6.o.Ltr), z3.f.c(553314277, new aa2.o(eVar, 11), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final f2 e0(f2 f2Var, n0 n0Var) {
        f2Var.getClass();
        if (f2Var instanceof e2) {
            return e0(((e2) f2Var).getOrigin(), n0Var);
        }
        if (n0Var == null || n0Var.equals(f2Var)) {
            return f2Var;
        }
        if (f2Var instanceof p43.v0) {
            return new y0((p43.v0) f2Var, n0Var);
        }
        if (f2Var instanceof f0) {
            return new p43.h0((f0) f2Var, n0Var);
        }
        u0.r();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    public static final void f(b63.o oVar, o82.g gVar, boolean z14, boolean z15, e23.a aVar, m mVar, int i14) {
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(1775178069);
        int i15 = i14 | (o0VarE.r(oVar) ? 4 : 2) | (o0VarE.k(gVar == null ? -1 : gVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            c.p.f22335a.getClass();
            b.w wVarA = c.p.a(o0VarE);
            b.u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(m0VarI) | ((i15 & 57344) == 16384) | o0VarE.r(onBackPressedDispatcher);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new vv0.g(m0VarI, z15, aVar, onBackPressedDispatcher);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new vv0.g(m0VarI, z15, aVar, onBackPressedDispatcher);
                    o0VarE.K(objQ);
                }
            }
            z3.e eVarC = z3.f.c(1821891467, new ki1.f(z15, m0VarI, z14, (e23.a) objQ, aVar, oVar, gVar), o0VarE);
            o0Var = o0VarE;
            z02.b.a(false, null, null, null, false, eVarC, o0Var, 196608, 31);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u1(oVar, gVar, z14, z15, aVar, i14, 10);
        }
    }

    public static final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(-874032456);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uj1.a(i14, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    public static final void h(wj1.a aVar, l lVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar2, mVar, -1221432835);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarP.B(aVar) : o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        int i16 = 0;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.lbl_missing_phone_numbers);
            String strQ2 = gl1.y.Q(o0VarP, R.string.msg_missing_phone_numbers_assistance);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_ok);
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarP.r(aVar))) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new vj1.d(lVar, aVar, aVar2, i16);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new vj1.d(lVar, aVar, aVar2, i16);
                    o0VarP.K(objQ);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, 0, (i15 >> 6) & 14, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vj1.e(aVar, lVar, aVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    public static final void i(wj1.a aVar, l lVar, e23.a aVar2, m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar2, mVar, 379265739);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarP.B(aVar) : o0VarP.r(aVar) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar2) ? 256 : 128);
        int i16 = 1;
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarP, R.string.assistance_contacts_no_contacts_added_title);
            String strQ2 = gl1.y.Q(o0VarP, R.string.msg_no_assistance_contacts);
            String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_ok);
            boolean z14 = ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarP.r(aVar))) | ((i15 & 112) == 32) | ((i15 & 896) == 256);
            Object objQ = o0VarP.q();
            if (z14) {
                objQ = new vj1.d(lVar, aVar, aVar2, i16);
                o0VarP.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new vj1.d(lVar, aVar, aVar2, i16);
                    o0VarP.K(objQ);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, gl1.y.Q(o0VarP, R.string.lbl_cancel), aVar2, o0VarP, 0, (i15 >> 6) & 14, 217);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vj1.e(aVar, lVar, aVar2, i14, 1);
        }
    }

    public static final void j(m mVar, int i14) {
        o0 o0VarE = mVar.E(1745236071);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            t11.e.f161725a.getClass();
            h82.e.a(t11.e.f161726b, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 27);
        }
    }

    public static final void k(String str, i3 i3Var, boolean z14, u4.d dVar, e23.a aVar, l lVar, z3.e eVar, m mVar, int i14, int i15) {
        int i16;
        u4.d dVarA;
        u4.d dVar2;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1938357067);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(i3Var) : o0VarE.r(i3Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                dVarA = dVar;
                int i17 = o0VarE.B(dVarA) ? 2048 : 1024;
                i16 |= i17;
            } else {
                dVarA = dVar;
            }
            i16 |= i17;
        } else {
            dVarA = dVar;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = 1;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
                if ((i15 & 8) != 0) {
                    i16 &= -7169;
                }
            } else if ((i15 & 8) != 0) {
                int i19 = b3.a.f15501a;
                dVarA = c3.a.a();
                i16 &= -7169;
            }
            int i24 = i16;
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            u4.d dVar3 = dVarA;
            z02.d.a(z14, z3.f.c(-1309790960, new sg2.g((Object) str, (Object) dVar3, aVar, (Object) i3Var, (Object) lVar, 17), o0VarE), z3.f.c(836775505, new p21.b(feVar, 19), o0VarE), null, null, z3.f.c(-1313459692, new q(eVar, feVar, i18), o0VarE), o0VarE, ((i24 >> 6) & 14) | 197040, 24);
            dVar2 = dVar3;
        } else {
            o0VarE.e();
            dVar2 = dVarA;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(str, i3Var, z14, dVar2, aVar, lVar, eVar, i14, i15);
        }
    }

    public static final long l(int i14, int i15) {
        if (i14 < 0 || i15 < 0) {
            y5.a.a("start and end cannot be negative. [start: " + i14 + ", end: " + i15 + ']');
        }
        long j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
        w0.a aVar = w0.f157315b;
        return j8;
    }

    public static String m() {
        String str = new String();
        for (int i14 = 0; i14 < 58; i14 += 4) {
            StringBuilder sbK = e5.k(str);
            sbK.append("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#".charAt(i14));
            str = sbK.toString();
        }
        return str;
    }

    public static String n(String str, String str2) {
        try {
            PBEKeySpec pBEKeySpecO = o(str);
            byte[] bytes = str2.getBytes();
            byte[] bArrS = s();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpecO).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArrS));
            byte[] salt = pBEKeySpecO.getSalt();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            byteBufferAllocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            if (bArrArray == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer(bArrArray.length * 2);
            for (byte b14 : bArrArray) {
                stringBuffer.append("0123456789ABCDEF".charAt((b14 >> 4) & 15));
                stringBuffer.append("0123456789ABCDEF".charAt(b14 & Ascii.SI));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static PBEKeySpec o(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(oc.b.d("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static boolean p(Class cls) {
        return cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object q(ve2.e eVar, String str, v13.c cVar) {
        ud2.e eVar2;
        URL url;
        if (cVar instanceof ud2.e) {
            eVar2 = (ud2.e) cVar;
            int i14 = eVar2.f170033c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar2.f170033c = i14 - Integer.MIN_VALUE;
            } else {
                eVar2 = new ud2.e(cVar);
            }
        } else {
            eVar2 = new ud2.e(cVar);
        }
        Object obj = eVar2.f170032b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f170033c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                ud2.b.f170019a.getClass();
                URL url2 = new URL(ud2.b.b(eVar).concat("/geolocation/whereami/akamai"));
                LoggerFactory.getLogger("GeoLocationService").debug("locateMe {}", url2);
                Map mapB = t0.b(new p(HttpHeaders.USER_AGENT, p13.w.c(str)));
                eVar2.f170031a = url2;
                eVar2.f170033c = 1;
                Object objA = nd2.e.a(url2, mapB, eVar2);
                if (objA == aVar) {
                    return aVar;
                }
                obj = objA;
                url = url2;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                url = eVar2.f170031a;
                o13.r.b(obj);
            }
            nd2.b bVar = (nd2.b) obj;
            if (200 == bVar.f125409a) {
                byte[] bArr = bVar.f125411c;
                bArr.getClass();
                return new JSONObject(new String(bArr, d53.c.f57666b)).getString("country");
            }
            LoggerFactory.getLogger("GeoLocationService").warn("locateMe " + bVar.f125409a + StringUtils.SPACE + url);
            return null;
        } catch (Exception e4) {
            LoggerFactory.getLogger("GeoLocationService").warn("locateMe", (Throwable) e4);
            return null;
        }
    }

    public static String r(String str, String str2) {
        byte[] bArrDoFinal;
        int i14;
        try {
            PBEKeySpec pBEKeySpecO = o(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = i15 * 2;
                bArr[i15] = Integer.valueOf(str2.substring(i16, i16 + 2), 16).byteValue();
            }
            byte[] bArrS = s();
            if (length <= 16) {
                bArrDoFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpecO.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(bArrS));
                bArrDoFinal = cipher.doFinal(bArr, 16, length - 16);
            }
            if (bArrDoFinal == null) {
                throw new Exception();
            }
            String str3 = new String(bArrDoFinal);
            byte[] bytes = str3.getBytes();
            int length2 = bytes.length;
            while (i14 < length2) {
                byte b14 = bytes[i14];
                i14 = ((b14 < 0 || b14 > 31) && b14 < 127) ? i14 + 1 : 0;
                return null;
            }
            return str3;
        } catch (Exception unused) {
        }
    }

    public static byte[] s() {
        try {
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = 0; i14 < 48; i14 += 2) {
                sb3.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i14));
            }
            return oc.b.d(sb3.toString());
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static final void t(l lVar, Object obj, t13.g gVar) {
        UndeliveredElementException undeliveredElementExceptionU = u(lVar, obj, null);
        if (undeliveredElementExceptionU != null) {
            kotlinx.coroutines.a.a(undeliveredElementExceptionU, gVar);
        }
    }

    public static final UndeliveredElementException u(l lVar, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th3) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th3) {
                return new UndeliveredElementException(e5.f(obj, "Exception in undelivered element handler for "), th3);
            }
            o13.g.a(undeliveredElementException, th3);
            return undeliveredElementException;
        }
    }

    public static final void v(q53.v vVar, Throwable th3) {
        CancellationException cancellationExceptionA = th3 instanceof CancellationException ? (CancellationException) th3 : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = gl1.d.a("Channel was consumed, consumer had failed", th3);
        }
        vVar.c(cancellationExceptionA);
    }

    public static final void w(TimePickerDialog timePickerDialog, Context context) {
        context.getClass();
        int color = a7.b.getColor(context, R.color.gcm_text_primary);
        TextView textView = (TextView) timePickerDialog.findViewById(Resources.getSystem().getIdentifier("input_header", TtmlNode.ATTR_ID, "android"));
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public static final long x(int i14, int i15, long j8) {
        w0.a aVar = w0.f157315b;
        int i16 = (int) (j8 >> 32);
        int i17 = i16 < i14 ? i14 : i16;
        if (i17 > i15) {
            i17 = i15;
        }
        int i18 = (int) (4294967295L & j8);
        if (i18 >= i14) {
            i14 = i18;
        }
        if (i14 <= i15) {
            i15 = i14;
        }
        return (i17 == i16 && i15 == i18) ? j8 : l(i17, i15);
    }

    public static final List y(h5 h5Var) {
        h5Var.getClass();
        List list = f131966a;
        if (list != null) {
            return list;
        }
        u4.d dVarC = z62.l.f202765a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("PhotoRotateRight", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i14 = h1.f128864c;
            u4.e eVarK = tn.k.k(16.7514f, 5.4401f, 12.89f, 2.0f, 4.646f);
            eVarK.g(8.3067f);
            eVarK.d(5.9294f, 4.646f, 4.0f, 6.5838f, 4.0f, 8.9713f);
            sn.a.A(eVarK, 4.0f, 13.9574f, 5.7227f, 8.9713f);
            eVarK.d(5.7227f, 7.5411f, 6.8826f, 6.3762f, 8.3067f, 6.3762f);
            eVarK.g(12.89f);
            eVarK.o(8.8939f);
            eVarK.i(16.7514f, 5.4401f);
            eVarK.c();
            u4.d.a.b(aVar2, eVarK.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL = z.l(18.3831f, 12.2158f, 10.258f, 20.3761f, 18.3831f);
            eVarL.o(12.2158f);
            eVarL.c();
            eVarL.k(8.6411f, 10.5919f);
            eVarL.o(22.0f);
            z.r(eVarL, 20.0f, 10.5919f, 8.6411f);
            u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            z62.l.f202765a = dVarC;
        }
        u4.d dVar = dVarC;
        u4.d dVarC2 = z62.k.f202764a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("PhotoRotateLeft", f15, f15, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarK2 = tn.k.k(7.2486f, 5.4401f, 11.11f, 2.0f, 4.646f);
            eVarK2.g(15.6933f);
            eVarK2.d(18.0706f, 4.646f, 20.0f, 6.5838f, 20.0f, 8.9713f);
            sn.a.A(eVarK2, 20.0f, 13.9574f, 18.2773f, 8.9713f);
            eVarK2.d(18.2773f, 7.5411f, 17.1174f, 6.3762f, 15.6933f, 6.3762f);
            eVarK2.g(11.11f);
            eVarK2.o(8.8939f);
            eVarK2.i(7.2486f, 5.4401f);
            eVarK2.c();
            u4.d.a.b(aVar4, eVarK2.f168407a, i15, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL2 = z.l(5.6169f, 12.2158f, 13.742f, 20.3761f, 5.6169f);
            eVarL2.o(12.2158f);
            eVarL2.c();
            eVarL2.k(15.3589f, 10.5919f);
            eVarL2.o(22.0f);
            z.r(eVarL2, 4.0f, 10.5919f, 15.3589f);
            u4.d.a.b(aVar4, eVarL2.f168407a, i15, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            z62.k.f202764a = dVarC2;
        }
        u4.d dVar2 = dVarC2;
        u4.d dVarC3 = z62.i.f202762a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("PhotoCropRotate", f16, f16, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i16 = h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(14.9235f, 16.4225f, 14.9235f, 19.1312f);
            eVarM.i(16.4228f, 19.1312f);
            eVarM.i(16.4228f, 16.5225f);
            eVarM.i(19.0215f, 16.5225f);
            eVarM.i(19.0215f, 15.0232f);
            eVarM.i(16.3528f, 15.0232f);
            eVarM.i(16.3528f, 7.6969f);
            eVarM.i(9.0665f, 7.6969f);
            eVarM.i(9.0665f, 5.0382f);
            eVarM.i(7.5672f, 5.0382f);
            eVarM.i(7.5672f, 7.6469f);
            eVarM.i(4.9585f, 7.6469f);
            eVarM.i(4.9585f, 9.1462f);
            eVarM.i(7.6272f, 9.1462f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 7.6272f, 16.4225f, 14.9235f, 16.4225f);
            eVarM.k(14.8636f, 9.2062f);
            eVarM.i(14.8636f, 14.9233f);
            eVarM.i(9.1464f, 14.9233f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 9.1464f, 9.2062f, 14.8636f, 9.2062f);
            u4.d.a.b(aVar6, eVarM.f168407a, i16, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(9.5962f, 21.9898f, 12.5047f, 19.551f);
            eVarM2.i(9.5962f, 17.1122f);
            eVarM2.i(9.5962f, 18.7514f);
            eVarM2.d(8.3368f, 18.7914f, 7.2573f, 18.7114f, 6.4577f, 18.1617f);
            eVarM2.d(5.6382f, 17.592f, 4.9085f, 16.3626f, 4.9285f, 13.444f);
            eVarM2.i(3.4293f, 13.444f);
            eVarM2.d(3.3993f, 16.5525f, 4.1789f, 18.4115f, 5.5982f, 19.4011f);
            eVarM2.d(6.7976f, 20.2306f, 8.2968f, 20.3006f, 9.5862f, 20.2706f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM2, 9.5862f, 21.9998f, 9.5962f, 21.9898f);
            u4.d.a.b(aVar6, eVarM2.f168407a, i16, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(14.4138f, 5.2381f);
            eVarL3.d(15.6731f, 5.1982f, 16.7526f, 5.2781f, 17.5522f, 5.8278f);
            eVarL3.d(18.3718f, 6.3976f, 19.1014f, 7.6269f, 19.0814f, 10.5455f);
            eVarL3.i(20.5707f, 10.5455f);
            eVarL3.d(20.6007f, 7.437f, 19.8211f, 5.578f, 18.4018f, 4.5985f);
            eVarL3.d(17.2024f, 3.7689f, 15.7031f, 3.6989f, 14.4138f, 3.7289f);
            eVarL3.i(14.4138f, 1.9998f);
            eVarL3.i(11.5052f, 4.4385f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL3, 14.4138f, 6.8773f, 14.4138f, 5.2381f);
            u4.d.a.b(aVar6, eVarL3.f168407a, i16, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            z62.i.f202762a = dVarC3;
        }
        u4.d dVar3 = dVarC3;
        u4.d dVarC4 = z62.e.f202758a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("Barcode", f17, f17, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarF = z.f(h1.f128863b, 7.96f, 3.0f, 4.5299f, 4.536f);
            e0.y(eVarF, 7.9324f, 3.0f, 3.0f, 7.96f);
            u4.d.a.b(aVar8, eVarF.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM3 = com.nimbusds.jose.shaded.gson.internal.a.m(7.96f, 21.0f, 7.96f, 19.4701f);
            eVarM3.i(4.536f, 19.4701f);
            eVarM3.i(4.536f, 16.0676f);
            eVarM3.g(3.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM3, 3.0f, 21.0f, 7.96f, 21.0f);
            u4.d.a.b(aVar8, eVarM3.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ = z.q(16.04f, 21.0f, 19.4701f, 19.464f, 16.0676f);
            z.r(eVarQ, 21.0f, 21.0f, 16.04f);
            u4.d.a.b(aVar8, eVarQ.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarK3 = q2.k(16.04f, 3.0f, 4.5299f, 19.464f, 4.5299f);
            z.o(eVarK3, 7.9324f, 21.0f, 3.0f);
            eVarK3.i(16.04f, 3.0f);
            eVarK3.c();
            u4.d.a.b(aVar8, eVarK3.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ2 = z.q(9.0209f, 7.0f, 17.0f, 7.0016f, 7.0f);
            eVarQ2.g(9.0209f);
            eVarQ2.c();
            u4.d.a.b(aVar8, eVarQ2.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var13 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ3 = z.q(17.0016f, 7.0f, 17.0f, 15.9919f, 7.0f);
            eVarQ3.g(17.0016f);
            eVarQ3.c();
            u4.d.a.b(aVar8, eVarQ3.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var14 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ4 = z.q(11.607f, 7.0f, 17.0f, 10.5973f, 7.0f);
            eVarQ4.g(11.607f);
            eVarQ4.c();
            u4.d.a.b(aVar8, eVarQ4.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarQ5 = z.q(14.5022f, 7.0f, 17.0f, 12.4828f, 7.0f);
            eVarQ5.g(14.5022f);
            eVarQ5.c();
            u4.d.a.b(aVar8, eVarQ5.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            z62.e.f202758a = dVarC4;
        }
        u4.d dVar4 = dVarC4;
        u4.d dVarA = z62.a.a(h5Var);
        u4.d dVarA2 = z62.b.a(h5Var);
        u4.d dVarC5 = z62.c.f202756a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("AspectRatio916Landscape", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var16 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL4 = b71.i.l(h1.f128863b, 22.0f, 17.625f, 2.0f, 17.625f);
            eVarL4.i(2.0f, 6.375f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 22.0f, 6.375f, 22.0f, 17.625f);
            eVarL4.k(4.0f, 8.375f);
            eVarL4.i(4.0f, 15.625f);
            eVarL4.i(20.0f, 15.625f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL4, 20.0f, 8.375f, 4.0f, 8.375f);
            u4.d.a.b(aVar10, eVarL4.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            z62.c.f202756a = dVarC5;
        }
        u4.d dVar5 = dVarC5;
        u4.d dVarA3 = z62.d.a(h5Var);
        u4.d dVarC6 = z62.h.f202761a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("Gallery", f19, f19, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var17 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL5 = b71.i.l(h1.f128863b, 11.6318f, 14.6875f, 13.252f, 13.4111f);
            tn.k.r(eVarL5, 15.3359f, 15.5967f, 17.416f, 5.334f);
            eVarL5.o(14.2334f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL5, 8.251f, 11.291f, 11.6318f, 14.6875f);
            u4.d.a.b(aVar12, eVarL5.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var18 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL6 = com.nimbusds.jose.shaded.gson.internal.a.l(11.6514f, 9.9141f);
            eVarL6.d(12.2958f, 9.9141f, 12.8184f, 10.4231f, 12.8184f, 11.0508f);
            eVarL6.d(12.8183f, 11.6784f, 12.2958f, 12.1875f, 11.6514f, 12.1875f);
            eVarL6.d(11.0071f, 12.1874f, 10.4844f, 11.6784f, 10.4844f, 11.0508f);
            eVarL6.d(10.4844f, 10.4231f, 11.007f, 9.9142f, 11.6514f, 9.9141f);
            eVarL6.c();
            u4.d.a.b(aVar12, eVarL6.f168407a, 0, t1Var18, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var19 = new o4.t1(o4.f0.d(4278190080L), jVar);
            int i17 = h1.f128864c;
            u4.e eVarL7 = z.l(18.6699f, 20.75f, 2.0f, 6.5801f, 18.6699f);
            e0.w(eVarL7, 20.75f, 3.6494f, 19.083f, 16.9922f);
            z.v(eVarL7, 8.2471f, 3.6494f, 19.083f);
            u4.d.a.b(aVar12, eVarL7.f168407a, i17, t1Var19, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var20 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL8 = z.l(22.0f, 17.416f, 20.333f, 4.916f, 6.167f);
            z.v(eVarL8, 3.25f, 22.0f, 17.416f);
            u4.d.a.b(aVar12, eVarL8.f168407a, 0, t1Var20, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            z62.h.f202761a = dVarC6;
        }
        u4.d dVar6 = dVarC6;
        u4.d dVarC7 = z62.f.f202759a;
        if (dVarC7 == null) {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("FrameStepBack", f22, f22, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var21 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL9 = b71.i.l(h1.f128863b, 15.0f, 21.2803f, 2.0f, 11.9951f);
            sn.a.w(eVarL9, 15.0f, 2.71f, 21.2803f);
            eVarL9.k(22.0f, 2.71f);
            eVarL9.o(21.2803f);
            eVarL9.g(18.4297f);
            e0.p(eVarL9, 2.71f, 22.0f);
            u4.d.a.b(aVar14, eVarL9.f168407a, 0, t1Var21, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            z62.f.f202759a = dVarC7;
        }
        u4.d dVar7 = dVarC7;
        u4.d dVarC8 = z62.g.f202760a;
        if (dVarC8 == null) {
            float f24 = (float) 24.0d;
            g6.f.a aVar15 = g6.f.f75994b;
            u4.d.a aVar16 = new u4.d.a("FrameStepForward", f24, f24, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var22 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL10 = b71.i.l(h1.f128863b, 9.0f, 21.2803f, 22.0f, 11.9951f);
            sn.a.w(eVarL10, 9.0f, 2.71f, 21.2803f);
            eVarL10.k(2.0f, 2.71f);
            eVarL10.o(21.2803f);
            eVarL10.g(5.5703f);
            e0.p(eVarL10, 2.71f, 2.0f);
            u4.d.a.b(aVar16, eVarL10.f168407a, 0, t1Var22, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC8 = aVar16.c();
            z62.g.f202760a = dVarC8;
        }
        u4.d dVar8 = dVarC8;
        u4.d dVarA4 = z62.m.a(h5Var);
        u4.d dVarC9 = z62.j.f202763a;
        if (dVarC9 == null) {
            float f25 = (float) 24.0d;
            g6.f.a aVar17 = g6.f.f75994b;
            u4.d.a aVar18 = new u4.d.a("PhotoRequest", f25, f25, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var23 = new o4.t1(o4.f0.d(4278190080L), jVar);
            o4.u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarL11 = b71.i.l(h1.f128863b, 22.0f, 17.5355f, 17.9893f, 21.4623f);
            eVarL11.i(17.0449f, 20.5385f);
            sn.a.A(eVarL11, 19.4443f, 18.1898f, 13.5439f, 16.8802f);
            eVarL11.g(19.4424f);
            eVarL11.i(17.0449f, 14.5336f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarL11, 17.9893f, 13.6097f, 22.0f, 17.5355f);
            u4.d.a.b(aVar18, eVarL11.f168407a, 0, t1Var23, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var24 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL12 = z.l(16.2949f, 13.1097f, 14.7061f, 8.3451f, 3.5879f);
            z.y(eVarL12, 17.0804f, 11.5293f, 18.6693f, 2.0f);
            z.v(eVarL12, 6.7562f, 16.2949f, 13.1097f);
            u4.d.a.b(aVar18, eVarL12.f168407a, 0, t1Var24, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var25 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM4 = com.nimbusds.jose.shaded.gson.internal.a.m(10.1768f, 13.182f, 11.4639f, 12.101f);
            tn.k.r(eVarM4, 13.1182f, 13.9515f, 15.4926f, 5.1768f);
            eVarM4.o(12.7972f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM4, 7.4932f, 10.3051f, 10.1768f, 13.182f);
            u4.d.a.b(aVar18, eVarM4.f168407a, 0, t1Var25, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var26 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL13 = com.nimbusds.jose.shaded.gson.internal.a.l(10.1924f, 9.139f);
            eVarL13.d(10.7041f, 9.139f, 11.1191f, 9.5703f, 11.1191f, 10.1019f);
            eVarL13.d(11.119f, 10.6335f, 10.704f, 11.0648f, 10.1924f, 11.0648f);
            eVarL13.d(9.681f, 11.0645f, 9.2667f, 10.6333f, 9.2666f, 10.1019f);
            eVarL13.d(9.2666f, 9.5705f, 9.681f, 9.1394f, 10.1924f, 9.139f);
            eVarL13.c();
            u4.d.a.b(aVar18, eVarL13.f168407a, 0, t1Var26, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var27 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL14 = z.l(19.4707f, 9.934f, 17.8828f, 5.1693f, 5.1768f);
            z.v(eVarL14, 3.5804f, 19.4707f, 9.934f);
            u4.d.a.b(aVar18, eVarL14.f168407a, 0, t1Var27, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC9 = aVar18.c();
            z62.j.f202763a = dVarC9;
        }
        List listK = x.k(dVar, dVar2, dVar3, dVar4, dVarA, dVarA2, dVar5, dVarA3, dVar6, dVar7, dVar8, dVarA4, dVarC9);
        f131966a = listK;
        listK.getClass();
        return listK;
    }

    public static final p z(rf0.a aVar) {
        aVar.getClass();
        LocalDate localDate = aVar.f152391d;
        LocalDate localDate2 = aVar.f152390c;
        if (localDate != null && localDate2 == null) {
            localDate2 = new LocalDate(2021, 1, 1);
        }
        LocalDate localDate3 = aVar.f152390c;
        LocalDate localDateNow = aVar.f152391d;
        if (localDate3 != null && localDateNow == null) {
            localDateNow = LocalDate.now();
            localDateNow.getClass();
        }
        return new p(localDate2, localDateNow);
    }
}
