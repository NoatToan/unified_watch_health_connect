package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yt4 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final RecyclerView C;

    public yt4(Object obj, View view, int i, TextView textView, TextView textView2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = recyclerView;
    }

    public static yt4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yt4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yt4) ViewDataBinding.G(layoutInflater, dvi.course_launch_layout_grid, viewGroup, z, obj);
    }
}
