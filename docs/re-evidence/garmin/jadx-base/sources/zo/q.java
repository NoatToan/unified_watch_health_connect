package zo;

import android.widget.TextView;
import androidx.lifecycle.w0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import java.text.DecimalFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r22.a1;
import r22.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzo/q;", "Lzo/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f206067k = new a(null);

    @Override // zo.d
    public final void F6(int i14, int i15) {
        e1.Z.getClass();
        e1 e1VarA = e1.a.a(i14, 0.0d, i15);
        e1VarA.Y = new yw2.h(this, 15);
        e1VarA.show(getChildFragmentManager(), "MinMaxDistancePickerFragment");
    }

    @Override // zo.d
    public final void G6(int i14) {
        g22.e.l(this);
        E6().B4(i14, this.f206024g);
    }

    @Override // zo.d
    public final void u6(vo.a aVar) {
        aVar.getClass();
        A6().setButtonTopLabel(getString(R.string.leg_distance));
        TextView textView = this.f206019b;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("adjustLegMetricLabel");
            throw null;
        }
        textView.setText(getString(R.string.adjust_leg_distance));
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBarY6 = y6();
        String string = getString(R.string.lbl_distance);
        string.getClass();
        int i14 = LabelledValuesRangeProgressBar.f47474k;
        labelledValuesRangeProgressBarY6.k(new a1(labelledValuesRangeProgressBarY6), string);
    }

    @Override // zo.d
    public final String v6(int i14) {
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        l3.a aVar = l3.f23124b;
        DecimalFormat decimalFormat = l3.f23137o;
        aVar.getClass();
        return l3.a.Q(requireContext(), i14, decimalFormat, true, zY);
    }

    @Override // zo.d
    public final fz.c w6() {
        return fz.c.DISTANCE;
    }

    @Override // zo.d
    public final w0 z6() {
        ap.d dVarE6 = E6();
        int i14 = this.f206024g;
        w0 w0Var = new w0();
        w0Var.n(dVarE6.f11593e.f198239i, new ap.d.c(new ap.c(i14, dVarE6, w0Var, 2)));
        w0Var.n(dVarE6.f11594f, new ap.d.c(new ap.c(dVarE6, i14, w0Var, 3)));
        return w0Var;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/q$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
