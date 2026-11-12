package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.JustDanceScoreLevelView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class rpp extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final AppCompatImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final JustDanceScoreLevelView H;
    public final TextView I;
    public final TextView J;

    public rpp(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView, TextView textView4, TextView textView5, TextView textView6, JustDanceScoreLevelView justDanceScoreLevelView, TextView textView7, TextView textView8) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = appCompatImageView;
        this.E = textView4;
        this.F = textView5;
        this.G = textView6;
        this.H = justDanceScoreLevelView;
        this.I = textView7;
        this.J = textView8;
    }

    public static rpp A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static rpp B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (rpp) ViewDataBinding.G(layoutInflater, ivi.b2, viewGroup, z, obj);
    }
}
