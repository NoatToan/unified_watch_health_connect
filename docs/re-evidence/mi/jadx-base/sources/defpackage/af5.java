package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class af5 extends ViewDataBinding {
    public final CarouselIndicator A;
    public final ViewPager2 B;
    public final ConstraintLayout C;

    public af5(Object obj, View view, int i, CarouselIndicator carouselIndicator, ViewPager2 viewPager2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = carouselIndicator;
        this.B = viewPager2;
        this.C = constraintLayout;
    }
}
