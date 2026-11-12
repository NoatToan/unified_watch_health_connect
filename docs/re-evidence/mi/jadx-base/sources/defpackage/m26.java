package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.ui.DeviceDetail;

/* JADX INFO: loaded from: classes8.dex */
public abstract class m26 extends ViewDataBinding {
    public final AppCompatImageView A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final LinearLayout D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public DeviceDetail I;

    public m26(Object obj, View view, int i, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = appCompatImageView;
        this.B = constraintLayout;
        this.C = imageView;
        this.D = linearLayout;
        this.E = textView;
        this.F = textView2;
        this.G = textView3;
        this.H = textView4;
    }

    public static m26 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static m26 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (m26) ViewDataBinding.G(layoutInflater, dui.h, viewGroup, z, obj);
    }

    public abstract void C0(DeviceDetail deviceDetail);
}
