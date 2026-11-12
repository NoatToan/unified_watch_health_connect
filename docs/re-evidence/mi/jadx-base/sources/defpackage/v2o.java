package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.hr.HeartRateView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class v2o extends ViewDataBinding {
    public final eae A;
    public final f8e B;
    public final HeartRateView C;
    public final pde D;

    public v2o(Object obj, View view, int i, eae eaeVar, f8e f8eVar, HeartRateView heartRateView, pde pdeVar) {
        super(obj, view, i);
        this.A = eaeVar;
        this.B = f8eVar;
        this.C = heartRateView;
        this.D = pdeVar;
    }

    public static v2o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static v2o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (v2o) ViewDataBinding.G(layoutInflater, evi.l, viewGroup, z, obj);
    }
}
