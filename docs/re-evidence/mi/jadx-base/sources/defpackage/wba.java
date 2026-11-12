package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.CommonTitleBar;

/* JADX INFO: loaded from: classes9.dex */
public abstract class wba extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final RecyclerView D;
    public final View E;
    public final ConstraintLayout F;
    public final LinearLayout G;
    public final TextView H;
    public final RecyclerView I;
    public final CommonTitleBar J;

    public wba(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, View view2, ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView4, RecyclerView recyclerView2, CommonTitleBar commonTitleBar) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = recyclerView;
        this.E = view2;
        this.F = constraintLayout;
        this.G = linearLayout;
        this.H = textView4;
        this.I = recyclerView2;
        this.J = commonTitleBar;
    }
}
