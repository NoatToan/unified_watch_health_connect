package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wrp extends ViewDataBinding {
    public final TextView A;
    public final CardView B;
    public final ImageView C;
    public final ImageView D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final NestedScrollView G;
    public final AppCompatImageView H;
    public final ConstraintLayout I;
    public final AppCompatTextView J;

    public wrp(Object obj, View view, int i, TextView textView, CardView cardView, ImageView imageView, ImageView imageView2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = textView;
        this.B = cardView;
        this.C = imageView;
        this.D = imageView2;
        this.E = appCompatImageView;
        this.F = constraintLayout;
        this.G = nestedScrollView;
        this.H = appCompatImageView2;
        this.I = constraintLayout2;
        this.J = appCompatTextView;
    }
}
