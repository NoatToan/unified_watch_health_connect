package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import miuix.miuixbasewidget.widget.FilterSortView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rnb extends ViewDataBinding {
    public final FrameLayout A;
    public final FilterSortView B;

    public rnb(Object obj, View view, int i, FrameLayout frameLayout, FilterSortView filterSortView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = filterSortView;
    }

    public static rnb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static rnb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (rnb) ViewDataBinding.G(layoutInflater, jui.B2, viewGroup, z, obj);
    }
}
