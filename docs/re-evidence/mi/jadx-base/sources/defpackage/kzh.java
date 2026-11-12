package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kzh extends ViewDataBinding {
    public final Guideline A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final TextView H;

    public kzh(Object obj, View view, int i, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = guideline;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = imageView4;
        this.F = constraintLayout;
        this.G = textView;
        this.H = textView2;
    }

    public static kzh A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kzh B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kzh) ViewDataBinding.G(layoutInflater, bui.v, viewGroup, z, obj);
    }
}
