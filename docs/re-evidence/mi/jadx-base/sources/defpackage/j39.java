package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j39 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public final TextView C;
    public final ConstraintLayout D;
    public final TextView E;

    public j39(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
        this.C = textView;
        this.D = constraintLayout2;
        this.E = textView2;
    }

    public static j39 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static j39 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (j39) ViewDataBinding.G(layoutInflater, ovi.W, viewGroup, z, obj);
    }
}
