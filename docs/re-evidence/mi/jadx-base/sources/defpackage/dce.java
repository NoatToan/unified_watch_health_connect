package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dce extends ViewDataBinding {
    public final RelativeLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final LinearLayout E;
    public final RelativeLayout F;
    public final TextView G;
    public final TextView H;

    public dce(Object obj, View view, int i, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, RelativeLayout relativeLayout2, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = linearLayout;
        this.F = relativeLayout2;
        this.G = textView4;
        this.H = textView5;
    }
}
