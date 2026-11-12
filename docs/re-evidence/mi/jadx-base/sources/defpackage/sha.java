package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sha extends ViewDataBinding {
    public final TextView A;
    public final ViewPager2 B;
    public final ConstraintLayout C;

    public sha(Object obj, View view, int i, TextView textView, ViewPager2 viewPager2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = viewPager2;
        this.C = constraintLayout;
    }

    public static sha A0(LayoutInflater layoutInflater) {
        return B0(layoutInflater, sk5.i());
    }

    @Deprecated
    public static sha B0(LayoutInflater layoutInflater, Object obj) {
        return (sha) ViewDataBinding.G(layoutInflater, ivi.g0, null, false, obj);
    }
}
