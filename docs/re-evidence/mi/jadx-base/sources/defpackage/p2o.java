package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.PathView;
import com.xiaomi.fitness.sport_capture.widgets.SpeedView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p2o extends ViewDataBinding {
    public final eae A;
    public final f8e B;
    public final eae C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final eae G;
    public final PathView H;
    public final eae I;
    public final SpeedView J;
    public final pde K;

    public p2o(Object obj, View view, int i, eae eaeVar, f8e f8eVar, eae eaeVar2, TextView textView, TextView textView2, TextView textView3, eae eaeVar3, PathView pathView, eae eaeVar4, SpeedView speedView, pde pdeVar) {
        super(obj, view, i);
        this.A = eaeVar;
        this.B = f8eVar;
        this.C = eaeVar2;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = eaeVar3;
        this.H = pathView;
        this.I = eaeVar4;
        this.J = speedView;
        this.K = pdeVar;
    }

    public static p2o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static p2o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p2o) ViewDataBinding.G(layoutInflater, evi.j, viewGroup, z, obj);
    }
}
