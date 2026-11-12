package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.suggestion.R;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class hna {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f36944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f36945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f36946c;
    private HealthTextView d;
    private Context e;
    private HealthTextView f;
    private ViewGroup g;
    private View j;

    public hna(View view) {
        if (view == null) {
            return;
        }
        this.j = view;
        this.e = view.getContext();
        this.d = (HealthTextView) view.findViewById(R.id.sug_coach_duration);
        this.f = (HealthTextView) view.findViewById(R.id.sug_up_level);
        this.f36944a = (HealthTextView) view.findViewById(R.id.sug_fitness_level);
        this.g = (ViewGroup) view.findViewById(R.id.kcals_layout);
        this.f36945b = (HealthTextView) view.findViewById(R.id.sug_fitness_kcals);
        this.f36946c = (HealthTextView) view.findViewById(R.id.sug_fitness_times);
    }

    public void e(FitWorkout fitWorkout) {
        if (this.e == null || fitWorkout == null) {
            return;
        }
        d(fitWorkout);
        b(fitWorkout);
        c(fitWorkout);
    }

    private void b(FitWorkout fitWorkout) {
        if (fitWorkout.acquireMeasurementType() == 0) {
            c(this.d, this.e.getString(R.string.IDS_motiontrack_show_sport_unit_km));
            c(this.f36946c, iek.c(this.e.getApplicationContext(), fitWorkout.acquireDistance()));
        } else {
            c(this.d, this.e.getString(com.huawei.health.basefitnessadvice.R.string.sug_coach_duration));
            c(this.f36946c, iek.a(this.e.getApplicationContext(), fitWorkout.acquireDuration()));
        }
    }

    private void c(FitWorkout fitWorkout) {
        float fA = hjg.a();
        c(this.f36945b, gzx.c(this.e, "\\d|[/]", gzx.d(R.plurals.sug_chart_kcals, (int) (fitWorkout.acquireCalorie() * fA), ped.f(ped.b(fitWorkout.acquireCalorie() * fA))), R.style.sug_detail_bigsize, R.style.sug_detail_smasize));
        if (fitWorkout.isLongExplainVideoCourse()) {
            a(this.g, 8);
        } else {
            a(this.g, 0);
        }
    }

    private void d(FitWorkout fitWorkout) {
        if (fitWorkout.isLongExplainVideoCourse()) {
            c(this.f, this.e.getString(R.string.IDS_sug_fitness_attended));
            String strD = gzx.d(R.plurals.sug_attended_person, fitWorkout.acquireUsers(), Integer.valueOf(fitWorkout.acquireUsers()));
            int iA = iek.a(strD);
            int length = strD.length() - iek.a(new StringBuffer(strD).reverse().toString());
            SpannableString spannableString = new SpannableString(strD);
            qri.d(spannableString, iA, length, new ForegroundColorSpan(ContextCompat.getColor(this.e, R.color.textColorPrimaryInverse)));
            qri.d(spannableString, iA, length, new TypefaceSpan(this.e.getString(R.string.textFontFamilyRegular)));
            qri.d(spannableString, iA, length, new AbsoluteSizeSpan(this.e.getResources().getDimensionPixelSize(R.dimen.textSizeSubTitle1)));
            c(this.f36944a, spannableString);
            return;
        }
        c(this.f36944a, gzx.c(this.e, "L[1-4]{1}", iec.c(fitWorkout.acquireDifficulty()), R.style.sug_detail_bigsize, R.style.sug_detail_smasize));
        c(this.f, this.e.getText(R.string.sug_train_level));
    }

    public void a(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36944a.getLayoutParams();
        int i2 = -i;
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        this.f36944a.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f36946c.getLayoutParams();
        layoutParams2.topMargin = i2;
        layoutParams2.bottomMargin = i2;
        this.f36946c.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f36945b.getLayoutParams();
        layoutParams3.topMargin = i2;
        layoutParams3.bottomMargin = i2;
        this.f36945b.setLayoutParams(layoutParams3);
    }

    public void b(int i) {
        a(this.j, i);
    }

    public void e() {
        Context context = this.e;
        if (context != null) {
            c(this.f36944a, context.getString(R.string.sug_string_default));
            c(this.f36945b, this.e.getString(R.string.sug_string_default));
            c(this.f36946c, this.e.getString(R.string.sug_string_default));
        }
    }

    private void c(HealthTextView healthTextView, CharSequence charSequence) {
        if (healthTextView != null) {
            healthTextView.setText(charSequence);
        }
    }

    private void a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
