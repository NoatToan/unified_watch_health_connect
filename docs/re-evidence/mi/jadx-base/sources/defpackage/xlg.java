package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.widget.carousel.CarouselBannerRoundIndicator;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xlg extends ViewDataBinding {
    public final CarouselBannerRoundIndicator A;
    public final TextView B;
    public final AppCompatTextView C;
    public final ProgressBar D;
    public final TextView E;
    public final ViewPager F;

    public xlg(Object obj, View view, int i, CarouselBannerRoundIndicator carouselBannerRoundIndicator, TextView textView, AppCompatTextView appCompatTextView, ProgressBar progressBar, TextView textView2, ViewPager viewPager) {
        super(obj, view, i);
        this.A = carouselBannerRoundIndicator;
        this.B = textView;
        this.C = appCompatTextView;
        this.D = progressBar;
        this.E = textView2;
        this.F = viewPager;
    }
}
