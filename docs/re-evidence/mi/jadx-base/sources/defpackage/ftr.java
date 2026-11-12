package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ftr extends ViewDataBinding {
    public final RadioButton A;
    public final RadioButton B;
    public final RadioGroup C;
    public final ViewPager D;

    public ftr(Object obj, View view, int i, RadioButton radioButton, RadioButton radioButton2, RadioGroup radioGroup, ViewPager viewPager) {
        super(obj, view, i);
        this.A = radioButton;
        this.B = radioButton2;
        this.C = radioGroup;
        this.D = viewPager;
    }

    public static ftr A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ftr B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ftr) ViewDataBinding.G(layoutInflater, wvi.f, viewGroup, z, obj);
    }
}
