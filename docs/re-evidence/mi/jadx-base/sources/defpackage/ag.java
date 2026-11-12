package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ag extends ViewDataBinding {
    public final LinearLayout A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public ag(Object obj, View view, int i, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }
}
