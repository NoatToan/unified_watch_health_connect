package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class oxb extends ViewDataBinding {
    public final HomeCardCommonTitleView A;
    public final AppCompatImageView B;
    public final LevelBarView C;
    public final ConstraintLayout D;
    public final XAxisView E;

    public oxb(Object obj, View view, int i, HomeCardCommonTitleView homeCardCommonTitleView, AppCompatImageView appCompatImageView, LevelBarView levelBarView, ConstraintLayout constraintLayout, XAxisView xAxisView) {
        super(obj, view, i);
        this.A = homeCardCommonTitleView;
        this.B = appCompatImageView;
        this.C = levelBarView;
        this.D = constraintLayout;
        this.E = xAxisView;
    }

    public static oxb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static oxb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (oxb) ViewDataBinding.G(layoutInflater, jui.g4, viewGroup, z, obj);
    }
}
