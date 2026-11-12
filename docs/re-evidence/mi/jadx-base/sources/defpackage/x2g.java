package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x2g extends ViewDataBinding {
    public final RightArrowBindingTwoLineTextView A;

    public x2g(Object obj, View view, int i, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = rightArrowBindingTwoLineTextView;
    }

    public static x2g A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static x2g B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (x2g) ViewDataBinding.G(layoutInflater, rui.w, viewGroup, z, obj);
    }
}
