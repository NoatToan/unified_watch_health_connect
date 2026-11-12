package dl0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.fragment.app.m;
import b.u;
import c.q;
import c22.q0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.socialgroupride.presentation.summary.GroupRideSummaryActivity;
import ds.n;
import e23.l;
import ew0.g0;
import ew1.e1;
import ew1.e3;
import ew1.r;
import ew1.s1;
import ew1.t0;
import gl1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jv1.s;
import jv1.z;
import kotlin.t3;
import lc.u0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import p3.n1;
import p3.p1;
import pt1.p;
import qr.t;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60290c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f60288a = i14;
        this.f60289b = obj;
        this.f60290c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x032b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        String str;
        lv0.d dVar;
        wd2.k kVar;
        hb2.g.a aVar;
        Long l14;
        Object value2;
        ys.b bVar;
        boolean z14;
        String str2;
        m activity;
        u onBackPressedDispatcher;
        s sVarA;
        fg0.k kVar2;
        ArrayList arrayList;
        int i14 = this.f60288a;
        final int i15 = 1;
        boolean z15 = false;
        Parcelable parcelable = null;
        Object obj = this.f60290c;
        Object obj2 = this.f60289b;
        switch (i14) {
            case 0:
                ((l) obj2).invoke(Long.valueOf(((a) obj).f60266a));
                return Unit.INSTANCE;
            case 1:
                int i16 = GroupRideSummaryActivity.f44755o;
                ((ComposeView) obj2).disposeComposition();
                ((m0) obj).f105804a = false;
                return Unit.INSTANCE;
            case 2:
                t tVar = (t) obj2;
                fs.f fVar = (fs.f) obj;
                tVar.getClass();
                p2 p2Var = tVar.f146518f2;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, h0.y0((List) value, fVar)));
                return Unit.INSTANCE;
            case 3:
                ((t) obj2).O5((n) obj);
                return Unit.INSTANCE;
            case 4:
                int i17 = ds0.l.f61085f;
                h82.c.f((ds0.l) obj2, (Context) obj, "https://nutritionj.biomedcentral.com/articles/10.1186/1475-2891-13-106");
                return Unit.INSTANCE;
            case 5:
                yu0.f fVar2 = (yu0.f) obj2;
                Context context = (Context) obj;
                yu0.e eVar = fVar2.f199707e;
                ou0.d dVar2 = (ou0.d) fVar2.f199710h.f150540a.getValue();
                wd2.k kVar3 = dVar2 != null ? dVar2.f133977d : null;
                String str3 = kVar3 != null ? kVar3.f184515a : null;
                String str4 = kVar3 != null ? kVar3.f184516b : null;
                if (!(dVar2 != null ? p005kotlin.jvm.internal.s.g(dVar2.f133974a, Boolean.TRUE) : false) || str3 == null || str4 == null) {
                    str = null;
                } else {
                    eVar.getClass();
                    str = str4 + "/" + str3;
                }
                if (str != null) {
                    ev0.c cVar = (ev0.c) ((g3) fVar2.f199712j.f150540a.getValue()).f35301b;
                    String str5 = cVar != null ? cVar.f66156e : null;
                    eVar.getClass();
                    boolean zD = g22.n.d(str5);
                    l22.b bVar2 = eVar.f199701a;
                    dVar = new lv0.d(zD ? bVar2.a(R.string.string_empty_line_string_pattern, bVar2.a(R.string.check_livetrack_profile, str), bVar2.a(R.string.lbl_my_access_code, str5)) : bVar2.a(R.string.check_livetrack_profile, str), null, 2, null);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    ((m) context).startActivity(Intent.createChooser(y.w(dVar), null));
                }
                return Unit.INSTANCE;
            case 6:
                q qVar = (q) obj2;
                yu0.f fVar3 = (yu0.f) obj;
                yu0.e eVar2 = fVar3.f199707e;
                ou0.d dVar3 = (ou0.d) fVar3.f199710h.f150540a.getValue();
                String str6 = (dVar3 == null || (kVar = dVar3.f133977d) == null) ? null : kVar.f184516b;
                eVar2.getClass();
                qVar.a(new Intent("android.intent.action.VIEW", Uri.parse((str6 != null ? str6 : "").concat("/settings/delete-profile"))), null);
                return Unit.INSTANCE;
            case 7:
                ((l) obj2).invoke(Boolean.valueOf(((f11.a) obj).f67890j));
                return Unit.INSTANCE;
            case 8:
                ((l) obj2).invoke(Boolean.valueOf(((f11.g) obj).f67938j));
                return Unit.INSTANCE;
            case 9:
                n1 n1Var = (n1) obj2;
                int i18 = PreviewActivity.f6058a;
                n1Var.t((n1Var.getIntValue() + 1) % ((Object[]) obj).length);
                return Unit.INSTANCE;
            case 10:
                ((l) obj2).invoke((com.garmin.android.apps.connectmobile.workouts.data.model.h0) obj);
                return Unit.INSTANCE;
            case 11:
                ((t3) obj2).a((String) obj);
                return Unit.INSTANCE;
            case 12:
                AppPromoPopupActivity appPromoPopupActivity = (AppPromoPopupActivity) obj2;
                en.n nVar = (en.n) obj;
                AppPromoPopupActivity.a aVar2 = AppPromoPopupActivity.f29002e;
                i2.f36769a.getClass();
                i2.a.b(a2.GENERAL, "AppPromoPopupActivity", "redirectToInstallApp: " + nVar);
                switch (AppPromoPopupActivity.b.f29008b[nVar.ordinal()]) {
                    case 1:
                        aVar = hb2.g.a.GARMIN_DIVE;
                        break;
                    case 2:
                        aVar = hb2.g.a.GARMIN_DEZL;
                        break;
                    case 3:
                        aVar = hb2.g.a.GARMIN_MESSENGER;
                        break;
                    case 4:
                        aVar = hb2.g.a.AB_SYNAPSE_GARMIN;
                        break;
                    case 5:
                        aVar = hb2.g.a.AB_QUANTUM_GARMIN;
                        break;
                    case 6:
                        aVar = hb2.g.a.GARMIN_PILOT;
                        break;
                    case 7:
                        aVar = hb2.g.a.GARMIN_CONNECT_IQ;
                        break;
                    default:
                        u0.r();
                        return null;
                }
                appPromoPopupActivity.f29005c = aVar;
                c22.n1 n1Var2 = new c22.n1(appPromoPopupActivity, aVar);
                f.c<Intent> cVar2 = appPromoPopupActivity.f29006d;
                cVar2.getClass();
                q0.f23203a.getClass();
                cVar2.a(new Intent("android.intent.action.VIEW", q0.a.a(n1Var2.f23168a, n1Var2.f23169b)), null);
                return Unit.INSTANCE;
            case 13:
                ep.b bVar3 = (ep.b) obj2;
                Context context2 = (Context) obj;
                aq.b bVar4 = new aq.b();
                bVar4.f11823b = (bVar3 == null || (l14 = bVar3.f64804d) == null) ? 0L : l14.longValue();
                context2.startActivity(bVar4.a(context2));
                return Unit.INSTANCE;
            case 14:
                zs.c cVar3 = (zs.c) obj;
                ((e23.a) obj2).invoke();
                p2 p2Var2 = cVar3.f206791g;
                do {
                    value2 = p2Var2.getValue();
                    bVar = (ys.b) p2Var2.getValue();
                    bVar.getClass();
                } while (!p2Var2.b(value2, ys.b.b(bVar, false, false, null, null, null, null, 61)));
                cVar3.f206785a.f(p2Var2.getValue(), "ui_state");
                return Unit.INSTANCE;
            case 15:
                ((l) obj2).invoke((vs.e) obj);
                return Unit.INSTANCE;
            case 16:
                p pVar = (p) obj2;
                e23.q qVar2 = (e23.q) obj;
                if (pVar != null) {
                    qVar2.invoke(Long.valueOf(pVar.f140929a), Long.valueOf(pVar.f140930b), pVar.f140931c.f140953a);
                }
                return Unit.INSTANCE;
            case 17:
                e23.a aVar3 = (e23.a) obj;
                if (((p) obj2).f140933e != null) {
                    aVar3.invoke();
                }
                return Unit.INSTANCE;
            case 18:
                p1 p1Var = (p1) obj;
                pt1.d dVar4 = ((pt1.c) obj2).f140819d;
                com.garmin.android.library.mapsdkadapter.i.d dVar5 = dVar4.f140835k;
                float f14 = dVar4.f140828d;
                if (f14 < 0.0f) {
                    com.garmin.android.library.mapsdkadapter.m mVar = com.garmin.android.library.mapsdkadapter.m.f50298a;
                    dVar5.getClass();
                    f14 = com.garmin.android.library.mapsdkadapter.m.a.f50308b[dVar5.ordinal()] == 1 ? 9.5f : 10.5f;
                } else if (((com.garmin.android.library.mapsdkadapter.i.d) p1Var.getF182175a()) != dVar5) {
                    com.garmin.android.library.mapsdkadapter.i.d dVar6 = (com.garmin.android.library.mapsdkadapter.i.d) p1Var.getF182175a();
                    com.garmin.android.library.mapsdkadapter.m mVar2 = com.garmin.android.library.mapsdkadapter.m.f50298a;
                    dVar6.getClass();
                    f14 = dVar6 == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX ? f14 + 1.0f : f14 - 1.0f;
                    p1Var.setValue(dVar5);
                }
                return new je2.a(ke2.c.c(dVar4.f140826b), f14, dVar4.f140837m, dVar4.f140838n);
            case 19:
                ((l) obj2).invoke((pv0.d) obj);
                return Unit.INSTANCE;
            case 20:
                ew0.m mVar3 = (ew0.m) obj2;
                c12.h hVar = (c12.h) obj;
                mVar3.getClass();
                a2 a2Var = a2.LIFESTYLE_LOGGING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "LifestyleLoggingOnboardingViewModel", "Loading auto-loggable behaviours");
                ArrayList arrayListG = pv0.f.g(pv0.f.b((List) mVar3.f66244k.f150540a.getValue()));
                p2 p2Var3 = mVar3.f66251r;
                mVar3.f66238e.getClass();
                p2Var3.k(null, tv0.b.a(arrayListG, false));
                hVar.b(!((List) mVar3.f66252t.f150540a.getValue()).isEmpty() ? g0.a.f66217a : g0.b.f66218a);
                return Unit.INSTANCE;
            case 21:
                r.a aVar4 = r.f66699d;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachAvailableTrainingDaysSelected");
                final aw1.h hVarZ6 = ((r) obj2).z6();
                final ArrayList arrayListX = tu1.a.x((List) ((p1) obj).getF182175a());
                if (hVarZ6.f13385r1) {
                    hVarZ6.G7("FBTAvailableTrainingDaysFragCompose", new e23.a() { // from class: aw1.g
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i15;
                            ArrayList arrayList2 = arrayListX;
                            h hVar2 = hVarZ6;
                            switch (i19) {
                                case 0:
                                    int i24 = h.S1;
                                    hVar2.N7(arrayList2);
                                    break;
                                default:
                                    int i25 = h.S1;
                                    hVar2.e8(arrayList2, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    hVarZ6.e8(arrayListX, true);
                }
                return Unit.INSTANCE;
            case 22:
                r rVar = (r) obj2;
                e23.a aVar5 = (e23.a) obj;
                r.a aVar6 = r.f66699d;
                if (rVar.z6().f13385r1) {
                    rVar.z6().v7("FBTAvailableTrainingDaysFragCompose");
                } else {
                    rVar.z6().e8(null, false);
                }
                aVar5.invoke();
                return Unit.INSTANCE;
            case 23:
                ((e3) obj2).f66437r.invoke((tw1.c) obj);
                return Unit.INSTANCE;
            case 24:
                ew1.m0 m0Var = (ew1.m0) obj2;
                String str7 = (String) obj;
                ew1.m0.a aVar7 = ew1.m0.f66573c;
                fg0.k kVarB5 = m0Var.y6().B5();
                o13.p<DateTime, DateTime> pVarN5 = m0Var.y6().N5();
                DateTime dateTime = pVarN5.f128594a;
                DateTime dateTime2 = pVarN5.f128595b;
                Double dF6 = m0Var.y6().e7() ? m0Var.y6().f6() : m0Var.y6().P5();
                zf0.c cVar4 = (zf0.c) KoinJavaComponent.get$default(zf0.c.class, null, null, 6, null);
                m mVarRequireActivity = m0Var.requireActivity();
                mVarRequireActivity.getClass();
                int iOrdinal = m0Var.y6().I5().ordinal();
                DateTime dateTimeAtCurrentTime = m0Var.y6().D5().toDateTimeAtCurrentTime();
                aw1.h hVarY6 = m0Var.y6();
                if (hVarY6.V6() && hVarY6.b7() && hVarY6.d7()) {
                    z14 = true;
                } else {
                    aw1.h hVarY7 = m0Var.y6();
                    if (hVarY7.V6() && hVarY7.O6() && hVarY7.d7()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                s sVar = (s) m0Var.y6().j6().d();
                jv1.h hVar2 = sVar != null ? sVar.f101127f : null;
                Double dValueOf = hVar2 instanceof jv1.i ? Double.valueOf(((jv1.i) hVar2).f101059c) : null;
                boolean z16 = kVarB5 != null;
                if (kVarB5 != null) {
                    Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                    String strR = kVarB5.r(false);
                    if (strR == null) {
                        str2 = "";
                    } else {
                        str2 = strR;
                    }
                } else {
                    str2 = "";
                }
                int iC5 = m0Var.y6().C5("TI_EVENT_SEARCH_SCREEN_TAG");
                int iY5 = m0Var.y6().Y5();
                boolean zP6 = m0Var.y6().P6();
                s sVarI6 = m0Var.y6().i6();
                cVar4.f(mVarRequireActivity, iOrdinal, dateTime, dateTime2, dateTimeAtCurrentTime, z14, dF6, dValueOf, str7, z16, str2, false, iC5, iY5, zP6, sVarI6 != null ? sVarI6.G : null);
                return Unit.INSTANCE;
            case 25:
                t0 t0Var = (t0) obj;
                t0.a aVar8 = t0.f66754g;
                vt1.f fVar4 = (vt1.f) ((p1) obj2).getF182175a();
                if (fVar4 != null) {
                    fy1.c cVar5 = fy1.c.f73884a;
                    boolean zW6 = t0Var.y6().w6();
                    cVar5.getClass();
                    fy1.c.b(zW6 ? "GarminCoachGoalValueSelected" : "GarminCoachCompletionGoalTypeSelected");
                    t0Var.y6().B6(fVar4, (String) t0Var.f66758e.getValue(), true);
                    if (t0Var.y6().f13385r1 && !t0Var.y6().w6() && (activity = t0Var.getActivity()) != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                        onBackPressedDispatcher.d();
                    }
                }
                return Unit.INSTANCE;
            case 26:
                t0.a aVar9 = t0.f66754g;
                ((l) obj2).invoke((vt1.f) obj);
                return Unit.INSTANCE;
            case 27:
                e1.a aVar10 = e1.f66409d;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachLongTrainingDaysSelected");
                final aw1.h hVarY8 = ((e1) obj2).y6();
                final ArrayList arrayListX2 = tu1.a.x((List) ((p1) obj).getF182175a());
                if (hVarY8.f13385r1) {
                    final boolean z17 = z15 ? 1 : 0;
                    hVarY8.G7("FBTLongDaysSelectionFragCompose", new e23.a() { // from class: aw1.g
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = z17;
                            ArrayList arrayList2 = arrayListX2;
                            h hVar3 = hVarY8;
                            switch (i19) {
                                case 0:
                                    int i24 = h.S1;
                                    hVar3.N7(arrayList2);
                                    break;
                                default:
                                    int i25 = h.S1;
                                    hVar3.e8(arrayList2, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                } else {
                    hVarY8.N7(arrayListX2);
                    if (!hVarY8.R6() && !hVarY8.H5().f61437c) {
                        hVarY8.s6().j("FBTHowToEndPlanFragment");
                    } else if (hVarY8.e7()) {
                        hVarY8.s6().j("FBTSwimDaysSelectionFragCompose");
                    } else if (hVarY8.W6()) {
                        if (hVarY8.T5().isEmpty()) {
                            hVarY8.s6().j("FBTGoalDateSelectionFragmentCompose");
                        } else {
                            hVarY8.l7();
                        }
                    } else if (!hVarY8.f13383p1 || !hVarY8.V6() || hVarY8.b7() || hVarY8.O6()) {
                        hVarY8.q5();
                    } else {
                        hVarY8.l7();
                    }
                }
                return Unit.INSTANCE;
            case 28:
                e1 e1Var = (e1) obj2;
                e23.a aVar11 = (e23.a) obj;
                e1.a aVar12 = e1.f66409d;
                if (e1Var.y6().f13385r1) {
                    e1Var.y6().v7("FBTLongDaysSelectionFragCompose");
                } else {
                    e1Var.y6().N7(null);
                }
                aVar11.invoke();
                return Unit.INSTANCE;
            default:
                z zVar = (z) obj;
                s1.a aVar13 = s1.f66734c;
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachKeptReviewSchedule");
                aw1.h hVarU6 = ((s1) obj2).u6();
                s sVarI7 = hVarU6.i6();
                if (sVarI7 != null) {
                    List<wt1.q> list = zVar.f101182c;
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((wt1.q) it.next()).f187130a);
                    }
                    List<wt1.q> list2 = zVar.f101183d;
                    ArrayList arrayList3 = new ArrayList(p13.y.r(list2, 10));
                    Iterator<T> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((wt1.q) it3.next()).f187130a);
                    }
                    List<wt1.q> list3 = zVar.f101184e;
                    if (list3 != null) {
                        ArrayList arrayList4 = new ArrayList(p13.y.r(list3, 10));
                        Iterator<T> it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(((wt1.q) it4.next()).f187130a);
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = null;
                    }
                    sVarA = s.a(sVarI7, null, null, null, null, null, null, null, null, null, null, false, null, arrayList2, arrayList3, arrayList, zVar.f101185f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, zVar.f101186g, null, null, null, null, null, null, null, null, zVar.f101188i, 2147422207, 255);
                } else {
                    sVarA = null;
                }
                hVarU6.k8(sVarA);
                if (hVarU6.N6()) {
                    hVarU6.s6().j("FBTNameYourPlanFragCompose");
                } else if (hVarU6.Z6()) {
                    hVarU6.s6().j("FBTGoalDateSelectionFragmentCompose");
                } else if (hVarU6.d7()) {
                    s sVarI8 = hVarU6.i6();
                    if (sVarI8 != null) {
                        kVar2 = sVarI8.f101124c;
                    }
                    if (parcelable != null) {
                        parcelable = kVar2;
                        hVarU6.k7();
                    } else {
                        parcelable = kVar2;
                        hVarU6.s6().j("FBTFindRaceFragmentCompose");
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
