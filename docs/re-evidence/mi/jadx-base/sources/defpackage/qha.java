package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qha extends ViewDataBinding {
    public final TargetWeekBarView A;

    public qha(Object obj, View view, int i, TargetWeekBarView targetWeekBarView) {
        super(obj, view, i);
        this.A = targetWeekBarView;
    }

    public static qha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qha) ViewDataBinding.G(layoutInflater, jui.j1, viewGroup, z, obj);
    }
}
