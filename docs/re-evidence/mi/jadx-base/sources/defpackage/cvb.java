package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;
import com.xiaomi.fitness.health.threetarget.view.ShareSportTargetDataInfoView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class cvb extends ViewDataBinding {
    public final ShareAccountInfoView A;
    public final CardView B;
    public final TextView C;
    public final ConstraintLayout D;
    public final View E;
    public final Guideline F;
    public final ImageView G;
    public final ShareSportTargetDataInfoView H;
    public final ShareSportTargetDataInfoView I;
    public final NestedScrollView J;
    public final RecyclerView K;
    public final ShareSportTargetDataInfoView L;
    public final ThreeTargetView M;

    public cvb(Object obj, View view, int i, ShareAccountInfoView shareAccountInfoView, CardView cardView, TextView textView, ConstraintLayout constraintLayout, View view2, Guideline guideline, ImageView imageView, ShareSportTargetDataInfoView shareSportTargetDataInfoView, ShareSportTargetDataInfoView shareSportTargetDataInfoView2, NestedScrollView nestedScrollView, RecyclerView recyclerView, ShareSportTargetDataInfoView shareSportTargetDataInfoView3, ThreeTargetView threeTargetView) {
        super(obj, view, i);
        this.A = shareAccountInfoView;
        this.B = cardView;
        this.C = textView;
        this.D = constraintLayout;
        this.E = view2;
        this.F = guideline;
        this.G = imageView;
        this.H = shareSportTargetDataInfoView;
        this.I = shareSportTargetDataInfoView2;
        this.J = nestedScrollView;
        this.K = recyclerView;
        this.L = shareSportTargetDataInfoView3;
        this.M = threeTargetView;
    }
}
