package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class dgk extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final TextView C;
    public final RecyclerView D;
    public final LinearLayout E;
    public final CheckBox F;
    public final TextView G;
    public final TextView H;

    public dgk(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, TextView textView2, RecyclerView recyclerView, LinearLayout linearLayout, CheckBox checkBox, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = textView2;
        this.D = recyclerView;
        this.E = linearLayout;
        this.F = checkBox;
        this.G = textView3;
        this.H = textView4;
    }
}
