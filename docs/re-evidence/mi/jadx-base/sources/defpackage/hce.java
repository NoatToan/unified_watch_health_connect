package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hce extends ViewDataBinding {
    public final AppCompatImageView A;
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public hce(Object obj, View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = linearLayout;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
    }
}
