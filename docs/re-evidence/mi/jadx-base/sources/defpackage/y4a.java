package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes9.dex */
public abstract class y4a extends ViewDataBinding {
    public final ViewPager2 A;

    public y4a(Object obj, View view, int i, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = viewPager2;
    }

    public static y4a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static y4a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (y4a) ViewDataBinding.G(layoutInflater, jui.R, viewGroup, z, obj);
    }
}
