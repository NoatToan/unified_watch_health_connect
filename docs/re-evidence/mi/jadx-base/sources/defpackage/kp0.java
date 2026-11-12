package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kp0 extends ViewDataBinding {
    public final ShapeableImageView A;
    public final View B;
    public final ConstraintLayout C;
    public final TextView D;
    public final ImageView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public kp0(Object obj, View view, int i, ShapeableImageView shapeableImageView, View view2, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = shapeableImageView;
        this.B = view2;
        this.C = constraintLayout;
        this.D = textView;
        this.E = imageView;
        this.F = constraintLayout2;
        this.G = textView2;
        this.H = textView3;
        this.I = textView4;
    }

    public static kp0 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kp0 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kp0) ViewDataBinding.G(layoutInflater, dvi.l, viewGroup, z, obj);
    }
}
