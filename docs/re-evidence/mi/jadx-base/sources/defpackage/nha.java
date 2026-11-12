package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetWeekBarView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nha extends ViewDataBinding {
    public final FrameLayout A;
    public final FrameLayout B;
    public final FrameLayout C;
    public final TextView D;
    public final LinearLayout E;
    public final RecyclerView F;
    public final FrameLayout G;
    public final FrameLayout H;
    public final TargetWeekBarView I;
    public final ThreeTargetView J;

    public nha(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, TextView textView, LinearLayout linearLayout, RecyclerView recyclerView, FrameLayout frameLayout4, FrameLayout frameLayout5, TargetWeekBarView targetWeekBarView, ThreeTargetView threeTargetView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = frameLayout2;
        this.C = frameLayout3;
        this.D = textView;
        this.E = linearLayout;
        this.F = recyclerView;
        this.G = frameLayout4;
        this.H = frameLayout5;
        this.I = targetWeekBarView;
        this.J = threeTargetView;
    }

    public static nha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static nha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (nha) ViewDataBinding.G(layoutInflater, jui.i1, viewGroup, z, obj);
    }
}
