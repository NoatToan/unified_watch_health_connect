package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yl6 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppCompatImageView B;
    public final AppCompatImageView C;
    public final TextView D;
    public final TextView E;
    public elf F;

    public yl6(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appCompatImageView;
        this.C = appCompatImageView2;
        this.D = textView;
        this.E = textView2;
    }

    public static yl6 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yl6 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yl6) ViewDataBinding.G(layoutInflater, eui.K1, viewGroup, z, obj);
    }

    public abstract void C0(elf elfVar);
}
