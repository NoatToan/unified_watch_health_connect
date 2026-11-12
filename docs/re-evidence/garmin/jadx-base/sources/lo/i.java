package lo;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import i3.e5;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class i extends r22.a2 {
    public String S0;
    public String T0;
    public b U0 = b.MAX_SPEED;
    public String V0 = "";
    public am.x0 W0 = am.x0.f4308n;
    public c22.q3 X0;
    public a Y0;

    public interface a {
        void j(double d14);
    }

    public enum b {
        MAX_SPEED,
        MIN_SPEED,
        PACE,
        SWIM_PACE
    }

    public static i T6(double d14, int i14, am.x0 x0Var, c22.q3 q3Var, b bVar) {
        Bundle bundle = new Bundle();
        i iVar = new i();
        bundle.putDouble("current_value", d14);
        bundle.putInt("max_value", i14);
        bundle.putSerializable("activity_type", x0Var);
        bundle.putParcelable("speed_unit", q3Var);
        bundle.putInt(NotificationConstants.KEY_DATA_MIME_TYPE, bVar.ordinal());
        iVar.setArguments(bundle);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        double d14 = 0.0d;
        if (arguments != null) {
            d14 = arguments.getDouble("current_value", 0.0d);
            i14 = arguments.getInt("max_value", 0);
            this.W0 = (am.x0) arguments.getSerializable("activity_type");
            this.X0 = (c22.q3) arguments.getParcelable("speed_unit");
            this.U0 = b.values()[arguments.getInt(NotificationConstants.KEY_DATA_MIME_TYPE, 0)];
        } else {
            i14 = 0;
        }
        if (this.X0 == null) {
            this.X0 = am.j.z(f12.l.f68084a) ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        }
        b bVar = this.U0;
        b bVar2 = b.PACE;
        if (bVar != bVar2 && bVar != b.SWIM_PACE) {
            boolean zI = am.z0.I(this.W0.f4358a);
            boolean zB = am.z0.b(am.x0.O1, this.W0.f4358a);
            if (!Double.isNaN(d14)) {
                c22.q3 q3Var = c22.q3.METERS_PER_SECOND;
                c22.q3 q3Var2 = this.X0;
                c22.l3.f23124b.getClass();
                double dW = c22.l3.a.w(d14, q3Var, q3Var2);
                if (zI || zB) {
                    dW = c22.l3.a.T1(dW, 1);
                }
                int i15 = (int) ((dW * 10.0d) % 10.0d);
                E6(i15);
                A6((int) Math.round(dW - (((double) i15) / 10.0d)));
            }
            C6(0, i14, true);
            H6(0, 9, true);
        } else if (Double.isNaN(d14)) {
            C6(0, i14, true);
            H6(0, 59, true);
        } else {
            int i16 = (int) d14;
            int i17 = i16 / 60;
            A6(i17);
            E6(i16 % 60);
            int i18 = this.U0 == bVar2 ? 0 : 50;
            if (i17 == 0) {
                C6(0, i14, true);
                H6(i18, 59, false);
            } else if (i17 == 5) {
                C6(0, i14, true);
                H6(i18, 0, false);
            } else {
                C6(0, i14, true);
                H6(0, 59, true);
            }
        }
        b bVar3 = this.U0;
        if (bVar3 == bVar2 || bVar3 == b.SWIM_PACE) {
            am.x0 x0Var = this.W0;
            f12.l.f68084a.getClass();
            this.T0 = getString(q3.b(x0Var, f12.l.a.a().y()));
        } else {
            this.T0 = getString(this.X0.f23223e);
        }
        String[] strArr = {this.T0};
        this.f149569o = true;
        this.B = true;
        this.f149566l = strArr;
        this.F = getString(R.string.lbl_cancel);
        this.I = getString(R.string.lbl_done);
        int iOrdinal = this.U0.ordinal();
        if (iOrdinal == 1) {
            this.S0 = getString(R.string.lbl_min_speed);
        } else if (iOrdinal == 2) {
            this.S0 = getString(R.string.activity_details_best_pace);
        } else if (iOrdinal != 3) {
            String str = this.W0.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            if (am.z0.b(am.x0.R0, str)) {
                this.S0 = getString(R.string.activity_details_max_descent_speed);
            } else {
                this.S0 = getString(R.string.activity_details_max_speed);
            }
        } else {
            this.S0 = getString(R.string.lbl_pace);
            this.f149569o = false;
        }
        this.T = new hy.d(this, 22);
    }

    @Override // r22.a2, androidx.fragment.app.i
    public final void show(androidx.fragment.app.v vVar, String str) {
        super.show(vVar, str);
        TextView textViewX = oe2.f.x(this.f149554a);
        if (textViewX != null) {
            textViewX.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        androidx.appcompat.app.e eVar = this.f149554a;
        eVar.getClass();
        oe2.f.X(eVar);
    }

    @Override // r22.a2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        String str4;
        b bVar = this.U0;
        if (bVar == b.PACE) {
            int i17 = (i14 * 60) + i15;
            oi0.h hVar = new oi0.h(requireContext());
            oi0.g gVar = new oi0.g(requireContext());
            String strD = hVar.d(i17, true);
            f12.l.f68084a.getClass();
            StringBuilder sbL = e5.l(this.S0, "  (", strD, StringUtils.SPACE, gVar.a(f12.l.a.a().y()));
            sbL.append(")");
            return sbL.toString();
        }
        if (bVar == b.SWIM_PACE) {
            return String.format(getString(R.string.string_space_string_bracket_pattern), this.S0, getString(R.string.common_abbrev_mm_ss_string));
        }
        c22.l3.f23124b.getClass();
        String strK = c22.l3.a.K((((double) i15) / 10.0d) + ((double) i14), 1);
        if (am.z0.I(this.W0.f4358a)) {
            oi0.b bVar2 = new oi0.b(new l22.a(requireContext()), this.T0);
            bVar2.u();
            str4 = bVar2.f132238b;
        } else {
            if (am.z0.b(am.x0.O1, this.W0.f4358a) && this.X0 == c22.q3.AVIATION_KNOTS) {
                oi0.b bVar3 = new oi0.b(new l22.a(requireContext()), this.T0);
                String str5 = bVar3.f132238b;
                l22.b bVar4 = bVar3.f132237a;
                String strV = d53.u.v(str5, bVar4.getString(R.string.lbl_aviation_speed_abr), bVar4.getString(R.string.lbl_knots), false);
                bVar3.f132238b = strV;
                str4 = strV;
            } else {
                str4 = this.T0;
            }
        }
        StringBuilder sbL2 = e5.l(this.S0, "  (", strK, StringUtils.SPACE, str4);
        sbL2.append(")");
        return sbL2.toString();
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        b bVar = this.U0;
        if (bVar == b.PACE) {
            long jC = e5.c(i14, 60, i15, 1000);
            c22.l3.f23124b.getClass();
            StringBuilder sbL = e5.l(this.S0, "  (", c22.l3.a.b1(jC), StringUtils.SPACE, this.T0);
            sbL.append(")");
            this.V0 = sbL.toString();
        } else if (bVar == b.SWIM_PACE) {
            this.V0 = String.format(getString(R.string.string_space_string_bracket_pattern), this.S0, getString(R.string.common_abbrev_mm_ss_string));
        } else {
            c22.l3.f23124b.getClass();
            StringBuilder sbL2 = e5.l(this.S0, "  (", c22.l3.a.K((((double) i15) / 10.0d) + ((double) i14), 1), StringUtils.SPACE, this.T0);
            sbL2.append(")");
            this.V0 = sbL2.toString();
        }
        return this.V0;
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (this.U0 == b.SWIM_PACE && numberPicker == this.f149555b && i15 != i14) {
            NumberPicker numberPicker2 = this.f149556c;
            if (i15 == 0) {
                r22.a2.S6(numberPicker2, 50, 59, false);
            } else if (i15 != 5) {
                r22.a2.S6(numberPicker2, 0, 59, true);
            } else {
                r22.a2.S6(numberPicker2, 0, 0, false);
            }
        }
    }
}
