package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yod extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final ConstraintLayout D;

    public yod(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
        this.D = constraintLayout;
    }

    public static yod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static yod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (yod) ViewDataBinding.G(layoutInflater, eui.I2, viewGroup, z, obj);
    }
}
