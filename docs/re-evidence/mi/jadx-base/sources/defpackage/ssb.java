package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.SymRecordLatestView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ssb extends ViewDataBinding {
    public final DividerView A;
    public final SymRecordLatestView B;
    public final SymRecordLatestView C;
    public final SymRecordLatestView D;
    public final ImageView E;
    public final ConstraintLayout F;
    public final ImageView G;
    public final TextView H;
    public final TextView I;

    public ssb(Object obj, View view, int i, DividerView dividerView, SymRecordLatestView symRecordLatestView, SymRecordLatestView symRecordLatestView2, SymRecordLatestView symRecordLatestView3, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = dividerView;
        this.B = symRecordLatestView;
        this.C = symRecordLatestView2;
        this.D = symRecordLatestView3;
        this.E = imageView;
        this.F = constraintLayout;
        this.G = imageView2;
        this.H = textView;
        this.I = textView2;
    }

    public static ssb A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ssb B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ssb) ViewDataBinding.G(layoutInflater, jui.Y2, viewGroup, z, obj);
    }
}
