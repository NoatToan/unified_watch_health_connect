package mt0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt0/z0;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f120946a = new z0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120947a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.PARASPORTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.CALORIES_BURNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.STEPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.PUSHES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.SWIMMING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f120947a = iArr;
        }
    }

    private z0() {
    }

    public static String a(Activity activity, x0 x0Var, double d14) {
        switch (a.f120947a[x0Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
                c22.m3 m3Var = am.j.z(f12.l.f68084a) ? c22.m3.KILOMETER : c22.m3.MILE;
                c22.l3.a aVar = c22.l3.f23124b;
                DecimalFormat decimalFormat = c22.l3.f23129g;
                aVar.getClass();
                return c22.l3.a.O(activity, d14, m3Var, decimalFormat, true);
            case 4:
                return c22.l3.a.H(c22.l3.f23124b, new l22.a(activity), d14, true);
            case 5:
            case 6:
                String str = NumberFormat.getNumberInstance(Locale.getDefault()).format(d14);
                str.getClass();
                return str;
            case 7:
                c22.m3 m3Var2 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.YARD;
                c22.l3.f23124b.getClass();
                return c22.l3.a.P(activity, d14, m3Var2, c22.l3.f23131i, true, activity.getString(R.string.no_value));
            default:
                lc.u0.r();
                return null;
        }
    }

    public static final o13.p b(androidx.fragment.app.m mVar, x0 x0Var, boolean z14, com.garmin.android.apps.connectmobile.leaderboard.model.e0... e0VarArr) {
        x0Var.getClass();
        int length = e0VarArr.length;
        z0 z0Var = f120946a;
        if (length == 1) {
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var = e0VarArr[0];
            z0Var.getClass();
            return d(mVar, e0Var, x0Var);
        }
        if (length == 2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var2 = e0VarArr[0];
            com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var3 = e0VarArr[1];
            z0Var.getClass();
            return f(mVar, e0Var2, e0Var3, x0Var, z14);
        }
        if (length != 3) {
            return new o13.p(null, null);
        }
        com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var4 = e0VarArr[0];
        com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var5 = e0VarArr[1];
        com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var6 = e0VarArr[2];
        z0Var.getClass();
        return e(mVar, e0Var4, e0Var5, e0Var6, x0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View c(androidx.fragment.app.m mVar, x0 x0Var, boolean z14, com.garmin.android.apps.connectmobile.leaderboard.model.e0... e0VarArr) {
        x0Var.getClass();
        int length = e0VarArr.length;
        if (length == 1) {
            return (View) d(mVar, e0VarArr[0], x0Var).f128594a;
        }
        if (length == 2) {
            return (View) f(mVar, e0VarArr[0], e0VarArr[1], x0Var, z14).f128594a;
        }
        if (length != 3) {
            return null;
        }
        return (View) e(mVar, e0VarArr[0], e0VarArr[1], e0VarArr[2], x0Var).f128594a;
    }

    public static o13.p d(Activity activity, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var, x0 x0Var) {
        if (activity == null) {
            return new o13.p(null, null);
        }
        View viewInflate = View.inflate(activity, R.layout.gcm_leaderboard_list_header_one_rank, null);
        if (e0Var != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.leaderboard_header_rank);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_rank_result);
            UserLevelImageView userLevelImageView = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture);
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = activity.getString(R.string.format_decimal_value);
            string.getClass();
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var.f38132a)}, 1));
            textView.setText(str);
            textView.setContentDescription(activity.getString(R.string.segments_rank, str));
            userLevelImageView.setContentDescription(activity.getString(R.string.challenge_leaderboard_current_user_name));
            textView2.setText(a(activity, x0Var, e0Var.f38133b));
            userLevelImageView.setProfileImageData(e0Var.f38134c);
            if (c22.b.a(activity) > 1.3f) {
                ViewGroup.LayoutParams layoutParams = userLevelImageView.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) ((GridLayout.n) layoutParams)).bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.spacing_xlarge);
            }
        }
        return new o13.p(viewInflate, viewInflate);
    }

    public static o13.p e(Activity activity, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var2, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var3, x0 x0Var) {
        UserLevelImageView userLevelImageView = null;
        if (activity == null) {
            return new o13.p(null, null);
        }
        View viewInflate = View.inflate(activity, R.layout.gcm_leaderboard_list_header_three_rank, null);
        if (e0Var != null && e0Var2 != null && e0Var3 != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_current_user_rank);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank_result);
            TextView textView5 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank_result);
            TextView textView6 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_current_user_rank_result);
            UserLevelImageView userLevelImageView2 = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture);
            userLevelImageView2.setContentDescription(activity.getString(R.string.challenge_leaderboard_current_user_name));
            p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
            Locale locale = Locale.getDefault();
            String string = activity.getString(R.string.format_decimal_value);
            string.getClass();
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var2.f38132a)}, 1));
            textView.setText(str);
            textView.setContentDescription(activity.getString(R.string.segments_rank, str));
            textView4.setText(a(activity, x0Var, e0Var2.f38133b));
            Locale locale2 = Locale.getDefault();
            String string2 = activity.getString(R.string.format_decimal_value);
            string2.getClass();
            String str2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var.f38132a)}, 1));
            textView2.setText(str2);
            textView2.setContentDescription(activity.getString(R.string.segments_rank, str2));
            textView6.setText(a(activity, x0Var, e0Var.f38133b));
            Locale locale3 = Locale.getDefault();
            String string3 = activity.getString(R.string.format_decimal_value);
            string3.getClass();
            String str3 = String.format(locale3, string3, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var3.f38132a)}, 1));
            textView3.setText(str3);
            textView3.setContentDescription(activity.getString(R.string.segments_rank, str3));
            textView5.setText(a(activity, x0Var, e0Var3.f38133b));
            userLevelImageView2.setProfileImageData(e0Var.f38134c);
            if (c22.b.a(activity) > 1.3f) {
                ViewGroup.LayoutParams layoutParams = userLevelImageView2.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) ((GridLayout.n) layoutParams)).bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.spacing_xlarge);
            }
            userLevelImageView = userLevelImageView2;
        }
        return new o13.p(viewInflate, userLevelImageView);
    }

    public static o13.p f(Activity activity, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var, com.garmin.android.apps.connectmobile.leaderboard.model.e0 e0Var2, x0 x0Var, boolean z14) {
        UserLevelImageView userLevelImageView = null;
        if (activity == null) {
            return new o13.p(null, null);
        }
        View viewInflate = View.inflate(activity, R.layout.gcm_leaderboard_list_header_two_rank, null);
        if (e0Var != null && e0Var2 != null) {
            TextView textView = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_first_rank_result);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.leaderboard_header_last_rank_result);
            UserLevelImageView userLevelImageView2 = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture_left);
            UserLevelImageView userLevelImageView3 = (UserLevelImageView) viewInflate.findViewById(R.id.leaderboard_header_profile_picture_right);
            if (z14) {
                p005kotlin.jvm.internal.x0 x0Var2 = p005kotlin.jvm.internal.x0.f105818a;
                Locale locale = Locale.getDefault();
                String string = activity.getString(R.string.format_decimal_value);
                string.getClass();
                String str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var.f38132a)}, 1));
                textView.setText(str);
                textView.setContentDescription(activity.getString(R.string.segments_rank, str));
                textView3.setText(a(activity, x0Var, e0Var.f38133b));
                textView4.setText(a(activity, x0Var, e0Var2.f38133b));
                Locale locale2 = Locale.getDefault();
                String string2 = activity.getString(R.string.format_decimal_value);
                string2.getClass();
                String str2 = String.format(locale2, string2, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var2.f38132a)}, 1));
                textView2.setText(str2);
                textView.setContentDescription(activity.getString(R.string.segments_rank, str2));
                userLevelImageView3.setVisibility(8);
                userLevelImageView2.setVisibility(0);
                userLevelImageView2.setContentDescription(activity.getString(R.string.challenge_leaderboard_current_user_name));
                userLevelImageView2.setProfileImageData(e0Var.f38134c);
                userLevelImageView = userLevelImageView2;
            } else {
                p005kotlin.jvm.internal.x0 x0Var3 = p005kotlin.jvm.internal.x0.f105818a;
                Locale locale3 = Locale.getDefault();
                String string3 = activity.getString(R.string.format_decimal_value);
                string3.getClass();
                String str3 = String.format(locale3, string3, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var2.f38132a)}, 1));
                textView.setText(str3);
                textView.setContentDescription(activity.getString(R.string.segments_rank, str3));
                textView3.setText(a(activity, x0Var, e0Var2.f38133b));
                if (e0Var.f38132a == -1) {
                    textView2.setText(activity.getString(R.string.no_value));
                    textView2.setContentDescription(activity.getString(R.string.common_no_data));
                } else {
                    Locale locale4 = Locale.getDefault();
                    String string4 = activity.getString(R.string.format_decimal_value);
                    string4.getClass();
                    String str4 = String.format(locale4, string4, Arrays.copyOf(new Object[]{Integer.valueOf(e0Var.f38132a)}, 1));
                    textView2.setText(str4);
                    textView2.setContentDescription(activity.getString(R.string.segments_rank, str4));
                }
                textView4.setText(a(activity, x0Var, e0Var.f38133b));
                userLevelImageView3.setVisibility(0);
                userLevelImageView3.setContentDescription(activity.getString(R.string.challenge_leaderboard_current_user_name));
                userLevelImageView2.setVisibility(8);
                userLevelImageView3.setProfileImageData(e0Var.f38134c);
                userLevelImageView = userLevelImageView3;
            }
            if (c22.b.a(activity) > 1.3f) {
                ViewGroup.LayoutParams layoutParams = userLevelImageView2.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) ((GridLayout.n) layoutParams)).bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.spacing_xlarge);
                ViewGroup.LayoutParams layoutParams2 = userLevelImageView3.getLayoutParams();
                layoutParams2.getClass();
                ((ViewGroup.MarginLayoutParams) ((GridLayout.n) layoutParams2)).bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.spacing_xlarge);
            }
        }
        return new o13.p(viewInflate, userLevelImageView);
    }
}
