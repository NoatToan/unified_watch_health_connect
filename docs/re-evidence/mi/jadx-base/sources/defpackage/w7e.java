package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;
import com.xiaomi.fitness.v2.view.HomeCardCommonTitleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class w7e extends ViewDataBinding {
    public final HomeCardCommonTitleView A;
    public final LinearLayoutCompat B;
    public final View C;
    public final AppCompatImageView D;
    public final ProgressBar E;
    public final XAxisView F;

    public w7e(Object obj, View view, int i, HomeCardCommonTitleView homeCardCommonTitleView, LinearLayoutCompat linearLayoutCompat, View view2, AppCompatImageView appCompatImageView, ProgressBar progressBar, XAxisView xAxisView) {
        super(obj, view, i);
        this.A = homeCardCommonTitleView;
        this.B = linearLayoutCompat;
        this.C = view2;
        this.D = appCompatImageView;
        this.E = progressBar;
        this.F = xAxisView;
    }

    public static w7e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static w7e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (w7e) ViewDataBinding.G(layoutInflater, jui.N6, viewGroup, z, obj);
    }
}
