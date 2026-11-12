package a71;

import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import lo.l3;
import r1.q2;
import r22.q1;
import r22.r1;
import r22.s1;
import w61.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements RadioGroup.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f1769b;

    public /* synthetic */ f(Fragment fragment, int i14) {
        this.f1768a = i14;
        this.f1769b = fragment;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i14) {
        int i15 = this.f1768a;
        Fragment fragment = this.f1769b;
        switch (i15) {
            case 0:
                com.garmin.android.apps.connectmobile.performance.trainingload.e eVar = (com.garmin.android.apps.connectmobile.performance.trainingload.e) fragment;
                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                radioGroup.getClass();
                if (i14 == R.id.first_option) {
                    x xVar = eVar.f40220c;
                    if (xVar != null) {
                        xVar.f183276k0.j(Boolean.FALSE);
                    }
                } else if (i14 == R.id.second_option) {
                    ht.a.f85464a.getClass();
                    ht.a.a(null, "LoadRatioClicked");
                    x xVar2 = eVar.f40220c;
                    if (xVar2 != null) {
                        xVar2.f183276k0.j(Boolean.TRUE);
                    }
                }
                break;
            case 1:
                q1 q1Var = (q1) fragment;
                if (q1Var.f149810h != null && q1Var.f149815m != null && q1Var.f149816n != null) {
                    if (i14 == R.id.statuteRadioButton) {
                        q1Var.f149811i.setChecked(true);
                        q2 q2Var = q1Var.f149810h;
                        l3 l3Var = q1Var.f149815m;
                        l3 l3Var2 = q1Var.f149816n;
                        q2Var.getClass();
                        r22.b.a aVar2 = r22.b.f149582t;
                        l3Var.getClass();
                        l3Var2.getClass();
                    }
                    if (i14 == R.id.metricRadioButton) {
                        q1Var.f149812j.setChecked(true);
                        q2 q2Var2 = q1Var.f149810h;
                        l3 l3Var3 = q1Var.f149816n;
                        l3 l3Var4 = q1Var.f149815m;
                        q2Var2.getClass();
                        r22.b.a aVar3 = r22.b.f149582t;
                        l3Var3.getClass();
                        l3Var4.getClass();
                    }
                    break;
                }
                break;
            case 2:
                r1 r1Var = (r1) fragment;
                if (r1Var.f149848x != null && r1Var.C != null && r1Var.D != null) {
                    if (i14 == R.id.statuteRadioButton) {
                        r1Var.f149850z.setChecked(true);
                        r1Var.f149848x.a(r1Var.C, r1Var.D);
                    }
                    if (i14 == R.id.metricRadioButton) {
                        r1Var.A.setChecked(true);
                        r1Var.f149848x.a(r1Var.D, r1Var.C);
                    }
                    break;
                }
                break;
            default:
                s1 s1Var = (s1) fragment;
                if (i14 == R.id.statuteRadioButton) {
                    s1Var.B.setChecked(true);
                    s1.f fVar = s1Var.f149885z;
                    if (fVar != null) {
                        fVar.b();
                    }
                } else if (i14 == R.id.metricRadioButton) {
                    s1Var.C.setChecked(true);
                    s1.d dVar = s1Var.A;
                    if (dVar != null) {
                        dVar.c();
                    }
                }
                break;
        }
    }
}
