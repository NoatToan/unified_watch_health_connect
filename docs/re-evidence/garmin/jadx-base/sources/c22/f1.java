package c22;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.timepicker.TimeModel;
import i3.e5;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/f1;", "Lr22/a2;", "<init>", "()V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 extends r22.a2 {
    public static final a Y0 = new a(null);
    public static final String Z0 = f1.class.getSimpleName();
    public String S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public int X0 = 23;

    public static void T6(NumberPicker numberPicker) {
        Iterator<View> it = new androidx.core.view.x0(numberPicker).iterator();
        while (true) {
            androidx.core.view.z0 z0Var = (androidx.core.view.z0) it;
            if (!z0Var.hasNext()) {
                numberPicker.setFormatter(new bi2.j(1));
                return;
            } else {
                View view2 = (View) z0Var.next();
                if (view2 instanceof EditText) {
                    ((EditText) view2).setFilters(new InputFilter[0]);
                }
            }
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("EXTRA_SECONDS");
            boolean z14 = arguments.getBoolean("EXTRA_MAX_HOURS_IS_INCLUSIVE");
            this.W0 = z14;
            this.X0 = arguments.getInt("EXTRA_MAX_HOURS", z14 ? 24 : 23);
            boolean z15 = arguments.getBoolean("EXTRA_DISABLE_HOURS");
            this.T0 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_SECONDS_DISPLAY");
            this.U0 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_MINUTES_DISPLAY");
            this.V0 = arguments.getBoolean("EXTRA_USE_TWO_DIGIT_HOURS_DISPLAY");
            String string = arguments.getString("EXTRA_TITLE");
            if (string == null) {
                string = getString(R.string.pacepro_lbl_plan_goal_time);
                string.getClass();
            }
            this.S0 = string;
            C6(0, this.X0, true);
            H6(0, 59, true);
            J6(0, 59, true);
            this.J0 = R.string.separator_colon;
            this.K0 = R.string.separator_colon;
            this.f149570p = true;
            this.f149571q = true;
            this.F = getString(R.string.lbl_cancel);
            this.I = getString(R.string.lbl_done);
            int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i16 = i14 % DateTimeConstants.SECONDS_PER_HOUR;
            A6(i15);
            E6(i16 / 60);
            I6(i16 % 60);
            if (z15) {
                this.f149567m = false;
            }
        }
    }

    @Override // r22.a2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        return am.j.o(StringUtils.SPACE, getString(R.string.lbl_time_unit_seconds), e5.l(this.S0, StringUtils.SPACE, getString(R.string.lbl_time_unit_hours), StringUtils.SPACE, getString(R.string.lbl_time_unit_minutes)));
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        return String.format("%s (%s)", Arrays.copyOf(new Object[]{this.S0, getString(R.string.hour_minute_second_format)}, 2));
    }

    @Override // r22.a2
    public final void y6() {
        if (this.V0) {
            p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
            this.f149565k0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149561h)}, 1));
            NumberPicker numberPicker = this.f149555b;
            numberPicker.getClass();
            T6(numberPicker);
        }
        if (this.U0) {
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            this.H0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149562i)}, 1));
            NumberPicker numberPicker2 = this.f149556c;
            numberPicker2.getClass();
            T6(numberPicker2);
        }
        if (this.T0) {
            p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
            this.I0 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(this.f149563j)}, 1));
            NumberPicker numberPicker3 = this.f149557d;
            numberPicker3.getClass();
            T6(numberPicker3);
        }
    }

    @Override // r22.a2
    public final void z6(NumberPicker numberPicker, int i14, int i15) {
        if (numberPicker.getId() == R.id.nr_picker_1) {
            int i16 = this.X0;
            if (i15 == i16 && this.W0) {
                E6(0);
                I6(0);
                this.f149556c.setMaxValue(0);
                this.f149556c.setMinValue(0);
                this.f149557d.setMaxValue(0);
                this.f149557d.setMinValue(0);
                return;
            }
            if (i14 == i16 && this.W0) {
                this.f149556c.setMaxValue(59);
                this.f149556c.setMinValue(0);
                this.f149557d.setMaxValue(59);
                this.f149557d.setMinValue(0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc22/f1$a;", "", "<init>", "()V", "", "EXTRA_TIME", "Ljava/lang/String;", "EXTRA_MAX_HOURS", "EXTRA_MAX_HOURS_IS_INCLUSIVE", "EXTRA_DISABLE_HOURS", "EXTRA_TITLE", "EXTRA_TWO_DIGIT_SECONDS_DISPLAY", "EXTRA_TWO_DIGIT_MINUTES_DISPLAY", "EXTRA_TWO_DIGIT_HOURS_DISPLAY", "TWO_DIGIT_FORMAT", "", "DEFAULT_MAX_HOURS", "I", "DEFAULT_MAX_HOURS_INCLUSIVE", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f1 a(a aVar, int i14, int i15, int i16) {
            boolean z14 = (i16 & 16) == 0;
            boolean z15 = (i16 & 128) == 0;
            aVar.getClass();
            f1 f1Var = new f1();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SECONDS", i14);
            bundle.putInt("EXTRA_MAX_HOURS", i15);
            bundle.putBoolean("EXTRA_MAX_HOURS_IS_INCLUSIVE", z15);
            bundle.putBoolean("EXTRA_DISABLE_HOURS", false);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_SECONDS_DISPLAY", z14);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_MINUTES_DISPLAY", false);
            bundle.putBoolean("EXTRA_USE_TWO_DIGIT_HOURS_DISPLAY", false);
            f1Var.setArguments(bundle);
            return f1Var;
        }

        private a() {
        }
    }
}
