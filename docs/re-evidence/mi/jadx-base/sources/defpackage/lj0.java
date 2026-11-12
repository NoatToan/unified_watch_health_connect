package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lj0 extends ViewDataBinding {
    public final Button A;
    public final RelativeLayout B;
    public final RelativeLayout C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final TextView F;

    public lj0(Object obj, View view, int i, Button button, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i);
        this.A = button;
        this.B = relativeLayout;
        this.C = relativeLayout2;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = textView;
    }
}
