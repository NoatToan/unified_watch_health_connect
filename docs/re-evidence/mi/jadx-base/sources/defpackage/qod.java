package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xiaomi.wearable.data.sportmodel.detail.view.LinearGradientView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qod extends ViewDataBinding {
    public final View A;
    public final FrameLayout B;
    public final RoundImageView C;
    public final LinearGradientView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final RecyclerView H;
    public final RelativeLayout I;
    public final ConstraintLayout J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;

    public qod(Object obj, View view, int i, View view2, FrameLayout frameLayout, RoundImageView roundImageView, LinearGradientView linearGradientView, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.A = view2;
        this.B = frameLayout;
        this.C = roundImageView;
        this.D = linearGradientView;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = recyclerView;
        this.I = relativeLayout;
        this.J = constraintLayout;
        this.K = textView4;
        this.L = textView5;
        this.M = textView6;
        this.N = textView7;
        this.O = textView8;
        this.P = textView9;
    }

    public static qod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qod) ViewDataBinding.G(layoutInflater, ivi.s0, viewGroup, z, obj);
    }
}
