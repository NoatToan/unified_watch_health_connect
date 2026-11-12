package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.PathView;
import com.xiaomi.fitness.sport_capture.widgets.SpeedView;
import com.xiaomi.fitness.sport_capture.widgets.hr.HeartRateView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j2o extends ViewDataBinding {
    public final eae A;
    public final f8e B;
    public final eae C;
    public final TextView D;
    public final eae E;
    public final HeartRateView F;
    public final eae G;
    public final PathView H;
    public final SpeedView I;
    public final pde J;
    public final LinearLayout K;
    public final TextView L;

    public j2o(Object obj, View view, int i, eae eaeVar, f8e f8eVar, eae eaeVar2, TextView textView, eae eaeVar3, HeartRateView heartRateView, eae eaeVar4, PathView pathView, SpeedView speedView, pde pdeVar, LinearLayout linearLayout, TextView textView2) {
        super(obj, view, i);
        this.A = eaeVar;
        this.B = f8eVar;
        this.C = eaeVar2;
        this.D = textView;
        this.E = eaeVar3;
        this.F = heartRateView;
        this.G = eaeVar4;
        this.H = pathView;
        this.I = speedView;
        this.J = pdeVar;
        this.K = linearLayout;
        this.L = textView2;
    }

    public static j2o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j2o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j2o) ViewDataBinding.G(layoutInflater, evi.h, viewGroup, z, obj);
    }
}
