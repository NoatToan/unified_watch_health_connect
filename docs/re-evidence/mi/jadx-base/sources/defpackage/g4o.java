package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g4o extends ViewDataBinding {
    public final ImageFilterView A;
    public final ImageFilterView B;
    public final ImageFilterView C;
    public final TextView D;
    public final Group E;
    public final View F;
    public final ImageFilterView G;
    public final ImageFilterView H;
    public final TextView I;
    public final TextView J;

    public g4o(Object obj, View view, int i, ImageFilterView imageFilterView, ImageFilterView imageFilterView2, ImageFilterView imageFilterView3, TextView textView, Group group, View view2, ImageFilterView imageFilterView4, ImageFilterView imageFilterView5, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = imageFilterView;
        this.B = imageFilterView2;
        this.C = imageFilterView3;
        this.D = textView;
        this.E = group;
        this.F = view2;
        this.G = imageFilterView4;
        this.H = imageFilterView5;
        this.I = textView2;
        this.J = textView3;
    }

    public static g4o A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static g4o B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (g4o) ViewDataBinding.G(layoutInflater, dvi.i1, viewGroup, z, obj);
    }
}
