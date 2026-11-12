package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vyl extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final RatioImageView C;
    public final ConstraintLayout D;
    public final TextView E;

    public vyl(Object obj, View view, int i, ImageView imageView, TextView textView, RatioImageView ratioImageView, ConstraintLayout constraintLayout, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = ratioImageView;
        this.D = constraintLayout;
        this.E = textView2;
    }

    public static vyl A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static vyl B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (vyl) ViewDataBinding.G(layoutInflater, fvi.f0, viewGroup, z, obj);
    }
}
