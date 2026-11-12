package r22;

import android.os.Bundle;
import android.widget.NumberPicker;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/e1;", "Lr22/s1;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e1 extends s1 {
    public static final a Z = new a(null);
    public double I;
    public double P;
    public double T = 1000000.0d;
    public boolean X = am.j.z(f12.l.f68084a);
    public e23.l<? super Double, Unit> Y;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.I = arguments.getDouble("EXTRA_INITIAL_DISTANCE_IN_METERS", 0.0d);
            this.P = arguments.getDouble("EXTRA_MIN_DISTANCE_IN_METERS", 0.0d);
            this.T = arguments.getDouble("EXTRA_MAX_DISTANCE_IN_METERS", 1000000.0d);
        }
        this.f149878q = getString(R.string.lbl_cancel);
        this.f149879r = getString(R.string.lbl_done);
        this.f149880t = getString(R.string.lbl_mile);
        this.f149881v = getString(R.string.lbl_km);
        this.f149882w = getString(R.string.lbl_miles);
        this.f149883x = getString(R.string.lbl_kilometers);
        this.A = new d1(this);
        this.f149885z = new d1(this);
        this.f149884y = new d1(this);
        this.f149871j = true;
        this.f149877p = true;
        Integer[] numArrW6 = w6(this.I, this.X);
        int iIntValue = numArrW6[0].intValue();
        int iIntValue2 = numArrW6[1].intValue();
        this.f149872k = iIntValue;
        this.f149873l = iIntValue2;
        this.f149870i = true;
        this.f149876o = true;
        int iIntValue3 = numArrW6[2].intValue();
        int iIntValue4 = numArrW6[3].intValue();
        this.f149874m = iIntValue3;
        this.f149875n = iIntValue4;
        this.f149871j = true;
        this.f149877p = true;
        int iIntValue5 = numArrW6[4].intValue();
        this.f149870i = true;
        this.f149868g = iIntValue5;
        int iIntValue6 = numArrW6[5].intValue();
        this.f149871j = true;
        this.f149869h = iIntValue6;
    }

    @Override // r22.s1
    public final void v6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.equals(this.f149864c)) {
            Integer[] numArrW6 = w6(y6(), this.X);
            this.f149865d.setMinValue(numArrW6[2].intValue());
            this.f149865d.setMaxValue(numArrW6[3].intValue());
        }
    }

    public final Integer[] w6(double d14, boolean z14) {
        double d15;
        double d16;
        int iIntValue;
        int iIntValue2;
        double d17 = this.P;
        if (d14 >= d17) {
            d17 = this.T;
            if (d14 <= d17) {
                d17 = d14;
            }
        }
        l3.f23124b.getClass();
        double d18 = z14 ? d17 / 1000.0d : d17 / 1609.344d;
        if (z14) {
            l3.a aVar = l3.f23124b;
            double d19 = this.P;
            aVar.getClass();
            d15 = d19 / 1000.0d;
        } else {
            l3.a aVar2 = l3.f23124b;
            double d24 = this.P;
            aVar2.getClass();
            d15 = d24 / 1609.344d;
        }
        if (z14) {
            l3.a aVar3 = l3.f23124b;
            double d25 = this.T;
            aVar3.getClass();
            d16 = d25 / 1000.0d;
        } else {
            l3.a aVar4 = l3.f23124b;
            double d26 = this.T;
            aVar4.getClass();
            d16 = d26 / 1609.344d;
        }
        Integer[] numArrI = bm.m.i(l3.f23129g.format(d18));
        Integer[] numArrI2 = bm.m.i(l3.f23129g.format(d15));
        Integer[] numArrI3 = bm.m.i(l3.f23129g.format(d16));
        Integer num = numArrI2[0];
        Integer num2 = numArrI3[0];
        if (p005kotlin.jvm.internal.s.g(num, num2)) {
            Integer num3 = numArrI2[1];
            num3.getClass();
            iIntValue = num3.intValue();
            Integer num4 = numArrI3[1];
            num4.getClass();
            iIntValue2 = num4.intValue();
        } else {
            if (p005kotlin.jvm.internal.s.g(numArrI[0], numArrI2[0])) {
                Integer num5 = numArrI2[1];
                num5.getClass();
                iIntValue = num5.intValue();
            } else if (p005kotlin.jvm.internal.s.g(numArrI[0], numArrI3[0])) {
                Integer num6 = numArrI3[1];
                num6.getClass();
                iIntValue2 = num6.intValue();
                iIntValue = 0;
            } else {
                iIntValue = 0;
            }
            iIntValue2 = 99;
        }
        com.garmin.android.apps.connectmobile.i2.a aVar5 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("distance: ", d18, " / maxDistance: ");
        sbA.append(d16);
        sbA.append(" / isUsingMetric: ");
        sbA.append(z14);
        sbA.append(" / minInt: ");
        sbA.append(num);
        sbA.append(" / maxInt: ");
        sbA.append(num2);
        sbA.append(" / minDecimal: ");
        sbA.append(iIntValue);
        sbA.append(" / maxDecimal: ");
        sbA.append(iIntValue2);
        String string = sbA.toString();
        aVar5.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var, string);
        num.getClass();
        num2.getClass();
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        Integer num7 = numArrI[0];
        num7.getClass();
        Integer num8 = numArrI[1];
        num8.getClass();
        return new Integer[]{num, num2, numValueOf, numValueOf2, num7, num8};
    }

    public final double y6() {
        double d14 = Double.parseDouble(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149864c.getValue())}, 1)) + "." + String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149865d.getValue())}, 1)));
        l3.a aVar = l3.f23124b;
        if (!this.X) {
            aVar.getClass();
            d14 *= 1.609344d;
        }
        aVar.getClass();
        return d14 * 1000.0d;
    }

    public final void z6(boolean z14) {
        double dY6 = y6();
        this.X = z14;
        Integer[] numArrW6 = w6(dY6, z14);
        this.f149864c.setMinValue(numArrW6[0].intValue());
        this.f149864c.setMaxValue(numArrW6[1].intValue());
        this.f149865d.setMinValue(numArrW6[2].intValue());
        this.f149865d.setMaxValue(numArrW6[3].intValue());
        this.f149864c.setValue(numArrW6[4].intValue());
        this.f149865d.setValue(numArrW6[5].intValue());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lr22/e1$a;", "", "<init>", "()V", "", "EXTRA_INITIAL_DISTANCE_IN_METERS", "Ljava/lang/String;", "EXTRA_MIN_DISTANCE_IN_METERS", "EXTRA_MAX_DISTANCE_IN_METERS", "", "MAX_DISTANCE_IN_METERS", "D", "TAG", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e1 a(double d14, double d15, double d16) {
            Bundle bundle = new Bundle();
            e1 e1Var = new e1();
            bundle.putDouble("EXTRA_INITIAL_DISTANCE_IN_METERS", d14);
            bundle.putDouble("EXTRA_MIN_DISTANCE_IN_METERS", d15);
            bundle.putDouble("EXTRA_MAX_DISTANCE_IN_METERS", d16);
            e1Var.setArguments(bundle);
            return e1Var;
        }

        private a() {
        }
    }
}
