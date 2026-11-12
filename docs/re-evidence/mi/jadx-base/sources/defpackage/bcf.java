package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.medal.widget.MedalShareContentCardView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bcf extends ViewDataBinding {
    public final FrameLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final RelativeLayout F;
    public final RelativeLayout G;
    public final RelativeLayout H;
    public final MedalShareContentCardView I;
    public final NestedScrollView J;
    public final ConstraintLayout K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final ImageView O;

    public bcf(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, MedalShareContentCardView medalShareContentCardView, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView5) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = imageView4;
        this.F = relativeLayout;
        this.G = relativeLayout2;
        this.H = relativeLayout3;
        this.I = medalShareContentCardView;
        this.J = nestedScrollView;
        this.K = constraintLayout;
        this.L = textView;
        this.M = textView2;
        this.N = textView3;
        this.O = imageView5;
    }
}
