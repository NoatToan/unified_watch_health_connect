package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.sleep.ui.setting.SleepSettingViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ewb extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RightArrowBindingTwoLineTextView B;
    public final SwitchButtonBindingTwoLineTextView C;
    public final RightArrowBindingTwoLineTextView D;
    public final SwitchButtonBindingTwoLineTextView E;
    public final RightArrowBindingTwoLineTextView F;
    public final SwitchButtonBindingTwoLineTextView G;
    public SleepSettingViewModel H;

    public ewb(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView3, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView3) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = rightArrowBindingTwoLineTextView;
        this.C = switchButtonBindingTwoLineTextView;
        this.D = rightArrowBindingTwoLineTextView2;
        this.E = switchButtonBindingTwoLineTextView2;
        this.F = rightArrowBindingTwoLineTextView3;
        this.G = switchButtonBindingTwoLineTextView3;
    }
}
