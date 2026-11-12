package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class r1c extends ViewDataBinding {
    public final AppCompatImageView A;
    public final NestedScrollView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;

    public r1c(Object obj, View view, int i, AppCompatImageView appCompatImageView, NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = nestedScrollView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
    }

    public static r1c A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static r1c B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (r1c) ViewDataBinding.G(layoutInflater, jui.t5, viewGroup, z, obj);
    }
}
