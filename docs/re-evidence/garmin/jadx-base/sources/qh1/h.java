package qh1;

import androidx.lifecycle.y0;
import c22.l3;
import c22.n3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale2.bodycomposition.IndexScale2AdjustBodyCompositionActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p13.u0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IndexScale2AdjustBodyCompositionActivity f144736b;

    public /* synthetic */ h(IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity, int i14) {
        this.f144735a = i14;
        this.f144736b = indexScale2AdjustBodyCompositionActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int iB;
        int i14 = this.f144735a;
        IndexScale2AdjustBodyCompositionActivity indexScale2AdjustBodyCompositionActivity = this.f144736b;
        switch (i14) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                String str = (String) obj2;
                String str2 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                str.getClass();
                n3 n3Var = str.equals((String) indexScale2AdjustBodyCompositionActivity.f43113e.getValue()) ? n3.POUND : n3.KILOGRAM;
                y0<rh1.a> y0Var = indexScale2AdjustBodyCompositionActivity.da().f144769d;
                n3Var.getClass();
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).S("key_pair_custom_metrics_muscle_mass_unit", n3Var.name());
                if (p.b.f144772a[n3Var.ordinal()] == 1) {
                    l3.f23124b.getClass();
                    iB = MathKt.b(dDoubleValue * 453.592d);
                } else {
                    l3.f23124b.getClass();
                    iB = MathKt.b(dDoubleValue * ((double) 1000));
                }
                Integer numValueOf = Integer.valueOf(iB);
                rh1.a aVarD = y0Var.d();
                if (aVarD != null) {
                    rh1.b bVar = aVarD.f152745a;
                    rh1.b bVarB = bVar != null ? rh1.b.b(bVar, null, null, numValueOf, 11) : new rh1.b(null, null, numValueOf, null, 11, null);
                    rh1.a aVarA = rh1.a.a(aVarD, null, null, n3Var, null, false, 27);
                    rh1.a.f152744f.getClass();
                    y0Var.m(rh1.a.a(aVarA, bVarB, null, null, null, false, 22));
                }
                break;
            case 1:
                Double d14 = (Double) obj;
                d14.getClass();
                String str3 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                ((String) obj2).getClass();
                y0<rh1.a> y0Var2 = indexScale2AdjustBodyCompositionActivity.da().f144769d;
                rh1.a aVarD2 = y0Var2.d();
                if (aVarD2 != null) {
                    rh1.b bVar2 = aVarD2.f152745a;
                    rh1.b bVarB2 = bVar2 != null ? rh1.b.b(bVar2, null, d14, null, 13) : new rh1.b(null, d14, null, null, 13, null);
                    rh1.a.f152744f.getClass();
                    y0Var2.m(rh1.a.a(aVarD2, bVarB2, null, null, null, false, 22));
                }
                break;
            default:
                String str4 = (String) obj2;
                String str5 = IndexScale2AdjustBodyCompositionActivity.f43108h;
                str4.getClass();
                new xg1.d(R.string.lbl_skeletal_muscle_mass, (Double) obj, str4, u0.e(new o13.p((String) indexScale2AdjustBodyCompositionActivity.f43112d.getValue(), new xg1.d.a.C3553a(11.0d, 1.7d, 90.9d)), new o13.p((String) indexScale2AdjustBodyCompositionActivity.f43113e.getValue(), new xg1.d.a.C3553a(25.0d, 3.7d, 200.0d))), new h(indexScale2AdjustBodyCompositionActivity, 0)).show(indexScale2AdjustBodyCompositionActivity.getSupportFragmentManager(), (String) null);
                break;
        }
        return Unit.INSTANCE;
    }
}
