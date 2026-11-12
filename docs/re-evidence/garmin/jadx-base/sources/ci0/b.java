package ci0;

import android.content.Context;
import androidx.lifecycle.v1;
import c22.b3;
import cn1.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bic.CollectDobActivity;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import com.google.android.gms.stats.CodePackage;
import d4.d.b;
import d52.q;
import e2.f0;
import e23.l;
import e23.p;
import et1.m;
import et1.n;
import ew1.a1;
import ew1.c1;
import ew1.j2;
import f2.j0;
import i3.mc;
import java.util.List;
import km1.v;
import l72.i3;
import o53.b0;
import p005kotlin.Unit;
import p1.t0;
import p3.m1;
import p3.n1;
import p3.p1;
import p3.z1;
import p5.h0;
import p5.k0;
import pv0.o;
import pv0.w;
import pv0.x;
import qr.t;
import r53.p2;
import sm1.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27626d;

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f27623a = i14;
        this.f27624b = obj;
        this.f27625c = obj2;
        this.f27626d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x045b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0461  */
    /* JADX WARN: Code duplicated, block: B:133:0x047a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String string;
        String string2;
        Object value;
        d11.c cVar;
        kt1.b bVar;
        List<k> listH;
        int i14 = this.f27623a;
        int i15 = 14;
        int i16 = 0;
        lValueOf = null;
        Long lValueOf = null;
        Object obj2 = this.f27626d;
        Object obj3 = this.f27625c;
        Object obj4 = this.f27624b;
        switch (i14) {
            case 0:
                Double d14 = (Double) obj3;
                Double d15 = (Double) obj2;
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                Context context = ((xh0.c) obj4).f190978a;
                int iDoubleValue = d14 != null ? (int) d14.doubleValue() : -1;
                int iDoubleValue2 = d15 != null ? (int) d15.doubleValue() : -1;
                if (iDoubleValue > -1) {
                    string = String.valueOf(iDoubleValue);
                } else {
                    string = context.getString(R.string.no_value);
                    string.getClass();
                }
                if (iDoubleValue2 >= 0) {
                    string2 = String.valueOf(iDoubleValue2);
                } else {
                    string2 = context.getString(R.string.no_value);
                    string2.getClass();
                }
                String string3 = context.getString(R.string.lbl_floors_climbed_total, string, string2);
                string3.getClass();
                h0.n(k0Var, xy2.b.O(context, string3));
                return Unit.INSTANCE;
            case 1:
                Context context2 = (Context) obj2;
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (sh0.d) obj3, context2.getString(R.string.common_no_certain_data, context2.getString(R.string.floors_title)), 4);
                return Unit.INSTANCE;
            case 2:
                s sVar = (s) obj4;
                v vVar = (v) obj;
                vVar.getClass();
                u uVar = new u((b0) obj3, (mc) obj2, i16);
                t60.a aVar = s.f160180t;
                sVar.getClass();
                ge1.b.T(v1.a(sVar), null, null, new sm1.u(-1L, sVar, vVar, uVar, null), 3);
                return Unit.INSTANCE;
            case 3:
                n1 n1Var = (n1) obj2;
                n1Var.t(((Integer) obj).intValue());
                ((l) obj4).invoke(((w13.a) obj3).get(n1Var.getIntValue()));
                return Unit.INSTANCE;
            case 4:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                List<e21.a.c> list = ((e21.a.d) ((p1) obj4).getF182175a()).f62623c;
                f0Var.a(list.size(), null, new d21.g(d21.f.f57295a, list), new z3.e(802480018, true, new d21.h(list, (l22.a) obj3, (e21.a) obj2)));
                return Unit.INSTANCE;
            case 5:
                d4.d dVar = (d4.d) obj4;
                d4.j jVar = (d4.j) obj2;
                t0<Object, d4.f> t0Var = dVar.f57436b;
                if (t0Var.a(obj3)) {
                    vb.h.x(org.apache.commons.lang3.e.f("Key ", " was used multiple times ", obj3));
                    return null;
                }
                dVar.f57435a.remove(obj3);
                t0Var.m(obj3, jVar);
                return dVar.new b(obj3, jVar);
            case 6:
                n82.f fVar = (n82.f) obj4;
                q qVar = (q) obj2;
                fVar.d((o82.g) ((i53.f) obj3).get(((Integer) obj).intValue()));
                if (fVar.f124961b.a() != o82.g.f130850c) {
                    qVar.x4(false);
                }
                return Unit.INSTANCE;
            case 7:
                Context context3 = (Context) obj2;
                ((CustomBarChart) obj).getClass();
                qz.a.b((rz.a) obj4, (sh0.a) obj3, context3.getString(R.string.common_no_certain_data, context3.getString(R.string.floors_title)), 4);
                return Unit.INSTANCE;
            case 8:
                Context context4 = (Context) obj2;
                ((CustomBarChart) obj).getClass();
                qz.a.b((rz.a) obj4, (sh0.e) obj3, context4.getString(R.string.common_no_certain_data, context4.getString(R.string.floors_title)), 4);
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.social.b bVar2 = (com.garmin.android.apps.connectmobile.social.b) obj4;
                ConversationCommentDTO conversationCommentDTO = (ConversationCommentDTO) obj3;
                String str = (String) obj2;
                v2 v2Var = (v2) obj;
                com.garmin.android.apps.connectmobile.social.b.a aVar2 = com.garmin.android.apps.connectmobile.social.b.T0;
                if (v2Var instanceof v2.b) {
                    mo1.d dVar2 = (mo1.d) ((v2.b) v2Var).f47386a;
                    if (dVar2.getUuid() != null) {
                        bVar2.J0 = dVar2;
                        String uuid = dVar2.getUuid();
                        uuid.getClass();
                        bVar2.U6(uuid, str, conversationCommentDTO);
                    } else if (bVar2.getActivity() != null) {
                        bVar2.d7(str);
                        if ((v2Var instanceof v2.a) || !zy0.g.a(((v2.a) v2Var).f47384b)) {
                            lj0.b bVar3 = lj0.b.f112956j;
                            bVar3.getClass();
                            g22.e.b(bVar2, bVar3);
                        } else {
                            b3.b(bVar2.requireActivity());
                        }
                    }
                } else if (bVar2.getActivity() != null) {
                    bVar2.d7(str);
                    if (v2Var instanceof v2.a) {
                        lj0.b bVar4 = lj0.b.f112956j;
                        bVar4.getClass();
                        g22.e.b(bVar2, bVar4);
                    } else {
                        lj0.b bVar5 = lj0.b.f112956j;
                        bVar5.getClass();
                        g22.e.b(bVar2, bVar5);
                    }
                }
                return Unit.INSTANCE;
            case 10:
                e23.a aVar3 = (e23.a) obj2;
                fs.e eVar = (fs.e) obj;
                eVar.getClass();
                fs.f fVarA = eVar.a((n4.d) obj3, true);
                p2 p2Var = ((t) obj4).f146518f2;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, p13.h0.D0((List) value, fVarA)));
                aVar3.invoke();
                return Unit.INSTANCE;
            case 11:
                CollectDobActivity collectDobActivity = (CollectDobActivity) obj4;
                b0 b0Var = (b0) obj3;
                e23.a aVar4 = (e23.a) obj2;
                ti2.b bVar6 = (ti2.b) obj;
                CollectDobActivity.a aVar5 = CollectDobActivity.f30702e;
                bVar6.getClass();
                if (bVar6.equals(ti2.b.j.f164605a)) {
                    collectDobActivity.ea();
                } else if (bVar6.equals(ti2.b.i.f164604a)) {
                    ge1.b.T(b0Var, null, null, new dv.e(collectDobActivity, null), 3);
                } else if (bVar6.equals(ti2.b.e.f164600a)) {
                    aVar4.invoke();
                }
                return Unit.INSTANCE;
            case 12:
                f11.a aVar6 = (f11.a) obj3;
                p1 p1Var = (p1) obj2;
                g01.c cVar2 = ((d11.a) obj4).f57041b.get(((Integer) obj).intValue());
                aVar6.getClass();
                cVar2.getClass();
                p2 p2Var2 = aVar6.f67884d;
                d11.a aVar7 = (d11.a) p2Var2.getValue();
                if (aVar7 != null && (cVar = aVar7.f57040a) != null) {
                    d11.c cVarA = d11.c.a(cVar, null, null, null, null, null, cVar2, null, 479);
                    d11.a aVar8 = (d11.a) p2Var2.getValue();
                    p2Var2.setValue(aVar8 != null ? d11.a.a(aVar8, cVarA, null, 14) : null);
                    aVar6.x4(v01.c.MISSING_SERVING_UNIT);
                }
                p1Var.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                m4.q qVar2 = (m4.q) obj4;
                f11.g gVar = (f11.g) obj3;
                Context context5 = (Context) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "SAVE_MEAL")) {
                    qVar2.y(false);
                    gVar.getClass();
                    context5.getClass();
                    d11.b bVar7 = (d11.b) gVar.f67932d.getValue();
                    if (bVar7 != null) {
                        ge1.b.T(v1.a(gVar), null, null, new f11.i(gVar, context5, bVar7, null), 3);
                    }
                }
                return Unit.INSTANCE;
            case 14:
                Context context6 = (Context) obj2;
                ((CustomLineChart) obj).getClass();
                qz.a.b((tz.a) obj4, (z42.g) obj3, context6.getString(R.string.common_no_certain_data, context6.getString(R.string.lbl_pushes)), 4);
                return Unit.INSTANCE;
            case 15:
                i53.c cVar3 = (i53.c) obj4;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0Var2.a(cVar3.size(), null, new e82.a.c(e82.a.b.f63447a, cVar3), new z3.e(802480018, true, new e82.a.d(cVar3, cVar3, (f82.c) obj3, (p) obj2)));
                return Unit.INSTANCE;
            case 16:
                f0 f0Var3 = (f0) obj;
                f0Var3.getClass();
                i53.c<pt1.t> cVar4 = ((pt1.h) obj4).f140853d;
                f0Var3.a(cVar4.size(), new et1.l(new ep0.a(10), cVar4), new m(et1.k.f65678a, cVar4), new z3.e(802480018, true, new n(cVar4, (l) obj3, (l) obj2)));
                return Unit.INSTANCE;
            case 17:
                qw0.s sVar2 = (qw0.s) obj4;
                p1 p1Var2 = (p1) obj2;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((p1) obj3).setValue(bool);
                if (((com.garmin.android.library.mapsdkadapter.i.d) p1Var2.getF182175a()) == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE) {
                    p1Var2.setValue(com.garmin.android.library.mapsdkadapter.i.d.MAPBOX);
                    sVar2.p((com.garmin.android.library.mapsdkadapter.i.d) p1Var2.getF182175a());
                }
                return Unit.INSTANCE;
            case 18:
                h2.b bVar8 = (h2.b) obj4;
                zc.d dVar3 = (zc.d) obj3;
                l lVar = (l) obj2;
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "menu_item_report_image")) {
                    if (bVar8.l() < dVar3.b() && (bVar = (kt1.b) dVar3.a(bVar8.l())) != null) {
                        lValueOf = Long.valueOf(bVar.f106447a);
                    }
                    if (lValueOf != null) {
                        lVar.invoke(new pt1.n.c(us1.c.IMAGE, lValueOf.longValue(), false, 4, null));
                    }
                }
                return Unit.INSTANCE;
            case 19:
                List list2 = (List) obj4;
                j0 j0Var = (j0) obj;
                eu.c cVar5 = eu.c.f66055a;
                j0Var.getClass();
                j0.j(j0Var, new ep0.a(16), new z3.e(-556075429, true, new as.s((String) obj3, i15)), 5);
                j0Var.g(list2.size(), null, null, new eu.c.d(eu.c.C1389c.f66072a, list2), new z3.e(-1117249557, true, new eu.c.e(list2, (p) obj2)));
                return Unit.INSTANCE;
            case 20:
                ((Boolean) obj).getClass();
                a1.a aVar9 = a1.f66302e;
                ((p1) obj3).setValue(Boolean.TRUE);
                ((p1) obj2).setValue((tw1.d) obj4);
                return Unit.INSTANCE;
            case 21:
                ((Boolean) obj).getClass();
                c1.a aVar10 = c1.f66352d;
                ((p1) obj3).setValue(Boolean.TRUE);
                ((p1) obj2).setValue((vt1.j) obj4);
                return Unit.INSTANCE;
            case 22:
                ((Boolean) obj).getClass();
                j2.a aVar11 = j2.f66533d;
                ((p1) obj3).setValue(Boolean.TRUE);
                ((p1) obj2).setValue((vt1.e) obj4);
                return Unit.INSTANCE;
            case 23:
                ew1.b3 b3Var = (ew1.b3) obj3;
                fw1.a aVar12 = (fw1.a) obj2;
                fg0.k kVar = (fg0.k) obj;
                ew1.b3.a aVar13 = ew1.b3.f66335d;
                kVar.getClass();
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachSelectedEventUserEvent");
                ((p1) obj4).setValue(kVar);
                gg0.f eventType = kVar.getEventType();
                if (eventType != null && eventType.g() && ((listH = kVar.h()) == null || listH.isEmpty())) {
                    aw1.h hVarF6 = b3Var.F6();
                    ge1.b.T(v1.a(hVarF6), null, null, new aw1.f0(hVarF6, kVar.getShareableEventUuid(), kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String(), null), 3);
                } else {
                    b3Var.C6(kVar, aVar12);
                }
                return Unit.INSTANCE;
            case 24:
                fs.f fVar2 = (fs.f) obj4;
                o4.t0 t0Var2 = (o4.t0) obj;
                t0Var2.getClass();
                t0Var2.x(Float.intBitsToFloat((int) (fVar2.a() >> 32)) - (((m1) obj3).getFloatValue() / 2.0f));
                t0Var2.q(Float.intBitsToFloat((int) (fVar2.a() & 4294967295L)) - (((m1) obj2).getFloatValue() / 2.0f));
                z1 z1Var = fVar2.f73391f;
                t0Var2.v(z1Var.getFloatValue());
                t0Var2.w(z1Var.getFloatValue());
                t0Var2.k(fVar2.f73392g.getFloatValue());
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar9 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj4;
                gz1.a aVar14 = (gz1.a) obj3;
                String str2 = (String) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                str2.getClass();
                ((p1) obj2).setValue(str2);
                if (str2.length() == 0) {
                    bVar9.F6().E.k(null, gz1.a.a(aVar14, null, null, null, null, null, null, null, null, 0L, null, null, 0.0d, 0L, 8175));
                }
                return Unit.INSTANCE;
            case 26:
                gv0.d dVar4 = (gv0.d) obj4;
                wd2.m1 m1Var = (wd2.m1) obj3;
                l lVar2 = (l) obj2;
                if (((Boolean) obj).booleanValue()) {
                    dVar4.P = m1Var;
                    lVar2.invoke(m1Var);
                } else {
                    int i17 = gv0.d.O0;
                }
                return Unit.INSTANCE;
            case 27:
                ((p) obj4).invoke((w) obj3, ((i53.c) obj2).get(((Integer) obj).intValue()));
                return Unit.INSTANCE;
            case 28:
                l lVar3 = (l) obj4;
                List list3 = (List) obj2;
                int iIntValue = ((Integer) obj).intValue();
                w wVarC = pv0.j.c((pv0.h) obj3);
                lVar3.invoke(wVarC != null ? x.b(wVarC, ((o) list3.get(iIntValue)).f141395a) : null);
                return Unit.INSTANCE;
            default:
                ug2.x xVar = (ug2.x) obj4;
                ug2.x xVar2 = (ug2.x) obj3;
                ug2.x xVar3 = (ug2.x) obj2;
                i3 i3Var3 = (i3) obj;
                i3Var3.getClass();
                String str3 = i3Var3.f111063a;
                int iHashCode = str3.hashCode();
                if (iHashCode != -2077709277) {
                    if (iHashCode != -405184991) {
                        if (iHashCode == 2213697 && str3.equals("HELP")) {
                            xVar.invoke();
                        }
                    } else if (str3.equals(CodePackage.REMINDERS)) {
                        xVar3.invoke();
                    }
                } else if (str3.equals("SETTINGS")) {
                    xVar2.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
