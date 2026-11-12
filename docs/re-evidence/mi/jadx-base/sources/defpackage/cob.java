package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cob extends ViewDataBinding {
    public final fce A;
    public final View B;
    public final View C;
    public final CardUnderstandView D;
    public final CardUnderstandView E;
    public final NestedScrollView F;
    public final ImageView G;
    public final TitleBarAlphaView H;
    public final CardUnderstandView I;
    public final CardUnderstandView J;
    public final CardUnderstandView K;

    public cob(Object obj, View view, int i, fce fceVar, View view2, View view3, CardUnderstandView cardUnderstandView, CardUnderstandView cardUnderstandView2, NestedScrollView nestedScrollView, ImageView imageView, TitleBarAlphaView titleBarAlphaView, CardUnderstandView cardUnderstandView3, CardUnderstandView cardUnderstandView4, CardUnderstandView cardUnderstandView5) {
        super(obj, view, i);
        this.A = fceVar;
        this.B = view2;
        this.C = view3;
        this.D = cardUnderstandView;
        this.E = cardUnderstandView2;
        this.F = nestedScrollView;
        this.G = imageView;
        this.H = titleBarAlphaView;
        this.I = cardUnderstandView3;
        this.J = cardUnderstandView4;
        this.K = cardUnderstandView5;
    }
}
