package oe2;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.view.b1;
import c2.m0;
import c2.n3;
import c22.j0;
import c22.m3;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.perf.util.Constants;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.t1;
import kotlin.t3;
import lc.u0;
import o4.h1;
import o4.u1;
import o4.v1;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.math.MathKt;
import p13.h0;
import p3.o0;
import p3.p2;
import p3.x1;
import p43.f2;
import p43.i1;
import p43.k1;
import p43.q0;
import p43.v0;
import ps.a1;
import ps.a2;
import r1.q2;
import s5.w0;
import v62.e5;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f131485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f131486b;

    public static final boolean A(ps.r rVar) {
        Integer numQ;
        rVar.getClass();
        a1 a1VarR = rVar.getMetadataDTO();
        return ((a1VarR == null || (numQ = a1VarR.getDeviceApplicationInstallationId()) == null) ? 0 : numQ.intValue()) > 0;
    }

    public static final boolean B(ps.r rVar) {
        a1 a1VarR = rVar != null ? rVar.getMetadataDTO() : null;
        if ((a1VarR != null ? a1VarR.getEBikeBatteryUsage() : -1) > -1) {
            return (a1VarR != null ? a1VarR.getEBikeBatteryRemaining() : -1) > -1;
        }
        return false;
    }

    public static final boolean C(ps.r rVar) {
        rVar.getClass();
        a1 a1VarR = rVar.getMetadataDTO();
        if (a1VarR != null) {
            return p005kotlin.jvm.internal.s.g(a1VarR.getHasHighResolutionLocationData(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean D(ps.r rVar) {
        rVar.getClass();
        a1 a1VarR = rVar.getMetadataDTO();
        if (a1VarR != null) {
            return p005kotlin.jvm.internal.s.g(a1VarR.getHasIntensityIntervals(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean E(ps.r rVar) {
        a1 a1VarR;
        if (rVar == null || (a1VarR = rVar.getMetadataDTO()) == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(a1VarR.getHasSplits(), Boolean.TRUE);
    }

    public static final f2 F(ArrayList arrayList) {
        v0 v0Var;
        int size = arrayList.size();
        if (size == 0) {
            vb.h.z("Expected some types");
            return null;
        }
        if (size == 1) {
            return (f2) h0.H0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z14 = false;
        boolean z15 = false;
        while (it.hasNext()) {
            f2 f2Var = (f2) it.next();
            z14 = z14 || o72.t.R(f2Var);
            if (f2Var instanceof v0) {
                v0Var = (v0) f2Var;
            } else {
                if (!(f2Var instanceof p43.f0)) {
                    u0.r();
                    return null;
                }
                if (f2Var instanceof p43.b0) {
                    return f2Var;
                }
                v0Var = ((p43.f0) f2Var).f135829b;
                z15 = true;
            }
            arrayList2.add(v0Var);
        }
        if (z14) {
            return r43.l.c(r43.k.f150385z, arrayList.toString());
        }
        if (!z15) {
            return q43.x.f142818a.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(oi0.c.Y((f2) it3.next()));
        }
        q43.x xVar = q43.x.f142818a;
        return q0.b(xVar.b(arrayList2), xVar.b(arrayList3));
    }

    public static final boolean G(ps.r rVar) {
        a1 a1VarR;
        return (rVar == null || (a1VarR = rVar.getMetadataDTO()) == null || !a1VarR.getIsFavorite()) ? false : true;
    }

    public static final boolean H(int i14, int i15) {
        return (i14 & i15) == i15;
    }

    public static final boolean I(ps.r rVar) {
        rVar.getClass();
        a1 a1VarR = rVar.getMetadataDTO();
        if (a1VarR != null) {
            return p005kotlin.jvm.internal.s.g(a1VarR.getIsManualActivity(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean J(ps.r rVar) {
        Long lZ;
        return (rVar == null || (lZ = rVar.getUserProfileId()) == null || lZ.longValue() != ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk())) ? false : true;
    }

    public static final boolean K(ps.r rVar) {
        a1 a1VarR = rVar.getMetadataDTO();
        if (a1VarR != null) {
            return p005kotlin.jvm.internal.s.g(a1VarR.getPersonalRecord(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean L(ps.r rVar) {
        a1 a1VarR;
        if (rVar == null || (a1VarR = rVar.getMetadataDTO()) == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(a1VarR.getIsActivityTrimmed(), Boolean.TRUE);
    }

    public static final String M(String str, String str2, String str3) {
        return str3 != null ? am.j.o(str3, "');\n        ", p6.b.i("\n            document.documentElement.style.setProperty('", str, "', '", str2, "', '")) : v.e0.g("\n            document.documentElement.style.setProperty('", str, "', '", str2, "');\n        ");
    }

    public static final String N(py2.d dVar, py2.e eVar, py2.a aVar) {
        dVar.getClass();
        eVar.getClass();
        aVar.getClass();
        String str = "--color-" + eVar + "-" + dVar;
        py2.b bVar = py2.b.IMPORTANT;
        return bVar != null ? M(str, String.valueOf(aVar), String.valueOf(bVar)) : M(str, String.valueOf(aVar), null);
    }

    public static final Typeface O(Context context) {
        context.getClass();
        Typeface typefaceCreate = Typeface.create(Typeface.createFromAsset(context.getAssets(), "fonts/Oswald.ttf"), Constants.FROZEN_FRAME_TIME, false);
        typefaceCreate.getClass();
        return typefaceCreate;
    }

    public static final Typeface P(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Oswald-Medium.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    public static final Typeface Q(Context context) {
        context.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Oswald-SemiBold.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    public static final k1 R(k1 k1Var, u23.h hVar) {
        k1 k1VarA;
        k1Var.getClass();
        hVar.getClass();
        if (p43.r.a(k1Var) == hVar) {
            return k1Var;
        }
        p43.q qVar = (p43.q) p43.r.f135909b.getValue(k1Var, p43.r.f135908a[0]);
        if (qVar != null) {
            if (k1Var.isEmpty()) {
                k1VarA = k1Var;
            } else {
                Iterable iterable = k1Var.f181997a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!p005kotlin.jvm.internal.s.g((i1) obj, qVar)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == k1Var.f181997a.a()) {
                    k1VarA = k1Var;
                } else {
                    k1.f135863b.getClass();
                    k1VarA = k1.a.a(arrayList);
                }
            }
            if (k1VarA != null) {
                k1Var = k1VarA;
            }
        }
        return (hVar.iterator().hasNext() || !hVar.isEmpty()) ? k1Var.d(new p43.q(hVar)) : k1Var;
    }

    public static final Typeface S(Context context) {
        context.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    public static final Typeface T(Context context) {
        context.getClass();
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto.ttf");
        typefaceCreateFromAsset.getClass();
        return typefaceCreateFromAsset;
    }

    public static final double U(double d14) {
        Double dValueOf = Double.valueOf(d14);
        if (Double.isNaN(dValueOf.doubleValue())) {
            dValueOf = null;
        }
        return ((double) MathKt.b((dValueOf != null ? dValueOf.doubleValue() : 0.0d) * 1000.0d)) / 1000.0d;
    }

    public static final float V(float f14) {
        Float fValueOf = Float.valueOf(f14);
        if (Float.isNaN(fValueOf.floatValue())) {
            fValueOf = null;
        }
        return MathKt.c((fValueOf != null ? fValueOf.floatValue() : 0.0f) * 1000.0f) / 1000.0f;
    }

    public static final double W(double d14) {
        double d15 = 100;
        double d16 = ((double) ((int) (d14 * d15))) / 100.0d;
        int i14 = (int) d16;
        int i15 = ((int) (((double) 10) * d16)) % 10;
        if (((int) Math.rint(d16 * d15)) % 10 != 0) {
            i15++;
        }
        return (((double) i15) / 10.0d) + ((double) i14);
    }

    public static final void X(androidx.appcompat.app.e eVar) {
        eVar.getClass();
        TextView textViewX = x(eVar);
        if (textViewX != null) {
            textViewX.setAutoSizeTextTypeUniformWithConfiguration(8, 64, 1, 2);
        }
        View viewFindViewById = eVar.findViewById(R.id.message);
        TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
        if (textView != null) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(8, 64, 1, 2);
        }
    }

    public static final void Y(TextView textView, String str, Intent intent) {
        textView.getClass();
        int i14 = 0;
        int iH = d53.w.H(str, "<link>", 0, false, 6);
        int iH2 = d53.w.H(str, "</link>", 0, false, 6) - 6;
        if (iH < 0 || iH > iH2) {
            iH2 = str.length();
        } else {
            str = d53.u.v(d53.u.v(str, "<link>", "", false), "</link>", "", false);
            i14 = iH;
        }
        SpannableString spannableString = new SpannableString(str);
        Context context = textView.getContext();
        context.getClass();
        spannableString.setSpan(new v22.a(context, intent, com.garmin.android.apps.connectmobile.R.color.gcm_text_primary_action_selector), i14, iH2, 17);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    public static final void Z(TextView textView, int i14, String str) {
        textView.getClass();
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        String string = textView.getContext().getString(i14);
        string.getClass();
        Y(textView, string, intent);
    }

    public static final void a(rx0.b bVar, boolean z14, e23.a aVar, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1820286041);
        int i15 = (o0VarE.h(z14) ? 32 : 16) | i14 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(149512862, new a42.e(z14, aVar, 18), o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            m0 m0VarB = n3.b(0.0f, 0.0f, 0.0f, 0, 7);
            rx0.a.f154943a.getClass();
            z02.d.a(false, eVarC, null, null, m0VarB, rx0.a.f154945c, o0VarE, 196656, 13);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.l(bVar, z14, aVar, i14, 2);
        }
    }

    public static final void a0(int i14, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Error code: " + i14);
        sb3.append(", message: ".concat(str));
        throw new SQLException(sb3.toString());
    }

    public static final void b(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-813667009);
        int i15 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(-875187758, new t11.f((t3) o0VarE.A(t1.f91501s), i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sv0.b(i14, 26);
        }
    }

    public static final ve2.j b0(String str) {
        Object next;
        w13.c cVar = ve2.j.f177750f;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((ve2.j) next).f177751a, str)) {
                return (ve2.j) next;
            }
        }
        next = null;
        return (ve2.j) next;
    }

    public static String c(String str) {
        try {
            if (oi0.c.g(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb3 = new StringBuilder();
            for (byte b14 : bArrDigest) {
                sb3.append(String.format("%02x", Byte.valueOf(b14)));
            }
            return sb3.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final cy0.k c0(sy0.j jVar) {
        String str;
        Long lJ;
        jVar.getClass();
        String str2 = jVar.f161226a;
        String str3 = str2 == null ? "" : str2;
        List listC = null;
        String strB = j0.b(new DateTime(jVar.f161227b, DateTimeZone.getDefault()), "yyyy-MM-dd", null);
        String str4 = strB == null ? "" : strB;
        String strB2 = j0.b(new DateTime(jVar.f161228c, DateTimeZone.getDefault()), "yyyy-MM-dd", null);
        String str5 = strB2 == null ? "" : strB2;
        String str6 = jVar.f161231f.f161256a;
        boolean z14 = jVar.f161232g;
        sy0.f fVar = jVar.f161230e;
        if (fVar != null && (str = fVar.f161211a) != null && (lJ = d53.t.j(str)) != null) {
            listC = p13.w.c(Long.valueOf(lJ.longValue()));
        }
        List list = listC;
        i53.e<ActivityListItemDTO> eVar = jVar.f161229d;
        ArrayList arrayList = new ArrayList(p13.y.r(eVar, 10));
        Iterator<ActivityListItemDTO> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().f29250b));
        }
        return new cy0.k(null, null, str3, null, str4, str5, null, str6, z14, list, arrayList, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f A[LOOP:0: B:21:0x0050->B:25:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(b5.c r7, v13.a r8) {
        /*
            boolean r0 = r8 instanceof p2.a
            if (r0 == 0) goto L13
            r0 = r8
            p2.a r0 = (p2.a) r0
            int r1 = r0.f134979c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134979c = r1
            goto L18
        L13:
            p2.a r0 = new p2.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f134978b
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f134979c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            b5.c r7 = r0.f134977a
            o13.r.b(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L30:
            o13.r.b(r8)
        L33:
            r0.f134977a = r7
            r0.f134979c = r3
            b5.s r8 = b5.s.Main
            java.lang.Object r8 = r7.W0(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            b5.q r8 = (b5.q) r8
            int r2 = r8.f15873d
            java.util.List<b5.a0> r8 = r8.f15870a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            b5.a0 r6 = (b5.a0) r6
            boolean r6 = b5.r.a(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.f.d(b5.c, v13.a):java.lang.Object");
    }

    public static final int d0(double d14, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Double.valueOf(Math.abs(d14 - ((Number) it.next()).doubleValue())));
        }
        return arrayList2.indexOf(h0.u0(arrayList2));
    }

    public static final void e(androidx.appcompat.app.e eVar, float f14) {
        Context context;
        if (eVar == null || (context = eVar.getContext()) == null || c22.b.a(context) <= f14) {
            return;
        }
        Button buttonE = eVar.e(-1);
        ViewParent parent = buttonE != null ? buttonE.getParent() : null;
        if (parent instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) parent;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(8388613);
        }
    }

    public static final qs1.n e0(j23.l lVar, m3 m3Var) {
        m3Var.getClass();
        return new qs1.n(lVar.f96796a, lVar.f96797b, m3Var);
    }

    public static final ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList arrayList3 = (ArrayList) it.next();
            Double d14 = (Double) h0.d0(arrayList3);
            com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var = null;
            Long lValueOf = d14 != null ? Long.valueOf(MathKt.d(d14.doubleValue())) : null;
            Double d15 = (Double) h0.e0(1, arrayList3);
            Double d16 = (Double) h0.e0(2, arrayList3);
            if (lValueOf != null && d15 != null && d16 != null) {
                a0Var = new com.garmin.android.apps.connectmobile.activities.newmodel.a0(d15.doubleValue(), d16.doubleValue(), lValueOf.longValue());
            }
            if (a0Var != null) {
                arrayList2.add(a0Var);
            }
        }
        return arrayList2;
    }

    public static final void f0(androidx.appcompat.app.e eVar, String... strArr) {
        eVar.getClass();
        AlertController.RecycleListView recycleListView = eVar.f4658a.f4596g;
        if (recycleListView != null) {
            recycleListView.post(new r0.h(27, strArr, eVar));
        }
    }

    public static final Integer g(int i14, Integer num) {
        if (num == null) {
            return null;
        }
        if (i14 <= 0 || num.intValue() <= 0) {
            return 0;
        }
        return Integer.valueOf((int) Math.floor((((double) num.intValue()) / ((double) i14)) * ((double) 100)));
    }

    public static final void g0(androidx.appcompat.app.e eVar, String str, String str2) {
        eVar.getClass();
        str.getClass();
        str2.getClass();
        TextView textViewX = x(eVar);
        if (textViewX == null) {
            eVar.setTitle(str);
        } else {
            textViewX.setText(str);
            textViewX.setContentDescription(str2);
        }
    }

    public static final void h(View view2) {
        view2.getClass();
        c53.k kVarA = c53.n.a(new c53.m(new b1(view2, null)).f24571a);
        while (kVarA.hasNext()) {
            ArrayList<r7.a> arrayList = v((View) kVarA.next()).f151034a;
            for (int iJ = p13.x.j(arrayList); -1 < iJ; iJ--) {
                arrayList.get(iJ).a();
            }
        }
    }

    public static final rm1.b h0(rm1.b bVar) {
        DateTime dateTime = bVar.f153532a;
        DateTimeZone zone = dateTime.getZone();
        DateTime dateTime2 = bVar.f153533b;
        if (p005kotlin.jvm.internal.s.g(zone, dateTime2.getZone())) {
            return bVar;
        }
        DateTime dateTimeWithZone = dateTime.withZone(dateTime2.getZone());
        dateTimeWithZone.getClass();
        return rm1.b.a(bVar, dateTimeWithZone);
    }

    public static final void i(int i14) {
        if (i14 >= 1) {
            return;
        }
        vb.h.x(am.j.h(i14, "Expected positive parallelism level, but got "));
    }

    public static final double j(double d14, double d15) {
        if (d14 >= d15) {
            return W(d15);
        }
        return (((double) (((int) (d14 * ((double) 10))) % 10)) / 10.0d) + ((double) ((int) d14));
    }

    public static final Object k(MapViewportState mapViewportState, List list, v13.c cVar) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ne2.p.i((ke2.b) it.next()));
        }
        return MapViewportState.cameraForCoordinates$default(mapViewportState, arrayList, null, new EdgeInsets(100.0d, 100.0d, 100.0d, 100.0d), null, null, cVar, 26, null);
    }

    public static final File l(Context context, String str) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final String m(String str, l63.e eVar) {
        eVar.getClass();
        return "Cannot deserialize " + str + " with '" + s0.f105811a.b(eVar.getClass()).D() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String n(String str, l63.f fVar) {
        fVar.getClass();
        return "Cannot serialize " + str + " with '" + s0.f105811a.b(fVar.getClass()).D() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final void o(ud.a aVar, String str) {
        aVar.getClass();
        ud.c cVarM0 = aVar.M0(str);
        try {
            cVarM0.J0();
            zf.b.h(cVarM0, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                zf.b.h(cVarM0, th3);
                throw th4;
            }
        }
    }

    public static final int p(int i14, List list) {
        int i15;
        byte b14;
        int i16 = ((s5.s) h0.m0(list)).f157292c;
        if (i14 > ((s5.s) h0.m0(list)).f157292c) {
            y5.a.a("Index " + i14 + " should be less or equal than last line's end " + i16);
        }
        int size = list.size() - 1;
        int i17 = 0;
        while (true) {
            if (i17 > size) {
                i15 = -(i17 + 1);
                break;
            }
            i15 = (i17 + size) >>> 1;
            s5.s sVar = (s5.s) list.get(i15);
            if (sVar.f157291b > i14) {
                b14 = 1;
            } else {
                b14 = sVar.f157292c <= i14 ? (byte) -1 : (byte) 0;
            }
            if (b14 >= 0) {
                if (b14 <= 0) {
                    break;
                }
                size = i15 - 1;
            } else {
                i17 = i15 + 1;
            }
        }
        if (i15 >= 0 && i15 < list.size()) {
            return i15;
        }
        StringBuilder sbI = b71.i.i(i15, "Found paragraph index ", " should be in range [0, ");
        sbI.append(list.size());
        sbI.append(").\nDebug info: index=");
        sbI.append(i14);
        sbI.append(", paragraphs=[");
        sbI.append(i6.b.b(list, null, new s5.d(1), 31));
        sbI.append(']');
        y5.a.a(sbI.toString());
        return i15;
    }

    public static final int q(int i14, List list) {
        byte b14;
        int size = list.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            s5.s sVar = (s5.s) list.get(i16);
            if (sVar.f157293d > i14) {
                b14 = 1;
            } else {
                b14 = sVar.f157294e <= i14 ? (byte) -1 : (byte) 0;
            }
            if (b14 < 0) {
                i15 = i16 + 1;
            } else {
                if (b14 <= 0) {
                    return i16;
                }
                size = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static final int r(ArrayList arrayList, float f14) {
        byte b14;
        if (f14 <= 0.0f) {
            return 0;
        }
        if (f14 >= ((s5.s) h0.m0(arrayList)).f157296g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            s5.s sVar = (s5.s) arrayList.get(i15);
            if (sVar.f157295f > f14) {
                b14 = 1;
            } else {
                b14 = sVar.f157296g <= f14 ? (byte) -1 : (byte) 0;
            }
            if (b14 < 0) {
                i14 = i15 + 1;
            } else {
                if (b14 <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    public static final void s(ArrayList arrayList, long j8, e23.l lVar) {
        int size = arrayList.size();
        for (int iP = p(w0.h(j8), arrayList); iP < size; iP++) {
            s5.s sVar = (s5.s) arrayList.get(iP);
            if (sVar.f157291b >= w0.g(j8)) {
                return;
            }
            if (sVar.f157291b != sVar.f157292c) {
                lVar.invoke(sVar);
            }
        }
    }

    public static final List t(e5 e5Var) {
        u4.d dVar;
        u4.d dVar2;
        e5Var.getClass();
        List list = f131485a;
        if (list != null) {
            return list;
        }
        u4.d dVarC = y62.c.f194605a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("DirectRoute", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK = b71.i.k(h1.f128863b, 5.234f, 7.0f);
            eVarK.d(4.2552f, 7.0528f, 3.3369f, 7.4941f, 2.6799f, 8.2274f);
            eVarK.d(2.0229f, 8.9607f, 1.6805f, 9.9263f, 1.7277f, 10.9132f);
            eVarK.d(1.7171f, 11.844f, 2.0217f, 12.7506f, 2.5913f, 13.4832f);
            eVarK.i(5.2352f, 16.9273f);
            eVarK.i(7.8791f, 13.4227f);
            eVarK.d(8.4366f, 12.7058f, 8.7406f, 11.8217f, 8.7427f, 10.9108f);
            eVarK.d(8.7892f, 9.9239f, 8.4463f, 8.9586f, 7.7888f, 8.2257f);
            eVarK.d(7.1314f, 7.4929f, 6.2128f, 7.0522f, 5.234f, 7.0f);
            eVarK.c();
            eVarK.k(5.234f, 12.8407f);
            eVarK.d(4.7155f, 12.8206f, 4.226f, 12.5942f, 3.8727f, 12.2112f);
            eVarK.d(3.5194f, 11.8281f, 3.3311f, 11.3196f, 3.3489f, 10.7968f);
            eVarK.d(3.3306f, 10.5355f, 3.3658f, 10.2732f, 3.4524f, 10.0262f);
            eVarK.d(3.539f, 9.7792f, 3.6752f, 9.5528f, 3.8523f, 9.3612f);
            eVarK.d(4.0295f, 9.1695f, 4.2439f, 9.0167f, 4.4822f, 8.9122f);
            eVarK.d(4.7206f, 8.8077f, 4.9777f, 8.7537f, 5.2375f, 8.7537f);
            eVarK.d(5.4974f, 8.7537f, 5.7545f, 8.8077f, 5.9929f, 8.9122f);
            eVarK.d(6.2312f, 9.0167f, 6.4456f, 9.1695f, 6.6228f, 9.3612f);
            eVarK.d(6.7999f, 9.5528f, 6.9361f, 9.7792f, 7.0227f, 10.0262f);
            eVarK.d(7.1093f, 10.2732f, 7.1445f, 10.5355f, 7.1262f, 10.7968f);
            eVarK.d(7.1441f, 11.3196f, 6.9557f, 11.8281f, 6.6024f, 12.2112f);
            eVarK.d(6.2491f, 12.5942f, 5.7596f, 12.8206f, 5.2411f, 12.8407f);
            eVarK.g(5.234f);
            eVarK.c();
            u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(18.2106f, 7.0f);
            eVarL.d(17.2317f, 7.0528f, 16.3135f, 7.4941f, 15.6564f, 8.2274f);
            eVarL.d(14.9994f, 8.9607f, 14.6571f, 9.9263f, 14.7043f, 10.9132f);
            eVarL.d(14.6936f, 11.844f, 14.9983f, 12.7506f, 15.5679f, 13.4832f);
            eVarL.i(18.2118f, 16.9273f);
            eVarL.i(20.8556f, 13.4227f);
            eVarL.d(21.4132f, 12.7058f, 21.7172f, 11.8217f, 21.7193f, 10.9108f);
            eVarL.d(21.7658f, 9.9239f, 21.4228f, 8.9586f, 20.7654f, 8.2257f);
            eVarL.d(20.1079f, 7.4929f, 19.1894f, 7.0522f, 18.2106f, 7.0f);
            eVarL.c();
            eVarL.k(18.2106f, 12.8407f);
            eVarL.d(17.6921f, 12.8206f, 17.2026f, 12.5942f, 16.8493f, 12.2112f);
            eVarL.d(16.496f, 11.8281f, 16.3076f, 11.3196f, 16.3255f, 10.7968f);
            eVarL.d(16.3071f, 10.5355f, 16.3424f, 10.2732f, 16.429f, 10.0262f);
            eVarL.d(16.5156f, 9.7792f, 16.6517f, 9.5528f, 16.8289f, 9.3612f);
            eVarL.d(17.0061f, 9.1695f, 17.2205f, 9.0167f, 17.4588f, 8.9122f);
            eVarL.d(17.6971f, 8.8077f, 17.9542f, 8.7537f, 18.2141f, 8.7537f);
            eVarL.d(18.474f, 8.7537f, 18.7311f, 8.8077f, 18.9694f, 8.9122f);
            eVarL.d(19.2077f, 9.0167f, 19.4222f, 9.1695f, 19.5993f, 9.3612f);
            eVarL.d(19.7765f, 9.5528f, 19.9126f, 9.7792f, 19.9992f, 10.0262f);
            eVarL.d(20.0859f, 10.2732f, 20.1211f, 10.5355f, 20.1028f, 10.7968f);
            eVarL.d(20.1206f, 11.3196f, 19.9323f, 11.8281f, 19.579f, 12.2112f);
            eVarL.d(19.2256f, 12.5942f, 18.7362f, 12.8206f, 18.2177f, 12.8407f);
            eVarL.g(18.2106f);
            eVarL.c();
            u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarJ = sn.a.j(7.8518f, 15.1552f, 6.4792f, 17.0f, 16.9364f);
            tn.k.s(eVarJ, 15.5639f, 15.1552f, 7.8518f);
            u4.d.a.b(aVar2, eVarJ.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            y62.c.f194605a = dVarC;
        }
        u4.d dVar3 = dVarC;
        u4.d dVarC2 = y62.n.f194616a;
        if (dVarC2 == null) {
            float f15 = (float) 24.0d;
            g6.f.a aVar3 = g6.f.f75994b;
            u4.d.a aVar4 = new u4.d.a("SyncLocation", f15, f15, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var4 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK2 = b71.i.k(h1.f128863b, 15.6527f, 4.9327f);
            eVarK2.d(14.4699f, 4.2703f, 13.1353f, 3.9502f, 11.7903f, 4.0063f);
            eVarK2.d(10.5588f, 4.0577f, 9.3608f, 4.4226f, 8.3023f, 5.0662f);
            eVarK2.i(8.0473f, 5.2212f);
            eVarK2.i(9.0475f, 6.3018f);
            eVarK2.i(9.207f, 6.2122f);
            eVarK2.d(10.0808f, 5.7216f, 11.0596f, 5.4609f, 12.0564f, 5.4549f);
            eVarK2.d(13.1231f, 5.4485f, 14.1723f, 5.7337f, 15.0973f, 6.2818f);
            eVarK2.d(16.0223f, 6.8298f, 16.79f, 7.6211f, 17.322f, 8.5751f);
            eVarK2.d(17.854f, 9.529f, 18.1312f, 10.6115f, 18.1254f, 11.7121f);
            eVarK2.i(18.1251f, 11.7507f);
            eVarK2.g(15.6773f);
            eVarK2.i(18.8386f, 15.161f);
            eVarK2.i(22.0f, 11.7507f);
            eVarK2.g(19.5518f);
            eVarK2.i(19.5519f, 11.7117f);
            eVarK2.d(19.5555f, 10.3244f, 19.195f, 8.9619f, 18.5086f, 7.7684f);
            eVarK2.d(17.8223f, 6.575f, 16.8355f, 5.5951f, 15.6527f, 4.9327f);
            eVarK2.c();
            u4.d.a.b(aVar4, eVarK2.f168407a, 0, t1Var4, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var5 = new o4.t1(o4.f0.d(4278190080L), jVar);
            int i14 = h1.f128864c;
            u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(13.1367f, 8.387f);
            eVarL2.d(12.7834f, 8.2394f, 12.4051f, 8.1663f, 12.024f, 8.172f);
            eVarL2.d(11.6429f, 8.1663f, 11.2645f, 8.2394f, 10.9113f, 8.387f);
            eVarL2.d(10.5569f, 8.5351f, 10.2351f, 8.7551f, 9.9648f, 9.0339f);
            eVarL2.d(9.6946f, 9.3127f, 9.4815f, 9.6446f, 9.3381f, 10.0098f);
            eVarL2.d(9.1948f, 10.3747f, 9.1241f, 10.7655f, 9.1299f, 11.159f);
            eVarL2.d(9.134f, 11.9129f, 9.3998f, 12.6405f, 9.8795f, 13.2097f);
            eVarL2.i(12.0219f, 15.9726f);
            eVarL2.i(14.2313f, 13.1867f);
            eVarL2.d(14.6855f, 12.6146f, 14.9287f, 11.8954f, 14.9181f, 11.1564f);
            eVarL2.d(14.9236f, 10.7638f, 14.8528f, 10.3739f, 14.7099f, 10.0098f);
            eVarL2.d(14.5665f, 9.6446f, 14.3534f, 9.3127f, 14.0832f, 9.0339f);
            eVarL2.d(13.8129f, 8.7551f, 13.4911f, 8.5351f, 13.1367f, 8.387f);
            eVarL2.c();
            eVarL2.k(11.7911f, 9.9461f);
            eVarL2.d(12.0226f, 9.8986f, 12.2627f, 9.9229f, 12.4809f, 10.0162f);
            eVarL2.d(12.6991f, 10.1094f, 12.8858f, 10.2674f, 13.0172f, 10.4704f);
            eVarL2.d(13.1487f, 10.6733f, 13.2189f, 10.9121f, 13.2189f, 11.1565f);
            eVarL2.d(13.2189f, 11.4842f, 13.0927f, 11.7982f, 12.8685f, 12.0295f);
            eVarL2.d(12.6443f, 12.2608f, 12.3405f, 12.3905f, 12.024f, 12.3905f);
            eVarL2.d(11.7879f, 12.3905f, 11.5571f, 12.3183f, 11.3606f, 12.1829f);
            eVarL2.d(11.1641f, 12.0474f, 11.0108f, 11.8548f, 10.9202f, 11.6291f);
            eVarL2.d(10.8296f, 11.4035f, 10.8059f, 11.1551f, 10.8521f, 10.9155f);
            eVarL2.d(10.8983f, 10.6758f, 11.0123f, 10.4559f, 11.1795f, 10.2834f);
            eVarL2.d(11.3467f, 10.1109f, 11.5596f, 9.9936f, 11.7911f, 9.9461f);
            eVarL2.c();
            u4.d.a.b(aVar4, eVarL2.f168407a, i14, t1Var5, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var6 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(8.3227f, 12.2493f, 5.1614f, 8.839f);
            eVarM.i(2.0f, 12.2493f);
            eVarM.g(4.4482f);
            eVarM.i(4.4481f, 12.2883f);
            eVarM.d(4.4445f, 13.6756f, 4.805f, 15.0381f, 5.4914f, 16.2315f);
            eVarM.d(6.1777f, 17.425f, 7.1645f, 18.4049f, 8.3473f, 19.0673f);
            eVarM.d(9.5301f, 19.7297f, 10.8647f, 20.0498f, 12.2097f, 19.9937f);
            eVarM.d(13.4412f, 19.9424f, 14.6392f, 19.5774f, 15.6977f, 18.9338f);
            eVarM.i(15.9527f, 18.7788f);
            eVarM.i(14.9525f, 17.6982f);
            eVarM.i(14.793f, 17.7878f);
            eVarM.d(13.9192f, 18.2784f, 12.9404f, 18.5391f, 11.9436f, 18.5451f);
            eVarM.d(10.8769f, 18.5515f, 9.8277f, 18.2663f, 8.9027f, 17.7182f);
            eVarM.d(7.9777f, 17.1702f, 7.21f, 16.3789f, 6.678f, 15.4249f);
            eVarM.d(6.146f, 14.471f, 5.8688f, 13.3885f, 5.8746f, 12.2879f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 5.8748f, 12.2493f, 8.3227f, 12.2493f);
            u4.d.a.b(aVar4, eVarM.f168407a, 0, t1Var6, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC2 = aVar4.c();
            y62.n.f194616a = dVarC2;
        }
        u4.d dVarC3 = y62.l.f194614a;
        if (dVarC3 == null) {
            float f16 = (float) 24.0d;
            g6.f.a aVar5 = g6.f.f75994b;
            u4.d.a aVar6 = new u4.d.a("PreciseUserLocation", f16, f16, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var7 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK3 = b71.i.k(h1.f128863b, 14.973f, 12.0f);
            eVarK3.d(14.973f, 13.6419f, 13.6419f, 14.973f, 12.0f, 14.973f);
            eVarK3.d(10.3581f, 14.973f, 9.027f, 13.6419f, 9.027f, 12.0f);
            eVarK3.d(9.027f, 10.3581f, 10.3581f, 9.027f, 12.0f, 9.027f);
            eVarK3.d(13.6419f, 9.027f, 14.973f, 10.3581f, 14.973f, 12.0f);
            eVarK3.c();
            u4.d.a.b(aVar6, eVarK3.f168407a, 0, t1Var7, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var8 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u4.e eVarL3 = com.nimbusds.jose.shaded.gson.internal.a.l(19.2486f, 11.1892f);
            eVarL3.d(19.0651f, 9.5449f, 18.3278f, 8.012f, 17.1579f, 6.8421f);
            eVarL3.d(15.988f, 5.6722f, 14.4551f, 4.9349f, 12.8108f, 4.7513f);
            u62.z.o(eVarL3, 2.0f, 11.1892f, 4.7513f);
            eVarL3.d(9.5449f, 4.9349f, 8.012f, 5.6722f, 6.8421f, 6.8421f);
            eVarL3.d(5.6722f, 8.012f, 4.9349f, 9.5449f, 4.7513f, 11.1892f);
            q2.w(eVarL3, 2.0f, 12.8108f, 4.7513f);
            eVarL3.d(4.9349f, 14.4551f, 5.6722f, 15.988f, 6.8421f, 17.1579f);
            eVarL3.d(8.012f, 18.3278f, 9.5449f, 19.0651f, 11.1892f, 19.2486f);
            u62.z.o(eVarL3, 22.0f, 12.8108f, 19.2486f);
            eVarL3.d(14.4551f, 19.0651f, 15.988f, 18.3278f, 17.1579f, 17.1579f);
            eVarL3.d(18.3278f, 15.988f, 19.0651f, 14.4551f, 19.2486f, 12.8108f);
            u62.z.r(eVarL3, 22.0f, 11.1892f, 19.2486f);
            eVarL3.k(12.0f, 17.6757f);
            eVarL3.d(10.8775f, 17.6757f, 9.7801f, 17.3428f, 8.8468f, 16.7192f);
            eVarL3.d(7.9134f, 16.0955f, 7.1859f, 15.2091f, 6.7564f, 14.172f);
            eVarL3.d(6.3268f, 13.1349f, 6.2144f, 11.9937f, 6.4334f, 10.8927f);
            eVarL3.d(6.6524f, 9.7918f, 7.1929f, 8.7804f, 7.9867f, 7.9867f);
            eVarL3.d(8.7804f, 7.1929f, 9.7918f, 6.6524f, 10.8927f, 6.4334f);
            eVarL3.d(11.9937f, 6.2144f, 13.1349f, 6.3268f, 14.172f, 6.7564f);
            eVarL3.d(15.2091f, 7.1859f, 16.0955f, 7.9134f, 16.7192f, 8.8468f);
            eVarL3.d(17.3428f, 9.7801f, 17.6757f, 10.8775f, 17.6757f, 12.0f);
            eVarL3.d(17.6757f, 13.5053f, 17.0777f, 14.9489f, 16.0133f, 16.0133f);
            eVarL3.d(14.9489f, 17.0777f, 13.5053f, 17.6757f, 12.0f, 17.6757f);
            eVarL3.c();
            u4.d.a.b(aVar6, eVarL3.f168407a, 0, t1Var8, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC3 = aVar6.c();
            y62.l.f194614a = dVarC3;
        }
        u4.d dVarA = y62.i.a(e5Var);
        u4.d dVarC4 = y62.d.f194606a;
        if (dVarC4 == null) {
            float f17 = (float) 24.0d;
            g6.f.a aVar7 = g6.f.f75994b;
            u4.d.a aVar8 = new u4.d.a("IconMarkerStart", f17, f17, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var9 = new o4.t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarE = u62.z.e(h1.f128863b, 7.5f, 4.0f, 20.0f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 20.5f, 12.0f, 7.5f, 4.0f);
            u4.d.a.b(aVar8, eVarE.f168407a, 0, t1Var9, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC4 = aVar8.c();
            y62.d.f194606a = dVarC4;
        }
        u4.d dVarA2 = y62.k.a(e5Var);
        u4.d dVarA3 = y62.o.a(e5Var);
        u4.d dVarA4 = y62.p.a(e5Var);
        u4.d dVarA5 = y62.f.a(e5Var);
        u4.d dVarC5 = y62.g.f194609a;
        if (dVarC5 == null) {
            float f18 = (float) 24.0d;
            g6.f.a aVar9 = g6.f.f75994b;
            u4.d.a aVar10 = new u4.d.a("LapsOn", f18, f18, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var10 = new o4.t1(o4.f0.d(r3), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarK4 = b71.i.k(h1.f128863b, 12.0002f, 2.001f);
            eVarK4.d(10.9917f, 1.9851f, 9.9899f, 2.1721f, 9.0549f, 2.5508f);
            eVarK4.d(8.1202f, 2.9294f, 7.271f, 3.492f, 6.5579f, 4.2051f);
            eVarK4.d(5.8446f, 4.9183f, 5.2813f, 5.7682f, 4.9026f, 6.7031f);
            eVarK4.d(4.5241f, 7.6378f, 4.3379f, 8.6391f, 4.3538f, 9.6475f);
            eVarK4.d(4.3233f, 11.5532f, 4.9692f, 13.4083f, 6.177f, 14.8828f);
            eVarK4.i(12.0002f, 22.0f);
            eVarK4.i(17.6467f, 14.9414f);
            eVarK4.d(18.9268f, 13.4738f, 19.6367f, 11.5949f, 19.6467f, 9.6475f);
            eVarK4.d(19.6626f, 8.6391f, 19.4755f, 7.6379f, 19.0969f, 6.7031f);
            eVarK4.d(18.7183f, 5.7682f, 18.1559f, 4.9183f, 17.4426f, 4.2051f);
            eVarK4.d(16.7294f, 3.4918f, 15.8795f, 2.9294f, 14.9446f, 2.5508f);
            eVarK4.d(14.0098f, 2.1722f, 13.0086f, 1.9851f, 12.0002f, 2.001f);
            eVarK4.c();
            eVarK4.k(14.6594f, 6.4482f);
            eVarK4.d(16.2774f, 6.4482f, 17.5959f, 7.7655f, 17.5959f, 9.3848f);
            eVarK4.i(17.595f, 9.5029f);
            eVarK4.d(17.5949f, 11.1208f, 16.2774f, 12.4385f, 14.6594f, 12.4385f);
            q2.w(eVarK4, 14.5295f, 11.3447f, 14.6594f);
            eVarK4.d(15.6733f, 11.3447f, 16.5011f, 10.5181f, 16.5012f, 9.5029f);
            eVarK4.i(16.5022f, 9.4141f);
            eVarK4.i(16.5012f, 9.3848f);
            eVarK4.d(16.5012f, 8.3682f, 15.6747f, 7.543f, 14.6594f, 7.543f);
            eVarK4.i(9.3401f, 7.542f);
            eVarK4.d(8.325f, 7.5422f, 7.4983f, 8.3683f, 7.4983f, 9.3848f);
            eVarK4.i(7.4973f, 9.4707f);
            eVarK4.i(7.4983f, 9.5029f);
            eVarK4.d(7.4984f, 10.518f, 8.325f, 11.3446f, 9.3401f, 11.3447f);
            tn.k.t(eVarK4, 10.6565f, 9.6758f, 12.8616f, 11.8896f);
            tn.k.r(eVarK4, 10.6565f, 14.0986f, 12.4385f, 9.3401f);
            eVarK4.d(7.721f, 12.4383f, 6.4037f, 11.1207f, 6.4036f, 9.5029f);
            eVarK4.i(6.4055f, 9.3848f);
            eVarK4.d(6.4055f, 7.7656f, 7.7222f, 6.4484f, 9.3401f, 6.4482f);
            eVarK4.g(14.6594f);
            eVarK4.c();
            u4.d.a.b(aVar10, eVarK4.f168407a, 0, t1Var10, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC5 = aVar10.c();
            y62.g.f194609a = dVarC5;
        }
        e5Var.getClass();
        u4.d dVarC6 = y62.e.f194607a;
        if (dVarC6 == null) {
            float f19 = (float) 24.0d;
            g6.f.a aVar11 = g6.f.f75994b;
            u4.d.a aVar12 = new u4.d.a("Intersection", f19, f19, 24.0f, 24.0f, 0L, 0, false, 96, null);
            o4.t1 t1Var11 = new o4.t1(o4.f0.d(r3), null);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            u4.e eVarF = u62.z.f(h1.f128863b, 9.5f, 2.5f, 9.5f, 2.5f);
            v.e0.y(eVarF, 7.5f, 7.5f, 2.5f, 9.5f);
            Unit unit = Unit.INSTANCE;
            u4.d.a.b(aVar12, eVarF.f168407a, 0, t1Var11, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var12 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarQ = u62.z.q(14.5f, 2.5f, 9.5f, 21.5f, 7.5f);
            u62.z.r(eVarQ, 16.5f, 2.5f, 14.5f);
            u4.d.a.b(aVar12, eVarQ.f168407a, 0, t1Var12, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var13 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarK5 = q2.k(14.5f, 21.5f, 14.5f, 21.5f, 14.5f);
            sn.a.A(eVarK5, 21.5f, 16.5f, 16.5f, 21.5f);
            eVarK5.g(14.5f);
            eVarK5.c();
            u4.d.a.b(aVar12, eVarK5.f168407a, 0, t1Var13, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var14 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarM2 = com.nimbusds.jose.shaded.gson.internal.a.m(9.5f, 21.5f, 9.5f, 14.5f);
            eVarM2.i(2.5f, 14.5f);
            eVarM2.i(2.5f, 16.5f);
            eVarM2.i(7.5f, 16.5f);
            eVarM2.o(21.5f);
            eVarM2.g(9.5f);
            eVarM2.c();
            u4.d.a.b(aVar12, eVarM2.f168407a, 0, t1Var14, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var15 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarQ2 = u62.z.q(12.5f, 2.5f, 4.5f, 11.5f, 2.5f);
            eVarQ2.i(12.5f, 2.5f);
            eVarQ2.c();
            u4.d.a.b(aVar12, eVarQ2.f168407a, 0, t1Var15, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var16 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarQ3 = u62.z.q(12.5f, 15.5f, 17.5f, 11.5f, 15.5f);
            eVarQ3.g(12.5f);
            eVarQ3.c();
            u4.d.a.b(aVar12, eVarQ3.f168407a, 0, t1Var16, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var17 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarQ4 = u62.z.q(12.5f, 6.5f, 8.5f, 11.5f, 6.5f);
            eVarQ4.g(12.5f);
            eVarQ4.c();
            u4.d.a.b(aVar12, eVarQ4.f168407a, 0, t1Var17, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var18 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarQ5 = u62.z.q(12.5f, 19.5f, 21.5f, 11.5f, 19.5f);
            eVarQ5.g(12.5f);
            eVarQ5.c();
            u4.d.a.b(aVar12, eVarQ5.f168407a, 0, t1Var18, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var19 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarL4 = u62.z.l(21.5f, 12.5f, 19.5f, 11.5f, 21.5f);
            eVarL4.o(12.5f);
            eVarL4.c();
            u4.d.a.b(aVar12, eVarL4.f168407a, 0, t1Var19, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var20 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarL5 = u62.z.l(8.5f, 12.5f, 6.5f, 11.5f, 8.5f);
            eVarL5.o(12.5f);
            eVarL5.c();
            u4.d.a.b(aVar12, eVarL5.f168407a, 0, t1Var20, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var21 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarL6 = u62.z.l(17.5f, 12.5f, 15.5f, 11.5f, 17.5f);
            eVarL6.o(12.5f);
            eVarL6.c();
            u4.d.a.b(aVar12, eVarL6.f168407a, 0, t1Var21, 1.0f, null, 0.0f, 0, 4.0f);
            o4.t1 t1Var22 = new o4.t1(o4.f0.d(r3), null);
            u4.e eVarD = u62.z.d(4.5f, 12.5f, 2.5f, 2.5f, 11.5f);
            sn.a.v(eVarD, 4.5f, 12.5f);
            u4.d.a.b(aVar12, eVarD.f168407a, 0, t1Var22, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC6 = aVar12.c();
            y62.e.f194607a = dVarC6;
        }
        u4.d dVar4 = dVarC4;
        u4.d dVarA6 = y62.a.a(e5Var);
        u4.d dVarA7 = y62.h.a(e5Var);
        p005kotlin.jvm.internal.j jVar2 = null;
        u4.d dVarA8 = y62.j.a(e5Var);
        u4.d dVarA9 = y62.b.a(e5Var);
        u4.d dVarC7 = y62.m.f194615a;
        if (dVarC7 != null) {
            dVar2 = dVarA9;
            dVar = dVarC2;
        } else {
            float f22 = (float) 24.0d;
            g6.f.a aVar13 = g6.f.f75994b;
            u4.d.a aVar14 = new u4.d.a("StopRouting", f22, f22, 24.0f, 24.0f, 0L, 0, true, 96, null);
            o4.t1 t1Var23 = new o4.t1(o4.f0.d(4278190080L), jVar2);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            h1.f128863b.getClass();
            int i15 = h1.f128864c;
            u4.e eVarD2 = u62.z.d(8.25f, 3.0f, 15.75f, 21.0f, 8.25f);
            u62.z.p(eVarD2, 15.75f, 15.75f, 21.0f, 8.25f);
            eVarD2.i(3.0f, 15.75f);
            u62.z.t(eVarD2, 8.25f, 8.25f, 3.0f);
            eVarD2.k(10.4091f, 12.0f);
            eVarD2.i(7.6248f, 14.7842f);
            eVarD2.i(9.2158f, 16.3752f);
            eVarD2.i(12.0001f, 13.591f);
            eVarD2.i(14.7843f, 16.3752f);
            eVarD2.i(16.3753f, 14.7842f);
            eVarD2.i(13.5911f, 12.0f);
            eVarD2.i(16.3753f, 9.2157f);
            eVarD2.i(14.7843f, 7.6248f);
            eVarD2.i(12.0001f, 10.409f);
            eVarD2.i(9.2158f, 7.6248f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarD2, 7.6248f, 9.2158f, 10.4091f, 12.0f);
            u4.d.a.b(aVar14, eVarD2.f168407a, i15, t1Var23, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC7 = aVar14.c();
            y62.m.f194615a = dVarC7;
            dVar = dVarC2;
            dVar2 = dVarA9;
        }
        List listK = p13.x.k(dVar3, dVar, dVarC3, dVarA, dVar4, dVarA2, dVarA3, dVarA4, dVarA5, dVarC5, dVarC6, dVarA6, dVarA7, dVarA8, dVar2, dVarC7);
        f131485a = listK;
        listK.getClass();
        return listK;
    }

    public static final e5 u(t62.b bVar) {
        bVar.getClass();
        return e5.f175862a;
    }

    public static final r7.b v(View view2) {
        r7.b bVar = (r7.b) view2.getTag(com.garmin.android.apps.connectmobile.R.id.pooling_container_listener_holder_tag);
        if (bVar != null) {
            return bVar;
        }
        r7.b bVar2 = new r7.b();
        view2.setTag(com.garmin.android.apps.connectmobile.R.id.pooling_container_listener_holder_tag, bVar2);
        return bVar2;
    }

    public static final LocalDate w(ot0.j jVar) {
        jVar.getClass();
        LocalDate localDateWithDayOfWeek = LocalDate.now().withDayOfWeek(1);
        if (jVar == ot0.j.CURRENT_WEEK) {
            localDateWithDayOfWeek.getClass();
            return localDateWithDayOfWeek;
        }
        LocalDate localDateMinusWeeks = localDateWithDayOfWeek.minusWeeks(jVar.f133778a);
        localDateMinusWeeks.getClass();
        return localDateMinusWeeks;
    }

    public static final TextView x(androidx.appcompat.app.e eVar) {
        eVar.getClass();
        return (TextView) eVar.findViewById(eVar.getContext().getResources().getIdentifier("alertTitle", TtmlNode.ATTR_ID, eVar.getContext().getPackageName()));
    }

    public static final int y(Integer num, Integer num2) {
        int iIntValue = 0;
        int iIntValue2 = (num == null || num.intValue() <= 0) ? 0 : num.intValue();
        if (num2 != null && num2.intValue() > 0) {
            iIntValue = num2.intValue();
        }
        return (iIntValue * 2) + iIntValue2;
    }

    public static final String z(a2 a2Var) {
        String strG;
        if (a2Var != null && (strG = a2Var.getProfileImageUrlSmall()) != null) {
            return strG;
        }
        String strF = a2Var != null ? a2Var.getProfileImageUrlMedium() : null;
        if (strF != null) {
            return strF;
        }
        if (a2Var != null) {
            return a2Var.getProfileImageUrlLarge();
        }
        return null;
    }
}
