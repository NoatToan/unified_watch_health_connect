package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.weight.view.WeightEvaluationView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b4c extends ViewDataBinding {
    public final WeightEvaluationView A;

    public b4c(Object obj, View view, int i, WeightEvaluationView weightEvaluationView) {
        super(obj, view, i);
        this.A = weightEvaluationView;
    }

    public static b4c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static b4c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (b4c) ViewDataBinding.G(layoutInflater, jui.Z5, viewGroup, z, obj);
    }
}
