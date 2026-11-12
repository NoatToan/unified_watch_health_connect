package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.view.widget.RunningSportMusicView;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rm0 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public final NestedScrollView D;
    public final ConstraintLayout E;
    public final xtq F;
    public final TextView G;
    public final ConstraintLayout H;
    public final TextView I;
    public final ConstraintLayout J;
    public final TextView K;
    public final ImageView L;
    public final ImageView M;
    public final RunningSportMusicView N;
    public final ImageView O;
    public final TextView P;
    public final LottieAnimationView Q;
    public final FrameLayout R;
    public final ConstraintLayout S;
    public final TextView T;
    public final LinearLayout U;
    public final LinearLayout V;
    public final LinearLayout W;
    public final LinearLayout X;
    public final LinearLayout Y;
    public final ConstraintLayout Z;
    public final pvq a0;
    public final TextView b0;
    public final ConstraintLayout c0;
    public final SportCommandView d0;
    public final ConstraintLayout e0;
    public final TextView f0;
    public final euq g0;
    public final TextView h0;
    public final xtq i0;
    public List<SportingItemData> j0;
    public Map<CommonSportModel.SportTitle, String> k0;

    public rm0(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, xtq xtqVar, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3, ConstraintLayout constraintLayout3, TextView textView4, ImageView imageView3, ImageView imageView4, RunningSportMusicView runningSportMusicView, ImageView imageView5, TextView textView5, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, ConstraintLayout constraintLayout4, TextView textView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout5, pvq pvqVar, TextView textView7, ConstraintLayout constraintLayout6, SportCommandView sportCommandView, ConstraintLayout constraintLayout7, TextView textView8, euq euqVar, TextView textView9, xtq xtqVar2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
        this.D = nestedScrollView;
        this.E = constraintLayout;
        this.F = xtqVar;
        this.G = textView2;
        this.H = constraintLayout2;
        this.I = textView3;
        this.J = constraintLayout3;
        this.K = textView4;
        this.L = imageView3;
        this.M = imageView4;
        this.N = runningSportMusicView;
        this.O = imageView5;
        this.P = textView5;
        this.Q = lottieAnimationView;
        this.R = frameLayout;
        this.S = constraintLayout4;
        this.T = textView6;
        this.U = linearLayout;
        this.V = linearLayout2;
        this.W = linearLayout3;
        this.X = linearLayout4;
        this.Y = linearLayout5;
        this.Z = constraintLayout5;
        this.a0 = pvqVar;
        this.b0 = textView7;
        this.c0 = constraintLayout6;
        this.d0 = sportCommandView;
        this.e0 = constraintLayout7;
        this.f0 = textView8;
        this.g0 = euqVar;
        this.h0 = textView9;
        this.i0 = xtqVar2;
    }

    public List<SportingItemData> A0() {
        return this.j0;
    }

    public abstract void B0(List<SportingItemData> list);

    public abstract void C0(Map<CommonSportModel.SportTitle, String> map);
}
