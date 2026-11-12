package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.SymptomSelectView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mtb extends ViewDataBinding {
    public final DividerView A;
    public final Guideline B;
    public final Guideline C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;
    public final SymptomSelectView G;
    public final SymptomSelectView H;
    public final SymptomSelectView I;

    public mtb(Object obj, View view, int i, DividerView dividerView, Guideline guideline, Guideline guideline2, ImageView imageView, TextView textView, TextView textView2, SymptomSelectView symptomSelectView, SymptomSelectView symptomSelectView2, SymptomSelectView symptomSelectView3) {
        super(obj, view, i);
        this.A = dividerView;
        this.B = guideline;
        this.C = guideline2;
        this.D = imageView;
        this.E = textView;
        this.F = textView2;
        this.G = symptomSelectView;
        this.H = symptomSelectView2;
        this.I = symptomSelectView3;
    }

    public static mtb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static mtb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mtb) ViewDataBinding.G(layoutInflater, jui.m3, viewGroup, z, obj);
    }
}
