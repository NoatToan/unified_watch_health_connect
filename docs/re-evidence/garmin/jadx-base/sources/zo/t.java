package zo;

import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.w0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import r22.f1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzo/t;", "Lzo/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f206072l = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public oi0.h f206073k;

    @Override // zo.d
    public final void F6(int i14, int i15) {
        String strG = e5.g(getString(R.string.leg_time), StringUtils.SPACE, getString(R.string.common_duration_format_label));
        f1.a aVar = f1.f149645b1;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        f1 f1VarA = f1.a.a(aVar, i14, 0, i15, strG, oi0.c.A(contextRequireContext, new z81.b(23), strG), 456);
        f1VarA.V0 = new s(this, 0);
        f1VarA.show(getChildFragmentManager(), "MinMaxDurationPickerFragment");
    }

    @Override // zo.d
    public final void G6(int i14) {
        g22.e.l(this);
        E6().C4(i14, this.f206024g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        this.f206073k = new oi0.h(context);
    }

    @Override // zo.d
    public final void u6(vo.a aVar) {
        aVar.getClass();
        A6().setButtonTopLabel(getString(R.string.lbl_multisport_leg_time));
        GCMComplexTwoLineButton gCMComplexTwoLineButtonA6 = A6();
        int i14 = aVar.f178987c;
        String strV6 = v6(i14);
        oi0.h hVar = this.f206073k;
        if (hVar == null) {
            p005kotlin.jvm.internal.s.m("gcmContentDescriptionTimeFormatter");
            throw null;
        }
        gCMComplexTwoLineButtonA6.b(strV6, hVar.d(i14, true));
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBarY6 = y6();
        String string = getString(R.string.lbl_time);
        string.getClass();
        labelledValuesRangeProgressBarY6.k(new s(this, 1), string);
        TextView textView = this.f206019b;
        if (textView != null) {
            textView.setText(getString(R.string.adjust_leg_time));
        } else {
            p005kotlin.jvm.internal.s.m("adjustLegMetricLabel");
            throw null;
        }
    }

    @Override // zo.d
    public final String v6(int i14) {
        l3.f23124b.getClass();
        String strE1 = l3.a.e1(i14);
        return strE1 == null ? "" : strE1;
    }

    @Override // zo.d
    public final fz.c w6() {
        return fz.c.TIME;
    }

    @Override // zo.d
    public final w0 z6() {
        ap.d dVarE6 = E6();
        int i14 = this.f206024g;
        w0 w0Var = new w0();
        w0Var.n(dVarE6.f11593e.f198239i, new ap.d.c(new ap.c(i14, dVarE6, w0Var, 0)));
        w0Var.n(dVarE6.f11594f, new ap.d.c(new ap.c(dVarE6, i14, w0Var, 1)));
        return w0Var;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/t$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
