package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.sleep.ui.setting.baseui.SleepGuideCarouselIndicator;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lo0 extends ViewDataBinding {
    public final TextView A;
    public final ViewPager2 B;
    public final SleepGuideCarouselIndicator C;

    public lo0(Object obj, View view, int i, TextView textView, ViewPager2 viewPager2, SleepGuideCarouselIndicator sleepGuideCarouselIndicator) {
        super(obj, view, i);
        this.A = textView;
        this.B = viewPager2;
        this.C = sleepGuideCarouselIndicator;
    }
}
