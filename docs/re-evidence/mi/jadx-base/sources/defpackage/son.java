package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class son extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RightArrowTwoLineTextView B;
    public final RightArrowTwoLineTextView C;
    public final SwitchButtonTwoLineTextView D;

    public son(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = rightArrowTwoLineTextView;
        this.C = rightArrowTwoLineTextView2;
        this.D = switchButtonTwoLineTextView2;
    }

    public static son A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static son B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (son) ViewDataBinding.G(layoutInflater, dvi.s0, viewGroup, z, obj);
    }
}
