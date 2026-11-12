package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zqf extends ViewDataBinding {
    public final FrameLayout A;
    public final RoundImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public zqf(Object obj, View view, int i, FrameLayout frameLayout, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = roundImageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }

    public static zqf A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static zqf B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zqf) ViewDataBinding.G(layoutInflater, vti.f37213a, viewGroup, z, obj);
    }
}
