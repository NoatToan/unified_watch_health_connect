package zt1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import cu1.n;
import fu1.i;
import fu1.s;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.x0;
import rt1.r;
import wt1.u;
import xw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzt1/h;", "Lzt1/f;", "", "Lzt1/c;", "view", "", "athletePlanId", "Lxw1/c;", "trainingPlan", "<init>", "(Lzt1/c;JLxw1/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zt1.c f206997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i f206998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f206999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f207000t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c f207001u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f207002v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f207003w;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zt1/h$a", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends n {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            h.A(h.this, j8, cVar, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zt1/h$b", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends n {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            boolean z14 = cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            h hVar = h.this;
            if (z14) {
                hVar.f206997q.J0();
            } else {
                hVar.f206997q.Y8();
                hVar.f206997q.t();
            }
            hVar.f206998r = null;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"zt1/h$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lxw1/d;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            h.A(h.this, j8, cVar, 0);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, xw1.d dVar) {
            eVar.getClass();
            dVar.getClass();
        }
    }

    public /* synthetic */ h(zt1.c cVar, long j8, xw1.c cVar2, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? 0L : j8, (i14 & 4) != 0 ? new xw1.c(null, null, null, null, null, 0, null, null, null, null, null, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 33554431, null) : cVar2);
    }

    public static final void A(h hVar, long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, int i14) {
        hVar.f206973f.remove(Long.valueOf(j8));
        zt1.c cVar2 = hVar.f206997q;
        cVar2.t();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            cVar2.L0(i14);
            return;
        }
        cVar2.S4(i14);
        cVar2.J0();
        hVar.f206998r = null;
    }

    public final void B(Long l14, xw1.j jVar) {
        int i14;
        if (jVar.getActionOptionId() != null) {
            xw1.c cVarB = xw1.c.b(this.f206970c, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 33554431);
            g gVar = this.f206972e;
            gVar.e(cVarB);
            i.a aVar = i.f73525c;
            long j8 = this.f206969b;
            long jB = jVar.b();
            aVar.getClass();
            this.f206998r = new i(Long.valueOf(j8), new s(l14, Long.valueOf(jB), DateTime.now().toString("yyyy-MM-dd'T'HH:mm:ss.SSSZ")));
            Integer planType = this.f206970c.getPlanType();
            int i15 = r.FIVE_K.f154560a;
            if (planType != null && planType.intValue() == i15) {
                i14 = R.string.msg_change_goal_info;
            } else {
                int i16 = r.TEN_K.f154560a;
                if (planType != null && planType.intValue() == i16) {
                    i14 = R.string.atp_msg_change_10k_goal_info;
                } else {
                    i14 = (planType != null && planType.intValue() == r.HALF_MARATHON.f154560a) ? R.string.atp_msg_change_half_marathon_goal_info : -1;
                }
            }
            if (i14 == -1) {
                return;
            }
            boolean zK = jVar.k();
            zt1.c cVar = this.f206997q;
            if (zK) {
                this.f206999s = jVar.getSuggestedPlanGoal();
                String localizedGoal = gVar.d().f206993a.getLocalizedGoal();
                String str = "";
                String strI = localizedGoal != null ? hb.a.i(localizedGoal) : "";
                m suggestedPlanGoal = jVar.getSuggestedPlanGoal();
                if (suggestedPlanGoal != null) {
                    String localizedGoal2 = suggestedPlanGoal.getLocalizedGoal();
                    String strI2 = localizedGoal2 != null ? hb.a.i(localizedGoal2) : null;
                    if (strI2 != null) {
                        str = strI2;
                    }
                }
                String strC0 = cVar.C0(R.string.msg_change_goal);
                x0 x0Var = x0.f105818a;
                cVar.C5(strC0, String.format(cVar.C0(i14), Arrays.copyOf(new Object[]{strI, str}, 2)));
                return;
            }
            if (jVar.j()) {
                this.f207000t = jVar.getSuggestedGoalTime();
                int selectedPaceGoalTime = gVar.d().f206993a.getSelectedPaceGoalTime();
                Integer suggestedGoalTime = jVar.getSuggestedGoalTime();
                int iIntValue = suggestedGoalTime != null ? suggestedGoalTime.intValue() : 0;
                String strT1 = l3.a.t1(l3.f23124b, selectedPaceGoalTime);
                String strS1 = l3.a.s1(iIntValue, "%1$d:%2$02d");
                String strC1 = cVar.C0(R.string.msg_change_goal);
                x0 x0Var2 = x0.f105818a;
                cVar.J6(strC1, String.format(cVar.C0(i14), Arrays.copyOf(new Object[]{strT1, strS1}, 2)));
                return;
            }
            if (jVar.r()) {
                x();
                return;
            }
            boolean zQ = jVar.q();
            ArrayList<Long> arrayList = this.f206973f;
            u uVar = this.f206974g;
            if (zQ) {
                i iVar = this.f206998r;
                if (iVar != null) {
                    cVar.G1();
                    arrayList.add(Long.valueOf(uVar.j(this.f206969b, iVar, this.f207002v)));
                    fy1.i.a.t(fy1.i.f73924a);
                    return;
                }
                return;
            }
            if (jVar.o()) {
                i iVar2 = this.f206998r;
                if (iVar2 != null) {
                    cVar.G1();
                    arrayList.add(Long.valueOf(uVar.e(iVar2, this.f207003w)));
                    return;
                }
                return;
            }
            if (jVar.i()) {
                cVar.A1();
            } else if (jVar.m()) {
                cVar.b5();
            } else if (jVar.s()) {
                cVar.F4();
            }
        }
    }

    @Override // zt1.f
    public final void l() {
    }

    @Override // zt1.f
    public final com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> n() {
        return this.f207001u;
    }

    @Override // zt1.f
    public final void q(xw1.c cVar, boolean z14) {
        cVar.getClass();
        z();
    }

    @Override // zt1.f
    public final void u(xw1.n nVar) {
        throw null;
    }

    @Override // zt1.f
    public final void y(int i14) {
        i iVar;
        if (i14 == 0) {
            z();
        } else if (i14 == 3 && (iVar = this.f206998r) != null) {
            this.f206997q.G1();
            this.f206973f.add(Long.valueOf(this.f206974g.j(this.f206969b, iVar, this.f207002v)));
            fy1.i.a.t(fy1.i.f73924a);
        }
    }

    @Override // zt1.f
    public final void z() {
        i iVar = this.f206998r;
        if (iVar != null) {
            this.f206997q.G4();
            xw1.c cVar = this.f206972e.d().f206993a;
            this.f206973f.add(Long.valueOf(this.f206974g.A(this.f206969b, cVar, iVar, this.f207001u)));
        }
        fy1.i.a.t(fy1.i.f73924a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zt1.c cVar, long j8, xw1.c cVar2) {
        super(cVar, j8, cVar2);
        cVar.getClass();
        cVar2.getClass();
        this.f206997q = cVar;
        this.f207001u = new c();
        this.f207002v = new a();
        this.f207003w = new b();
    }
}
