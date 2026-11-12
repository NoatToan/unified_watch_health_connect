package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.ShareTrackLineView;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kod extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ConstraintLayout D;
    public final RoundImageView E;
    public final TextView F;
    public final TextView G;
    public final ShareRoutineView H;
    public final ShareTrackLineView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;

    public kod(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, RoundImageView roundImageView, TextView textView4, TextView textView5, ShareRoutineView shareRoutineView, ShareTrackLineView shareTrackLineView, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = constraintLayout;
        this.E = roundImageView;
        this.F = textView4;
        this.G = textView5;
        this.H = shareRoutineView;
        this.I = shareTrackLineView;
        this.J = textView6;
        this.K = textView7;
        this.L = textView8;
    }

    public static kod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kod) ViewDataBinding.G(layoutInflater, ivi.p0, viewGroup, z, obj);
    }
}
