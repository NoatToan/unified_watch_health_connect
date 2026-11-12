package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ffk extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final ImageView C;
    public final ConstraintLayout D;

    public ffk(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = imageView3;
        this.D = constraintLayout;
    }

    public static ffk A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static ffk B0(LayoutInflater layoutInflater, Object obj) {
        return (ffk) ViewDataBinding.G(layoutInflater, xui.c, null, false, obj);
    }
}
