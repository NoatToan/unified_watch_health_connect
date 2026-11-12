package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes9.dex */
public abstract class aca extends ViewDataBinding {
    public final AppBarLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final RecyclerView E;
    public final TextView F;
    public final ConstraintLayout G;
    public final TextView H;
    public final ImageView I;
    public final LinearLayout J;
    public final LinearLayout K;

    public aca(Object obj, View view, int i, AppBarLayout appBarLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RecyclerView recyclerView, TextView textView, ConstraintLayout constraintLayout, TextView textView2, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = appBarLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = recyclerView;
        this.F = textView;
        this.G = constraintLayout;
        this.H = textView2;
        this.I = imageView4;
        this.J = linearLayout;
        this.K = linearLayout2;
    }
}
