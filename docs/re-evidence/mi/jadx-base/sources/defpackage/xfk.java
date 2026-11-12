package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xfk extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final ConstraintLayout C;
    public final DividerView D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final RoundImageView H;
    public final TextView I;
    public final TextView J;

    public xfk(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, DividerView dividerView, TextView textView, ImageView imageView2, TextView textView2, RoundImageView roundImageView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = constraintLayout2;
        this.D = dividerView;
        this.E = textView;
        this.F = imageView2;
        this.G = textView2;
        this.H = roundImageView;
        this.I = textView3;
        this.J = textView4;
    }
}
