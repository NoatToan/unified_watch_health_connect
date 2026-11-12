package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.view.HealthBannerCardSetView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tbe extends ViewDataBinding {
    public final hce A;
    public final View B;
    public final HealthBannerCardSetView C;
    public final LinearLayout D;
    public final ConstraintLayout E;
    public final LinearLayout F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final ConstraintLayout J;
    public final vbe K;

    public tbe(Object obj, View view, int i, hce hceVar, View view2, HealthBannerCardSetView healthBannerCardSetView, LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, vbe vbeVar) {
        super(obj, view, i);
        this.A = hceVar;
        this.B = view2;
        this.C = healthBannerCardSetView;
        this.D = linearLayout;
        this.E = constraintLayout;
        this.F = linearLayout2;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
        this.J = constraintLayout2;
        this.K = vbeVar;
    }

    public static tbe A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static tbe B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (tbe) ViewDataBinding.G(layoutInflater, jui.z7, viewGroup, z, obj);
    }
}
