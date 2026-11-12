package a42;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.preference.Preference;
import aq.a2;
import aq.b2;
import aq.d2;
import aq.h2;
import aq.u2;
import aw1.s0;
import b21.l4;
import b21.u9;
import c22.l3;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler;
import com.garmin.android.apps.connectmobile.groupride.GroupRideShareActivity;
import com.garmin.android.apps.connectmobile.liveactivity.DistanceCalibrationActivity;
import com.google.common.base.Optional;
import gg1.o0;
import i3.a1;
import i3.e5;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.datetime.DateTimeArithmeticException;
import lc.m0;
import lc.u0;
import o53.c2;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import p3.p1;
import r53.p2;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1035c;

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f1033a = i14;
        this.f1034b = obj;
        this.f1035c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        aa2.t tVarA;
        Object value2;
        fg0.j jVar;
        Object value3;
        Object value4;
        List<n91.a> value5;
        String strB0;
        String str;
        String strS;
        int i14 = this.f1033a;
        int i15 = 3;
        Object obj2 = this.f1035c;
        Object obj3 = this.f1034b;
        switch (i14) {
            case 0:
                sd2.f fVar = (sd2.f) obj;
                s.a aVar = s.f1073g;
                fVar.getClass();
                s.f1074h.invoke(fVar);
                ge1.b.T((o53.b0) obj3, null, null, new s.b((a1) obj2, null), 3);
                return Unit.INSTANCE;
            case 1:
                aa2.u uVar = (aa2.u) obj2;
                char cCharValue = ((Character) obj).charValue();
                if (((String) obj3).length() < 4) {
                    String strValueOf = String.valueOf(cCharValue);
                    uVar.getClass();
                    strValueOf.getClass();
                    p2 p2Var = uVar.f2393e;
                    do {
                        value = p2Var.getValue();
                        aa2.t tVar = (aa2.t) value;
                        int i16 = aa2.u.b.f2395a[tVar.f2374a.ordinal()];
                        if (i16 == 1 || i16 == 2) {
                            tVarA = aa2.t.a(tVar, null, tn.k.g(tVar.f2375b, strValueOf), null, null, 0, false, false, false, false, false, false, false, 16349);
                        } else if (i16 == 3 || i16 == 4) {
                            tVarA = aa2.t.a(tVar, null, null, tn.k.g(tVar.f2376c, strValueOf), null, 0, false, false, false, false, false, false, false, 16347);
                        } else {
                            if (i16 != 5) {
                                u0.r();
                                return null;
                            }
                            tVarA = aa2.t.a(tVar, null, null, null, tn.k.g(tVar.f2377d, strValueOf), 0, false, false, false, false, false, false, false, 16343);
                        }
                    } while (!p2Var.b(value, tVarA));
                }
                return Unit.INSTANCE;
            case 2:
                m0 m0Var = (m0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                p2 p2Var2 = ((zc0.c) obj3).f203929d;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, null));
                lc.y.l(m0Var, new ad0.a.b(iIntValue));
                return Unit.INSTANCE;
            case 3:
                ub0.l lVar = (ub0.l) obj3;
                zc0.e eVar = (zc0.e) obj2;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                lottieAnimationView.getClass();
                int i17 = lVar == null ? -1 : ad0.k.c.f2748a[lVar.ordinal()];
                if (i17 == 1) {
                    lottieAnimationView.pauseAnimation();
                } else if (i17 != 2) {
                    lottieAnimationView.setMinAndMaxFrame(eVar.f203943e, eVar.f203944f);
                    lottieAnimationView.playAnimation();
                } else {
                    lottieAnimationView.resumeAnimation();
                }
                return Unit.INSTANCE;
            case 4:
                Preference preference = (Preference) obj3;
                Preference preference2 = (Preference) obj2;
                sd2.f fVar2 = (sd2.f) obj;
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                if (fVar2 != null) {
                    preference.f10152f = new aj1.e(preference, fVar2, i15);
                    preference2.f10152f = new aj1.e(preference2, fVar2, 0);
                }
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar2 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj2;
                ck0.t tVar2 = (ck0.t) obj;
                tVar2.getClass();
                String str2 = tVar2.f27883a;
                ((sc.f) obj3).a(new com.garmin.android.apps.connectmobile.gcplus.presentation.home.c.e(str2));
                eVar2.getClass();
                ge1.b.T(v1.a(eVar2), null, null, new ak0.c0(eVar2, str2, null), 3);
                return Unit.INSTANCE;
            case 6:
                ((w0) obj3).m(((e23.l) obj2).invoke(obj));
                return Unit.INSTANCE;
            case 7:
                ((ap2.h) obj3).f11716v.remove((c2) obj2);
                return Unit.INSTANCE;
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                int i18 = a2.f11811f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj3).g0(Double.valueOf(iIntValue2));
                ((a2) obj2).notifyDataSetChanged();
                return Unit.INSTANCE;
            case 9:
                int iIntValue3 = ((Integer) obj).intValue();
                int i19 = b2.f11835f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj3).g0(Double.valueOf(iIntValue3));
                ((b2) obj2).notifyDataSetChanged();
                return Unit.INSTANCE;
            case 10:
                int i24 = d2.f11903g;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj2).g0(Double.valueOf(((Integer) obj).intValue()));
                ((d2) obj3).notifyDataSetChanged();
                return Unit.INSTANCE;
            case 11:
                int iIntValue4 = ((Integer) obj).intValue();
                int i25 = h2.f11979f;
                ((com.garmin.android.apps.connectmobile.repcounting.model.e) obj3).g0(Double.valueOf(iIntValue4));
                ((h2) obj2).notifyDataSetChanged();
                return Unit.INSTANCE;
            case 12:
                w0 w0Var = (w0) obj3;
                u2 u2Var = (u2) obj2;
                o13.p pVar = (o13.p) obj;
                A a14 = pVar.f128594a;
                if (((Number) pVar.f128595b).intValue() == 201) {
                    w0Var.j(a14);
                } else if (a14 instanceof Map) {
                    u2Var.y4(p13.x.k("", a14));
                    w0Var.j(null);
                } else {
                    w0Var.j(null);
                }
                return Unit.INSTANCE;
            case 13:
                p1 p1Var = (p1) obj3;
                com.garmin.android.apps.connectmobile.startup.b bVar = (com.garmin.android.apps.connectmobile.startup.b) obj2;
                com.garmin.android.apps.connectmobile.startup.b.a aVar3 = com.garmin.android.apps.connectmobile.startup.b.f44801b;
                ((f.a) obj).getClass();
                q92.x xVar = (q92.x) p1Var.getF182175a();
                if (xVar != null) {
                    com.garmin.android.apps.connectmobile.startup.e eVar3 = (com.garmin.android.apps.connectmobile.startup.e) bVar.f44802a.getValue();
                    eVar3.getClass();
                    ge1.b.T(v1.a(eVar3), null, null, new aq1.e0(eVar3, xVar, null), 3);
                    p1Var.setValue(null);
                }
                return Unit.INSTANCE;
            case 14:
                as2.f fVar3 = (as2.f) obj3;
                Number number = (Number) obj;
                Logger logger = as2.f.f12699e;
                number.getClass();
                as2.b bVar2 = new as2.b(number, DateTime.now().getMillis());
                Optional<as2.b<T>> optionalOf = Optional.of(bVar2);
                optionalOf.getClass();
                fVar3.f12702c = optionalOf;
                fVar3.f12700a.f((String) obj2, (as2.b<T>) bVar2);
                return Unit.INSTANCE;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                ((e23.p) obj3).invoke((pt1.y) obj2, num);
                return Unit.INSTANCE;
            case 16:
                DistanceCalibrationActivity distanceCalibrationActivity = (DistanceCalibrationActivity) obj3;
                DistanceCalibrationActivity.b bVar3 = (DistanceCalibrationActivity.b) obj2;
                int iIntValue5 = ((Integer) obj).intValue();
                DistanceCalibrationActivity.a aVar4 = DistanceCalibrationActivity.f38470b;
                au0.q qVar = (au0.q) distanceCalibrationActivity.f38471a.getValue();
                long j8 = bVar3.f38473a;
                int i26 = bVar3.f38474b;
                qVar.getClass();
                da2.d dVarB = da2.d.b();
                dVarB.getClass();
                LimitedUiProtobufDataHandler limitedUiProtobufDataHandler = (LimitedUiProtobufDataHandler) w5.r.l(dVarB, j8, LimitedUiProtobufDataHandler.class);
                if (limitedUiProtobufDataHandler != null) {
                    limitedUiProtobufDataHandler.sendDistanceCalibrationNotification(i26, iIntValue5);
                }
                distanceCalibrationActivity.finish();
                return Unit.INSTANCE;
            case 17:
                gv0.d dVar = (gv0.d) obj3;
                String str3 = (String) obj2;
                ((f.a) obj).getClass();
                dVar.getClass();
                str3.getClass();
                ge1.b.T(v1.a(dVar), null, null, new gv0.n(dVar, str3, null), 3);
                return Unit.INSTANCE;
            case 18:
                aw1.h hVar = (aw1.h) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i27 = aw1.h.S1;
                com.garmin.android.apps.connectmobile.workouts.data.model.c cVarB = com.garmin.android.apps.connectmobile.workouts.data.model.c.b((com.garmin.android.apps.connectmobile.workouts.data.model.c) obj3, Integer.valueOf((int) jLongValue));
                hVar.getClass();
                jv1.s sVarI6 = hVar.i6();
                if (sVarI6 != null && (jVar = sVarI6.H) != null) {
                    List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH = jVar.h();
                    ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.c> arrayList = listH != null ? new ArrayList(listH) : new ArrayList();
                    y0.a(arrayList).remove(jVar.g(Integer.valueOf(cVarB.getLegIndex())));
                    arrayList.add(cVarB);
                    if (arrayList.size() > 1) {
                        p13.c0.u(arrayList, new s0());
                    }
                    double dIntValue = 0.0d;
                    for (com.garmin.android.apps.connectmobile.workouts.data.model.c cVar : arrayList) {
                        og0.a aVar5 = og0.a.f131967a;
                        Double value6 = cVar.getValue();
                        double dDoubleValue = value6 != null ? value6.doubleValue() : 0.0d;
                        gg0.i unit = cVar.getUnit();
                        if (unit == null) {
                            unit = gg0.i.SECOND;
                        }
                        aVar5.getClass();
                        double dJ = og0.a.j(dDoubleValue, unit) + dIntValue;
                        Integer transitionOutDurationSeconds = cVar.getTransitionOutDurationSeconds();
                        dIntValue = (transitionOutDurationSeconds != null ? transitionOutDurationSeconds.intValue() : 0.0d) + dJ;
                    }
                    hVar.V7(fg0.j.b(jVar, new fg0.d(Double.valueOf(dIntValue), gg0.i.SECOND, gg0.h.TIME), arrayList, null, null, null, null, 8188));
                }
                return Unit.INSTANCE;
            case 19:
                l4.g gVar = (l4.g) obj3;
                b11.v vVar = (b11.v) obj;
                vVar.getClass();
                gVar.getClass();
                b63.u uVarA = b63.u.Companion.a(b63.u.INSTANCE, gVar.f14881c);
                b11.m mVar = gVar.f14884f;
                i01.i.Companion companion = i01.i.INSTANCE;
                String str4 = gVar.f14882d;
                companion.getClass();
                lc.y.l((m0) obj2, v21.a.a(vVar, i01.i.Companion.a(str4), j11.c.CUSTOM_MEAL, uVarA, mVar));
                return Unit.INSTANCE;
            case 20:
                u21.f0 f0Var = (u21.f0) obj3;
                String str5 = (String) obj;
                str5.getClass();
                String str6 = ((s21.a0) obj2).f156042g;
                c2 c2Var = f0Var.f167956e;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                f0Var.f167956e = ge1.b.T(v1.a(f0Var), null, null, new u21.g0(str5, f0Var, str6, null), 3);
                return Unit.INSTANCE;
            case 21:
                e23.l lVar2 = (e23.l) obj2;
                s21.s sVar = (s21.s) obj;
                sVar.getClass();
                s21.s sVar2 = s21.s.NO_GOAL;
                p2 p2Var3 = ((u21.u0) obj3).f168164o;
                if (sVar == sVar2) {
                    do {
                        value4 = p2Var3.getValue();
                    } while (!p2Var3.b(value4, s21.a0.a((s21.a0) value4, null, null, true, true, sVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -2996281, 3)));
                } else {
                    do {
                        value3 = p2Var3.getValue();
                    } while (!p2Var3.b(value3, s21.a0.a((s21.a0) value3, null, null, true, true, sVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -57, 3)));
                }
                if (u9.a.f15288a[sVar.ordinal()] == 1) {
                    lVar2.invoke(s21.z.Recommendation);
                } else {
                    lVar2.invoke(s21.z.Goal);
                }
                return Unit.INSTANCE;
            case 22:
                b63.a0 a0Var = (b63.a0) obj2;
                c63.m mVar2 = (c63.m) obj;
                mVar2.getClass();
                e53.j jVarB = b63.n.b((b63.l) obj3);
                c63.o oVar = mVar2.f25015a;
                jVarB.getClass();
                a0Var.getClass();
                e53.j.a aVar6 = e53.j.f63112c;
                long j14 = jVarB.f63115a;
                long j15 = jVarB.f63116b;
                aVar6.getClass();
                e53.j jVarB2 = e53.j.a.b(j14 % 315569520000L, j15);
                jVarB2.getClass();
                try {
                    b63.u uVar2 = new b63.u(LocalDateTime.ofInstant(f53.a.a(jVarB2), a0Var.f16173a));
                    oVar.f25029a.b(uVar2.b());
                    oVar.f25030b.g(uVar2.c());
                    oVar.f25031c.a(a0Var);
                    Integer num2 = oVar.f25029a.f24941a.f24963a;
                    num2.getClass();
                    oVar.f25029a.f24941a.f24963a = Integer.valueOf(num2.intValue() + ((int) ((j14 / 315569520000L) * ((long) 10000))));
                    return Unit.INSTANCE;
                } catch (DateTimeException e4) {
                    throw new DateTimeArithmeticException(e4);
                }
            case 23:
                ba1.d dVar2 = (ba1.d) obj3;
                w91.a aVar7 = (w91.a) obj2;
                n91.a aVar8 = (n91.a) obj;
                aVar8.getClass();
                z1<List<n91.a>> z1Var = dVar2.f16989o;
                do {
                    value5 = z1Var.getValue();
                } while (!z1Var.b(value5, p13.h0.D0(value5, aVar8)));
                dVar2.L4();
                q91.d dVar3 = ((aa1.c) dVar2.A.f150540a.getValue()).f2234b;
                if (dVar3 != null) {
                    w9.a aVarA = v1.a(dVar2);
                    x53.c cVar2 = o53.s0.f129406a;
                    ge1.b.T(aVarA, u53.o.f168762a, null, new ba1.j(aVar7, dVar3, null), 2);
                }
                return Unit.INSTANCE;
            case 24:
                ud.a aVar9 = (ud.a) obj;
                bb2.c.C0243c c0243c = bb2.c.f17328d;
                aVar9.getClass();
                ((bb2.c) obj3).f17330b.d(aVar9, (ps.m) obj2);
                return Unit.INSTANCE;
            case 25:
                ud.a aVar10 = (ud.a) obj;
                bb2.g.c cVar3 = bb2.g.f17352c;
                aVar10.getClass();
                ((bb2.g) obj3).f17354b.c(aVar10, (ArrayList) obj2);
                return Unit.INSTANCE;
            case 26:
                ud.a aVar11 = (ud.a) obj;
                bb2.k.b bVar4 = bb2.k.f17367c;
                aVar11.getClass();
                ((bb2.k) obj3).f17369b.d(aVar11, (bb2.i) obj2);
                return Unit.INSTANCE;
            case 27:
                ud.a aVar12 = (ud.a) obj;
                bb2.q.c cVar4 = bb2.q.f17382c;
                aVar12.getClass();
                ((bb2.q) obj3).f17384b.d(aVar12, (bb2.r) obj2);
                return Unit.INSTANCE;
            case 28:
                bi1.d.a aVar13 = bi1.d.f18024j;
                ((Preference) obj3).x(((com.garmin.android.apps.connectmobile.devices.model.b0) ((List) obj).get(((bi1.u) obj2).f18086a)).f34110a);
                return Unit.INSTANCE;
            default:
                GroupRideShareActivity groupRideShareActivity = (GroupRideShareActivity) obj3;
                Logger logger2 = groupRideShareActivity.f36419a;
                String str7 = (String) obj2;
                fw.m mVar3 = (fw.m) obj;
                String str8 = GroupRideShareActivity.f36418j;
                fw.p pVar2 = mVar3.f73769b;
                fw.c cVar5 = mVar3.f73771d;
                int i28 = GroupRideShareActivity.b.f36427a[pVar2.ordinal()];
                if (i28 == 1) {
                    groupRideShareActivity.showProgressOverlay();
                } else if (i28 == 2) {
                    groupRideShareActivity.hideProgressOverlay();
                    cn0.b bVar5 = (cn0.b) mVar3.f73770c;
                    if (bVar5 != null) {
                        bn0.e eVar4 = groupRideShareActivity.f36425g;
                        if (eVar4 == null) {
                            p005kotlin.jvm.internal.s.m("viewBinder");
                            throw null;
                        }
                        eVar4.f18989l.setOnClickListener(new a61.d0(15, groupRideShareActivity, bVar5));
                        bn0.e eVar5 = groupRideShareActivity.f36425g;
                        if (eVar5 == null) {
                            p005kotlin.jvm.internal.s.m("viewBinder");
                            throw null;
                        }
                        eVar5.f18990m.setOnClickListener(new a32.b(groupRideShareActivity, 17));
                        bn0.e eVar6 = groupRideShareActivity.f36425g;
                        if (eVar6 == null) {
                            p005kotlin.jvm.internal.s.m("viewBinder");
                            throw null;
                        }
                        eVar6.f18979b.setText(bVar5.getCode());
                        com.garmin.android.apps.connectmobile.groupride.a aVar14 = eVar6.f18978a;
                        l22.b bVar6 = aVar14.f36438a;
                        String str9 = aVar14.f36439b;
                        String name = bVar5.getName();
                        if (name == null) {
                            name = str9;
                        }
                        DateTime dateTimeJ = bVar5.j();
                        String strI = dateTimeJ != null ? com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d, yyyy", dateTimeJ) : str9;
                        DateTime dateTimeJ2 = bVar5.j();
                        String strG = e5.g(strI, " @ ", dateTimeJ2 != null ? com.nimbusds.jose.shaded.gson.internal.a.i("h:mm a", dateTimeJ2) : str9);
                        if (p005kotlin.jvm.internal.s.g(name, str9) || strG.equals(str9)) {
                            TextView textView = eVar6.f18980c;
                            textView.getClass();
                            textView.setVisibility(8);
                            ViewGroup viewGroup = eVar6.f18981d;
                            viewGroup.getClass();
                            viewGroup.setVisibility(8);
                            ViewGroup viewGroup2 = eVar6.f18982e;
                            viewGroup2.getClass();
                            viewGroup2.setVisibility(8);
                        } else {
                            eVar6.f18983f.setText(name);
                            eVar6.f18984g.setText(strG);
                        }
                        String strG2 = bVar5.g();
                        if (strG2 == null) {
                            strG2 = str9;
                        }
                        Double d14 = bVar5.d();
                        Double dF = bVar5.f();
                        if (d14 == null || dF == null) {
                            strB0 = str9;
                            str = strB0;
                        } else {
                            Double d15 = bVar5.d();
                            if (d15 != null) {
                                boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                l3.a aVar15 = l3.f23124b;
                                double dDoubleValue2 = d15.doubleValue();
                                DecimalFormat decimalFormat = l3.f23137o;
                                aVar15.getClass();
                                strS = l3.a.S(bVar6, dDoubleValue2, decimalFormat, true, zY);
                            } else {
                                strS = str9;
                            }
                            double dDoubleValue3 = dF.doubleValue();
                            o0 o0VarG = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g();
                            l3.a aVar16 = l3.f23124b;
                            DecimalFormat decimalFormat2 = l3.f23135m;
                            aVar16.getClass();
                            strB0 = l3.a.b0(bVar6, dDoubleValue3, o0VarG, false, decimalFormat2);
                            str = strS;
                        }
                        String strO = am.j.o(": ", strB0, e5.l(bVar6.getString(R.string.lbl_distance), ": ", str, " · ", bVar6.getString(R.string.lbl_total_ascent)));
                        if (p005kotlin.jvm.internal.s.g(strG2, str9) || strO.equals(str9)) {
                            TextView textView2 = eVar6.f18985h;
                            textView2.getClass();
                            textView2.setVisibility(8);
                            ViewGroup viewGroup3 = eVar6.f18986i;
                            viewGroup3.getClass();
                            viewGroup3.setVisibility(8);
                        } else {
                            eVar6.f18987j.setText(strG2);
                            eVar6.f18988k.setText(strO);
                        }
                        bn0.k kVar = bn0.k.f19006a;
                        DateTime dateTimeH = bVar5.h();
                        kVar.getClass();
                        if (dateTimeH != null && Instant.now().getMillis() >= dateTimeH.getMillis()) {
                            groupRideShareActivity.ca(R.string.lbl_group_ride_code_expired_error, R.string.group_ride_code_expired_error_info);
                        }
                    } else {
                        logger2.warn(str8 + " - Received null group ride details");
                        bn0.e eVar7 = groupRideShareActivity.f36425g;
                        if (eVar7 == null) {
                            p005kotlin.jvm.internal.s.m("viewBinder");
                            throw null;
                        }
                        eVar7.a(str7);
                    }
                } else {
                    if (i28 != 3) {
                        u0.r();
                        return null;
                    }
                    logger2.error(str8 + " - Error " + cVar5 + " while getting group ride details");
                    groupRideShareActivity.hideProgressOverlay();
                    bn0.e eVar8 = groupRideShareActivity.f36425g;
                    if (eVar8 == null) {
                        p005kotlin.jvm.internal.s.m("viewBinder");
                        throw null;
                    }
                    eVar8.a(str7);
                    if (cVar5 instanceof fw.k) {
                        groupRideShareActivity.ca(R.string.lbl_group_ride_code_not_found_error, R.string.group_ride_code_not_found_error_info);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
