package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayout;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fce extends ViewDataBinding {
    public final TextView A;
    public final ViewPager2 B;
    public final DividerView C;
    public final DividerView D;
    public final FlexboxLayout E;
    public final LinearLayoutCompat F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public fce(Object obj, View view, int i, TextView textView, ViewPager2 viewPager2, DividerView dividerView, DividerView dividerView2, FlexboxLayout flexboxLayout, LinearLayoutCompat linearLayoutCompat, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = viewPager2;
        this.C = dividerView;
        this.D = dividerView2;
        this.E = flexboxLayout;
        this.F = linearLayoutCompat;
        this.G = textView2;
        this.H = textView3;
        this.I = textView4;
    }
}
