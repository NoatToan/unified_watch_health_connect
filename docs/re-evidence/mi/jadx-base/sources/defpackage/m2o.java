package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.PathView;
import com.xiaomi.fitness.sport_capture.widgets.SpeedView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m2o extends ViewDataBinding {
    public final eae A;
    public final f8e B;
    public final eae C;
    public final TextView D;
    public final eae E;
    public final PathView F;
    public final SpeedView G;
    public final pde H;
    public final TextView I;
    public final TextView J;

    public m2o(Object obj, View view, int i, eae eaeVar, f8e f8eVar, eae eaeVar2, TextView textView, eae eaeVar3, PathView pathView, SpeedView speedView, pde pdeVar, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = eaeVar;
        this.B = f8eVar;
        this.C = eaeVar2;
        this.D = textView;
        this.E = eaeVar3;
        this.F = pathView;
        this.G = speedView;
        this.H = pdeVar;
        this.I = textView2;
        this.J = textView3;
    }

    public static m2o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static m2o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (m2o) ViewDataBinding.G(layoutInflater, evi.i, viewGroup, z, obj);
    }
}
