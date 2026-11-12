package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class sde extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final DividerView E;
    public final DividerView F;
    public final TextView G;
    public final RelativeLayout H;
    public final TextView I;
    public final TextView J;
    public final RelativeLayout K;

    public sde(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, DividerView dividerView, DividerView dividerView2, TextView textView4, RelativeLayout relativeLayout, TextView textView5, TextView textView6, RelativeLayout relativeLayout2) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = textView2;
        this.D = textView3;
        this.E = dividerView;
        this.F = dividerView2;
        this.G = textView4;
        this.H = relativeLayout;
        this.I = textView5;
        this.J = textView6;
        this.K = relativeLayout2;
    }
}
