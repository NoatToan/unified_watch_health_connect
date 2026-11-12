package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w7a extends ViewDataBinding {
    public final CardView A;
    public final View B;
    public final NestedScrollView C;

    public w7a(Object obj, View view, int i, CardView cardView, View view2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = cardView;
        this.B = view2;
        this.C = nestedScrollView;
    }

    public static w7a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static w7a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (w7a) ViewDataBinding.G(layoutInflater, jui.j0, viewGroup, z, obj);
    }
}
