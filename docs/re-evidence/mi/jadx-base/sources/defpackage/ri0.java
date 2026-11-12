package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport_eco.bean.SportingItemData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.view.widget.SportCommandView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ri0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final ConstraintLayout E;
    public final TextView F;
    public final ImageView G;
    public final TextView H;
    public final LottieAnimationView I;
    public final FrameLayout J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final LinearLayout O;
    public final ConstraintLayout P;
    public final SportCommandView Q;
    public final ConstraintLayout R;
    public final TextView S;
    public final vsq T;
    public final TextView U;
    public List<SportingItemData> V;
    public Map<CommonSportModel.SportTitle, String> W;

    public ri0(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, ImageView imageView, TextView textView5, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout3, SportCommandView sportCommandView, ConstraintLayout constraintLayout4, TextView textView6, vsq vsqVar, TextView textView7) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = constraintLayout;
        this.D = textView3;
        this.E = constraintLayout2;
        this.F = textView4;
        this.G = imageView;
        this.H = textView5;
        this.I = lottieAnimationView;
        this.J = frameLayout;
        this.K = linearLayout;
        this.L = linearLayout2;
        this.M = linearLayout3;
        this.N = linearLayout4;
        this.O = linearLayout5;
        this.P = constraintLayout3;
        this.Q = sportCommandView;
        this.R = constraintLayout4;
        this.S = textView6;
        this.T = vsqVar;
        this.U = textView7;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
