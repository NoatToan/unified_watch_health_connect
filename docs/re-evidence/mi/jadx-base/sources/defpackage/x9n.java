package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.baseui.widget.CarouselIndicator;
import com.xiaomi.fitness.widget.SlidableScrollView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x9n extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final CheckBox C;
    public final LinearLayout D;
    public final ConstraintLayout E;
    public final TextView F;
    public final TextView G;
    public final SlidableScrollView H;
    public final ViewPager2 I;
    public final CarouselIndicator J;

    public x9n(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, CheckBox checkBox, LinearLayout linearLayout, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, SlidableScrollView slidableScrollView, ViewPager2 viewPager2, CarouselIndicator carouselIndicator) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = checkBox;
        this.D = linearLayout;
        this.E = constraintLayout2;
        this.F = textView2;
        this.G = textView3;
        this.H = slidableScrollView;
        this.I = viewPager2;
        this.J = carouselIndicator;
    }
}
