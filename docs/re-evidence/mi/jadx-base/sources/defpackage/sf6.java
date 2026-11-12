package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.common.avs.AivsViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sf6 extends ViewDataBinding {
    public final LinearLayout A;
    public final SwitchButtonBindingTwoLineTextView B;
    public final RightArrowBindingTwoLineTextView C;
    public AivsViewModel D;

    public sf6(Object obj, View view, int i, LinearLayout linearLayout, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = switchButtonBindingTwoLineTextView;
        this.C = rightArrowBindingTwoLineTextView;
    }

    public abstract void A0(AivsViewModel aivsViewModel);
}
