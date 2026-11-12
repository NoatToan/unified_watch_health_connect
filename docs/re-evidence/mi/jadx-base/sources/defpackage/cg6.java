package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.spo2.BleSpo2SettingViewModel;
import com.xiaomi.fitness.devicesettings.widget.SetRadioGroup;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cg6 extends ViewDataBinding {
    public final RightArrowBindingTwoLineTextView A;
    public final SetRadioGroup B;
    public final SwitchButtonBindingTwoLineTextView C;
    public final RightArrowBindingTwoLineTextView D;
    public BleSpo2SettingViewModel E;

    public cg6(Object obj, View view, int i, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, SetRadioGroup setRadioGroup, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = rightArrowBindingTwoLineTextView;
        this.B = setRadioGroup;
        this.C = switchButtonBindingTwoLineTextView;
        this.D = rightArrowBindingTwoLineTextView2;
    }
}
