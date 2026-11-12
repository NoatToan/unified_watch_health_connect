package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wda extends ViewDataBinding {
    public final RecyclerView A;
    public final DataTitleSimpleView B;

    public wda(Object obj, View view, int i, RecyclerView recyclerView, DataTitleSimpleView dataTitleSimpleView) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = dataTitleSimpleView;
    }

    public static wda A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static wda B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (wda) ViewDataBinding.G(layoutInflater, ivi.v, viewGroup, z, obj);
    }
}
