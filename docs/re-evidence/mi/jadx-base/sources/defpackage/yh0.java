package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.mi.health.sport.AmapRealTimePathView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class yh0 extends ViewDataBinding {
    public final AmapRealTimePathView A;
    public final LottieAnimationView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final NestedScrollView F;
    public final ImageView G;
    public final uvq H;
    public final mae I;
    public final View J;
    public final LottieAnimationView K;
    public final RunningSportMusicView L;
    public final ConstraintLayout M;
    public final TextView N;
    public final SportCommandView O;
    public final ConstraintLayout P;
    public final ConstraintLayout Q;
    public List<SportingItemData> R;
    public Map<CommonSportModel.SportTitle, String> S;

    public yh0(Object obj, View view, int i, AmapRealTimePathView amapRealTimePathView, LottieAnimationView lottieAnimationView, ImageView imageView, ImageView imageView2, ImageView imageView3, NestedScrollView nestedScrollView, ImageView imageView4, uvq uvqVar, mae maeVar, View view2, LottieAnimationView lottieAnimationView2, RunningSportMusicView runningSportMusicView, ConstraintLayout constraintLayout, TextView textView, SportCommandView sportCommandView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.A = amapRealTimePathView;
        this.B = lottieAnimationView;
        this.C = imageView;
        this.D = imageView2;
        this.E = imageView3;
        this.F = nestedScrollView;
        this.G = imageView4;
        this.H = uvqVar;
        this.I = maeVar;
        this.J = view2;
        this.K = lottieAnimationView2;
        this.L = runningSportMusicView;
        this.M = constraintLayout;
        this.N = textView;
        this.O = sportCommandView;
        this.P = constraintLayout2;
        this.Q = constraintLayout3;
    }

    public List<SportingItemData> A0() {
        return this.R;
    }

    public abstract void B0(List<SportingItemData> list);

    public abstract void C0(Map<CommonSportModel.SportTitle, String> map);
}
