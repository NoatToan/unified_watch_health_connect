package r22;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import c22.g3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import java.util.Iterator;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr22/f1;", "Lr22/a2;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 extends a2 {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final a f149645b1 = new a(null);
    public int S0;
    public int T0;
    public int U0 = 86399;
    public e23.l<? super Integer, Unit> V0;
    public String W0;
    public String X0;
    public boolean Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public boolean f149646a1;

    public static void T6(NumberPicker numberPicker) {
        Iterator<View> it = new androidx.core.view.x0(numberPicker).iterator();
        while (true) {
            androidx.core.view.z0 z0Var = (androidx.core.view.z0) it;
            if (!z0Var.hasNext()) {
                numberPicker.setFormatter(new bi2.j(4));
                return;
            } else {
                View view2 = (View) z0Var.next();
                if (view2 instanceof EditText) {
                    ((EditText) view2).setFilters(new InputFilter[0]);
                }
            }
        }
    }

    public final void U6() {
        int value = this.f149555b.getValue();
        this.X = value;
        this.f149565k0 = w6(this.f149555b, value);
        int value2 = this.f149556c.getValue();
        this.Y = value2;
        this.H0 = w6(this.f149556c, value2);
        int value3 = this.f149557d.getValue();
        this.Z = value3;
        this.I0 = w6(this.f149557d, value3);
        M6();
        K6();
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z14 = arguments.getBoolean("EXTRA_DISABLE_HOURS");
            this.S0 = arguments.getInt("EXTRA_INITIAL_TIME_IN_SECONDS", 0);
            this.T0 = arguments.getInt("EXTRA_MIN_TIME_IN_SECONDS", 0);
            this.U0 = arguments.getInt("EXTRA_MAX_TIME_IN_SECONDS", 86399);
            this.W0 = arguments.getString("EXTRA_CUSTOM_TITLE");
            this.X0 = arguments.getString("EXTRA_CUSTOM_TITLE_CONTENT_DESCRIPTION");
            this.Y0 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_SECONDS_DISPLAY");
            this.Z0 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_MINUTES_DISPLAY");
            this.f149646a1 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_HOURS_DISPLAY");
            bm.k0 k0Var = new bm.k0(this.S0, 0, 0, 0, 14, null);
            if (z14) {
                this.f149567m = false;
            }
            g3.a aVar = g3.f23060a;
            int i14 = k0Var.f18823b;
            int i15 = k0Var.f18824c;
            int i16 = this.T0;
            int i17 = this.U0;
            aVar.getClass();
            Integer[] numArrA = g3.a.a(i14, i15, i16, i17);
            C6(numArrA[0].intValue(), numArrA[1].intValue(), true);
            H6(numArrA[2].intValue(), numArrA[3].intValue(), true);
            J6(numArrA[4].intValue(), numArrA[5].intValue(), true);
            int i18 = this.S0;
            if (i18 != 0) {
                int i19 = i18 / DateTimeConstants.SECONDS_PER_HOUR;
                int i24 = i18 % DateTimeConstants.SECONDS_PER_HOUR;
                A6(i19);
                E6(i24 / 60);
                I6(i24 % 60);
            } else {
                A6(0);
                E6(0);
                I6(1);
            }
            this.F = getString(R.string.lbl_cancel);
            this.I = getString(R.string.lbl_done);
            this.T = new r22.a(this, 5);
        }
    }

    @Override // r22.a2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        String str4 = this.X0;
        return str4 == null ? v6(str, i14, i15, str2, str3, i16) : str4;
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        String str4 = this.W0;
        if (str4 != null) {
            return str4;
        }
        l3.a aVar = l3.f23124b;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        return l3.a.j1(contextRequireContext, i14, i15, i16);
    }

    @Override // r22.a2
    public final void y6() {
        if (this.f149646a1) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            this.f149565k0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149561h)}, 1));
            NumberPicker numberPicker = this.f149555b;
            numberPicker.getClass();
            T6(numberPicker);
        }
        if (this.Z0) {
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            this.H0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149562i)}, 1));
            NumberPicker numberPicker2 = this.f149556c;
            numberPicker2.getClass();
            T6(numberPicker2);
        }
        if (this.Y0) {
            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
            this.I0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149563j)}, 1));
            NumberPicker numberPicker3 = this.f149557d;
            numberPicker3.getClass();
            T6(numberPicker3);
        }
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.equals(this.f149555b)) {
            g3.a aVar = g3.f23060a;
            int value = this.f149556c.getValue();
            this.f149557d.getValue();
            int i16 = this.T0;
            int i17 = this.U0;
            aVar.getClass();
            Integer[] numArrA = g3.a.a(i15, value, i16, i17);
            int value2 = this.f149556c.getValue();
            this.f149555b.setMinValue(numArrA[0].intValue());
            this.f149555b.setMaxValue(numArrA[1].intValue());
            this.f149556c.setMinValue(numArrA[2].intValue());
            this.f149556c.setMaxValue(numArrA[3].intValue());
            int value3 = this.f149557d.getValue();
            this.f149557d.setMinValue(numArrA[4].intValue());
            this.f149557d.setMaxValue(numArrA[5].intValue());
            if (value2 < numArrA[2].intValue() || value2 > numArrA[3].intValue() || value3 < numArrA[4].intValue() || value3 > numArrA[5].intValue()) {
                U6();
                return;
            }
            return;
        }
        if (numberPicker.equals(this.f149556c)) {
            g3.a aVar2 = g3.f23060a;
            int value4 = this.f149555b.getValue();
            this.f149557d.getValue();
            int i18 = this.T0;
            int i19 = this.U0;
            aVar2.getClass();
            Integer[] numArrA2 = g3.a.a(value4, i15, i18, i19);
            int value5 = this.f149557d.getValue();
            this.f149555b.setMinValue(numArrA2[0].intValue());
            this.f149555b.setMaxValue(numArrA2[1].intValue());
            this.f149556c.setMinValue(numArrA2[2].intValue());
            this.f149556c.setMaxValue(numArrA2[3].intValue());
            this.f149557d.setMinValue(numArrA2[4].intValue());
            this.f149557d.setMaxValue(numArrA2[5].intValue());
            if (value5 < numArrA2[4].intValue() || value5 > numArrA2[5].intValue()) {
                U6();
                return;
            }
            return;
        }
        if (numberPicker.equals(this.f149557d)) {
            g3.a aVar3 = g3.f23060a;
            int value6 = this.f149555b.getValue();
            int value7 = this.f149556c.getValue();
            int i24 = this.T0;
            int i25 = this.U0;
            aVar3.getClass();
            Integer[] numArrA3 = g3.a.a(value6, value7, i24, i25);
            this.f149555b.setMinValue(numArrA3[0].intValue());
            this.f149555b.setMaxValue(numArrA3[1].intValue());
            this.f149556c.setMinValue(numArrA3[2].intValue());
            this.f149556c.setMaxValue(numArrA3[3].intValue());
            this.f149557d.setMinValue(numArrA3[4].intValue());
            this.f149557d.setMaxValue(numArrA3[5].intValue());
            int value8 = this.f149555b.getValue();
            if (value8 < numArrA3[0].intValue() || value8 > numArrA3[2].intValue()) {
                U6();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lr22/f1$a;", "", "<init>", "()V", "", "EXTRA_DISABLE_HOURS", "Ljava/lang/String;", "EXTRA_INITIAL_TIME_IN_SECONDS", "EXTRA_MIN_TIME_IN_SECONDS", "EXTRA_MAX_TIME_IN_SECONDS", "EXTRA_CUSTOM_TITLE", "EXTRA_CUSTOM_TITLE_CONTENT_DESCRIPTION", "", "MAX_TIME_IN_SECONDS", "I", "EXTRA_TWO_DIGIT_SECONDS_DISPLAY", "EXTRA_TWO_DIGIT_MINUTES_DISPLAY", "EXTRA_TWO_DIGIT_HOURS_DISPLAY", "TWO_DIGIT_FORMAT", "TAG", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f1 a(a aVar, int i14, int i15, int i16, String str, String str2, int i17) {
            boolean z14 = (i17 & 64) == 0;
            boolean z15 = (i17 & 128) == 0;
            boolean z16 = (i17 & 256) == 0;
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_DISABLE_HOURS", false);
            bundle.putInt("EXTRA_INITIAL_TIME_IN_SECONDS", i14);
            bundle.putInt("EXTRA_MIN_TIME_IN_SECONDS", i15);
            bundle.putInt("EXTRA_MAX_TIME_IN_SECONDS", i16);
            bundle.putString("EXTRA_CUSTOM_TITLE", str);
            bundle.putString("EXTRA_CUSTOM_TITLE_CONTENT_DESCRIPTION", str2);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_SECONDS_DISPLAY", z14);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_MINUTES_DISPLAY", z15);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_HOURS_DISPLAY", z16);
            f1 f1Var = new f1();
            f1Var.setArguments(bundle);
            return f1Var;
        }

        private a() {
        }
    }
}
