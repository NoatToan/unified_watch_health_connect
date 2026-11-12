package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bde extends ViewDataBinding {
    public final LinearLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final ConstraintLayout E;
    public final AppCompatTextView F;

    public bde(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = constraintLayout;
        this.F = appCompatTextView;
    }

    public static bde A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static bde B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (bde) ViewDataBinding.G(layoutInflater, dvi.E, viewGroup, z, obj);
    }
}
