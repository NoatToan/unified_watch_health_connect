package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class hqg extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final View C;
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public hqg(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, View view2, LinearLayout linearLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = view2;
        this.D = linearLayout;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
    }
}
