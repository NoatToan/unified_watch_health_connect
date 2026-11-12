package zm;

import android.view.View;
import androidx.core.view.m1;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements androidx.core.view.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OverlayCombinedChart f205198b;

    public /* synthetic */ a(OverlayCombinedChart overlayCombinedChart, int i14) {
        this.f205197a = i14;
        this.f205198b = overlayCombinedChart;
    }

    @Override // androidx.core.view.z
    public final m1 onApplyWindowInsets(View view2, m1 m1Var) {
        int i14 = this.f205197a;
        OverlayCombinedChart overlayCombinedChart = this.f205198b;
        switch (i14) {
            case 0:
                int i15 = c.f205201y;
                view2.getClass();
                c7.e eVarI = m1Var.f6508a.i(128);
                eVarI.getClass();
                overlayCombinedChart.setExtraLeftOffset(Utils.convertPixelsToDp(eVarI.f25190a));
                break;
            default:
                int i16 = z.f205267p;
                view2.getClass();
                c7.e eVarI2 = m1Var.f6508a.i(128);
                eVarI2.getClass();
                overlayCombinedChart.setExtraLeftOffset(Utils.convertPixelsToDp(eVarI2.f25190a));
                break;
        }
        return m1Var;
    }
}
