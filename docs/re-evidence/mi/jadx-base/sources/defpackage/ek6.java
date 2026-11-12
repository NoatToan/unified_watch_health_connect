package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.spo2.HuamiSpo2SettingViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ek6 extends ViewDataBinding {
    public final RightArrowBindingTwoLineTextView A;
    public final SwitchButtonBindingTwoLineTextView B;
    public HuamiSpo2SettingViewModel C;

    public ek6(Object obj, View view, int i, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = rightArrowBindingTwoLineTextView;
        this.B = switchButtonBindingTwoLineTextView;
    }
}
