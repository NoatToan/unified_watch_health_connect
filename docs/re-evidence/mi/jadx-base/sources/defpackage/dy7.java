package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class dy7 extends ViewDataBinding {
    public final RightArrowTwoLineTextView A;
    public final RightArrowTwoLineTextView B;
    public final RightArrowTwoLineTextView C;
    public final SwitchButtonTwoLineTextView D;

    public dy7(Object obj, View view, int i, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, RightArrowTwoLineTextView rightArrowTwoLineTextView3, SwitchButtonTwoLineTextView switchButtonTwoLineTextView) {
        super(obj, view, i);
        this.A = rightArrowTwoLineTextView;
        this.B = rightArrowTwoLineTextView2;
        this.C = rightArrowTwoLineTextView3;
        this.D = switchButtonTwoLineTextView;
    }

    public static dy7 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static dy7 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (dy7) ViewDataBinding.G(layoutInflater, fvi.B, viewGroup, z, obj);
    }
}
