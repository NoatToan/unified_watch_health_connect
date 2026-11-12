package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uea extends ViewDataBinding {
    public final RecyclerView A;
    public final LinearLayout B;
    public final DataTitleSimpleView C;

    public uea(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, DataTitleSimpleView dataTitleSimpleView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = linearLayout;
        this.C = dataTitleSimpleView;
    }

    public static uea A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static uea B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uea) ViewDataBinding.G(layoutInflater, ivi.G, viewGroup, z, obj);
    }
}
