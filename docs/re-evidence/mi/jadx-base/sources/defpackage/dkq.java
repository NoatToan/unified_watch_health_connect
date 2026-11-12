package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dkq extends ViewDataBinding {
    public final CardView A;
    public final RelativeLayout B;
    public final ujq C;
    public final NestedScrollView D;
    public final View E;
    public final TextView F;
    public final TextView G;

    public dkq(Object obj, View view, int i, CardView cardView, RelativeLayout relativeLayout, ujq ujqVar, NestedScrollView nestedScrollView, View view2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = cardView;
        this.B = relativeLayout;
        this.C = ujqVar;
        this.D = nestedScrollView;
        this.E = view2;
        this.F = textView;
        this.G = textView2;
    }
}
