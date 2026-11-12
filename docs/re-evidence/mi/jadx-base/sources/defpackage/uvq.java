package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uvq extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final ConstraintLayout H;
    public final ImageView I;
    public final LinearLayout J;
    public final ImageView K;
    public final wvq L;
    public final LottieAnimationView M;
    public final ConstraintLayout N;
    public final TextView O;
    public final ConstraintLayout P;
    public final LinearLayout Q;
    public final TextView R;
    public final LinearLayout S;
    public final TextView T;
    public final mvq U;
    public List<SportingItemData> V;
    public Map<CommonSportModel.SportTitle, String> W;

    public uvq(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, wvq wvqVar, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout3, TextView textView7, ConstraintLayout constraintLayout4, LinearLayout linearLayout2, TextView textView8, LinearLayout linearLayout3, TextView textView9, mvq mvqVar) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
        this.G = textView6;
        this.H = constraintLayout2;
        this.I = imageView;
        this.J = linearLayout;
        this.K = imageView2;
        this.L = wvqVar;
        this.M = lottieAnimationView;
        this.N = constraintLayout3;
        this.O = textView7;
        this.P = constraintLayout4;
        this.Q = linearLayout2;
        this.R = textView8;
        this.S = linearLayout3;
        this.T = textView9;
        this.U = mvqVar;
    }

    public abstract void A0(List<SportingItemData> list);

    public abstract void B0(Map<CommonSportModel.SportTitle, String> map);
}
