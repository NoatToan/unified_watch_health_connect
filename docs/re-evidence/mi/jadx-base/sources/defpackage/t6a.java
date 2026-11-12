package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t6a extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final DividerView G;
    public final RecyclerView H;
    public final z29 I;
    public final StateLayout J;
    public final TextView K;

    public t6a(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, DividerView dividerView, RecyclerView recyclerView, z29 z29Var, StateLayout stateLayout, TextView textView4) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
        this.E = constraintLayout2;
        this.F = textView3;
        this.G = dividerView;
        this.H = recyclerView;
        this.I = z29Var;
        this.J = stateLayout;
        this.K = textView4;
    }

    public static t6a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static t6a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t6a) ViewDataBinding.G(layoutInflater, ovi.i0, viewGroup, z, obj);
    }
}
