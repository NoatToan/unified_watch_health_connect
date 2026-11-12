package cq0;

import c2.a0;
import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import g02.y1;
import i3.x3;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import p3.x1;
import ta0.q0;
import w52.q1;
import w52.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f55144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55148f;

    public /* synthetic */ i(int i14, int i15, e23.a aVar, wg0.a aVar2, xg0.o oVar, boolean z14) {
        this.f55143a = 26;
        this.f55144b = z14;
        this.f55145c = aVar;
        this.f55146d = i14;
        this.f55147e = aVar2;
        this.f55148f = oVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f55143a;
        int i19 = this.f55146d;
        Object obj3 = this.f55145c;
        Object obj4 = this.f55148f;
        Object obj5 = this.f55147e;
        switch (i18) {
            case 0:
                com.garmin.android.apps.connectmobile.incidentdetection.d dVar = (com.garmin.android.apps.connectmobile.incidentdetection.d) obj5;
                String str = (String) obj4;
                e23.a aVar = (e23.a) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.incidentdetection.d.a aVar2 = com.garmin.android.apps.connectmobile.incidentdetection.d.f36855d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (this.f55144b) {
                        i14 = 2075719869;
                        i15 = R.string.lbl_fall_detected;
                    } else {
                        i14 = 2075807351;
                        i15 = R.string.incident_detected_title;
                    }
                    String strH = sn.a.h(mVar, i14, i15, mVar);
                    c2 c2Var = ((y) dVar.f55121b.getValue()).f55180e;
                    if (((List) c2Var.getF182175a()).size() == 1) {
                        i16 = 2076015547;
                        i17 = R.string.incident_detection_msg_notify_assistance_contact_in;
                    } else {
                        i16 = 2076136602;
                        i17 = R.string.incident_detection_msg_notify_assistance_contacts_in;
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-1647453783, new a42.n(strH, sn.a.h(mVar, i16, i17, mVar), this.f55146d, str, aVar, c2Var, 8), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ew1.r.a aVar3 = ew1.r.f66699d;
                ((ew1.r) obj5).w6((List) obj4, this.f55144b, (e23.a) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                y1.b((String) obj4, this.f55144b, (h4.r) obj5, this.f55146d, (z3.e) obj3, (p3.m) obj, p0.t(24577));
                break;
            case 3:
                ((Integer) obj2).getClass();
                x3.o(p0.t(i19 | 1), (e23.a) obj3, (h4.r) obj5, (p3.m) obj, (z3.e) obj4, this.f55144b);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ii0.m.a((mi0.c) obj5, this.f55144b, (p003ji0.j) obj4, (e23.a) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                in1.d.a((km1.c) obj5, (DateTime) obj4, (sm1.s) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                iv0.t.c((List) obj5, this.f55144b, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                k11.m.c(this.f55144b, (e23.a) obj3, (e23.l) obj5, (e23.l) obj4, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                kf1.j.b((if1.b) obj5, (List) obj4, (o82.g) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ku1.m.a((fg0.k) obj5, this.f55144b, (Double) obj4, (Double) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                lm0.p.c((h4.r) obj5, this.f55144b, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                p40.u.e((q40.b) obj5, this.f55144b, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                p40.u.b((h4.r) obj5, (q40.b) obj4, this.f55144b, (e23.l) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                rr0.q.e((ir0.e) obj5, (String) obj4, this.f55144b, (o13.p) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                rs0.c.a((h4.r) obj5, (ps0.a) obj4, (xs0.a) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ta0.p0.a(this.f55144b, (q0) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                tw.c.e((List) obj5, (kw.m) obj4, this.f55144b, (e23.l) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                tw.h.a((kw.i) obj5, (DateTime) obj4, (DateTime) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.k) obj5).w6(this.f55144b, (Integer) obj4, (ny1.e) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.navigation.more.a.a((a0) obj5, (List) obj4, this.f55144b, (e23.l) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                w52.t.a((j0) obj5, (m52.d) obj4, this.f55144b, (e23.a) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                w52.z.b((com.garmin.android.apps.connectmobile.workouts.presentation.edit.k) obj5, (com.garmin.android.apps.connectmobile.workouts.presentation.edit.d) obj4, (e23.a) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                r0.b((h4.r) obj5, (String) obj4, this.f55144b, (e23.a) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                q1.d((m52.k) obj5, (j0) obj4, this.f55144b, (com.garmin.android.apps.connectmobile.repcounting.model.c) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                wl.b.a((yl.d) obj5, (o82.a) obj4, (tf0.i) obj3, this.f55144b, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 25:
                ((Integer) obj2).intValue();
                wv0.s.e((t2) obj5, this.f55144b, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                xg0.f.a(this.f55144b, (e23.a) obj3, this.f55146d, (wg0.a) obj5, (xg0.o) obj4, (p3.m) obj, p0.t(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                xu0.e.a((ev0.b) obj5, this.f55144b, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                TimingGatesActivity.a aVar5 = TimingGatesActivity.f29952c;
                ((TimingGatesActivity) obj5).ea(p0.t(i19 | 1), (h4.r) obj3, (String) obj4, (p3.m) obj, this.f55144b);
                break;
            default:
                ((Integer) obj2).intValue();
                yu1.i.a(this.f55144b, (com.garmin.android.apps.connectmobile.workouts.data.model.k) obj5, (com.garmin.android.apps.connectmobile.workouts.data.model.c) obj4, (m52.c) obj3, (p3.m) obj, p0.t(i19 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(e23.a aVar, boolean z14, h4.r rVar, z3.e eVar, int i14) {
        this.f55143a = 3;
        this.f55145c = aVar;
        this.f55144b = z14;
        this.f55147e = rVar;
        this.f55148f = eVar;
        this.f55146d = i14;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, boolean z14, int i14, int i15) {
        this.f55143a = i15;
        this.f55147e = obj;
        this.f55148f = obj2;
        this.f55145c = obj3;
        this.f55144b = z14;
        this.f55146d = i14;
    }

    public /* synthetic */ i(Object obj, Object obj2, boolean z14, Object obj3, int i14, int i15) {
        this.f55143a = i15;
        this.f55147e = obj;
        this.f55148f = obj2;
        this.f55144b = z14;
        this.f55145c = obj3;
        this.f55146d = i14;
    }

    public /* synthetic */ i(Object obj, boolean z14, e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f55143a = i15;
        this.f55147e = obj;
        this.f55144b = z14;
        this.f55145c = aVar;
        this.f55148f = aVar2;
        this.f55146d = i14;
    }

    public /* synthetic */ i(Object obj, boolean z14, Object obj2, Object obj3, int i14, int i15) {
        this.f55143a = i15;
        this.f55147e = obj;
        this.f55144b = z14;
        this.f55148f = obj2;
        this.f55145c = obj3;
        this.f55146d = i14;
    }

    public /* synthetic */ i(String str, boolean z14, h4.r rVar, int i14, z3.e eVar, int i15) {
        this.f55143a = 2;
        this.f55148f = str;
        this.f55144b = z14;
        this.f55147e = rVar;
        this.f55146d = i14;
        this.f55145c = eVar;
    }

    public /* synthetic */ i(boolean z14, com.garmin.android.apps.connectmobile.incidentdetection.d dVar, int i14, String str, e23.a aVar) {
        this.f55143a = 0;
        this.f55144b = z14;
        this.f55147e = dVar;
        this.f55146d = i14;
        this.f55148f = str;
        this.f55145c = aVar;
    }

    public /* synthetic */ i(boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, m52.c cVar2, int i14) {
        this.f55143a = 29;
        this.f55144b = z14;
        this.f55147e = kVar;
        this.f55148f = cVar;
        this.f55145c = cVar2;
        this.f55146d = i14;
    }

    public /* synthetic */ i(boolean z14, e23.a aVar, e23.l lVar, e23.l lVar2, int i14) {
        this.f55143a = 7;
        this.f55144b = z14;
        this.f55145c = aVar;
        this.f55147e = lVar;
        this.f55148f = lVar2;
        this.f55146d = i14;
    }

    public /* synthetic */ i(boolean z14, q0 q0Var, e23.a aVar, e23.a aVar2, int i14) {
        this.f55143a = 15;
        this.f55144b = z14;
        this.f55147e = q0Var;
        this.f55145c = aVar;
        this.f55148f = aVar2;
        this.f55146d = i14;
    }
}
