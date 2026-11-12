package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kda extends ViewDataBinding {
    public final DataTitleSimpleView A;
    public final RecyclerView B;
    public final RecyclerView C;

    public kda(Object obj, View view, int i, DataTitleSimpleView dataTitleSimpleView, RecyclerView recyclerView, RecyclerView recyclerView2) {
        super(obj, view, i);
        this.A = dataTitleSimpleView;
        this.B = recyclerView;
        this.C = recyclerView2;
    }

    public static kda A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kda B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kda) ViewDataBinding.G(layoutInflater, ivi.p, viewGroup, z, obj);
    }
}
