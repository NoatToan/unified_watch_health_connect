package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class brf extends ViewDataBinding {
    public final Barrier A;
    public final Barrier B;
    public final FrameLayout C;
    public final RoundImageView D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public brf(Object obj, View view, int i, Barrier barrier, Barrier barrier2, FrameLayout frameLayout, RoundImageView roundImageView, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = barrier;
        this.B = barrier2;
        this.C = frameLayout;
        this.D = roundImageView;
        this.E = imageView;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
    }

    public static brf A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static brf B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (brf) ViewDataBinding.G(layoutInflater, vti.f37214b, viewGroup, z, obj);
    }
}
