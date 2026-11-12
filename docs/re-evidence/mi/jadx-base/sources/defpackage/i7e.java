package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i7e extends ViewDataBinding {
    public final ImageView A;
    public final LinearLayout B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;

    public i7e(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, LinearLayout linearLayout3, TextView textView4) {
        super(obj, view, i);
        this.A = imageView;
        this.B = linearLayout;
        this.C = textView;
        this.D = linearLayout2;
        this.E = textView2;
        this.F = constraintLayout;
        this.G = textView3;
        this.H = linearLayout3;
        this.I = textView4;
    }
}
