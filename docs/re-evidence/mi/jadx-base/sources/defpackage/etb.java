package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class etb extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final DividerView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public etb(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, DividerView dividerView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = textView;
        this.D = dividerView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }

    public static etb A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static etb B0(View view, Object obj) {
        return (etb) ViewDataBinding.k(obj, view, jui.f3);
    }
}
