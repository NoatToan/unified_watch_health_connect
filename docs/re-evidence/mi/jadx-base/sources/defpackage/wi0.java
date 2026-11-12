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
public abstract class wi0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ConstraintLayout D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final LottieAnimationView H;
    public final FrameLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final LinearLayout M;
    public final LinearLayout N;
    public final ConstraintLayout O;
    public final SportCommandView P;
    public final ConstraintLayout Q;
    public final TextView R;
    public final vsq S;
    public final TextView T;
    public List<SportingItemData> U;
    public Map<CommonSportModel.SportTitle, String> V;

    public wi0(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, TextView textView4, ImageView imageView, TextView textView5, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout2, SportCommandView sportCommandView, ConstraintLayout constraintLayout3, TextView textView6, vsq vsqVar, TextView textView7) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = constraintLayout;
        this.E = textView4;
        this.F = imageView;
        this.G = textView5;
        this.H = lottieAnimationView;
        this.I = frameLayout;
        this.J = linearLayout;
        this.K = linearLayout2;
        this.L = linearLayout3;
        this.M = linearLayout4;
        this.N = linearLayout5;
        this.O = constraintLayout2;
        this.P = sportCommandView;
        this.Q = constraintLayout3;
        this.R = textView6;
        this.S = vsqVar;
        this.T = textView7;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
