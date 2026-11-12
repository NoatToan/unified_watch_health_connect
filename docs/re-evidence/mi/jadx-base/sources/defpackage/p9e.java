package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.widget.NoTouchRecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class p9e extends ViewDataBinding {
    public final NoTouchRecyclerView A;
    public final TextView B;
    public final TextView C;

    public p9e(Object obj, View view, int i, NoTouchRecyclerView noTouchRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = noTouchRecyclerView;
        this.B = textView;
        this.C = textView2;
    }

    public static p9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static p9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (p9e) ViewDataBinding.G(layoutInflater, ovi.y0, viewGroup, z, obj);
    }
}
