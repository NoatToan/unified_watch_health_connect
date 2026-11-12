package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class wf6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RightArrowBindingTwoLineTextView B;
    public final RightArrowBindingTwoLineTextView C;
    public final RightArrowBindingTwoLineTextView D;
    public final RightArrowBindingTwoLineTextView E;
    public final SwitchButtonBindingTwoLineTextView F;
    public BleHrSettingViewModel G;

    public wf6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView3, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView4, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = rightArrowBindingTwoLineTextView;
        this.C = rightArrowBindingTwoLineTextView2;
        this.D = rightArrowBindingTwoLineTextView3;
        this.E = rightArrowBindingTwoLineTextView4;
        this.F = switchButtonBindingTwoLineTextView;
    }
}
