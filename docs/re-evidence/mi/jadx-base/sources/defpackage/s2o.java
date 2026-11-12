package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.PathView;
import com.xiaomi.fitness.sport_capture.widgets.SpeedView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s2o extends ViewDataBinding {
    public final eae A;
    public final f8e B;
    public final eae C;
    public final TextView D;
    public final TextView E;
    public final eae F;
    public final PathView G;
    public final SpeedView H;
    public final pde I;

    public s2o(Object obj, View view, int i, eae eaeVar, f8e f8eVar, eae eaeVar2, TextView textView, TextView textView2, eae eaeVar3, PathView pathView, SpeedView speedView, pde pdeVar) {
        super(obj, view, i);
        this.A = eaeVar;
        this.B = f8eVar;
        this.C = eaeVar2;
        this.D = textView;
        this.E = textView2;
        this.F = eaeVar3;
        this.G = pathView;
        this.H = speedView;
        this.I = pdeVar;
    }

    public static s2o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static s2o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (s2o) ViewDataBinding.G(layoutInflater, evi.f17108k, viewGroup, z, obj);
    }
}
