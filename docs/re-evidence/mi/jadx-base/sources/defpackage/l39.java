package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l39 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ImageView C;
    public final TextView D;

    public l39(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = imageView;
        this.D = textView2;
    }

    public static l39 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static l39 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (l39) ViewDataBinding.G(layoutInflater, ovi.Y, viewGroup, z, obj);
    }
}
