package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bog extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final RelativeLayout D;
    public final TextView E;
    public final TextView F;

    public bog(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, RelativeLayout relativeLayout, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = relativeLayout;
        this.E = textView3;
        this.F = textView4;
    }
}
