package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pog extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final TextView C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final TextView F;

    public pog(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, TextView textView2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = textView2;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = textView3;
    }
}
