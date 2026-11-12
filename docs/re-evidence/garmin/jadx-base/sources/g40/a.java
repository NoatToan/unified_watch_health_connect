package g40;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.a2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lg40/a;", "Lr22/a2;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends a2 {
    public static final C1524a T0 = new C1524a(null);
    public final boolean S0 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i14 = arguments.getInt("EXTRA_VALUE");
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                int i15 = arguments2.getInt("EXTRA_MAX_VALUE");
                this.J0 = R.string.separator_colon;
                this.N0 = 2;
                this.f149570p = true;
                if (this.S0) {
                    this.K0 = R.string.lbl_minute_per_km;
                    this.M0 = getString(R.string.lbl_minutes_per_kilometer);
                } else {
                    this.K0 = R.string.lbl_minute_per_mile;
                    this.M0 = getString(R.string.lbl_minutes_per_mile);
                }
                this.f149571q = true;
                this.F = getString(R.string.lbl_cancel);
                this.I = getString(R.string.lbl_done);
                int i16 = i14 / 60;
                A6(i16);
                E6(i14 % 60);
                C6(0, i15, true);
                if (i16 == 0) {
                    H6(0, 59, true);
                } else if (i16 != 5) {
                    H6(0, 59, true);
                } else {
                    H6(0, 0, true);
                }
            }
        }
    }

    @Override // r22.a2
    public final String u6(String str, int i14, int i15, String str2, String str3, int i16) {
        if (this.S0) {
            String string = getString(R.string.string_space_string_bracket_pattern, getString(R.string.lbl_course_goal_pace), getString(R.string.lbl_minutes_per_kilometer));
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.string_space_string_bracket_pattern, getString(R.string.lbl_course_goal_pace), getString(R.string.lbl_minutes_per_mile));
        string2.getClass();
        return string2;
    }

    @Override // r22.a2
    public final String v6(String str, int i14, int i15, String str2, String str3, int i16) {
        if (this.S0) {
            String string = getString(R.string.string_space_string_bracket_pattern, getString(R.string.lbl_course_goal_pace), getString(R.string.lbl_minute_per_km));
            string.getClass();
            return string;
        }
        String string2 = getString(R.string.string_space_string_bracket_pattern, getString(R.string.lbl_course_goal_pace), getString(R.string.lbl_minute_per_mile));
        string2.getClass();
        return string2;
    }

    /* JADX INFO: renamed from: g40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lg40/a$a;", "", "<init>", "()V", "", "EXTRA_VALUE", "Ljava/lang/String;", "EXTRA_MAX_VALUE", "", "MAX_VALUE_FOR_PICKER", "I", "MIN_VALUE_FOR_PICKER", "MAX_MINUTES_VALUE_FOR_PACE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1524a {
        public /* synthetic */ C1524a(j jVar) {
            this();
        }

        private C1524a() {
        }
    }
}
