package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qae extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final TextView C;

    public qae(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = textView;
    }

    public static qae A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qae B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qae) ViewDataBinding.G(layoutInflater, ovi.C0, viewGroup, z, obj);
    }
}
