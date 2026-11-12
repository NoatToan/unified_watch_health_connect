package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.ShareTrackLineView;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mod extends ViewDataBinding {
    public final RoundImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final RecyclerView E;
    public final ShareRoutineView F;
    public final ShareTrackLineView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    public mod(Object obj, View view, int i, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, ShareRoutineView shareRoutineView, ShareTrackLineView shareTrackLineView, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = roundImageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = recyclerView;
        this.F = shareRoutineView;
        this.G = shareTrackLineView;
        this.H = textView4;
        this.I = textView5;
        this.J = textView6;
    }

    public static mod A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static mod B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mod) ViewDataBinding.G(layoutInflater, ivi.q0, viewGroup, z, obj);
    }
}
