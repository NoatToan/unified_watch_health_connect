package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.health.curse.view.HealthCurseSignView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ksb extends ViewDataBinding {
    public final TextView A;
    public final HealthCurseSignView B;
    public final FlexboxLayout C;
    public final HealthCurseSignView D;
    public final ViewPager2 E;
    public final TextView F;
    public final TextView G;
    public final DividerView H;
    public final DividerView I;
    public final HealthCurseSignView J;
    public final HealthCurseSignView K;
    public final TextView L;

    public ksb(Object obj, View view, int i, TextView textView, HealthCurseSignView healthCurseSignView, FlexboxLayout flexboxLayout, HealthCurseSignView healthCurseSignView2, ViewPager2 viewPager2, TextView textView2, TextView textView3, DividerView dividerView, DividerView dividerView2, HealthCurseSignView healthCurseSignView3, HealthCurseSignView healthCurseSignView4, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = healthCurseSignView;
        this.C = flexboxLayout;
        this.D = healthCurseSignView2;
        this.E = viewPager2;
        this.F = textView2;
        this.G = textView3;
        this.H = dividerView;
        this.I = dividerView2;
        this.J = healthCurseSignView3;
        this.K = healthCurseSignView4;
        this.L = textView4;
    }
}
