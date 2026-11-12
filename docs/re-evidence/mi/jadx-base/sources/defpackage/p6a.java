package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p6a extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final LinearLayout D;
    public final RecyclerView E;
    public final TextView F;
    public final DividerView G;
    public final View H;
    public final PhotoBgPicker I;
    public final ConstraintLayout J;
    public final miuix.recyclerview.widget.RecyclerView K;

    public p6a(Object obj, View view, int i, TextView textView, TextView textView2, View view2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView3, DividerView dividerView, View view3, PhotoBgPicker photoBgPicker, ConstraintLayout constraintLayout, miuix.recyclerview.widget.RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = view2;
        this.D = linearLayout;
        this.E = recyclerView;
        this.F = textView3;
        this.G = dividerView;
        this.H = view3;
        this.I = photoBgPicker;
        this.J = constraintLayout;
        this.K = recyclerView2;
    }
}
