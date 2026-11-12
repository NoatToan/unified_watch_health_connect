package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wyn extends ViewDataBinding {
    public final RelativeLayout A;
    public final ImageView B;
    public final View C;
    public final TextView D;
    public final DividerView E;
    public final TabLayout F;
    public final TextView G;
    public final ViewPager2 H;

    public wyn(Object obj, View view, int i, RelativeLayout relativeLayout, ImageView imageView, View view2, TextView textView, DividerView dividerView, TabLayout tabLayout, TextView textView2, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = imageView;
        this.C = view2;
        this.D = textView;
        this.E = dividerView;
        this.F = tabLayout;
        this.G = textView2;
        this.H = viewPager2;
    }
}
