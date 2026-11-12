package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class axb extends ViewDataBinding {
    public final DurationTextView A;
    public final AppCompatImageView B;
    public final LinearLayout C;
    public final LinearLayout D;
    public final View E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public axb(Object obj, View view, int i, DurationTextView durationTextView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, LinearLayout linearLayout2, View view2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = durationTextView;
        this.B = appCompatImageView;
        this.C = linearLayout;
        this.D = linearLayout2;
        this.E = view2;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
    }

    public static axb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static axb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (axb) ViewDataBinding.G(layoutInflater, jui.c4, viewGroup, z, obj);
    }
}
