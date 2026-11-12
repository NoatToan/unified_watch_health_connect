package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ctb extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;

    public ctb(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = imageView;
        this.D = imageView2;
        this.E = textView2;
        this.F = textView3;
    }
}
