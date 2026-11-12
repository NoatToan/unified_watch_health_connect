package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.SportShareLongView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cha extends ViewDataBinding {
    public final SportShareLongView A;

    public cha(Object obj, View view, int i, SportShareLongView sportShareLongView) {
        super(obj, view, i);
        this.A = sportShareLongView;
    }

    public static cha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static cha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (cha) ViewDataBinding.G(layoutInflater, ivi.d0, viewGroup, z, obj);
    }
}
