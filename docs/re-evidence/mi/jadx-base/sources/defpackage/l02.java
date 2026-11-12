package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l02 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final AppCompatImageView D;
    public final TextView E;
    public final TextView F;

    public l02(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = appCompatImageView3;
        this.E = textView;
        this.F = textView2;
    }

    public static l02 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l02 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l02) ViewDataBinding.G(layoutInflater, cwi.f14804b, viewGroup, z, obj);
    }
}
