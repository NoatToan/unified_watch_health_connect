package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;
import com.xiaomi.fitness.widget.SlidableScrollView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class iub extends ViewDataBinding {
    public final ConstraintLayout A;
    public final View B;
    public final SwitchButtonSingleLineTextView C;
    public final SlidableScrollView D;
    public final LinearLayout E;
    public final ViewPager2 F;
    public final SleepGuideCarouselIndicator G;

    public iub(Object obj, View view, int i, ConstraintLayout constraintLayout, View view2, SwitchButtonSingleLineTextView switchButtonSingleLineTextView, SlidableScrollView slidableScrollView, LinearLayout linearLayout, ViewPager2 viewPager2, SleepGuideCarouselIndicator sleepGuideCarouselIndicator) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = view2;
        this.C = switchButtonSingleLineTextView;
        this.D = slidableScrollView;
        this.E = linearLayout;
        this.F = viewPager2;
        this.G = sleepGuideCarouselIndicator;
    }
}
