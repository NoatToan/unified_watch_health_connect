package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelPercentBarView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z3c extends ViewDataBinding {
    public final LevelPercentBarView A;
    public final RecyclerView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final Guideline I;
    public final View J;
    public final View K;
    public final View L;

    public z3c(Object obj, View view, int i, LevelPercentBarView levelPercentBarView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, Guideline guideline, View view2, View view3, View view4) {
        super(obj, view, i);
        this.A = levelPercentBarView;
        this.B = recyclerView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
        this.I = guideline;
        this.J = view2;
        this.K = view3;
        this.L = view4;
    }

    public static z3c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static z3c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (z3c) ViewDataBinding.G(layoutInflater, jui.Y5, viewGroup, z, obj);
    }
}
