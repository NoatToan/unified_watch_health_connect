package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class top extends ViewDataBinding {
    public final ImageView A;
    public final FrameLayout B;
    public final TabItem C;
    public final TabItem D;
    public final TabItem E;
    public final TabItem F;
    public final ImageView G;
    public final View H;
    public final TextView I;
    public final TabLayout J;
    public final RelativeLayout K;

    public top(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, TabItem tabItem, TabItem tabItem2, TabItem tabItem3, TabItem tabItem4, ImageView imageView2, View view2, TextView textView, TabLayout tabLayout, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = frameLayout;
        this.C = tabItem;
        this.D = tabItem2;
        this.E = tabItem3;
        this.F = tabItem4;
        this.G = imageView2;
        this.H = view2;
        this.I = textView;
        this.J = tabLayout;
        this.K = relativeLayout;
    }
}
