package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r48 extends ViewDataBinding {
    public final LevelBarView A;
    public final RecyclerView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final View I;
    public final View J;
    public final View K;

    public r48(Object obj, View view, int i, LevelBarView levelBarView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2, View view3, View view4) {
        super(obj, view, i);
        this.A = levelBarView;
        this.B = recyclerView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
        this.I = view2;
        this.J = view3;
        this.K = view4;
    }

    public static r48 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static r48 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r48) ViewDataBinding.G(layoutInflater, gui.L, viewGroup, z, obj);
    }
}
