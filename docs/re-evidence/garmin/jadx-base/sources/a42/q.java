package a42;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.stats.climbs.ClimbDetailActivity;
import com.garmin.android.apps.connectmobile.activities.stats.climbs.ClimbListActivity;
import com.garmin.android.apps.connectmobile.l2;
import cw1.k0;
import i3.a1;
import java.util.List;
import java.util.Map;
import lc.m0;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1068f;

    public /* synthetic */ q(int i14, ey1.a aVar, m0 m0Var, Context context, p1 p1Var) {
        this.f1063a = 2;
        this.f1064b = i14;
        this.f1065c = aVar;
        this.f1067e = m0Var;
        this.f1066d = context;
        this.f1068f = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f1063a;
        int i15 = this.f1064b;
        Object obj = this.f1068f;
        Object obj2 = this.f1067e;
        Object obj3 = this.f1066d;
        Object obj4 = this.f1065c;
        switch (i14) {
            case 0:
                s sVar = (s) obj4;
                Context context = (Context) obj3;
                o53.b0 b0Var = (o53.b0) obj2;
                a1 a1Var = (a1) obj;
                if (i15 == 1) {
                    p1.z<sd2.f> zVar = sVar.f1075f;
                    sd2.f fVarI = zVar != null ? zVar.i(0) : null;
                    if (fVarI != null) {
                        s.f1074h.invoke(fVarI);
                    } else {
                        Toast.makeText(context, R.string.lbl_error_occurred, 0).show();
                    }
                } else {
                    s.a aVar = s.f1073g;
                    if (i15 > 1) {
                        ge1.b.T(b0Var, null, null, new s.c(a1Var, null), 3);
                    }
                }
                break;
            case 1:
                x1 x1Var = (x1) obj3;
                ClimbListActivity climbListActivity = (ClimbListActivity) obj;
                int i16 = ClimbListActivity.f29815a;
                Bundle bundle = new Bundle(1);
                bundle.putString("Screen", "ActivityDetails");
                ht.a.f85464a.getClass();
                ht.a.a(bundle, "ViewClimbDetails");
                dq.a aVar2 = new dq.a((ActivityDetailChartDTO) obj2, x1Var, cq.z.a((List) obj4, x1Var));
                ClimbDetailActivity.f29814a.getClass();
                Intent intent = new Intent(climbListActivity, (Class<?>) ClimbDetailActivity.class);
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("CLIMB_EXTRA", x1Var);
                bundle2.putInt("CLIMB_POSITION_EXTRA", i15);
                bundle2.putParcelable("activity_chart_data", aVar2);
                l2.f37135b.getClass();
                l2.a.b().a(intent, bundle2);
                climbListActivity.startActivity(intent);
                break;
            case 2:
                ey1.a aVar3 = (ey1.a) obj4;
                m0 m0Var = (m0) obj2;
                Context context2 = (Context) obj3;
                cy1.f fVar = cy1.f.f56801a;
                if (i15 < ((i53.c) ((p1) obj).getF182175a()).size() - 1) {
                    int i17 = i15 + 1;
                    aVar3.M4(i17, i17);
                    w3.x.s(m0Var, cy1.f.f56801a.c(), h7.c.a(new o13.p("dayIndexKey", Integer.valueOf(i17))));
                } else {
                    aVar3.P4(null);
                    aVar3.F4(context2);
                    if (aVar3.y4()) {
                        lc.y.k(by1.r.f22207a.c(), m0Var);
                    } else {
                        lc.y.k(by1.j.f22190a.c(), m0Var);
                    }
                }
                break;
            case 3:
                Fragment fragment = (Fragment) obj4;
                dx2.c cVar = (dx2.c) obj3;
                Map map = (Map) obj2;
                uv2.a aVar4 = (uv2.a) obj;
                cx2.h hVar = uv2.a.f172960c;
                if (fragment instanceof com.garmin.realtimesettings.app.presentationlayer.c) {
                    EditText editText = ((com.garmin.realtimesettings.app.presentationlayer.c) fragment).f52657q;
                    int i18 = this.f1064b;
                    if (editText == null) {
                        hVar.getClass();
                        int iF = fb1.c.f(map, gw2.i.MENU_ID.f79975a, cx2.b.f56665a);
                        Integer numValueOf = Integer.valueOf(iF);
                        if (iF < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            uv2.a.d(fragment, cVar, i18, numValueOf.intValue());
                        }
                    } else {
                        hVar.getClass();
                        cVar.f61488e.j(Boolean.TRUE);
                        editText.clearFocus();
                        cVar.f61489f.f(fragment, new uv2.a.b(new k0(cVar, map, aVar4, fragment, i18)));
                    }
                }
                break;
            case 4:
                i53.c cVar2 = (i53.c) obj4;
                e23.l lVar = (e23.l) obj3;
                n1 n1Var = (n1) obj2;
                e23.l lVar2 = (e23.l) obj;
                if (n1Var.getIntValue() != i15) {
                    n1Var.t(i15);
                    k30.k kVar = (k30.k) p13.h0.e0(i15, cVar2);
                    if (kVar != null) {
                        lVar2.invoke(kVar);
                    }
                }
                lVar.invoke(Boolean.FALSE);
                break;
            default:
                wv2.k kVar2 = (wv2.k) obj4;
                dx2.c cVar3 = (dx2.c) obj3;
                Map map2 = (Map) obj2;
                int i19 = wv2.e.a.f187481a[((gw2.h) obj).ordinal()];
                kVar2.h(cVar3, map2, new xv2.c(i15, null, i19 != 1 ? i19 != 2 ? null : Boolean.TRUE : Boolean.FALSE));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(int i14, Object obj, Object obj2, Object obj3, Object obj4, int i15) {
        this.f1063a = i15;
        this.f1064b = i14;
        this.f1065c = obj;
        this.f1066d = obj2;
        this.f1067e = obj3;
        this.f1068f = obj4;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f1063a = i15;
        this.f1065c = obj;
        this.f1066d = obj2;
        this.f1067e = obj3;
        this.f1068f = obj4;
        this.f1064b = i14;
    }

    public /* synthetic */ q(wv2.k kVar, Fragment fragment, dx2.c cVar, Map map, int i14, gw2.h hVar) {
        this.f1063a = 5;
        this.f1065c = kVar;
        this.f1066d = cVar;
        this.f1067e = map;
        this.f1064b = i14;
        this.f1068f = hVar;
    }
}
