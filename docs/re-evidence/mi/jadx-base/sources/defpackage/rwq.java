package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.RecommendSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rwq extends ViewDataBinding {
    public final ConstraintLayout A;
    public final ImageView B;
    public RecommendSportBean C;

    public rwq(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = imageView;
    }

    public static rwq A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static rwq B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (rwq) ViewDataBinding.G(layoutInflater, dvi.L1, viewGroup, z, obj);
    }

    public abstract void C0(RecommendSportBean recommendSportBean);
}
