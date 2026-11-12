package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sea extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final DataTitleSimpleView E;
    public final TextView F;
    public final TextView G;

    public sea(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, DataTitleSimpleView dataTitleSimpleView, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = dataTitleSimpleView;
        this.F = textView4;
        this.G = textView5;
    }

    public static sea A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static sea B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (sea) ViewDataBinding.G(layoutInflater, ivi.F, viewGroup, z, obj);
    }
}
