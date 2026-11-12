package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.widget.SlidableScrollView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gwb extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final ConstraintLayout B;
    public final View C;
    public final SlidableScrollView D;
    public final SwitchButtonTwoLineTextView E;
    public final LinearLayout F;
    public final ViewPager2 G;
    public final SleepGuideCarouselIndicator H;
    public SleepSettingViewModel I;

    public gwb(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, ConstraintLayout constraintLayout, View view2, SlidableScrollView slidableScrollView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, LinearLayout linearLayout, ViewPager2 viewPager2, SleepGuideCarouselIndicator sleepGuideCarouselIndicator) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = constraintLayout;
        this.C = view2;
        this.D = slidableScrollView;
        this.E = switchButtonTwoLineTextView2;
        this.F = linearLayout;
        this.G = viewPager2;
        this.H = sleepGuideCarouselIndicator;
    }
}
