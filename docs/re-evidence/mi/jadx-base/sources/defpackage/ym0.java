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
public abstract class ym0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ConstraintLayout C;
    public final TextView D;
    public final ImageView E;
    public final LottieAnimationView F;
    public final FrameLayout G;
    public final LinearLayout H;
    public final LinearLayout I;
    public final LinearLayout J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final ConstraintLayout M;
    public final SportCommandView N;
    public final ConstraintLayout O;
    public final TextView P;
    public final vsq Q;
    public final TextView R;
    public List<SportingItemData> S;
    public Map<CommonSportModel.SportTitle, String> T;

    public ym0(Object obj, View view, int i, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ImageView imageView, LottieAnimationView lottieAnimationView, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout2, SportCommandView sportCommandView, ConstraintLayout constraintLayout3, TextView textView4, vsq vsqVar, TextView textView5) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = constraintLayout;
        this.D = textView3;
        this.E = imageView;
        this.F = lottieAnimationView;
        this.G = frameLayout;
        this.H = linearLayout;
        this.I = linearLayout2;
        this.J = linearLayout3;
        this.K = linearLayout4;
        this.L = linearLayout5;
        this.M = constraintLayout2;
        this.N = sportCommandView;
        this.O = constraintLayout3;
        this.P = textView4;
        this.Q = vsqVar;
        this.R = textView5;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
