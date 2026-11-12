package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.bean.RecommendSportBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ctq extends ViewDataBinding {
    public final ImageView A;
    public RecommendSportBean B;

    public ctq(Object obj, View view, int i, ImageView imageView) {
        super(obj, view, i);
        this.A = imageView;
    }

    public static ctq A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ctq B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ctq) ViewDataBinding.G(layoutInflater, fvi.v0, viewGroup, z, obj);
    }

    public abstract void C0(RecommendSportBean recommendSportBean);
}
