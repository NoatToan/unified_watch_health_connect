package hc0;

import android.content.Context;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import d53.w;
import fi2.z;
import g2.m1;
import java.util.ArrayList;
import java.util.Map;
import lh2.o;
import lh2.t;
import o13.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f83239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f83240e;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f83236a = i14;
        this.f83237b = obj;
        this.f83238c = obj2;
        this.f83239d = obj3;
        this.f83240e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        String string;
        int i14 = this.f83236a;
        Object obj2 = this.f83240e;
        Object obj3 = this.f83239d;
        Object obj4 = this.f83238c;
        Object obj5 = this.f83237b;
        switch (i14) {
            case 0:
                k kVar = (k) obj5;
                String str = (String) obj4;
                gj1.c cVar = (gj1.c) obj3;
                sd2.f fVar = (sd2.f) obj2;
                Boolean bool = (Boolean) obj;
                s2 s2Var = kVar.I;
                if (s2Var != null) {
                    s2Var.hideProgressOverlay();
                }
                if (bool.booleanValue()) {
                    string = kVar.getString(R.string.device_action_msg_remove_device_success, str);
                    if (cVar != null) {
                        gj1.b bVar = cVar.f77653b;
                        int i15 = cVar.f77654c;
                        ej1.b bVar2 = cVar.f77652a;
                        if (bVar2 == ej1.b.NONE || i15 == 0) {
                            androidx.fragment.app.m activity = kVar.getActivity();
                            fVar.getClass();
                            zb0.k.e(activity, fVar, new z41.j(27));
                        } else {
                            String displayName = (bVar == null || bVar.getDisplayName() == null) ? "" : bVar.getDisplayName();
                            Context contextRequireContext = kVar.requireContext();
                            hj1.b.f83993a.getClass();
                            p pVarC = hj1.b.a.c(contextRequireContext, bVar2, displayName);
                            hj1.a.a(kVar.requireContext(), (String) pVarC.f128594a, (String) pVarC.f128595b, i15 > 1, null, new m1(19, kVar, fVar));
                        }
                    } else {
                        androidx.fragment.app.m activity2 = kVar.getActivity();
                        fVar.getClass();
                        zb0.k.e(activity2, fVar, new z41.j(27));
                    }
                } else {
                    string = kVar.getString(R.string.device_action_msg_remove_device_failure, str);
                }
                Toast.makeText(kVar.getActivity(), string, 1).show();
                break;
            case 1:
                lh2.a aVar = (lh2.a) obj5;
                ii2.b bVar3 = (ii2.b) obj4;
                Map<String, ? extends Object> map = (Map) obj3;
                ei2.a aVar2 = (ei2.a) obj2;
                int i16 = lh2.a.f112449f;
                hi2.d dVar = aVar.f112450b;
                aVar.i(bVar3, map, null);
                int iR = aVar2.r();
                StyledTextView styledTextView = aVar.f112452d;
                if (iR > 0) {
                    String strValueOf = String.valueOf(aVar2.r());
                    dVar.getClass();
                    styledTextView.setText(strValueOf);
                } else {
                    dVar.getClass();
                    styledTextView.setVisibility(8);
                }
                if (aVar2.s()) {
                    hi2.a.C1658a c1658a = hi2.a.f83879a;
                    String strE = ei2.h.e(bVar3, map);
                    c1658a.getClass();
                    if (!hi2.a.C1658a.f(strE)) {
                        aVar2.n(bVar3, map, Boolean.TRUE);
                    }
                }
                break;
            case 2:
                ei2.h hVar = (ei2.h) obj5;
                ii2.b bVar4 = (ii2.b) obj4;
                Map<String, ? extends Object> map2 = (Map) obj3;
                lh2.k kVar2 = (lh2.k) obj2;
                int i17 = lh2.k.f112507d;
                if (hVar instanceof di2.b) {
                    kVar2.f112509c.setText(((di2.b) hVar).b(hVar.j(bVar4, map2)));
                }
                kVar2.i(bVar4, map2, null);
                break;
            case 3:
                z zVar = (z) obj5;
                ii2.b bVar5 = (ii2.b) obj4;
                Map map3 = (Map) obj3;
                o oVar = (o) obj2;
                int i18 = o.f112525g;
                Group group = oVar.f112529e;
                hi2.d dVar2 = oVar.f112526b;
                Group group2 = oVar.f112527c;
                String strD = zVar.d(bVar5, String.valueOf(map3.get(mh2.i.ALL_DAY_VALUE_ID.f118617a)));
                Boolean boolValueOf = !w.J(strD) ? Boolean.valueOf(Boolean.parseBoolean(strD)) : null;
                if (boolValueOf != null) {
                    boolean zBooleanValue = boolValueOf.booleanValue();
                    group2.setVisibility(0);
                    oVar.acclimationSwitchView.setChecked(zBooleanValue);
                } else {
                    dVar2.getClass();
                    group2.setVisibility(8);
                }
                String strD2 = zVar.d(bVar5, String.valueOf(map3.get(mh2.i.SLEEP_VALUE_ID.f118617a)));
                Boolean boolValueOf2 = w.J(strD2) ? null : Boolean.valueOf(Boolean.parseBoolean(strD2));
                if (boolValueOf2 == null) {
                    dVar2.getClass();
                    group.setVisibility(8);
                } else {
                    boolean zBooleanValue2 = boolValueOf2.booleanValue();
                    group.setVisibility(0);
                    oVar.sleepTrackingSwitchView.setChecked(zBooleanValue2);
                }
                break;
            case 4:
                lh2.p pVar = (lh2.p) obj5;
                ii2.b bVar6 = (ii2.b) obj4;
                Map<String, ? extends Object> map4 = (Map) obj3;
                ei2.h hVar2 = (ei2.h) obj2;
                int i19 = lh2.p.f112531e;
                StyledTextView styledTextView2 = pVar.f112533c;
                pVar.i(bVar6, map4, null);
                pVar.f112532b.setText(hVar2.f(bVar6, map4));
                Object obj6 = map4.get(mh2.i.INFO.f118617a);
                String string2 = obj6 != null ? obj6.toString() : null;
                bVar6.f93792b.getClass();
                ArrayList arrayListY4 = ii2.b.y4(map4);
                hi2.i.a aVar3 = hi2.i.f83907a;
                Context context = hVar2.f64388a;
                aVar3.getClass();
                String strC = hi2.i.a.c(context, string2, arrayListY4);
                if (strC.length() > 0) {
                    styledTextView2.setVisibility(0);
                    styledTextView2.setText(strC);
                }
                pVar.f112534d.setVisibility(hVar2.l(bVar6, map4) ? 0 : 8);
                break;
            default:
                t tVar = (t) obj5;
                ii2.b bVar7 = (ii2.b) obj4;
                Map<String, ? extends Object> map5 = (Map) obj3;
                int i24 = t.f112552e;
                tVar.i(bVar7, map5, null);
                boolean z14 = Boolean.parseBoolean(((ei2.h) obj2).f(bVar7, map5));
                SwitchCompat switchCompat = tVar.switchView;
                boolean zIsChecked = switchCompat.isChecked();
                hi2.d dVar3 = tVar.f112553b;
                if (zIsChecked == z14) {
                    dVar3.getClass();
                } else {
                    dVar3.getClass();
                    switchCompat.setChecked(z14);
                }
                break;
        }
    }
}
