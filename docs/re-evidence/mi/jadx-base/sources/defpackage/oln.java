package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class oln extends ViewDataBinding {
    public final Button A;
    public final ConstraintLayout B;
    public final AppCompatTextView C;

    public oln(Object obj, View view, int i, Button button, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = button;
        this.B = constraintLayout;
        this.C = appCompatTextView;
    }

    public static oln A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static oln B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (oln) ViewDataBinding.G(layoutInflater, dvi.Y, viewGroup, z, obj);
    }
}
