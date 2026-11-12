package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fm6 extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final TextView C;
    public final LinearLayout D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;
    public final LinearLayout H;

    public fm6(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, TextView textView2, LinearLayout linearLayout, ImageView imageView, TextView textView3, TextView textView4, LinearLayout linearLayout2) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = textView2;
        this.D = linearLayout;
        this.E = imageView;
        this.F = textView3;
        this.G = textView4;
        this.H = linearLayout2;
    }
}
