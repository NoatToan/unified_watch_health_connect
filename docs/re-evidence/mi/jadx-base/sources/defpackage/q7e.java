package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class q7e extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final RelativeLayout C;
    public final RelativeLayout D;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public q7e(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = relativeLayout;
        this.D = relativeLayout2;
        this.E = view2;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
    }

    public static q7e A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static q7e B0(View view, Object obj) {
        return (q7e) ViewDataBinding.k(obj, view, jui.H6);
    }
}
