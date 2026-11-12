package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fxh extends ViewDataBinding {
    public final AppBarLayout A;
    public final CoordinatorLayout B;
    public final ImageView C;
    public final ImageView D;
    public final RoundImageView E;
    public final TextView F;
    public final RoundImageView G;
    public final TextView H;
    public final TextView I;
    public final RecyclerView J;
    public final RelativeLayout K;
    public final TextView L;
    public final TextView M;
    public final View N;
    public final TextView O;

    public fxh(Object obj, View view, int i, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout, ImageView imageView, ImageView imageView2, RoundImageView roundImageView, TextView textView, RoundImageView roundImageView2, TextView textView2, TextView textView3, RecyclerView recyclerView, RelativeLayout relativeLayout, TextView textView4, TextView textView5, View view2, TextView textView6) {
        super(obj, view, i);
        this.A = appBarLayout;
        this.B = coordinatorLayout;
        this.C = imageView;
        this.D = imageView2;
        this.E = roundImageView;
        this.F = textView;
        this.G = roundImageView2;
        this.H = textView2;
        this.I = textView3;
        this.J = recyclerView;
        this.K = relativeLayout;
        this.L = textView4;
        this.M = textView5;
        this.N = view2;
        this.O = textView6;
    }
}
