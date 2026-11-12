package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sod extends ViewDataBinding {
    public final RecyclerView A;
    public final DataTitleSimpleView B;

    public sod(Object obj, View view, int i, RecyclerView recyclerView, DataTitleSimpleView dataTitleSimpleView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = dataTitleSimpleView;
    }

    public static sod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sod) ViewDataBinding.G(layoutInflater, ivi.t0, viewGroup, z, obj);
    }
}
