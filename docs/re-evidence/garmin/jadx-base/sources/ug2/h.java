package ug2;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.t2;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaCardDetailActivity;
import com.garmin.realtimesettings.app.presentationlayer.SettingsDeviceActivity;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.h4;
import kotlin.t1;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p3.p1;
import r53.p2;
import uy0.j1;
import uy2.y0;
import uy2.z0;
import v.a2;
import v.b2;
import v2.g1;
import v2.h2;
import v2.w1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f170784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170785c;

    public /* synthetic */ h(lg2.a aVar, p1 p1Var) {
        this.f170783a = 1;
        this.f170784b = aVar;
        this.f170785c = p1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:145:0x040a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0426  */
    /* JADX WARN: Code duplicated, block: B:148:0x0432  */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x040a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.a
    public final Object invoke() throws IllegalAccessException {
        Object value;
        mf2.h hVarE;
        long[] jArr;
        Object value2;
        Object value3;
        int i14 = this.f170783a;
        int i15 = 2;
        boolean z14 = false;
        int i16 = 0;
        z14 = false;
        z14 = false;
        z14 = false;
        int i17 = 3;
        int i18 = 1;
        mf2.h.d dVar = null;
        Object obj = this.f170784b;
        Object obj2 = this.f170785c;
        switch (i14) {
            case 0:
                lg2.a aVar = (lg2.a) obj;
                p2 p2Var = ((r0) obj2).B4().f71495s;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, null));
                ge1.b.T(v1.a(aVar), null, null, new lg2.f(aVar, null), 3);
                return Unit.INSTANCE;
            case 1:
                lg2.a aVar2 = (lg2.a) obj;
                ((p1) obj2).setValue(Boolean.FALSE);
                ge1.b.T(v1.a(aVar2), null, null, new lg2.d(aVar2, null), 3);
                return Unit.INSTANCE;
            case 2:
                lc.m0 m0Var = (lc.m0) obj2;
                e23.l lVar = (e23.l) obj;
                if (m0Var.f() != null) {
                    m0Var.n();
                } else {
                    lVar.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 3:
                r0 r0Var = (r0) obj2;
                ag2.c.a aVarE = ((qg2.c) obj).e();
                aVarE.getClass();
                switch (og2.i.a.f132041a[aVarE.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        switch (v0.f171036a[aVarE.ordinal()]) {
                            case 1:
                                dVar = mf2.h.d.HR_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 2:
                                dVar = mf2.h.d.SPEED_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 3:
                                dVar = mf2.h.d.POWER_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 4:
                                dVar = mf2.h.d.PACE_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 5:
                                dVar = mf2.h.d.GRADE_ADJUSTED_PACE_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 6:
                                dVar = mf2.h.d.ELEVATION_CHART;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 7:
                                dVar = mf2.h.d.BREATHWORK;
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                                if (dVar == null) {
                                    zg2.c.f204692a.getClass();
                                    zg2.c.b("MainViewModel", "Unable to handle " + aVarE + ". This is an error condition.");
                                } else {
                                    r0Var.f170944w = aVarE;
                                    hVarE = r0Var.B4().e();
                                    if (hVarE != null) {
                                        hVarE.c(dVar);
                                    }
                                }
                                break;
                            default:
                                lc.u0.r();
                                return null;
                        }
                        break;
                    default:
                        zg2.c.f204692a.getClass();
                        zg2.c.b("MainViewModel", aVarE + " doesn't support chart. This is an error condition.");
                        break;
                }
                return Unit.INSTANCE;
            case 4:
                int i19 = um0.d.T;
                ((um0.d) obj2).Y6().f145567b.j((wg0.a) obj);
                return Unit.INSTANCE;
            case 5:
                ((e23.l) obj2).invoke((vr2.q) obj);
                return Unit.INSTANCE;
            case 6:
                Fragment fragment = (Fragment) obj2;
                cx2.h hVar = uv2.a.f172960c;
                ew2.g.f66907a.getClass();
                fragment.getClass();
                ew2.g.f66908b.getClass();
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                vw2.a aVarA = com.garmin.realtimesettings.app.initialization.b.a();
                Context contextRequireContext = fragment.requireContext();
                contextRequireContext.getClass();
                bx2.b bVar = (bx2.b) aVarA.d(contextRequireContext, (String) obj);
                if (bVar != null) {
                    bVar.o();
                } else {
                    Logger logger = cx2.h.f56678c;
                }
                return Unit.INSTANCE;
            case 7:
                SettingsDeviceActivity settingsDeviceActivity = (SettingsDeviceActivity) obj;
                if (((jw2.c) obj2).f101372a) {
                    settingsDeviceActivity.V9();
                }
                return Unit.INSTANCE;
            case 8:
                ((uy0.j) obj2).f173212a.r((lp.k) obj);
                return Unit.INSTANCE;
            case 9:
                ((j1) obj2).f173216a.r((lp.k) obj);
                return Unit.INSTANCE;
            case 10:
                return ((xy2.o) l23.f.a(((uy2.t0) obj2).f173462b.invoke((AnnotationType) ((Annotation) obj)))).getF173457a();
            case 11:
                return l23.f.a(((uy2.u0) obj2).f173463b.invoke((AnnotationType) ((Annotation) obj)));
            case 12:
                return ((uy2.v0) obj2).f173464b.invoke((AnnotationType) ((Annotation) obj));
            case 13:
                return (Throwable) l23.f.a(((y0) obj2).f173468b.invoke((AnnotationType) ((Annotation) obj)));
            case 14:
                return (Throwable) ((xy2.o) l23.f.a(((z0) obj2).f173469b.invoke((AnnotationType) ((Annotation) obj)))).getF173457a();
            case 15:
                List list = (List) obj;
                androidx.camera.camera2.internal.compat.h hVar2 = ((b2) obj2).f173693m;
                a2 a2Var = a2.f173668a;
                hVar2.getClass();
                if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) hVar2.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null && jArr.length != 0) {
                    HashSet hashSet = new HashSet();
                    for (long j8 : jArr) {
                        hashSet.add(Long.valueOf(j8));
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((t2) it.next()).f5765c.f5738a))) {
                        }
                    }
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            case 16:
                v12.h hVar3 = (v12.h) obj2;
                Context contextRequireContext2 = hVar3.requireContext();
                contextRequireContext2.getClass();
                PrivacyType privacyType = ((v12.k) obj).f174751e;
                return v12.b.a(contextRequireContext2, privacyType != null ? privacyType.getF28797a() : R.string.unknown, new v12.g(hVar3, 4), new v12.g(hVar3, 5));
            case 17:
                v2.p1 p1Var = (v2.p1) obj2;
                p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) obj;
                p1Var.f175115f.d();
                if (p1Var.getIsAttached() && ((h4) h5.i.a(p1Var, t1.f91503u)).a()) {
                    i15 = 1;
                }
                int i24 = p0Var.f105807a;
                int i25 = i15 * i24;
                p0Var.f105807a = i24 * (-1);
                return Integer.valueOf(i25);
            case 18:
                w1 w1Var = (w1) obj;
                if (!((w2.n) obj2).f181368d) {
                    u1.n0 n0Var = w1Var.f175202m;
                    if (n0Var.getIsAttached()) {
                        m4.i0.E0(n0Var.f167631h);
                    }
                }
                return Unit.INSTANCE;
            case 19:
                h2 h2Var = (h2) obj2;
                v2.p pVar = (v2.p) obj;
                h2.a aVar3 = h2.f175038e;
                u2.e eVarB = h2Var.f175039a.b();
                v2.j1 j1Var = (v2.j1) h2Var.f175042d.getF182175a();
                aVar3.getClass();
                g1 g1Var = new g1();
                StringBuilder sb3 = new StringBuilder();
                boolean z15 = false;
                while (i16 < eVarB.f167839c.length()) {
                    int iCodePointAt = Character.codePointAt(eVarB, i16);
                    int iA = pVar.a(iCodePointAt);
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (iA != iCodePointAt) {
                        g1Var.c(sb3.length(), sb3.length() + iCharCount, Character.charCount(iA));
                        z15 = true;
                    }
                    sb3.appendCodePoint(iA);
                    i16 += iCharCount;
                    z15 = z15;
                }
                CharSequence string = z15 ? sb3.toString() : eVarB;
                if (string == eVarB) {
                    return null;
                }
                long jA = h2.a.a(eVarB.f167840d, g1Var, j1Var);
                s5.w0 w0Var = eVarB.f167841e;
                return new h2.b(new u2.e(string, jA, w0Var != null ? s5.w0.a(h2.a.a(w0Var.f157317a, g1Var, j1Var)) : null, null, null, null, 56, null), g1Var);
            case 20:
                Context context = (Context) obj2;
                o42.e eVar = (o42.e) obj;
                context.startActivity(dh.b.z(WeightReportsActivity.class, context, new DateTime(eVar != null ? eVar.f129085d : DateTime.now().getMillis()), false));
                return Unit.INSTANCE;
            case 21:
                v92.r rVar = (v92.r) obj2;
                int i26 = v92.r.f176465l;
                ge1.b.T(v1.a(rVar), null, null, new v92.u(rVar, (String) obj, null), 3);
                return Unit.INSTANCE;
            case 22:
                int i27 = v92.r.f176465l;
                ((v92.r) obj2).F4((s92.g) obj);
                return Unit.INSTANCE;
            case 23:
                boolean z16 = !((pe0.c) ((p1) obj).getF182175a()).f137414i;
                p2 p2Var2 = ((oe0.d) obj2).f131261f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.c.a((pe0.c) value2, null, null, null, null, null, 0.0d, null, null, z16, null, 767)));
                return Unit.INSTANCE;
            case 24:
                ((e23.l) obj2).invoke(Long.valueOf(((pe0.h) obj).f137442a));
                return Unit.INSTANCE;
            case 25:
                boolean z17 = !((pe0.j) obj).f137459i;
                p2 p2Var3 = ((oe0.s) obj2).f131412h;
                do {
                    value3 = p2Var3.getValue();
                } while (!p2Var3.b(value3, pe0.j.a((pe0.j) value3, null, null, null, null, null, 0.0d, null, null, z17, null, null, 1791)));
                return Unit.INSTANCE;
            case 26:
                Context context2 = (Context) obj2;
                ht.s sVar = ht.s.f85508a;
                lt.e.b bVar2 = new lt.e.b(lt.e.a.Tapped, o70.b.GOLF_SCORE_CARD, null, 4, null);
                sVar.getClass();
                ht.s.a(bVar2);
                Activity activity = (Activity) context2;
                nl0.b bVar3 = new nl0.b(activity, true, "scorecard", String.valueOf(((sl0.a) obj).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()));
                if (hb2.g.b(context2, hb2.g.a.GARMIN_GOLF)) {
                    bVar3.a().execute();
                } else {
                    new nl0.k(activity, false, bVar3.b("scorecard")).execute();
                }
                return Unit.INSTANCE;
            case 27:
                vn2.b0 b0Var = (vn2.b0) obj2;
                vn2.b0.f178864c.trace("continueToCheckGooglePay()");
                com.garmin.feature.garminpay.providers.felica.ui.b view2 = b0Var.getView();
                int i28 = vq2.e.f179461z0;
                view2.S5(null, null);
                b0Var.f0().i((FelicaCardDetailActivity) obj).k(l13.a.f108327b).h(r03.a.a()).i(new vn2.y(new vn2.t(b0Var, 17), i18), new vn2.v(b0Var, i18));
                return Unit.INSTANCE;
            case 28:
                vn2.b0 b0Var2 = (vn2.b0) obj;
                Logger logger2 = vn2.b0.f178864c;
                tn2.y0.a aVar4 = ((tn2.y0.c) obj2).f165748c;
                if (aVar4 == tn2.y0.a.NEED_REFUND) {
                    vn2.u uVar = new vn2.u(b0Var2, i15);
                    int i29 = w03.b.f181178a;
                    return new z03.d(uVar);
                }
                if (aVar4 != tn2.y0.a.NEED_DELETION_AND_CALL_CENTER) {
                    com.nimbusds.jose.shaded.gson.internal.a.t("It won't happen.");
                    return null;
                }
                vn2.u uVar2 = new vn2.u(b0Var2, i17);
                int i30 = w03.b.f181178a;
                return new z03.d(uVar2);
            default:
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                h82.c.f((com.garmin.android.apps.connectmobile.stress.presentation.view.a) obj2, (Context) obj, "https://www.firstbeat.com/");
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f170783a = i14;
        this.f170785c = obj;
        this.f170784b = obj2;
    }
}
